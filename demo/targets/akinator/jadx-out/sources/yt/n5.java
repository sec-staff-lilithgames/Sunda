package yt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class n5 extends a {

    /* renamed from: e, reason: collision with root package name */
    public final tw.b f95991e;

    /* renamed from: f, reason: collision with root package name */
    public final st.o f95992f;

    /* renamed from: g, reason: collision with root package name */
    public final st.o f95993g;

    /* renamed from: h, reason: collision with root package name */
    public final st.c f95994h;

    public n5(mt.l lVar, tw.b bVar, st.o oVar, st.o oVar2, st.c cVar) {
        super(lVar);
        this.f95991e = bVar;
        this.f95992f = oVar;
        this.f95993g = oVar2;
        this.f95994h = cVar;
    }

    @Override // mt.l
    public final void subscribeActual(tw.c cVar) {
        j5 j5Var = new j5(cVar, this.f95992f, this.f95993g, this.f95994h);
        cVar.onSubscribe(j5Var);
        m5 m5Var = new m5(j5Var, true);
        pt.b bVar = j5Var.f95724f;
        bVar.add(m5Var);
        m5 m5Var2 = new m5(j5Var, false);
        bVar.add(m5Var2);
        this.f95121c.subscribe((mt.q) m5Var);
        this.f95991e.subscribe(m5Var2);
    }
}
