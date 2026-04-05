package l0;

import m0.t1;
import m0.w1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class w0 implements m0.o {

    /* renamed from: a, reason: collision with root package name */
    public long f72191a = i1.h.f59344b.m4173getZeroF1C5BW0();

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x0 f72192b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t1 f72193c;

    public w0(x0 x0Var, t1 t1Var) {
        this.f72192b = x0Var;
        this.f72193c = t1Var;
    }

    public final long getLastPosition() {
        return this.f72191a;
    }

    @Override // m0.o
    /* renamed from: onDrag-3MmeM6k, reason: not valid java name */
    public boolean mo5284onDrag3MmeM6k(long j10, m0.b0 adjustment) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adjustment, "adjustment");
        x0 x0Var = this.f72192b;
        x1.d0 layoutCoordinates = x0Var.getState().getLayoutCoordinates();
        if (layoutCoordinates != null) {
            if (!layoutCoordinates.isAttached()) {
                return false;
            }
            long selectableId = x0Var.getState().getSelectableId();
            t1 t1Var = this.f72193c;
            if (!w1.hasSelection(t1Var, selectableId)) {
                return false;
            }
            if (t1Var.mo5570notifySelectionUpdate5iVPX68(layoutCoordinates, j10, this.f72191a, false, adjustment)) {
                this.f72191a = j10;
            }
        }
        return true;
    }

    @Override // m0.o
    /* renamed from: onExtend-k-4lQ0M, reason: not valid java name */
    public boolean mo5285onExtendk4lQ0M(long j10) {
        x0 x0Var = this.f72192b;
        x1.d0 layoutCoordinates = x0Var.getState().getLayoutCoordinates();
        if (layoutCoordinates == null || !layoutCoordinates.isAttached()) {
            return false;
        }
        long j11 = this.f72191a;
        m0.b0 none = m0.a0.f73656a.getNone();
        t1 t1Var = this.f72193c;
        if (t1Var.mo5570notifySelectionUpdate5iVPX68(layoutCoordinates, j10, j11, false, none)) {
            this.f72191a = j10;
        }
        return w1.hasSelection(t1Var, x0Var.getState().getSelectableId());
    }

    @Override // m0.o
    /* renamed from: onExtendDrag-k-4lQ0M, reason: not valid java name */
    public boolean mo5286onExtendDragk4lQ0M(long j10) {
        x0 x0Var = this.f72192b;
        x1.d0 layoutCoordinates = x0Var.getState().getLayoutCoordinates();
        if (layoutCoordinates == null) {
            return true;
        }
        if (!layoutCoordinates.isAttached()) {
            return false;
        }
        long selectableId = x0Var.getState().getSelectableId();
        t1 t1Var = this.f72193c;
        if (!w1.hasSelection(t1Var, selectableId)) {
            return false;
        }
        if (!t1Var.mo5570notifySelectionUpdate5iVPX68(layoutCoordinates, j10, this.f72191a, false, m0.a0.f73656a.getNone())) {
            return true;
        }
        this.f72191a = j10;
        return true;
    }

    @Override // m0.o
    /* renamed from: onStart-3MmeM6k, reason: not valid java name */
    public boolean mo5287onStart3MmeM6k(long j10, m0.b0 adjustment) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adjustment, "adjustment");
        x0 x0Var = this.f72192b;
        x1.d0 layoutCoordinates = x0Var.getState().getLayoutCoordinates();
        if (layoutCoordinates == null || !layoutCoordinates.isAttached()) {
            return false;
        }
        t1 t1Var = this.f72193c;
        t1Var.mo5571notifySelectionUpdateStartd4ec7I(layoutCoordinates, j10, adjustment);
        this.f72191a = j10;
        return w1.hasSelection(t1Var, x0Var.getState().getSelectableId());
    }

    public final void setLastPosition(long j10) {
        this.f72191a = j10;
    }
}
