package com.applovin.impl.mediation;

import com.applovin.impl.g0;
import com.applovin.impl.z2;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f14618a;

    /* renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.o f14619b;

    /* renamed from: c, reason: collision with root package name */
    private final a f14620c;

    /* renamed from: d, reason: collision with root package name */
    private g0 f14621d;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface a {
        void a(z2 z2Var);
    }

    public c(com.applovin.impl.sdk.k kVar, a aVar) {
        this.f14618a = kVar;
        this.f14619b = kVar.O();
        this.f14620c = aVar;
    }

    public void a(z2 z2Var, long j10) {
        if (com.applovin.impl.sdk.o.a()) {
            this.f14619b.a("AdHiddenCallbackTimeoutManager", o2.n(j10, "Scheduling in ", "ms..."));
        }
        this.f14621d = g0.a(j10, this.f14618a, new r(3, this, z2Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(z2 z2Var) {
        if (com.applovin.impl.sdk.o.a()) {
            this.f14619b.a("AdHiddenCallbackTimeoutManager", "Timing out...");
        }
        this.f14620c.a(z2Var);
    }

    public void a() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f14619b.a("AdHiddenCallbackTimeoutManager", "Cancelling timeout");
        }
        g0 g0Var = this.f14621d;
        if (g0Var != null) {
            g0Var.a();
            this.f14621d = null;
        }
    }
}
