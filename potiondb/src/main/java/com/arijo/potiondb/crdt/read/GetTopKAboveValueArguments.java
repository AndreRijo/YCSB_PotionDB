package com.arijo.potiondb.crdt.read;

import com.arijo.protobuf.*;

public class GetTopKAboveValueArguments implements ReadArguments {

  private int minValue;

  public GetTopKAboveValueArguments(int minValue) {
    this.minValue = minValue;
  }

  @Override
  public CRDT_type getCRDTType() {
    return CRDT_type.TOPK_RMV;
  }

  @Override
  public READ_type getReadType() {
    return READ_type.GET_ABOVE_VALUE;
  }

  @Override
  public ApbPartialReadArgs toPartialRead() {
    return ApbPartialReadArgs.newBuilder().setTopk(ApbTopkPartialRead.newBuilder().setGetabovevalue(
        ApbTopkAboveValueRead.newBuilder().setMinValue(minValue))).build();
  }
}
