package du;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class b2 extends mt.n0 {

    /* renamed from: b, reason: collision with root package name */
    public final mt.t0 f52682b;

    /* renamed from: c, reason: collision with root package name */
    public final mt.m0 f52683c;

    public b2(mt.t0 t0Var, mt.m0 m0Var) {
        this.f52682b = t0Var;
        this.f52683c = m0Var;
    }

    @Override // mt.n0
    public final void subscribeActual(mt.q0 q0Var) {
        this.f52682b.subscribe(new a2(q0Var, this.f52683c));
    }
}
