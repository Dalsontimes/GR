// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ActivityPushTipsState.proto

package emu.grasscutter.net.proto;

public final class ActivityPushTipsStateOuterClass {
  private ActivityPushTipsStateOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * <pre>
   * Name: FHPBGAOJEJH
   * </pre>
   *
   * Protobuf enum {@code ActivityPushTipsState}
   */
  public enum ActivityPushTipsState
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>ACTIVITY_PUSH_TIPS_STATE_NONE = 0;</code>
     */
    ACTIVITY_PUSH_TIPS_STATE_NONE(0),
    /**
     * <code>ACTIVITY_PUSH_TIPS_STATE_START = 1;</code>
     */
    ACTIVITY_PUSH_TIPS_STATE_START(1),
    /**
     * <code>ACTIVITY_PUSH_TIPS_STATE_READ = 2;</code>
     */
    ACTIVITY_PUSH_TIPS_STATE_READ(2),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>ACTIVITY_PUSH_TIPS_STATE_NONE = 0;</code>
     */
    public static final int ACTIVITY_PUSH_TIPS_STATE_NONE_VALUE = 0;
    /**
     * <code>ACTIVITY_PUSH_TIPS_STATE_START = 1;</code>
     */
    public static final int ACTIVITY_PUSH_TIPS_STATE_START_VALUE = 1;
    /**
     * <code>ACTIVITY_PUSH_TIPS_STATE_READ = 2;</code>
     */
    public static final int ACTIVITY_PUSH_TIPS_STATE_READ_VALUE = 2;


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
    public static ActivityPushTipsState valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static ActivityPushTipsState forNumber(int value) {
      switch (value) {
        case 0: return ACTIVITY_PUSH_TIPS_STATE_NONE;
        case 1: return ACTIVITY_PUSH_TIPS_STATE_START;
        case 2: return ACTIVITY_PUSH_TIPS_STATE_READ;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<ActivityPushTipsState>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        ActivityPushTipsState> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<ActivityPushTipsState>() {
            public ActivityPushTipsState findValueByNumber(int number) {
              return ActivityPushTipsState.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.ActivityPushTipsStateOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final ActivityPushTipsState[] VALUES = values();

    public static ActivityPushTipsState valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private ActivityPushTipsState(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:ActivityPushTipsState)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033ActivityPushTipsState.proto*\201\001\n\025Activi" +
      "tyPushTipsState\022!\n\035ACTIVITY_PUSH_TIPS_ST" +
      "ATE_NONE\020\000\022\"\n\036ACTIVITY_PUSH_TIPS_STATE_S" +
      "TART\020\001\022!\n\035ACTIVITY_PUSH_TIPS_STATE_READ\020" +
      "\002B!\n\031emu.grasscutter.net.protoZ\004/genb\006pr" +
      "oto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
