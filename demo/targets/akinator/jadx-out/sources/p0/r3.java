package p0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class r3 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f80429i;

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        r3 r3Var = new r3(2, dVar);
        r3Var.f80429i = obj;
        return r3Var;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        av.e.getCOROUTINE_SUSPENDED();
        tu.a0.throwOnFailure(obj);
        return bv.b.boxBoolean(((o3) this.f80429i) == o3.f80381b);
    }

    @Override // kv.p
    public final Object invoke(o3 o3Var, zu.d<? super Boolean> dVar) {
        return ((r3) create(o3Var, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
