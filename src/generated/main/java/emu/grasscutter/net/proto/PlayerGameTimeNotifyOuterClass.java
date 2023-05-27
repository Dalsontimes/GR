// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PlayerGameTimeNotify.proto

package emu.grasscutter.net.proto;

public final class PlayerGameTimeNotifyOuterClass {
    private PlayerGameTimeNotifyOuterClass() {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
    }

    public interface PlayerGameTimeNotifyOrBuilder
            extends
            // @@protoc_insertion_point(interface_extends:PlayerGameTimeNotify)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>uint32 game_time = 6;</code>
         *
         * @return The gameTime.
         */
        int getGameTime();

        /**
         * <code>uint32 uid = 3;</code>
         *
         * @return The uid.
         */
        int getUid();

        /**
         * <code>bool is_home = 7;</code>
         *
         * @return The isHome.
         */
        boolean getIsHome();
    }
    /**
     *
     *
     * <pre>
     * CmdId: 184
     * Obf: LHPHBCOAAJI
     * </pre>
     *
     * Protobuf type {@code PlayerGameTimeNotify}
     */
    public static final class PlayerGameTimeNotify extends com.google.protobuf.GeneratedMessageV3
            implements
            // @@protoc_insertion_point(message_implements:PlayerGameTimeNotify)
            PlayerGameTimeNotifyOrBuilder {
        private static final long serialVersionUID = 0L;
        // Use PlayerGameTimeNotify.newBuilder() to construct.
        private PlayerGameTimeNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private PlayerGameTimeNotify() {}

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
            return new PlayerGameTimeNotify();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private PlayerGameTimeNotify(
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
                        case 24:
                            {
                                uid_ = input.readUInt32();
                                break;
                            }
                        case 48:
                            {
                                gameTime_ = input.readUInt32();
                                break;
                            }
                        case 56:
                            {
                                isHome_ = input.readBool();
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
            return emu.grasscutter.net.proto.PlayerGameTimeNotifyOuterClass
                    .internal_static_PlayerGameTimeNotify_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                internalGetFieldAccessorTable() {
            return emu.grasscutter.net.proto.PlayerGameTimeNotifyOuterClass
                    .internal_static_PlayerGameTimeNotify_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            emu.grasscutter.net.proto.PlayerGameTimeNotifyOuterClass.PlayerGameTimeNotify.class,
                            emu.grasscutter.net.proto.PlayerGameTimeNotifyOuterClass.PlayerGameTimeNotify.Builder
                                    .class);
        }

        public static final int GAME_TIME_FIELD_NUMBER = 6;
        private int gameTime_;
        /**
         * <code>uint32 game_time = 6;</code>
         *
         * @return The gameTime.
         */
        @java.lang.Override
        public int getGameTime() {
            return gameTime_;
        }

        public static final int UID_FIELD_NUMBER = 3;
        private int uid_;
        /**
         * <code>uint32 uid = 3;</code>
         *
         * @return The uid.
         */
        @java.lang.Override
        public int getUid() {
            return uid_;
        }

        public static final int IS_HOME_FIELD_NUMBER = 7;
        private boolean isHome_;
        /**
         * <code>bool is_home = 7;</code>
         *
         * @return The isHome.
         */
        @java.lang.Override
        public boolean getIsHome() {
            return isHome_;
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
            if (uid_ != 0) {
                output.writeUInt32(3, uid_);
            }
            if (gameTime_ != 0) {
                output.writeUInt32(6, gameTime_);
            }
            if (isHome_ != false) {
                output.writeBool(7, isHome_);
            }
            unknownFields.writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (uid_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeUInt32Size(3, uid_);
            }
            if (gameTime_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeUInt32Size(6, gameTime_);
            }
            if (isHome_ != false) {
                size += com.google.protobuf.CodedOutputStream.computeBoolSize(7, isHome_);
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
                    emu.grasscutter.net.proto.PlayerGameTimeNotifyOuterClass.PlayerGameTimeNotify)) {
                return super.equals(obj);
            }
            emu.grasscutter.net.proto.PlayerGameTimeNotifyOuterClass.PlayerGameTimeNotify other =
                    (emu.grasscutter.net.proto.PlayerGameTimeNotifyOuterClass.PlayerGameTimeNotify) obj;

            if (getGameTime() != other.getGameTime()) return false;
            if (getUid() != other.getUid()) return false;
            if (getIsHome() != other.getIsHome()) return false;
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
            hash = (37 * hash) + GAME_TIME_FIELD_NUMBER;
            hash = (53 * hash) + getGameTime();
            hash = (37 * hash) + UID_FIELD_NUMBER;
            hash = (53 * hash) + getUid();
            hash = (37 * hash) + IS_HOME_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getIsHome());
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static emu.grasscutter.net.proto.PlayerGameTimeNotifyOuterClass.PlayerGameTimeNotify
                parseFrom(java.nio.ByteBuffer data)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.PlayerGameTimeNotifyOuterClass.PlayerGameTimeNotify
                parseFrom(
                        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.PlayerGameTimeNotifyOuterClass.PlayerGameTimeNotify
                parseFrom(com.google.protobuf.ByteString data)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.PlayerGameTimeNotifyOuterClass.PlayerGameTimeNotify
                parseFrom(
                        com.google.protobuf.ByteString data,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.PlayerGameTimeNotifyOuterClass.PlayerGameTimeNotify
                parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.PlayerGameTimeNotifyOuterClass.PlayerGameTimeNotify
                parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.PlayerGameTimeNotifyOuterClass.PlayerGameTimeNotify
                parseFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.PlayerGameTimeNotifyOuterClass.PlayerGameTimeNotify
                parseFrom(
                        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.PlayerGameTimeNotifyOuterClass.PlayerGameTimeNotify
                parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.PlayerGameTimeNotifyOuterClass.PlayerGameTimeNotify
                parseDelimitedFrom(
                        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.PlayerGameTimeNotifyOuterClass.PlayerGameTimeNotify
                parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.PlayerGameTimeNotifyOuterClass.PlayerGameTimeNotify
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
                emu.grasscutter.net.proto.PlayerGameTimeNotifyOuterClass.PlayerGameTimeNotify prototype) {
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
         * CmdId: 184
         * Obf: LHPHBCOAAJI
         * </pre>
         *
         * Protobuf type {@code PlayerGameTimeNotify}
         */
        public static final class Builder
                extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
                implements
                // @@protoc_insertion_point(builder_implements:PlayerGameTimeNotify)
                emu.grasscutter.net.proto.PlayerGameTimeNotifyOuterClass.PlayerGameTimeNotifyOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
                return emu.grasscutter.net.proto.PlayerGameTimeNotifyOuterClass
                        .internal_static_PlayerGameTimeNotify_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                    internalGetFieldAccessorTable() {
                return emu.grasscutter.net.proto.PlayerGameTimeNotifyOuterClass
                        .internal_static_PlayerGameTimeNotify_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                emu.grasscutter.net.proto.PlayerGameTimeNotifyOuterClass.PlayerGameTimeNotify.class,
                                emu.grasscutter.net.proto.PlayerGameTimeNotifyOuterClass.PlayerGameTimeNotify
                                        .Builder.class);
            }

            // Construct using
            // emu.grasscutter.net.proto.PlayerGameTimeNotifyOuterClass.PlayerGameTimeNotify.newBuilder()
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
                gameTime_ = 0;

                uid_ = 0;

                isHome_ = false;

                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
                return emu.grasscutter.net.proto.PlayerGameTimeNotifyOuterClass
                        .internal_static_PlayerGameTimeNotify_descriptor;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.PlayerGameTimeNotifyOuterClass.PlayerGameTimeNotify
                    getDefaultInstanceForType() {
                return emu.grasscutter.net.proto.PlayerGameTimeNotifyOuterClass.PlayerGameTimeNotify
                        .getDefaultInstance();
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.PlayerGameTimeNotifyOuterClass.PlayerGameTimeNotify build() {
                emu.grasscutter.net.proto.PlayerGameTimeNotifyOuterClass.PlayerGameTimeNotify result =
                        buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.PlayerGameTimeNotifyOuterClass.PlayerGameTimeNotify
                    buildPartial() {
                emu.grasscutter.net.proto.PlayerGameTimeNotifyOuterClass.PlayerGameTimeNotify result =
                        new emu.grasscutter.net.proto.PlayerGameTimeNotifyOuterClass.PlayerGameTimeNotify(this);
                result.gameTime_ = gameTime_;
                result.uid_ = uid_;
                result.isHome_ = isHome_;
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
                        emu.grasscutter.net.proto.PlayerGameTimeNotifyOuterClass.PlayerGameTimeNotify) {
                    return mergeFrom(
                            (emu.grasscutter.net.proto.PlayerGameTimeNotifyOuterClass.PlayerGameTimeNotify)
                                    other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(
                    emu.grasscutter.net.proto.PlayerGameTimeNotifyOuterClass.PlayerGameTimeNotify other) {
                if (other
                        == emu.grasscutter.net.proto.PlayerGameTimeNotifyOuterClass.PlayerGameTimeNotify
                                .getDefaultInstance()) return this;
                if (other.getGameTime() != 0) {
                    setGameTime(other.getGameTime());
                }
                if (other.getUid() != 0) {
                    setUid(other.getUid());
                }
                if (other.getIsHome() != false) {
                    setIsHome(other.getIsHome());
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
                emu.grasscutter.net.proto.PlayerGameTimeNotifyOuterClass.PlayerGameTimeNotify
                        parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage =
                            (emu.grasscutter.net.proto.PlayerGameTimeNotifyOuterClass.PlayerGameTimeNotify)
                                    e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private int gameTime_;
            /**
             * <code>uint32 game_time = 6;</code>
             *
             * @return The gameTime.
             */
            @java.lang.Override
            public int getGameTime() {
                return gameTime_;
            }
            /**
             * <code>uint32 game_time = 6;</code>
             *
             * @param value The gameTime to set.
             * @return This builder for chaining.
             */
            public Builder setGameTime(int value) {

                gameTime_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>uint32 game_time = 6;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearGameTime() {

                gameTime_ = 0;
                onChanged();
                return this;
            }

            private int uid_;
            /**
             * <code>uint32 uid = 3;</code>
             *
             * @return The uid.
             */
            @java.lang.Override
            public int getUid() {
                return uid_;
            }
            /**
             * <code>uint32 uid = 3;</code>
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
             * <code>uint32 uid = 3;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearUid() {

                uid_ = 0;
                onChanged();
                return this;
            }

            private boolean isHome_;
            /**
             * <code>bool is_home = 7;</code>
             *
             * @return The isHome.
             */
            @java.lang.Override
            public boolean getIsHome() {
                return isHome_;
            }
            /**
             * <code>bool is_home = 7;</code>
             *
             * @param value The isHome to set.
             * @return This builder for chaining.
             */
            public Builder setIsHome(boolean value) {

                isHome_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>bool is_home = 7;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearIsHome() {

                isHome_ = false;
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

            // @@protoc_insertion_point(builder_scope:PlayerGameTimeNotify)
        }

        // @@protoc_insertion_point(class_scope:PlayerGameTimeNotify)
        private static final emu.grasscutter.net.proto.PlayerGameTimeNotifyOuterClass
                        .PlayerGameTimeNotify
                DEFAULT_INSTANCE;

        static {
            DEFAULT_INSTANCE =
                    new emu.grasscutter.net.proto.PlayerGameTimeNotifyOuterClass.PlayerGameTimeNotify();
        }

        public static emu.grasscutter.net.proto.PlayerGameTimeNotifyOuterClass.PlayerGameTimeNotify
                getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<PlayerGameTimeNotify> PARSER =
                new com.google.protobuf.AbstractParser<PlayerGameTimeNotify>() {
                    @java.lang.Override
                    public PlayerGameTimeNotify parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new PlayerGameTimeNotify(input, extensionRegistry);
                    }
                };

        public static com.google.protobuf.Parser<PlayerGameTimeNotify> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<PlayerGameTimeNotify> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public emu.grasscutter.net.proto.PlayerGameTimeNotifyOuterClass.PlayerGameTimeNotify
                getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_PlayerGameTimeNotify_descriptor;
    private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_PlayerGameTimeNotify_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

    static {
        java.lang.String[] descriptorData = {
            "\n\032PlayerGameTimeNotify.proto\"G\n\024PlayerGa"
                    + "meTimeNotify\022\021\n\tgame_time\030\006 \001(\r\022\013\n\003uid\030\003"
                    + " \001(\r\022\017\n\007is_home\030\007 \001(\010B\033\n\031emu.grasscutter"
                    + ".net.protob\006proto3"
        };
        descriptor =
                com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
                        descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
        internal_static_PlayerGameTimeNotify_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_PlayerGameTimeNotify_fieldAccessorTable =
                new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                        internal_static_PlayerGameTimeNotify_descriptor,
                        new java.lang.String[] {
                            "GameTime", "Uid", "IsHome",
                        });
    }

    // @@protoc_insertion_point(outer_class_scope)
}
