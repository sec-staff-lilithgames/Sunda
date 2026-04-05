package com.applovin.impl;

import com.applovin.mediation.MaxAdFormat;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract class e3 extends v2 {
    public e3(x2 x2Var, JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.mediation.h hVar, com.applovin.impl.sdk.k kVar) {
        super(x2Var, jSONObject, jSONObject2, hVar, kVar);
    }

    public float d0() {
        return a("viewability_min_alpha", ((Float) this.f14067a.a(v4.f16041u1)).floatValue() / 100.0f);
    }

    public int e0() {
        return a("viewability_min_pixels", -1);
    }

    public int f0() {
        MaxAdFormat format = getFormat();
        v4 v4Var = format == MaxAdFormat.BANNER ? v4.f15985n1 : format == MaxAdFormat.MREC ? v4.f16001p1 : format == MaxAdFormat.LEADER ? v4.f16017r1 : format == MaxAdFormat.NATIVE ? v4.f16033t1 : null;
        if (v4Var != null) {
            return a("viewability_min_height", ((Integer) this.f14067a.a(v4Var)).intValue());
        }
        return 0;
    }

    public float g0() {
        return a("viewability_min_percentage_dp", -1.0f);
    }

    public float h0() {
        return a("viewability_min_percentage_pixels", -1.0f);
    }

    public long i0() {
        return a("viewability_timer_min_visible_ms", ((Long) this.f14067a.a(v4.f16049v1)).longValue());
    }

    public int j0() {
        MaxAdFormat format = getFormat();
        v4 v4Var = format == MaxAdFormat.BANNER ? v4.f15977m1 : format == MaxAdFormat.MREC ? v4.f15993o1 : format == MaxAdFormat.LEADER ? v4.f16009q1 : format == MaxAdFormat.NATIVE ? v4.f16025s1 : null;
        if (v4Var != null) {
            return a("viewability_min_width", ((Integer) this.f14067a.a(v4Var)).intValue());
        }
        return 0;
    }

    public boolean k0() {
        return e0() >= 0 || g0() >= 0.0f || h0() >= 0.0f;
    }
}
