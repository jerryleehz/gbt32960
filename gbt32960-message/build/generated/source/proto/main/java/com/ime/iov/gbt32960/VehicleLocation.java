// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gbt3260.proto

package com.ime.iov.gbt32960;

/**
 * <pre>
 *车辆位置数据
 * </pre>
 *
 * Protobuf type {@code com.ime.iov.gbt32960.VehicleLocation}
 */
public  final class VehicleLocation extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.ime.iov.gbt32960.VehicleLocation)
    VehicleLocationOrBuilder {
  // Use VehicleLocation.newBuilder() to construct.
  private VehicleLocation(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private VehicleLocation() {
    isValid_ = false;
    longitude_ = 0D;
    latitude_ = 0D;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private VehicleLocation(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 8: {

            isValid_ = input.readBool();
            break;
          }
          case 17: {

            longitude_ = input.readDouble();
            break;
          }
          case 25: {

            latitude_ = input.readDouble();
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
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.ime.iov.gbt32960.Gbt3260.internal_static_com_ime_iov_gbt32960_VehicleLocation_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.ime.iov.gbt32960.Gbt3260.internal_static_com_ime_iov_gbt32960_VehicleLocation_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.ime.iov.gbt32960.VehicleLocation.class, com.ime.iov.gbt32960.VehicleLocation.Builder.class);
  }

  public static final int IS_VALID_FIELD_NUMBER = 1;
  private boolean isValid_;
  /**
   * <code>optional bool is_valid = 1;</code>
   */
  public boolean getIsValid() {
    return isValid_;
  }

  public static final int LONGITUDE_FIELD_NUMBER = 2;
  private double longitude_;
  /**
   * <code>optional double longitude = 2;</code>
   */
  public double getLongitude() {
    return longitude_;
  }

  public static final int LATITUDE_FIELD_NUMBER = 3;
  private double latitude_;
  /**
   * <pre>
   *    float speed = 4;
   *    int32 direction =5;
   * </pre>
   *
   * <code>optional double latitude = 3;</code>
   */
  public double getLatitude() {
    return latitude_;
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (isValid_ != false) {
      output.writeBool(1, isValid_);
    }
    if (longitude_ != 0D) {
      output.writeDouble(2, longitude_);
    }
    if (latitude_ != 0D) {
      output.writeDouble(3, latitude_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (isValid_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, isValid_);
    }
    if (longitude_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(2, longitude_);
    }
    if (latitude_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(3, latitude_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.ime.iov.gbt32960.VehicleLocation)) {
      return super.equals(obj);
    }
    com.ime.iov.gbt32960.VehicleLocation other = (com.ime.iov.gbt32960.VehicleLocation) obj;

    boolean result = true;
    result = result && (getIsValid()
        == other.getIsValid());
    result = result && (
        java.lang.Double.doubleToLongBits(getLongitude())
        == java.lang.Double.doubleToLongBits(
            other.getLongitude()));
    result = result && (
        java.lang.Double.doubleToLongBits(getLatitude())
        == java.lang.Double.doubleToLongBits(
            other.getLatitude()));
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    hash = (37 * hash) + IS_VALID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIsValid());
    hash = (37 * hash) + LONGITUDE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getLongitude()));
    hash = (37 * hash) + LATITUDE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getLatitude()));
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.ime.iov.gbt32960.VehicleLocation parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ime.iov.gbt32960.VehicleLocation parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ime.iov.gbt32960.VehicleLocation parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ime.iov.gbt32960.VehicleLocation parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ime.iov.gbt32960.VehicleLocation parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ime.iov.gbt32960.VehicleLocation parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ime.iov.gbt32960.VehicleLocation parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.ime.iov.gbt32960.VehicleLocation parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ime.iov.gbt32960.VehicleLocation parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ime.iov.gbt32960.VehicleLocation parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.ime.iov.gbt32960.VehicleLocation prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
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
   *车辆位置数据
   * </pre>
   *
   * Protobuf type {@code com.ime.iov.gbt32960.VehicleLocation}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.ime.iov.gbt32960.VehicleLocation)
      com.ime.iov.gbt32960.VehicleLocationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.ime.iov.gbt32960.Gbt3260.internal_static_com_ime_iov_gbt32960_VehicleLocation_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.ime.iov.gbt32960.Gbt3260.internal_static_com_ime_iov_gbt32960_VehicleLocation_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.ime.iov.gbt32960.VehicleLocation.class, com.ime.iov.gbt32960.VehicleLocation.Builder.class);
    }

    // Construct using com.ime.iov.gbt32960.VehicleLocation.newBuilder()
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
    public Builder clear() {
      super.clear();
      isValid_ = false;

      longitude_ = 0D;

      latitude_ = 0D;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.ime.iov.gbt32960.Gbt3260.internal_static_com_ime_iov_gbt32960_VehicleLocation_descriptor;
    }

    public com.ime.iov.gbt32960.VehicleLocation getDefaultInstanceForType() {
      return com.ime.iov.gbt32960.VehicleLocation.getDefaultInstance();
    }

    public com.ime.iov.gbt32960.VehicleLocation build() {
      com.ime.iov.gbt32960.VehicleLocation result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.ime.iov.gbt32960.VehicleLocation buildPartial() {
      com.ime.iov.gbt32960.VehicleLocation result = new com.ime.iov.gbt32960.VehicleLocation(this);
      result.isValid_ = isValid_;
      result.longitude_ = longitude_;
      result.latitude_ = latitude_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.ime.iov.gbt32960.VehicleLocation) {
        return mergeFrom((com.ime.iov.gbt32960.VehicleLocation)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.ime.iov.gbt32960.VehicleLocation other) {
      if (other == com.ime.iov.gbt32960.VehicleLocation.getDefaultInstance()) return this;
      if (other.getIsValid() != false) {
        setIsValid(other.getIsValid());
      }
      if (other.getLongitude() != 0D) {
        setLongitude(other.getLongitude());
      }
      if (other.getLatitude() != 0D) {
        setLatitude(other.getLatitude());
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.ime.iov.gbt32960.VehicleLocation parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.ime.iov.gbt32960.VehicleLocation) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private boolean isValid_ ;
    /**
     * <code>optional bool is_valid = 1;</code>
     */
    public boolean getIsValid() {
      return isValid_;
    }
    /**
     * <code>optional bool is_valid = 1;</code>
     */
    public Builder setIsValid(boolean value) {
      
      isValid_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional bool is_valid = 1;</code>
     */
    public Builder clearIsValid() {
      
      isValid_ = false;
      onChanged();
      return this;
    }

    private double longitude_ ;
    /**
     * <code>optional double longitude = 2;</code>
     */
    public double getLongitude() {
      return longitude_;
    }
    /**
     * <code>optional double longitude = 2;</code>
     */
    public Builder setLongitude(double value) {
      
      longitude_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional double longitude = 2;</code>
     */
    public Builder clearLongitude() {
      
      longitude_ = 0D;
      onChanged();
      return this;
    }

    private double latitude_ ;
    /**
     * <pre>
     *    float speed = 4;
     *    int32 direction =5;
     * </pre>
     *
     * <code>optional double latitude = 3;</code>
     */
    public double getLatitude() {
      return latitude_;
    }
    /**
     * <pre>
     *    float speed = 4;
     *    int32 direction =5;
     * </pre>
     *
     * <code>optional double latitude = 3;</code>
     */
    public Builder setLatitude(double value) {
      
      latitude_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *    float speed = 4;
     *    int32 direction =5;
     * </pre>
     *
     * <code>optional double latitude = 3;</code>
     */
    public Builder clearLatitude() {
      
      latitude_ = 0D;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:com.ime.iov.gbt32960.VehicleLocation)
  }

  // @@protoc_insertion_point(class_scope:com.ime.iov.gbt32960.VehicleLocation)
  private static final com.ime.iov.gbt32960.VehicleLocation DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.ime.iov.gbt32960.VehicleLocation();
  }

  public static com.ime.iov.gbt32960.VehicleLocation getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VehicleLocation>
      PARSER = new com.google.protobuf.AbstractParser<VehicleLocation>() {
    public VehicleLocation parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new VehicleLocation(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<VehicleLocation> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VehicleLocation> getParserForType() {
    return PARSER;
  }

  public com.ime.iov.gbt32960.VehicleLocation getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

