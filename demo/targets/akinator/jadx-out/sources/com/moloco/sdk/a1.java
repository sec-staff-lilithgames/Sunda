package com.moloco.sdk;

import com.google.protobuf.Internal;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public enum a1 implements Internal.EnumLite {
    XHTML_TEXT_AD(1),
    XHTML_BANNER_AD(2),
    JAVASCRIPT_AD(3),
    IFRAME(4);


    /* renamed from: h, reason: collision with root package name */
    public static final y0 f45448h = new y0();

    /* renamed from: b, reason: collision with root package name */
    public final int f45450b;

    a1(int i10) {
        this.f45450b = i10;
    }

    public static a1 forNumber(int i10) {
        if (i10 == 1) {
            return XHTML_TEXT_AD;
        }
        if (i10 == 2) {
            return XHTML_BANNER_AD;
        }
        if (i10 == 3) {
            return JAVASCRIPT_AD;
        }
        if (i10 != 4) {
            return null;
        }
        return IFRAME;
    }

    public static Internal.EnumLiteMap<a1> internalGetValueMap() {
        return f45448h;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return z0.f50318a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        return this.f45450b;
    }

    @Deprecated
    public static a1 valueOf(int i10) {
        return forNumber(i10);
    }
}
