package com.moloco.sdk;

import com.google.protobuf.Internal;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public enum k4 implements Internal.EnumLite {
    COMPLETION_OR_USER(1),
    LEAVING_OR_USER(2),
    LEAVING_CONTINUES_OR_USER(3);


    /* renamed from: g, reason: collision with root package name */
    public static final i4 f47278g = new i4();

    /* renamed from: b, reason: collision with root package name */
    public final int f47280b;

    k4(int i10) {
        this.f47280b = i10;
    }

    public static k4 forNumber(int i10) {
        if (i10 == 1) {
            return COMPLETION_OR_USER;
        }
        if (i10 == 2) {
            return LEAVING_OR_USER;
        }
        if (i10 != 3) {
            return null;
        }
        return LEAVING_CONTINUES_OR_USER;
    }

    public static Internal.EnumLiteMap<k4> internalGetValueMap() {
        return f47278g;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return j4.f47251a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        return this.f47280b;
    }

    @Deprecated
    public static k4 valueOf(int i10) {
        return forNumber(i10);
    }
}
