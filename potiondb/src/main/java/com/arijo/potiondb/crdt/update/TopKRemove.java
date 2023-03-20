package com.arijo.potiondb.crdt.update;

import com.arijo.protobuf.ApbTopkRmvUpdate;
import com.arijo.protobuf.ApbUpdateOperation;
import com.arijo.protobuf.CRDT_type;

public class TopKRemove implements UpdateArguments {

  private int id;

  public TopKRemove(int id) {
    this.id = id;
  }

  public int getId() {
    return id;
  }

  @Override
  public CRDT_type getCRDTType() {
    return CRDT_type.TOPK_RMV;
  }

  @Override
  public ApbUpdateOperation toUpdateObject() {
    return ApbUpdateOperation.newBuilder().setTopkrmvop(ApbTopkRmvUpdate.newBuilder().addRems(id)).build();
  }
}
