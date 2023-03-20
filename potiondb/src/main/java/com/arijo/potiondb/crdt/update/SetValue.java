package com.arijo.potiondb.crdt.update;

import com.arijo.protobuf.ApbRegUpdate;
import com.arijo.protobuf.ApbUpdateOperation;
import com.arijo.protobuf.CRDT_type;
import com.google.protobuf.ByteString;

public class SetValue implements UpdateArguments {

  private String newValue;

  public SetValue(String newValue) {
    this.newValue = newValue;
  }

  @Override
  public CRDT_type getCRDTType() {
    return CRDT_type.LWWREG;
  }

  @Override
  public ApbUpdateOperation toUpdateObject() {
    return ApbUpdateOperation.newBuilder().setRegop(ApbRegUpdate.newBuilder().setValue(ByteString.copyFromUtf8(newValue))).build();
  }
}
