package o2;

import g2.b;
import g2.c2;
import g2.r;
import g2.u;
import g2.w;
import java.util.List;
import kotlin.jvm.internal.e0;
import l2.t;
import l2.v;
import l2.y;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class i {
    @tu.f
    public static final r ActualParagraph(String text, c2 style, List<b.C0570b> spanStyles, List<b.C0570b> placeholders, int i10, boolean z10, float f10, s2.e density, v resourceLoader) {
        e0.checkNotNullParameter(text, "text");
        e0.checkNotNullParameter(style, "style");
        e0.checkNotNullParameter(spanStyles, "spanStyles");
        e0.checkNotNullParameter(placeholders, "placeholders");
        e0.checkNotNullParameter(density, "density");
        e0.checkNotNullParameter(resourceLoader, "resourceLoader");
        return new d(new g(text, style, spanStyles, placeholders, t.createFontFamilyResolver(resourceLoader), density), i10, z10, s2.d.Constraints$default(0, w.ceilToInt(f10), 0, 0, 13, null), null);
    }

    /* renamed from: ActualParagraph--hBUhpc, reason: not valid java name */
    public static final r m5771ActualParagraphhBUhpc(u paragraphIntrinsics, int i10, boolean z10, long j10) {
        e0.checkNotNullParameter(paragraphIntrinsics, "paragraphIntrinsics");
        return new d((g) paragraphIntrinsics, i10, z10, j10, null);
    }

    /* renamed from: ActualParagraph-O3s9Psw, reason: not valid java name */
    public static final r m5772ActualParagraphO3s9Psw(String text, c2 style, List<b.C0570b> spanStyles, List<b.C0570b> placeholders, int i10, boolean z10, long j10, s2.e density, y fontFamilyResolver) {
        e0.checkNotNullParameter(text, "text");
        e0.checkNotNullParameter(style, "style");
        e0.checkNotNullParameter(spanStyles, "spanStyles");
        e0.checkNotNullParameter(placeholders, "placeholders");
        e0.checkNotNullParameter(density, "density");
        e0.checkNotNullParameter(fontFamilyResolver, "fontFamilyResolver");
        return new d(new g(text, style, spanStyles, placeholders, fontFamilyResolver, density), i10, z10, j10, null);
    }

    public static final int access$numberOfLinesThatFitMaxHeight(h2.w wVar, int i10) {
        int lineCount = wVar.getLineCount();
        for (int i11 = 0; i11 < lineCount; i11++) {
            if (wVar.getLineBottom(i11) > i10) {
                return i11;
            }
        }
        return wVar.getLineCount();
    }

    /* renamed from: access$toLayoutAlign-AMY3VfE, reason: not valid java name */
    public static final int m5773access$toLayoutAlignAMY3VfE(r2.m mVar) {
        r2.l lVar = r2.m.f83701b;
        if (mVar == null ? false : r2.m.m6075equalsimpl0(mVar.m6078unboximpl(), lVar.m6069getLefte0LSkKk())) {
            return 3;
        }
        if (mVar == null ? false : r2.m.m6075equalsimpl0(mVar.m6078unboximpl(), lVar.m6070getRighte0LSkKk())) {
            return 4;
        }
        if (mVar == null ? false : r2.m.m6075equalsimpl0(mVar.m6078unboximpl(), lVar.m6066getCentere0LSkKk())) {
            return 2;
        }
        if (!(mVar == null ? false : r2.m.m6075equalsimpl0(mVar.m6078unboximpl(), lVar.m6071getStarte0LSkKk()))) {
            if (mVar == null ? false : r2.m.m6075equalsimpl0(mVar.m6078unboximpl(), lVar.m6067getEnde0LSkKk())) {
                return 1;
            }
        }
        return 0;
    }
}
