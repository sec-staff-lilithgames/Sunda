package du;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class a1 extends mt.l {

    /* renamed from: c, reason: collision with root package name */
    public final mt.t0 f52663c;

    /* renamed from: e, reason: collision with root package name */
    public final st.o f52664e;

    public a1(mt.t0 t0Var, st.o oVar) {
        this.f52663c = t0Var;
        this.f52664e = oVar;
    }

    @Override // mt.l
    public final void subscribeActual(tw.c cVar) {
        this.f52663c.subscribe(new z0(cVar, this.f52664e));
    }
}
