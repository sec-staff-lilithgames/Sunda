package k4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class u2 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f70530i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f70531j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f70532k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2(Object obj, zu.d dVar) {
        super(2, dVar);
        this.f70532k = obj;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        u2 u2Var = new u2(this.f70532k, dVar);
        u2Var.f70531j = obj;
        return u2Var;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f70530i;
        if (i10 == 0) {
            tu.a0.throwOnFailure(obj);
            a3 a3Var = (a3) this.f70531j;
            this.f70530i = 1;
            if (a3Var.writeData(this.f70532k, this) == coroutine_suspended) {
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
    public final Object invoke(a3 a3Var, zu.d<? super tu.x0> dVar) {
        return ((u2) create(a3Var, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
