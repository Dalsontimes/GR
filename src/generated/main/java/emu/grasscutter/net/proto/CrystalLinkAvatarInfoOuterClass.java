// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CrystalLinkAvatarInfo.proto

package emu.grasscutter.net.proto;

public final class CrystalLinkAvatarInfoOuterClass {
    private CrystalLinkAvatarInfoOuterClass() {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
    }

    public interface CrystalLinkAvatarInfoOrBuilder
            extends
            // @@protoc_insertion_point(interface_extends:CrystalLinkAvatarInfo)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>uint64 avatar_id = 4;</code>
         *
         * @return The avatarId.
         */
        long getAvatarId();

        /**
         * <code>bool is_trial = 3;</code>
         *
         * @return The isTrial.
         */
        boolean getIsTrial();
    }
    /**
     *
     *
     * <pre>
     * Obf: MAANKHLADDM
     * </pre>
     *
     * Protobuf type {@code CrystalLinkAvatarInfo}
     */
    public static final class CrystalLinkAvatarInfo extends com.google.protobuf.GeneratedMessageV3
            implements
            // @@protoc_insertion_point(message_implements:CrystalLinkAvatarInfo)
            CrystalLinkAvatarInfoOrBuilder {
        private static final long serialVersionUID = 0L;
        // Use CrystalLinkAvatarInfo.newBuilder() to construct.
        private CrystalLinkAvatarInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private CrystalLinkAvatarInfo() {}

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
            return new CrystalLinkAvatarInfo();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private CrystalLinkAvatarInfo(
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
                                isTrial_ = input.readBool();
                                break;
                            }
                        case 32:
                            {
                                avatarId_ = input.readUInt64();
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
            return emu.grasscutter.net.proto.CrystalLinkAvatarInfoOuterClass
                    .internal_static_CrystalLinkAvatarInfo_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                internalGetFieldAccessorTable() {
            return emu.grasscutter.net.proto.CrystalLinkAvatarInfoOuterClass
                    .internal_static_CrystalLinkAvatarInfo_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            emu.grasscutter.net.proto.CrystalLinkAvatarInfoOuterClass.CrystalLinkAvatarInfo.class,
                            emu.grasscutter.net.proto.CrystalLinkAvatarInfoOuterClass.CrystalLinkAvatarInfo
                                    .Builder.class);
        }

        public static final int AVATAR_ID_FIELD_NUMBER = 4;
        private long avatarId_;
        /**
         * <code>uint64 avatar_id = 4;</code>
         *
         * @return The avatarId.
         */
        @java.lang.Override
        public long getAvatarId() {
            return avatarId_;
        }

        public static final int IS_TRIAL_FIELD_NUMBER = 3;
        private boolean isTrial_;
        /**
         * <code>bool is_trial = 3;</code>
         *
         * @return The isTrial.
         */
        @java.lang.Override
        public boolean getIsTrial() {
            return isTrial_;
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
            if (isTrial_ != false) {
                output.writeBool(3, isTrial_);
            }
            if (avatarId_ != 0L) {
                output.writeUInt64(4, avatarId_);
            }
            unknownFields.writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (isTrial_ != false) {
                size += com.google.protobuf.CodedOutputStream.computeBoolSize(3, isTrial_);
            }
            if (avatarId_ != 0L) {
                size += com.google.protobuf.CodedOutputStream.computeUInt64Size(4, avatarId_);
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
                    emu.grasscutter.net.proto.CrystalLinkAvatarInfoOuterClass.CrystalLinkAvatarInfo)) {
                return super.equals(obj);
            }
            emu.grasscutter.net.proto.CrystalLinkAvatarInfoOuterClass.CrystalLinkAvatarInfo other =
                    (emu.grasscutter.net.proto.CrystalLinkAvatarInfoOuterClass.CrystalLinkAvatarInfo) obj;

            if (getAvatarId() != other.getAvatarId()) return false;
            if (getIsTrial() != other.getIsTrial()) return false;
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
            hash = (37 * hash) + AVATAR_ID_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashLong(getAvatarId());
            hash = (37 * hash) + IS_TRIAL_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getIsTrial());
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static emu.grasscutter.net.proto.CrystalLinkAvatarInfoOuterClass.CrystalLinkAvatarInfo
                parseFrom(java.nio.ByteBuffer data)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.CrystalLinkAvatarInfoOuterClass.CrystalLinkAvatarInfo
                parseFrom(
                        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.CrystalLinkAvatarInfoOuterClass.CrystalLinkAvatarInfo
                parseFrom(com.google.protobuf.ByteString data)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.CrystalLinkAvatarInfoOuterClass.CrystalLinkAvatarInfo
                parseFrom(
                        com.google.protobuf.ByteString data,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.CrystalLinkAvatarInfoOuterClass.CrystalLinkAvatarInfo
                parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.CrystalLinkAvatarInfoOuterClass.CrystalLinkAvatarInfo
                parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.CrystalLinkAvatarInfoOuterClass.CrystalLinkAvatarInfo
                parseFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.CrystalLinkAvatarInfoOuterClass.CrystalLinkAvatarInfo
                parseFrom(
                        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.CrystalLinkAvatarInfoOuterClass.CrystalLinkAvatarInfo
                parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.CrystalLinkAvatarInfoOuterClass.CrystalLinkAvatarInfo
                parseDelimitedFrom(
                        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.CrystalLinkAvatarInfoOuterClass.CrystalLinkAvatarInfo
                parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.CrystalLinkAvatarInfoOuterClass.CrystalLinkAvatarInfo
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
                emu.grasscutter.net.proto.CrystalLinkAvatarInfoOuterClass.CrystalLinkAvatarInfo prototype) {
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
         * Obf: MAANKHLADDM
         * </pre>
         *
         * Protobuf type {@code CrystalLinkAvatarInfo}
         */
        public static final class Builder
                extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
                implements
                // @@protoc_insertion_point(builder_implements:CrystalLinkAvatarInfo)
                emu.grasscutter.net.proto.CrystalLinkAvatarInfoOuterClass.CrystalLinkAvatarInfoOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
                return emu.grasscutter.net.proto.CrystalLinkAvatarInfoOuterClass
                        .internal_static_CrystalLinkAvatarInfo_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                    internalGetFieldAccessorTable() {
                return emu.grasscutter.net.proto.CrystalLinkAvatarInfoOuterClass
                        .internal_static_CrystalLinkAvatarInfo_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                emu.grasscutter.net.proto.CrystalLinkAvatarInfoOuterClass.CrystalLinkAvatarInfo
                                        .class,
                                emu.grasscutter.net.proto.CrystalLinkAvatarInfoOuterClass.CrystalLinkAvatarInfo
                                        .Builder.class);
            }

            // Construct using
            // emu.grasscutter.net.proto.CrystalLinkAvatarInfoOuterClass.CrystalLinkAvatarInfo.newBuilder()
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
                avatarId_ = 0L;

                isTrial_ = false;

                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
                return emu.grasscutter.net.proto.CrystalLinkAvatarInfoOuterClass
                        .internal_static_CrystalLinkAvatarInfo_descriptor;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.CrystalLinkAvatarInfoOuterClass.CrystalLinkAvatarInfo
                    getDefaultInstanceForType() {
                return emu.grasscutter.net.proto.CrystalLinkAvatarInfoOuterClass.CrystalLinkAvatarInfo
                        .getDefaultInstance();
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.CrystalLinkAvatarInfoOuterClass.CrystalLinkAvatarInfo
                    build() {
                emu.grasscutter.net.proto.CrystalLinkAvatarInfoOuterClass.CrystalLinkAvatarInfo result =
                        buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.CrystalLinkAvatarInfoOuterClass.CrystalLinkAvatarInfo
                    buildPartial() {
                emu.grasscutter.net.proto.CrystalLinkAvatarInfoOuterClass.CrystalLinkAvatarInfo result =
                        new emu.grasscutter.net.proto.CrystalLinkAvatarInfoOuterClass.CrystalLinkAvatarInfo(
                                this);
                result.avatarId_ = avatarId_;
                result.isTrial_ = isTrial_;
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
                        emu.grasscutter.net.proto.CrystalLinkAvatarInfoOuterClass.CrystalLinkAvatarInfo) {
                    return mergeFrom(
                            (emu.grasscutter.net.proto.CrystalLinkAvatarInfoOuterClass.CrystalLinkAvatarInfo)
                                    other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(
                    emu.grasscutter.net.proto.CrystalLinkAvatarInfoOuterClass.CrystalLinkAvatarInfo other) {
                if (other
                        == emu.grasscutter.net.proto.CrystalLinkAvatarInfoOuterClass.CrystalLinkAvatarInfo
                                .getDefaultInstance()) return this;
                if (other.getAvatarId() != 0L) {
                    setAvatarId(other.getAvatarId());
                }
                if (other.getIsTrial() != false) {
                    setIsTrial(other.getIsTrial());
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
                emu.grasscutter.net.proto.CrystalLinkAvatarInfoOuterClass.CrystalLinkAvatarInfo
                        parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage =
                            (emu.grasscutter.net.proto.CrystalLinkAvatarInfoOuterClass.CrystalLinkAvatarInfo)
                                    e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private long avatarId_;
            /**
             * <code>uint64 avatar_id = 4;</code>
             *
             * @return The avatarId.
             */
            @java.lang.Override
            public long getAvatarId() {
                return avatarId_;
            }
            /**
             * <code>uint64 avatar_id = 4;</code>
             *
             * @param value The avatarId to set.
             * @return This builder for chaining.
             */
            public Builder setAvatarId(long value) {

                avatarId_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>uint64 avatar_id = 4;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearAvatarId() {

                avatarId_ = 0L;
                onChanged();
                return this;
            }

            private boolean isTrial_;
            /**
             * <code>bool is_trial = 3;</code>
             *
             * @return The isTrial.
             */
            @java.lang.Override
            public boolean getIsTrial() {
                return isTrial_;
            }
            /**
             * <code>bool is_trial = 3;</code>
             *
             * @param value The isTrial to set.
             * @return This builder for chaining.
             */
            public Builder setIsTrial(boolean value) {

                isTrial_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>bool is_trial = 3;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearIsTrial() {

                isTrial_ = false;
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

            // @@protoc_insertion_point(builder_scope:CrystalLinkAvatarInfo)
        }

        // @@protoc_insertion_point(class_scope:CrystalLinkAvatarInfo)
        private static final emu.grasscutter.net.proto.CrystalLinkAvatarInfoOuterClass
                        .CrystalLinkAvatarInfo
                DEFAULT_INSTANCE;

        static {
            DEFAULT_INSTANCE =
                    new emu.grasscutter.net.proto.CrystalLinkAvatarInfoOuterClass.CrystalLinkAvatarInfo();
        }

        public static emu.grasscutter.net.proto.CrystalLinkAvatarInfoOuterClass.CrystalLinkAvatarInfo
                getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<CrystalLinkAvatarInfo> PARSER =
                new com.google.protobuf.AbstractParser<CrystalLinkAvatarInfo>() {
                    @java.lang.Override
                    public CrystalLinkAvatarInfo parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new CrystalLinkAvatarInfo(input, extensionRegistry);
                    }
                };

        public static com.google.protobuf.Parser<CrystalLinkAvatarInfo> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<CrystalLinkAvatarInfo> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public emu.grasscutter.net.proto.CrystalLinkAvatarInfoOuterClass.CrystalLinkAvatarInfo
                getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_CrystalLinkAvatarInfo_descriptor;
    private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_CrystalLinkAvatarInfo_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

    static {
        java.lang.String[] descriptorData = {
            "\n\033CrystalLinkAvatarInfo.proto\"<\n\025Crystal"
                    + "LinkAvatarInfo\022\021\n\tavatar_id\030\004 \001(\004\022\020\n\010is_"
                    + "trial\030\003 \001(\010B\033\n\031emu.grasscutter.net.proto"
                    + "b\006proto3"
        };
        descriptor =
                com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
                        descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
        internal_static_CrystalLinkAvatarInfo_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_CrystalLinkAvatarInfo_fieldAccessorTable =
                new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                        internal_static_CrystalLinkAvatarInfo_descriptor,
                        new java.lang.String[] {
                            "AvatarId", "IsTrial",
                        });
    }

    // @@protoc_insertion_point(outer_class_scope)
}
