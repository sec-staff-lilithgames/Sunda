package ek;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class e1 implements hk.b {

    /* renamed from: a, reason: collision with root package name */
    public final ru.a f54503a;

    /* renamed from: b, reason: collision with root package name */
    public final ru.a f54504b;

    /* renamed from: c, reason: collision with root package name */
    public final ru.a f54505c;

    /* renamed from: d, reason: collision with root package name */
    public final ru.a f54506d;

    /* renamed from: e, reason: collision with root package name */
    public final ru.a f54507e;

    public e1(ru.a aVar, ru.a aVar2, ru.a aVar3, ru.a aVar4, ru.a aVar5) {
        this.f54503a = aVar;
        this.f54504b = aVar2;
        this.f54505c = aVar3;
        this.f54506d = aVar4;
        this.f54507e = aVar5;
    }

    public static e1 create(ru.a aVar, ru.a aVar2, ru.a aVar3, ru.a aVar4, ru.a aVar5) {
        return new e1(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static b1 newInstance(com.google.firebase.g gVar, tj.f fVar, ik.o oVar, p pVar, zu.m mVar) {
        return new b1(gVar, fVar, oVar, pVar, mVar);
    }

    @Override // hk.b, hk.e, ru.a
    public b1 get() {
        return newInstance((com.google.firebase.g) this.f54503a.get(), (tj.f) this.f54504b.get(), (ik.o) this.f54505c.get(), (p) this.f54506d.get(), (zu.m) this.f54507e.get());
    }
}
