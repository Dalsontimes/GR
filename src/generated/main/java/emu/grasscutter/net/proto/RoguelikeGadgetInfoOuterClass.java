// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: RoguelikeGadgetInfo.proto

package emu.grasscutter.net.proto;

public final class RoguelikeGadgetInfoOuterClass {
    private RoguelikeGadgetInfoOuterClass() {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
    }

    public interface RoguelikeGadgetInfoOrBuilder
            extends
            // @@protoc_insertion_point(interface_extends:RoguelikeGadgetInfo)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>uint32 cell_config_id = 1;</code>
         *
         * @return The cellConfigId.
         */
        int getCellConfigId();

        /**
         * <code>uint32 cell_type = 2;</code>
         *
         * @return The cellType.
         */
        int getCellType();

        /**
         * <code>uint32 cell_state = 3;</code>
         *
         * @return The cellState.
         */
        int getCellState();

        /**
         * <code>uint32 cell_id = 4;</code>
         *
         * @return The cellId.
         */
        int getCellId();
    }
    /**
     *
     *
     * <pre>
     * Obf: JGFICLGKFFD
     * </pre>
     *
     * Protobuf type {@code RoguelikeGadgetInfo}
     */
    public static final class RoguelikeGadgetInfo extends com.google.protobuf.GeneratedMessageV3
            implements
            // @@protoc_insertion_point(message_implements:RoguelikeGadgetInfo)
            RoguelikeGadgetInfoOrBuilder {
        private static final long serialVersionUID = 0L;
        // Use RoguelikeGadgetInfo.newBuilder() to construct.
        private RoguelikeGadgetInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private RoguelikeGadgetInfo() {}

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
            return new RoguelikeGadgetInfo();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private RoguelikeGadgetInfo(
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
                        case 8:
                            {
                                cellConfigId_ = input.readUInt32();
                                break;
                            }
                        case 16:
                            {
                                cellType_ = input.readUInt32();
                                break;
                            }
                        case 24:
                            {
                                cellState_ = input.readUInt32();
                                break;
                            }
                        case 32:
                            {
                                cellId_ = input.readUInt32();
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
            return emu.grasscutter.net.proto.RoguelikeGadgetInfoOuterClass
                    .internal_static_RoguelikeGadgetInfo_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                internalGetFieldAccessorTable() {
            return emu.grasscutter.net.proto.RoguelikeGadgetInfoOuterClass
                    .internal_static_RoguelikeGadgetInfo_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            emu.grasscutter.net.proto.RoguelikeGadgetInfoOuterClass.RoguelikeGadgetInfo.class,
                            emu.grasscutter.net.proto.RoguelikeGadgetInfoOuterClass.RoguelikeGadgetInfo.Builder
                                    .class);
        }

        public static final int CELL_CONFIG_ID_FIELD_NUMBER = 1;
        private int cellConfigId_;
        /**
         * <code>uint32 cell_config_id = 1;</code>
         *
         * @return The cellConfigId.
         */
        @java.lang.Override
        public int getCellConfigId() {
            return cellConfigId_;
        }

        public static final int CELL_TYPE_FIELD_NUMBER = 2;
        private int cellType_;
        /**
         * <code>uint32 cell_type = 2;</code>
         *
         * @return The cellType.
         */
        @java.lang.Override
        public int getCellType() {
            return cellType_;
        }

        public static final int CELL_STATE_FIELD_NUMBER = 3;
        private int cellState_;
        /**
         * <code>uint32 cell_state = 3;</code>
         *
         * @return The cellState.
         */
        @java.lang.Override
        public int getCellState() {
            return cellState_;
        }

        public static final int CELL_ID_FIELD_NUMBER = 4;
        private int cellId_;
        /**
         * <code>uint32 cell_id = 4;</code>
         *
         * @return The cellId.
         */
        @java.lang.Override
        public int getCellId() {
            return cellId_;
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
            if (cellConfigId_ != 0) {
                output.writeUInt32(1, cellConfigId_);
            }
            if (cellType_ != 0) {
                output.writeUInt32(2, cellType_);
            }
            if (cellState_ != 0) {
                output.writeUInt32(3, cellState_);
            }
            if (cellId_ != 0) {
                output.writeUInt32(4, cellId_);
            }
            unknownFields.writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (cellConfigId_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeUInt32Size(1, cellConfigId_);
            }
            if (cellType_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeUInt32Size(2, cellType_);
            }
            if (cellState_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeUInt32Size(3, cellState_);
            }
            if (cellId_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeUInt32Size(4, cellId_);
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
                    instanceof emu.grasscutter.net.proto.RoguelikeGadgetInfoOuterClass.RoguelikeGadgetInfo)) {
                return super.equals(obj);
            }
            emu.grasscutter.net.proto.RoguelikeGadgetInfoOuterClass.RoguelikeGadgetInfo other =
                    (emu.grasscutter.net.proto.RoguelikeGadgetInfoOuterClass.RoguelikeGadgetInfo) obj;

            if (getCellConfigId() != other.getCellConfigId()) return false;
            if (getCellType() != other.getCellType()) return false;
            if (getCellState() != other.getCellState()) return false;
            if (getCellId() != other.getCellId()) return false;
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
            hash = (37 * hash) + CELL_CONFIG_ID_FIELD_NUMBER;
            hash = (53 * hash) + getCellConfigId();
            hash = (37 * hash) + CELL_TYPE_FIELD_NUMBER;
            hash = (53 * hash) + getCellType();
            hash = (37 * hash) + CELL_STATE_FIELD_NUMBER;
            hash = (53 * hash) + getCellState();
            hash = (37 * hash) + CELL_ID_FIELD_NUMBER;
            hash = (53 * hash) + getCellId();
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static emu.grasscutter.net.proto.RoguelikeGadgetInfoOuterClass.RoguelikeGadgetInfo
                parseFrom(java.nio.ByteBuffer data)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.RoguelikeGadgetInfoOuterClass.RoguelikeGadgetInfo
                parseFrom(
                        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.RoguelikeGadgetInfoOuterClass.RoguelikeGadgetInfo
                parseFrom(com.google.protobuf.ByteString data)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.RoguelikeGadgetInfoOuterClass.RoguelikeGadgetInfo
                parseFrom(
                        com.google.protobuf.ByteString data,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.RoguelikeGadgetInfoOuterClass.RoguelikeGadgetInfo
                parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.RoguelikeGadgetInfoOuterClass.RoguelikeGadgetInfo
                parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.RoguelikeGadgetInfoOuterClass.RoguelikeGadgetInfo
                parseFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.RoguelikeGadgetInfoOuterClass.RoguelikeGadgetInfo
                parseFrom(
                        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.RoguelikeGadgetInfoOuterClass.RoguelikeGadgetInfo
                parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.RoguelikeGadgetInfoOuterClass.RoguelikeGadgetInfo
                parseDelimitedFrom(
                        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.RoguelikeGadgetInfoOuterClass.RoguelikeGadgetInfo
                parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.RoguelikeGadgetInfoOuterClass.RoguelikeGadgetInfo
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
                emu.grasscutter.net.proto.RoguelikeGadgetInfoOuterClass.RoguelikeGadgetInfo prototype) {
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
         * Obf: JGFICLGKFFD
         * </pre>
         *
         * Protobuf type {@code RoguelikeGadgetInfo}
         */
        public static final class Builder
                extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
                implements
                // @@protoc_insertion_point(builder_implements:RoguelikeGadgetInfo)
                emu.grasscutter.net.proto.RoguelikeGadgetInfoOuterClass.RoguelikeGadgetInfoOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
                return emu.grasscutter.net.proto.RoguelikeGadgetInfoOuterClass
                        .internal_static_RoguelikeGadgetInfo_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                    internalGetFieldAccessorTable() {
                return emu.grasscutter.net.proto.RoguelikeGadgetInfoOuterClass
                        .internal_static_RoguelikeGadgetInfo_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                emu.grasscutter.net.proto.RoguelikeGadgetInfoOuterClass.RoguelikeGadgetInfo.class,
                                emu.grasscutter.net.proto.RoguelikeGadgetInfoOuterClass.RoguelikeGadgetInfo.Builder
                                        .class);
            }

            // Construct using
            // emu.grasscutter.net.proto.RoguelikeGadgetInfoOuterClass.RoguelikeGadgetInfo.newBuilder()
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
                cellConfigId_ = 0;

                cellType_ = 0;

                cellState_ = 0;

                cellId_ = 0;

                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
                return emu.grasscutter.net.proto.RoguelikeGadgetInfoOuterClass
                        .internal_static_RoguelikeGadgetInfo_descriptor;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.RoguelikeGadgetInfoOuterClass.RoguelikeGadgetInfo
                    getDefaultInstanceForType() {
                return emu.grasscutter.net.proto.RoguelikeGadgetInfoOuterClass.RoguelikeGadgetInfo
                        .getDefaultInstance();
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.RoguelikeGadgetInfoOuterClass.RoguelikeGadgetInfo build() {
                emu.grasscutter.net.proto.RoguelikeGadgetInfoOuterClass.RoguelikeGadgetInfo result =
                        buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.RoguelikeGadgetInfoOuterClass.RoguelikeGadgetInfo
                    buildPartial() {
                emu.grasscutter.net.proto.RoguelikeGadgetInfoOuterClass.RoguelikeGadgetInfo result =
                        new emu.grasscutter.net.proto.RoguelikeGadgetInfoOuterClass.RoguelikeGadgetInfo(this);
                result.cellConfigId_ = cellConfigId_;
                result.cellType_ = cellType_;
                result.cellState_ = cellState_;
                result.cellId_ = cellId_;
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
                        emu.grasscutter.net.proto.RoguelikeGadgetInfoOuterClass.RoguelikeGadgetInfo) {
                    return mergeFrom(
                            (emu.grasscutter.net.proto.RoguelikeGadgetInfoOuterClass.RoguelikeGadgetInfo) other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(
                    emu.grasscutter.net.proto.RoguelikeGadgetInfoOuterClass.RoguelikeGadgetInfo other) {
                if (other
                        == emu.grasscutter.net.proto.RoguelikeGadgetInfoOuterClass.RoguelikeGadgetInfo
                                .getDefaultInstance()) return this;
                if (other.getCellConfigId() != 0) {
                    setCellConfigId(other.getCellConfigId());
                }
                if (other.getCellType() != 0) {
                    setCellType(other.getCellType());
                }
                if (other.getCellState() != 0) {
                    setCellState(other.getCellState());
                }
                if (other.getCellId() != 0) {
                    setCellId(other.getCellId());
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
                emu.grasscutter.net.proto.RoguelikeGadgetInfoOuterClass.RoguelikeGadgetInfo parsedMessage =
                        null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage =
                            (emu.grasscutter.net.proto.RoguelikeGadgetInfoOuterClass.RoguelikeGadgetInfo)
                                    e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private int cellConfigId_;
            /**
             * <code>uint32 cell_config_id = 1;</code>
             *
             * @return The cellConfigId.
             */
            @java.lang.Override
            public int getCellConfigId() {
                return cellConfigId_;
            }
            /**
             * <code>uint32 cell_config_id = 1;</code>
             *
             * @param value The cellConfigId to set.
             * @return This builder for chaining.
             */
            public Builder setCellConfigId(int value) {

                cellConfigId_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>uint32 cell_config_id = 1;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearCellConfigId() {

                cellConfigId_ = 0;
                onChanged();
                return this;
            }

            private int cellType_;
            /**
             * <code>uint32 cell_type = 2;</code>
             *
             * @return The cellType.
             */
            @java.lang.Override
            public int getCellType() {
                return cellType_;
            }
            /**
             * <code>uint32 cell_type = 2;</code>
             *
             * @param value The cellType to set.
             * @return This builder for chaining.
             */
            public Builder setCellType(int value) {

                cellType_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>uint32 cell_type = 2;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearCellType() {

                cellType_ = 0;
                onChanged();
                return this;
            }

            private int cellState_;
            /**
             * <code>uint32 cell_state = 3;</code>
             *
             * @return The cellState.
             */
            @java.lang.Override
            public int getCellState() {
                return cellState_;
            }
            /**
             * <code>uint32 cell_state = 3;</code>
             *
             * @param value The cellState to set.
             * @return This builder for chaining.
             */
            public Builder setCellState(int value) {

                cellState_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>uint32 cell_state = 3;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearCellState() {

                cellState_ = 0;
                onChanged();
                return this;
            }

            private int cellId_;
            /**
             * <code>uint32 cell_id = 4;</code>
             *
             * @return The cellId.
             */
            @java.lang.Override
            public int getCellId() {
                return cellId_;
            }
            /**
             * <code>uint32 cell_id = 4;</code>
             *
             * @param value The cellId to set.
             * @return This builder for chaining.
             */
            public Builder setCellId(int value) {

                cellId_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>uint32 cell_id = 4;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearCellId() {

                cellId_ = 0;
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

            // @@protoc_insertion_point(builder_scope:RoguelikeGadgetInfo)
        }

        // @@protoc_insertion_point(class_scope:RoguelikeGadgetInfo)
        private static final emu.grasscutter.net.proto.RoguelikeGadgetInfoOuterClass.RoguelikeGadgetInfo
                DEFAULT_INSTANCE;

        static {
            DEFAULT_INSTANCE =
                    new emu.grasscutter.net.proto.RoguelikeGadgetInfoOuterClass.RoguelikeGadgetInfo();
        }

        public static emu.grasscutter.net.proto.RoguelikeGadgetInfoOuterClass.RoguelikeGadgetInfo
                getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<RoguelikeGadgetInfo> PARSER =
                new com.google.protobuf.AbstractParser<RoguelikeGadgetInfo>() {
                    @java.lang.Override
                    public RoguelikeGadgetInfo parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new RoguelikeGadgetInfo(input, extensionRegistry);
                    }
                };

        public static com.google.protobuf.Parser<RoguelikeGadgetInfo> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<RoguelikeGadgetInfo> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public emu.grasscutter.net.proto.RoguelikeGadgetInfoOuterClass.RoguelikeGadgetInfo
                getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_RoguelikeGadgetInfo_descriptor;
    private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_RoguelikeGadgetInfo_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

    static {
        java.lang.String[] descriptorData = {
            "\n\031RoguelikeGadgetInfo.proto\"e\n\023Roguelike"
                    + "GadgetInfo\022\026\n\016cell_config_id\030\001 \001(\r\022\021\n\tce"
                    + "ll_type\030\002 \001(\r\022\022\n\ncell_state\030\003 \001(\r\022\017\n\007cel"
                    + "l_id\030\004 \001(\rB\033\n\031emu.grasscutter.net.protob"
                    + "\006proto3"
        };
        descriptor =
                com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
                        descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
        internal_static_RoguelikeGadgetInfo_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_RoguelikeGadgetInfo_fieldAccessorTable =
                new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                        internal_static_RoguelikeGadgetInfo_descriptor,
                        new java.lang.String[] {
                            "CellConfigId", "CellType", "CellState", "CellId",
                        });
    }

    // @@protoc_insertion_point(outer_class_scope)
}
