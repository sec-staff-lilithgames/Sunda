package n0;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class r implements FlowCollector {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SnapshotStateList f75167b;

    public r(SnapshotStateList snapshotStateList) {
        this.f75167b = snapshotStateList;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public /* bridge */ /* synthetic */ Object emit(Object obj, zu.d dVar) {
        return emit((f0.n) obj, (zu.d<? super tu.x0>) dVar);
    }

    public final Object emit(f0.n nVar, zu.d<? super tu.x0> dVar) {
        boolean z10 = nVar instanceof f0.i;
        SnapshotStateList snapshotStateList = this.f75167b;
        if (z10) {
            snapshotStateList.add(nVar);
        } else if (nVar instanceof f0.j) {
            snapshotStateList.remove(((f0.j) nVar).getEnter());
        } else if (nVar instanceof f0.d) {
            snapshotStateList.add(nVar);
        } else if (nVar instanceof f0.e) {
            snapshotStateList.remove(((f0.e) nVar).getFocus());
        } else if (nVar instanceof f0.t) {
            snapshotStateList.add(nVar);
        } else if (nVar instanceof f0.u) {
            snapshotStateList.remove(((f0.u) nVar).getPress());
        } else if (nVar instanceof f0.s) {
            snapshotStateList.remove(((f0.s) nVar).getPress());
        }
        return tu.x0.f87415a;
    }
}
