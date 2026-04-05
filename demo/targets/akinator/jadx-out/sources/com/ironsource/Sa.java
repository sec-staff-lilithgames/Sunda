package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Sa implements Ba {

    /* renamed from: a, reason: collision with root package name */
    private final C3350n0 f35447a;

    /* renamed from: b, reason: collision with root package name */
    private final X2 f35448b;

    /* renamed from: c, reason: collision with root package name */
    private final O2 f35449c;

    /* renamed from: d, reason: collision with root package name */
    private Ca f35450d;

    /* renamed from: e, reason: collision with root package name */
    private Xa f35451e;

    /* renamed from: f, reason: collision with root package name */
    private M2 f35452f;

    /* renamed from: g, reason: collision with root package name */
    private final L0 f35453g;

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC3520x0 f35454h;

    /* renamed from: i, reason: collision with root package name */
    private final P2 f35455i;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a implements P2 {
        public a() {
        }

        public void a() {
            Ca caM = Sa.this.m();
            if (caM != null) {
                caM.onAdLeftApplication();
            }
        }

        public void b() {
            Ca caM = Sa.this.m();
            if (caM != null) {
                caM.n();
            }
        }

        public void c() {
            Ca caM = Sa.this.m();
            if (caM != null) {
                caM.l();
            }
        }

        @Override // com.ironsource.J0
        public void g() {
            Ca caM = Sa.this.m();
            if (caM != null) {
                caM.onAdClicked();
            }
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
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b implements L0 {
        public b() {
        }

        @Override // com.ironsource.L0
        public void a(C3435s0 adUnitCallback) {
            kotlin.jvm.internal.e0.checkNotNullParameter(adUnitCallback, "adUnitCallback");
            Sa.this.l().a(adUnitCallback);
        }

        @Override // com.ironsource.L0
        public void a(IronSourceError ironSourceError) {
            Sa.this.l().a(ironSourceError);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c implements InterfaceC3520x0 {
        public c() {
        }

        @Override // com.ironsource.InterfaceC3520x0
        public void c(IronSourceError ironSourceError) {
            Ca caM = Sa.this.m();
            if (caM != null) {
                caM.e(ironSourceError);
            }
        }

        @Override // com.ironsource.InterfaceC3520x0
        public void f() {
            Ca caM = Sa.this.m();
            if (caM != null) {
                caM.k();
            }
        }
    }

    public Sa(C3350n0 adTools, X2 bannerContainer, O2 bannerAdUnitFactory) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adTools, "adTools");
        kotlin.jvm.internal.e0.checkNotNullParameter(bannerContainer, "bannerContainer");
        kotlin.jvm.internal.e0.checkNotNullParameter(bannerAdUnitFactory, "bannerAdUnitFactory");
        this.f35447a = adTools;
        this.f35448b = bannerContainer;
        this.f35449c = bannerAdUnitFactory;
        this.f35451e = new Ta(this);
        this.f35453g = new b();
        this.f35454h = new c();
        this.f35455i = new a();
    }

    public final C3350n0 a() {
        return this.f35447a;
    }

    public final void b(Ca ca2) {
        this.f35450d = ca2;
    }

    @Override // com.ironsource.Ba
    public void c() {
        this.f35451e.c();
    }

    public final P2 f() {
        return this.f35455i;
    }

    public final L0 g() {
        return this.f35453g;
    }

    public final InterfaceC3520x0 h() {
        return this.f35454h;
    }

    public final O2 i() {
        return this.f35449c;
    }

    public final X2 j() {
        return this.f35448b;
    }

    public final M2 k() {
        return this.f35452f;
    }

    public final Xa l() {
        return this.f35451e;
    }

    public final Ca m() {
        return this.f35450d;
    }

    public final void a(Xa xa2) {
        kotlin.jvm.internal.e0.checkNotNullParameter(xa2, "<set-?>");
        this.f35451e = xa2;
    }

    @Override // com.ironsource.Ba
    public void b() {
        this.f35451e.b();
    }

    public final void a(M2 m22) {
        this.f35452f = m22;
    }

    public final void a(String message) {
        kotlin.jvm.internal.e0.checkNotNullParameter(message, "message");
        this.f35447a.e().h().f("Banner Single Ad Unit Strategy - " + message);
    }

    public final void a(C3435s0 adUnitCallback, M2 adUnit) {
        Ca ca2;
        kotlin.jvm.internal.e0.checkNotNullParameter(adUnitCallback, "adUnitCallback");
        kotlin.jvm.internal.e0.checkNotNullParameter(adUnit, "adUnit");
        adUnit.a(this.f35448b.getViewBinder(), this.f35454h);
        LevelPlayAdInfo levelPlayAdInfoC = adUnitCallback.c();
        if (levelPlayAdInfoC == null || (ca2 = this.f35450d) == null) {
            return;
        }
        ca2.onAdLoaded(levelPlayAdInfoC);
    }

    public final void a(IronSourceError ironSourceError) {
        Ca ca2 = this.f35450d;
        if (ca2 != null) {
            ca2.b(ironSourceError);
        }
    }

    @Override // com.ironsource.Ba
    public void a(Ca listener) {
        kotlin.jvm.internal.e0.checkNotNullParameter(listener, "listener");
        this.f35450d = listener;
    }

    @Override // com.ironsource.Ba
    public void d() {
    }

    @Override // com.ironsource.Ba
    public void e() {
    }
}
