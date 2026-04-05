package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
final class Ya implements InterfaceC3315l3, P2 {

    /* renamed from: a, reason: collision with root package name */
    private final Ca f35812a;

    public Ya(Ca listener) {
        kotlin.jvm.internal.e0.checkNotNullParameter(listener, "listener");
        this.f35812a = listener;
    }

    public void a() {
        this.f35812a.onAdLeftApplication();
    }

    public void b() {
        this.f35812a.n();
    }

    @Override // com.ironsource.InterfaceC3315l3
    public void c(C3435s0 adUnitCallback) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adUnitCallback, "adUnitCallback");
        LevelPlayAdInfo levelPlayAdInfoC = adUnitCallback.c();
        if (levelPlayAdInfoC != null) {
            this.f35812a.onAdLoaded(levelPlayAdInfoC);
        }
    }

    @Override // com.ironsource.InterfaceC3315l3
    public void d(IronSourceError ironSourceError) {
        this.f35812a.b(ironSourceError);
    }

    @Override // com.ironsource.InterfaceC3315l3
    public void f(IronSourceError ironSourceError) {
        this.f35812a.e(ironSourceError);
    }

    @Override // com.ironsource.J0
    public void g() {
        this.f35812a.onAdClicked();
    }

    @Override // com.ironsource.InterfaceC3315l3
    public void h() {
        this.f35812a.k();
    }

    @Override // com.ironsource.P2
    public /* bridge */ /* synthetic */ tu.x0 i() {
        a();
        return tu.x0.f87415a;
    }

    @Override // com.ironsource.P2
    public /* bridge */ /* synthetic */ tu.x0 j() {
        c();
        return tu.x0.f87415a;
    }

    @Override // com.ironsource.P2
    public /* bridge */ /* synthetic */ tu.x0 m() {
        b();
        return tu.x0.f87415a;
    }

    public void c() {
        this.f35812a.l();
    }
}
