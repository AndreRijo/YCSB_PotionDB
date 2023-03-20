package com.arijo.potiondb.crdt.update;

import com.arijo.protobuf.ApbCounterUpdate;
import com.arijo.protobuf.ApbUpdateOperation;
import com.arijo.protobuf.CRDT_type;

public class Increment implements UpdateArguments {
  private int change;

  public Increment(int change) {
    this.change = change;
  }

  public int getChange() {
    return change;
  }

  @Override
  public CRDT_type getCRDTType() {
    return CRDT_type.COUNTER;
  }

  @Override
  public ApbUpdateOperation toUpdateObject() {
    return ApbUpdateOperation.newBuilder().setCounterop(ApbCounterUpdate.newBuilder().setInc((long) change)).build();
  }
}
