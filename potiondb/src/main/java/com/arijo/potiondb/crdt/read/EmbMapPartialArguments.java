package com.arijo.potiondb.crdt.read;

import com.arijo.potiondb.crdt.CRDTConvUtils;
import com.arijo.protobuf.*;
import com.google.protobuf.ByteString;

import java.util.Map;

public class EmbMapPartialArguments implements ReadArguments {
  private Map<String, ReadArguments> args;

  public EmbMapPartialArguments(Map<String, ReadArguments> args) {
    this.args = args;
  }

  @Override
  public CRDT_type getCRDTType() {
    return CRDT_type.RRMAP;
  }

  @Override
  public READ_type getReadType() {
    return READ_type.GET_VALUES;
  }

  @Override
  public ApbPartialReadArgs toPartialRead() {
    ApbMapGetValuesRead.Builder getValues = ApbMapGetValuesRead.newBuilder();
    for (Map.Entry<String, ReadArguments> entry : args.entrySet())
      getValues.addKeys(ByteString.copyFromUtf8(entry.getKey())).addArgs(CRDTConvUtils.createMapGetValuesReadProto(entry.getValue()));
    return ApbPartialReadArgs.newBuilder().setMap(ApbMapPartialRead.newBuilder().setGetvalues(getValues)).build();
  }
}
