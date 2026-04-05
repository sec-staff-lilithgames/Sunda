package com.moloco.sdk;

import com.google.protobuf.Internal;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public enum e9 implements Internal.EnumLite {
    UNKNOWN_REGION(0),
    US(1),
    ASIA(2),
    EU(3),
    LOCAL(4),
    UNIT(5),
    INDIA(6),
    UNRECOGNIZED(-1);


    /* renamed from: l, reason: collision with root package name */
    public static final c9 f45757l = new c9();

    /* renamed from: b, reason: collision with root package name */
    public final int f45759b;

    e9(int i10) {
        this.f45759b = i10;
    }

    public static e9 forNumber(int i10) {
        switch (i10) {
            case 0:
                return UNKNOWN_REGION;
            case 1:
                return US;
            case 2:
                return ASIA;
            case 3:
                return EU;
            case 4:
                return LOCAL;
            case 5:
                return UNIT;
            case 6:
                return INDIA;
            default:
                return null;
        }
    }

    public static Internal.EnumLiteMap<e9> internalGetValueMap() {
        return f45757l;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return d9.f45731a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f45759b;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static e9 valueOf(int i10) {
        return forNumber(i10);
    }
}
