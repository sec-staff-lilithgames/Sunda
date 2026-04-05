package com.ironsource.adqualitysdk.sdk;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public enum ISAdQualityDeviceIdType {
    NONE(0),
    GAID(1),
    IDFA(2);


    /* renamed from: ｋ, reason: contains not printable characters */
    private final int f214;

    ISAdQualityDeviceIdType(int i10) {
        this.f214 = i10;
    }

    public static ISAdQualityDeviceIdType fromInt(int i10) {
        if (i10 == 0) {
            return NONE;
        }
        if (i10 == 1) {
            return GAID;
        }
        if (i10 != 2) {
            return null;
        }
        return IDFA;
    }

    public final int getValue() {
        return this.f214;
    }
}
