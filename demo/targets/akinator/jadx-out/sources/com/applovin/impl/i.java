package com.applovin.impl;

import com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public enum i {
    PUBLISHER_INITIATED("publisher_initiated"),
    SEQUENTIAL_OR_PRECACHE("sequential_or_precache"),
    REFRESH(ToolBar.REFRESH),
    EXPONENTIAL_RETRY("exponential_retry"),
    EXPIRED("expired"),
    NATIVE_AD_PLACER("native_ad_placer");


    /* renamed from: a, reason: collision with root package name */
    private final String f14100a;

    i(String str) {
        this.f14100a = str;
    }

    public String b() {
        return this.f14100a;
    }
}
