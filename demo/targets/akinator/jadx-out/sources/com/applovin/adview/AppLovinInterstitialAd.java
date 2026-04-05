package com.applovin.adview;

import android.content.Context;
import com.applovin.impl.m2;
import com.applovin.impl.sdk.k;
import com.applovin.sdk.AppLovinSdk;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class AppLovinInterstitialAd {
    public static AppLovinInterstitialAdDialog create() {
        return create(AppLovinSdk.getInstance(k.o()), k.o());
    }

    public String toString() {
        return "AppLovinInterstitialAd{}";
    }

    @Deprecated
    public static AppLovinInterstitialAdDialog create(AppLovinSdk appLovinSdk, Context context) {
        if (appLovinSdk == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        if (context != null) {
            return new m2(appLovinSdk, context);
        }
        throw new IllegalArgumentException("No context specified");
    }
}
