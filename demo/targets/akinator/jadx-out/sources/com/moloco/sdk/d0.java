package com.moloco.sdk;

import com.google.protobuf.Internal;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public enum d0 implements Internal.EnumLite {
    VPAID_1(1),
    VPAID_2(2),
    MRAID_1(3),
    ORMMA(4),
    MRAID_2(5),
    MRAID_3(6),
    OMID_1(7),
    SIMID_1_0(8),
    SIMID_1_1(9);


    /* renamed from: m, reason: collision with root package name */
    public static final b0 f45716m = new b0();

    /* renamed from: b, reason: collision with root package name */
    public final int f45718b;

    d0(int i10) {
        this.f45718b = i10;
    }

    public static d0 forNumber(int i10) {
        switch (i10) {
            case 1:
                return VPAID_1;
            case 2:
                return VPAID_2;
            case 3:
                return MRAID_1;
            case 4:
                return ORMMA;
            case 5:
                return MRAID_2;
            case 6:
                return MRAID_3;
            case 7:
                return OMID_1;
            case 8:
                return SIMID_1_0;
            case 9:
                return SIMID_1_1;
            default:
                return null;
        }
    }

    public static Internal.EnumLiteMap<d0> internalGetValueMap() {
        return f45716m;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return c0.f45669a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        return this.f45718b;
    }

    @Deprecated
    public static d0 valueOf(int i10) {
        return forNumber(i10);
    }
}
