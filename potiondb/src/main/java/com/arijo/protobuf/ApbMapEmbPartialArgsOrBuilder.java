// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: antidote.proto

package com.arijo.protobuf;

public interface ApbMapEmbPartialArgsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ApbMapEmbPartialArgs)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional .CRDT_type type = 1;</code>
   *
   * @return Whether the type field is set.
   */
  boolean hasType();

  /**
   * <code>optional .CRDT_type type = 1;</code>
   *
   * @return The type.
   */
  com.arijo.protobuf.CRDT_type getType();

  /**
   * <code>required .READ_type readtype = 2;</code>
   *
   * @return Whether the readtype field is set.
   */
  boolean hasReadtype();

  /**
   * <code>required .READ_type readtype = 2;</code>
   *
   * @return The readtype.
   */
  com.arijo.protobuf.READ_type getReadtype();

  /**
   * <pre>
   * If not present, then it's a full read
   * </pre>
   *
   * <code>optional .ApbPartialReadArgs args = 3;</code>
   *
   * @return Whether the args field is set.
   */
  boolean hasArgs();

  /**
   * <pre>
   * If not present, then it's a full read
   * </pre>
   *
   * <code>optional .ApbPartialReadArgs args = 3;</code>
   *
   * @return The args.
   */
  com.arijo.protobuf.ApbPartialReadArgs getArgs();

  /**
   * <pre>
   * If not present, then it's a full read
   * </pre>
   *
   * <code>optional .ApbPartialReadArgs args = 3;</code>
   */
  com.arijo.protobuf.ApbPartialReadArgsOrBuilder getArgsOrBuilder();
}