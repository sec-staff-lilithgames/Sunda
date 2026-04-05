package ek;

import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class o1 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f54605i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ v1 f54606j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(v1 v1Var, zu.d dVar) {
        super(2, dVar);
        this.f54606j = v1Var;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        return new o1(this.f54606j, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f54605i;
        if (i10 == 0) {
            tu.a0.throwOnFailure(obj);
            v1 v1Var = this.f54606j;
            Flow flowM5171catch = FlowKt.m5171catch(v1Var.f54654e.getData(), new m1(v1Var, null));
            n1 n1Var = new n1(v1Var);
            this.f54605i = 1;
            if (flowM5171catch.collect(n1Var, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            tu.a0.throwOnFailure(obj);
        }
        return tu.x0.f87415a;
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super tu.x0> dVar) {
        return ((o1) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
