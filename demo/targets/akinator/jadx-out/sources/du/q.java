package du;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class q extends mt.n0 {

    /* renamed from: b, reason: collision with root package name */
    public final mt.t0 f52819b;

    /* renamed from: c, reason: collision with root package name */
    public final mt.g0 f52820c;

    public q(mt.t0 t0Var, mt.g0 g0Var) {
        this.f52819b = t0Var;
        this.f52820c = g0Var;
    }

    @Override // mt.n0
    public final void subscribeActual(mt.q0 q0Var) {
        this.f52820c.subscribe(new p(q0Var, this.f52819b));
    }
}
