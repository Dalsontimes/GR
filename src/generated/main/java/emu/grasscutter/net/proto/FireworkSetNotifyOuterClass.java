// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FireworkSetNotify.proto

package emu.grasscutter.net.proto;

public final class FireworkSetNotifyOuterClass {
  private FireworkSetNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface FireworkSetNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:FireworkSetNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 code = 1;</code>
     * @return The code.
     */
    int getCode();

    /**
     * <code>repeated .FireworkSetData data = 9;</code>
     */
    java.util.List<emu.grasscutter.net.proto.FireworkSetDataOuterClass.FireworkSetData> 
        getDataList();
    /**
     * <code>repeated .FireworkSetData data = 9;</code>
     */
    emu.grasscutter.net.proto.FireworkSetDataOuterClass.FireworkSetData getData(int index);
    /**
     * <code>repeated .FireworkSetData data = 9;</code>
     */
    int getDataCount();
    /**
     * <code>repeated .FireworkSetData data = 9;</code>
     */
    java.util.List<? extends emu.grasscutter.net.proto.FireworkSetDataOuterClass.FireworkSetDataOrBuilder> 
        getDataOrBuilderList();
    /**
     * <code>repeated .FireworkSetData data = 9;</code>
     */
    emu.grasscutter.net.proto.FireworkSetDataOuterClass.FireworkSetDataOrBuilder getDataOrBuilder(
        int index);
  }
  /**
   * <pre>
   * CmdId: 5934
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code FireworkSetNotify}
   */
  public static final class FireworkSetNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:FireworkSetNotify)
      FireworkSetNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use FireworkSetNotify.newBuilder() to construct.
    private FireworkSetNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private FireworkSetNotify() {
      data_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new FireworkSetNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private FireworkSetNotify(
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
            case 8: {

              code_ = input.readUInt32();
              break;
            }
            case 74: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                data_ = new java.util.ArrayList<emu.grasscutter.net.proto.FireworkSetDataOuterClass.FireworkSetData>();
                mutable_bitField0_ |= 0x00000001;
              }
              data_.add(
                  input.readMessage(emu.grasscutter.net.proto.FireworkSetDataOuterClass.FireworkSetData.parser(), extensionRegistry));
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
          data_ = java.util.Collections.unmodifiableList(data_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.FireworkSetNotifyOuterClass.internal_static_FireworkSetNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.FireworkSetNotifyOuterClass.internal_static_FireworkSetNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.FireworkSetNotifyOuterClass.FireworkSetNotify.class, emu.grasscutter.net.proto.FireworkSetNotifyOuterClass.FireworkSetNotify.Builder.class);
    }

    public static final int CODE_FIELD_NUMBER = 1;
    private int code_;
    /**
     * <code>uint32 code = 1;</code>
     * @return The code.
     */
    @java.lang.Override
    public int getCode() {
      return code_;
    }

    public static final int DATA_FIELD_NUMBER = 9;
    private java.util.List<emu.grasscutter.net.proto.FireworkSetDataOuterClass.FireworkSetData> data_;
    /**
     * <code>repeated .FireworkSetData data = 9;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.proto.FireworkSetDataOuterClass.FireworkSetData> getDataList() {
      return data_;
    }
    /**
     * <code>repeated .FireworkSetData data = 9;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.proto.FireworkSetDataOuterClass.FireworkSetDataOrBuilder> 
        getDataOrBuilderList() {
      return data_;
    }
    /**
     * <code>repeated .FireworkSetData data = 9;</code>
     */
    @java.lang.Override
    public int getDataCount() {
      return data_.size();
    }
    /**
     * <code>repeated .FireworkSetData data = 9;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.FireworkSetDataOuterClass.FireworkSetData getData(int index) {
      return data_.get(index);
    }
    /**
     * <code>repeated .FireworkSetData data = 9;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.FireworkSetDataOuterClass.FireworkSetDataOrBuilder getDataOrBuilder(
        int index) {
      return data_.get(index);
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
      if (code_ != 0) {
        output.writeUInt32(1, code_);
      }
      for (int i = 0; i < data_.size(); i++) {
        output.writeMessage(9, data_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (code_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, code_);
      }
      for (int i = 0; i < data_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(9, data_.get(i));
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
      if (!(obj instanceof emu.grasscutter.net.proto.FireworkSetNotifyOuterClass.FireworkSetNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.FireworkSetNotifyOuterClass.FireworkSetNotify other = (emu.grasscutter.net.proto.FireworkSetNotifyOuterClass.FireworkSetNotify) obj;

      if (getCode()
          != other.getCode()) return false;
      if (!getDataList()
          .equals(other.getDataList())) return false;
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
      hash = (37 * hash) + CODE_FIELD_NUMBER;
      hash = (53 * hash) + getCode();
      if (getDataCount() > 0) {
        hash = (37 * hash) + DATA_FIELD_NUMBER;
        hash = (53 * hash) + getDataList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.FireworkSetNotifyOuterClass.FireworkSetNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.FireworkSetNotifyOuterClass.FireworkSetNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FireworkSetNotifyOuterClass.FireworkSetNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.FireworkSetNotifyOuterClass.FireworkSetNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FireworkSetNotifyOuterClass.FireworkSetNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.FireworkSetNotifyOuterClass.FireworkSetNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FireworkSetNotifyOuterClass.FireworkSetNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.FireworkSetNotifyOuterClass.FireworkSetNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FireworkSetNotifyOuterClass.FireworkSetNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.FireworkSetNotifyOuterClass.FireworkSetNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FireworkSetNotifyOuterClass.FireworkSetNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.FireworkSetNotifyOuterClass.FireworkSetNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.FireworkSetNotifyOuterClass.FireworkSetNotify prototype) {
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
     * CmdId: 5934
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code FireworkSetNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:FireworkSetNotify)
        emu.grasscutter.net.proto.FireworkSetNotifyOuterClass.FireworkSetNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.FireworkSetNotifyOuterClass.internal_static_FireworkSetNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.FireworkSetNotifyOuterClass.internal_static_FireworkSetNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.FireworkSetNotifyOuterClass.FireworkSetNotify.class, emu.grasscutter.net.proto.FireworkSetNotifyOuterClass.FireworkSetNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.FireworkSetNotifyOuterClass.FireworkSetNotify.newBuilder()
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
          getDataFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        code_ = 0;

        if (dataBuilder_ == null) {
          data_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          dataBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.FireworkSetNotifyOuterClass.internal_static_FireworkSetNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.FireworkSetNotifyOuterClass.FireworkSetNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.FireworkSetNotifyOuterClass.FireworkSetNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.FireworkSetNotifyOuterClass.FireworkSetNotify build() {
        emu.grasscutter.net.proto.FireworkSetNotifyOuterClass.FireworkSetNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.FireworkSetNotifyOuterClass.FireworkSetNotify buildPartial() {
        emu.grasscutter.net.proto.FireworkSetNotifyOuterClass.FireworkSetNotify result = new emu.grasscutter.net.proto.FireworkSetNotifyOuterClass.FireworkSetNotify(this);
        int from_bitField0_ = bitField0_;
        result.code_ = code_;
        if (dataBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            data_ = java.util.Collections.unmodifiableList(data_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.data_ = data_;
        } else {
          result.data_ = dataBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.proto.FireworkSetNotifyOuterClass.FireworkSetNotify) {
          return mergeFrom((emu.grasscutter.net.proto.FireworkSetNotifyOuterClass.FireworkSetNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.FireworkSetNotifyOuterClass.FireworkSetNotify other) {
        if (other == emu.grasscutter.net.proto.FireworkSetNotifyOuterClass.FireworkSetNotify.getDefaultInstance()) return this;
        if (other.getCode() != 0) {
          setCode(other.getCode());
        }
        if (dataBuilder_ == null) {
          if (!other.data_.isEmpty()) {
            if (data_.isEmpty()) {
              data_ = other.data_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureDataIsMutable();
              data_.addAll(other.data_);
            }
            onChanged();
          }
        } else {
          if (!other.data_.isEmpty()) {
            if (dataBuilder_.isEmpty()) {
              dataBuilder_.dispose();
              dataBuilder_ = null;
              data_ = other.data_;
              bitField0_ = (bitField0_ & ~0x00000001);
              dataBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getDataFieldBuilder() : null;
            } else {
              dataBuilder_.addAllMessages(other.data_);
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
        emu.grasscutter.net.proto.FireworkSetNotifyOuterClass.FireworkSetNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.FireworkSetNotifyOuterClass.FireworkSetNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int code_ ;
      /**
       * <code>uint32 code = 1;</code>
       * @return The code.
       */
      @java.lang.Override
      public int getCode() {
        return code_;
      }
      /**
       * <code>uint32 code = 1;</code>
       * @param value The code to set.
       * @return This builder for chaining.
       */
      public Builder setCode(int value) {
        
        code_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 code = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearCode() {
        
        code_ = 0;
        onChanged();
        return this;
      }

      private java.util.List<emu.grasscutter.net.proto.FireworkSetDataOuterClass.FireworkSetData> data_ =
        java.util.Collections.emptyList();
      private void ensureDataIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          data_ = new java.util.ArrayList<emu.grasscutter.net.proto.FireworkSetDataOuterClass.FireworkSetData>(data_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.FireworkSetDataOuterClass.FireworkSetData, emu.grasscutter.net.proto.FireworkSetDataOuterClass.FireworkSetData.Builder, emu.grasscutter.net.proto.FireworkSetDataOuterClass.FireworkSetDataOrBuilder> dataBuilder_;

      /**
       * <code>repeated .FireworkSetData data = 9;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.FireworkSetDataOuterClass.FireworkSetData> getDataList() {
        if (dataBuilder_ == null) {
          return java.util.Collections.unmodifiableList(data_);
        } else {
          return dataBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .FireworkSetData data = 9;</code>
       */
      public int getDataCount() {
        if (dataBuilder_ == null) {
          return data_.size();
        } else {
          return dataBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .FireworkSetData data = 9;</code>
       */
      public emu.grasscutter.net.proto.FireworkSetDataOuterClass.FireworkSetData getData(int index) {
        if (dataBuilder_ == null) {
          return data_.get(index);
        } else {
          return dataBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .FireworkSetData data = 9;</code>
       */
      public Builder setData(
          int index, emu.grasscutter.net.proto.FireworkSetDataOuterClass.FireworkSetData value) {
        if (dataBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureDataIsMutable();
          data_.set(index, value);
          onChanged();
        } else {
          dataBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .FireworkSetData data = 9;</code>
       */
      public Builder setData(
          int index, emu.grasscutter.net.proto.FireworkSetDataOuterClass.FireworkSetData.Builder builderForValue) {
        if (dataBuilder_ == null) {
          ensureDataIsMutable();
          data_.set(index, builderForValue.build());
          onChanged();
        } else {
          dataBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .FireworkSetData data = 9;</code>
       */
      public Builder addData(emu.grasscutter.net.proto.FireworkSetDataOuterClass.FireworkSetData value) {
        if (dataBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureDataIsMutable();
          data_.add(value);
          onChanged();
        } else {
          dataBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .FireworkSetData data = 9;</code>
       */
      public Builder addData(
          int index, emu.grasscutter.net.proto.FireworkSetDataOuterClass.FireworkSetData value) {
        if (dataBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureDataIsMutable();
          data_.add(index, value);
          onChanged();
        } else {
          dataBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .FireworkSetData data = 9;</code>
       */
      public Builder addData(
          emu.grasscutter.net.proto.FireworkSetDataOuterClass.FireworkSetData.Builder builderForValue) {
        if (dataBuilder_ == null) {
          ensureDataIsMutable();
          data_.add(builderForValue.build());
          onChanged();
        } else {
          dataBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .FireworkSetData data = 9;</code>
       */
      public Builder addData(
          int index, emu.grasscutter.net.proto.FireworkSetDataOuterClass.FireworkSetData.Builder builderForValue) {
        if (dataBuilder_ == null) {
          ensureDataIsMutable();
          data_.add(index, builderForValue.build());
          onChanged();
        } else {
          dataBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .FireworkSetData data = 9;</code>
       */
      public Builder addAllData(
          java.lang.Iterable<? extends emu.grasscutter.net.proto.FireworkSetDataOuterClass.FireworkSetData> values) {
        if (dataBuilder_ == null) {
          ensureDataIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, data_);
          onChanged();
        } else {
          dataBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .FireworkSetData data = 9;</code>
       */
      public Builder clearData() {
        if (dataBuilder_ == null) {
          data_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          dataBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .FireworkSetData data = 9;</code>
       */
      public Builder removeData(int index) {
        if (dataBuilder_ == null) {
          ensureDataIsMutable();
          data_.remove(index);
          onChanged();
        } else {
          dataBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .FireworkSetData data = 9;</code>
       */
      public emu.grasscutter.net.proto.FireworkSetDataOuterClass.FireworkSetData.Builder getDataBuilder(
          int index) {
        return getDataFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .FireworkSetData data = 9;</code>
       */
      public emu.grasscutter.net.proto.FireworkSetDataOuterClass.FireworkSetDataOrBuilder getDataOrBuilder(
          int index) {
        if (dataBuilder_ == null) {
          return data_.get(index);  } else {
          return dataBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .FireworkSetData data = 9;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.proto.FireworkSetDataOuterClass.FireworkSetDataOrBuilder> 
           getDataOrBuilderList() {
        if (dataBuilder_ != null) {
          return dataBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(data_);
        }
      }
      /**
       * <code>repeated .FireworkSetData data = 9;</code>
       */
      public emu.grasscutter.net.proto.FireworkSetDataOuterClass.FireworkSetData.Builder addDataBuilder() {
        return getDataFieldBuilder().addBuilder(
            emu.grasscutter.net.proto.FireworkSetDataOuterClass.FireworkSetData.getDefaultInstance());
      }
      /**
       * <code>repeated .FireworkSetData data = 9;</code>
       */
      public emu.grasscutter.net.proto.FireworkSetDataOuterClass.FireworkSetData.Builder addDataBuilder(
          int index) {
        return getDataFieldBuilder().addBuilder(
            index, emu.grasscutter.net.proto.FireworkSetDataOuterClass.FireworkSetData.getDefaultInstance());
      }
      /**
       * <code>repeated .FireworkSetData data = 9;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.FireworkSetDataOuterClass.FireworkSetData.Builder> 
           getDataBuilderList() {
        return getDataFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.FireworkSetDataOuterClass.FireworkSetData, emu.grasscutter.net.proto.FireworkSetDataOuterClass.FireworkSetData.Builder, emu.grasscutter.net.proto.FireworkSetDataOuterClass.FireworkSetDataOrBuilder> 
          getDataFieldBuilder() {
        if (dataBuilder_ == null) {
          dataBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.proto.FireworkSetDataOuterClass.FireworkSetData, emu.grasscutter.net.proto.FireworkSetDataOuterClass.FireworkSetData.Builder, emu.grasscutter.net.proto.FireworkSetDataOuterClass.FireworkSetDataOrBuilder>(
                  data_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          data_ = null;
        }
        return dataBuilder_;
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


      // @@protoc_insertion_point(builder_scope:FireworkSetNotify)
    }

    // @@protoc_insertion_point(class_scope:FireworkSetNotify)
    private static final emu.grasscutter.net.proto.FireworkSetNotifyOuterClass.FireworkSetNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.FireworkSetNotifyOuterClass.FireworkSetNotify();
    }

    public static emu.grasscutter.net.proto.FireworkSetNotifyOuterClass.FireworkSetNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<FireworkSetNotify>
        PARSER = new com.google.protobuf.AbstractParser<FireworkSetNotify>() {
      @java.lang.Override
      public FireworkSetNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new FireworkSetNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<FireworkSetNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<FireworkSetNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.FireworkSetNotifyOuterClass.FireworkSetNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_FireworkSetNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_FireworkSetNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027FireworkSetNotify.proto\032\025FireworkSetDa" +
      "ta.proto\"A\n\021FireworkSetNotify\022\014\n\004code\030\001 " +
      "\001(\r\022\036\n\004data\030\t \003(\0132\020.FireworkSetDataB!\n\031e" +
      "mu.grasscutter.net.protoZ\004/genb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.FireworkSetDataOuterClass.getDescriptor(),
        });
    internal_static_FireworkSetNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_FireworkSetNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_FireworkSetNotify_descriptor,
        new java.lang.String[] { "Code", "Data", });
    emu.grasscutter.net.proto.FireworkSetDataOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
