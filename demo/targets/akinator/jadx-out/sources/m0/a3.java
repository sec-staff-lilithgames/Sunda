package m0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class a3 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f73664i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f73665j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ o f73666k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(o oVar, zu.d dVar) {
        super(2, dVar);
        this.f73666k = oVar;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        a3 a3Var = new a3(this.f73666k, dVar);
        a3Var.f73665j = obj;
        return a3Var;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f73664i;
        if (i10 == 0) {
            tu.a0.throwOnFailure(obj);
            u1.k0 k0Var = (u1.k0) this.f73665j;
            z2 z2Var = new z2(this.f73666k, null);
            this.f73664i = 1;
            if (k0Var.awaitPointerEventScope(z2Var, this) == coroutine_suspended) {
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
    public final Object invoke(u1.k0 k0Var, zu.d<? super tu.x0> dVar) {
        return ((a3) create(k0Var, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
