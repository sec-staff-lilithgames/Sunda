package com.moloco.sdk;

import com.google.protobuf.Internal;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public enum y implements Internal.EnumLite {
    UNKNOWN_SOURCE(0),
    CLIENT_HINTS_LOW_ENTROPY(1),
    CLIENT_HINTS_HIGH_ENTROPY(2),
    USER_AGENT_STRING(3);


    /* renamed from: h, reason: collision with root package name */
    public static final w f50313h = new w();

    /* renamed from: b, reason: collision with root package name */
    public final int f50315b;

    y(int i10) {
        this.f50315b = i10;
    }

    public static y forNumber(int i10) {
        if (i10 == 0) {
            return UNKNOWN_SOURCE;
        }
        if (i10 == 1) {
            return CLIENT_HINTS_LOW_ENTROPY;
        }
        if (i10 == 2) {
            return CLIENT_HINTS_HIGH_ENTROPY;
        }
        if (i10 != 3) {
            return null;
        }
        return USER_AGENT_STRING;
    }

    public static Internal.EnumLiteMap<y> internalGetValueMap() {
        return f50313h;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return x.f47539a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        return this.f50315b;
    }

    @Deprecated
    public static y valueOf(int i10) {
        return forNumber(i10);
    }
}
