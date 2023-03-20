package com.arijo.potiondb.crdt.update;

import com.arijo.protobuf.ApbUpdateOperation;
import com.arijo.protobuf.CRDT_type;

public interface UpdateArguments {

  CRDT_type getCRDTType();

  ApbUpdateOperation toUpdateObject();

}

