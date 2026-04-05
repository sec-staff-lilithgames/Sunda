package com.unity3d.mediation.rewarded;

import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public interface LevelPlayRewardedAdListener {
    default void onAdClicked(LevelPlayAdInfo adInfo) {
        e0.checkNotNullParameter(adInfo, "adInfo");
    }

    default void onAdClosed(LevelPlayAdInfo adInfo) {
        e0.checkNotNullParameter(adInfo, "adInfo");
    }

    default void onAdDisplayFailed(LevelPlayAdError error, LevelPlayAdInfo adInfo) {
        e0.checkNotNullParameter(error, "error");
        e0.checkNotNullParameter(adInfo, "adInfo");
    }

    void onAdDisplayed(LevelPlayAdInfo levelPlayAdInfo);

    default void onAdInfoChanged(LevelPlayAdInfo adInfo) {
        e0.checkNotNullParameter(adInfo, "adInfo");
    }

    void onAdLoadFailed(LevelPlayAdError levelPlayAdError);

    void onAdLoaded(LevelPlayAdInfo levelPlayAdInfo);

    void onAdRewarded(LevelPlayReward levelPlayReward, LevelPlayAdInfo levelPlayAdInfo);
}
