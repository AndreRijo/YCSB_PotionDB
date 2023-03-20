// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: antidote.proto

package com.arijo.protobuf;

/**
 * Protobuf type {@code ApbStaticUpdateObjects}
 */
public final class ApbStaticUpdateObjects extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ApbStaticUpdateObjects)
    ApbStaticUpdateObjectsOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use ApbStaticUpdateObjects.newBuilder() to construct.
  private ApbStaticUpdateObjects(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ApbStaticUpdateObjects() {
    updates_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ApbStaticUpdateObjects();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }

  private ApbStaticUpdateObjects(
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
              updates_ = new java.util.ArrayList<com.arijo.protobuf.ApbUpdateOp>();
              mutable_bitField0_ |= 0x00000002;
            }
            updates_.add(
                input.readMessage(com.arijo.protobuf.ApbUpdateOp.PARSER, extensionRegistry));
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
        updates_ = java.util.Collections.unmodifiableList(updates_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor
  getDescriptor() {
    return com.arijo.protobuf.AntidotePB.internal_static_ApbStaticUpdateObjects_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
  internalGetFieldAccessorTable() {
    return com.arijo.protobuf.AntidotePB.internal_static_ApbStaticUpdateObjects_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.arijo.protobuf.ApbStaticUpdateObjects.class, com.arijo.protobuf.ApbStaticUpdateObjects.Builder.class);
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

  public static final int UPDATES_FIELD_NUMBER = 2;
  private java.util.List<com.arijo.protobuf.ApbUpdateOp> updates_;

  /**
   * <code>repeated .ApbUpdateOp updates = 2;</code>
   */
  @java.lang.Override
  public java.util.List<com.arijo.protobuf.ApbUpdateOp> getUpdatesList() {
    return updates_;
  }

  /**
   * <code>repeated .ApbUpdateOp updates = 2;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.arijo.protobuf.ApbUpdateOpOrBuilder>
  getUpdatesOrBuilderList() {
    return updates_;
  }

  /**
   * <code>repeated .ApbUpdateOp updates = 2;</code>
   */
  @java.lang.Override
  public int getUpdatesCount() {
    return updates_.size();
  }

  /**
   * <code>repeated .ApbUpdateOp updates = 2;</code>
   */
  @java.lang.Override
  public com.arijo.protobuf.ApbUpdateOp getUpdates(int index) {
    return updates_.get(index);
  }

  /**
   * <code>repeated .ApbUpdateOp updates = 2;</code>
   */
  @java.lang.Override
  public com.arijo.protobuf.ApbUpdateOpOrBuilder getUpdatesOrBuilder(
      int index) {
    return updates_.get(index);
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
    for (int i = 0; i < getUpdatesCount(); i++) {
      if (!getUpdates(i).isInitialized()) {
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
    for (int i = 0; i < updates_.size(); i++) {
      output.writeMessage(2, updates_.get(i));
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
    for (int i = 0; i < updates_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, updates_.get(i));
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
    if (!(obj instanceof com.arijo.protobuf.ApbStaticUpdateObjects)) {
      return super.equals(obj);
    }
    com.arijo.protobuf.ApbStaticUpdateObjects other = (com.arijo.protobuf.ApbStaticUpdateObjects) obj;

    if (hasTransaction() != other.hasTransaction()) return false;
    if (hasTransaction()) {
      if (!getTransaction()
          .equals(other.getTransaction())) return false;
    }
    if (!getUpdatesList()
        .equals(other.getUpdatesList())) return false;
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
    if (getUpdatesCount() > 0) {
      hash = (37 * hash) + UPDATES_FIELD_NUMBER;
      hash = (53 * hash) + getUpdatesList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.arijo.protobuf.ApbStaticUpdateObjects parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.arijo.protobuf.ApbStaticUpdateObjects parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.arijo.protobuf.ApbStaticUpdateObjects parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.arijo.protobuf.ApbStaticUpdateObjects parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.arijo.protobuf.ApbStaticUpdateObjects parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.arijo.protobuf.ApbStaticUpdateObjects parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.arijo.protobuf.ApbStaticUpdateObjects parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }

  public static com.arijo.protobuf.ApbStaticUpdateObjects parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.arijo.protobuf.ApbStaticUpdateObjects parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.arijo.protobuf.ApbStaticUpdateObjects parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.arijo.protobuf.ApbStaticUpdateObjects parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }

  public static com.arijo.protobuf.ApbStaticUpdateObjects parseFrom(
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

  public static Builder newBuilder(com.arijo.protobuf.ApbStaticUpdateObjects prototype) {
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
   * Protobuf type {@code ApbStaticUpdateObjects}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ApbStaticUpdateObjects)
      com.arijo.protobuf.ApbStaticUpdateObjectsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
    getDescriptor() {
      return com.arijo.protobuf.AntidotePB.internal_static_ApbStaticUpdateObjects_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
    internalGetFieldAccessorTable() {
      return com.arijo.protobuf.AntidotePB.internal_static_ApbStaticUpdateObjects_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.arijo.protobuf.ApbStaticUpdateObjects.class, com.arijo.protobuf.ApbStaticUpdateObjects.Builder.class);
    }

    // Construct using com.arijo.protobuf.ApbStaticUpdateObjects.newBuilder()
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
        getUpdatesFieldBuilder();
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
      if (updatesBuilder_ == null) {
        updates_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
      } else {
        updatesBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
    getDescriptorForType() {
      return com.arijo.protobuf.AntidotePB.internal_static_ApbStaticUpdateObjects_descriptor;
    }

    @java.lang.Override
    public com.arijo.protobuf.ApbStaticUpdateObjects getDefaultInstanceForType() {
      return com.arijo.protobuf.ApbStaticUpdateObjects.getDefaultInstance();
    }

    @java.lang.Override
    public com.arijo.protobuf.ApbStaticUpdateObjects build() {
      com.arijo.protobuf.ApbStaticUpdateObjects result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.arijo.protobuf.ApbStaticUpdateObjects buildPartial() {
      com.arijo.protobuf.ApbStaticUpdateObjects result = new com.arijo.protobuf.ApbStaticUpdateObjects(this);
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
      if (updatesBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          updates_ = java.util.Collections.unmodifiableList(updates_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.updates_ = updates_;
      } else {
        result.updates_ = updatesBuilder_.build();
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
      if (other instanceof com.arijo.protobuf.ApbStaticUpdateObjects) {
        return mergeFrom((com.arijo.protobuf.ApbStaticUpdateObjects) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.arijo.protobuf.ApbStaticUpdateObjects other) {
      if (other == com.arijo.protobuf.ApbStaticUpdateObjects.getDefaultInstance()) return this;
      if (other.hasTransaction()) {
        mergeTransaction(other.getTransaction());
      }
      if (updatesBuilder_ == null) {
        if (!other.updates_.isEmpty()) {
          if (updates_.isEmpty()) {
            updates_ = other.updates_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureUpdatesIsMutable();
            updates_.addAll(other.updates_);
          }
          onChanged();
        }
      } else {
        if (!other.updates_.isEmpty()) {
          if (updatesBuilder_.isEmpty()) {
            updatesBuilder_.dispose();
            updatesBuilder_ = null;
            updates_ = other.updates_;
            bitField0_ = (bitField0_ & ~0x00000002);
            updatesBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                    getUpdatesFieldBuilder() : null;
          } else {
            updatesBuilder_.addAllMessages(other.updates_);
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
      for (int i = 0; i < getUpdatesCount(); i++) {
        if (!getUpdates(i).isInitialized()) {
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
      com.arijo.protobuf.ApbStaticUpdateObjects parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.arijo.protobuf.ApbStaticUpdateObjects) e.getUnfinishedMessage();
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

    private java.util.List<com.arijo.protobuf.ApbUpdateOp> updates_ =
        java.util.Collections.emptyList();

    private void ensureUpdatesIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        updates_ = new java.util.ArrayList<com.arijo.protobuf.ApbUpdateOp>(updates_);
        bitField0_ |= 0x00000002;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.arijo.protobuf.ApbUpdateOp, com.arijo.protobuf.ApbUpdateOp.Builder, com.arijo.protobuf.ApbUpdateOpOrBuilder> updatesBuilder_;

    /**
     * <code>repeated .ApbUpdateOp updates = 2;</code>
     */
    public java.util.List<com.arijo.protobuf.ApbUpdateOp> getUpdatesList() {
      if (updatesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(updates_);
      } else {
        return updatesBuilder_.getMessageList();
      }
    }

    /**
     * <code>repeated .ApbUpdateOp updates = 2;</code>
     */
    public int getUpdatesCount() {
      if (updatesBuilder_ == null) {
        return updates_.size();
      } else {
        return updatesBuilder_.getCount();
      }
    }

    /**
     * <code>repeated .ApbUpdateOp updates = 2;</code>
     */
    public com.arijo.protobuf.ApbUpdateOp getUpdates(int index) {
      if (updatesBuilder_ == null) {
        return updates_.get(index);
      } else {
        return updatesBuilder_.getMessage(index);
      }
    }

    /**
     * <code>repeated .ApbUpdateOp updates = 2;</code>
     */
    public Builder setUpdates(
        int index, com.arijo.protobuf.ApbUpdateOp value) {
      if (updatesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureUpdatesIsMutable();
        updates_.set(index, value);
        onChanged();
      } else {
        updatesBuilder_.setMessage(index, value);
      }
      return this;
    }

    /**
     * <code>repeated .ApbUpdateOp updates = 2;</code>
     */
    public Builder setUpdates(
        int index, com.arijo.protobuf.ApbUpdateOp.Builder builderForValue) {
      if (updatesBuilder_ == null) {
        ensureUpdatesIsMutable();
        updates_.set(index, builderForValue.build());
        onChanged();
      } else {
        updatesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }

    /**
     * <code>repeated .ApbUpdateOp updates = 2;</code>
     */
    public Builder addUpdates(com.arijo.protobuf.ApbUpdateOp value) {
      if (updatesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureUpdatesIsMutable();
        updates_.add(value);
        onChanged();
      } else {
        updatesBuilder_.addMessage(value);
      }
      return this;
    }

    /**
     * <code>repeated .ApbUpdateOp updates = 2;</code>
     */
    public Builder addUpdates(
        int index, com.arijo.protobuf.ApbUpdateOp value) {
      if (updatesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureUpdatesIsMutable();
        updates_.add(index, value);
        onChanged();
      } else {
        updatesBuilder_.addMessage(index, value);
      }
      return this;
    }

    /**
     * <code>repeated .ApbUpdateOp updates = 2;</code>
     */
    public Builder addUpdates(
        com.arijo.protobuf.ApbUpdateOp.Builder builderForValue) {
      if (updatesBuilder_ == null) {
        ensureUpdatesIsMutable();
        updates_.add(builderForValue.build());
        onChanged();
      } else {
        updatesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }

    /**
     * <code>repeated .ApbUpdateOp updates = 2;</code>
     */
    public Builder addUpdates(
        int index, com.arijo.protobuf.ApbUpdateOp.Builder builderForValue) {
      if (updatesBuilder_ == null) {
        ensureUpdatesIsMutable();
        updates_.add(index, builderForValue.build());
        onChanged();
      } else {
        updatesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }

    /**
     * <code>repeated .ApbUpdateOp updates = 2;</code>
     */
    public Builder addAllUpdates(
        java.lang.Iterable<? extends com.arijo.protobuf.ApbUpdateOp> values) {
      if (updatesBuilder_ == null) {
        ensureUpdatesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, updates_);
        onChanged();
      } else {
        updatesBuilder_.addAllMessages(values);
      }
      return this;
    }

    /**
     * <code>repeated .ApbUpdateOp updates = 2;</code>
     */
    public Builder clearUpdates() {
      if (updatesBuilder_ == null) {
        updates_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        updatesBuilder_.clear();
      }
      return this;
    }

    /**
     * <code>repeated .ApbUpdateOp updates = 2;</code>
     */
    public Builder removeUpdates(int index) {
      if (updatesBuilder_ == null) {
        ensureUpdatesIsMutable();
        updates_.remove(index);
        onChanged();
      } else {
        updatesBuilder_.remove(index);
      }
      return this;
    }

    /**
     * <code>repeated .ApbUpdateOp updates = 2;</code>
     */
    public com.arijo.protobuf.ApbUpdateOp.Builder getUpdatesBuilder(
        int index) {
      return getUpdatesFieldBuilder().getBuilder(index);
    }

    /**
     * <code>repeated .ApbUpdateOp updates = 2;</code>
     */
    public com.arijo.protobuf.ApbUpdateOpOrBuilder getUpdatesOrBuilder(
        int index) {
      if (updatesBuilder_ == null) {
        return updates_.get(index);
      } else {
        return updatesBuilder_.getMessageOrBuilder(index);
      }
    }

    /**
     * <code>repeated .ApbUpdateOp updates = 2;</code>
     */
    public java.util.List<? extends com.arijo.protobuf.ApbUpdateOpOrBuilder>
    getUpdatesOrBuilderList() {
      if (updatesBuilder_ != null) {
        return updatesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(updates_);
      }
    }

    /**
     * <code>repeated .ApbUpdateOp updates = 2;</code>
     */
    public com.arijo.protobuf.ApbUpdateOp.Builder addUpdatesBuilder() {
      return getUpdatesFieldBuilder().addBuilder(
          com.arijo.protobuf.ApbUpdateOp.getDefaultInstance());
    }

    /**
     * <code>repeated .ApbUpdateOp updates = 2;</code>
     */
    public com.arijo.protobuf.ApbUpdateOp.Builder addUpdatesBuilder(
        int index) {
      return getUpdatesFieldBuilder().addBuilder(
          index, com.arijo.protobuf.ApbUpdateOp.getDefaultInstance());
    }

    /**
     * <code>repeated .ApbUpdateOp updates = 2;</code>
     */
    public java.util.List<com.arijo.protobuf.ApbUpdateOp.Builder>
    getUpdatesBuilderList() {
      return getUpdatesFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.arijo.protobuf.ApbUpdateOp, com.arijo.protobuf.ApbUpdateOp.Builder, com.arijo.protobuf.ApbUpdateOpOrBuilder>
    getUpdatesFieldBuilder() {
      if (updatesBuilder_ == null) {
        updatesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.arijo.protobuf.ApbUpdateOp, com.arijo.protobuf.ApbUpdateOp.Builder, com.arijo.protobuf.ApbUpdateOpOrBuilder>(
            updates_,
            ((bitField0_ & 0x00000002) != 0),
            getParentForChildren(),
            isClean());
        updates_ = null;
      }
      return updatesBuilder_;
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


    // @@protoc_insertion_point(builder_scope:ApbStaticUpdateObjects)
  }

  // @@protoc_insertion_point(class_scope:ApbStaticUpdateObjects)
  private static final com.arijo.protobuf.ApbStaticUpdateObjects DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.arijo.protobuf.ApbStaticUpdateObjects();
  }

  public static com.arijo.protobuf.ApbStaticUpdateObjects getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated
  public static final com.google.protobuf.Parser<ApbStaticUpdateObjects>
      PARSER = new com.google.protobuf.AbstractParser<ApbStaticUpdateObjects>() {
    @java.lang.Override
    public ApbStaticUpdateObjects parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ApbStaticUpdateObjects(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ApbStaticUpdateObjects> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ApbStaticUpdateObjects> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.arijo.protobuf.ApbStaticUpdateObjects getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
