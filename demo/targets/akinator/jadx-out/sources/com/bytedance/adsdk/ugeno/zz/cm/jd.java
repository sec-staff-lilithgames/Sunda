package com.bytedance.adsdk.ugeno.zz.cm;

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
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.Log;
import android.widget.ImageView;
import e3.g;
import j1.o2;
import java.util.HashSet;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jd extends Drawable {

    /* renamed from: au, reason: collision with root package name */
    private Shader.TileMode f18060au;

    /* renamed from: cm, reason: collision with root package name */
    private final Bitmap f18061cm;
    private final boolean[] hna;

    /* renamed from: if, reason: not valid java name */
    private Shader.TileMode f46if;

    /* renamed from: jj, reason: collision with root package name */
    private final int f18063jj;

    /* renamed from: jr, reason: collision with root package name */
    private ColorStateList f18064jr;

    /* renamed from: ju, reason: collision with root package name */
    private final RectF f18065ju;
    private final Paint my;
    private ImageView.ScaleType nmd;
    private float opi;
    private boolean oya;
    private float prr;

    /* renamed from: qk, reason: collision with root package name */
    private final int f18066qk;

    /* renamed from: sq, reason: collision with root package name */
    private boolean f18067sq;
    private final RectF wqx;
    private final RectF xyk;

    /* renamed from: yd, reason: collision with root package name */
    private final Matrix f18068yd;
    private final Paint zz;
    private final RectF jpo = new RectF();

    /* renamed from: jd, reason: collision with root package name */
    private final RectF f18062jd = new RectF();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.bytedance.adsdk.ugeno.zz.cm.jd$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] jpo;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            jpo = iArr;
            try {
                iArr[ImageView.ScaleType.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                jpo[ImageView.ScaleType.CENTER_CROP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                jpo[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                jpo[ImageView.ScaleType.FIT_CENTER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                jpo[ImageView.ScaleType.FIT_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                jpo[ImageView.ScaleType.FIT_START.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                jpo[ImageView.ScaleType.FIT_XY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public jd(Bitmap bitmap) {
        RectF rectF = new RectF();
        this.wqx = rectF;
        this.xyk = new RectF();
        this.f18068yd = new Matrix();
        this.f18065ju = new RectF();
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f46if = tileMode;
        this.f18060au = tileMode;
        this.oya = true;
        this.prr = 0.0f;
        this.hna = new boolean[]{true, true, true, true};
        this.f18067sq = false;
        this.opi = 0.0f;
        this.f18064jr = ColorStateList.valueOf(-16777216);
        this.nmd = ImageView.ScaleType.FIT_CENTER;
        this.f18061cm = bitmap;
        int width = bitmap.getWidth();
        this.f18063jj = width;
        int height = bitmap.getHeight();
        this.f18066qk = height;
        rectF.set(0.0f, 0.0f, width, height);
        Paint paint = new Paint();
        this.my = paint;
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.zz = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        paint2.setColor(this.f18064jr.getColorForState(getState(), -16777216));
        paint2.setStrokeWidth(this.opi);
    }

    public static Bitmap jd(Drawable drawable) {
        if (drawable == null) {
            return null;
        }
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        try {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(Math.max(drawable.getIntrinsicWidth(), 2), Math.max(drawable.getIntrinsicHeight(), 2), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawable.draw(canvas);
            return bitmapCreateBitmap;
        } catch (Throwable unused) {
            Log.w("RoundedDrawable", "Failed to create bitmap from drawable!");
            return null;
        }
    }

    public static jd jpo(Bitmap bitmap) {
        if (bitmap != null) {
            return new jd(bitmap);
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.oya) {
            BitmapShader bitmapShader = new BitmapShader(this.f18061cm, this.f46if, this.f18060au);
            Shader.TileMode tileMode = this.f46if;
            Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
            if (tileMode == tileMode2 && this.f18060au == tileMode2) {
                bitmapShader.setLocalMatrix(this.f18068yd);
            }
            this.my.setShader(bitmapShader);
            this.oya = false;
        }
        if (this.f18067sq) {
            if (this.opi <= 0.0f) {
                canvas.drawOval(this.f18062jd, this.my);
                return;
            } else {
                canvas.drawOval(this.f18062jd, this.my);
                canvas.drawOval(this.xyk, this.zz);
                return;
            }
        }
        if (!jpo(this.hna)) {
            canvas.drawRect(this.f18062jd, this.my);
            if (this.opi > 0.0f) {
                canvas.drawRect(this.xyk, this.zz);
                return;
            }
            return;
        }
        float f10 = this.prr;
        if (this.opi <= 0.0f) {
            canvas.drawRoundRect(this.f18062jd, f10, f10, this.my);
            jpo(canvas);
        } else {
            canvas.drawRoundRect(this.f18062jd, f10, f10, this.my);
            canvas.drawRoundRect(this.xyk, f10, f10, this.zz);
            jpo(canvas);
            jd(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.my.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.my.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f18066qk;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f18063jj;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return this.f18064jr.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.jpo.set(rect);
        jpo();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        int colorForState = this.f18064jr.getColorForState(iArr, 0);
        if (this.zz.getColor() == colorForState) {
            return super.onStateChange(iArr);
        }
        this.zz.setColor(colorForState);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.my.setAlpha(i10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.my.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z10) {
        this.my.setDither(z10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z10) {
        this.my.setFilterBitmap(z10);
        invalidateSelf();
    }

    public static Drawable jpo(Drawable drawable) {
        if (drawable != null) {
            if (drawable instanceof jd) {
                return drawable;
            }
            if (Build.VERSION.SDK_INT >= 28 && a.d(drawable)) {
                return drawable;
            }
            if (drawable instanceof LayerDrawable) {
                Drawable.ConstantState constantState = drawable.mutate().getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                for (int i10 = 0; i10 < numberOfLayers; i10++) {
                    layerDrawable.setDrawableByLayerId(layerDrawable.getId(i10), jpo(layerDrawable.getDrawable(i10)));
                }
                return layerDrawable;
            }
        }
        Bitmap bitmapJd = jd(drawable);
        return bitmapJd != null ? new jd(bitmapJd) : drawable;
    }

    private void jd(Canvas canvas) {
        float f10;
        float f11;
        if (jd(this.hna) || this.prr == 0.0f) {
            return;
        }
        RectF rectF = this.f18062jd;
        float f12 = rectF.left;
        float f13 = rectF.top;
        float fWidth = rectF.width() + f12;
        float fHeight = this.f18062jd.height() + f13;
        float f14 = this.prr;
        float f15 = this.opi / 2.0f;
        if (this.hna[0]) {
            f10 = f13;
        } else {
            f10 = f13;
            canvas.drawLine(f12 - f15, f13, f12 + f14, f10, this.zz);
            canvas.drawLine(f12, f10 - f15, f12, f10 + f14, this.zz);
        }
        if (!this.hna[1]) {
            float f16 = f10;
            canvas.drawLine((fWidth - f14) - f15, f16, fWidth, f10, this.zz);
            canvas.drawLine(fWidth, f16 - f15, fWidth, f16 + f14, this.zz);
            fWidth = fWidth;
        }
        if (this.hna[2]) {
            f11 = fHeight;
        } else {
            canvas.drawLine((fWidth - f14) - f15, fHeight, fWidth + f15, fHeight, this.zz);
            float f17 = fWidth;
            canvas.drawLine(f17, fHeight - f14, fWidth, fHeight, this.zz);
            f11 = fHeight;
        }
        if (this.hna[3]) {
            return;
        }
        canvas.drawLine(f12 - f15, f11, f12 + f14, f11, this.zz);
        canvas.drawLine(f12, f11 - f14, f12, f11, this.zz);
    }

    private void jpo() {
        float fWidth;
        float fC;
        int i10 = AnonymousClass1.jpo[this.nmd.ordinal()];
        if (i10 == 1) {
            this.xyk.set(this.jpo);
            RectF rectF = this.xyk;
            float f10 = this.opi;
            rectF.inset(f10 / 2.0f, f10 / 2.0f);
            this.f18068yd.reset();
            this.f18068yd.setTranslate((int) o2.a(this.xyk.width(), this.f18063jj, 0.5f, 0.5f), (int) o2.a(this.xyk.height(), this.f18066qk, 0.5f, 0.5f));
        } else if (i10 == 2) {
            this.xyk.set(this.jpo);
            RectF rectF2 = this.xyk;
            float f11 = this.opi;
            rectF2.inset(f11 / 2.0f, f11 / 2.0f);
            this.f18068yd.reset();
            float fC2 = 0.0f;
            if (this.xyk.height() * this.f18063jj > this.xyk.width() * this.f18066qk) {
                fWidth = this.xyk.height() / this.f18066qk;
                fC = 0.0f;
                fC2 = g.c(this.f18063jj, fWidth, this.xyk.width(), 0.5f);
            } else {
                fWidth = this.xyk.width() / this.f18063jj;
                fC = g.c(this.f18066qk, fWidth, this.xyk.height(), 0.5f);
            }
            this.f18068yd.setScale(fWidth, fWidth);
            Matrix matrix = this.f18068yd;
            float f12 = this.opi;
            matrix.postTranslate((f12 / 2.0f) + ((int) (fC2 + 0.5f)), (f12 / 2.0f) + ((int) (fC + 0.5f)));
        } else if (i10 == 3) {
            this.f18068yd.reset();
            float fMin = (((float) this.f18063jj) > this.jpo.width() || ((float) this.f18066qk) > this.jpo.height()) ? Math.min(this.jpo.width() / this.f18063jj, this.jpo.height() / this.f18066qk) : 1.0f;
            float fWidth2 = (int) (((this.jpo.width() - (this.f18063jj * fMin)) * 0.5f) + 0.5f);
            float fHeight = (int) (((this.jpo.height() - (this.f18066qk * fMin)) * 0.5f) + 0.5f);
            this.f18068yd.setScale(fMin, fMin);
            this.f18068yd.postTranslate(fWidth2, fHeight);
            this.xyk.set(this.wqx);
            this.f18068yd.mapRect(this.xyk);
            RectF rectF3 = this.xyk;
            float f13 = this.opi;
            rectF3.inset(f13 / 2.0f, f13 / 2.0f);
            this.f18068yd.setRectToRect(this.wqx, this.xyk, Matrix.ScaleToFit.FILL);
        } else if (i10 == 5) {
            this.xyk.set(this.wqx);
            this.f18068yd.setRectToRect(this.wqx, this.jpo, Matrix.ScaleToFit.END);
            this.f18068yd.mapRect(this.xyk);
            RectF rectF4 = this.xyk;
            float f14 = this.opi;
            rectF4.inset(f14 / 2.0f, f14 / 2.0f);
            this.f18068yd.setRectToRect(this.wqx, this.xyk, Matrix.ScaleToFit.FILL);
        } else if (i10 == 6) {
            this.xyk.set(this.wqx);
            this.f18068yd.setRectToRect(this.wqx, this.jpo, Matrix.ScaleToFit.START);
            this.f18068yd.mapRect(this.xyk);
            RectF rectF5 = this.xyk;
            float f15 = this.opi;
            rectF5.inset(f15 / 2.0f, f15 / 2.0f);
            this.f18068yd.setRectToRect(this.wqx, this.xyk, Matrix.ScaleToFit.FILL);
        } else if (i10 != 7) {
            this.xyk.set(this.wqx);
            this.f18068yd.setRectToRect(this.wqx, this.jpo, Matrix.ScaleToFit.CENTER);
            this.f18068yd.mapRect(this.xyk);
            RectF rectF6 = this.xyk;
            float f16 = this.opi;
            rectF6.inset(f16 / 2.0f, f16 / 2.0f);
            this.f18068yd.setRectToRect(this.wqx, this.xyk, Matrix.ScaleToFit.FILL);
        } else {
            this.xyk.set(this.jpo);
            RectF rectF7 = this.xyk;
            float f17 = this.opi;
            rectF7.inset(f17 / 2.0f, f17 / 2.0f);
            this.f18068yd.reset();
            this.f18068yd.setRectToRect(this.wqx, this.xyk, Matrix.ScaleToFit.FILL);
        }
        this.f18062jd.set(this.xyk);
        this.oya = true;
    }

    public jd jd(Shader.TileMode tileMode) {
        if (this.f18060au != tileMode) {
            this.f18060au = tileMode;
            this.oya = true;
            invalidateSelf();
        }
        return this;
    }

    private static boolean jd(boolean[] zArr) {
        for (boolean z10 : zArr) {
            if (z10) {
                return false;
            }
        }
        return true;
    }

    private void jpo(Canvas canvas) {
        if (jd(this.hna) || this.prr == 0.0f) {
            return;
        }
        RectF rectF = this.f18062jd;
        float f10 = rectF.left;
        float f11 = rectF.top;
        float fWidth = rectF.width() + f10;
        float fHeight = this.f18062jd.height() + f11;
        float f12 = this.prr;
        if (!this.hna[0]) {
            this.f18065ju.set(f10, f11, f10 + f12, f11 + f12);
            canvas.drawRect(this.f18065ju, this.my);
        }
        if (!this.hna[1]) {
            this.f18065ju.set(fWidth - f12, f11, fWidth, f12);
            canvas.drawRect(this.f18065ju, this.my);
        }
        if (!this.hna[2]) {
            this.f18065ju.set(fWidth - f12, fHeight - f12, fWidth, fHeight);
            canvas.drawRect(this.f18065ju, this.my);
        }
        if (this.hna[3]) {
            return;
        }
        this.f18065ju.set(f10, fHeight - f12, f12 + f10, fHeight);
        canvas.drawRect(this.f18065ju, this.my);
    }

    public jd jpo(float f10, float f11, float f12, float f13) {
        HashSet hashSet = new HashSet(4);
        hashSet.add(Float.valueOf(f10));
        hashSet.add(Float.valueOf(f11));
        hashSet.add(Float.valueOf(f12));
        hashSet.add(Float.valueOf(f13));
        hashSet.remove(Float.valueOf(0.0f));
        if (hashSet.size() <= 1) {
            if (!hashSet.isEmpty()) {
                float fFloatValue = ((Float) hashSet.iterator().next()).floatValue();
                if (!Float.isInfinite(fFloatValue) && !Float.isNaN(fFloatValue) && fFloatValue >= 0.0f) {
                    this.prr = fFloatValue;
                } else {
                    throw new IllegalArgumentException("Invalid radius value: ".concat(String.valueOf(fFloatValue)));
                }
            } else {
                this.prr = 0.0f;
            }
            boolean[] zArr = this.hna;
            zArr[0] = f10 > 0.0f;
            zArr[1] = f11 > 0.0f;
            zArr[2] = f12 > 0.0f;
            zArr[3] = f13 > 0.0f;
            return this;
        }
        throw new IllegalArgumentException("Multiple nonzero corner radii not yet supported.");
    }

    public jd jpo(float f10) {
        this.opi = f10;
        this.zz.setStrokeWidth(f10);
        return this;
    }

    public jd jpo(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f18064jr = colorStateList;
        this.zz.setColor(colorStateList.getColorForState(getState(), -16777216));
        return this;
    }

    public jd jpo(boolean z10) {
        this.f18067sq = z10;
        return this;
    }

    public jd jpo(ImageView.ScaleType scaleType) {
        if (scaleType == null) {
            scaleType = ImageView.ScaleType.FIT_CENTER;
        }
        if (this.nmd != scaleType) {
            this.nmd = scaleType;
            jpo();
        }
        return this;
    }

    public jd jpo(Shader.TileMode tileMode) {
        if (this.f46if != tileMode) {
            this.f46if = tileMode;
            this.oya = true;
            invalidateSelf();
        }
        return this;
    }

    private static boolean jpo(boolean[] zArr) {
        for (boolean z10 : zArr) {
            if (z10) {
                return true;
            }
        }
        return false;
    }
}
