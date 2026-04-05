package com.ironsource.adqualitysdk.sdk;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public enum ISAdQualityLogLevel {
    NONE(0),
    ERROR(1),
    WARNING(2),
    INFO(3),
    DEBUG(4),
    VERBOSE(5);


    /* renamed from: ｋ, reason: contains not printable characters */
    private final int f218;

    ISAdQualityLogLevel(int i10) {
        this.f218 = i10;
    }

    public static ISAdQualityLogLevel fromInt(int i10) {
        if (i10 == 0) {
            return NONE;
        }
        if (i10 == 1) {
            return ERROR;
        }
        if (i10 == 2) {
            return WARNING;
        }
        if (i10 == 3) {
            return INFO;
        }
        if (i10 == 4) {
            return DEBUG;
        }
        if (i10 != 5) {
            return null;
        }
        return VERBOSE;
    }

    public final int getValue() {
        return this.f218;
    }

    public final boolean shouldPrintLog(ISAdQualityLogLevel iSAdQualityLogLevel) {
        int i10 = this.f218;
        return i10 != NONE.f218 && i10 >= iSAdQualityLogLevel.f218;
    }
}
