package com.arijo.potiondb.crdt.read;

import com.arijo.protobuf.*;
import com.google.protobuf.ByteString;

public class GetValueArguments implements ReadArguments {

  private String key;

  public GetValueArguments(String key) {
    this.key = key;
  }

  @Override
  public CRDT_type getCRDTType() {
    return CRDT_type.ORMAP;
  }

  @Override
  public READ_type getReadType() {
    return READ_type.GET_VALUE;
  }

  @Override
  public ApbPartialReadArgs toPartialRead() {
    return ApbPartialReadArgs.newBuilder().setMap(ApbMapPartialRead.newBuilder().setGetvalue(
        ApbMapGetValueRead.newBuilder().setKey(ByteString.copyFromUtf8(key)))).build();
  }
}
