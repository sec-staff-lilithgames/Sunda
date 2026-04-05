package lb;

import kotlinx.coroutines.CoroutineScope;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class r extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f72961i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ e f72962j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Integer f72963k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(e eVar, Integer num, zu.d dVar) {
        super(2, dVar);
        this.f72962j = eVar;
        this.f72963k = num;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        return new r(this.f72962j, this.f72963k, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f72961i;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            tu.a0.throwOnFailure(obj);
            return obj;
        }
        tu.a0.throwOnFailure(obj);
        this.f72961i = 1;
        Object objExcludePropositionAsync = this.f72962j.excludePropositionAsync(this.f72963k, this);
        return objExcludePropositionAsync == coroutine_suspended ? coroutine_suspended : objExcludePropositionAsync;
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super Integer> dVar) {
        return ((r) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
