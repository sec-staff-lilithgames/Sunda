package a2;

import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class c6 implements FlowCollector {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b4 f3485b;

    public c6(b4 b4Var) {
        this.f3485b = b4Var;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public /* bridge */ /* synthetic */ Object emit(Object obj, zu.d dVar) {
        return emit(((Number) obj).floatValue(), (zu.d<? super tu.x0>) dVar);
    }

    public final Object emit(float f10, zu.d<? super tu.x0> dVar) {
        this.f3485b.setScaleFactor(f10);
        return tu.x0.f87415a;
    }
}
