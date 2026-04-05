package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.mediation.interstitial.LevelPlayInterstitialAdListener;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.gb, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3234gb {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.gb$a */
    public static final class a implements InterfaceC3180db {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LevelPlayInterstitialAdListener f36803a;

        public a(LevelPlayInterstitialAdListener levelPlayInterstitialAdListener) {
            this.f36803a = levelPlayInterstitialAdListener;
        }

        @Override // com.ironsource.InterfaceC3180db
        public void onAdClicked(LevelPlayAdInfo adInfo) {
            kotlin.jvm.internal.e0.checkNotNullParameter(adInfo, "adInfo");
            IronLog.CALLBACK.info("LevelPlayInterstitialAdListener.onAdClicked() adInfo: " + adInfo);
            this.f36803a.onAdClicked(adInfo);
        }

        @Override // com.ironsource.InterfaceC3180db
        public void onAdClosed(LevelPlayAdInfo adInfo) {
            kotlin.jvm.internal.e0.checkNotNullParameter(adInfo, "adInfo");
            IronLog.CALLBACK.info("LevelPlayInterstitialAdListener.onAdClosed() adInfo: " + adInfo);
            this.f36803a.onAdClosed(adInfo);
        }

        @Override // com.ironsource.InterfaceC3180db
        public void onAdDisplayFailed(LevelPlayAdError error, LevelPlayAdInfo adInfo) {
            kotlin.jvm.internal.e0.checkNotNullParameter(error, "error");
            kotlin.jvm.internal.e0.checkNotNullParameter(adInfo, "adInfo");
            IronLog.CALLBACK.info("LevelPlayInterstitialAdListener.onAdDisplayFailed() adInfo: " + adInfo + " error: " + error);
            this.f36803a.onAdDisplayFailed(error, adInfo);
        }

        @Override // com.ironsource.InterfaceC3180db
        public void onAdDisplayed(LevelPlayAdInfo adInfo) {
            kotlin.jvm.internal.e0.checkNotNullParameter(adInfo, "adInfo");
            IronLog.CALLBACK.info("LevelPlayInterstitialAdListener.onAdDisplayed() adInfo: " + adInfo);
            this.f36803a.onAdDisplayed(adInfo);
        }

        @Override // com.ironsource.InterfaceC3180db
        public void onAdInfoChanged(LevelPlayAdInfo adInfo) {
            kotlin.jvm.internal.e0.checkNotNullParameter(adInfo, "adInfo");
            IronLog.CALLBACK.info("LevelPlayInterstitialAdListener.onAdInfoChanged() adInfo: " + adInfo);
            this.f36803a.onAdInfoChanged(adInfo);
        }

        @Override // com.ironsource.InterfaceC3180db
        public void onAdLoadFailed(LevelPlayAdError error) {
            kotlin.jvm.internal.e0.checkNotNullParameter(error, "error");
            IronLog.CALLBACK.info("LevelPlayInterstitialAdListener.onAdLoaded() error: " + error);
            this.f36803a.onAdLoadFailed(error);
        }

        @Override // com.ironsource.InterfaceC3180db
        public void onAdLoaded(LevelPlayAdInfo adInfo) {
            kotlin.jvm.internal.e0.checkNotNullParameter(adInfo, "adInfo");
            IronLog.CALLBACK.info("LevelPlayInterstitialAdListener.onAdLoaded() adInfo: " + adInfo);
            this.f36803a.onAdLoaded(adInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC3180db b(LevelPlayInterstitialAdListener levelPlayInterstitialAdListener) {
        return new a(levelPlayInterstitialAdListener);
    }
}
