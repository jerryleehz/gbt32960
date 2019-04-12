// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gbt3260.proto

package com.ime.iov.gbt32960;

/**
 * <pre>
 *驱动电机
 * </pre>
 *
 * Protobuf type {@code com.ime.iov.gbt32960.MotorState}
 */
public  final class MotorState extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.ime.iov.gbt32960.MotorState)
    MotorStateOrBuilder {
  // Use MotorState.newBuilder() to construct.
  private MotorState(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MotorState() {
    motorSeq_ = 0L;
    status_ = 0;
    controllerTemperature_ = 0;
    motorSpeed_ = 0;
    motorTorque_ = 0F;
    motorTemperature_ = 0;
    controllerVoltage_ = 0F;
    controllerCurrent_ = 0F;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private MotorState(
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

            motorSeq_ = input.readInt64();
            break;
          }
          case 16: {

            controllerTemperature_ = input.readInt32();
            break;
          }
          case 24: {

            motorSpeed_ = input.readInt32();
            break;
          }
          case 37: {

            motorTorque_ = input.readFloat();
            break;
          }
          case 40: {

            motorTemperature_ = input.readInt32();
            break;
          }
          case 53: {

            controllerVoltage_ = input.readFloat();
            break;
          }
          case 61: {

            controllerCurrent_ = input.readFloat();
            break;
          }
          case 64: {
            int rawValue = input.readEnum();

            status_ = rawValue;
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
    return com.ime.iov.gbt32960.Gbt3260.internal_static_com_ime_iov_gbt32960_MotorState_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.ime.iov.gbt32960.Gbt3260.internal_static_com_ime_iov_gbt32960_MotorState_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.ime.iov.gbt32960.MotorState.class, com.ime.iov.gbt32960.MotorState.Builder.class);
  }

  /**
   * Protobuf enum {@code com.ime.iov.gbt32960.MotorState.MotorStatus}
   */
  public enum MotorStatus
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     *unused
     * </pre>
     *
     * <code>_1 = 0;</code>
     */
    _1(0),
    /**
     * <code>CONSUMING = 1;</code>
     */
    CONSUMING(1),
    /**
     * <code>GENERATING = 2;</code>
     */
    GENERATING(2),
    /**
     * <code>OFF = 3;</code>
     */
    OFF(3),
    /**
     * <code>READY = 4;</code>
     */
    READY(4),
    /**
     * <code>MOTOR_EXCEPTION = 254;</code>
     */
    MOTOR_EXCEPTION(254),
    /**
     * <code>MOTOR_INVALID = 255;</code>
     */
    MOTOR_INVALID(255),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     *unused
     * </pre>
     *
     * <code>_1 = 0;</code>
     */
    public static final int _1_VALUE = 0;
    /**
     * <code>CONSUMING = 1;</code>
     */
    public static final int CONSUMING_VALUE = 1;
    /**
     * <code>GENERATING = 2;</code>
     */
    public static final int GENERATING_VALUE = 2;
    /**
     * <code>OFF = 3;</code>
     */
    public static final int OFF_VALUE = 3;
    /**
     * <code>READY = 4;</code>
     */
    public static final int READY_VALUE = 4;
    /**
     * <code>MOTOR_EXCEPTION = 254;</code>
     */
    public static final int MOTOR_EXCEPTION_VALUE = 254;
    /**
     * <code>MOTOR_INVALID = 255;</code>
     */
    public static final int MOTOR_INVALID_VALUE = 255;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static MotorStatus valueOf(int value) {
      return forNumber(value);
    }

    public static MotorStatus forNumber(int value) {
      switch (value) {
        case 0: return _1;
        case 1: return CONSUMING;
        case 2: return GENERATING;
        case 3: return OFF;
        case 4: return READY;
        case 254: return MOTOR_EXCEPTION;
        case 255: return MOTOR_INVALID;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<MotorStatus>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        MotorStatus> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<MotorStatus>() {
            public MotorStatus findValueByNumber(int number) {
              return MotorStatus.forNumber(number);
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
      return com.ime.iov.gbt32960.MotorState.getDescriptor().getEnumTypes().get(0);
    }

    private static final MotorStatus[] VALUES = values();

    public static MotorStatus valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private MotorStatus(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:com.ime.iov.gbt32960.MotorState.MotorStatus)
  }

  public static final int MOTOR_SEQ_FIELD_NUMBER = 1;
  private long motorSeq_;
  /**
   * <code>optional int64 motor_seq = 1;</code>
   */
  public long getMotorSeq() {
    return motorSeq_;
  }

  public static final int STATUS_FIELD_NUMBER = 8;
  private int status_;
  /**
   * <code>optional .com.ime.iov.gbt32960.MotorState.MotorStatus status = 8;</code>
   */
  public int getStatusValue() {
    return status_;
  }
  /**
   * <code>optional .com.ime.iov.gbt32960.MotorState.MotorStatus status = 8;</code>
   */
  public com.ime.iov.gbt32960.MotorState.MotorStatus getStatus() {
    com.ime.iov.gbt32960.MotorState.MotorStatus result = com.ime.iov.gbt32960.MotorState.MotorStatus.valueOf(status_);
    return result == null ? com.ime.iov.gbt32960.MotorState.MotorStatus.UNRECOGNIZED : result;
  }

  public static final int CONTROLLER_TEMPERATURE_FIELD_NUMBER = 2;
  private int controllerTemperature_;
  /**
   * <code>optional int32 controller_temperature = 2;</code>
   */
  public int getControllerTemperature() {
    return controllerTemperature_;
  }

  public static final int MOTOR_SPEED_FIELD_NUMBER = 3;
  private int motorSpeed_;
  /**
   * <code>optional int32 motor_speed = 3;</code>
   */
  public int getMotorSpeed() {
    return motorSpeed_;
  }

  public static final int MOTOR_TORQUE_FIELD_NUMBER = 4;
  private float motorTorque_;
  /**
   * <pre>
   *驱动电机转矩
   * </pre>
   *
   * <code>optional float motor_torque = 4;</code>
   */
  public float getMotorTorque() {
    return motorTorque_;
  }

  public static final int MOTOR_TEMPERATURE_FIELD_NUMBER = 5;
  private int motorTemperature_;
  /**
   * <code>optional int32 motor_temperature = 5;</code>
   */
  public int getMotorTemperature() {
    return motorTemperature_;
  }

  public static final int CONTROLLER_VOLTAGE_FIELD_NUMBER = 6;
  private float controllerVoltage_;
  /**
   * <code>optional float controller_voltage = 6;</code>
   */
  public float getControllerVoltage() {
    return controllerVoltage_;
  }

  public static final int CONTROLLER_CURRENT_FIELD_NUMBER = 7;
  private float controllerCurrent_;
  /**
   * <pre>
   *电机控制器直流母线电流
   * </pre>
   *
   * <code>optional float controller_current = 7;</code>
   */
  public float getControllerCurrent() {
    return controllerCurrent_;
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
    if (motorSeq_ != 0L) {
      output.writeInt64(1, motorSeq_);
    }
    if (controllerTemperature_ != 0) {
      output.writeInt32(2, controllerTemperature_);
    }
    if (motorSpeed_ != 0) {
      output.writeInt32(3, motorSpeed_);
    }
    if (motorTorque_ != 0F) {
      output.writeFloat(4, motorTorque_);
    }
    if (motorTemperature_ != 0) {
      output.writeInt32(5, motorTemperature_);
    }
    if (controllerVoltage_ != 0F) {
      output.writeFloat(6, controllerVoltage_);
    }
    if (controllerCurrent_ != 0F) {
      output.writeFloat(7, controllerCurrent_);
    }
    if (status_ != com.ime.iov.gbt32960.MotorState.MotorStatus._1.getNumber()) {
      output.writeEnum(8, status_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (motorSeq_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, motorSeq_);
    }
    if (controllerTemperature_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, controllerTemperature_);
    }
    if (motorSpeed_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, motorSpeed_);
    }
    if (motorTorque_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(4, motorTorque_);
    }
    if (motorTemperature_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(5, motorTemperature_);
    }
    if (controllerVoltage_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(6, controllerVoltage_);
    }
    if (controllerCurrent_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(7, controllerCurrent_);
    }
    if (status_ != com.ime.iov.gbt32960.MotorState.MotorStatus._1.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(8, status_);
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
    if (!(obj instanceof com.ime.iov.gbt32960.MotorState)) {
      return super.equals(obj);
    }
    com.ime.iov.gbt32960.MotorState other = (com.ime.iov.gbt32960.MotorState) obj;

    boolean result = true;
    result = result && (getMotorSeq()
        == other.getMotorSeq());
    result = result && status_ == other.status_;
    result = result && (getControllerTemperature()
        == other.getControllerTemperature());
    result = result && (getMotorSpeed()
        == other.getMotorSpeed());
    result = result && (
        java.lang.Float.floatToIntBits(getMotorTorque())
        == java.lang.Float.floatToIntBits(
            other.getMotorTorque()));
    result = result && (getMotorTemperature()
        == other.getMotorTemperature());
    result = result && (
        java.lang.Float.floatToIntBits(getControllerVoltage())
        == java.lang.Float.floatToIntBits(
            other.getControllerVoltage()));
    result = result && (
        java.lang.Float.floatToIntBits(getControllerCurrent())
        == java.lang.Float.floatToIntBits(
            other.getControllerCurrent()));
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    hash = (37 * hash) + MOTOR_SEQ_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getMotorSeq());
    hash = (37 * hash) + STATUS_FIELD_NUMBER;
    hash = (53 * hash) + status_;
    hash = (37 * hash) + CONTROLLER_TEMPERATURE_FIELD_NUMBER;
    hash = (53 * hash) + getControllerTemperature();
    hash = (37 * hash) + MOTOR_SPEED_FIELD_NUMBER;
    hash = (53 * hash) + getMotorSpeed();
    hash = (37 * hash) + MOTOR_TORQUE_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getMotorTorque());
    hash = (37 * hash) + MOTOR_TEMPERATURE_FIELD_NUMBER;
    hash = (53 * hash) + getMotorTemperature();
    hash = (37 * hash) + CONTROLLER_VOLTAGE_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getControllerVoltage());
    hash = (37 * hash) + CONTROLLER_CURRENT_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getControllerCurrent());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.ime.iov.gbt32960.MotorState parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ime.iov.gbt32960.MotorState parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ime.iov.gbt32960.MotorState parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ime.iov.gbt32960.MotorState parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ime.iov.gbt32960.MotorState parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ime.iov.gbt32960.MotorState parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ime.iov.gbt32960.MotorState parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.ime.iov.gbt32960.MotorState parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ime.iov.gbt32960.MotorState parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ime.iov.gbt32960.MotorState parseFrom(
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
  public static Builder newBuilder(com.ime.iov.gbt32960.MotorState prototype) {
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
   *驱动电机
   * </pre>
   *
   * Protobuf type {@code com.ime.iov.gbt32960.MotorState}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.ime.iov.gbt32960.MotorState)
      com.ime.iov.gbt32960.MotorStateOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.ime.iov.gbt32960.Gbt3260.internal_static_com_ime_iov_gbt32960_MotorState_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.ime.iov.gbt32960.Gbt3260.internal_static_com_ime_iov_gbt32960_MotorState_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.ime.iov.gbt32960.MotorState.class, com.ime.iov.gbt32960.MotorState.Builder.class);
    }

    // Construct using com.ime.iov.gbt32960.MotorState.newBuilder()
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
      motorSeq_ = 0L;

      status_ = 0;

      controllerTemperature_ = 0;

      motorSpeed_ = 0;

      motorTorque_ = 0F;

      motorTemperature_ = 0;

      controllerVoltage_ = 0F;

      controllerCurrent_ = 0F;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.ime.iov.gbt32960.Gbt3260.internal_static_com_ime_iov_gbt32960_MotorState_descriptor;
    }

    public com.ime.iov.gbt32960.MotorState getDefaultInstanceForType() {
      return com.ime.iov.gbt32960.MotorState.getDefaultInstance();
    }

    public com.ime.iov.gbt32960.MotorState build() {
      com.ime.iov.gbt32960.MotorState result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.ime.iov.gbt32960.MotorState buildPartial() {
      com.ime.iov.gbt32960.MotorState result = new com.ime.iov.gbt32960.MotorState(this);
      result.motorSeq_ = motorSeq_;
      result.status_ = status_;
      result.controllerTemperature_ = controllerTemperature_;
      result.motorSpeed_ = motorSpeed_;
      result.motorTorque_ = motorTorque_;
      result.motorTemperature_ = motorTemperature_;
      result.controllerVoltage_ = controllerVoltage_;
      result.controllerCurrent_ = controllerCurrent_;
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
      if (other instanceof com.ime.iov.gbt32960.MotorState) {
        return mergeFrom((com.ime.iov.gbt32960.MotorState)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.ime.iov.gbt32960.MotorState other) {
      if (other == com.ime.iov.gbt32960.MotorState.getDefaultInstance()) return this;
      if (other.getMotorSeq() != 0L) {
        setMotorSeq(other.getMotorSeq());
      }
      if (other.status_ != 0) {
        setStatusValue(other.getStatusValue());
      }
      if (other.getControllerTemperature() != 0) {
        setControllerTemperature(other.getControllerTemperature());
      }
      if (other.getMotorSpeed() != 0) {
        setMotorSpeed(other.getMotorSpeed());
      }
      if (other.getMotorTorque() != 0F) {
        setMotorTorque(other.getMotorTorque());
      }
      if (other.getMotorTemperature() != 0) {
        setMotorTemperature(other.getMotorTemperature());
      }
      if (other.getControllerVoltage() != 0F) {
        setControllerVoltage(other.getControllerVoltage());
      }
      if (other.getControllerCurrent() != 0F) {
        setControllerCurrent(other.getControllerCurrent());
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
      com.ime.iov.gbt32960.MotorState parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.ime.iov.gbt32960.MotorState) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long motorSeq_ ;
    /**
     * <code>optional int64 motor_seq = 1;</code>
     */
    public long getMotorSeq() {
      return motorSeq_;
    }
    /**
     * <code>optional int64 motor_seq = 1;</code>
     */
    public Builder setMotorSeq(long value) {
      
      motorSeq_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int64 motor_seq = 1;</code>
     */
    public Builder clearMotorSeq() {
      
      motorSeq_ = 0L;
      onChanged();
      return this;
    }

    private int status_ = 0;
    /**
     * <code>optional .com.ime.iov.gbt32960.MotorState.MotorStatus status = 8;</code>
     */
    public int getStatusValue() {
      return status_;
    }
    /**
     * <code>optional .com.ime.iov.gbt32960.MotorState.MotorStatus status = 8;</code>
     */
    public Builder setStatusValue(int value) {
      status_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional .com.ime.iov.gbt32960.MotorState.MotorStatus status = 8;</code>
     */
    public com.ime.iov.gbt32960.MotorState.MotorStatus getStatus() {
      com.ime.iov.gbt32960.MotorState.MotorStatus result = com.ime.iov.gbt32960.MotorState.MotorStatus.valueOf(status_);
      return result == null ? com.ime.iov.gbt32960.MotorState.MotorStatus.UNRECOGNIZED : result;
    }
    /**
     * <code>optional .com.ime.iov.gbt32960.MotorState.MotorStatus status = 8;</code>
     */
    public Builder setStatus(com.ime.iov.gbt32960.MotorState.MotorStatus value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      status_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>optional .com.ime.iov.gbt32960.MotorState.MotorStatus status = 8;</code>
     */
    public Builder clearStatus() {
      
      status_ = 0;
      onChanged();
      return this;
    }

    private int controllerTemperature_ ;
    /**
     * <code>optional int32 controller_temperature = 2;</code>
     */
    public int getControllerTemperature() {
      return controllerTemperature_;
    }
    /**
     * <code>optional int32 controller_temperature = 2;</code>
     */
    public Builder setControllerTemperature(int value) {
      
      controllerTemperature_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 controller_temperature = 2;</code>
     */
    public Builder clearControllerTemperature() {
      
      controllerTemperature_ = 0;
      onChanged();
      return this;
    }

    private int motorSpeed_ ;
    /**
     * <code>optional int32 motor_speed = 3;</code>
     */
    public int getMotorSpeed() {
      return motorSpeed_;
    }
    /**
     * <code>optional int32 motor_speed = 3;</code>
     */
    public Builder setMotorSpeed(int value) {
      
      motorSpeed_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 motor_speed = 3;</code>
     */
    public Builder clearMotorSpeed() {
      
      motorSpeed_ = 0;
      onChanged();
      return this;
    }

    private float motorTorque_ ;
    /**
     * <pre>
     *驱动电机转矩
     * </pre>
     *
     * <code>optional float motor_torque = 4;</code>
     */
    public float getMotorTorque() {
      return motorTorque_;
    }
    /**
     * <pre>
     *驱动电机转矩
     * </pre>
     *
     * <code>optional float motor_torque = 4;</code>
     */
    public Builder setMotorTorque(float value) {
      
      motorTorque_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *驱动电机转矩
     * </pre>
     *
     * <code>optional float motor_torque = 4;</code>
     */
    public Builder clearMotorTorque() {
      
      motorTorque_ = 0F;
      onChanged();
      return this;
    }

    private int motorTemperature_ ;
    /**
     * <code>optional int32 motor_temperature = 5;</code>
     */
    public int getMotorTemperature() {
      return motorTemperature_;
    }
    /**
     * <code>optional int32 motor_temperature = 5;</code>
     */
    public Builder setMotorTemperature(int value) {
      
      motorTemperature_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 motor_temperature = 5;</code>
     */
    public Builder clearMotorTemperature() {
      
      motorTemperature_ = 0;
      onChanged();
      return this;
    }

    private float controllerVoltage_ ;
    /**
     * <code>optional float controller_voltage = 6;</code>
     */
    public float getControllerVoltage() {
      return controllerVoltage_;
    }
    /**
     * <code>optional float controller_voltage = 6;</code>
     */
    public Builder setControllerVoltage(float value) {
      
      controllerVoltage_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional float controller_voltage = 6;</code>
     */
    public Builder clearControllerVoltage() {
      
      controllerVoltage_ = 0F;
      onChanged();
      return this;
    }

    private float controllerCurrent_ ;
    /**
     * <pre>
     *电机控制器直流母线电流
     * </pre>
     *
     * <code>optional float controller_current = 7;</code>
     */
    public float getControllerCurrent() {
      return controllerCurrent_;
    }
    /**
     * <pre>
     *电机控制器直流母线电流
     * </pre>
     *
     * <code>optional float controller_current = 7;</code>
     */
    public Builder setControllerCurrent(float value) {
      
      controllerCurrent_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *电机控制器直流母线电流
     * </pre>
     *
     * <code>optional float controller_current = 7;</code>
     */
    public Builder clearControllerCurrent() {
      
      controllerCurrent_ = 0F;
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


    // @@protoc_insertion_point(builder_scope:com.ime.iov.gbt32960.MotorState)
  }

  // @@protoc_insertion_point(class_scope:com.ime.iov.gbt32960.MotorState)
  private static final com.ime.iov.gbt32960.MotorState DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.ime.iov.gbt32960.MotorState();
  }

  public static com.ime.iov.gbt32960.MotorState getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MotorState>
      PARSER = new com.google.protobuf.AbstractParser<MotorState>() {
    public MotorState parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new MotorState(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MotorState> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MotorState> getParserForType() {
    return PARSER;
  }

  public com.ime.iov.gbt32960.MotorState getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

