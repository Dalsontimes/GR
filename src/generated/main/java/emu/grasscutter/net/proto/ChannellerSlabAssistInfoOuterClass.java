// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ChannellerSlabAssistInfo.proto

package emu.grasscutter.net.proto;

public final class ChannellerSlabAssistInfoOuterClass {
    private ChannellerSlabAssistInfoOuterClass() {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
    }

    public interface ChannellerSlabAssistInfoOrBuilder
            extends
            // @@protoc_insertion_point(interface_extends:ChannellerSlabAssistInfo)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>uint32 avatar_level = 10;</code>
         *
         * @return The avatarLevel.
         */
        int getAvatarLevel();

        /**
         * <code>uint32 avatar_id = 11;</code>
         *
         * @return The avatarId.
         */
        int getAvatarId();

        /**
         * <code>uint32 uid = 14;</code>
         *
         * @return The uid.
         */
        int getUid();
    }
    /**
     *
     *
     * <pre>
     * Obf: HKFJGOFLGNH
     * </pre>
     *
     * Protobuf type {@code ChannellerSlabAssistInfo}
     */
    public static final class ChannellerSlabAssistInfo extends com.google.protobuf.GeneratedMessageV3
            implements
            // @@protoc_insertion_point(message_implements:ChannellerSlabAssistInfo)
            ChannellerSlabAssistInfoOrBuilder {
        private static final long serialVersionUID = 0L;
        // Use ChannellerSlabAssistInfo.newBuilder() to construct.
        private ChannellerSlabAssistInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private ChannellerSlabAssistInfo() {}

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
            return new ChannellerSlabAssistInfo();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private ChannellerSlabAssistInfo(
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
                        case 80:
                            {
                                avatarLevel_ = input.readUInt32();
                                break;
                            }
                        case 88:
                            {
                                avatarId_ = input.readUInt32();
                                break;
                            }
                        case 112:
                            {
                                uid_ = input.readUInt32();
                                break;
                            }
                        default:
                            {
                                if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                                    done = true;
                                }
                                break;
                            }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
            } finally {
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }

        public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
            return emu.grasscutter.net.proto.ChannellerSlabAssistInfoOuterClass
                    .internal_static_ChannellerSlabAssistInfo_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                internalGetFieldAccessorTable() {
            return emu.grasscutter.net.proto.ChannellerSlabAssistInfoOuterClass
                    .internal_static_ChannellerSlabAssistInfo_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            emu.grasscutter.net.proto.ChannellerSlabAssistInfoOuterClass.ChannellerSlabAssistInfo
                                    .class,
                            emu.grasscutter.net.proto.ChannellerSlabAssistInfoOuterClass.ChannellerSlabAssistInfo
                                    .Builder.class);
        }

        public static final int AVATAR_LEVEL_FIELD_NUMBER = 10;
        private int avatarLevel_;
        /**
         * <code>uint32 avatar_level = 10;</code>
         *
         * @return The avatarLevel.
         */
        @java.lang.Override
        public int getAvatarLevel() {
            return avatarLevel_;
        }

        public static final int AVATAR_ID_FIELD_NUMBER = 11;
        private int avatarId_;
        /**
         * <code>uint32 avatar_id = 11;</code>
         *
         * @return The avatarId.
         */
        @java.lang.Override
        public int getAvatarId() {
            return avatarId_;
        }

        public static final int UID_FIELD_NUMBER = 14;
        private int uid_;
        /**
         * <code>uint32 uid = 14;</code>
         *
         * @return The uid.
         */
        @java.lang.Override
        public int getUid() {
            return uid_;
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
        public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
            if (avatarLevel_ != 0) {
                output.writeUInt32(10, avatarLevel_);
            }
            if (avatarId_ != 0) {
                output.writeUInt32(11, avatarId_);
            }
            if (uid_ != 0) {
                output.writeUInt32(14, uid_);
            }
            unknownFields.writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (avatarLevel_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeUInt32Size(10, avatarLevel_);
            }
            if (avatarId_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeUInt32Size(11, avatarId_);
            }
            if (uid_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeUInt32Size(14, uid_);
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
            if (!(obj
                    instanceof
                    emu.grasscutter.net.proto.ChannellerSlabAssistInfoOuterClass.ChannellerSlabAssistInfo)) {
                return super.equals(obj);
            }
            emu.grasscutter.net.proto.ChannellerSlabAssistInfoOuterClass.ChannellerSlabAssistInfo other =
                    (emu.grasscutter.net.proto.ChannellerSlabAssistInfoOuterClass.ChannellerSlabAssistInfo)
                            obj;

            if (getAvatarLevel() != other.getAvatarLevel()) return false;
            if (getAvatarId() != other.getAvatarId()) return false;
            if (getUid() != other.getUid()) return false;
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
            hash = (37 * hash) + AVATAR_LEVEL_FIELD_NUMBER;
            hash = (53 * hash) + getAvatarLevel();
            hash = (37 * hash) + AVATAR_ID_FIELD_NUMBER;
            hash = (53 * hash) + getAvatarId();
            hash = (37 * hash) + UID_FIELD_NUMBER;
            hash = (53 * hash) + getUid();
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static emu.grasscutter.net.proto.ChannellerSlabAssistInfoOuterClass
                        .ChannellerSlabAssistInfo
                parseFrom(java.nio.ByteBuffer data)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.ChannellerSlabAssistInfoOuterClass
                        .ChannellerSlabAssistInfo
                parseFrom(
                        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.ChannellerSlabAssistInfoOuterClass
                        .ChannellerSlabAssistInfo
                parseFrom(com.google.protobuf.ByteString data)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.ChannellerSlabAssistInfoOuterClass
                        .ChannellerSlabAssistInfo
                parseFrom(
                        com.google.protobuf.ByteString data,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.ChannellerSlabAssistInfoOuterClass
                        .ChannellerSlabAssistInfo
                parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.ChannellerSlabAssistInfoOuterClass
                        .ChannellerSlabAssistInfo
                parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.ChannellerSlabAssistInfoOuterClass
                        .ChannellerSlabAssistInfo
                parseFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.ChannellerSlabAssistInfoOuterClass
                        .ChannellerSlabAssistInfo
                parseFrom(
                        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.ChannellerSlabAssistInfoOuterClass
                        .ChannellerSlabAssistInfo
                parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.ChannellerSlabAssistInfoOuterClass
                        .ChannellerSlabAssistInfo
                parseDelimitedFrom(
                        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.ChannellerSlabAssistInfoOuterClass
                        .ChannellerSlabAssistInfo
                parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.ChannellerSlabAssistInfoOuterClass
                        .ChannellerSlabAssistInfo
                parseFrom(
                        com.google.protobuf.CodedInputStream input,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
                    PARSER, input, extensionRegistry);
        }

        @java.lang.Override
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(
                emu.grasscutter.net.proto.ChannellerSlabAssistInfoOuterClass.ChannellerSlabAssistInfo
                        prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }

        @java.lang.Override
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        @java.lang.Override
        protected Builder newBuilderForType(
                com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }
        /**
         *
         *
         * <pre>
         * Obf: HKFJGOFLGNH
         * </pre>
         *
         * Protobuf type {@code ChannellerSlabAssistInfo}
         */
        public static final class Builder
                extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
                implements
                // @@protoc_insertion_point(builder_implements:ChannellerSlabAssistInfo)
                emu.grasscutter.net.proto.ChannellerSlabAssistInfoOuterClass
                        .ChannellerSlabAssistInfoOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
                return emu.grasscutter.net.proto.ChannellerSlabAssistInfoOuterClass
                        .internal_static_ChannellerSlabAssistInfo_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                    internalGetFieldAccessorTable() {
                return emu.grasscutter.net.proto.ChannellerSlabAssistInfoOuterClass
                        .internal_static_ChannellerSlabAssistInfo_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                emu.grasscutter.net.proto.ChannellerSlabAssistInfoOuterClass
                                        .ChannellerSlabAssistInfo.class,
                                emu.grasscutter.net.proto.ChannellerSlabAssistInfoOuterClass
                                        .ChannellerSlabAssistInfo.Builder.class);
            }

            // Construct using
            // emu.grasscutter.net.proto.ChannellerSlabAssistInfoOuterClass.ChannellerSlabAssistInfo.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
            }

            @java.lang.Override
            public Builder clear() {
                super.clear();
                avatarLevel_ = 0;

                avatarId_ = 0;

                uid_ = 0;

                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
                return emu.grasscutter.net.proto.ChannellerSlabAssistInfoOuterClass
                        .internal_static_ChannellerSlabAssistInfo_descriptor;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.ChannellerSlabAssistInfoOuterClass.ChannellerSlabAssistInfo
                    getDefaultInstanceForType() {
                return emu.grasscutter.net.proto.ChannellerSlabAssistInfoOuterClass.ChannellerSlabAssistInfo
                        .getDefaultInstance();
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.ChannellerSlabAssistInfoOuterClass.ChannellerSlabAssistInfo
                    build() {
                emu.grasscutter.net.proto.ChannellerSlabAssistInfoOuterClass.ChannellerSlabAssistInfo
                        result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.ChannellerSlabAssistInfoOuterClass.ChannellerSlabAssistInfo
                    buildPartial() {
                emu.grasscutter.net.proto.ChannellerSlabAssistInfoOuterClass.ChannellerSlabAssistInfo
                        result =
                                new emu.grasscutter.net.proto.ChannellerSlabAssistInfoOuterClass
                                        .ChannellerSlabAssistInfo(this);
                result.avatarLevel_ = avatarLevel_;
                result.avatarId_ = avatarId_;
                result.uid_ = uid_;
                onBuilt();
                return result;
            }

            @java.lang.Override
            public Builder clone() {
                return super.clone();
            }

            @java.lang.Override
            public Builder setField(
                    com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
                return super.setField(field, value);
            }

            @java.lang.Override
            public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
                return super.clearField(field);
            }

            @java.lang.Override
            public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                return super.clearOneof(oneof);
            }

            @java.lang.Override
            public Builder setRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    int index,
                    java.lang.Object value) {
                return super.setRepeatedField(field, index, value);
            }

            @java.lang.Override
            public Builder addRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
                return super.addRepeatedField(field, value);
            }

            @java.lang.Override
            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other
                        instanceof
                        emu.grasscutter.net.proto.ChannellerSlabAssistInfoOuterClass.ChannellerSlabAssistInfo) {
                    return mergeFrom(
                            (emu.grasscutter.net.proto.ChannellerSlabAssistInfoOuterClass
                                            .ChannellerSlabAssistInfo)
                                    other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(
                    emu.grasscutter.net.proto.ChannellerSlabAssistInfoOuterClass.ChannellerSlabAssistInfo
                            other) {
                if (other
                        == emu.grasscutter.net.proto.ChannellerSlabAssistInfoOuterClass.ChannellerSlabAssistInfo
                                .getDefaultInstance()) return this;
                if (other.getAvatarLevel() != 0) {
                    setAvatarLevel(other.getAvatarLevel());
                }
                if (other.getAvatarId() != 0) {
                    setAvatarId(other.getAvatarId());
                }
                if (other.getUid() != 0) {
                    setUid(other.getUid());
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
                emu.grasscutter.net.proto.ChannellerSlabAssistInfoOuterClass.ChannellerSlabAssistInfo
                        parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage =
                            (emu.grasscutter.net.proto.ChannellerSlabAssistInfoOuterClass
                                            .ChannellerSlabAssistInfo)
                                    e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private int avatarLevel_;
            /**
             * <code>uint32 avatar_level = 10;</code>
             *
             * @return The avatarLevel.
             */
            @java.lang.Override
            public int getAvatarLevel() {
                return avatarLevel_;
            }
            /**
             * <code>uint32 avatar_level = 10;</code>
             *
             * @param value The avatarLevel to set.
             * @return This builder for chaining.
             */
            public Builder setAvatarLevel(int value) {

                avatarLevel_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>uint32 avatar_level = 10;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearAvatarLevel() {

                avatarLevel_ = 0;
                onChanged();
                return this;
            }

            private int avatarId_;
            /**
             * <code>uint32 avatar_id = 11;</code>
             *
             * @return The avatarId.
             */
            @java.lang.Override
            public int getAvatarId() {
                return avatarId_;
            }
            /**
             * <code>uint32 avatar_id = 11;</code>
             *
             * @param value The avatarId to set.
             * @return This builder for chaining.
             */
            public Builder setAvatarId(int value) {

                avatarId_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>uint32 avatar_id = 11;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearAvatarId() {

                avatarId_ = 0;
                onChanged();
                return this;
            }

            private int uid_;
            /**
             * <code>uint32 uid = 14;</code>
             *
             * @return The uid.
             */
            @java.lang.Override
            public int getUid() {
                return uid_;
            }
            /**
             * <code>uint32 uid = 14;</code>
             *
             * @param value The uid to set.
             * @return This builder for chaining.
             */
            public Builder setUid(int value) {

                uid_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>uint32 uid = 14;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearUid() {

                uid_ = 0;
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

            // @@protoc_insertion_point(builder_scope:ChannellerSlabAssistInfo)
        }

        // @@protoc_insertion_point(class_scope:ChannellerSlabAssistInfo)
        private static final emu.grasscutter.net.proto.ChannellerSlabAssistInfoOuterClass
                        .ChannellerSlabAssistInfo
                DEFAULT_INSTANCE;

        static {
            DEFAULT_INSTANCE =
                    new emu.grasscutter.net.proto.ChannellerSlabAssistInfoOuterClass
                            .ChannellerSlabAssistInfo();
        }

        public static emu.grasscutter.net.proto.ChannellerSlabAssistInfoOuterClass
                        .ChannellerSlabAssistInfo
                getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<ChannellerSlabAssistInfo> PARSER =
                new com.google.protobuf.AbstractParser<ChannellerSlabAssistInfo>() {
                    @java.lang.Override
                    public ChannellerSlabAssistInfo parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new ChannellerSlabAssistInfo(input, extensionRegistry);
                    }
                };

        public static com.google.protobuf.Parser<ChannellerSlabAssistInfo> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<ChannellerSlabAssistInfo> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public emu.grasscutter.net.proto.ChannellerSlabAssistInfoOuterClass.ChannellerSlabAssistInfo
                getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_ChannellerSlabAssistInfo_descriptor;
    private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_ChannellerSlabAssistInfo_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

    static {
        java.lang.String[] descriptorData = {
            "\n\036ChannellerSlabAssistInfo.proto\"P\n\030Chan"
                    + "nellerSlabAssistInfo\022\024\n\014avatar_level\030\n \001"
                    + "(\r\022\021\n\tavatar_id\030\013 \001(\r\022\013\n\003uid\030\016 \001(\rB\033\n\031em"
                    + "u.grasscutter.net.protob\006proto3"
        };
        descriptor =
                com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
                        descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
        internal_static_ChannellerSlabAssistInfo_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_ChannellerSlabAssistInfo_fieldAccessorTable =
                new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                        internal_static_ChannellerSlabAssistInfo_descriptor,
                        new java.lang.String[] {
                            "AvatarLevel", "AvatarId", "Uid",
                        });
    }

    // @@protoc_insertion_point(outer_class_scope)
}
