package bn;

import av.e;
import bv.n;
import io.bidmachine.BidMachine;
import kotlinx.coroutines.CoroutineScope;
import kv.p;
import tu.a0;
import tu.m;
import tu.x0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class a extends n implements p {
    @Override // bv.a
    public final d<x0> create(Object obj, d<?> dVar) {
        return new a(2, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        e.getCOROUTINE_SUSPENDED();
        a0.throwOnFailure(obj);
        nm.a.d(BidMachine.NAME, "Kotlin runtime version is " + m.f87391g);
        return x0.f87415a;
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, d<? super x0> dVar) {
        return ((a) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
    }
}
