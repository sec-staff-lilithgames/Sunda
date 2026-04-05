package du;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class a0 extends mt.n0 {

    /* renamed from: b, reason: collision with root package name */
    public final mt.t0 f52661b;

    /* renamed from: c, reason: collision with root package name */
    public final st.g f52662c;

    public a0(mt.t0 t0Var, st.g gVar) {
        this.f52661b = t0Var;
        this.f52662c = gVar;
    }

    @Override // mt.n0
    public final void subscribeActual(mt.q0 q0Var) {
        this.f52661b.subscribe(new z(q0Var, this.f52662c));
    }
}
