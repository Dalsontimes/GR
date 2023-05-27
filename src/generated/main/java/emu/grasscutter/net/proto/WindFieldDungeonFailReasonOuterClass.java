// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: WindFieldDungeonFailReason.proto

package emu.grasscutter.net.proto;

public final class WindFieldDungeonFailReasonOuterClass {
    private WindFieldDungeonFailReasonOuterClass() {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
    }
    /**
     *
     *
     * <pre>
     * Obf: LCLLFHFCPHG
     * </pre>
     *
     * Protobuf enum {@code WindFieldDungeonFailReason}
     */
    public enum WindFieldDungeonFailReason implements com.google.protobuf.ProtocolMessageEnum {
        /** <code>WIND_FIELD_DUNGEON_FAIL_NONE = 0;</code> */
        WIND_FIELD_DUNGEON_FAIL_NONE(0),
        /** <code>WIND_FIELD_DUNGEON_FAIL_CANCEL = 1;</code> */
        WIND_FIELD_DUNGEON_FAIL_CANCEL(1),
        /** <code>WIND_FIELD_DUNGEON_FAIL_TIMEOUT = 2;</code> */
        WIND_FIELD_DUNGEON_FAIL_TIMEOUT(2),
        /** <code>WIND_FIELD_DUNGEON_FAIL_ALL_AVATAR_DIE = 3;</code> */
        WIND_FIELD_DUNGEON_FAIL_ALL_AVATAR_DIE(3),
        /** <code>WIND_FIELD_DUNGEON_FAIL_LUA_INTERRUPT = 4;</code> */
        WIND_FIELD_DUNGEON_FAIL_LUA_INTERRUPT(4),
        UNRECOGNIZED(-1),
        ;

        /** <code>WIND_FIELD_DUNGEON_FAIL_NONE = 0;</code> */
        public static final int WIND_FIELD_DUNGEON_FAIL_NONE_VALUE = 0;
        /** <code>WIND_FIELD_DUNGEON_FAIL_CANCEL = 1;</code> */
        public static final int WIND_FIELD_DUNGEON_FAIL_CANCEL_VALUE = 1;
        /** <code>WIND_FIELD_DUNGEON_FAIL_TIMEOUT = 2;</code> */
        public static final int WIND_FIELD_DUNGEON_FAIL_TIMEOUT_VALUE = 2;
        /** <code>WIND_FIELD_DUNGEON_FAIL_ALL_AVATAR_DIE = 3;</code> */
        public static final int WIND_FIELD_DUNGEON_FAIL_ALL_AVATAR_DIE_VALUE = 3;
        /** <code>WIND_FIELD_DUNGEON_FAIL_LUA_INTERRUPT = 4;</code> */
        public static final int WIND_FIELD_DUNGEON_FAIL_LUA_INTERRUPT_VALUE = 4;

        public final int getNumber() {
            if (this == UNRECOGNIZED) {
                throw new java.lang.IllegalArgumentException(
                        "Can't get the number of an unknown enum value.");
            }
            return value;
        }

        /**
         * @param value The numeric wire value of the corresponding enum entry.
         * @return The enum associated with the given numeric wire value.
         * @deprecated Use {@link #forNumber(int)} instead.
         */
        @java.lang.Deprecated
        public static WindFieldDungeonFailReason valueOf(int value) {
            return forNumber(value);
        }

        /**
         * @param value The numeric wire value of the corresponding enum entry.
         * @return The enum associated with the given numeric wire value.
         */
        public static WindFieldDungeonFailReason forNumber(int value) {
            switch (value) {
                case 0:
                    return WIND_FIELD_DUNGEON_FAIL_NONE;
                case 1:
                    return WIND_FIELD_DUNGEON_FAIL_CANCEL;
                case 2:
                    return WIND_FIELD_DUNGEON_FAIL_TIMEOUT;
                case 3:
                    return WIND_FIELD_DUNGEON_FAIL_ALL_AVATAR_DIE;
                case 4:
                    return WIND_FIELD_DUNGEON_FAIL_LUA_INTERRUPT;
                default:
                    return null;
            }
        }

        public static com.google.protobuf.Internal.EnumLiteMap<WindFieldDungeonFailReason>
                internalGetValueMap() {
            return internalValueMap;
        }

        private static final com.google.protobuf.Internal.EnumLiteMap<WindFieldDungeonFailReason>
                internalValueMap =
                        new com.google.protobuf.Internal.EnumLiteMap<WindFieldDungeonFailReason>() {
                            public WindFieldDungeonFailReason findValueByNumber(int number) {
                                return WindFieldDungeonFailReason.forNumber(number);
                            }
                        };

        public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
            if (this == UNRECOGNIZED) {
                throw new java.lang.IllegalStateException(
                        "Can't get the descriptor of an unrecognized enum value.");
            }
            return getDescriptor().getValues().get(ordinal());
        }

        public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
            return getDescriptor();
        }

        public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
            return emu.grasscutter.net.proto.WindFieldDungeonFailReasonOuterClass.getDescriptor()
                    .getEnumTypes()
                    .get(0);
        }

        private static final WindFieldDungeonFailReason[] VALUES = values();

        public static WindFieldDungeonFailReason valueOf(
                com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
            if (desc.getType() != getDescriptor()) {
                throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
            if (desc.getIndex() == -1) {
                return UNRECOGNIZED;
            }
            return VALUES[desc.getIndex()];
        }

        private final int value;

        private WindFieldDungeonFailReason(int value) {
            this.value = value;
        }

        // @@protoc_insertion_point(enum_scope:WindFieldDungeonFailReason)
    }

    public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

    static {
        java.lang.String[] descriptorData = {
            "\n WindFieldDungeonFailReason.proto*\336\001\n\032W"
                    + "indFieldDungeonFailReason\022 \n\034WIND_FIELD_"
                    + "DUNGEON_FAIL_NONE\020\000\022\"\n\036WIND_FIELD_DUNGEO"
                    + "N_FAIL_CANCEL\020\001\022#\n\037WIND_FIELD_DUNGEON_FA"
                    + "IL_TIMEOUT\020\002\022*\n&WIND_FIELD_DUNGEON_FAIL_"
                    + "ALL_AVATAR_DIE\020\003\022)\n%WIND_FIELD_DUNGEON_F"
                    + "AIL_LUA_INTERRUPT\020\004B\033\n\031emu.grasscutter.n"
                    + "et.protob\006proto3"
        };
        descriptor =
                com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
                        descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
    }

    // @@protoc_insertion_point(outer_class_scope)
}
