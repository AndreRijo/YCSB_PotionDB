package com.arijo.potiondb.crdt.read;

import com.arijo.potiondb.crdt.CRDTConvUtils;
import com.arijo.protobuf.*;
import com.google.protobuf.ByteString;

public class EmbMapGetValueArguments implements ReadArguments {

  private String key;
  private ReadArguments args;

  public EmbMapGetValueArguments(String key, ReadArguments args) {
    this.key = key;
    this.args = args;
  }

  @Override
  public CRDT_type getCRDTType() {
    return CRDT_type.RRMAP;
  }

  @Override
  public READ_type getReadType() {
    return READ_type.GET_VALUE;
  }

  @Override
  public ApbPartialReadArgs toPartialRead() {
    return ApbPartialReadArgs.newBuilder().setMap(ApbMapPartialRead.newBuilder().setGetvalues(
        ApbMapGetValuesRead.newBuilder().addKeys(ByteString.copyFromUtf8(key)).addArgs(CRDTConvUtils.createMapGetValuesReadProto(args)))).build();
  }
}
