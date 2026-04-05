package e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class u2 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f53327i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f53328j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ v2 f53329k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ kv.p f53330l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2(v2 v2Var, kv.p pVar, zu.d dVar) {
        super(2, dVar);
        this.f53329k = v2Var;
        this.f53330l = pVar;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        u2 u2Var = new u2(this.f53329k, this.f53330l, dVar);
        u2Var.f53328j = obj;
        return u2Var;
    }

    @Override // kv.p
    public final Object invoke(d3 d3Var, zu.d<? super tu.x0> dVar) {
        return ((u2) create(d3Var, dVar)).invokeSuspend(tu.x0.f87415a);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f53327i;
        if (i10 == 0) {
            tu.a0.throwOnFailure(obj);
            d3 d3Var = (d3) this.f53328j;
            v2 v2Var = this.f53329k;
            v2Var.setLatestScrollScope(d3Var);
            this.f53327i = 1;
            if (this.f53330l.invoke(v2Var, this) == coroutine_suspended) {
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
}
