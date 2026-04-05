package m2;

import g2.a2;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public j0 f73909a = new j0(g2.g.emptyAnnotatedString(), a2.f56706b.m4051getZerod9O1mEE(), (a2) null, (kotlin.jvm.internal.u) null);

    /* renamed from: b, reason: collision with root package name */
    public g f73910b = new g(this.f73909a.getAnnotatedString(), this.f73909a.m5591getSelectiond9O1mEE(), (kotlin.jvm.internal.u) null);

    public final j0 apply(List<? extends d> editCommands) {
        kotlin.jvm.internal.e0.checkNotNullParameter(editCommands, "editCommands");
        int size = editCommands.size();
        for (int i10 = 0; i10 < size; i10++) {
            editCommands.get(i10).applyTo(this.f73910b);
        }
        j0 j0Var = new j0(this.f73910b.toAnnotatedString$ui_text_release(), this.f73910b.m5584getSelectiond9O1mEE$ui_text_release(), this.f73910b.m5583getCompositionMzsxiRA$ui_text_release(), (kotlin.jvm.internal.u) null);
        this.f73909a = j0Var;
        return j0Var;
    }

    public final g getMBuffer$ui_text_release() {
        return this.f73910b;
    }

    public final j0 getMBufferState$ui_text_release() {
        return this.f73909a;
    }

    public final void reset(j0 value, w0 w0Var) {
        kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
        boolean zAreEqual = kotlin.jvm.internal.e0.areEqual(value.m5590getCompositionMzsxiRA(), this.f73910b.m5583getCompositionMzsxiRA$ui_text_release());
        boolean z10 = true;
        boolean z11 = false;
        if (!kotlin.jvm.internal.e0.areEqual(this.f73909a.getAnnotatedString(), value.getAnnotatedString())) {
            this.f73910b = new g(value.getAnnotatedString(), value.m5591getSelectiond9O1mEE(), (kotlin.jvm.internal.u) null);
        } else if (a2.m3953equalsimpl0(this.f73909a.m5591getSelectiond9O1mEE(), value.m5591getSelectiond9O1mEE())) {
            z10 = false;
        } else {
            this.f73910b.setSelection$ui_text_release(a2.m3958getMinimpl(value.m5591getSelectiond9O1mEE()), a2.m3957getMaximpl(value.m5591getSelectiond9O1mEE()));
            z11 = true;
            z10 = false;
        }
        if (value.m5590getCompositionMzsxiRA() == null) {
            this.f73910b.commitComposition$ui_text_release();
        } else if (!a2.m3954getCollapsedimpl(value.m5590getCompositionMzsxiRA().m3964unboximpl())) {
            this.f73910b.setComposition$ui_text_release(a2.m3958getMinimpl(value.m5590getCompositionMzsxiRA().m3964unboximpl()), a2.m3957getMaximpl(value.m5590getCompositionMzsxiRA().m3964unboximpl()));
        }
        if (z10 || (!z11 && !zAreEqual)) {
            this.f73910b.commitComposition$ui_text_release();
            value = j0.m5586copy3r_uNRQ$default(value, (g2.b) null, 0L, (a2) null, 3, (Object) null);
        }
        j0 j0Var = this.f73909a;
        this.f73909a = value;
        if (w0Var != null) {
            w0Var.updateState(j0Var, value);
        }
    }

    public final j0 toTextFieldValue() {
        return this.f73909a;
    }
}
