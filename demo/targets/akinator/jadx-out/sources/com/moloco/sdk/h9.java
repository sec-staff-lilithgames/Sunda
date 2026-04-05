package com.moloco.sdk;

import com.google.protobuf.Internal;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public enum h9 implements Internal.EnumLite {
    UNKNOWN(0),
    MAX(1),
    f45819f(2),
    UNRECOGNIZED(-1);


    /* renamed from: h, reason: collision with root package name */
    public static final f9 f45821h = new f9();

    /* renamed from: b, reason: collision with root package name */
    public final int f45823b;

    h9(int i10) {
        this.f45823b = i10;
    }

    public static h9 forNumber(int i10) {
        if (i10 == 0) {
            return UNKNOWN;
        }
        if (i10 == 1) {
            return MAX;
        }
        if (i10 != 2) {
            return null;
        }
        return f45819f;
    }

    public static Internal.EnumLiteMap<h9> internalGetValueMap() {
        return f45821h;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return g9.f45798a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f45823b;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static h9 valueOf(int i10) {
        return forNumber(i10);
    }
}
