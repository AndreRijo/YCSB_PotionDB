package com.arijo.potiondb.crdt.read;

import com.arijo.protobuf.*;

public class GetKeysArguments implements ReadArguments {

  @Override
  public CRDT_type getCRDTType() {
    return CRDT_type.ORMAP;
  }

  @Override
  public READ_type getReadType() {
    return READ_type.GET_KEYS;
  }

  @Override
  public ApbPartialReadArgs toPartialRead() {
    return ApbPartialReadArgs.newBuilder().setMap(ApbMapPartialRead.newBuilder().setGetkeys(ApbMapGetKeysRead.newBuilder())).build();
  }
}
