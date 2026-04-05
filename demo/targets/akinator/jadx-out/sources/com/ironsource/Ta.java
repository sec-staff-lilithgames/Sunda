package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Ta implements Xa {

    /* renamed from: a, reason: collision with root package name */
    private final Sa f35493a;

    public Ta(Sa strategy) {
        kotlin.jvm.internal.e0.checkNotNullParameter(strategy, "strategy");
        this.f35493a = strategy;
    }

    @Override // com.ironsource.Xa
    public void a(C3435s0 adUnitCallback) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adUnitCallback, "adUnitCallback");
        this.f35493a.a("Received load success before load called");
    }

    @Override // com.ironsource.Xa
    public void b() {
        M2 m2A = this.f35493a.i().a(true);
        this.f35493a.a(m2A);
        Sa sa2 = this.f35493a;
        sa2.a(new Wa(sa2, m2A));
        m2A.a(this.f35493a.g());
    }

    @Override // com.ironsource.Xa
    public void c() {
        M2 m2K = this.f35493a.k();
        if (m2K != null) {
            m2K.a(false);
        }
        this.f35493a.a((M2) null);
        Sa sa2 = this.f35493a;
        sa2.a(new Ua(sa2));
    }

    @Override // com.ironsource.Xa
    public void a(IronSourceError ironSourceError) {
        this.f35493a.a("Received load failed before load called");
    }
}
