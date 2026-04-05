package com.ironsource;

import com.ironsource.AbstractC3279j3;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Uf extends AbstractC3279j3 implements L0, InterfaceC3520x0 {

    /* renamed from: d, reason: collision with root package name */
    private final C3350n0 f35571d;

    /* renamed from: e, reason: collision with root package name */
    private final X2 f35572e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC3315l3 f35573f;

    /* renamed from: g, reason: collision with root package name */
    private final O2 f35574g;

    /* renamed from: h, reason: collision with root package name */
    private C3167cg f35575h;

    /* renamed from: i, reason: collision with root package name */
    private final C3504w1 f35576i;

    /* renamed from: j, reason: collision with root package name */
    private final sg f35577j;

    /* renamed from: k, reason: collision with root package name */
    private final Kb f35578k;

    /* renamed from: l, reason: collision with root package name */
    private a f35579l;

    /* renamed from: m, reason: collision with root package name */
    private a f35580m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f35581n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f35582o;

    /* renamed from: p, reason: collision with root package name */
    private C3435s0 f35583p;

    /* renamed from: q, reason: collision with root package name */
    private IronSourceError f35584q;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class a {

        /* renamed from: a, reason: collision with root package name */
        private final M2 f35585a;

        /* renamed from: b, reason: collision with root package name */
        public C3435s0 f35586b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f35587c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Uf f35588d;

        public a(Uf uf2, O2 bannerAdUnitFactory, boolean z10) {
            kotlin.jvm.internal.e0.checkNotNullParameter(bannerAdUnitFactory, "bannerAdUnitFactory");
            this.f35588d = uf2;
            this.f35585a = bannerAdUnitFactory.a(z10);
            this.f35587c = true;
        }

        public final C3435s0 a() {
            C3435s0 c3435s0 = this.f35586b;
            if (c3435s0 != null) {
                return c3435s0;
            }
            kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("adUnitCallback");
            return null;
        }

        public final M2 b() {
            return this.f35585a;
        }

        public final boolean c() {
            return this.f35587c;
        }

        public final boolean d() {
            return this.f35585a.d().a();
        }

        public final void e() {
            this.f35585a.a((L0) this.f35588d);
        }

        public final void a(C3435s0 c3435s0) {
            kotlin.jvm.internal.e0.checkNotNullParameter(c3435s0, "<set-?>");
            this.f35586b = c3435s0;
        }

        public final void b(boolean z10) {
            this.f35587c = z10;
        }

        public final void a(boolean z10) {
            this.f35585a.a(z10);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Uf(C3350n0 adTools, X2 bannerContainer, AbstractC3279j3.b config, K2 bannerAdProperties, InterfaceC3315l3 bannerStrategyListener, O2 bannerAdUnitFactory) {
        super(config, bannerAdProperties);
        kotlin.jvm.internal.e0.checkNotNullParameter(adTools, "adTools");
        kotlin.jvm.internal.e0.checkNotNullParameter(bannerContainer, "bannerContainer");
        kotlin.jvm.internal.e0.checkNotNullParameter(config, "config");
        kotlin.jvm.internal.e0.checkNotNullParameter(bannerAdProperties, "bannerAdProperties");
        kotlin.jvm.internal.e0.checkNotNullParameter(bannerStrategyListener, "bannerStrategyListener");
        kotlin.jvm.internal.e0.checkNotNullParameter(bannerAdUnitFactory, "bannerAdUnitFactory");
        this.f35571d = adTools;
        this.f35572e = bannerContainer;
        this.f35573f = bannerStrategyListener;
        this.f35574g = bannerAdUnitFactory;
        IronLog.INTERNAL.verbose(C3350n0.a(adTools, "refresh interval: " + g() + ", auto refresh: " + h(), (String) null, 2, (Object) null));
        this.f35576i = new C3504w1(adTools.b());
        this.f35577j = new sg(bannerContainer);
        this.f35578k = new Kb(h() ^ true);
        this.f35580m = new a(this, bannerAdUnitFactory, true);
        this.f35582o = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Uf this$0) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        this$0.f35581n = true;
        if (this$0.f35580m.d()) {
            this$0.l();
        } else {
            if (this$0.f35580m.c()) {
                return;
            }
            this$0.i();
            this$0.a(this$0.f35576i, this$0.f35578k);
        }
    }

    private final void k() {
        this.f35573f.d(this.f35584q);
        this.f35583p = null;
        this.f35584q = null;
    }

    private final void l() {
        this.f35582o = false;
        this.f35580m.b().a(this.f35572e.getViewBinder(), this);
        this.f35573f.c(this.f35580m.a());
        a aVar = this.f35579l;
        if (aVar != null) {
            aVar.a(false);
        }
        this.f35579l = this.f35580m;
        i();
        a(this.f35577j, this.f35576i, this.f35578k);
    }

    @Override // com.ironsource.AbstractC3279j3
    public void b() {
        this.f35580m.e();
    }

    @Override // com.ironsource.InterfaceC3520x0
    public void c(IronSourceError ironSourceError) {
        this.f35573f.f(ironSourceError);
    }

    @Override // com.ironsource.AbstractC3279j3
    public void d() {
        if (h()) {
            this.f35578k.e();
        }
    }

    @Override // com.ironsource.AbstractC3279j3
    public void e() {
        if (h()) {
            this.f35578k.f();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Uf this$0) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        this$0.j();
    }

    private final void i() {
        if (h()) {
            a aVar = new a(this, this.f35574g, false);
            this.f35580m = aVar;
            aVar.e();
        }
    }

    private final void j() {
        this.f35571d.a(new rh(this, 0));
    }

    @Override // com.ironsource.AbstractC3279j3
    public void c() {
        this.f35576i.e();
        this.f35577j.e();
        C3167cg c3167cg = this.f35575h;
        if (c3167cg != null) {
            c3167cg.c();
        }
        this.f35575h = null;
        a aVar = this.f35579l;
        if (aVar != null) {
            aVar.a(true);
        }
        this.f35580m.a(true);
    }

    @Override // com.ironsource.InterfaceC3520x0
    public void f() {
        this.f35573f.h();
    }

    private final void a(AbstractC3236gd... abstractC3236gdArr) {
        this.f35581n = false;
        this.f35571d.c(new gi(12, this, abstractC3236gdArr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Uf this$0, AbstractC3236gd[] triggers) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.e0.checkNotNullParameter(triggers, "$triggers");
        C3167cg c3167cg = this$0.f35575h;
        if (c3167cg != null) {
            c3167cg.c();
        }
        this$0.f35575h = new C3167cg(this$0.f35571d, new rh(this$0, 1), this$0.g(), uu.k0.toList(triggers));
    }

    @Override // com.ironsource.L0
    public void a(C3435s0 adUnitCallback) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adUnitCallback, "adUnitCallback");
        this.f35580m.a(adUnitCallback);
        this.f35580m.b(false);
        if (this.f35581n || this.f35582o) {
            l();
        }
    }

    @Override // com.ironsource.L0
    public void a(IronSourceError ironSourceError) {
        this.f35580m.b(false);
        this.f35584q = ironSourceError;
        if (this.f35582o) {
            k();
            a(this.f35576i, this.f35578k);
        } else if (this.f35581n) {
            k();
            i();
            a(this.f35576i, this.f35578k);
        }
    }
}
