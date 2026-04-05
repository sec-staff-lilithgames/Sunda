package com.moloco.sdk;

import com.google.protobuf.Internal;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public enum o1 implements Internal.EnumLite {
    STREAMING(1),
    PROGRESSIVE(2),
    DOWNLOAD(3);


    /* renamed from: g, reason: collision with root package name */
    public static final m1 f47329g = new m1();

    /* renamed from: b, reason: collision with root package name */
    public final int f47331b;

    o1(int i10) {
        this.f47331b = i10;
    }

    public static o1 forNumber(int i10) {
        if (i10 == 1) {
            return STREAMING;
        }
        if (i10 == 2) {
            return PROGRESSIVE;
        }
        if (i10 != 3) {
            return null;
        }
        return DOWNLOAD;
    }

    public static Internal.EnumLiteMap<o1> internalGetValueMap() {
        return f47329g;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return n1.f47307a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        return this.f47331b;
    }

    @Deprecated
    public static o1 valueOf(int i10) {
        return forNumber(i10);
    }
}
