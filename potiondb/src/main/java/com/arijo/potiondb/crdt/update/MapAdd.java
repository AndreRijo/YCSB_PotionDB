package com.arijo.potiondb.crdt.update;

import com.arijo.potiondb.crdt.CRDTConvUtils;
import com.arijo.protobuf.ApbMapUpdate;
import com.arijo.protobuf.ApbUpdateOperation;
import com.arijo.protobuf.CRDT_type;

public class MapAdd implements UpdateArguments {

  private String key;
  private String value;

  public MapAdd(String key, String value) {
    this.key = key;
    this.value = value;
  }

  public String getKey() {
    return key;
  }

  public Object getValue() {
    return value;
  }

  @Override
  public CRDT_type getCRDTType() {
    return CRDT_type.ORMAP;
  }

  @Override
  public ApbUpdateOperation toUpdateObject() {
    return ApbUpdateOperation.newBuilder().setMapop(ApbMapUpdate.newBuilder().addUpdates(CRDTConvUtils.mapEntryToProto(key, value))).build();
  }
}
