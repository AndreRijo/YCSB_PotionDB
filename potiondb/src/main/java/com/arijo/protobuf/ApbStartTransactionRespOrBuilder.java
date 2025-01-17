// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: antidote.proto

package com.arijo.protobuf;

public interface ApbStartTransactionRespOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ApbStartTransactionResp)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>required bool success = 1;</code>
   *
   * @return Whether the success field is set.
   */
  boolean hasSuccess();

  /**
   * <code>required bool success = 1;</code>
   *
   * @return The success.
   */
  boolean getSuccess();

  /**
   * <code>optional bytes transaction_descriptor = 2;</code>
   *
   * @return Whether the transactionDescriptor field is set.
   */
  boolean hasTransactionDescriptor();

  /**
   * <code>optional bytes transaction_descriptor = 2;</code>
   *
   * @return The transactionDescriptor.
   */
  com.google.protobuf.ByteString getTransactionDescriptor();

  /**
   * <code>optional uint32 errorcode = 3;</code>
   *
   * @return Whether the errorcode field is set.
   */
  boolean hasErrorcode();

  /**
   * <code>optional uint32 errorcode = 3;</code>
   *
   * @return The errorcode.
   */
  int getErrorcode();
}
