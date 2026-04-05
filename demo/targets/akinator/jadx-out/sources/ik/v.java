package ik;

import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class v extends bv.n implements kv.p {
    @Override // bv.a
    public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
        return new v(2, dVar);
    }

    @Override // kv.p
    public final Object invoke(m mVar, zu.d<? super m> dVar) {
        return ((v) create(mVar, dVar)).invokeSuspend(x0.f87415a);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        av.e.getCOROUTINE_SUSPENDED();
        tu.a0.throwOnFailure(obj);
        return n.f59708a.getDefaultValue();
    }
}
