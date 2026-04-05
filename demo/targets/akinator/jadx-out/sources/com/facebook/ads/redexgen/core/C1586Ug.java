package com.facebook.ads.redexgen.core;

import com.facebook.ads.AdListener;
import com.facebook.ads.AdView;

/* renamed from: com.facebook.ads.redexgen.X.Ug, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1586Ug implements AdView.AdViewLoadConfigBuilder, AdView.AdViewLoadConfig {
    public String A00;
    public final C1503Qz A01;

    public C1586Ug(C1503Qz c1503Qz) {
        this.A01 = c1503Qz;
    }

    public final String A00() {
        return this.A00;
    }

    @Override // com.facebook.ads.AdView.AdViewLoadConfigBuilder, com.facebook.ads.Ad.LoadConfigBuilder
    public final AdView.AdViewLoadConfig build() {
        return this;
    }

    @Override // com.facebook.ads.AdView.AdViewLoadConfigBuilder
    public final AdView.AdViewLoadConfigBuilder withAdListener(AdListener adListener) {
        this.A01.A0C(adListener);
        return this;
    }

    @Override // com.facebook.ads.AdView.AdViewLoadConfigBuilder, com.facebook.ads.Ad.LoadConfigBuilder
    public final AdView.AdViewLoadConfigBuilder withBid(String str) {
        this.A00 = str;
        return this;
    }
}
