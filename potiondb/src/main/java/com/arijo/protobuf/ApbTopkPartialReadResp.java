// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: antidote.proto

package com.arijo.protobuf;

/**
 * Protobuf type {@code ApbTopkPartialReadResp}
 */
public final class ApbTopkPartialReadResp extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ApbTopkPartialReadResp)
    ApbTopkPartialReadRespOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use ApbTopkPartialReadResp.newBuilder() to construct.
  private ApbTopkPartialReadResp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ApbTopkPartialReadResp() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ApbTopkPartialReadResp();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }

  private ApbTopkPartialReadResp(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            com.arijo.protobuf.ApbGetTopkResp.Builder subBuilder = null;
            if (((bitField0_ & 0x00000001) != 0)) {
              subBuilder = pairs_.toBuilder();
            }
            pairs_ = input.readMessage(com.arijo.protobuf.ApbGetTopkResp.PARSER, extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(pairs_);
              pairs_ = subBuilder.buildPartial();
            }
            bitField0_ |= 0x00000001;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor
  getDescriptor() {
    return com.arijo.protobuf.AntidotePB.internal_static_ApbTopkPartialReadResp_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
  internalGetFieldAccessorTable() {
    return com.arijo.protobuf.AntidotePB.internal_static_ApbTopkPartialReadResp_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.arijo.protobuf.ApbTopkPartialReadResp.class, com.arijo.protobuf.ApbTopkPartialReadResp.Builder.class);
  }

  private int bitField0_;
  public static final int PAIRS_FIELD_NUMBER = 1;
  private com.arijo.protobuf.ApbGetTopkResp pairs_;

  /**
   * <code>required .ApbGetTopkResp pairs = 1;</code>
   *
   * @return Whether the pairs field is set.
   */
  @java.lang.Override
  public boolean hasPairs() {
    return ((bitField0_ & 0x00000001) != 0);
  }

  /**
   * <code>required .ApbGetTopkResp pairs = 1;</code>
   *
   * @return The pairs.
   */
  @java.lang.Override
  public com.arijo.protobuf.ApbGetTopkResp getPairs() {
    return pairs_ == null ? com.arijo.protobuf.ApbGetTopkResp.getDefaultInstance() : pairs_;
  }

  /**
   * <code>required .ApbGetTopkResp pairs = 1;</code>
   */
  @java.lang.Override
  public com.arijo.protobuf.ApbGetTopkRespOrBuilder getPairsOrBuilder() {
    return pairs_ == null ? com.arijo.protobuf.ApbGetTopkResp.getDefaultInstance() : pairs_;
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    if (!hasPairs()) {
      memoizedIsInitialized = 0;
      return false;
    }
    if (!getPairs().isInitialized()) {
      memoizedIsInitialized = 0;
      return false;
    }
    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
      throws java.io.IOException {
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(1, getPairs());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getPairs());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.arijo.protobuf.ApbTopkPartialReadResp)) {
      return super.equals(obj);
    }
    com.arijo.protobuf.ApbTopkPartialReadResp other = (com.arijo.protobuf.ApbTopkPartialReadResp) obj;

    if (hasPairs() != other.hasPairs()) return false;
    if (hasPairs()) {
      if (!getPairs()
          .equals(other.getPairs())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasPairs()) {
      hash = (37 * hash) + PAIRS_FIELD_NUMBER;
      hash = (53 * hash) + getPairs().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.arijo.protobuf.ApbTopkPartialReadResp parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.arijo.protobuf.ApbTopkPartialReadResp parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.arijo.protobuf.ApbTopkPartialReadResp parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.arijo.protobuf.ApbTopkPartialReadResp parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.arijo.protobuf.ApbTopkPartialReadResp parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.arijo.protobuf.ApbTopkPartialReadResp parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.arijo.protobuf.ApbTopkPartialReadResp parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }

  public static com.arijo.protobuf.ApbTopkPartialReadResp parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.arijo.protobuf.ApbTopkPartialReadResp parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.arijo.protobuf.ApbTopkPartialReadResp parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.arijo.protobuf.ApbTopkPartialReadResp parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }

  public static com.arijo.protobuf.ApbTopkPartialReadResp parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.arijo.protobuf.ApbTopkPartialReadResp prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }

  /**
   * Protobuf type {@code ApbTopkPartialReadResp}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ApbTopkPartialReadResp)
      com.arijo.protobuf.ApbTopkPartialReadRespOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
    getDescriptor() {
      return com.arijo.protobuf.AntidotePB.internal_static_ApbTopkPartialReadResp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
    internalGetFieldAccessorTable() {
      return com.arijo.protobuf.AntidotePB.internal_static_ApbTopkPartialReadResp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.arijo.protobuf.ApbTopkPartialReadResp.class, com.arijo.protobuf.ApbTopkPartialReadResp.Builder.class);
    }

    // Construct using com.arijo.protobuf.ApbTopkPartialReadResp.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
          .alwaysUseFieldBuilders) {
        getPairsFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (pairsBuilder_ == null) {
        pairs_ = null;
      } else {
        pairsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
    getDescriptorForType() {
      return com.arijo.protobuf.AntidotePB.internal_static_ApbTopkPartialReadResp_descriptor;
    }

    @java.lang.Override
    public com.arijo.protobuf.ApbTopkPartialReadResp getDefaultInstanceForType() {
      return com.arijo.protobuf.ApbTopkPartialReadResp.getDefaultInstance();
    }

    @java.lang.Override
    public com.arijo.protobuf.ApbTopkPartialReadResp build() {
      com.arijo.protobuf.ApbTopkPartialReadResp result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.arijo.protobuf.ApbTopkPartialReadResp buildPartial() {
      com.arijo.protobuf.ApbTopkPartialReadResp result = new com.arijo.protobuf.ApbTopkPartialReadResp(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        if (pairsBuilder_ == null) {
          result.pairs_ = pairs_;
        } else {
          result.pairs_ = pairsBuilder_.build();
        }
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.arijo.protobuf.ApbTopkPartialReadResp) {
        return mergeFrom((com.arijo.protobuf.ApbTopkPartialReadResp) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.arijo.protobuf.ApbTopkPartialReadResp other) {
      if (other == com.arijo.protobuf.ApbTopkPartialReadResp.getDefaultInstance()) return this;
      if (other.hasPairs()) {
        mergePairs(other.getPairs());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      if (!hasPairs()) {
        return false;
      }
      if (!getPairs().isInitialized()) {
        return false;
      }
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.arijo.protobuf.ApbTopkPartialReadResp parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.arijo.protobuf.ApbTopkPartialReadResp) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private com.arijo.protobuf.ApbGetTopkResp pairs_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.arijo.protobuf.ApbGetTopkResp, com.arijo.protobuf.ApbGetTopkResp.Builder, com.arijo.protobuf.ApbGetTopkRespOrBuilder> pairsBuilder_;

    /**
     * <code>required .ApbGetTopkResp pairs = 1;</code>
     *
     * @return Whether the pairs field is set.
     */
    public boolean hasPairs() {
      return ((bitField0_ & 0x00000001) != 0);
    }

    /**
     * <code>required .ApbGetTopkResp pairs = 1;</code>
     *
     * @return The pairs.
     */
    public com.arijo.protobuf.ApbGetTopkResp getPairs() {
      if (pairsBuilder_ == null) {
        return pairs_ == null ? com.arijo.protobuf.ApbGetTopkResp.getDefaultInstance() : pairs_;
      } else {
        return pairsBuilder_.getMessage();
      }
    }

    /**
     * <code>required .ApbGetTopkResp pairs = 1;</code>
     */
    public Builder setPairs(com.arijo.protobuf.ApbGetTopkResp value) {
      if (pairsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        pairs_ = value;
        onChanged();
      } else {
        pairsBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      return this;
    }

    /**
     * <code>required .ApbGetTopkResp pairs = 1;</code>
     */
    public Builder setPairs(
        com.arijo.protobuf.ApbGetTopkResp.Builder builderForValue) {
      if (pairsBuilder_ == null) {
        pairs_ = builderForValue.build();
        onChanged();
      } else {
        pairsBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      return this;
    }

    /**
     * <code>required .ApbGetTopkResp pairs = 1;</code>
     */
    public Builder mergePairs(com.arijo.protobuf.ApbGetTopkResp value) {
      if (pairsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
            pairs_ != null &&
            pairs_ != com.arijo.protobuf.ApbGetTopkResp.getDefaultInstance()) {
          pairs_ =
              com.arijo.protobuf.ApbGetTopkResp.newBuilder(pairs_).mergeFrom(value).buildPartial();
        } else {
          pairs_ = value;
        }
        onChanged();
      } else {
        pairsBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      return this;
    }

    /**
     * <code>required .ApbGetTopkResp pairs = 1;</code>
     */
    public Builder clearPairs() {
      if (pairsBuilder_ == null) {
        pairs_ = null;
        onChanged();
      } else {
        pairsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    /**
     * <code>required .ApbGetTopkResp pairs = 1;</code>
     */
    public com.arijo.protobuf.ApbGetTopkResp.Builder getPairsBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getPairsFieldBuilder().getBuilder();
    }

    /**
     * <code>required .ApbGetTopkResp pairs = 1;</code>
     */
    public com.arijo.protobuf.ApbGetTopkRespOrBuilder getPairsOrBuilder() {
      if (pairsBuilder_ != null) {
        return pairsBuilder_.getMessageOrBuilder();
      } else {
        return pairs_ == null ?
            com.arijo.protobuf.ApbGetTopkResp.getDefaultInstance() : pairs_;
      }
    }

    /**
     * <code>required .ApbGetTopkResp pairs = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.arijo.protobuf.ApbGetTopkResp, com.arijo.protobuf.ApbGetTopkResp.Builder, com.arijo.protobuf.ApbGetTopkRespOrBuilder>
    getPairsFieldBuilder() {
      if (pairsBuilder_ == null) {
        pairsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.arijo.protobuf.ApbGetTopkResp, com.arijo.protobuf.ApbGetTopkResp.Builder, com.arijo.protobuf.ApbGetTopkRespOrBuilder>(
            getPairs(),
            getParentForChildren(),
            isClean());
        pairs_ = null;
      }
      return pairsBuilder_;
    }

    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:ApbTopkPartialReadResp)
  }

  // @@protoc_insertion_point(class_scope:ApbTopkPartialReadResp)
  private static final com.arijo.protobuf.ApbTopkPartialReadResp DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.arijo.protobuf.ApbTopkPartialReadResp();
  }

  public static com.arijo.protobuf.ApbTopkPartialReadResp getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated
  public static final com.google.protobuf.Parser<ApbTopkPartialReadResp>
      PARSER = new com.google.protobuf.AbstractParser<ApbTopkPartialReadResp>() {
    @java.lang.Override
    public ApbTopkPartialReadResp parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ApbTopkPartialReadResp(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ApbTopkPartialReadResp> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ApbTopkPartialReadResp> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.arijo.protobuf.ApbTopkPartialReadResp getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

