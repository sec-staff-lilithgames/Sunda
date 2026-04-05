package com.ironsource;

import com.ironsource.AbstractC3297k3;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Pa implements Qa {

    /* renamed from: a, reason: collision with root package name */
    private final Ga f35185a;

    /* renamed from: b, reason: collision with root package name */
    private final M2 f35186b;

    /* renamed from: c, reason: collision with root package name */
    private final M2 f35187c;

    /* renamed from: d, reason: collision with root package name */
    private final long f35188d;

    public Pa(Ga strategy, M2 currentAdUnit, M2 reloadingAdUnit, long j10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(strategy, "strategy");
        kotlin.jvm.internal.e0.checkNotNullParameter(currentAdUnit, "currentAdUnit");
        kotlin.jvm.internal.e0.checkNotNullParameter(reloadingAdUnit, "reloadingAdUnit");
        this.f35185a = strategy;
        this.f35186b = currentAdUnit;
        this.f35187c = reloadingAdUnit;
        this.f35188d = j10;
    }

    @Override // com.ironsource.L0
    public void a(C3435s0 adUnitCallback) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adUnitCallback, "adUnitCallback");
        this.f35185a.a(adUnitCallback, this.f35187c, this.f35186b, (AbstractC3297k3) new AbstractC3297k3.c(this.f35185a.p().a() - this.f35188d, AbstractC3297k3.d.C0231d.f37065a), false, Long.valueOf(this.f35188d));
    }

    @Override // com.ironsource.Qa
    public void b() {
        this.f35185a.a("Loading an ad while reloading after timer finished");
    }

    @Override // com.ironsource.Qa
    public void c() {
        this.f35186b.a(true);
        this.f35187c.a(true);
        Ga ga2 = this.f35185a;
        ga2.a((Qa) new Ja(ga2));
    }

    @Override // com.ironsource.Qa
    public void d() {
        Ga ga2 = this.f35185a;
        ga2.a((Qa) new Ma(ga2, this.f35186b));
    }

    @Override // com.ironsource.L0
    public void a(IronSourceError ironSourceError) {
        this.f35185a.a(ironSourceError, this.f35186b, (AbstractC3297k3) new AbstractC3297k3.c(this.f35185a.p().a() - this.f35188d, AbstractC3297k3.d.c.f37064a), true, false, Long.valueOf(this.f35188d));
    }

    @Override // com.ironsource.Qa
    public void e() {
    }
}
