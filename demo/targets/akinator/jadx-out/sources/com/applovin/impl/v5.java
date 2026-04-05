package com.applovin.impl;

import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdLoadListener;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class v5 extends x5 {

    /* renamed from: j, reason: collision with root package name */
    private final k f16089j;

    public v5(k kVar, AppLovinNativeAdLoadListener appLovinNativeAdLoadListener, com.applovin.impl.sdk.k kVar2) {
        super(u.a("adtoken_zone"), "TaskFetchNativeTokenAd", appLovinNativeAdLoadListener, kVar2);
        this.f16089j = kVar;
    }

    @Override // com.applovin.impl.p5
    public Map h() {
        HashMap map = new HashMap(2);
        map.put("adtoken", this.f16089j.b());
        map.put("adtoken_prefix", this.f16089j.d());
        return map;
    }
}
