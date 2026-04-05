package f0;

import java.util.ArrayList;
import kotlinx.coroutines.flow.FlowCollector;
import p0.j2;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class f implements FlowCollector {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f55260b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j2 f55261c;

    public f(ArrayList arrayList, j2 j2Var) {
        this.f55260b = arrayList;
        this.f55261c = j2Var;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public /* bridge */ /* synthetic */ Object emit(Object obj, zu.d dVar) {
        return emit((n) obj, (zu.d<? super x0>) dVar);
    }

    public final Object emit(n nVar, zu.d<? super x0> dVar) {
        boolean z10 = nVar instanceof d;
        ArrayList arrayList = this.f55260b;
        if (z10) {
            arrayList.add(nVar);
        } else if (nVar instanceof e) {
            arrayList.remove(((e) nVar).getFocus());
        }
        this.f55261c.setValue(bv.b.boxBoolean(!arrayList.isEmpty()));
        return x0.f87415a;
    }
}
