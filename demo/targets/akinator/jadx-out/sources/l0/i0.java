package l0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class i0 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f72098i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f72099j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ z0 f72100k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(z0 z0Var, zu.d dVar) {
        super(2, dVar);
        this.f72100k = z0Var;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        i0 i0Var = new i0(this.f72100k, dVar);
        i0Var.f72099j = obj;
        return i0Var;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f72098i;
        if (i10 == 0) {
            tu.a0.throwOnFailure(obj);
            u1.k0 k0Var = (u1.k0) this.f72099j;
            h0 h0Var = new h0(this.f72100k, null);
            this.f72098i = 1;
            if (k0Var.awaitPointerEventScope(h0Var, this) == coroutine_suspended) {
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
        return ((i0) create(k0Var, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
