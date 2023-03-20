package com.arijo.potiondb.crdt.state;

import com.arijo.protobuf.ApbReadObjectResp;
import com.arijo.protobuf.CRDT_type;
import com.arijo.protobuf.READ_type;

public class AvgState implements State {

  private double value;

  public AvgState(double value) {
    this.value = value;
  }


  @Override
  public CRDT_type getCRDTType() {
    return CRDT_type.AVG;
  }

  @Override
  public READ_type getReadType() {
    return READ_type.FULL;
  }

  @Override
  public State fromProto(ApbReadObjectResp proto) {
    this.value = proto.getAvg().getAvg();
    return this;
  }

  public static AvgState fromProtoStatic(ApbReadObjectResp proto) {
    return new AvgState(proto.getAvg().getAvg());
  }
}
