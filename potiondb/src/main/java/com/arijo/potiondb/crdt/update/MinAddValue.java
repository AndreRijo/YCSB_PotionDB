package com.arijo.potiondb.crdt.update;

import com.arijo.protobuf.ApbMaxMinUpdate;
import com.arijo.protobuf.ApbUpdateOperation;
import com.arijo.protobuf.CRDT_type;

public class MinAddValue implements UpdateArguments {

  private long topValue;

  public MinAddValue(long topValue) {
    this.topValue = topValue;
  }

  public long getTopValue() {
    return topValue;
  }

  @Override
  public CRDT_type getCRDTType() {
    return CRDT_type.MAXMIN;
  }

  @Override
  public ApbUpdateOperation toUpdateObject() {
    return ApbUpdateOperation.newBuilder().setMaxminop(ApbMaxMinUpdate.newBuilder().setValue(topValue).setIsMax(false)).build();
  }
}
