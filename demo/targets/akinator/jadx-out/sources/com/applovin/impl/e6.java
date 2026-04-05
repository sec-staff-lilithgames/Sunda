package com.applovin.impl;

import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdLoadListener;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAdFormat;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class e6 extends g5 {

    /* renamed from: g, reason: collision with root package name */
    private final JSONObject f13940g;

    /* renamed from: h, reason: collision with root package name */
    private final AppLovinNativeAdLoadListener f13941h;

    public e6(JSONObject jSONObject, AppLovinNativeAdLoadListener appLovinNativeAdLoadListener, com.applovin.impl.sdk.k kVar) {
        super("TaskProcessNativeAdResponse", kVar);
        this.f13940g = jSONObject;
        this.f13941h = appLovinNativeAdLoadListener;
    }

    @Override // java.lang.Runnable
    public void run() {
        JSONArray jSONArrayT = b0.e2.t(this.f13940g, com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS);
        if (jSONArrayT.length() > 0) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f14005c.a(this.f14004b, "Processing ad...");
            }
            this.f14003a.r0().a(new com.applovin.impl.sdk.nativeAd.b(JsonUtils.getJSONObject(jSONArrayT, 0, new JSONObject()), this.f13940g, this.f13941h, this.f14003a));
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f14005c.k(this.f14004b, "No ads were returned from the server");
        }
        k7.a("native_native", MaxAdFormat.NATIVE, this.f13940g, this.f14003a);
        this.f13941h.onNativeAdLoadFailed(AppLovinError.NO_FILL);
    }
}
