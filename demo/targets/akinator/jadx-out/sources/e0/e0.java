package e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class e0 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f53022i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f53023j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ kv.l f53024k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ kv.p f53025l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ kv.a f53026m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ kv.a f53027n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(kv.a aVar, kv.a aVar2, kv.l lVar, kv.p pVar, zu.d dVar) {
        super(2, dVar);
        this.f53024k = lVar;
        this.f53025l = pVar;
        this.f53026m = aVar;
        this.f53027n = aVar2;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        e0 e0Var = new e0(this.f53026m, this.f53027n, this.f53024k, this.f53025l, dVar);
        e0Var.f53023j = obj;
        return e0Var;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f53022i;
        if (i10 == 0) {
            tu.a0.throwOnFailure(obj);
            u1.k0 k0Var = (u1.k0) this.f53023j;
            d0 d0Var = new d0(this.f53026m, this.f53027n, this.f53024k, this.f53025l, null);
            this.f53022i = 1;
            if (k0Var.awaitPointerEventScope(d0Var, this) == coroutine_suspended) {
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
        return ((e0) create(k0Var, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
