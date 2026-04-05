package e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class j2 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f53126i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f53127j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ k2 f53128k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ kv.p f53129l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(k2 k2Var, kv.p pVar, zu.d dVar) {
        super(2, dVar);
        this.f53128k = k2Var;
        this.f53129l = pVar;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        j2 j2Var = new j2(this.f53128k, this.f53129l, dVar);
        j2Var.f53127j = obj;
        return j2Var;
    }

    @Override // kv.p
    public final Object invoke(i1 i1Var, zu.d<? super tu.x0> dVar) {
        return ((j2) create(i1Var, dVar)).invokeSuspend(tu.x0.f87415a);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f53126i;
        if (i10 == 0) {
            tu.a0.throwOnFailure(obj);
            i1 i1Var = (i1) this.f53127j;
            k2 k2Var = this.f53128k;
            k2Var.setLatestConsumptionScope(i1Var);
            this.f53126i = 1;
            if (this.f53129l.invoke(k2Var, this) == coroutine_suspended) {
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
