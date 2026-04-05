package com.moloco.sdk;

import com.google.protobuf.Internal;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public enum e3 implements Internal.EnumLite {
    IN_FEED(1),
    ATOMIC_UNIT(2),
    OUTSIDE(3),
    RECOMMENDATION(4);


    /* renamed from: h, reason: collision with root package name */
    public static final c3 f45745h = new c3();

    /* renamed from: b, reason: collision with root package name */
    public final int f45747b;

    e3(int i10) {
        this.f45747b = i10;
    }

    public static e3 forNumber(int i10) {
        if (i10 == 1) {
            return IN_FEED;
        }
        if (i10 == 2) {
            return ATOMIC_UNIT;
        }
        if (i10 == 3) {
            return OUTSIDE;
        }
        if (i10 != 4) {
            return null;
        }
        return RECOMMENDATION;
    }

    public static Internal.EnumLiteMap<e3> internalGetValueMap() {
        return f45745h;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return d3.f45720a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        return this.f45747b;
    }

    @Deprecated
    public static e3 valueOf(int i10) {
        return forNumber(i10);
    }
}
