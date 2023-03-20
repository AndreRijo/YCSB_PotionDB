package com.arijo.potiondb.crdt.state;

import com.arijo.protobuf.ApbReadObjectResp;
import com.arijo.protobuf.CRDT_type;
import com.arijo.protobuf.READ_type;

public interface State {

  CRDT_type getCRDTType();

  READ_type getReadType();

  State fromProto(ApbReadObjectResp proto);
}
