package com.moloco.sdk;

import com.google.protobuf.Internal;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public enum p2 implements Internal.EnumLite {
    CONTENT_GENERAL_OR_MIXED(10),
    CONTENT_ARTICLE(11),
    CONTENT_VIDEO(12),
    CONTENT_AUDIO(13),
    CONTENT_IMAGE(14),
    CONTENT_USER_GENERATED(15),
    SOCIAL_GENERAL(20),
    SOCIAL_EMAIL(21),
    SOCIAL_CHAT_IM(22),
    PRODUCT_SELLING(30),
    PRODUCT_MARKETPLACE(31),
    PRODUCT_REVIEW(32);


    /* renamed from: p, reason: collision with root package name */
    public static final n2 f47352p = new n2();

    /* renamed from: b, reason: collision with root package name */
    public final int f47354b;

    p2(int i10) {
        this.f47354b = i10;
    }

    public static p2 forNumber(int i10) {
        switch (i10) {
            case 10:
                return CONTENT_GENERAL_OR_MIXED;
            case 11:
                return CONTENT_ARTICLE;
            case 12:
                return CONTENT_VIDEO;
            case 13:
                return CONTENT_AUDIO;
            case 14:
                return CONTENT_IMAGE;
            case 15:
                return CONTENT_USER_GENERATED;
            default:
                switch (i10) {
                    case 20:
                        return SOCIAL_GENERAL;
                    case 21:
                        return SOCIAL_EMAIL;
                    case 22:
                        return SOCIAL_CHAT_IM;
                    default:
                        switch (i10) {
                            case 30:
                                return PRODUCT_SELLING;
                            case 31:
                                return PRODUCT_MARKETPLACE;
                            case 32:
                                return PRODUCT_REVIEW;
                            default:
                                return null;
                        }
                }
        }
    }

    public static Internal.EnumLiteMap<p2> internalGetValueMap() {
        return f47352p;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return o2.f47332a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        return this.f47354b;
    }

    @Deprecated
    public static p2 valueOf(int i10) {
        return forNumber(i10);
    }
}
