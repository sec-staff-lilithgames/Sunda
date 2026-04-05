package du;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class o extends mt.n0 {

    /* renamed from: b, reason: collision with root package name */
    public final mt.t0 f52802b;

    /* renamed from: c, reason: collision with root package name */
    public final mt.i f52803c;

    public o(mt.t0 t0Var, mt.i iVar) {
        this.f52802b = t0Var;
        this.f52803c = iVar;
    }

    @Override // mt.n0
    public final void subscribeActual(mt.q0 q0Var) {
        this.f52803c.subscribe(new n(q0Var, this.f52802b));
    }
}
