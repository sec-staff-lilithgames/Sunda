package s9;

import kotlin.jvm.internal.e0;
import kotlinx.coroutines.CoroutineScope;
import s9.x;
import tu.a0;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class i extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ g f85537i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(g gVar, zu.d dVar) {
        super(2, dVar);
        this.f85537i = gVar;
    }

    @Override // bv.a
    public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
        return new i(this.f85537i, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        av.e.getCOROUTINE_SUSPENDED();
        a0.throwOnFailure(obj);
        g gVar = this.f85537i;
        if (gVar.f85531i == null) {
            gVar.displayFinalFragment();
            return x0.f87415a;
        }
        x.a aVar = x.f85568j;
        lb.b bVar = gVar.f85531i;
        e0.checkNotNull(bVar);
        x xVarNewInstance = aVar.newInstance(bVar);
        xVarNewInstance.setManager(gVar);
        return bv.b.boxInt(gVar.getParentFragmentManager().beginTransaction().add(g.access$getBinding(gVar).containerFragmentAddMagic.getId(), xVarNewInstance).commit());
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<Object> dVar) {
        return ((i) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
    }
}
