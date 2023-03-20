// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: antidote.proto

package com.arijo.protobuf;

/**
 * <pre>
 * Objects to be read
 * </pre>
 * <p>
 * Protobuf type {@code ApbReadObjects}
 */
public final class ApbReadObjects extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ApbReadObjects)
    ApbReadObjectsOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use ApbReadObjects.newBuilder() to construct.
  private ApbReadObjects(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ApbReadObjects() {
    boundobjects_ = java.util.Collections.emptyList();
    transactionDescriptor_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ApbReadObjects();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }

  private ApbReadObjects(
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
              boundobjects_ = new java.util.ArrayList<com.arijo.protobuf.ApbBoundObject>();
              mutable_bitField0_ |= 0x00000001;
            }
            boundobjects_.add(
                input.readMessage(com.arijo.protobuf.ApbBoundObject.PARSER, extensionRegistry));
            break;
          }
          case 18: {
            bitField0_ |= 0x00000001;
            transactionDescriptor_ = input.readBytes();
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
        boundobjects_ = java.util.Collections.unmodifiableList(boundobjects_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor
  getDescriptor() {
    return com.arijo.protobuf.AntidotePB.internal_static_ApbReadObjects_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
  internalGetFieldAccessorTable() {
    return com.arijo.protobuf.AntidotePB.internal_static_ApbReadObjects_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.arijo.protobuf.ApbReadObjects.class, com.arijo.protobuf.ApbReadObjects.Builder.class);
  }

  private int bitField0_;
  public static final int BOUNDOBJECTS_FIELD_NUMBER = 1;
  private java.util.List<com.arijo.protobuf.ApbBoundObject> boundobjects_;

  /**
   * <code>repeated .ApbBoundObject boundobjects = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.arijo.protobuf.ApbBoundObject> getBoundobjectsList() {
    return boundobjects_;
  }

  /**
   * <code>repeated .ApbBoundObject boundobjects = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.arijo.protobuf.ApbBoundObjectOrBuilder>
  getBoundobjectsOrBuilderList() {
    return boundobjects_;
  }

  /**
   * <code>repeated .ApbBoundObject boundobjects = 1;</code>
   */
  @java.lang.Override
  public int getBoundobjectsCount() {
    return boundobjects_.size();
  }

  /**
   * <code>repeated .ApbBoundObject boundobjects = 1;</code>
   */
  @java.lang.Override
  public com.arijo.protobuf.ApbBoundObject getBoundobjects(int index) {
    return boundobjects_.get(index);
  }

  /**
   * <code>repeated .ApbBoundObject boundobjects = 1;</code>
   */
  @java.lang.Override
  public com.arijo.protobuf.ApbBoundObjectOrBuilder getBoundobjectsOrBuilder(
      int index) {
    return boundobjects_.get(index);
  }

  public static final int TRANSACTION_DESCRIPTOR_FIELD_NUMBER = 2;
  private com.google.protobuf.ByteString transactionDescriptor_;

  /**
   * <code>required bytes transaction_descriptor = 2;</code>
   *
   * @return Whether the transactionDescriptor field is set.
   */
  @java.lang.Override
  public boolean hasTransactionDescriptor() {
    return ((bitField0_ & 0x00000001) != 0);
  }

  /**
   * <code>required bytes transaction_descriptor = 2;</code>
   *
   * @return The transactionDescriptor.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getTransactionDescriptor() {
    return transactionDescriptor_;
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    if (!hasTransactionDescriptor()) {
      memoizedIsInitialized = 0;
      return false;
    }
    for (int i = 0; i < getBoundobjectsCount(); i++) {
      if (!getBoundobjects(i).isInitialized()) {
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
    for (int i = 0; i < boundobjects_.size(); i++) {
      output.writeMessage(1, boundobjects_.get(i));
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeBytes(2, transactionDescriptor_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < boundobjects_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, boundobjects_.get(i));
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, transactionDescriptor_);
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
    if (!(obj instanceof com.arijo.protobuf.ApbReadObjects)) {
      return super.equals(obj);
    }
    com.arijo.protobuf.ApbReadObjects other = (com.arijo.protobuf.ApbReadObjects) obj;

    if (!getBoundobjectsList()
        .equals(other.getBoundobjectsList())) return false;
    if (hasTransactionDescriptor() != other.hasTransactionDescriptor()) return false;
    if (hasTransactionDescriptor()) {
      if (!getTransactionDescriptor()
          .equals(other.getTransactionDescriptor())) return false;
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
    if (getBoundobjectsCount() > 0) {
      hash = (37 * hash) + BOUNDOBJECTS_FIELD_NUMBER;
      hash = (53 * hash) + getBoundobjectsList().hashCode();
    }
    if (hasTransactionDescriptor()) {
      hash = (37 * hash) + TRANSACTION_DESCRIPTOR_FIELD_NUMBER;
      hash = (53 * hash) + getTransactionDescriptor().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.arijo.protobuf.ApbReadObjects parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.arijo.protobuf.ApbReadObjects parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.arijo.protobuf.ApbReadObjects parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.arijo.protobuf.ApbReadObjects parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.arijo.protobuf.ApbReadObjects parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.arijo.protobuf.ApbReadObjects parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.arijo.protobuf.ApbReadObjects parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }

  public static com.arijo.protobuf.ApbReadObjects parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.arijo.protobuf.ApbReadObjects parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.arijo.protobuf.ApbReadObjects parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.arijo.protobuf.ApbReadObjects parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }

  public static com.arijo.protobuf.ApbReadObjects parseFrom(
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

  public static Builder newBuilder(com.arijo.protobuf.ApbReadObjects prototype) {
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
   * Objects to be read
   * </pre>
   * <p>
   * Protobuf type {@code ApbReadObjects}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ApbReadObjects)
      com.arijo.protobuf.ApbReadObjectsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
    getDescriptor() {
      return com.arijo.protobuf.AntidotePB.internal_static_ApbReadObjects_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
    internalGetFieldAccessorTable() {
      return com.arijo.protobuf.AntidotePB.internal_static_ApbReadObjects_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.arijo.protobuf.ApbReadObjects.class, com.arijo.protobuf.ApbReadObjects.Builder.class);
    }

    // Construct using com.arijo.protobuf.ApbReadObjects.newBuilder()
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
        getBoundobjectsFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (boundobjectsBuilder_ == null) {
        boundobjects_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        boundobjectsBuilder_.clear();
      }
      transactionDescriptor_ = com.google.protobuf.ByteString.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
    getDescriptorForType() {
      return com.arijo.protobuf.AntidotePB.internal_static_ApbReadObjects_descriptor;
    }

    @java.lang.Override
    public com.arijo.protobuf.ApbReadObjects getDefaultInstanceForType() {
      return com.arijo.protobuf.ApbReadObjects.getDefaultInstance();
    }

    @java.lang.Override
    public com.arijo.protobuf.ApbReadObjects build() {
      com.arijo.protobuf.ApbReadObjects result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.arijo.protobuf.ApbReadObjects buildPartial() {
      com.arijo.protobuf.ApbReadObjects result = new com.arijo.protobuf.ApbReadObjects(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (boundobjectsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          boundobjects_ = java.util.Collections.unmodifiableList(boundobjects_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.boundobjects_ = boundobjects_;
      } else {
        result.boundobjects_ = boundobjectsBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        to_bitField0_ |= 0x00000001;
      }
      result.transactionDescriptor_ = transactionDescriptor_;
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
      if (other instanceof com.arijo.protobuf.ApbReadObjects) {
        return mergeFrom((com.arijo.protobuf.ApbReadObjects) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.arijo.protobuf.ApbReadObjects other) {
      if (other == com.arijo.protobuf.ApbReadObjects.getDefaultInstance()) return this;
      if (boundobjectsBuilder_ == null) {
        if (!other.boundobjects_.isEmpty()) {
          if (boundobjects_.isEmpty()) {
            boundobjects_ = other.boundobjects_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureBoundobjectsIsMutable();
            boundobjects_.addAll(other.boundobjects_);
          }
          onChanged();
        }
      } else {
        if (!other.boundobjects_.isEmpty()) {
          if (boundobjectsBuilder_.isEmpty()) {
            boundobjectsBuilder_.dispose();
            boundobjectsBuilder_ = null;
            boundobjects_ = other.boundobjects_;
            bitField0_ = (bitField0_ & ~0x00000001);
            boundobjectsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                    getBoundobjectsFieldBuilder() : null;
          } else {
            boundobjectsBuilder_.addAllMessages(other.boundobjects_);
          }
        }
      }
      if (other.hasTransactionDescriptor()) {
        setTransactionDescriptor(other.getTransactionDescriptor());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      if (!hasTransactionDescriptor()) {
        return false;
      }
      for (int i = 0; i < getBoundobjectsCount(); i++) {
        if (!getBoundobjects(i).isInitialized()) {
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
      com.arijo.protobuf.ApbReadObjects parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.arijo.protobuf.ApbReadObjects) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private java.util.List<com.arijo.protobuf.ApbBoundObject> boundobjects_ =
        java.util.Collections.emptyList();

    private void ensureBoundobjectsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        boundobjects_ = new java.util.ArrayList<com.arijo.protobuf.ApbBoundObject>(boundobjects_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.arijo.protobuf.ApbBoundObject, com.arijo.protobuf.ApbBoundObject.Builder, com.arijo.protobuf.ApbBoundObjectOrBuilder> boundobjectsBuilder_;

    /**
     * <code>repeated .ApbBoundObject boundobjects = 1;</code>
     */
    public java.util.List<com.arijo.protobuf.ApbBoundObject> getBoundobjectsList() {
      if (boundobjectsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(boundobjects_);
      } else {
        return boundobjectsBuilder_.getMessageList();
      }
    }

    /**
     * <code>repeated .ApbBoundObject boundobjects = 1;</code>
     */
    public int getBoundobjectsCount() {
      if (boundobjectsBuilder_ == null) {
        return boundobjects_.size();
      } else {
        return boundobjectsBuilder_.getCount();
      }
    }

    /**
     * <code>repeated .ApbBoundObject boundobjects = 1;</code>
     */
    public com.arijo.protobuf.ApbBoundObject getBoundobjects(int index) {
      if (boundobjectsBuilder_ == null) {
        return boundobjects_.get(index);
      } else {
        return boundobjectsBuilder_.getMessage(index);
      }
    }

    /**
     * <code>repeated .ApbBoundObject boundobjects = 1;</code>
     */
    public Builder setBoundobjects(
        int index, com.arijo.protobuf.ApbBoundObject value) {
      if (boundobjectsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureBoundobjectsIsMutable();
        boundobjects_.set(index, value);
        onChanged();
      } else {
        boundobjectsBuilder_.setMessage(index, value);
      }
      return this;
    }

    /**
     * <code>repeated .ApbBoundObject boundobjects = 1;</code>
     */
    public Builder setBoundobjects(
        int index, com.arijo.protobuf.ApbBoundObject.Builder builderForValue) {
      if (boundobjectsBuilder_ == null) {
        ensureBoundobjectsIsMutable();
        boundobjects_.set(index, builderForValue.build());
        onChanged();
      } else {
        boundobjectsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }

    /**
     * <code>repeated .ApbBoundObject boundobjects = 1;</code>
     */
    public Builder addBoundobjects(com.arijo.protobuf.ApbBoundObject value) {
      if (boundobjectsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureBoundobjectsIsMutable();
        boundobjects_.add(value);
        onChanged();
      } else {
        boundobjectsBuilder_.addMessage(value);
      }
      return this;
    }

    /**
     * <code>repeated .ApbBoundObject boundobjects = 1;</code>
     */
    public Builder addBoundobjects(
        int index, com.arijo.protobuf.ApbBoundObject value) {
      if (boundobjectsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureBoundobjectsIsMutable();
        boundobjects_.add(index, value);
        onChanged();
      } else {
        boundobjectsBuilder_.addMessage(index, value);
      }
      return this;
    }

    /**
     * <code>repeated .ApbBoundObject boundobjects = 1;</code>
     */
    public Builder addBoundobjects(
        com.arijo.protobuf.ApbBoundObject.Builder builderForValue) {
      if (boundobjectsBuilder_ == null) {
        ensureBoundobjectsIsMutable();
        boundobjects_.add(builderForValue.build());
        onChanged();
      } else {
        boundobjectsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }

    /**
     * <code>repeated .ApbBoundObject boundobjects = 1;</code>
     */
    public Builder addBoundobjects(
        int index, com.arijo.protobuf.ApbBoundObject.Builder builderForValue) {
      if (boundobjectsBuilder_ == null) {
        ensureBoundobjectsIsMutable();
        boundobjects_.add(index, builderForValue.build());
        onChanged();
      } else {
        boundobjectsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }

    /**
     * <code>repeated .ApbBoundObject boundobjects = 1;</code>
     */
    public Builder addAllBoundobjects(
        java.lang.Iterable<? extends com.arijo.protobuf.ApbBoundObject> values) {
      if (boundobjectsBuilder_ == null) {
        ensureBoundobjectsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, boundobjects_);
        onChanged();
      } else {
        boundobjectsBuilder_.addAllMessages(values);
      }
      return this;
    }

    /**
     * <code>repeated .ApbBoundObject boundobjects = 1;</code>
     */
    public Builder clearBoundobjects() {
      if (boundobjectsBuilder_ == null) {
        boundobjects_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        boundobjectsBuilder_.clear();
      }
      return this;
    }

    /**
     * <code>repeated .ApbBoundObject boundobjects = 1;</code>
     */
    public Builder removeBoundobjects(int index) {
      if (boundobjectsBuilder_ == null) {
        ensureBoundobjectsIsMutable();
        boundobjects_.remove(index);
        onChanged();
      } else {
        boundobjectsBuilder_.remove(index);
      }
      return this;
    }

    /**
     * <code>repeated .ApbBoundObject boundobjects = 1;</code>
     */
    public com.arijo.protobuf.ApbBoundObject.Builder getBoundobjectsBuilder(
        int index) {
      return getBoundobjectsFieldBuilder().getBuilder(index);
    }

    /**
     * <code>repeated .ApbBoundObject boundobjects = 1;</code>
     */
    public com.arijo.protobuf.ApbBoundObjectOrBuilder getBoundobjectsOrBuilder(
        int index) {
      if (boundobjectsBuilder_ == null) {
        return boundobjects_.get(index);
      } else {
        return boundobjectsBuilder_.getMessageOrBuilder(index);
      }
    }

    /**
     * <code>repeated .ApbBoundObject boundobjects = 1;</code>
     */
    public java.util.List<? extends com.arijo.protobuf.ApbBoundObjectOrBuilder>
    getBoundobjectsOrBuilderList() {
      if (boundobjectsBuilder_ != null) {
        return boundobjectsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(boundobjects_);
      }
    }

    /**
     * <code>repeated .ApbBoundObject boundobjects = 1;</code>
     */
    public com.arijo.protobuf.ApbBoundObject.Builder addBoundobjectsBuilder() {
      return getBoundobjectsFieldBuilder().addBuilder(
          com.arijo.protobuf.ApbBoundObject.getDefaultInstance());
    }

    /**
     * <code>repeated .ApbBoundObject boundobjects = 1;</code>
     */
    public com.arijo.protobuf.ApbBoundObject.Builder addBoundobjectsBuilder(
        int index) {
      return getBoundobjectsFieldBuilder().addBuilder(
          index, com.arijo.protobuf.ApbBoundObject.getDefaultInstance());
    }

    /**
     * <code>repeated .ApbBoundObject boundobjects = 1;</code>
     */
    public java.util.List<com.arijo.protobuf.ApbBoundObject.Builder>
    getBoundobjectsBuilderList() {
      return getBoundobjectsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.arijo.protobuf.ApbBoundObject, com.arijo.protobuf.ApbBoundObject.Builder, com.arijo.protobuf.ApbBoundObjectOrBuilder>
    getBoundobjectsFieldBuilder() {
      if (boundobjectsBuilder_ == null) {
        boundobjectsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.arijo.protobuf.ApbBoundObject, com.arijo.protobuf.ApbBoundObject.Builder, com.arijo.protobuf.ApbBoundObjectOrBuilder>(
            boundobjects_,
            ((bitField0_ & 0x00000001) != 0),
            getParentForChildren(),
            isClean());
        boundobjects_ = null;
      }
      return boundobjectsBuilder_;
    }

    private com.google.protobuf.ByteString transactionDescriptor_ = com.google.protobuf.ByteString.EMPTY;

    /**
     * <code>required bytes transaction_descriptor = 2;</code>
     *
     * @return Whether the transactionDescriptor field is set.
     */
    @java.lang.Override
    public boolean hasTransactionDescriptor() {
      return ((bitField0_ & 0x00000002) != 0);
    }

    /**
     * <code>required bytes transaction_descriptor = 2;</code>
     *
     * @return The transactionDescriptor.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getTransactionDescriptor() {
      return transactionDescriptor_;
    }

    /**
     * <code>required bytes transaction_descriptor = 2;</code>
     *
     * @param value The transactionDescriptor to set.
     * @return This builder for chaining.
     */
    public Builder setTransactionDescriptor(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      transactionDescriptor_ = value;
      onChanged();
      return this;
    }

    /**
     * <code>required bytes transaction_descriptor = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearTransactionDescriptor() {
      bitField0_ = (bitField0_ & ~0x00000002);
      transactionDescriptor_ = getDefaultInstance().getTransactionDescriptor();
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


    // @@protoc_insertion_point(builder_scope:ApbReadObjects)
  }

  // @@protoc_insertion_point(class_scope:ApbReadObjects)
  private static final com.arijo.protobuf.ApbReadObjects DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.arijo.protobuf.ApbReadObjects();
  }

  public static com.arijo.protobuf.ApbReadObjects getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated
  public static final com.google.protobuf.Parser<ApbReadObjects>
      PARSER = new com.google.protobuf.AbstractParser<ApbReadObjects>() {
    @java.lang.Override
    public ApbReadObjects parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ApbReadObjects(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ApbReadObjects> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ApbReadObjects> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.arijo.protobuf.ApbReadObjects getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
