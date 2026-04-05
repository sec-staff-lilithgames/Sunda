package com.moloco.sdk;

import com.google.protobuf.Internal;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public enum fb implements Internal.EnumLite {
    UNKNOWN(0),
    WIFI(1),
    CELLULAR(2),
    UNRECOGNIZED(-1);


    /* renamed from: h, reason: collision with root package name */
    public static final db f45777h = new db();

    /* renamed from: b, reason: collision with root package name */
    public final int f45779b;

    fb(int i10) {
        this.f45779b = i10;
    }

    public static fb forNumber(int i10) {
        if (i10 == 0) {
            return UNKNOWN;
        }
        if (i10 == 1) {
            return WIFI;
        }
        if (i10 != 2) {
            return null;
        }
        return CELLULAR;
    }

    public static Internal.EnumLiteMap<fb> internalGetValueMap() {
        return f45777h;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return eb.f45760a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f45779b;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static fb valueOf(int i10) {
        return forNumber(i10);
    }
}
