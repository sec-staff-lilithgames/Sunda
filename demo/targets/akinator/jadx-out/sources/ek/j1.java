package ek;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class j1 implements hk.b {

    /* renamed from: a, reason: collision with root package name */
    public final ru.a f54561a;

    public j1(ru.a aVar) {
        this.f54561a = aVar;
    }

    public static j1 create(ru.a aVar) {
        return new j1(aVar);
    }

    public static i1 newInstance(l1 l1Var) {
        return new i1(l1Var);
    }

    @Override // hk.b, hk.e, ru.a
    public i1 get() {
        return newInstance((l1) this.f54561a.get());
    }
}
