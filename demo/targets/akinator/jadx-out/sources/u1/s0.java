package u1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class s0 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f87670i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f87671j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ kv.l f87672k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(kv.l lVar, zu.d dVar) {
        super(2, dVar);
        this.f87672k = lVar;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        s0 s0Var = new s0(this.f87672k, dVar);
        s0Var.f87671j = obj;
        return s0Var;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f87670i;
        if (i10 == 0) {
            tu.a0.throwOnFailure(obj);
            k0 k0Var = (k0) this.f87671j;
            k0Var.setInterceptOutOfBoundsChildEvents(true);
            r0 r0Var = new r0(this.f87672k, null);
            this.f87670i = 1;
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
    public final Object invoke(k0 k0Var, zu.d<? super tu.x0> dVar) {
        return ((s0) create(k0Var, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
