// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: antidote.proto

package com.arijo.protobuf;

public interface ApbUpdateOpOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ApbUpdateOp)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>required .ApbBoundObject boundobject = 1;</code>
   *
   * @return Whether the boundobject field is set.
   */
  boolean hasBoundobject();

  /**
   * <code>required .ApbBoundObject boundobject = 1;</code>
   *
   * @return The boundobject.
   */
  com.arijo.protobuf.ApbBoundObject getBoundobject();

  /**
   * <code>required .ApbBoundObject boundobject = 1;</code>
   */
  com.arijo.protobuf.ApbBoundObjectOrBuilder getBoundobjectOrBuilder();

  /**
   * <code>required .ApbUpdateOperation operation = 2;</code>
   *
   * @return Whether the operation field is set.
   */
  boolean hasOperation();

  /**
   * <code>required .ApbUpdateOperation operation = 2;</code>
   *
   * @return The operation.
   */
  com.arijo.protobuf.ApbUpdateOperation getOperation();

  /**
   * <code>required .ApbUpdateOperation operation = 2;</code>
   */
  com.arijo.protobuf.ApbUpdateOperationOrBuilder getOperationOrBuilder();
}
