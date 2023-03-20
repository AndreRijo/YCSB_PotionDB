package com.arijo.potiondb.crdt.state;

import com.arijo.protobuf.ApbAvgGetFullReadResp;
import com.arijo.protobuf.ApbReadObjectResp;
import com.arijo.protobuf.CRDT_type;
import com.arijo.protobuf.READ_type;

public class AvgFullState implements State {

  private long sum;
  private long nAdds;

  public AvgFullState(long sum, long nAdds) {
    this.sum = sum;
    this.nAdds = nAdds;
  }

  @Override
  public CRDT_type getCRDTType() {
    return CRDT_type.AVG;
  }

  @Override
  public READ_type getReadType() {
    return READ_type.GET_FULL_AVG;
  }

  @Override
  public State fromProto(ApbReadObjectResp proto) {
    ApbAvgGetFullReadResp readResp = proto.getPartread().getAvg().getGetfull();
    sum = readResp.getSum();
    nAdds = readResp.getNAdds();
    return this;
  }

  public static AvgFullState fromProtoStatic(ApbReadObjectResp proto) {
    ApbAvgGetFullReadResp readResp = proto.getPartread().getAvg().getGetfull();
    long sum = readResp.getSum();
    long nAdds = readResp.getNAdds();
    return new AvgFullState(sum, nAdds);
  }

}
