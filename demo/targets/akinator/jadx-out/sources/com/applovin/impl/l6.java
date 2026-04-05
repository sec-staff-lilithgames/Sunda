package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class l6 extends m6 {

    /* renamed from: g, reason: collision with root package name */
    private final z2 f14364g;

    public l6(z2 z2Var, com.applovin.impl.sdk.k kVar) {
        super("TaskReportMaxReward", kVar);
        this.f14364g = z2Var;
    }

    @Override // com.applovin.impl.o6
    public void a(JSONObject jSONObject) {
        JsonUtils.putString(jSONObject, "ad_unit_id", this.f14364g.getAdUnitId());
        JsonUtils.putString(jSONObject, "placement", this.f14364g.getPlacement());
        JsonUtils.putString(jSONObject, "custom_data", this.f14364g.e());
        String strM0 = this.f14364g.m0();
        if (!StringUtils.isValidString(strM0)) {
            strM0 = "NO_MCODE";
        }
        JsonUtils.putString(jSONObject, "mcode", strM0);
        String strC = this.f14364g.C();
        if (!StringUtils.isValidString(strC)) {
            strC = "NO_BCODE";
        }
        JsonUtils.putString(jSONObject, "bcode", strC);
    }

    @Override // com.applovin.impl.m6
    public void b(JSONObject jSONObject) {
        if (com.applovin.impl.sdk.o.a()) {
            this.f14005c.a(this.f14004b, "Reported reward successfully for mediated ad: " + this.f14364g);
        }
    }

    @Override // com.applovin.impl.o6
    public String f() {
        return "2.0/mcr";
    }

    @Override // com.applovin.impl.m6
    public l4 h() {
        return this.f14364g.i0();
    }

    @Override // com.applovin.impl.m6
    public void i() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f14005c.b(this.f14004b, "No reward result was found for mediated ad: " + this.f14364g);
        }
    }

    @Override // com.applovin.impl.o6
    public void a(int i10) {
        super.a(i10);
        if (com.applovin.impl.sdk.o.a()) {
            this.f14005c.a(this.f14004b, "Failed to report reward for mediated ad: " + this.f14364g + " - error code: " + i10);
        }
        this.f14003a.P().a(c2.f13712g0, this.f14364g);
    }
}
