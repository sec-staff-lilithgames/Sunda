package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Va implements Xa {

    /* renamed from: a, reason: collision with root package name */
    private final Sa f35644a;

    /* renamed from: b, reason: collision with root package name */
    private final M2 f35645b;

    public Va(Sa strategy, M2 adUnit) {
        kotlin.jvm.internal.e0.checkNotNullParameter(strategy, "strategy");
        kotlin.jvm.internal.e0.checkNotNullParameter(adUnit, "adUnit");
        this.f35644a = strategy;
        this.f35645b = adUnit;
    }

    @Override // com.ironsource.Xa
    public void a(C3435s0 adUnitCallback) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adUnitCallback, "adUnitCallback");
        this.f35644a.a("Ad unit is already loaded");
    }

    @Override // com.ironsource.Xa
    public void b() {
        this.f35644a.a("Loading a loaded ad");
    }

    @Override // com.ironsource.Xa
    public void c() {
        this.f35645b.a(true);
        this.f35644a.a((M2) null);
        Sa sa2 = this.f35644a;
        sa2.a(new Ua(sa2));
    }

    @Override // com.ironsource.Xa
    public void a(IronSourceError ironSourceError) {
        this.f35644a.a("Ad unit is already loaded");
    }
}
