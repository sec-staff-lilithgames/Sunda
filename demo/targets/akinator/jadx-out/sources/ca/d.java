package ca;

import kotlinx.coroutines.CoroutineScope;
import tu.a0;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class d extends bv.n implements kv.p {
    @Override // bv.a
    public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
        return new d(2, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        av.e.getCOROUTINE_SUSPENDED();
        a0.throwOnFailure(obj);
        new qa.a().configureAndCall();
        return x0.f87415a;
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
        return ((d) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
    }
}
