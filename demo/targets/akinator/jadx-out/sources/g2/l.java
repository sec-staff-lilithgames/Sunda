package g2;

import g2.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final o f56781a;

    /* renamed from: b, reason: collision with root package name */
    public final int f56782b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f56783c;

    /* renamed from: d, reason: collision with root package name */
    public final float f56784d;

    /* renamed from: e, reason: collision with root package name */
    public final float f56785e;

    /* renamed from: f, reason: collision with root package name */
    public final int f56786f;

    /* renamed from: g, reason: collision with root package name */
    public final List f56787g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f56788h;

    public /* synthetic */ l(o oVar, long j10, int i10, boolean z10, int i11, kotlin.jvm.internal.u uVar) {
        this(oVar, j10, (i11 & 4) != 0 ? Integer.MAX_VALUE : i10, (i11 & 8) != 0 ? false : z10, null);
    }

    public static /* synthetic */ int getLineEnd$default(l lVar, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        return lVar.getLineEnd(i10, z10);
    }

    public static /* synthetic */ void paint$default(l lVar, j1.e0 e0Var, j1.b0 b0Var, j1.d2 d2Var, r2.n nVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            d2Var = null;
        }
        if ((i10 & 8) != 0) {
            nVar = null;
        }
        lVar.paint(e0Var, b0Var, d2Var, nVar);
    }

    /* renamed from: paint-RPmYEkk$default, reason: not valid java name */
    public static /* synthetic */ void m3993paintRPmYEkk$default(l lVar, j1.e0 e0Var, long j10, j1.d2 d2Var, r2.n nVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = j1.m0.f68918b.m4835getUnspecified0d7_KjU();
        }
        lVar.m3996paintRPmYEkk(e0Var, j10, (i10 & 4) != 0 ? null : d2Var, (i10 & 8) != 0 ? null : nVar);
    }

    public final void a(int i10) {
        o oVar = this.f56781a;
        if (i10 < 0 || i10 > oVar.getAnnotatedString().getText().length()) {
            StringBuilder sbT = o2.t(i10, "offset(", ") is out of bounds [0, ");
            sbT.append(oVar.getAnnotatedString().length());
            sbT.append(AbstractJsonLexerKt.END_LIST);
            throw new IllegalArgumentException(sbT.toString().toString());
        }
    }

    public final void b(int i10) {
        if (i10 < 0 || i10 >= this.f56786f) {
            throw new IllegalArgumentException(("lineIndex(" + i10 + ") is out of bounds [0, " + i10 + ')').toString());
        }
    }

    public final r2.k getBidiRunDirection(int i10) {
        a(i10);
        int length = this.f56781a.getAnnotatedString().length();
        ArrayList arrayList = this.f56788h;
        s sVar = (s) arrayList.get(i10 == length ? uu.p0.getLastIndex(arrayList) : q.findParagraphByIndex(arrayList, i10));
        return sVar.getParagraph().getBidiRunDirection(sVar.toLocalIndex(i10));
    }

    public final i1.j getBoundingBox(int i10) {
        o oVar = this.f56781a;
        if (i10 >= 0 && i10 < oVar.getAnnotatedString().getText().length()) {
            ArrayList arrayList = this.f56788h;
            s sVar = (s) arrayList.get(q.findParagraphByIndex(arrayList, i10));
            return sVar.toGlobal(sVar.getParagraph().getBoundingBox(sVar.toLocalIndex(i10)));
        }
        StringBuilder sbT = o2.t(i10, "offset(", ") is out of bounds [0, ");
        sbT.append(oVar.getAnnotatedString().length());
        sbT.append(')');
        throw new IllegalArgumentException(sbT.toString().toString());
    }

    public final i1.j getCursorRect(int i10) {
        a(i10);
        int length = this.f56781a.getAnnotatedString().length();
        ArrayList arrayList = this.f56788h;
        s sVar = (s) arrayList.get(i10 == length ? uu.p0.getLastIndex(arrayList) : q.findParagraphByIndex(arrayList, i10));
        return sVar.toGlobal(sVar.getParagraph().getCursorRect(sVar.toLocalIndex(i10)));
    }

    public final boolean getDidExceedMaxLines() {
        return this.f56783c;
    }

    public final float getFirstBaseline() {
        ArrayList arrayList = this.f56788h;
        if (arrayList.isEmpty()) {
            return 0.0f;
        }
        return ((s) arrayList.get(0)).getParagraph().getFirstBaseline();
    }

    public final float getHeight() {
        return this.f56785e;
    }

    public final float getHorizontalPosition(int i10, boolean z10) {
        a(i10);
        int length = this.f56781a.getAnnotatedString().length();
        ArrayList arrayList = this.f56788h;
        s sVar = (s) arrayList.get(i10 == length ? uu.p0.getLastIndex(arrayList) : q.findParagraphByIndex(arrayList, i10));
        return sVar.getParagraph().getHorizontalPosition(sVar.toLocalIndex(i10), z10);
    }

    public final o getIntrinsics() {
        return this.f56781a;
    }

    public final float getLastBaseline() {
        ArrayList arrayList = this.f56788h;
        if (arrayList.isEmpty()) {
            return 0.0f;
        }
        s sVar = (s) uu.y0.last((List) arrayList);
        return sVar.toGlobalYPosition(sVar.getParagraph().getLastBaseline());
    }

    public final float getLineBottom(int i10) {
        b(i10);
        ArrayList arrayList = this.f56788h;
        s sVar = (s) arrayList.get(q.findParagraphByLineIndex(arrayList, i10));
        return sVar.toGlobalYPosition(sVar.getParagraph().getLineBottom(sVar.toLocalLineIndex(i10)));
    }

    public final int getLineCount() {
        return this.f56786f;
    }

    public final int getLineEnd(int i10, boolean z10) {
        b(i10);
        ArrayList arrayList = this.f56788h;
        s sVar = (s) arrayList.get(q.findParagraphByLineIndex(arrayList, i10));
        return sVar.toGlobalIndex(sVar.getParagraph().getLineEnd(sVar.toLocalLineIndex(i10), z10));
    }

    public final int getLineForOffset(int i10) {
        a(i10);
        int length = this.f56781a.getAnnotatedString().length();
        ArrayList arrayList = this.f56788h;
        s sVar = (s) arrayList.get(i10 == length ? uu.p0.getLastIndex(arrayList) : q.findParagraphByIndex(arrayList, i10));
        return sVar.toGlobalLineIndex(sVar.getParagraph().getLineForOffset(sVar.toLocalIndex(i10)));
    }

    public final int getLineForVerticalPosition(float f10) {
        ArrayList arrayList = this.f56788h;
        s sVar = (s) arrayList.get(f10 <= 0.0f ? 0 : f10 >= this.f56785e ? uu.p0.getLastIndex(arrayList) : q.findParagraphByY(arrayList, f10));
        return sVar.getLength() == 0 ? Math.max(0, sVar.getStartIndex() - 1) : sVar.toGlobalLineIndex(sVar.getParagraph().getLineForVerticalPosition(sVar.toLocalYPosition(f10)));
    }

    public final float getLineHeight(int i10) {
        b(i10);
        ArrayList arrayList = this.f56788h;
        s sVar = (s) arrayList.get(q.findParagraphByLineIndex(arrayList, i10));
        return sVar.getParagraph().getLineHeight(sVar.toLocalLineIndex(i10));
    }

    public final float getLineLeft(int i10) {
        b(i10);
        ArrayList arrayList = this.f56788h;
        s sVar = (s) arrayList.get(q.findParagraphByLineIndex(arrayList, i10));
        return sVar.getParagraph().getLineLeft(sVar.toLocalLineIndex(i10));
    }

    public final float getLineRight(int i10) {
        b(i10);
        ArrayList arrayList = this.f56788h;
        s sVar = (s) arrayList.get(q.findParagraphByLineIndex(arrayList, i10));
        return sVar.getParagraph().getLineRight(sVar.toLocalLineIndex(i10));
    }

    public final int getLineStart(int i10) {
        b(i10);
        ArrayList arrayList = this.f56788h;
        s sVar = (s) arrayList.get(q.findParagraphByLineIndex(arrayList, i10));
        return sVar.toGlobalIndex(sVar.getParagraph().getLineStart(sVar.toLocalLineIndex(i10)));
    }

    public final float getLineTop(int i10) {
        b(i10);
        ArrayList arrayList = this.f56788h;
        s sVar = (s) arrayList.get(q.findParagraphByLineIndex(arrayList, i10));
        return sVar.toGlobalYPosition(sVar.getParagraph().getLineTop(sVar.toLocalLineIndex(i10)));
    }

    public final float getLineWidth(int i10) {
        b(i10);
        ArrayList arrayList = this.f56788h;
        s sVar = (s) arrayList.get(q.findParagraphByLineIndex(arrayList, i10));
        return sVar.getParagraph().getLineWidth(sVar.toLocalLineIndex(i10));
    }

    public final float getMaxIntrinsicWidth() {
        return this.f56781a.getMaxIntrinsicWidth();
    }

    public final int getMaxLines() {
        return this.f56782b;
    }

    public final float getMinIntrinsicWidth() {
        return this.f56781a.getMaxIntrinsicWidth();
    }

    /* renamed from: getOffsetForPosition-k-4lQ0M, reason: not valid java name */
    public final int m3994getOffsetForPositionk4lQ0M(long j10) {
        float fM4186getYimpl = i1.h.m4186getYimpl(j10);
        ArrayList arrayList = this.f56788h;
        s sVar = (s) arrayList.get(fM4186getYimpl <= 0.0f ? 0 : i1.h.m4186getYimpl(j10) >= this.f56785e ? uu.p0.getLastIndex(arrayList) : q.findParagraphByY(arrayList, i1.h.m4186getYimpl(j10)));
        return sVar.getLength() == 0 ? Math.max(0, sVar.getStartIndex() - 1) : sVar.toGlobalIndex(sVar.getParagraph().mo4005getOffsetForPositionk4lQ0M(sVar.m4022toLocalMKHz9U(j10)));
    }

    public final r2.k getParagraphDirection(int i10) {
        a(i10);
        int length = this.f56781a.getAnnotatedString().length();
        ArrayList arrayList = this.f56788h;
        s sVar = (s) arrayList.get(i10 == length ? uu.p0.getLastIndex(arrayList) : q.findParagraphByIndex(arrayList, i10));
        return sVar.getParagraph().getParagraphDirection(sVar.toLocalIndex(i10));
    }

    public final List<s> getParagraphInfoList$ui_text_release() {
        return this.f56788h;
    }

    public final j1.l1 getPathForRange(int i10, int i11) {
        o oVar = this.f56781a;
        if (i10 < 0 || i10 > i11 || i11 > oVar.getAnnotatedString().getText().length()) {
            StringBuilder sbF = w0.i.f(i10, i11, "Start(", ") or End(", ") is out of range [0..");
            sbF.append(oVar.getAnnotatedString().getText().length());
            sbF.append("), or start > end!");
            throw new IllegalArgumentException(sbF.toString().toString());
        }
        if (i10 == i11) {
            return j1.p.Path();
        }
        ArrayList arrayList = this.f56788h;
        j1.l1 l1VarPath = j1.p.Path();
        int size = arrayList.size();
        for (int iFindParagraphByIndex = q.findParagraphByIndex(arrayList, i10); iFindParagraphByIndex < size; iFindParagraphByIndex++) {
            s sVar = (s) arrayList.get(iFindParagraphByIndex);
            if (sVar.getStartIndex() >= i11) {
                break;
            }
            if (sVar.getStartIndex() != sVar.getEndIndex()) {
                j1.l1.m4840addPathUv8p0NA$default(l1VarPath, sVar.toGlobal(sVar.getParagraph().getPathForRange(sVar.toLocalIndex(i10), sVar.toLocalIndex(i11))), 0L, 2, null);
            }
        }
        return l1VarPath;
    }

    public final List<i1.j> getPlaceholderRects() {
        return this.f56787g;
    }

    public final float getWidth() {
        return this.f56784d;
    }

    /* renamed from: getWordBoundary--jx7JFs, reason: not valid java name */
    public final long m3995getWordBoundaryjx7JFs(int i10) {
        a(i10);
        int length = this.f56781a.getAnnotatedString().length();
        ArrayList arrayList = this.f56788h;
        s sVar = (s) arrayList.get(i10 == length ? uu.p0.getLastIndex(arrayList) : q.findParagraphByIndex(arrayList, i10));
        return sVar.m4021toGlobalGEjPoXI(sVar.getParagraph().mo4006getWordBoundaryjx7JFs(sVar.toLocalIndex(i10)));
    }

    public final boolean isLineEllipsized(int i10) {
        b(i10);
        ArrayList arrayList = this.f56788h;
        return ((s) arrayList.get(q.findParagraphByLineIndex(arrayList, i10))).getParagraph().isLineEllipsized(i10);
    }

    public final void paint(j1.e0 canvas, j1.b0 brush, j1.d2 d2Var, r2.n nVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(canvas, "canvas");
        kotlin.jvm.internal.e0.checkNotNullParameter(brush, "brush");
        o2.b.drawMultiParagraph(this, canvas, brush, d2Var, nVar);
    }

    /* renamed from: paint-RPmYEkk, reason: not valid java name */
    public final void m3996paintRPmYEkk(j1.e0 canvas, long j10, j1.d2 d2Var, r2.n nVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(canvas, "canvas");
        canvas.save();
        ArrayList arrayList = this.f56788h;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            s sVar = (s) arrayList.get(i10);
            j1.e0 e0Var = canvas;
            long j11 = j10;
            sVar.getParagraph().mo4007paintRPmYEkk(e0Var, j11, d2Var, nVar);
            e0Var.translate(0.0f, sVar.getParagraph().getHeight());
            i10++;
            canvas = e0Var;
            j10 = j11;
        }
        canvas.restore();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.util.List] */
    public l(o oVar, long j10, int i10, boolean z10, kotlin.jvm.internal.u uVar) {
        boolean z11;
        this.f56781a = oVar;
        this.f56782b = i10;
        if (s2.c.m6757getMinWidthimpl(j10) != 0 || s2.c.m6756getMinHeightimpl(j10) != 0) {
            throw new IllegalArgumentException("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        ArrayList arrayList = new ArrayList();
        List<t> infoList$ui_text_release = oVar.getInfoList$ui_text_release();
        int size = infoList$ui_text_release.size();
        int i11 = 0;
        float f10 = 0.0f;
        int i12 = 0;
        while (i12 < size) {
            t tVar = infoList$ui_text_release.get(i12);
            r rVarM4026Paragraph_EkL_Y = w.m4026Paragraph_EkL_Y(tVar.getIntrinsics(), s2.d.Constraints$default(0, s2.c.m6755getMaxWidthimpl(j10), 0, s2.c.m6750getHasBoundedHeightimpl(j10) ? qv.v.coerceAtLeast(s2.c.m6754getMaxHeightimpl(j10) - w.ceilToInt(f10), 0) : s2.c.m6754getMaxHeightimpl(j10), 5, null), this.f56782b - i11, z10);
            float height = rVarM4026Paragraph_EkL_Y.getHeight() + f10;
            int lineCount = rVarM4026Paragraph_EkL_Y.getLineCount() + i11;
            arrayList.add(new s(rVarM4026Paragraph_EkL_Y, tVar.getStartIndex(), tVar.getEndIndex(), i11, lineCount, f10, height));
            if (rVarM4026Paragraph_EkL_Y.getDidExceedMaxLines() || (lineCount == this.f56782b && i12 != uu.p0.getLastIndex(this.f56781a.getInfoList$ui_text_release()))) {
                z11 = true;
                i11 = lineCount;
                f10 = height;
                break;
            } else {
                i12++;
                i11 = lineCount;
                f10 = height;
            }
        }
        z11 = false;
        this.f56785e = f10;
        this.f56786f = i11;
        this.f56783c = z11;
        this.f56788h = arrayList;
        this.f56784d = s2.c.m6755getMaxWidthimpl(j10);
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i13 = 0; i13 < size2; i13++) {
            s sVar = (s) arrayList.get(i13);
            List<i1.j> placeholderRects = sVar.getParagraph().getPlaceholderRects();
            ArrayList arrayList3 = new ArrayList(placeholderRects.size());
            int size3 = placeholderRects.size();
            for (int i14 = 0; i14 < size3; i14++) {
                i1.j jVar = placeholderRects.get(i14);
                arrayList3.add(jVar != null ? sVar.toGlobal(jVar) : null);
            }
            uu.v0.addAll(arrayList2, arrayList3);
        }
        int size4 = arrayList2.size();
        ArrayList arrayListPlus = arrayList2;
        if (size4 < this.f56781a.getPlaceholders().size()) {
            int size5 = this.f56781a.getPlaceholders().size() - arrayList2.size();
            ArrayList arrayList4 = new ArrayList(size5);
            for (int i15 = 0; i15 < size5; i15++) {
                arrayList4.add(null);
            }
            arrayListPlus = uu.y0.plus((Collection) arrayList2, (Iterable) arrayList4);
        }
        this.f56787g = arrayListPlus;
    }

    public /* synthetic */ l(o oVar, int i10, boolean z10, float f10, int i11, kotlin.jvm.internal.u uVar) {
        this(oVar, (i11 & 2) != 0 ? Integer.MAX_VALUE : i10, (i11 & 4) != 0 ? false : z10, f10);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @tu.f
    public l(o intrinsics, int i10, boolean z10, float f10) {
        this(intrinsics, s2.d.Constraints$default(0, w.ceilToInt(f10), 0, 0, 13, null), i10, z10, null);
        kotlin.jvm.internal.e0.checkNotNullParameter(intrinsics, "intrinsics");
    }

    public /* synthetic */ l(b bVar, c2 c2Var, List list, int i10, boolean z10, float f10, s2.e eVar, l2.v vVar, int i11, kotlin.jvm.internal.u uVar) {
        this(bVar, c2Var, (List<b.C0570b>) ((i11 & 4) != 0 ? uu.p0.emptyList() : list), (i11 & 8) != 0 ? Integer.MAX_VALUE : i10, (i11 & 16) != 0 ? false : z10, f10, eVar, vVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @tu.f
    public l(b annotatedString, c2 style, List<b.C0570b> placeholders, int i10, boolean z10, float f10, s2.e density, l2.v resourceLoader) {
        this(new o(annotatedString, style, placeholders, density, l2.t.createFontFamilyResolver(resourceLoader)), s2.d.Constraints$default(0, w.ceilToInt(f10), 0, 0, 13, null), i10, z10, null);
        kotlin.jvm.internal.e0.checkNotNullParameter(annotatedString, "annotatedString");
        kotlin.jvm.internal.e0.checkNotNullParameter(style, "style");
        kotlin.jvm.internal.e0.checkNotNullParameter(placeholders, "placeholders");
        kotlin.jvm.internal.e0.checkNotNullParameter(density, "density");
        kotlin.jvm.internal.e0.checkNotNullParameter(resourceLoader, "resourceLoader");
    }

    public /* synthetic */ l(b bVar, c2 c2Var, float f10, s2.e eVar, l2.y yVar, List list, int i10, boolean z10, int i11, kotlin.jvm.internal.u uVar) {
        this(bVar, c2Var, f10, eVar, yVar, (List<b.C0570b>) ((i11 & 32) != 0 ? uu.p0.emptyList() : list), (i11 & 64) != 0 ? Integer.MAX_VALUE : i10, (i11 & 128) != 0 ? false : z10);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @tu.f
    public l(b annotatedString, c2 style, float f10, s2.e density, l2.y fontFamilyResolver, List<b.C0570b> placeholders, int i10, boolean z10) {
        this(new o(annotatedString, style, placeholders, density, fontFamilyResolver), s2.d.Constraints$default(0, w.ceilToInt(f10), 0, 0, 13, null), i10, z10, null);
        kotlin.jvm.internal.e0.checkNotNullParameter(annotatedString, "annotatedString");
        kotlin.jvm.internal.e0.checkNotNullParameter(style, "style");
        kotlin.jvm.internal.e0.checkNotNullParameter(density, "density");
        kotlin.jvm.internal.e0.checkNotNullParameter(fontFamilyResolver, "fontFamilyResolver");
        kotlin.jvm.internal.e0.checkNotNullParameter(placeholders, "placeholders");
    }

    public /* synthetic */ l(b bVar, c2 c2Var, long j10, s2.e eVar, l2.y yVar, List list, int i10, boolean z10, int i11, kotlin.jvm.internal.u uVar) {
        this(bVar, c2Var, j10, eVar, yVar, (i11 & 32) != 0 ? uu.p0.emptyList() : list, (i11 & 64) != 0 ? Integer.MAX_VALUE : i10, (i11 & 128) != 0 ? false : z10, null);
    }

    public l(b bVar, c2 c2Var, long j10, s2.e eVar, l2.y yVar, List list, int i10, boolean z10, kotlin.jvm.internal.u uVar) {
        this(new o(bVar, c2Var, (List<b.C0570b>) list, eVar, yVar), j10, i10, z10, null);
    }
}
