package com.moloco.sdk;

import com.google.protobuf.Internal;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public enum s0 implements Internal.EnumLite {
    NONE(0),
    AVERAGE_VOLUME(1),
    PEAK_VOLUME(2),
    LOUDNESS(3),
    CUSTOM_VOLUME(4);


    /* renamed from: i, reason: collision with root package name */
    public static final q0 f47424i = new q0();

    /* renamed from: b, reason: collision with root package name */
    public final int f47426b;

    s0(int i10) {
        this.f47426b = i10;
    }

    public static s0 forNumber(int i10) {
        if (i10 == 0) {
            return NONE;
        }
        if (i10 == 1) {
            return AVERAGE_VOLUME;
        }
        if (i10 == 2) {
            return PEAK_VOLUME;
        }
        if (i10 == 3) {
            return LOUDNESS;
        }
        if (i10 != 4) {
            return null;
        }
        return CUSTOM_VOLUME;
    }

    public static Internal.EnumLiteMap<s0> internalGetValueMap() {
        return f47424i;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return r0.f47389a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        return this.f47426b;
    }

    @Deprecated
    public static s0 valueOf(int i10) {
        return forNumber(i10);
    }
}
