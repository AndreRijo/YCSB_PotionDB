package com.arijo.potiondb.crdt.update;

import com.arijo.protobuf.ApbIntPair;
import com.arijo.protobuf.ApbTopkRmvUpdate;
import com.arijo.protobuf.ApbUpdateOperation;
import com.arijo.protobuf.CRDT_type;
import com.google.protobuf.ByteString;

public class TopSSub implements UpdateArguments {

  private TopKScore score;

  public TopSSub(TopKScore score) {
    this.score = score;
  }

  public TopKScore getScore() {
    return score;
  }

  @Override
  public CRDT_type getCRDTType() {
    return CRDT_type.TOPSUM;
  }

  @Override
  public ApbUpdateOperation toUpdateObject() {
    return ApbUpdateOperation.newBuilder().setTopkrmvop(ApbTopkRmvUpdate.newBuilder().addAdds(ApbIntPair.newBuilder().
        setScore(score.getScore()).setPlayerId(score.getId()).setData(ByteString.copyFrom(score.getData())))).build();
  }
}
