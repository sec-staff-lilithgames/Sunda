package com.ironsource;

import com.ironsource.AbstractC3297k3;
import com.ironsource.InterfaceC3396pb;
import com.ironsource.InterfaceC3501vf;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Na implements Qa {

    /* renamed from: a, reason: collision with root package name */
    private final Ga f35055a;

    /* renamed from: b, reason: collision with root package name */
    private final M2 f35056b;

    /* renamed from: c, reason: collision with root package name */
    private final M2 f35057c;

    /* renamed from: d, reason: collision with root package name */
    private final long f35058d;

    /* renamed from: e, reason: collision with root package name */
    private InterfaceC3396pb<LevelPlayAdInfo> f35059e;

    /* renamed from: f, reason: collision with root package name */
    private InterfaceC3501vf.a f35060f;

    public Na(Ga strategy, M2 currentAdUnit, M2 reloadingAdUnit, long j10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(strategy, "strategy");
        kotlin.jvm.internal.e0.checkNotNullParameter(currentAdUnit, "currentAdUnit");
        kotlin.jvm.internal.e0.checkNotNullParameter(reloadingAdUnit, "reloadingAdUnit");
        this.f35055a = strategy;
        this.f35056b = currentAdUnit;
        this.f35057c = reloadingAdUnit;
        this.f35058d = j10;
        g();
    }

    private final void f() {
        InterfaceC3396pb<LevelPlayAdInfo> interfaceC3396pb = this.f35059e;
        if (interfaceC3396pb == null) {
            Ga ga2 = this.f35055a;
            ga2.a((Qa) new Pa(ga2, this.f35056b, this.f35057c, this.f35058d));
        } else if (interfaceC3396pb instanceof InterfaceC3396pb.b) {
            a((LevelPlayAdInfo) ((InterfaceC3396pb.b) interfaceC3396pb).b());
        } else if (interfaceC3396pb instanceof InterfaceC3396pb.a) {
            b(((InterfaceC3396pb.a) interfaceC3396pb).b());
        }
    }

    private final void g() {
        InterfaceC3501vf interfaceC3501vfO = this.f35055a.o();
        ch chVar = new ch(this, 3);
        tv.e eVar = tv.f.f87433c;
        this.f35060f = interfaceC3501vfO.a(chVar, tv.h.toDuration(this.f35055a.l(), tv.i.f87441f));
    }

    @Override // com.ironsource.L0
    public void a(C3435s0 adUnitCallback) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adUnitCallback, "adUnitCallback");
        LevelPlayAdInfo levelPlayAdInfoC = adUnitCallback.c();
        if (levelPlayAdInfoC != null) {
            a(new InterfaceC3396pb.b(levelPlayAdInfoC));
        } else {
            a(new InterfaceC3396pb.a(new IronSourceError(0, "Missing ad info")));
        }
    }

    @Override // com.ironsource.Qa
    public void c() {
        InterfaceC3501vf.a aVar = this.f35060f;
        if (aVar != null) {
            aVar.a();
        }
        this.f35056b.a(true);
        this.f35057c.a(true);
        Ga ga2 = this.f35055a;
        ga2.a((Qa) new Ja(ga2));
    }

    @Override // com.ironsource.Qa
    public void d() {
        InterfaceC3501vf.a aVar = this.f35060f;
        if (aVar != null) {
            aVar.a();
        }
        Ga ga2 = this.f35055a;
        ga2.a((Qa) new Ma(ga2, this.f35056b));
    }

    @Override // com.ironsource.Qa
    public void e() {
        Ga ga2 = this.f35055a;
        ga2.a((Qa) new Na(ga2, this.f35056b, this.f35057c, ga2.p().a()));
    }

    @Override // com.ironsource.Qa
    public void b() {
        this.f35055a.a("Loading an ad while reloading");
    }

    private final void b(IronSourceError ironSourceError) {
        this.f35055a.a(ironSourceError, this.f35056b, (AbstractC3297k3) new AbstractC3297k3.c(this.f35055a.p().a() - this.f35058d, AbstractC3297k3.d.g.f37068a), true, false, Long.valueOf(this.f35058d));
    }

    @Override // com.ironsource.L0
    public void a(IronSourceError ironSourceError) {
        if (ironSourceError == null) {
            ironSourceError = new IronSourceError(0, "Unknown error");
        }
        a(new InterfaceC3396pb.a(ironSourceError));
    }

    private final void a(LevelPlayAdInfo levelPlayAdInfo) {
        long jA = this.f35055a.p().a() - this.f35058d;
        this.f35055a.a(new C3435s0(this.f35057c, levelPlayAdInfo), this.f35057c, this.f35056b, (AbstractC3297k3) new AbstractC3297k3.c(jA, AbstractC3297k3.d.h.f37069a), false, Long.valueOf(this.f35058d));
    }

    private final void a(InterfaceC3396pb<LevelPlayAdInfo> interfaceC3396pb) {
        if (this.f35059e != null) {
            this.f35055a.a("Received excessive load " + Oa.b(interfaceC3396pb) + " while reloading");
            return;
        }
        this.f35059e = interfaceC3396pb;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Na this$0) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        this$0.f();
    }
}
