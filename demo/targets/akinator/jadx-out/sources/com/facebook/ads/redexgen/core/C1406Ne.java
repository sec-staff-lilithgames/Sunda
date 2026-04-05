package com.facebook.ads.redexgen.core;

import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.RewardedVideoAdListener;

/* renamed from: com.facebook.ads.redexgen.X.Ne, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1406Ne implements RewardedVideoAdListener {
    public final /* synthetic */ C2157gy A00;

    public C1406Ne(C2157gy c2157gy) {
        this.A00 = c2157gy;
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdClicked(Ad ad2) {
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdLoaded(Ad ad2) {
        this.A00.A00.A08.onAdLoaded(this.A00.A00.A09.A6c());
    }

    @Override // com.facebook.ads.AdListener
    public final void onError(Ad ad2, AdError adError) {
        this.A00.A00.A03 = null;
        ((AbstractC2212hy) this.A00.A00.A04).A2A(false);
        this.A00.A00.A08.onAdLoaded(this.A00.A00.A09.A6c());
    }

    @Override // com.facebook.ads.AdListener
    public final void onLoggingImpression(Ad ad2) {
    }

    @Override // com.facebook.ads.RewardedVideoAdListener
    public final void onRewardedVideoClosed() {
        this.A00.A00.A08.onRewardedVideoClosed();
    }

    @Override // com.facebook.ads.RewardedVideoAdListener
    public final void onRewardedVideoCompleted() {
        this.A00.A00.A08.onRewardedVideoCompleted();
    }
}
