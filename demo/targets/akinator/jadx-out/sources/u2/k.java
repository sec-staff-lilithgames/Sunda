package u2;

import kotlinx.coroutines.CoroutineScope;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class k extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f87737i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ o f87738j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ long f87739k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(o oVar, long j10, zu.d dVar) {
        super(2, dVar);
        this.f87738j = oVar;
        this.f87739k = j10;
    }

    @Override // bv.a
    public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
        return new k(this.f87738j, this.f87739k, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f87737i;
        if (i10 == 0) {
            tu.a0.throwOnFailure(obj);
            t1.e eVar = this.f87738j.f87743b;
            this.f87737i = 1;
            if (eVar.m7017dispatchPreFlingQWom1Mo(this.f87739k, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            tu.a0.throwOnFailure(obj);
        }
        return x0.f87415a;
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
        return ((k) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
    }
}
