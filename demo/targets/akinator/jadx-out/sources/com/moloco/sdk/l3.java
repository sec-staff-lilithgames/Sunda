package com.moloco.sdk;

import com.google.protobuf.Internal;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public enum l3 implements Internal.EnumLite {
    FIRST_PRICE(1),
    SECOND_PRICE(2),
    FIXED_PRICE(3);


    /* renamed from: g, reason: collision with root package name */
    public static final j3 f47302g = new j3();

    /* renamed from: b, reason: collision with root package name */
    public final int f47304b;

    l3(int i10) {
        this.f47304b = i10;
    }

    public static l3 forNumber(int i10) {
        if (i10 == 1) {
            return FIRST_PRICE;
        }
        if (i10 == 2) {
            return SECOND_PRICE;
        }
        if (i10 != 3) {
            return null;
        }
        return FIXED_PRICE;
    }

    public static Internal.EnumLiteMap<l3> internalGetValueMap() {
        return f47302g;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return k3.f47274a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        return this.f47304b;
    }

    @Deprecated
    public static l3 valueOf(int i10) {
        return forNumber(i10);
    }
}
