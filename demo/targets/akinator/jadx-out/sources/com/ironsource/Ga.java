package com.ironsource;

import android.graphics.Rect;
import android.view.ViewTreeObserver;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ads.beta.xyn.RnJusJ;
import com.unity3d.mediation.LevelPlayAdInfo;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Ga implements Ba {

    /* renamed from: a, reason: collision with root package name */
    private final C3350n0 f34504a;

    /* renamed from: b, reason: collision with root package name */
    private final X2 f34505b;

    /* renamed from: c, reason: collision with root package name */
    private final long f34506c;

    /* renamed from: d, reason: collision with root package name */
    private final long f34507d;

    /* renamed from: e, reason: collision with root package name */
    private final K2 f34508e;

    /* renamed from: f, reason: collision with root package name */
    private Ca f34509f;

    /* renamed from: g, reason: collision with root package name */
    private final O2 f34510g;

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC3501vf f34511h;

    /* renamed from: i, reason: collision with root package name */
    private final InterfaceC3456t4 f34512i;

    /* renamed from: j, reason: collision with root package name */
    private L0 f34513j;

    /* renamed from: k, reason: collision with root package name */
    private InterfaceC3520x0 f34514k;

    /* renamed from: l, reason: collision with root package name */
    private P2 f34515l;

    /* renamed from: m, reason: collision with root package name */
    private Qa f34516m;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a implements P2 {
        public a() {
        }

        public void a() {
            Ga.this.n().onAdLeftApplication();
        }

        public void b() {
            Ga.this.n().n();
        }

        public void c() {
            Ga.this.n().l();
        }

        @Override // com.ironsource.J0
        public void g() {
            Ga.this.n().onAdClicked();
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
            Ga.this.m().a(adUnitCallback);
        }

        @Override // com.ironsource.L0
        public void a(IronSourceError ironSourceError) {
            Ga.this.m().a(ironSourceError);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c implements InterfaceC3520x0 {
        public c() {
        }

        @Override // com.ironsource.InterfaceC3520x0
        public void c(IronSourceError ironSourceError) {
            Ga.this.n().e(ironSourceError);
        }

        @Override // com.ironsource.InterfaceC3520x0
        public void f() {
            Ga.this.n().k();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class d extends kotlin.jvm.internal.f0 implements kv.a {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ M2 f34521b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AbstractC3297k3 f34522c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(M2 m22, AbstractC3297k3 abstractC3297k3) {
            super(0);
            this.f34521b = m22;
            this.f34522c = abstractC3297k3;
        }

        public final void a() {
            Ga.this.a(this.f34521b, this.f34522c);
        }

        @Override // kv.a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return tu.x0.f87415a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class e extends kotlin.jvm.internal.f0 implements kv.a {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ M2 f34524b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Long f34525c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(M2 m22, Long l9) {
            super(0);
            this.f34524b = m22;
            this.f34525c = l9;
        }

        public final void a() {
            Ga ga2 = Ga.this;
            ga2.a((Qa) new Ka(ga2, this.f34524b, this.f34525c));
        }

        @Override // kv.a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return tu.x0.f87415a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class f implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ M2 f34527b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AbstractC3297k3 f34528c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Long f34529d;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class a extends kotlin.jvm.internal.f0 implements kv.a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Ga f34530a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ M2 f34531b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ AbstractC3297k3 f34532c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Ga ga2, M2 m22, AbstractC3297k3 abstractC3297k3) {
                super(0);
                this.f34530a = ga2;
                this.f34531b = m22;
                this.f34532c = abstractC3297k3;
            }

            public final void a() {
                this.f34530a.a(this.f34531b, this.f34532c);
            }

            @Override // kv.a
            public /* bridge */ /* synthetic */ Object invoke() {
                a();
                return tu.x0.f87415a;
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class b extends kotlin.jvm.internal.f0 implements kv.a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Ga f34533a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ M2 f34534b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Long f34535c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Ga ga2, M2 m22, Long l9) {
                super(0);
                this.f34533a = ga2;
                this.f34534b = m22;
                this.f34535c = l9;
            }

            public final void a() {
                Ga ga2 = this.f34533a;
                ga2.a((Qa) new Ka(ga2, this.f34534b, this.f34535c));
            }

            @Override // kv.a
            public /* bridge */ /* synthetic */ Object invoke() {
                a();
                return tu.x0.f87415a;
            }
        }

        public f(M2 m22, AbstractC3297k3 abstractC3297k3, Long l9) {
            this.f34527b = m22;
            this.f34528c = abstractC3297k3;
            this.f34529d = l9;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (Ga.this.k().getViewTreeObserver().isAlive()) {
                Ga.this.k().getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
            if (vg.a(Ga.this.k(), new Rect())) {
                C3514wb.a((C3514wb) Ga.this.a(), AbstractRunnableC3273ie.f36945a.a(new a(Ga.this, this.f34527b, this.f34528c)), 0L, 2, (Object) null);
            } else {
                C3514wb.a((C3514wb) Ga.this.a(), AbstractRunnableC3273ie.f36945a.a(new b(Ga.this, this.f34527b, this.f34529d)), 0L, 2, (Object) null);
            }
        }
    }

    public Ga(C3350n0 adTools, X2 bannerContainer, long j10, long j11, K2 bannerAdProperties, Ca strategyListener, O2 bannerAdUnitFactory, InterfaceC3501vf taskScheduler, InterfaceC3456t4 timeProvider) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adTools, "adTools");
        kotlin.jvm.internal.e0.checkNotNullParameter(bannerContainer, "bannerContainer");
        kotlin.jvm.internal.e0.checkNotNullParameter(bannerAdProperties, "bannerAdProperties");
        kotlin.jvm.internal.e0.checkNotNullParameter(strategyListener, "strategyListener");
        kotlin.jvm.internal.e0.checkNotNullParameter(bannerAdUnitFactory, "bannerAdUnitFactory");
        kotlin.jvm.internal.e0.checkNotNullParameter(taskScheduler, "taskScheduler");
        kotlin.jvm.internal.e0.checkNotNullParameter(timeProvider, "timeProvider");
        this.f34504a = adTools;
        this.f34505b = bannerContainer;
        this.f34506c = j10;
        this.f34507d = j11;
        this.f34508e = bannerAdProperties;
        this.f34509f = strategyListener;
        this.f34510g = bannerAdUnitFactory;
        this.f34511h = taskScheduler;
        this.f34512i = timeProvider;
        this.f34513j = new b();
        this.f34514k = new c();
        this.f34515l = new a();
        this.f34516m = new Ia(this, false, 2, null);
    }

    public final C3350n0 a() {
        return this.f34504a;
    }

    @Override // com.ironsource.Ba
    public void c() {
        this.f34516m.c();
    }

    @Override // com.ironsource.Ba
    public void d() {
        this.f34516m.d();
    }

    @Override // com.ironsource.Ba
    public void e() {
        this.f34516m.e();
    }

    public final P2 f() {
        return this.f34515l;
    }

    public final L0 g() {
        return this.f34513j;
    }

    public final InterfaceC3520x0 h() {
        return this.f34514k;
    }

    public final K2 i() {
        return this.f34508e;
    }

    public final O2 j() {
        return this.f34510g;
    }

    public final X2 k() {
        return this.f34505b;
    }

    public final long l() {
        return this.f34506c;
    }

    public final Qa m() {
        return this.f34516m;
    }

    public final Ca n() {
        return this.f34509f;
    }

    public final InterfaceC3501vf o() {
        return this.f34511h;
    }

    public final InterfaceC3456t4 p() {
        return this.f34512i;
    }

    public final long q() {
        return this.f34507d;
    }

    public final void r() {
        this.f34504a.e().h().h("Banner view is not visible");
    }

    public final void a(L0 l02) {
        kotlin.jvm.internal.e0.checkNotNullParameter(l02, "<set-?>");
        this.f34513j = l02;
    }

    public final void b(Ca ca2) {
        kotlin.jvm.internal.e0.checkNotNullParameter(ca2, "<set-?>");
        this.f34509f = ca2;
    }

    public final void a(InterfaceC3520x0 interfaceC3520x0) {
        kotlin.jvm.internal.e0.checkNotNullParameter(interfaceC3520x0, "<set-?>");
        this.f34514k = interfaceC3520x0;
    }

    @Override // com.ironsource.Ba
    public void b() {
        this.f34516m.b();
    }

    public final void a(P2 p22) {
        kotlin.jvm.internal.e0.checkNotNullParameter(p22, "<set-?>");
        this.f34515l = p22;
    }

    public final void a(Qa qa2) {
        kotlin.jvm.internal.e0.checkNotNullParameter(qa2, "<set-?>");
        this.f34516m = qa2;
    }

    public final void a(String message) {
        kotlin.jvm.internal.e0.checkNotNullParameter(message, "message");
        this.f34504a.e().h().f("Banner Reload Strategy - " + message);
    }

    public final void a(C3435s0 adUnitCallback, M2 currentAdUnit, M2 m22, AbstractC3297k3 reloadReason, boolean z10, Long l9) {
        tu.x0 x0Var;
        kotlin.jvm.internal.e0.checkNotNullParameter(adUnitCallback, "adUnitCallback");
        kotlin.jvm.internal.e0.checkNotNullParameter(currentAdUnit, "currentAdUnit");
        kotlin.jvm.internal.e0.checkNotNullParameter(reloadReason, "reloadReason");
        currentAdUnit.a(this.f34505b.getViewBinder(), this.f34514k);
        LevelPlayAdInfo levelPlayAdInfoC = adUnitCallback.c();
        if (levelPlayAdInfoC != null) {
            this.f34509f.onAdLoaded(levelPlayAdInfoC);
            x0Var = tu.x0.f87415a;
        } else {
            x0Var = null;
        }
        if (x0Var == null) {
            IronLog.INTERNAL.error(C3350n0.a(this.f34504a, "adInfo is null in handleLoadSuccess", (String) null, 2, (Object) null));
        }
        if (m22 != null) {
            m22.a(false);
        }
        if (z10) {
            this.f34516m = new Ma(this, currentAdUnit);
        } else {
            a(currentAdUnit, reloadReason, l9);
        }
    }

    public /* synthetic */ Ga(C3350n0 c3350n0, X2 x22, long j10, long j11, K2 k22, Ca ca2, O2 o22, InterfaceC3501vf interfaceC3501vf, InterfaceC3456t4 interfaceC3456t4, int i10, kotlin.jvm.internal.u uVar) {
        this(c3350n0, x22, j10, j11, k22, ca2, o22, (i10 & 128) != 0 ? new W6(X6.a(c3350n0.a())) : interfaceC3501vf, interfaceC3456t4);
    }

    public final void a(IronSourceError ironSourceError, M2 currentAdUnit, AbstractC3297k3 reloadReason, boolean z10, boolean z11, Long l9) {
        kotlin.jvm.internal.e0.checkNotNullParameter(currentAdUnit, "currentAdUnit");
        kotlin.jvm.internal.e0.checkNotNullParameter(reloadReason, "reloadReason");
        this.f34509f.b(ironSourceError);
        if (z11) {
            this.f34516m = new Ma(this, currentAdUnit);
        } else if (z10) {
            a(currentAdUnit, reloadReason, l9);
        } else {
            a(currentAdUnit, reloadReason);
        }
    }

    public final void a(M2 currentAdUnit, AbstractC3297k3 reloadReason, Long l9) {
        kotlin.jvm.internal.e0.checkNotNullParameter(currentAdUnit, "currentAdUnit");
        kotlin.jvm.internal.e0.checkNotNullParameter(reloadReason, "reloadReason");
        C3514wb.a(this.f34504a, new al.a(16, this, currentAdUnit, reloadReason, l9), 0L, 2, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Ga this$0, M2 m22, AbstractC3297k3 reloadReason, Long l9) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.e0.checkNotNullParameter(m22, RnJusJ.CwIx);
        kotlin.jvm.internal.e0.checkNotNullParameter(reloadReason, "$reloadReason");
        if (vg.a(this$0.f34505b, new Rect())) {
            C3514wb.a((C3514wb) this$0.f34504a, AbstractRunnableC3273ie.f36945a.a(this$0.new d(m22, reloadReason)), 0L, 2, (Object) null);
        } else if (!this$0.f34505b.getViewTreeObserver().isAlive()) {
            C3514wb.a((C3514wb) this$0.f34504a, AbstractRunnableC3273ie.f36945a.a(this$0.new e(m22, l9)), 0L, 2, (Object) null);
        } else {
            this$0.f34505b.getViewTreeObserver().addOnGlobalLayoutListener(this$0.new f(m22, reloadReason, l9));
        }
    }

    public final void a(M2 currentAdUnit, AbstractC3297k3 reloadReason) {
        kotlin.jvm.internal.e0.checkNotNullParameter(currentAdUnit, "currentAdUnit");
        kotlin.jvm.internal.e0.checkNotNullParameter(reloadReason, "reloadReason");
        M2 m2A = this.f34510g.a(false);
        Na na2 = new Na(this, currentAdUnit, m2A, this.f34512i.a());
        a(reloadReason);
        this.f34516m = na2;
        m2A.a(this.f34513j);
    }

    private final void a(AbstractC3297k3 abstractC3297k3) {
        this.f34504a.e().h().a(abstractC3297k3.c(), abstractC3297k3.b(), abstractC3297k3.a());
    }

    @Override // com.ironsource.Ba
    public void a(Ca listener) {
        kotlin.jvm.internal.e0.checkNotNullParameter(listener, "listener");
        this.f34509f = listener;
    }
}
