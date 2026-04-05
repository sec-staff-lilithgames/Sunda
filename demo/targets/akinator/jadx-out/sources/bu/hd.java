package bu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class hd extends a {

    /* renamed from: c, reason: collision with root package name */
    public final st.c f10394c;

    /* renamed from: e, reason: collision with root package name */
    public final mt.g0 f10395e;

    public hd(mt.g0 g0Var, st.c cVar, mt.g0 g0Var2) {
        super(g0Var);
        this.f10394c = cVar;
        this.f10395e = g0Var2;
    }

    @Override // mt.b0
    public void subscribeActual(mt.i0 i0Var) {
        ku.m mVar = new ku.m(i0Var);
        fd fdVar = new fd(mVar, this.f10394c);
        mVar.onSubscribe(fdVar);
        this.f10395e.subscribe(new gd(fdVar));
        this.f10053b.subscribe(fdVar);
    }
}
