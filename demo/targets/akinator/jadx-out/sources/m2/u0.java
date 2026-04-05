package m2;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import g2.a2;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class u0 implements c0 {

    /* renamed from: a, reason: collision with root package name */
    public final View f73973a;

    /* renamed from: b, reason: collision with root package name */
    public final p f73974b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f73975c;

    /* renamed from: d, reason: collision with root package name */
    public kv.l f73976d;

    /* renamed from: e, reason: collision with root package name */
    public kv.l f73977e;

    /* renamed from: f, reason: collision with root package name */
    public j0 f73978f;

    /* renamed from: g, reason: collision with root package name */
    public n f73979g;

    /* renamed from: h, reason: collision with root package name */
    public d0 f73980h;

    /* renamed from: i, reason: collision with root package name */
    public final tu.o f73981i;

    /* renamed from: j, reason: collision with root package name */
    public final Channel f73982j;

    public u0(View view, p inputMethodManager) {
        kotlin.jvm.internal.e0.checkNotNullParameter(view, "view");
        kotlin.jvm.internal.e0.checkNotNullParameter(inputMethodManager, "inputMethodManager");
        this.f73973a = view;
        this.f73974b = inputMethodManager;
        this.f73976d = p0.f73956e;
        this.f73977e = q0.f73958e;
        this.f73978f = new j0("", a2.f56706b.m4051getZerod9O1mEE(), (a2) null, 4, (kotlin.jvm.internal.u) null);
        this.f73979g = n.f73947f.getDefault();
        this.f73981i = tu.q.lazy(tu.s.f87405e, (kv.a) new n0(this));
        this.f73982j = ChannelKt.Channel$default(Integer.MAX_VALUE, null, null, 6, null);
    }

    public static final BaseInputConnection access$getBaseInputConnection(u0 u0Var) {
        return (BaseInputConnection) u0Var.f73981i.getValue();
    }

    public final InputConnection createInputConnection(EditorInfo outAttrs) {
        kotlin.jvm.internal.e0.checkNotNullParameter(outAttrs, "outAttrs");
        if (!this.f73975c) {
            return null;
        }
        v0.update(outAttrs, this.f73979g, this.f73978f);
        d0 d0Var = new d0(this.f73978f, new o0(this), this.f73979g.getAutoCorrect());
        this.f73980h = d0Var;
        return d0Var;
    }

    public final j0 getState$ui_release() {
        return this.f73978f;
    }

    public final View getView() {
        return this.f73973a;
    }

    @Override // m2.c0
    public void hideSoftwareKeyboard() {
        this.f73982j.mo5139trySendJP2dKIU(m0.f73945f);
    }

    public final boolean isEditorFocused() {
        return this.f73975c;
    }

    @Override // m2.c0
    @tu.f
    public void notifyFocusedRect(i1.j rect) {
        kotlin.jvm.internal.e0.checkNotNullParameter(rect, "rect");
        Rect rect2 = new Rect(mv.d.roundToInt(rect.getLeft()), mv.d.roundToInt(rect.getTop()), mv.d.roundToInt(rect.getRight()), mv.d.roundToInt(rect.getBottom()));
        if (this.f73980h == null) {
            this.f73973a.requestRectangleOnScreen(new Rect(rect2));
        }
    }

    @Override // m2.c0
    public void showSoftwareKeyboard() {
        this.f73982j.mo5139trySendJP2dKIU(m0.f73944e);
    }

    @Override // m2.c0
    public void startInput(j0 value, n imeOptions, kv.l onEditCommand, kv.l onImeActionPerformed) {
        kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
        kotlin.jvm.internal.e0.checkNotNullParameter(imeOptions, "imeOptions");
        kotlin.jvm.internal.e0.checkNotNullParameter(onEditCommand, "onEditCommand");
        kotlin.jvm.internal.e0.checkNotNullParameter(onImeActionPerformed, "onImeActionPerformed");
        this.f73975c = true;
        this.f73978f = value;
        this.f73979g = imeOptions;
        this.f73976d = onEditCommand;
        this.f73977e = onImeActionPerformed;
        this.f73982j.mo5139trySendJP2dKIU(m0.f73942b);
    }

    @Override // m2.c0
    public void stopInput() {
        this.f73975c = false;
        this.f73976d = r0.f73960e;
        this.f73977e = s0.f73961e;
        this.f73982j.mo5139trySendJP2dKIU(m0.f73943c);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x004a -> B:18:0x004d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object textInputCommandEventLoop(zu.d<? super tu.x0> r14) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m2.u0.textInputCommandEventLoop(zu.d):java.lang.Object");
    }

    @Override // m2.c0
    public void updateState(j0 j0Var, j0 newValue) {
        kotlin.jvm.internal.e0.checkNotNullParameter(newValue, "newValue");
        boolean z10 = (a2.m3953equalsimpl0(this.f73978f.m5591getSelectiond9O1mEE(), newValue.m5591getSelectiond9O1mEE()) && kotlin.jvm.internal.e0.areEqual(this.f73978f.m5590getCompositionMzsxiRA(), newValue.m5590getCompositionMzsxiRA())) ? false : true;
        this.f73978f = newValue;
        d0 d0Var = this.f73980h;
        if (d0Var != null) {
            d0Var.setMTextFieldValue$ui_release(newValue);
        }
        if (kotlin.jvm.internal.e0.areEqual(j0Var, newValue)) {
            if (z10) {
                int iM3958getMinimpl = a2.m3958getMinimpl(newValue.m5591getSelectiond9O1mEE());
                int iM3957getMaximpl = a2.m3957getMaximpl(newValue.m5591getSelectiond9O1mEE());
                a2 a2VarM5590getCompositionMzsxiRA = this.f73978f.m5590getCompositionMzsxiRA();
                int iM3958getMinimpl2 = a2VarM5590getCompositionMzsxiRA != null ? a2.m3958getMinimpl(a2VarM5590getCompositionMzsxiRA.m3964unboximpl()) : -1;
                a2 a2VarM5590getCompositionMzsxiRA2 = this.f73978f.m5590getCompositionMzsxiRA();
                this.f73974b.updateSelection(this.f73973a, iM3958getMinimpl, iM3957getMaximpl, iM3958getMinimpl2, a2VarM5590getCompositionMzsxiRA2 != null ? a2.m3957getMaximpl(a2VarM5590getCompositionMzsxiRA2.m3964unboximpl()) : -1);
                return;
            }
            return;
        }
        View view = this.f73973a;
        p pVar = this.f73974b;
        if (j0Var != null && (!kotlin.jvm.internal.e0.areEqual(j0Var.getText(), newValue.getText()) || (a2.m3953equalsimpl0(j0Var.m5591getSelectiond9O1mEE(), newValue.m5591getSelectiond9O1mEE()) && !kotlin.jvm.internal.e0.areEqual(j0Var.m5590getCompositionMzsxiRA(), newValue.m5590getCompositionMzsxiRA())))) {
            pVar.restartInput(view);
            return;
        }
        d0 d0Var2 = this.f73980h;
        if (d0Var2 != null) {
            d0Var2.updateInputState(this.f73978f, pVar, view);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public u0(View view) {
        kotlin.jvm.internal.e0.checkNotNullParameter(view, "view");
        Context context = view.getContext();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(context, "view.context");
        this(view, new r(context));
    }
}
