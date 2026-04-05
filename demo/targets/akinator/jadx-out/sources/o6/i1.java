package o6;

import kotlinx.coroutines.CoroutineScope;
import o6.h1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class i1 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f77928i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ h1 f77929j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(h1 h1Var, zu.d dVar) {
        super(2, dVar);
        this.f77929j = h1Var;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        return new i1(this.f77929j, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f77928i;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            tu.a0.throwOnFailure(obj);
            return obj;
        }
        tu.a0.throwOnFailure(obj);
        this.f77928i = 1;
        Object objAccess$runWorker = h1.access$runWorker(this.f77929j, this);
        return objAccess$runWorker == coroutine_suspended ? coroutine_suspended : objAccess$runWorker;
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super h1.b> dVar) {
        return ((i1) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
