package p0;

import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class j5 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f80289i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Flow f80290j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ d3 f80291k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j5(Flow flow, d3 d3Var, zu.d dVar) {
        super(2, dVar);
        this.f80290j = flow;
        this.f80291k = d3Var;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        return new j5(this.f80290j, this.f80291k, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f80289i;
        if (i10 == 0) {
            tu.a0.throwOnFailure(obj);
            i5 i5Var = new i5(this.f80291k);
            this.f80289i = 1;
            if (this.f80290j.collect(i5Var, this) == coroutine_suspended) {
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
        return ((j5) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
