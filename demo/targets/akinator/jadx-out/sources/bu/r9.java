package bu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class r9 extends mt.b0 {

    /* renamed from: b, reason: collision with root package name */
    public final mt.g0 f10919b;

    /* renamed from: c, reason: collision with root package name */
    public final mt.g0 f10920c;

    /* renamed from: e, reason: collision with root package name */
    public final st.d f10921e;

    /* renamed from: f, reason: collision with root package name */
    public final int f10922f;

    public r9(mt.g0 g0Var, mt.g0 g0Var2, st.d dVar, int i10) {
        this.f10919b = g0Var;
        this.f10920c = g0Var2;
        this.f10921e = dVar;
        this.f10922f = i10;
    }

    @Override // mt.b0
    public void subscribeActual(mt.i0 i0Var) {
        p9 p9Var = new p9(i0Var, this.f10922f, this.f10919b, this.f10920c, this.f10921e);
        i0Var.onSubscribe(p9Var);
        q9[] q9VarArr = p9Var.f10804h;
        p9Var.f10802f.subscribe(q9VarArr[0]);
        p9Var.f10803g.subscribe(q9VarArr[1]);
    }
}
