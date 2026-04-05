package com.applovin.impl;

import com.applovin.impl.sdk.AppLovinError;
import com.applovin.sdk.AppLovinAdLoadListener;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class w5 extends p5 {

    /* renamed from: i, reason: collision with root package name */
    private final AppLovinAdLoadListener f16143i;

    public w5(u uVar, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.k kVar) {
        this(uVar, appLovinAdLoadListener, "TaskFetchNextAd", kVar);
    }

    @Override // com.applovin.impl.p5
    public g5 a(JSONObject jSONObject) {
        return new c6(jSONObject, this.f15040g, this.f16143i, this.f14003a);
    }

    @Override // com.applovin.impl.p5
    public String e() {
        return r0.a(this.f14003a);
    }

    @Override // com.applovin.impl.p5
    public String f() {
        return r0.b(this.f14003a);
    }

    public w5(u uVar, AppLovinAdLoadListener appLovinAdLoadListener, String str, com.applovin.impl.sdk.k kVar) {
        super(uVar, str, kVar);
        this.f16143i = appLovinAdLoadListener;
    }

    @Override // com.applovin.impl.p5
    public void a(int i10, String str) {
        super.a(i10, str);
        AppLovinAdLoadListener appLovinAdLoadListener = this.f16143i;
        if (!(appLovinAdLoadListener instanceof l2)) {
            appLovinAdLoadListener.failedToReceiveAd(i10);
        } else {
            ((l2) this.f16143i).failedToReceiveAdV2(new AppLovinError(i10, str));
        }
    }
}
