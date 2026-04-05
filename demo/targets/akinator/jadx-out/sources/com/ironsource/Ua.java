package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Ua implements Xa {

    /* renamed from: a, reason: collision with root package name */
    private final Sa f35549a;

    public Ua(Sa strategy) {
        kotlin.jvm.internal.e0.checkNotNullParameter(strategy, "strategy");
        this.f35549a = strategy;
    }

    @Override // com.ironsource.Xa
    public void a(C3435s0 adUnitCallback) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adUnitCallback, "adUnitCallback");
        this.f35549a.a("Received load success on a destroyed ad");
    }

    @Override // com.ironsource.Xa
    public void b() {
        this.f35549a.a("Loading a destroyed ad");
    }

    @Override // com.ironsource.Xa
    public void c() {
        this.f35549a.a("Destroying a destroyed ad");
    }

    @Override // com.ironsource.Xa
    public void a(IronSourceError ironSourceError) {
        this.f35549a.a("Received load failed on a destroyed ad");
    }
}
