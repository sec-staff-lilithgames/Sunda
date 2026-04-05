package du;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class w extends mt.s {

    /* renamed from: b, reason: collision with root package name */
    public final mt.n0 f52862b;

    /* renamed from: c, reason: collision with root package name */
    public final st.o f52863c;

    public w(mt.n0<Object> n0Var, st.o oVar) {
        this.f52862b = n0Var;
        this.f52863c = oVar;
    }

    @Override // mt.s
    public final void subscribeActual(mt.v vVar) {
        this.f52862b.subscribe(new v(vVar, this.f52863c));
    }
}
