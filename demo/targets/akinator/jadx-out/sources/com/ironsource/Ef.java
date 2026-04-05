package com.ironsource;

import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.mediation.interstitial.LevelPlayInterstitialAdListener;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Ef implements LevelPlayInterstitialAdListener {
    @Override // com.unity3d.mediation.interstitial.LevelPlayInterstitialAdListener
    public void onAdClicked(LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adInfo, "adInfo");
        C3249h8.a().b(Pf.f35205a.a(adInfo));
    }

    @Override // com.unity3d.mediation.interstitial.LevelPlayInterstitialAdListener
    public void onAdClosed(LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adInfo, "adInfo");
        C3249h8.a().c(Pf.f35205a.a(adInfo));
    }

    @Override // com.unity3d.mediation.interstitial.LevelPlayInterstitialAdListener
    public void onAdDisplayFailed(LevelPlayAdError error, LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.e0.checkNotNullParameter(error, "error");
        kotlin.jvm.internal.e0.checkNotNullParameter(adInfo, "adInfo");
        C3249h8 c3249h8A = C3249h8.a();
        Pf pf2 = Pf.f35205a;
        c3249h8A.a(pf2.a(error), pf2.a(adInfo));
    }

    @Override // com.unity3d.mediation.interstitial.LevelPlayInterstitialAdListener
    public void onAdDisplayed(LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adInfo, "adInfo");
        C3249h8.a().f(Pf.f35205a.a(adInfo));
    }

    @Override // com.unity3d.mediation.interstitial.LevelPlayInterstitialAdListener
    public void onAdLoadFailed(LevelPlayAdError error) {
        kotlin.jvm.internal.e0.checkNotNullParameter(error, "error");
        C3249h8.a().a(Pf.f35205a.a(error));
    }

    @Override // com.unity3d.mediation.interstitial.LevelPlayInterstitialAdListener
    public void onAdLoaded(LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adInfo, "adInfo");
        C3249h8.a().e(Pf.f35205a.a(adInfo));
    }
}
