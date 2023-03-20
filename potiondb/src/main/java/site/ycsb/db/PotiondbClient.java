package site.ycsb.db;

import com.arijo.potiondb.JPotionDBClient;
import com.arijo.potiondb.ProtoFactory;
import com.arijo.potiondb.ReadObjectParams;
import com.arijo.potiondb.UpdateObjectParams;
import com.arijo.potiondb.crdt.read.GetValuesArguments;
import com.arijo.potiondb.crdt.read.StateReadArguments;
import com.arijo.potiondb.crdt.update.MapAddAll;
import com.arijo.potiondb.crdt.update.ResetOp;
import com.arijo.potiondb.crdt.update.UpdateArguments;
import com.arijo.protobuf.*;
import com.google.protobuf.ByteString;
import site.ycsb.*;

import java.io.IOException;
import java.util.*;

public class PotiondbClient extends DB {

  private JPotionDBClient client;

  @Override
  public void init() throws DBException {
    Properties props = getProperties();
    String ip = props.getProperty("potiondb_ip", "127.0.0.1");
    int port = Integer.parseInt(props.getProperty("potiondb_port", "8087"));
    try {
      client = new JPotionDBClient(ip, port);
      System.out.println("[PotiondbClient] Finished init");
    } catch (IOException e) {
      throw new DBException("Failed to create JPotionDBClient.", e);
    }
  }

  @Override
  public void cleanup() throws DBException {
    client.close();
  }

  /**
   * Read a record from the database. Each field/value pair from the result will be stored in a HashMap.
   *
   * @param table  The name of the table
   * @param key    The record key of the record to read.
   * @param fields The list of fields to read, or null for all of them
   * @param result A HashMap of field/value pairs for the result
   * @return The result of the operation.
   */
  @Override
  public Status read(String table, String key, Set<String> fields, Map<String, ByteIterator> result) {
    try {
      if (fields == null) {
        //Full read
        StateReadArguments args = new StateReadArguments();
        ReadObjectParams readParams = new ReadObjectParams(key, CRDT_type.ORMAP, table, args);
        ApbStaticRead proto = ProtoFactory.createStaticRead(null, new ReadObjectParams[]{readParams}, null);
        client.sendProtobuf(JPotionDBClient.REQ_STATIC_READ, proto);
      } else {
        GetValuesArguments args = new GetValuesArguments(fields);
        ReadObjectParams readParams = new ReadObjectParams(key, CRDT_type.ORMAP, table, args);
        ApbStaticRead proto = ProtoFactory.createStaticRead(null, null, new ReadObjectParams[]{readParams});
        client.sendProtobuf(JPotionDBClient.REQ_STATIC_READ, proto);

      }
      ApbStaticReadObjectsResp resp = (ApbStaticReadObjectsResp) client.receiveProtobuf();
      ApbGetMapResp readResp = resp.getObjects().getObjects(0).getMap();
    } catch (IOException e) {
      System.out.println("Something went wrong while attempting to read.");
      e.printStackTrace();
      return Status.ERROR;
    }
    return Status.OK;
  }

  /**
   * Perform a range scan for a set of records in the database. Each field/value pair from the result will be stored
   * in a HashMap.
   *
   * @param table       The name of the table
   * @param startkey    The record key of the first record to read.
   * @param recordcount The number of records to read
   * @param fields      The list of fields to read, or null for all of them
   * @param result      A Vector of HashMaps, where each HashMap is a set field/value pairs for one record
   * @return The result of the operation.
   */
  @Override
  public Status scan(String table, String startkey, int recordcount, Set<String> fields, Vector<HashMap<String, ByteIterator>> result) {
    return Status.NOT_IMPLEMENTED;
  }

  /**
   * Insert a record in the database. Any field/value pairs in the specified values HashMap will be written into the
   * record with the specified record key.
   *
   * @param table  The name of the table
   * @param key    The record key of the record to insert.
   * @param values A HashMap of field/value pairs to insert in the record
   * @return The result of the operation.
   */
  @Override
  public Status insert(String table, String key, Map<String, ByteIterator> values) {
    return update(table, key, values);
  }

  /**
   * Update a record in the database. Any field/value pairs in the specified values HashMap will be written into the
   * record with the specified record key, overwriting any existing values with the same field name.
   *
   * @param table  The name of the table
   * @param key    The record key of the record to write.
   * @param values A HashMap of field/value pairs to update in the record
   * @return The result of the operation.
   */
  @Override
  public Status update(String table, String key, Map<String, ByteIterator> values) {
    Map<String, String> valuesString = new HashMap<String, String>();
    StringByteIterator.putAllAsStrings(valuesString, values);
    MapAddAll args = new MapAddAll(valuesString);   //TODO: Inneficient. May be worth using ByteIterator.
    return insertOrDeleteHelper(table, key, args);
  }

  /**
   * Delete a record from the database.
   *
   * @param table The name of the table
   * @param key   The record key of the record to delete.
   * @return The result of the operation.
   */
  @Override
  public Status delete(String table, String key) {
    ResetOp delete = new ResetOp();
    return insertOrDeleteHelper(table, key, delete);
  }

  private Status insertOrDeleteHelper(String table, String key, UpdateArguments args) {
    try {
      UpdateObjectParams updParams = new UpdateObjectParams(key, CRDT_type.ORMAP, table, args);
      ApbStaticUpdateObjects proto = ProtoFactory.createStaticUpdateObjs(null, new UpdateObjectParams[]{updParams});
      client.sendProtobuf(JPotionDBClient.REQ_STATIC_UPDATE_OBJS, proto);
      client.receiveProtobuf();
    } catch (IOException e) {
      System.out.println("Something went wrong while attempting to update.");
      e.printStackTrace();
      return Status.ERROR;
    }
    return Status.OK;
  }
}
