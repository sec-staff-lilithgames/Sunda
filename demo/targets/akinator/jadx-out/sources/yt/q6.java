package yt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class q6 extends a {

    /* renamed from: e, reason: collision with root package name */
    public final tw.b f96190e;

    /* renamed from: f, reason: collision with root package name */
    public final st.o f96191f;

    /* renamed from: g, reason: collision with root package name */
    public final st.o f96192g;

    /* renamed from: h, reason: collision with root package name */
    public final st.c f96193h;

    public q6(mt.l lVar, tw.b bVar, st.o oVar, st.o oVar2, st.c cVar) {
        super(lVar);
        this.f96190e = bVar;
        this.f96191f = oVar;
        this.f96192g = oVar2;
        this.f96193h = cVar;
    }

    @Override // mt.l
    public final void subscribeActual(tw.c cVar) {
        p6 p6Var = new p6(cVar, this.f96191f, this.f96192g, this.f96193h);
        cVar.onSubscribe(p6Var);
        m5 m5Var = new m5(p6Var, true);
        pt.b bVar = p6Var.f96112f;
        bVar.add(m5Var);
        m5 m5Var2 = new m5(p6Var, false);
        bVar.add(m5Var2);
        this.f95121c.subscribe((mt.q) m5Var);
        this.f96190e.subscribe(m5Var2);
    }
}
