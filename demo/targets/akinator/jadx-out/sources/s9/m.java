package s9;

import kotlinx.coroutines.CoroutineScope;
import tu.a0;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class m extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ g f85545i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(g gVar, zu.d dVar) {
        super(2, dVar);
        this.f85545i = gVar;
    }

    @Override // bv.a
    public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
        return new m(this.f85545i, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        av.e.getCOROUTINE_SUSPENDED();
        a0.throwOnFailure(obj);
        jb.h.f69257d.sharedInstance().incMetricCompteur("added_photo");
        g gVar = this.f85545i;
        g.access$getBinding(gVar).precedant.setVisibility(4);
        g.access$getBinding(gVar).suivant.setVisibility(4);
        gVar.displayFinalFragment();
        return x0.f87415a;
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
        return ((m) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
    }
}
