package g2;

import g2.b;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final b f56756a = new b("", null, null, 6, null);

    public static final b AnnotatedString(String text, r1 spanStyle, x xVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(text, "text");
        kotlin.jvm.internal.e0.checkNotNullParameter(spanStyle, "spanStyle");
        return new b(text, uu.o0.listOf(new b.C0570b(spanStyle, 0, text.length())), xVar == null ? uu.p0.emptyList() : uu.o0.listOf(new b.C0570b(xVar, 0, text.length())));
    }

    public static /* synthetic */ b AnnotatedString$default(String str, r1 r1Var, x xVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            xVar = null;
        }
        return AnnotatedString(str, r1Var, xVar);
    }

    public static final List access$filterRanges(List list, int i10, int i11) {
        if (i10 > i11) {
            throw new IllegalArgumentException(("start (" + i10 + ") should be less than or equal to end (" + i11 + ')').toString());
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            Object obj = list.get(i12);
            b.C0570b c0570b = (b.C0570b) obj;
            if (intersect(i10, i11, c0570b.getStart(), c0570b.getEnd())) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i13 = 0; i13 < size2; i13++) {
            b.C0570b c0570b2 = (b.C0570b) arrayList.get(i13);
            arrayList2.add(new b.C0570b(c0570b2.getItem(), Math.max(i10, c0570b2.getStart()) - i10, Math.min(i11, c0570b2.getEnd()) - i10, c0570b2.getTag()));
        }
        return arrayList2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.util.List] */
    public static final b access$substringWithoutParagraphStyles(b bVar, int i10, int i11) {
        String strSubstring;
        List arrayList;
        if (i10 != i11) {
            strSubstring = bVar.getText().substring(i10, i11);
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        } else {
            strSubstring = "";
        }
        if (i10 == i11) {
            arrayList = uu.p0.emptyList();
        } else if (i10 != 0 || i11 < bVar.getText().length()) {
            List<b.C0570b> spanStyles = bVar.getSpanStyles();
            ArrayList arrayList2 = new ArrayList(spanStyles.size());
            int size = spanStyles.size();
            for (int i12 = 0; i12 < size; i12++) {
                b.C0570b c0570b = spanStyles.get(i12);
                b.C0570b c0570b2 = c0570b;
                if (intersect(i10, i11, c0570b2.getStart(), c0570b2.getEnd())) {
                    arrayList2.add(c0570b);
                }
            }
            arrayList = new ArrayList(arrayList2.size());
            int size2 = arrayList2.size();
            for (int i13 = 0; i13 < size2; i13++) {
                b.C0570b c0570b3 = (b.C0570b) arrayList2.get(i13);
                arrayList.add(new b.C0570b(c0570b3.getItem(), qv.v.coerceIn(c0570b3.getStart(), i10, i11) - i10, qv.v.coerceIn(c0570b3.getEnd(), i10, i11) - i10));
            }
        } else {
            arrayList = bVar.getSpanStyles();
        }
        return new b(strSubstring, arrayList, null, 4, null);
    }

    public static final b buildAnnotatedString(kv.l builder) {
        kotlin.jvm.internal.e0.checkNotNullParameter(builder, "builder");
        b.a aVar = new b.a(0, 1, null);
        builder.invoke(aVar);
        return aVar.toAnnotatedString();
    }

    public static final b capitalize(b bVar, n2.e localeList) {
        kotlin.jvm.internal.e0.checkNotNullParameter(bVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(localeList, "localeList");
        return k.transform(bVar, new c(localeList));
    }

    public static /* synthetic */ b capitalize$default(b bVar, n2.e eVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            eVar = n2.e.f75556e.getCurrent();
        }
        return capitalize(bVar, eVar);
    }

    public static final boolean contains(int i10, int i11, int i12, int i13) {
        if (i10 <= i12 && i13 <= i11) {
            if (i11 == i13) {
                if ((i12 == i13) == (i10 == i11)) {
                }
            }
            return true;
        }
        return false;
    }

    public static final b decapitalize(b bVar, n2.e localeList) {
        kotlin.jvm.internal.e0.checkNotNullParameter(bVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(localeList, "localeList");
        return k.transform(bVar, new d(localeList));
    }

    public static /* synthetic */ b decapitalize$default(b bVar, n2.e eVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            eVar = n2.e.f75556e.getCurrent();
        }
        return decapitalize(bVar, eVar);
    }

    public static final b emptyAnnotatedString() {
        return f56756a;
    }

    public static final boolean intersect(int i10, int i11, int i12, int i13) {
        return Math.max(i10, i12) < Math.min(i11, i13) || contains(i10, i11, i12, i13) || contains(i12, i13, i10, i11);
    }

    public static final <T> List<T> mapEachParagraphStyle(b bVar, x defaultParagraphStyle, kv.p block) {
        kotlin.jvm.internal.e0.checkNotNullParameter(bVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(defaultParagraphStyle, "defaultParagraphStyle");
        kotlin.jvm.internal.e0.checkNotNullParameter(block, "block");
        List<b.C0570b> listNormalizedParagraphStyles = normalizedParagraphStyles(bVar, defaultParagraphStyle);
        ArrayList arrayList = new ArrayList(listNormalizedParagraphStyles.size());
        int size = listNormalizedParagraphStyles.size();
        for (int i10 = 0; i10 < size; i10++) {
            b.C0570b c0570b = listNormalizedParagraphStyles.get(i10);
            arrayList.add(block.invoke(access$substringWithoutParagraphStyles(bVar, c0570b.getStart(), c0570b.getEnd()), c0570b));
        }
        return arrayList;
    }

    public static final List<b.C0570b> normalizedParagraphStyles(b bVar, x defaultParagraphStyle) {
        kotlin.jvm.internal.e0.checkNotNullParameter(bVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(defaultParagraphStyle, "defaultParagraphStyle");
        int length = bVar.getText().length();
        List<b.C0570b> paragraphStyles = bVar.getParagraphStyles();
        ArrayList arrayList = new ArrayList();
        int size = paragraphStyles.size();
        int i10 = 0;
        int i11 = 0;
        while (i10 < size) {
            b.C0570b c0570b = paragraphStyles.get(i10);
            x xVar = (x) c0570b.component1();
            int iComponent2 = c0570b.component2();
            int iComponent3 = c0570b.component3();
            if (iComponent2 != i11) {
                arrayList.add(new b.C0570b(defaultParagraphStyle, i11, iComponent2));
            }
            arrayList.add(new b.C0570b(defaultParagraphStyle.merge(xVar), iComponent2, iComponent3));
            i10++;
            i11 = iComponent3;
        }
        if (i11 != length) {
            arrayList.add(new b.C0570b(defaultParagraphStyle, i11, length));
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new b.C0570b(defaultParagraphStyle, 0, 0));
        }
        return arrayList;
    }

    public static final b toLowerCase(b bVar, n2.e localeList) {
        kotlin.jvm.internal.e0.checkNotNullParameter(bVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(localeList, "localeList");
        return k.transform(bVar, new e(localeList));
    }

    public static /* synthetic */ b toLowerCase$default(b bVar, n2.e eVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            eVar = n2.e.f75556e.getCurrent();
        }
        return toLowerCase(bVar, eVar);
    }

    public static final b toUpperCase(b bVar, n2.e localeList) {
        kotlin.jvm.internal.e0.checkNotNullParameter(bVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(localeList, "localeList");
        return k.transform(bVar, new f(localeList));
    }

    public static /* synthetic */ b toUpperCase$default(b bVar, n2.e eVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            eVar = n2.e.f75556e.getCurrent();
        }
        return toUpperCase(bVar, eVar);
    }

    public static final <R> R withAnnotation(b.a aVar, String tag, String annotation, kv.l block) {
        kotlin.jvm.internal.e0.checkNotNullParameter(aVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(tag, "tag");
        kotlin.jvm.internal.e0.checkNotNullParameter(annotation, "annotation");
        kotlin.jvm.internal.e0.checkNotNullParameter(block, "block");
        int iPushStringAnnotation = aVar.pushStringAnnotation(tag, annotation);
        try {
            return (R) block.invoke(aVar);
        } finally {
            kotlin.jvm.internal.b0.finallyStart(1);
            aVar.pop(iPushStringAnnotation);
            kotlin.jvm.internal.b0.finallyEnd(1);
        }
    }

    public static final <R> R withStyle(b.a aVar, r1 style, kv.l block) {
        kotlin.jvm.internal.e0.checkNotNullParameter(aVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(style, "style");
        kotlin.jvm.internal.e0.checkNotNullParameter(block, "block");
        int iPushStyle = aVar.pushStyle(style);
        try {
            return (R) block.invoke(aVar);
        } finally {
            kotlin.jvm.internal.b0.finallyStart(1);
            aVar.pop(iPushStyle);
            kotlin.jvm.internal.b0.finallyEnd(1);
        }
    }

    public static final b AnnotatedString(String text, x paragraphStyle) {
        kotlin.jvm.internal.e0.checkNotNullParameter(text, "text");
        kotlin.jvm.internal.e0.checkNotNullParameter(paragraphStyle, "paragraphStyle");
        return new b(text, uu.p0.emptyList(), uu.o0.listOf(new b.C0570b(paragraphStyle, 0, text.length())));
    }

    public static final <R> R withAnnotation(b.a aVar, f2 ttsAnnotation, kv.l block) {
        kotlin.jvm.internal.e0.checkNotNullParameter(aVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(ttsAnnotation, "ttsAnnotation");
        kotlin.jvm.internal.e0.checkNotNullParameter(block, "block");
        int iPushTtsAnnotation = aVar.pushTtsAnnotation(ttsAnnotation);
        try {
            return (R) block.invoke(aVar);
        } finally {
            kotlin.jvm.internal.b0.finallyStart(1);
            aVar.pop(iPushTtsAnnotation);
            kotlin.jvm.internal.b0.finallyEnd(1);
        }
    }

    public static final <R> R withStyle(b.a aVar, x style, kv.l block) {
        kotlin.jvm.internal.e0.checkNotNullParameter(aVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(style, "style");
        kotlin.jvm.internal.e0.checkNotNullParameter(block, "block");
        int iPushStyle = aVar.pushStyle(style);
        try {
            return (R) block.invoke(aVar);
        } finally {
            kotlin.jvm.internal.b0.finallyStart(1);
            aVar.pop(iPushStyle);
            kotlin.jvm.internal.b0.finallyEnd(1);
        }
    }
}
