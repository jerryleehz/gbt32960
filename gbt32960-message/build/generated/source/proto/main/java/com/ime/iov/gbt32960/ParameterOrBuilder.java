// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gbt3260.proto

package com.ime.iov.gbt32960;

public interface ParameterOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.ime.iov.gbt32960.Parameter)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional int32 storage_period = 1;</code>
   */
  int getStoragePeriod();

  /**
   * <code>optional int32 normal_report_interval = 2;</code>
   */
  int getNormalReportInterval();

  /**
   * <code>optional int32 alarm_report_interval = 3;</code>
   */
  int getAlarmReportInterval();

  /**
   * <code>optional int32 management_platform_domain_length = 4;</code>
   */
  int getManagementPlatformDomainLength();

  /**
   * <code>optional string management_platform_domain = 5;</code>
   */
  java.lang.String getManagementPlatformDomain();
  /**
   * <code>optional string management_platform_domain = 5;</code>
   */
  com.google.protobuf.ByteString
      getManagementPlatformDomainBytes();

  /**
   * <code>optional int32 management_platform_port = 6;</code>
   */
  int getManagementPlatformPort();

  /**
   * <code>optional string hardware_version = 7;</code>
   */
  java.lang.String getHardwareVersion();
  /**
   * <code>optional string hardware_version = 7;</code>
   */
  com.google.protobuf.ByteString
      getHardwareVersionBytes();

  /**
   * <code>optional string firmware_version = 8;</code>
   */
  java.lang.String getFirmwareVersion();
  /**
   * <code>optional string firmware_version = 8;</code>
   */
  com.google.protobuf.ByteString
      getFirmwareVersionBytes();

  /**
   * <code>optional int32 hearbeat_interval = 9;</code>
   */
  int getHearbeatInterval();

  /**
   * <code>optional int32 terminal_response_timeout = 10;</code>
   */
  int getTerminalResponseTimeout();

  /**
   * <code>optional int32 platform_response_timeout = 11;</code>
   */
  int getPlatformResponseTimeout();

  /**
   * <code>optional int32 login_retry_interval = 12;</code>
   */
  int getLoginRetryInterval();

  /**
   * <code>optional int32 public_platform_domain_length = 13;</code>
   */
  int getPublicPlatformDomainLength();

  /**
   * <code>optional string public_platform_domain = 14;</code>
   */
  java.lang.String getPublicPlatformDomain();
  /**
   * <code>optional string public_platform_domain = 14;</code>
   */
  com.google.protobuf.ByteString
      getPublicPlatformDomainBytes();

  /**
   * <code>optional int32 public_platform_port = 15;</code>
   */
  int getPublicPlatformPort();

  /**
   * <code>optional .com.ime.iov.gbt32960.Parameter.SamplingState sampling = 16;</code>
   */
  int getSamplingValue();
  /**
   * <code>optional .com.ime.iov.gbt32960.Parameter.SamplingState sampling = 16;</code>
   */
  com.ime.iov.gbt32960.Parameter.SamplingState getSampling();

  public com.ime.iov.gbt32960.Parameter.ParameterCase getParameterCase();
}
