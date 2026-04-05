package g2;

import g2.b;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class w {
    @tu.f
    public static final r Paragraph(String text, c2 style, List<b.C0570b> spanStyles, List<b.C0570b> placeholders, int i10, boolean z10, float f10, s2.e density, l2.v resourceLoader) {
        kotlin.jvm.internal.e0.checkNotNullParameter(text, "text");
        kotlin.jvm.internal.e0.checkNotNullParameter(style, "style");
        kotlin.jvm.internal.e0.checkNotNullParameter(spanStyles, "spanStyles");
        kotlin.jvm.internal.e0.checkNotNullParameter(placeholders, "placeholders");
        kotlin.jvm.internal.e0.checkNotNullParameter(density, "density");
        kotlin.jvm.internal.e0.checkNotNullParameter(resourceLoader, "resourceLoader");
        return o2.i.ActualParagraph(text, style, spanStyles, placeholders, i10, z10, f10, density, resourceLoader);
    }

    public static /* synthetic */ r Paragraph$default(String str, c2 c2Var, List list, List list2, int i10, boolean z10, float f10, s2.e eVar, l2.v vVar, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            list = uu.p0.emptyList();
        }
        List list3 = list;
        if ((i11 & 8) != 0) {
            list2 = uu.p0.emptyList();
        }
        List list4 = list2;
        if ((i11 & 16) != 0) {
            i10 = Integer.MAX_VALUE;
        }
        int i12 = i10;
        if ((i11 & 32) != 0) {
            z10 = false;
        }
        return Paragraph(str, c2Var, (List<b.C0570b>) list3, (List<b.C0570b>) list4, i12, z10, f10, eVar, vVar);
    }

    /* renamed from: Paragraph-UdtVg6A, reason: not valid java name */
    public static final r m4024ParagraphUdtVg6A(String text, c2 style, long j10, s2.e density, l2.y fontFamilyResolver, List<b.C0570b> spanStyles, List<b.C0570b> placeholders, int i10, boolean z10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(text, "text");
        kotlin.jvm.internal.e0.checkNotNullParameter(style, "style");
        kotlin.jvm.internal.e0.checkNotNullParameter(density, "density");
        kotlin.jvm.internal.e0.checkNotNullParameter(fontFamilyResolver, "fontFamilyResolver");
        kotlin.jvm.internal.e0.checkNotNullParameter(spanStyles, "spanStyles");
        kotlin.jvm.internal.e0.checkNotNullParameter(placeholders, "placeholders");
        return o2.i.m5772ActualParagraphO3s9Psw(text, style, spanStyles, placeholders, i10, z10, j10, density, fontFamilyResolver);
    }

    /* renamed from: Paragraph-_EkL_-Y, reason: not valid java name */
    public static final r m4026Paragraph_EkL_Y(u paragraphIntrinsics, long j10, int i10, boolean z10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(paragraphIntrinsics, "paragraphIntrinsics");
        return o2.i.m5771ActualParagraphhBUhpc(paragraphIntrinsics, i10, z10, j10);
    }

    /* renamed from: Paragraph-_EkL_-Y$default, reason: not valid java name */
    public static /* synthetic */ r m4027Paragraph_EkL_Y$default(u uVar, long j10, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            i10 = Integer.MAX_VALUE;
        }
        if ((i11 & 8) != 0) {
            z10 = false;
        }
        return m4026Paragraph_EkL_Y(uVar, j10, i10, z10);
    }

    public static final int ceilToInt(float f10) {
        return (int) Math.ceil(f10);
    }

    @tu.f
    public static final r Paragraph(String text, c2 style, float f10, s2.e density, l2.y fontFamilyResolver, List<b.C0570b> spanStyles, List<b.C0570b> placeholders, int i10, boolean z10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(text, "text");
        kotlin.jvm.internal.e0.checkNotNullParameter(style, "style");
        kotlin.jvm.internal.e0.checkNotNullParameter(density, "density");
        kotlin.jvm.internal.e0.checkNotNullParameter(fontFamilyResolver, "fontFamilyResolver");
        kotlin.jvm.internal.e0.checkNotNullParameter(spanStyles, "spanStyles");
        kotlin.jvm.internal.e0.checkNotNullParameter(placeholders, "placeholders");
        return o2.i.m5772ActualParagraphO3s9Psw(text, style, spanStyles, placeholders, i10, z10, s2.d.Constraints$default(0, ceilToInt(f10), 0, 0, 13, null), density, fontFamilyResolver);
    }

    @tu.f
    public static final r Paragraph(u paragraphIntrinsics, int i10, boolean z10, float f10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(paragraphIntrinsics, "paragraphIntrinsics");
        return o2.i.m5771ActualParagraphhBUhpc(paragraphIntrinsics, i10, z10, s2.d.Constraints$default(0, ceilToInt(f10), 0, 0, 13, null));
    }

    public static /* synthetic */ r Paragraph$default(u uVar, int i10, boolean z10, float f10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = Integer.MAX_VALUE;
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return Paragraph(uVar, i10, z10, f10);
    }
}
