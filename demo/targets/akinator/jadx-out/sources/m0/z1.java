package m0;

import a2.u4;
import a2.w4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class z1 implements l0.z0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h2 f73865a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f73866b;

    public z1(h2 h2Var, boolean z10) {
        this.f73865a = h2Var;
        this.f73866b = z10;
    }

    @Override // l0.z0
    /* renamed from: onDown-k-4lQ0M */
    public void mo5281onDownk4lQ0M(long j10) {
        boolean z10 = this.f73866b;
        l0.q qVar = z10 ? l0.q.f72149c : l0.q.f72150e;
        h2 h2Var = this.f73865a;
        h2Var.f73753o.setValue(qVar);
        h2Var.f73754p.setValue(i1.h.m4174boximpl(e0.m5503getAdjustedCoordinatesk4lQ0M(h2Var.m5532getHandlePositiontuRUvjQ$foundation_release(z10))));
    }

    @Override // l0.z0
    /* renamed from: onDrag-k-4lQ0M */
    public void mo5282onDragk4lQ0M(long j10) {
        l0.k1 layoutResult;
        g2.x1 value;
        int iOriginalToTransformed;
        int iM4043getOffsetForPositionk4lQ0M;
        h2 h2Var = this.f73865a;
        h2Var.f73752n = i1.h.m4190plusMKHz9U(h2Var.f73752n, j10);
        l0.i1 state$foundation_release = h2Var.getState$foundation_release();
        if (state$foundation_release != null && (layoutResult = state$foundation_release.getLayoutResult()) != null && (value = layoutResult.getValue()) != null) {
            h2Var.f73754p.setValue(i1.h.m4174boximpl(i1.h.m4190plusMKHz9U(h2Var.f73750l, h2Var.f73752n)));
            boolean z10 = this.f73866b;
            if (z10) {
                i1.h hVarM5530getCurrentDragPosition_m7T9E = h2Var.m5530getCurrentDragPosition_m7T9E();
                kotlin.jvm.internal.e0.checkNotNull(hVarM5530getCurrentDragPosition_m7T9E);
                iOriginalToTransformed = value.m4043getOffsetForPositionk4lQ0M(hVarM5530getCurrentDragPosition_m7T9E.m4195unboximpl());
            } else {
                iOriginalToTransformed = ((m2.x) h2Var.getOffsetMapping$foundation_release()).originalToTransformed(g2.a2.m3960getStartimpl(h2Var.getValue$foundation_release().m5591getSelectiond9O1mEE()));
            }
            int i10 = iOriginalToTransformed;
            if (z10) {
                iM4043getOffsetForPositionk4lQ0M = ((m2.x) h2Var.getOffsetMapping$foundation_release()).originalToTransformed(g2.a2.m3955getEndimpl(h2Var.getValue$foundation_release().m5591getSelectiond9O1mEE()));
            } else {
                i1.h hVarM5530getCurrentDragPosition_m7T9E2 = h2Var.m5530getCurrentDragPosition_m7T9E();
                kotlin.jvm.internal.e0.checkNotNull(hVarM5530getCurrentDragPosition_m7T9E2);
                iM4043getOffsetForPositionk4lQ0M = value.m4043getOffsetForPositionk4lQ0M(hVarM5530getCurrentDragPosition_m7T9E2.m4195unboximpl());
            }
            h2Var.c(h2Var.getValue$foundation_release(), i10, iM4043getOffsetForPositionk4lQ0M, z10, a0.f73656a.getCharacter());
        }
        l0.i1 state$foundation_release2 = h2Var.getState$foundation_release();
        if (state$foundation_release2 == null) {
            return;
        }
        state$foundation_release2.setShowFloatingToolbar(false);
    }

    @Override // l0.z0
    /* renamed from: onStart-k-4lQ0M */
    public void mo5283onStartk4lQ0M(long j10) {
        h2 h2Var = this.f73865a;
        boolean z10 = this.f73866b;
        h2Var.f73750l = e0.m5503getAdjustedCoordinatesk4lQ0M(h2Var.m5532getHandlePositiontuRUvjQ$foundation_release(z10));
        h2Var.f73754p.setValue(i1.h.m4174boximpl(h2Var.f73750l));
        h2Var.f73752n = i1.h.f59344b.m4173getZeroF1C5BW0();
        h2Var.f73753o.setValue(z10 ? l0.q.f72149c : l0.q.f72150e);
        l0.i1 state$foundation_release = h2Var.getState$foundation_release();
        if (state$foundation_release == null) {
            return;
        }
        state$foundation_release.setShowFloatingToolbar(false);
    }

    @Override // l0.z0
    public void onStop() {
        h2 h2Var = this.f73865a;
        h2Var.f73753o.setValue(null);
        h2Var.f73754p.setValue(null);
        l0.i1 state$foundation_release = h2Var.getState$foundation_release();
        if (state$foundation_release != null) {
            state$foundation_release.setShowFloatingToolbar(true);
        }
        u4 textToolbar = h2Var.getTextToolbar();
        if ((textToolbar != null ? textToolbar.getStatus() : null) == w4.f3876c) {
            h2Var.showSelectionToolbar$foundation_release();
        }
    }

    @Override // l0.z0
    public void onUp() {
        h2 h2Var = this.f73865a;
        h2Var.f73753o.setValue(null);
        h2Var.f73754p.setValue(null);
    }

    @Override // l0.z0
    public void onCancel() {
    }
}
