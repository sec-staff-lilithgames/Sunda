package io.odeeo.internal.w1;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import java.util.ArrayList;
import kotlin.jvm.internal.e0;
import qv.v;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class g extends View {

    /* renamed from: a, reason: collision with root package name */
    public final Paint f67393a;

    /* renamed from: b, reason: collision with root package name */
    public final float f67394b;

    /* renamed from: c, reason: collision with root package name */
    public int f67395c;

    /* renamed from: d, reason: collision with root package name */
    public int f67396d;

    /* renamed from: e, reason: collision with root package name */
    public int f67397e;

    /* renamed from: f, reason: collision with root package name */
    public float f67398f;

    /* renamed from: g, reason: collision with root package name */
    public final RectF f67399g;

    /* renamed from: h, reason: collision with root package name */
    public final RectF f67400h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f67401i;

    /* renamed from: j, reason: collision with root package name */
    public final Handler f67402j;

    /* renamed from: k, reason: collision with root package name */
    public final int f67403k;

    /* renamed from: l, reason: collision with root package name */
    public long f67404l;

    /* renamed from: m, reason: collision with root package name */
    public a[] f67405m;

    /* renamed from: n, reason: collision with root package name */
    public final b f67406n;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class a {

        /* renamed from: a, reason: collision with root package name */
        public float f67407a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f67408b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ g f67409c;

        public a(g this$0) {
            e0.checkNotNullParameter(this$0, "this$0");
            this.f67409c = this$0;
            this.f67408b = true;
        }

        public final float getAnimationPercent() {
            return this.f67407a;
        }

        public final boolean isRising() {
            return this.f67408b;
        }

        public final void setAnimationPercent(float f10) {
            this.f67407a = f10;
        }

        public final void setRising(boolean z10) {
            this.f67408b = z10;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            g.this.invalidate();
            g.this.f67402j.postDelayed(this, 1000 / g.this.f67403k);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Context context) {
        super(context);
        e0.checkNotNullParameter(context, "context");
        Paint paint = new Paint();
        this.f67393a = paint;
        this.f67394b = io.odeeo.internal.v1.k.f67283a.getDeviceDensityPixelScale(context);
        this.f67395c = 6;
        this.f67396d = 6;
        this.f67397e = 36;
        this.f67398f = 1.0f;
        this.f67399g = new RectF();
        this.f67400h = new RectF();
        Handler handler = new Handler(Looper.getMainLooper());
        this.f67402j = handler;
        this.f67403k = 20;
        this.f67404l = System.currentTimeMillis();
        this.f67405m = new a[]{new a(this)};
        paint.setColor(-1);
        paint.setStrokeWidth(r1.densityPixelsToPixels(r6, this.f67395c));
        b bVar = new b();
        this.f67406n = bVar;
        handler.post(bVar);
    }

    public final float animateLine$odeeoSdk_release(a line, float f10) {
        e0.checkNotNullParameter(line, "line");
        line.setAnimationPercent(line.getAnimationPercent() + ((float) (((Math.pow(v.coerceIn(line.getAnimationPercent(), 0.1f, 0.9f) - 0.5d, 4.0d) * (-16)) + 1) * f10 * 1.7d * (line.isRising() ? 1.0d : -1.0d))));
        float f11 = this.f67405m.length == 7 ? -0.04f : 0.0f;
        if (line.isRising() && line.getAnimationPercent() >= 1.0f) {
            line.setRising(false);
            line.setAnimationPercent(1.0f - (line.getAnimationPercent() - 1.0f));
        } else if (!line.isRising() && line.getAnimationPercent() <= f11) {
            line.setRising(true);
            line.setAnimationPercent((f11 - line.getAnimationPercent()) + f11);
        }
        return v.coerceIn(line.getAnimationPercent(), 0.0f, 1.0f);
    }

    public final void drawLine$odeeoSdk_release(Canvas canvas, int i10, float f10) {
        e0.checkNotNullParameter(canvas, "canvas");
        io.odeeo.internal.v1.k kVar = io.odeeo.internal.v1.k.f67283a;
        float fDensityPixelsToPixels = kVar.densityPixelsToPixels(this.f67394b, this.f67395c);
        float fDensityPixelsToPixels2 = kVar.densityPixelsToPixels(this.f67394b, this.f67397e) * f10;
        float fDensityPixelsToPixels3 = kVar.densityPixelsToPixels(this.f67394b, this.f67396d);
        a[] aVarArr = this.f67405m;
        float width = (getWidth() / 2.0f) - ((((aVarArr.length - 1.0f) * fDensityPixelsToPixels3) + (aVarArr.length * fDensityPixelsToPixels)) / 2.0f);
        float height = (getHeight() / 2.0f) - (fDensityPixelsToPixels2 / 2.0f);
        float f11 = (fDensityPixelsToPixels3 + fDensityPixelsToPixels) * i10;
        float f12 = width + f11;
        float f13 = f12 + fDensityPixelsToPixels;
        float f14 = fDensityPixelsToPixels / 2.0f;
        float f15 = height - f14;
        float f16 = height + fDensityPixelsToPixels2;
        float f17 = f16 + f14;
        float f18 = 2;
        this.f67399g.set(f12, f15, f13, f15 + fDensityPixelsToPixels + f18);
        this.f67400h.set(f12, (f17 - fDensityPixelsToPixels) - f18, f13, f17);
        float f19 = width + f14 + f11;
        canvas.drawLine(f19, height, f19, f16, this.f67393a);
        canvas.drawArc(this.f67399g, 180.0f, 180.0f, true, this.f67393a);
        canvas.drawArc(this.f67400h, 0.0f, 180.0f, true, this.f67393a);
    }

    public final a[] getLines$odeeoSdk_release() {
        return this.f67405m;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f67402j.removeCallbacks(this.f67406n);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        e0.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        float fCoerceAtMost = v.coerceAtMost(r0 - this.f67404l, 50L) / 1000.0f;
        this.f67404l = System.currentTimeMillis();
        a[] aVarArr = this.f67405m;
        int length = aVarArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int i12 = i11 + 1;
            drawLine$odeeoSdk_release(canvas, i11, animateLine$odeeoSdk_release(aVarArr[i10], this.f67401i ? 0.0f : fCoerceAtMost));
            i10++;
            i11 = i12;
        }
    }

    public final void pause$odeeoSdk_release() {
        this.f67401i = true;
    }

    public final void resume$odeeoSdk_release() {
        this.f67401i = false;
    }

    public final void setColor(int i10) {
        this.f67393a.setColor(i10);
    }

    public final void setLength(int i10) {
        this.f67397e = i10;
    }

    public final void setLines(int i10) {
        Float fValueOf = Float.valueOf(0.7f);
        Float fValueOf2 = Float.valueOf(0.3f);
        Float fValueOf3 = Float.valueOf(0.0f);
        a[] aVarArr = new a[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            aVarArr[i11] = new a(this);
        }
        this.f67405m = aVarArr;
        if (i10 == 3) {
            Float[] fArr = {fValueOf3, Float.valueOf(0.8f), Float.valueOf(0.2f)};
            ArrayList arrayList = new ArrayList(3);
            for (int i12 = 0; i12 < 3; i12++) {
                float fFloatValue = fArr[i12].floatValue();
                a aVar = new a(this);
                aVar.setAnimationPercent(fFloatValue);
                arrayList.add(aVar);
            }
            Object[] array = arrayList.toArray(new a[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            this.f67405m = (a[]) array;
            return;
        }
        if (i10 != 7) {
            throw new IllegalArgumentException("Only 3 or 7 lines are supported");
        }
        Float[] fArr2 = {fValueOf3, fValueOf2, fValueOf, Float.valueOf(1.0f), fValueOf, fValueOf2, fValueOf3};
        ArrayList arrayList2 = new ArrayList(7);
        for (int i13 = 0; i13 < 7; i13++) {
            float fFloatValue2 = fArr2[i13].floatValue();
            a aVar2 = new a(this);
            aVar2.setAnimationPercent(fFloatValue2);
            arrayList2.add(aVar2);
        }
        Object[] array2 = arrayList2.toArray(new a[0]);
        if (array2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        this.f67405m = (a[]) array2;
    }

    public final void setLines$odeeoSdk_release(a[] aVarArr) {
        e0.checkNotNullParameter(aVarArr, "<set-?>");
        this.f67405m = aVarArr;
    }

    public final void setSpace(int i10) {
        this.f67396d = i10;
    }

    public final void setSpeed(float f10) {
        this.f67398f = f10;
    }

    public final void setWidth(int i10) {
        this.f67395c = i10;
        this.f67393a.setStrokeWidth(io.odeeo.internal.v1.k.f67283a.densityPixelsToPixels(this.f67394b, i10));
    }
}
