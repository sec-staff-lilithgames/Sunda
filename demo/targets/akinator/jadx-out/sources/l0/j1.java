package l0;

import g2.b;
import g2.c2;
import g2.w1;
import g2.x1;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class j1 {
    /* renamed from: canReuse-7_7YC6M, reason: not valid java name */
    public static final boolean m5265canReuse7_7YC6M(x1 canReuse, g2.b text, c2 style, List<b.C0570b> placeholders, int i10, boolean z10, int i11, s2.e density, s2.x layoutDirection, l2.y fontFamilyResolver, long j10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(canReuse, "$this$canReuse");
        kotlin.jvm.internal.e0.checkNotNullParameter(text, "text");
        kotlin.jvm.internal.e0.checkNotNullParameter(style, "style");
        kotlin.jvm.internal.e0.checkNotNullParameter(placeholders, "placeholders");
        kotlin.jvm.internal.e0.checkNotNullParameter(density, "density");
        kotlin.jvm.internal.e0.checkNotNullParameter(layoutDirection, "layoutDirection");
        kotlin.jvm.internal.e0.checkNotNullParameter(fontFamilyResolver, "fontFamilyResolver");
        w1 layoutInput = canReuse.getLayoutInput();
        if (canReuse.getMultiParagraph().getIntrinsics().getHasStaleResolvedFonts() || !kotlin.jvm.internal.e0.areEqual(layoutInput.getText(), text) || !layoutInput.getStyle().hasSameLayoutAffectingAttributes(style) || !kotlin.jvm.internal.e0.areEqual(layoutInput.getPlaceholders(), placeholders) || layoutInput.getMaxLines() != i10 || layoutInput.getSoftWrap() != z10 || !r2.a0.m6027equalsimpl0(layoutInput.m4032getOverflowgIe3tQ8(), i11) || !kotlin.jvm.internal.e0.areEqual(layoutInput.getDensity(), density) || layoutInput.getLayoutDirection() != layoutDirection || !kotlin.jvm.internal.e0.areEqual(layoutInput.getFontFamilyResolver(), fontFamilyResolver) || s2.c.m6757getMinWidthimpl(j10) != s2.c.m6757getMinWidthimpl(layoutInput.m4031getConstraintsmsEJaDk())) {
            return false;
        }
        if (z10 || r2.a0.m6027equalsimpl0(i11, r2.a0.f83672b.m6100getEllipsisgIe3tQ8())) {
            return s2.c.m6755getMaxWidthimpl(j10) == s2.c.m6755getMaxWidthimpl(layoutInput.m4031getConstraintsmsEJaDk()) && s2.c.m6754getMaxHeightimpl(j10) == s2.c.m6754getMaxHeightimpl(layoutInput.m4031getConstraintsmsEJaDk());
        }
        return true;
    }
}
