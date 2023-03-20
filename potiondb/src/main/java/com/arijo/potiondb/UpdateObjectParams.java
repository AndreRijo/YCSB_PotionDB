package com.arijo.potiondb;

import com.arijo.potiondb.crdt.update.UpdateArguments;
import com.arijo.protobuf.CRDT_type;

public class UpdateObjectParams {

  private KeyParams keyParams;

  private UpdateArguments updateArgs;

  public UpdateObjectParams(String key, CRDT_type crdtType, String bucket, UpdateArguments updateArgs) {
    keyParams = new KeyParams(key, crdtType, bucket);
    this.updateArgs = updateArgs;
  }

  /**
   *
   * @return the key of this read's object
   */
  public String getKey() {
    return keyParams.getKey();
  }

  /**
   *
   * @return the bucket of this read's object
   */
  public String getBucket() {
    return keyParams.getBucket();
  }

  /**
   *
   * @return the CRDT type of this read's object
   */
  public CRDT_type getCrdtType() {
    return keyParams.getCrdtType();
  }

  /**
   *
   * @return the key parameters (key, CRDT type, bucket) of this read's object
   */
  public KeyParams getKeyParams() {
    return keyParams;
  }

  /**
   *
   * @return the arguments of this read (e.g., the type of read and any other arguments necessary for the read)
   */
  public UpdateArguments getUpdateArgs() {
    return updateArgs;
  }
}
