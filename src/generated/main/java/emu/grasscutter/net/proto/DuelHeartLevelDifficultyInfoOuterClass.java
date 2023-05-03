// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: DuelHeartLevelDifficultyInfo.proto

package emu.grasscutter.net.proto;

public final class DuelHeartLevelDifficultyInfoOuterClass {
  private DuelHeartLevelDifficultyInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface DuelHeartLevelDifficultyInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:DuelHeartLevelDifficultyInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 cost_time = 5;</code>
     * @return The costTime.
     */
    int getCostTime();

    /**
     * <code>uint32 difficulty = 11;</code>
     * @return The difficulty.
     */
    int getDifficulty();

    /**
     * <code>bool is_open = 3;</code>
     * @return The isOpen.
     */
    boolean getIsOpen();
  }
  /**
   * <pre>
   * Name: MCHGLACJIHO
   * </pre>
   *
   * Protobuf type {@code DuelHeartLevelDifficultyInfo}
   */
  public static final class DuelHeartLevelDifficultyInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:DuelHeartLevelDifficultyInfo)
      DuelHeartLevelDifficultyInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use DuelHeartLevelDifficultyInfo.newBuilder() to construct.
    private DuelHeartLevelDifficultyInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private DuelHeartLevelDifficultyInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new DuelHeartLevelDifficultyInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private DuelHeartLevelDifficultyInfo(
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
            case 24: {

              isOpen_ = input.readBool();
              break;
            }
            case 40: {

              costTime_ = input.readUInt32();
              break;
            }
            case 88: {

              difficulty_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.DuelHeartLevelDifficultyInfoOuterClass.internal_static_DuelHeartLevelDifficultyInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.DuelHeartLevelDifficultyInfoOuterClass.internal_static_DuelHeartLevelDifficultyInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.DuelHeartLevelDifficultyInfoOuterClass.DuelHeartLevelDifficultyInfo.class, emu.grasscutter.net.proto.DuelHeartLevelDifficultyInfoOuterClass.DuelHeartLevelDifficultyInfo.Builder.class);
    }

    public static final int COST_TIME_FIELD_NUMBER = 5;
    private int costTime_;
    /**
     * <code>uint32 cost_time = 5;</code>
     * @return The costTime.
     */
    @java.lang.Override
    public int getCostTime() {
      return costTime_;
    }

    public static final int DIFFICULTY_FIELD_NUMBER = 11;
    private int difficulty_;
    /**
     * <code>uint32 difficulty = 11;</code>
     * @return The difficulty.
     */
    @java.lang.Override
    public int getDifficulty() {
      return difficulty_;
    }

    public static final int IS_OPEN_FIELD_NUMBER = 3;
    private boolean isOpen_;
    /**
     * <code>bool is_open = 3;</code>
     * @return The isOpen.
     */
    @java.lang.Override
    public boolean getIsOpen() {
      return isOpen_;
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
      if (isOpen_ != false) {
        output.writeBool(3, isOpen_);
      }
      if (costTime_ != 0) {
        output.writeUInt32(5, costTime_);
      }
      if (difficulty_ != 0) {
        output.writeUInt32(11, difficulty_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (isOpen_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(3, isOpen_);
      }
      if (costTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, costTime_);
      }
      if (difficulty_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, difficulty_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.DuelHeartLevelDifficultyInfoOuterClass.DuelHeartLevelDifficultyInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.DuelHeartLevelDifficultyInfoOuterClass.DuelHeartLevelDifficultyInfo other = (emu.grasscutter.net.proto.DuelHeartLevelDifficultyInfoOuterClass.DuelHeartLevelDifficultyInfo) obj;

      if (getCostTime()
          != other.getCostTime()) return false;
      if (getDifficulty()
          != other.getDifficulty()) return false;
      if (getIsOpen()
          != other.getIsOpen()) return false;
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
      hash = (37 * hash) + COST_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getCostTime();
      hash = (37 * hash) + DIFFICULTY_FIELD_NUMBER;
      hash = (53 * hash) + getDifficulty();
      hash = (37 * hash) + IS_OPEN_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsOpen());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.DuelHeartLevelDifficultyInfoOuterClass.DuelHeartLevelDifficultyInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.DuelHeartLevelDifficultyInfoOuterClass.DuelHeartLevelDifficultyInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DuelHeartLevelDifficultyInfoOuterClass.DuelHeartLevelDifficultyInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.DuelHeartLevelDifficultyInfoOuterClass.DuelHeartLevelDifficultyInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DuelHeartLevelDifficultyInfoOuterClass.DuelHeartLevelDifficultyInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.DuelHeartLevelDifficultyInfoOuterClass.DuelHeartLevelDifficultyInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DuelHeartLevelDifficultyInfoOuterClass.DuelHeartLevelDifficultyInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.DuelHeartLevelDifficultyInfoOuterClass.DuelHeartLevelDifficultyInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DuelHeartLevelDifficultyInfoOuterClass.DuelHeartLevelDifficultyInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.DuelHeartLevelDifficultyInfoOuterClass.DuelHeartLevelDifficultyInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DuelHeartLevelDifficultyInfoOuterClass.DuelHeartLevelDifficultyInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.DuelHeartLevelDifficultyInfoOuterClass.DuelHeartLevelDifficultyInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.DuelHeartLevelDifficultyInfoOuterClass.DuelHeartLevelDifficultyInfo prototype) {
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
     * Name: MCHGLACJIHO
     * </pre>
     *
     * Protobuf type {@code DuelHeartLevelDifficultyInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:DuelHeartLevelDifficultyInfo)
        emu.grasscutter.net.proto.DuelHeartLevelDifficultyInfoOuterClass.DuelHeartLevelDifficultyInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.DuelHeartLevelDifficultyInfoOuterClass.internal_static_DuelHeartLevelDifficultyInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.DuelHeartLevelDifficultyInfoOuterClass.internal_static_DuelHeartLevelDifficultyInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.DuelHeartLevelDifficultyInfoOuterClass.DuelHeartLevelDifficultyInfo.class, emu.grasscutter.net.proto.DuelHeartLevelDifficultyInfoOuterClass.DuelHeartLevelDifficultyInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.DuelHeartLevelDifficultyInfoOuterClass.DuelHeartLevelDifficultyInfo.newBuilder()
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
        costTime_ = 0;

        difficulty_ = 0;

        isOpen_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.DuelHeartLevelDifficultyInfoOuterClass.internal_static_DuelHeartLevelDifficultyInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.DuelHeartLevelDifficultyInfoOuterClass.DuelHeartLevelDifficultyInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.DuelHeartLevelDifficultyInfoOuterClass.DuelHeartLevelDifficultyInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.DuelHeartLevelDifficultyInfoOuterClass.DuelHeartLevelDifficultyInfo build() {
        emu.grasscutter.net.proto.DuelHeartLevelDifficultyInfoOuterClass.DuelHeartLevelDifficultyInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.DuelHeartLevelDifficultyInfoOuterClass.DuelHeartLevelDifficultyInfo buildPartial() {
        emu.grasscutter.net.proto.DuelHeartLevelDifficultyInfoOuterClass.DuelHeartLevelDifficultyInfo result = new emu.grasscutter.net.proto.DuelHeartLevelDifficultyInfoOuterClass.DuelHeartLevelDifficultyInfo(this);
        result.costTime_ = costTime_;
        result.difficulty_ = difficulty_;
        result.isOpen_ = isOpen_;
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
        if (other instanceof emu.grasscutter.net.proto.DuelHeartLevelDifficultyInfoOuterClass.DuelHeartLevelDifficultyInfo) {
          return mergeFrom((emu.grasscutter.net.proto.DuelHeartLevelDifficultyInfoOuterClass.DuelHeartLevelDifficultyInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.DuelHeartLevelDifficultyInfoOuterClass.DuelHeartLevelDifficultyInfo other) {
        if (other == emu.grasscutter.net.proto.DuelHeartLevelDifficultyInfoOuterClass.DuelHeartLevelDifficultyInfo.getDefaultInstance()) return this;
        if (other.getCostTime() != 0) {
          setCostTime(other.getCostTime());
        }
        if (other.getDifficulty() != 0) {
          setDifficulty(other.getDifficulty());
        }
        if (other.getIsOpen() != false) {
          setIsOpen(other.getIsOpen());
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
        emu.grasscutter.net.proto.DuelHeartLevelDifficultyInfoOuterClass.DuelHeartLevelDifficultyInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.DuelHeartLevelDifficultyInfoOuterClass.DuelHeartLevelDifficultyInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int costTime_ ;
      /**
       * <code>uint32 cost_time = 5;</code>
       * @return The costTime.
       */
      @java.lang.Override
      public int getCostTime() {
        return costTime_;
      }
      /**
       * <code>uint32 cost_time = 5;</code>
       * @param value The costTime to set.
       * @return This builder for chaining.
       */
      public Builder setCostTime(int value) {
        
        costTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 cost_time = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearCostTime() {
        
        costTime_ = 0;
        onChanged();
        return this;
      }

      private int difficulty_ ;
      /**
       * <code>uint32 difficulty = 11;</code>
       * @return The difficulty.
       */
      @java.lang.Override
      public int getDifficulty() {
        return difficulty_;
      }
      /**
       * <code>uint32 difficulty = 11;</code>
       * @param value The difficulty to set.
       * @return This builder for chaining.
       */
      public Builder setDifficulty(int value) {
        
        difficulty_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 difficulty = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearDifficulty() {
        
        difficulty_ = 0;
        onChanged();
        return this;
      }

      private boolean isOpen_ ;
      /**
       * <code>bool is_open = 3;</code>
       * @return The isOpen.
       */
      @java.lang.Override
      public boolean getIsOpen() {
        return isOpen_;
      }
      /**
       * <code>bool is_open = 3;</code>
       * @param value The isOpen to set.
       * @return This builder for chaining.
       */
      public Builder setIsOpen(boolean value) {
        
        isOpen_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_open = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsOpen() {
        
        isOpen_ = false;
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


      // @@protoc_insertion_point(builder_scope:DuelHeartLevelDifficultyInfo)
    }

    // @@protoc_insertion_point(class_scope:DuelHeartLevelDifficultyInfo)
    private static final emu.grasscutter.net.proto.DuelHeartLevelDifficultyInfoOuterClass.DuelHeartLevelDifficultyInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.DuelHeartLevelDifficultyInfoOuterClass.DuelHeartLevelDifficultyInfo();
    }

    public static emu.grasscutter.net.proto.DuelHeartLevelDifficultyInfoOuterClass.DuelHeartLevelDifficultyInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<DuelHeartLevelDifficultyInfo>
        PARSER = new com.google.protobuf.AbstractParser<DuelHeartLevelDifficultyInfo>() {
      @java.lang.Override
      public DuelHeartLevelDifficultyInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new DuelHeartLevelDifficultyInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<DuelHeartLevelDifficultyInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<DuelHeartLevelDifficultyInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.DuelHeartLevelDifficultyInfoOuterClass.DuelHeartLevelDifficultyInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DuelHeartLevelDifficultyInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_DuelHeartLevelDifficultyInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\"DuelHeartLevelDifficultyInfo.proto\"V\n\034" +
      "DuelHeartLevelDifficultyInfo\022\021\n\tcost_tim" +
      "e\030\005 \001(\r\022\022\n\ndifficulty\030\013 \001(\r\022\017\n\007is_open\030\003" +
      " \001(\010B!\n\031emu.grasscutter.net.protoZ\004/genb" +
      "\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_DuelHeartLevelDifficultyInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_DuelHeartLevelDifficultyInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_DuelHeartLevelDifficultyInfo_descriptor,
        new java.lang.String[] { "CostTime", "Difficulty", "IsOpen", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
