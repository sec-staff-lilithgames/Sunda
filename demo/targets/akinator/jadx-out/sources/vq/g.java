package vq;

import br.h0;
import kotlinx.coroutines.CoroutineScope;
import tu.a0;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class g extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ a f89572i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ h0 f89573j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(a aVar, h0 h0Var, zu.d dVar) {
        super(2, dVar);
        this.f89572i = aVar;
        this.f89573j = h0Var;
    }

    @Override // kv.p
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
        return ((g) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
    }

    @Override // bv.a
    public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
        return new g(this.f89572i, this.f89573j, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        av.e.getCOROUTINE_SUSPENDED();
        a0.throwOnFailure(obj);
        this.f89572i.onError(this.f89573j);
        return x0.f87415a;
    }
}
