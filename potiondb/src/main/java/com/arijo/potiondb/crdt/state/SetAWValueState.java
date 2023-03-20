package com.arijo.potiondb.crdt.state;

import com.arijo.protobuf.ApbReadObjectResp;
import com.arijo.protobuf.CRDT_type;
import com.arijo.protobuf.READ_type;
import com.google.protobuf.ByteString;

import java.util.List;

public class SetAWValueState implements State {

  private String[] elems;

  public SetAWValueState(String[] elems) {
    this.elems = elems;
  }

  @Override
  public CRDT_type getCRDTType() {
    return CRDT_type.ORSET;
  }

  @Override
  public READ_type getReadType() {
    return READ_type.FULL;
  }

  @Override
  public State fromProto(ApbReadObjectResp proto) {
    List<ByteString> byteStrings = proto.getSet().getValueList();
    elems = new String[byteStrings.size()];
    int i = 0;
    for (ByteString byteString : byteStrings)
      elems[i++] = byteString.toStringUtf8();
    return this;
  }

  public static SetAWValueState fromProtoStatic(ApbReadObjectResp proto) {
    return (SetAWValueState) new SetAWValueState(null).fromProto(proto);
  }
}
