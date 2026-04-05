package ik;

import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class y extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ m f59729i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(m mVar, zu.d dVar) {
        super(2, dVar);
        this.f59729i = mVar;
    }

    @Override // bv.a
    public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
        return new y(this.f59729i, dVar);
    }

    @Override // kv.p
    public final Object invoke(m mVar, zu.d<? super m> dVar) {
        return ((y) create(mVar, dVar)).invokeSuspend(x0.f87415a);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        av.e.getCOROUTINE_SUSPENDED();
        tu.a0.throwOnFailure(obj);
        return this.f59729i;
    }
}
