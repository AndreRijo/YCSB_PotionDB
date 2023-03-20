package com.arijo.potiondb.crdt.read;

import com.arijo.protobuf.*;

public class AvgGetFullArguments implements ReadArguments {

  @Override
  public CRDT_type getCRDTType() {
    return CRDT_type.AVG;
  }

  @Override
  public READ_type getReadType() {
    return READ_type.GET_FULL_AVG;
  }

  @Override
  public ApbPartialReadArgs toPartialRead() {
    return ApbPartialReadArgs.newBuilder().setAvg(ApbAvgPartialRead.newBuilder().setGetfull(ApbAvgFullRead.newBuilder())).build();
  }
}
