package com.facebook.ads.redexgen.core;

import com.facebook.ads.AudienceNetworkAds;

/* loaded from: assets/audience_network.dex */
public class TJ implements AudienceNetworkAds.InitResult {
    public final String A00;
    public final boolean A01;

    public TJ(boolean z10, String str) {
        this.A01 = z10;
        this.A00 = str;
    }

    @Override // com.facebook.ads.AudienceNetworkAds.InitResult
    public final String getMessage() {
        return this.A00;
    }

    @Override // com.facebook.ads.AudienceNetworkAds.InitResult
    public final boolean isSuccess() {
        return this.A01;
    }
}
