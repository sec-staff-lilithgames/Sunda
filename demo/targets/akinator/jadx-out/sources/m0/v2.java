package m0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class v2 {
    public static final float getHorizontalPosition(g2.x1 x1Var, int i10, boolean z10, boolean z11) {
        kotlin.jvm.internal.e0.checkNotNullParameter(x1Var, "<this>");
        return x1Var.getHorizontalPosition(i10, x1Var.getBidiRunDirection(((!z10 || z11) && (z10 || !z11)) ? Math.max(i10 + (-1), 0) : i10) == x1Var.getParagraphDirection(i10));
    }

    public static final long getSelectionHandleCoordinates(g2.x1 textLayoutResult, int i10, boolean z10, boolean z11) {
        kotlin.jvm.internal.e0.checkNotNullParameter(textLayoutResult, "textLayoutResult");
        return i1.i.Offset(getHorizontalPosition(textLayoutResult, i10, z10, z11), textLayoutResult.getLineBottom(textLayoutResult.getLineForOffset(i10)));
    }
}
