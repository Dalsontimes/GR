// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: WidgetSlotOp.proto

package emu.grasscutter.net.proto;

public final class WidgetSlotOpOuterClass {
    private WidgetSlotOpOuterClass() {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
    }
    /**
     *
     *
     * <pre>
     * Obf: DAADDKFJJAH
     * </pre>
     *
     * Protobuf enum {@code WidgetSlotOp}
     */
    public enum WidgetSlotOp implements com.google.protobuf.ProtocolMessageEnum {
        /** <code>WIDGET_SLOT_OP_ATTACH = 0;</code> */
        WIDGET_SLOT_OP_ATTACH(0),
        /** <code>WIDGET_SLOT_OP_DETACH = 1;</code> */
        WIDGET_SLOT_OP_DETACH(1),
        UNRECOGNIZED(-1),
        ;

        /** <code>WIDGET_SLOT_OP_ATTACH = 0;</code> */
        public static final int WIDGET_SLOT_OP_ATTACH_VALUE = 0;
        /** <code>WIDGET_SLOT_OP_DETACH = 1;</code> */
        public static final int WIDGET_SLOT_OP_DETACH_VALUE = 1;

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
        public static WidgetSlotOp valueOf(int value) {
            return forNumber(value);
        }

        /**
         * @param value The numeric wire value of the corresponding enum entry.
         * @return The enum associated with the given numeric wire value.
         */
        public static WidgetSlotOp forNumber(int value) {
            switch (value) {
                case 0:
                    return WIDGET_SLOT_OP_ATTACH;
                case 1:
                    return WIDGET_SLOT_OP_DETACH;
                default:
                    return null;
            }
        }

        public static com.google.protobuf.Internal.EnumLiteMap<WidgetSlotOp> internalGetValueMap() {
            return internalValueMap;
        }

        private static final com.google.protobuf.Internal.EnumLiteMap<WidgetSlotOp> internalValueMap =
                new com.google.protobuf.Internal.EnumLiteMap<WidgetSlotOp>() {
                    public WidgetSlotOp findValueByNumber(int number) {
                        return WidgetSlotOp.forNumber(number);
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
            return emu.grasscutter.net.proto.WidgetSlotOpOuterClass.getDescriptor().getEnumTypes().get(0);
        }

        private static final WidgetSlotOp[] VALUES = values();

        public static WidgetSlotOp valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
            if (desc.getType() != getDescriptor()) {
                throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
            if (desc.getIndex() == -1) {
                return UNRECOGNIZED;
            }
            return VALUES[desc.getIndex()];
        }

        private final int value;

        private WidgetSlotOp(int value) {
            this.value = value;
        }

        // @@protoc_insertion_point(enum_scope:WidgetSlotOp)
    }

    public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

    static {
        java.lang.String[] descriptorData = {
            "\n\022WidgetSlotOp.proto*D\n\014WidgetSlotOp\022\031\n\025"
                    + "WIDGET_SLOT_OP_ATTACH\020\000\022\031\n\025WIDGET_SLOT_O"
                    + "P_DETACH\020\001B\033\n\031emu.grasscutter.net.protob"
                    + "\006proto3"
        };
        descriptor =
                com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
                        descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
    }

    // @@protoc_insertion_point(outer_class_scope)
}
