package com.arijo.potiondb.crdt.state;

import com.arijo.protobuf.ApbReadObjectResp;
import com.arijo.protobuf.CRDT_type;
import com.arijo.protobuf.READ_type;

public class MapGetValueState implements State {

  private String value;

  public MapGetValueState(String value) {
    this.value = value;
  }

  @Override
  public CRDT_type getCRDTType() {
    return CRDT_type.ORMAP;
  }

  @Override
  public READ_type getReadType() {
    return READ_type.GET_VALUE;
  }

  @Override
  public State fromProto(ApbReadObjectResp proto) {
    this.value = proto.getPartread().getMap().getGetvalue().getValue().getReg().getValue().toStringUtf8();
    return this;
  }

  public static MapGetValueState fromProtoStatic(ApbReadObjectResp proto) {
    return new MapGetValueState(proto.getPartread().getMap().getGetvalue().getValue().getReg().getValue().toStringUtf8());
  }
}
