package com.ironsource.adqualitysdk.sdk;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public enum ISAdQualityInitError {
    AD_QUALITY_SDK_WAS_SHUTDOWN(0),
    ILLEGAL_USER_ID(1),
    ILLEGAL_APP_KEY(2),
    EXCEPTION_ON_INIT(3),
    NO_NETWORK_CONNECTION(4),
    CONFIG_LOAD_TIMEOUT(5),
    CONNECTOR_LOAD_TIMEOUT(6),
    AD_NETWORK_VERSION_NOT_SUPPORTED_YET(7),
    AD_NETWORK_SDK_REQUIRES_NEWER_AD_QUALITY_SDK(8),
    AD_QUALITY_ALREADY_INITIALIZED(9);


    /* renamed from: ｋ, reason: contains not printable characters */
    private final int f216;

    ISAdQualityInitError(int i10) {
        this.f216 = i10;
    }

    public static ISAdQualityInitError fromInt(int i10) {
        switch (i10) {
            case 0:
                return AD_QUALITY_SDK_WAS_SHUTDOWN;
            case 1:
                return ILLEGAL_USER_ID;
            case 2:
                return ILLEGAL_APP_KEY;
            case 3:
                return EXCEPTION_ON_INIT;
            case 4:
                return NO_NETWORK_CONNECTION;
            case 5:
                return CONFIG_LOAD_TIMEOUT;
            case 6:
                return CONNECTOR_LOAD_TIMEOUT;
            case 7:
                return AD_NETWORK_VERSION_NOT_SUPPORTED_YET;
            case 8:
                return AD_NETWORK_SDK_REQUIRES_NEWER_AD_QUALITY_SDK;
            case 9:
                return AD_QUALITY_ALREADY_INITIALIZED;
            default:
                return null;
        }
    }

    public final int getValue() {
        return this.f216;
    }
}
