package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Ia implements Qa {

    /* renamed from: a, reason: collision with root package name */
    private final Ga f34670a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f34671b;

    public Ia(Ga strategy, boolean z10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(strategy, "strategy");
        this.f34670a = strategy;
        this.f34671b = z10;
    }

    @Override // com.ironsource.L0
    public void a(C3435s0 adUnitCallback) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adUnitCallback, "adUnitCallback");
        this.f34670a.a("Received load success before load");
    }

    @Override // com.ironsource.Qa
    public void b() {
        M2 m2A = this.f34670a.j().a(true);
        m2A.a(this.f34670a.g());
        this.f34670a.a((Qa) new La(this.f34670a, m2A, this.f34671b));
    }

    @Override // com.ironsource.Qa
    public void c() {
        Ga ga2 = this.f34670a;
        ga2.a((Qa) new Ja(ga2));
    }

    @Override // com.ironsource.Qa
    public void d() {
        this.f34671b = true;
    }

    @Override // com.ironsource.Qa
    public void e() {
        this.f34671b = false;
    }

    @Override // com.ironsource.L0
    public void a(IronSourceError ironSourceError) {
        this.f34670a.a("Received load failed before load");
    }

    public /* synthetic */ Ia(Ga ga2, boolean z10, int i10, kotlin.jvm.internal.u uVar) {
        this(ga2, (i10 & 2) != 0 ? false : z10);
    }
}
