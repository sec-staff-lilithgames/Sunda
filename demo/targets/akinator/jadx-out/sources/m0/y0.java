package m0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class y0 implements l0.z0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h1 f73859a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f73860b;

    public y0(h1 h1Var, boolean z10) {
        this.f73859a = h1Var;
        this.f73860b = z10;
    }

    @Override // l0.z0
    public void onCancel() {
        h1 h1Var = this.f73859a;
        h1Var.showSelectionToolbar$foundation_release();
        h1Var.f73737p.setValue(null);
        h1Var.f73738q.setValue(null);
    }

    @Override // l0.z0
    /* renamed from: onDown-k-4lQ0M */
    public void mo5281onDownk4lQ0M(long j10) {
        x1.d0 layoutCoordinates;
        h1 h1Var = this.f73859a;
        s selection = h1Var.getSelection();
        if (selection == null) {
            return;
        }
        boolean z10 = this.f73860b;
        r anchorSelectable$foundation_release = h1Var.getAnchorSelectable$foundation_release(z10 ? selection.getStart() : selection.getEnd());
        if (anchorSelectable$foundation_release == null || (layoutCoordinates = anchorSelectable$foundation_release.getLayoutCoordinates()) == null) {
            return;
        }
        h1Var.f73738q.setValue(i1.h.m4174boximpl(h1Var.requireContainerCoordinates$foundation_release().mo7828localPositionOfR5De75A(layoutCoordinates, e0.m5503getAdjustedCoordinatesk4lQ0M(anchorSelectable$foundation_release.mo5551getHandlePositiondBAh8RU(selection, z10)))));
        h1Var.f73737p.setValue(z10 ? l0.q.f72149c : l0.q.f72150e);
    }

    @Override // l0.z0
    /* renamed from: onDrag-k-4lQ0M */
    public void mo5282onDragk4lQ0M(long j10) {
        h1 h1Var = this.f73859a;
        h1Var.f73734m.setValue(i1.h.m4174boximpl(i1.h.m4190plusMKHz9U(h1Var.m5520getDragTotalDistanceF1C5BW0$foundation_release(), j10)));
        long jM4190plusMKHz9U = i1.h.m4190plusMKHz9U(h1Var.m5519getDragBeginPositionF1C5BW0$foundation_release(), h1Var.m5520getDragTotalDistanceF1C5BW0$foundation_release());
        if (h1Var.m5524updateSelectionRHHTvR4$foundation_release(i1.h.m4174boximpl(jM4190plusMKHz9U), i1.h.m4174boximpl(h1Var.m5519getDragBeginPositionF1C5BW0$foundation_release()), this.f73860b, a0.f73656a.getCharacterWithWordAccelerate())) {
            h1Var.f73733l.setValue(i1.h.m4174boximpl(jM4190plusMKHz9U));
            h1Var.f73734m.setValue(i1.h.m4174boximpl(i1.h.f59344b.m4173getZeroF1C5BW0()));
        }
    }

    @Override // l0.z0
    /* renamed from: onStart-k-4lQ0M */
    public void mo5283onStartk4lQ0M(long j10) {
        x1.d0 layoutCoordinates;
        long jMo5551getHandlePositiondBAh8RU;
        h1 h1Var = this.f73859a;
        h1Var.hideSelectionToolbar$foundation_release();
        s selection = h1Var.getSelection();
        kotlin.jvm.internal.e0.checkNotNull(selection);
        r rVar = h1Var.f73722a.getSelectableMap$foundation_release().get(Long.valueOf(selection.getStart().getSelectableId()));
        r rVar2 = h1Var.f73722a.getSelectableMap$foundation_release().get(Long.valueOf(selection.getEnd().getSelectableId()));
        boolean z10 = this.f73860b;
        if (z10) {
            layoutCoordinates = rVar != null ? rVar.getLayoutCoordinates() : null;
            kotlin.jvm.internal.e0.checkNotNull(layoutCoordinates);
        } else {
            layoutCoordinates = rVar2 != null ? rVar2.getLayoutCoordinates() : null;
            kotlin.jvm.internal.e0.checkNotNull(layoutCoordinates);
        }
        if (z10) {
            kotlin.jvm.internal.e0.checkNotNull(rVar);
            jMo5551getHandlePositiondBAh8RU = rVar.mo5551getHandlePositiondBAh8RU(selection, true);
        } else {
            kotlin.jvm.internal.e0.checkNotNull(rVar2);
            jMo5551getHandlePositiondBAh8RU = rVar2.mo5551getHandlePositiondBAh8RU(selection, false);
        }
        h1Var.f73733l.setValue(i1.h.m4174boximpl(h1Var.requireContainerCoordinates$foundation_release().mo7828localPositionOfR5De75A(layoutCoordinates, e0.m5503getAdjustedCoordinatesk4lQ0M(jMo5551getHandlePositiondBAh8RU))));
        h1Var.f73734m.setValue(i1.h.m4174boximpl(i1.h.f59344b.m4173getZeroF1C5BW0()));
    }

    @Override // l0.z0
    public void onStop() {
        h1 h1Var = this.f73859a;
        h1Var.showSelectionToolbar$foundation_release();
        h1Var.f73737p.setValue(null);
        h1Var.f73738q.setValue(null);
    }

    @Override // l0.z0
    public void onUp() {
        h1 h1Var = this.f73859a;
        h1Var.f73737p.setValue(null);
        h1Var.f73738q.setValue(null);
    }
}
