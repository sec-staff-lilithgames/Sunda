package xr;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class re implements y9 {

    /* renamed from: a, reason: collision with root package name */
    public final oe f92971a;

    public re(oe oeVar) {
        this.f92971a = oeVar;
    }

    public static <T> re forResource(oe oeVar) {
        return new re(oeVar);
    }

    @Override // xr.y9
    public Object getObject() {
        return qe.get(this.f92971a);
    }

    @Override // xr.y9
    public Object returnObject(Object obj) {
        qe.release(this.f92971a, obj);
        return null;
    }
}
