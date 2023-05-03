// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AvatarTeamResonanceInfo.proto

package emu.grasscutter.net.proto;

public final class AvatarTeamResonanceInfoOuterClass {
  private AvatarTeamResonanceInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface AvatarTeamResonanceInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:AvatarTeamResonanceInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint32 add_team_resonance_id_list = 7;</code>
     * @return A list containing the addTeamResonanceIdList.
     */
    java.util.List<java.lang.Integer> getAddTeamResonanceIdListList();
    /**
     * <code>repeated uint32 add_team_resonance_id_list = 7;</code>
     * @return The count of addTeamResonanceIdList.
     */
    int getAddTeamResonanceIdListCount();
    /**
     * <code>repeated uint32 add_team_resonance_id_list = 7;</code>
     * @param index The index of the element to return.
     * @return The addTeamResonanceIdList at the given index.
     */
    int getAddTeamResonanceIdList(int index);

    /**
     * <code>repeated uint32 del_team_resonance_id_list = 12;</code>
     * @return A list containing the delTeamResonanceIdList.
     */
    java.util.List<java.lang.Integer> getDelTeamResonanceIdListList();
    /**
     * <code>repeated uint32 del_team_resonance_id_list = 12;</code>
     * @return The count of delTeamResonanceIdList.
     */
    int getDelTeamResonanceIdListCount();
    /**
     * <code>repeated uint32 del_team_resonance_id_list = 12;</code>
     * @param index The index of the element to return.
     * @return The delTeamResonanceIdList at the given index.
     */
    int getDelTeamResonanceIdList(int index);

    /**
     * <code>uint64 avatar_guid = 5;</code>
     * @return The avatarGuid.
     */
    long getAvatarGuid();

