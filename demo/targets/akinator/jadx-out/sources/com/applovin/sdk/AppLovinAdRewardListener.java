package com.applovin.sdk;

import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public interface AppLovinAdRewardListener {
    void userOverQuota(AppLovinAd appLovinAd, Map<String, String> map);

    void userRewardRejected(AppLovinAd appLovinAd, Map<String, String> map);

    void userRewardVerified(AppLovinAd appLovinAd, Map<String, String> map);

    void validationRequestFailed(AppLovinAd appLovinAd, int i10);
}
