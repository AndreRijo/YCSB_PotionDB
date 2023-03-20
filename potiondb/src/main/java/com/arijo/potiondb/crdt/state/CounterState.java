package com.arijo.potiondb.crdt.state;

import com.arijo.protobuf.ApbReadObjectResp;
import com.arijo.protobuf.CRDT_type;
import com.arijo.protobuf.READ_type;

public class CounterState implements State {

  private int value;

  public CounterState(int value) {
    this.value = value;
  }

  @Override
  public CRDT_type getCRDTType() {
    return CRDT_type.COUNTER;
  }

  @Override
  public READ_type getReadType() {
    return READ_type.FULL;
  }

  @Override
  public State fromProto(ApbReadObjectResp proto) {
    this.value = proto.getCounter().getValue();
    return this;
  }

  public static CounterState fromProtoStatic(ApbReadObjectResp proto) {
    return new CounterState(proto.getCounter().getValue());
  }
}
