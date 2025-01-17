// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: antidote.proto

package com.arijo.protobuf;

/**
 * Protobuf type {@code ApbMapEntry}
 */
public final class ApbMapEntry extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ApbMapEntry)
    ApbMapEntryOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use ApbMapEntry.newBuilder() to construct.
  private ApbMapEntry(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ApbMapEntry() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ApbMapEntry();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }

  private ApbMapEntry(
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
            com.arijo.protobuf.ApbMapKey.Builder subBuilder = null;
            if (((bitField0_ & 0x00000001) != 0)) {
              subBuilder = key_.toBuilder();
            }
            key_ = input.readMessage(com.arijo.protobuf.ApbMapKey.PARSER, extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(key_);
              key_ = subBuilder.buildPartial();
            }
            bitField0_ |= 0x00000001;
            break;
          }
          case 18: {
            com.arijo.protobuf.ApbReadObjectResp.Builder subBuilder = null;
            if (((bitField0_ & 0x00000002) != 0)) {
              subBuilder = value_.toBuilder();
            }
            value_ = input.readMessage(com.arijo.protobuf.ApbReadObjectResp.PARSER, extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(value_);
              value_ = subBuilder.buildPartial();
            }
            bitField0_ |= 0x00000002;
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
    return com.arijo.protobuf.AntidotePB.internal_static_ApbMapEntry_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
  internalGetFieldAccessorTable() {
    return com.arijo.protobuf.AntidotePB.internal_static_ApbMapEntry_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.arijo.protobuf.ApbMapEntry.class, com.arijo.protobuf.ApbMapEntry.Builder.class);
  }

  private int bitField0_;
  public static final int KEY_FIELD_NUMBER = 1;
  private com.arijo.protobuf.ApbMapKey key_;

  /**
   * <code>required .ApbMapKey key = 1;</code>
   *
   * @return Whether the key field is set.
   */
  @java.lang.Override
  public boolean hasKey() {
    return ((bitField0_ & 0x00000001) != 0);
  }

  /**
   * <code>required .ApbMapKey key = 1;</code>
   *
   * @return The key.
   */
  @java.lang.Override
  public com.arijo.protobuf.ApbMapKey getKey() {
    return key_ == null ? com.arijo.protobuf.ApbMapKey.getDefaultInstance() : key_;
  }

  /**
   * <code>required .ApbMapKey key = 1;</code>
   */
  @java.lang.Override
  public com.arijo.protobuf.ApbMapKeyOrBuilder getKeyOrBuilder() {
    return key_ == null ? com.arijo.protobuf.ApbMapKey.getDefaultInstance() : key_;
  }

  public static final int VALUE_FIELD_NUMBER = 2;
  private com.arijo.protobuf.ApbReadObjectResp value_;

  /**
   * <code>required .ApbReadObjectResp value = 2;</code>
   *
   * @return Whether the value field is set.
   */
  @java.lang.Override
  public boolean hasValue() {
    return ((bitField0_ & 0x00000002) != 0);
  }

  /**
   * <code>required .ApbReadObjectResp value = 2;</code>
   *
   * @return The value.
   */
  @java.lang.Override
  public com.arijo.protobuf.ApbReadObjectResp getValue() {
    return value_ == null ? com.arijo.protobuf.ApbReadObjectResp.getDefaultInstance() : value_;
  }

  /**
   * <code>required .ApbReadObjectResp value = 2;</code>
   */
  @java.lang.Override
  public com.arijo.protobuf.ApbReadObjectRespOrBuilder getValueOrBuilder() {
    return value_ == null ? com.arijo.protobuf.ApbReadObjectResp.getDefaultInstance() : value_;
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    if (!hasKey()) {
      memoizedIsInitialized = 0;
      return false;
    }
    if (!hasValue()) {
      memoizedIsInitialized = 0;
      return false;
    }
    if (!getKey().isInitialized()) {
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
      output.writeMessage(1, getKey());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeMessage(2, getValue());
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
          .computeMessageSize(1, getKey());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, getValue());
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
    if (!(obj instanceof com.arijo.protobuf.ApbMapEntry)) {
      return super.equals(obj);
    }
    com.arijo.protobuf.ApbMapEntry other = (com.arijo.protobuf.ApbMapEntry) obj;

    if (hasKey() != other.hasKey()) return false;
    if (hasKey()) {
      if (!getKey()
          .equals(other.getKey())) return false;
    }
    if (hasValue() != other.hasValue()) return false;
    if (hasValue()) {
      if (!getValue()
          .equals(other.getValue())) return false;
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
    if (hasKey()) {
      hash = (37 * hash) + KEY_FIELD_NUMBER;
      hash = (53 * hash) + getKey().hashCode();
    }
    if (hasValue()) {
      hash = (37 * hash) + VALUE_FIELD_NUMBER;
      hash = (53 * hash) + getValue().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.arijo.protobuf.ApbMapEntry parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.arijo.protobuf.ApbMapEntry parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.arijo.protobuf.ApbMapEntry parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.arijo.protobuf.ApbMapEntry parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.arijo.protobuf.ApbMapEntry parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.arijo.protobuf.ApbMapEntry parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.arijo.protobuf.ApbMapEntry parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }

  public static com.arijo.protobuf.ApbMapEntry parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.arijo.protobuf.ApbMapEntry parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.arijo.protobuf.ApbMapEntry parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.arijo.protobuf.ApbMapEntry parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }

  public static com.arijo.protobuf.ApbMapEntry parseFrom(
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

  public static Builder newBuilder(com.arijo.protobuf.ApbMapEntry prototype) {
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
   * Protobuf type {@code ApbMapEntry}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ApbMapEntry)
      com.arijo.protobuf.ApbMapEntryOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
    getDescriptor() {
      return com.arijo.protobuf.AntidotePB.internal_static_ApbMapEntry_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
    internalGetFieldAccessorTable() {
      return com.arijo.protobuf.AntidotePB.internal_static_ApbMapEntry_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.arijo.protobuf.ApbMapEntry.class, com.arijo.protobuf.ApbMapEntry.Builder.class);
    }

    // Construct using com.arijo.protobuf.ApbMapEntry.newBuilder()
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
        getKeyFieldBuilder();
        getValueFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (keyBuilder_ == null) {
        key_ = null;
      } else {
        keyBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      if (valueBuilder_ == null) {
        value_ = null;
      } else {
        valueBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
    getDescriptorForType() {
      return com.arijo.protobuf.AntidotePB.internal_static_ApbMapEntry_descriptor;
    }

    @java.lang.Override
    public com.arijo.protobuf.ApbMapEntry getDefaultInstanceForType() {
      return com.arijo.protobuf.ApbMapEntry.getDefaultInstance();
    }

    @java.lang.Override
    public com.arijo.protobuf.ApbMapEntry build() {
      com.arijo.protobuf.ApbMapEntry result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.arijo.protobuf.ApbMapEntry buildPartial() {
      com.arijo.protobuf.ApbMapEntry result = new com.arijo.protobuf.ApbMapEntry(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        if (keyBuilder_ == null) {
          result.key_ = key_;
        } else {
          result.key_ = keyBuilder_.build();
        }
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        if (valueBuilder_ == null) {
          result.value_ = value_;
        } else {
          result.value_ = valueBuilder_.build();
        }
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
      if (other instanceof com.arijo.protobuf.ApbMapEntry) {
        return mergeFrom((com.arijo.protobuf.ApbMapEntry) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.arijo.protobuf.ApbMapEntry other) {
      if (other == com.arijo.protobuf.ApbMapEntry.getDefaultInstance()) return this;
      if (other.hasKey()) {
        mergeKey(other.getKey());
      }
      if (other.hasValue()) {
        mergeValue(other.getValue());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      if (!hasKey()) {
        return false;
      }
      if (!hasValue()) {
        return false;
      }
      if (!getKey().isInitialized()) {
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
      com.arijo.protobuf.ApbMapEntry parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.arijo.protobuf.ApbMapEntry) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private com.arijo.protobuf.ApbMapKey key_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.arijo.protobuf.ApbMapKey, com.arijo.protobuf.ApbMapKey.Builder, com.arijo.protobuf.ApbMapKeyOrBuilder> keyBuilder_;

    /**
     * <code>required .ApbMapKey key = 1;</code>
     *
     * @return Whether the key field is set.
     */
    public boolean hasKey() {
      return ((bitField0_ & 0x00000001) != 0);
    }

    /**
     * <code>required .ApbMapKey key = 1;</code>
     *
     * @return The key.
     */
    public com.arijo.protobuf.ApbMapKey getKey() {
      if (keyBuilder_ == null) {
        return key_ == null ? com.arijo.protobuf.ApbMapKey.getDefaultInstance() : key_;
      } else {
        return keyBuilder_.getMessage();
      }
    }

    /**
     * <code>required .ApbMapKey key = 1;</code>
     */
    public Builder setKey(com.arijo.protobuf.ApbMapKey value) {
      if (keyBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        key_ = value;
        onChanged();
      } else {
        keyBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      return this;
    }

    /**
     * <code>required .ApbMapKey key = 1;</code>
     */
    public Builder setKey(
        com.arijo.protobuf.ApbMapKey.Builder builderForValue) {
      if (keyBuilder_ == null) {
        key_ = builderForValue.build();
        onChanged();
      } else {
        keyBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      return this;
    }

    /**
     * <code>required .ApbMapKey key = 1;</code>
     */
    public Builder mergeKey(com.arijo.protobuf.ApbMapKey value) {
      if (keyBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
            key_ != null &&
            key_ != com.arijo.protobuf.ApbMapKey.getDefaultInstance()) {
          key_ =
              com.arijo.protobuf.ApbMapKey.newBuilder(key_).mergeFrom(value).buildPartial();
        } else {
          key_ = value;
        }
        onChanged();
      } else {
        keyBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      return this;
    }

    /**
     * <code>required .ApbMapKey key = 1;</code>
     */
    public Builder clearKey() {
      if (keyBuilder_ == null) {
        key_ = null;
        onChanged();
      } else {
        keyBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    /**
     * <code>required .ApbMapKey key = 1;</code>
     */
    public com.arijo.protobuf.ApbMapKey.Builder getKeyBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getKeyFieldBuilder().getBuilder();
    }

    /**
     * <code>required .ApbMapKey key = 1;</code>
     */
    public com.arijo.protobuf.ApbMapKeyOrBuilder getKeyOrBuilder() {
      if (keyBuilder_ != null) {
        return keyBuilder_.getMessageOrBuilder();
      } else {
        return key_ == null ?
            com.arijo.protobuf.ApbMapKey.getDefaultInstance() : key_;
      }
    }

    /**
     * <code>required .ApbMapKey key = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.arijo.protobuf.ApbMapKey, com.arijo.protobuf.ApbMapKey.Builder, com.arijo.protobuf.ApbMapKeyOrBuilder>
    getKeyFieldBuilder() {
      if (keyBuilder_ == null) {
        keyBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.arijo.protobuf.ApbMapKey, com.arijo.protobuf.ApbMapKey.Builder, com.arijo.protobuf.ApbMapKeyOrBuilder>(
            getKey(),
            getParentForChildren(),
            isClean());
        key_ = null;
      }
      return keyBuilder_;
    }

    private com.arijo.protobuf.ApbReadObjectResp value_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.arijo.protobuf.ApbReadObjectResp, com.arijo.protobuf.ApbReadObjectResp.Builder, com.arijo.protobuf.ApbReadObjectRespOrBuilder> valueBuilder_;

    /**
     * <code>required .ApbReadObjectResp value = 2;</code>
     *
     * @return Whether the value field is set.
     */
    public boolean hasValue() {
      return ((bitField0_ & 0x00000002) != 0);
    }

    /**
     * <code>required .ApbReadObjectResp value = 2;</code>
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
     * <code>required .ApbReadObjectResp value = 2;</code>
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
      bitField0_ |= 0x00000002;
      return this;
    }

    /**
     * <code>required .ApbReadObjectResp value = 2;</code>
     */
    public Builder setValue(
        com.arijo.protobuf.ApbReadObjectResp.Builder builderForValue) {
      if (valueBuilder_ == null) {
        value_ = builderForValue.build();
        onChanged();
      } else {
        valueBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      return this;
    }

    /**
     * <code>required .ApbReadObjectResp value = 2;</code>
     */
    public Builder mergeValue(com.arijo.protobuf.ApbReadObjectResp value) {
      if (valueBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
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
      bitField0_ |= 0x00000002;
      return this;
    }

    /**
     * <code>required .ApbReadObjectResp value = 2;</code>
     */
    public Builder clearValue() {
      if (valueBuilder_ == null) {
        value_ = null;
        onChanged();
      } else {
        valueBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    /**
     * <code>required .ApbReadObjectResp value = 2;</code>
     */
    public com.arijo.protobuf.ApbReadObjectResp.Builder getValueBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getValueFieldBuilder().getBuilder();
    }

    /**
     * <code>required .ApbReadObjectResp value = 2;</code>
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
     * <code>required .ApbReadObjectResp value = 2;</code>
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


    // @@protoc_insertion_point(builder_scope:ApbMapEntry)
  }

  // @@protoc_insertion_point(class_scope:ApbMapEntry)
  private static final com.arijo.protobuf.ApbMapEntry DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.arijo.protobuf.ApbMapEntry();
  }

  public static com.arijo.protobuf.ApbMapEntry getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated
  public static final com.google.protobuf.Parser<ApbMapEntry>
      PARSER = new com.google.protobuf.AbstractParser<ApbMapEntry>() {
    @java.lang.Override
    public ApbMapEntry parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ApbMapEntry(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ApbMapEntry> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ApbMapEntry> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.arijo.protobuf.ApbMapEntry getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

