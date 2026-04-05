package j2;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class h extends ReplacementSpan {

    /* renamed from: b, reason: collision with root package name */
    public final float f69080b;

    /* renamed from: c, reason: collision with root package name */
    public final int f69081c;

    /* renamed from: e, reason: collision with root package name */
    public final float f69082e;

    /* renamed from: f, reason: collision with root package name */
    public final int f69083f;

    /* renamed from: g, reason: collision with root package name */
    public final float f69084g;

    /* renamed from: h, reason: collision with root package name */
    public final int f69085h;

    /* renamed from: i, reason: collision with root package name */
    public Paint.FontMetricsInt f69086i;

    /* renamed from: j, reason: collision with root package name */
    public int f69087j;

    /* renamed from: k, reason: collision with root package name */
    public int f69088k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f69089l;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(u uVar) {
        }
    }

    static {
        new a(null);
    }

    public h(float f10, int i10, float f11, int i11, float f12, int i12) {
        this.f69080b = f10;
        this.f69081c = i10;
        this.f69082e = f11;
        this.f69083f = i11;
        this.f69084g = f12;
        this.f69085h = i12;
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, Paint paint) {
        e0.checkNotNullParameter(canvas, "canvas");
        e0.checkNotNullParameter(paint, "paint");
    }

    public final Paint.FontMetricsInt getFontMetrics() {
        Paint.FontMetricsInt fontMetricsInt = this.f69086i;
        if (fontMetricsInt != null) {
            return fontMetricsInt;
        }
        e0.throwUninitializedPropertyAccessException("fontMetrics");
        return null;
    }

    public final int getHeightPx() {
        if (this.f69089l) {
            return this.f69088k;
        }
        throw new IllegalStateException("PlaceholderSpan is not laid out yet.");
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        float f10;
        int iCeilToInt;
        e0.checkNotNullParameter(paint, "paint");
        this.f69089l = true;
        float textSize = paint.getTextSize();
        Paint.FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
        e0.checkNotNullExpressionValue(fontMetricsInt2, "paint.fontMetricsInt");
        this.f69086i = fontMetricsInt2;
        if (getFontMetrics().descent <= getFontMetrics().ascent) {
            throw new IllegalArgumentException("Invalid fontMetrics: line height can not be negative.");
        }
        float f11 = this.f69084g;
        float f12 = this.f69080b;
        int i12 = this.f69081c;
        if (i12 == 0) {
            f10 = f12 * f11;
        } else {
            if (i12 != 1) {
                throw new IllegalArgumentException("Unsupported unit.");
            }
            f10 = f12 * textSize;
        }
        this.f69087j = i.ceilToInt(f10);
        float f13 = this.f69082e;
        int i13 = this.f69083f;
        if (i13 == 0) {
            iCeilToInt = i.ceilToInt(f13 * f11);
        } else {
            if (i13 != 1) {
                throw new IllegalArgumentException("Unsupported unit.");
            }
            iCeilToInt = i.ceilToInt(f13 * textSize);
        }
        this.f69088k = iCeilToInt;
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = getFontMetrics().ascent;
            fontMetricsInt.descent = getFontMetrics().descent;
            fontMetricsInt.leading = getFontMetrics().leading;
            switch (this.f69085h) {
                case 0:
                    if (fontMetricsInt.ascent > (-getHeightPx())) {
                        fontMetricsInt.ascent = -getHeightPx();
                        break;
                    }
                    break;
                case 1:
                case 4:
                    if (getHeightPx() + fontMetricsInt.ascent > fontMetricsInt.descent) {
                        fontMetricsInt.descent = getHeightPx() + fontMetricsInt.ascent;
                        break;
                    }
                    break;
                case 2:
                case 5:
                    if (fontMetricsInt.ascent > fontMetricsInt.descent - getHeightPx()) {
                        fontMetricsInt.ascent = fontMetricsInt.descent - getHeightPx();
                        break;
                    }
                    break;
                case 3:
                case 6:
                    if (fontMetricsInt.descent - fontMetricsInt.ascent < getHeightPx()) {
                        int heightPx = fontMetricsInt.ascent - ((getHeightPx() - (fontMetricsInt.descent - fontMetricsInt.ascent)) / 2);
                        fontMetricsInt.ascent = heightPx;
                        fontMetricsInt.descent = getHeightPx() + heightPx;
                        break;
                    }
                    break;
                default:
                    throw new IllegalArgumentException("Unknown verticalAlign.");
            }
            fontMetricsInt.top = Math.min(getFontMetrics().top, fontMetricsInt.ascent);
            fontMetricsInt.bottom = Math.max(getFontMetrics().bottom, fontMetricsInt.descent);
        }
        return getWidthPx();
    }

    public final int getVerticalAlign() {
        return this.f69085h;
    }

    public final int getWidthPx() {
        if (this.f69089l) {
            return this.f69087j;
        }
        throw new IllegalStateException("PlaceholderSpan is not laid out yet.");
    }
}
