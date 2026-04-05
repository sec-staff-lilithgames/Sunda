package du;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class i0 extends mt.n0 {

    /* renamed from: b, reason: collision with root package name */
    public final mt.t0 f52747b;

    /* renamed from: c, reason: collision with root package name */
    public final st.g f52748c;

    public i0(mt.t0 t0Var, st.g gVar) {
        this.f52747b = t0Var;
        this.f52748c = gVar;
    }

    @Override // mt.n0
    public final void subscribeActual(mt.q0 q0Var) {
        this.f52747b.subscribe(new h0(this, q0Var));
    }
}
