package com.arijo.potiondb.crdt;

import com.arijo.potiondb.crdt.read.ReadArguments;
import com.arijo.potiondb.crdt.read.StateReadArguments;
import com.arijo.potiondb.crdt.update.UpdateArguments;
import com.arijo.protobuf.*;
import com.google.protobuf.ByteString;

public class CRDTConvUtils {

  public static ApbMapKey.Builder getApbMapKeyBuilder(String key, CRDT_type crdtType) {
    return ApbMapKey.newBuilder().setKey(ByteString.copyFromUtf8(key)).setType(crdtType);
  }

  public static ApbMapNestedUpdate.Builder mapEntryToProto(String key, String value) {
    return ApbMapNestedUpdate.newBuilder().setKey(getApbMapKeyBuilder(key, CRDT_type.LWWREG)).
        setUpdate(ApbUpdateOperation.newBuilder().setRegop(ApbRegUpdate.newBuilder().setValue(ByteString.copyFromUtf8(value))));
  }

  public static ApbMapNestedUpdate.Builder mapNestedUpdateToProto(String key, UpdateArguments updArgs) {
    return ApbMapNestedUpdate.newBuilder().setKey(getApbMapKeyBuilder(key, updArgs.getCRDTType())).setUpdate(updArgs.toUpdateObject());
  }

  public static ApbMapEmbPartialArgs createMapGetValuesReadProto(ReadArguments readArgs) {
    if (readArgs instanceof StateReadArguments)
      return ApbMapEmbPartialArgs.newBuilder().setReadtype(readArgs.getReadType()).build();
    return ApbMapEmbPartialArgs.newBuilder().setReadtype(readArgs.getReadType()).setType(readArgs.getCRDTType()).setArgs(readArgs.toPartialRead()).build();
  }
}
