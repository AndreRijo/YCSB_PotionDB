package com.arijo.potiondb.crdt.update;

import com.arijo.protobuf.ApbAverageUpdate;
import com.arijo.protobuf.ApbUpdateOperation;
import com.arijo.protobuf.CRDT_type;

public class AddValue implements UpdateArguments {

  private long value;

  public AddValue(long value) {
    this.value = value;
  }

  @Override
  public CRDT_type getCRDTType() {
    return CRDT_type.AVG;
  }

  @Override
  public ApbUpdateOperation toUpdateObject() {
    return ApbUpdateOperation.newBuilder().setAvgop(ApbAverageUpdate.newBuilder().setValue(value).setNValues(1)).build();
  }

}
