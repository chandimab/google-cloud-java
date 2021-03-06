// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dataproc/v1/clusters.proto

package com.google.cloud.dataproc.v1;

public interface NodeInitializationActionOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataproc.v1.NodeInitializationAction)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Cloud Storage URI of executable file.
   * </pre>
   *
   * <code>string executable_file = 1;</code>
   */
  java.lang.String getExecutableFile();
  /**
   *
   *
   * <pre>
   * Required. Cloud Storage URI of executable file.
   * </pre>
   *
   * <code>string executable_file = 1;</code>
   */
  com.google.protobuf.ByteString getExecutableFileBytes();

  /**
   *
   *
   * <pre>
   * Optional. Amount of time executable has to complete. Default is
   * 10 minutes. Cluster creation fails with an explanatory error message (the
   * name of the executable that caused the error and the exceeded timeout
   * period) if the executable is not completed at end of the timeout period.
   * </pre>
   *
   * <code>.google.protobuf.Duration execution_timeout = 2;</code>
   */
  boolean hasExecutionTimeout();
  /**
   *
   *
   * <pre>
   * Optional. Amount of time executable has to complete. Default is
   * 10 minutes. Cluster creation fails with an explanatory error message (the
   * name of the executable that caused the error and the exceeded timeout
   * period) if the executable is not completed at end of the timeout period.
   * </pre>
   *
   * <code>.google.protobuf.Duration execution_timeout = 2;</code>
   */
  com.google.protobuf.Duration getExecutionTimeout();
  /**
   *
   *
   * <pre>
   * Optional. Amount of time executable has to complete. Default is
   * 10 minutes. Cluster creation fails with an explanatory error message (the
   * name of the executable that caused the error and the exceeded timeout
   * period) if the executable is not completed at end of the timeout period.
   * </pre>
   *
   * <code>.google.protobuf.Duration execution_timeout = 2;</code>
   */
  com.google.protobuf.DurationOrBuilder getExecutionTimeoutOrBuilder();
}
