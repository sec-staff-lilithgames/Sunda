package com.moloco.sdk;

import com.google.protobuf.Internal;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public enum f8 implements Internal.EnumLite {
    INVALID(0),
    BANNER(1),
    INTERSTITIAL(2),
    NATIVE(3),
    REWARD_VIDEO(4),
    MREC(6),
    UNRECOGNIZED(-1);


    /* renamed from: k, reason: collision with root package name */
    public static final d8 f45769k = new d8();

    /* renamed from: b, reason: collision with root package name */
    public final int f45771b;

    f8(int i10) {
        this.f45771b = i10;
    }

    public static f8 forNumber(int i10) {
        if (i10 == 0) {
            return INVALID;
        }
        if (i10 == 1) {
            return BANNER;
        }
        if (i10 == 2) {
            return INTERSTITIAL;
        }
        if (i10 == 3) {
            return NATIVE;
        }
        if (i10 == 4) {
            return REWARD_VIDEO;
        }
        if (i10 != 6) {
            return null;
        }
        return MREC;
    }

    public static Internal.EnumLiteMap<f8> internalGetValueMap() {
        return f45769k;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return e8.f45748a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f45771b;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static f8 valueOf(int i10) {
        return forNumber(i10);
    }
}
