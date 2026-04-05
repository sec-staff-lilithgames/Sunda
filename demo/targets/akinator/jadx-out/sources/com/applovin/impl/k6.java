package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class k6 extends m6 {

    /* renamed from: g, reason: collision with root package name */
    private final com.applovin.impl.sdk.ad.b f14241g;

    public k6(com.applovin.impl.sdk.ad.b bVar, com.applovin.impl.sdk.k kVar) {
        super("TaskReportAppLovinReward", kVar);
        this.f14241g = bVar;
    }

    @Override // com.applovin.impl.o6
    public void a(JSONObject jSONObject) {
        JsonUtils.putString(jSONObject, "zone_id", this.f14241g.getAdZone().e());
        JsonUtils.putInt(jSONObject, "fire_percent", this.f14241g.Z());
        String clCode = this.f14241g.getClCode();
        if (!StringUtils.isValidString(clCode)) {
            clCode = "NO_CLCODE";
        }
        JsonUtils.putString(jSONObject, "clcode", clCode);
    }

    @Override // com.applovin.impl.m6
    public void b(JSONObject jSONObject) {
        if (com.applovin.impl.sdk.o.a()) {
            this.f14005c.a(this.f14004b, "Reported reward successfully for ad: " + this.f14241g);
        }
    }

    @Override // com.applovin.impl.o6
    public String f() {
        return "2.0/cr";
    }

    @Override // com.applovin.impl.m6
    public l4 h() {
        return this.f14241g.i();
    }

    @Override // com.applovin.impl.m6
    public void i() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f14005c.b(this.f14004b, "No reward result was found for ad: " + this.f14241g);
        }
    }

    @Override // com.applovin.impl.o6
    public void a(int i10) {
        super.a(i10);
        if (com.applovin.impl.sdk.o.a()) {
            this.f14005c.b(this.f14004b, "Failed to report reward for ad: " + this.f14241g + " - error code: " + i10);
        }
        this.f14003a.g().a(c2.f13739u, this.f14241g);
    }
}
