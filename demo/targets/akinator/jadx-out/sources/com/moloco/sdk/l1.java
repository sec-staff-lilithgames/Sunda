package com.moloco.sdk;

import com.google.protobuf.Internal;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public enum l1 implements Internal.EnumLite {
    STATIC(1),
    HTML(2),
    COMPANION_IFRAME(3);


    /* renamed from: g, reason: collision with root package name */
    public static final j1 f47296g = new j1();

    /* renamed from: b, reason: collision with root package name */
    public final int f47298b;

    l1(int i10) {
        this.f47298b = i10;
    }

    public static l1 forNumber(int i10) {
        if (i10 == 1) {
            return STATIC;
        }
        if (i10 == 2) {
            return HTML;
        }
        if (i10 != 3) {
            return null;
        }
        return COMPANION_IFRAME;
    }

    public static Internal.EnumLiteMap<l1> internalGetValueMap() {
        return f47296g;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return k1.f47273a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        return this.f47298b;
    }

    @Deprecated
    public static l1 valueOf(int i10) {
        return forNumber(i10);
    }
}
