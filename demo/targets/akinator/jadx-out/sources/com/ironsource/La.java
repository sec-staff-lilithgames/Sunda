package com.ironsource;

import com.ironsource.AbstractC3297k3;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class La implements Qa {

    /* renamed from: a, reason: collision with root package name */
    private final Ga f34802a;

    /* renamed from: b, reason: collision with root package name */
    private final M2 f34803b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f34804c;

    public La(Ga strategy, M2 currentAdUnit, boolean z10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(strategy, "strategy");
        kotlin.jvm.internal.e0.checkNotNullParameter(currentAdUnit, "currentAdUnit");
        this.f34802a = strategy;
        this.f34803b = currentAdUnit;
        this.f34804c = z10;
    }

    @Override // com.ironsource.L0
    public void a(C3435s0 adUnitCallback) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adUnitCallback, "adUnitCallback");
        this.f34802a.a(adUnitCallback, this.f34803b, (M2) null, new AbstractC3297k3.a(AbstractC3297k3.b.C0230b.f37058a), this.f34804c, (Long) null);
    }

    @Override // com.ironsource.Qa
    public void b() {
        this.f34802a.a("Loading an ad while loading");
    }

    @Override // com.ironsource.Qa
    public void c() {
        this.f34803b.a(true);
        Ga ga2 = this.f34802a;
        ga2.a((Qa) new Ja(ga2));
    }

    @Override // com.ironsource.Qa
    public void d() {
        this.f34804c = true;
    }

    @Override // com.ironsource.Qa
    public void e() {
        this.f34804c = false;
    }

    @Override // com.ironsource.L0
    public void a(IronSourceError ironSourceError) {
        this.f34802a.a(ironSourceError, this.f34803b, (AbstractC3297k3) new AbstractC3297k3.a(AbstractC3297k3.b.a.f37057a), false, this.f34804c, (Long) null);
    }
}
