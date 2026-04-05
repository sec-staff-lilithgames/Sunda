package com.applovin.impl;

import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class r6 extends s6 {

    /* renamed from: g, reason: collision with root package name */
    private final z2 f15197g;

    public r6(z2 z2Var, com.applovin.impl.sdk.k kVar) {
        super("TaskValidateMaxReward", kVar);
        this.f15197g = z2Var;
    }

    @Override // com.applovin.impl.o6
    public void a(JSONObject jSONObject) {
        JsonUtils.putString(jSONObject, "ad_unit_id", this.f15197g.getAdUnitId());
        JsonUtils.putString(jSONObject, "placement", this.f15197g.getPlacement());
        JsonUtils.putString(jSONObject, "custom_data", this.f15197g.e());
        JsonUtils.putString(jSONObject, "ad_format", this.f15197g.getFormat().getLabel());
        String strM0 = this.f15197g.m0();
        if (!StringUtils.isValidString(strM0)) {
            strM0 = "NO_MCODE";
        }
        JsonUtils.putString(jSONObject, "mcode", strM0);
        String strC = this.f15197g.C();
        if (!StringUtils.isValidString(strC)) {
            strC = "NO_BCODE";
        }
        JsonUtils.putString(jSONObject, "bcode", strC);
    }

    @Override // com.applovin.impl.o6
    public String f() {
        return "2.0/mvr";
    }

    @Override // com.applovin.impl.s6
    public boolean h() {
        return this.f15197g.q0();
    }

    @Override // com.applovin.impl.s6
    public void a(l4 l4Var) {
        this.f15197g.a(l4Var);
    }

    @Override // com.applovin.impl.o6
    public void a(int i10) {
        String str;
        super.a(i10);
        if (i10 >= 400 && i10 < 500) {
            str = "rejected";
        } else {
            str = "network_timeout";
        }
        this.f15197g.a(l4.a(str));
        this.f14003a.P().a(c2.f13714h0, this.f15197g, CollectionUtils.hashMap("error_message", str));
    }
}
