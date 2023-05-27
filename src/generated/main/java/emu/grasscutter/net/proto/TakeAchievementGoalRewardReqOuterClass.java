// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: TakeAchievementGoalRewardReq.proto

package emu.grasscutter.net.proto;

public final class TakeAchievementGoalRewardReqOuterClass {
    private TakeAchievementGoalRewardReqOuterClass() {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
    }

    public interface TakeAchievementGoalRewardReqOrBuilder
            extends
            // @@protoc_insertion_point(interface_extends:TakeAchievementGoalRewardReq)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>repeated uint32 id_list = 1;</code>
         *
         * @return A list containing the idList.
         */
        java.util.List<java.lang.Integer> getIdListList();
        /**
         * <code>repeated uint32 id_list = 1;</code>
         *
         * @return The count of idList.
         */
        int getIdListCount();
        /**
         * <code>repeated uint32 id_list = 1;</code>
         *
         * @param index The index of the element to return.
         * @return The idList at the given index.
         */
        int getIdList(int index);
    }
    /**
     *
     *
     * <pre>
     * CmdId: 2676
     * Obf: PDIDCMNCIAE
     * </pre>
     *
     * Protobuf type {@code TakeAchievementGoalRewardReq}
     */
    public static final class TakeAchievementGoalRewardReq
            extends com.google.protobuf.GeneratedMessageV3
            implements
            // @@protoc_insertion_point(message_implements:TakeAchievementGoalRewardReq)
            TakeAchievementGoalRewardReqOrBuilder {
        private static final long serialVersionUID = 0L;
        // Use TakeAchievementGoalRewardReq.newBuilder() to construct.
        private TakeAchievementGoalRewardReq(
                com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private TakeAchievementGoalRewardReq() {
            idList_ = emptyIntList();
        }

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
            return new TakeAchievementGoalRewardReq();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private TakeAchievementGoalRewardReq(
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
                        case 8:
                            {
                                if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                                    idList_ = newIntList();
                                    mutable_bitField0_ |= 0x00000001;
                                }
                                idList_.addInt(input.readUInt32());
                                break;
                            }
                        case 10:
                            {
                                int length = input.readRawVarint32();
                                int limit = input.pushLimit(length);
                                if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                                    idList_ = newIntList();
                                    mutable_bitField0_ |= 0x00000001;
                                }
                                while (input.getBytesUntilLimit() > 0) {
                                    idList_.addInt(input.readUInt32());
                                }
                                input.popLimit(limit);
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
                if (((mutable_bitField0_ & 0x00000001) != 0)) {
                    idList_.makeImmutable(); // C
                }
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }

        public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
            return emu.grasscutter.net.proto.TakeAchievementGoalRewardReqOuterClass
                    .internal_static_TakeAchievementGoalRewardReq_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                internalGetFieldAccessorTable() {
            return emu.grasscutter.net.proto.TakeAchievementGoalRewardReqOuterClass
                    .internal_static_TakeAchievementGoalRewardReq_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            emu.grasscutter.net.proto.TakeAchievementGoalRewardReqOuterClass
                                    .TakeAchievementGoalRewardReq.class,
                            emu.grasscutter.net.proto.TakeAchievementGoalRewardReqOuterClass
                                    .TakeAchievementGoalRewardReq.Builder.class);
        }

        public static final int ID_LIST_FIELD_NUMBER = 1;
        private com.google.protobuf.Internal.IntList idList_;
        /**
         * <code>repeated uint32 id_list = 1;</code>
         *
         * @return A list containing the idList.
         */
        @java.lang.Override
        public java.util.List<java.lang.Integer> getIdListList() {
            return idList_;
        }
        /**
         * <code>repeated uint32 id_list = 1;</code>
         *
         * @return The count of idList.
         */
        public int getIdListCount() {
            return idList_.size();
        }
        /**
         * <code>repeated uint32 id_list = 1;</code>
         *
         * @param index The index of the element to return.
         * @return The idList at the given index.
         */
        public int getIdList(int index) {
            return idList_.getInt(index);
        }

        private int idListMemoizedSerializedSize = -1;

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
            getSerializedSize();
            if (getIdListList().size() > 0) {
                output.writeUInt32NoTag(10);
                output.writeUInt32NoTag(idListMemoizedSerializedSize);
            }
            for (int i = 0; i < idList_.size(); i++) {
                output.writeUInt32NoTag(idList_.getInt(i));
            }
            unknownFields.writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            {
                int dataSize = 0;
                for (int i = 0; i < idList_.size(); i++) {
                    dataSize +=
                            com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(idList_.getInt(i));
                }
                size += dataSize;
                if (!getIdListList().isEmpty()) {
                    size += 1;
                    size += com.google.protobuf.CodedOutputStream.computeInt32SizeNoTag(dataSize);
                }
                idListMemoizedSerializedSize = dataSize;
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
                    emu.grasscutter.net.proto.TakeAchievementGoalRewardReqOuterClass
                            .TakeAchievementGoalRewardReq)) {
                return super.equals(obj);
            }
            emu.grasscutter.net.proto.TakeAchievementGoalRewardReqOuterClass.TakeAchievementGoalRewardReq
                    other =
                            (emu.grasscutter.net.proto.TakeAchievementGoalRewardReqOuterClass
                                            .TakeAchievementGoalRewardReq)
                                    obj;

            if (!getIdListList().equals(other.getIdListList())) return false;
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
            if (getIdListCount() > 0) {
                hash = (37 * hash) + ID_LIST_FIELD_NUMBER;
                hash = (53 * hash) + getIdListList().hashCode();
            }
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static emu.grasscutter.net.proto.TakeAchievementGoalRewardReqOuterClass
                        .TakeAchievementGoalRewardReq
                parseFrom(java.nio.ByteBuffer data)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.TakeAchievementGoalRewardReqOuterClass
                        .TakeAchievementGoalRewardReq
                parseFrom(
                        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.TakeAchievementGoalRewardReqOuterClass
                        .TakeAchievementGoalRewardReq
                parseFrom(com.google.protobuf.ByteString data)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.TakeAchievementGoalRewardReqOuterClass
                        .TakeAchievementGoalRewardReq
                parseFrom(
                        com.google.protobuf.ByteString data,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.TakeAchievementGoalRewardReqOuterClass
                        .TakeAchievementGoalRewardReq
                parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.TakeAchievementGoalRewardReqOuterClass
                        .TakeAchievementGoalRewardReq
                parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.TakeAchievementGoalRewardReqOuterClass
                        .TakeAchievementGoalRewardReq
                parseFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.TakeAchievementGoalRewardReqOuterClass
                        .TakeAchievementGoalRewardReq
                parseFrom(
                        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.TakeAchievementGoalRewardReqOuterClass
                        .TakeAchievementGoalRewardReq
                parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.TakeAchievementGoalRewardReqOuterClass
                        .TakeAchievementGoalRewardReq
                parseDelimitedFrom(
                        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.TakeAchievementGoalRewardReqOuterClass
                        .TakeAchievementGoalRewardReq
                parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.TakeAchievementGoalRewardReqOuterClass
                        .TakeAchievementGoalRewardReq
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
                emu.grasscutter.net.proto.TakeAchievementGoalRewardReqOuterClass
                                .TakeAchievementGoalRewardReq
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
         * CmdId: 2676
         * Obf: PDIDCMNCIAE
         * </pre>
         *
         * Protobuf type {@code TakeAchievementGoalRewardReq}
         */
        public static final class Builder
                extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
                implements
                // @@protoc_insertion_point(builder_implements:TakeAchievementGoalRewardReq)
                emu.grasscutter.net.proto.TakeAchievementGoalRewardReqOuterClass
                        .TakeAchievementGoalRewardReqOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
                return emu.grasscutter.net.proto.TakeAchievementGoalRewardReqOuterClass
                        .internal_static_TakeAchievementGoalRewardReq_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                    internalGetFieldAccessorTable() {
                return emu.grasscutter.net.proto.TakeAchievementGoalRewardReqOuterClass
                        .internal_static_TakeAchievementGoalRewardReq_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                emu.grasscutter.net.proto.TakeAchievementGoalRewardReqOuterClass
                                        .TakeAchievementGoalRewardReq.class,
                                emu.grasscutter.net.proto.TakeAchievementGoalRewardReqOuterClass
                                        .TakeAchievementGoalRewardReq.Builder.class);
            }

            // Construct using
            // emu.grasscutter.net.proto.TakeAchievementGoalRewardReqOuterClass.TakeAchievementGoalRewardReq.newBuilder()
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
                idList_ = emptyIntList();
                bitField0_ = (bitField0_ & ~0x00000001);
                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
                return emu.grasscutter.net.proto.TakeAchievementGoalRewardReqOuterClass
                        .internal_static_TakeAchievementGoalRewardReq_descriptor;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.TakeAchievementGoalRewardReqOuterClass
                            .TakeAchievementGoalRewardReq
                    getDefaultInstanceForType() {
                return emu.grasscutter.net.proto.TakeAchievementGoalRewardReqOuterClass
                        .TakeAchievementGoalRewardReq.getDefaultInstance();
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.TakeAchievementGoalRewardReqOuterClass
                            .TakeAchievementGoalRewardReq
                    build() {
                emu.grasscutter.net.proto.TakeAchievementGoalRewardReqOuterClass
                                .TakeAchievementGoalRewardReq
                        result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.TakeAchievementGoalRewardReqOuterClass
                            .TakeAchievementGoalRewardReq
                    buildPartial() {
                emu.grasscutter.net.proto.TakeAchievementGoalRewardReqOuterClass
                                .TakeAchievementGoalRewardReq
                        result =
                                new emu.grasscutter.net.proto.TakeAchievementGoalRewardReqOuterClass
                                        .TakeAchievementGoalRewardReq(this);
                int from_bitField0_ = bitField0_;
                if (((bitField0_ & 0x00000001) != 0)) {
                    idList_.makeImmutable();
                    bitField0_ = (bitField0_ & ~0x00000001);
                }
                result.idList_ = idList_;
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
                        emu.grasscutter.net.proto.TakeAchievementGoalRewardReqOuterClass
                                .TakeAchievementGoalRewardReq) {
                    return mergeFrom(
                            (emu.grasscutter.net.proto.TakeAchievementGoalRewardReqOuterClass
                                            .TakeAchievementGoalRewardReq)
                                    other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(
                    emu.grasscutter.net.proto.TakeAchievementGoalRewardReqOuterClass
                                    .TakeAchievementGoalRewardReq
                            other) {
                if (other
                        == emu.grasscutter.net.proto.TakeAchievementGoalRewardReqOuterClass
                                .TakeAchievementGoalRewardReq.getDefaultInstance()) return this;
                if (!other.idList_.isEmpty()) {
                    if (idList_.isEmpty()) {
                        idList_ = other.idList_;
                        bitField0_ = (bitField0_ & ~0x00000001);
                    } else {
                        ensureIdListIsMutable();
                        idList_.addAll(other.idList_);
                    }
                    onChanged();
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
                emu.grasscutter.net.proto.TakeAchievementGoalRewardReqOuterClass
                                .TakeAchievementGoalRewardReq
                        parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage =
                            (emu.grasscutter.net.proto.TakeAchievementGoalRewardReqOuterClass
                                            .TakeAchievementGoalRewardReq)
                                    e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private int bitField0_;

            private com.google.protobuf.Internal.IntList idList_ = emptyIntList();

            private void ensureIdListIsMutable() {
                if (!((bitField0_ & 0x00000001) != 0)) {
                    idList_ = mutableCopy(idList_);
                    bitField0_ |= 0x00000001;
                }
            }
            /**
             * <code>repeated uint32 id_list = 1;</code>
             *
             * @return A list containing the idList.
             */
            public java.util.List<java.lang.Integer> getIdListList() {
                return ((bitField0_ & 0x00000001) != 0)
                        ? java.util.Collections.unmodifiableList(idList_)
                        : idList_;
            }
            /**
             * <code>repeated uint32 id_list = 1;</code>
             *
             * @return The count of idList.
             */
            public int getIdListCount() {
                return idList_.size();
            }
            /**
             * <code>repeated uint32 id_list = 1;</code>
             *
             * @param index The index of the element to return.
             * @return The idList at the given index.
             */
            public int getIdList(int index) {
                return idList_.getInt(index);
            }
            /**
             * <code>repeated uint32 id_list = 1;</code>
             *
             * @param index The index to set the value at.
             * @param value The idList to set.
             * @return This builder for chaining.
             */
            public Builder setIdList(int index, int value) {
                ensureIdListIsMutable();
                idList_.setInt(index, value);
                onChanged();
                return this;
            }
            /**
             * <code>repeated uint32 id_list = 1;</code>
             *
             * @param value The idList to add.
             * @return This builder for chaining.
             */
            public Builder addIdList(int value) {
                ensureIdListIsMutable();
                idList_.addInt(value);
                onChanged();
                return this;
            }
            /**
             * <code>repeated uint32 id_list = 1;</code>
             *
             * @param values The idList to add.
             * @return This builder for chaining.
             */
            public Builder addAllIdList(java.lang.Iterable<? extends java.lang.Integer> values) {
                ensureIdListIsMutable();
                com.google.protobuf.AbstractMessageLite.Builder.addAll(values, idList_);
                onChanged();
                return this;
            }
            /**
             * <code>repeated uint32 id_list = 1;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearIdList() {
                idList_ = emptyIntList();
                bitField0_ = (bitField0_ & ~0x00000001);
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

            // @@protoc_insertion_point(builder_scope:TakeAchievementGoalRewardReq)
        }

        // @@protoc_insertion_point(class_scope:TakeAchievementGoalRewardReq)
        private static final emu.grasscutter.net.proto.TakeAchievementGoalRewardReqOuterClass
                        .TakeAchievementGoalRewardReq
                DEFAULT_INSTANCE;

        static {
            DEFAULT_INSTANCE =
                    new emu.grasscutter.net.proto.TakeAchievementGoalRewardReqOuterClass
                            .TakeAchievementGoalRewardReq();
        }

        public static emu.grasscutter.net.proto.TakeAchievementGoalRewardReqOuterClass
                        .TakeAchievementGoalRewardReq
                getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<TakeAchievementGoalRewardReq> PARSER =
                new com.google.protobuf.AbstractParser<TakeAchievementGoalRewardReq>() {
                    @java.lang.Override
                    public TakeAchievementGoalRewardReq parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new TakeAchievementGoalRewardReq(input, extensionRegistry);
                    }
                };

        public static com.google.protobuf.Parser<TakeAchievementGoalRewardReq> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<TakeAchievementGoalRewardReq> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public emu.grasscutter.net.proto.TakeAchievementGoalRewardReqOuterClass
                        .TakeAchievementGoalRewardReq
                getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_TakeAchievementGoalRewardReq_descriptor;
    private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_TakeAchievementGoalRewardReq_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

    static {
        java.lang.String[] descriptorData = {
            "\n\"TakeAchievementGoalRewardReq.proto\"/\n\034"
                    + "TakeAchievementGoalRewardReq\022\017\n\007id_list\030"
                    + "\001 \003(\rB\033\n\031emu.grasscutter.net.protob\006prot"
                    + "o3"
        };
        descriptor =
                com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
                        descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
        internal_static_TakeAchievementGoalRewardReq_descriptor =
                getDescriptor().getMessageTypes().get(0);
        internal_static_TakeAchievementGoalRewardReq_fieldAccessorTable =
                new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                        internal_static_TakeAchievementGoalRewardReq_descriptor,
                        new java.lang.String[] {
                            "IdList",
                        });
    }

    // @@protoc_insertion_point(outer_class_scope)
}
