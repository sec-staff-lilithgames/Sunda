package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.mediation.rewarded.LevelPlayReward;
import com.unity3d.mediation.rewarded.LevelPlayRewardedAdListener;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.rb, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3429rb {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.rb$a */
    public static final class a implements InterfaceC3180db {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LevelPlayRewardedAdListener f38293a;

        public a(LevelPlayRewardedAdListener levelPlayRewardedAdListener) {
            this.f38293a = levelPlayRewardedAdListener;
        }

        @Override // com.ironsource.InterfaceC3180db
        public void onAdClicked(LevelPlayAdInfo adInfo) {
            kotlin.jvm.internal.e0.checkNotNullParameter(adInfo, "adInfo");
            IronLog.CALLBACK.info("LevelPlayRewardedAdListener.onAdClicked() adInfo: " + adInfo);
            this.f38293a.onAdClicked(adInfo);
        }

        @Override // com.ironsource.InterfaceC3180db
        public void onAdClosed(LevelPlayAdInfo adInfo) {
            kotlin.jvm.internal.e0.checkNotNullParameter(adInfo, "adInfo");
            IronLog.CALLBACK.info("LevelPlayRewardedAdListener.onAdClosed() adInfo: " + adInfo);
            this.f38293a.onAdClosed(adInfo);
        }

        @Override // com.ironsource.InterfaceC3180db
        public void onAdDisplayFailed(LevelPlayAdError error, LevelPlayAdInfo adInfo) {
            kotlin.jvm.internal.e0.checkNotNullParameter(error, "error");
            kotlin.jvm.internal.e0.checkNotNullParameter(adInfo, "adInfo");
            IronLog.CALLBACK.info("LevelPlayRewardedAdListener.onAdDisplayFailed() adInfo: " + adInfo + " error: " + error);
            this.f38293a.onAdDisplayFailed(error, adInfo);
        }

        @Override // com.ironsource.InterfaceC3180db
        public void onAdDisplayed(LevelPlayAdInfo adInfo) {
            kotlin.jvm.internal.e0.checkNotNullParameter(adInfo, "adInfo");
            IronLog.CALLBACK.info("LevelPlayRewardedAdListener.onAdDisplayed() adInfo: " + adInfo);
            this.f38293a.onAdDisplayed(adInfo);
        }

        @Override // com.ironsource.InterfaceC3180db
        public void onAdInfoChanged(LevelPlayAdInfo adInfo) {
            kotlin.jvm.internal.e0.checkNotNullParameter(adInfo, "adInfo");
            IronLog.CALLBACK.info("LevelPlayRewardedAdListener.onAdInfoChanged() adInfo: " + adInfo);
            this.f38293a.onAdInfoChanged(adInfo);
        }

        @Override // com.ironsource.InterfaceC3180db
        public void onAdLoadFailed(LevelPlayAdError error) {
            kotlin.jvm.internal.e0.checkNotNullParameter(error, "error");
            IronLog.CALLBACK.info("LevelPlayRewardedAdListener.onAdLoadFailed() error: " + error);
            this.f38293a.onAdLoadFailed(error);
        }

        @Override // com.ironsource.InterfaceC3180db
        public void onAdLoaded(LevelPlayAdInfo adInfo) {
            kotlin.jvm.internal.e0.checkNotNullParameter(adInfo, "adInfo");
            IronLog.CALLBACK.info("LevelPlayRewardedAdListener.onAdLoaded() adInfo: " + adInfo);
            this.f38293a.onAdLoaded(adInfo);
        }

        @Override // com.ironsource.InterfaceC3180db
        public void onAdRewarded(LevelPlayReward reward, LevelPlayAdInfo adInfo) {
            kotlin.jvm.internal.e0.checkNotNullParameter(reward, "reward");
            kotlin.jvm.internal.e0.checkNotNullParameter(adInfo, "adInfo");
            IronLog.CALLBACK.info("LevelPlayRewardedAdListener.onAdRewarded() reward: " + reward + " adInfo: " + adInfo);
            this.f38293a.onAdRewarded(reward, adInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC3180db b(LevelPlayRewardedAdListener levelPlayRewardedAdListener) {
        return new a(levelPlayRewardedAdListener);
    }
}
