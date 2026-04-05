package bu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class pa extends a {

    /* renamed from: c, reason: collision with root package name */
    public final mt.g0 f10808c;

    public pa(mt.g0 g0Var, mt.g0 g0Var2) {
        super(g0Var);
        this.f10808c = g0Var2;
    }

    @Override // mt.b0
    public void subscribeActual(mt.i0 i0Var) {
        oa oaVar = new oa(this.f10808c, i0Var);
        i0Var.onSubscribe(oaVar.f10760e);
        this.f10053b.subscribe(oaVar);
    }
}
