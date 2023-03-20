package com.arijo.potiondb.crdt.update;

import com.arijo.potiondb.crdt.CRDTConvUtils;
import com.arijo.protobuf.ApbMapUpdate;
import com.arijo.protobuf.ApbUpdateOperation;
import com.arijo.protobuf.CRDT_type;

import java.util.Map;

public class MapAddAll implements UpdateArguments {

  private Map<String, String> values;

  public MapAddAll(Map<String, String> values) {
    this.values = values;
  }

  public Map<String, String> getValues() {
    return values;
  }

  @Override
  public CRDT_type getCRDTType() {
    return CRDT_type.ORMAP;
  }

  @Override
  public ApbUpdateOperation toUpdateObject() {
    ApbMapUpdate.Builder mapUpd = ApbMapUpdate.newBuilder();
    for (Map.Entry<String, String> entry : values.entrySet())
      mapUpd.addUpdates(CRDTConvUtils.mapEntryToProto(entry.getKey(), entry.getValue()));
    return ApbUpdateOperation.newBuilder().setMapop(mapUpd).build();
  }
}
