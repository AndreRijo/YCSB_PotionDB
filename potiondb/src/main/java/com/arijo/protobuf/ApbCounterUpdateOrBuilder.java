// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: antidote.proto

package com.arijo.protobuf;

public interface ApbCounterUpdateOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ApbCounterUpdate)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * inc indicates the value to be incremented. To decrement, use a negative value. If no value is given, it will be considered as an increment by 1
   * </pre>
   *
   * <code>optional sint64 inc = 1;</code>
   *
   * @return Whether the inc field is set.
   */
  boolean hasInc();

  /**
   * <pre>
   * inc indicates the value to be incremented. To decrement, use a negative value. If no value is given, it will be considered as an increment by 1
   * </pre>
   *
   * <code>optional sint64 inc = 1;</code>
   *
   * @return The inc.
   */
  long getInc();
}
