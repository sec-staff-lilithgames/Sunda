package nj;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class h1 implements dj.b {

    /* renamed from: a, reason: collision with root package name */
    public final ru.a f76937a;

    /* renamed from: b, reason: collision with root package name */
    public final ru.a f76938b;

    /* renamed from: c, reason: collision with root package name */
    public final ru.a f76939c;

    public h1(ru.a aVar, ru.a aVar2, ru.a aVar3) {
        this.f76937a = aVar;
        this.f76938b = aVar2;
        this.f76939c = aVar3;
    }

    public static h1 create(ru.a aVar, ru.a aVar2, ru.a aVar3) {
        return new h1(aVar, aVar2, aVar3);
    }

    public static g1 newInstance(mt.m0 m0Var, mt.m0 m0Var2, mt.m0 m0Var3) {
        return new g1(m0Var, m0Var2, m0Var3);
    }

    @Override // dj.b, dj.e, ru.a
    public g1 get() {
        return newInstance((mt.m0) this.f76937a.get(), (mt.m0) this.f76938b.get(), (mt.m0) this.f76939c.get());
    }
}
