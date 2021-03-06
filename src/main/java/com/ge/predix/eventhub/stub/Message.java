// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: EventHub.proto

package com.ge.predix.eventhub.stub;

/**
 * Protobuf type {@code predix.eventhub.Message}
 */
public  final class Message extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:predix.eventhub.Message)
    MessageOrBuilder {
  // Use Message.newBuilder() to construct.
  private Message(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private Message() {
    id_ = "";
    body_ = com.google.protobuf.ByteString.EMPTY;
    zoneId_ = "";
    key_ = com.google.protobuf.ByteString.EMPTY;
    topic_ = "";
    partition_ = 0;
    offset_ = 0L;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private Message(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry) {
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

            id_ = s;
            break;
          }
          case 18: {

            body_ = input.readBytes();
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            zoneId_ = s;
            break;
          }
          case 34: {
            if (!((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
              tags_ = com.google.protobuf.MapField.newMapField(
                  TagsDefaultEntryHolder.defaultEntry);
              mutable_bitField0_ |= 0x00000008;
            }
            com.google.protobuf.MapEntry<java.lang.String, java.lang.String>
            tags = input.readMessage(
                TagsDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
            tags_.getMutableMap().put(tags.getKey(), tags.getValue());
            break;
          }
          case 42: {

            key_ = input.readBytes();
            break;
          }
          case 50: {
            java.lang.String s = input.readStringRequireUtf8();

            topic_ = s;
            break;
          }
          case 56: {

            partition_ = input.readInt32();
            break;
          }
          case 64: {

            offset_ = input.readInt64();
            break;
          }
          case 74: {
            com.ge.predix.eventhub.stub.Timestamp.Builder subBuilder = null;
            if (timestamp_ != null) {
              subBuilder = timestamp_.toBuilder();
            }
            timestamp_ = input.readMessage(com.ge.predix.eventhub.stub.Timestamp.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(timestamp_);
              timestamp_ = subBuilder.buildPartial();
            }

            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw new RuntimeException(e.setUnfinishedMessage(this));
    } catch (java.io.IOException e) {
      throw new RuntimeException(
          new com.google.protobuf.InvalidProtocolBufferException(
              e.getMessage()).setUnfinishedMessage(this));
    } finally {
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.ge.predix.eventhub.stub.EventHubService.internal_static_predix_eventhub_Message_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  protected com.google.protobuf.MapField internalGetMapField(
      int number) {
    switch (number) {
      case 4:
        return internalGetTags();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.ge.predix.eventhub.stub.EventHubService.internal_static_predix_eventhub_Message_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.ge.predix.eventhub.stub.Message.class, com.ge.predix.eventhub.stub.Message.Builder.class);
  }

  private int bitField0_;
  public static final int ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object id_;
  /**
   * <code>optional string id = 1;</code>
   *
   * <pre>
   * Message ID - UUID
   * </pre>
   */
  public java.lang.String getId() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      id_ = s;
      return s;
    }
  }
  /**
   * <code>optional string id = 1;</code>
   *
   * <pre>
   * Message ID - UUID
   * </pre>
   */
  public com.google.protobuf.ByteString
      getIdBytes() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      id_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int BODY_FIELD_NUMBER = 2;
  private com.google.protobuf.ByteString body_;
  /**
   * <code>optional bytes body = 2;</code>
   *
   * <pre>
   * Payload from the Producer. there is also "Any" type, but its still under development
   * </pre>
   */
  public com.google.protobuf.ByteString getBody() {
    return body_;
  }

  public static final int ZONE_ID_FIELD_NUMBER = 3;
  private volatile java.lang.Object zoneId_;
  /**
   * <code>optional string zone_id = 3;</code>
   */
  public java.lang.String getZoneId() {
    java.lang.Object ref = zoneId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      zoneId_ = s;
      return s;
    }
  }
  /**
   * <code>optional string zone_id = 3;</code>
   */
  public com.google.protobuf.ByteString
      getZoneIdBytes() {
    java.lang.Object ref = zoneId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      zoneId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TAGS_FIELD_NUMBER = 4;
  private static final class TagsDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.String, java.lang.String> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.String, java.lang.String>newDefaultInstance(
                com.ge.predix.eventhub.stub.EventHubService.internal_static_predix_eventhub_Message_TagsEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.STRING,
                "",
                com.google.protobuf.WireFormat.FieldType.STRING,
                "");
  }
  private com.google.protobuf.MapField<
      java.lang.String, java.lang.String> tags_;
  private com.google.protobuf.MapField<java.lang.String, java.lang.String>
  internalGetTags() {
    if (tags_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          TagsDefaultEntryHolder.defaultEntry);
   }
    return tags_;
  }
  /**
   * <code>map&lt;string, string&gt; tags = 4;</code>
   *
   * <pre>
   * Some general attributes, could potentially be used for tagging and others
   * </pre>
   */

  public java.util.Map<java.lang.String, java.lang.String> getTags() {
    return internalGetTags().getMap();
  }

  public static final int KEY_FIELD_NUMBER = 5;
  private com.google.protobuf.ByteString key_;
  /**
   * <code>optional bytes key = 5;</code>
   */
  public com.google.protobuf.ByteString getKey() {
    return key_;
  }

  public static final int TOPIC_FIELD_NUMBER = 6;
  private volatile java.lang.Object topic_;
  /**
   * <code>optional string topic = 6;</code>
   */
  public java.lang.String getTopic() {
    java.lang.Object ref = topic_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      topic_ = s;
      return s;
    }
  }
  /**
   * <code>optional string topic = 6;</code>
   */
  public com.google.protobuf.ByteString
      getTopicBytes() {
    java.lang.Object ref = topic_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      topic_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PARTITION_FIELD_NUMBER = 7;
  private int partition_;
  /**
   * <code>optional int32 partition = 7;</code>
   */
  public int getPartition() {
    return partition_;
  }

  public static final int OFFSET_FIELD_NUMBER = 8;
  private long offset_;
  /**
   * <code>optional int64 offset = 8;</code>
   */
  public long getOffset() {
    return offset_;
  }

  public static final int TIMESTAMP_FIELD_NUMBER = 9;
  private com.ge.predix.eventhub.stub.Timestamp timestamp_;
  /**
   * <code>optional .predix.eventhub.Timestamp timestamp = 9;</code>
   */
  public boolean hasTimestamp() {
    return timestamp_ != null;
  }
  /**
   * <code>optional .predix.eventhub.Timestamp timestamp = 9;</code>
   */
  public com.ge.predix.eventhub.stub.Timestamp getTimestamp() {
    return timestamp_ == null ? com.ge.predix.eventhub.stub.Timestamp.getDefaultInstance() : timestamp_;
  }
  /**
   * <code>optional .predix.eventhub.Timestamp timestamp = 9;</code>
   */
  public com.ge.predix.eventhub.stub.TimestampOrBuilder getTimestampOrBuilder() {
    return getTimestamp();
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
    if (!getIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessage.writeString(output, 1, id_);
    }
    if (!body_.isEmpty()) {
      output.writeBytes(2, body_);
    }
    if (!getZoneIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessage.writeString(output, 3, zoneId_);
    }
    for (java.util.Map.Entry<java.lang.String, java.lang.String> entry
         : internalGetTags().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, java.lang.String>
      tags = TagsDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      output.writeMessage(4, tags);
    }
    if (!key_.isEmpty()) {
      output.writeBytes(5, key_);
    }
    if (!getTopicBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessage.writeString(output, 6, topic_);
    }
    if (partition_ != 0) {
      output.writeInt32(7, partition_);
    }
    if (offset_ != 0L) {
      output.writeInt64(8, offset_);
    }
    if (timestamp_ != null) {
      output.writeMessage(9, getTimestamp());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(1, id_);
    }
    if (!body_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(2, body_);
    }
    if (!getZoneIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(3, zoneId_);
    }
    for (java.util.Map.Entry<java.lang.String, java.lang.String> entry
         : internalGetTags().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, java.lang.String>
      tags = TagsDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(4, tags);
    }
    if (!key_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(5, key_);
    }
    if (!getTopicBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(6, topic_);
    }
    if (partition_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(7, partition_);
    }
    if (offset_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(8, offset_);
    }
    if (timestamp_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(9, getTimestamp());
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  public static com.ge.predix.eventhub.stub.Message parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ge.predix.eventhub.stub.Message parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ge.predix.eventhub.stub.Message parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ge.predix.eventhub.stub.Message parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ge.predix.eventhub.stub.Message parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.ge.predix.eventhub.stub.Message parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static com.ge.predix.eventhub.stub.Message parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static com.ge.predix.eventhub.stub.Message parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static com.ge.predix.eventhub.stub.Message parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.ge.predix.eventhub.stub.Message parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.ge.predix.eventhub.stub.Message prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessage.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code predix.eventhub.Message}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:predix.eventhub.Message)
      com.ge.predix.eventhub.stub.MessageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.ge.predix.eventhub.stub.EventHubService.internal_static_predix_eventhub_Message_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 4:
          return internalGetTags();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(
        int number) {
      switch (number) {
        case 4:
          return internalGetMutableTags();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.ge.predix.eventhub.stub.EventHubService.internal_static_predix_eventhub_Message_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.ge.predix.eventhub.stub.Message.class, com.ge.predix.eventhub.stub.Message.Builder.class);
    }

    // Construct using com.ge.predix.eventhub.stub.Message.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      id_ = "";

      body_ = com.google.protobuf.ByteString.EMPTY;

      zoneId_ = "";

      internalGetMutableTags().clear();
      key_ = com.google.protobuf.ByteString.EMPTY;

      topic_ = "";

      partition_ = 0;

      offset_ = 0L;

      if (timestampBuilder_ == null) {
        timestamp_ = null;
      } else {
        timestamp_ = null;
        timestampBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.ge.predix.eventhub.stub.EventHubService.internal_static_predix_eventhub_Message_descriptor;
    }

    public com.ge.predix.eventhub.stub.Message getDefaultInstanceForType() {
      return com.ge.predix.eventhub.stub.Message.getDefaultInstance();
    }

    public com.ge.predix.eventhub.stub.Message build() {
      com.ge.predix.eventhub.stub.Message result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.ge.predix.eventhub.stub.Message buildPartial() {
      com.ge.predix.eventhub.stub.Message result = new com.ge.predix.eventhub.stub.Message(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.id_ = id_;
      result.body_ = body_;
      result.zoneId_ = zoneId_;
      result.tags_ = internalGetTags();
      result.tags_.makeImmutable();
      result.key_ = key_;
      result.topic_ = topic_;
      result.partition_ = partition_;
      result.offset_ = offset_;
      if (timestampBuilder_ == null) {
        result.timestamp_ = timestamp_;
      } else {
        result.timestamp_ = timestampBuilder_.build();
      }
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.ge.predix.eventhub.stub.Message) {
        return mergeFrom((com.ge.predix.eventhub.stub.Message)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.ge.predix.eventhub.stub.Message other) {
      if (other == com.ge.predix.eventhub.stub.Message.getDefaultInstance()) return this;
      if (!other.getId().isEmpty()) {
        id_ = other.id_;
        onChanged();
      }
      if (other.getBody() != com.google.protobuf.ByteString.EMPTY) {
        setBody(other.getBody());
      }
      if (!other.getZoneId().isEmpty()) {
        zoneId_ = other.zoneId_;
        onChanged();
      }
      internalGetMutableTags().mergeFrom(
          other.internalGetTags());
      if (other.getKey() != com.google.protobuf.ByteString.EMPTY) {
        setKey(other.getKey());
      }
      if (!other.getTopic().isEmpty()) {
        topic_ = other.topic_;
        onChanged();
      }
      if (other.getPartition() != 0) {
        setPartition(other.getPartition());
      }
      if (other.getOffset() != 0L) {
        setOffset(other.getOffset());
      }
      if (other.hasTimestamp()) {
        mergeTimestamp(other.getTimestamp());
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
      com.ge.predix.eventhub.stub.Message parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.ge.predix.eventhub.stub.Message) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object id_ = "";
    /**
     * <code>optional string id = 1;</code>
     *
     * <pre>
     * Message ID - UUID
     * </pre>
     */
    public java.lang.String getId() {
      java.lang.Object ref = id_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        id_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string id = 1;</code>
     *
     * <pre>
     * Message ID - UUID
     * </pre>
     */
    public com.google.protobuf.ByteString
        getIdBytes() {
      java.lang.Object ref = id_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        id_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string id = 1;</code>
     *
     * <pre>
     * Message ID - UUID
     * </pre>
     */
    public Builder setId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string id = 1;</code>
     *
     * <pre>
     * Message ID - UUID
     * </pre>
     */
    public Builder clearId() {
      
      id_ = getDefaultInstance().getId();
      onChanged();
      return this;
    }
    /**
     * <code>optional string id = 1;</code>
     *
     * <pre>
     * Message ID - UUID
     * </pre>
     */
    public Builder setIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      id_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString body_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>optional bytes body = 2;</code>
     *
     * <pre>
     * Payload from the Producer. there is also "Any" type, but its still under development
     * </pre>
     */
    public com.google.protobuf.ByteString getBody() {
      return body_;
    }
    /**
     * <code>optional bytes body = 2;</code>
     *
     * <pre>
     * Payload from the Producer. there is also "Any" type, but its still under development
     * </pre>
     */
    public Builder setBody(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      body_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional bytes body = 2;</code>
     *
     * <pre>
     * Payload from the Producer. there is also "Any" type, but its still under development
     * </pre>
     */
    public Builder clearBody() {
      
      body_ = getDefaultInstance().getBody();
      onChanged();
      return this;
    }

    private java.lang.Object zoneId_ = "";
    /**
     * <code>optional string zone_id = 3;</code>
     */
    public java.lang.String getZoneId() {
      java.lang.Object ref = zoneId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        zoneId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string zone_id = 3;</code>
     */
    public com.google.protobuf.ByteString
        getZoneIdBytes() {
      java.lang.Object ref = zoneId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        zoneId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string zone_id = 3;</code>
     */
    public Builder setZoneId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      zoneId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string zone_id = 3;</code>
     */
    public Builder clearZoneId() {
      
      zoneId_ = getDefaultInstance().getZoneId();
      onChanged();
      return this;
    }
    /**
     * <code>optional string zone_id = 3;</code>
     */
    public Builder setZoneIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      zoneId_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.MapField<
        java.lang.String, java.lang.String> tags_;
    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
    internalGetTags() {
      if (tags_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            TagsDefaultEntryHolder.defaultEntry);
     }
      return tags_;
    }
    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
    internalGetMutableTags() {
      onChanged();;
      if (tags_ == null) {
        tags_ = com.google.protobuf.MapField.newMapField(
            TagsDefaultEntryHolder.defaultEntry);
      }
      if (!tags_.isMutable()) {
        tags_ = tags_.copy();
      }
      return tags_;
    }
    /**
     * <code>map&lt;string, string&gt; tags = 4;</code>
     *
     * <pre>
     * Some general attributes, could potentially be used for tagging and others
     * </pre>
     */
    public java.util.Map<java.lang.String, java.lang.String> getTags() {
      return internalGetTags().getMap();
    }
    /**
     * <code>map&lt;string, string&gt; tags = 4;</code>
     *
     * <pre>
     * Some general attributes, could potentially be used for tagging and others
     * </pre>
     */
    public java.util.Map<java.lang.String, java.lang.String>
    getMutableTags() {
      return internalGetMutableTags().getMutableMap();
    }
    /**
     * <code>map&lt;string, string&gt; tags = 4;</code>
     *
     * <pre>
     * Some general attributes, could potentially be used for tagging and others
     * </pre>
     */
    public Builder putAllTags(
        java.util.Map<java.lang.String, java.lang.String> values) {
      getMutableTags().putAll(values);
      return this;
    }

    private com.google.protobuf.ByteString key_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>optional bytes key = 5;</code>
     */
    public com.google.protobuf.ByteString getKey() {
      return key_;
    }
    /**
     * <code>optional bytes key = 5;</code>
     */
    public Builder setKey(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      key_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional bytes key = 5;</code>
     */
    public Builder clearKey() {
      
      key_ = getDefaultInstance().getKey();
      onChanged();
      return this;
    }

    private java.lang.Object topic_ = "";
    /**
     * <code>optional string topic = 6;</code>
     */
    public java.lang.String getTopic() {
      java.lang.Object ref = topic_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        topic_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string topic = 6;</code>
     */
    public com.google.protobuf.ByteString
        getTopicBytes() {
      java.lang.Object ref = topic_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        topic_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string topic = 6;</code>
     */
    public Builder setTopic(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      topic_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string topic = 6;</code>
     */
    public Builder clearTopic() {
      
      topic_ = getDefaultInstance().getTopic();
      onChanged();
      return this;
    }
    /**
     * <code>optional string topic = 6;</code>
     */
    public Builder setTopicBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      topic_ = value;
      onChanged();
      return this;
    }

    private int partition_ ;
    /**
     * <code>optional int32 partition = 7;</code>
     */
    public int getPartition() {
      return partition_;
    }
    /**
     * <code>optional int32 partition = 7;</code>
     */
    public Builder setPartition(int value) {
      
      partition_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 partition = 7;</code>
     */
    public Builder clearPartition() {
      
      partition_ = 0;
      onChanged();
      return this;
    }

    private long offset_ ;
    /**
     * <code>optional int64 offset = 8;</code>
     */
    public long getOffset() {
      return offset_;
    }
    /**
     * <code>optional int64 offset = 8;</code>
     */
    public Builder setOffset(long value) {
      
      offset_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int64 offset = 8;</code>
     */
    public Builder clearOffset() {
      
      offset_ = 0L;
      onChanged();
      return this;
    }

    private com.ge.predix.eventhub.stub.Timestamp timestamp_ = null;
    private com.google.protobuf.SingleFieldBuilder<
        com.ge.predix.eventhub.stub.Timestamp, com.ge.predix.eventhub.stub.Timestamp.Builder, com.ge.predix.eventhub.stub.TimestampOrBuilder> timestampBuilder_;
    /**
     * <code>optional .predix.eventhub.Timestamp timestamp = 9;</code>
     */
    public boolean hasTimestamp() {
      return timestampBuilder_ != null || timestamp_ != null;
    }
    /**
     * <code>optional .predix.eventhub.Timestamp timestamp = 9;</code>
     */
    public com.ge.predix.eventhub.stub.Timestamp getTimestamp() {
      if (timestampBuilder_ == null) {
        return timestamp_ == null ? com.ge.predix.eventhub.stub.Timestamp.getDefaultInstance() : timestamp_;
      } else {
        return timestampBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .predix.eventhub.Timestamp timestamp = 9;</code>
     */
    public Builder setTimestamp(com.ge.predix.eventhub.stub.Timestamp value) {
      if (timestampBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        timestamp_ = value;
        onChanged();
      } else {
        timestampBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>optional .predix.eventhub.Timestamp timestamp = 9;</code>
     */
    public Builder setTimestamp(
        com.ge.predix.eventhub.stub.Timestamp.Builder builderForValue) {
      if (timestampBuilder_ == null) {
        timestamp_ = builderForValue.build();
        onChanged();
      } else {
        timestampBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>optional .predix.eventhub.Timestamp timestamp = 9;</code>
     */
    public Builder mergeTimestamp(com.ge.predix.eventhub.stub.Timestamp value) {
      if (timestampBuilder_ == null) {
        if (timestamp_ != null) {
          timestamp_ =
            com.ge.predix.eventhub.stub.Timestamp.newBuilder(timestamp_).mergeFrom(value).buildPartial();
        } else {
          timestamp_ = value;
        }
        onChanged();
      } else {
        timestampBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>optional .predix.eventhub.Timestamp timestamp = 9;</code>
     */
    public Builder clearTimestamp() {
      if (timestampBuilder_ == null) {
        timestamp_ = null;
        onChanged();
      } else {
        timestamp_ = null;
        timestampBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>optional .predix.eventhub.Timestamp timestamp = 9;</code>
     */
    public com.ge.predix.eventhub.stub.Timestamp.Builder getTimestampBuilder() {
      
      onChanged();
      return getTimestampFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .predix.eventhub.Timestamp timestamp = 9;</code>
     */
    public com.ge.predix.eventhub.stub.TimestampOrBuilder getTimestampOrBuilder() {
      if (timestampBuilder_ != null) {
        return timestampBuilder_.getMessageOrBuilder();
      } else {
        return timestamp_ == null ?
            com.ge.predix.eventhub.stub.Timestamp.getDefaultInstance() : timestamp_;
      }
    }
    /**
     * <code>optional .predix.eventhub.Timestamp timestamp = 9;</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        com.ge.predix.eventhub.stub.Timestamp, com.ge.predix.eventhub.stub.Timestamp.Builder, com.ge.predix.eventhub.stub.TimestampOrBuilder> 
        getTimestampFieldBuilder() {
      if (timestampBuilder_ == null) {
        timestampBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            com.ge.predix.eventhub.stub.Timestamp, com.ge.predix.eventhub.stub.Timestamp.Builder, com.ge.predix.eventhub.stub.TimestampOrBuilder>(
                getTimestamp(),
                getParentForChildren(),
                isClean());
        timestamp_ = null;
      }
      return timestampBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:predix.eventhub.Message)
  }

  // @@protoc_insertion_point(class_scope:predix.eventhub.Message)
  private static final com.ge.predix.eventhub.stub.Message DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.ge.predix.eventhub.stub.Message();
  }

  public static com.ge.predix.eventhub.stub.Message getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Message>
      PARSER = new com.google.protobuf.AbstractParser<Message>() {
    public Message parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      try {
        return new Message(input, extensionRegistry);
      } catch (RuntimeException e) {
        if (e.getCause() instanceof
            com.google.protobuf.InvalidProtocolBufferException) {
          throw (com.google.protobuf.InvalidProtocolBufferException)
              e.getCause();
        }
        throw e;
      }
    }
  };

  public static com.google.protobuf.Parser<Message> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Message> getParserForType() {
    return PARSER;
  }

  public com.ge.predix.eventhub.stub.Message getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

