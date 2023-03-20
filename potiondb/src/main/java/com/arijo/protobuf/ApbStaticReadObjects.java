// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: antidote.proto

package com.arijo.protobuf;

/**
 * Protobuf type {@code ApbStaticReadObjects}
 */
public final class ApbStaticReadObjects extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ApbStaticReadObjects)
    ApbStaticReadObjectsOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use ApbStaticReadObjects.newBuilder() to construct.
  private ApbStaticReadObjects(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ApbStaticReadObjects() {
    objects_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ApbStaticReadObjects();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }

  private ApbStaticReadObjects(
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
            com.arijo.protobuf.ApbStartTransaction.Builder subBuilder = null;
            if (((bitField0_ & 0x00000001) != 0)) {
              subBuilder = transaction_.toBuilder();
            }
            transaction_ = input.readMessage(com.arijo.protobuf.ApbStartTransaction.PARSER, extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(transaction_);
              transaction_ = subBuilder.buildPartial();
            }
            bitField0_ |= 0x00000001;
            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000002) != 0)) {
              objects_ = new java.util.ArrayList<com.arijo.protobuf.ApbBoundObject>();
              mutable_bitField0_ |= 0x00000002;
            }
            objects_.add(
                input.readMessage(com.arijo.protobuf.ApbBoundObject.PARSER, extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000002) != 0)) {
        objects_ = java.util.Collections.unmodifiableList(objects_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor
  getDescriptor() {
    return com.arijo.protobuf.AntidotePB.internal_static_ApbStaticReadObjects_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
  internalGetFieldAccessorTable() {
    return com.arijo.protobuf.AntidotePB.internal_static_ApbStaticReadObjects_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.arijo.protobuf.ApbStaticReadObjects.class, com.arijo.protobuf.ApbStaticReadObjects.Builder.class);
  }

  private int bitField0_;
  public static final int TRANSACTION_FIELD_NUMBER = 1;
  private com.arijo.protobuf.ApbStartTransaction transaction_;

  /**
   * <code>required .ApbStartTransaction transaction = 1;</code>
   *
   * @return Whether the transaction field is set.
   */
  @java.lang.Override
  public boolean hasTransaction() {
    return ((bitField0_ & 0x00000001) != 0);
  }

  /**
   * <code>required .ApbStartTransaction transaction = 1;</code>
   *
   * @return The transaction.
   */
  @java.lang.Override
  public com.arijo.protobuf.ApbStartTransaction getTransaction() {
    return transaction_ == null ? com.arijo.protobuf.ApbStartTransaction.getDefaultInstance() : transaction_;
  }

  /**
   * <code>required .ApbStartTransaction transaction = 1;</code>
   */
  @java.lang.Override
  public com.arijo.protobuf.ApbStartTransactionOrBuilder getTransactionOrBuilder() {
    return transaction_ == null ? com.arijo.protobuf.ApbStartTransaction.getDefaultInstance() : transaction_;
  }

  public static final int OBJECTS_FIELD_NUMBER = 2;
  private java.util.List<com.arijo.protobuf.ApbBoundObject> objects_;

  /**
   * <code>repeated .ApbBoundObject objects = 2;</code>
   */
  @java.lang.Override
  public java.util.List<com.arijo.protobuf.ApbBoundObject> getObjectsList() {
    return objects_;
  }

  /**
   * <code>repeated .ApbBoundObject objects = 2;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.arijo.protobuf.ApbBoundObjectOrBuilder>
  getObjectsOrBuilderList() {
    return objects_;
  }

  /**
   * <code>repeated .ApbBoundObject objects = 2;</code>
   */
  @java.lang.Override
  public int getObjectsCount() {
    return objects_.size();
  }

  /**
   * <code>repeated .ApbBoundObject objects = 2;</code>
   */
  @java.lang.Override
  public com.arijo.protobuf.ApbBoundObject getObjects(int index) {
    return objects_.get(index);
  }

  /**
   * <code>repeated .ApbBoundObject objects = 2;</code>
   */
  @java.lang.Override
  public com.arijo.protobuf.ApbBoundObjectOrBuilder getObjectsOrBuilder(
      int index) {
    return objects_.get(index);
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    if (!hasTransaction()) {
      memoizedIsInitialized = 0;
      return false;
    }
    for (int i = 0; i < getObjectsCount(); i++) {
      if (!getObjects(i).isInitialized()) {
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(1, getTransaction());
    }
    for (int i = 0; i < objects_.size(); i++) {
      output.writeMessage(2, objects_.get(i));
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
          .computeMessageSize(1, getTransaction());
    }
    for (int i = 0; i < objects_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, objects_.get(i));
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
    if (!(obj instanceof com.arijo.protobuf.ApbStaticReadObjects)) {
      return super.equals(obj);
    }
    com.arijo.protobuf.ApbStaticReadObjects other = (com.arijo.protobuf.ApbStaticReadObjects) obj;

    if (hasTransaction() != other.hasTransaction()) return false;
    if (hasTransaction()) {
      if (!getTransaction()
          .equals(other.getTransaction())) return false;
    }
    if (!getObjectsList()
        .equals(other.getObjectsList())) return false;
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
    if (hasTransaction()) {
      hash = (37 * hash) + TRANSACTION_FIELD_NUMBER;
      hash = (53 * hash) + getTransaction().hashCode();
    }
    if (getObjectsCount() > 0) {
      hash = (37 * hash) + OBJECTS_FIELD_NUMBER;
      hash = (53 * hash) + getObjectsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.arijo.protobuf.ApbStaticReadObjects parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.arijo.protobuf.ApbStaticReadObjects parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.arijo.protobuf.ApbStaticReadObjects parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.arijo.protobuf.ApbStaticReadObjects parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.arijo.protobuf.ApbStaticReadObjects parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.arijo.protobuf.ApbStaticReadObjects parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.arijo.protobuf.ApbStaticReadObjects parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }

  public static com.arijo.protobuf.ApbStaticReadObjects parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.arijo.protobuf.ApbStaticReadObjects parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.arijo.protobuf.ApbStaticReadObjects parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.arijo.protobuf.ApbStaticReadObjects parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }

  public static com.arijo.protobuf.ApbStaticReadObjects parseFrom(
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

  public static Builder newBuilder(com.arijo.protobuf.ApbStaticReadObjects prototype) {
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
   * Protobuf type {@code ApbStaticReadObjects}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ApbStaticReadObjects)
      com.arijo.protobuf.ApbStaticReadObjectsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
    getDescriptor() {
      return com.arijo.protobuf.AntidotePB.internal_static_ApbStaticReadObjects_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
    internalGetFieldAccessorTable() {
      return com.arijo.protobuf.AntidotePB.internal_static_ApbStaticReadObjects_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.arijo.protobuf.ApbStaticReadObjects.class, com.arijo.protobuf.ApbStaticReadObjects.Builder.class);
    }

    // Construct using com.arijo.protobuf.ApbStaticReadObjects.newBuilder()
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
        getTransactionFieldBuilder();
        getObjectsFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (transactionBuilder_ == null) {
        transaction_ = null;
      } else {
        transactionBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      if (objectsBuilder_ == null) {
        objects_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
      } else {
        objectsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
    getDescriptorForType() {
      return com.arijo.protobuf.AntidotePB.internal_static_ApbStaticReadObjects_descriptor;
    }

    @java.lang.Override
    public com.arijo.protobuf.ApbStaticReadObjects getDefaultInstanceForType() {
      return com.arijo.protobuf.ApbStaticReadObjects.getDefaultInstance();
    }

    @java.lang.Override
    public com.arijo.protobuf.ApbStaticReadObjects build() {
      com.arijo.protobuf.ApbStaticReadObjects result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.arijo.protobuf.ApbStaticReadObjects buildPartial() {
      com.arijo.protobuf.ApbStaticReadObjects result = new com.arijo.protobuf.ApbStaticReadObjects(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        if (transactionBuilder_ == null) {
          result.transaction_ = transaction_;
        } else {
          result.transaction_ = transactionBuilder_.build();
        }
        to_bitField0_ |= 0x00000001;
      }
      if (objectsBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          objects_ = java.util.Collections.unmodifiableList(objects_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.objects_ = objects_;
      } else {
        result.objects_ = objectsBuilder_.build();
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
      if (other instanceof com.arijo.protobuf.ApbStaticReadObjects) {
        return mergeFrom((com.arijo.protobuf.ApbStaticReadObjects) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.arijo.protobuf.ApbStaticReadObjects other) {
      if (other == com.arijo.protobuf.ApbStaticReadObjects.getDefaultInstance()) return this;
      if (other.hasTransaction()) {
        mergeTransaction(other.getTransaction());
      }
      if (objectsBuilder_ == null) {
        if (!other.objects_.isEmpty()) {
          if (objects_.isEmpty()) {
            objects_ = other.objects_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureObjectsIsMutable();
            objects_.addAll(other.objects_);
          }
          onChanged();
        }
      } else {
        if (!other.objects_.isEmpty()) {
          if (objectsBuilder_.isEmpty()) {
            objectsBuilder_.dispose();
            objectsBuilder_ = null;
            objects_ = other.objects_;
            bitField0_ = (bitField0_ & ~0x00000002);
            objectsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                    getObjectsFieldBuilder() : null;
          } else {
            objectsBuilder_.addAllMessages(other.objects_);
          }
        }
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      if (!hasTransaction()) {
        return false;
      }
      for (int i = 0; i < getObjectsCount(); i++) {
        if (!getObjects(i).isInitialized()) {
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
      com.arijo.protobuf.ApbStaticReadObjects parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.arijo.protobuf.ApbStaticReadObjects) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private com.arijo.protobuf.ApbStartTransaction transaction_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.arijo.protobuf.ApbStartTransaction, com.arijo.protobuf.ApbStartTransaction.Builder, com.arijo.protobuf.ApbStartTransactionOrBuilder> transactionBuilder_;

    /**
     * <code>required .ApbStartTransaction transaction = 1;</code>
     *
     * @return Whether the transaction field is set.
     */
    public boolean hasTransaction() {
      return ((bitField0_ & 0x00000001) != 0);
    }

    /**
     * <code>required .ApbStartTransaction transaction = 1;</code>
     *
     * @return The transaction.
     */
    public com.arijo.protobuf.ApbStartTransaction getTransaction() {
      if (transactionBuilder_ == null) {
        return transaction_ == null ? com.arijo.protobuf.ApbStartTransaction.getDefaultInstance() : transaction_;
      } else {
        return transactionBuilder_.getMessage();
      }
    }

    /**
     * <code>required .ApbStartTransaction transaction = 1;</code>
     */
    public Builder setTransaction(com.arijo.protobuf.ApbStartTransaction value) {
      if (transactionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        transaction_ = value;
        onChanged();
      } else {
        transactionBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      return this;
    }

    /**
     * <code>required .ApbStartTransaction transaction = 1;</code>
     */
    public Builder setTransaction(
        com.arijo.protobuf.ApbStartTransaction.Builder builderForValue) {
      if (transactionBuilder_ == null) {
        transaction_ = builderForValue.build();
        onChanged();
      } else {
        transactionBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      return this;
    }

    /**
     * <code>required .ApbStartTransaction transaction = 1;</code>
     */
    public Builder mergeTransaction(com.arijo.protobuf.ApbStartTransaction value) {
      if (transactionBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
            transaction_ != null &&
            transaction_ != com.arijo.protobuf.ApbStartTransaction.getDefaultInstance()) {
          transaction_ =
              com.arijo.protobuf.ApbStartTransaction.newBuilder(transaction_).mergeFrom(value).buildPartial();
        } else {
          transaction_ = value;
        }
        onChanged();
      } else {
        transactionBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      return this;
    }

    /**
     * <code>required .ApbStartTransaction transaction = 1;</code>
     */
    public Builder clearTransaction() {
      if (transactionBuilder_ == null) {
        transaction_ = null;
        onChanged();
      } else {
        transactionBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    /**
     * <code>required .ApbStartTransaction transaction = 1;</code>
     */
    public com.arijo.protobuf.ApbStartTransaction.Builder getTransactionBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getTransactionFieldBuilder().getBuilder();
    }

    /**
     * <code>required .ApbStartTransaction transaction = 1;</code>
     */
    public com.arijo.protobuf.ApbStartTransactionOrBuilder getTransactionOrBuilder() {
      if (transactionBuilder_ != null) {
        return transactionBuilder_.getMessageOrBuilder();
      } else {
        return transaction_ == null ?
            com.arijo.protobuf.ApbStartTransaction.getDefaultInstance() : transaction_;
      }
    }

    /**
     * <code>required .ApbStartTransaction transaction = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.arijo.protobuf.ApbStartTransaction, com.arijo.protobuf.ApbStartTransaction.Builder, com.arijo.protobuf.ApbStartTransactionOrBuilder>
    getTransactionFieldBuilder() {
      if (transactionBuilder_ == null) {
        transactionBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.arijo.protobuf.ApbStartTransaction, com.arijo.protobuf.ApbStartTransaction.Builder, com.arijo.protobuf.ApbStartTransactionOrBuilder>(
            getTransaction(),
            getParentForChildren(),
            isClean());
        transaction_ = null;
      }
      return transactionBuilder_;
    }

    private java.util.List<com.arijo.protobuf.ApbBoundObject> objects_ =
        java.util.Collections.emptyList();

    private void ensureObjectsIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        objects_ = new java.util.ArrayList<com.arijo.protobuf.ApbBoundObject>(objects_);
        bitField0_ |= 0x00000002;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.arijo.protobuf.ApbBoundObject, com.arijo.protobuf.ApbBoundObject.Builder, com.arijo.protobuf.ApbBoundObjectOrBuilder> objectsBuilder_;

    /**
     * <code>repeated .ApbBoundObject objects = 2;</code>
     */
    public java.util.List<com.arijo.protobuf.ApbBoundObject> getObjectsList() {
      if (objectsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(objects_);
      } else {
        return objectsBuilder_.getMessageList();
      }
    }

    /**
     * <code>repeated .ApbBoundObject objects = 2;</code>
     */
    public int getObjectsCount() {
      if (objectsBuilder_ == null) {
        return objects_.size();
      } else {
        return objectsBuilder_.getCount();
      }
    }

    /**
     * <code>repeated .ApbBoundObject objects = 2;</code>
     */
    public com.arijo.protobuf.ApbBoundObject getObjects(int index) {
      if (objectsBuilder_ == null) {
        return objects_.get(index);
      } else {
        return objectsBuilder_.getMessage(index);
      }
    }

    /**
     * <code>repeated .ApbBoundObject objects = 2;</code>
     */
    public Builder setObjects(
        int index, com.arijo.protobuf.ApbBoundObject value) {
      if (objectsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureObjectsIsMutable();
        objects_.set(index, value);
        onChanged();
      } else {
        objectsBuilder_.setMessage(index, value);
      }
      return this;
    }

    /**
     * <code>repeated .ApbBoundObject objects = 2;</code>
     */
    public Builder setObjects(
        int index, com.arijo.protobuf.ApbBoundObject.Builder builderForValue) {
      if (objectsBuilder_ == null) {
        ensureObjectsIsMutable();
        objects_.set(index, builderForValue.build());
        onChanged();
      } else {
        objectsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }

    /**
     * <code>repeated .ApbBoundObject objects = 2;</code>
     */
    public Builder addObjects(com.arijo.protobuf.ApbBoundObject value) {
      if (objectsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureObjectsIsMutable();
        objects_.add(value);
        onChanged();
      } else {
        objectsBuilder_.addMessage(value);
      }
      return this;
    }

    /**
     * <code>repeated .ApbBoundObject objects = 2;</code>
     */
    public Builder addObjects(
        int index, com.arijo.protobuf.ApbBoundObject value) {
      if (objectsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureObjectsIsMutable();
        objects_.add(index, value);
        onChanged();
      } else {
        objectsBuilder_.addMessage(index, value);
      }
      return this;
    }

    /**
     * <code>repeated .ApbBoundObject objects = 2;</code>
     */
    public Builder addObjects(
        com.arijo.protobuf.ApbBoundObject.Builder builderForValue) {
      if (objectsBuilder_ == null) {
        ensureObjectsIsMutable();
        objects_.add(builderForValue.build());
        onChanged();
      } else {
        objectsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }

    /**
     * <code>repeated .ApbBoundObject objects = 2;</code>
     */
    public Builder addObjects(
        int index, com.arijo.protobuf.ApbBoundObject.Builder builderForValue) {
      if (objectsBuilder_ == null) {
        ensureObjectsIsMutable();
        objects_.add(index, builderForValue.build());
        onChanged();
      } else {
        objectsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }

    /**
     * <code>repeated .ApbBoundObject objects = 2;</code>
     */
    public Builder addAllObjects(
        java.lang.Iterable<? extends com.arijo.protobuf.ApbBoundObject> values) {
      if (objectsBuilder_ == null) {
        ensureObjectsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, objects_);
        onChanged();
      } else {
        objectsBuilder_.addAllMessages(values);
      }
      return this;
    }

    /**
     * <code>repeated .ApbBoundObject objects = 2;</code>
     */
    public Builder clearObjects() {
      if (objectsBuilder_ == null) {
        objects_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        objectsBuilder_.clear();
      }
      return this;
    }

    /**
     * <code>repeated .ApbBoundObject objects = 2;</code>
     */
    public Builder removeObjects(int index) {
      if (objectsBuilder_ == null) {
        ensureObjectsIsMutable();
        objects_.remove(index);
        onChanged();
      } else {
        objectsBuilder_.remove(index);
      }
      return this;
    }

    /**
     * <code>repeated .ApbBoundObject objects = 2;</code>
     */
    public com.arijo.protobuf.ApbBoundObject.Builder getObjectsBuilder(
        int index) {
      return getObjectsFieldBuilder().getBuilder(index);
    }

    /**
     * <code>repeated .ApbBoundObject objects = 2;</code>
     */
    public com.arijo.protobuf.ApbBoundObjectOrBuilder getObjectsOrBuilder(
        int index) {
      if (objectsBuilder_ == null) {
        return objects_.get(index);
      } else {
        return objectsBuilder_.getMessageOrBuilder(index);
      }
    }

    /**
     * <code>repeated .ApbBoundObject objects = 2;</code>
     */
    public java.util.List<? extends com.arijo.protobuf.ApbBoundObjectOrBuilder>
    getObjectsOrBuilderList() {
      if (objectsBuilder_ != null) {
        return objectsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(objects_);
      }
    }

    /**
     * <code>repeated .ApbBoundObject objects = 2;</code>
     */
    public com.arijo.protobuf.ApbBoundObject.Builder addObjectsBuilder() {
      return getObjectsFieldBuilder().addBuilder(
          com.arijo.protobuf.ApbBoundObject.getDefaultInstance());
    }

    /**
     * <code>repeated .ApbBoundObject objects = 2;</code>
     */
    public com.arijo.protobuf.ApbBoundObject.Builder addObjectsBuilder(
        int index) {
      return getObjectsFieldBuilder().addBuilder(
          index, com.arijo.protobuf.ApbBoundObject.getDefaultInstance());
    }

    /**
     * <code>repeated .ApbBoundObject objects = 2;</code>
     */
    public java.util.List<com.arijo.protobuf.ApbBoundObject.Builder>
    getObjectsBuilderList() {
      return getObjectsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.arijo.protobuf.ApbBoundObject, com.arijo.protobuf.ApbBoundObject.Builder, com.arijo.protobuf.ApbBoundObjectOrBuilder>
    getObjectsFieldBuilder() {
      if (objectsBuilder_ == null) {
        objectsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.arijo.protobuf.ApbBoundObject, com.arijo.protobuf.ApbBoundObject.Builder, com.arijo.protobuf.ApbBoundObjectOrBuilder>(
            objects_,
            ((bitField0_ & 0x00000002) != 0),
            getParentForChildren(),
            isClean());
        objects_ = null;
      }
      return objectsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:ApbStaticReadObjects)
  }

  // @@protoc_insertion_point(class_scope:ApbStaticReadObjects)
  private static final com.arijo.protobuf.ApbStaticReadObjects DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.arijo.protobuf.ApbStaticReadObjects();
  }

  public static com.arijo.protobuf.ApbStaticReadObjects getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated
  public static final com.google.protobuf.Parser<ApbStaticReadObjects>
      PARSER = new com.google.protobuf.AbstractParser<ApbStaticReadObjects>() {
    @java.lang.Override
    public ApbStaticReadObjects parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ApbStaticReadObjects(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ApbStaticReadObjects> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ApbStaticReadObjects> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.arijo.protobuf.ApbStaticReadObjects getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
