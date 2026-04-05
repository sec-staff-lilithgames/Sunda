package e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class z0 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f53431i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f53432j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ kv.l f53433k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ kv.p f53434l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ kv.a f53435m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ kv.a f53436n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(kv.a aVar, kv.a aVar2, kv.l lVar, kv.p pVar, zu.d dVar) {
        super(2, dVar);
        this.f53433k = lVar;
        this.f53434l = pVar;
        this.f53435m = aVar;
        this.f53436n = aVar2;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        z0 z0Var = new z0(this.f53435m, this.f53436n, this.f53433k, this.f53434l, dVar);
        z0Var.f53432j = obj;
        return z0Var;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f53431i;
        if (i10 == 0) {
            tu.a0.throwOnFailure(obj);
            u1.k0 k0Var = (u1.k0) this.f53432j;
            y0 y0Var = new y0(this.f53435m, this.f53436n, this.f53433k, this.f53434l, null);
            this.f53431i = 1;
            if (k0Var.awaitPointerEventScope(y0Var, this) == coroutine_suspended) {
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
        return ((z0) create(k0Var, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
