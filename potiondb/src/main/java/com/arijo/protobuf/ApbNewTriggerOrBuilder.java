// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: antidote.proto

package com.arijo.protobuf;

public interface ApbNewTriggerOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ApbNewTrigger)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>required .ApbTriggerInfo source = 1;</code>
   *
   * @return Whether the source field is set.
   */
  boolean hasSource();

  /**
   * <code>required .ApbTriggerInfo source = 1;</code>
   *
   * @return The source.
   */
  com.arijo.protobuf.ApbTriggerInfo getSource();

  /**
   * <code>required .ApbTriggerInfo source = 1;</code>
   */
  com.arijo.protobuf.ApbTriggerInfoOrBuilder getSourceOrBuilder();

  /**
   * <code>required .ApbTriggerInfo target = 2;</code>
   *
   * @return Whether the target field is set.
   */
  boolean hasTarget();

  /**
   * <code>required .ApbTriggerInfo target = 2;</code>
   *
   * @return The target.
   */
  com.arijo.protobuf.ApbTriggerInfo getTarget();

  /**
   * <code>required .ApbTriggerInfo target = 2;</code>
   */
  com.arijo.protobuf.ApbTriggerInfoOrBuilder getTargetOrBuilder();

  /**
   * <code>required bool isGeneric = 3;</code>
   *
   * @return Whether the isGeneric field is set.
   */
  boolean hasIsGeneric();

  /**
   * <code>required bool isGeneric = 3;</code>
   *
   * @return The isGeneric.
   */
  boolean getIsGeneric();
}
