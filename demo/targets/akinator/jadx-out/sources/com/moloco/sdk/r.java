package com.moloco.sdk;

import com.google.protobuf.Internal;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public enum r implements Internal.EnumLite {
    GPS_LOCATION(1),
    IP(2),
    USER_PROVIDED(3);


    /* renamed from: g, reason: collision with root package name */
    public static final p f47386g = new p();

    /* renamed from: b, reason: collision with root package name */
    public final int f47388b;

    r(int i10) {
        this.f47388b = i10;
    }

    public static r forNumber(int i10) {
        if (i10 == 1) {
            return GPS_LOCATION;
        }
        if (i10 == 2) {
            return IP;
        }
        if (i10 != 3) {
            return null;
        }
        return USER_PROVIDED;
    }

    public static Internal.EnumLiteMap<r> internalGetValueMap() {
        return f47386g;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return q.f47375a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        return this.f47388b;
    }

    @Deprecated
    public static r valueOf(int i10) {
        return forNumber(i10);
    }
}
