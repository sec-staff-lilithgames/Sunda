package bu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class s6 extends a {

    /* renamed from: c, reason: collision with root package name */
    public final mt.m0 f10956c;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f10957e;

    /* renamed from: f, reason: collision with root package name */
    public final int f10958f;

    public s6(mt.g0 g0Var, mt.m0 m0Var, boolean z10, int i10) {
        super(g0Var);
        this.f10956c = m0Var;
        this.f10957e = z10;
        this.f10958f = i10;
    }

    @Override // mt.b0
    public final void subscribeActual(mt.i0 i0Var) {
        mt.m0 m0Var = this.f10956c;
        boolean z10 = m0Var instanceof fu.v0;
        mt.g0 g0Var = this.f10053b;
        if (z10) {
            g0Var.subscribe(i0Var);
        } else {
            g0Var.subscribe(new r6(i0Var, m0Var.createWorker(), this.f10957e, this.f10958f));
        }
    }
}
