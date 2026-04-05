package lb;

import kotlinx.coroutines.CoroutineScope;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class m extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f72919i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ e f72920j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(e eVar, zu.d dVar) {
        super(2, dVar);
        this.f72920j = eVar;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        return new m(this.f72920j, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f72919i;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            tu.a0.throwOnFailure(obj);
            return obj;
        }
        tu.a0.throwOnFailure(obj);
        this.f72919i = 1;
        Object objCancelSessionAsync = this.f72920j.cancelSessionAsync(this);
        return objCancelSessionAsync == coroutine_suspended ? coroutine_suspended : objCancelSessionAsync;
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super Integer> dVar) {
        return ((m) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
