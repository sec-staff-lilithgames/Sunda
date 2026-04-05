package o5;

import kotlinx.coroutines.CoroutineScope;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class g1 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f77576i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ y0 f77577j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ kv.p f77578k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(y0 y0Var, kv.p pVar, zu.d dVar) {
        super(2, dVar);
        this.f77577j = y0Var;
        this.f77578k = pVar;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        return new g1(this.f77577j, this.f77578k, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f77576i;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            tu.a0.throwOnFailure(obj);
            return obj;
        }
        tu.a0.throwOnFailure(obj);
        this.f77576i = 1;
        Object objUseConnection$room_runtime_release = this.f77577j.useConnection$room_runtime_release(true, this.f77578k, this);
        return objUseConnection$room_runtime_release == coroutine_suspended ? coroutine_suspended : objUseConnection$room_runtime_release;
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<Object> dVar) {
        return ((g1) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
