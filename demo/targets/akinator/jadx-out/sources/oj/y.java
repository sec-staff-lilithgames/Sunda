package oj;

import android.app.Application;
import java.util.concurrent.Executor;
import nj.e1;
import nj.f1;
import nj.g1;
import nj.h1;
import nj.r0;
import nj.s0;
import pj.c0;
import pj.d0;
import pj.e0;
import pj.f0;
import pj.g0;
import pj.h0;
import pj.i0;
import pj.j0;
import pj.k0;
import pj.l0;
import pj.m0;
import pj.n0;
import pj.o0;
import pj.p0;
import pj.q0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class y implements a0 {

    /* renamed from: a, reason: collision with root package name */
    public final p0 f79475a;

    /* renamed from: b, reason: collision with root package name */
    public final j0 f79476b;

    /* renamed from: c, reason: collision with root package name */
    public final dj.e f79477c;

    /* renamed from: d, reason: collision with root package name */
    public final dj.e f79478d;

    /* renamed from: e, reason: collision with root package name */
    public final dj.e f79479e;

    /* renamed from: f, reason: collision with root package name */
    public final dj.e f79480f;

    /* renamed from: g, reason: collision with root package name */
    public final dj.e f79481g;

    /* renamed from: h, reason: collision with root package name */
    public final dj.e f79482h;

    /* renamed from: i, reason: collision with root package name */
    public final dj.e f79483i;

    /* renamed from: j, reason: collision with root package name */
    public final dj.e f79484j;

    /* renamed from: k, reason: collision with root package name */
    public final dj.e f79485k;

    /* renamed from: l, reason: collision with root package name */
    public final dj.e f79486l;

    /* renamed from: m, reason: collision with root package name */
    public final dj.e f79487m;

    /* renamed from: n, reason: collision with root package name */
    public final dj.e f79488n;

    /* renamed from: o, reason: collision with root package name */
    public final dj.e f79489o;

    /* renamed from: p, reason: collision with root package name */
    public final dj.e f79490p;

    /* renamed from: q, reason: collision with root package name */
    public final q0 f79491q;

    /* renamed from: r, reason: collision with root package name */
    public final dj.e f79492r;

    /* renamed from: s, reason: collision with root package name */
    public final dj.e f79493s;

    /* renamed from: t, reason: collision with root package name */
    public final dj.e f79494t;

    /* renamed from: u, reason: collision with root package name */
    public final dj.e f79495u;

    /* renamed from: v, reason: collision with root package name */
    public final dj.e f79496v;

    /* renamed from: w, reason: collision with root package name */
    public final dj.e f79497w;

    /* renamed from: x, reason: collision with root package name */
    public final dj.e f79498x;

    public y(pj.w wVar, l0 l0Var, pj.n nVar, pj.u uVar, c0 c0Var, pj.a aVar, f0 f0Var, p0 p0Var, j0 j0Var, pj.k kVar, pj.q qVar) {
        this.f79475a = p0Var;
        this.f79476b = j0Var;
        dj.e eVarProvider = dj.a.provider(pj.p.create(nVar));
        this.f79477c = eVarProvider;
        this.f79478d = dj.a.provider(s0.create(eVarProvider));
        this.f79479e = dj.a.provider(pj.x.create(wVar, dj.a.provider(pj.y.create(wVar))));
        this.f79480f = dj.a.provider(n0.create(l0Var));
        this.f79481g = dj.a.provider(m0.create(l0Var));
        this.f79482h = dj.a.provider(h1.create(this.f79480f, this.f79481g, dj.a.provider(o0.create(l0Var))));
        this.f79483i = dj.a.provider(pj.v.create(uVar, this.f79477c));
        this.f79484j = dj.a.provider(d0.create(c0Var));
        this.f79485k = dj.a.provider(e0.create(c0Var));
        dj.e eVarProvider2 = dj.a.provider(pj.l.create(kVar));
        this.f79486l = eVarProvider2;
        dj.e eVarProvider3 = dj.a.provider(pj.c.create(aVar, eVarProvider2));
        this.f79487m = eVarProvider3;
        this.f79488n = dj.a.provider(pj.b.create(aVar, eVarProvider3));
        this.f79489o = dj.a.provider(pj.m.create(kVar));
        this.f79490p = dj.a.provider(g0.create(f0Var, this.f79477c));
        q0 q0VarCreate = q0.create(p0Var);
        this.f79491q = q0VarCreate;
        this.f79492r = dj.a.provider(nj.i.create(this.f79490p, this.f79477c, q0VarCreate));
        this.f79493s = dj.a.provider(nj.a0.create(dj.a.provider(h0.create(f0Var, this.f79477c))));
        this.f79494t = dj.a.provider(rj.u.create());
        this.f79495u = dj.a.provider(f1.create(dj.a.provider(i0.create(f0Var, this.f79477c)), this.f79491q));
        this.f79496v = dj.a.provider(pj.o.create(nVar, dj.a.provider(pj.r.create(qVar))));
        this.f79497w = dj.a.provider(pj.t.create(qVar));
        this.f79498x = dj.a.provider(pj.s.create(qVar));
    }

    @Override // oj.a0
    public yh.d analyticsConnector() {
        return (yh.d) this.f79486l.get();
    }

    @Override // oj.a0
    public rt.a analyticsEventsFlowable() {
        return (rt.a) this.f79488n.get();
    }

    @Override // oj.a0
    public nj.c analyticsEventsManager() {
        return (nj.c) this.f79487m.get();
    }

    @Override // oj.a0
    public rt.a appForegroundEventFlowable() {
        return (rt.a) this.f79483i.get();
    }

    @Override // oj.a0
    public rj.v appForegroundRateLimit() {
        return k0.providesAppForegroundRateLimit(this.f79476b);
    }

    @Override // oj.a0
    public Application application() {
        return (Application) this.f79477c.get();
    }

    @Override // oj.a0
    public Executor blockingExecutor() {
        return (Executor) this.f79498x.get();
    }

    @Override // oj.a0
    public nj.h campaignCacheClient() {
        return (nj.h) this.f79492r.get();
    }

    @Override // oj.a0
    public qj.a clock() {
        return q0.providesSystemClockModule(this.f79475a);
    }

    @Override // oj.a0
    public nj.k developerListenerManager() {
        return (nj.k) this.f79496v.get();
    }

    @Override // oj.a0
    public yi.d firebaseEventsSubscriber() {
        return (yi.d) this.f79489o.get();
    }

    @Override // oj.a0
    public wr.j gRPCChannel() {
        return (wr.j) this.f79479e.get();
    }

    @Override // oj.a0
    public nj.z impressionStorageClient() {
        return (nj.z) this.f79493s.get();
    }

    @Override // oj.a0
    public Executor lightWeightExecutor() {
        return (Executor) this.f79497w.get();
    }

    @Override // oj.a0
    public rt.a programmaticContextualTriggerFlowable() {
        return (rt.a) this.f79484j.get();
    }

    @Override // oj.a0
    public nj.p0 programmaticContextualTriggers() {
        return (nj.p0) this.f79485k.get();
    }

    @Override // oj.a0
    public rj.s protoMarshallerClient() {
        return (rj.s) this.f79494t.get();
    }

    @Override // oj.a0
    public r0 providerInstaller() {
        return (r0) this.f79478d.get();
    }

    @Override // oj.a0
    public e1 rateLimiterClient() {
        return (e1) this.f79495u.get();
    }

    @Override // oj.a0
    public g1 schedulers() {
        return (g1) this.f79482h.get();
    }
}
