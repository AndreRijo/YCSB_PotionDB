package com.arijo.potiondb.crdt.update;

import com.arijo.protobuf.ApbSetUpdate;
import com.arijo.protobuf.ApbUpdateOperation;
import com.arijo.protobuf.CRDT_type;
import com.google.protobuf.ByteString;

public class SetAdd implements UpdateArguments {

  private String element;

  public SetAdd(String element) {
    this.element = element;
  }

  public String getElement() {
    return element;
  }

  @Override
  public CRDT_type getCRDTType() {
    return CRDT_type.ORSET;
  }

  @Override
  public ApbUpdateOperation toUpdateObject() {
    return ApbUpdateOperation.newBuilder().setSetop(ApbSetUpdate.newBuilder().
        addAdds(ByteString.copyFromUtf8(element)).setOptype(ApbSetUpdate.SetOpType.ADD)).build();
  }
}
