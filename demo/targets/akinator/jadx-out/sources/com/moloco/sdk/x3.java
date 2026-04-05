package com.moloco.sdk;

import com.google.protobuf.Internal;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public enum x3 implements Internal.EnumLite {
    SERVER_SIDE_AD_INSERTION_TYPE_UNKNOWN(0),
    CLIENT_SIDE_ONLY(1),
    SERVER_SIDE_STITCHED_CLIENT_TRACKER(2),
    SERVER_SIDE_ONLY(3);


    /* renamed from: h, reason: collision with root package name */
    public static final v3 f47556h = new v3();

    /* renamed from: b, reason: collision with root package name */
    public final int f47558b;

    x3(int i10) {
        this.f47558b = i10;
    }

    public static x3 forNumber(int i10) {
        if (i10 == 0) {
            return SERVER_SIDE_AD_INSERTION_TYPE_UNKNOWN;
        }
        if (i10 == 1) {
            return CLIENT_SIDE_ONLY;
        }
        if (i10 == 2) {
            return SERVER_SIDE_STITCHED_CLIENT_TRACKER;
        }
        if (i10 != 3) {
            return null;
        }
        return SERVER_SIDE_ONLY;
    }

    public static Internal.EnumLiteMap<x3> internalGetValueMap() {
        return f47556h;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return w3.f47526a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        return this.f47558b;
    }

    @Deprecated
    public static x3 valueOf(int i10) {
        return forNumber(i10);
    }
}
