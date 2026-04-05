package r6;

import kotlinx.coroutines.flow.FlowCollector;
import tu.x0;
import v6.b0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class m implements FlowCollector {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f83837b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b0 f83838c;

    public m(j jVar, b0 b0Var) {
        this.f83837b = jVar;
        this.f83838c = b0Var;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public /* bridge */ /* synthetic */ Object emit(Object obj, zu.d dVar) {
        return emit((c) obj, (zu.d<? super x0>) dVar);
    }

    public final Object emit(c cVar, zu.d<? super x0> dVar) {
        this.f83837b.onConstraintsStateChanged(this.f83838c, cVar);
        return x0.f87415a;
    }
}