    /**
     * <code>uint32 entity_id = 11;</code>
     * @return The entityId.
     */
    int getEntityId();
  }
  /**
   * <pre>
   * Name: EJAIGOIJOFM
   * </pre>
   *
   * Protobuf type {@code AvatarTeamResonanceInfo}
   */
  public static final class AvatarTeamResonanceInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:AvatarTeamResonanceInfo)
      AvatarTeamResonanceInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use AvatarTeamResonanceInfo.newBuilder() to construct.
    private AvatarTeamResonanceInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private AvatarTeamResonanceInfo() {
      addTeamResonanceIdList_ = emptyIntList();
      delTeamResonanceIdList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new AvatarTeamResonanceInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private AvatarTeamResonanceInfo(
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
            case 40: {

              avatarGuid_ = input.readUInt64();
              break;
            }
            case 56: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                addTeamResonanceIdList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              addTeamResonanceIdList_.addInt(input.readUInt32());
              break;
            }
            case 58: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                addTeamResonanceIdList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                addTeamResonanceIdList_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
              break;
            }
            case 88: {

              entityId_ = input.readUInt32();
              break;
            }
            case 96: {
              if (!((mutable_bitField0_ & 0x00000002) != 0)) {
                delTeamResonanceIdList_ = newIntList();
                mutable_bitField0_ |= 0x00000002;
              }
              delTeamResonanceIdList_.addInt(input.readUInt32());
              break;
            }
            case 98: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000002) != 0) && input.getBytesUntilLimit() > 0) {
                delTeamResonanceIdList_ = newIntList();
                mutable_bitField0_ |= 0x00000002;
              }
              while (input.getBytesUntilLimit() > 0) {
                delTeamResonanceIdList_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
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
          addTeamResonanceIdList_.makeImmutable(); // C
        }
        if (((mutable_bitField0_ & 0x00000002) != 0)) {
          delTeamResonanceIdList_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.AvatarTeamResonanceInfoOuterClass.internal_static_AvatarTeamResonanceInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.AvatarTeamResonanceInfoOuterClass.internal_static_AvatarTeamResonanceInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.AvatarTeamResonanceInfoOuterClass.AvatarTeamResonanceInfo.class, emu.grasscutter.net.proto.AvatarTeamResonanceInfoOuterClass.AvatarTeamResonanceInfo.Builder.class);
    }

    public static final int ADD_TEAM_RESONANCE_ID_LIST_FIELD_NUMBER = 7;
    private com.google.protobuf.Internal.IntList addTeamResonanceIdList_;
    /**
     * <code>repeated uint32 add_team_resonance_id_list = 7;</code>
     * @return A list containing the addTeamResonanceIdList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getAddTeamResonanceIdListList() {
      return addTeamResonanceIdList_;
    }
    /**
     * <code>repeated uint32 add_team_resonance_id_list = 7;</code>
     * @return The count of addTeamResonanceIdList.
     */
    public int getAddTeamResonanceIdListCount() {
      return addTeamResonanceIdList_.size();
    }
    /**
     * <code>repeated uint32 add_team_resonance_id_list = 7;</code>
     * @param index The index of the element to return.
     * @return The addTeamResonanceIdList at the given index.
     */
    public int getAddTeamResonanceIdList(int index) {
      return addTeamResonanceIdList_.getInt(index);
    }
    private int addTeamResonanceIdListMemoizedSerializedSize = -1;

    public static final int DEL_TEAM_RESONANCE_ID_LIST_FIELD_NUMBER = 12;
    private com.google.protobuf.Internal.IntList delTeamResonanceIdList_;
    /**
     * <code>repeated uint32 del_team_resonance_id_list = 12;</code>
     * @return A list containing the delTeamResonanceIdList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getDelTeamResonanceIdListList() {
      return delTeamResonanceIdList_;
    }
    /**
     * <code>repeated uint32 del_team_resonance_id_list = 12;</code>
     * @return The count of delTeamResonanceIdList.
     */
    public int getDelTeamResonanceIdListCount() {
      return delTeamResonanceIdList_.size();
    }
    /**
     * <code>repeated uint32 del_team_resonance_id_list = 12;</code>
     * @param index The index of the element to return.
     * @return The delTeamResonanceIdList at the given index.
     */
    public int getDelTeamResonanceIdList(int index) {
      return delTeamResonanceIdList_.getInt(index);
    }
    private int delTeamResonanceIdListMemoizedSerializedSize = -1;

    public static final int AVATAR_GUID_FIELD_NUMBER = 5;
    private long avatarGuid_;
    /**
     * <code>uint64 avatar_guid = 5;</code>
     * @return The avatarGuid.
     */
    @java.lang.Override
    public long getAvatarGuid() {
      return avatarGuid_;
    }

    public static final int ENTITY_ID_FIELD_NUMBER = 11;
    private int entityId_;
    /**
     * <code>uint32 entity_id = 11;</code>
     * @return The entityId.
     */
    @java.lang.Override
    public int getEntityId() {
      return entityId_;
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
      getSerializedSize();
      if (avatarGuid_ != 0L) {
        output.writeUInt64(5, avatarGuid_);
      }
      if (getAddTeamResonanceIdListList().size() > 0) {
        output.writeUInt32NoTag(58);
        output.writeUInt32NoTag(addTeamResonanceIdListMemoizedSerializedSize);
      }
      for (int i = 0; i < addTeamResonanceIdList_.size(); i++) {
        output.writeUInt32NoTag(addTeamResonanceIdList_.getInt(i));
      }
      if (entityId_ != 0) {
        output.writeUInt32(11, entityId_);
      }
      if (getDelTeamResonanceIdListList().size() > 0) {
        output.writeUInt32NoTag(98);
        output.writeUInt32NoTag(delTeamResonanceIdListMemoizedSerializedSize);
      }
      for (int i = 0; i < delTeamResonanceIdList_.size(); i++) {
        output.writeUInt32NoTag(delTeamResonanceIdList_.getInt(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (avatarGuid_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(5, avatarGuid_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < addTeamResonanceIdList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(addTeamResonanceIdList_.getInt(i));
        }
        size += dataSize;
        if (!getAddTeamResonanceIdListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        addTeamResonanceIdListMemoizedSerializedSize = dataSize;
      }
      if (entityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, entityId_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < delTeamResonanceIdList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(delTeamResonanceIdList_.getInt(i));
        }
        size += dataSize;
        if (!getDelTeamResonanceIdListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        delTeamResonanceIdListMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof emu.grasscutter.net.proto.AvatarTeamResonanceInfoOuterClass.AvatarTeamResonanceInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.AvatarTeamResonanceInfoOuterClass.AvatarTeamResonanceInfo other = (emu.grasscutter.net.proto.AvatarTeamResonanceInfoOuterClass.AvatarTeamResonanceInfo) obj;

      if (!getAddTeamResonanceIdListList()
          .equals(other.getAddTeamResonanceIdListList())) return false;
      if (!getDelTeamResonanceIdListList()
          .equals(other.getDelTeamResonanceIdListList())) return false;
      if (getAvatarGuid()
          != other.getAvatarGuid()) return false;
      if (getEntityId()
          != other.getEntityId()) return false;
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
      if (getAddTeamResonanceIdListCount() > 0) {
        hash = (37 * hash) + ADD_TEAM_RESONANCE_ID_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getAddTeamResonanceIdListList().hashCode();
      }
      if (getDelTeamResonanceIdListCount() > 0) {
        hash = (37 * hash) + DEL_TEAM_RESONANCE_ID_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getDelTeamResonanceIdListList().hashCode();
      }
      hash = (37 * hash) + AVATAR_GUID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getAvatarGuid());
      hash = (37 * hash) + ENTITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getEntityId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.AvatarTeamResonanceInfoOuterClass.AvatarTeamResonanceInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AvatarTeamResonanceInfoOuterClass.AvatarTeamResonanceInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AvatarTeamResonanceInfoOuterClass.AvatarTeamResonanceInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AvatarTeamResonanceInfoOuterClass.AvatarTeamResonanceInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AvatarTeamResonanceInfoOuterClass.AvatarTeamResonanceInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AvatarTeamResonanceInfoOuterClass.AvatarTeamResonanceInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AvatarTeamResonanceInfoOuterClass.AvatarTeamResonanceInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AvatarTeamResonanceInfoOuterClass.AvatarTeamResonanceInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AvatarTeamResonanceInfoOuterClass.AvatarTeamResonanceInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AvatarTeamResonanceInfoOuterClass.AvatarTeamResonanceInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AvatarTeamResonanceInfoOuterClass.AvatarTeamResonanceInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AvatarTeamResonanceInfoOuterClass.AvatarTeamResonanceInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.AvatarTeamResonanceInfoOuterClass.AvatarTeamResonanceInfo prototype) {
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
     * Name: EJAIGOIJOFM
     * </pre>
     *
     * Protobuf type {@code AvatarTeamResonanceInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:AvatarTeamResonanceInfo)
        emu.grasscutter.net.proto.AvatarTeamResonanceInfoOuterClass.AvatarTeamResonanceInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.AvatarTeamResonanceInfoOuterClass.internal_static_AvatarTeamResonanceInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.AvatarTeamResonanceInfoOuterClass.internal_static_AvatarTeamResonanceInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.AvatarTeamResonanceInfoOuterClass.AvatarTeamResonanceInfo.class, emu.grasscutter.net.proto.AvatarTeamResonanceInfoOuterClass.AvatarTeamResonanceInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.AvatarTeamResonanceInfoOuterClass.AvatarTeamResonanceInfo.newBuilder()
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
        addTeamResonanceIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        delTeamResonanceIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000002);
        avatarGuid_ = 0L;

        entityId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.AvatarTeamResonanceInfoOuterClass.internal_static_AvatarTeamResonanceInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AvatarTeamResonanceInfoOuterClass.AvatarTeamResonanceInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.AvatarTeamResonanceInfoOuterClass.AvatarTeamResonanceInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AvatarTeamResonanceInfoOuterClass.AvatarTeamResonanceInfo build() {
        emu.grasscutter.net.proto.AvatarTeamResonanceInfoOuterClass.AvatarTeamResonanceInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AvatarTeamResonanceInfoOuterClass.AvatarTeamResonanceInfo buildPartial() {
        emu.grasscutter.net.proto.AvatarTeamResonanceInfoOuterClass.AvatarTeamResonanceInfo result = new emu.grasscutter.net.proto.AvatarTeamResonanceInfoOuterClass.AvatarTeamResonanceInfo(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) != 0)) {
          addTeamResonanceIdList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.addTeamResonanceIdList_ = addTeamResonanceIdList_;
        if (((bitField0_ & 0x00000002) != 0)) {
          delTeamResonanceIdList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.delTeamResonanceIdList_ = delTeamResonanceIdList_;
        result.avatarGuid_ = avatarGuid_;
        result.entityId_ = entityId_;
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
        if (other instanceof emu.grasscutter.net.proto.AvatarTeamResonanceInfoOuterClass.AvatarTeamResonanceInfo) {
          return mergeFrom((emu.grasscutter.net.proto.AvatarTeamResonanceInfoOuterClass.AvatarTeamResonanceInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.AvatarTeamResonanceInfoOuterClass.AvatarTeamResonanceInfo other) {
        if (other == emu.grasscutter.net.proto.AvatarTeamResonanceInfoOuterClass.AvatarTeamResonanceInfo.getDefaultInstance()) return this;
        if (!other.addTeamResonanceIdList_.isEmpty()) {
          if (addTeamResonanceIdList_.isEmpty()) {
            addTeamResonanceIdList_ = other.addTeamResonanceIdList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureAddTeamResonanceIdListIsMutable();
            addTeamResonanceIdList_.addAll(other.addTeamResonanceIdList_);
          }
          onChanged();
        }
        if (!other.delTeamResonanceIdList_.isEmpty()) {
          if (delTeamResonanceIdList_.isEmpty()) {
            delTeamResonanceIdList_ = other.delTeamResonanceIdList_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureDelTeamResonanceIdListIsMutable();
            delTeamResonanceIdList_.addAll(other.delTeamResonanceIdList_);
          }
          onChanged();
        }
        if (other.getAvatarGuid() != 0L) {
          setAvatarGuid(other.getAvatarGuid());
        }
        if (other.getEntityId() != 0) {
          setEntityId(other.getEntityId());
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
        emu.grasscutter.net.proto.AvatarTeamResonanceInfoOuterClass.AvatarTeamResonanceInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.AvatarTeamResonanceInfoOuterClass.AvatarTeamResonanceInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.Internal.IntList addTeamResonanceIdList_ = emptyIntList();
      private void ensureAddTeamResonanceIdListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          addTeamResonanceIdList_ = mutableCopy(addTeamResonanceIdList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 add_team_resonance_id_list = 7;</code>
       * @return A list containing the addTeamResonanceIdList.
       */
      public java.util.List<java.lang.Integer>
          getAddTeamResonanceIdListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(addTeamResonanceIdList_) : addTeamResonanceIdList_;
      }
      /**
       * <code>repeated uint32 add_team_resonance_id_list = 7;</code>
       * @return The count of addTeamResonanceIdList.
       */
      public int getAddTeamResonanceIdListCount() {
        return addTeamResonanceIdList_.size();
      }
      /**
       * <code>repeated uint32 add_team_resonance_id_list = 7;</code>
       * @param index The index of the element to return.
       * @return The addTeamResonanceIdList at the given index.
       */
      public int getAddTeamResonanceIdList(int index) {
        return addTeamResonanceIdList_.getInt(index);
      }
      /**
       * <code>repeated uint32 add_team_resonance_id_list = 7;</code>
       * @param index The index to set the value at.
       * @param value The addTeamResonanceIdList to set.
       * @return This builder for chaining.
       */
      public Builder setAddTeamResonanceIdList(
          int index, int value) {
        ensureAddTeamResonanceIdListIsMutable();
        addTeamResonanceIdList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 add_team_resonance_id_list = 7;</code>
       * @param value The addTeamResonanceIdList to add.
       * @return This builder for chaining.
       */
      public Builder addAddTeamResonanceIdList(int value) {
        ensureAddTeamResonanceIdListIsMutable();
        addTeamResonanceIdList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 add_team_resonance_id_list = 7;</code>
       * @param values The addTeamResonanceIdList to add.
       * @return This builder for chaining.
       */
      public Builder addAllAddTeamResonanceIdList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureAddTeamResonanceIdListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, addTeamResonanceIdList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 add_team_resonance_id_list = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearAddTeamResonanceIdList() {
        addTeamResonanceIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList delTeamResonanceIdList_ = emptyIntList();
      private void ensureDelTeamResonanceIdListIsMutable() {
        if (!((bitField0_ & 0x00000002) != 0)) {
          delTeamResonanceIdList_ = mutableCopy(delTeamResonanceIdList_);
          bitField0_ |= 0x00000002;
         }
      }
      /**
       * <code>repeated uint32 del_team_resonance_id_list = 12;</code>
       * @return A list containing the delTeamResonanceIdList.
       */
      public java.util.List<java.lang.Integer>
          getDelTeamResonanceIdListList() {
        return ((bitField0_ & 0x00000002) != 0) ?
                 java.util.Collections.unmodifiableList(delTeamResonanceIdList_) : delTeamResonanceIdList_;
      }
      /**
       * <code>repeated uint32 del_team_resonance_id_list = 12;</code>
       * @return The count of delTeamResonanceIdList.
       */
      public int getDelTeamResonanceIdListCount() {
        return delTeamResonanceIdList_.size();
      }
      /**
       * <code>repeated uint32 del_team_resonance_id_list = 12;</code>
       * @param index The index of the element to return.
       * @return The delTeamResonanceIdList at the given index.
       */
      public int getDelTeamResonanceIdList(int index) {
        return delTeamResonanceIdList_.getInt(index);
      }
      /**
       * <code>repeated uint32 del_team_resonance_id_list = 12;</code>
       * @param index The index to set the value at.
       * @param value The delTeamResonanceIdList to set.
       * @return This builder for chaining.
       */
      public Builder setDelTeamResonanceIdList(
          int index, int value) {
        ensureDelTeamResonanceIdListIsMutable();
        delTeamResonanceIdList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 del_team_resonance_id_list = 12;</code>
       * @param value The delTeamResonanceIdList to add.
       * @return This builder for chaining.
       */
      public Builder addDelTeamResonanceIdList(int value) {
        ensureDelTeamResonanceIdListIsMutable();
        delTeamResonanceIdList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 del_team_resonance_id_list = 12;</code>
       * @param values The delTeamResonanceIdList to add.
       * @return This builder for chaining.
       */
      public Builder addAllDelTeamResonanceIdList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureDelTeamResonanceIdListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, delTeamResonanceIdList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 del_team_resonance_id_list = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearDelTeamResonanceIdList() {
        delTeamResonanceIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
        return this;
      }

      private long avatarGuid_ ;
      /**
       * <code>uint64 avatar_guid = 5;</code>
       * @return The avatarGuid.
       */
      @java.lang.Override
      public long getAvatarGuid() {
        return avatarGuid_;
      }
      /**
       * <code>uint64 avatar_guid = 5;</code>
       * @param value The avatarGuid to set.
       * @return This builder for chaining.
       */
      public Builder setAvatarGuid(long value) {
        
        avatarGuid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 avatar_guid = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearAvatarGuid() {
        
        avatarGuid_ = 0L;
        onChanged();
        return this;
      }

      private int entityId_ ;
      /**
       * <code>uint32 entity_id = 11;</code>
       * @return The entityId.
       */
      @java.lang.Override
      public int getEntityId() {
        return entityId_;
      }
      /**
       * <code>uint32 entity_id = 11;</code>
       * @param value The entityId to set.
       * @return This builder for chaining.
       */
      public Builder setEntityId(int value) {
        
        entityId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 entity_id = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearEntityId() {
        
        entityId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:AvatarTeamResonanceInfo)
    }

    // @@protoc_insertion_point(class_scope:AvatarTeamResonanceInfo)
    private static final emu.grasscutter.net.proto.AvatarTeamResonanceInfoOuterClass.AvatarTeamResonanceInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.AvatarTeamResonanceInfoOuterClass.AvatarTeamResonanceInfo();
    }

    public static emu.grasscutter.net.proto.AvatarTeamResonanceInfoOuterClass.AvatarTeamResonanceInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<AvatarTeamResonanceInfo>
        PARSER = new com.google.protobuf.AbstractParser<AvatarTeamResonanceInfo>() {
      @java.lang.Override
      public AvatarTeamResonanceInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new AvatarTeamResonanceInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<AvatarTeamResonanceInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<AvatarTeamResonanceInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.AvatarTeamResonanceInfoOuterClass.AvatarTeamResonanceInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AvatarTeamResonanceInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AvatarTeamResonanceInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035AvatarTeamResonanceInfo.proto\"\211\001\n\027Avat" +
      "arTeamResonanceInfo\022\"\n\032add_team_resonanc" +
      "e_id_list\030\007 \003(\r\022\"\n\032del_team_resonance_id" +
      "_list\030\014 \003(\r\022\023\n\013avatar_guid\030\005 \001(\004\022\021\n\tenti" +
      "ty_id\030\013 \001(\rB!\n\031emu.grasscutter.net.proto" +
      "Z\004/genb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_AvatarTeamResonanceInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_AvatarTeamResonanceInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AvatarTeamResonanceInfo_descriptor,
        new java.lang.String[] { "AddTeamResonanceIdList", "DelTeamResonanceIdList", "AvatarGuid", "EntityId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
