// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: antidote.proto

package com.arijo.protobuf;

public interface ApbMapGetValuesRespOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ApbMapGetValuesResp)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated bytes keys = 1;</code>
   *
   * @return A list containing the keys.
   */
  java.util.List<com.google.protobuf.ByteString> getKeysList();

  /**
   * <code>repeated bytes keys = 1;</code>
   *
   * @return The count of keys.
   */
  int getKeysCount();

  /**
   * <code>repeated bytes keys = 1;</code>
   *
   * @param index The index of the element to return.
   * @return The keys at the given index.
   */
  com.google.protobuf.ByteString getKeys(int index);

  /**
   * <code>repeated .ApbMapGetValueResp values = 2;</code>
   */
  java.util.List<com.arijo.protobuf.ApbMapGetValueResp>
  getValuesList();

  /**
   * <code>repeated .ApbMapGetValueResp values = 2;</code>
   */
  com.arijo.protobuf.ApbMapGetValueResp getValues(int index);

  /**
   * <code>repeated .ApbMapGetValueResp values = 2;</code>
   */
  int getValuesCount();

  /**
   * <code>repeated .ApbMapGetValueResp values = 2;</code>
   */
  java.util.List<? extends com.arijo.protobuf.ApbMapGetValueRespOrBuilder>
  getValuesOrBuilderList();

  /**
   * <code>repeated .ApbMapGetValueResp values = 2;</code>
   */
  com.arijo.protobuf.ApbMapGetValueRespOrBuilder getValuesOrBuilder(
      int index);
}