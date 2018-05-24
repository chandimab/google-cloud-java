// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2beta1/session_entity_type.proto

package com.google.cloud.dialogflow.v2beta1;

public interface SessionEntityTypeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2beta1.SessionEntityType)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The unique identifier of this session entity type. Format:
   * `projects/&lt;Project ID&gt;/agent/sessions/&lt;Session ID&gt;/entityTypes/&lt;Entity Type
   * Display Name&gt;`, or
   * `projects/&lt;Project ID&gt;/agent/environments/&lt;Environment ID&gt;/users/&lt;User
   * ID&gt;/sessions
   * /&lt;Session ID&gt;/entityTypes/&lt;Entity Type Display Name&gt;`.
   * Note: Environments and users are under construction and will be available
   * soon. If &lt;Environment ID&gt; is not specified, we assume default 'draft'
   * environment. If &lt;User ID&gt; is not specified, we assume default '-' user.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. The unique identifier of this session entity type. Format:
   * `projects/&lt;Project ID&gt;/agent/sessions/&lt;Session ID&gt;/entityTypes/&lt;Entity Type
   * Display Name&gt;`, or
   * `projects/&lt;Project ID&gt;/agent/environments/&lt;Environment ID&gt;/users/&lt;User
   * ID&gt;/sessions
   * /&lt;Session ID&gt;/entityTypes/&lt;Entity Type Display Name&gt;`.
   * Note: Environments and users are under construction and will be available
   * soon. If &lt;Environment ID&gt; is not specified, we assume default 'draft'
   * environment. If &lt;User ID&gt; is not specified, we assume default '-' user.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Required. Indicates whether the additional data should override or
   * supplement the developer entity type definition.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.SessionEntityType.EntityOverrideMode entity_override_mode = 2;</code>
   */
  int getEntityOverrideModeValue();
  /**
   * <pre>
   * Required. Indicates whether the additional data should override or
   * supplement the developer entity type definition.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.SessionEntityType.EntityOverrideMode entity_override_mode = 2;</code>
   */
  com.google.cloud.dialogflow.v2beta1.SessionEntityType.EntityOverrideMode getEntityOverrideMode();

  /**
   * <pre>
   * Required. The collection of entities associated with this session entity
   * type.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.EntityType.Entity entities = 3;</code>
   */
  java.util.List<com.google.cloud.dialogflow.v2beta1.EntityType.Entity> 
      getEntitiesList();
  /**
   * <pre>
   * Required. The collection of entities associated with this session entity
   * type.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.EntityType.Entity entities = 3;</code>
   */
  com.google.cloud.dialogflow.v2beta1.EntityType.Entity getEntities(int index);
  /**
   * <pre>
   * Required. The collection of entities associated with this session entity
   * type.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.EntityType.Entity entities = 3;</code>
   */
  int getEntitiesCount();
  /**
   * <pre>
   * Required. The collection of entities associated with this session entity
   * type.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.EntityType.Entity entities = 3;</code>
   */
  java.util.List<? extends com.google.cloud.dialogflow.v2beta1.EntityType.EntityOrBuilder> 
      getEntitiesOrBuilderList();
  /**
   * <pre>
   * Required. The collection of entities associated with this session entity
   * type.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.EntityType.Entity entities = 3;</code>
   */
  com.google.cloud.dialogflow.v2beta1.EntityType.EntityOrBuilder getEntitiesOrBuilder(
      int index);
}