package g2;

import g2.b;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class v {
    @tu.f
    public static final u ParagraphIntrinsics(String text, c2 style, List<b.C0570b> spanStyles, List<b.C0570b> placeholders, s2.e density, l2.v resourceLoader) {
        kotlin.jvm.internal.e0.checkNotNullParameter(text, "text");
        kotlin.jvm.internal.e0.checkNotNullParameter(style, "style");
        kotlin.jvm.internal.e0.checkNotNullParameter(spanStyles, "spanStyles");
        kotlin.jvm.internal.e0.checkNotNullParameter(placeholders, "placeholders");
        kotlin.jvm.internal.e0.checkNotNullParameter(density, "density");
        kotlin.jvm.internal.e0.checkNotNullParameter(resourceLoader, "resourceLoader");
        return o2.h.ActualParagraphIntrinsics(text, style, spanStyles, placeholders, density, l2.t.createFontFamilyResolver(resourceLoader));
    }

    public static /* synthetic */ u ParagraphIntrinsics$default(String str, c2 c2Var, List list, List list2, s2.e eVar, l2.v vVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            list = uu.p0.emptyList();
        }
        List list3 = list;
        if ((i10 & 8) != 0) {
            list2 = uu.p0.emptyList();
        }
        return ParagraphIntrinsics(str, c2Var, (List<b.C0570b>) list3, (List<b.C0570b>) list2, eVar, vVar);
    }

    public static final u ParagraphIntrinsics(String text, c2 style, List<b.C0570b> spanStyles, List<b.C0570b> placeholders, s2.e density, l2.y fontFamilyResolver) {
        kotlin.jvm.internal.e0.checkNotNullParameter(text, "text");
        kotlin.jvm.internal.e0.checkNotNullParameter(style, "style");
        kotlin.jvm.internal.e0.checkNotNullParameter(spanStyles, "spanStyles");
        kotlin.jvm.internal.e0.checkNotNullParameter(placeholders, "placeholders");
        kotlin.jvm.internal.e0.checkNotNullParameter(density, "density");
        kotlin.jvm.internal.e0.checkNotNullParameter(fontFamilyResolver, "fontFamilyResolver");
        return o2.h.ActualParagraphIntrinsics(text, style, spanStyles, placeholders, density, fontFamilyResolver);
    }

    public static /* synthetic */ u ParagraphIntrinsics$default(String str, c2 c2Var, List list, List list2, s2.e eVar, l2.y yVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            list = uu.p0.emptyList();
        }
        List list3 = list;
        if ((i10 & 8) != 0) {
            list2 = uu.p0.emptyList();
        }
        return ParagraphIntrinsics(str, c2Var, (List<b.C0570b>) list3, (List<b.C0570b>) list2, eVar, yVar);
    }
}
