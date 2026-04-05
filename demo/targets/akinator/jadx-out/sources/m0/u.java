package m0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class u implements b0 {
    public static int a(g2.x1 x1Var, int i10, int i11, int i12, boolean z10, boolean z11) {
        long jM4045getWordBoundaryjx7JFs = x1Var.m4045getWordBoundaryjx7JFs(i10);
        int iM3960getStartimpl = x1Var.getLineForOffset(g2.a2.m3960getStartimpl(jM4045getWordBoundaryjx7JFs)) == i11 ? g2.a2.m3960getStartimpl(jM4045getWordBoundaryjx7JFs) : x1Var.getLineStart(i11);
        int iM3955getEndimpl = x1Var.getLineForOffset(g2.a2.m3955getEndimpl(jM4045getWordBoundaryjx7JFs)) == i11 ? g2.a2.m3955getEndimpl(jM4045getWordBoundaryjx7JFs) : g2.x1.getLineEnd$default(x1Var, i11, false, 2, null);
        if (iM3960getStartimpl != i12) {
            if (iM3955getEndimpl != i12) {
                int i13 = (iM3960getStartimpl + iM3955getEndimpl) / 2;
                if (!(z10 ^ z11) ? i10 < i13 : i10 <= i13) {
                }
            }
            return iM3960getStartimpl;
        }
        return iM3955getEndimpl;
    }

    public static int b(g2.x1 x1Var, int i10, int i11, int i12, int i13, boolean z10, boolean z11) {
        if (i10 == i11) {
            return i12;
        }
        int lineForOffset = x1Var.getLineForOffset(i10);
        if (lineForOffset != x1Var.getLineForOffset(i12)) {
            return a(x1Var, i10, lineForOffset, i13, z10, z11);
        }
        if (i11 == -1 || (i10 != i11 && (!(z10 ^ z11) ? i10 > i11 : i10 < i11))) {
            long jM4045getWordBoundaryjx7JFs = x1Var.m4045getWordBoundaryjx7JFs(i12);
            if (i12 == g2.a2.m3960getStartimpl(jM4045getWordBoundaryjx7JFs) || i12 == g2.a2.m3955getEndimpl(jM4045getWordBoundaryjx7JFs)) {
                return a(x1Var, i10, lineForOffset, i13, z10, z11);
            }
        }
        return i10;
    }

    @Override // m0.b0
    /* renamed from: adjust-ZXO7KMw */
    public long mo5494adjustZXO7KMw(g2.x1 textLayoutResult, long j10, int i10, boolean z10, g2.a2 a2Var) {
        int iM3960getStartimpl;
        int iB;
        kotlin.jvm.internal.e0.checkNotNullParameter(textLayoutResult, "textLayoutResult");
        if (a2Var == null) {
            return a0.f73656a.getWord().mo5494adjustZXO7KMw(textLayoutResult, j10, i10, z10, a2Var);
        }
        if (g2.a2.m3954getCollapsedimpl(j10)) {
            return c0.ensureAtLeastOneChar(g2.a2.m3960getStartimpl(j10), sv.n0.getLastIndex(textLayoutResult.getLayoutInput().getText()), z10, g2.a2.m3959getReversedimpl(a2Var.m3964unboximpl()));
        }
        if (z10) {
            iM3960getStartimpl = b(textLayoutResult, g2.a2.m3960getStartimpl(j10), i10, g2.a2.m3960getStartimpl(a2Var.m3964unboximpl()), g2.a2.m3955getEndimpl(j10), true, g2.a2.m3959getReversedimpl(j10));
            iB = g2.a2.m3955getEndimpl(j10);
        } else {
            iM3960getStartimpl = g2.a2.m3960getStartimpl(j10);
            iB = b(textLayoutResult, g2.a2.m3955getEndimpl(j10), i10, g2.a2.m3955getEndimpl(a2Var.m3964unboximpl()), g2.a2.m3960getStartimpl(j10), false, g2.a2.m3959getReversedimpl(j10));
        }
        return g2.b2.TextRange(iM3960getStartimpl, iB);
    }
}
