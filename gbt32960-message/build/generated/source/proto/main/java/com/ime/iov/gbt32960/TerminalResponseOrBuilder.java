// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gbt3260.proto

package com.ime.iov.gbt32960;

public interface TerminalResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.ime.iov.gbt32960.TerminalResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional string vin = 1;</code>
   */
  java.lang.String getVin();
  /**
   * <code>optional string vin = 1;</code>
   */
  com.google.protobuf.ByteString
      getVinBytes();

  /**
   * <code>optional .com.ime.iov.gbt32960.ConfigQueryResponse config_query = 2;</code>
   */
  com.ime.iov.gbt32960.ConfigQueryResponse getConfigQuery();
  /**
   * <code>optional .com.ime.iov.gbt32960.ConfigQueryResponse config_query = 2;</code>
   */
  com.ime.iov.gbt32960.ConfigQueryResponseOrBuilder getConfigQueryOrBuilder();

  /**
   * <code>optional bool setup_success = 3;</code>
   */
  boolean getSetupSuccess();

  /**
   * <code>optional bool control_success = 4;</code>
   */
  boolean getControlSuccess();

  public com.ime.iov.gbt32960.TerminalResponse.MessageCase getMessageCase();
}
