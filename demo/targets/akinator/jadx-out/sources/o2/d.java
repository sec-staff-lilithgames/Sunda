package o2;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.Spanned;
import android.text.TextUtils;
import g2.a2;
import g2.b2;
import g2.c2;
import g2.r;
import h2.w;
import j1.b0;
import j1.d2;
import j1.l1;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import l2.y;
import p0.o2;
import tu.q;
import tu.s;
import tu.t;
import tv.Mu.QpyI;
import uu.p0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public final class d implements r {

    /* renamed from: a, reason: collision with root package name */
    public final g f77396a;

    /* renamed from: b, reason: collision with root package name */
    public final int f77397b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f77398c;

    /* renamed from: d, reason: collision with root package name */
    public final long f77399d;

    /* renamed from: e, reason: collision with root package name */
    public final w f77400e;

    /* renamed from: f, reason: collision with root package name */
    public final List f77401f;

    /* renamed from: g, reason: collision with root package name */
    public final tu.o f77402g;

    /* JADX WARN: Multi-variable type inference failed */
    public d(g gVar, int i10, boolean z10, long j10, u uVar) {
        q2.a[] aVarArr;
        List listEmptyList;
        i1.j jVar;
        float horizontalPosition;
        float lineBaseline;
        int heightPx;
        float lineTop;
        float heightPx2;
        float lineBaseline2;
        this.f77396a = gVar;
        this.f77397b = i10;
        this.f77398c = z10;
        this.f77399d = j10;
        if (s2.c.m6756getMinHeightimpl(j10) != 0 || s2.c.m6757getMinWidthimpl(j10) != 0) {
            throw new IllegalArgumentException("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        boolean z11 = true;
        if (i10 < 1) {
            throw new IllegalArgumentException("maxLines should be greater than 0");
        }
        c2 style = gVar.getStyle();
        int iM5773access$toLayoutAlignAMY3VfE = i.m5773access$toLayoutAlignAMY3VfE(style.m3989getTextAlignbuA522U());
        r2.m mVarM3989getTextAlignbuA522U = style.m3989getTextAlignbuA522U();
        int iM6075equalsimpl0 = mVarM3989getTextAlignbuA522U == null ? 0 : r2.m.m6075equalsimpl0(mVarM3989getTextAlignbuA522U.m6078unboximpl(), r2.m.f83701b.m6068getJustifye0LSkKk());
        TextUtils.TruncateAt truncateAt = z10 ? TextUtils.TruncateAt.END : null;
        w wVarA = a(iM5773access$toLayoutAlignAMY3VfE, iM6075equalsimpl0, truncateAt, i10);
        if (!z10 || wVarA.getHeight() <= s2.c.m6754getMaxHeightimpl(j10) || i10 <= 1) {
            this.f77400e = wVarA;
        } else {
            int iAccess$numberOfLinesThatFitMaxHeight = i.access$numberOfLinesThatFitMaxHeight(wVarA, s2.c.m6754getMaxHeightimpl(j10));
            if (iAccess$numberOfLinesThatFitMaxHeight > 0 && iAccess$numberOfLinesThatFitMaxHeight != i10) {
                wVarA = a(iM5773access$toLayoutAlignAMY3VfE, iM6075equalsimpl0, truncateAt, iAccess$numberOfLinesThatFitMaxHeight);
            }
            this.f77400e = wVarA;
        }
        getTextPaint$ui_text_release().m5774setBrushd16Qtg0(style.getBrush(), i1.p.Size(getWidth(), getHeight()));
        w wVar = this.f77400e;
        if (wVar.getText() instanceof Spanned) {
            aVarArr = (q2.a[]) ((Spanned) wVar.getText()).getSpans(0, wVar.getText().length(), q2.a.class);
            e0.checkNotNullExpressionValue(aVarArr, QpyI.uWI);
            if (aVarArr.length == 0) {
                aVarArr = new q2.a[0];
            }
        } else {
            aVarArr = new q2.a[0];
        }
        for (q2.a aVar : aVarArr) {
            aVar.m5976setSizeiaC8Vc4(i1.o.m4240boximpl(i1.p.Size(getWidth(), getHeight())));
        }
        CharSequence charSequence$ui_text_release = this.f77396a.getCharSequence$ui_text_release();
        if (charSequence$ui_text_release instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence$ui_text_release;
            Object[] spans = spanned.getSpans(0, charSequence$ui_text_release.length(), j2.h.class);
            e0.checkNotNullExpressionValue(spans, "getSpans(0, length, PlaceholderSpan::class.java)");
            ArrayList arrayList = new ArrayList(spans.length);
            int length = spans.length;
            int i11 = 0;
            while (i11 < length) {
                j2.h hVar = (j2.h) spans[i11];
                int spanStart = spanned.getSpanStart(hVar);
                int spanEnd = spanned.getSpanEnd(hVar);
                int lineForOffset = this.f77400e.getLineForOffset(spanStart);
                boolean z12 = (this.f77400e.getLineEllipsisCount(lineForOffset) <= 0 || spanEnd <= this.f77400e.getLineEllipsisOffset(lineForOffset)) ? false : z11;
                boolean z13 = spanEnd > this.f77400e.getLineEnd(lineForOffset) ? z11 : false;
                if (z12 || z13) {
                    jVar = null;
                } else {
                    int iOrdinal = getBidiRunDirection(spanStart).ordinal();
                    if (iOrdinal == 0) {
                        horizontalPosition = getHorizontalPosition(spanStart, z11);
                    } else {
                        if (iOrdinal != z11) {
                            throw new t();
                        }
                        horizontalPosition = getHorizontalPosition(spanStart, z11) - hVar.getWidthPx();
                    }
                    float widthPx = hVar.getWidthPx() + horizontalPosition;
                    w wVar2 = this.f77400e;
                    switch (hVar.getVerticalAlign()) {
                        case 0:
                            lineBaseline = wVar2.getLineBaseline(lineForOffset);
                            heightPx = hVar.getHeightPx();
                            lineTop = lineBaseline - heightPx;
                            jVar = new i1.j(horizontalPosition, lineTop, widthPx, hVar.getHeightPx() + lineTop);
                            break;
                        case 1:
                            lineTop = wVar2.getLineTop(lineForOffset);
                            jVar = new i1.j(horizontalPosition, lineTop, widthPx, hVar.getHeightPx() + lineTop);
                            break;
                        case 2:
                            lineBaseline = wVar2.getLineBottom(lineForOffset);
                            heightPx = hVar.getHeightPx();
                            lineTop = lineBaseline - heightPx;
                            jVar = new i1.j(horizontalPosition, lineTop, widthPx, hVar.getHeightPx() + lineTop);
                            break;
                        case 3:
                            lineTop = ((wVar2.getLineBottom(lineForOffset) + wVar2.getLineTop(lineForOffset)) - hVar.getHeightPx()) / 2;
                            jVar = new i1.j(horizontalPosition, lineTop, widthPx, hVar.getHeightPx() + lineTop);
                            break;
                        case 4:
                            heightPx2 = hVar.getFontMetrics().ascent;
                            lineBaseline2 = wVar2.getLineBaseline(lineForOffset);
                            lineTop = lineBaseline2 + heightPx2;
                            jVar = new i1.j(horizontalPosition, lineTop, widthPx, hVar.getHeightPx() + lineTop);
                            break;
                        case 5:
                            lineTop = (wVar2.getLineBaseline(lineForOffset) + hVar.getFontMetrics().descent) - hVar.getHeightPx();
                            jVar = new i1.j(horizontalPosition, lineTop, widthPx, hVar.getHeightPx() + lineTop);
                            break;
                        case 6:
                            Paint.FontMetricsInt fontMetrics = hVar.getFontMetrics();
                            heightPx2 = ((fontMetrics.ascent + fontMetrics.descent) - hVar.getHeightPx()) / 2;
                            lineBaseline2 = wVar2.getLineBaseline(lineForOffset);
                            lineTop = lineBaseline2 + heightPx2;
                            jVar = new i1.j(horizontalPosition, lineTop, widthPx, hVar.getHeightPx() + lineTop);
                            break;
                        default:
                            throw new IllegalStateException("unexpected verticalAlignment");
                    }
                }
                arrayList.add(jVar);
                i11++;
                z11 = true;
            }
            listEmptyList = arrayList;
        } else {
            listEmptyList = p0.emptyList();
        }
        this.f77401f = listEmptyList;
        this.f77402g = q.lazy(s.f87405e, (kv.a) new c(this));
    }

    public static /* synthetic */ void getCharSequence$ui_text_release$annotations() {
    }

    public static /* synthetic */ void getTextLocale$ui_text_release$annotations() {
    }

    public static /* synthetic */ void getTextPaint$ui_text_release$annotations() {
    }

    public final w a(int i10, int i11, TextUtils.TruncateAt truncateAt, int i12) {
        g gVar = this.f77396a;
        return new w(gVar.getCharSequence$ui_text_release(), getWidth(), getTextPaint$ui_text_release(), i10, truncateAt, gVar.getTextDirectionHeuristic$ui_text_release(), 1.0f, 0.0f, e.isIncludeFontPaddingEnabled(gVar.getStyle()), true, i12, 0, 0, i11, null, null, gVar.getLayoutIntrinsics$ui_text_release(), 55424, null);
    }

    /* renamed from: fillBoundingBoxes-8ffj60Q, reason: not valid java name */
    public final void m5766fillBoundingBoxes8ffj60Q(long j10, float[] array, int i10) {
        e0.checkNotNullParameter(array, "array");
        this.f77400e.fillBoundingBoxes(a2.m3958getMinimpl(j10), a2.m3957getMaximpl(j10), array, i10);
    }

    @Override // g2.r
    public r2.k getBidiRunDirection(int i10) {
        return this.f77400e.isRtlCharAt(i10) ? r2.k.f83699c : r2.k.f83698b;
    }

    @Override // g2.r
    public i1.j getBoundingBox(int i10) {
        w wVar = this.f77400e;
        float primaryHorizontal$default = w.getPrimaryHorizontal$default(wVar, i10, false, 2, null);
        float primaryHorizontal$default2 = w.getPrimaryHorizontal$default(wVar, i10 + 1, false, 2, null);
        int lineForOffset = wVar.getLineForOffset(i10);
        return new i1.j(primaryHorizontal$default, wVar.getLineTop(lineForOffset), primaryHorizontal$default2, wVar.getLineBottom(lineForOffset));
    }

    public final CharSequence getCharSequence$ui_text_release() {
        return this.f77396a.getCharSequence$ui_text_release();
    }

    /* renamed from: getConstraints-msEJaDk, reason: not valid java name */
    public final long m5767getConstraintsmsEJaDk() {
        return this.f77399d;
    }

    @Override // g2.r
    public i1.j getCursorRect(int i10) {
        if (i10 < 0 || i10 > getCharSequence$ui_text_release().length()) {
            StringBuilder sbT = o2.t(i10, "offset(", ") is out of bounds (0,");
            sbT.append(getCharSequence$ui_text_release().length());
            throw new AssertionError(sbT.toString());
        }
        w wVar = this.f77400e;
        float primaryHorizontal$default = w.getPrimaryHorizontal$default(wVar, i10, false, 2, null);
        int lineForOffset = wVar.getLineForOffset(i10);
        return new i1.j(primaryHorizontal$default, wVar.getLineTop(lineForOffset), primaryHorizontal$default, wVar.getLineBottom(lineForOffset));
    }

    @Override // g2.r
    public boolean getDidExceedMaxLines() {
        return this.f77400e.getDidExceedMaxLines();
    }

    public final boolean getEllipsis() {
        return this.f77398c;
    }

    @Override // g2.r
    public float getFirstBaseline() {
        return getLineBaseline$ui_text_release(0);
    }

    @Override // g2.r
    public float getHeight() {
        return this.f77400e.getHeight();
    }

    @Override // g2.r
    public float getHorizontalPosition(int i10, boolean z10) {
        w wVar = this.f77400e;
        return z10 ? w.getPrimaryHorizontal$default(wVar, i10, false, 2, null) : w.getSecondaryHorizontal$default(wVar, i10, false, 2, null);
    }

    @Override // g2.r
    public float getLastBaseline() {
        int lineCount = getLineCount();
        int i10 = this.f77397b;
        return i10 < lineCount ? getLineBaseline$ui_text_release(i10 - 1) : getLineBaseline$ui_text_release(getLineCount() - 1);
    }

    public final float getLineAscent$ui_text_release(int i10) {
        return this.f77400e.getLineAscent(i10);
    }

    public final float getLineBaseline$ui_text_release(int i10) {
        return this.f77400e.getLineBaseline(i10);
    }

    @Override // g2.r
    public float getLineBottom(int i10) {
        return this.f77400e.getLineBottom(i10);
    }

    @Override // g2.r
    public int getLineCount() {
        return this.f77400e.getLineCount();
    }

    public final float getLineDescent$ui_text_release(int i10) {
        return this.f77400e.getLineDescent(i10);
    }

    @Override // g2.r
    public int getLineEnd(int i10, boolean z10) {
        w wVar = this.f77400e;
        return z10 ? wVar.getLineVisibleEnd(i10) : wVar.getLineEnd(i10);
    }

    @Override // g2.r
    public int getLineForOffset(int i10) {
        return this.f77400e.getLineForOffset(i10);
    }

    @Override // g2.r
    public int getLineForVerticalPosition(float f10) {
        return this.f77400e.getLineForVertical((int) f10);
    }

    @Override // g2.r
    public float getLineHeight(int i10) {
        return this.f77400e.getLineHeight(i10);
    }

    @Override // g2.r
    public float getLineLeft(int i10) {
        return this.f77400e.getLineLeft(i10);
    }

    @Override // g2.r
    public float getLineRight(int i10) {
        return this.f77400e.getLineRight(i10);
    }

    @Override // g2.r
    public int getLineStart(int i10) {
        return this.f77400e.getLineStart(i10);
    }

    @Override // g2.r
    public float getLineTop(int i10) {
        return this.f77400e.getLineTop(i10);
    }

    @Override // g2.r
    public float getLineWidth(int i10) {
        return this.f77400e.getLineWidth(i10);
    }

    @Override // g2.r
    public float getMaxIntrinsicWidth() {
        return this.f77396a.getMaxIntrinsicWidth();
    }

    public final int getMaxLines() {
        return this.f77397b;
    }

    @Override // g2.r
    public float getMinIntrinsicWidth() {
        return this.f77396a.getMinIntrinsicWidth();
    }

    @Override // g2.r
    /* renamed from: getOffsetForPosition-k-4lQ0M */
    public int mo4005getOffsetForPositionk4lQ0M(long j10) {
        int iM4186getYimpl = (int) i1.h.m4186getYimpl(j10);
        w wVar = this.f77400e;
        return wVar.getOffsetForHorizontal(wVar.getLineForVertical(iM4186getYimpl), i1.h.m4185getXimpl(j10));
    }

    @Override // g2.r
    public r2.k getParagraphDirection(int i10) {
        w wVar = this.f77400e;
        return wVar.getParagraphDirection(wVar.getLineForOffset(i10)) == 1 ? r2.k.f83698b : r2.k.f83699c;
    }

    public final g getParagraphIntrinsics() {
        return this.f77396a;
    }

    @Override // g2.r
    public l1 getPathForRange(int i10, int i11) {
        if (i10 >= 0 && i10 <= i11 && i11 <= getCharSequence$ui_text_release().length()) {
            Path path = new Path();
            this.f77400e.getSelectionPath(i10, i11, path);
            return j1.p.asComposePath(path);
        }
        StringBuilder sbF = w0.i.f(i10, i11, "Start(", ") or End(", ") is out of Range(0..");
        sbF.append(getCharSequence$ui_text_release().length());
        sbF.append("), or start > end!");
        throw new AssertionError(sbF.toString());
    }

    @Override // g2.r
    public List<i1.j> getPlaceholderRects() {
        return this.f77401f;
    }

    public final Locale getTextLocale$ui_text_release() {
        Locale textLocale = this.f77396a.getTextPaint$ui_text_release().getTextLocale();
        e0.checkNotNullExpressionValue(textLocale, "paragraphIntrinsics.textPaint.textLocale");
        return textLocale;
    }

    public final l getTextPaint$ui_text_release() {
        return this.f77396a.getTextPaint$ui_text_release();
    }

    @Override // g2.r
    public float getWidth() {
        return s2.c.m6755getMaxWidthimpl(this.f77399d);
    }

    @Override // g2.r
    /* renamed from: getWordBoundary--jx7JFs */
    public long mo4006getWordBoundaryjx7JFs(int i10) {
        tu.o oVar = this.f77402g;
        return b2.TextRange(((i2.a) oVar.getValue()).getWordStart(i10), ((i2.a) oVar.getValue()).getWordEnd(i10));
    }

    public final boolean isEllipsisApplied$ui_text_release(int i10) {
        return this.f77400e.isEllipsisApplied(i10);
    }

    @Override // g2.r
    public boolean isLineEllipsized(int i10) {
        return this.f77400e.isLineEllipsized(i10);
    }

    @Override // g2.r
    public void paint(j1.e0 canvas, b0 brush, d2 d2Var, r2.n nVar) {
        e0.checkNotNullParameter(canvas, "canvas");
        e0.checkNotNullParameter(brush, "brush");
        l textPaint$ui_text_release = getTextPaint$ui_text_release();
        textPaint$ui_text_release.m5774setBrushd16Qtg0(brush, i1.p.Size(getWidth(), getHeight()));
        textPaint$ui_text_release.setShadow(d2Var);
        textPaint$ui_text_release.setTextDecoration(nVar);
        Canvas nativeCanvas = j1.d.getNativeCanvas(canvas);
        if (getDidExceedMaxLines()) {
            nativeCanvas.save();
            nativeCanvas.clipRect(0.0f, 0.0f, getWidth(), getHeight());
        }
        this.f77400e.paint(nativeCanvas);
        if (getDidExceedMaxLines()) {
            nativeCanvas.restore();
        }
    }

    @Override // g2.r
    /* renamed from: paint-RPmYEkk */
    public void mo4007paintRPmYEkk(j1.e0 canvas, long j10, d2 d2Var, r2.n nVar) {
        e0.checkNotNullParameter(canvas, "canvas");
        l textPaint$ui_text_release = getTextPaint$ui_text_release();
        textPaint$ui_text_release.m5775setColor8_81llA(j10);
        textPaint$ui_text_release.setShadow(d2Var);
        textPaint$ui_text_release.setTextDecoration(nVar);
        Canvas nativeCanvas = j1.d.getNativeCanvas(canvas);
        if (getDidExceedMaxLines()) {
            nativeCanvas.save();
            nativeCanvas.clipRect(0.0f, 0.0f, getWidth(), getHeight());
        }
        this.f77400e.paint(nativeCanvas);
        if (getDidExceedMaxLines()) {
            nativeCanvas.restore();
        }
    }

    public d(String str, c2 c2Var, List list, List list2, int i10, boolean z10, long j10, y yVar, s2.e eVar, u uVar) {
        this(new g(str, c2Var, list, list2, yVar, eVar), i10, z10, j10, null);
    }
}
