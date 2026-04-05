package s4;

import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class e0 extends ReplacementSpan {

    /* renamed from: c, reason: collision with root package name */
    public final r0 f85384c;

    /* renamed from: b, reason: collision with root package name */
    public final Paint.FontMetricsInt f85383b = new Paint.FontMetricsInt();

    /* renamed from: e, reason: collision with root package name */
    public short f85385e = -1;

    /* renamed from: f, reason: collision with root package name */
    public short f85386f = -1;

    /* renamed from: g, reason: collision with root package name */
    public float f85387g = 1.0f;

    public e0(r0 r0Var) {
        w3.i.checkNotNull(r0Var, "rasterizer cannot be null");
        this.f85384c = r0Var;
    }

    public final int getHeight() {
        return this.f85386f;
    }

    public final int getId() {
        return getTypefaceRasterizer().getId();
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        Paint.FontMetricsInt fontMetricsInt2 = this.f85383b;
        paint.getFontMetricsInt(fontMetricsInt2);
        r0 r0Var = this.f85384c;
        this.f85387g = (Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f) / r0Var.getHeight();
        this.f85386f = (short) (r0Var.getHeight() * this.f85387g);
        short width = (short) (r0Var.getWidth() * this.f85387g);
        this.f85385e = width;
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return width;
    }

    public final r0 getTypefaceRasterizer() {
        return this.f85384c;
    }
}
