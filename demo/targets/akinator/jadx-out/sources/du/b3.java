package du;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class b3 extends mt.n0 {

    /* renamed from: b, reason: collision with root package name */
    public final mt.t0[] f52684b;

    /* renamed from: c, reason: collision with root package name */
    public final st.o f52685c;

    public b3(mt.t0[] t0VarArr, st.o oVar) {
        this.f52684b = t0VarArr;
        this.f52685c = oVar;
    }

    @Override // mt.n0
    public final void subscribeActual(mt.q0 q0Var) {
        mt.t0[] t0VarArr = this.f52684b;
        int length = t0VarArr.length;
        if (length == 1) {
            t0VarArr[0].subscribe(new w1(q0Var, new y2(this)));
            return;
        }
        z2 z2Var = new z2(q0Var, length, this.f52685c);
        q0Var.onSubscribe(z2Var);
        for (int i10 = 0; i10 < length && !z2Var.isDisposed(); i10++) {
            mt.t0 t0Var = t0VarArr[i10];
            if (t0Var == null) {
                z2Var.a(new NullPointerException("One of the sources is null"), i10);
                return;
            }
            t0Var.subscribe(z2Var.f52900e[i10]);
        }
    }
}
