// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PotionActivityDetailInfo.proto

package emu.grasscutter.net.proto;

public final class PotionActivityDetailInfoOuterClass {
  private PotionActivityDetailInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PotionActivityDetailInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:PotionActivityDetailInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .PotionStageData stage_list = 3;</code>
     */
    java.util.List<emu.grasscutter.net.proto.PotionStageDataOuterClass.PotionStageData> 
        getStageListList();
    /**
     * <code>repeated .PotionStageData stage_list = 3;</code>
     */
    emu.grasscutter.net.proto.PotionStageDataOuterClass.PotionStageData getStageList(int index);
    /**
     * <code>repeated .PotionStageData stage_list = 3;</code>
     */
    int getStageListCount();
    /**
     * <code>repeated .PotionStageData stage_list = 3;</code>
     */
    java.util.List<? extends emu.grasscutter.net.proto.PotionStageDataOuterClass.PotionStageDataOrBuilder> 
        getStageListOrBuilderList();
    /**
     * <code>repeated .PotionStageData stage_list = 3;</code>
     */
    emu.grasscutter.net.proto.PotionStageDataOuterClass.PotionStageDataOrBuilder getStageListOrBuilder(
        int index);
  }
  /**
   * <pre>
   * Name: JBNODGBKCKE
   * </pre>
   *
   * Protobuf type {@code PotionActivityDetailInfo}
   */
  public static final class PotionActivityDetailInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:PotionActivityDetailInfo)
      PotionActivityDetailInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use PotionActivityDetailInfo.newBuilder() to construct.
    private PotionActivityDetailInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PotionActivityDetailInfo() {
      stageList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new PotionActivityDetailInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private PotionActivityDetailInfo(
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
            case 26: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                stageList_ = new java.util.ArrayList<emu.grasscutter.net.proto.PotionStageDataOuterClass.PotionStageData>();
                mutable_bitField0_ |= 0x00000001;
              }
              stageList_.add(
                  input.readMessage(emu.grasscutter.net.proto.PotionStageDataOuterClass.PotionStageData.parser(), extensionRegistry));
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
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          stageList_ = java.util.Collections.unmodifiableList(stageList_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.PotionActivityDetailInfoOuterClass.internal_static_PotionActivityDetailInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.PotionActivityDetailInfoOuterClass.internal_static_PotionActivityDetailInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.PotionActivityDetailInfoOuterClass.PotionActivityDetailInfo.class, emu.grasscutter.net.proto.PotionActivityDetailInfoOuterClass.PotionActivityDetailInfo.Builder.class);
    }

    public static final int STAGE_LIST_FIELD_NUMBER = 3;
    private java.util.List<emu.grasscutter.net.proto.PotionStageDataOuterClass.PotionStageData> stageList_;
    /**
     * <code>repeated .PotionStageData stage_list = 3;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.proto.PotionStageDataOuterClass.PotionStageData> getStageListList() {
      return stageList_;
    }
    /**
     * <code>repeated .PotionStageData stage_list = 3;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.proto.PotionStageDataOuterClass.PotionStageDataOrBuilder> 
        getStageListOrBuilderList() {
      return stageList_;
    }
    /**
     * <code>repeated .PotionStageData stage_list = 3;</code>
     */
    @java.lang.Override
    public int getStageListCount() {
      return stageList_.size();
    }
    /**
     * <code>repeated .PotionStageData stage_list = 3;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.PotionStageDataOuterClass.PotionStageData getStageList(int index) {
      return stageList_.get(index);
    }
    /**
     * <code>repeated .PotionStageData stage_list = 3;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.PotionStageDataOuterClass.PotionStageDataOrBuilder getStageListOrBuilder(
        int index) {
      return stageList_.get(index);
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
      for (int i = 0; i < stageList_.size(); i++) {
        output.writeMessage(3, stageList_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < stageList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, stageList_.get(i));
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
      if (!(obj instanceof emu.grasscutter.net.proto.PotionActivityDetailInfoOuterClass.PotionActivityDetailInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.PotionActivityDetailInfoOuterClass.PotionActivityDetailInfo other = (emu.grasscutter.net.proto.PotionActivityDetailInfoOuterClass.PotionActivityDetailInfo) obj;

      if (!getStageListList()
          .equals(other.getStageListList())) return false;
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
      if (getStageListCount() > 0) {
        hash = (37 * hash) + STAGE_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getStageListList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.PotionActivityDetailInfoOuterClass.PotionActivityDetailInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PotionActivityDetailInfoOuterClass.PotionActivityDetailInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PotionActivityDetailInfoOuterClass.PotionActivityDetailInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PotionActivityDetailInfoOuterClass.PotionActivityDetailInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PotionActivityDetailInfoOuterClass.PotionActivityDetailInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PotionActivityDetailInfoOuterClass.PotionActivityDetailInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PotionActivityDetailInfoOuterClass.PotionActivityDetailInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PotionActivityDetailInfoOuterClass.PotionActivityDetailInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PotionActivityDetailInfoOuterClass.PotionActivityDetailInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PotionActivityDetailInfoOuterClass.PotionActivityDetailInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PotionActivityDetailInfoOuterClass.PotionActivityDetailInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PotionActivityDetailInfoOuterClass.PotionActivityDetailInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.PotionActivityDetailInfoOuterClass.PotionActivityDetailInfo prototype) {
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
     * Name: JBNODGBKCKE
     * </pre>
     *
     * Protobuf type {@code PotionActivityDetailInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:PotionActivityDetailInfo)
        emu.grasscutter.net.proto.PotionActivityDetailInfoOuterClass.PotionActivityDetailInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.PotionActivityDetailInfoOuterClass.internal_static_PotionActivityDetailInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.PotionActivityDetailInfoOuterClass.internal_static_PotionActivityDetailInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.PotionActivityDetailInfoOuterClass.PotionActivityDetailInfo.class, emu.grasscutter.net.proto.PotionActivityDetailInfoOuterClass.PotionActivityDetailInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.PotionActivityDetailInfoOuterClass.PotionActivityDetailInfo.newBuilder()
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
          getStageListFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (stageListBuilder_ == null) {
          stageList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          stageListBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.PotionActivityDetailInfoOuterClass.internal_static_PotionActivityDetailInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PotionActivityDetailInfoOuterClass.PotionActivityDetailInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.PotionActivityDetailInfoOuterClass.PotionActivityDetailInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PotionActivityDetailInfoOuterClass.PotionActivityDetailInfo build() {
        emu.grasscutter.net.proto.PotionActivityDetailInfoOuterClass.PotionActivityDetailInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PotionActivityDetailInfoOuterClass.PotionActivityDetailInfo buildPartial() {
        emu.grasscutter.net.proto.PotionActivityDetailInfoOuterClass.PotionActivityDetailInfo result = new emu.grasscutter.net.proto.PotionActivityDetailInfoOuterClass.PotionActivityDetailInfo(this);
        int from_bitField0_ = bitField0_;
        if (stageListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            stageList_ = java.util.Collections.unmodifiableList(stageList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.stageList_ = stageList_;
        } else {
          result.stageList_ = stageListBuilder_.build();
        }
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
        if (other instanceof emu.grasscutter.net.proto.PotionActivityDetailInfoOuterClass.PotionActivityDetailInfo) {
          return mergeFrom((emu.grasscutter.net.proto.PotionActivityDetailInfoOuterClass.PotionActivityDetailInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.PotionActivityDetailInfoOuterClass.PotionActivityDetailInfo other) {
        if (other == emu.grasscutter.net.proto.PotionActivityDetailInfoOuterClass.PotionActivityDetailInfo.getDefaultInstance()) return this;
        if (stageListBuilder_ == null) {
          if (!other.stageList_.isEmpty()) {
            if (stageList_.isEmpty()) {
              stageList_ = other.stageList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureStageListIsMutable();
              stageList_.addAll(other.stageList_);
            }
            onChanged();
          }
        } else {
          if (!other.stageList_.isEmpty()) {
            if (stageListBuilder_.isEmpty()) {
              stageListBuilder_.dispose();
              stageListBuilder_ = null;
              stageList_ = other.stageList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              stageListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getStageListFieldBuilder() : null;
            } else {
              stageListBuilder_.addAllMessages(other.stageList_);
            }
          }
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
        emu.grasscutter.net.proto.PotionActivityDetailInfoOuterClass.PotionActivityDetailInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.PotionActivityDetailInfoOuterClass.PotionActivityDetailInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<emu.grasscutter.net.proto.PotionStageDataOuterClass.PotionStageData> stageList_ =
        java.util.Collections.emptyList();
      private void ensureStageListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          stageList_ = new java.util.ArrayList<emu.grasscutter.net.proto.PotionStageDataOuterClass.PotionStageData>(stageList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.PotionStageDataOuterClass.PotionStageData, emu.grasscutter.net.proto.PotionStageDataOuterClass.PotionStageData.Builder, emu.grasscutter.net.proto.PotionStageDataOuterClass.PotionStageDataOrBuilder> stageListBuilder_;

      /**
       * <code>repeated .PotionStageData stage_list = 3;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.PotionStageDataOuterClass.PotionStageData> getStageListList() {
        if (stageListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(stageList_);
        } else {
          return stageListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .PotionStageData stage_list = 3;</code>
       */
      public int getStageListCount() {
        if (stageListBuilder_ == null) {
          return stageList_.size();
        } else {
          return stageListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .PotionStageData stage_list = 3;</code>
       */
      public emu.grasscutter.net.proto.PotionStageDataOuterClass.PotionStageData getStageList(int index) {
        if (stageListBuilder_ == null) {
          return stageList_.get(index);
        } else {
          return stageListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .PotionStageData stage_list = 3;</code>
       */
      public Builder setStageList(
          int index, emu.grasscutter.net.proto.PotionStageDataOuterClass.PotionStageData value) {
        if (stageListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureStageListIsMutable();
          stageList_.set(index, value);
          onChanged();
        } else {
          stageListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .PotionStageData stage_list = 3;</code>
       */
      public Builder setStageList(
          int index, emu.grasscutter.net.proto.PotionStageDataOuterClass.PotionStageData.Builder builderForValue) {
        if (stageListBuilder_ == null) {
          ensureStageListIsMutable();
          stageList_.set(index, builderForValue.build());
          onChanged();
        } else {
          stageListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .PotionStageData stage_list = 3;</code>
       */
      public Builder addStageList(emu.grasscutter.net.proto.PotionStageDataOuterClass.PotionStageData value) {
        if (stageListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureStageListIsMutable();
          stageList_.add(value);
          onChanged();
        } else {
          stageListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .PotionStageData stage_list = 3;</code>
       */
      public Builder addStageList(
          int index, emu.grasscutter.net.proto.PotionStageDataOuterClass.PotionStageData value) {
        if (stageListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureStageListIsMutable();
          stageList_.add(index, value);
          onChanged();
        } else {
          stageListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .PotionStageData stage_list = 3;</code>
       */
      public Builder addStageList(
          emu.grasscutter.net.proto.PotionStageDataOuterClass.PotionStageData.Builder builderForValue) {
        if (stageListBuilder_ == null) {
          ensureStageListIsMutable();
          stageList_.add(builderForValue.build());
          onChanged();
        } else {
          stageListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .PotionStageData stage_list = 3;</code>
       */
      public Builder addStageList(
          int index, emu.grasscutter.net.proto.PotionStageDataOuterClass.PotionStageData.Builder builderForValue) {
        if (stageListBuilder_ == null) {
          ensureStageListIsMutable();
          stageList_.add(index, builderForValue.build());
          onChanged();
        } else {
          stageListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .PotionStageData stage_list = 3;</code>
       */
      public Builder addAllStageList(
          java.lang.Iterable<? extends emu.grasscutter.net.proto.PotionStageDataOuterClass.PotionStageData> values) {
        if (stageListBuilder_ == null) {
          ensureStageListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, stageList_);
          onChanged();
        } else {
          stageListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .PotionStageData stage_list = 3;</code>
       */
      public Builder clearStageList() {
        if (stageListBuilder_ == null) {
          stageList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          stageListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .PotionStageData stage_list = 3;</code>
       */
      public Builder removeStageList(int index) {
        if (stageListBuilder_ == null) {
          ensureStageListIsMutable();
          stageList_.remove(index);
          onChanged();
        } else {
          stageListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .PotionStageData stage_list = 3;</code>
       */
      public emu.grasscutter.net.proto.PotionStageDataOuterClass.PotionStageData.Builder getStageListBuilder(
          int index) {
        return getStageListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .PotionStageData stage_list = 3;</code>
       */
      public emu.grasscutter.net.proto.PotionStageDataOuterClass.PotionStageDataOrBuilder getStageListOrBuilder(
          int index) {
        if (stageListBuilder_ == null) {
          return stageList_.get(index);  } else {
          return stageListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .PotionStageData stage_list = 3;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.proto.PotionStageDataOuterClass.PotionStageDataOrBuilder> 
           getStageListOrBuilderList() {
        if (stageListBuilder_ != null) {
          return stageListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(stageList_);
        }
      }
      /**
       * <code>repeated .PotionStageData stage_list = 3;</code>
       */
      public emu.grasscutter.net.proto.PotionStageDataOuterClass.PotionStageData.Builder addStageListBuilder() {
        return getStageListFieldBuilder().addBuilder(
            emu.grasscutter.net.proto.PotionStageDataOuterClass.PotionStageData.getDefaultInstance());
      }
      /**
       * <code>repeated .PotionStageData stage_list = 3;</code>
       */
      public emu.grasscutter.net.proto.PotionStageDataOuterClass.PotionStageData.Builder addStageListBuilder(
          int index) {
        return getStageListFieldBuilder().addBuilder(
            index, emu.grasscutter.net.proto.PotionStageDataOuterClass.PotionStageData.getDefaultInstance());
      }
      /**
       * <code>repeated .PotionStageData stage_list = 3;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.PotionStageDataOuterClass.PotionStageData.Builder> 
           getStageListBuilderList() {
        return getStageListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.PotionStageDataOuterClass.PotionStageData, emu.grasscutter.net.proto.PotionStageDataOuterClass.PotionStageData.Builder, emu.grasscutter.net.proto.PotionStageDataOuterClass.PotionStageDataOrBuilder> 
          getStageListFieldBuilder() {
        if (stageListBuilder_ == null) {
          stageListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.proto.PotionStageDataOuterClass.PotionStageData, emu.grasscutter.net.proto.PotionStageDataOuterClass.PotionStageData.Builder, emu.grasscutter.net.proto.PotionStageDataOuterClass.PotionStageDataOrBuilder>(
                  stageList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          stageList_ = null;
        }
        return stageListBuilder_;
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


      // @@protoc_insertion_point(builder_scope:PotionActivityDetailInfo)
    }

    // @@protoc_insertion_point(class_scope:PotionActivityDetailInfo)
    private static final emu.grasscutter.net.proto.PotionActivityDetailInfoOuterClass.PotionActivityDetailInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.PotionActivityDetailInfoOuterClass.PotionActivityDetailInfo();
    }

    public static emu.grasscutter.net.proto.PotionActivityDetailInfoOuterClass.PotionActivityDetailInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PotionActivityDetailInfo>
        PARSER = new com.google.protobuf.AbstractParser<PotionActivityDetailInfo>() {
      @java.lang.Override
      public PotionActivityDetailInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new PotionActivityDetailInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<PotionActivityDetailInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PotionActivityDetailInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.PotionActivityDetailInfoOuterClass.PotionActivityDetailInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PotionActivityDetailInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PotionActivityDetailInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036PotionActivityDetailInfo.proto\032\025Potion" +
      "StageData.proto\"@\n\030PotionActivityDetailI" +
      "nfo\022$\n\nstage_list\030\003 \003(\0132\020.PotionStageDat" +
      "aB!\n\031emu.grasscutter.net.protoZ\004/genb\006pr" +
      "oto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.PotionStageDataOuterClass.getDescriptor(),
        });
    internal_static_PotionActivityDetailInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PotionActivityDetailInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PotionActivityDetailInfo_descriptor,
        new java.lang.String[] { "StageList", });
    emu.grasscutter.net.proto.PotionStageDataOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
