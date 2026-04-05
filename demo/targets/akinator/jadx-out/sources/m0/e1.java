package m0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class e1 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f73698i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f73699j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ h1 f73700k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ z0 f73701l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(h1 h1Var, z0 z0Var, zu.d dVar) {
        super(2, dVar);
        this.f73700k = h1Var;
        this.f73701l = z0Var;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        e1 e1Var = new e1(this.f73700k, this.f73701l, dVar);
        e1Var.f73699j = obj;
        return e1Var;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f73698i;
        if (i10 == 0) {
            tu.a0.throwOnFailure(obj);
            u1.k0 k0Var = (u1.k0) this.f73699j;
            d1 d1Var = new d1(this.f73701l);
            this.f73698i = 1;
            if (h1.access$detectNonConsumingTap(this.f73700k, k0Var, d1Var, this) == coroutine_suspended) {
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
        return ((e1) create(k0Var, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
