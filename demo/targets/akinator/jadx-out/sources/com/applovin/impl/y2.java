package com.applovin.impl;

import com.applovin.mediation.MaxAdFormat;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class y2 extends e3 {
    public y2(x2 x2Var, JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.sdk.k kVar) {
        super(x2Var, jSONObject, jSONObject2, null, kVar);
    }

    @Override // com.applovin.impl.v2
    public v2 a(com.applovin.impl.mediation.h hVar) {
        return new y2(this, hVar);
    }

    public long l0() {
        long jA = a("ad_refresh_ms", -1L);
        return jA >= 0 ? jA : b("ad_refresh_ms", ((Long) this.f14067a.a(o3.f14964p7)).longValue());
    }

    public long m0() {
        return k7.e(a("bg_color", (String) null));
    }

    public int n0() {
        int iA = a("ad_view_height", -2);
        if (iA != -2) {
            return iA;
        }
        MaxAdFormat format = getFormat();
        if (format.isAdViewAd()) {
            return format.getSize().getHeight();
        }
        throw new IllegalStateException("Invalid ad format");
    }

    public long o0() {
        return a("viewability_imp_delay_ms", ((Long) this.f14067a.a(v4.f15969l1)).longValue());
    }

    public int p0() {
        int iA = a("ad_view_width", -2);
        if (iA != -2) {
            return iA;
        }
        MaxAdFormat format = getFormat();
        if (format.isAdViewAd()) {
            return format.getSize().getWidth();
        }
        throw new IllegalStateException("Invalid ad format");
    }

    public boolean q0() {
        return l0() >= 0;
    }

    public boolean r0() {
        return a("proe", (Boolean) this.f14067a.a(o3.R7)).booleanValue();
    }

    private y2(y2 y2Var, com.applovin.impl.mediation.h hVar) {
        super(y2Var.M(), y2Var.a(), y2Var.g(), hVar, y2Var.f14067a);
    }
}
