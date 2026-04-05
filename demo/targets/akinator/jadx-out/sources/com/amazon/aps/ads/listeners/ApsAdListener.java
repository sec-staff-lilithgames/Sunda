package com.amazon.aps.ads.listeners;

import com.amazon.aps.ads.ApsAd;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public interface ApsAdListener {
    void onAdClicked(ApsAd apsAd);

    void onAdFailedToLoad(ApsAd apsAd);

    void onAdLoaded(ApsAd apsAd);

    void onImpressionFired(ApsAd apsAd);

    default void onAdClosed(ApsAd apsAd) {
    }

    default void onAdError(ApsAd apsAd) {
    }

    default void onAdOpen(ApsAd apsAd) {
    }

    default void onVideoCompleted(ApsAd apsAd) {
    }
}
