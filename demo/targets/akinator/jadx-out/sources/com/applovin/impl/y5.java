package com.applovin.impl;

import com.applovin.sdk.AppLovinAdLoadListener;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class y5 extends w5 {

    /* renamed from: j, reason: collision with root package name */
    private final k f16295j;

    public y5(k kVar, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.k kVar2) {
        super(u.a("adtoken_zone"), appLovinAdLoadListener, "TaskFetchTokenAd", kVar2);
        this.f16295j = kVar;
    }

    @Override // com.applovin.impl.p5
    public Map h() {
        HashMap map = new HashMap(2);
        map.put("adtoken", this.f16295j.b());
        map.put("adtoken_prefix", this.f16295j.d());
        return map;
    }
}
