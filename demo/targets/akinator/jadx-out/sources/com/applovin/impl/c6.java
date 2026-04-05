package com.applovin.impl;

import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinErrorCodes;
import com.google.android.gms.ads.AdError;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class c6 extends g5 implements l2 {

    /* renamed from: g, reason: collision with root package name */
    private final JSONObject f13778g;

    /* renamed from: h, reason: collision with root package name */
    private final u f13779h;

    /* renamed from: i, reason: collision with root package name */
    private final AppLovinAdLoadListener f13780i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f13781j;

    public c6(JSONObject jSONObject, u uVar, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.k kVar) {
        this(jSONObject, uVar, false, appLovinAdLoadListener, kVar);
    }

    private void a(JSONObject jSONObject) {
        String string = JsonUtils.getString(jSONObject, "type", AdError.UNDEFINED_DOMAIN);
        if ("applovin".equalsIgnoreCase(string)) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f14005c.a(this.f14004b, "Starting task for AppLovin ad...");
            }
            this.f14003a.r0().a(new h6(jSONObject, this.f13778g, this, this.f14003a));
            return;
        }
        if ("vast".equalsIgnoreCase(string)) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f14005c.a(this.f14004b, "Starting task for VAST ad...");
            }
            this.f14003a.r0().a(f6.a(jSONObject, this.f13778g, this, this.f14003a));
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f14005c.b(this.f14004b, "Unable to process ad of unknown type: " + string);
        }
        failedToReceiveAdV2(new AppLovinError(AppLovinErrorCodes.INVALID_RESPONSE, a.b.k("Unknown ad type: ", string)));
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public void adReceived(AppLovinAd appLovinAd) {
        AppLovinAdLoadListener appLovinAdLoadListener = this.f13780i;
        if (appLovinAdLoadListener != null) {
            appLovinAdLoadListener.adReceived(appLovinAd);
        }
        if (this.f13781j || !(appLovinAd instanceof com.applovin.impl.sdk.ad.b)) {
            return;
        }
        this.f14003a.g().a(c2.f13725n, (com.applovin.impl.sdk.ad.b) appLovinAd);
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public void failedToReceiveAd(int i10) {
        failedToReceiveAdV2(new AppLovinError(i10, ""));
    }

    @Override // com.applovin.impl.l2
    public void failedToReceiveAdV2(AppLovinError appLovinError) {
        AppLovinAdLoadListener appLovinAdLoadListener = this.f13780i;
        if (appLovinAdLoadListener == null) {
            return;
        }
        if (appLovinAdLoadListener instanceof l2) {
            ((l2) appLovinAdLoadListener).failedToReceiveAdV2(appLovinError);
        } else {
            appLovinAdLoadListener.failedToReceiveAd(appLovinError.getCode());
        }
        if (this.f13781j) {
            return;
        }
        this.f14003a.g().a(c2.f13727o, this.f13779h, appLovinError);
    }

    @Override // java.lang.Runnable
    public void run() {
        JSONArray jSONArrayT = b0.e2.t(this.f13778g, com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS);
        if (jSONArrayT.length() > 0) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f14005c.a(this.f14004b, "Processing ad...");
            }
            a(JsonUtils.getJSONObject(jSONArrayT, 0, new JSONObject()));
        } else {
            if (com.applovin.impl.sdk.o.a()) {
                this.f14005c.k(this.f14004b, "No ads were returned from the server");
            }
            k7.a(this.f13779h.e(), this.f13779h.d(), this.f13778g, this.f14003a);
            failedToReceiveAdV2(AppLovinError.NO_FILL);
        }
    }

    public c6(JSONObject jSONObject, u uVar, boolean z10, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.k kVar) {
        super("TaskProcessAdResponse", kVar);
        if (jSONObject == null) {
            throw new IllegalArgumentException("No response specified");
        }
        if (uVar == null) {
            throw new IllegalArgumentException("No zone specified");
        }
        this.f13778g = jSONObject;
        this.f13779h = uVar;
        this.f13780i = appLovinAdLoadListener;
        this.f13781j = z10;
    }
}
