package com.moloco.sdk;

import com.google.protobuf.Internal;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public enum z6 implements Internal.EnumLite {
    UNKNOWN(0),
    WIFI(1),
    CELLULAR(2),
    NO_NETWORK(3),
    UNRECOGNIZED(-1);


    /* renamed from: i, reason: collision with root package name */
    public static final x6 f50333i = new x6();

    /* renamed from: b, reason: collision with root package name */
    public final int f50335b;

    z6(int i10) {
        this.f50335b = i10;
    }

    public static z6 forNumber(int i10) {
        if (i10 == 0) {
            return UNKNOWN;
        }
        if (i10 == 1) {
            return WIFI;
        }
        if (i10 == 2) {
            return CELLULAR;
        }
        if (i10 != 3) {
            return null;
        }
        return NO_NETWORK;
    }

    public static Internal.EnumLiteMap<z6> internalGetValueMap() {
        return f50333i;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return y6.f50317a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f50335b;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static z6 valueOf(int i10) {
        return forNumber(i10);
    }
}
