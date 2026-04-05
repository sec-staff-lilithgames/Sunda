package o5;

import kotlinx.coroutines.CoroutineScope;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class i1 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f77593i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ y0 f77594j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ kv.p f77595k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(y0 y0Var, kv.p pVar, zu.d dVar) {
        super(2, dVar);
        this.f77594j = y0Var;
        this.f77595k = pVar;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        return new i1(this.f77594j, this.f77595k, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f77593i;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            tu.a0.throwOnFailure(obj);
            return obj;
        }
        tu.a0.throwOnFailure(obj);
        this.f77593i = 1;
        Object objUseConnection$room_runtime_release = this.f77594j.useConnection$room_runtime_release(false, this.f77595k, this);
        return objUseConnection$room_runtime_release == coroutine_suspended ? coroutine_suspended : objUseConnection$room_runtime_release;
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<Object> dVar) {
        return ((i1) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
