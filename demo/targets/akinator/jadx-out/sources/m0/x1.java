package m0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class x1 {
    /* renamed from: getTextFieldSelection-bb3KNj8, reason: not valid java name */
    public static final long m5573getTextFieldSelectionbb3KNj8(g2.x1 x1Var, int i10, int i11, g2.a2 a2Var, boolean z10, b0 adjustment) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adjustment, "adjustment");
        if (x1Var == null) {
            return g2.b2.TextRange(0, 0);
        }
        long jTextRange = g2.b2.TextRange(i10, i11);
        return (a2Var == null && kotlin.jvm.internal.e0.areEqual(adjustment, a0.f73656a.getCharacter())) ? jTextRange : adjustment.mo5494adjustZXO7KMw(x1Var, jTextRange, -1, z10, a2Var);
    }
}
