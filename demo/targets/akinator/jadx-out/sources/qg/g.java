package qg;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import j1.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class g {
    public Typeface A;
    public Typeface B;
    public Typeface C;
    public Typeface D;
    public ug.b E;
    public ug.b F;
    public CharSequence H;
    public CharSequence I;
    public boolean J;
    public float L;
    public float M;
    public float N;
    public float O;
    public float P;
    public int Q;
    public int R;
    public int[] S;
    public boolean T;
    public final TextPaint U;
    public final TextPaint V;
    public TimeInterpolator W;
    public TimeInterpolator X;
    public float Y;
    public float Z;

    /* renamed from: a, reason: collision with root package name */
    public final View f83134a;

    /* renamed from: a0, reason: collision with root package name */
    public float f83135a0;

    /* renamed from: b, reason: collision with root package name */
    public float f83136b;

    /* renamed from: b0, reason: collision with root package name */
    public ColorStateList f83137b0;

    /* renamed from: c, reason: collision with root package name */
    public boolean f83138c;

    /* renamed from: c0, reason: collision with root package name */
    public float f83139c0;

    /* renamed from: d, reason: collision with root package name */
    public float f83140d;

    /* renamed from: d0, reason: collision with root package name */
    public float f83141d0;

    /* renamed from: e, reason: collision with root package name */
    public float f83142e;

    /* renamed from: e0, reason: collision with root package name */
    public float f83143e0;

    /* renamed from: f, reason: collision with root package name */
    public int f83144f;

    /* renamed from: f0, reason: collision with root package name */
    public ColorStateList f83145f0;

    /* renamed from: g, reason: collision with root package name */
    public final Rect f83146g;

    /* renamed from: g0, reason: collision with root package name */
    public float f83147g0;

    /* renamed from: h, reason: collision with root package name */
    public final Rect f83148h;

    /* renamed from: h0, reason: collision with root package name */
    public float f83149h0;

    /* renamed from: i, reason: collision with root package name */
    public Rect f83150i;

    /* renamed from: i0, reason: collision with root package name */
    public float f83151i0;

    /* renamed from: j, reason: collision with root package name */
    public final RectF f83152j;

    /* renamed from: j0, reason: collision with root package name */
    public StaticLayout f83153j0;

    /* renamed from: k0, reason: collision with root package name */
    public float f83155k0;

    /* renamed from: l0, reason: collision with root package name */
    public float f83157l0;

    /* renamed from: m0, reason: collision with root package name */
    public float f83159m0;

    /* renamed from: n0, reason: collision with root package name */
    public CharSequence f83161n0;

    /* renamed from: o, reason: collision with root package name */
    public ColorStateList f83162o;

    /* renamed from: p, reason: collision with root package name */
    public ColorStateList f83164p;

    /* renamed from: q, reason: collision with root package name */
    public int f83166q;

    /* renamed from: r, reason: collision with root package name */
    public float f83168r;

    /* renamed from: s, reason: collision with root package name */
    public float f83170s;

    /* renamed from: t, reason: collision with root package name */
    public float f83172t;

    /* renamed from: t0, reason: collision with root package name */
    public e0 f83173t0;

    /* renamed from: u, reason: collision with root package name */
    public float f83174u;

    /* renamed from: v, reason: collision with root package name */
    public float f83176v;

    /* renamed from: w, reason: collision with root package name */
    public float f83178w;

    /* renamed from: w0, reason: collision with root package name */
    public boolean f83179w0;

    /* renamed from: x, reason: collision with root package name */
    public Typeface f83180x;

    /* renamed from: y, reason: collision with root package name */
    public Typeface f83181y;

    /* renamed from: z, reason: collision with root package name */
    public Typeface f83182z;

    /* renamed from: k, reason: collision with root package name */
    public int f83154k = 16;

    /* renamed from: l, reason: collision with root package name */
    public int f83156l = 16;

    /* renamed from: m, reason: collision with root package name */
    public float f83158m = 15.0f;

    /* renamed from: n, reason: collision with root package name */
    public float f83160n = 15.0f;
    public TextUtils.TruncateAt G = TextUtils.TruncateAt.END;
    public boolean K = true;

    /* renamed from: o0, reason: collision with root package name */
    public int f83163o0 = 1;

    /* renamed from: p0, reason: collision with root package name */
    public int f83165p0 = 1;

    /* renamed from: q0, reason: collision with root package name */
    public float f83167q0 = 0.0f;

    /* renamed from: r0, reason: collision with root package name */
    public float f83169r0 = 1.0f;

    /* renamed from: s0, reason: collision with root package name */
    public int f83171s0 = 1;

    /* renamed from: u0, reason: collision with root package name */
    public int f83175u0 = -1;

    /* renamed from: v0, reason: collision with root package name */
    public int f83177v0 = -1;

    public g(View view) {
        this.f83134a = view;
        TextPaint textPaint = new TextPaint(129);
        this.U = textPaint;
        this.V = new TextPaint(textPaint);
        this.f83148h = new Rect();
        this.f83146g = new Rect();
        this.f83152j = new RectF();
        float f10 = this.f83140d;
        this.f83142e = o2.a(1.0f, f10, 0.5f, f10);
        maybeUpdateFontWeightAdjustment(view.getContext().getResources().getConfiguration());
    }

    public static int a(int i10, int i11, float f10) {
        float f11 = 1.0f - f10;
        return Color.argb(Math.round((Color.alpha(i11) * f10) + (Color.alpha(i10) * f11)), Math.round((Color.red(i11) * f10) + (Color.red(i10) * f11)), Math.round((Color.green(i11) * f10) + (Color.green(i10) * f11)), Math.round((Color.blue(i11) * f10) + (Color.blue(i10) * f11)));
    }

    public static float g(float f10, float f11, float f12, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f12 = timeInterpolator.getInterpolation(f12);
        }
        return vf.a.lerp(f10, f11, f12);
    }

    public static boolean h(Rect rect, int i10, int i11, int i12, int i13) {
        return rect.left == i10 && rect.top == i11 && rect.right == i12 && rect.bottom == i13;
    }

    public final void b() {
        float f10;
        float f11 = this.f83136b;
        boolean z10 = this.f83138c;
        Rect rect = this.f83148h;
        Rect rect2 = this.f83146g;
        RectF rectF = this.f83152j;
        if (z10) {
            if (f11 < this.f83142e) {
                rect = rect2;
            }
            rectF.set(rect);
        } else {
            rectF.left = g(rect2.left, rect.left, f11, this.W);
            rectF.top = g(this.f83168r, this.f83170s, f11, this.W);
            rectF.right = g(rect2.right, rect.right, f11, this.W);
            rectF.bottom = g(rect2.bottom, rect.bottom, f11, this.W);
        }
        boolean z11 = this.f83138c;
        View view = this.f83134a;
        if (!z11) {
            this.f83176v = g(this.f83172t, this.f83174u, f11, this.W);
            this.f83178w = g(this.f83168r, this.f83170s, f11, this.W);
            d(f11, false);
            view.postInvalidateOnAnimation();
            f10 = f11;
        } else if (f11 < this.f83142e) {
            this.f83176v = this.f83172t;
            this.f83178w = this.f83168r;
            d(0.0f, false);
            view.postInvalidateOnAnimation();
            f10 = 0.0f;
        } else {
            this.f83176v = this.f83174u;
            this.f83178w = this.f83170s - Math.max(0, this.f83144f);
            d(1.0f, false);
            view.postInvalidateOnAnimation();
            f10 = 1.0f;
        }
        y4.b bVar = vf.a.f89241b;
        this.f83157l0 = 1.0f - g(0.0f, 1.0f, 1.0f - f11, bVar);
        view.postInvalidateOnAnimation();
        this.f83159m0 = g(1.0f, 0.0f, f11, bVar);
        view.postInvalidateOnAnimation();
        ColorStateList colorStateList = this.f83164p;
        ColorStateList colorStateList2 = this.f83162o;
        TextPaint textPaint = this.U;
        if (colorStateList != colorStateList2) {
            textPaint.setColor(a(f(colorStateList2), getCurrentCollapsedTextColor(), f10));
        } else {
            textPaint.setColor(getCurrentCollapsedTextColor());
        }
        float f12 = this.f83147g0;
        float f13 = this.f83149h0;
        if (f12 != f13) {
            textPaint.setLetterSpacing(g(f13, f12, f11, bVar));
        } else {
            textPaint.setLetterSpacing(f12);
        }
        this.N = vf.a.lerp(this.f83139c0, this.Y, f11);
        this.O = vf.a.lerp(this.f83141d0, this.Z, f11);
        this.P = vf.a.lerp(this.f83143e0, this.f83135a0, f11);
        int iA = a(f(this.f83145f0), f(this.f83137b0), f11);
        this.Q = iA;
        textPaint.setShadowLayer(this.N, this.O, this.P, iA);
        if (this.f83138c) {
            int alpha = textPaint.getAlpha();
            float f14 = this.f83142e;
            textPaint.setAlpha((int) ((f11 <= f14 ? vf.a.lerp(1.0f, 0.0f, this.f83140d, f14, f11) : vf.a.lerp(0.0f, 1.0f, f14, 1.0f, f11)) * alpha));
            if (Build.VERSION.SDK_INT >= 31) {
                textPaint.setShadowLayer(this.N, this.O, this.P, jg.b.compositeARGBWithAlpha(this.Q, textPaint.getAlpha()));
            }
        }
        view.postInvalidateOnAnimation();
    }

    public final boolean c(CharSequence charSequence) {
        boolean z10 = this.f83134a.getLayoutDirection() == 1;
        if (this.K) {
            return (z10 ? v3.o.f88979d : v3.o.f88978c).isRtl(charSequence, 0, charSequence.length());
        }
        return z10;
    }

    public final void d(float f10, boolean z10) {
        float f11;
        Typeface typeface;
        float f12;
        if (this.H == null) {
            return;
        }
        float fWidth = this.f83148h.width();
        float fWidth2 = this.f83146g.width();
        if (Math.abs(f10 - 1.0f) < 1.0E-5f) {
            f11 = k() ? this.f83160n : this.f83158m;
            f12 = k() ? this.f83147g0 : this.f83149h0;
            this.L = k() ? 1.0f : g(this.f83158m, this.f83160n, f10, this.X) / this.f83158m;
            if (!k()) {
                fWidth = fWidth2;
            }
            typeface = this.f83180x;
            fWidth2 = fWidth;
        } else {
            f11 = this.f83158m;
            float f13 = this.f83149h0;
            typeface = this.A;
            if (Math.abs(f10 - 0.0f) < 1.0E-5f) {
                this.L = 1.0f;
            } else {
                this.L = g(this.f83158m, this.f83160n, f10, this.X) / this.f83158m;
            }
            float f14 = this.f83160n / this.f83158m;
            float f15 = fWidth2 * f14;
            if (!z10 && !this.f83138c && f15 > fWidth && k()) {
                fWidth2 = Math.min(fWidth / f14, fWidth2);
            }
            f12 = f13;
        }
        int i10 = f10 < 0.5f ? this.f83163o0 : this.f83165p0;
        TextPaint textPaint = this.U;
        if (fWidth2 > 0.0f) {
            boolean z11 = this.M != f11;
            boolean z12 = this.f83151i0 != f12;
            boolean z13 = this.D != typeface;
            StaticLayout staticLayout = this.f83153j0;
            boolean z14 = z11 || z12 || (staticLayout != null && (fWidth2 > ((float) staticLayout.getWidth()) ? 1 : (fWidth2 == ((float) staticLayout.getWidth()) ? 0 : -1)) != 0) || z13 || (this.R != i10) || this.T;
            this.M = f11;
            this.f83151i0 = f12;
            this.D = typeface;
            this.T = false;
            this.R = i10;
            textPaint.setLinearText(this.L != 1.0f);
            z = z14;
        }
        if (this.I == null || z) {
            textPaint.setTextSize(this.M);
            textPaint.setTypeface(this.D);
            textPaint.setLetterSpacing(this.f83151i0);
            boolean zC = c(this.H);
            this.J = zC;
            StaticLayout staticLayoutE = e(((this.f83163o0 > 1 || this.f83165p0 > 1) && (!zC || this.f83138c)) ? i10 : 1, textPaint, this.H, fWidth2 * (k() ? 1.0f : this.L), this.J);
            this.f83153j0 = staticLayoutE;
            this.I = staticLayoutE.getText();
        }
    }

    public void draw(Canvas canvas) {
        int iSave = canvas.save();
        if (this.I != null) {
            RectF rectF = this.f83152j;
            if (rectF.width() <= 0.0f || rectF.height() <= 0.0f) {
                return;
            }
            float f10 = this.M;
            TextPaint textPaint = this.U;
            textPaint.setTextSize(f10);
            float f11 = this.f83176v;
            float f12 = this.f83178w;
            float f13 = this.L;
            if (f13 != 1.0f && !this.f83138c) {
                canvas.scale(f13, f13, f11, f12);
            }
            if ((this.f83163o0 > 1 || this.f83165p0 > 1) && ((!this.J || this.f83138c) && k() && (!this.f83138c || this.f83136b > this.f83142e))) {
                float lineStart = this.f83176v - this.f83153j0.getLineStart(0);
                int alpha = textPaint.getAlpha();
                canvas.translate(lineStart, f12);
                if (!this.f83138c) {
                    textPaint.setAlpha((int) (this.f83159m0 * alpha));
                    if (Build.VERSION.SDK_INT >= 31) {
                        textPaint.setShadowLayer(this.N, this.O, this.P, jg.b.compositeARGBWithAlpha(this.Q, textPaint.getAlpha()));
                    }
                    this.f83153j0.draw(canvas);
                }
                if (!this.f83138c) {
                    textPaint.setAlpha((int) (this.f83157l0 * alpha));
                }
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 31) {
                    textPaint.setShadowLayer(this.N, this.O, this.P, jg.b.compositeARGBWithAlpha(this.Q, textPaint.getAlpha()));
                }
                int lineBaseline = this.f83153j0.getLineBaseline(0);
                CharSequence charSequence = this.f83161n0;
                float f14 = lineBaseline;
                canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f14, textPaint);
                if (i10 >= 31) {
                    textPaint.setShadowLayer(this.N, this.O, this.P, this.Q);
                }
                if (!this.f83138c) {
                    String strTrim = this.f83161n0.toString().trim();
                    if (strTrim.endsWith("…")) {
                        strTrim = strTrim.substring(0, strTrim.length() - 1);
                    }
                    String str = strTrim;
                    textPaint.setAlpha(alpha);
                    canvas.drawText(str, 0, Math.min(this.f83153j0.getLineEnd(0), str.length()), 0.0f, f14, (Paint) textPaint);
                }
                canvas = canvas;
            } else {
                canvas.translate(f11, f12);
                this.f83153j0.draw(canvas);
            }
            canvas.restoreToCount(iSave);
        }
    }

    public final StaticLayout e(int i10, TextPaint textPaint, CharSequence charSequence, float f10, boolean z10) {
        Layout.Alignment alignment;
        if (i10 == 1) {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        } else {
            int absoluteGravity = Gravity.getAbsoluteGravity(this.f83154k, this.J ? 1 : 0) & 7;
            alignment = absoluteGravity != 1 ? absoluteGravity != 5 ? this.J ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : this.J ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_CENTER;
        }
        return (StaticLayout) w3.i.checkNotNull(d0.obtain(charSequence, textPaint, (int) f10).setEllipsize(this.G).setIsRtl(z10).setAlignment(alignment).setIncludePad(false).setMaxLines(i10).setLineSpacing(this.f83167q0, this.f83169r0).setHyphenationFrequency(this.f83171s0).setStaticLayoutBuilderConfigurer(this.f83173t0).build());
    }

    public final int f(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.S;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    public float getCollapsedFullSingleLineHeight() {
        float f10 = this.f83160n;
        TextPaint textPaint = this.V;
        textPaint.setTextSize(f10);
        textPaint.setTypeface(this.f83180x);
        textPaint.setLetterSpacing(this.f83147g0);
        return textPaint.descent() + (-textPaint.ascent());
    }

    public float getCollapsedSingleLineHeight() {
        float f10 = this.f83160n;
        TextPaint textPaint = this.V;
        textPaint.setTextSize(f10);
        textPaint.setTypeface(this.f83180x);
        textPaint.setLetterSpacing(this.f83147g0);
        return -textPaint.ascent();
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void getCollapsedTextBottomTextBounds(android.graphics.RectF r9, int r10, int r11) {
        /*
            Method dump skipped, instructions count: 185
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qg.g.getCollapsedTextBottomTextBounds(android.graphics.RectF, int, int):void");
    }

    public ColorStateList getCollapsedTextColor() {
        return this.f83164p;
    }

    public int getCollapsedTextGravity() {
        return this.f83156l;
    }

    public float getCollapsedTextHeight() {
        int i10 = this.f83175u0;
        return i10 != -1 ? i10 : getCollapsedSingleLineHeight();
    }

    public float getCollapsedTextSize() {
        return this.f83160n;
    }

    public Typeface getCollapsedTypeface() {
        Typeface typeface = this.f83180x;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    public int getCurrentCollapsedTextColor() {
        return f(this.f83164p);
    }

    public int getExpandedLineCount() {
        return this.f83166q;
    }

    public int getExpandedMaxLines() {
        return this.f83163o0;
    }

    public ColorStateList getExpandedTextColor() {
        return this.f83162o;
    }

    public float getExpandedTextFullSingleLineHeight() {
        float f10 = this.f83158m;
        TextPaint textPaint = this.V;
        textPaint.setTextSize(f10);
        textPaint.setTypeface(this.A);
        textPaint.setLetterSpacing(this.f83149h0);
        return textPaint.descent() + (-textPaint.ascent());
    }

    public int getExpandedTextGravity() {
        return this.f83154k;
    }

    public float getExpandedTextHeight() {
        int i10 = this.f83177v0;
        return i10 != -1 ? i10 : getExpandedTextSingleLineHeight();
    }

    public float getExpandedTextSingleLineHeight() {
        float f10 = this.f83158m;
        TextPaint textPaint = this.V;
        textPaint.setTextSize(f10);
        textPaint.setTypeface(this.A);
        textPaint.setLetterSpacing(this.f83149h0);
        return -textPaint.ascent();
    }

    public float getExpandedTextSize() {
        return this.f83158m;
    }

    public Typeface getExpandedTypeface() {
        Typeface typeface = this.A;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    public float getExpansionFraction() {
        return this.f83136b;
    }

    public float getFadeModeThresholdFraction() {
        return this.f83142e;
    }

    public int getHyphenationFrequency() {
        return this.f83171s0;
    }

    public int getLineCount() {
        StaticLayout staticLayout = this.f83153j0;
        if (staticLayout != null) {
            return staticLayout.getLineCount();
        }
        return 0;
    }

    public float getLineSpacingAdd() {
        return this.f83153j0.getSpacingAdd();
    }

    public float getLineSpacingMultiplier() {
        return this.f83153j0.getSpacingMultiplier();
    }

    public TimeInterpolator getPositionInterpolator() {
        return this.W;
    }

    public CharSequence getText() {
        return this.H;
    }

    public TextUtils.TruncateAt getTitleTextEllipsize() {
        return this.G;
    }

    public final boolean i(Typeface typeface) {
        ug.b bVar = this.F;
        if (bVar != null) {
            bVar.cancel();
        }
        if (this.f83182z == typeface) {
            return false;
        }
        this.f83182z = typeface;
        Typeface typefaceMaybeCopyWithFontWeightAdjustment = ug.j.maybeCopyWithFontWeightAdjustment(this.f83134a.getContext().getResources().getConfiguration(), typeface);
        this.f83181y = typefaceMaybeCopyWithFontWeightAdjustment;
        if (typefaceMaybeCopyWithFontWeightAdjustment == null) {
            typefaceMaybeCopyWithFontWeightAdjustment = this.f83182z;
        }
        this.f83180x = typefaceMaybeCopyWithFontWeightAdjustment;
        return true;
    }

    public boolean isRtlTextDirectionHeuristicsEnabled() {
        return this.K;
    }

    public final boolean isStateful() {
        ColorStateList colorStateList = this.f83164p;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        ColorStateList colorStateList2 = this.f83162o;
        return colorStateList2 != null && colorStateList2.isStateful();
    }

    public final boolean j(Typeface typeface) {
        ug.b bVar = this.E;
        if (bVar != null) {
            bVar.cancel();
        }
        if (this.C == typeface) {
            return false;
        }
        this.C = typeface;
        Typeface typefaceMaybeCopyWithFontWeightAdjustment = ug.j.maybeCopyWithFontWeightAdjustment(this.f83134a.getContext().getResources().getConfiguration(), typeface);
        this.B = typefaceMaybeCopyWithFontWeightAdjustment;
        if (typefaceMaybeCopyWithFontWeightAdjustment == null) {
            typefaceMaybeCopyWithFontWeightAdjustment = this.C;
        }
        this.A = typefaceMaybeCopyWithFontWeightAdjustment;
        return true;
    }

    public final boolean k() {
        return this.f83165p0 == 1;
    }

    public void maybeUpdateFontWeightAdjustment(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.f83182z;
            if (typeface != null) {
                this.f83181y = ug.j.maybeCopyWithFontWeightAdjustment(configuration, typeface);
            }
            Typeface typeface2 = this.C;
            if (typeface2 != null) {
                this.B = ug.j.maybeCopyWithFontWeightAdjustment(configuration, typeface2);
            }
            Typeface typeface3 = this.f83181y;
            if (typeface3 == null) {
                typeface3 = this.f83182z;
            }
            this.f83180x = typeface3;
            Typeface typeface4 = this.B;
            if (typeface4 == null) {
                typeface4 = this.C;
            }
            this.A = typeface4;
            recalculate(true);
        }
    }

    public void recalculate() {
        recalculate(false);
    }

    public void setCollapsedAndExpandedTextColor(ColorStateList colorStateList) {
        if (this.f83164p == colorStateList && this.f83162o == colorStateList) {
            return;
        }
        this.f83164p = colorStateList;
        this.f83162o = colorStateList;
        recalculate();
    }

    public void setCollapsedBounds(int i10, int i11, int i12, int i13) {
        Rect rect = this.f83148h;
        if (h(rect, i10, i11, i12, i13)) {
            return;
        }
        rect.set(i10, i11, i12, i13);
        this.T = true;
    }

    public void setCollapsedBoundsForOffsets(int i10, int i11, int i12, int i13) {
        if (this.f83150i == null) {
            this.f83150i = new Rect(i10, i11, i12, i13);
            this.T = true;
        }
        if (h(this.f83150i, i10, i11, i12, i13)) {
            return;
        }
        this.f83150i.set(i10, i11, i12, i13);
        this.T = true;
    }

    public void setCollapsedMaxLines(int i10) {
        if (i10 != this.f83165p0) {
            this.f83165p0 = i10;
            recalculate();
        }
    }

    public void setCollapsedTextAppearance(int i10) {
        View view = this.f83134a;
        ug.g gVar = new ug.g(view.getContext(), i10);
        if (gVar.getTextColor() != null) {
            this.f83164p = gVar.getTextColor();
        }
        if (gVar.getTextSize() != 0.0f) {
            this.f83160n = gVar.getTextSize();
        }
        ColorStateList colorStateList = gVar.f88488a;
        if (colorStateList != null) {
            this.f83137b0 = colorStateList;
        }
        this.Z = gVar.f88493f;
        this.f83135a0 = gVar.f88494g;
        this.Y = gVar.f88495h;
        this.f83147g0 = gVar.f88497j;
        ug.b bVar = this.F;
        if (bVar != null) {
            bVar.cancel();
        }
        this.F = new ug.b(new e(this), gVar.getFallbackFont());
        gVar.getFontAsync(view.getContext(), this.F);
        recalculate();
    }

    public void setCollapsedTextColor(ColorStateList colorStateList) {
        if (this.f83164p != colorStateList) {
            this.f83164p = colorStateList;
            recalculate();
        }
    }

    public void setCollapsedTextGravity(int i10) {
        if (this.f83156l != i10) {
            this.f83156l = i10;
            recalculate();
        }
    }

    public void setCollapsedTextSize(float f10) {
        if (this.f83160n != f10) {
            this.f83160n = f10;
            recalculate();
        }
    }

    public void setCollapsedTypeface(Typeface typeface) {
        if (i(typeface)) {
            recalculate();
        }
    }

    public void setCurrentOffsetY(int i10) {
        this.f83144f = i10;
    }

    public void setExpandedBounds(int i10, int i11, int i12, int i13, boolean z10) {
        Rect rect = this.f83146g;
        if (h(rect, i10, i11, i12, i13) && z10 == this.f83179w0) {
            return;
        }
        rect.set(i10, i11, i12, i13);
        this.T = true;
        this.f83179w0 = z10;
    }

    public void setExpandedLetterSpacing(float f10) {
        if (this.f83149h0 != f10) {
            this.f83149h0 = f10;
            recalculate();
        }
    }

    public void setExpandedMaxLines(int i10) {
        if (i10 != this.f83163o0) {
            this.f83163o0 = i10;
            recalculate();
        }
    }

    public void setExpandedTextAppearance(int i10) {
        View view = this.f83134a;
        ug.g gVar = new ug.g(view.getContext(), i10);
        if (gVar.getTextColor() != null) {
            this.f83162o = gVar.getTextColor();
        }
        if (gVar.getTextSize() != 0.0f) {
            this.f83158m = gVar.getTextSize();
        }
        ColorStateList colorStateList = gVar.f88488a;
        if (colorStateList != null) {
            this.f83145f0 = colorStateList;
        }
        this.f83141d0 = gVar.f88493f;
        this.f83143e0 = gVar.f88494g;
        this.f83139c0 = gVar.f88495h;
        this.f83149h0 = gVar.f88497j;
        ug.b bVar = this.E;
        if (bVar != null) {
            bVar.cancel();
        }
        this.E = new ug.b(new f(this), gVar.getFallbackFont());
        gVar.getFontAsync(view.getContext(), this.E);
        recalculate();
    }

    public void setExpandedTextColor(ColorStateList colorStateList) {
        if (this.f83162o != colorStateList) {
            this.f83162o = colorStateList;
            recalculate();
        }
    }

    public void setExpandedTextGravity(int i10) {
        if (this.f83154k != i10) {
            this.f83154k = i10;
            recalculate();
        }
    }

    public void setExpandedTextSize(float f10) {
        if (this.f83158m != f10) {
            this.f83158m = f10;
            recalculate();
        }
    }

    public void setExpandedTypeface(Typeface typeface) {
        if (j(typeface)) {
            recalculate();
        }
    }

    public void setExpansionFraction(float f10) {
        float fClamp = r3.a.clamp(f10, 0.0f, 1.0f);
        if (fClamp != this.f83136b) {
            this.f83136b = fClamp;
            b();
        }
    }

    public void setFadeModeEnabled(boolean z10) {
        this.f83138c = z10;
    }

    public void setFadeModeStartFraction(float f10) {
        this.f83140d = f10;
        this.f83142e = o2.a(1.0f, f10, 0.5f, f10);
    }

    public void setHyphenationFrequency(int i10) {
        this.f83171s0 = i10;
    }

    public void setLineSpacingAdd(float f10) {
        this.f83167q0 = f10;
    }

    public void setLineSpacingMultiplier(float f10) {
        this.f83169r0 = f10;
    }

    public void setPositionInterpolator(TimeInterpolator timeInterpolator) {
        this.W = timeInterpolator;
        recalculate();
    }

    public void setRtlTextDirectionHeuristicsEnabled(boolean z10) {
        this.K = z10;
    }

    public final boolean setState(int[] iArr) {
        this.S = iArr;
        if (!isStateful()) {
            return false;
        }
        recalculate();
        return true;
    }

    public void setStaticLayoutBuilderConfigurer(e0 e0Var) {
        if (this.f83173t0 != e0Var) {
            this.f83173t0 = e0Var;
            recalculate(true);
        }
    }

    public void setText(CharSequence charSequence) {
        if (charSequence == null || !TextUtils.equals(this.H, charSequence)) {
            this.H = charSequence;
            this.I = null;
            recalculate();
        }
    }

    public void setTextSizeInterpolator(TimeInterpolator timeInterpolator) {
        this.X = timeInterpolator;
        recalculate();
    }

    public void setTitleTextEllipsize(TextUtils.TruncateAt truncateAt) {
        this.G = truncateAt;
        recalculate();
    }

    public void setTypefaces(Typeface typeface) {
        boolean zI = i(typeface);
        boolean zJ = j(typeface);
        if (zI || zJ) {
            recalculate();
        }
    }

    public void updateTextHeights(int i10) {
        float f10 = this.f83160n;
        TextPaint textPaint = this.V;
        textPaint.setTextSize(f10);
        textPaint.setTypeface(this.f83180x);
        textPaint.setLetterSpacing(this.f83147g0);
        float f11 = i10;
        this.f83175u0 = e(this.f83165p0, textPaint, this.H, (this.f83160n / this.f83158m) * f11, this.J).getHeight();
        textPaint.setTextSize(this.f83158m);
        textPaint.setTypeface(this.A);
        textPaint.setLetterSpacing(this.f83149h0);
        this.f83177v0 = e(this.f83163o0, textPaint, this.H, f11, this.J).getHeight();
    }

    public void recalculate(boolean z10) {
        float fMeasureText;
        View view = this.f83134a;
        if ((view.getHeight() <= 0 || view.getWidth() <= 0) && !z10) {
            return;
        }
        d(1.0f, z10);
        CharSequence charSequence = this.I;
        TextPaint textPaint = this.U;
        if (charSequence != null && this.f83153j0 != null) {
            this.f83161n0 = k() ? TextUtils.ellipsize(this.I, textPaint, this.f83153j0.getWidth(), this.G) : this.I;
        }
        CharSequence charSequence2 = this.f83161n0;
        if (charSequence2 != null) {
            this.f83155k0 = textPaint.measureText(charSequence2, 0, charSequence2.length());
        } else {
            this.f83155k0 = 0.0f;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(this.f83156l, this.J ? 1 : 0);
        Rect rect = this.f83150i;
        Rect rect2 = this.f83148h;
        if (rect == null) {
            rect = rect2;
        }
        int i10 = absoluteGravity & 112;
        if (i10 == 48) {
            this.f83170s = rect.top;
        } else if (i10 != 80) {
            this.f83170s = rect.centerY() - ((textPaint.descent() - textPaint.ascent()) / 2.0f);
        } else {
            this.f83170s = textPaint.ascent() + rect.bottom;
        }
        int i11 = absoluteGravity & 8388615;
        if (i11 == 1) {
            this.f83174u = rect.centerX() - (this.f83155k0 / 2.0f);
        } else if (i11 != 5) {
            this.f83174u = rect.left;
        } else {
            this.f83174u = rect.right - this.f83155k0;
        }
        if (this.f83155k0 <= rect2.width()) {
            float f10 = this.f83174u;
            float fMax = Math.max(0.0f, rect2.left - f10) + f10;
            this.f83174u = fMax;
            this.f83174u = Math.min(0.0f, rect2.right - (this.f83155k0 + fMax)) + fMax;
        }
        if (getCollapsedFullSingleLineHeight() <= rect2.height()) {
            float f11 = this.f83170s;
            float fMax2 = Math.max(0.0f, rect2.top - f11) + f11;
            this.f83170s = fMax2;
            this.f83170s = Math.min(0.0f, rect2.bottom - (getCollapsedTextHeight() + fMax2)) + fMax2;
        }
        d(0.0f, z10);
        float height = this.f83153j0 != null ? r15.getHeight() : 0.0f;
        StaticLayout staticLayout = this.f83153j0;
        if (staticLayout == null || this.f83163o0 <= 1) {
            CharSequence charSequence3 = this.I;
            fMeasureText = charSequence3 != null ? textPaint.measureText(charSequence3, 0, charSequence3.length()) : 0.0f;
        } else {
            fMeasureText = staticLayout.getWidth();
        }
        StaticLayout staticLayout2 = this.f83153j0;
        this.f83166q = staticLayout2 != null ? staticLayout2.getLineCount() : 0;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(this.f83154k, this.J ? 1 : 0);
        int i12 = absoluteGravity2 & 112;
        Rect rect3 = this.f83146g;
        if (i12 == 48) {
            this.f83168r = rect3.top;
        } else if (i12 != 80) {
            this.f83168r = rect3.centerY() - (height / 2.0f);
        } else {
            this.f83168r = (rect3.bottom - height) + (this.f83179w0 ? textPaint.descent() : 0.0f);
        }
        int i13 = absoluteGravity2 & 8388615;
        if (i13 == 1) {
            this.f83172t = rect3.centerX() - (fMeasureText / 2.0f);
        } else if (i13 != 5) {
            this.f83172t = rect3.left;
        } else {
            this.f83172t = rect3.right - fMeasureText;
        }
        d(this.f83136b, false);
        view.postInvalidateOnAnimation();
        b();
    }

    public void setCollapsedBounds(Rect rect) {
        setCollapsedBounds(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void setExpandedBounds(int i10, int i11, int i12, int i13) {
        setExpandedBounds(i10, i11, i12, i13, true);
    }

    public void setExpandedBounds(Rect rect) {
        setExpandedBounds(rect.left, rect.top, rect.right, rect.bottom);
    }
}
