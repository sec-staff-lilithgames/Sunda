package bu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class u9 extends mt.n0 implements vt.d {

    /* renamed from: b, reason: collision with root package name */
    public final mt.g0 f11090b;

    /* renamed from: c, reason: collision with root package name */
    public final mt.g0 f11091c;

    /* renamed from: e, reason: collision with root package name */
    public final st.d f11092e;

    /* renamed from: f, reason: collision with root package name */
    public final int f11093f;

    public u9(mt.g0 g0Var, mt.g0 g0Var2, st.d dVar, int i10) {
        this.f11090b = g0Var;
        this.f11091c = g0Var2;
        this.f11092e = dVar;
        this.f11093f = i10;
    }

    @Override // vt.d
    public mt.b0 fuseToObservable() {
        return mu.a.onAssembly(new r9(this.f11090b, this.f11091c, this.f11092e, this.f11093f));
    }

    @Override // mt.n0
    public void subscribeActual(mt.q0 q0Var) {
        s9 s9Var = new s9(q0Var, this.f11093f, this.f11090b, this.f11091c, this.f11092e);
        q0Var.onSubscribe(s9Var);
        t9[] t9VarArr = s9Var.f10973h;
        s9Var.f10971f.subscribe(t9VarArr[0]);
        s9Var.f10972g.subscribe(t9VarArr[1]);
    }
}
