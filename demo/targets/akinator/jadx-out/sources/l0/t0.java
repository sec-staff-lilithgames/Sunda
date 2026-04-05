package l0;

import m0.t1;
import m0.w1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class t0 implements z0 {

    /* renamed from: a, reason: collision with root package name */
    public long f72171a;

    /* renamed from: b, reason: collision with root package name */
    public long f72172b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x0 f72173c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t1 f72174d;

    public t0(x0 x0Var, t1 t1Var) {
        this.f72173c = x0Var;
        this.f72174d = t1Var;
        i1.g gVar = i1.h.f59344b;
        this.f72171a = gVar.m4173getZeroF1C5BW0();
        this.f72172b = gVar.m4173getZeroF1C5BW0();
    }

    public final long getDragTotalDistance() {
        return this.f72172b;
    }

    public final long getLastPosition() {
        return this.f72171a;
    }

    @Override // l0.z0
    public void onCancel() {
        long selectableId = this.f72173c.getState().getSelectableId();
        t1 t1Var = this.f72174d;
        if (w1.hasSelection(t1Var, selectableId)) {
            t1Var.notifySelectionUpdateEnd();
        }
    }

    @Override // l0.z0
    /* renamed from: onDrag-k-4lQ0M, reason: not valid java name */
    public void mo5282onDragk4lQ0M(long j10) {
        x0 x0Var = this.f72173c;
        x1.d0 layoutCoordinates = x0Var.getState().getLayoutCoordinates();
        if (layoutCoordinates == null || !layoutCoordinates.isAttached()) {
            return;
        }
        long selectableId = x0Var.getState().getSelectableId();
        t1 t1Var = this.f72174d;
        if (w1.hasSelection(t1Var, selectableId)) {
            long jM4190plusMKHz9U = i1.h.m4190plusMKHz9U(this.f72172b, j10);
            this.f72172b = jM4190plusMKHz9U;
            long jM4190plusMKHz9U2 = i1.h.m4190plusMKHz9U(this.f72171a, jM4190plusMKHz9U);
            if (x0.m5288access$outOfBoundary0a9Yr6o(x0Var, this.f72171a, jM4190plusMKHz9U2) || !t1Var.mo5570notifySelectionUpdate5iVPX68(layoutCoordinates, jM4190plusMKHz9U2, this.f72171a, false, m0.a0.f73656a.getCharacterWithWordAccelerate())) {
                return;
            }
            this.f72171a = jM4190plusMKHz9U2;
            this.f72172b = i1.h.f59344b.m4173getZeroF1C5BW0();
        }
    }

    @Override // l0.z0
    /* renamed from: onStart-k-4lQ0M, reason: not valid java name */
    public void mo5283onStartk4lQ0M(long j10) {
        x0 x0Var = this.f72173c;
        x1.d0 layoutCoordinates = x0Var.getState().getLayoutCoordinates();
        t1 t1Var = this.f72174d;
        if (layoutCoordinates != null) {
            if (!layoutCoordinates.isAttached()) {
                return;
            }
            if (x0.m5288access$outOfBoundary0a9Yr6o(x0Var, j10, j10)) {
                t1Var.notifySelectionUpdateSelectAll(x0Var.getState().getSelectableId());
            } else {
                t1Var.mo5571notifySelectionUpdateStartd4ec7I(layoutCoordinates, j10, m0.a0.f73656a.getWord());
            }
            this.f72171a = j10;
        }
        if (w1.hasSelection(t1Var, x0Var.getState().getSelectableId())) {
            this.f72172b = i1.h.f59344b.m4173getZeroF1C5BW0();
        }
    }

    @Override // l0.z0
    public void onStop() {
        long selectableId = this.f72173c.getState().getSelectableId();
        t1 t1Var = this.f72174d;
        if (w1.hasSelection(t1Var, selectableId)) {
            t1Var.notifySelectionUpdateEnd();
        }
    }

    public final void setDragTotalDistance(long j10) {
        this.f72172b = j10;
    }

    public final void setLastPosition(long j10) {
        this.f72171a = j10;
    }

    @Override // l0.z0
    public void onUp() {
    }

    @Override // l0.z0
    /* renamed from: onDown-k-4lQ0M, reason: not valid java name */
    public void mo5281onDownk4lQ0M(long j10) {
    }
}
