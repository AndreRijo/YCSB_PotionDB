// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: antidote.proto

package com.arijo.protobuf;

/**
 * <pre>
 * SET
 * </pre>
 * <p>
 * Protobuf type {@code ApbSetLookupRead}
 */
public final class ApbSetLookupRead extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ApbSetLookupRead)
    ApbSetLookupReadOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use ApbSetLookupRead.newBuilder() to construct.
  private ApbSetLookupRead(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ApbSetLookupRead() {
    element_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ApbSetLookupRead();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }

  private ApbSetLookupRead(
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
            element_ = input.readBytes();
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
    return com.arijo.protobuf.AntidotePB.internal_static_ApbSetLookupRead_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
  internalGetFieldAccessorTable() {
    return com.arijo.protobuf.AntidotePB.internal_static_ApbSetLookupRead_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.arijo.protobuf.ApbSetLookupRead.class, com.arijo.protobuf.ApbSetLookupRead.Builder.class);
  }

  private int bitField0_;
  public static final int ELEMENT_FIELD_NUMBER = 1;
  private com.google.protobuf.ByteString element_;

  /**
   * <code>required bytes element = 1;</code>
   *
   * @return Whether the element field is set.
   */
  @java.lang.Override
  public boolean hasElement() {
    return ((bitField0_ & 0x00000001) != 0);
  }

  /**
   * <code>required bytes element = 1;</code>
   *
   * @return The element.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getElement() {
    return element_;
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    if (!hasElement()) {
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
      output.writeBytes(1, element_);
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
          .computeBytesSize(1, element_);
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
    if (!(obj instanceof com.arijo.protobuf.ApbSetLookupRead)) {
      return super.equals(obj);
    }
    com.arijo.protobuf.ApbSetLookupRead other = (com.arijo.protobuf.ApbSetLookupRead) obj;

    if (hasElement() != other.hasElement()) return false;
    if (hasElement()) {
      if (!getElement()
          .equals(other.getElement())) return false;
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
    if (hasElement()) {
      hash = (37 * hash) + ELEMENT_FIELD_NUMBER;
      hash = (53 * hash) + getElement().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.arijo.protobuf.ApbSetLookupRead parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.arijo.protobuf.ApbSetLookupRead parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.arijo.protobuf.ApbSetLookupRead parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.arijo.protobuf.ApbSetLookupRead parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.arijo.protobuf.ApbSetLookupRead parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.arijo.protobuf.ApbSetLookupRead parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.arijo.protobuf.ApbSetLookupRead parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }

  public static com.arijo.protobuf.ApbSetLookupRead parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.arijo.protobuf.ApbSetLookupRead parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.arijo.protobuf.ApbSetLookupRead parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.arijo.protobuf.ApbSetLookupRead parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }

  public static com.arijo.protobuf.ApbSetLookupRead parseFrom(
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

  public static Builder newBuilder(com.arijo.protobuf.ApbSetLookupRead prototype) {
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
   * SET
   * </pre>
   * <p>
   * Protobuf type {@code ApbSetLookupRead}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ApbSetLookupRead)
      com.arijo.protobuf.ApbSetLookupReadOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
    getDescriptor() {
      return com.arijo.protobuf.AntidotePB.internal_static_ApbSetLookupRead_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
    internalGetFieldAccessorTable() {
      return com.arijo.protobuf.AntidotePB.internal_static_ApbSetLookupRead_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.arijo.protobuf.ApbSetLookupRead.class, com.arijo.protobuf.ApbSetLookupRead.Builder.class);
    }

    // Construct using com.arijo.protobuf.ApbSetLookupRead.newBuilder()
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
      element_ = com.google.protobuf.ByteString.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
    getDescriptorForType() {
      return com.arijo.protobuf.AntidotePB.internal_static_ApbSetLookupRead_descriptor;
    }

    @java.lang.Override
    public com.arijo.protobuf.ApbSetLookupRead getDefaultInstanceForType() {
      return com.arijo.protobuf.ApbSetLookupRead.getDefaultInstance();
    }

    @java.lang.Override
    public com.arijo.protobuf.ApbSetLookupRead build() {
      com.arijo.protobuf.ApbSetLookupRead result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.arijo.protobuf.ApbSetLookupRead buildPartial() {
      com.arijo.protobuf.ApbSetLookupRead result = new com.arijo.protobuf.ApbSetLookupRead(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        to_bitField0_ |= 0x00000001;
      }
      result.element_ = element_;
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
      if (other instanceof com.arijo.protobuf.ApbSetLookupRead) {
        return mergeFrom((com.arijo.protobuf.ApbSetLookupRead) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.arijo.protobuf.ApbSetLookupRead other) {
      if (other == com.arijo.protobuf.ApbSetLookupRead.getDefaultInstance()) return this;
      if (other.hasElement()) {
        setElement(other.getElement());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      if (!hasElement()) {
        return false;
      }
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.arijo.protobuf.ApbSetLookupRead parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.arijo.protobuf.ApbSetLookupRead) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private com.google.protobuf.ByteString element_ = com.google.protobuf.ByteString.EMPTY;

    /**
     * <code>required bytes element = 1;</code>
     *
     * @return Whether the element field is set.
     */
    @java.lang.Override
    public boolean hasElement() {
      return ((bitField0_ & 0x00000001) != 0);
    }

    /**
     * <code>required bytes element = 1;</code>
     *
     * @return The element.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getElement() {
      return element_;
    }

    /**
     * <code>required bytes element = 1;</code>
     *
     * @param value The element to set.
     * @return This builder for chaining.
     */
    public Builder setElement(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      element_ = value;
      onChanged();
      return this;
    }

    /**
     * <code>required bytes element = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearElement() {
      bitField0_ = (bitField0_ & ~0x00000001);
      element_ = getDefaultInstance().getElement();
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


    // @@protoc_insertion_point(builder_scope:ApbSetLookupRead)
  }

  // @@protoc_insertion_point(class_scope:ApbSetLookupRead)
  private static final com.arijo.protobuf.ApbSetLookupRead DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.arijo.protobuf.ApbSetLookupRead();
  }

  public static com.arijo.protobuf.ApbSetLookupRead getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated
  public static final com.google.protobuf.Parser<ApbSetLookupRead>
      PARSER = new com.google.protobuf.AbstractParser<ApbSetLookupRead>() {
    @java.lang.Override
    public ApbSetLookupRead parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ApbSetLookupRead(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ApbSetLookupRead> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ApbSetLookupRead> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.arijo.protobuf.ApbSetLookupRead getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

