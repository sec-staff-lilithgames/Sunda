package com.amazon.aps.ads.model;

import com.amazon.aps.shared.APSAnalytics;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public enum ApsMraidVersion {
    MRAID_V1(APSAnalytics.DEFAULT_SDK_VERSION),
    MRAID_V2("2.0"),
    MRAID_V3("3.0");

    private String version;

    ApsMraidVersion(String str) {
        this.version = str;
    }

    public String getString() {
        return this.version;
    }
}
