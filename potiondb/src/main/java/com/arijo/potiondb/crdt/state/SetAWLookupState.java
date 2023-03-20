package com.arijo.potiondb.crdt.state;

import com.arijo.protobuf.ApbReadObjectResp;
import com.arijo.protobuf.CRDT_type;
import com.arijo.protobuf.READ_type;

public class SetAWLookupState implements State {

  private boolean hasElem;

  public SetAWLookupState(boolean hasElem) {
    this.hasElem = hasElem;
  }

  @Override
  public CRDT_type getCRDTType() {
    return CRDT_type.ORSET;
  }

  @Override
  public READ_type getReadType() {
    return READ_type.LOOKUP;
  }

  @Override
  public State fromProto(ApbReadObjectResp proto) {
    this.hasElem = proto.getPartread().getSet().getLookup().getHas();
    return this;
  }

  public static SetAWLookupState fromProtoStatic(ApbReadObjectResp proto) {
    return new SetAWLookupState(proto.getPartread().getSet().getLookup().getHas());
  }
}
