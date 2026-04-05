package o5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class y2 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f77848i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f77849j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ j2 f77850k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y2(j2 j2Var, zu.d dVar) {
        super(2, dVar);
        this.f77850k = j2Var;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        y2 y2Var = new y2(this.f77850k, dVar);
        y2Var.f77849j = obj;
        return y2Var;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        h2 h2Var;
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f77848i;
        tu.x0 x0Var = tu.x0.f87415a;
        if (i10 == 0) {
            tu.a0.throwOnFailure(obj);
            h2Var = (h2) this.f77849j;
            this.f77849j = h2Var;
            this.f77848i = 1;
            obj = h2Var.inTransaction(this);
            if (obj != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i10 != 1) {
            if (i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            tu.a0.throwOnFailure(obj);
            return x0Var;
        }
        h2Var = (h2) this.f77849j;
        tu.a0.throwOnFailure(obj);
        if (!((Boolean) obj).booleanValue()) {
            j2 j2Var = this.f77850k;
            m0[] tablesToSync$room_runtime_release = j2Var.f77606h.getTablesToSync$room_runtime_release();
            if (tablesToSync$room_runtime_release != null) {
                g2 g2Var = g2.f77580c;
                x2 x2Var = new x2(tablesToSync$room_runtime_release, j2Var, h2Var, null);
                this.f77849j = null;
                this.f77848i = 2;
                if (h2Var.withTransaction(g2Var, x2Var, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        }
        return x0Var;
    }

    @Override // kv.p
    public final Object invoke(h2 h2Var, zu.d<? super tu.x0> dVar) {
        return ((y2) create(h2Var, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
