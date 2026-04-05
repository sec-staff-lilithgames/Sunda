package com.explorestack.protobuf.adcom;

import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.ja;
import com.explorestack.protobuf.p7;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public enum DisplayContextType implements ja {
    DISPLAY_CONTEXT_TYPE_INVALID(0),
    DISPLAY_CONTEXT_TYPE_CONTENT_CENTRIC_CONTEXT(10),
    DISPLAY_CONTEXT_TYPE_ARTICLE_CONTENT(11),
    DISPLAY_CONTEXT_TYPE_VIDEO_CONTENT(12),
    DISPLAY_CONTEXT_TYPE_AUDIO_CONTENT(13),
    DISPLAY_CONTEXT_TYPE_IMAGE_CONTENT(14),
    DISPLAY_CONTEXT_TYPE_USER_GENERATED_CONTENT(15),
    DISPLAY_CONTEXT_TYPE_SOCIAL_CENTRIC_CONTEXT(20),
    DISPLAY_CONTEXT_TYPE_EMAIL_CONTENT(21),
    DISPLAY_CONTEXT_TYPE_CHAT_CONTENT(22),
    DISPLAY_CONTEXT_TYPE_PRODUCT_CONTEXT(30),
    DISPLAY_CONTEXT_TYPE_APP_STORE(31),
    DISPLAY_CONTEXT_TYPE_PRODUCT_REVIEWS(32),
    UNRECOGNIZED(-1);

    public static final int DISPLAY_CONTEXT_TYPE_APP_STORE_VALUE = 31;
    public static final int DISPLAY_CONTEXT_TYPE_ARTICLE_CONTENT_VALUE = 11;
    public static final int DISPLAY_CONTEXT_TYPE_AUDIO_CONTENT_VALUE = 13;
    public static final int DISPLAY_CONTEXT_TYPE_CHAT_CONTENT_VALUE = 22;
    public static final int DISPLAY_CONTEXT_TYPE_CONTENT_CENTRIC_CONTEXT_VALUE = 10;
    public static final int DISPLAY_CONTEXT_TYPE_EMAIL_CONTENT_VALUE = 21;
    public static final int DISPLAY_CONTEXT_TYPE_IMAGE_CONTENT_VALUE = 14;
    public static final int DISPLAY_CONTEXT_TYPE_INVALID_VALUE = 0;
    public static final int DISPLAY_CONTEXT_TYPE_PRODUCT_CONTEXT_VALUE = 30;
    public static final int DISPLAY_CONTEXT_TYPE_PRODUCT_REVIEWS_VALUE = 32;
    public static final int DISPLAY_CONTEXT_TYPE_SOCIAL_CENTRIC_CONTEXT_VALUE = 20;
    public static final int DISPLAY_CONTEXT_TYPE_USER_GENERATED_CONTENT_VALUE = 15;
    public static final int DISPLAY_CONTEXT_TYPE_VIDEO_CONTENT_VALUE = 12;
    private final int value;
    private static final p7 internalValueMap = new k();
    private static final DisplayContextType[] VALUES = values();

    DisplayContextType(int i10) {
        this.value = i10;
    }

    public static DisplayContextType forNumber(int i10) {
        if (i10 == 0) {
            return DISPLAY_CONTEXT_TYPE_INVALID;
        }
        switch (i10) {
            case 10:
                return DISPLAY_CONTEXT_TYPE_CONTENT_CENTRIC_CONTEXT;
            case 11:
                return DISPLAY_CONTEXT_TYPE_ARTICLE_CONTENT;
            case 12:
                return DISPLAY_CONTEXT_TYPE_VIDEO_CONTENT;
            case 13:
                return DISPLAY_CONTEXT_TYPE_AUDIO_CONTENT;
            case 14:
                return DISPLAY_CONTEXT_TYPE_IMAGE_CONTENT;
            case 15:
                return DISPLAY_CONTEXT_TYPE_USER_GENERATED_CONTENT;
            default:
                switch (i10) {
                    case 20:
                        return DISPLAY_CONTEXT_TYPE_SOCIAL_CENTRIC_CONTEXT;
                    case 21:
                        return DISPLAY_CONTEXT_TYPE_EMAIL_CONTENT;
                    case 22:
                        return DISPLAY_CONTEXT_TYPE_CHAT_CONTENT;
                    default:
                        switch (i10) {
                            case 30:
                                return DISPLAY_CONTEXT_TYPE_PRODUCT_CONTEXT;
                            case 31:
                                return DISPLAY_CONTEXT_TYPE_APP_STORE;
                            case 32:
                                return DISPLAY_CONTEXT_TYPE_PRODUCT_REVIEWS;
                            default:
                                return null;
                        }
                }
        }
    }

    public static final Descriptors.EnumDescriptor getDescriptor() {
        return (Descriptors.EnumDescriptor) com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.A(10);
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
    public static DisplayContextType valueOf(int i10) {
        return forNumber(i10);
    }

    public static DisplayContextType valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
        if (enumValueDescriptor.getType() == getDescriptor()) {
            if (enumValueDescriptor.getIndex() == -1) {
                return UNRECOGNIZED;
            }
            return VALUES[enumValueDescriptor.getIndex()];
        }
        throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
}
