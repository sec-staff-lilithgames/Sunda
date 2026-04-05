package com.inmobi.media;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.animation.LinearInterpolator;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.d9, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2735d9 extends View {

    /* renamed from: a, reason: collision with root package name */
    public Bitmap f32766a;

    /* renamed from: b, reason: collision with root package name */
    public Canvas f32767b;

    /* renamed from: c, reason: collision with root package name */
    public RectF f32768c;

    /* renamed from: d, reason: collision with root package name */
    public RectF f32769d;

    /* renamed from: e, reason: collision with root package name */
    public final Rect f32770e;

    /* renamed from: f, reason: collision with root package name */
    public long f32771f;

    /* renamed from: g, reason: collision with root package name */
    public final Paint f32772g;

    /* renamed from: h, reason: collision with root package name */
    public final Paint f32773h;

    /* renamed from: i, reason: collision with root package name */
    public final Paint f32774i;

    /* renamed from: j, reason: collision with root package name */
    public final Paint f32775j;

    /* renamed from: k, reason: collision with root package name */
    public final Paint f32776k;

    /* renamed from: l, reason: collision with root package name */
    public float f32777l;

    /* renamed from: m, reason: collision with root package name */
    public long f32778m;

    /* renamed from: n, reason: collision with root package name */
    public ValueAnimator f32779n;

    /* renamed from: o, reason: collision with root package name */
    public InterfaceC2718c9 f32780o;

    public C2735d9(Context context) {
        super(context);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(-723724);
        this.f32772g = paint;
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        paint2.setColor(-16777216);
        paint2.setTextAlign(Paint.Align.CENTER);
        paint2.setAntiAlias(true);
        this.f32776k = paint2;
        this.f32770e = new Rect();
        Paint paint3 = new Paint();
        paint3.setAntiAlias(true);
        paint3.setColor(-16777216);
        this.f32773h = paint3;
        Paint paint4 = new Paint();
        paint4.setAntiAlias(true);
        paint4.setColor(0);
        paint4.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.f32774i = paint4;
        Paint paint5 = new Paint();
        paint5.setStyle(Paint.Style.STROKE);
        paint5.setAntiAlias(true);
        paint5.setColor(-16777216);
        this.f32775j = paint5;
    }

    public final void a() {
        InterfaceC2718c9 interfaceC2718c9 = this.f32780o;
        if (interfaceC2718c9 != null) {
            M8 m82 = (M8) interfaceC2718c9;
            H8 h82 = m82.f32028a.f32066p;
            if (h82 != null) {
                C2684a9 timerAsset = m82.f32029b;
                kotlin.jvm.internal.e0.checkNotNullParameter(timerAsset, "timerAsset");
                if (timerAsset.f33145j == 1) {
                    h82.f31843b.a();
                }
            }
        }
        ValueAnimator valueAnimator = this.f32779n;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f32779n = null;
    }

    public final void b() {
        ValueAnimator valueAnimator = this.f32779n;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            return;
        }
        this.f32778m = valueAnimator.getCurrentPlayTime();
        valueAnimator.cancel();
    }

    public final void c() {
        ValueAnimator valueAnimator = this.f32779n;
        if (valueAnimator == null || valueAnimator.isRunning()) {
            return;
        }
        valueAnimator.setCurrentPlayTime(this.f32778m);
        valueAnimator.start();
    }

    public final void d() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(TimeUnit.SECONDS.toMillis(this.f32771f));
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new C2701b9(this));
        this.f32779n = valueAnimatorOfFloat;
        valueAnimatorOfFloat.start();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        Canvas canvas3;
        kotlin.jvm.internal.e0.checkNotNullParameter(canvas, "canvas");
        Canvas canvas4 = this.f32767b;
        if (canvas4 != null) {
            canvas4.drawColor(0, PorterDuff.Mode.CLEAR);
        }
        int width = getWidth() / 2;
        int height = getHeight() / 2;
        int iMin = Math.min(width, height);
        C2696b4 c2696b4 = AbstractC2679a4.f32633a;
        int iB = (int) (AbstractC2679a4.b() * ((int) (getWidth() * 7.0f * 0.007f)));
        float f10 = width;
        float f11 = height;
        canvas.drawCircle(f10, f11, iMin, this.f32772g);
        canvas.drawCircle(f10, f11, iMin - iB, this.f32775j);
        ValueAnimator valueAnimator = this.f32779n;
        if (valueAnimator != null) {
            int currentPlayTime = (int) (this.f32771f - (valueAnimator.getCurrentPlayTime() / 1000));
            kotlin.jvm.internal.e0.checkNotNull(valueAnimator.getAnimatedValue(), "null cannot be cast to non-null type kotlin.Float");
            if (((Float) r4).floatValue() >= 1.0d) {
                currentPlayTime = 0;
            }
            Paint paint = this.f32776k;
            Rect rect = this.f32770e;
            String strValueOf = String.valueOf(currentPlayTime);
            paint.getTextBounds(strValueOf, 0, strValueOf.length(), rect);
            canvas.drawText(strValueOf, getWidth() / 2, (getHeight() / 2) + (((paint.descent() - paint.ascent()) / 2) - paint.descent()), paint);
            kotlin.jvm.internal.e0.checkNotNull(valueAnimator.getAnimatedValue(), "null cannot be cast to non-null type kotlin.Float");
            if (((Float) r0).floatValue() >= 1.0d) {
                a();
            }
        }
        float f12 = this.f32777l;
        if (f12 > 0.0f) {
            RectF rectF = this.f32768c;
            if (rectF != null && (canvas3 = this.f32767b) != null) {
                canvas3.drawArc(rectF, 270.0f, f12, true, this.f32773h);
            }
            RectF rectF2 = this.f32769d;
            if (rectF2 != null && (canvas2 = this.f32767b) != null) {
                canvas2.drawOval(rectF2, this.f32774i);
            }
        }
        Bitmap bitmap = this.f32766a;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i10);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        if (i10 != i12 || i11 != i13) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
            bitmapCreateBitmap.eraseColor(0);
            this.f32766a = bitmapCreateBitmap;
            this.f32767b = new Canvas(bitmapCreateBitmap);
        }
        super.onSizeChanged(i10, i11, i12, i13);
        C2696b4 c2696b4 = AbstractC2679a4.f32633a;
        float fB = (int) (AbstractC2679a4.b() * ((int) (getWidth() * 4.0f * 0.007f)));
        float fB2 = (int) (AbstractC2679a4.b() * ((int) (getWidth() * 14.0f * 0.007f)));
        float fB3 = (int) (AbstractC2679a4.b() * ((int) (getWidth() * 5.0f * 0.007f)));
        float fB4 = (int) (AbstractC2679a4.b() * ((int) (getWidth() * 1.5f * 0.007f)));
        RectF rectF = new RectF(fB3, fB3, getWidth() - fB3, getHeight() - fB3);
        this.f32768c = rectF;
        this.f32769d = new RectF(rectF.left + fB, rectF.top + fB, rectF.right - fB, rectF.bottom - fB);
        this.f32775j.setStrokeWidth(fB4);
        this.f32776k.setTextSize(fB2);
        invalidate();
    }

    public final void setTimerEventsListener(InterfaceC2718c9 interfaceC2718c9) {
        this.f32780o = interfaceC2718c9;
    }

    public final void setTimerValue(long j10) {
        this.f32771f = j10;
    }
}
