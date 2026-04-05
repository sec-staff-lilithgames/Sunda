package com.moloco.sdk;

import com.google.protobuf.Internal;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public enum h2 implements Internal.EnumLite {
    ICON(1),
    LOGO(2),
    MAIN(3);


    /* renamed from: g, reason: collision with root package name */
    public static final f2 f45813g = new f2();

    /* renamed from: b, reason: collision with root package name */
    public final int f45815b;

    h2(int i10) {
        this.f45815b = i10;
    }

    public static h2 forNumber(int i10) {
        if (i10 == 1) {
            return ICON;
        }
        if (i10 == 2) {
            return LOGO;
        }
        if (i10 != 3) {
            return null;
        }
        return MAIN;
    }

    public static Internal.EnumLiteMap<h2> internalGetValueMap() {
        return f45813g;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return g2.f45792a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        return this.f45815b;
    }

    @Deprecated
    public static h2 valueOf(int i10) {
        return forNumber(i10);
    }
}
