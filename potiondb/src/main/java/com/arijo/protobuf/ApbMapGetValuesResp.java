// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: antidote.proto

package com.arijo.protobuf;

/**
 * Protobuf type {@code ApbMapGetValuesResp}
 */
public final class ApbMapGetValuesResp extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ApbMapGetValuesResp)
    ApbMapGetValuesRespOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use ApbMapGetValuesResp.newBuilder() to construct.
  private ApbMapGetValuesResp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ApbMapGetValuesResp() {
    keys_ = java.util.Collections.emptyList();
    values_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ApbMapGetValuesResp();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }

  private ApbMapGetValuesResp(
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
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              keys_ = new java.util.ArrayList<com.google.protobuf.ByteString>();
              mutable_bitField0_ |= 0x00000001;
            }
            keys_.add(input.readBytes());
            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000002) != 0)) {
              values_ = new java.util.ArrayList<com.arijo.protobuf.ApbMapGetValueResp>();
              mutable_bitField0_ |= 0x00000002;
            }
            values_.add(
                input.readMessage(com.arijo.protobuf.ApbMapGetValueResp.PARSER, extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        keys_ = java.util.Collections.unmodifiableList(keys_); // C
      }
      if (((mutable_bitField0_ & 0x00000002) != 0)) {
        values_ = java.util.Collections.unmodifiableList(values_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor
  getDescriptor() {
    return com.arijo.protobuf.AntidotePB.internal_static_ApbMapGetValuesResp_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
  internalGetFieldAccessorTable() {
    return com.arijo.protobuf.AntidotePB.internal_static_ApbMapGetValuesResp_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.arijo.protobuf.ApbMapGetValuesResp.class, com.arijo.protobuf.ApbMapGetValuesResp.Builder.class);
  }

  public static final int KEYS_FIELD_NUMBER = 1;
  private java.util.List<com.google.protobuf.ByteString> keys_;

  /**
   * <code>repeated bytes keys = 1;</code>
   *
   * @return A list containing the keys.
   */
  @java.lang.Override
  public java.util.List<com.google.protobuf.ByteString>
  getKeysList() {
    return keys_;
  }

  /**
   * <code>repeated bytes keys = 1;</code>
   *
   * @return The count of keys.
   */
  public int getKeysCount() {
    return keys_.size();
  }

  /**
   * <code>repeated bytes keys = 1;</code>
   *
   * @param index The index of the element to return.
   * @return The keys at the given index.
   */
  public com.google.protobuf.ByteString getKeys(int index) {
    return keys_.get(index);
  }

  public static final int VALUES_FIELD_NUMBER = 2;
  private java.util.List<com.arijo.protobuf.ApbMapGetValueResp> values_;

  /**
   * <code>repeated .ApbMapGetValueResp values = 2;</code>
   */
  @java.lang.Override
  public java.util.List<com.arijo.protobuf.ApbMapGetValueResp> getValuesList() {
    return values_;
  }

  /**
   * <code>repeated .ApbMapGetValueResp values = 2;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.arijo.protobuf.ApbMapGetValueRespOrBuilder>
  getValuesOrBuilderList() {
    return values_;
  }

  /**
   * <code>repeated .ApbMapGetValueResp values = 2;</code>
   */
  @java.lang.Override
  public int getValuesCount() {
    return values_.size();
  }

  /**
   * <code>repeated .ApbMapGetValueResp values = 2;</code>
   */
  @java.lang.Override
  public com.arijo.protobuf.ApbMapGetValueResp getValues(int index) {
    return values_.get(index);
  }

  /**
   * <code>repeated .ApbMapGetValueResp values = 2;</code>
   */
  @java.lang.Override
  public com.arijo.protobuf.ApbMapGetValueRespOrBuilder getValuesOrBuilder(
      int index) {
    return values_.get(index);
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    for (int i = 0; i < getValuesCount(); i++) {
      if (!getValues(i).isInitialized()) {
        memoizedIsInitialized = 0;
        return false;
      }
    }
    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
      throws java.io.IOException {
    for (int i = 0; i < keys_.size(); i++) {
      output.writeBytes(1, keys_.get(i));
    }
    for (int i = 0; i < values_.size(); i++) {
      output.writeMessage(2, values_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < keys_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
            .computeBytesSizeNoTag(keys_.get(i));
      }
      size += dataSize;
      size += 1 * getKeysList().size();
    }
    for (int i = 0; i < values_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, values_.get(i));
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
    if (!(obj instanceof com.arijo.protobuf.ApbMapGetValuesResp)) {
      return super.equals(obj);
    }
    com.arijo.protobuf.ApbMapGetValuesResp other = (com.arijo.protobuf.ApbMapGetValuesResp) obj;

    if (!getKeysList()
        .equals(other.getKeysList())) return false;
    if (!getValuesList()
        .equals(other.getValuesList())) return false;
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
    if (getKeysCount() > 0) {
      hash = (37 * hash) + KEYS_FIELD_NUMBER;
      hash = (53 * hash) + getKeysList().hashCode();
    }
    if (getValuesCount() > 0) {
      hash = (37 * hash) + VALUES_FIELD_NUMBER;
      hash = (53 * hash) + getValuesList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.arijo.protobuf.ApbMapGetValuesResp parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.arijo.protobuf.ApbMapGetValuesResp parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.arijo.protobuf.ApbMapGetValuesResp parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.arijo.protobuf.ApbMapGetValuesResp parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.arijo.protobuf.ApbMapGetValuesResp parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.arijo.protobuf.ApbMapGetValuesResp parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.arijo.protobuf.ApbMapGetValuesResp parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }

  public static com.arijo.protobuf.ApbMapGetValuesResp parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.arijo.protobuf.ApbMapGetValuesResp parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.arijo.protobuf.ApbMapGetValuesResp parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.arijo.protobuf.ApbMapGetValuesResp parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }

  public static com.arijo.protobuf.ApbMapGetValuesResp parseFrom(
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

  public static Builder newBuilder(com.arijo.protobuf.ApbMapGetValuesResp prototype) {
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
   * Protobuf type {@code ApbMapGetValuesResp}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ApbMapGetValuesResp)
      com.arijo.protobuf.ApbMapGetValuesRespOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
    getDescriptor() {
      return com.arijo.protobuf.AntidotePB.internal_static_ApbMapGetValuesResp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
    internalGetFieldAccessorTable() {
      return com.arijo.protobuf.AntidotePB.internal_static_ApbMapGetValuesResp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.arijo.protobuf.ApbMapGetValuesResp.class, com.arijo.protobuf.ApbMapGetValuesResp.Builder.class);
    }

    // Construct using com.arijo.protobuf.ApbMapGetValuesResp.newBuilder()
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
        getValuesFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      keys_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      if (valuesBuilder_ == null) {
        values_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
      } else {
        valuesBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
    getDescriptorForType() {
      return com.arijo.protobuf.AntidotePB.internal_static_ApbMapGetValuesResp_descriptor;
    }

    @java.lang.Override
    public com.arijo.protobuf.ApbMapGetValuesResp getDefaultInstanceForType() {
      return com.arijo.protobuf.ApbMapGetValuesResp.getDefaultInstance();
    }

    @java.lang.Override
    public com.arijo.protobuf.ApbMapGetValuesResp build() {
      com.arijo.protobuf.ApbMapGetValuesResp result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.arijo.protobuf.ApbMapGetValuesResp buildPartial() {
      com.arijo.protobuf.ApbMapGetValuesResp result = new com.arijo.protobuf.ApbMapGetValuesResp(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        keys_ = java.util.Collections.unmodifiableList(keys_);
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.keys_ = keys_;
      if (valuesBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          values_ = java.util.Collections.unmodifiableList(values_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.values_ = values_;
      } else {
        result.values_ = valuesBuilder_.build();
      }
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
      if (other instanceof com.arijo.protobuf.ApbMapGetValuesResp) {
        return mergeFrom((com.arijo.protobuf.ApbMapGetValuesResp) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.arijo.protobuf.ApbMapGetValuesResp other) {
      if (other == com.arijo.protobuf.ApbMapGetValuesResp.getDefaultInstance()) return this;
      if (!other.keys_.isEmpty()) {
        if (keys_.isEmpty()) {
          keys_ = other.keys_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureKeysIsMutable();
          keys_.addAll(other.keys_);
        }
        onChanged();
      }
      if (valuesBuilder_ == null) {
        if (!other.values_.isEmpty()) {
          if (values_.isEmpty()) {
            values_ = other.values_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureValuesIsMutable();
            values_.addAll(other.values_);
          }
          onChanged();
        }
      } else {
        if (!other.values_.isEmpty()) {
          if (valuesBuilder_.isEmpty()) {
            valuesBuilder_.dispose();
            valuesBuilder_ = null;
            values_ = other.values_;
            bitField0_ = (bitField0_ & ~0x00000002);
            valuesBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                    getValuesFieldBuilder() : null;
          } else {
            valuesBuilder_.addAllMessages(other.values_);
          }
        }
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      for (int i = 0; i < getValuesCount(); i++) {
        if (!getValues(i).isInitialized()) {
          return false;
        }
      }
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.arijo.protobuf.ApbMapGetValuesResp parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.arijo.protobuf.ApbMapGetValuesResp) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private java.util.List<com.google.protobuf.ByteString> keys_ = java.util.Collections.emptyList();

    private void ensureKeysIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        keys_ = new java.util.ArrayList<com.google.protobuf.ByteString>(keys_);
        bitField0_ |= 0x00000001;
      }
    }

    /**
     * <code>repeated bytes keys = 1;</code>
     *
     * @return A list containing the keys.
     */
    public java.util.List<com.google.protobuf.ByteString>
    getKeysList() {
      return ((bitField0_ & 0x00000001) != 0) ?
          java.util.Collections.unmodifiableList(keys_) : keys_;
    }

    /**
     * <code>repeated bytes keys = 1;</code>
     *
     * @return The count of keys.
     */
    public int getKeysCount() {
      return keys_.size();
    }

    /**
     * <code>repeated bytes keys = 1;</code>
     *
     * @param index The index of the element to return.
     * @return The keys at the given index.
     */
    public com.google.protobuf.ByteString getKeys(int index) {
      return keys_.get(index);
    }

    /**
     * <code>repeated bytes keys = 1;</code>
     *
     * @param index The index to set the value at.
     * @param value The keys to set.
     * @return This builder for chaining.
     */
    public Builder setKeys(
        int index, com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureKeysIsMutable();
      keys_.set(index, value);
      onChanged();
      return this;
    }

    /**
     * <code>repeated bytes keys = 1;</code>
     *
     * @param value The keys to add.
     * @return This builder for chaining.
     */
    public Builder addKeys(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureKeysIsMutable();
      keys_.add(value);
      onChanged();
      return this;
    }

    /**
     * <code>repeated bytes keys = 1;</code>
     *
     * @param values The keys to add.
     * @return This builder for chaining.
     */
    public Builder addAllKeys(
        java.lang.Iterable<? extends com.google.protobuf.ByteString> values) {
      ensureKeysIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, keys_);
      onChanged();
      return this;
    }

    /**
     * <code>repeated bytes keys = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearKeys() {
      keys_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }

    private java.util.List<com.arijo.protobuf.ApbMapGetValueResp> values_ =
        java.util.Collections.emptyList();

    private void ensureValuesIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        values_ = new java.util.ArrayList<com.arijo.protobuf.ApbMapGetValueResp>(values_);
        bitField0_ |= 0x00000002;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.arijo.protobuf.ApbMapGetValueResp, com.arijo.protobuf.ApbMapGetValueResp.Builder, com.arijo.protobuf.ApbMapGetValueRespOrBuilder> valuesBuilder_;

    /**
     * <code>repeated .ApbMapGetValueResp values = 2;</code>
     */
    public java.util.List<com.arijo.protobuf.ApbMapGetValueResp> getValuesList() {
      if (valuesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(values_);
      } else {
        return valuesBuilder_.getMessageList();
      }
    }

    /**
     * <code>repeated .ApbMapGetValueResp values = 2;</code>
     */
    public int getValuesCount() {
      if (valuesBuilder_ == null) {
        return values_.size();
      } else {
        return valuesBuilder_.getCount();
      }
    }

    /**
     * <code>repeated .ApbMapGetValueResp values = 2;</code>
     */
    public com.arijo.protobuf.ApbMapGetValueResp getValues(int index) {
      if (valuesBuilder_ == null) {
        return values_.get(index);
      } else {
        return valuesBuilder_.getMessage(index);
      }
    }

    /**
     * <code>repeated .ApbMapGetValueResp values = 2;</code>
     */
    public Builder setValues(
        int index, com.arijo.protobuf.ApbMapGetValueResp value) {
      if (valuesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureValuesIsMutable();
        values_.set(index, value);
        onChanged();
      } else {
        valuesBuilder_.setMessage(index, value);
      }
      return this;
    }

    /**
     * <code>repeated .ApbMapGetValueResp values = 2;</code>
     */
    public Builder setValues(
        int index, com.arijo.protobuf.ApbMapGetValueResp.Builder builderForValue) {
      if (valuesBuilder_ == null) {
        ensureValuesIsMutable();
        values_.set(index, builderForValue.build());
        onChanged();
      } else {
        valuesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }

    /**
     * <code>repeated .ApbMapGetValueResp values = 2;</code>
     */
    public Builder addValues(com.arijo.protobuf.ApbMapGetValueResp value) {
      if (valuesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureValuesIsMutable();
        values_.add(value);
        onChanged();
      } else {
        valuesBuilder_.addMessage(value);
      }
      return this;
    }

    /**
     * <code>repeated .ApbMapGetValueResp values = 2;</code>
     */
    public Builder addValues(
        int index, com.arijo.protobuf.ApbMapGetValueResp value) {
      if (valuesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureValuesIsMutable();
        values_.add(index, value);
        onChanged();
      } else {
        valuesBuilder_.addMessage(index, value);
      }
      return this;
    }

    /**
     * <code>repeated .ApbMapGetValueResp values = 2;</code>
     */
    public Builder addValues(
        com.arijo.protobuf.ApbMapGetValueResp.Builder builderForValue) {
      if (valuesBuilder_ == null) {
        ensureValuesIsMutable();
        values_.add(builderForValue.build());
        onChanged();
      } else {
        valuesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }

    /**
     * <code>repeated .ApbMapGetValueResp values = 2;</code>
     */
    public Builder addValues(
        int index, com.arijo.protobuf.ApbMapGetValueResp.Builder builderForValue) {
      if (valuesBuilder_ == null) {
        ensureValuesIsMutable();
        values_.add(index, builderForValue.build());
        onChanged();
      } else {
        valuesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }

    /**
     * <code>repeated .ApbMapGetValueResp values = 2;</code>
     */
    public Builder addAllValues(
        java.lang.Iterable<? extends com.arijo.protobuf.ApbMapGetValueResp> values) {
      if (valuesBuilder_ == null) {
        ensureValuesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, values_);
        onChanged();
      } else {
        valuesBuilder_.addAllMessages(values);
      }
      return this;
    }

    /**
     * <code>repeated .ApbMapGetValueResp values = 2;</code>
     */
    public Builder clearValues() {
      if (valuesBuilder_ == null) {
        values_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        valuesBuilder_.clear();
      }
      return this;
    }

    /**
     * <code>repeated .ApbMapGetValueResp values = 2;</code>
     */
    public Builder removeValues(int index) {
      if (valuesBuilder_ == null) {
        ensureValuesIsMutable();
        values_.remove(index);
        onChanged();
      } else {
        valuesBuilder_.remove(index);
      }
      return this;
    }

    /**
     * <code>repeated .ApbMapGetValueResp values = 2;</code>
     */
    public com.arijo.protobuf.ApbMapGetValueResp.Builder getValuesBuilder(
        int index) {
      return getValuesFieldBuilder().getBuilder(index);
    }

    /**
     * <code>repeated .ApbMapGetValueResp values = 2;</code>
     */
    public com.arijo.protobuf.ApbMapGetValueRespOrBuilder getValuesOrBuilder(
        int index) {
      if (valuesBuilder_ == null) {
        return values_.get(index);
      } else {
        return valuesBuilder_.getMessageOrBuilder(index);
      }
    }

    /**
     * <code>repeated .ApbMapGetValueResp values = 2;</code>
     */
    public java.util.List<? extends com.arijo.protobuf.ApbMapGetValueRespOrBuilder>
    getValuesOrBuilderList() {
      if (valuesBuilder_ != null) {
        return valuesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(values_);
      }
    }

    /**
     * <code>repeated .ApbMapGetValueResp values = 2;</code>
     */
    public com.arijo.protobuf.ApbMapGetValueResp.Builder addValuesBuilder() {
      return getValuesFieldBuilder().addBuilder(
          com.arijo.protobuf.ApbMapGetValueResp.getDefaultInstance());
    }

    /**
     * <code>repeated .ApbMapGetValueResp values = 2;</code>
     */
    public com.arijo.protobuf.ApbMapGetValueResp.Builder addValuesBuilder(
        int index) {
      return getValuesFieldBuilder().addBuilder(
          index, com.arijo.protobuf.ApbMapGetValueResp.getDefaultInstance());
    }

    /**
     * <code>repeated .ApbMapGetValueResp values = 2;</code>
     */
    public java.util.List<com.arijo.protobuf.ApbMapGetValueResp.Builder>
    getValuesBuilderList() {
      return getValuesFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.arijo.protobuf.ApbMapGetValueResp, com.arijo.protobuf.ApbMapGetValueResp.Builder, com.arijo.protobuf.ApbMapGetValueRespOrBuilder>
    getValuesFieldBuilder() {
      if (valuesBuilder_ == null) {
        valuesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.arijo.protobuf.ApbMapGetValueResp, com.arijo.protobuf.ApbMapGetValueResp.Builder, com.arijo.protobuf.ApbMapGetValueRespOrBuilder>(
            values_,
            ((bitField0_ & 0x00000002) != 0),
            getParentForChildren(),
            isClean());
        values_ = null;
      }
      return valuesBuilder_;
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


    // @@protoc_insertion_point(builder_scope:ApbMapGetValuesResp)
  }

  // @@protoc_insertion_point(class_scope:ApbMapGetValuesResp)
  private static final com.arijo.protobuf.ApbMapGetValuesResp DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.arijo.protobuf.ApbMapGetValuesResp();
  }

  public static com.arijo.protobuf.ApbMapGetValuesResp getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated
  public static final com.google.protobuf.Parser<ApbMapGetValuesResp>
      PARSER = new com.google.protobuf.AbstractParser<ApbMapGetValuesResp>() {
    @java.lang.Override
    public ApbMapGetValuesResp parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ApbMapGetValuesResp(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ApbMapGetValuesResp> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ApbMapGetValuesResp> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.arijo.protobuf.ApbMapGetValuesResp getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

