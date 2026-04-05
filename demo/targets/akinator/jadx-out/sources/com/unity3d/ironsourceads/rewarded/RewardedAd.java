package com.unity3d.ironsourceads.rewarded;

import android.app.Activity;
import com.ironsource.Nd;
import com.ironsource.Od;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class RewardedAd implements Od {

    /* renamed from: a, reason: collision with root package name */
    private final Nd f50624a;

    /* renamed from: b, reason: collision with root package name */
    private RewardedAdListener f50625b;

    public RewardedAd(Nd rewardedAdInternal) {
        e0.checkNotNullParameter(rewardedAdInternal, "rewardedAdInternal");
        this.f50624a = rewardedAdInternal;
        rewardedAdInternal.a(this);
    }

    public final RewardedAdInfo getAdInfo() {
        return this.f50624a.b();
    }

    public final RewardedAdListener getListener() {
        return this.f50625b;
    }

    public final boolean isReadyToShow() {
        IronLog.API.info();
        return this.f50624a.d();
    }

    @Override // com.ironsource.Od
    public void onAdInstanceDidBecomeVisible() {
        IronLog.CALLBACK.info("RewardedAdListener onRewardedAdShown adInfo: " + getAdInfo());
        RewardedAdListener rewardedAdListener = this.f50625b;
        if (rewardedAdListener != null) {
            rewardedAdListener.onRewardedAdShown(this);
        }
    }

    @Override // com.ironsource.Od
    public void onRewardedAdClicked() {
        IronLog.CALLBACK.info("RewardedAdListener onRewardedAdClicked adInfo: " + getAdInfo());
        RewardedAdListener rewardedAdListener = this.f50625b;
        if (rewardedAdListener != null) {
            rewardedAdListener.onRewardedAdClicked(this);
        }
    }

    @Override // com.ironsource.Od
    public void onRewardedAdDismissed() {
        IronLog.CALLBACK.info("RewardedAdListener onRewardedAdDismissed adInfo: " + getAdInfo());
        RewardedAdListener rewardedAdListener = this.f50625b;
        if (rewardedAdListener != null) {
            rewardedAdListener.onRewardedAdDismissed(this);
        }
    }

    @Override // com.ironsource.Od
    public void onRewardedAdFailedToShow(IronSourceError error) {
        e0.checkNotNullParameter(error, "error");
        IronLog.CALLBACK.info("RewardedAdListener onRewardedAdFailedToShow error: " + error + " adInfo: " + getAdInfo());
        RewardedAdListener rewardedAdListener = this.f50625b;
        if (rewardedAdListener != null) {
            rewardedAdListener.onRewardedAdFailedToShow(this, error);
        }
    }

    @Override // com.ironsource.Od
    public void onRewardedAdShown() {
        IronLog.CALLBACK.info("RewardedAdListener onRewardedAdShown adInfo: " + getAdInfo());
        RewardedAdListener rewardedAdListener = this.f50625b;
        if (rewardedAdListener != null) {
            rewardedAdListener.onRewardedAdShown(this);
        }
    }

    @Override // com.ironsource.Od
    public void onUserEarnedReward() {
        IronLog.CALLBACK.info("RewardedAdListener onUserEarnedReward adInfo: " + getAdInfo());
        RewardedAdListener rewardedAdListener = this.f50625b;
        if (rewardedAdListener != null) {
            rewardedAdListener.onUserEarnedReward(this);
        }
    }

    public final void setListener(RewardedAdListener rewardedAdListener) {
        this.f50625b = rewardedAdListener;
    }

    public final void show(Activity activity) {
        e0.checkNotNullParameter(activity, "activity");
        IronLog.API.info();
        this.f50624a.a(activity);
    }
}
