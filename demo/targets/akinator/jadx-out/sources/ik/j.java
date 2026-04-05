package ik;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class j implements hk.b {

    /* renamed from: a, reason: collision with root package name */
    public final ru.a f59695a;

    /* renamed from: b, reason: collision with root package name */
    public final ru.a f59696b;

    public j(ru.a aVar, ru.a aVar2) {
        this.f59695a = aVar;
        this.f59696b = aVar2;
    }

    public static j create(ru.a aVar, ru.a aVar2) {
        return new j(aVar, aVar2);
    }

    public static h newInstance(ek.b bVar, zu.m mVar) {
        return new h(bVar, mVar);
    }

    @Override // hk.b, hk.e, ru.a
    public h get() {
        return newInstance((ek.b) this.f59695a.get(), (zu.m) this.f59696b.get());
    }
}
