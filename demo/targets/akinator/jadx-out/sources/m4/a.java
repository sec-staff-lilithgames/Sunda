package m4;

import bv.n;
import kv.p;
import tu.a0;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class a extends n implements p {
    @Override // bv.a
    public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
        return new a(2, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        av.e.getCOROUTINE_SUSPENDED();
        a0.throwOnFailure(obj);
        return bv.b.boxBoolean(true);
    }

    @Override // kv.p
    public final Object invoke(Object obj, zu.d<? super Boolean> dVar) {
        return ((a) create(obj, dVar)).invokeSuspend(x0.f87415a);
    }
}
