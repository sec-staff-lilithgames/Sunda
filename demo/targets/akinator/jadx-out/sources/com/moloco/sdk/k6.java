package com.moloco.sdk;

import com.google.protobuf.Internal;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public enum k6 implements Internal.EnumLite {
    UNKNOWN(0),
    PORTRAIT(1),
    LANDSCAPE(2),
    UNRECOGNIZED(-1);


    /* renamed from: h, reason: collision with root package name */
    public static final i6 f47285h = new i6();

    /* renamed from: b, reason: collision with root package name */
    public final int f47287b;

    k6(int i10) {
        this.f47287b = i10;
    }

    public static k6 forNumber(int i10) {
        if (i10 == 0) {
            return UNKNOWN;
        }
        if (i10 == 1) {
            return PORTRAIT;
        }
        if (i10 != 2) {
            return null;
        }
        return LANDSCAPE;
    }

    public static Internal.EnumLiteMap<k6> internalGetValueMap() {
        return f47285h;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return j6.f47252a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f47287b;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static k6 valueOf(int i10) {
        return forNumber(i10);
    }
}
