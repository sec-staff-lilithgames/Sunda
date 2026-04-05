package m2;

import g2.a2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class k0 {
    public static final g2.b getSelectedText(j0 j0Var) {
        kotlin.jvm.internal.e0.checkNotNullParameter(j0Var, "<this>");
        return j0Var.getAnnotatedString().m3965subSequence5zctL8(j0Var.m5591getSelectiond9O1mEE());
    }

    public static final g2.b getTextAfterSelection(j0 j0Var, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(j0Var, "<this>");
        return j0Var.getAnnotatedString().subSequence(a2.m3957getMaximpl(j0Var.m5591getSelectiond9O1mEE()), Math.min(a2.m3957getMaximpl(j0Var.m5591getSelectiond9O1mEE()) + i10, j0Var.getText().length()));
    }

    public static final g2.b getTextBeforeSelection(j0 j0Var, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(j0Var, "<this>");
        return j0Var.getAnnotatedString().subSequence(Math.max(0, a2.m3958getMinimpl(j0Var.m5591getSelectiond9O1mEE()) - i10), a2.m3958getMinimpl(j0Var.m5591getSelectiond9O1mEE()));
    }
}
