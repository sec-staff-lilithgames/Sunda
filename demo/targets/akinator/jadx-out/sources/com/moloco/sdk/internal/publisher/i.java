package com.moloco.sdk.internal.publisher;

import com.moloco.sdk.publisher.AdShowListener;
import com.moloco.sdk.publisher.MolocoAd;
import com.moloco.sdk.publisher.MolocoAdError;
import com.moloco.sdk.publisher.RewardedInterstitialAdShowListener;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class i implements RewardedInterstitialAdShowListener, AdShowListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AdShowListener f46306a;

    /* renamed from: b, reason: collision with root package name */
    public final RewardedInterstitialAdShowListener f46307b;

    /* renamed from: c, reason: collision with root package name */
    public final kv.a f46308c;

    /* renamed from: d, reason: collision with root package name */
    public final com.moloco.sdk.internal.y f46309d;

    public i(RewardedInterstitialAdShowListener rewardedInterstitialAdShowListener, kv.a provideSdkEvents, com.moloco.sdk.internal.y sdkEventUrlTracker) {
        kotlin.jvm.internal.e0.checkNotNullParameter(provideSdkEvents, "provideSdkEvents");
        kotlin.jvm.internal.e0.checkNotNullParameter(sdkEventUrlTracker, "sdkEventUrlTracker");
        this.f46306a = t.a(rewardedInterstitialAdShowListener);
        this.f46307b = rewardedInterstitialAdShowListener;
        this.f46308c = provideSdkEvents;
        this.f46309d = sdkEventUrlTracker;
    }

    @Override // com.moloco.sdk.publisher.AdShowListener
    public void onAdClicked(MolocoAd molocoAd) {
        kotlin.jvm.internal.e0.checkNotNullParameter(molocoAd, "molocoAd");
        this.f46306a.onAdClicked(molocoAd);
    }

    @Override // com.moloco.sdk.publisher.AdShowListener
    public void onAdHidden(MolocoAd molocoAd) {
        kotlin.jvm.internal.e0.checkNotNullParameter(molocoAd, "molocoAd");
        this.f46306a.onAdHidden(molocoAd);
    }

    @Override // com.moloco.sdk.publisher.AdShowListener
    public void onAdShowFailed(MolocoAdError molocoAdError) {
        kotlin.jvm.internal.e0.checkNotNullParameter(molocoAdError, "molocoAdError");
        RewardedInterstitialAdShowListener rewardedInterstitialAdShowListener = this.f46307b;
        if (rewardedInterstitialAdShowListener != null) {
            rewardedInterstitialAdShowListener.onAdShowFailed(molocoAdError);
        }
    }

    @Override // com.moloco.sdk.publisher.AdShowListener
    public void onAdShowSuccess(MolocoAd molocoAd) {
        kotlin.jvm.internal.e0.checkNotNullParameter(molocoAd, "molocoAd");
        this.f46306a.onAdShowSuccess(molocoAd);
    }

    @Override // com.moloco.sdk.publisher.RewardedInterstitialAdShowListener
    public void onRewardedVideoCompleted(MolocoAd molocoAd) {
        String strO;
        kotlin.jvm.internal.e0.checkNotNullParameter(molocoAd, "molocoAd");
        com.moloco.sdk.internal.ortb.model.r rVar = (com.moloco.sdk.internal.ortb.model.r) this.f46308c.invoke();
        if (rVar != null && (strO = rVar.o()) != null) {
            com.moloco.sdk.internal.x.a(this.f46309d, strO, System.currentTimeMillis(), null, 4, null);
        }
        RewardedInterstitialAdShowListener rewardedInterstitialAdShowListener = this.f46307b;
        if (rewardedInterstitialAdShowListener != null) {
            rewardedInterstitialAdShowListener.onRewardedVideoCompleted(molocoAd);
        }
    }

    @Override // com.moloco.sdk.publisher.RewardedInterstitialAdShowListener
    public void onRewardedVideoStarted(MolocoAd molocoAd) {
        String strQ;
        kotlin.jvm.internal.e0.checkNotNullParameter(molocoAd, "molocoAd");
        com.moloco.sdk.internal.ortb.model.r rVar = (com.moloco.sdk.internal.ortb.model.r) this.f46308c.invoke();
        if (rVar != null && (strQ = rVar.q()) != null) {
            com.moloco.sdk.internal.x.a(this.f46309d, strQ, System.currentTimeMillis(), null, 4, null);
        }
        RewardedInterstitialAdShowListener rewardedInterstitialAdShowListener = this.f46307b;
        if (rewardedInterstitialAdShowListener != null) {
            rewardedInterstitialAdShowListener.onRewardedVideoStarted(molocoAd);
        }
    }

    @Override // com.moloco.sdk.publisher.RewardedInterstitialAdShowListener
    public void onUserRewarded(MolocoAd molocoAd) {
        String strS;
        kotlin.jvm.internal.e0.checkNotNullParameter(molocoAd, "molocoAd");
        com.moloco.sdk.internal.ortb.model.r rVar = (com.moloco.sdk.internal.ortb.model.r) this.f46308c.invoke();
        if (rVar != null && (strS = rVar.s()) != null) {
            com.moloco.sdk.internal.x.a(this.f46309d, strS, System.currentTimeMillis(), null, 4, null);
        }
        RewardedInterstitialAdShowListener rewardedInterstitialAdShowListener = this.f46307b;
        if (rewardedInterstitialAdShowListener != null) {
            rewardedInterstitialAdShowListener.onUserRewarded(molocoAd);
        }
    }
}
