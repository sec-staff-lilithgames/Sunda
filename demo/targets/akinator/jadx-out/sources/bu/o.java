package bu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class o extends mt.n0 implements vt.d {

    /* renamed from: b, reason: collision with root package name */
    public final mt.g0 f10718b;

    /* renamed from: c, reason: collision with root package name */
    public final st.q f10719c;

    public o(mt.g0 g0Var, st.q qVar) {
        this.f10718b = g0Var;
        this.f10719c = qVar;
    }

    @Override // vt.d
    public mt.b0 fuseToObservable() {
        return mu.a.onAssembly(new m(this.f10718b, this.f10719c));
    }

    @Override // mt.n0
    public final void subscribeActual(mt.q0 q0Var) {
        this.f10718b.subscribe(new n(q0Var, this.f10719c));
    }
}
