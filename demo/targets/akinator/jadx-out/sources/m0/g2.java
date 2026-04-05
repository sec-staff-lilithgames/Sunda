package m0;

import a2.u4;
import a2.w4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class g2 implements l0.z0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h2 f73717a;

    public g2(h2 h2Var) {
        this.f73717a = h2Var;
    }

    @Override // l0.z0
    /* renamed from: onDrag-k-4lQ0M */
    public void mo5282onDragk4lQ0M(long j10) {
        l0.k1 layoutResult;
        h2 h2Var = this.f73717a;
        if (h2Var.getValue$foundation_release().getText().length() == 0) {
            return;
        }
        h2Var.f73752n = i1.h.m4190plusMKHz9U(h2Var.f73752n, j10);
        l0.i1 state$foundation_release = h2Var.getState$foundation_release();
        if (state$foundation_release != null && (layoutResult = state$foundation_release.getLayoutResult()) != null) {
            h2Var.f73754p.setValue(i1.h.m4174boximpl(i1.h.m4190plusMKHz9U(h2Var.f73750l, h2Var.f73752n)));
            Integer num = h2Var.f73751m;
            int iIntValue = num != null ? num.intValue() : layoutResult.m5267getOffsetForPosition3MmeM6k(h2Var.f73750l, false);
            i1.h hVarM5530getCurrentDragPosition_m7T9E = h2Var.m5530getCurrentDragPosition_m7T9E();
            kotlin.jvm.internal.e0.checkNotNull(hVarM5530getCurrentDragPosition_m7T9E);
            h2Var.c(h2Var.getValue$foundation_release(), iIntValue, layoutResult.m5267getOffsetForPosition3MmeM6k(hVarM5530getCurrentDragPosition_m7T9E.m4195unboximpl(), false), false, a0.f73656a.getWord());
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
        l0.i1 state$foundation_release;
        l0.k1 layoutResult;
        l0.k1 layoutResult2;
        l0.k1 layoutResult3;
        h2 h2Var = this.f73717a;
        if (h2Var.getDraggingHandle() != null) {
            return;
        }
        h2Var.f73753o.setValue(l0.q.f72150e);
        h2Var.hideSelectionToolbar$foundation_release();
        l0.i1 state$foundation_release2 = h2Var.getState$foundation_release();
        if ((state$foundation_release2 == null || (layoutResult3 = state$foundation_release2.getLayoutResult()) == null || !layoutResult3.m5268isPositionOnTextk4lQ0M(j10)) && (state$foundation_release = h2Var.getState$foundation_release()) != null && (layoutResult = state$foundation_release.getLayoutResult()) != null) {
            int iTransformedToOriginal = ((m2.x) h2Var.getOffsetMapping$foundation_release()).transformedToOriginal(l0.k1.getLineEnd$default(layoutResult, layoutResult.getLineForVerticalPosition(i1.h.m4186getYimpl(j10)), false, 2, null));
            p1.a hapticFeedBack = h2Var.getHapticFeedBack();
            if (hapticFeedBack != null) {
                hapticFeedBack.mo5860performHapticFeedbackCdsT49E(p1.c.f80664b.m5862getTextHandleMove5zf0vsI());
            }
            m2.j0 j0VarM5525access$createTextFieldValueFDrldGo = h2.m5525access$createTextFieldValueFDrldGo(h2Var, h2Var.getValue$foundation_release().getAnnotatedString(), g2.b2.TextRange(iTransformedToOriginal, iTransformedToOriginal));
            h2Var.enterSelectionMode$foundation_release();
            h2Var.getOnValueChange$foundation_release().invoke(j0VarM5525access$createTextFieldValueFDrldGo);
            return;
        }
        if (h2Var.getValue$foundation_release().getText().length() == 0) {
            return;
        }
        h2Var.enterSelectionMode$foundation_release();
        l0.i1 state$foundation_release3 = h2Var.getState$foundation_release();
        if (state$foundation_release3 != null && (layoutResult2 = state$foundation_release3.getLayoutResult()) != null) {
            int iM5266getOffsetForPosition3MmeM6k$default = l0.k1.m5266getOffsetForPosition3MmeM6k$default(layoutResult2, j10, false, 2, null);
            h2Var.c(h2Var.getValue$foundation_release(), iM5266getOffsetForPosition3MmeM6k$default, iM5266getOffsetForPosition3MmeM6k$default, false, a0.f73656a.getWord());
            h2Var.f73751m = Integer.valueOf(iM5266getOffsetForPosition3MmeM6k$default);
        }
        h2Var.f73750l = j10;
        h2Var.f73754p.setValue(i1.h.m4174boximpl(h2Var.f73750l));
        h2Var.f73752n = i1.h.f59344b.m4173getZeroF1C5BW0();
    }

    @Override // l0.z0
    public void onStop() {
        h2 h2Var = this.f73717a;
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
        h2Var.f73751m = null;
    }

    @Override // l0.z0
    public void onCancel() {
    }

    @Override // l0.z0
    public void onUp() {
    }

    @Override // l0.z0
    /* renamed from: onDown-k-4lQ0M */
    public void mo5281onDownk4lQ0M(long j10) {
    }
}
