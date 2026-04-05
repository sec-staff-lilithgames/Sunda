package com.applovin.impl;

import com.applovin.impl.z4;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class b5 extends h3 {

    /* renamed from: k, reason: collision with root package name */
    private final x2 f13629k;

    public b5(x2 x2Var, JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.sdk.k kVar) {
        super(x2Var.e(), jSONObject, jSONObject2, kVar);
        this.f13629k = x2Var;
    }

    public boolean A() {
        return a("use_cached_adapter", Boolean.TRUE).booleanValue();
    }

    public z4.b t() {
        return z4.b.values()[a("signal_cache_level", ((Integer) this.f14067a.a(o3.H7)).intValue())];
    }

    @Override // com.applovin.impl.h3
    public String toString() {
        return "SignalProviderSpec{adObject=" + a() + AbstractJsonLexerKt.END_OBJ;
    }

    public x2 u() {
        return this.f13629k;
    }

    public long v() {
        return a("signal_expiration_ms", ((Long) this.f14067a.a(o3.G7)).longValue());
    }

    public boolean w() {
        return a("only_collect_signal_when_initialized", Boolean.FALSE).booleanValue();
    }

    public boolean x() {
        return a("prefer_collect_signal_when_initialized", Boolean.TRUE).booleanValue();
    }

    public boolean y() {
        return a("fail_collection_for_empty_signal", (Boolean) this.f14067a.a(o3.f14961n8)).booleanValue();
    }

    public boolean z() {
        return a("ignore_init_failure", Boolean.FALSE).booleanValue();
    }
}
