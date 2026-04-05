package vq;

import br.e1;
import kotlinx.coroutines.CoroutineScope;
import tu.a0;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class i extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f89576i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ c f89577j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ e1 f89578k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ a f89579l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(e1 e1Var, a aVar, c cVar, zu.d dVar) {
        super(2, dVar);
        this.f89577j = cVar;
        this.f89578k = e1Var;
        this.f89579l = aVar;
    }

    @Override // kv.p
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
        return ((i) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
    }

    @Override // bv.a
    public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
        return new i(this.f89578k, this.f89579l, this.f89577j, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f89576i;
        if (i10 == 0) {
            a0.throwOnFailure(obj);
            this.f89576i = 1;
            if (this.f89577j.a(this.f89578k, this.f89579l, this) == coroutine_suspended) {
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
}
