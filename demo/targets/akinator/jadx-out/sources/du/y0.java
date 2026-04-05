package du;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class y0 extends mt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.t0 f52883b;

    /* renamed from: c, reason: collision with root package name */
    public final st.o f52884c;

    public y0(mt.t0 t0Var, st.o oVar) {
        this.f52883b = t0Var;
        this.f52884c = oVar;
    }

    @Override // mt.c
    public final void subscribeActual(mt.f fVar) {
        x0 x0Var = new x0(fVar, this.f52884c);
        fVar.onSubscribe(x0Var);
        this.f52883b.subscribe(x0Var);
    }
}
