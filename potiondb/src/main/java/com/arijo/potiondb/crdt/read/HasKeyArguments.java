package com.arijo.potiondb.crdt.read;

import com.arijo.protobuf.*;
import com.google.protobuf.ByteString;

public class HasKeyArguments implements ReadArguments {

  private String key;

  public HasKeyArguments(String key) {
    this.key = key;
  }

  @Override
  public CRDT_type getCRDTType() {
    return CRDT_type.ORMAP;
  }

  @Override
  public READ_type getReadType() {
    return READ_type.HAS_KEY;
  }

  @Override
  public ApbPartialReadArgs toPartialRead() {
    return ApbPartialReadArgs.newBuilder().setMap(ApbMapPartialRead.newBuilder().setHaskey(
        ApbMapHasKeyRead.newBuilder().setKey(ByteString.copyFromUtf8(key)))).build();
  }
}
