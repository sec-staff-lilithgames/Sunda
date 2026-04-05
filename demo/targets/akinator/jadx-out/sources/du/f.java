package du;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class f extends mt.n0 {

    /* renamed from: b, reason: collision with root package name */
    public final mt.t0 f52720b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f52721c;

    /* renamed from: e, reason: collision with root package name */
    public final st.d f52722e;

    public f(mt.t0 t0Var, Object obj, st.d dVar) {
        this.f52720b = t0Var;
        this.f52721c = obj;
        this.f52722e = dVar;
    }

    @Override // mt.n0
    public final void subscribeActual(mt.q0 q0Var) {
        this.f52720b.subscribe(new e(this, q0Var));
    }
}
