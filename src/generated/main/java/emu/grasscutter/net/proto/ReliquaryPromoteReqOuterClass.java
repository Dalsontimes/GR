// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ReliquaryPromoteReq.proto

package emu.grasscutter.net.proto;

public final class ReliquaryPromoteReqOuterClass {
  private ReliquaryPromoteReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ReliquaryPromoteReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ReliquaryPromoteReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint64 target_guid = 4;</code>
     * @return The targetGuid.
     */
    long getTargetGuid();

    /**
     * <code>uint64 item_guid = 6;</code>
     * @return The itemGuid.
     */
    long getItemGuid();
  }
  /**
   * <pre>
   * CmdId: 695
   * Name: LCEDADIFDHE
   * </pre>
   *
   * Protobuf type {@code ReliquaryPromoteReq}
   */
  public static final class ReliquaryPromoteReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ReliquaryPromoteReq)
      ReliquaryPromoteReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ReliquaryPromoteReq.newBuilder() to construct.
    private ReliquaryPromoteReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ReliquaryPromoteReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ReliquaryPromoteReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ReliquaryPromoteReq(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
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
            case 32: {

              targetGuid_ = input.readUInt64();
              break;
            }
            case 48: {

              itemGuid_ = input.readUInt64();
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
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
      return emu.grasscutter.net.proto.ReliquaryPromoteReqOuterClass.internal_static_ReliquaryPromoteReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.ReliquaryPromoteReqOuterClass.internal_static_ReliquaryPromoteReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.ReliquaryPromoteReqOuterClass.ReliquaryPromoteReq.class, emu.grasscutter.net.proto.ReliquaryPromoteReqOuterClass.ReliquaryPromoteReq.Builder.class);
    }

    public static final int TARGET_GUID_FIELD_NUMBER = 4;
    private long targetGuid_;
    /**
     * <code>uint64 target_guid = 4;</code>
     * @return The targetGuid.
     */
    @java.lang.Override
    public long getTargetGuid() {
      return targetGuid_;
    }

    public static final int ITEM_GUID_FIELD_NUMBER = 6;
    private long itemGuid_;
    /**
     * <code>uint64 item_guid = 6;</code>
     * @return The itemGuid.
     */
    @java.lang.Override
    public long getItemGuid() {
      return itemGuid_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (targetGuid_ != 0L) {
        output.writeUInt64(4, targetGuid_);
      }
      if (itemGuid_ != 0L) {
        output.writeUInt64(6, itemGuid_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (targetGuid_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(4, targetGuid_);
      }
      if (itemGuid_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(6, itemGuid_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.ReliquaryPromoteReqOuterClass.ReliquaryPromoteReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.ReliquaryPromoteReqOuterClass.ReliquaryPromoteReq other = (emu.grasscutter.net.proto.ReliquaryPromoteReqOuterClass.ReliquaryPromoteReq) obj;

      if (getTargetGuid()
          != other.getTargetGuid()) return false;
      if (getItemGuid()
          != other.getItemGuid()) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + TARGET_GUID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getTargetGuid());
      hash = (37 * hash) + ITEM_GUID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getItemGuid());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.ReliquaryPromoteReqOuterClass.ReliquaryPromoteReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ReliquaryPromoteReqOuterClass.ReliquaryPromoteReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ReliquaryPromoteReqOuterClass.ReliquaryPromoteReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ReliquaryPromoteReqOuterClass.ReliquaryPromoteReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ReliquaryPromoteReqOuterClass.ReliquaryPromoteReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ReliquaryPromoteReqOuterClass.ReliquaryPromoteReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ReliquaryPromoteReqOuterClass.ReliquaryPromoteReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ReliquaryPromoteReqOuterClass.ReliquaryPromoteReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ReliquaryPromoteReqOuterClass.ReliquaryPromoteReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ReliquaryPromoteReqOuterClass.ReliquaryPromoteReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ReliquaryPromoteReqOuterClass.ReliquaryPromoteReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ReliquaryPromoteReqOuterClass.ReliquaryPromoteReq parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(emu.grasscutter.net.proto.ReliquaryPromoteReqOuterClass.ReliquaryPromoteReq prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
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
     * CmdId: 695
     * Name: LCEDADIFDHE
     * </pre>
     *
     * Protobuf type {@code ReliquaryPromoteReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ReliquaryPromoteReq)
        emu.grasscutter.net.proto.ReliquaryPromoteReqOuterClass.ReliquaryPromoteReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.ReliquaryPromoteReqOuterClass.internal_static_ReliquaryPromoteReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.ReliquaryPromoteReqOuterClass.internal_static_ReliquaryPromoteReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.ReliquaryPromoteReqOuterClass.ReliquaryPromoteReq.class, emu.grasscutter.net.proto.ReliquaryPromoteReqOuterClass.ReliquaryPromoteReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.ReliquaryPromoteReqOuterClass.ReliquaryPromoteReq.newBuilder()
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
      @java.lang.Override
      public Builder clear() {
        super.clear();
        targetGuid_ = 0L;

        itemGuid_ = 0L;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.ReliquaryPromoteReqOuterClass.internal_static_ReliquaryPromoteReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ReliquaryPromoteReqOuterClass.ReliquaryPromoteReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.ReliquaryPromoteReqOuterClass.ReliquaryPromoteReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ReliquaryPromoteReqOuterClass.ReliquaryPromoteReq build() {
        emu.grasscutter.net.proto.ReliquaryPromoteReqOuterClass.ReliquaryPromoteReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ReliquaryPromoteReqOuterClass.ReliquaryPromoteReq buildPartial() {
        emu.grasscutter.net.proto.ReliquaryPromoteReqOuterClass.ReliquaryPromoteReq result = new emu.grasscutter.net.proto.ReliquaryPromoteReqOuterClass.ReliquaryPromoteReq(this);
        result.targetGuid_ = targetGuid_;
        result.itemGuid_ = itemGuid_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof emu.grasscutter.net.proto.ReliquaryPromoteReqOuterClass.ReliquaryPromoteReq) {
          return mergeFrom((emu.grasscutter.net.proto.ReliquaryPromoteReqOuterClass.ReliquaryPromoteReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.ReliquaryPromoteReqOuterClass.ReliquaryPromoteReq other) {
        if (other == emu.grasscutter.net.proto.ReliquaryPromoteReqOuterClass.ReliquaryPromoteReq.getDefaultInstance()) return this;
        if (other.getTargetGuid() != 0L) {
          setTargetGuid(other.getTargetGuid());
        }
        if (other.getItemGuid() != 0L) {
          setItemGuid(other.getItemGuid());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        emu.grasscutter.net.proto.ReliquaryPromoteReqOuterClass.ReliquaryPromoteReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.ReliquaryPromoteReqOuterClass.ReliquaryPromoteReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private long targetGuid_ ;
      /**
       * <code>uint64 target_guid = 4;</code>
       * @return The targetGuid.
       */
      @java.lang.Override
      public long getTargetGuid() {
        return targetGuid_;
      }
      /**
       * <code>uint64 target_guid = 4;</code>
       * @param value The targetGuid to set.
       * @return This builder for chaining.
       */
      public Builder setTargetGuid(long value) {
        
        targetGuid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 target_guid = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearTargetGuid() {
        
        targetGuid_ = 0L;
        onChanged();
        return this;
      }

      private long itemGuid_ ;
      /**
       * <code>uint64 item_guid = 6;</code>
       * @return The itemGuid.
       */
      @java.lang.Override
      public long getItemGuid() {
        return itemGuid_;
      }
      /**
       * <code>uint64 item_guid = 6;</code>
       * @param value The itemGuid to set.
       * @return This builder for chaining.
       */
      public Builder setItemGuid(long value) {
        
        itemGuid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 item_guid = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearItemGuid() {
        
        itemGuid_ = 0L;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:ReliquaryPromoteReq)
    }

    // @@protoc_insertion_point(class_scope:ReliquaryPromoteReq)
    private static final emu.grasscutter.net.proto.ReliquaryPromoteReqOuterClass.ReliquaryPromoteReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.ReliquaryPromoteReqOuterClass.ReliquaryPromoteReq();
    }

    public static emu.grasscutter.net.proto.ReliquaryPromoteReqOuterClass.ReliquaryPromoteReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ReliquaryPromoteReq>
        PARSER = new com.google.protobuf.AbstractParser<ReliquaryPromoteReq>() {
      @java.lang.Override
      public ReliquaryPromoteReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ReliquaryPromoteReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ReliquaryPromoteReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ReliquaryPromoteReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.ReliquaryPromoteReqOuterClass.ReliquaryPromoteReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ReliquaryPromoteReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ReliquaryPromoteReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031ReliquaryPromoteReq.proto\"=\n\023Reliquary" +
      "PromoteReq\022\023\n\013target_guid\030\004 \001(\004\022\021\n\titem_" +
      "guid\030\006 \001(\004B!\n\031emu.grasscutter.net.protoZ" +
      "\004/genb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ReliquaryPromoteReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ReliquaryPromoteReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ReliquaryPromoteReq_descriptor,
        new java.lang.String[] { "TargetGuid", "ItemGuid", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
