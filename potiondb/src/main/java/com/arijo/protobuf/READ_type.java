// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: antidote.proto

package com.arijo.protobuf;

/**
 * Protobuf enum {@code READ_type}
 */
public enum READ_type
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>FULL = 0;</code>
   */
  FULL(0),
  /**
   * <pre>
   * Set
   * </pre>
   *
   * <code>LOOKUP = 1;</code>
   */
  LOOKUP(1),
  /**
   * <pre>
   * Maps
   * </pre>
   *
   * <code>GET_VALUE = 2;</code>
   */
  GET_VALUE(2),
  /**
   * <code>HAS_KEY = 3;</code>
   */
  HAS_KEY(3),
  /**
   * <code>GET_KEYS = 4;</code>
   */
  GET_KEYS(4),
  /**
   * <pre>
   * Return value for a given set of keys
   * </pre>
   *
   * <code>GET_VALUES = 5;</code>
   */
  GET_VALUES(5),
  /**
   * <pre>
   * TopK
   * </pre>
   *
   * <code>GET_N = 6;</code>
   */
  GET_N(6),
  /**
   * <code>GET_ABOVE_VALUE = 7;</code>
   */
  GET_ABOVE_VALUE(7),
  /**
   * <code>GET_FULL_AVG = 8;</code>
   */
  GET_FULL_AVG(8),
  ;

  /**
   * <code>FULL = 0;</code>
   */
  public static final int FULL_VALUE = 0;
  /**
   * <pre>
   * Set
   * </pre>
   *
   * <code>LOOKUP = 1;</code>
   */
  public static final int LOOKUP_VALUE = 1;
  /**
   * <pre>
   * Maps
   * </pre>
   *
   * <code>GET_VALUE = 2;</code>
   */
  public static final int GET_VALUE_VALUE = 2;
  /**
   * <code>HAS_KEY = 3;</code>
   */
  public static final int HAS_KEY_VALUE = 3;
  /**
   * <code>GET_KEYS = 4;</code>
   */
  public static final int GET_KEYS_VALUE = 4;
  /**
   * <pre>
   * Return value for a given set of keys
   * </pre>
   *
   * <code>GET_VALUES = 5;</code>
   */
  public static final int GET_VALUES_VALUE = 5;
  /**
   * <pre>
   * TopK
   * </pre>
   *
   * <code>GET_N = 6;</code>
   */
  public static final int GET_N_VALUE = 6;
  /**
   * <code>GET_ABOVE_VALUE = 7;</code>
   */
  public static final int GET_ABOVE_VALUE_VALUE = 7;
  /**
   * <code>GET_FULL_AVG = 8;</code>
   */
  public static final int GET_FULL_AVG_VALUE = 8;


  public final int getNumber() {
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static READ_type valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static READ_type forNumber(int value) {
    switch (value) {
      case 0:
        return FULL;
      case 1:
        return LOOKUP;
      case 2:
        return GET_VALUE;
      case 3:
        return HAS_KEY;
      case 4:
        return GET_KEYS;
      case 5:
        return GET_VALUES;
      case 6:
        return GET_N;
      case 7:
        return GET_ABOVE_VALUE;
      case 8:
        return GET_FULL_AVG;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<READ_type>
  internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<
      READ_type> internalValueMap =
      new com.google.protobuf.Internal.EnumLiteMap<READ_type>() {
        public READ_type findValueByNumber(int number) {
          return READ_type.forNumber(number);
        }
      };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
  getValueDescriptor() {
    return getDescriptor().getValues().get(ordinal());
  }

  public final com.google.protobuf.Descriptors.EnumDescriptor
  getDescriptorForType() {
    return getDescriptor();
  }

  public static final com.google.protobuf.Descriptors.EnumDescriptor
  getDescriptor() {
    return com.arijo.protobuf.AntidotePB.getDescriptor().getEnumTypes().get(1);
  }

  private static final READ_type[] VALUES = values();

  public static READ_type valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private READ_type(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:READ_type)
}

