package com.ironsource;

import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.mediation.banner.LevelPlayBannerAdViewListener;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Af implements LevelPlayBannerAdViewListener {
    @Override // com.unity3d.mediation.banner.LevelPlayBannerAdViewListener
    public void onAdClicked(LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adInfo, "adInfo");
        C3471u2.a().b(Pf.f35205a.a(adInfo));
    }

    @Override // com.unity3d.mediation.banner.LevelPlayBannerAdViewListener
    public void onAdDisplayed(LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adInfo, "adInfo");
        C3471u2.a().f(Pf.f35205a.a(adInfo));
    }

    @Override // com.unity3d.mediation.banner.LevelPlayBannerAdViewListener
    public void onAdLeftApplication(LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adInfo, "adInfo");
        C3471u2.a().c(Pf.f35205a.a(adInfo));
    }

    @Override // com.unity3d.mediation.banner.LevelPlayBannerAdViewListener
    public void onAdLoadFailed(LevelPlayAdError error) {
        kotlin.jvm.internal.e0.checkNotNullParameter(error, "error");
        C3471u2.a().a(Pf.f35205a.a(error));
    }

    @Override // com.unity3d.mediation.banner.LevelPlayBannerAdViewListener
    public void onAdLoaded(LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adInfo, "adInfo");
        C3471u2.a().d(Pf.f35205a.a(adInfo));
    }
}
