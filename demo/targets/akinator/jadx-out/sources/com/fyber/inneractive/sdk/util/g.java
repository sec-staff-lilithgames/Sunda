package com.fyber.inneractive.sdk.util;

import j1.o2;
import java.util.Locale;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public enum g {
    DISPLAY("DISPLAY"),
    VIDEO_CTA("VIDEO_CTA"),
    VIDEO_CLICK("VIDEO_CLICK"),
    VAST_ENDCARD("VAST_ENDCARD"),
    DEFAULT_ENDCARD("DEFAULT_ENDCARD"),
    VIDEO_APP_INFO("VIDEO_APP_INFO"),
    FMP_ENDCARD("FMP_ENDCARD"),
    STORE_PROMO_CTA("STORE_PROMO_CTA"),
    NATIVE_CTA("NATIVE_CTA"),
    NATIVE_AD_TITLE("NATIVE_AD_TITLE"),
    NATIVE_AD_DESCRIPTION("NATIVE_AD_DESCRIPTION"),
    NATIVE_AD_RATING("NATIVE_AD_RATING"),
    NATIVE_AD_IMAGE("NATIVE_AD_IMAGE"),
    NATIVE_AD_VIDEO("NATIVE_AD_VIDEO"),
    NATIVE_AD_ICON("NATIVE_AD_ICON"),
    NATIVE_AD_ROOT("NATIVE_AD_ROOT"),
    NATIVE("NATIVE");

    private final String key;
    private String mVersion = "";
    private int mOrderShown = 0;

    g(String str) {
        this.key = str;
    }

    public final void a(String str) {
        this.mVersion = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        if ((this != FMP_ENDCARD || this.mOrderShown != 1) && this.mOrderShown != 2) {
            return this.key;
        }
        Locale locale = Locale.US;
        return o2.g(this.mOrderShown, this.key, "_");
    }

    public final String a() {
        return this.mVersion;
    }

    public final void a(int i10) {
        this.mOrderShown = i10;
    }
}
