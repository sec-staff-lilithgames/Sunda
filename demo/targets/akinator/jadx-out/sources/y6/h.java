package y6;

import bv.n;
import kv.p;
import n6.c0;
import tu.a0;
import tu.x0;
import v6.b0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class h extends n implements p {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ b0 f94112i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(b0 b0Var, zu.d dVar) {
        super(2, dVar);
        this.f94112i = b0Var;
    }

    @Override // bv.a
    public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
        return new h(this.f94112i, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        av.e.getCOROUTINE_SUSPENDED();
        a0.throwOnFailure(obj);
        String str = i.f94113a;
        c0.get().debug(str, "Constraints changed for " + this.f94112i);
        return x0.f87415a;
    }

    @Override // kv.p
    public final Object invoke(r6.c cVar, zu.d<? super x0> dVar) {
        return ((h) create(cVar, dVar)).invokeSuspend(x0.f87415a);
    }
}
