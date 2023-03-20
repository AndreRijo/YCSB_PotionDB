package com.arijo.potiondb.crdt.update;

import com.arijo.protobuf.ApbAverageUpdate;
import com.arijo.protobuf.ApbUpdateOperation;
import com.arijo.protobuf.CRDT_type;

public class AddMultipleValue implements UpdateArguments {

  private long value, nAdds;

  public AddMultipleValue(long value, long nAdds) {
    this.value = value;
    this.nAdds = nAdds;
  }

  public long getValue() {
    return value;
  }

  public long getNAdds() {
    return nAdds;
  }

  @Override
  public CRDT_type getCRDTType() {
    return CRDT_type.AVG;
  }

  @Override
  public ApbUpdateOperation toUpdateObject() {
    return ApbUpdateOperation.newBuilder().setAvgop(ApbAverageUpdate.newBuilder().setValue(value).setNValues(nAdds)).build();
  }
}
