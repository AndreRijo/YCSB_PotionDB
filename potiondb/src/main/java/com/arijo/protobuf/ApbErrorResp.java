// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: antidote.proto

package com.arijo.protobuf;

/**
 * <pre>
 * Riak Error response
 * </pre>
 * <p>
 * Protobuf type {@code ApbErrorResp}
 */
public final class ApbErrorResp extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ApbErrorResp)
    ApbErrorRespOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use ApbErrorResp.newBuilder() to construct.
  private ApbErrorResp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ApbErrorResp() {
    errmsg_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ApbErrorResp();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }

  private ApbErrorResp(
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
            bitField0_ |= 0x00000001;
            errmsg_ = input.readBytes();
            break;
          }
          case 16: {
            bitField0_ |= 0x00000002;
            errcode_ = input.readUInt32();
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
    return com.arijo.protobuf.AntidotePB.internal_static_ApbErrorResp_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
  internalGetFieldAccessorTable() {
    return com.arijo.protobuf.AntidotePB.internal_static_ApbErrorResp_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.arijo.protobuf.ApbErrorResp.class, com.arijo.protobuf.ApbErrorResp.Builder.class);
  }

  private int bitField0_;
  public static final int ERRMSG_FIELD_NUMBER = 1;
  private com.google.protobuf.ByteString errmsg_;

  /**
   * <code>required bytes errmsg = 1;</code>
   *
   * @return Whether the errmsg field is set.
   */
  @java.lang.Override
  public boolean hasErrmsg() {
    return ((bitField0_ & 0x00000001) != 0);
  }

  /**
   * <code>required bytes errmsg = 1;</code>
   *
   * @return The errmsg.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getErrmsg() {
    return errmsg_;
  }

  public static final int ERRCODE_FIELD_NUMBER = 2;
  private int errcode_;

  /**
   * <code>required uint32 errcode = 2;</code>
   *
   * @return Whether the errcode field is set.
   */
  @java.lang.Override
  public boolean hasErrcode() {
    return ((bitField0_ & 0x00000002) != 0);
  }

  /**
   * <code>required uint32 errcode = 2;</code>
   *
   * @return The errcode.
   */
  @java.lang.Override
  public int getErrcode() {
    return errcode_;
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    if (!hasErrmsg()) {
      memoizedIsInitialized = 0;
      return false;
    }
    if (!hasErrcode()) {
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
      output.writeBytes(1, errmsg_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeUInt32(2, errcode_);
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
          .computeBytesSize(1, errmsg_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, errcode_);
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
    if (!(obj instanceof com.arijo.protobuf.ApbErrorResp)) {
      return super.equals(obj);
    }
    com.arijo.protobuf.ApbErrorResp other = (com.arijo.protobuf.ApbErrorResp) obj;

    if (hasErrmsg() != other.hasErrmsg()) return false;
    if (hasErrmsg()) {
      if (!getErrmsg()
          .equals(other.getErrmsg())) return false;
    }
    if (hasErrcode() != other.hasErrcode()) return false;
    if (hasErrcode()) {
      if (getErrcode()
          != other.getErrcode()) return false;
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
    if (hasErrmsg()) {
      hash = (37 * hash) + ERRMSG_FIELD_NUMBER;
      hash = (53 * hash) + getErrmsg().hashCode();
    }
    if (hasErrcode()) {
      hash = (37 * hash) + ERRCODE_FIELD_NUMBER;
      hash = (53 * hash) + getErrcode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.arijo.protobuf.ApbErrorResp parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.arijo.protobuf.ApbErrorResp parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.arijo.protobuf.ApbErrorResp parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.arijo.protobuf.ApbErrorResp parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.arijo.protobuf.ApbErrorResp parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.arijo.protobuf.ApbErrorResp parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.arijo.protobuf.ApbErrorResp parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }

  public static com.arijo.protobuf.ApbErrorResp parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.arijo.protobuf.ApbErrorResp parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.arijo.protobuf.ApbErrorResp parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.arijo.protobuf.ApbErrorResp parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }

  public static com.arijo.protobuf.ApbErrorResp parseFrom(
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

  public static Builder newBuilder(com.arijo.protobuf.ApbErrorResp prototype) {
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
   * <pre>
   * Riak Error response
   * </pre>
   * <p>
   * Protobuf type {@code ApbErrorResp}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ApbErrorResp)
      com.arijo.protobuf.ApbErrorRespOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
    getDescriptor() {
      return com.arijo.protobuf.AntidotePB.internal_static_ApbErrorResp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
    internalGetFieldAccessorTable() {
      return com.arijo.protobuf.AntidotePB.internal_static_ApbErrorResp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.arijo.protobuf.ApbErrorResp.class, com.arijo.protobuf.ApbErrorResp.Builder.class);
    }

    // Construct using com.arijo.protobuf.ApbErrorResp.newBuilder()
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
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      errmsg_ = com.google.protobuf.ByteString.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      errcode_ = 0;
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
    getDescriptorForType() {
      return com.arijo.protobuf.AntidotePB.internal_static_ApbErrorResp_descriptor;
    }

    @java.lang.Override
    public com.arijo.protobuf.ApbErrorResp getDefaultInstanceForType() {
      return com.arijo.protobuf.ApbErrorResp.getDefaultInstance();
    }

    @java.lang.Override
    public com.arijo.protobuf.ApbErrorResp build() {
      com.arijo.protobuf.ApbErrorResp result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.arijo.protobuf.ApbErrorResp buildPartial() {
      com.arijo.protobuf.ApbErrorResp result = new com.arijo.protobuf.ApbErrorResp(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        to_bitField0_ |= 0x00000001;
      }
      result.errmsg_ = errmsg_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.errcode_ = errcode_;
        to_bitField0_ |= 0x00000002;
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
      if (other instanceof com.arijo.protobuf.ApbErrorResp) {
        return mergeFrom((com.arijo.protobuf.ApbErrorResp) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.arijo.protobuf.ApbErrorResp other) {
      if (other == com.arijo.protobuf.ApbErrorResp.getDefaultInstance()) return this;
      if (other.hasErrmsg()) {
        setErrmsg(other.getErrmsg());
      }
      if (other.hasErrcode()) {
        setErrcode(other.getErrcode());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      if (!hasErrmsg()) {
        return false;
      }
      if (!hasErrcode()) {
        return false;
      }
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.arijo.protobuf.ApbErrorResp parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.arijo.protobuf.ApbErrorResp) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private com.google.protobuf.ByteString errmsg_ = com.google.protobuf.ByteString.EMPTY;

    /**
     * <code>required bytes errmsg = 1;</code>
     *
     * @return Whether the errmsg field is set.
     */
    @java.lang.Override
    public boolean hasErrmsg() {
      return ((bitField0_ & 0x00000001) != 0);
    }

    /**
     * <code>required bytes errmsg = 1;</code>
     *
     * @return The errmsg.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getErrmsg() {
      return errmsg_;
    }

    /**
     * <code>required bytes errmsg = 1;</code>
     *
     * @param value The errmsg to set.
     * @return This builder for chaining.
     */
    public Builder setErrmsg(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      errmsg_ = value;
      onChanged();
      return this;
    }

    /**
     * <code>required bytes errmsg = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearErrmsg() {
      bitField0_ = (bitField0_ & ~0x00000001);
      errmsg_ = getDefaultInstance().getErrmsg();
      onChanged();
      return this;
    }

    private int errcode_;

    /**
     * <code>required uint32 errcode = 2;</code>
     *
     * @return Whether the errcode field is set.
     */
    @java.lang.Override
    public boolean hasErrcode() {
      return ((bitField0_ & 0x00000002) != 0);
    }

    /**
     * <code>required uint32 errcode = 2;</code>
     *
     * @return The errcode.
     */
    @java.lang.Override
    public int getErrcode() {
      return errcode_;
    }

    /**
     * <code>required uint32 errcode = 2;</code>
     *
     * @param value The errcode to set.
     * @return This builder for chaining.
     */
    public Builder setErrcode(int value) {
      bitField0_ |= 0x00000002;
      errcode_ = value;
      onChanged();
      return this;
    }

    /**
     * <code>required uint32 errcode = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearErrcode() {
      bitField0_ = (bitField0_ & ~0x00000002);
      errcode_ = 0;
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:ApbErrorResp)
  }

  // @@protoc_insertion_point(class_scope:ApbErrorResp)
  private static final com.arijo.protobuf.ApbErrorResp DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.arijo.protobuf.ApbErrorResp();
  }

  public static com.arijo.protobuf.ApbErrorResp getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated
  public static final com.google.protobuf.Parser<ApbErrorResp>
      PARSER = new com.google.protobuf.AbstractParser<ApbErrorResp>() {
    @java.lang.Override
    public ApbErrorResp parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ApbErrorResp(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ApbErrorResp> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ApbErrorResp> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.arijo.protobuf.ApbErrorResp getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

