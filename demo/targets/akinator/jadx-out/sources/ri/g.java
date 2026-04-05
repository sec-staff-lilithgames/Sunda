package ri;

import bv.n;
import kv.p;
import o4.j;
import tu.a0;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class g extends n implements p {

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f84419i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ j.a f84420j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f84421k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(j.a aVar, Object obj, zu.d dVar) {
        super(2, dVar);
        this.f84420j = aVar;
        this.f84421k = obj;
    }

    @Override // bv.a
    public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
        g gVar = new g(this.f84420j, this.f84421k, dVar);
        gVar.f84419i = obj;
        return gVar;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        av.e.getCOROUTINE_SUSPENDED();
        a0.throwOnFailure(obj);
        ((o4.d) this.f84419i).set(this.f84420j, this.f84421k);
        return x0.f87415a;
    }

    @Override // kv.p
    public final Object invoke(o4.d dVar, zu.d<? super x0> dVar2) {
        return ((g) create(dVar, dVar2)).invokeSuspend(x0.f87415a);
    }
}
