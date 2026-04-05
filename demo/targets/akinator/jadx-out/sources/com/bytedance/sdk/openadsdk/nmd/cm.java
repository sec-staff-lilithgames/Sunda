package com.bytedance.sdk.openadsdk.nmd;

import com.amazon.device.ads.DTBMetricsConfiguration;
import com.ironsource.C3119a4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public enum cm {
    TYPE_2G("2g"),
    TYPE_3G(C3119a4.f35921a),
    TYPE_4G("4g"),
    TYPE_5G("5g"),
    TYPE_WIFI(C3119a4.f35922b),
    TYPE_MOBILE(DTBMetricsConfiguration.APSMETRICS_LEVEL2_KEY),
    TYPE_UNKNOWN("unknown");

    private String xyk;

    cm(String str) {
        this.xyk = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.xyk;
    }
}
