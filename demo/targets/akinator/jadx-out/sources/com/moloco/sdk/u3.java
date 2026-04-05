package com.moloco.sdk;

import com.google.protobuf.Internal;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public enum u3 implements Internal.EnumLite {
    VAST_1_0(1),
    VAST_2_0(2),
    VAST_3_0(3),
    VAST_1_0_WRAPPER(4),
    VAST_2_0_WRAPPER(5),
    VAST_3_0_WRAPPER(6),
    VAST_4_0(7),
    VAST_4_0_WRAPPER(8),
    DAAST_1_0(9),
    DAAST_1_0_WRAPPER(10),
    VAST_4_1(11),
    VAST_4_1_WRAPPER(12),
    VAST_4_2(13),
    VAST_4_2_WRAPPER(14);


    /* renamed from: r, reason: collision with root package name */
    public static final s3 f47511r = new s3();

    /* renamed from: b, reason: collision with root package name */
    public final int f47513b;

    u3(int i10) {
        this.f47513b = i10;
    }

    public static u3 forNumber(int i10) {
        switch (i10) {
            case 1:
                return VAST_1_0;
            case 2:
                return VAST_2_0;
            case 3:
                return VAST_3_0;
            case 4:
                return VAST_1_0_WRAPPER;
            case 5:
                return VAST_2_0_WRAPPER;
            case 6:
                return VAST_3_0_WRAPPER;
            case 7:
                return VAST_4_0;
            case 8:
                return VAST_4_0_WRAPPER;
            case 9:
                return DAAST_1_0;
            case 10:
                return DAAST_1_0_WRAPPER;
            case 11:
                return VAST_4_1;
            case 12:
                return VAST_4_1_WRAPPER;
            case 13:
                return VAST_4_2;
            case 14:
                return VAST_4_2_WRAPPER;
            default:
                return null;
        }
    }

    public static Internal.EnumLiteMap<u3> internalGetValueMap() {
        return f47511r;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return t3.f47481a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        return this.f47513b;
    }

    @Deprecated
    public static u3 valueOf(int i10) {
        return forNumber(i10);
    }
}
