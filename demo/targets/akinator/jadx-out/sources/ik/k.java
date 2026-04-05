package ik;

import ek.z1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class k implements hk.b {

    /* renamed from: a, reason: collision with root package name */
    public final ru.a f59697a;

    /* renamed from: b, reason: collision with root package name */
    public final ru.a f59698b;

    /* renamed from: c, reason: collision with root package name */
    public final ru.a f59699c;

    /* renamed from: d, reason: collision with root package name */
    public final ru.a f59700d;

    /* renamed from: e, reason: collision with root package name */
    public final ru.a f59701e;

    public k(ru.a aVar, ru.a aVar2, ru.a aVar3, ru.a aVar4, ru.a aVar5) {
        this.f59697a = aVar;
        this.f59698b = aVar2;
        this.f59699c = aVar3;
        this.f59700d = aVar4;
        this.f59701e = aVar5;
    }

    public static k create(ru.a aVar, ru.a aVar2, ru.a aVar3, ru.a aVar4, ru.a aVar5) {
        return new k(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static d newInstance(z1 z1Var, tj.f fVar, ek.b bVar, a aVar, r rVar) {
        return new d(z1Var, fVar, bVar, aVar, rVar);
    }

    @Override // hk.b, hk.e, ru.a
    public d get() {
        return newInstance((z1) this.f59697a.get(), (tj.f) this.f59698b.get(), (ek.b) this.f59699c.get(), (a) this.f59700d.get(), (r) this.f59701e.get());
    }
}
