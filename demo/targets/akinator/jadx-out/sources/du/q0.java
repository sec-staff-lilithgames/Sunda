package du;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class q0 extends mt.n0 {

    /* renamed from: b, reason: collision with root package name */
    public final mt.t0 f52821b;

    /* renamed from: c, reason: collision with root package name */
    public final st.a f52822c;

    public q0(mt.t0 t0Var, st.a aVar) {
        this.f52821b = t0Var;
        this.f52822c = aVar;
    }

    @Override // mt.n0
    public final void subscribeActual(mt.q0 q0Var) {
        this.f52821b.subscribe(new p0(this, q0Var));
    }
}
