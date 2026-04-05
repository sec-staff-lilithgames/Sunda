package e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class e2 extends bv.l implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f53033i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f53034j;

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        e2 e2Var = new e2(2, dVar);
        e2Var.f53034j = obj;
        return e2Var;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f53033i;
        if (i10 == 0) {
            tu.a0.throwOnFailure(obj);
            u1.c cVar = (u1.c) this.f53034j;
            this.f53033i = 1;
            if (h2.awaitAllPointersUp(cVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            tu.a0.throwOnFailure(obj);
        }
        return tu.x0.f87415a;
    }

    @Override // kv.p
    public final Object invoke(u1.c cVar, zu.d<? super tu.x0> dVar) {
        return ((e2) create(cVar, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
