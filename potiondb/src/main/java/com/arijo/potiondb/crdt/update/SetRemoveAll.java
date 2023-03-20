package com.arijo.potiondb.crdt.update;

import com.arijo.protobuf.ApbSetUpdate;
import com.arijo.protobuf.ApbUpdateOperation;
import com.arijo.protobuf.CRDT_type;
import com.google.protobuf.ByteString;

public class SetRemoveAll implements UpdateArguments {

  private String[] elems;

  public SetRemoveAll(String[] elems) {
    this.elems = elems;
  }

  public String[] getElems() {
    return elems;
  }

  @Override
  public CRDT_type getCRDTType() {
    return CRDT_type.ORSET;
  }

  @Override
  public ApbUpdateOperation toUpdateObject() {
    ApbSetUpdate.Builder setOp = ApbSetUpdate.newBuilder();
    for (String elem : elems)
      setOp.addRems(ByteString.copyFromUtf8(elem));
    return ApbUpdateOperation.newBuilder().setSetop(setOp.setOptype(ApbSetUpdate.SetOpType.REMOVE)).build();
  }
}
