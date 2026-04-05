package com.ironsource;

import android.graphics.Rect;
import com.ironsource.AbstractC3297k3;
import com.ironsource.InterfaceC3501vf;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Ka implements Qa {

    /* renamed from: a, reason: collision with root package name */
    private final Ga f34755a;

    /* renamed from: b, reason: collision with root package name */
    private final M2 f34756b;

    /* renamed from: c, reason: collision with root package name */
    private final Long f34757c;

    /* renamed from: d, reason: collision with root package name */
    private InterfaceC3501vf.a f34758d;

    /* renamed from: e, reason: collision with root package name */
    private final long f34759e;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends kotlin.jvm.internal.f0 implements kv.a {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AbstractC3297k3.c f34761b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f34762c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC3297k3.c cVar, long j10) {
            super(0);
            this.f34761b = cVar;
            this.f34762c = j10;
        }

        public final void a() {
            Ka.this.f34755a.a(Ka.this.f34756b, this.f34761b, Long.valueOf(this.f34762c));
        }

        @Override // kv.a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return tu.x0.f87415a;
        }
    }

    public Ka(Ga strategy, M2 currentAdUnit, Long l9) {
        kotlin.jvm.internal.e0.checkNotNullParameter(strategy, "strategy");
        kotlin.jvm.internal.e0.checkNotNullParameter(currentAdUnit, "currentAdUnit");
        this.f34755a = strategy;
        this.f34756b = currentAdUnit;
        this.f34757c = l9;
        this.f34759e = strategy.p().a();
        strategy.r();
        f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(Ka this$0) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        C3514wb.a(this$0.f34755a.a(), new jh(this$0, 1), 0L, 2, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(Ka this$0) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        if (!vg.a(this$0.f34755a.k(), new Rect())) {
            this$0.f();
            return;
        }
        long jA = this$0.f34755a.p().a();
        long j10 = jA - this$0.f34759e;
        Long l9 = this$0.f34757c;
        C3514wb.a((C3514wb) this$0.f34755a.a(), AbstractRunnableC3273ie.f36945a.a(this$0.new a(new AbstractC3297k3.c(l9 != null ? jA - l9.longValue() : 0L, new AbstractC3297k3.d.f(j10)), jA)), 0L, 2, (Object) null);
    }

    private final void f() {
        long jQ = this.f34755a.q();
        InterfaceC3501vf interfaceC3501vfO = this.f34755a.o();
        jh jhVar = new jh(this, 0);
        tv.e eVar = tv.f.f87433c;
        this.f34758d = interfaceC3501vfO.a(jhVar, tv.h.toDuration(jQ, tv.i.f87441f));
    }

    @Override // com.ironsource.L0
    public void a(C3435s0 adUnitCallback) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adUnitCallback, "adUnitCallback");
        this.f34755a.a("Received load success while paused not visible");
    }

    @Override // com.ironsource.Qa
    public void b() {
        this.f34755a.a("Loading a loaded ad");
    }

    @Override // com.ironsource.Qa
    public void c() {
        InterfaceC3501vf.a aVar = this.f34758d;
        if (aVar != null) {
            aVar.a();
        }
        this.f34756b.a(true);
        Ga ga2 = this.f34755a;
        ga2.a((Qa) new Ja(ga2));
    }

    @Override // com.ironsource.Qa
    public void e() {
    }

    @Override // com.ironsource.L0
    public void a(IronSourceError ironSourceError) {
        this.f34755a.a("Received load success while paused not visible");
    }

    @Override // com.ironsource.Qa
    public void d() {
        InterfaceC3501vf.a aVar = this.f34758d;
        if (aVar != null) {
            aVar.a();
        }
        Ga ga2 = this.f34755a;
        ga2.a((Qa) new Ma(ga2, this.f34756b));
    }
}
