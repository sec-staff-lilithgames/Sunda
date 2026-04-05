package com.applovin.impl;

import com.applovin.impl.q0;
import com.applovin.impl.s4;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.ironsource.C3271ic;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract class o6 extends g5 {
    public o6(String str, com.applovin.impl.sdk.k kVar) {
        super(str, kVar);
    }

    public abstract void a(JSONObject jSONObject);

    public void a(JSONObject jSONObject, q0.e eVar) {
        Map mapC = r0.c(this.f14003a);
        if (((Boolean) this.f14003a.a(v4.f16053v5)).booleanValue() || ((Boolean) this.f14003a.a(v4.f15997o5)).booleanValue()) {
            JsonUtils.putAll(jSONObject, (Map<String, ?>) mapC);
            mapC = null;
        }
        a aVar = new a(com.applovin.impl.sdk.network.a.a(this.f14003a).b(r0.b(f(), this.f14003a)).a(r0.a(f(), this.f14003a)).b(mapC).a(jSONObject).c(C3271ic.f36944b).b(((Boolean) this.f14003a.a(v4.E5)).booleanValue()).a((Object) new JSONObject()).a(g()).a(s4.a.a(((Integer) this.f14003a.a(v4.f15989n5)).intValue())).a(), this.f14003a, eVar);
        aVar.c(v4.f16008q0);
        aVar.b(v4.f16016r0);
        this.f14003a.r0().a(aVar);
    }

    public JSONObject e() {
        JSONObject jSONObject = new JSONObject();
        String strE = this.f14003a.x0().e();
        if (((Boolean) this.f14003a.a(v4.f16075y3)).booleanValue() && StringUtils.isValidString(strE)) {
            JsonUtils.putString(jSONObject, "cuid", strE);
        }
        if (((Boolean) this.f14003a.a(v4.A3)).booleanValue()) {
            JsonUtils.putString(jSONObject, "compass_random_token", this.f14003a.v());
        }
        if (((Boolean) this.f14003a.a(v4.C3)).booleanValue()) {
            JsonUtils.putString(jSONObject, "applovin_random_token", this.f14003a.i0());
        }
        a(jSONObject);
        return jSONObject;
    }

    public abstract String f();

    public abstract int g();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a extends j6 {

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ q0.e f14985m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar, q0.e eVar) {
            super(aVar, kVar);
            this.f14985m = eVar;
        }

        @Override // com.applovin.impl.j6, com.applovin.impl.q0.e
        public void a(String str, JSONObject jSONObject, int i10) {
            this.f14985m.a(str, jSONObject, i10);
        }

        @Override // com.applovin.impl.j6, com.applovin.impl.q0.e
        public void a(String str, int i10, String str2, JSONObject jSONObject) {
            this.f14985m.a(str, i10, str2, jSONObject);
        }
    }

    public void a(int i10) {
        r0.a(i10, this.f14003a);
    }
}
