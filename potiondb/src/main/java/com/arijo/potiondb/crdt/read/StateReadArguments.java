package com.arijo.potiondb.crdt.read;

import com.arijo.protobuf.ApbPartialReadArgs;
import com.arijo.protobuf.CRDT_type;
import com.arijo.protobuf.READ_type;

public class StateReadArguments implements ReadArguments {

  @Override
  public CRDT_type getCRDTType() {
    return CRDT_type.FLAG_EW;     //TODO: May need to handle this case particularly. Here we cannot use -1 as in Go.
  }

  @Override
  public READ_type getReadType() {
    return READ_type.FULL;
  }

  @Override
  public ApbPartialReadArgs toPartialRead() {
    return null;    //Not a partial read
  }
}
