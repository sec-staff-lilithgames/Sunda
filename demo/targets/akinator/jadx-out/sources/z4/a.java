package z4;

import kotlinx.coroutines.flow.FlowCollector;
import p0.d3;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class a implements FlowCollector {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d3 f97516b;

    public a(d3 d3Var) {
        this.f97516b = d3Var;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, zu.d<? super x0> dVar) {
        this.f97516b.setValue(obj);
        return x0.f87415a;
    }
}
