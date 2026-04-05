package com.explorestack.protobuf.adcom;

import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.ja;
import com.explorestack.protobuf.p7;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public enum VideoCreativeType implements ja {
    VIDEO_CREATIVE_TYPE_INVALID(0),
    VIDEO_CREATIVE_TYPE_VAST_1_0(1),
    VIDEO_CREATIVE_TYPE_VAST_2_0(2),
    VIDEO_CREATIVE_TYPE_VAST_3_0(3),
    VIDEO_CREATIVE_TYPE_VAST_WRAPPER_1_0(4),
    VIDEO_CREATIVE_TYPE_VAST_WRAPPER_2_0(5),
    VIDEO_CREATIVE_TYPE_VAST_WRAPPER_3_0(6),
    VIDEO_CREATIVE_TYPE_VAST_4_0(7),
    VIDEO_CREATIVE_TYPE_VAST_WRAPPER_4_0(8),
    VIDEO_CREATIVE_TYPE_VAST_4_1(9),
    VIDEO_CREATIVE_TYPE_VAST_WRAPPER_4_1(10),
    UNRECOGNIZED(-1);

    public static final int VIDEO_CREATIVE_TYPE_INVALID_VALUE = 0;
    public static final int VIDEO_CREATIVE_TYPE_VAST_1_0_VALUE = 1;
    public static final int VIDEO_CREATIVE_TYPE_VAST_2_0_VALUE = 2;
    public static final int VIDEO_CREATIVE_TYPE_VAST_3_0_VALUE = 3;
    public static final int VIDEO_CREATIVE_TYPE_VAST_4_0_VALUE = 7;
    public static final int VIDEO_CREATIVE_TYPE_VAST_4_1_VALUE = 9;
    public static final int VIDEO_CREATIVE_TYPE_VAST_WRAPPER_1_0_VALUE = 4;
    public static final int VIDEO_CREATIVE_TYPE_VAST_WRAPPER_2_0_VALUE = 5;
    public static final int VIDEO_CREATIVE_TYPE_VAST_WRAPPER_3_0_VALUE = 6;
    public static final int VIDEO_CREATIVE_TYPE_VAST_WRAPPER_4_0_VALUE = 8;
    public static final int VIDEO_CREATIVE_TYPE_VAST_WRAPPER_4_1_VALUE = 10;
    private final int value;
    private static final p7 internalValueMap = new p7() { // from class: com.explorestack.protobuf.adcom.VideoCreativeType.1
        @Override // com.explorestack.protobuf.p7
        public VideoCreativeType findValueByNumber(int i10) {
            return VideoCreativeType.forNumber(i10);
        }
    };
    private static final VideoCreativeType[] VALUES = values();

    VideoCreativeType(int i10) {
        this.value = i10;
    }

    public static VideoCreativeType forNumber(int i10) {
        switch (i10) {
            case 0:
                return VIDEO_CREATIVE_TYPE_INVALID;
            case 1:
                return VIDEO_CREATIVE_TYPE_VAST_1_0;
            case 2:
                return VIDEO_CREATIVE_TYPE_VAST_2_0;
            case 3:
                return VIDEO_CREATIVE_TYPE_VAST_3_0;
            case 4:
                return VIDEO_CREATIVE_TYPE_VAST_WRAPPER_1_0;
            case 5:
                return VIDEO_CREATIVE_TYPE_VAST_WRAPPER_2_0;
            case 6:
                return VIDEO_CREATIVE_TYPE_VAST_WRAPPER_3_0;
            case 7:
                return VIDEO_CREATIVE_TYPE_VAST_4_0;
            case 8:
                return VIDEO_CREATIVE_TYPE_VAST_WRAPPER_4_0;
            case 9:
                return VIDEO_CREATIVE_TYPE_VAST_4_1;
            case 10:
                return VIDEO_CREATIVE_TYPE_VAST_WRAPPER_4_1;
            default:
                return null;
        }
    }

    public static final Descriptors.EnumDescriptor getDescriptor() {
        return (Descriptors.EnumDescriptor) com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.A(29);
    }

    public static p7 internalGetValueMap() {
        return internalValueMap;
    }

    @Override // com.explorestack.protobuf.ja
    public final Descriptors.EnumDescriptor getDescriptorForType() {
        return getDescriptor();
    }

    @Override // com.explorestack.protobuf.ja, com.explorestack.protobuf.o7
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // com.explorestack.protobuf.ja
    public final Descriptors.EnumValueDescriptor getValueDescriptor() {
        if (this != UNRECOGNIZED) {
            return getDescriptor().getValues().get(ordinal());
        }
        throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
    }

    @Deprecated
    public static VideoCreativeType valueOf(int i10) {
        return forNumber(i10);
    }

    public static VideoCreativeType valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
        if (enumValueDescriptor.getType() == getDescriptor()) {
            if (enumValueDescriptor.getIndex() == -1) {
                return UNRECOGNIZED;
            }
            return VALUES[enumValueDescriptor.getIndex()];
        }
        throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
}
