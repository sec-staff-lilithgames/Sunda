package ek;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class q implements hk.b {

    /* renamed from: a, reason: collision with root package name */
    public final ru.a f54613a;

    public q(ru.a aVar) {
        this.f54613a = aVar;
    }

    public static q create(ru.a aVar) {
        return new q(aVar);
    }

    public static o newInstance(sj.c cVar) {
        return new o(cVar);
    }

    @Override // hk.b, hk.e, ru.a
    public o get() {
        return newInstance((sj.c) this.f54613a.get());
    }
}
