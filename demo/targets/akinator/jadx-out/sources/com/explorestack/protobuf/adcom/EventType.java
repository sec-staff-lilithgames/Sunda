package com.explorestack.protobuf.adcom;

import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.ja;
import com.explorestack.protobuf.p7;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public enum EventType implements ja {
    EVENT_TYPE_INVALID(0),
    EVENT_TYPE_IMPRESSION(1),
    EVENT_TYPE_VIEWABLE_MRC_50(2),
    EVENT_TYPE_VIEWABLE_MRC_100(3),
    EVENT_TYPE_VIEWABLE_VIDEO_50(4),
    UNRECOGNIZED(-1);

    public static final int EVENT_TYPE_IMPRESSION_VALUE = 1;
    public static final int EVENT_TYPE_INVALID_VALUE = 0;
    public static final int EVENT_TYPE_VIEWABLE_MRC_100_VALUE = 3;
    public static final int EVENT_TYPE_VIEWABLE_MRC_50_VALUE = 2;
    public static final int EVENT_TYPE_VIEWABLE_VIDEO_50_VALUE = 4;
    private final int value;
    private static final p7 internalValueMap = new p7() { // from class: com.explorestack.protobuf.adcom.EventType.1
        @Override // com.explorestack.protobuf.p7
        public EventType findValueByNumber(int i10) {
            return EventType.forNumber(i10);
        }
    };
    private static final EventType[] VALUES = values();

    EventType(int i10) {
        this.value = i10;
    }

    public static EventType forNumber(int i10) {
        if (i10 == 0) {
            return EVENT_TYPE_INVALID;
        }
        if (i10 == 1) {
            return EVENT_TYPE_IMPRESSION;
        }
        if (i10 == 2) {
            return EVENT_TYPE_VIEWABLE_MRC_50;
        }
        if (i10 == 3) {
            return EVENT_TYPE_VIEWABLE_MRC_100;
        }
        if (i10 != 4) {
            return null;
        }
        return EVENT_TYPE_VIEWABLE_VIDEO_50;
    }

    public static final Descriptors.EnumDescriptor getDescriptor() {
        return (Descriptors.EnumDescriptor) com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.A(15);
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
    public static EventType valueOf(int i10) {
        return forNumber(i10);
    }

    public static EventType valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
        if (enumValueDescriptor.getType() == getDescriptor()) {
            if (enumValueDescriptor.getIndex() == -1) {
                return UNRECOGNIZED;
            }
            return VALUES[enumValueDescriptor.getIndex()];
        }
        throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
}
