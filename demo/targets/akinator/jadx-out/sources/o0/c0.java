package o0;

import kotlinx.coroutines.CoroutineScope;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class c0 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f77309i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ d0 f77310j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ c0.n f77311k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(d0 d0Var, c0.n nVar, zu.d dVar) {
        super(2, dVar);
        this.f77310j = d0Var;
        this.f77311k = nVar;
    }

    @Override // bv.a
    public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
        return new c0(this.f77310j, this.f77311k, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f77309i;
        if (i10 == 0) {
            tu.a0.throwOnFailure(obj);
            c0.e eVar = this.f77310j.f77319c;
            Float fBoxFloat = bv.b.boxFloat(0.0f);
            this.f77309i = 1;
            if (c0.e.animateTo$default(eVar, fBoxFloat, this.f77311k, null, null, this, 12, null) == coroutine_suspended) {
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
        return ((c0) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
    }
}
