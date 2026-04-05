package com.ironsource.mediationsdk.demandOnly;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public interface ISDemandOnlyRewardedVideoListener {
    void onRewardedVideoAdClicked(String str);

    void onRewardedVideoAdClosed(String str);

    void onRewardedVideoAdLoadFailed(String str, IronSourceError ironSourceError);

    void onRewardedVideoAdLoadSuccess(String str);

    void onRewardedVideoAdOpened(String str);

    void onRewardedVideoAdRewarded(String str);

    void onRewardedVideoAdShowFailed(String str, IronSourceError ironSourceError);
}
