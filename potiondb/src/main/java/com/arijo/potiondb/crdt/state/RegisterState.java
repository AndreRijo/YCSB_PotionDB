package com.arijo.potiondb.crdt.state;

import com.arijo.protobuf.ApbReadObjectResp;
import com.arijo.protobuf.CRDT_type;
import com.arijo.protobuf.READ_type;

public class RegisterState implements State {

  private String value;

  public RegisterState(String value) {
    this.value = value;
  }

  @Override
  public CRDT_type getCRDTType() {
    return CRDT_type.LWWREG;
  }

  @Override
  public READ_type getReadType() {
    return READ_type.FULL;
  }

  @Override
  public State fromProto(ApbReadObjectResp proto) {
    this.value = proto.getReg().getValue().toStringUtf8();
    return this;
  }

  public static RegisterState fromProtoStatic(ApbReadObjectResp proto) {
    return new RegisterState(proto.getReg().getValue().toStringUtf8());
  }
}
