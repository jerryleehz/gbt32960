// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gbt3260.proto

package com.ime.iov.gbt32960;

public interface PlatformMessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.ime.iov.gbt32960.PlatformMessage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional .com.ime.iov.gbt32960.ConfigQueryRequest config_query = 2;</code>
   */
  com.ime.iov.gbt32960.ConfigQueryRequest getConfigQuery();
  /**
   * <code>optional .com.ime.iov.gbt32960.ConfigQueryRequest config_query = 2;</code>
   */
  com.ime.iov.gbt32960.ConfigQueryRequestOrBuilder getConfigQueryOrBuilder();

  /**
   * <code>optional .com.ime.iov.gbt32960.ConfigSetupRequest config_setup = 3;</code>
   */
  com.ime.iov.gbt32960.ConfigSetupRequest getConfigSetup();
  /**
   * <code>optional .com.ime.iov.gbt32960.ConfigSetupRequest config_setup = 3;</code>
   */
  com.ime.iov.gbt32960.ConfigSetupRequestOrBuilder getConfigSetupOrBuilder();

  /**
   * <code>optional .com.ime.iov.gbt32960.RemoteUpgradeCommand upgrade = 4;</code>
   */
  com.ime.iov.gbt32960.RemoteUpgradeCommand getUpgrade();
  /**
   * <code>optional .com.ime.iov.gbt32960.RemoteUpgradeCommand upgrade = 4;</code>
   */
  com.ime.iov.gbt32960.RemoteUpgradeCommandOrBuilder getUpgradeOrBuilder();

  /**
   * <code>optional .com.ime.iov.gbt32960.Warning warning = 5;</code>
   */
  com.ime.iov.gbt32960.Warning getWarning();
  /**
   * <code>optional .com.ime.iov.gbt32960.Warning warning = 5;</code>
   */
  com.ime.iov.gbt32960.WarningOrBuilder getWarningOrBuilder();

  /**
   * <code>optional .com.ime.iov.gbt32960.ControlCommand control = 6;</code>
   */
  com.ime.iov.gbt32960.ControlCommand getControl();
  /**
   * <code>optional .com.ime.iov.gbt32960.ControlCommand control = 6;</code>
   */
  com.ime.iov.gbt32960.ControlCommandOrBuilder getControlOrBuilder();

  /**
   * <code>optional .com.ime.iov.gbt32960.TerminalClockCorrect clock_correct = 7;</code>
   */
  com.ime.iov.gbt32960.TerminalClockCorrect getClockCorrect();
  /**
   * <code>optional .com.ime.iov.gbt32960.TerminalClockCorrect clock_correct = 7;</code>
   */
  com.ime.iov.gbt32960.TerminalClockCorrectOrBuilder getClockCorrectOrBuilder();

  /**
   * <code>optional .com.ime.iov.gbt32960.EmptyResponse empty_response = 8;</code>
   */
  com.ime.iov.gbt32960.EmptyResponse getEmptyResponse();
  /**
   * <code>optional .com.ime.iov.gbt32960.EmptyResponse empty_response = 8;</code>
   */
  com.ime.iov.gbt32960.EmptyResponseOrBuilder getEmptyResponseOrBuilder();

  /**
   * <code>optional .com.ime.iov.gbt32960.ProtoResponse proto_response = 9;</code>
   */
  com.ime.iov.gbt32960.ProtoResponse getProtoResponse();
  /**
   * <code>optional .com.ime.iov.gbt32960.ProtoResponse proto_response = 9;</code>
   */
  com.ime.iov.gbt32960.ProtoResponseOrBuilder getProtoResponseOrBuilder();

  public com.ime.iov.gbt32960.PlatformMessage.MessageCase getMessageCase();
}
