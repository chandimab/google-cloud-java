// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/monitoring/v3/alert_service.proto

package com.google.monitoring.v3;

/**
 * <pre>
 * The protocol for the `CreateAlertPolicy` request.
 * </pre>
 *
 * Protobuf type {@code google.monitoring.v3.CreateAlertPolicyRequest}
 */
public  final class CreateAlertPolicyRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.monitoring.v3.CreateAlertPolicyRequest)
    CreateAlertPolicyRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateAlertPolicyRequest.newBuilder() to construct.
  private CreateAlertPolicyRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateAlertPolicyRequest() {
    name_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CreateAlertPolicyRequest(
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
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 18: {
            com.google.monitoring.v3.AlertPolicy.Builder subBuilder = null;
            if (alertPolicy_ != null) {
              subBuilder = alertPolicy_.toBuilder();
            }
            alertPolicy_ = input.readMessage(com.google.monitoring.v3.AlertPolicy.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(alertPolicy_);
              alertPolicy_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            name_ = s;
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
    return com.google.monitoring.v3.AlertServiceProto.internal_static_google_monitoring_v3_CreateAlertPolicyRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.monitoring.v3.AlertServiceProto.internal_static_google_monitoring_v3_CreateAlertPolicyRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.monitoring.v3.CreateAlertPolicyRequest.class, com.google.monitoring.v3.CreateAlertPolicyRequest.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 3;
  private volatile java.lang.Object name_;
  /**
   * <pre>
   * The project in which to create the alerting policy. The format is
   * `projects/[PROJECT_ID]`.
   * Note that this field names the parent container in which the alerting
   * policy will be written, not the name of the created policy. The alerting
   * policy that is returned will have a name that contains a normalized
   * representation of this name as a prefix but adds a suffix of the form
   * `/alertPolicies/[POLICY_ID]`, identifying the policy in the container.
   * </pre>
   *
   * <code>string name = 3;</code>
   */
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The project in which to create the alerting policy. The format is
   * `projects/[PROJECT_ID]`.
   * Note that this field names the parent container in which the alerting
   * policy will be written, not the name of the created policy. The alerting
   * policy that is returned will have a name that contains a normalized
   * representation of this name as a prefix but adds a suffix of the form
   * `/alertPolicies/[POLICY_ID]`, identifying the policy in the container.
   * </pre>
   *
   * <code>string name = 3;</code>
   */
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ALERT_POLICY_FIELD_NUMBER = 2;
  private com.google.monitoring.v3.AlertPolicy alertPolicy_;
  /**
   * <pre>
   * The requested alerting policy. You should omit the `name` field in this
   * policy. The name will be returned in the new policy, including
   * a new [ALERT_POLICY_ID] value.
   * </pre>
   *
   * <code>.google.monitoring.v3.AlertPolicy alert_policy = 2;</code>
   */
  public boolean hasAlertPolicy() {
    return alertPolicy_ != null;
  }
  /**
   * <pre>
   * The requested alerting policy. You should omit the `name` field in this
   * policy. The name will be returned in the new policy, including
   * a new [ALERT_POLICY_ID] value.
   * </pre>
   *
   * <code>.google.monitoring.v3.AlertPolicy alert_policy = 2;</code>
   */
  public com.google.monitoring.v3.AlertPolicy getAlertPolicy() {
    return alertPolicy_ == null ? com.google.monitoring.v3.AlertPolicy.getDefaultInstance() : alertPolicy_;
  }
  /**
   * <pre>
   * The requested alerting policy. You should omit the `name` field in this
   * policy. The name will be returned in the new policy, including
   * a new [ALERT_POLICY_ID] value.
   * </pre>
   *
   * <code>.google.monitoring.v3.AlertPolicy alert_policy = 2;</code>
   */
  public com.google.monitoring.v3.AlertPolicyOrBuilder getAlertPolicyOrBuilder() {
    return getAlertPolicy();
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
    if (alertPolicy_ != null) {
      output.writeMessage(2, getAlertPolicy());
    }
    if (!getNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, name_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (alertPolicy_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getAlertPolicy());
    }
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, name_);
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
    if (!(obj instanceof com.google.monitoring.v3.CreateAlertPolicyRequest)) {
      return super.equals(obj);
    }
    com.google.monitoring.v3.CreateAlertPolicyRequest other = (com.google.monitoring.v3.CreateAlertPolicyRequest) obj;

    boolean result = true;
    result = result && getName()
        .equals(other.getName());
    result = result && (hasAlertPolicy() == other.hasAlertPolicy());
    if (hasAlertPolicy()) {
      result = result && getAlertPolicy()
          .equals(other.getAlertPolicy());
    }
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    if (hasAlertPolicy()) {
      hash = (37 * hash) + ALERT_POLICY_FIELD_NUMBER;
      hash = (53 * hash) + getAlertPolicy().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.monitoring.v3.CreateAlertPolicyRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.monitoring.v3.CreateAlertPolicyRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.monitoring.v3.CreateAlertPolicyRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.monitoring.v3.CreateAlertPolicyRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.monitoring.v3.CreateAlertPolicyRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.monitoring.v3.CreateAlertPolicyRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.monitoring.v3.CreateAlertPolicyRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.monitoring.v3.CreateAlertPolicyRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.monitoring.v3.CreateAlertPolicyRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.monitoring.v3.CreateAlertPolicyRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.monitoring.v3.CreateAlertPolicyRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.monitoring.v3.CreateAlertPolicyRequest parseFrom(
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
  public static Builder newBuilder(com.google.monitoring.v3.CreateAlertPolicyRequest prototype) {
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
   * The protocol for the `CreateAlertPolicy` request.
   * </pre>
   *
   * Protobuf type {@code google.monitoring.v3.CreateAlertPolicyRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.monitoring.v3.CreateAlertPolicyRequest)
      com.google.monitoring.v3.CreateAlertPolicyRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.monitoring.v3.AlertServiceProto.internal_static_google_monitoring_v3_CreateAlertPolicyRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.monitoring.v3.AlertServiceProto.internal_static_google_monitoring_v3_CreateAlertPolicyRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.monitoring.v3.CreateAlertPolicyRequest.class, com.google.monitoring.v3.CreateAlertPolicyRequest.Builder.class);
    }

    // Construct using com.google.monitoring.v3.CreateAlertPolicyRequest.newBuilder()
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
      name_ = "";

      if (alertPolicyBuilder_ == null) {
        alertPolicy_ = null;
      } else {
        alertPolicy_ = null;
        alertPolicyBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.monitoring.v3.AlertServiceProto.internal_static_google_monitoring_v3_CreateAlertPolicyRequest_descriptor;
    }

    public com.google.monitoring.v3.CreateAlertPolicyRequest getDefaultInstanceForType() {
      return com.google.monitoring.v3.CreateAlertPolicyRequest.getDefaultInstance();
    }

    public com.google.monitoring.v3.CreateAlertPolicyRequest build() {
      com.google.monitoring.v3.CreateAlertPolicyRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.monitoring.v3.CreateAlertPolicyRequest buildPartial() {
      com.google.monitoring.v3.CreateAlertPolicyRequest result = new com.google.monitoring.v3.CreateAlertPolicyRequest(this);
      result.name_ = name_;
      if (alertPolicyBuilder_ == null) {
        result.alertPolicy_ = alertPolicy_;
      } else {
        result.alertPolicy_ = alertPolicyBuilder_.build();
      }
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
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
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.monitoring.v3.CreateAlertPolicyRequest) {
        return mergeFrom((com.google.monitoring.v3.CreateAlertPolicyRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.monitoring.v3.CreateAlertPolicyRequest other) {
      if (other == com.google.monitoring.v3.CreateAlertPolicyRequest.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (other.hasAlertPolicy()) {
        mergeAlertPolicy(other.getAlertPolicy());
      }
      this.mergeUnknownFields(other.unknownFields);
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
      com.google.monitoring.v3.CreateAlertPolicyRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.monitoring.v3.CreateAlertPolicyRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     * <pre>
     * The project in which to create the alerting policy. The format is
     * `projects/[PROJECT_ID]`.
     * Note that this field names the parent container in which the alerting
     * policy will be written, not the name of the created policy. The alerting
     * policy that is returned will have a name that contains a normalized
     * representation of this name as a prefix but adds a suffix of the form
     * `/alertPolicies/[POLICY_ID]`, identifying the policy in the container.
     * </pre>
     *
     * <code>string name = 3;</code>
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The project in which to create the alerting policy. The format is
     * `projects/[PROJECT_ID]`.
     * Note that this field names the parent container in which the alerting
     * policy will be written, not the name of the created policy. The alerting
     * policy that is returned will have a name that contains a normalized
     * representation of this name as a prefix but adds a suffix of the form
     * `/alertPolicies/[POLICY_ID]`, identifying the policy in the container.
     * </pre>
     *
     * <code>string name = 3;</code>
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The project in which to create the alerting policy. The format is
     * `projects/[PROJECT_ID]`.
     * Note that this field names the parent container in which the alerting
     * policy will be written, not the name of the created policy. The alerting
     * policy that is returned will have a name that contains a normalized
     * representation of this name as a prefix but adds a suffix of the form
     * `/alertPolicies/[POLICY_ID]`, identifying the policy in the container.
     * </pre>
     *
     * <code>string name = 3;</code>
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The project in which to create the alerting policy. The format is
     * `projects/[PROJECT_ID]`.
     * Note that this field names the parent container in which the alerting
     * policy will be written, not the name of the created policy. The alerting
     * policy that is returned will have a name that contains a normalized
     * representation of this name as a prefix but adds a suffix of the form
     * `/alertPolicies/[POLICY_ID]`, identifying the policy in the container.
     * </pre>
     *
     * <code>string name = 3;</code>
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The project in which to create the alerting policy. The format is
     * `projects/[PROJECT_ID]`.
     * Note that this field names the parent container in which the alerting
     * policy will be written, not the name of the created policy. The alerting
     * policy that is returned will have a name that contains a normalized
     * representation of this name as a prefix but adds a suffix of the form
     * `/alertPolicies/[POLICY_ID]`, identifying the policy in the container.
     * </pre>
     *
     * <code>string name = 3;</code>
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      name_ = value;
      onChanged();
      return this;
    }

    private com.google.monitoring.v3.AlertPolicy alertPolicy_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.monitoring.v3.AlertPolicy, com.google.monitoring.v3.AlertPolicy.Builder, com.google.monitoring.v3.AlertPolicyOrBuilder> alertPolicyBuilder_;
    /**
     * <pre>
     * The requested alerting policy. You should omit the `name` field in this
     * policy. The name will be returned in the new policy, including
     * a new [ALERT_POLICY_ID] value.
     * </pre>
     *
     * <code>.google.monitoring.v3.AlertPolicy alert_policy = 2;</code>
     */
    public boolean hasAlertPolicy() {
      return alertPolicyBuilder_ != null || alertPolicy_ != null;
    }
    /**
     * <pre>
     * The requested alerting policy. You should omit the `name` field in this
     * policy. The name will be returned in the new policy, including
     * a new [ALERT_POLICY_ID] value.
     * </pre>
     *
     * <code>.google.monitoring.v3.AlertPolicy alert_policy = 2;</code>
     */
    public com.google.monitoring.v3.AlertPolicy getAlertPolicy() {
      if (alertPolicyBuilder_ == null) {
        return alertPolicy_ == null ? com.google.monitoring.v3.AlertPolicy.getDefaultInstance() : alertPolicy_;
      } else {
        return alertPolicyBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The requested alerting policy. You should omit the `name` field in this
     * policy. The name will be returned in the new policy, including
     * a new [ALERT_POLICY_ID] value.
     * </pre>
     *
     * <code>.google.monitoring.v3.AlertPolicy alert_policy = 2;</code>
     */
    public Builder setAlertPolicy(com.google.monitoring.v3.AlertPolicy value) {
      if (alertPolicyBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        alertPolicy_ = value;
        onChanged();
      } else {
        alertPolicyBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The requested alerting policy. You should omit the `name` field in this
     * policy. The name will be returned in the new policy, including
     * a new [ALERT_POLICY_ID] value.
     * </pre>
     *
     * <code>.google.monitoring.v3.AlertPolicy alert_policy = 2;</code>
     */
    public Builder setAlertPolicy(
        com.google.monitoring.v3.AlertPolicy.Builder builderForValue) {
      if (alertPolicyBuilder_ == null) {
        alertPolicy_ = builderForValue.build();
        onChanged();
      } else {
        alertPolicyBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The requested alerting policy. You should omit the `name` field in this
     * policy. The name will be returned in the new policy, including
     * a new [ALERT_POLICY_ID] value.
     * </pre>
     *
     * <code>.google.monitoring.v3.AlertPolicy alert_policy = 2;</code>
     */
    public Builder mergeAlertPolicy(com.google.monitoring.v3.AlertPolicy value) {
      if (alertPolicyBuilder_ == null) {
        if (alertPolicy_ != null) {
          alertPolicy_ =
            com.google.monitoring.v3.AlertPolicy.newBuilder(alertPolicy_).mergeFrom(value).buildPartial();
        } else {
          alertPolicy_ = value;
        }
        onChanged();
      } else {
        alertPolicyBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The requested alerting policy. You should omit the `name` field in this
     * policy. The name will be returned in the new policy, including
     * a new [ALERT_POLICY_ID] value.
     * </pre>
     *
     * <code>.google.monitoring.v3.AlertPolicy alert_policy = 2;</code>
     */
    public Builder clearAlertPolicy() {
      if (alertPolicyBuilder_ == null) {
        alertPolicy_ = null;
        onChanged();
      } else {
        alertPolicy_ = null;
        alertPolicyBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The requested alerting policy. You should omit the `name` field in this
     * policy. The name will be returned in the new policy, including
     * a new [ALERT_POLICY_ID] value.
     * </pre>
     *
     * <code>.google.monitoring.v3.AlertPolicy alert_policy = 2;</code>
     */
    public com.google.monitoring.v3.AlertPolicy.Builder getAlertPolicyBuilder() {
      
      onChanged();
      return getAlertPolicyFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The requested alerting policy. You should omit the `name` field in this
     * policy. The name will be returned in the new policy, including
     * a new [ALERT_POLICY_ID] value.
     * </pre>
     *
     * <code>.google.monitoring.v3.AlertPolicy alert_policy = 2;</code>
     */
    public com.google.monitoring.v3.AlertPolicyOrBuilder getAlertPolicyOrBuilder() {
      if (alertPolicyBuilder_ != null) {
        return alertPolicyBuilder_.getMessageOrBuilder();
      } else {
        return alertPolicy_ == null ?
            com.google.monitoring.v3.AlertPolicy.getDefaultInstance() : alertPolicy_;
      }
    }
    /**
     * <pre>
     * The requested alerting policy. You should omit the `name` field in this
     * policy. The name will be returned in the new policy, including
     * a new [ALERT_POLICY_ID] value.
     * </pre>
     *
     * <code>.google.monitoring.v3.AlertPolicy alert_policy = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.monitoring.v3.AlertPolicy, com.google.monitoring.v3.AlertPolicy.Builder, com.google.monitoring.v3.AlertPolicyOrBuilder> 
        getAlertPolicyFieldBuilder() {
      if (alertPolicyBuilder_ == null) {
        alertPolicyBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.monitoring.v3.AlertPolicy, com.google.monitoring.v3.AlertPolicy.Builder, com.google.monitoring.v3.AlertPolicyOrBuilder>(
                getAlertPolicy(),
                getParentForChildren(),
                isClean());
        alertPolicy_ = null;
      }
      return alertPolicyBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.monitoring.v3.CreateAlertPolicyRequest)
  }

  // @@protoc_insertion_point(class_scope:google.monitoring.v3.CreateAlertPolicyRequest)
  private static final com.google.monitoring.v3.CreateAlertPolicyRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.monitoring.v3.CreateAlertPolicyRequest();
  }

  public static com.google.monitoring.v3.CreateAlertPolicyRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateAlertPolicyRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateAlertPolicyRequest>() {
    public CreateAlertPolicyRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CreateAlertPolicyRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CreateAlertPolicyRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateAlertPolicyRequest> getParserForType() {
    return PARSER;
  }

  public com.google.monitoring.v3.CreateAlertPolicyRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
