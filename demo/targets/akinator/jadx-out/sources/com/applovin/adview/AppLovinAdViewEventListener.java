package com.applovin.adview;

import com.applovin.sdk.AppLovinAd;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public interface AppLovinAdViewEventListener {
    void adClosedFullscreen(AppLovinAd appLovinAd, AppLovinAdView appLovinAdView);

    void adFailedToDisplay(AppLovinAd appLovinAd, AppLovinAdView appLovinAdView, AppLovinAdViewDisplayErrorCode appLovinAdViewDisplayErrorCode);

    void adLeftApplication(AppLovinAd appLovinAd, AppLovinAdView appLovinAdView);

    void adOpenedFullscreen(AppLovinAd appLovinAd, AppLovinAdView appLovinAdView);
}
