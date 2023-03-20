package com.arijo.potiondb.crdt.state;

import com.arijo.protobuf.ApbReadObjectResp;
import com.arijo.protobuf.CRDT_type;
import com.arijo.protobuf.READ_type;

public class MapKeysState implements State {

  private String[] keys;

  public MapKeysState(String[] keys) {
    this.keys = keys;
  }

  @Override
  public CRDT_type getCRDTType() {
    return CRDT_type.ORMAP;
  }

  @Override
  public READ_type getReadType() {
    return READ_type.GET_KEYS;
  }

  @Override
  public State fromProto(ApbReadObjectResp proto) {
    this.keys = proto.getPartread().getMap().getGetkeys().getKeysList().toArray(new String[0]);
    return this;
  }

  public static MapKeysState fromProtoStatic(ApbReadObjectResp proto) {
    return new MapKeysState(proto.getPartread().getMap().getGetkeys().getKeysList().toArray(new String[0]));
  }
}
