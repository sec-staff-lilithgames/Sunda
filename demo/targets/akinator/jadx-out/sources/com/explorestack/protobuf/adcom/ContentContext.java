package com.explorestack.protobuf.adcom;

import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.ja;
import com.explorestack.protobuf.p7;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public enum ContentContext implements ja {
    CONTENT_CONTEXT_INVALID(0),
    CONTENT_CONTEXT_VIDEO(1),
    CONTENT_CONTEXT_GAME(2),
    CONTENT_CONTEXT_MUSIC(3),
    CONTENT_CONTEXT_APPLICATION(4),
    CONTENT_CONTEXT_TEXT(5),
    CONTENT_CONTEXT_OTHER(6),
    CONTENT_CONTEXT_UNKNOWN(7),
    UNRECOGNIZED(-1);

    public static final int CONTENT_CONTEXT_APPLICATION_VALUE = 4;
    public static final int CONTENT_CONTEXT_GAME_VALUE = 2;
    public static final int CONTENT_CONTEXT_INVALID_VALUE = 0;
    public static final int CONTENT_CONTEXT_MUSIC_VALUE = 3;
    public static final int CONTENT_CONTEXT_OTHER_VALUE = 6;
    public static final int CONTENT_CONTEXT_TEXT_VALUE = 5;
    public static final int CONTENT_CONTEXT_UNKNOWN_VALUE = 7;
    public static final int CONTENT_CONTEXT_VIDEO_VALUE = 1;
    private final int value;
    private static final p7 internalValueMap = new g();
    private static final ContentContext[] VALUES = values();

    ContentContext(int i10) {
        this.value = i10;
    }

    public static ContentContext forNumber(int i10) {
        switch (i10) {
            case 0:
                return CONTENT_CONTEXT_INVALID;
            case 1:
                return CONTENT_CONTEXT_VIDEO;
            case 2:
                return CONTENT_CONTEXT_GAME;
            case 3:
                return CONTENT_CONTEXT_MUSIC;
            case 4:
                return CONTENT_CONTEXT_APPLICATION;
            case 5:
                return CONTENT_CONTEXT_TEXT;
            case 6:
                return CONTENT_CONTEXT_OTHER;
            case 7:
                return CONTENT_CONTEXT_UNKNOWN;
            default:
                return null;
        }
    }

    public static final Descriptors.EnumDescriptor getDescriptor() {
        return (Descriptors.EnumDescriptor) com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.A(6);
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
    public static ContentContext valueOf(int i10) {
        return forNumber(i10);
    }

    public static ContentContext valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
        if (enumValueDescriptor.getType() == getDescriptor()) {
            if (enumValueDescriptor.getIndex() == -1) {
                return UNRECOGNIZED;
            }
            return VALUES[enumValueDescriptor.getIndex()];
        }
        throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
}
