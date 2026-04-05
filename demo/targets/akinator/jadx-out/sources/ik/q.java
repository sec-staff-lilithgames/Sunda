package ik;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class q implements hk.b {

    /* renamed from: a, reason: collision with root package name */
    public final ru.a f59716a;

    /* renamed from: b, reason: collision with root package name */
    public final ru.a f59717b;

    public q(ru.a aVar, ru.a aVar2) {
        this.f59716a = aVar;
        this.f59717b = aVar2;
    }

    public static q create(ru.a aVar, ru.a aVar2) {
        return new q(aVar, aVar2);
    }

    public static o newInstance(c0 c0Var, c0 c0Var2) {
        return new o(c0Var, c0Var2);
    }

    @Override // hk.b, hk.e, ru.a
    public o get() {
        return newInstance((c0) this.f59716a.get(), (c0) this.f59717b.get());
    }
}
