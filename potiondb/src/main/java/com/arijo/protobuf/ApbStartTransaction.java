// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: antidote.proto

package com.arijo.protobuf;

/**
 * <pre>
 * Start Transaction
 * </pre>
 * <p>
 * Protobuf type {@code ApbStartTransaction}
 */
public final class ApbStartTransaction extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ApbStartTransaction)
    ApbStartTransactionOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use ApbStartTransaction.newBuilder() to construct.
  private ApbStartTransaction(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ApbStartTransaction() {
    timestamp_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ApbStartTransaction();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }

  private ApbStartTransaction(
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
            timestamp_ = input.readBytes();
            break;
          }
          case 18: {
            com.arijo.protobuf.ApbTxnProperties.Builder subBuilder = null;
            if (((bitField0_ & 0x00000002) != 0)) {
              subBuilder = properties_.toBuilder();
            }
            properties_ = input.readMessage(com.arijo.protobuf.ApbTxnProperties.PARSER, extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(properties_);
              properties_ = subBuilder.buildPartial();
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
    return com.arijo.protobuf.AntidotePB.internal_static_ApbStartTransaction_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
  internalGetFieldAccessorTable() {
    return com.arijo.protobuf.AntidotePB.internal_static_ApbStartTransaction_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.arijo.protobuf.ApbStartTransaction.class, com.arijo.protobuf.ApbStartTransaction.Builder.class);
  }

  private int bitField0_;
  public static final int TIMESTAMP_FIELD_NUMBER = 1;
  private com.google.protobuf.ByteString timestamp_;

  /**
   * <code>optional bytes timestamp = 1;</code>
   *
   * @return Whether the timestamp field is set.
   */
  @java.lang.Override
  public boolean hasTimestamp() {
    return ((bitField0_ & 0x00000001) != 0);
  }

  /**
   * <code>optional bytes timestamp = 1;</code>
   *
   * @return The timestamp.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getTimestamp() {
    return timestamp_;
  }

  public static final int PROPERTIES_FIELD_NUMBER = 2;
  private com.arijo.protobuf.ApbTxnProperties properties_;

  /**
   * <code>optional .ApbTxnProperties properties = 2;</code>
   *
   * @return Whether the properties field is set.
   */
  @java.lang.Override
  public boolean hasProperties() {
    return ((bitField0_ & 0x00000002) != 0);
  }

  /**
   * <code>optional .ApbTxnProperties properties = 2;</code>
   *
   * @return The properties.
   */
  @java.lang.Override
  public com.arijo.protobuf.ApbTxnProperties getProperties() {
    return properties_ == null ? com.arijo.protobuf.ApbTxnProperties.getDefaultInstance() : properties_;
  }

  /**
   * <code>optional .ApbTxnProperties properties = 2;</code>
   */
  @java.lang.Override
  public com.arijo.protobuf.ApbTxnPropertiesOrBuilder getPropertiesOrBuilder() {
    return properties_ == null ? com.arijo.protobuf.ApbTxnProperties.getDefaultInstance() : properties_;
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
      throws java.io.IOException {
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeBytes(1, timestamp_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeMessage(2, getProperties());
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
          .computeBytesSize(1, timestamp_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, getProperties());
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
    if (!(obj instanceof com.arijo.protobuf.ApbStartTransaction)) {
      return super.equals(obj);
    }
    com.arijo.protobuf.ApbStartTransaction other = (com.arijo.protobuf.ApbStartTransaction) obj;

    if (hasTimestamp() != other.hasTimestamp()) return false;
    if (hasTimestamp()) {
      if (!getTimestamp()
          .equals(other.getTimestamp())) return false;
    }
    if (hasProperties() != other.hasProperties()) return false;
    if (hasProperties()) {
      if (!getProperties()
          .equals(other.getProperties())) return false;
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
    if (hasTimestamp()) {
      hash = (37 * hash) + TIMESTAMP_FIELD_NUMBER;
      hash = (53 * hash) + getTimestamp().hashCode();
    }
    if (hasProperties()) {
      hash = (37 * hash) + PROPERTIES_FIELD_NUMBER;
      hash = (53 * hash) + getProperties().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.arijo.protobuf.ApbStartTransaction parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.arijo.protobuf.ApbStartTransaction parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.arijo.protobuf.ApbStartTransaction parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.arijo.protobuf.ApbStartTransaction parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.arijo.protobuf.ApbStartTransaction parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.arijo.protobuf.ApbStartTransaction parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.arijo.protobuf.ApbStartTransaction parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }

  public static com.arijo.protobuf.ApbStartTransaction parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.arijo.protobuf.ApbStartTransaction parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.arijo.protobuf.ApbStartTransaction parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.arijo.protobuf.ApbStartTransaction parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }

  public static com.arijo.protobuf.ApbStartTransaction parseFrom(
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

  public static Builder newBuilder(com.arijo.protobuf.ApbStartTransaction prototype) {
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
   * Start Transaction
   * </pre>
   * <p>
   * Protobuf type {@code ApbStartTransaction}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ApbStartTransaction)
      com.arijo.protobuf.ApbStartTransactionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
    getDescriptor() {
      return com.arijo.protobuf.AntidotePB.internal_static_ApbStartTransaction_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
    internalGetFieldAccessorTable() {
      return com.arijo.protobuf.AntidotePB.internal_static_ApbStartTransaction_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.arijo.protobuf.ApbStartTransaction.class, com.arijo.protobuf.ApbStartTransaction.Builder.class);
    }

    // Construct using com.arijo.protobuf.ApbStartTransaction.newBuilder()
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
        getPropertiesFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      timestamp_ = com.google.protobuf.ByteString.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      if (propertiesBuilder_ == null) {
        properties_ = null;
      } else {
        propertiesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
    getDescriptorForType() {
      return com.arijo.protobuf.AntidotePB.internal_static_ApbStartTransaction_descriptor;
    }

    @java.lang.Override
    public com.arijo.protobuf.ApbStartTransaction getDefaultInstanceForType() {
      return com.arijo.protobuf.ApbStartTransaction.getDefaultInstance();
    }

    @java.lang.Override
    public com.arijo.protobuf.ApbStartTransaction build() {
      com.arijo.protobuf.ApbStartTransaction result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.arijo.protobuf.ApbStartTransaction buildPartial() {
      com.arijo.protobuf.ApbStartTransaction result = new com.arijo.protobuf.ApbStartTransaction(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        to_bitField0_ |= 0x00000001;
      }
      result.timestamp_ = timestamp_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        if (propertiesBuilder_ == null) {
          result.properties_ = properties_;
        } else {
          result.properties_ = propertiesBuilder_.build();
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
      if (other instanceof com.arijo.protobuf.ApbStartTransaction) {
        return mergeFrom((com.arijo.protobuf.ApbStartTransaction) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.arijo.protobuf.ApbStartTransaction other) {
      if (other == com.arijo.protobuf.ApbStartTransaction.getDefaultInstance()) return this;
      if (other.hasTimestamp()) {
        setTimestamp(other.getTimestamp());
      }
      if (other.hasProperties()) {
        mergeProperties(other.getProperties());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.arijo.protobuf.ApbStartTransaction parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.arijo.protobuf.ApbStartTransaction) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private com.google.protobuf.ByteString timestamp_ = com.google.protobuf.ByteString.EMPTY;

    /**
     * <code>optional bytes timestamp = 1;</code>
     *
     * @return Whether the timestamp field is set.
     */
    @java.lang.Override
    public boolean hasTimestamp() {
      return ((bitField0_ & 0x00000001) != 0);
    }

    /**
     * <code>optional bytes timestamp = 1;</code>
     *
     * @return The timestamp.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getTimestamp() {
      return timestamp_;
    }

    /**
     * <code>optional bytes timestamp = 1;</code>
     *
     * @param value The timestamp to set.
     * @return This builder for chaining.
     */
    public Builder setTimestamp(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      timestamp_ = value;
      onChanged();
      return this;
    }

    /**
     * <code>optional bytes timestamp = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearTimestamp() {
      bitField0_ = (bitField0_ & ~0x00000001);
      timestamp_ = getDefaultInstance().getTimestamp();
      onChanged();
      return this;
    }

    private com.arijo.protobuf.ApbTxnProperties properties_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.arijo.protobuf.ApbTxnProperties, com.arijo.protobuf.ApbTxnProperties.Builder, com.arijo.protobuf.ApbTxnPropertiesOrBuilder> propertiesBuilder_;

    /**
     * <code>optional .ApbTxnProperties properties = 2;</code>
     *
     * @return Whether the properties field is set.
     */
    public boolean hasProperties() {
      return ((bitField0_ & 0x00000002) != 0);
    }

    /**
     * <code>optional .ApbTxnProperties properties = 2;</code>
     *
     * @return The properties.
     */
    public com.arijo.protobuf.ApbTxnProperties getProperties() {
      if (propertiesBuilder_ == null) {
        return properties_ == null ? com.arijo.protobuf.ApbTxnProperties.getDefaultInstance() : properties_;
      } else {
        return propertiesBuilder_.getMessage();
      }
    }

    /**
     * <code>optional .ApbTxnProperties properties = 2;</code>
     */
    public Builder setProperties(com.arijo.protobuf.ApbTxnProperties value) {
      if (propertiesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        properties_ = value;
        onChanged();
      } else {
        propertiesBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      return this;
    }

    /**
     * <code>optional .ApbTxnProperties properties = 2;</code>
     */
    public Builder setProperties(
        com.arijo.protobuf.ApbTxnProperties.Builder builderForValue) {
      if (propertiesBuilder_ == null) {
        properties_ = builderForValue.build();
        onChanged();
      } else {
        propertiesBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      return this;
    }

    /**
     * <code>optional .ApbTxnProperties properties = 2;</code>
     */
    public Builder mergeProperties(com.arijo.protobuf.ApbTxnProperties value) {
      if (propertiesBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
            properties_ != null &&
            properties_ != com.arijo.protobuf.ApbTxnProperties.getDefaultInstance()) {
          properties_ =
              com.arijo.protobuf.ApbTxnProperties.newBuilder(properties_).mergeFrom(value).buildPartial();
        } else {
          properties_ = value;
        }
        onChanged();
      } else {
        propertiesBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      return this;
    }

    /**
     * <code>optional .ApbTxnProperties properties = 2;</code>
     */
    public Builder clearProperties() {
      if (propertiesBuilder_ == null) {
        properties_ = null;
        onChanged();
      } else {
        propertiesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    /**
     * <code>optional .ApbTxnProperties properties = 2;</code>
     */
    public com.arijo.protobuf.ApbTxnProperties.Builder getPropertiesBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getPropertiesFieldBuilder().getBuilder();
    }

    /**
     * <code>optional .ApbTxnProperties properties = 2;</code>
     */
    public com.arijo.protobuf.ApbTxnPropertiesOrBuilder getPropertiesOrBuilder() {
      if (propertiesBuilder_ != null) {
        return propertiesBuilder_.getMessageOrBuilder();
      } else {
        return properties_ == null ?
            com.arijo.protobuf.ApbTxnProperties.getDefaultInstance() : properties_;
      }
    }

    /**
     * <code>optional .ApbTxnProperties properties = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.arijo.protobuf.ApbTxnProperties, com.arijo.protobuf.ApbTxnProperties.Builder, com.arijo.protobuf.ApbTxnPropertiesOrBuilder>
    getPropertiesFieldBuilder() {
      if (propertiesBuilder_ == null) {
        propertiesBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.arijo.protobuf.ApbTxnProperties, com.arijo.protobuf.ApbTxnProperties.Builder, com.arijo.protobuf.ApbTxnPropertiesOrBuilder>(
            getProperties(),
            getParentForChildren(),
            isClean());
        properties_ = null;
      }
      return propertiesBuilder_;
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


    // @@protoc_insertion_point(builder_scope:ApbStartTransaction)
  }

  // @@protoc_insertion_point(class_scope:ApbStartTransaction)
  private static final com.arijo.protobuf.ApbStartTransaction DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.arijo.protobuf.ApbStartTransaction();
  }

  public static com.arijo.protobuf.ApbStartTransaction getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated
  public static final com.google.protobuf.Parser<ApbStartTransaction>
      PARSER = new com.google.protobuf.AbstractParser<ApbStartTransaction>() {
    @java.lang.Override
    public ApbStartTransaction parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ApbStartTransaction(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ApbStartTransaction> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ApbStartTransaction> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.arijo.protobuf.ApbStartTransaction getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

