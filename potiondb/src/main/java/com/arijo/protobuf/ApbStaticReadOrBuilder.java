// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: antidote.proto

package com.arijo.protobuf;

public interface ApbStaticReadOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ApbStaticRead)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .ApbBoundObject fullreads = 1;</code>
   */
  java.util.List<com.arijo.protobuf.ApbBoundObject>
  getFullreadsList();

  /**
   * <code>repeated .ApbBoundObject fullreads = 1;</code>
   */
  com.arijo.protobuf.ApbBoundObject getFullreads(int index);

  /**
   * <code>repeated .ApbBoundObject fullreads = 1;</code>
   */
  int getFullreadsCount();

  /**
   * <code>repeated .ApbBoundObject fullreads = 1;</code>
   */
  java.util.List<? extends com.arijo.protobuf.ApbBoundObjectOrBuilder>
  getFullreadsOrBuilderList();

  /**
   * <code>repeated .ApbBoundObject fullreads = 1;</code>
   */
  com.arijo.protobuf.ApbBoundObjectOrBuilder getFullreadsOrBuilder(
      int index);

  /**
   * <code>repeated .ApbPartialRead partialreads = 2;</code>
   */
  java.util.List<com.arijo.protobuf.ApbPartialRead>
  getPartialreadsList();

  /**
   * <code>repeated .ApbPartialRead partialreads = 2;</code>
   */
  com.arijo.protobuf.ApbPartialRead getPartialreads(int index);

  /**
   * <code>repeated .ApbPartialRead partialreads = 2;</code>
   */
  int getPartialreadsCount();

  /**
   * <code>repeated .ApbPartialRead partialreads = 2;</code>
   */
  java.util.List<? extends com.arijo.protobuf.ApbPartialReadOrBuilder>
  getPartialreadsOrBuilderList();

  /**
   * <code>repeated .ApbPartialRead partialreads = 2;</code>
   */
  com.arijo.protobuf.ApbPartialReadOrBuilder getPartialreadsOrBuilder(
      int index);

  /**
   * <code>required .ApbStartTransaction transaction = 3;</code>
   *
   * @return Whether the transaction field is set.
   */
  boolean hasTransaction();

  /**
   * <code>required .ApbStartTransaction transaction = 3;</code>
   *
   * @return The transaction.
   */
  com.arijo.protobuf.ApbStartTransaction getTransaction();

  /**
   * <code>required .ApbStartTransaction transaction = 3;</code>
   */
  com.arijo.protobuf.ApbStartTransactionOrBuilder getTransactionOrBuilder();
}
