package com.unity3d.ads.beta;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public interface BannerShowListener {
    void unityAdsBannerDidClick(BannerAd bannerAd);

    void unityAdsBannerDidFailShow(BannerAd bannerAd, UnityAdsError unityAdsError);

    void unityAdsBannerImpression(BannerAd bannerAd);
}
