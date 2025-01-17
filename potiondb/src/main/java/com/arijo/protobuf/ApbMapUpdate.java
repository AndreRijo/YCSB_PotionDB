// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: antidote.proto

package com.arijo.protobuf;

/**
 * Protobuf type {@code ApbMapUpdate}
 */
public final class ApbMapUpdate extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ApbMapUpdate)
    ApbMapUpdateOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use ApbMapUpdate.newBuilder() to construct.
  private ApbMapUpdate(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ApbMapUpdate() {
    updates_ = java.util.Collections.emptyList();
    removedKeys_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ApbMapUpdate();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }

  private ApbMapUpdate(
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
              updates_ = new java.util.ArrayList<com.arijo.protobuf.ApbMapNestedUpdate>();
              mutable_bitField0_ |= 0x00000001;
            }
            updates_.add(
                input.readMessage(com.arijo.protobuf.ApbMapNestedUpdate.PARSER, extensionRegistry));
            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000002) != 0)) {
              removedKeys_ = new java.util.ArrayList<com.arijo.protobuf.ApbMapKey>();
              mutable_bitField0_ |= 0x00000002;
            }
            removedKeys_.add(
                input.readMessage(com.arijo.protobuf.ApbMapKey.PARSER, extensionRegistry));
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
        updates_ = java.util.Collections.unmodifiableList(updates_);
      }
      if (((mutable_bitField0_ & 0x00000002) != 0)) {
        removedKeys_ = java.util.Collections.unmodifiableList(removedKeys_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor
  getDescriptor() {
    return com.arijo.protobuf.AntidotePB.internal_static_ApbMapUpdate_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
  internalGetFieldAccessorTable() {
    return com.arijo.protobuf.AntidotePB.internal_static_ApbMapUpdate_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.arijo.protobuf.ApbMapUpdate.class, com.arijo.protobuf.ApbMapUpdate.Builder.class);
  }

  public static final int UPDATES_FIELD_NUMBER = 1;
  private java.util.List<com.arijo.protobuf.ApbMapNestedUpdate> updates_;

  /**
   * <code>repeated .ApbMapNestedUpdate updates = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.arijo.protobuf.ApbMapNestedUpdate> getUpdatesList() {
    return updates_;
  }

  /**
   * <code>repeated .ApbMapNestedUpdate updates = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.arijo.protobuf.ApbMapNestedUpdateOrBuilder>
  getUpdatesOrBuilderList() {
    return updates_;
  }

  /**
   * <code>repeated .ApbMapNestedUpdate updates = 1;</code>
   */
  @java.lang.Override
  public int getUpdatesCount() {
    return updates_.size();
  }

  /**
   * <code>repeated .ApbMapNestedUpdate updates = 1;</code>
   */
  @java.lang.Override
  public com.arijo.protobuf.ApbMapNestedUpdate getUpdates(int index) {
    return updates_.get(index);
  }

  /**
   * <code>repeated .ApbMapNestedUpdate updates = 1;</code>
   */
  @java.lang.Override
  public com.arijo.protobuf.ApbMapNestedUpdateOrBuilder getUpdatesOrBuilder(
      int index) {
    return updates_.get(index);
  }

  public static final int REMOVEDKEYS_FIELD_NUMBER = 2;
  private java.util.List<com.arijo.protobuf.ApbMapKey> removedKeys_;

  /**
   * <code>repeated .ApbMapKey removedKeys = 2;</code>
   */
  @java.lang.Override
  public java.util.List<com.arijo.protobuf.ApbMapKey> getRemovedKeysList() {
    return removedKeys_;
  }

  /**
   * <code>repeated .ApbMapKey removedKeys = 2;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.arijo.protobuf.ApbMapKeyOrBuilder>
  getRemovedKeysOrBuilderList() {
    return removedKeys_;
  }

  /**
   * <code>repeated .ApbMapKey removedKeys = 2;</code>
   */
  @java.lang.Override
  public int getRemovedKeysCount() {
    return removedKeys_.size();
  }

  /**
   * <code>repeated .ApbMapKey removedKeys = 2;</code>
   */
  @java.lang.Override
  public com.arijo.protobuf.ApbMapKey getRemovedKeys(int index) {
    return removedKeys_.get(index);
  }

  /**
   * <code>repeated .ApbMapKey removedKeys = 2;</code>
   */
  @java.lang.Override
  public com.arijo.protobuf.ApbMapKeyOrBuilder getRemovedKeysOrBuilder(
      int index) {
    return removedKeys_.get(index);
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    for (int i = 0; i < getUpdatesCount(); i++) {
      if (!getUpdates(i).isInitialized()) {
        memoizedIsInitialized = 0;
        return false;
      }
    }
    for (int i = 0; i < getRemovedKeysCount(); i++) {
      if (!getRemovedKeys(i).isInitialized()) {
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
    for (int i = 0; i < updates_.size(); i++) {
      output.writeMessage(1, updates_.get(i));
    }
    for (int i = 0; i < removedKeys_.size(); i++) {
      output.writeMessage(2, removedKeys_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < updates_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, updates_.get(i));
    }
    for (int i = 0; i < removedKeys_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, removedKeys_.get(i));
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
    if (!(obj instanceof com.arijo.protobuf.ApbMapUpdate)) {
      return super.equals(obj);
    }
    com.arijo.protobuf.ApbMapUpdate other = (com.arijo.protobuf.ApbMapUpdate) obj;

    if (!getUpdatesList()
        .equals(other.getUpdatesList())) return false;
    if (!getRemovedKeysList()
        .equals(other.getRemovedKeysList())) return false;
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
    if (getUpdatesCount() > 0) {
      hash = (37 * hash) + UPDATES_FIELD_NUMBER;
      hash = (53 * hash) + getUpdatesList().hashCode();
    }
    if (getRemovedKeysCount() > 0) {
      hash = (37 * hash) + REMOVEDKEYS_FIELD_NUMBER;
      hash = (53 * hash) + getRemovedKeysList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.arijo.protobuf.ApbMapUpdate parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.arijo.protobuf.ApbMapUpdate parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.arijo.protobuf.ApbMapUpdate parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.arijo.protobuf.ApbMapUpdate parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.arijo.protobuf.ApbMapUpdate parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.arijo.protobuf.ApbMapUpdate parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.arijo.protobuf.ApbMapUpdate parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }

  public static com.arijo.protobuf.ApbMapUpdate parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.arijo.protobuf.ApbMapUpdate parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.arijo.protobuf.ApbMapUpdate parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.arijo.protobuf.ApbMapUpdate parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }

  public static com.arijo.protobuf.ApbMapUpdate parseFrom(
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

  public static Builder newBuilder(com.arijo.protobuf.ApbMapUpdate prototype) {
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
   * Protobuf type {@code ApbMapUpdate}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ApbMapUpdate)
      com.arijo.protobuf.ApbMapUpdateOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
    getDescriptor() {
      return com.arijo.protobuf.AntidotePB.internal_static_ApbMapUpdate_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
    internalGetFieldAccessorTable() {
      return com.arijo.protobuf.AntidotePB.internal_static_ApbMapUpdate_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.arijo.protobuf.ApbMapUpdate.class, com.arijo.protobuf.ApbMapUpdate.Builder.class);
    }

    // Construct using com.arijo.protobuf.ApbMapUpdate.newBuilder()
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
        getUpdatesFieldBuilder();
        getRemovedKeysFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (updatesBuilder_ == null) {
        updates_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        updatesBuilder_.clear();
      }
      if (removedKeysBuilder_ == null) {
        removedKeys_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
      } else {
        removedKeysBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
    getDescriptorForType() {
      return com.arijo.protobuf.AntidotePB.internal_static_ApbMapUpdate_descriptor;
    }

    @java.lang.Override
    public com.arijo.protobuf.ApbMapUpdate getDefaultInstanceForType() {
      return com.arijo.protobuf.ApbMapUpdate.getDefaultInstance();
    }

    @java.lang.Override
    public com.arijo.protobuf.ApbMapUpdate build() {
      com.arijo.protobuf.ApbMapUpdate result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.arijo.protobuf.ApbMapUpdate buildPartial() {
      com.arijo.protobuf.ApbMapUpdate result = new com.arijo.protobuf.ApbMapUpdate(this);
      int from_bitField0_ = bitField0_;
      if (updatesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          updates_ = java.util.Collections.unmodifiableList(updates_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.updates_ = updates_;
      } else {
        result.updates_ = updatesBuilder_.build();
      }
      if (removedKeysBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          removedKeys_ = java.util.Collections.unmodifiableList(removedKeys_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.removedKeys_ = removedKeys_;
      } else {
        result.removedKeys_ = removedKeysBuilder_.build();
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
      if (other instanceof com.arijo.protobuf.ApbMapUpdate) {
        return mergeFrom((com.arijo.protobuf.ApbMapUpdate) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.arijo.protobuf.ApbMapUpdate other) {
      if (other == com.arijo.protobuf.ApbMapUpdate.getDefaultInstance()) return this;
      if (updatesBuilder_ == null) {
        if (!other.updates_.isEmpty()) {
          if (updates_.isEmpty()) {
            updates_ = other.updates_;
            bitField0_ = (bitField0_ & ~0x00000001);
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
            bitField0_ = (bitField0_ & ~0x00000001);
            updatesBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                    getUpdatesFieldBuilder() : null;
          } else {
            updatesBuilder_.addAllMessages(other.updates_);
          }
        }
      }
      if (removedKeysBuilder_ == null) {
        if (!other.removedKeys_.isEmpty()) {
          if (removedKeys_.isEmpty()) {
            removedKeys_ = other.removedKeys_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureRemovedKeysIsMutable();
            removedKeys_.addAll(other.removedKeys_);
          }
          onChanged();
        }
      } else {
        if (!other.removedKeys_.isEmpty()) {
          if (removedKeysBuilder_.isEmpty()) {
            removedKeysBuilder_.dispose();
            removedKeysBuilder_ = null;
            removedKeys_ = other.removedKeys_;
            bitField0_ = (bitField0_ & ~0x00000002);
            removedKeysBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                    getRemovedKeysFieldBuilder() : null;
          } else {
            removedKeysBuilder_.addAllMessages(other.removedKeys_);
          }
        }
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      for (int i = 0; i < getUpdatesCount(); i++) {
        if (!getUpdates(i).isInitialized()) {
          return false;
        }
      }
      for (int i = 0; i < getRemovedKeysCount(); i++) {
        if (!getRemovedKeys(i).isInitialized()) {
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
      com.arijo.protobuf.ApbMapUpdate parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.arijo.protobuf.ApbMapUpdate) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private java.util.List<com.arijo.protobuf.ApbMapNestedUpdate> updates_ =
        java.util.Collections.emptyList();

    private void ensureUpdatesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        updates_ = new java.util.ArrayList<com.arijo.protobuf.ApbMapNestedUpdate>(updates_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.arijo.protobuf.ApbMapNestedUpdate, com.arijo.protobuf.ApbMapNestedUpdate.Builder, com.arijo.protobuf.ApbMapNestedUpdateOrBuilder> updatesBuilder_;

    /**
     * <code>repeated .ApbMapNestedUpdate updates = 1;</code>
     */
    public java.util.List<com.arijo.protobuf.ApbMapNestedUpdate> getUpdatesList() {
      if (updatesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(updates_);
      } else {
        return updatesBuilder_.getMessageList();
      }
    }

    /**
     * <code>repeated .ApbMapNestedUpdate updates = 1;</code>
     */
    public int getUpdatesCount() {
      if (updatesBuilder_ == null) {
        return updates_.size();
      } else {
        return updatesBuilder_.getCount();
      }
    }

    /**
     * <code>repeated .ApbMapNestedUpdate updates = 1;</code>
     */
    public com.arijo.protobuf.ApbMapNestedUpdate getUpdates(int index) {
      if (updatesBuilder_ == null) {
        return updates_.get(index);
      } else {
        return updatesBuilder_.getMessage(index);
      }
    }

    /**
     * <code>repeated .ApbMapNestedUpdate updates = 1;</code>
     */
    public Builder setUpdates(
        int index, com.arijo.protobuf.ApbMapNestedUpdate value) {
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
     * <code>repeated .ApbMapNestedUpdate updates = 1;</code>
     */
    public Builder setUpdates(
        int index, com.arijo.protobuf.ApbMapNestedUpdate.Builder builderForValue) {
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
     * <code>repeated .ApbMapNestedUpdate updates = 1;</code>
     */
    public Builder addUpdates(com.arijo.protobuf.ApbMapNestedUpdate value) {
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
     * <code>repeated .ApbMapNestedUpdate updates = 1;</code>
     */
    public Builder addUpdates(
        int index, com.arijo.protobuf.ApbMapNestedUpdate value) {
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
     * <code>repeated .ApbMapNestedUpdate updates = 1;</code>
     */
    public Builder addUpdates(
        com.arijo.protobuf.ApbMapNestedUpdate.Builder builderForValue) {
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
     * <code>repeated .ApbMapNestedUpdate updates = 1;</code>
     */
    public Builder addUpdates(
        int index, com.arijo.protobuf.ApbMapNestedUpdate.Builder builderForValue) {
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
     * <code>repeated .ApbMapNestedUpdate updates = 1;</code>
     */
    public Builder addAllUpdates(
        java.lang.Iterable<? extends com.arijo.protobuf.ApbMapNestedUpdate> values) {
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
     * <code>repeated .ApbMapNestedUpdate updates = 1;</code>
     */
    public Builder clearUpdates() {
      if (updatesBuilder_ == null) {
        updates_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        updatesBuilder_.clear();
      }
      return this;
    }

    /**
     * <code>repeated .ApbMapNestedUpdate updates = 1;</code>
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
     * <code>repeated .ApbMapNestedUpdate updates = 1;</code>
     */
    public com.arijo.protobuf.ApbMapNestedUpdate.Builder getUpdatesBuilder(
        int index) {
      return getUpdatesFieldBuilder().getBuilder(index);
    }

    /**
     * <code>repeated .ApbMapNestedUpdate updates = 1;</code>
     */
    public com.arijo.protobuf.ApbMapNestedUpdateOrBuilder getUpdatesOrBuilder(
        int index) {
      if (updatesBuilder_ == null) {
        return updates_.get(index);
      } else {
        return updatesBuilder_.getMessageOrBuilder(index);
      }
    }

    /**
     * <code>repeated .ApbMapNestedUpdate updates = 1;</code>
     */
    public java.util.List<? extends com.arijo.protobuf.ApbMapNestedUpdateOrBuilder>
    getUpdatesOrBuilderList() {
      if (updatesBuilder_ != null) {
        return updatesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(updates_);
      }
    }

    /**
     * <code>repeated .ApbMapNestedUpdate updates = 1;</code>
     */
    public com.arijo.protobuf.ApbMapNestedUpdate.Builder addUpdatesBuilder() {
      return getUpdatesFieldBuilder().addBuilder(
          com.arijo.protobuf.ApbMapNestedUpdate.getDefaultInstance());
    }

    /**
     * <code>repeated .ApbMapNestedUpdate updates = 1;</code>
     */
    public com.arijo.protobuf.ApbMapNestedUpdate.Builder addUpdatesBuilder(
        int index) {
      return getUpdatesFieldBuilder().addBuilder(
          index, com.arijo.protobuf.ApbMapNestedUpdate.getDefaultInstance());
    }

    /**
     * <code>repeated .ApbMapNestedUpdate updates = 1;</code>
     */
    public java.util.List<com.arijo.protobuf.ApbMapNestedUpdate.Builder>
    getUpdatesBuilderList() {
      return getUpdatesFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.arijo.protobuf.ApbMapNestedUpdate, com.arijo.protobuf.ApbMapNestedUpdate.Builder, com.arijo.protobuf.ApbMapNestedUpdateOrBuilder>
    getUpdatesFieldBuilder() {
      if (updatesBuilder_ == null) {
        updatesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.arijo.protobuf.ApbMapNestedUpdate, com.arijo.protobuf.ApbMapNestedUpdate.Builder, com.arijo.protobuf.ApbMapNestedUpdateOrBuilder>(
            updates_,
            ((bitField0_ & 0x00000001) != 0),
            getParentForChildren(),
            isClean());
        updates_ = null;
      }
      return updatesBuilder_;
    }

    private java.util.List<com.arijo.protobuf.ApbMapKey> removedKeys_ =
        java.util.Collections.emptyList();

    private void ensureRemovedKeysIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        removedKeys_ = new java.util.ArrayList<com.arijo.protobuf.ApbMapKey>(removedKeys_);
        bitField0_ |= 0x00000002;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.arijo.protobuf.ApbMapKey, com.arijo.protobuf.ApbMapKey.Builder, com.arijo.protobuf.ApbMapKeyOrBuilder> removedKeysBuilder_;

    /**
     * <code>repeated .ApbMapKey removedKeys = 2;</code>
     */
    public java.util.List<com.arijo.protobuf.ApbMapKey> getRemovedKeysList() {
      if (removedKeysBuilder_ == null) {
        return java.util.Collections.unmodifiableList(removedKeys_);
      } else {
        return removedKeysBuilder_.getMessageList();
      }
    }

    /**
     * <code>repeated .ApbMapKey removedKeys = 2;</code>
     */
    public int getRemovedKeysCount() {
      if (removedKeysBuilder_ == null) {
        return removedKeys_.size();
      } else {
        return removedKeysBuilder_.getCount();
      }
    }

    /**
     * <code>repeated .ApbMapKey removedKeys = 2;</code>
     */
    public com.arijo.protobuf.ApbMapKey getRemovedKeys(int index) {
      if (removedKeysBuilder_ == null) {
        return removedKeys_.get(index);
      } else {
        return removedKeysBuilder_.getMessage(index);
      }
    }

    /**
     * <code>repeated .ApbMapKey removedKeys = 2;</code>
     */
    public Builder setRemovedKeys(
        int index, com.arijo.protobuf.ApbMapKey value) {
      if (removedKeysBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRemovedKeysIsMutable();
        removedKeys_.set(index, value);
        onChanged();
      } else {
        removedKeysBuilder_.setMessage(index, value);
      }
      return this;
    }

    /**
     * <code>repeated .ApbMapKey removedKeys = 2;</code>
     */
    public Builder setRemovedKeys(
        int index, com.arijo.protobuf.ApbMapKey.Builder builderForValue) {
      if (removedKeysBuilder_ == null) {
        ensureRemovedKeysIsMutable();
        removedKeys_.set(index, builderForValue.build());
        onChanged();
      } else {
        removedKeysBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }

    /**
     * <code>repeated .ApbMapKey removedKeys = 2;</code>
     */
    public Builder addRemovedKeys(com.arijo.protobuf.ApbMapKey value) {
      if (removedKeysBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRemovedKeysIsMutable();
        removedKeys_.add(value);
        onChanged();
      } else {
        removedKeysBuilder_.addMessage(value);
      }
      return this;
    }

    /**
     * <code>repeated .ApbMapKey removedKeys = 2;</code>
     */
    public Builder addRemovedKeys(
        int index, com.arijo.protobuf.ApbMapKey value) {
      if (removedKeysBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRemovedKeysIsMutable();
        removedKeys_.add(index, value);
        onChanged();
      } else {
        removedKeysBuilder_.addMessage(index, value);
      }
      return this;
    }

    /**
     * <code>repeated .ApbMapKey removedKeys = 2;</code>
     */
    public Builder addRemovedKeys(
        com.arijo.protobuf.ApbMapKey.Builder builderForValue) {
      if (removedKeysBuilder_ == null) {
        ensureRemovedKeysIsMutable();
        removedKeys_.add(builderForValue.build());
        onChanged();
      } else {
        removedKeysBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }

    /**
     * <code>repeated .ApbMapKey removedKeys = 2;</code>
     */
    public Builder addRemovedKeys(
        int index, com.arijo.protobuf.ApbMapKey.Builder builderForValue) {
      if (removedKeysBuilder_ == null) {
        ensureRemovedKeysIsMutable();
        removedKeys_.add(index, builderForValue.build());
        onChanged();
      } else {
        removedKeysBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }

    /**
     * <code>repeated .ApbMapKey removedKeys = 2;</code>
     */
    public Builder addAllRemovedKeys(
        java.lang.Iterable<? extends com.arijo.protobuf.ApbMapKey> values) {
      if (removedKeysBuilder_ == null) {
        ensureRemovedKeysIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, removedKeys_);
        onChanged();
      } else {
        removedKeysBuilder_.addAllMessages(values);
      }
      return this;
    }

    /**
     * <code>repeated .ApbMapKey removedKeys = 2;</code>
     */
    public Builder clearRemovedKeys() {
      if (removedKeysBuilder_ == null) {
        removedKeys_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        removedKeysBuilder_.clear();
      }
      return this;
    }

    /**
     * <code>repeated .ApbMapKey removedKeys = 2;</code>
     */
    public Builder removeRemovedKeys(int index) {
      if (removedKeysBuilder_ == null) {
        ensureRemovedKeysIsMutable();
        removedKeys_.remove(index);
        onChanged();
      } else {
        removedKeysBuilder_.remove(index);
      }
      return this;
    }

    /**
     * <code>repeated .ApbMapKey removedKeys = 2;</code>
     */
    public com.arijo.protobuf.ApbMapKey.Builder getRemovedKeysBuilder(
        int index) {
      return getRemovedKeysFieldBuilder().getBuilder(index);
    }

    /**
     * <code>repeated .ApbMapKey removedKeys = 2;</code>
     */
    public com.arijo.protobuf.ApbMapKeyOrBuilder getRemovedKeysOrBuilder(
        int index) {
      if (removedKeysBuilder_ == null) {
        return removedKeys_.get(index);
      } else {
        return removedKeysBuilder_.getMessageOrBuilder(index);
      }
    }

    /**
     * <code>repeated .ApbMapKey removedKeys = 2;</code>
     */
    public java.util.List<? extends com.arijo.protobuf.ApbMapKeyOrBuilder>
    getRemovedKeysOrBuilderList() {
      if (removedKeysBuilder_ != null) {
        return removedKeysBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(removedKeys_);
      }
    }

    /**
     * <code>repeated .ApbMapKey removedKeys = 2;</code>
     */
    public com.arijo.protobuf.ApbMapKey.Builder addRemovedKeysBuilder() {
      return getRemovedKeysFieldBuilder().addBuilder(
          com.arijo.protobuf.ApbMapKey.getDefaultInstance());
    }

    /**
     * <code>repeated .ApbMapKey removedKeys = 2;</code>
     */
    public com.arijo.protobuf.ApbMapKey.Builder addRemovedKeysBuilder(
        int index) {
      return getRemovedKeysFieldBuilder().addBuilder(
          index, com.arijo.protobuf.ApbMapKey.getDefaultInstance());
    }

    /**
     * <code>repeated .ApbMapKey removedKeys = 2;</code>
     */
    public java.util.List<com.arijo.protobuf.ApbMapKey.Builder>
    getRemovedKeysBuilderList() {
      return getRemovedKeysFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.arijo.protobuf.ApbMapKey, com.arijo.protobuf.ApbMapKey.Builder, com.arijo.protobuf.ApbMapKeyOrBuilder>
    getRemovedKeysFieldBuilder() {
      if (removedKeysBuilder_ == null) {
        removedKeysBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.arijo.protobuf.ApbMapKey, com.arijo.protobuf.ApbMapKey.Builder, com.arijo.protobuf.ApbMapKeyOrBuilder>(
            removedKeys_,
            ((bitField0_ & 0x00000002) != 0),
            getParentForChildren(),
            isClean());
        removedKeys_ = null;
      }
      return removedKeysBuilder_;
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


    // @@protoc_insertion_point(builder_scope:ApbMapUpdate)
  }

  // @@protoc_insertion_point(class_scope:ApbMapUpdate)
  private static final com.arijo.protobuf.ApbMapUpdate DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.arijo.protobuf.ApbMapUpdate();
  }

  public static com.arijo.protobuf.ApbMapUpdate getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated
  public static final com.google.protobuf.Parser<ApbMapUpdate>
      PARSER = new com.google.protobuf.AbstractParser<ApbMapUpdate>() {
    @java.lang.Override
    public ApbMapUpdate parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ApbMapUpdate(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ApbMapUpdate> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ApbMapUpdate> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.arijo.protobuf.ApbMapUpdate getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

