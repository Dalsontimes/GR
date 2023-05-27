// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PlayerChatReq.proto

package emu.grasscutter.net.proto;

public final class PlayerChatReqOuterClass {
    private PlayerChatReqOuterClass() {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
    }

    public interface PlayerChatReqOrBuilder
            extends
            // @@protoc_insertion_point(interface_extends:PlayerChatReq)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>.ChatInfo chat_info = 13;</code>
         *
         * @return Whether the chatInfo field is set.
         */
        boolean hasChatInfo();
        /**
         * <code>.ChatInfo chat_info = 13;</code>
         *
         * @return The chatInfo.
         */
        emu.grasscutter.net.proto.ChatInfoOuterClass.ChatInfo getChatInfo();
        /** <code>.ChatInfo chat_info = 13;</code> */
        emu.grasscutter.net.proto.ChatInfoOuterClass.ChatInfoOrBuilder getChatInfoOrBuilder();

        /**
         * <code>uint32 channel_id = 7;</code>
         *
         * @return The channelId.
         */
        int getChannelId();
    }
    /**
     *
     *
     * <pre>
     * CmdId: 3359
     * Obf: DBOADNLHMAK
     * </pre>
     *
     * Protobuf type {@code PlayerChatReq}
     */
    public static final class PlayerChatReq extends com.google.protobuf.GeneratedMessageV3
            implements
            // @@protoc_insertion_point(message_implements:PlayerChatReq)
            PlayerChatReqOrBuilder {
        private static final long serialVersionUID = 0L;
        // Use PlayerChatReq.newBuilder() to construct.
        private PlayerChatReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private PlayerChatReq() {}

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
            return new PlayerChatReq();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private PlayerChatReq(
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
                        case 56:
                            {
                                channelId_ = input.readUInt32();
                                break;
                            }
                        case 106:
                            {
                                emu.grasscutter.net.proto.ChatInfoOuterClass.ChatInfo.Builder subBuilder = null;
                                if (chatInfo_ != null) {
                                    subBuilder = chatInfo_.toBuilder();
                                }
                                chatInfo_ =
                                        input.readMessage(
                                                emu.grasscutter.net.proto.ChatInfoOuterClass.ChatInfo.parser(),
                                                extensionRegistry);
                                if (subBuilder != null) {
                                    subBuilder.mergeFrom(chatInfo_);
                                    chatInfo_ = subBuilder.buildPartial();
                                }

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
            return emu.grasscutter.net.proto.PlayerChatReqOuterClass
                    .internal_static_PlayerChatReq_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                internalGetFieldAccessorTable() {
            return emu.grasscutter.net.proto.PlayerChatReqOuterClass
                    .internal_static_PlayerChatReq_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            emu.grasscutter.net.proto.PlayerChatReqOuterClass.PlayerChatReq.class,
                            emu.grasscutter.net.proto.PlayerChatReqOuterClass.PlayerChatReq.Builder.class);
        }

        public static final int CHAT_INFO_FIELD_NUMBER = 13;
        private emu.grasscutter.net.proto.ChatInfoOuterClass.ChatInfo chatInfo_;
        /**
         * <code>.ChatInfo chat_info = 13;</code>
         *
         * @return Whether the chatInfo field is set.
         */
        @java.lang.Override
        public boolean hasChatInfo() {
            return chatInfo_ != null;
        }
        /**
         * <code>.ChatInfo chat_info = 13;</code>
         *
         * @return The chatInfo.
         */
        @java.lang.Override
        public emu.grasscutter.net.proto.ChatInfoOuterClass.ChatInfo getChatInfo() {
            return chatInfo_ == null
                    ? emu.grasscutter.net.proto.ChatInfoOuterClass.ChatInfo.getDefaultInstance()
                    : chatInfo_;
        }
        /** <code>.ChatInfo chat_info = 13;</code> */
        @java.lang.Override
        public emu.grasscutter.net.proto.ChatInfoOuterClass.ChatInfoOrBuilder getChatInfoOrBuilder() {
            return getChatInfo();
        }

        public static final int CHANNEL_ID_FIELD_NUMBER = 7;
        private int channelId_;
        /**
         * <code>uint32 channel_id = 7;</code>
         *
         * @return The channelId.
         */
        @java.lang.Override
        public int getChannelId() {
            return channelId_;
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
            if (channelId_ != 0) {
                output.writeUInt32(7, channelId_);
            }
            if (chatInfo_ != null) {
                output.writeMessage(13, getChatInfo());
            }
            unknownFields.writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (channelId_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeUInt32Size(7, channelId_);
            }
            if (chatInfo_ != null) {
                size += com.google.protobuf.CodedOutputStream.computeMessageSize(13, getChatInfo());
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
            if (!(obj instanceof emu.grasscutter.net.proto.PlayerChatReqOuterClass.PlayerChatReq)) {
                return super.equals(obj);
            }
            emu.grasscutter.net.proto.PlayerChatReqOuterClass.PlayerChatReq other =
                    (emu.grasscutter.net.proto.PlayerChatReqOuterClass.PlayerChatReq) obj;

            if (hasChatInfo() != other.hasChatInfo()) return false;
            if (hasChatInfo()) {
                if (!getChatInfo().equals(other.getChatInfo())) return false;
            }
            if (getChannelId() != other.getChannelId()) return false;
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
            if (hasChatInfo()) {
                hash = (37 * hash) + CHAT_INFO_FIELD_NUMBER;
                hash = (53 * hash) + getChatInfo().hashCode();
            }
            hash = (37 * hash) + CHANNEL_ID_FIELD_NUMBER;
            hash = (53 * hash) + getChannelId();
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static emu.grasscutter.net.proto.PlayerChatReqOuterClass.PlayerChatReq parseFrom(
                java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.PlayerChatReqOuterClass.PlayerChatReq parseFrom(
                java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.PlayerChatReqOuterClass.PlayerChatReq parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.PlayerChatReqOuterClass.PlayerChatReq parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.PlayerChatReqOuterClass.PlayerChatReq parseFrom(
                byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.PlayerChatReqOuterClass.PlayerChatReq parseFrom(
                byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.PlayerChatReqOuterClass.PlayerChatReq parseFrom(
                java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.PlayerChatReqOuterClass.PlayerChatReq parseFrom(
                java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.PlayerChatReqOuterClass.PlayerChatReq
                parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.PlayerChatReqOuterClass.PlayerChatReq
                parseDelimitedFrom(
                        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.PlayerChatReqOuterClass.PlayerChatReq parseFrom(
                com.google.protobuf.CodedInputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.PlayerChatReqOuterClass.PlayerChatReq parseFrom(
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
                emu.grasscutter.net.proto.PlayerChatReqOuterClass.PlayerChatReq prototype) {
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
         * CmdId: 3359
         * Obf: DBOADNLHMAK
         * </pre>
         *
         * Protobuf type {@code PlayerChatReq}
         */
        public static final class Builder
                extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
                implements
                // @@protoc_insertion_point(builder_implements:PlayerChatReq)
                emu.grasscutter.net.proto.PlayerChatReqOuterClass.PlayerChatReqOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
                return emu.grasscutter.net.proto.PlayerChatReqOuterClass
                        .internal_static_PlayerChatReq_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                    internalGetFieldAccessorTable() {
                return emu.grasscutter.net.proto.PlayerChatReqOuterClass
                        .internal_static_PlayerChatReq_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                emu.grasscutter.net.proto.PlayerChatReqOuterClass.PlayerChatReq.class,
                                emu.grasscutter.net.proto.PlayerChatReqOuterClass.PlayerChatReq.Builder.class);
            }

            // Construct using
            // emu.grasscutter.net.proto.PlayerChatReqOuterClass.PlayerChatReq.newBuilder()
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
                if (chatInfoBuilder_ == null) {
                    chatInfo_ = null;
                } else {
                    chatInfo_ = null;
                    chatInfoBuilder_ = null;
                }
                channelId_ = 0;

                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
                return emu.grasscutter.net.proto.PlayerChatReqOuterClass
                        .internal_static_PlayerChatReq_descriptor;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.PlayerChatReqOuterClass.PlayerChatReq
                    getDefaultInstanceForType() {
                return emu.grasscutter.net.proto.PlayerChatReqOuterClass.PlayerChatReq.getDefaultInstance();
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.PlayerChatReqOuterClass.PlayerChatReq build() {
                emu.grasscutter.net.proto.PlayerChatReqOuterClass.PlayerChatReq result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.PlayerChatReqOuterClass.PlayerChatReq buildPartial() {
                emu.grasscutter.net.proto.PlayerChatReqOuterClass.PlayerChatReq result =
                        new emu.grasscutter.net.proto.PlayerChatReqOuterClass.PlayerChatReq(this);
                if (chatInfoBuilder_ == null) {
                    result.chatInfo_ = chatInfo_;
                } else {
                    result.chatInfo_ = chatInfoBuilder_.build();
                }
                result.channelId_ = channelId_;
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
                if (other instanceof emu.grasscutter.net.proto.PlayerChatReqOuterClass.PlayerChatReq) {
                    return mergeFrom((emu.grasscutter.net.proto.PlayerChatReqOuterClass.PlayerChatReq) other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(
                    emu.grasscutter.net.proto.PlayerChatReqOuterClass.PlayerChatReq other) {
                if (other
                        == emu.grasscutter.net.proto.PlayerChatReqOuterClass.PlayerChatReq.getDefaultInstance())
                    return this;
                if (other.hasChatInfo()) {
                    mergeChatInfo(other.getChatInfo());
                }
                if (other.getChannelId() != 0) {
                    setChannelId(other.getChannelId());
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
                emu.grasscutter.net.proto.PlayerChatReqOuterClass.PlayerChatReq parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage =
                            (emu.grasscutter.net.proto.PlayerChatReqOuterClass.PlayerChatReq)
                                    e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private emu.grasscutter.net.proto.ChatInfoOuterClass.ChatInfo chatInfo_;
            private com.google.protobuf.SingleFieldBuilderV3<
                            emu.grasscutter.net.proto.ChatInfoOuterClass.ChatInfo,
                            emu.grasscutter.net.proto.ChatInfoOuterClass.ChatInfo.Builder,
                            emu.grasscutter.net.proto.ChatInfoOuterClass.ChatInfoOrBuilder>
                    chatInfoBuilder_;
            /**
             * <code>.ChatInfo chat_info = 13;</code>
             *
             * @return Whether the chatInfo field is set.
             */
            public boolean hasChatInfo() {
                return chatInfoBuilder_ != null || chatInfo_ != null;
            }
            /**
             * <code>.ChatInfo chat_info = 13;</code>
             *
             * @return The chatInfo.
             */
            public emu.grasscutter.net.proto.ChatInfoOuterClass.ChatInfo getChatInfo() {
                if (chatInfoBuilder_ == null) {
                    return chatInfo_ == null
                            ? emu.grasscutter.net.proto.ChatInfoOuterClass.ChatInfo.getDefaultInstance()
                            : chatInfo_;
                } else {
                    return chatInfoBuilder_.getMessage();
                }
            }
            /** <code>.ChatInfo chat_info = 13;</code> */
            public Builder setChatInfo(emu.grasscutter.net.proto.ChatInfoOuterClass.ChatInfo value) {
                if (chatInfoBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    chatInfo_ = value;
                    onChanged();
                } else {
                    chatInfoBuilder_.setMessage(value);
                }

                return this;
            }
            /** <code>.ChatInfo chat_info = 13;</code> */
            public Builder setChatInfo(
                    emu.grasscutter.net.proto.ChatInfoOuterClass.ChatInfo.Builder builderForValue) {
                if (chatInfoBuilder_ == null) {
                    chatInfo_ = builderForValue.build();
                    onChanged();
                } else {
                    chatInfoBuilder_.setMessage(builderForValue.build());
                }

                return this;
            }
            /** <code>.ChatInfo chat_info = 13;</code> */
            public Builder mergeChatInfo(emu.grasscutter.net.proto.ChatInfoOuterClass.ChatInfo value) {
                if (chatInfoBuilder_ == null) {
                    if (chatInfo_ != null) {
                        chatInfo_ =
                                emu.grasscutter.net.proto.ChatInfoOuterClass.ChatInfo.newBuilder(chatInfo_)
                                        .mergeFrom(value)
                                        .buildPartial();
                    } else {
                        chatInfo_ = value;
                    }
                    onChanged();
                } else {
                    chatInfoBuilder_.mergeFrom(value);
                }

                return this;
            }
            /** <code>.ChatInfo chat_info = 13;</code> */
            public Builder clearChatInfo() {
                if (chatInfoBuilder_ == null) {
                    chatInfo_ = null;
                    onChanged();
                } else {
                    chatInfo_ = null;
                    chatInfoBuilder_ = null;
                }

                return this;
            }
            /** <code>.ChatInfo chat_info = 13;</code> */
            public emu.grasscutter.net.proto.ChatInfoOuterClass.ChatInfo.Builder getChatInfoBuilder() {

                onChanged();
                return getChatInfoFieldBuilder().getBuilder();
            }
            /** <code>.ChatInfo chat_info = 13;</code> */
            public emu.grasscutter.net.proto.ChatInfoOuterClass.ChatInfoOrBuilder getChatInfoOrBuilder() {
                if (chatInfoBuilder_ != null) {
                    return chatInfoBuilder_.getMessageOrBuilder();
                } else {
                    return chatInfo_ == null
                            ? emu.grasscutter.net.proto.ChatInfoOuterClass.ChatInfo.getDefaultInstance()
                            : chatInfo_;
                }
            }
            /** <code>.ChatInfo chat_info = 13;</code> */
            private com.google.protobuf.SingleFieldBuilderV3<
                            emu.grasscutter.net.proto.ChatInfoOuterClass.ChatInfo,
                            emu.grasscutter.net.proto.ChatInfoOuterClass.ChatInfo.Builder,
                            emu.grasscutter.net.proto.ChatInfoOuterClass.ChatInfoOrBuilder>
                    getChatInfoFieldBuilder() {
                if (chatInfoBuilder_ == null) {
                    chatInfoBuilder_ =
                            new com.google.protobuf.SingleFieldBuilderV3<
                                    emu.grasscutter.net.proto.ChatInfoOuterClass.ChatInfo,
                                    emu.grasscutter.net.proto.ChatInfoOuterClass.ChatInfo.Builder,
                                    emu.grasscutter.net.proto.ChatInfoOuterClass.ChatInfoOrBuilder>(
                                    getChatInfo(), getParentForChildren(), isClean());
                    chatInfo_ = null;
                }
                return chatInfoBuilder_;
            }

            private int channelId_;
            /**
             * <code>uint32 channel_id = 7;</code>
             *
             * @return The channelId.
             */
            @java.lang.Override
            public int getChannelId() {
                return channelId_;
            }
            /**
             * <code>uint32 channel_id = 7;</code>
             *
             * @param value The channelId to set.
             * @return This builder for chaining.
             */
            public Builder setChannelId(int value) {

                channelId_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>uint32 channel_id = 7;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearChannelId() {

                channelId_ = 0;
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

            // @@protoc_insertion_point(builder_scope:PlayerChatReq)
        }

        // @@protoc_insertion_point(class_scope:PlayerChatReq)
        private static final emu.grasscutter.net.proto.PlayerChatReqOuterClass.PlayerChatReq
                DEFAULT_INSTANCE;

        static {
            DEFAULT_INSTANCE = new emu.grasscutter.net.proto.PlayerChatReqOuterClass.PlayerChatReq();
        }

        public static emu.grasscutter.net.proto.PlayerChatReqOuterClass.PlayerChatReq
                getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<PlayerChatReq> PARSER =
                new com.google.protobuf.AbstractParser<PlayerChatReq>() {
                    @java.lang.Override
                    public PlayerChatReq parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new PlayerChatReq(input, extensionRegistry);
                    }
                };

        public static com.google.protobuf.Parser<PlayerChatReq> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<PlayerChatReq> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public emu.grasscutter.net.proto.PlayerChatReqOuterClass.PlayerChatReq
                getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_PlayerChatReq_descriptor;
    private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_PlayerChatReq_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

    static {
        java.lang.String[] descriptorData = {
            "\n\023PlayerChatReq.proto\032\016ChatInfo.proto\"A\n"
                    + "\rPlayerChatReq\022\034\n\tchat_info\030\r \001(\0132\t.Chat"
                    + "Info\022\022\n\nchannel_id\030\007 \001(\rB\033\n\031emu.grasscut"
                    + "ter.net.protob\006proto3"
        };
        descriptor =
                com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
                        descriptorData,
                        new com.google.protobuf.Descriptors.FileDescriptor[] {
                            emu.grasscutter.net.proto.ChatInfoOuterClass.getDescriptor(),
                        });
        internal_static_PlayerChatReq_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_PlayerChatReq_fieldAccessorTable =
                new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                        internal_static_PlayerChatReq_descriptor,
                        new java.lang.String[] {
                            "ChatInfo", "ChannelId",
                        });
        emu.grasscutter.net.proto.ChatInfoOuterClass.getDescriptor();
    }

    // @@protoc_insertion_point(outer_class_scope)
}
