package bu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class h7 extends a {

    /* renamed from: c, reason: collision with root package name */
    public final st.o f10382c;

    public h7(mt.g0 g0Var, st.o oVar) {
        super(g0Var);
        this.f10382c = oVar;
    }

    @Override // mt.b0
    public final void subscribeActual(mt.i0 i0Var) {
        pu.d dVarCreate = pu.d.create();
        try {
            mt.g0 g0Var = (mt.g0) ut.o0.requireNonNull(this.f10382c.apply(dVarCreate), "The selector returned a null ObservableSource");
            g7 g7Var = new g7(i0Var);
            g0Var.subscribe(g7Var);
            this.f10053b.subscribe(new f7(dVarCreate, g7Var));
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            tt.e.error(th2, i0Var);
        }
    }
}
