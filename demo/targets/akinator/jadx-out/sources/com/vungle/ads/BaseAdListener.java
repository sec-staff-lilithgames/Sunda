package com.vungle.ads;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public interface BaseAdListener {
    void onAdClicked(BaseAd baseAd);

    void onAdEnd(BaseAd baseAd);

    void onAdFailedToLoad(BaseAd baseAd, VungleError vungleError);

    void onAdFailedToPlay(BaseAd baseAd, VungleError vungleError);

    void onAdImpression(BaseAd baseAd);

    void onAdLeftApplication(BaseAd baseAd);

    void onAdLoaded(BaseAd baseAd);

    void onAdStart(BaseAd baseAd);
}
