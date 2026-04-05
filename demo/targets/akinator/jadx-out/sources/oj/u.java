package oj;

import bj.e1;
import bj.w0;
import nj.g1;
import nj.h0;
import nj.n0;
import pj.b0;
import pj.r0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class u implements b {

    /* renamed from: a, reason: collision with root package name */
    public final a0 f79435a;

    /* renamed from: b, reason: collision with root package name */
    public final pj.d f79436b;

    /* renamed from: c, reason: collision with root package name */
    public final e f79437c;

    /* renamed from: d, reason: collision with root package name */
    public final p f79438d;

    /* renamed from: e, reason: collision with root package name */
    public final i f79439e;

    /* renamed from: f, reason: collision with root package name */
    public final j f79440f;

    /* renamed from: g, reason: collision with root package name */
    public final m f79441g;

    /* renamed from: h, reason: collision with root package name */
    public final dj.e f79442h;

    /* renamed from: i, reason: collision with root package name */
    public final d f79443i;

    /* renamed from: j, reason: collision with root package name */
    public final t f79444j;

    /* renamed from: k, reason: collision with root package name */
    public final n f79445k;

    /* renamed from: l, reason: collision with root package name */
    public final s f79446l;

    /* renamed from: m, reason: collision with root package name */
    public final f f79447m;

    /* renamed from: n, reason: collision with root package name */
    public final pj.i f79448n;

    /* renamed from: o, reason: collision with root package name */
    public final pj.j f79449o;

    /* renamed from: p, reason: collision with root package name */
    public final pj.h f79450p;

    /* renamed from: q, reason: collision with root package name */
    public final pj.f f79451q;

    /* renamed from: r, reason: collision with root package name */
    public final h f79452r;

    /* renamed from: s, reason: collision with root package name */
    public final dj.e f79453s;

    /* renamed from: t, reason: collision with root package name */
    public final q f79454t;

    /* renamed from: u, reason: collision with root package name */
    public final pj.g f79455u;

    /* renamed from: v, reason: collision with root package name */
    public final k f79456v;

    /* renamed from: w, reason: collision with root package name */
    public final dj.e f79457w;

    /* renamed from: x, reason: collision with root package name */
    public final dj.e f79458x;

    public u(pj.d dVar, pj.z zVar, a0 a0Var, nj.a aVar, jd.l lVar) {
        this.f79435a = a0Var;
        this.f79436b = dVar;
        this.f79437c = new e(a0Var);
        this.f79438d = new p(a0Var);
        this.f79439e = new i(a0Var);
        this.f79440f = new j(a0Var);
        this.f79441g = new m(a0Var);
        this.f79442h = dj.a.provider(pj.e.create(dVar, dj.a.provider(nj.u.create(dj.a.provider(b0.create(zVar, this.f79441g, pj.a0.create(zVar))))), new g(a0Var), new r(a0Var)));
        this.f79443i = new d(a0Var);
        this.f79444j = new t(a0Var);
        this.f79445k = new n(a0Var);
        this.f79446l = new s(a0Var);
        this.f79447m = new f(a0Var);
        pj.i iVarCreate = pj.i.create(dVar);
        this.f79448n = iVarCreate;
        this.f79449o = pj.j.create(dVar, iVarCreate);
        this.f79450p = pj.h.create(dVar);
        this.f79451q = pj.f.create(dVar, this.f79448n, new l(a0Var));
        dj.b bVarCreate = dj.c.create(aVar);
        h hVar = new h(a0Var);
        this.f79452r = hVar;
        this.f79453s = dj.a.provider(h0.create(this.f79437c, this.f79438d, this.f79439e, this.f79440f, this.f79442h, this.f79443i, this.f79444j, this.f79445k, this.f79446l, this.f79447m, this.f79449o, this.f79450p, this.f79451q, bVarCreate, hVar));
        this.f79454t = new q(a0Var);
        this.f79455u = pj.g.create(dVar);
        dj.b bVarCreate2 = dj.c.create(lVar);
        c cVar = new c(a0Var);
        k kVar = new k(a0Var);
        this.f79456v = kVar;
        dj.e eVarProvider = dj.a.provider(r0.create(this.f79455u, bVarCreate2, cVar, this.f79450p, this.f79440f, kVar, this.f79452r));
        this.f79457w = eVarProvider;
        this.f79458x = dj.a.provider(e1.create(this.f79453s, this.f79454t, this.f79451q, this.f79450p, nj.m.create(this.f79445k, this.f79440f, this.f79444j, this.f79446l, this.f79439e, this.f79447m, eVarProvider, this.f79451q), this.f79456v, new o(a0Var)));
    }

    @Override // oj.b
    public nj.l displayCallbacksFactory() {
        a0 a0Var = this.f79435a;
        nj.z zVar = (nj.z) dj.d.checkNotNullFromComponent(((y) a0Var).impressionStorageClient());
        qj.a aVar = (qj.a) dj.d.checkNotNullFromComponent(((y) a0Var).clock());
        g1 g1Var = (g1) dj.d.checkNotNullFromComponent(((y) a0Var).schedulers());
        nj.e1 e1Var = (nj.e1) dj.d.checkNotNullFromComponent(((y) a0Var).rateLimiterClient());
        nj.h hVar = (nj.h) dj.d.checkNotNullFromComponent(((y) a0Var).campaignCacheClient());
        rj.v vVar = (rj.v) dj.d.checkNotNullFromComponent(((y) a0Var).appForegroundRateLimit());
        n0 n0Var = (n0) this.f79457w.get();
        pj.d dVar = this.f79436b;
        return new nj.l(zVar, aVar, g1Var, e1Var, hVar, vVar, n0Var, pj.f.providesDataCollectionHelper(dVar, pj.i.providesSharedPreferencesUtils(dVar), (yi.d) dj.d.checkNotNullFromComponent(((y) a0Var).firebaseEventsSubscriber())));
    }

    @Override // oj.b
    public w0 providesFirebaseInAppMessaging() {
        return (w0) this.f79458x.get();
    }
}
