package com.moloco.sdk;

import com.google.protobuf.Internal;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public enum j8 implements Internal.EnumLite {
    UNKNOWN_TYPE(0),
    LOGO(1),
    IMAGE(2),
    VIDEO(3),
    UNRECOGNIZED(-1);


    /* renamed from: i, reason: collision with root package name */
    public static final h8 f47258i = new h8();

    /* renamed from: b, reason: collision with root package name */
    public final int f47260b;

    j8(int i10) {
        this.f47260b = i10;
    }

    public static j8 forNumber(int i10) {
        if (i10 == 0) {
            return UNKNOWN_TYPE;
        }
        if (i10 == 1) {
            return LOGO;
        }
        if (i10 == 2) {
            return IMAGE;
        }
        if (i10 != 3) {
            return null;
        }
        return VIDEO;
    }

    public static Internal.EnumLiteMap<j8> internalGetValueMap() {
        return f47258i;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return i8.f45824a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f47260b;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static j8 valueOf(int i10) {
        return forNumber(i10);
    }
}
