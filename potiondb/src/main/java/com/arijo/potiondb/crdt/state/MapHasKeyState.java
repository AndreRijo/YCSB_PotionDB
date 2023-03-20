package com.arijo.potiondb.crdt.state;

import com.arijo.protobuf.ApbReadObjectResp;
import com.arijo.protobuf.CRDT_type;
import com.arijo.protobuf.READ_type;

public class MapHasKeyState implements State {

  private boolean hasKey;

  public MapHasKeyState(boolean hasKey) {
    this.hasKey = hasKey;
  }

  @Override
  public CRDT_type getCRDTType() {
    return CRDT_type.ORMAP;
  }

  @Override
  public READ_type getReadType() {
    return READ_type.HAS_KEY;
  }

  @Override
  public State fromProto(ApbReadObjectResp proto) {
    this.hasKey = proto.getPartread().getMap().getHaskey().getHas();
    return this;
  }

  public static MapHasKeyState fromProtoStatic(ApbReadObjectResp proto) {
    return new MapHasKeyState(proto.getPartread().getMap().getHaskey().getHas());
  }
}
