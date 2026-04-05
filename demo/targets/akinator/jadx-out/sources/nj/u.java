package nj;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class u implements dj.b {

    /* renamed from: a, reason: collision with root package name */
    public final ru.a f77014a;

    public u(ru.a aVar) {
        this.f77014a = aVar;
    }

    public static u create(ru.a aVar) {
        return new u(aVar);
    }

    public static t newInstance(rk.t tVar) {
        return new t(tVar);
    }

    @Override // dj.b, dj.e, ru.a
    public t get() {
        return newInstance((rk.t) this.f77014a.get());
    }
}
