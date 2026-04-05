package com.moloco.sdk;

import com.google.protobuf.Internal;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public enum r3 implements Internal.EnumLite {
    POD_SEQUENCE_ANY(0),
    POD_SEQUENCE_LAST(-1),
    POD_SEQUENCE_FIRST(1);


    /* renamed from: g, reason: collision with root package name */
    public static final p3 f47415g = new p3();

    /* renamed from: b, reason: collision with root package name */
    public final int f47417b;

    r3(int i10) {
        this.f47417b = i10;
    }

    public static r3 forNumber(int i10) {
        if (i10 == -1) {
            return POD_SEQUENCE_LAST;
        }
        if (i10 == 0) {
            return POD_SEQUENCE_ANY;
        }
        if (i10 != 1) {
            return null;
        }
        return POD_SEQUENCE_FIRST;
    }

    public static Internal.EnumLiteMap<r3> internalGetValueMap() {
        return f47415g;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return q3.f47377a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        return this.f47417b;
    }

    @Deprecated
    public static r3 valueOf(int i10) {
        return forNumber(i10);
    }
}
