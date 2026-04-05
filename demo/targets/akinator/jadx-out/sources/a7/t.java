package a7;

import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import tu.a0;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class t extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f4139i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f4140j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ l7.i f4141k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ q f4142l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(q qVar, l7.i iVar, zu.d dVar) {
        super(2, dVar);
        this.f4141k = iVar;
        this.f4142l = qVar;
    }

    @Override // bv.a
    public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
        t tVar = new t(this.f4142l, this.f4141k, dVar);
        tVar.f4140j = obj;
        return tVar;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f4139i;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a0.throwOnFailure(obj);
            return obj;
        }
        a0.throwOnFailure(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.f4140j;
        MainCoroutineDispatcher immediate = Dispatchers.getMain().getImmediate();
        q qVar = this.f4142l;
        l7.i iVar = this.f4141k;
        Deferred<? extends l7.k> deferredAsync$default = BuildersKt__Builders_commonKt.async$default(coroutineScope, immediate, null, new s(qVar, iVar, null), 2, null);
        if (iVar.getTarget() instanceof n7.e) {
            q7.n.getRequestManager(((n7.e) iVar.getTarget()).getView()).getDisposable(deferredAsync$default);
        }
        this.f4139i = 1;
        Object objAwait = deferredAsync$default.await(this);
        return objAwait == coroutine_suspended ? coroutine_suspended : objAwait;
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super l7.k> dVar) {
        return ((t) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
    }
}
