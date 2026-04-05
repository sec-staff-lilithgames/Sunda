package com.moloco.sdk;

import com.google.protobuf.Internal;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public enum pa implements Internal.EnumLite {
    NONE(0),
    CLOSE(1),
    SKIP(2),
    MUTE(3),
    UNMUTE(4),
    CTA(5),
    REPLAY(6),
    DEC_SKIP(7),
    AD_BADGE(8),
    UNRECOGNIZED(-1);


    /* renamed from: n, reason: collision with root package name */
    public static final na f47366n = new na();

    /* renamed from: b, reason: collision with root package name */
    public final int f47368b;

    pa(int i10) {
        this.f47368b = i10;
    }

    public static pa forNumber(int i10) {
        switch (i10) {
            case 0:
                return NONE;
            case 1:
                return CLOSE;
            case 2:
                return SKIP;
            case 3:
                return MUTE;
            case 4:
                return UNMUTE;
            case 5:
                return CTA;
            case 6:
                return REPLAY;
            case 7:
                return DEC_SKIP;
            case 8:
                return AD_BADGE;
            default:
                return null;
        }
    }

    public static Internal.EnumLiteMap<pa> internalGetValueMap() {
        return f47366n;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return oa.f47333a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f47368b;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static pa valueOf(int i10) {
        return forNumber(i10);
    }
}
