package com.arijo.potiondb.crdt.update;

import com.arijo.protobuf.ApbSetUpdate;
import com.arijo.protobuf.ApbUpdateOperation;
import com.arijo.protobuf.CRDT_type;
import com.google.protobuf.ByteString;

public class SetRemove implements UpdateArguments {

  private String element;

  public SetRemove(String element) {
    this.element = element;
  }

  @Override
  public CRDT_type getCRDTType() {
    return CRDT_type.ORSET;
  }

  @Override
  public ApbUpdateOperation toUpdateObject() {
    return ApbUpdateOperation.newBuilder().setSetop(ApbSetUpdate.newBuilder().
        addRems(ByteString.copyFromUtf8(element)).setOptype(ApbSetUpdate.SetOpType.REMOVE)).build();
  }
}
