package a2;

import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class d6 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f3521i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ StateFlow f3522j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ b4 f3523k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d6(StateFlow stateFlow, b4 b4Var, zu.d dVar) {
        super(2, dVar);
        this.f3522j = stateFlow;
        this.f3523k = b4Var;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        return new d6(this.f3522j, this.f3523k, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f3521i;
        if (i10 == 0) {
            tu.a0.throwOnFailure(obj);
            c6 c6Var = new c6(this.f3523k);
            this.f3521i = 1;
            if (this.f3522j.collect(c6Var, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            tu.a0.throwOnFailure(obj);
        }
        throw new tu.k();
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super tu.x0> dVar) {
        return ((d6) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
