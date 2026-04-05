package com.moloco.sdk;

import com.google.protobuf.Internal;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public enum g0 implements Internal.EnumLite {
    UNKNOWN(0),
    ABOVE_THE_FOLD(1),
    LOCKED(2),
    BELOW_THE_FOLD(3),
    HEADER(4),
    FOOTER(5),
    SIDEBAR(6),
    AD_POSITION_FULLSCREEN(7);


    /* renamed from: l, reason: collision with root package name */
    public static final e0 f45789l = new e0();

    /* renamed from: b, reason: collision with root package name */
    public final int f45791b;

    g0(int i10) {
        this.f45791b = i10;
    }

    public static g0 forNumber(int i10) {
        switch (i10) {
            case 0:
                return UNKNOWN;
            case 1:
                return ABOVE_THE_FOLD;
            case 2:
                return LOCKED;
            case 3:
                return BELOW_THE_FOLD;
            case 4:
                return HEADER;
            case 5:
                return FOOTER;
            case 6:
                return SIDEBAR;
            case 7:
                return AD_POSITION_FULLSCREEN;
            default:
                return null;
        }
    }

    public static Internal.EnumLiteMap<g0> internalGetValueMap() {
        return f45789l;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return f0.f45761a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        return this.f45791b;
    }

    @Deprecated
    public static g0 valueOf(int i10) {
        return forNumber(i10);
    }
}
