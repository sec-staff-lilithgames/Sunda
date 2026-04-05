package com.explorestack.protobuf.adcom;

import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.ja;
import com.explorestack.protobuf.p7;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public enum ApiFramework implements ja {
    API_FRAMEWORK_INVALID(0),
    API_FRAMEWORK_VPAID_1_0(1),
    API_FRAMEWORK_VPAID_2_0(2),
    API_FRAMEWORK_MRAID_1_0(3),
    API_FRAMEWORK_ORMMA(4),
    API_FRAMEWORK_MRAID_2_0(5),
    API_FRAMEWORK_MRAID_3_0(6),
    API_FRAMEWORK_OMID_1_0(7),
    UNRECOGNIZED(-1);

    public static final int API_FRAMEWORK_INVALID_VALUE = 0;
    public static final int API_FRAMEWORK_MRAID_1_0_VALUE = 3;
    public static final int API_FRAMEWORK_MRAID_2_0_VALUE = 5;
    public static final int API_FRAMEWORK_MRAID_3_0_VALUE = 6;
    public static final int API_FRAMEWORK_OMID_1_0_VALUE = 7;
    public static final int API_FRAMEWORK_ORMMA_VALUE = 4;
    public static final int API_FRAMEWORK_VPAID_1_0_VALUE = 1;
    public static final int API_FRAMEWORK_VPAID_2_0_VALUE = 2;
    private final int value;
    private static final p7 internalValueMap = new p7() { // from class: com.explorestack.protobuf.adcom.ApiFramework.1
        @Override // com.explorestack.protobuf.p7
        public ApiFramework findValueByNumber(int i10) {
            return ApiFramework.forNumber(i10);
        }
    };
    private static final ApiFramework[] VALUES = values();

    ApiFramework(int i10) {
        this.value = i10;
    }

    public static ApiFramework forNumber(int i10) {
        switch (i10) {
            case 0:
                return API_FRAMEWORK_INVALID;
            case 1:
                return API_FRAMEWORK_VPAID_1_0;
            case 2:
                return API_FRAMEWORK_VPAID_2_0;
            case 3:
                return API_FRAMEWORK_MRAID_1_0;
            case 4:
                return API_FRAMEWORK_ORMMA;
            case 5:
                return API_FRAMEWORK_MRAID_2_0;
            case 6:
                return API_FRAMEWORK_MRAID_3_0;
            case 7:
                return API_FRAMEWORK_OMID_1_0;
            default:
                return null;
        }
    }

    public static final Descriptors.EnumDescriptor getDescriptor() {
        return (Descriptors.EnumDescriptor) com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.A(1);
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
    public static ApiFramework valueOf(int i10) {
        return forNumber(i10);
    }

    public static ApiFramework valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
        if (enumValueDescriptor.getType() == getDescriptor()) {
            if (enumValueDescriptor.getIndex() == -1) {
                return UNRECOGNIZED;
            }
            return VALUES[enumValueDescriptor.getIndex()];
        }
        throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
}
