package com.ironsource;

import com.ironsource.AbstractC3297k3;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Ma implements Qa {

    /* renamed from: a, reason: collision with root package name */
    private final Ga f34854a;

    /* renamed from: b, reason: collision with root package name */
    private final M2 f34855b;

    public Ma(Ga strategy, M2 currentAdUnit) {
        kotlin.jvm.internal.e0.checkNotNullParameter(strategy, "strategy");
        kotlin.jvm.internal.e0.checkNotNullParameter(currentAdUnit, "currentAdUnit");
        this.f34854a = strategy;
        this.f34855b = currentAdUnit;
    }

    @Override // com.ironsource.L0
    public void a(C3435s0 adUnitCallback) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adUnitCallback, "adUnitCallback");
        this.f34854a.a("Received load success while paused");
    }

    @Override // com.ironsource.Qa
    public void b() {
        this.f34854a.a("Loading a loaded ad");
    }

    @Override // com.ironsource.Qa
    public void c() {
        this.f34855b.a(true);
        Ga ga2 = this.f34854a;
        ga2.a((Qa) new Ja(ga2));
    }

    @Override // com.ironsource.Qa
    public void e() {
        this.f34854a.a(this.f34855b, new AbstractC3297k3.a(AbstractC3297k3.b.c.f37059a));
    }

    @Override // com.ironsource.L0
    public void a(IronSourceError ironSourceError) {
        this.f34854a.a("Received load failed while paused");
    }

    @Override // com.ironsource.Qa
    public void d() {
    }
}
