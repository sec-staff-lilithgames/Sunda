package k4;

import k4.o1;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class r0 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f70496i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f70497j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ p f70498k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ kv.p f70499l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(p pVar, kv.p pVar2, zu.d dVar) {
        super(2, dVar);
        this.f70498k = pVar;
        this.f70499l = pVar2;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        r0 r0Var = new r0(this.f70498k, this.f70499l, dVar);
        r0Var.f70497j = obj;
        return r0Var;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f70496i;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            tu.a0.throwOnFailure(obj);
            return obj;
        }
        tu.a0.throwOnFailure(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.f70497j;
        CompletableDeferred completableDeferredCompletableDeferred$default = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
        p pVar = this.f70498k;
        pVar.f70449l.offer(new o1.a(this.f70499l, completableDeferredCompletableDeferred$default, pVar.f70445h.getCurrentState(), coroutineScope.getCoroutineContext()));
        this.f70496i = 1;
        Object objAwait = completableDeferredCompletableDeferred$default.await(this);
        return objAwait == coroutine_suspended ? coroutine_suspended : objAwait;
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<Object> dVar) {
        return ((r0) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
