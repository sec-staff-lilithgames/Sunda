package bu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class p7 extends mt.n0 {

    /* renamed from: b, reason: collision with root package name */
    public final mt.g0 f10796b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f10797c;

    /* renamed from: e, reason: collision with root package name */
    public final st.c f10798e;

    public p7(mt.g0 g0Var, Object obj, st.c cVar) {
        this.f10796b = g0Var;
        this.f10797c = obj;
        this.f10798e = cVar;
    }

    @Override // mt.n0
    public final void subscribeActual(mt.q0 q0Var) {
        this.f10796b.subscribe(new o7(q0Var, this.f10798e, this.f10797c));
    }
}
