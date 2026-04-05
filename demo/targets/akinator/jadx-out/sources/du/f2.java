package du;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class f2 extends mt.n0 {

    /* renamed from: b, reason: collision with root package name */
    public final mt.t0 f52727b;

    /* renamed from: c, reason: collision with root package name */
    public final st.o f52728c;

    public f2(mt.t0 t0Var, st.o oVar) {
        this.f52727b = t0Var;
        this.f52728c = oVar;
    }

    @Override // mt.n0
    public final void subscribeActual(mt.q0 q0Var) {
        this.f52727b.subscribe(new e2(q0Var, this.f52728c));
    }
}
