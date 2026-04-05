package ek;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class g1 implements hk.b {

    /* renamed from: a, reason: collision with root package name */
    public final ru.a f54527a;

    /* renamed from: b, reason: collision with root package name */
    public final ru.a f54528b;

    public g1(ru.a aVar, ru.a aVar2) {
        this.f54527a = aVar;
        this.f54528b = aVar2;
    }

    public static g1 create(ru.a aVar, ru.a aVar2) {
        return new g1(aVar, aVar2);
    }

    public static f1 newInstance(z1 z1Var, b2 b2Var) {
        return new f1(z1Var, b2Var);
    }

    @Override // hk.b, hk.e, ru.a
    public f1 get() {
        return newInstance((z1) this.f54527a.get(), (b2) this.f54528b.get());
    }
}
