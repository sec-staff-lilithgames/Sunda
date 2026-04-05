package b0;

import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class j implements FlowCollector {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p0.j2 f8389b;

    public j(p0.j2 j2Var) {
        this.f8389b = j2Var;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public /* bridge */ /* synthetic */ Object emit(Object obj, zu.d dVar) {
        return emit(((Boolean) obj).booleanValue(), (zu.d<? super tu.x0>) dVar);
    }

    public final Object emit(boolean z10, zu.d<? super tu.x0> dVar) {
        this.f8389b.setValue(bv.b.boxBoolean(z10));
        return tu.x0.f87415a;
    }
}
