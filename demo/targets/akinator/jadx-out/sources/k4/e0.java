package k4;

import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class e0 implements FlowCollector {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f70313b;

    public e0(p pVar) {
        this.f70313b = pVar;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public /* bridge */ /* synthetic */ Object emit(Object obj, zu.d dVar) {
        return emit((tu.x0) obj, (zu.d<? super tu.x0>) dVar);
    }

    public final Object emit(tu.x0 x0Var, zu.d<? super tu.x0> dVar) {
        Object objAccess$readDataAndUpdateCache;
        p pVar = this.f70313b;
        return ((pVar.f70445h.getCurrentState() instanceof j1) || (objAccess$readDataAndUpdateCache = p.access$readDataAndUpdateCache(pVar, true, dVar)) != av.e.getCOROUTINE_SUSPENDED()) ? tu.x0.f87415a : objAccess$readDataAndUpdateCache;
    }
}
