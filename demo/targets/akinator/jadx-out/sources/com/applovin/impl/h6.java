package com.applovin.impl;

import com.applovin.impl.b6;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.sdk.AppLovinAdLoadListener;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class h6 extends g5 {

    /* renamed from: g, reason: collision with root package name */
    private final JSONObject f14079g;

    /* renamed from: h, reason: collision with root package name */
    private final JSONObject f14080h;

    /* renamed from: i, reason: collision with root package name */
    private final AppLovinAdLoadListener f14081i;

    public h6(JSONObject jSONObject, JSONObject jSONObject2, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.k kVar) {
        super("TaskRenderAppLovinAd", kVar);
        this.f14079g = jSONObject;
        this.f14080h = jSONObject2;
        this.f14081i = appLovinAdLoadListener;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f14005c.a(this.f14004b, "Rendering ad...");
        }
        com.applovin.impl.sdk.ad.a aVar = new com.applovin.impl.sdk.ad.a(this.f14079g, this.f14080h, this.f14003a);
        boolean zBooleanValue = JsonUtils.getBoolean(this.f14079g, "gs_load_immediately", Boolean.FALSE).booleanValue();
        boolean zBooleanValue2 = JsonUtils.getBoolean(this.f14079g, "vs_load_immediately", Boolean.TRUE).booleanValue();
        k5 k5Var = new k5(aVar, this.f14003a, this.f14081i);
        k5Var.c(zBooleanValue2);
        k5Var.b(zBooleanValue);
        this.f14003a.r0().a((g5) k5Var, b6.b.CACHING);
    }
}
