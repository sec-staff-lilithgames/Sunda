package bu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class ia extends a {

    /* renamed from: c, reason: collision with root package name */
    public final mt.g0 f10426c;

    public ia(mt.g0 g0Var, mt.g0 g0Var2) {
        super(g0Var);
        this.f10426c = g0Var2;
    }

    @Override // mt.b0
    public void subscribeActual(mt.i0 i0Var) {
        ku.m mVar = new ku.m(i0Var);
        tt.a aVar = new tt.a(2);
        mVar.onSubscribe(aVar);
        ha haVar = new ha(mVar, aVar);
        this.f10426c.subscribe(new ga(aVar, haVar, mVar));
        this.f10053b.subscribe(haVar);
    }
}
