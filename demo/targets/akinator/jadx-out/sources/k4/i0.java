package k4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class i0 extends bv.n implements kv.l {

    /* renamed from: i, reason: collision with root package name */
    public Throwable f70363i;

    /* renamed from: j, reason: collision with root package name */
    public int f70364j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ p f70365k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(p pVar, zu.d dVar) {
        super(1, dVar);
        this.f70365k = pVar;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(zu.d<?> dVar) {
        return new i0(this.f70365k, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Throwable th2;
        q2 d2Var;
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f70364j;
        p pVar = this.f70365k;
        try {
        } catch (Throwable th3) {
            l1 l1VarA = pVar.a();
            this.f70363i = th3;
            this.f70364j = 2;
            Object version = l1VarA.getVersion(this);
            if (version != coroutine_suspended) {
                th2 = th3;
                obj = version;
            }
        }
        if (i10 == 0) {
            tu.a0.throwOnFailure(obj);
            this.f70364j = 1;
            obj = p.access$readDataOrHandleCorruption(pVar, true, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                th2 = this.f70363i;
                tu.a0.throwOnFailure(obj);
                d2Var = new d2(th2, ((Number) obj).intValue());
                return tu.e0.to(d2Var, bv.b.boxBoolean(true));
            }
            tu.a0.throwOnFailure(obj);
        }
        d2Var = (q2) obj;
        return tu.e0.to(d2Var, bv.b.boxBoolean(true));
    }

    @Override // kv.l
    public final Object invoke(zu.d<? super tu.v> dVar) {
        return ((i0) create(dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
