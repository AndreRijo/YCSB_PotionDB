package com.arijo.potiondb.crdt.read;

import com.arijo.protobuf.*;
import com.google.protobuf.ByteString;

public class LookupReadArgs implements ReadArguments {

  private String element;

  public LookupReadArgs(String element) {
    this.element = element;
  }

  @Override
  public CRDT_type getCRDTType() {
    return CRDT_type.ORSET;
  }

  @Override
  public READ_type getReadType() {
    return READ_type.LOOKUP;
  }

  @Override
  public ApbPartialReadArgs toPartialRead() {
    return ApbPartialReadArgs.newBuilder().setSet(ApbSetPartialRead.newBuilder().
        setLookup(ApbSetLookupRead.newBuilder().setElement(ByteString.copyFromUtf8(element)))).build();
  }
}
