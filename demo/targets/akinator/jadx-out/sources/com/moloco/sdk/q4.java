package com.moloco.sdk;

import com.google.protobuf.Internal;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public enum q4 implements Internal.EnumLite {
    LINEAR(1),
    NON_LINEAR(2);


    /* renamed from: f, reason: collision with root package name */
    public static final o4 f47380f = new o4();

    /* renamed from: b, reason: collision with root package name */
    public final int f47382b;

    q4(int i10) {
        this.f47382b = i10;
    }

    public static q4 forNumber(int i10) {
        if (i10 == 1) {
            return LINEAR;
        }
        if (i10 != 2) {
            return null;
        }
        return NON_LINEAR;
    }

    public static Internal.EnumLiteMap<q4> internalGetValueMap() {
        return f47380f;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return p4.f47355a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        return this.f47382b;
    }

    @Deprecated
    public static q4 valueOf(int i10) {
        return forNumber(i10);
    }
}
