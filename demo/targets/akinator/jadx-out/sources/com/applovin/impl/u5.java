package com.applovin.impl;

import android.content.Context;
import com.applovin.impl.q0;
import com.applovin.impl.s4;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.v;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.ironsource.C3271ic;
import com.ironsource.Q6;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class u5 extends g5 {

    /* renamed from: g, reason: collision with root package name */
    private final q0.e f15810g;

    public u5(q0.e eVar, com.applovin.impl.sdk.k kVar) {
        super("TaskFetchMediationDebuggerInfo", kVar, true);
        this.f15810g = eVar;
    }

    public Map e() {
        HashMap map = new HashMap();
        map.put("sdk_version", AppLovinSdk.VERSION);
        if (!((Boolean) this.f14003a.a(v4.f15883a5)).booleanValue()) {
            map.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f14003a.j0());
        }
        Map mapE = this.f14003a.B().E();
        map.put("package_name", String.valueOf(mapE.get("package_name")));
        map.put("app_version", String.valueOf(mapE.get("app_version")));
        Map mapL = this.f14003a.B().L();
        map.put(Q6.H, String.valueOf(mapL.get(Q6.H)));
        map.put("os", String.valueOf(mapL.get("os")));
        return map;
    }

    @Override // java.lang.Runnable
    public void run() {
        Map mapE = e();
        JSONObject jSONObjectA = a(a());
        if (((Boolean) this.f14003a.a(v4.f16021r5)).booleanValue() || ((Boolean) this.f14003a.a(v4.f15997o5)).booleanValue()) {
            JsonUtils.putAll(jSONObjectA, (Map<String, ?>) mapE);
            mapE = null;
        }
        a aVar = new a(com.applovin.impl.sdk.network.a.a(this.f14003a).c(C3271ic.f36944b).b(i3.i(this.f14003a)).a(i3.h(this.f14003a)).b(mapE).a(jSONObjectA).a((Object) new JSONObject()).c(((Long) this.f14003a.a(o3.f14954k7)).intValue()).a(s4.a.a(((Integer) this.f14003a.a(v4.f15941h5)).intValue())).a(), this.f14003a, d());
        aVar.c(o3.f14947g7);
        aVar.b(o3.f14948h7);
        this.f14003a.r0().a(aVar);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a extends j6 {
        public a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar, boolean z10) {
            super(aVar, kVar, z10);
        }

        @Override // com.applovin.impl.j6, com.applovin.impl.q0.e
        public void a(String str, JSONObject jSONObject, int i10) {
            u5.this.f15810g.a(str, jSONObject, i10);
        }

        @Override // com.applovin.impl.j6, com.applovin.impl.q0.e
        public void a(String str, int i10, String str2, JSONObject jSONObject) {
            u5.this.f15810g.a(str, i10, str2, jSONObject);
        }
    }

    private JSONObject a(Context context) {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putJsonArrayIfValid(jSONObject, "installed_mediation_adapters", t3.b(this.f14003a));
        JsonUtils.putBoolean(jSONObject, "is_tablet", AppLovinSdkUtils.isTablet(context));
        v.a aVarF = this.f14003a.B().f();
        JsonUtils.putStringIfValid(jSONObject, "dnt_code", aVarF.b().b());
        JsonUtils.putStringIfValid(jSONObject, "idfa", aVarF.a());
        Map mapL0 = this.f14003a.l0();
        if (!CollectionUtils.isEmpty(mapL0)) {
            JsonUtils.putJSONObject(jSONObject, "segments", new JSONObject(mapL0));
        }
        return jSONObject;
    }
}
