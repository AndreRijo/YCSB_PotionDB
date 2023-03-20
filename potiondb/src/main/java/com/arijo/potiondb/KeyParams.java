package com.arijo.potiondb;

import com.arijo.protobuf.CRDT_type;

public class KeyParams {

  private String key;
  private String bucket;
  private CRDT_type crdtType;

  public KeyParams(String key, CRDT_type crdtType, String bucket) {
    this.key = key;
    this.bucket = bucket;
    this.crdtType = crdtType;
  }

  public String getKey() {
    return key;
  }

  public String getBucket() {
    return bucket;
  }

  public CRDT_type getCrdtType() {
    return crdtType;
  }
}
