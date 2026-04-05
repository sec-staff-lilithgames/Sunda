package h2;

import android.graphics.Canvas;
import android.graphics.Path;
import android.os.Build;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.applovin.shadow.okio.Segment;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f58683a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f58684b;

    /* renamed from: c, reason: collision with root package name */
    public final j f58685c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f58686d;

    /* renamed from: e, reason: collision with root package name */
    public final Layout f58687e;

    /* renamed from: f, reason: collision with root package name */
    public final int f58688f;

    /* renamed from: g, reason: collision with root package name */
    public final int f58689g;

    /* renamed from: h, reason: collision with root package name */
    public final int f58690h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f58691i;

    /* renamed from: j, reason: collision with root package name */
    public final tu.o f58692j;

    /* JADX WARN: Removed duplicated region for block: B:17:0x00bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public w(java.lang.CharSequence r24, float r25, android.text.TextPaint r26, int r27, android.text.TextUtils.TruncateAt r28, int r29, float r30, float r31, boolean r32, boolean r33, int r34, int r35, int r36, int r37, int[] r38, int[] r39, h2.j r40) {
        /*
            Method dump skipped, instructions count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h2.w.<init>(java.lang.CharSequence, float, android.text.TextPaint, int, android.text.TextUtils$TruncateAt, int, float, float, boolean, boolean, int, int, int, int, int[], int[], h2.j):void");
    }

    public static /* synthetic */ float getPrimaryHorizontal$default(w wVar, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        return wVar.getPrimaryHorizontal(i10, z10);
    }

    public static /* synthetic */ float getSecondaryHorizontal$default(w wVar, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        return wVar.getSecondaryHorizontal(i10, z10);
    }

    public final void fillBoundingBoxes(int i10, int i11, float[] array, int i12) {
        float secondaryDownstream;
        float secondaryUpstream;
        e0.checkNotNullParameter(array, "array");
        int length = getText().length();
        if (i10 < 0) {
            throw new IllegalArgumentException("startOffset must be > 0");
        }
        if (i10 >= length) {
            throw new IllegalArgumentException("startOffset must be less than text length");
        }
        if (i11 <= i10) {
            throw new IllegalArgumentException("endOffset must be greater than startOffset");
        }
        if (i11 > length) {
            throw new IllegalArgumentException("endOffset must be smaller or equal to text length");
        }
        if (array.length - i12 < (i11 - i10) * 4) {
            throw new IllegalArgumentException("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 4");
        }
        int lineForOffset = getLineForOffset(i10);
        int lineForOffset2 = getLineForOffset(i11 - 1);
        c cVar = new c(this);
        if (lineForOffset > lineForOffset2) {
            return;
        }
        while (true) {
            int lineStart = getLineStart(lineForOffset);
            int lineEnd = getLineEnd(lineForOffset);
            int iMin = Math.min(i11, lineEnd);
            float lineTop = getLineTop(lineForOffset);
            float lineBottom = getLineBottom(lineForOffset);
            boolean z10 = getParagraphDirection(lineForOffset) == 1;
            for (int iMax = Math.max(i10, lineStart); iMax < iMin; iMax++) {
                boolean zIsRtlCharAt = isRtlCharAt(iMax);
                if (z10 && !zIsRtlCharAt) {
                    secondaryDownstream = cVar.getPrimaryDownstream(iMax);
                    secondaryUpstream = cVar.getPrimaryUpstream(iMax + 1);
                } else if (z10 && zIsRtlCharAt) {
                    secondaryUpstream = cVar.getSecondaryDownstream(iMax);
                    secondaryDownstream = cVar.getSecondaryUpstream(iMax + 1);
                } else if (z10 || !zIsRtlCharAt) {
                    secondaryDownstream = cVar.getSecondaryDownstream(iMax);
                    secondaryUpstream = cVar.getSecondaryUpstream(iMax + 1);
                } else {
                    secondaryUpstream = cVar.getPrimaryDownstream(iMax);
                    secondaryDownstream = cVar.getPrimaryUpstream(iMax + 1);
                }
                array[i12] = secondaryDownstream;
                array[i12 + 1] = lineTop;
                array[i12 + 2] = secondaryUpstream;
                array[i12 + 3] = lineBottom;
                i12 += 4;
            }
            if (lineForOffset == lineForOffset2) {
                return;
            } else {
                lineForOffset++;
            }
        }
    }

    public final int getBottomPadding$ui_text_release() {
        return this.f58690h;
    }

    public final boolean getDidExceedMaxLines() {
        return this.f58686d;
    }

    public final boolean getFallbackLineSpacing() {
        return this.f58684b;
    }

    public final int getHeight() {
        boolean z10 = this.f58686d;
        Layout layout = this.f58687e;
        return (z10 ? layout.getLineBottom(this.f58688f - 1) : layout.getHeight()) + this.f58689g + this.f58690h;
    }

    public final boolean getIncludePadding() {
        return this.f58683a;
    }

    public final Layout getLayout() {
        return this.f58687e;
    }

    public final j getLayoutIntrinsics() {
        return this.f58685c;
    }

    public final float getLineAscent(int i10) {
        return this.f58687e.getLineAscent(i10);
    }

    public final float getLineBaseline(int i10) {
        return this.f58689g + this.f58687e.getLineBaseline(i10);
    }

    public final float getLineBottom(int i10) {
        return this.f58689g + this.f58687e.getLineBottom(i10) + (i10 == this.f58688f + (-1) ? this.f58690h : 0);
    }

    public final int getLineCount() {
        return this.f58688f;
    }

    public final float getLineDescent(int i10) {
        return this.f58687e.getLineDescent(i10);
    }

    public final int getLineEllipsisCount(int i10) {
        return this.f58687e.getEllipsisCount(i10);
    }

    public final int getLineEllipsisOffset(int i10) {
        return this.f58687e.getEllipsisStart(i10);
    }

    public final int getLineEnd(int i10) {
        Layout layout = this.f58687e;
        return layout.getEllipsisStart(i10) == 0 ? layout.getLineEnd(i10) : layout.getText().length();
    }

    public final int getLineForOffset(int i10) {
        return this.f58687e.getLineForOffset(i10);
    }

    public final int getLineForVertical(int i10) {
        return this.f58687e.getLineForVertical(this.f58689g + i10);
    }

    public final float getLineHeight(int i10) {
        return getLineBottom(i10) - getLineTop(i10);
    }

    public final float getLineLeft(int i10) {
        return this.f58687e.getLineLeft(i10);
    }

    public final float getLineRight(int i10) {
        return this.f58687e.getLineRight(i10);
    }

    public final int getLineStart(int i10) {
        return this.f58687e.getLineStart(i10);
    }

    public final float getLineTop(int i10) {
        return this.f58687e.getLineTop(i10) + (i10 == 0 ? 0 : this.f58689g);
    }

    public final int getLineVisibleEnd(int i10) {
        Layout layout = this.f58687e;
        if (layout.getEllipsisStart(i10) == 0) {
            return layout.getLineVisibleEnd(i10);
        }
        return layout.getEllipsisStart(i10) + layout.getLineStart(i10);
    }

    public final float getLineWidth(int i10) {
        return this.f58687e.getLineWidth(i10);
    }

    public final float getMaxIntrinsicWidth() {
        return this.f58685c.getMaxIntrinsicWidth();
    }

    public final float getMinIntrinsicWidth() {
        return this.f58685c.getMinIntrinsicWidth();
    }

    public final int getOffsetForHorizontal(int i10, float f10) {
        return this.f58687e.getOffsetForHorizontal(i10, f10);
    }

    public final int getParagraphDirection(int i10) {
        return this.f58687e.getParagraphDirection(i10);
    }

    public final float getPrimaryHorizontal(int i10, boolean z10) {
        return ((f) this.f58692j.getValue()).getHorizontalPosition(i10, true, z10);
    }

    public final float getSecondaryHorizontal(int i10, boolean z10) {
        return ((f) this.f58692j.getValue()).getHorizontalPosition(i10, false, z10);
    }

    public final void getSelectionPath(int i10, int i11, Path dest) {
        e0.checkNotNullParameter(dest, "dest");
        this.f58687e.getSelectionPath(i10, i11, dest);
        int i12 = this.f58689g;
        if (i12 == 0 || dest.isEmpty()) {
            return;
        }
        dest.offset(0.0f, i12);
    }

    public final CharSequence getText() {
        CharSequence text = this.f58687e.getText();
        e0.checkNotNullExpressionValue(text, "layout.text");
        return text;
    }

    public final int getTopPadding$ui_text_release() {
        return this.f58689g;
    }

    public final boolean isEllipsisApplied(int i10) {
        return this.f58687e.getEllipsisCount(i10) > 0;
    }

    public final boolean isFallbackLinespacingApplied$ui_text_release() {
        return this.f58684b && !this.f58691i && Build.VERSION.SDK_INT >= 28;
    }

    public final boolean isLineEllipsized(int i10) {
        return this.f58687e.getEllipsisStart(i10) != 0;
    }

    public final boolean isRtlCharAt(int i10) {
        return this.f58687e.isRtlCharAt(i10);
    }

    public final void paint(Canvas canvas) {
        e0.checkNotNullParameter(canvas, "canvas");
        int i10 = this.f58689g;
        if (i10 != 0) {
            canvas.translate(0.0f, i10);
        }
        this.f58687e.draw(canvas);
        if (i10 != 0) {
            canvas.translate(0.0f, (-1) * i10);
        }
    }

    public static /* synthetic */ void getBottomPadding$ui_text_release$annotations() {
    }

    public static /* synthetic */ void getLayout$annotations() {
    }

    public static /* synthetic */ void getTopPadding$ui_text_release$annotations() {
    }

    public /* synthetic */ w(CharSequence charSequence, float f10, TextPaint textPaint, int i10, TextUtils.TruncateAt truncateAt, int i11, float f11, float f12, boolean z10, boolean z11, int i12, int i13, int i14, int i15, int[] iArr, int[] iArr2, j jVar, int i16, kotlin.jvm.internal.u uVar) {
        CharSequence charSequence2;
        TextPaint textPaint2;
        j jVar2;
        float f13 = (i16 & 2) != 0 ? 0.0f : f10;
        int i17 = (i16 & 8) != 0 ? 0 : i10;
        TextUtils.TruncateAt truncateAt2 = (i16 & 16) != 0 ? null : truncateAt;
        int i18 = (i16 & 32) != 0 ? 2 : i11;
        float f14 = (i16 & 64) != 0 ? 1.0f : f11;
        float f15 = (i16 & 128) != 0 ? 0.0f : f12;
        boolean z12 = (i16 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? false : z10;
        boolean z13 = (i16 & 512) != 0 ? true : z11;
        int i19 = (i16 & 1024) != 0 ? Integer.MAX_VALUE : i12;
        int i20 = (i16 & 2048) != 0 ? 0 : i13;
        int i21 = (i16 & 4096) != 0 ? 0 : i14;
        int i22 = (i16 & Segment.SIZE) != 0 ? 0 : i15;
        int[] iArr3 = (i16 & 16384) != 0 ? null : iArr;
        int[] iArr4 = (32768 & i16) != 0 ? null : iArr2;
        if ((i16 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0) {
            charSequence2 = charSequence;
            textPaint2 = textPaint;
            jVar2 = new j(charSequence2, textPaint2, i18);
        } else {
            charSequence2 = charSequence;
            textPaint2 = textPaint;
            jVar2 = jVar;
        }
        this(charSequence2, f13, textPaint2, i17, truncateAt2, i18, f14, f15, z12, z13, i19, i20, i21, i22, iArr3, iArr4, jVar2);
    }
}
