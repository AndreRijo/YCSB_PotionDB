package com.arijo.potiondb;

import com.arijo.protobuf.*;
import com.google.protobuf.ByteString;

public class ProtoFactory {

  //Note: ts can be null.
  public static ApbStartTransaction createStartTxn(byte[] ts) {
    if (ts == null)
      ts = new byte[0];   //Happens on the first txn or when we don't want a reference clock.
    ApbStartTransaction.Builder builder = ApbStartTransaction.newBuilder();
    builder.setProperties(ApbTxnProperties.newBuilder().setReadWrite(0).setRedBlue(0).build());
    builder.setTimestamp(ByteString.copyFrom(ts));
    return builder.build();
  }

  public static ApbCommitTransaction createCommitTxn(ByteString txnId) {
    return ApbCommitTransaction.newBuilder().setTransactionDescriptor(txnId).build();
  }

  public static ApbAbortTransaction createAbortTxn(ByteString txnId) {
    return ApbAbortTransaction.newBuilder().setTransactionDescriptor(txnId).build();
  }

  public static ApbRead createRead(byte[] txnId, ReadObjectParams[] fullReads, ReadObjectParams[] partialReads) {
    ApbRead.Builder builder = ApbRead.newBuilder();
    builder.setTransactionDescriptor(ByteString.copyFrom(txnId));
    for (ReadObjectParams read : fullReads)
      builder.addFullreads(createBoundObject(read.getKeyParams()));
    for (ReadObjectParams partialRead : partialReads)
      builder.addPartialreads(createPartialRead(partialRead));
    return builder.build();
  }

  public static ApbStaticRead createStaticRead(byte[] txnId, ReadObjectParams[] fullReads, ReadObjectParams[] partialReads) {
    ApbStaticRead.Builder builder = ApbStaticRead.newBuilder();
    builder.setTransaction(createStartTxn(txnId));
    if (fullReads != null)    //May be null if it only has partial reads
      for (ReadObjectParams read : fullReads)
        builder.addFullreads(createBoundObject(read.getKeyParams()));
    if (partialReads != null) //May be null if it only has full reads
      for (ReadObjectParams partialRead : partialReads)
        builder.addPartialreads(createPartialRead(partialRead));
    return builder.build();
  }

  public static ApbStaticReadObjects createStaticReadObjs(byte[] txnId, ReadObjectParams[] reads) {
    ApbStaticReadObjects.Builder builder = ApbStaticReadObjects.newBuilder();
    builder.setTransaction(createStartTxn(txnId));
    for (ReadObjectParams read : reads)
      builder.addObjects(createBoundObject(read.getKeyParams()));
    return builder.build();
  }

  public static ApbReadObjects createReadObjs(byte[] txnId, ReadObjectParams[] reads) {
    ApbReadObjects.Builder builder = ApbReadObjects.newBuilder();
    builder.setTransactionDescriptor(ByteString.copyFrom(txnId));
    for (ReadObjectParams read : reads)
      builder.addBoundobjects(createBoundObject(read.getKeyParams()));
    return builder.build();
  }

  public static ApbStaticUpdateObjects createStaticUpdateObjs(byte[] txnId, UpdateObjectParams[] updates) {
    ApbStaticUpdateObjects.Builder builder = ApbStaticUpdateObjects.newBuilder();
    builder.setTransaction(createStartTxn(txnId));
    for (UpdateObjectParams update : updates)
      builder.addUpdates(createUpdateOp(update));
    return builder.build();
  }

  public static ApbUpdateObjects createUpdateObjs(byte[] txnId, UpdateObjectParams[] updates) {
    ApbUpdateObjects.Builder builder = ApbUpdateObjects.newBuilder();
    builder.setTransactionDescriptor(ByteString.copyFrom(txnId));
    for (UpdateObjectParams update : updates)
      builder.addUpdates(createUpdateOp(update));
    return builder.build();
  }

  //Helpers

  /*
  private static ApbBoundObject[] createBoundObjectsArray(List<ReadObjectParams> readParams) {
    ApbBoundObject[] objs = new ApbBoundObject[readParams.size()];
    int i = 0;
    for (ReadObjectParams read : readParams) {
      objs[i++] = createBoundObject(read);
    }
    return objs;
  }*/

  private static ApbBoundObject createBoundObject(KeyParams keyParams) {
    return ApbBoundObject.newBuilder().setKey(ByteString.copyFromUtf8(keyParams.getKey()))
        .setBucket(ByteString.copyFromUtf8(keyParams.getBucket())).setType(keyParams.getCrdtType()).build();
  }

  private static ApbPartialRead createPartialRead(ReadObjectParams readParams) {
    if (readParams.getReadArguments().getReadType() == READ_type.FULL)
      return ApbPartialRead.newBuilder().setObject(createBoundObject(readParams.getKeyParams())).
          setReadtype(READ_type.FULL).setArgs(ApbPartialReadArgs.newBuilder()).build();
    return ApbPartialRead.newBuilder().setObject(createBoundObject(readParams.getKeyParams())).
        setReadtype(readParams.getReadArguments().getReadType()).setArgs(readParams.getReadArguments().toPartialRead()).build();
  }

  private static ApbUpdateOp createUpdateOp(UpdateObjectParams update) {
    return ApbUpdateOp.newBuilder().setBoundobject(createBoundObject(update.getKeyParams())).
        setOperation(update.getUpdateArgs().toUpdateObject()).build();
  }

}
