package r6;

import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kv.p;
import tu.a0;
import tu.x0;
import v6.b0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class n extends bv.n implements p {

    /* renamed from: i, reason: collision with root package name */
    public int f83839i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ l f83840j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ b0 f83841k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ j f83842l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(l lVar, b0 b0Var, j jVar, zu.d dVar) {
        super(2, dVar);
        this.f83840j = lVar;
        this.f83841k = b0Var;
        this.f83842l = jVar;
    }

    @Override // bv.a
    public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
        return new n(this.f83840j, this.f83841k, this.f83842l, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f83839i;
        if (i10 == 0) {
            a0.throwOnFailure(obj);
            l lVar = this.f83840j;
            b0 b0Var = this.f83841k;
            Flow<c> flowTrack = lVar.track(b0Var);
            m mVar = new m(this.f83842l, b0Var);
            this.f83839i = 1;
            if (flowTrack.collect(mVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a0.throwOnFailure(obj);
        }
        return x0.f87415a;
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
        return ((n) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
    }
}
