package z4;

import bv.n;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kv.p;
import p0.d3;
import tu.a0;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class c extends n implements p {

    /* renamed from: i, reason: collision with root package name */
    public int f97518i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Flow f97519j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ d3 f97520k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Flow flow, d3 d3Var, zu.d dVar) {
        super(2, dVar);
        this.f97519j = flow;
        this.f97520k = d3Var;
    }

    @Override // bv.a
    public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
        return new c(this.f97519j, this.f97520k, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f97518i;
        if (i10 == 0) {
            a0.throwOnFailure(obj);
            b bVar = new b(this.f97520k);
            this.f97518i = 1;
            if (this.f97519j.collect(bVar, this) == coroutine_suspended) {
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
        return ((c) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
    }
}
