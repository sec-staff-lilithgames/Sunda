package qb;

import kotlinx.coroutines.CoroutineScope;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class e0 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f82683i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ d0 f82684j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(d0 d0Var, zu.d dVar) {
        super(2, dVar);
        this.f82684j = d0Var;
    }

    @Override // bv.a
    public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
        return new e0(this.f82684j, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f82683i;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            tu.a0.throwOnFailure(obj);
            return obj;
        }
        tu.a0.throwOnFailure(obj);
        this.f82683i = 1;
        Object objCallAsync = this.f82684j.callAsync(this);
        return objCallAsync == coroutine_suspended ? coroutine_suspended : objCallAsync;
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super Integer> dVar) {
        return ((e0) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
    }
}
