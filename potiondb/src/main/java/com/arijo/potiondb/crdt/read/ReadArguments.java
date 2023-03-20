package com.arijo.potiondb.crdt.read;

import com.arijo.protobuf.ApbPartialReadArgs;
import com.arijo.protobuf.CRDT_type;
import com.arijo.protobuf.READ_type;

public interface ReadArguments {

  CRDT_type getCRDTType();

  READ_type getReadType();

  ApbPartialReadArgs toPartialRead();
}
