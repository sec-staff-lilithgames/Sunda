package md;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class k0 implements pd.b {

    /* renamed from: a, reason: collision with root package name */
    public final ru.a f74309a;

    /* renamed from: b, reason: collision with root package name */
    public final ru.a f74310b;

    /* renamed from: c, reason: collision with root package name */
    public final ru.a f74311c;

    /* renamed from: d, reason: collision with root package name */
    public final ru.a f74312d;

    /* renamed from: e, reason: collision with root package name */
    public final ru.a f74313e;

    public k0(ru.a aVar, ru.a aVar2, ru.a aVar3, ru.a aVar4, ru.a aVar5) {
        this.f74309a = aVar;
        this.f74310b = aVar2;
        this.f74311c = aVar3;
        this.f74312d = aVar4;
        this.f74313e = aVar5;
    }

    public static k0 create(ru.a aVar, ru.a aVar2, ru.a aVar3, ru.a aVar4, ru.a aVar5) {
        return new k0(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static h0 newInstance(xd.a aVar, xd.a aVar2, td.c cVar, ud.h hVar, ud.j jVar) {
        return new h0(aVar, aVar2, cVar, hVar, jVar);
    }

    @Override // pd.b, ru.a
    public h0 get() {
        return newInstance((xd.a) this.f74309a.get(), (xd.a) this.f74310b.get(), (td.c) this.f74311c.get(), (ud.h) this.f74312d.get(), (ud.j) this.f74313e.get());
    }
}
