package k4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class b0 extends bv.n implements kv.l {

    /* renamed from: i, reason: collision with root package name */
    public int f70281i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ kv.l f70282j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(kv.l lVar, zu.d dVar) {
        super(1, dVar);
        this.f70282j = lVar;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(zu.d<?> dVar) {
        return new b0(this.f70282j, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f70281i;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            tu.a0.throwOnFailure(obj);
            return obj;
        }
        tu.a0.throwOnFailure(obj);
        this.f70281i = 1;
        Object objInvoke = this.f70282j.invoke(this);
        return objInvoke == coroutine_suspended ? coroutine_suspended : objInvoke;
    }

    @Override // kv.l
    public final Object invoke(zu.d<Object> dVar) {
        return ((b0) create(dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
