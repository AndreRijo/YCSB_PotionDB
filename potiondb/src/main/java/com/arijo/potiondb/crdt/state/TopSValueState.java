package com.arijo.potiondb.crdt.state;

import com.arijo.potiondb.crdt.update.TopKScore;
import com.arijo.protobuf.ApbIntPair;
import com.arijo.protobuf.ApbReadObjectResp;
import com.arijo.protobuf.CRDT_type;
import com.arijo.protobuf.READ_type;

import java.util.List;

public class TopSValueState implements State {

  private TopKScore[] scores;

  public TopSValueState(TopKScore[] scores) {
    this.scores = scores;
  }

  @Override
  public CRDT_type getCRDTType() {
    return CRDT_type.TOPSUM;
  }

  @Override
  public READ_type getReadType() {
    return READ_type.FULL;
  }

  //Same as TopK
  @Override
  public State fromProto(ApbReadObjectResp proto) {
    List<ApbIntPair> values = proto.getTopk().getValuesList();
    if (values.isEmpty())
      values = proto.getPartread().getTopk().getPairs().getValuesList();
    scores = new TopKScore[values.size()];
    int i = 0;
    for (ApbIntPair pair : values)
      scores[i++] = new TopKScore(pair.getPlayerId(), pair.getScore(), pair.getData().toByteArray());
    return this;
  }

  public static TopKValueState fromProtoStatic(ApbReadObjectResp proto) {
    return (TopKValueState) new TopKValueState(null).fromProto(proto);
  }
}
