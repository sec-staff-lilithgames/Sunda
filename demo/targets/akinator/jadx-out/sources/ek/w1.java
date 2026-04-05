package ek;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class w1 implements hk.b {

    /* renamed from: a, reason: collision with root package name */
    public final ru.a f54663a;

    /* renamed from: b, reason: collision with root package name */
    public final ru.a f54664b;

    /* renamed from: c, reason: collision with root package name */
    public final ru.a f54665c;

    /* renamed from: d, reason: collision with root package name */
    public final ru.a f54666d;

    /* renamed from: e, reason: collision with root package name */
    public final ru.a f54667e;

    /* renamed from: f, reason: collision with root package name */
    public final ru.a f54668f;

    /* renamed from: g, reason: collision with root package name */
    public final ru.a f54669g;

    public w1(ru.a aVar, ru.a aVar2, ru.a aVar3, ru.a aVar4, ru.a aVar5, ru.a aVar6, ru.a aVar7) {
        this.f54663a = aVar;
        this.f54664b = aVar2;
        this.f54665c = aVar3;
        this.f54666d = aVar4;
        this.f54667e = aVar5;
        this.f54668f = aVar6;
        this.f54669g = aVar7;
    }

    public static w1 create(ru.a aVar, ru.a aVar2, ru.a aVar3, ru.a aVar4, ru.a aVar5, ru.a aVar6, ru.a aVar7) {
        return new w1(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7);
    }

    public static v1 newInstance(ik.o oVar, f1 f1Var, a1 a1Var, z1 z1Var, k4.n nVar, m0 m0Var, zu.m mVar) {
        return new v1(oVar, f1Var, a1Var, z1Var, nVar, m0Var, mVar);
    }

    @Override // hk.b, hk.e, ru.a
    public v1 get() {
        return newInstance((ik.o) this.f54663a.get(), (f1) this.f54664b.get(), (a1) this.f54665c.get(), (z1) this.f54666d.get(), (k4.n) this.f54667e.get(), (m0) this.f54668f.get(), (zu.m) this.f54669g.get());
    }
}
