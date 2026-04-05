package com.applovin.impl;

import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdLoadListener;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract class x5 extends p5 {

    /* renamed from: i, reason: collision with root package name */
    private final AppLovinNativeAdLoadListener f16201i;

    public x5(u uVar, String str, AppLovinNativeAdLoadListener appLovinNativeAdLoadListener, com.applovin.impl.sdk.k kVar) {
        super(uVar, str, kVar);
        this.f16201i = appLovinNativeAdLoadListener;
    }

    @Override // com.applovin.impl.p5
    public g5 a(JSONObject jSONObject) {
        return new e6(jSONObject, this.f16201i, this.f14003a);
    }

    @Override // com.applovin.impl.p5
    public String e() {
        return r0.d(this.f14003a);
    }

    @Override // com.applovin.impl.p5
    public String f() {
        return r0.e(this.f14003a);
    }

    @Override // com.applovin.impl.p5
    public void a(int i10, String str) {
        super.a(i10, str);
        this.f16201i.onNativeAdLoadFailed(new AppLovinError(i10, str));
    }
}
