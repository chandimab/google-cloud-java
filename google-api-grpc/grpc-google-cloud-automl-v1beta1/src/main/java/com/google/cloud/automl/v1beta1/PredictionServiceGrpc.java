package com.google.cloud.automl.v1beta1;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 *
 *
 * <pre>
 * AutoML Prediction API.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.10.0)",
    comments = "Source: google/cloud/automl/v1beta1/prediction_service.proto")
public final class PredictionServiceGrpc {

  private PredictionServiceGrpc() {}

  public static final String SERVICE_NAME = "google.cloud.automl.v1beta1.PredictionService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getPredictMethod()} instead.
  public static final io.grpc.MethodDescriptor<
          com.google.cloud.automl.v1beta1.PredictRequest,
          com.google.cloud.automl.v1beta1.PredictResponse>
      METHOD_PREDICT = getPredictMethodHelper();

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.automl.v1beta1.PredictRequest,
          com.google.cloud.automl.v1beta1.PredictResponse>
      getPredictMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<
          com.google.cloud.automl.v1beta1.PredictRequest,
          com.google.cloud.automl.v1beta1.PredictResponse>
      getPredictMethod() {
    return getPredictMethodHelper();
  }

  private static io.grpc.MethodDescriptor<
          com.google.cloud.automl.v1beta1.PredictRequest,
          com.google.cloud.automl.v1beta1.PredictResponse>
      getPredictMethodHelper() {
    io.grpc.MethodDescriptor<
            com.google.cloud.automl.v1beta1.PredictRequest,
            com.google.cloud.automl.v1beta1.PredictResponse>
        getPredictMethod;
    if ((getPredictMethod = PredictionServiceGrpc.getPredictMethod) == null) {
      synchronized (PredictionServiceGrpc.class) {
        if ((getPredictMethod = PredictionServiceGrpc.getPredictMethod) == null) {
          PredictionServiceGrpc.getPredictMethod =
              getPredictMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.automl.v1beta1.PredictRequest,
                          com.google.cloud.automl.v1beta1.PredictResponse>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(
                              "google.cloud.automl.v1beta1.PredictionService", "Predict"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.automl.v1beta1.PredictRequest.getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.automl.v1beta1.PredictResponse.getDefaultInstance()))
                      .setSchemaDescriptor(new PredictionServiceMethodDescriptorSupplier("Predict"))
                      .build();
        }
      }
    }
    return getPredictMethod;
  }

  /** Creates a new async stub that supports all call types for the service */
  public static PredictionServiceStub newStub(io.grpc.Channel channel) {
    return new PredictionServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PredictionServiceBlockingStub newBlockingStub(io.grpc.Channel channel) {
    return new PredictionServiceBlockingStub(channel);
  }

  /** Creates a new ListenableFuture-style stub that supports unary calls on the service */
  public static PredictionServiceFutureStub newFutureStub(io.grpc.Channel channel) {
    return new PredictionServiceFutureStub(channel);
  }

  /**
   *
   *
   * <pre>
   * AutoML Prediction API.
   * </pre>
   */
  public abstract static class PredictionServiceImplBase implements io.grpc.BindableService {

    /**
     *
     *
     * <pre>
     * Perform a prediction.
     * </pre>
     */
    public void predict(
        com.google.cloud.automl.v1beta1.PredictRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.automl.v1beta1.PredictResponse>
            responseObserver) {
      asyncUnimplementedUnaryCall(getPredictMethodHelper(), responseObserver);
    }

    @java.lang.Override
    public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
              getPredictMethodHelper(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.automl.v1beta1.PredictRequest,
                      com.google.cloud.automl.v1beta1.PredictResponse>(this, METHODID_PREDICT)))
          .build();
    }
  }

  /**
   *
   *
   * <pre>
   * AutoML Prediction API.
   * </pre>
   */
  public static final class PredictionServiceStub
      extends io.grpc.stub.AbstractStub<PredictionServiceStub> {
    private PredictionServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PredictionServiceStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PredictionServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PredictionServiceStub(channel, callOptions);
    }

    /**
     *
     *
     * <pre>
     * Perform a prediction.
     * </pre>
     */
    public void predict(
        com.google.cloud.automl.v1beta1.PredictRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.automl.v1beta1.PredictResponse>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPredictMethodHelper(), getCallOptions()),
          request,
          responseObserver);
    }
  }

  /**
   *
   *
   * <pre>
   * AutoML Prediction API.
   * </pre>
   */
  public static final class PredictionServiceBlockingStub
      extends io.grpc.stub.AbstractStub<PredictionServiceBlockingStub> {
    private PredictionServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PredictionServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PredictionServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PredictionServiceBlockingStub(channel, callOptions);
    }

    /**
     *
     *
     * <pre>
     * Perform a prediction.
     * </pre>
     */
    public com.google.cloud.automl.v1beta1.PredictResponse predict(
        com.google.cloud.automl.v1beta1.PredictRequest request) {
      return blockingUnaryCall(getChannel(), getPredictMethodHelper(), getCallOptions(), request);
    }
  }

  /**
   *
   *
   * <pre>
   * AutoML Prediction API.
   * </pre>
   */
  public static final class PredictionServiceFutureStub
      extends io.grpc.stub.AbstractStub<PredictionServiceFutureStub> {
    private PredictionServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PredictionServiceFutureStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PredictionServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PredictionServiceFutureStub(channel, callOptions);
    }

    /**
     *
     *
     * <pre>
     * Perform a prediction.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.automl.v1beta1.PredictResponse>
        predict(com.google.cloud.automl.v1beta1.PredictRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPredictMethodHelper(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PREDICT = 0;

  private static final class MethodHandlers<Req, Resp>
      implements io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PredictionServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PredictionServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PREDICT:
          serviceImpl.predict(
              (com.google.cloud.automl.v1beta1.PredictRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.automl.v1beta1.PredictResponse>)
                  responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private abstract static class PredictionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier,
          io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PredictionServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.cloud.automl.v1beta1.PredictionServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PredictionService");
    }
  }

  private static final class PredictionServiceFileDescriptorSupplier
      extends PredictionServiceBaseDescriptorSupplier {
    PredictionServiceFileDescriptorSupplier() {}
  }

  private static final class PredictionServiceMethodDescriptorSupplier
      extends PredictionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PredictionServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (PredictionServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor =
              result =
                  io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
                      .setSchemaDescriptor(new PredictionServiceFileDescriptorSupplier())
                      .addMethod(getPredictMethodHelper())
                      .build();
        }
      }
    }
    return result;
  }
}
