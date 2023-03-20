package com.arijo.potiondb.crdt.state;

import com.arijo.protobuf.ApbReadObjectResp;
import com.arijo.protobuf.CRDT_type;
import com.arijo.protobuf.READ_type;

public class MaxMinState implements State {

  private long value;

  public MaxMinState(long value) {
    this.value = value;
  }

  @Override
  public CRDT_type getCRDTType() {
    return CRDT_type.MAXMIN;
  }

  @Override
  public READ_type getReadType() {
    return READ_type.FULL;
  }

  @Override
  public State fromProto(ApbReadObjectResp proto) {
    this.value = proto.getMaxmin().getValue();
    return this;
  }

  public static MaxMinState fromProtoStatic(ApbReadObjectResp proto) {
    return new MaxMinState(proto.getMaxmin().getValue());
  }
}
