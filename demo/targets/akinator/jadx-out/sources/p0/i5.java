package p0;

import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class i5 implements FlowCollector {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d3 f80258b;

    public i5(d3 d3Var) {
        this.f80258b = d3Var;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, zu.d<? super tu.x0> dVar) {
        this.f80258b.setValue(obj);
        return tu.x0.f87415a;
    }
}
