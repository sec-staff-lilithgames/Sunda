package com.moloco.sdk;

import com.google.protobuf.Internal;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public enum wa implements Internal.EnumLite {
    UNKNOWN(0),
    ANDROID(1),
    IOS(2),
    UNRECOGNIZED(-1);


    /* renamed from: h, reason: collision with root package name */
    public static final ua f47536h = new ua();

    /* renamed from: b, reason: collision with root package name */
    public final int f47538b;

    wa(int i10) {
        this.f47538b = i10;
    }

    public static wa forNumber(int i10) {
        if (i10 == 0) {
            return UNKNOWN;
        }
        if (i10 == 1) {
            return ANDROID;
        }
        if (i10 != 2) {
            return null;
        }
        return IOS;
    }

    public static Internal.EnumLiteMap<wa> internalGetValueMap() {
        return f47536h;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return va.f47524a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f47538b;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static wa valueOf(int i10) {
        return forNumber(i10);
    }
}
