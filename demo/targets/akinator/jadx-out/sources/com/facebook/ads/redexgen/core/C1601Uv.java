package com.facebook.ads.redexgen.core;

import com.facebook.ads.NativeAdBase;
import com.facebook.ads.NativeAdListener;

/* renamed from: com.facebook.ads.redexgen.X.Uv, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1601Uv implements NativeAdBase.NativeAdLoadConfigBuilder, NativeAdBase.NativeLoadAdConfig {
    public NativeAdBase.MediaCacheFlag A02;
    public String A03;
    public boolean A04;
    public final NativeAdBase A05;
    public final C1480Qc A06;
    public int A01 = -1;
    public int A00 = -1;

    public C1601Uv(C1480Qc c1480Qc, NativeAdBase nativeAdBase) {
        this.A06 = c1480Qc;
        this.A05 = nativeAdBase;
    }

    public final void A00() {
        if (this.A02 == null) {
            this.A02 = NativeAdBase.MediaCacheFlag.ALL;
        }
        this.A06.A1Y(EnumC1591Ul.A00(this.A02), this.A03, new SL(this.A04, this.A01, this.A00));
    }

    @Override // com.facebook.ads.NativeAdBase.NativeAdLoadConfigBuilder, com.facebook.ads.Ad.LoadConfigBuilder
    public final NativeAdBase.NativeLoadAdConfig build() {
        return this;
    }

    @Override // com.facebook.ads.NativeAdBase.NativeAdLoadConfigBuilder
    public final NativeAdBase.NativeAdLoadConfigBuilder withAdListener(NativeAdListener nativeAdListener) {
        this.A06.A1U(this.A05, nativeAdListener);
        return this;
    }

    @Override // com.facebook.ads.NativeAdBase.NativeAdLoadConfigBuilder, com.facebook.ads.Ad.LoadConfigBuilder
    public final NativeAdBase.NativeAdLoadConfigBuilder withBid(String str) {
        this.A03 = str;
        return this;
    }

    @Override // com.facebook.ads.NativeAdBase.NativeAdLoadConfigBuilder
    public final NativeAdBase.NativeAdLoadConfigBuilder withMediaCacheFlag(NativeAdBase.MediaCacheFlag mediaCacheFlag) {
        this.A02 = mediaCacheFlag;
        return this;
    }

    @Override // com.facebook.ads.NativeAdBase.NativeAdLoadConfigBuilder
    public final NativeAdBase.NativeAdLoadConfigBuilder withPreloadedIconView(int i10, int i11) {
        this.A04 = true;
        this.A01 = i10;
        this.A00 = i11;
        return this;
    }
}
