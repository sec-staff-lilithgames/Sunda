package m0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class y1 implements l0.z0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h2 f73861a;

    public y1(h2 h2Var) {
        this.f73861a = h2Var;
    }

    @Override // l0.z0
    /* renamed from: onDown-k-4lQ0M */
    public void mo5281onDownk4lQ0M(long j10) {
        l0.q qVar = l0.q.f72148b;
        h2 h2Var = this.f73861a;
        h2Var.f73753o.setValue(qVar);
        h2Var.f73754p.setValue(i1.h.m4174boximpl(e0.m5503getAdjustedCoordinatesk4lQ0M(h2Var.m5532getHandlePositiontuRUvjQ$foundation_release(true))));
    }

    @Override // l0.z0
    /* renamed from: onDrag-k-4lQ0M */
    public void mo5282onDragk4lQ0M(long j10) {
        l0.k1 layoutResult;
        g2.x1 value;
        h2 h2Var = this.f73861a;
        h2Var.f73752n = i1.h.m4190plusMKHz9U(h2Var.f73752n, j10);
        l0.i1 state$foundation_release = h2Var.getState$foundation_release();
        if (state$foundation_release == null || (layoutResult = state$foundation_release.getLayoutResult()) == null || (value = layoutResult.getValue()) == null) {
            return;
        }
        h2Var.f73754p.setValue(i1.h.m4174boximpl(i1.h.m4190plusMKHz9U(h2Var.f73750l, h2Var.f73752n)));
        i1.h hVarM5530getCurrentDragPosition_m7T9E = h2Var.m5530getCurrentDragPosition_m7T9E();
        kotlin.jvm.internal.e0.checkNotNull(hVarM5530getCurrentDragPosition_m7T9E);
        int iM4043getOffsetForPositionk4lQ0M = value.m4043getOffsetForPositionk4lQ0M(hVarM5530getCurrentDragPosition_m7T9E.m4195unboximpl());
        long jTextRange = g2.b2.TextRange(iM4043getOffsetForPositionk4lQ0M, iM4043getOffsetForPositionk4lQ0M);
        if (g2.a2.m3953equalsimpl0(jTextRange, h2Var.getValue$foundation_release().m5591getSelectiond9O1mEE())) {
            return;
        }
        p1.a hapticFeedBack = h2Var.getHapticFeedBack();
        if (hapticFeedBack != null) {
            hapticFeedBack.mo5860performHapticFeedbackCdsT49E(p1.c.f80664b.m5862getTextHandleMove5zf0vsI());
        }
        h2Var.getOnValueChange$foundation_release().invoke(h2.m5525access$createTextFieldValueFDrldGo(h2Var, h2Var.getValue$foundation_release().getAnnotatedString(), jTextRange));
    }

    @Override // l0.z0
    /* renamed from: onStart-k-4lQ0M */
    public void mo5283onStartk4lQ0M(long j10) {
        h2 h2Var = this.f73861a;
        h2Var.f73750l = e0.m5503getAdjustedCoordinatesk4lQ0M(h2Var.m5532getHandlePositiontuRUvjQ$foundation_release(true));
        h2Var.f73754p.setValue(i1.h.m4174boximpl(h2Var.f73750l));
        h2Var.f73752n = i1.h.f59344b.m4173getZeroF1C5BW0();
        h2Var.f73753o.setValue(l0.q.f72148b);
    }

    @Override // l0.z0
    public void onStop() {
        h2 h2Var = this.f73861a;
        h2Var.f73753o.setValue(null);
        h2Var.f73754p.setValue(null);
    }

    @Override // l0.z0
    public void onUp() {
        h2 h2Var = this.f73861a;
        h2Var.f73753o.setValue(null);
        h2Var.f73754p.setValue(null);
    }

    @Override // l0.z0
    public void onCancel() {
    }
}
