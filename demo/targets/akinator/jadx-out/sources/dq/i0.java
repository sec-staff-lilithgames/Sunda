package dq;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import j1.o2;
import java.util.HashSet;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class i0 extends Drawable {

    /* renamed from: t, reason: collision with root package name */
    public static final ImageView.ScaleType f52478t;

    /* renamed from: a, reason: collision with root package name */
    public final Bitmap f52479a;

    /* renamed from: b, reason: collision with root package name */
    public final RectF f52480b;

    /* renamed from: c, reason: collision with root package name */
    public final RectF f52481c;

    /* renamed from: d, reason: collision with root package name */
    public final int f52482d;

    /* renamed from: e, reason: collision with root package name */
    public final int f52483e;

    /* renamed from: f, reason: collision with root package name */
    public final RectF f52484f;

    /* renamed from: g, reason: collision with root package name */
    public final Paint f52485g;

    /* renamed from: h, reason: collision with root package name */
    public final RectF f52486h;

    /* renamed from: i, reason: collision with root package name */
    public final Paint f52487i;

    /* renamed from: j, reason: collision with root package name */
    public final Matrix f52488j;

    /* renamed from: k, reason: collision with root package name */
    public final RectF f52489k;

    /* renamed from: l, reason: collision with root package name */
    public final Shader.TileMode f52490l;

    /* renamed from: m, reason: collision with root package name */
    public final Shader.TileMode f52491m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f52492n;

    /* renamed from: o, reason: collision with root package name */
    public float f52493o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean[] f52494p;

    /* renamed from: q, reason: collision with root package name */
    public float f52495q;

    /* renamed from: r, reason: collision with root package name */
    public ColorStateList f52496r;

    /* renamed from: s, reason: collision with root package name */
    public ImageView.ScaleType f52497s;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }
    }

    static {
        new a(null);
        f52478t = ImageView.ScaleType.FIT_CENTER;
    }

    public i0(Bitmap bitmap) {
        kotlin.jvm.internal.e0.checkNotNullParameter(bitmap, "bitmap");
        this.f52479a = bitmap;
        this.f52480b = new RectF();
        this.f52481c = new RectF();
        int width = bitmap.getWidth();
        this.f52482d = width;
        int height = bitmap.getHeight();
        this.f52483e = height;
        RectF rectF = new RectF();
        rectF.set(0.0f, 0.0f, width, height);
        this.f52484f = rectF;
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        this.f52485g = paint;
        this.f52486h = new RectF();
        Paint paint2 = new Paint();
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        this.f52487i = paint2;
        this.f52488j = new Matrix();
        this.f52489k = new RectF();
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f52490l = tileMode;
        this.f52491m = tileMode;
        this.f52492n = true;
        this.f52494p = new boolean[]{true, true, true, true};
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(0);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(colorStateListValueOf, "valueOf(DEFAULT_BORDER_COLOR)");
        this.f52496r = colorStateListValueOf;
        this.f52497s = f52478t;
        paint2.setColor(colorStateListValueOf.getColorForState(getState(), 0));
        paint2.setStrokeWidth(this.f52495q);
    }

    public final i0 a(float f10, float f11, float f12, float f13) {
        HashSet hashSet = new HashSet(4);
        hashSet.add(Float.valueOf(f10));
        hashSet.add(Float.valueOf(f11));
        hashSet.add(Float.valueOf(f12));
        hashSet.add(Float.valueOf(f13));
        hashSet.remove(Float.valueOf(0.0f));
        if (hashSet.size() <= 1) {
            if (hashSet.isEmpty()) {
                this.f52493o = 0.0f;
            } else {
                float fFloatValue = ((Number) hashSet.iterator().next()).floatValue();
                if (!Float.isInfinite(fFloatValue) && !Float.isNaN(fFloatValue) && fFloatValue >= 0.0f) {
                    this.f52493o = fFloatValue;
                }
            }
            boolean z10 = f10 > 0.0f;
            boolean[] zArr = this.f52494p;
            zArr[0] = z10;
            zArr[1] = f11 > 0.0f;
            zArr[2] = f12 > 0.0f;
            zArr[3] = f13 > 0.0f;
            return this;
        }
        return this;
    }

    public final void b() {
        float fWidth;
        float fC;
        int i10 = j0.f52498a[this.f52497s.ordinal()];
        int i11 = this.f52483e;
        int i12 = this.f52482d;
        RectF rectF = this.f52480b;
        RectF rectF2 = this.f52484f;
        Matrix matrix = this.f52488j;
        RectF rectF3 = this.f52486h;
        switch (i10) {
            case 1:
                rectF3.set(rectF);
                float f10 = this.f52495q / 2;
                rectF3.inset(f10, f10);
                matrix.reset();
                matrix.setTranslate(o2.a(rectF3.width(), i12, 0.5f, 0.5f), o2.a(rectF3.height(), i11, 0.5f, 0.5f));
                break;
            case 2:
                rectF3.set(rectF);
                float f11 = 2;
                float f12 = this.f52495q / f11;
                rectF3.inset(f12, f12);
                matrix.reset();
                float fC2 = 0.0f;
                if (rectF3.height() * i12 > rectF3.width() * i11) {
                    fWidth = rectF3.height() / i11;
                    fC = e3.g.c(i12, fWidth, rectF3.width(), 0.5f);
                } else {
                    fWidth = rectF3.width() / i12;
                    fC2 = e3.g.c(i11, fWidth, rectF3.height(), 0.5f);
                    fC = 0.0f;
                }
                matrix.setScale(fWidth, fWidth);
                float f13 = (int) (fC + 0.5f);
                float f14 = this.f52495q / f11;
                matrix.postTranslate(f13 + f14, ((int) (fC2 + 0.5f)) + f14);
                break;
            case 3:
                matrix.reset();
                float fMin = (((float) i12) > rectF.width() || ((float) i11) > rectF.height()) ? Math.min(rectF.width() / i12, rectF.height() / i11) : 1.0f;
                float fWidth2 = ((rectF.width() - (i12 * fMin)) * 0.5f) + 0.5f;
                float fHeight = ((rectF.height() - (i11 * fMin)) * 0.5f) + 0.5f;
                matrix.setScale(fMin, fMin);
                matrix.postTranslate(fWidth2, fHeight);
                rectF3.set(rectF2);
                matrix.mapRect(rectF3);
                float f15 = this.f52495q / 2;
                rectF3.inset(f15, f15);
                matrix.setRectToRect(rectF2, rectF3, Matrix.ScaleToFit.FILL);
                break;
            case 4:
                rectF3.set(rectF2);
                matrix.setRectToRect(rectF2, rectF, Matrix.ScaleToFit.CENTER);
                matrix.mapRect(rectF3);
                float f16 = this.f52495q / 2;
                rectF3.inset(f16, f16);
                matrix.setRectToRect(rectF2, rectF3, Matrix.ScaleToFit.FILL);
                break;
            case 5:
                rectF3.set(rectF2);
                matrix.setRectToRect(rectF2, rectF, Matrix.ScaleToFit.END);
                matrix.mapRect(rectF3);
                float f17 = this.f52495q / 2;
                rectF3.inset(f17, f17);
                matrix.setRectToRect(rectF2, rectF3, Matrix.ScaleToFit.FILL);
                break;
            case 6:
                rectF3.set(rectF2);
                matrix.setRectToRect(rectF2, rectF, Matrix.ScaleToFit.START);
                matrix.mapRect(rectF3);
                float f18 = this.f52495q / 2;
                rectF3.inset(f18, f18);
                matrix.setRectToRect(rectF2, rectF3, Matrix.ScaleToFit.FILL);
                break;
            case 7:
                rectF3.set(rectF);
                float f19 = this.f52495q / 2;
                rectF3.inset(f19, f19);
                matrix.reset();
                matrix.setRectToRect(rectF2, rectF3, Matrix.ScaleToFit.FILL);
                break;
            default:
                rectF3.set(rectF2);
                matrix.setRectToRect(rectF2, rectF, Matrix.ScaleToFit.CENTER);
                matrix.mapRect(rectF3);
                float f20 = this.f52495q / 2;
                rectF3.inset(f20, f20);
                matrix.setRectToRect(rectF2, rectF3, Matrix.ScaleToFit.FILL);
                break;
        }
        this.f52481c.set(rectF3);
        this.f52492n = true;
    }

    public final void c(Canvas canvas) {
        boolean[] zArr = this.f52494p;
        for (boolean z10 : zArr) {
            if (z10) {
                if (this.f52493o == 0.0f) {
                    return;
                }
                RectF rectF = this.f52481c;
                float f10 = rectF.left;
                float f11 = rectF.top;
                float fWidth = rectF.width() + f10;
                float fHeight = rectF.height() + f11;
                float f12 = this.f52493o;
                boolean z11 = zArr[0];
                Paint paint = this.f52485g;
                RectF rectF2 = this.f52489k;
                if (!z11) {
                    rectF2.set(f10, f11, f10 + f12, f11 + f12);
                    canvas.drawRect(rectF2, paint);
                }
                if (!zArr[1]) {
                    rectF2.set(fWidth - f12, f11, fWidth, f12);
                    canvas.drawRect(rectF2, paint);
                }
                if (!zArr[2]) {
                    rectF2.set(fWidth - f12, fHeight - f12, fWidth, fHeight);
                    canvas.drawRect(rectF2, paint);
                }
                if (zArr[3]) {
                    return;
                }
                rectF2.set(f10, fHeight - f12, f12 + f10, fHeight);
                canvas.drawRect(rectF2, paint);
                return;
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Canvas canvas2;
        float f10;
        float f11;
        float f12;
        kotlin.jvm.internal.e0.checkNotNullParameter(canvas, "canvas");
        boolean z10 = this.f52492n;
        Paint paint = this.f52485g;
        if (z10) {
            Bitmap bitmap = this.f52479a;
            Shader.TileMode tileMode = this.f52490l;
            Shader.TileMode tileMode2 = this.f52491m;
            BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode2);
            Shader.TileMode tileMode3 = Shader.TileMode.CLAMP;
            if (tileMode == tileMode3 && tileMode2 == tileMode3) {
                bitmapShader.setLocalMatrix(this.f52488j);
            }
            paint.setShader(bitmapShader);
            this.f52492n = false;
        }
        boolean[] zArr = this.f52494p;
        int length = zArr.length;
        int i10 = 0;
        while (true) {
            RectF rectF = this.f52486h;
            Paint paint2 = this.f52487i;
            RectF rectF2 = this.f52481c;
            if (i10 >= length) {
                canvas.drawRect(rectF2, paint);
                if (this.f52495q > 0.0f) {
                    canvas.drawRect(rectF, paint2);
                    return;
                }
                return;
            }
            if (zArr[i10]) {
                float f13 = this.f52493o;
                if (this.f52495q <= 0.0f) {
                    canvas.drawRoundRect(rectF2, f13, f13, paint);
                    c(canvas);
                    return;
                }
                canvas.drawRoundRect(rectF2, f13, f13, paint);
                canvas.drawRoundRect(rectF, f13, f13, paint2);
                c(canvas);
                for (boolean z11 : zArr) {
                    if (z11) {
                        if (this.f52493o == 0.0f) {
                            return;
                        }
                        float f14 = rectF2.left;
                        float f15 = rectF2.top;
                        float fWidth = rectF2.width() + f14;
                        float fHeight = rectF2.height() + f15;
                        float f16 = this.f52493o;
                        float f17 = this.f52495q / 2;
                        if (zArr[0]) {
                            canvas2 = canvas;
                            f10 = f14;
                            f11 = f15;
                        } else {
                            canvas2 = canvas;
                            canvas2.drawLine(f14 - f17, f15, f14 + f16, f15, paint2);
                            f11 = f15;
                            canvas2.drawLine(f14, f11 - f17, f14, f11 + f16, paint2);
                            f10 = f14;
                        }
                        if (!zArr[1]) {
                            float f18 = f11;
                            canvas2.drawLine((fWidth - f16) - f17, f18, fWidth, f11, paint2);
                            canvas2.drawLine(fWidth, f18 - f17, fWidth, f18 + f16, paint2);
                            fWidth = fWidth;
                        }
                        if (zArr[2]) {
                            f12 = fHeight;
                        } else {
                            canvas2.drawLine((fWidth - f16) - f17, fHeight, fWidth + f17, fHeight, paint2);
                            canvas2.drawLine(fWidth, fHeight - f16, fWidth, fHeight, paint2);
                            f12 = fHeight;
                        }
                        if (zArr[3]) {
                            return;
                        }
                        float f19 = f12;
                        canvas2.drawLine(f10 - f17, f12, f10 + f16, f19, paint2);
                        canvas2.drawLine(f10, f12 - f16, f10, f19, paint2);
                        return;
                    }
                }
                return;
            }
            i10++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f52485g.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.f52485g.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f52483e;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f52482d;
    }

    @Override // android.graphics.drawable.Drawable
    @tu.f
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return this.f52496r.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect bounds) {
        kotlin.jvm.internal.e0.checkNotNullParameter(bounds, "bounds");
        super.onBoundsChange(bounds);
        this.f52480b.set(bounds);
        b();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] state) {
        kotlin.jvm.internal.e0.checkNotNullParameter(state, "state");
        int colorForState = this.f52496r.getColorForState(state, 0);
        Paint paint = this.f52487i;
        if (paint.getColor() == colorForState) {
            return super.onStateChange(state);
        }
        paint.setColor(colorForState);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f52485g.setAlpha(i10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f52485g.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    @tu.f
    public void setDither(boolean z10) {
        this.f52485g.setDither(z10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z10) {
        this.f52485g.setFilterBitmap(z10);
        invalidateSelf();
    }

    public final i0 a(float f10) {
        this.f52495q = f10;
        this.f52487i.setStrokeWidth(f10);
        return this;
    }

    public final i0 a(int i10) {
        return a(ColorStateList.valueOf(i10));
    }

    public final i0 a(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(colorStateList, "valueOf(0)");
        }
        this.f52496r = colorStateList;
        this.f52487i.setColor(colorStateList.getColorForState(getState(), 0));
        return this;
    }

    public final i0 a(ImageView.ScaleType scaleType) {
        if (scaleType == null) {
            scaleType = f52478t;
        }
        if (this.f52497s != scaleType) {
            this.f52497s = scaleType;
            b();
        }
        return this;
    }

    public final i0 b(float f10) {
        a(f10, f10, f10, f10);
        return this;
    }
}
