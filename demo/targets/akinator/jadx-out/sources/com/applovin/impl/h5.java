package com.applovin.impl;

import com.applovin.impl.s4;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.ironsource.C3271ic;
import com.ironsource.Q6;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
class h5 extends g5 {
    public h5(com.applovin.impl.sdk.k kVar) {
        super("TaskApiSubmitData", kVar);
    }

    private void b(JSONObject jSONObject) {
        com.applovin.impl.sdk.l lVarB = this.f14003a.B();
        Map mapO = lVarB.o();
        k7.a(Q6.H, "type", mapO);
        k7.a("api_level", "sdk_version", mapO);
        JsonUtils.putObject(jSONObject, "device_info", new JSONObject(mapO));
        Map mapE = lVarB.E();
        k7.a("sdk_version", "applovin_sdk_version", mapE);
        k7.a("ia", "installed_at", mapE);
        JsonUtils.putObject(jSONObject, "app_info", new JSONObject(mapE));
    }

    @Override // java.lang.Runnable
    public void run() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f14005c.d(this.f14004b, "Submitting user data...");
        }
        Map mapC = r0.c(this.f14003a);
        JSONObject jSONObject = new JSONObject();
        b(jSONObject);
        if (((Boolean) this.f14003a.a(v4.f16045u5)).booleanValue() || ((Boolean) this.f14003a.a(v4.f15997o5)).booleanValue()) {
            JsonUtils.putAll(jSONObject, (Map<String, ?>) mapC);
            mapC = null;
        }
        a(mapC, jSONObject);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a extends j6 {
        public a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar) {
            super(aVar, kVar);
        }

        @Override // com.applovin.impl.j6, com.applovin.impl.q0.e
        public void a(String str, JSONObject jSONObject, int i10) {
            h5.this.a(jSONObject);
        }

        @Override // com.applovin.impl.j6, com.applovin.impl.q0.e
        public void a(String str, int i10, String str2, JSONObject jSONObject) {
            r0.a(i10, this.f14003a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(JSONObject jSONObject) {
        JSONObject jSONObject2 = JsonUtils.getJSONObject(b0.e2.t(jSONObject, "results"), 0, new JSONObject());
        this.f14003a.p0().a(v4.f15919f, JsonUtils.getString(jSONObject2, "device_id", ""));
        this.f14003a.p0().a(v4.f15951j, JsonUtils.getString(jSONObject2, "device_token", ""));
        r0.a(jSONObject2, this.f14003a);
    }

    private void a(Map map, JSONObject jSONObject) {
        a aVar = new a(com.applovin.impl.sdk.network.a.a(this.f14003a).b(r0.b("2.0/device", this.f14003a)).a(r0.a("2.0/device", this.f14003a)).b(map).a(jSONObject).c(C3271ic.f36944b).b(((Boolean) this.f14003a.a(v4.B5)).booleanValue()).a((Object) new JSONObject()).a(((Integer) this.f14003a.a(v4.X2)).intValue()).a(s4.a.a(((Integer) this.f14003a.a(v4.f15981m5)).intValue())).a(), this.f14003a);
        aVar.c(v4.f16008q0);
        aVar.b(v4.f16016r0);
        this.f14003a.r0().a(aVar);
    }
}
