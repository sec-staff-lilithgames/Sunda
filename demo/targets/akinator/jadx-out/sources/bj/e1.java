package bj;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class e1 implements dj.b {

    /* renamed from: a, reason: collision with root package name */
    public final ru.a f9623a;

    /* renamed from: b, reason: collision with root package name */
    public final ru.a f9624b;

    /* renamed from: c, reason: collision with root package name */
    public final ru.a f9625c;

    /* renamed from: d, reason: collision with root package name */
    public final ru.a f9626d;

    /* renamed from: e, reason: collision with root package name */
    public final ru.a f9627e;

    /* renamed from: f, reason: collision with root package name */
    public final ru.a f9628f;

    /* renamed from: g, reason: collision with root package name */
    public final ru.a f9629g;

    public e1(ru.a aVar, ru.a aVar2, ru.a aVar3, ru.a aVar4, ru.a aVar5, ru.a aVar6, ru.a aVar7) {
        this.f9623a = aVar;
        this.f9624b = aVar2;
        this.f9625c = aVar3;
        this.f9626d = aVar4;
        this.f9627e = aVar5;
        this.f9628f = aVar6;
        this.f9629g = aVar7;
    }

    public static e1 create(ru.a aVar, ru.a aVar2, ru.a aVar3, ru.a aVar4, ru.a aVar5, ru.a aVar6, ru.a aVar7) {
        return new e1(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7);
    }

    public static w0 newInstance(nj.g0 g0Var, nj.p0 p0Var, nj.j jVar, tj.f fVar, nj.l lVar, nj.k kVar, Executor executor) {
        return new w0(g0Var, p0Var, jVar, fVar, lVar, kVar, executor);
    }

    @Override // dj.b, dj.e, ru.a
    public w0 get() {
        return newInstance((nj.g0) this.f9623a.get(), (nj.p0) this.f9624b.get(), (nj.j) this.f9625c.get(), (tj.f) this.f9626d.get(), (nj.l) this.f9627e.get(), (nj.k) this.f9628f.get(), (Executor) this.f9629g.get());
    }
}
