package du;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class h1 extends mt.l {

    /* renamed from: c, reason: collision with root package name */
    public final mt.t0 f52742c;

    /* renamed from: e, reason: collision with root package name */
    public final st.o f52743e;

    public h1(mt.t0 t0Var, st.o oVar) {
        this.f52742c = t0Var;
        this.f52743e = oVar;
    }

    @Override // mt.l
    public final void subscribeActual(tw.c cVar) {
        this.f52742c.subscribe(new g1(cVar, this.f52743e));
    }
}
