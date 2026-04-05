package nj;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class h0 implements dj.b {

    /* renamed from: a, reason: collision with root package name */
    public final ru.a f76922a;

    /* renamed from: b, reason: collision with root package name */
    public final ru.a f76923b;

    /* renamed from: c, reason: collision with root package name */
    public final ru.a f76924c;

    /* renamed from: d, reason: collision with root package name */
    public final ru.a f76925d;

    /* renamed from: e, reason: collision with root package name */
    public final ru.a f76926e;

    /* renamed from: f, reason: collision with root package name */
    public final ru.a f76927f;

    /* renamed from: g, reason: collision with root package name */
    public final ru.a f76928g;

    /* renamed from: h, reason: collision with root package name */
    public final ru.a f76929h;

    /* renamed from: i, reason: collision with root package name */
    public final ru.a f76930i;

    /* renamed from: j, reason: collision with root package name */
    public final ru.a f76931j;

    /* renamed from: k, reason: collision with root package name */
    public final ru.a f76932k;

    /* renamed from: l, reason: collision with root package name */
    public final ru.a f76933l;

    /* renamed from: m, reason: collision with root package name */
    public final ru.a f76934m;

    /* renamed from: n, reason: collision with root package name */
    public final ru.a f76935n;

    /* renamed from: o, reason: collision with root package name */
    public final ru.a f76936o;

    public h0(ru.a aVar, ru.a aVar2, ru.a aVar3, ru.a aVar4, ru.a aVar5, ru.a aVar6, ru.a aVar7, ru.a aVar8, ru.a aVar9, ru.a aVar10, ru.a aVar11, ru.a aVar12, ru.a aVar13, ru.a aVar14, ru.a aVar15) {
        this.f76922a = aVar;
        this.f76923b = aVar2;
        this.f76924c = aVar3;
        this.f76925d = aVar4;
        this.f76926e = aVar5;
        this.f76927f = aVar6;
        this.f76928g = aVar7;
        this.f76929h = aVar8;
        this.f76930i = aVar9;
        this.f76931j = aVar10;
        this.f76932k = aVar11;
        this.f76933l = aVar12;
        this.f76934m = aVar13;
        this.f76935n = aVar14;
        this.f76936o = aVar15;
    }

    public static h0 create(ru.a aVar, ru.a aVar2, ru.a aVar3, ru.a aVar4, ru.a aVar5, ru.a aVar6, ru.a aVar7, ru.a aVar8, ru.a aVar9, ru.a aVar10, ru.a aVar11, ru.a aVar12, ru.a aVar13, ru.a aVar14, ru.a aVar15) {
        return new h0(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, aVar11, aVar12, aVar13, aVar14, aVar15);
    }

    public static g0 newInstance(rt.a aVar, rt.a aVar2, h hVar, qj.a aVar3, d dVar, c cVar, g1 g1Var, z zVar, e1 e1Var, rj.v vVar, j1 j1Var, tj.f fVar, j jVar, a aVar4, Executor executor) {
        return new g0(aVar, aVar2, hVar, aVar3, dVar, cVar, g1Var, zVar, e1Var, vVar, j1Var, fVar, jVar, aVar4, executor);
    }

    @Override // dj.b, dj.e, ru.a
    public g0 get() {
        return newInstance((rt.a) this.f76922a.get(), (rt.a) this.f76923b.get(), (h) this.f76924c.get(), (qj.a) this.f76925d.get(), (d) this.f76926e.get(), (c) this.f76927f.get(), (g1) this.f76928g.get(), (z) this.f76929h.get(), (e1) this.f76930i.get(), (rj.v) this.f76931j.get(), (j1) this.f76932k.get(), (tj.f) this.f76933l.get(), (j) this.f76934m.get(), (a) this.f76935n.get(), (Executor) this.f76936o.get());
    }
}
