package com.arijo.potiondb.crdt.update;

import com.arijo.protobuf.ApbIntPair;
import com.arijo.protobuf.ApbTopkRmvUpdate;
import com.arijo.protobuf.ApbUpdateOperation;
import com.arijo.protobuf.CRDT_type;
import com.google.protobuf.ByteString;

public class TopKAddAll implements UpdateArguments {

  private TopKScore[] scores;

  public TopKAddAll(TopKScore[] scores) {
    this.scores = scores;
  }

  @Override
  public CRDT_type getCRDTType() {
    return CRDT_type.TOPK_RMV;
  }

  @Override
  public ApbUpdateOperation toUpdateObject() {
    ApbTopkRmvUpdate.Builder topkOp = ApbTopkRmvUpdate.newBuilder();
    for (TopKScore score : scores)
      topkOp.addAdds(ApbIntPair.newBuilder().
          setScore(score.getScore()).setPlayerId(score.getId()).setData(ByteString.copyFrom(score.getData())));
    return ApbUpdateOperation.newBuilder().setTopkrmvop(topkOp).build();
  }
}
