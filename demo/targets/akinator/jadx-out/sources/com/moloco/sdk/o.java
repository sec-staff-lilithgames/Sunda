package com.moloco.sdk;

import com.google.protobuf.Internal;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public enum o implements Internal.EnumLite {
    IP2LOCATION(1),
    NEUSTAR(2),
    MAXMIND(3),
    NETACUITY(4);


    /* renamed from: h, reason: collision with root package name */
    public static final m f47322h = new m();

    /* renamed from: b, reason: collision with root package name */
    public final int f47324b;

    o(int i10) {
        this.f47324b = i10;
    }

    public static o forNumber(int i10) {
        if (i10 == 1) {
            return IP2LOCATION;
        }
        if (i10 == 2) {
            return NEUSTAR;
        }
        if (i10 == 3) {
            return MAXMIND;
        }
        if (i10 != 4) {
            return null;
        }
        return NETACUITY;
    }

    public static Internal.EnumLiteMap<o> internalGetValueMap() {
        return f47322h;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return n.f47306a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        return this.f47324b;
    }

    @Deprecated
    public static o valueOf(int i10) {
        return forNumber(i10);
    }
}
