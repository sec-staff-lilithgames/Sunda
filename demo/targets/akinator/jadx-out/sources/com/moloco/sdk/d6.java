package com.moloco.sdk;

import com.google.protobuf.Internal;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public enum d6 implements Internal.EnumLite {
    UNKNOWN(0),
    CHARGING(1),
    DISCHARGING(2),
    NOT_CHARGING(3),
    FULL(4),
    UNRECOGNIZED(-1);


    /* renamed from: j, reason: collision with root package name */
    public static final b6 f45728j = new b6();

    /* renamed from: b, reason: collision with root package name */
    public final int f45730b;

    d6(int i10) {
        this.f45730b = i10;
    }

    public static d6 forNumber(int i10) {
        if (i10 == 0) {
            return UNKNOWN;
        }
        if (i10 == 1) {
            return CHARGING;
        }
        if (i10 == 2) {
            return DISCHARGING;
        }
        if (i10 == 3) {
            return NOT_CHARGING;
        }
        if (i10 != 4) {
            return null;
        }
        return FULL;
    }

    public static Internal.EnumLiteMap<d6> internalGetValueMap() {
        return f45728j;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return c6.f45686a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f45730b;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static d6 valueOf(int i10) {
        return forNumber(i10);
    }
}
