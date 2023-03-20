package com.arijo.potiondb.crdt.update;

import com.arijo.protobuf.ApbTopkRmvUpdate;
import com.arijo.protobuf.ApbUpdateOperation;
import com.arijo.protobuf.CRDT_type;

public class TopKRemoveAll implements UpdateArguments {

  private int[] ids;

  public TopKRemoveAll(int[] ids) {
    this.ids = ids;
  }

  public int[] getIds() {
    return ids;
  }

  @Override
  public CRDT_type getCRDTType() {
    return CRDT_type.TOPK;
  }

  @Override
  public ApbUpdateOperation toUpdateObject() {
    ApbTopkRmvUpdate.Builder topkOp = ApbTopkRmvUpdate.newBuilder();
    for (int id : ids)
      topkOp.addRems(id);
    return ApbUpdateOperation.newBuilder().setTopkrmvop(topkOp).build();
  }
}
