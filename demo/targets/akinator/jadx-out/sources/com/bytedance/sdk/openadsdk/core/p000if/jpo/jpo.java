package com.bytedance.sdk.openadsdk.core.p000if.jpo;

import com.vungle.ads.internal.protos.Sdk;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public enum jpo {
    XML_PARSING_ERROR(100),
    f20409jd(101),
    WRAPPER_TIMEOUT(Sdk.SDKError.Reason.MRAID_ERROR_VALUE),
    NO_ADS_VAST_RESPONSE(303),
    GENERAL_LINEAR_AD_ERROR(400),
    GENERAL_COMPANION_AD_ERROR(600),
    UNDEFINED_ERROR(900);

    private final int xyk;

    jpo(int i10) {
        this.xyk = i10;
    }

    public String jpo() {
        return String.valueOf(this.xyk);
    }
}
