package com.arijo.potiondb.crdt.update;

import com.arijo.potiondb.crdt.CRDTConvUtils;
import com.arijo.protobuf.ApbMapUpdate;
import com.arijo.protobuf.ApbUpdateOperation;
import com.arijo.protobuf.CRDT_type;

public class EmbMapUpdate implements UpdateArguments {

  private String key;
  private UpdateArguments upd;

  public EmbMapUpdate(String key, UpdateArguments upd) {
    this.key = key;
    this.upd = upd;
  }

  public String getKey() {
    return key;
  }

  public UpdateArguments getUpd() {
    return upd;
  }

  @Override
  public CRDT_type getCRDTType() {
    return CRDT_type.RRMAP;
  }

  @Override
  public ApbUpdateOperation toUpdateObject() {
    return ApbUpdateOperation.newBuilder().setMapop(ApbMapUpdate.newBuilder().addUpdates(CRDTConvUtils.mapNestedUpdateToProto(key, upd))).build();
  }
}
