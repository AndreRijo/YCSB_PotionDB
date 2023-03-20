// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: antidote.proto

package com.arijo.protobuf;

/**
 * Protobuf type {@code ApbMapGetValueResp}
 */
public final class ApbMapGetValueResp extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ApbMapGetValueResp)
    ApbMapGetValueRespOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use ApbMapGetValueResp.newBuilder() to construct.
  private ApbMapGetValueResp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ApbMapGetValueResp() {
    crdttype_ = 3;
    parttype_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ApbMapGetValueResp();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }

  private ApbMapGetValueResp(
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
            com.arijo.protobuf.ApbReadObjectResp.Builder subBuilder = null;
            if (((bitField0_ & 0x00000001) != 0)) {
              subBuilder = value_.toBuilder();
            }
            value_ = input.readMessage(com.arijo.protobuf.ApbReadObjectResp.PARSER, extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(value_);
              value_ = subBuilder.buildPartial();
            }
            bitField0_ |= 0x00000001;
            break;
          }
          case 16: {
            int rawValue = input.readEnum();
            @SuppressWarnings("deprecation")
            com.arijo.protobuf.CRDT_type value = com.arijo.protobuf.CRDT_type.valueOf(rawValue);
            if (value == null) {
              unknownFields.mergeVarintField(2, rawValue);
            } else {
              bitField0_ |= 0x00000002;
              crdttype_ = rawValue;
            }
            break;
          }
          case 24: {
            int rawValue = input.readEnum();
            @SuppressWarnings("deprecation")
            com.arijo.protobuf.READ_type value = com.arijo.protobuf.READ_type.valueOf(rawValue);
            if (value == null) {
              unknownFields.mergeVarintField(3, rawValue);
            } else {
              bitField0_ |= 0x00000004;
              parttype_ = rawValue;
            }
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
    return com.arijo.protobuf.AntidotePB.internal_static_ApbMapGetValueResp_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
  internalGetFieldAccessorTable() {
    return com.arijo.protobuf.AntidotePB.internal_static_ApbMapGetValueResp_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.arijo.protobuf.ApbMapGetValueResp.class, com.arijo.protobuf.ApbMapGetValueResp.Builder.class);
  }

  private int bitField0_;
  public static final int VALUE_FIELD_NUMBER = 1;
  private com.arijo.protobuf.ApbReadObjectResp value_;

  /**
   * <code>required .ApbReadObjectResp value = 1;</code>
   *
   * @return Whether the value field is set.
   */
  @java.lang.Override
  public boolean hasValue() {
    return ((bitField0_ & 0x00000001) != 0);
  }

  /**
   * <code>required .ApbReadObjectResp value = 1;</code>
   *
   * @return The value.
   */
  @java.lang.Override
  public com.arijo.protobuf.ApbReadObjectResp getValue() {
    return value_ == null ? com.arijo.protobuf.ApbReadObjectResp.getDefaultInstance() : value_;
  }

  /**
   * <code>required .ApbReadObjectResp value = 1;</code>
   */
  @java.lang.Override
  public com.arijo.protobuf.ApbReadObjectRespOrBuilder getValueOrBuilder() {
    return value_ == null ? com.arijo.protobuf.ApbReadObjectResp.getDefaultInstance() : value_;
  }

  public static final int CRDTTYPE_FIELD_NUMBER = 2;
  private int crdttype_;

  /**
   * <code>optional .CRDT_type crdttype = 2;</code>
   *
   * @return Whether the crdttype field is set.
   */
  @java.lang.Override
  public boolean hasCrdttype() {
    return ((bitField0_ & 0x00000002) != 0);
  }

  /**
   * <code>optional .CRDT_type crdttype = 2;</code>
   *
   * @return The crdttype.
   */
  @java.lang.Override
  public com.arijo.protobuf.CRDT_type getCrdttype() {
    @SuppressWarnings("deprecation")
    com.arijo.protobuf.CRDT_type result = com.arijo.protobuf.CRDT_type.valueOf(crdttype_);
    return result == null ? com.arijo.protobuf.CRDT_type.COUNTER : result;
  }

  public static final int PARTTYPE_FIELD_NUMBER = 3;
  private int parttype_;

  /**
   * <code>optional .READ_type parttype = 3;</code>
   *
   * @return Whether the parttype field is set.
   */
  @java.lang.Override
  public boolean hasParttype() {
    return ((bitField0_ & 0x00000004) != 0);
  }

  /**
   * <code>optional .READ_type parttype = 3;</code>
   *
   * @return The parttype.
   */
  @java.lang.Override
  public com.arijo.protobuf.READ_type getParttype() {
    @SuppressWarnings("deprecation")
    com.arijo.protobuf.READ_type result = com.arijo.protobuf.READ_type.valueOf(parttype_);
    return result == null ? com.arijo.protobuf.READ_type.FULL : result;
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    if (!hasValue()) {
      memoizedIsInitialized = 0;
      return false;
    }
    if (!getValue().isInitialized()) {
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
      output.writeMessage(1, getValue());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeEnum(2, crdttype_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      output.writeEnum(3, parttype_);
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
          .computeMessageSize(1, getValue());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(2, crdttype_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(3, parttype_);
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
    if (!(obj instanceof com.arijo.protobuf.ApbMapGetValueResp)) {
      return super.equals(obj);
    }
    com.arijo.protobuf.ApbMapGetValueResp other = (com.arijo.protobuf.ApbMapGetValueResp) obj;

    if (hasValue() != other.hasValue()) return false;
    if (hasValue()) {
      if (!getValue()
          .equals(other.getValue())) return false;
    }
    if (hasCrdttype() != other.hasCrdttype()) return false;
    if (hasCrdttype()) {
      if (crdttype_ != other.crdttype_) return false;
    }
    if (hasParttype() != other.hasParttype()) return false;
    if (hasParttype()) {
      if (parttype_ != other.parttype_) return false;
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
    if (hasValue()) {
      hash = (37 * hash) + VALUE_FIELD_NUMBER;
      hash = (53 * hash) + getValue().hashCode();
    }
    if (hasCrdttype()) {
      hash = (37 * hash) + CRDTTYPE_FIELD_NUMBER;
      hash = (53 * hash) + crdttype_;
    }
    if (hasParttype()) {
      hash = (37 * hash) + PARTTYPE_FIELD_NUMBER;
      hash = (53 * hash) + parttype_;
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.arijo.protobuf.ApbMapGetValueResp parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.arijo.protobuf.ApbMapGetValueResp parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.arijo.protobuf.ApbMapGetValueResp parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.arijo.protobuf.ApbMapGetValueResp parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.arijo.protobuf.ApbMapGetValueResp parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.arijo.protobuf.ApbMapGetValueResp parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.arijo.protobuf.ApbMapGetValueResp parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }

  public static com.arijo.protobuf.ApbMapGetValueResp parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.arijo.protobuf.ApbMapGetValueResp parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.arijo.protobuf.ApbMapGetValueResp parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.arijo.protobuf.ApbMapGetValueResp parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }

  public static com.arijo.protobuf.ApbMapGetValueResp parseFrom(
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

  public static Builder newBuilder(com.arijo.protobuf.ApbMapGetValueResp prototype) {
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
   * Protobuf type {@code ApbMapGetValueResp}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ApbMapGetValueResp)
      com.arijo.protobuf.ApbMapGetValueRespOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
    getDescriptor() {
      return com.arijo.protobuf.AntidotePB.internal_static_ApbMapGetValueResp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
    internalGetFieldAccessorTable() {
      return com.arijo.protobuf.AntidotePB.internal_static_ApbMapGetValueResp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.arijo.protobuf.ApbMapGetValueResp.class, com.arijo.protobuf.ApbMapGetValueResp.Builder.class);
    }

    // Construct using com.arijo.protobuf.ApbMapGetValueResp.newBuilder()
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
        getValueFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (valueBuilder_ == null) {
        value_ = null;
      } else {
        valueBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      crdttype_ = 3;
      bitField0_ = (bitField0_ & ~0x00000002);
      parttype_ = 0;
      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
    getDescriptorForType() {
      return com.arijo.protobuf.AntidotePB.internal_static_ApbMapGetValueResp_descriptor;
    }

    @java.lang.Override
    public com.arijo.protobuf.ApbMapGetValueResp getDefaultInstanceForType() {
      return com.arijo.protobuf.ApbMapGetValueResp.getDefaultInstance();
    }

    @java.lang.Override
    public com.arijo.protobuf.ApbMapGetValueResp build() {
      com.arijo.protobuf.ApbMapGetValueResp result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.arijo.protobuf.ApbMapGetValueResp buildPartial() {
      com.arijo.protobuf.ApbMapGetValueResp result = new com.arijo.protobuf.ApbMapGetValueResp(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        if (valueBuilder_ == null) {
          result.value_ = value_;
        } else {
          result.value_ = valueBuilder_.build();
        }
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        to_bitField0_ |= 0x00000002;
      }
      result.crdttype_ = crdttype_;
      if (((from_bitField0_ & 0x00000004) != 0)) {
        to_bitField0_ |= 0x00000004;
      }
      result.parttype_ = parttype_;
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
      if (other instanceof com.arijo.protobuf.ApbMapGetValueResp) {
        return mergeFrom((com.arijo.protobuf.ApbMapGetValueResp) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.arijo.protobuf.ApbMapGetValueResp other) {
      if (other == com.arijo.protobuf.ApbMapGetValueResp.getDefaultInstance()) return this;
      if (other.hasValue()) {
        mergeValue(other.getValue());
      }
      if (other.hasCrdttype()) {
        setCrdttype(other.getCrdttype());
      }
      if (other.hasParttype()) {
        setParttype(other.getParttype());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      if (!hasValue()) {
        return false;
      }
      if (!getValue().isInitialized()) {
        return false;
      }
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.arijo.protobuf.ApbMapGetValueResp parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.arijo.protobuf.ApbMapGetValueResp) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private com.arijo.protobuf.ApbReadObjectResp value_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.arijo.protobuf.ApbReadObjectResp, com.arijo.protobuf.ApbReadObjectResp.Builder, com.arijo.protobuf.ApbReadObjectRespOrBuilder> valueBuilder_;

    /**
     * <code>required .ApbReadObjectResp value = 1;</code>
     *
     * @return Whether the value field is set.
     */
    public boolean hasValue() {
      return ((bitField0_ & 0x00000001) != 0);
    }

    /**
     * <code>required .ApbReadObjectResp value = 1;</code>
     *
     * @return The value.
     */
    public com.arijo.protobuf.ApbReadObjectResp getValue() {
      if (valueBuilder_ == null) {
        return value_ == null ? com.arijo.protobuf.ApbReadObjectResp.getDefaultInstance() : value_;
      } else {
        return valueBuilder_.getMessage();
      }
    }

    /**
     * <code>required .ApbReadObjectResp value = 1;</code>
     */
    public Builder setValue(com.arijo.protobuf.ApbReadObjectResp value) {
      if (valueBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        value_ = value;
        onChanged();
      } else {
        valueBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      return this;
    }

    /**
     * <code>required .ApbReadObjectResp value = 1;</code>
     */
    public Builder setValue(
        com.arijo.protobuf.ApbReadObjectResp.Builder builderForValue) {
      if (valueBuilder_ == null) {
        value_ = builderForValue.build();
        onChanged();
      } else {
        valueBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      return this;
    }

    /**
     * <code>required .ApbReadObjectResp value = 1;</code>
     */
    public Builder mergeValue(com.arijo.protobuf.ApbReadObjectResp value) {
      if (valueBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
            value_ != null &&
            value_ != com.arijo.protobuf.ApbReadObjectResp.getDefaultInstance()) {
          value_ =
              com.arijo.protobuf.ApbReadObjectResp.newBuilder(value_).mergeFrom(value).buildPartial();
        } else {
          value_ = value;
        }
        onChanged();
      } else {
        valueBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      return this;
    }

    /**
     * <code>required .ApbReadObjectResp value = 1;</code>
     */
    public Builder clearValue() {
      if (valueBuilder_ == null) {
        value_ = null;
        onChanged();
      } else {
        valueBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    /**
     * <code>required .ApbReadObjectResp value = 1;</code>
     */
    public com.arijo.protobuf.ApbReadObjectResp.Builder getValueBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getValueFieldBuilder().getBuilder();
    }

    /**
     * <code>required .ApbReadObjectResp value = 1;</code>
     */
    public com.arijo.protobuf.ApbReadObjectRespOrBuilder getValueOrBuilder() {
      if (valueBuilder_ != null) {
        return valueBuilder_.getMessageOrBuilder();
      } else {
        return value_ == null ?
            com.arijo.protobuf.ApbReadObjectResp.getDefaultInstance() : value_;
      }
    }

    /**
     * <code>required .ApbReadObjectResp value = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.arijo.protobuf.ApbReadObjectResp, com.arijo.protobuf.ApbReadObjectResp.Builder, com.arijo.protobuf.ApbReadObjectRespOrBuilder>
    getValueFieldBuilder() {
      if (valueBuilder_ == null) {
        valueBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.arijo.protobuf.ApbReadObjectResp, com.arijo.protobuf.ApbReadObjectResp.Builder, com.arijo.protobuf.ApbReadObjectRespOrBuilder>(
            getValue(),
            getParentForChildren(),
            isClean());
        value_ = null;
      }
      return valueBuilder_;
    }

    private int crdttype_ = 3;

    /**
     * <code>optional .CRDT_type crdttype = 2;</code>
     *
     * @return Whether the crdttype field is set.
     */
    @java.lang.Override
    public boolean hasCrdttype() {
      return ((bitField0_ & 0x00000002) != 0);
    }

    /**
     * <code>optional .CRDT_type crdttype = 2;</code>
     *
     * @return The crdttype.
     */
    @java.lang.Override
    public com.arijo.protobuf.CRDT_type getCrdttype() {
      @SuppressWarnings("deprecation")
      com.arijo.protobuf.CRDT_type result = com.arijo.protobuf.CRDT_type.valueOf(crdttype_);
      return result == null ? com.arijo.protobuf.CRDT_type.COUNTER : result;
    }

    /**
     * <code>optional .CRDT_type crdttype = 2;</code>
     *
     * @param value The crdttype to set.
     * @return This builder for chaining.
     */
    public Builder setCrdttype(com.arijo.protobuf.CRDT_type value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      crdttype_ = value.getNumber();
      onChanged();
      return this;
    }

    /**
     * <code>optional .CRDT_type crdttype = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearCrdttype() {
      bitField0_ = (bitField0_ & ~0x00000002);
      crdttype_ = 3;
      onChanged();
      return this;
    }

    private int parttype_ = 0;

    /**
     * <code>optional .READ_type parttype = 3;</code>
     *
     * @return Whether the parttype field is set.
     */
    @java.lang.Override
    public boolean hasParttype() {
      return ((bitField0_ & 0x00000004) != 0);
    }

    /**
     * <code>optional .READ_type parttype = 3;</code>
     *
     * @return The parttype.
     */
    @java.lang.Override
    public com.arijo.protobuf.READ_type getParttype() {
      @SuppressWarnings("deprecation")
      com.arijo.protobuf.READ_type result = com.arijo.protobuf.READ_type.valueOf(parttype_);
      return result == null ? com.arijo.protobuf.READ_type.FULL : result;
    }

    /**
     * <code>optional .READ_type parttype = 3;</code>
     *
     * @param value The parttype to set.
     * @return This builder for chaining.
     */
    public Builder setParttype(com.arijo.protobuf.READ_type value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000004;
      parttype_ = value.getNumber();
      onChanged();
      return this;
    }

    /**
     * <code>optional .READ_type parttype = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearParttype() {
      bitField0_ = (bitField0_ & ~0x00000004);
      parttype_ = 0;
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


    // @@protoc_insertion_point(builder_scope:ApbMapGetValueResp)
  }

  // @@protoc_insertion_point(class_scope:ApbMapGetValueResp)
  private static final com.arijo.protobuf.ApbMapGetValueResp DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.arijo.protobuf.ApbMapGetValueResp();
  }

  public static com.arijo.protobuf.ApbMapGetValueResp getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated
  public static final com.google.protobuf.Parser<ApbMapGetValueResp>
      PARSER = new com.google.protobuf.AbstractParser<ApbMapGetValueResp>() {
    @java.lang.Override
    public ApbMapGetValueResp parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ApbMapGetValueResp(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ApbMapGetValueResp> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ApbMapGetValueResp> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.arijo.protobuf.ApbMapGetValueResp getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
