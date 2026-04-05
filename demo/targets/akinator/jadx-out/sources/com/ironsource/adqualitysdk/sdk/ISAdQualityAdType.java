package com.ironsource.adqualitysdk.sdk;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public enum ISAdQualityAdType {
    UNKNOWN(-1),
    RICH_MEDIA(0),
    INTERSTITIAL(1),
    APP_WALL(2),
    VIDEO(3),
    REWARDED_VIDEO(4),
    NATIVE(5),
    BANNER(6),
    OFFER_WALL(7),
    NATIVE_HTML(8),
    EXTERNAL(9),
    REWARDED(10),
    INTERACTIVE(11);


    /* renamed from: ﻛ, reason: contains not printable characters */
    private final int f182;

    ISAdQualityAdType(int i10) {
        this.f182 = i10;
    }

    public static ISAdQualityAdType fromInt(int i10) {
        switch (i10) {
            case -1:
                return UNKNOWN;
            case 0:
                return RICH_MEDIA;
            case 1:
                return INTERSTITIAL;
            case 2:
                return APP_WALL;
            case 3:
                return VIDEO;
            case 4:
                return REWARDED_VIDEO;
            case 5:
                return NATIVE;
            case 6:
                return BANNER;
            case 7:
                return OFFER_WALL;
            case 8:
                return NATIVE_HTML;
            case 9:
                return EXTERNAL;
            case 10:
                return REWARDED;
            case 11:
                return INTERACTIVE;
            default:
                return null;
        }
    }

    public final int getValue() {
        return this.f182;
    }
}
