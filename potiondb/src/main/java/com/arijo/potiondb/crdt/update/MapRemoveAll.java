package com.arijo.potiondb.crdt.update;

import com.arijo.potiondb.crdt.CRDTConvUtils;
import com.arijo.protobuf.ApbMapUpdate;
import com.arijo.protobuf.ApbUpdateOperation;
import com.arijo.protobuf.CRDT_type;

public class MapRemoveAll implements UpdateArguments {

  private String[] keys;

  public MapRemoveAll(String[] keys) {
    this.keys = keys;
  }

  public String[] getKeys() {
    return keys;
  }

  @Override
  public CRDT_type getCRDTType() {
    return CRDT_type.ORMAP;
  }

  @Override
  public ApbUpdateOperation toUpdateObject() {
    ApbMapUpdate.Builder mapUpd = ApbMapUpdate.newBuilder();
    for (String key : keys)
      mapUpd.addRemovedKeys(CRDTConvUtils.getApbMapKeyBuilder(key, CRDT_type.LWWREG));
    return ApbUpdateOperation.newBuilder().setMapop(mapUpd).build();
  }
}
