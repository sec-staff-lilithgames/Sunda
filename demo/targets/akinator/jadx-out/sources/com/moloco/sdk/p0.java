package com.moloco.sdk;

import com.google.protobuf.Internal;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public enum p0 implements Internal.EnumLite {
    MUSIC_SERVICE(1),
    BROADCAST(2),
    PODCAST(3);


    /* renamed from: g, reason: collision with root package name */
    public static final n0 f47337g = new n0();

    /* renamed from: b, reason: collision with root package name */
    public final int f47339b;

    p0(int i10) {
        this.f47339b = i10;
    }

    public static p0 forNumber(int i10) {
        if (i10 == 1) {
            return MUSIC_SERVICE;
        }
        if (i10 == 2) {
            return BROADCAST;
        }
        if (i10 != 3) {
            return null;
        }
        return PODCAST;
    }

    public static Internal.EnumLiteMap<p0> internalGetValueMap() {
        return f47337g;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return o0.f47325a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        return this.f47339b;
    }

    @Deprecated
    public static p0 valueOf(int i10) {
        return forNumber(i10);
    }
}
