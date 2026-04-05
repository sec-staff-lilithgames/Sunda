package com.moloco.sdk;

import com.google.protobuf.Internal;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public enum x2 implements Internal.EnumLite {
    IMG(1),
    JS(2);


    /* renamed from: f, reason: collision with root package name */
    public static final v2 f47549f = new v2();

    /* renamed from: b, reason: collision with root package name */
    public final int f47551b;

    x2(int i10) {
        this.f47551b = i10;
    }

    public static x2 forNumber(int i10) {
        if (i10 == 1) {
            return IMG;
        }
        if (i10 != 2) {
            return null;
        }
        return JS;
    }

    public static Internal.EnumLiteMap<x2> internalGetValueMap() {
        return f47549f;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return w2.f47525a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        return this.f47551b;
    }

    @Deprecated
    public static x2 valueOf(int i10) {
        return forNumber(i10);
    }
}
