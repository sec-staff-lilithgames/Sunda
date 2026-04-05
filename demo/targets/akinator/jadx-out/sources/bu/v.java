package bu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class v extends mt.n0 implements vt.d {

    /* renamed from: b, reason: collision with root package name */
    public final mt.g0 f11106b;

    /* renamed from: c, reason: collision with root package name */
    public final st.q f11107c;

    public v(mt.g0 g0Var, st.q qVar) {
        this.f11106b = g0Var;
        this.f11107c = qVar;
    }

    @Override // vt.d
    public mt.b0 fuseToObservable() {
        return mu.a.onAssembly(new t(this.f11106b, this.f11107c));
    }

    @Override // mt.n0
    public final void subscribeActual(mt.q0 q0Var) {
        this.f11106b.subscribe(new u(q0Var, this.f11107c));
    }
}
