// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MistTrialBestAvatar.proto

package emu.grasscutter.net.proto;

public final class MistTrialBestAvatarOuterClass {
    private MistTrialBestAvatarOuterClass() {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
    }

    public interface MistTrialBestAvatarOrBuilder
            extends
            // @@protoc_insertion_point(interface_extends:MistTrialBestAvatar)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>.AvatarType avatar_type = 5;</code>
         *
         * @return The enum numeric value on the wire for avatarType.
         */
        int getAvatarTypeValue();
        /**
         * <code>.AvatarType avatar_type = 5;</code>
         *
         * @return The avatarType.
         */
        emu.grasscutter.net.proto.AvatarTypeOuterClass.AvatarType getAvatarType();

        /**
         * <code>uint32 costume_id = 11;</code>
         *
         * @return The costumeId.
         */
        int getCostumeId();

        /**
         * <code>uint32 avatar_id = 14;</code>
         *
         * @return The avatarId.
         */
        int getAvatarId();
    }
    /**
     *
     *
     * <pre>
     * Obf: EAJAANLKGMM
     * </pre>
     *
     * Protobuf type {@code MistTrialBestAvatar}
     */
    public static final class MistTrialBestAvatar extends com.google.protobuf.GeneratedMessageV3
            implements
            // @@protoc_insertion_point(message_implements:MistTrialBestAvatar)
            MistTrialBestAvatarOrBuilder {
        private static final long serialVersionUID = 0L;
        // Use MistTrialBestAvatar.newBuilder() to construct.
        private MistTrialBestAvatar(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private MistTrialBestAvatar() {
            avatarType_ = 0;
        }

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
            return new MistTrialBestAvatar();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private MistTrialBestAvatar(
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
                        case 40:
                            {
                                int rawValue = input.readEnum();

                                avatarType_ = rawValue;
                                break;
                            }
                        case 88:
                            {
                                costumeId_ = input.readUInt32();
                                break;
                            }
                        case 112:
                            {
                                avatarId_ = input.readUInt32();
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
            return emu.grasscutter.net.proto.MistTrialBestAvatarOuterClass
                    .internal_static_MistTrialBestAvatar_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                internalGetFieldAccessorTable() {
            return emu.grasscutter.net.proto.MistTrialBestAvatarOuterClass
                    .internal_static_MistTrialBestAvatar_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            emu.grasscutter.net.proto.MistTrialBestAvatarOuterClass.MistTrialBestAvatar.class,
                            emu.grasscutter.net.proto.MistTrialBestAvatarOuterClass.MistTrialBestAvatar.Builder
                                    .class);
        }

        public static final int AVATAR_TYPE_FIELD_NUMBER = 5;
        private int avatarType_;
        /**
         * <code>.AvatarType avatar_type = 5;</code>
         *
         * @return The enum numeric value on the wire for avatarType.
         */
        @java.lang.Override
        public int getAvatarTypeValue() {
            return avatarType_;
        }
        /**
         * <code>.AvatarType avatar_type = 5;</code>
         *
         * @return The avatarType.
         */
        @java.lang.Override
        public emu.grasscutter.net.proto.AvatarTypeOuterClass.AvatarType getAvatarType() {
            @SuppressWarnings("deprecation")
            emu.grasscutter.net.proto.AvatarTypeOuterClass.AvatarType result =
                    emu.grasscutter.net.proto.AvatarTypeOuterClass.AvatarType.valueOf(avatarType_);
            return result == null
                    ? emu.grasscutter.net.proto.AvatarTypeOuterClass.AvatarType.UNRECOGNIZED
                    : result;
        }

        public static final int COSTUME_ID_FIELD_NUMBER = 11;
        private int costumeId_;
        /**
         * <code>uint32 costume_id = 11;</code>
         *
         * @return The costumeId.
         */
        @java.lang.Override
        public int getCostumeId() {
            return costumeId_;
        }

        public static final int AVATAR_ID_FIELD_NUMBER = 14;
        private int avatarId_;
        /**
         * <code>uint32 avatar_id = 14;</code>
         *
         * @return The avatarId.
         */
        @java.lang.Override
        public int getAvatarId() {
            return avatarId_;
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
            if (avatarType_
                    != emu.grasscutter.net.proto.AvatarTypeOuterClass.AvatarType.AVATAR_TYPE_NONE
                            .getNumber()) {
                output.writeEnum(5, avatarType_);
            }
            if (costumeId_ != 0) {
                output.writeUInt32(11, costumeId_);
            }
            if (avatarId_ != 0) {
                output.writeUInt32(14, avatarId_);
            }
            unknownFields.writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (avatarType_
                    != emu.grasscutter.net.proto.AvatarTypeOuterClass.AvatarType.AVATAR_TYPE_NONE
                            .getNumber()) {
                size += com.google.protobuf.CodedOutputStream.computeEnumSize(5, avatarType_);
            }
            if (costumeId_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeUInt32Size(11, costumeId_);
            }
            if (avatarId_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeUInt32Size(14, avatarId_);
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
                    instanceof emu.grasscutter.net.proto.MistTrialBestAvatarOuterClass.MistTrialBestAvatar)) {
                return super.equals(obj);
            }
            emu.grasscutter.net.proto.MistTrialBestAvatarOuterClass.MistTrialBestAvatar other =
                    (emu.grasscutter.net.proto.MistTrialBestAvatarOuterClass.MistTrialBestAvatar) obj;

            if (avatarType_ != other.avatarType_) return false;
            if (getCostumeId() != other.getCostumeId()) return false;
            if (getAvatarId() != other.getAvatarId()) return false;
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
            hash = (37 * hash) + AVATAR_TYPE_FIELD_NUMBER;
            hash = (53 * hash) + avatarType_;
            hash = (37 * hash) + COSTUME_ID_FIELD_NUMBER;
            hash = (53 * hash) + getCostumeId();
            hash = (37 * hash) + AVATAR_ID_FIELD_NUMBER;
            hash = (53 * hash) + getAvatarId();
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static emu.grasscutter.net.proto.MistTrialBestAvatarOuterClass.MistTrialBestAvatar
                parseFrom(java.nio.ByteBuffer data)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.MistTrialBestAvatarOuterClass.MistTrialBestAvatar
                parseFrom(
                        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.MistTrialBestAvatarOuterClass.MistTrialBestAvatar
                parseFrom(com.google.protobuf.ByteString data)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.MistTrialBestAvatarOuterClass.MistTrialBestAvatar
                parseFrom(
                        com.google.protobuf.ByteString data,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.MistTrialBestAvatarOuterClass.MistTrialBestAvatar
                parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.MistTrialBestAvatarOuterClass.MistTrialBestAvatar
                parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.MistTrialBestAvatarOuterClass.MistTrialBestAvatar
                parseFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.MistTrialBestAvatarOuterClass.MistTrialBestAvatar
                parseFrom(
                        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.MistTrialBestAvatarOuterClass.MistTrialBestAvatar
                parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.MistTrialBestAvatarOuterClass.MistTrialBestAvatar
                parseDelimitedFrom(
                        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.MistTrialBestAvatarOuterClass.MistTrialBestAvatar
                parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.MistTrialBestAvatarOuterClass.MistTrialBestAvatar
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
                emu.grasscutter.net.proto.MistTrialBestAvatarOuterClass.MistTrialBestAvatar prototype) {
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
         * Obf: EAJAANLKGMM
         * </pre>
         *
         * Protobuf type {@code MistTrialBestAvatar}
         */
        public static final class Builder
                extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
                implements
                // @@protoc_insertion_point(builder_implements:MistTrialBestAvatar)
                emu.grasscutter.net.proto.MistTrialBestAvatarOuterClass.MistTrialBestAvatarOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
                return emu.grasscutter.net.proto.MistTrialBestAvatarOuterClass
                        .internal_static_MistTrialBestAvatar_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                    internalGetFieldAccessorTable() {
                return emu.grasscutter.net.proto.MistTrialBestAvatarOuterClass
                        .internal_static_MistTrialBestAvatar_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                emu.grasscutter.net.proto.MistTrialBestAvatarOuterClass.MistTrialBestAvatar.class,
                                emu.grasscutter.net.proto.MistTrialBestAvatarOuterClass.MistTrialBestAvatar.Builder
                                        .class);
            }

            // Construct using
            // emu.grasscutter.net.proto.MistTrialBestAvatarOuterClass.MistTrialBestAvatar.newBuilder()
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
                avatarType_ = 0;

                costumeId_ = 0;

                avatarId_ = 0;

                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
                return emu.grasscutter.net.proto.MistTrialBestAvatarOuterClass
                        .internal_static_MistTrialBestAvatar_descriptor;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.MistTrialBestAvatarOuterClass.MistTrialBestAvatar
                    getDefaultInstanceForType() {
                return emu.grasscutter.net.proto.MistTrialBestAvatarOuterClass.MistTrialBestAvatar
                        .getDefaultInstance();
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.MistTrialBestAvatarOuterClass.MistTrialBestAvatar build() {
                emu.grasscutter.net.proto.MistTrialBestAvatarOuterClass.MistTrialBestAvatar result =
                        buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.MistTrialBestAvatarOuterClass.MistTrialBestAvatar
                    buildPartial() {
                emu.grasscutter.net.proto.MistTrialBestAvatarOuterClass.MistTrialBestAvatar result =
                        new emu.grasscutter.net.proto.MistTrialBestAvatarOuterClass.MistTrialBestAvatar(this);
                result.avatarType_ = avatarType_;
                result.costumeId_ = costumeId_;
                result.avatarId_ = avatarId_;
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
                        emu.grasscutter.net.proto.MistTrialBestAvatarOuterClass.MistTrialBestAvatar) {
                    return mergeFrom(
                            (emu.grasscutter.net.proto.MistTrialBestAvatarOuterClass.MistTrialBestAvatar) other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(
                    emu.grasscutter.net.proto.MistTrialBestAvatarOuterClass.MistTrialBestAvatar other) {
                if (other
                        == emu.grasscutter.net.proto.MistTrialBestAvatarOuterClass.MistTrialBestAvatar
                                .getDefaultInstance()) return this;
                if (other.avatarType_ != 0) {
                    setAvatarTypeValue(other.getAvatarTypeValue());
                }
                if (other.getCostumeId() != 0) {
                    setCostumeId(other.getCostumeId());
                }
                if (other.getAvatarId() != 0) {
                    setAvatarId(other.getAvatarId());
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
                emu.grasscutter.net.proto.MistTrialBestAvatarOuterClass.MistTrialBestAvatar parsedMessage =
                        null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage =
                            (emu.grasscutter.net.proto.MistTrialBestAvatarOuterClass.MistTrialBestAvatar)
                                    e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private int avatarType_ = 0;
            /**
             * <code>.AvatarType avatar_type = 5;</code>
             *
             * @return The enum numeric value on the wire for avatarType.
             */
            @java.lang.Override
            public int getAvatarTypeValue() {
                return avatarType_;
            }
            /**
             * <code>.AvatarType avatar_type = 5;</code>
             *
             * @param value The enum numeric value on the wire for avatarType to set.
             * @return This builder for chaining.
             */
            public Builder setAvatarTypeValue(int value) {

                avatarType_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>.AvatarType avatar_type = 5;</code>
             *
             * @return The avatarType.
             */
            @java.lang.Override
            public emu.grasscutter.net.proto.AvatarTypeOuterClass.AvatarType getAvatarType() {
                @SuppressWarnings("deprecation")
                emu.grasscutter.net.proto.AvatarTypeOuterClass.AvatarType result =
                        emu.grasscutter.net.proto.AvatarTypeOuterClass.AvatarType.valueOf(avatarType_);
                return result == null
                        ? emu.grasscutter.net.proto.AvatarTypeOuterClass.AvatarType.UNRECOGNIZED
                        : result;
            }
            /**
             * <code>.AvatarType avatar_type = 5;</code>
             *
             * @param value The avatarType to set.
             * @return This builder for chaining.
             */
            public Builder setAvatarType(
                    emu.grasscutter.net.proto.AvatarTypeOuterClass.AvatarType value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                avatarType_ = value.getNumber();
                onChanged();
                return this;
            }
            /**
             * <code>.AvatarType avatar_type = 5;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearAvatarType() {

                avatarType_ = 0;
                onChanged();
                return this;
            }

            private int costumeId_;
            /**
             * <code>uint32 costume_id = 11;</code>
             *
             * @return The costumeId.
             */
            @java.lang.Override
            public int getCostumeId() {
                return costumeId_;
            }
            /**
             * <code>uint32 costume_id = 11;</code>
             *
             * @param value The costumeId to set.
             * @return This builder for chaining.
             */
            public Builder setCostumeId(int value) {

                costumeId_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>uint32 costume_id = 11;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearCostumeId() {

                costumeId_ = 0;
                onChanged();
                return this;
            }

            private int avatarId_;
            /**
             * <code>uint32 avatar_id = 14;</code>
             *
             * @return The avatarId.
             */
            @java.lang.Override
            public int getAvatarId() {
                return avatarId_;
            }
            /**
             * <code>uint32 avatar_id = 14;</code>
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
             * <code>uint32 avatar_id = 14;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearAvatarId() {

                avatarId_ = 0;
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

            // @@protoc_insertion_point(builder_scope:MistTrialBestAvatar)
        }

        // @@protoc_insertion_point(class_scope:MistTrialBestAvatar)
        private static final emu.grasscutter.net.proto.MistTrialBestAvatarOuterClass.MistTrialBestAvatar
                DEFAULT_INSTANCE;

        static {
            DEFAULT_INSTANCE =
                    new emu.grasscutter.net.proto.MistTrialBestAvatarOuterClass.MistTrialBestAvatar();
        }

        public static emu.grasscutter.net.proto.MistTrialBestAvatarOuterClass.MistTrialBestAvatar
                getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<MistTrialBestAvatar> PARSER =
                new com.google.protobuf.AbstractParser<MistTrialBestAvatar>() {
                    @java.lang.Override
                    public MistTrialBestAvatar parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new MistTrialBestAvatar(input, extensionRegistry);
                    }
                };

        public static com.google.protobuf.Parser<MistTrialBestAvatar> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<MistTrialBestAvatar> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public emu.grasscutter.net.proto.MistTrialBestAvatarOuterClass.MistTrialBestAvatar
                getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_MistTrialBestAvatar_descriptor;
    private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_MistTrialBestAvatar_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

    static {
        java.lang.String[] descriptorData = {
            "\n\031MistTrialBestAvatar.proto\032\020AvatarType."
                    + "proto\"^\n\023MistTrialBestAvatar\022 \n\013avatar_t"
                    + "ype\030\005 \001(\0162\013.AvatarType\022\022\n\ncostume_id\030\013 \001"
                    + "(\r\022\021\n\tavatar_id\030\016 \001(\rB\033\n\031emu.grasscutter"
                    + ".net.protob\006proto3"
        };
        descriptor =
                com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
                        descriptorData,
                        new com.google.protobuf.Descriptors.FileDescriptor[] {
                            emu.grasscutter.net.proto.AvatarTypeOuterClass.getDescriptor(),
                        });
        internal_static_MistTrialBestAvatar_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_MistTrialBestAvatar_fieldAccessorTable =
                new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                        internal_static_MistTrialBestAvatar_descriptor,
                        new java.lang.String[] {
                            "AvatarType", "CostumeId", "AvatarId",
                        });
        emu.grasscutter.net.proto.AvatarTypeOuterClass.getDescriptor();
    }

    // @@protoc_insertion_point(outer_class_scope)
}
