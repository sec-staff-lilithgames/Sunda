package com.moloco.sdk.publisher;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public interface RewardedInterstitialAdShowListener extends InterstitialAdShowListener {
    void onRewardedVideoCompleted(MolocoAd molocoAd);

    void onRewardedVideoStarted(MolocoAd molocoAd);

    void onUserRewarded(MolocoAd molocoAd);
}
