package k4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class w extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f70546i;

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        w wVar = new w(2, dVar);
        wVar.f70546i = obj;
        return wVar;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        av.e.getCOROUTINE_SUSPENDED();
        tu.a0.throwOnFailure(obj);
        return bv.b.boxBoolean(!(((q2) this.f70546i) instanceof j1));
    }

    @Override // kv.p
    public final Object invoke(q2 q2Var, zu.d<? super Boolean> dVar) {
        return ((w) create(q2Var, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
