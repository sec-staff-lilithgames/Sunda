package p0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class q3 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f80407i;

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        q3 q3Var = new q3(2, dVar);
        q3Var.f80407i = obj;
        return q3Var;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        av.e.getCOROUTINE_SUSPENDED();
        tu.a0.throwOnFailure(obj);
        return bv.b.boxBoolean(((o3) this.f80407i).compareTo(o3.f80385g) > 0);
    }

    @Override // kv.p
    public final Object invoke(o3 o3Var, zu.d<? super Boolean> dVar) {
        return ((q3) create(o3Var, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
