package com.arijo.potiondb.crdt.update;

import com.arijo.protobuf.ApbCrdtReset;
import com.arijo.protobuf.ApbUpdateOperation;
import com.arijo.protobuf.CRDT_type;

public class ResetOp implements UpdateArguments {

  @Override
  public CRDT_type getCRDTType() {
    return CRDT_type.FLAG_EW;
  }    //TODO: May need to handle this case particularly. Here we cannot use -1 as in Go.

  @Override
  public ApbUpdateOperation toUpdateObject() {
    return ApbUpdateOperation.newBuilder().setResetop(ApbCrdtReset.newBuilder()).build();
  }

}