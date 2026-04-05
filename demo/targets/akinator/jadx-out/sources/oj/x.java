package oj;

import pj.c0;
import pj.f0;
import pj.j0;
import pj.l0;
import pj.p0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public pj.w f79464a;

    /* renamed from: b, reason: collision with root package name */
    public l0 f79465b;

    /* renamed from: c, reason: collision with root package name */
    public pj.n f79466c;

    /* renamed from: d, reason: collision with root package name */
    public pj.u f79467d;

    /* renamed from: e, reason: collision with root package name */
    public c0 f79468e;

    /* renamed from: f, reason: collision with root package name */
    public pj.a f79469f;

    /* renamed from: g, reason: collision with root package name */
    public f0 f79470g;

    /* renamed from: h, reason: collision with root package name */
    public p0 f79471h;

    /* renamed from: i, reason: collision with root package name */
    public j0 f79472i;

    /* renamed from: j, reason: collision with root package name */
    public pj.k f79473j;

    /* renamed from: k, reason: collision with root package name */
    public pj.q f79474k;

    public x analyticsEventsModule(pj.a aVar) {
        this.f79469f = (pj.a) dj.d.checkNotNull(aVar);
        return this;
    }

    public x appMeasurementModule(pj.k kVar) {
        this.f79473j = (pj.k) dj.d.checkNotNull(kVar);
        return this;
    }

    public x applicationModule(pj.n nVar) {
        this.f79466c = (pj.n) dj.d.checkNotNull(nVar);
        return this;
    }

    public a0 build() {
        if (this.f79464a == null) {
            this.f79464a = new pj.w();
        }
        if (this.f79465b == null) {
            this.f79465b = new l0();
        }
        dj.d.checkBuilderRequirement(this.f79466c, pj.n.class);
        if (this.f79467d == null) {
            this.f79467d = new pj.u();
        }
        dj.d.checkBuilderRequirement(this.f79468e, c0.class);
        if (this.f79469f == null) {
            this.f79469f = new pj.a();
        }
        if (this.f79470g == null) {
            this.f79470g = new f0();
        }
        if (this.f79471h == null) {
            this.f79471h = new p0();
        }
        if (this.f79472i == null) {
            this.f79472i = new j0();
        }
        dj.d.checkBuilderRequirement(this.f79473j, pj.k.class);
        dj.d.checkBuilderRequirement(this.f79474k, pj.q.class);
        return new y(this.f79464a, this.f79465b, this.f79466c, this.f79467d, this.f79468e, this.f79469f, this.f79470g, this.f79471h, this.f79472i, this.f79473j, this.f79474k);
    }

    public x executorsModule(pj.q qVar) {
        this.f79474k = (pj.q) dj.d.checkNotNull(qVar);
        return this;
    }

    public x foregroundFlowableModule(pj.u uVar) {
        this.f79467d = (pj.u) dj.d.checkNotNull(uVar);
        return this;
    }

    public x grpcChannelModule(pj.w wVar) {
        this.f79464a = (pj.w) dj.d.checkNotNull(wVar);
        return this;
    }

    public x programmaticContextualTriggerFlowableModule(c0 c0Var) {
        this.f79468e = (c0) dj.d.checkNotNull(c0Var);
        return this;
    }

    public x protoStorageClientModule(f0 f0Var) {
        this.f79470g = (f0) dj.d.checkNotNull(f0Var);
        return this;
    }

    public x rateLimitModule(j0 j0Var) {
        this.f79472i = (j0) dj.d.checkNotNull(j0Var);
        return this;
    }

    public x schedulerModule(l0 l0Var) {
        this.f79465b = (l0) dj.d.checkNotNull(l0Var);
        return this;
    }

    public x systemClockModule(p0 p0Var) {
        this.f79471h = (p0) dj.d.checkNotNull(p0Var);
        return this;
    }
}
