package com.unity3d.ironsourceads.rewarded;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public interface RewardedAdListener {
    void onRewardedAdClicked(RewardedAd rewardedAd);

    void onRewardedAdDismissed(RewardedAd rewardedAd);

    void onRewardedAdFailedToShow(RewardedAd rewardedAd, IronSourceError ironSourceError);

    void onRewardedAdShown(RewardedAd rewardedAd);

    void onUserEarnedReward(RewardedAd rewardedAd);
}
