package bu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class a8 extends a {

    /* renamed from: c, reason: collision with root package name */
    public final st.o f10081c;

    public a8(mt.g0 g0Var, st.o oVar) {
        super(g0Var);
        this.f10081c = oVar;
    }

    @Override // mt.b0
    public final void subscribeActual(mt.i0 i0Var) {
        pu.f serialized = pu.d.create().toSerialized();
        try {
            mt.g0 g0Var = (mt.g0) ut.o0.requireNonNull(this.f10081c.apply(serialized), "The handler returned a null ObservableSource");
            z7 z7Var = new z7(i0Var, serialized, this.f10053b);
            i0Var.onSubscribe(z7Var);
            g0Var.subscribe(z7Var.f11311g);
            z7Var.a();
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            tt.e.error(th2, i0Var);
        }
    }
}
