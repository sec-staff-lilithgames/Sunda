package bu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class h9 extends a {

    /* renamed from: c, reason: collision with root package name */
    public final mt.g0 f10385c;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f10386e;

    public h9(mt.g0 g0Var, mt.g0 g0Var2, boolean z10) {
        super(g0Var);
        this.f10385c = g0Var2;
        this.f10386e = z10;
    }

    @Override // mt.b0
    public void subscribeActual(mt.i0 i0Var) {
        ku.m mVar = new ku.m(i0Var);
        boolean z10 = this.f10386e;
        mt.g0 g0Var = this.f10385c;
        mt.g0 g0Var2 = this.f10053b;
        if (z10) {
            g0Var2.subscribe(new d9(mVar, g0Var));
        } else {
            g0Var2.subscribe(new e9(mVar, g0Var));
        }
    }
}
