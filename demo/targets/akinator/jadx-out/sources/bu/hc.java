package bu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class hc extends a {

    /* renamed from: c, reason: collision with root package name */
    public final mt.m0 f10393c;

    public hc(mt.g0 g0Var, mt.m0 m0Var) {
        super(g0Var);
        this.f10393c = m0Var;
    }

    @Override // mt.b0
    public void subscribeActual(mt.i0 i0Var) {
        this.f10053b.subscribe(new gc(i0Var, this.f10393c));
    }
}
