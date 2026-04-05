package com.applovin.mediation.adapter.listeners;

import android.os.Bundle;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.adapter.MaxAdapterError;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@Deprecated
/* loaded from: classes4.dex */
public interface MaxRewardedInterstitialAdapterListener extends MaxAdapterListener {
    @Deprecated
    void onRewardedInterstitialAdClicked();

    @Deprecated
    void onRewardedInterstitialAdClicked(Bundle bundle);

    @Deprecated
    void onRewardedInterstitialAdDisplayFailed(MaxAdapterError maxAdapterError);

    @Deprecated
    void onRewardedInterstitialAdDisplayFailed(MaxAdapterError maxAdapterError, Bundle bundle);

    @Deprecated
    void onRewardedInterstitialAdDisplayed();

    @Deprecated
    void onRewardedInterstitialAdDisplayed(Bundle bundle);

    @Deprecated
    void onRewardedInterstitialAdHidden();

    @Deprecated
    void onRewardedInterstitialAdHidden(Bundle bundle);

    @Deprecated
    void onRewardedInterstitialAdLoadFailed(MaxAdapterError maxAdapterError);

    @Deprecated
    void onRewardedInterstitialAdLoaded();

    @Deprecated
    void onRewardedInterstitialAdLoaded(Bundle bundle);

    @Deprecated
    void onUserRewarded(MaxReward maxReward);

    @Deprecated
    void onUserRewarded(MaxReward maxReward, Bundle bundle);
}
