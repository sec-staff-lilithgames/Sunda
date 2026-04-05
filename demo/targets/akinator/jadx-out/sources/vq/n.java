package vq;

import br.c2;
import br.e1;
import br.h0;
import kotlinx.coroutines.CoroutineScope;
import tu.a0;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class n extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f89596i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ e1 f89597j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ c f89598k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ a f89599l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(e1 e1Var, a aVar, c cVar, zu.d dVar) {
        super(2, dVar);
        this.f89597j = e1Var;
        this.f89598k = cVar;
        this.f89599l = aVar;
    }

    @Override // kv.p
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
        return ((n) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
    }

    @Override // bv.a
    public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
        c cVar = this.f89598k;
        return new n(this.f89597j, this.f89599l, cVar, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f89596i;
        if (i10 == 0) {
            a0.throwOnFailure(obj);
            e1 e1Var = this.f89597j;
            boolean z10 = e1Var instanceof c2;
            a aVar = this.f89599l;
            if (z10) {
                this.f89596i = 1;
                if (this.f89598k.a((c2) e1Var, aVar, (zu.d<? super x0>) this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                aVar.onError(new h0("Unsupported media source type: " + e1Var));
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
