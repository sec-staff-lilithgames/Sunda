package com.applovin.impl.mediation;

import com.applovin.impl.mediation.a;
import com.applovin.impl.mediation.c;
import com.applovin.impl.q2;
import com.applovin.impl.z2;
import com.applovin.sdk.AppLovinSdkUtils;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class b implements a.InterfaceC0033a, c.a {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f14615a;

    /* renamed from: b, reason: collision with root package name */
    private final a f14616b;

    /* renamed from: c, reason: collision with root package name */
    private final c f14617c;

    public b(com.applovin.impl.sdk.k kVar) {
        this.f14615a = kVar;
        this.f14616b = new a(kVar);
        this.f14617c = new c(kVar, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public void c(z2 z2Var) {
        h hVarA;
        if (z2Var == null || (hVarA = z2Var.A()) == null || !z2Var.w().compareAndSet(false, true)) {
            return;
        }
        q2.e(hVarA.c(), z2Var);
    }

    @Override // com.applovin.impl.mediation.a.InterfaceC0033a
    public void b(z2 z2Var) {
        AppLovinSdkUtils.runOnUiThreadDelayed(new r(2, this, z2Var), z2Var.g0());
    }

    public void e(z2 z2Var) {
        long jH0 = z2Var.h0();
        if (jH0 >= 0) {
            this.f14617c.a(z2Var, jH0);
        }
        if (z2Var.r0() || z2Var.s0()) {
            this.f14616b.a(z2Var, this);
        }
    }

    public void a() {
        this.f14617c.a();
        this.f14616b.a();
    }

    @Override // com.applovin.impl.mediation.c.a
    public void a(z2 z2Var) {
        c(z2Var);
    }
}
