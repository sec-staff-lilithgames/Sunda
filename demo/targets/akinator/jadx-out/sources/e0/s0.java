package e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class s0 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f53297i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f53298j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ kv.l f53299k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ kv.p f53300l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ kv.a f53301m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ kv.a f53302n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(kv.a aVar, kv.a aVar2, kv.l lVar, kv.p pVar, zu.d dVar) {
        super(2, dVar);
        this.f53299k = lVar;
        this.f53300l = pVar;
        this.f53301m = aVar;
        this.f53302n = aVar2;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        s0 s0Var = new s0(this.f53301m, this.f53302n, this.f53299k, this.f53300l, dVar);
        s0Var.f53298j = obj;
        return s0Var;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f53297i;
        if (i10 == 0) {
            tu.a0.throwOnFailure(obj);
            u1.k0 k0Var = (u1.k0) this.f53298j;
            r0 r0Var = new r0(this.f53301m, this.f53302n, this.f53299k, this.f53300l, null);
            this.f53297i = 1;
            if (k0Var.awaitPointerEventScope(r0Var, this) == coroutine_suspended) {
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
        return ((s0) create(k0Var, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
