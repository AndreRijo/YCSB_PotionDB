package com.arijo.potiondb.crdt.update;

import com.arijo.potiondb.crdt.CRDTConvUtils;
import com.arijo.protobuf.ApbMapUpdate;
import com.arijo.protobuf.ApbUpdateOperation;
import com.arijo.protobuf.CRDT_type;

public class MapRemove implements UpdateArguments {

  private String key;

  public MapRemove(String key) {
    this.key = key;
  }

  public String getKey() {
    return key;
  }

  @Override
  public CRDT_type getCRDTType() {
    return CRDT_type.ORMAP;
  }

  @Override
  public ApbUpdateOperation toUpdateObject() {
    return ApbUpdateOperation.newBuilder().setMapop(ApbMapUpdate.newBuilder().addRemovedKeys(CRDTConvUtils.getApbMapKeyBuilder(key, CRDT_type.LWWREG))).build();
  }
}
