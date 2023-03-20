package com.arijo.potiondb.crdt.state;

import com.arijo.protobuf.*;
import com.google.protobuf.ByteString;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class MapEntryState implements State {

  private Map<String, String> values;

  public MapEntryState(Map<String, String> values) {
    this.values = values;
  }

  @Override
  public CRDT_type getCRDTType() {
    return CRDT_type.ORMAP;
  }

  @Override
  public READ_type getReadType() {
    return READ_type.FULL;
  }

  @Override
  public State fromProto(ApbReadObjectResp proto) {
    List<ApbMapEntry> entries = proto.getMap().getEntriesList();
    if (!entries.isEmpty()) {    //Full read
      values = new HashMap<>(entries.size());
      for (ApbMapEntry entry : entries)
        values.put(entry.getKey().getKey().toStringUtf8(), entry.getValue().getReg().getValue().toStringUtf8());
    } else {    //Either partial read or read result is empty
      ApbMapGetValuesResp resp = proto.getPartread().getMap().getGetvalues();
      List<ByteString> keys = resp.getKeysList();
      List<ApbMapGetValueResp> protoValues = resp.getValuesList();
      if (!keys.isEmpty()) {
        values = new HashMap<>(keys.size());
        Iterator<ByteString> keysIt = keys.iterator();
        Iterator<ApbMapGetValueResp> protoValuesIt = protoValues.iterator();
        while (keysIt.hasNext())
          values.put(keysIt.next().toStringUtf8(), protoValuesIt.next().getValue().getReg().getValue().toStringUtf8());
      }
    }
    return this;
  }

  public static MapEntryState fromProtoStatic(ApbReadObjectResp proto) {
    MapEntryState newState = new MapEntryState(null);
    return (MapEntryState) newState.fromProto(proto);
  }
}
