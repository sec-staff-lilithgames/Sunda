package m0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class t implements b0 {
    @Override // m0.b0
    /* renamed from: adjust-ZXO7KMw */
    public long mo5494adjustZXO7KMw(g2.x1 textLayoutResult, long j10, int i10, boolean z10, g2.a2 a2Var) {
        kotlin.jvm.internal.e0.checkNotNullParameter(textLayoutResult, "textLayoutResult");
        if (g2.a2.m3954getCollapsedimpl(j10)) {
            return c0.ensureAtLeastOneChar(g2.a2.m3960getStartimpl(j10), sv.n0.getLastIndex(textLayoutResult.getLayoutInput().getText()), z10, a2Var != null ? g2.a2.m3959getReversedimpl(a2Var.m3964unboximpl()) : false);
        }
        return j10;
    }
}
