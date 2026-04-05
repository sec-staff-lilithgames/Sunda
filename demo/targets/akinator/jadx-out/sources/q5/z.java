package q5;

import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CoroutineScope;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class z extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f82519i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ CompletableDeferred f82520j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(CompletableDeferred completableDeferred, zu.d dVar) {
        super(2, dVar);
        this.f82520j = completableDeferred;
    }

    @Override // bv.a
    public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
        return new z(this.f82520j, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f82519i;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            tu.a0.throwOnFailure(obj);
            return obj;
        }
        tu.a0.throwOnFailure(obj);
        this.f82519i = 1;
        Object objAwait = this.f82520j.await(this);
        return objAwait == coroutine_suspended ? coroutine_suspended : objAwait;
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<Object> dVar) {
        return ((z) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
    }
}
