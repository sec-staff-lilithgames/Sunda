package com.moloco.sdk;

import com.google.protobuf.Internal;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public enum z5 implements Internal.EnumLite {
    SILENT(0),
    VIBRATE(1),
    NORMAL(2),
    UNRECOGNIZED(-1);


    /* renamed from: h, reason: collision with root package name */
    public static final x5 f50325h = new x5();

    /* renamed from: b, reason: collision with root package name */
    public final int f50327b;

    z5(int i10) {
        this.f50327b = i10;
    }

    public static z5 forNumber(int i10) {
        if (i10 == 0) {
            return SILENT;
        }
        if (i10 == 1) {
            return VIBRATE;
        }
        if (i10 != 2) {
            return null;
        }
        return NORMAL;
    }

    public static Internal.EnumLiteMap<z5> internalGetValueMap() {
        return f50325h;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return y5.f50316a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f50327b;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static z5 valueOf(int i10) {
        return forNumber(i10);
    }
}
