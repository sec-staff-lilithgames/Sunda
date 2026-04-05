package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Ja implements Qa {

    /* renamed from: a, reason: collision with root package name */
    private final Ga f34708a;

    public Ja(Ga strategy) {
        kotlin.jvm.internal.e0.checkNotNullParameter(strategy, "strategy");
        this.f34708a = strategy;
    }

    @Override // com.ironsource.L0
    public void a(C3435s0 adUnitCallback) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adUnitCallback, "adUnitCallback");
        this.f34708a.a("Received load success on a destroyed ad");
    }

    @Override // com.ironsource.Qa
    public void b() {
        this.f34708a.a("Loading a destroyed ad");
    }

    @Override // com.ironsource.Qa
    public void c() {
        this.f34708a.a("Destroying a destroyed ad");
    }

    @Override // com.ironsource.Qa
    public void d() {
        this.f34708a.a("Pausing auto refresh on a destroyed ad");
    }

    @Override // com.ironsource.Qa
    public void e() {
        this.f34708a.a("Resuming auto refresh on a destroyed ad");
    }

    @Override // com.ironsource.L0
    public void a(IronSourceError ironSourceError) {
        this.f34708a.a("Received load failed on a destroyed ad");
    }
}
