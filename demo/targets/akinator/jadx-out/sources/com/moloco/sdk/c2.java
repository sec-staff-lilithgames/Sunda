package com.moloco.sdk;

import com.google.protobuf.Internal;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public enum c2 implements Internal.EnumLite {
    SPONSORED(1),
    DESC(2),
    RATING(3),
    LIKES(4),
    DOWNLOADS(5),
    PRICE(6),
    SALEPRICE(7),
    PHONE(8),
    ADDRESS(9),
    DESC2(10),
    DISPLAYURL(11),
    CTATEXT(12),
    EXCHANGE_SPECIFIC(500);


    /* renamed from: q, reason: collision with root package name */
    public static final a2 f45683q = new a2();

    /* renamed from: b, reason: collision with root package name */
    public final int f45685b;

    c2(int i10) {
        this.f45685b = i10;
    }

    public static c2 forNumber(int i10) {
        if (i10 == 500) {
            return EXCHANGE_SPECIFIC;
        }
        switch (i10) {
            case 1:
                return SPONSORED;
            case 2:
                return DESC;
            case 3:
                return RATING;
            case 4:
                return LIKES;
            case 5:
                return DOWNLOADS;
            case 6:
                return PRICE;
            case 7:
                return SALEPRICE;
            case 8:
                return PHONE;
            case 9:
                return ADDRESS;
            case 10:
                return DESC2;
            case 11:
                return DISPLAYURL;
            case 12:
                return CTATEXT;
            default:
                return null;
        }
    }

    public static Internal.EnumLiteMap<c2> internalGetValueMap() {
        return f45683q;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b2.f45667a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        return this.f45685b;
    }

    @Deprecated
    public static c2 valueOf(int i10) {
        return forNumber(i10);
    }
}
