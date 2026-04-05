package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Wa implements Xa {

    /* renamed from: a, reason: collision with root package name */
    private final Sa f35687a;

    /* renamed from: b, reason: collision with root package name */
    private final M2 f35688b;

    public Wa(Sa strategy, M2 adUnit) {
        kotlin.jvm.internal.e0.checkNotNullParameter(strategy, "strategy");
        kotlin.jvm.internal.e0.checkNotNullParameter(adUnit, "adUnit");
        this.f35687a = strategy;
        this.f35688b = adUnit;
    }

    @Override // com.ironsource.Xa
    public void a(C3435s0 adUnitCallback) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adUnitCallback, "adUnitCallback");
        this.f35687a.a(adUnitCallback, this.f35688b);
        Sa sa2 = this.f35687a;
        sa2.a(new Va(sa2, this.f35688b));
    }

    @Override // com.ironsource.Xa
    public void b() {
        this.f35687a.a("Loading an ad while loading");
    }

    @Override // com.ironsource.Xa
    public void c() {
        this.f35688b.a(true);
        this.f35687a.a((M2) null);
        Sa sa2 = this.f35687a;
        sa2.a(new Ua(sa2));
    }

    @Override // com.ironsource.Xa
    public void a(IronSourceError ironSourceError) {
        this.f35687a.a(ironSourceError);
        this.f35688b.a(false);
        this.f35687a.a((M2) null);
        Sa sa2 = this.f35687a;
        sa2.a(new Ua(sa2));
    }
}
