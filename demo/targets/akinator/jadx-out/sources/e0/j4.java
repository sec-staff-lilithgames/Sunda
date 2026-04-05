package e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class j4 extends bv.l implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f53134i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f53135j;

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        j4 j4Var = new j4(2, dVar);
        j4Var.f53135j = obj;
        return j4Var;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f53134i;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            tu.a0.throwOnFailure(obj);
            return obj;
        }
        tu.a0.throwOnFailure(obj);
        u1.c cVar = (u1.c) this.f53135j;
        this.f53134i = 1;
        Object objWaitForUpOrCancellation = q4.waitForUpOrCancellation(cVar, this);
        return objWaitForUpOrCancellation == coroutine_suspended ? coroutine_suspended : objWaitForUpOrCancellation;
    }

    @Override // kv.p
    public final Object invoke(u1.c cVar, zu.d<? super u1.c0> dVar) {
        return ((j4) create(cVar, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
