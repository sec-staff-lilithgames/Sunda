package es;

import mh.p1;
import wr.b3;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class i extends c {

    /* renamed from: o, reason: collision with root package name */
    public static final h f55042o = new h();

    /* renamed from: f, reason: collision with root package name */
    public final f f55043f;

    /* renamed from: g, reason: collision with root package name */
    public final b3.c f55044g;

    /* renamed from: h, reason: collision with root package name */
    public b3.a f55045h;

    /* renamed from: i, reason: collision with root package name */
    public b3 f55046i;

    /* renamed from: j, reason: collision with root package name */
    public b3.a f55047j;

    /* renamed from: k, reason: collision with root package name */
    public b3 f55048k;

    /* renamed from: l, reason: collision with root package name */
    public wr.f0 f55049l;

    /* renamed from: m, reason: collision with root package name */
    public b3.f f55050m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f55051n;

    public i(b3.c cVar) {
        f fVar = new f(this);
        this.f55043f = fVar;
        this.f55046i = fVar;
        this.f55048k = fVar;
        this.f55044g = (b3.c) p1.checkNotNull(cVar, "helper");
    }

    @Override // es.c
    public final b3 a() {
        b3 b3Var = this.f55048k;
        return b3Var == this.f55043f ? this.f55046i : b3Var;
    }

    public final void b() {
        this.f55044g.updateBalancingState(this.f55049l, this.f55050m);
        this.f55046i.shutdown();
        this.f55046i = this.f55048k;
        this.f55045h = this.f55047j;
        this.f55048k = this.f55043f;
        this.f55047j = null;
    }

    public String delegateType() {
        return a().getClass().getSimpleName();
    }

    @Override // es.c, wr.b3
    @Deprecated
    public void handleSubchannelState(b3.e eVar, wr.g0 g0Var) {
        throw new UnsupportedOperationException("handleSubchannelState() is not supported by ".concat(i.class.getName()));
    }

    @Override // es.c, wr.b3
    public void shutdown() {
        this.f55048k.shutdown();
        this.f55046i.shutdown();
    }

    public void switchTo(b3.a aVar) {
        p1.checkNotNull(aVar, "newBalancerFactory");
        if (aVar.equals(this.f55047j)) {
            return;
        }
        this.f55048k.shutdown();
        this.f55048k = this.f55043f;
        this.f55047j = null;
        this.f55049l = wr.f0.f90912b;
        this.f55050m = f55042o;
        if (aVar.equals(this.f55045h)) {
            return;
        }
        g gVar = new g(this);
        b3 b3VarNewLoadBalancer = aVar.newLoadBalancer(gVar);
        gVar.f55031a = b3VarNewLoadBalancer;
        this.f55048k = b3VarNewLoadBalancer;
        this.f55047j = aVar;
        if (this.f55051n) {
            return;
        }
        b();
    }
}
