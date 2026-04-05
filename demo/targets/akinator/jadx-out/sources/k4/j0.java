package k4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class j0 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public Throwable f70374i;

    /* renamed from: j, reason: collision with root package name */
    public int f70375j;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ boolean f70376k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ p f70377l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f70378m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(p pVar, int i10, zu.d dVar) {
        super(2, dVar);
        this.f70377l = pVar;
        this.f70378m = i10;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        j0 j0Var = new j0(this.f70377l, this.f70378m, dVar);
        j0Var.f70376k = ((Boolean) obj).booleanValue();
        return j0Var;
    }

    @Override // kv.p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke(((Boolean) obj).booleanValue(), (zu.d<? super tu.v>) obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v9 */
    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Throwable th2;
        int iIntValue;
        boolean z10;
        q2 q2Var;
        boolean z11;
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        boolean z12 = this.f70375j;
        p pVar = this.f70377l;
        try {
        } catch (Throwable th3) {
            if (z12 != 0) {
                l1 l1VarA = pVar.a();
                this.f70374i = th3;
                this.f70376k = z12;
                this.f70375j = 2;
                Object version = l1VarA.getVersion(this);
                if (version != coroutine_suspended) {
                    z10 = z12;
                    th2 = th3;
                    obj = version;
                }
            } else {
                boolean z13 = z12;
                th2 = th3;
                iIntValue = this.f70378m;
                z10 = z13;
            }
        }
        if (z12 == 0) {
            tu.a0.throwOnFailure(obj);
            boolean z14 = this.f70376k;
            this.f70376k = z14;
            this.f70375j = 1;
            obj = p.access$readDataOrHandleCorruption(pVar, z14, this);
            z12 = z14;
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (z12 != 1) {
                if (z12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z10 = this.f70376k;
                th2 = this.f70374i;
                tu.a0.throwOnFailure(obj);
                iIntValue = ((Number) obj).intValue();
                d2 d2Var = new d2(th2, iIntValue);
                z11 = z10;
                q2Var = d2Var;
                return tu.e0.to(q2Var, bv.b.boxBoolean(z11));
            }
            boolean z15 = this.f70376k;
            tu.a0.throwOnFailure(obj);
            z12 = z15;
        }
        q2Var = (q2) obj;
        z11 = z12;
        return tu.e0.to(q2Var, bv.b.boxBoolean(z11));
    }

    public final Object invoke(boolean z10, zu.d<? super tu.v> dVar) {
        return ((j0) create(Boolean.valueOf(z10), dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
