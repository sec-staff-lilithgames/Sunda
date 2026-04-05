package com.explorestack.protobuf.adcom;

import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.ja;
import com.explorestack.protobuf.p7;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public enum NativeAssetPosition implements ja {
    ASSET_POSITION_TOP_LEFT(0),
    ASSET_POSITION_TOP_RIGHT(1),
    ASSET_POSITION_BOTTOM_LEFT(2),
    ASSET_POSITION_BOTTOM_RIGHT(3),
    UNRECOGNIZED(-1);

    public static final int ASSET_POSITION_BOTTOM_LEFT_VALUE = 2;
    public static final int ASSET_POSITION_BOTTOM_RIGHT_VALUE = 3;
    public static final int ASSET_POSITION_TOP_LEFT_VALUE = 0;
    public static final int ASSET_POSITION_TOP_RIGHT_VALUE = 1;
    private final int value;
    private static final p7 internalValueMap = new p7() { // from class: com.explorestack.protobuf.adcom.NativeAssetPosition.1
        @Override // com.explorestack.protobuf.p7
        public NativeAssetPosition findValueByNumber(int i10) {
            return NativeAssetPosition.forNumber(i10);
        }
    };
    private static final NativeAssetPosition[] VALUES = values();

    NativeAssetPosition(int i10) {
        this.value = i10;
    }

    public static NativeAssetPosition forNumber(int i10) {
        if (i10 == 0) {
            return ASSET_POSITION_TOP_LEFT;
        }
        if (i10 == 1) {
            return ASSET_POSITION_TOP_RIGHT;
        }
        if (i10 == 2) {
            return ASSET_POSITION_BOTTOM_LEFT;
        }
        if (i10 != 3) {
            return null;
        }
        return ASSET_POSITION_BOTTOM_RIGHT;
    }

    public static final Descriptors.EnumDescriptor getDescriptor() {
        return (Descriptors.EnumDescriptor) com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.A(22);
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
    public static NativeAssetPosition valueOf(int i10) {
        return forNumber(i10);
    }

    public static NativeAssetPosition valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
        if (enumValueDescriptor.getType() == getDescriptor()) {
            if (enumValueDescriptor.getIndex() == -1) {
                return UNRECOGNIZED;
            }
            return VALUES[enumValueDescriptor.getIndex()];
        }
        throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
}
