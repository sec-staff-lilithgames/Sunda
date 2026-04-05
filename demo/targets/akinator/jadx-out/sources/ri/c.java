package ri;

import bv.n;
import kv.l;
import kv.p;
import tu.a0;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class c extends n implements p {

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f84408i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ l f84409j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(l lVar, zu.d dVar) {
        super(2, dVar);
        this.f84409j = lVar;
    }

    @Override // bv.a
    public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
        c cVar = new c(this.f84409j, dVar);
        cVar.f84408i = obj;
        return cVar;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        av.e.getCOROUTINE_SUSPENDED();
        a0.throwOnFailure(obj);
        this.f84409j.invoke((o4.d) this.f84408i);
        return x0.f87415a;
    }

    @Override // kv.p
    public final Object invoke(o4.d dVar, zu.d<? super x0> dVar2) {
        return ((c) create(dVar, dVar2)).invokeSuspend(x0.f87415a);
    }
}
