package com.arijo.potiondb.crdt.read;

import com.arijo.protobuf.*;
import com.google.protobuf.ByteString;

import java.util.Set;

public class GetValuesArguments implements ReadArguments {

  private Set<String> keys;

  public GetValuesArguments(Set<String> keys) {
    this.keys = keys;
  }

  @Override
  public CRDT_type getCRDTType() {
    return CRDT_type.ORMAP;
  }

  @Override
  public READ_type getReadType() {
    return READ_type.GET_VALUES;
  }

  @Override
  public ApbPartialReadArgs toPartialRead() {
    ApbMapGetValuesRead.Builder getValues = ApbMapGetValuesRead.newBuilder();
    for (String key : keys)
      getValues.addKeys(ByteString.copyFromUtf8(key));
    return ApbPartialReadArgs.newBuilder().setMap(ApbMapPartialRead.newBuilder().setGetvalues(getValues)).build();
  }
}
