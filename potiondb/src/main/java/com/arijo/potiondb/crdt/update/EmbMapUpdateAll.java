package com.arijo.potiondb.crdt.update;

import com.arijo.potiondb.crdt.CRDTConvUtils;
import com.arijo.protobuf.ApbMapUpdate;
import com.arijo.protobuf.ApbUpdateOperation;
import com.arijo.protobuf.CRDT_type;

import java.util.Map;

public class EmbMapUpdateAll implements UpdateArguments {

  private Map<String, UpdateArguments> upds;

  public EmbMapUpdateAll(Map<String, UpdateArguments> upds) {
    this.upds = upds;
  }

  public Map<String, UpdateArguments> getUpds() {
    return upds;
  }

  @Override
  public CRDT_type getCRDTType() {
    return CRDT_type.RRMAP;
  }

  @Override
  public ApbUpdateOperation toUpdateObject() {
    ApbMapUpdate.Builder mapUpd = ApbMapUpdate.newBuilder();
    for (Map.Entry<String, UpdateArguments> entry : upds.entrySet())
      mapUpd.addUpdates(CRDTConvUtils.mapNestedUpdateToProto(entry.getKey(), entry.getValue()));
    return ApbUpdateOperation.newBuilder().setMapop(mapUpd).build();
  }
}
