package com.arijo.potiondb.crdt.read;

import com.arijo.protobuf.*;

public class GetTopNArguments implements ReadArguments {

  private int numberEntries;

  public GetTopNArguments(int numberEntries) {
    this.numberEntries = numberEntries;
  }

  @Override
  public CRDT_type getCRDTType() {
    return CRDT_type.TOPK_RMV;
  }

  @Override
  public READ_type getReadType() {
    return READ_type.GET_N;
  }

  @Override
  public ApbPartialReadArgs toPartialRead() {
    return ApbPartialReadArgs.newBuilder().setTopk(ApbTopkPartialRead.newBuilder().setGetn(
        ApbTopkGetNRead.newBuilder().setAmount(numberEntries))).build();
  }
}
