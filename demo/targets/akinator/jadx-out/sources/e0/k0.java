package e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class k0 extends bv.l implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f53137i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f53138j;

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        k0 k0Var = new k0(2, dVar);
        k0Var.f53138j = obj;
        return k0Var;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f53137i;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            tu.a0.throwOnFailure(obj);
            return obj;
        }
        tu.a0.throwOnFailure(obj);
        u1.c cVar = (u1.c) this.f53138j;
        this.f53137i = 1;
        Object objAwaitFirstDown = q4.awaitFirstDown(cVar, false, this);
        return objAwaitFirstDown == coroutine_suspended ? coroutine_suspended : objAwaitFirstDown;
    }

    @Override // kv.p
    public final Object invoke(u1.c cVar, zu.d<? super u1.c0> dVar) {
        return ((k0) create(cVar, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
