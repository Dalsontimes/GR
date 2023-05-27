// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: DealAddFriendReq.proto

package emu.grasscutter.net.proto;

public final class DealAddFriendReqOuterClass {
    private DealAddFriendReqOuterClass() {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
    }

    public interface DealAddFriendReqOrBuilder
            extends
            // @@protoc_insertion_point(interface_extends:DealAddFriendReq)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>uint32 target_uid = 15;</code>
         *
         * @return The targetUid.
         */
        int getTargetUid();

        /**
         * <code>.DealAddFriendResultType deal_add_friend_result = 4;</code>
         *
         * @return The enum numeric value on the wire for dealAddFriendResult.
         */
        int getDealAddFriendResultValue();
        /**
         * <code>.DealAddFriendResultType deal_add_friend_result = 4;</code>
         *
         * @return The dealAddFriendResult.
         */
        emu.grasscutter.net.proto.DealAddFriendResultTypeOuterClass.DealAddFriendResultType
                getDealAddFriendResult();
    }
    /**
     *
     *
     * <pre>
     * CmdId: 4058
     * Obf: PIAFDFFMOBK
     * </pre>
     *
     * Protobuf type {@code DealAddFriendReq}
     */
    public static final class DealAddFriendReq extends com.google.protobuf.GeneratedMessageV3
            implements
            // @@protoc_insertion_point(message_implements:DealAddFriendReq)
            DealAddFriendReqOrBuilder {
        private static final long serialVersionUID = 0L;
        // Use DealAddFriendReq.newBuilder() to construct.
        private DealAddFriendReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private DealAddFriendReq() {
            dealAddFriendResult_ = 0;
        }

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
            return new DealAddFriendReq();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private DealAddFriendReq(
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
                        case 32:
                            {
                                int rawValue = input.readEnum();

                                dealAddFriendResult_ = rawValue;
                                break;
                            }
                        case 120:
                            {
                                targetUid_ = input.readUInt32();
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
            return emu.grasscutter.net.proto.DealAddFriendReqOuterClass
                    .internal_static_DealAddFriendReq_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                internalGetFieldAccessorTable() {
            return emu.grasscutter.net.proto.DealAddFriendReqOuterClass
                    .internal_static_DealAddFriendReq_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            emu.grasscutter.net.proto.DealAddFriendReqOuterClass.DealAddFriendReq.class,
                            emu.grasscutter.net.proto.DealAddFriendReqOuterClass.DealAddFriendReq.Builder.class);
        }

        public static final int TARGET_UID_FIELD_NUMBER = 15;
        private int targetUid_;
        /**
         * <code>uint32 target_uid = 15;</code>
         *
         * @return The targetUid.
         */
        @java.lang.Override
        public int getTargetUid() {
            return targetUid_;
        }

        public static final int DEAL_ADD_FRIEND_RESULT_FIELD_NUMBER = 4;
        private int dealAddFriendResult_;
        /**
         * <code>.DealAddFriendResultType deal_add_friend_result = 4;</code>
         *
         * @return The enum numeric value on the wire for dealAddFriendResult.
         */
        @java.lang.Override
        public int getDealAddFriendResultValue() {
            return dealAddFriendResult_;
        }
        /**
         * <code>.DealAddFriendResultType deal_add_friend_result = 4;</code>
         *
         * @return The dealAddFriendResult.
         */
        @java.lang.Override
        public emu.grasscutter.net.proto.DealAddFriendResultTypeOuterClass.DealAddFriendResultType
                getDealAddFriendResult() {
            @SuppressWarnings("deprecation")
            emu.grasscutter.net.proto.DealAddFriendResultTypeOuterClass.DealAddFriendResultType result =
                    emu.grasscutter.net.proto.DealAddFriendResultTypeOuterClass.DealAddFriendResultType
                            .valueOf(dealAddFriendResult_);
            return result == null
                    ? emu.grasscutter.net.proto.DealAddFriendResultTypeOuterClass.DealAddFriendResultType
                            .UNRECOGNIZED
                    : result;
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
            if (dealAddFriendResult_
                    != emu.grasscutter.net.proto.DealAddFriendResultTypeOuterClass.DealAddFriendResultType
                            .DEAL_ADD_FRIEND_RESULT_TYPE_REJECT
                            .getNumber()) {
                output.writeEnum(4, dealAddFriendResult_);
            }
            if (targetUid_ != 0) {
                output.writeUInt32(15, targetUid_);
            }
            unknownFields.writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (dealAddFriendResult_
                    != emu.grasscutter.net.proto.DealAddFriendResultTypeOuterClass.DealAddFriendResultType
                            .DEAL_ADD_FRIEND_RESULT_TYPE_REJECT
                            .getNumber()) {
                size += com.google.protobuf.CodedOutputStream.computeEnumSize(4, dealAddFriendResult_);
            }
            if (targetUid_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeUInt32Size(15, targetUid_);
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
            if (!(obj instanceof emu.grasscutter.net.proto.DealAddFriendReqOuterClass.DealAddFriendReq)) {
                return super.equals(obj);
            }
            emu.grasscutter.net.proto.DealAddFriendReqOuterClass.DealAddFriendReq other =
                    (emu.grasscutter.net.proto.DealAddFriendReqOuterClass.DealAddFriendReq) obj;

            if (getTargetUid() != other.getTargetUid()) return false;
            if (dealAddFriendResult_ != other.dealAddFriendResult_) return false;
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
            hash = (37 * hash) + TARGET_UID_FIELD_NUMBER;
            hash = (53 * hash) + getTargetUid();
            hash = (37 * hash) + DEAL_ADD_FRIEND_RESULT_FIELD_NUMBER;
            hash = (53 * hash) + dealAddFriendResult_;
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static emu.grasscutter.net.proto.DealAddFriendReqOuterClass.DealAddFriendReq parseFrom(
                java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.DealAddFriendReqOuterClass.DealAddFriendReq parseFrom(
                java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.DealAddFriendReqOuterClass.DealAddFriendReq parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.DealAddFriendReqOuterClass.DealAddFriendReq parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.DealAddFriendReqOuterClass.DealAddFriendReq parseFrom(
                byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.DealAddFriendReqOuterClass.DealAddFriendReq parseFrom(
                byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.DealAddFriendReqOuterClass.DealAddFriendReq parseFrom(
                java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.DealAddFriendReqOuterClass.DealAddFriendReq parseFrom(
                java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.DealAddFriendReqOuterClass.DealAddFriendReq
                parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.DealAddFriendReqOuterClass.DealAddFriendReq
                parseDelimitedFrom(
                        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.DealAddFriendReqOuterClass.DealAddFriendReq parseFrom(
                com.google.protobuf.CodedInputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.DealAddFriendReqOuterClass.DealAddFriendReq parseFrom(
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
                emu.grasscutter.net.proto.DealAddFriendReqOuterClass.DealAddFriendReq prototype) {
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
         * CmdId: 4058
         * Obf: PIAFDFFMOBK
         * </pre>
         *
         * Protobuf type {@code DealAddFriendReq}
         */
        public static final class Builder
                extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
                implements
                // @@protoc_insertion_point(builder_implements:DealAddFriendReq)
                emu.grasscutter.net.proto.DealAddFriendReqOuterClass.DealAddFriendReqOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
                return emu.grasscutter.net.proto.DealAddFriendReqOuterClass
                        .internal_static_DealAddFriendReq_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                    internalGetFieldAccessorTable() {
                return emu.grasscutter.net.proto.DealAddFriendReqOuterClass
                        .internal_static_DealAddFriendReq_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                emu.grasscutter.net.proto.DealAddFriendReqOuterClass.DealAddFriendReq.class,
                                emu.grasscutter.net.proto.DealAddFriendReqOuterClass.DealAddFriendReq.Builder
                                        .class);
            }

            // Construct using
            // emu.grasscutter.net.proto.DealAddFriendReqOuterClass.DealAddFriendReq.newBuilder()
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
                targetUid_ = 0;

                dealAddFriendResult_ = 0;

                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
                return emu.grasscutter.net.proto.DealAddFriendReqOuterClass
                        .internal_static_DealAddFriendReq_descriptor;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.DealAddFriendReqOuterClass.DealAddFriendReq
                    getDefaultInstanceForType() {
                return emu.grasscutter.net.proto.DealAddFriendReqOuterClass.DealAddFriendReq
                        .getDefaultInstance();
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.DealAddFriendReqOuterClass.DealAddFriendReq build() {
                emu.grasscutter.net.proto.DealAddFriendReqOuterClass.DealAddFriendReq result =
                        buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.DealAddFriendReqOuterClass.DealAddFriendReq buildPartial() {
                emu.grasscutter.net.proto.DealAddFriendReqOuterClass.DealAddFriendReq result =
                        new emu.grasscutter.net.proto.DealAddFriendReqOuterClass.DealAddFriendReq(this);
                result.targetUid_ = targetUid_;
                result.dealAddFriendResult_ = dealAddFriendResult_;
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
                        instanceof emu.grasscutter.net.proto.DealAddFriendReqOuterClass.DealAddFriendReq) {
                    return mergeFrom(
                            (emu.grasscutter.net.proto.DealAddFriendReqOuterClass.DealAddFriendReq) other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(
                    emu.grasscutter.net.proto.DealAddFriendReqOuterClass.DealAddFriendReq other) {
                if (other
                        == emu.grasscutter.net.proto.DealAddFriendReqOuterClass.DealAddFriendReq
                                .getDefaultInstance()) return this;
                if (other.getTargetUid() != 0) {
                    setTargetUid(other.getTargetUid());
                }
                if (other.dealAddFriendResult_ != 0) {
                    setDealAddFriendResultValue(other.getDealAddFriendResultValue());
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
                emu.grasscutter.net.proto.DealAddFriendReqOuterClass.DealAddFriendReq parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage =
                            (emu.grasscutter.net.proto.DealAddFriendReqOuterClass.DealAddFriendReq)
                                    e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private int targetUid_;
            /**
             * <code>uint32 target_uid = 15;</code>
             *
             * @return The targetUid.
             */
            @java.lang.Override
            public int getTargetUid() {
                return targetUid_;
            }
            /**
             * <code>uint32 target_uid = 15;</code>
             *
             * @param value The targetUid to set.
             * @return This builder for chaining.
             */
            public Builder setTargetUid(int value) {

                targetUid_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>uint32 target_uid = 15;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearTargetUid() {

                targetUid_ = 0;
                onChanged();
                return this;
            }

            private int dealAddFriendResult_ = 0;
            /**
             * <code>.DealAddFriendResultType deal_add_friend_result = 4;</code>
             *
             * @return The enum numeric value on the wire for dealAddFriendResult.
             */
            @java.lang.Override
            public int getDealAddFriendResultValue() {
                return dealAddFriendResult_;
            }
            /**
             * <code>.DealAddFriendResultType deal_add_friend_result = 4;</code>
             *
             * @param value The enum numeric value on the wire for dealAddFriendResult to set.
             * @return This builder for chaining.
             */
            public Builder setDealAddFriendResultValue(int value) {

                dealAddFriendResult_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>.DealAddFriendResultType deal_add_friend_result = 4;</code>
             *
             * @return The dealAddFriendResult.
             */
            @java.lang.Override
            public emu.grasscutter.net.proto.DealAddFriendResultTypeOuterClass.DealAddFriendResultType
                    getDealAddFriendResult() {
                @SuppressWarnings("deprecation")
                emu.grasscutter.net.proto.DealAddFriendResultTypeOuterClass.DealAddFriendResultType result =
                        emu.grasscutter.net.proto.DealAddFriendResultTypeOuterClass.DealAddFriendResultType
                                .valueOf(dealAddFriendResult_);
                return result == null
                        ? emu.grasscutter.net.proto.DealAddFriendResultTypeOuterClass.DealAddFriendResultType
                                .UNRECOGNIZED
                        : result;
            }
            /**
             * <code>.DealAddFriendResultType deal_add_friend_result = 4;</code>
             *
             * @param value The dealAddFriendResult to set.
             * @return This builder for chaining.
             */
            public Builder setDealAddFriendResult(
                    emu.grasscutter.net.proto.DealAddFriendResultTypeOuterClass.DealAddFriendResultType
                            value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                dealAddFriendResult_ = value.getNumber();
                onChanged();
                return this;
            }
            /**
             * <code>.DealAddFriendResultType deal_add_friend_result = 4;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearDealAddFriendResult() {

                dealAddFriendResult_ = 0;
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

            // @@protoc_insertion_point(builder_scope:DealAddFriendReq)
        }

        // @@protoc_insertion_point(class_scope:DealAddFriendReq)
        private static final emu.grasscutter.net.proto.DealAddFriendReqOuterClass.DealAddFriendReq
                DEFAULT_INSTANCE;

        static {
            DEFAULT_INSTANCE =
                    new emu.grasscutter.net.proto.DealAddFriendReqOuterClass.DealAddFriendReq();
        }

        public static emu.grasscutter.net.proto.DealAddFriendReqOuterClass.DealAddFriendReq
                getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<DealAddFriendReq> PARSER =
                new com.google.protobuf.AbstractParser<DealAddFriendReq>() {
                    @java.lang.Override
                    public DealAddFriendReq parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new DealAddFriendReq(input, extensionRegistry);
                    }
                };

        public static com.google.protobuf.Parser<DealAddFriendReq> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<DealAddFriendReq> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public emu.grasscutter.net.proto.DealAddFriendReqOuterClass.DealAddFriendReq
                getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_DealAddFriendReq_descriptor;
    private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_DealAddFriendReq_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

    static {
        java.lang.String[] descriptorData = {
            "\n\026DealAddFriendReq.proto\032\035DealAddFriendR"
                    + "esultType.proto\"`\n\020DealAddFriendReq\022\022\n\nt"
                    + "arget_uid\030\017 \001(\r\0228\n\026deal_add_friend_resul"
                    + "t\030\004 \001(\0162\030.DealAddFriendResultTypeB\033\n\031emu"
                    + ".grasscutter.net.protob\006proto3"
        };
        descriptor =
                com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
                        descriptorData,
                        new com.google.protobuf.Descriptors.FileDescriptor[] {
                            emu.grasscutter.net.proto.DealAddFriendResultTypeOuterClass.getDescriptor(),
                        });
        internal_static_DealAddFriendReq_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_DealAddFriendReq_fieldAccessorTable =
                new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                        internal_static_DealAddFriendReq_descriptor,
                        new java.lang.String[] {
                            "TargetUid", "DealAddFriendResult",
                        });
        emu.grasscutter.net.proto.DealAddFriendResultTypeOuterClass.getDescriptor();
    }

    // @@protoc_insertion_point(outer_class_scope)
}
