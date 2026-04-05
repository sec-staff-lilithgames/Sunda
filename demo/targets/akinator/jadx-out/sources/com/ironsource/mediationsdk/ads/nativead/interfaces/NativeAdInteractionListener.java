package com.ironsource.mediationsdk.ads.nativead.interfaces;

import com.ironsource.mediationsdk.ads.nativead.LevelPlayNativeAd;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public interface NativeAdInteractionListener {
    void onAdClicked(LevelPlayNativeAd levelPlayNativeAd, AdInfo adInfo);

    void onAdImpression(LevelPlayNativeAd levelPlayNativeAd, AdInfo adInfo);
}
