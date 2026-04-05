package com.explorestack.protobuf.adcom;

import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.ja;
import com.explorestack.protobuf.p7;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public enum PlacementPosition implements ja {
    PLACEMENT_POSITION_INVALID(0),
    PLACEMENT_POSITION_ABOVE_THE_FOLD(1),
    PLACEMENT_POSITION_LOCKED(2),
    PLACEMENT_POSITION_BELOW_THE_FOLD(3),
    PLACEMENT_POSITION_HEADER(4),
    PLACEMENT_POSITION_FOOTER(5),
    PLACEMENT_POSITION_SIDEBAR(6),
    PLACEMENT_POSITION_FULLSCREEN(7),
    UNRECOGNIZED(-1);

    public static final int PLACEMENT_POSITION_ABOVE_THE_FOLD_VALUE = 1;
    public static final int PLACEMENT_POSITION_BELOW_THE_FOLD_VALUE = 3;
    public static final int PLACEMENT_POSITION_FOOTER_VALUE = 5;
    public static final int PLACEMENT_POSITION_FULLSCREEN_VALUE = 7;
    public static final int PLACEMENT_POSITION_HEADER_VALUE = 4;
    public static final int PLACEMENT_POSITION_INVALID_VALUE = 0;
    public static final int PLACEMENT_POSITION_LOCKED_VALUE = 2;
    public static final int PLACEMENT_POSITION_SIDEBAR_VALUE = 6;
    private final int value;
    private static final p7 internalValueMap = new p7() { // from class: com.explorestack.protobuf.adcom.PlacementPosition.1
        @Override // com.explorestack.protobuf.p7
        public PlacementPosition findValueByNumber(int i10) {
            return PlacementPosition.forNumber(i10);
        }
    };
    private static final PlacementPosition[] VALUES = values();

    PlacementPosition(int i10) {
        this.value = i10;
    }

    public static PlacementPosition forNumber(int i10) {
        switch (i10) {
            case 0:
                return PLACEMENT_POSITION_INVALID;
            case 1:
                return PLACEMENT_POSITION_ABOVE_THE_FOLD;
            case 2:
                return PLACEMENT_POSITION_LOCKED;
            case 3:
                return PLACEMENT_POSITION_BELOW_THE_FOLD;
            case 4:
                return PLACEMENT_POSITION_HEADER;
            case 5:
                return PLACEMENT_POSITION_FOOTER;
            case 6:
                return PLACEMENT_POSITION_SIDEBAR;
            case 7:
                return PLACEMENT_POSITION_FULLSCREEN;
            default:
                return null;
        }
    }

    public static final Descriptors.EnumDescriptor getDescriptor() {
        return (Descriptors.EnumDescriptor) com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.A(26);
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
    public static PlacementPosition valueOf(int i10) {
        return forNumber(i10);
    }

    public static PlacementPosition valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
        if (enumValueDescriptor.getType() == getDescriptor()) {
            if (enumValueDescriptor.getIndex() == -1) {
                return UNRECOGNIZED;
            }
            return VALUES[enumValueDescriptor.getIndex()];
        }
        throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
}
