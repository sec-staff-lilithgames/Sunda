package z1;

import a2.g5;
import a2.s5;
import a2.u4;
import android.view.KeyEvent;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public interface s1 {
    static /* synthetic */ void measureAndLayout$default(s1 s1Var, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: measureAndLayout");
        }
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        s1Var.measureAndLayout(z10);
    }

    static /* synthetic */ void onRequestMeasure$default(s1 s1Var, b0 b0Var, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onRequestMeasure");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        s1Var.onRequestMeasure(b0Var, z10);
    }

    static /* synthetic */ void onRequestRelayout$default(s1 s1Var, b0 b0Var, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onRequestRelayout");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        s1Var.onRequestRelayout(b0Var, z10);
    }

    /* renamed from: calculateLocalPosition-MK-Hz9U */
    long mo54calculateLocalPositionMKHz9U(long j10);

    /* renamed from: calculatePositionInWindow-MK-Hz9U */
    long mo55calculatePositionInWindowMKHz9U(long j10);

    p1 createLayer(kv.l lVar, kv.a aVar);

    void forceMeasureTheSubtree(b0 b0Var);

    a2.j getAccessibilityManager();

    f1.d getAutofill();

    f1.i getAutofillTree();

    a2.d2 getClipboardManager();

    s2.e getDensity();

    /* renamed from: getFocusDirection-P8AzH3I */
    h1.f mo56getFocusDirectionP8AzH3I(KeyEvent keyEvent);

    h1.m getFocusManager();

    l2.y getFontFamilyResolver();

    l2.v getFontLoader();

    p1.a getHapticFeedBack();

    q1.c getInputModeManager();

    s2.x getLayoutDirection();

    long getMeasureIteration();

    u1.z getPointerIconService();

    b0 getRoot();

    b2 getRootForTest();

    n0 getSharedDrawScope();

    boolean getShowLayoutBounds();

    y1 getSnapshotObserver();

    m2.l0 getTextInputService();

    u4 getTextToolbar();

    g5 getViewConfiguration();

    s5 getWindowInfo();

    void measureAndLayout(boolean z10);

    /* renamed from: measureAndLayout-0kLqBqw */
    void mo58measureAndLayout0kLqBqw(b0 b0Var, long j10);

    void onAttach(b0 b0Var);

    void onDetach(b0 b0Var);

    void onEndApplyChanges();

    void onLayoutChange(b0 b0Var);

    void onRequestMeasure(b0 b0Var, boolean z10);

    void onRequestRelayout(b0 b0Var, boolean z10);

    void onSemanticsChange();

    void registerOnEndApplyChangesListener(kv.a aVar);

    void registerOnLayoutCompletedListener(r1 r1Var);

    boolean requestFocus();

    void setShowLayoutBounds(boolean z10);

    static /* synthetic */ void getAutofill$annotations() {
    }

    static /* synthetic */ void getAutofillTree$annotations() {
    }

    @tu.f
    static /* synthetic */ void getFontLoader$annotations() {
    }
}
