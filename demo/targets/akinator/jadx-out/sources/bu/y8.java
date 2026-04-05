package bu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class y8 extends a {

    /* renamed from: c, reason: collision with root package name */
    public final st.o f11256c;

    public y8(mt.g0 g0Var, st.o oVar) {
        super(g0Var);
        this.f11256c = oVar;
    }

    @Override // mt.b0
    public final void subscribeActual(mt.i0 i0Var) {
        pu.f serialized = pu.d.create().toSerialized();
        try {
            mt.g0 g0Var = (mt.g0) ut.o0.requireNonNull(this.f11256c.apply(serialized), "The handler returned a null ObservableSource");
            x8 x8Var = new x8(i0Var, serialized, this.f10053b);
            i0Var.onSubscribe(x8Var);
            g0Var.subscribe(x8Var.f11215g);
            x8Var.a();
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            tt.e.error(th2, i0Var);
        }
    }
}
