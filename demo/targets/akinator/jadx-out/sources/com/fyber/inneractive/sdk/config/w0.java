package com.fyber.inneractive.sdk.config;

import com.mbridge.msdk.foundation.entity.CampaignEx;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public enum w0 {
    NO_CLICK("0"),
    CTA_BUTTON("1"),
    COMPANION("2"),
    VIDEO("3"),
    APP_INFO("4"),
    STORE_PROMO(CampaignEx.CLICKMODE_ON);

    String value;

    w0(String str) {
        this.value = str;
    }

    public final String a() {
        return this.value;
    }
}
