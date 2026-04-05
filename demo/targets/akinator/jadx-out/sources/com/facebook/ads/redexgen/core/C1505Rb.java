package com.facebook.ads.redexgen.core;

import com.facebook.ads.RewardedVideoAd;

/* renamed from: com.facebook.ads.redexgen.X.Rb, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1505Rb implements RewardedVideoAd.RewardedVideoAdShowConfigBuilder, RewardedVideoAd.RewardedVideoShowAdConfig {
    public int A00 = -1;
    public long A01;

    public final int A00() {
        return this.A00;
    }

    public final long A01() {
        return this.A01;
    }

    public final C1505Rb A02(long j10) {
        this.A01 = j10;
        return this;
    }

    @Override // com.facebook.ads.RewardedVideoAd.RewardedVideoAdShowConfigBuilder, com.facebook.ads.FullScreenAd.ShowConfigBuilder
    public final RewardedVideoAd.RewardedVideoShowAdConfig build() {
        return this;
    }

    @Override // com.facebook.ads.RewardedVideoAd.RewardedVideoAdShowConfigBuilder
    public final RewardedVideoAd.RewardedVideoAdShowConfigBuilder withAppOrientation(int i10) {
        this.A00 = i10;
        return this;
    }
}
