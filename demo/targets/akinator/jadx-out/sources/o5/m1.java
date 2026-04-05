package o5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class m1 extends bv.n implements kv.l {

    /* renamed from: i, reason: collision with root package name */
    public int f77657i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ y0 f77658j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ kv.l f77659k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(y0 y0Var, kv.l lVar, zu.d dVar) {
        super(1, dVar);
        this.f77658j = y0Var;
        this.f77659k = lVar;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(zu.d<?> dVar) {
        return new m1(this.f77658j, this.f77659k, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f77657i;
        y0 y0Var = this.f77658j;
        try {
            if (i10 == 0) {
                tu.a0.throwOnFailure(obj);
                y0Var.beginTransaction();
                kv.l lVar = this.f77659k;
                this.f77657i = 1;
                obj = lVar.invoke(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                tu.a0.throwOnFailure(obj);
            }
            y0Var.setTransactionSuccessful();
            return obj;
        } finally {
            y0Var.endTransaction();
        }
    }

    @Override // kv.l
    public final Object invoke(zu.d<Object> dVar) {
        return ((m1) create(dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
