package um;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;
import j1.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class i extends Drawable implements Animatable {

    /* renamed from: i, reason: collision with root package name */
    public static final LinearInterpolator f88589i = new LinearInterpolator();

    /* renamed from: j, reason: collision with root package name */
    public static final e f88590j = new e();

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f88591k = {-16777216};

    /* renamed from: b, reason: collision with root package name */
    public final Resources f88592b;

    /* renamed from: c, reason: collision with root package name */
    public final h f88593c;

    /* renamed from: e, reason: collision with root package name */
    public float f88594e;

    /* renamed from: f, reason: collision with root package name */
    public final ValueAnimator f88595f;

    /* renamed from: g, reason: collision with root package name */
    public float f88596g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f88597h;

    public i(Context context) {
        this.f88592b = context.getResources();
        h hVar = new h();
        this.f88593c = hVar;
        hVar.f88580h = f88591k;
        hVar.a(0);
        setStrokeWidth(2.5f);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new f(this, hVar));
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setRepeatMode(1);
        valueAnimatorOfFloat.setInterpolator(f88589i);
        valueAnimatorOfFloat.addListener(new g(this, hVar));
        this.f88595f = valueAnimatorOfFloat;
    }

    public static void a(i iVar, float f10, h hVar, boolean z10) {
        float interpolation;
        float interpolation2;
        if (iVar.f88597h) {
            b(f10, hVar);
            float fFloor = (float) (Math.floor(hVar.f88584l / 0.8f) + 1.0d);
            float f11 = hVar.f88582j;
            float f12 = hVar.f88583k;
            hVar.f88576d = (((f12 - 0.01f) - f11) * f10) + f11;
            hVar.f88577e = f12;
            float f13 = hVar.f88584l;
            hVar.f88578f = o2.a(fFloor, f13, f10, f13);
            return;
        }
        if (f10 != 1.0f || z10) {
            float f14 = hVar.f88584l;
            e eVar = f88590j;
            if (f10 < 0.5f) {
                interpolation = hVar.f88582j;
                interpolation2 = (eVar.getInterpolation(f10 / 0.5f) * 0.79f) + interpolation + 0.01f;
            } else {
                float f15 = hVar.f88582j + 0.79f;
                interpolation = f15 - (((1.0f - eVar.getInterpolation((f10 - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                interpolation2 = f15;
            }
            float f16 = (0.20999998f * f10) + f14;
            float f17 = (f10 + iVar.f88596g) * 216.0f;
            hVar.f88576d = interpolation;
            hVar.f88577e = interpolation2;
            hVar.f88578f = f16;
            iVar.f88594e = f17;
        }
    }

    public static void b(float f10, h hVar) {
        if (f10 <= 0.75f) {
            hVar.f88587o = hVar.f88580h[hVar.f88581i];
            return;
        }
        float f11 = (f10 - 0.75f) / 0.25f;
        int[] iArr = hVar.f88580h;
        int i10 = hVar.f88581i;
        int i11 = iArr[i10];
        int i12 = iArr[(i10 + 1) % iArr.length];
        hVar.f88587o = ((((i11 >> 24) & 255) + ((int) ((((i12 >> 24) & 255) - r1) * f11))) << 24) | ((((i11 >> 16) & 255) + ((int) ((((i12 >> 16) & 255) - r3) * f11))) << 16) | ((((i11 >> 8) & 255) + ((int) ((((i12 >> 8) & 255) - r4) * f11))) << 8) | ((i11 & 255) + ((int) (f11 * ((i12 & 255) - r2))));
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.f88594e, bounds.exactCenterX(), bounds.exactCenterY());
        h hVar = this.f88593c;
        Paint paint = hVar.f88574b;
        RectF rectF = hVar.f88573a;
        float f10 = hVar.f88585m;
        float fMin = (hVar.f88579g / 2.0f) + f10;
        if (f10 <= 0.0f) {
            fMin = (Math.min(bounds.width(), bounds.height()) / 2.0f) - (hVar.f88579g / 2.0f);
        }
        rectF.set(bounds.centerX() - fMin, bounds.centerY() - fMin, bounds.centerX() + fMin, bounds.centerY() + fMin);
        float f11 = hVar.f88576d;
        float f12 = hVar.f88578f;
        float f13 = (f11 + f12) * 360.0f;
        float f14 = ((hVar.f88577e + f12) * 360.0f) - f13;
        paint.setColor(hVar.f88587o);
        paint.setAlpha(hVar.f88586n);
        float f15 = hVar.f88579g / 2.0f;
        rectF.inset(f15, f15);
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, hVar.f88575c);
        float f16 = -f15;
        rectF.inset(f16, f16);
        canvas.drawArc(rectF, f13, f14, false, paint);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f88593c.f88586n;
    }

    public int getBackgroundColor() {
        return this.f88593c.f88575c.getColor();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public float getStrokeWidth() {
        return this.f88593c.f88579g;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f88595f.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f88593c.f88586n = i10;
        invalidateSelf();
    }

    public void setBackgroundColor(int i10) {
        this.f88593c.f88575c.setColor(i10);
        invalidateSelf();
    }

    public void setCenterRadius(float f10) {
        this.f88593c.f88585m = f10;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f88593c.f88574b.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public void setColorSchemeColors(int... iArr) {
        h hVar = this.f88593c;
        hVar.f88580h = iArr;
        hVar.a(0);
        hVar.a(0);
        invalidateSelf();
    }

    public void setStrokeCap(Paint.Cap cap) {
        this.f88593c.f88574b.setStrokeCap(cap);
        invalidateSelf();
    }

    public void setStrokeWidth(float f10) {
        h hVar = this.f88593c;
        hVar.f88579g = f10;
        hVar.f88574b.setStrokeWidth(f10);
        invalidateSelf();
    }

    public void setStyle(int i10) {
        Resources resources = this.f88592b;
        h hVar = this.f88593c;
        if (i10 == 0) {
            float f10 = resources.getDisplayMetrics().density;
            float f11 = 3.0f * f10;
            hVar.f88579g = f11;
            hVar.f88574b.setStrokeWidth(f11);
            hVar.f88585m = 11.0f * f10;
            hVar.a(0);
        } else {
            float f12 = resources.getDisplayMetrics().density;
            float f13 = 2.5f * f12;
            hVar.f88579g = f13;
            hVar.f88574b.setStrokeWidth(f13);
            hVar.f88585m = 7.5f * f12;
            hVar.a(0);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.f88595f.cancel();
        h hVar = this.f88593c;
        float f10 = hVar.f88576d;
        hVar.f88582j = f10;
        float f11 = hVar.f88577e;
        hVar.f88583k = f11;
        hVar.f88584l = hVar.f88578f;
        if (f11 != f10) {
            this.f88597h = true;
            this.f88595f.setDuration(666L);
            this.f88595f.start();
            return;
        }
        hVar.a(0);
        hVar.f88582j = 0.0f;
        hVar.f88583k = 0.0f;
        hVar.f88584l = 0.0f;
        hVar.f88576d = 0.0f;
        hVar.f88577e = 0.0f;
        hVar.f88578f = 0.0f;
        this.f88595f.setDuration(1332L);
        this.f88595f.start();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f88595f.cancel();
        this.f88594e = 0.0f;
        h hVar = this.f88593c;
        hVar.a(0);
        hVar.f88582j = 0.0f;
        hVar.f88583k = 0.0f;
        hVar.f88584l = 0.0f;
        hVar.f88576d = 0.0f;
        hVar.f88577e = 0.0f;
        hVar.f88578f = 0.0f;
        invalidateSelf();
    }
}
