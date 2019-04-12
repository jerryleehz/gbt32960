// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gbt3260.proto

package com.ime.iov.gbt32960;

/**
 * Protobuf type {@code com.ime.iov.gbt32960.TerminalResponse}
 */
public  final class TerminalResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.ime.iov.gbt32960.TerminalResponse)
    TerminalResponseOrBuilder {
  // Use TerminalResponse.newBuilder() to construct.
  private TerminalResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TerminalResponse() {
    vin_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private TerminalResponse(
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            vin_ = s;
            break;
          }
          case 18: {
            com.ime.iov.gbt32960.ConfigQueryResponse.Builder subBuilder = null;
            if (messageCase_ == 2) {
              subBuilder = ((com.ime.iov.gbt32960.ConfigQueryResponse) message_).toBuilder();
            }
            message_ =
                input.readMessage(com.ime.iov.gbt32960.ConfigQueryResponse.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom((com.ime.iov.gbt32960.ConfigQueryResponse) message_);
              message_ = subBuilder.buildPartial();
            }
            messageCase_ = 2;
            break;
          }
          case 24: {
            messageCase_ = 3;
            message_ = input.readBool();
            break;
          }
          case 32: {
            messageCase_ = 4;
            message_ = input.readBool();
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
    return com.ime.iov.gbt32960.Gbt3260.internal_static_com_ime_iov_gbt32960_TerminalResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.ime.iov.gbt32960.Gbt3260.internal_static_com_ime_iov_gbt32960_TerminalResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.ime.iov.gbt32960.TerminalResponse.class, com.ime.iov.gbt32960.TerminalResponse.Builder.class);
  }

  private int messageCase_ = 0;
  private java.lang.Object message_;
  public enum MessageCase
      implements com.google.protobuf.Internal.EnumLite {
    CONFIG_QUERY(2),
    SETUP_SUCCESS(3),
    CONTROL_SUCCESS(4),
    MESSAGE_NOT_SET(0);
    private final int value;
    private MessageCase(int value) {
      this.value = value;
    }
    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static MessageCase valueOf(int value) {
      return forNumber(value);
    }

    public static MessageCase forNumber(int value) {
      switch (value) {
        case 2: return CONFIG_QUERY;
        case 3: return SETUP_SUCCESS;
        case 4: return CONTROL_SUCCESS;
        case 0: return MESSAGE_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public MessageCase
  getMessageCase() {
    return MessageCase.forNumber(
        messageCase_);
  }

  public static final int VIN_FIELD_NUMBER = 1;
  private volatile java.lang.Object vin_;
  /**
   * <code>optional string vin = 1;</code>
   */
  public java.lang.String getVin() {
    java.lang.Object ref = vin_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      vin_ = s;
      return s;
    }
  }
  /**
   * <code>optional string vin = 1;</code>
   */
  public com.google.protobuf.ByteString
      getVinBytes() {
    java.lang.Object ref = vin_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      vin_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CONFIG_QUERY_FIELD_NUMBER = 2;
  /**
   * <code>optional .com.ime.iov.gbt32960.ConfigQueryResponse config_query = 2;</code>
   */
  public com.ime.iov.gbt32960.ConfigQueryResponse getConfigQuery() {
    if (messageCase_ == 2) {
       return (com.ime.iov.gbt32960.ConfigQueryResponse) message_;
    }
    return com.ime.iov.gbt32960.ConfigQueryResponse.getDefaultInstance();
  }
  /**
   * <code>optional .com.ime.iov.gbt32960.ConfigQueryResponse config_query = 2;</code>
   */
  public com.ime.iov.gbt32960.ConfigQueryResponseOrBuilder getConfigQueryOrBuilder() {
    if (messageCase_ == 2) {
       return (com.ime.iov.gbt32960.ConfigQueryResponse) message_;
    }
    return com.ime.iov.gbt32960.ConfigQueryResponse.getDefaultInstance();
  }

  public static final int SETUP_SUCCESS_FIELD_NUMBER = 3;
  /**
   * <code>optional bool setup_success = 3;</code>
   */
  public boolean getSetupSuccess() {
    if (messageCase_ == 3) {
      return (java.lang.Boolean) message_;
    }
    return false;
  }

  public static final int CONTROL_SUCCESS_FIELD_NUMBER = 4;
  /**
   * <code>optional bool control_success = 4;</code>
   */
  public boolean getControlSuccess() {
    if (messageCase_ == 4) {
      return (java.lang.Boolean) message_;
    }
    return false;
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
    if (!getVinBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, vin_);
    }
    if (messageCase_ == 2) {
      output.writeMessage(2, (com.ime.iov.gbt32960.ConfigQueryResponse) message_);
    }
    if (messageCase_ == 3) {
      output.writeBool(
          3, (boolean)((java.lang.Boolean) message_));
    }
    if (messageCase_ == 4) {
      output.writeBool(
          4, (boolean)((java.lang.Boolean) message_));
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getVinBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, vin_);
    }
    if (messageCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, (com.ime.iov.gbt32960.ConfigQueryResponse) message_);
    }
    if (messageCase_ == 3) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(
            3, (boolean)((java.lang.Boolean) message_));
    }
    if (messageCase_ == 4) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(
            4, (boolean)((java.lang.Boolean) message_));
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
    if (!(obj instanceof com.ime.iov.gbt32960.TerminalResponse)) {
      return super.equals(obj);
    }
    com.ime.iov.gbt32960.TerminalResponse other = (com.ime.iov.gbt32960.TerminalResponse) obj;

    boolean result = true;
    result = result && getVin()
        .equals(other.getVin());
    result = result && getMessageCase().equals(
        other.getMessageCase());
    if (!result) return false;
    switch (messageCase_) {
      case 2:
        result = result && getConfigQuery()
            .equals(other.getConfigQuery());
        break;
      case 3:
        result = result && (getSetupSuccess()
            == other.getSetupSuccess());
        break;
      case 4:
        result = result && (getControlSuccess()
            == other.getControlSuccess());
        break;
      case 0:
      default:
    }
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    hash = (37 * hash) + VIN_FIELD_NUMBER;
    hash = (53 * hash) + getVin().hashCode();
    switch (messageCase_) {
      case 2:
        hash = (37 * hash) + CONFIG_QUERY_FIELD_NUMBER;
        hash = (53 * hash) + getConfigQuery().hashCode();
        break;
      case 3:
        hash = (37 * hash) + SETUP_SUCCESS_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
            getSetupSuccess());
        break;
      case 4:
        hash = (37 * hash) + CONTROL_SUCCESS_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
            getControlSuccess());
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.ime.iov.gbt32960.TerminalResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ime.iov.gbt32960.TerminalResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ime.iov.gbt32960.TerminalResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ime.iov.gbt32960.TerminalResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ime.iov.gbt32960.TerminalResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ime.iov.gbt32960.TerminalResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ime.iov.gbt32960.TerminalResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.ime.iov.gbt32960.TerminalResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ime.iov.gbt32960.TerminalResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ime.iov.gbt32960.TerminalResponse parseFrom(
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
  public static Builder newBuilder(com.ime.iov.gbt32960.TerminalResponse prototype) {
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
   * Protobuf type {@code com.ime.iov.gbt32960.TerminalResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.ime.iov.gbt32960.TerminalResponse)
      com.ime.iov.gbt32960.TerminalResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.ime.iov.gbt32960.Gbt3260.internal_static_com_ime_iov_gbt32960_TerminalResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.ime.iov.gbt32960.Gbt3260.internal_static_com_ime_iov_gbt32960_TerminalResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.ime.iov.gbt32960.TerminalResponse.class, com.ime.iov.gbt32960.TerminalResponse.Builder.class);
    }

    // Construct using com.ime.iov.gbt32960.TerminalResponse.newBuilder()
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
      vin_ = "";

      messageCase_ = 0;
      message_ = null;
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.ime.iov.gbt32960.Gbt3260.internal_static_com_ime_iov_gbt32960_TerminalResponse_descriptor;
    }

    public com.ime.iov.gbt32960.TerminalResponse getDefaultInstanceForType() {
      return com.ime.iov.gbt32960.TerminalResponse.getDefaultInstance();
    }

    public com.ime.iov.gbt32960.TerminalResponse build() {
      com.ime.iov.gbt32960.TerminalResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.ime.iov.gbt32960.TerminalResponse buildPartial() {
      com.ime.iov.gbt32960.TerminalResponse result = new com.ime.iov.gbt32960.TerminalResponse(this);
      result.vin_ = vin_;
      if (messageCase_ == 2) {
        if (configQueryBuilder_ == null) {
          result.message_ = message_;
        } else {
          result.message_ = configQueryBuilder_.build();
        }
      }
      if (messageCase_ == 3) {
        result.message_ = message_;
      }
      if (messageCase_ == 4) {
        result.message_ = message_;
      }
      result.messageCase_ = messageCase_;
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
      if (other instanceof com.ime.iov.gbt32960.TerminalResponse) {
        return mergeFrom((com.ime.iov.gbt32960.TerminalResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.ime.iov.gbt32960.TerminalResponse other) {
      if (other == com.ime.iov.gbt32960.TerminalResponse.getDefaultInstance()) return this;
      if (!other.getVin().isEmpty()) {
        vin_ = other.vin_;
        onChanged();
      }
      switch (other.getMessageCase()) {
        case CONFIG_QUERY: {
          mergeConfigQuery(other.getConfigQuery());
          break;
        }
        case SETUP_SUCCESS: {
          setSetupSuccess(other.getSetupSuccess());
          break;
        }
        case CONTROL_SUCCESS: {
          setControlSuccess(other.getControlSuccess());
          break;
        }
        case MESSAGE_NOT_SET: {
          break;
        }
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
      com.ime.iov.gbt32960.TerminalResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.ime.iov.gbt32960.TerminalResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int messageCase_ = 0;
    private java.lang.Object message_;
    public MessageCase
        getMessageCase() {
      return MessageCase.forNumber(
          messageCase_);
    }

    public Builder clearMessage() {
      messageCase_ = 0;
      message_ = null;
      onChanged();
      return this;
    }


    private java.lang.Object vin_ = "";
    /**
     * <code>optional string vin = 1;</code>
     */
    public java.lang.String getVin() {
      java.lang.Object ref = vin_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        vin_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string vin = 1;</code>
     */
    public com.google.protobuf.ByteString
        getVinBytes() {
      java.lang.Object ref = vin_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        vin_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string vin = 1;</code>
     */
    public Builder setVin(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      vin_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string vin = 1;</code>
     */
    public Builder clearVin() {
      
      vin_ = getDefaultInstance().getVin();
      onChanged();
      return this;
    }
    /**
     * <code>optional string vin = 1;</code>
     */
    public Builder setVinBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      vin_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
        com.ime.iov.gbt32960.ConfigQueryResponse, com.ime.iov.gbt32960.ConfigQueryResponse.Builder, com.ime.iov.gbt32960.ConfigQueryResponseOrBuilder> configQueryBuilder_;
    /**
     * <code>optional .com.ime.iov.gbt32960.ConfigQueryResponse config_query = 2;</code>
     */
    public com.ime.iov.gbt32960.ConfigQueryResponse getConfigQuery() {
      if (configQueryBuilder_ == null) {
        if (messageCase_ == 2) {
          return (com.ime.iov.gbt32960.ConfigQueryResponse) message_;
        }
        return com.ime.iov.gbt32960.ConfigQueryResponse.getDefaultInstance();
      } else {
        if (messageCase_ == 2) {
          return configQueryBuilder_.getMessage();
        }
        return com.ime.iov.gbt32960.ConfigQueryResponse.getDefaultInstance();
      }
    }
    /**
     * <code>optional .com.ime.iov.gbt32960.ConfigQueryResponse config_query = 2;</code>
     */
    public Builder setConfigQuery(com.ime.iov.gbt32960.ConfigQueryResponse value) {
      if (configQueryBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        message_ = value;
        onChanged();
      } else {
        configQueryBuilder_.setMessage(value);
      }
      messageCase_ = 2;
      return this;
    }
    /**
     * <code>optional .com.ime.iov.gbt32960.ConfigQueryResponse config_query = 2;</code>
     */
    public Builder setConfigQuery(
        com.ime.iov.gbt32960.ConfigQueryResponse.Builder builderForValue) {
      if (configQueryBuilder_ == null) {
        message_ = builderForValue.build();
        onChanged();
      } else {
        configQueryBuilder_.setMessage(builderForValue.build());
      }
      messageCase_ = 2;
      return this;
    }
    /**
     * <code>optional .com.ime.iov.gbt32960.ConfigQueryResponse config_query = 2;</code>
     */
    public Builder mergeConfigQuery(com.ime.iov.gbt32960.ConfigQueryResponse value) {
      if (configQueryBuilder_ == null) {
        if (messageCase_ == 2 &&
            message_ != com.ime.iov.gbt32960.ConfigQueryResponse.getDefaultInstance()) {
          message_ = com.ime.iov.gbt32960.ConfigQueryResponse.newBuilder((com.ime.iov.gbt32960.ConfigQueryResponse) message_)
              .mergeFrom(value).buildPartial();
        } else {
          message_ = value;
        }
        onChanged();
      } else {
        if (messageCase_ == 2) {
          configQueryBuilder_.mergeFrom(value);
        }
        configQueryBuilder_.setMessage(value);
      }
      messageCase_ = 2;
      return this;
    }
    /**
     * <code>optional .com.ime.iov.gbt32960.ConfigQueryResponse config_query = 2;</code>
     */
    public Builder clearConfigQuery() {
      if (configQueryBuilder_ == null) {
        if (messageCase_ == 2) {
          messageCase_ = 0;
          message_ = null;
          onChanged();
        }
      } else {
        if (messageCase_ == 2) {
          messageCase_ = 0;
          message_ = null;
        }
        configQueryBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>optional .com.ime.iov.gbt32960.ConfigQueryResponse config_query = 2;</code>
     */
    public com.ime.iov.gbt32960.ConfigQueryResponse.Builder getConfigQueryBuilder() {
      return getConfigQueryFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .com.ime.iov.gbt32960.ConfigQueryResponse config_query = 2;</code>
     */
    public com.ime.iov.gbt32960.ConfigQueryResponseOrBuilder getConfigQueryOrBuilder() {
      if ((messageCase_ == 2) && (configQueryBuilder_ != null)) {
        return configQueryBuilder_.getMessageOrBuilder();
      } else {
        if (messageCase_ == 2) {
          return (com.ime.iov.gbt32960.ConfigQueryResponse) message_;
        }
        return com.ime.iov.gbt32960.ConfigQueryResponse.getDefaultInstance();
      }
    }
    /**
     * <code>optional .com.ime.iov.gbt32960.ConfigQueryResponse config_query = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.ime.iov.gbt32960.ConfigQueryResponse, com.ime.iov.gbt32960.ConfigQueryResponse.Builder, com.ime.iov.gbt32960.ConfigQueryResponseOrBuilder> 
        getConfigQueryFieldBuilder() {
      if (configQueryBuilder_ == null) {
        if (!(messageCase_ == 2)) {
          message_ = com.ime.iov.gbt32960.ConfigQueryResponse.getDefaultInstance();
        }
        configQueryBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.ime.iov.gbt32960.ConfigQueryResponse, com.ime.iov.gbt32960.ConfigQueryResponse.Builder, com.ime.iov.gbt32960.ConfigQueryResponseOrBuilder>(
                (com.ime.iov.gbt32960.ConfigQueryResponse) message_,
                getParentForChildren(),
                isClean());
        message_ = null;
      }
      messageCase_ = 2;
      onChanged();;
      return configQueryBuilder_;
    }

    /**
     * <code>optional bool setup_success = 3;</code>
     */
    public boolean getSetupSuccess() {
      if (messageCase_ == 3) {
        return (java.lang.Boolean) message_;
      }
      return false;
    }
    /**
     * <code>optional bool setup_success = 3;</code>
     */
    public Builder setSetupSuccess(boolean value) {
      messageCase_ = 3;
      message_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional bool setup_success = 3;</code>
     */
    public Builder clearSetupSuccess() {
      if (messageCase_ == 3) {
        messageCase_ = 0;
        message_ = null;
        onChanged();
      }
      return this;
    }

    /**
     * <code>optional bool control_success = 4;</code>
     */
    public boolean getControlSuccess() {
      if (messageCase_ == 4) {
        return (java.lang.Boolean) message_;
      }
      return false;
    }
    /**
     * <code>optional bool control_success = 4;</code>
     */
    public Builder setControlSuccess(boolean value) {
      messageCase_ = 4;
      message_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional bool control_success = 4;</code>
     */
    public Builder clearControlSuccess() {
      if (messageCase_ == 4) {
        messageCase_ = 0;
        message_ = null;
        onChanged();
      }
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


    // @@protoc_insertion_point(builder_scope:com.ime.iov.gbt32960.TerminalResponse)
  }

  // @@protoc_insertion_point(class_scope:com.ime.iov.gbt32960.TerminalResponse)
  private static final com.ime.iov.gbt32960.TerminalResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.ime.iov.gbt32960.TerminalResponse();
  }

  public static com.ime.iov.gbt32960.TerminalResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TerminalResponse>
      PARSER = new com.google.protobuf.AbstractParser<TerminalResponse>() {
    public TerminalResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new TerminalResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<TerminalResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TerminalResponse> getParserForType() {
    return PARSER;
  }

  public com.ime.iov.gbt32960.TerminalResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

