package com.applovin.impl;

import android.os.Bundle;
import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class z2 extends v2 implements s1 {
    private String A;

    /* renamed from: u, reason: collision with root package name */
    private final Bundle f16344u;

    /* renamed from: v, reason: collision with root package name */
    private final AtomicReference f16345v;

    /* renamed from: w, reason: collision with root package name */
    private final AtomicBoolean f16346w;

    /* renamed from: x, reason: collision with root package name */
    private final AtomicBoolean f16347x;

    /* renamed from: y, reason: collision with root package name */
    private final AtomicBoolean f16348y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f16349z;

    public z2(x2 x2Var, JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.sdk.k kVar) {
        super(x2Var, jSONObject, jSONObject2, null, kVar);
        this.f16344u = new Bundle();
        this.f16347x = new AtomicBoolean();
        this.f16348y = new AtomicBoolean();
        this.f16345v = new AtomicReference();
        this.f16346w = new AtomicBoolean();
    }

    private long e0() {
        long jA = a("ad_expiration_ms", -1L);
        return jA < 0 ? b("ad_expiration_ms", ((Long) this.f14067a.a(o3.I7)).longValue()) : jA;
    }

    @Override // com.applovin.impl.v2
    public v2 a(com.applovin.impl.mediation.h hVar) {
        return new z2(this, hVar);
    }

    public void d0() {
        this.f16346w.set(true);
    }

    public long f0() {
        return a("ahdm", ((Long) this.f14067a.a(o3.C7)).longValue());
    }

    public long g0() {
        long jA = a("ad_hidden_on_ad_dismiss_callback_delay_ms", -1L);
        return jA >= 0 ? jA : b("ad_hidden_on_ad_dismiss_callback_delay_ms", ((Long) this.f14067a.a(o3.Q7)).longValue());
    }

    @Override // com.applovin.impl.s1
    public long getTimeToLiveMillis() {
        return e0() - (SystemClock.elapsedRealtime() - H());
    }

    public long h0() {
        long jA = a("ad_hidden_timeout_ms", -1L);
        return jA >= 0 ? jA : b("ad_hidden_timeout_ms", ((Long) this.f14067a.a(o3.N7)).longValue());
    }

    public l4 i0() {
        return (l4) this.f16345v.getAndSet(null);
    }

    public void j(String str) {
        this.A = str;
    }

    public long j0() {
        if (H() > 0) {
            return SystemClock.elapsedRealtime() - H();
        }
        return -1L;
    }

    public Bundle k0() {
        return this.f16344u;
    }

    public long l0() {
        long jA = a("fullscreen_display_delay_ms", -1L);
        return jA >= 0 ? jA : ((Long) this.f14067a.a(o3.A7)).longValue();
    }

    public String m0() {
        return b("mcode", "");
    }

    public AtomicBoolean n0() {
        return this.f16347x;
    }

    public String o0() {
        return this.A;
    }

    public AtomicBoolean p0() {
        return this.f16348y;
    }

    public boolean q0() {
        return this.f16346w.get();
    }

    public boolean r0() {
        if (a("schedule_ad_hidden_on_ad_dismiss", Boolean.FALSE).booleanValue()) {
            return true;
        }
        return b("schedule_ad_hidden_on_ad_dismiss", (Boolean) this.f14067a.a(o3.O7)).booleanValue();
    }

    public boolean s0() {
        if (a("schedule_ad_hidden_on_single_task_app_relaunch", Boolean.FALSE).booleanValue()) {
            return true;
        }
        return b("schedule_ad_hidden_on_single_task_app_relaunch", (Boolean) this.f14067a.a(o3.P7)).booleanValue();
    }

    @Override // com.applovin.impl.s1
    public void setExpired() {
        this.f16349z = true;
    }

    public boolean t0() {
        return a("susaode", (Boolean) this.f14067a.a(o3.B7)).booleanValue();
    }

    @Override // com.applovin.impl.v2
    public void a(Bundle bundle) throws JSONException {
        Bundle bundle2;
        super.a(bundle);
        if (bundle == null || (bundle2 = bundle.getBundle("applovin_ad_view_info")) == null) {
            return;
        }
        this.f16344u.putBundle("applovin_ad_view_info", bundle2);
    }

    public void a(l4 l4Var) {
        this.f16345v.set(l4Var);
    }

    private z2(z2 z2Var, com.applovin.impl.mediation.h hVar) {
        super(z2Var.M(), z2Var.a(), z2Var.g(), hVar, z2Var.f14067a);
        this.f16344u = new Bundle();
        this.f16347x = new AtomicBoolean();
        this.f16348y = new AtomicBoolean();
        this.f16345v = z2Var.f16345v;
        this.f16346w = z2Var.f16346w;
    }
}
