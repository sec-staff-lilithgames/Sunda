package com.moloco.sdk;

import com.google.protobuf.Internal;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public enum s2 implements Internal.EnumLite {
    CONTENT(1),
    SOCIAL(2),
    PRODUCT(3);


    /* renamed from: g, reason: collision with root package name */
    public static final q2 f47430g = new q2();

    /* renamed from: b, reason: collision with root package name */
    public final int f47432b;

    s2(int i10) {
        this.f47432b = i10;
    }

    public static s2 forNumber(int i10) {
        if (i10 == 1) {
            return CONTENT;
        }
        if (i10 == 2) {
            return SOCIAL;
        }
        if (i10 != 3) {
            return null;
        }
        return PRODUCT;
    }

    public static Internal.EnumLiteMap<s2> internalGetValueMap() {
        return f47430g;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return r2.f47411a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        return this.f47432b;
    }

    @Deprecated
    public static s2 valueOf(int i10) {
        return forNumber(i10);
    }
}
