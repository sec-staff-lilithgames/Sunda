package io.odeeo.internal.w1;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class n extends View {

    /* renamed from: q, reason: collision with root package name */
    public static final a f67454q = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public float f67455a;

    /* renamed from: b, reason: collision with root package name */
    public float f67456b;

    /* renamed from: c, reason: collision with root package name */
    public Paint f67457c;

    /* renamed from: d, reason: collision with root package name */
    public Paint f67458d;

    /* renamed from: e, reason: collision with root package name */
    public float f67459e;

    /* renamed from: f, reason: collision with root package name */
    public final m f67460f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f67461g;

    /* renamed from: h, reason: collision with root package name */
    public float f67462h;

    /* renamed from: i, reason: collision with root package name */
    public float f67463i;

    /* renamed from: j, reason: collision with root package name */
    public final Path f67464j;

    /* renamed from: k, reason: collision with root package name */
    public final RectF f67465k;

    /* renamed from: l, reason: collision with root package name */
    public final RectF f67466l;

    /* renamed from: m, reason: collision with root package name */
    public final RectF f67467m;

    /* renamed from: n, reason: collision with root package name */
    public final RectF f67468n;

    /* renamed from: o, reason: collision with root package name */
    public final b f67469o;

    /* renamed from: p, reason: collision with root package name */
    public long f67470p;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public float f67471a;

        public b(float f10) {
            this.f67471a = f10;
        }

        public static /* synthetic */ b copy$default(b bVar, float f10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f10 = bVar.f67471a;
            }
            return bVar.copy(f10);
        }

        public final float component1() {
            return this.f67471a;
        }

        public final b copy(float f10) {
            return new b(f10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && e0.areEqual((Object) Float.valueOf(this.f67471a), (Object) Float.valueOf(((b) obj).f67471a));
        }

        public final float getLocation() {
            return this.f67471a;
        }

        public int hashCode() {
            return Float.hashCode(this.f67471a);
        }

        public final void setLocation(float f10) {
            this.f67471a = f10;
        }

        public String toString() {
            return a.b.n(new StringBuilder("MutableDrawData(location="), this.f67471a, ')');
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c extends f0 implements kv.l {
        public c() {
            super(1);
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke(((Number) obj).floatValue());
            return x0.f87415a;
        }

        public final void invoke(float f10) {
            n.this.setCurrentProgress$odeeoSdk_release(f10);
            n.this.invalidate();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(Context context) {
        super(context);
        e0.checkNotNullParameter(context, "context");
        this.f67459e = 10.0f;
        this.f67460f = new m();
        this.f67463i = 1.0f;
        this.f67464j = new Path();
        this.f67465k = new RectF();
        this.f67466l = new RectF();
        this.f67467m = new RectF();
        this.f67468n = new RectF();
        this.f67469o = new b(0.0f);
        a(context);
    }

    public final void a(Context context) {
        Paint paint = new Paint(1);
        this.f67457c = paint;
        e0.checkNotNull(paint);
        paint.setColor(context.getResources().getColor(R.color.white));
        io.odeeo.internal.v1.k kVar = io.odeeo.internal.v1.k.f67283a;
        float deviceDensityPixelScale = kVar.getDeviceDensityPixelScale(context);
        this.f67463i = deviceDensityPixelScale;
        int iDensityPixelsToPixels = kVar.densityPixelsToPixels(deviceDensityPixelScale, (int) this.f67459e);
        Paint paint2 = this.f67457c;
        e0.checkNotNull(paint2);
        float f10 = iDensityPixelsToPixels;
        paint2.setStrokeWidth(f10);
        Paint paint3 = this.f67457c;
        e0.checkNotNull(paint3);
        Paint.Style style = Paint.Style.STROKE;
        paint3.setStyle(style);
        Paint paint4 = new Paint(1);
        this.f67458d = paint4;
        e0.checkNotNull(paint4);
        paint4.setStrokeWidth(f10);
        Paint paint5 = this.f67458d;
        e0.checkNotNull(paint5);
        paint5.setStyle(style);
        Paint paint6 = this.f67458d;
        e0.checkNotNull(paint6);
        paint6.setColor(context.getResources().getColor(R.color.black));
        Paint paint7 = this.f67458d;
        e0.checkNotNull(paint7);
        paint7.setAlpha(102);
    }

    public final void addArcToPath$odeeoSdk_release(Path path, float f10, RectF rect, float f11) {
        e0.checkNotNullParameter(path, "path");
        e0.checkNotNullParameter(rect, "rect");
        float f12 = 2;
        path.addArc(rect, f11, (this.f67469o.getLocation() / ((f10 * f12) + (this.f67462h * f12))) * 90);
    }

    public final void drawCenterline$odeeoSdk_release(float f10, Canvas canvas) {
        e0.checkNotNullParameter(canvas, "canvas");
        float f11 = 2;
        float f12 = f10 / f11;
        Path path = new Path();
        path.moveTo(getWidth() / 2.0f, f12);
        path.lineTo((getWidth() - this.f67462h) - f12, f12);
        this.f67465k.set((getWidth() - (this.f67462h * f11)) - f12, f12, getWidth() - f12, (this.f67462h * f11) + f12);
        path.addArc(this.f67465k, 270.0f, 90.0f);
        path.lineTo(getWidth() - f12, (getHeight() - this.f67462h) - f12);
        this.f67466l.set((getWidth() - (this.f67462h * f11)) - f12, (getHeight() - (this.f67462h * f11)) - f12, getWidth() - f12, getHeight() - f12);
        path.addArc(this.f67466l, 0.0f, 90.0f);
        path.lineTo(this.f67462h + f12, getHeight() - f12);
        RectF rectF = this.f67467m;
        float height = getHeight();
        float f13 = this.f67462h * f11;
        rectF.set(f12, (height - f13) - f12, f13 + f12, getHeight() - f12);
        path.addArc(this.f67467m, 90.0f, 90.0f);
        path.lineTo(f12, this.f67462h + f12);
        RectF rectF2 = this.f67468n;
        float f14 = (this.f67462h * f11) + f12;
        rectF2.set(f12, f12, f14, f14);
        path.addArc(this.f67468n, 180.0f, 90.0f);
        path.lineTo(getWidth() / 2.0f, f12);
        Paint paint = this.f67458d;
        e0.checkNotNull(paint);
        canvas.drawPath(path, paint);
    }

    public final void drawEnd$odeeoSdk_release(Path path, float f10, b data) {
        e0.checkNotNullParameter(path, "path");
        e0.checkNotNullParameter(data, "data");
        path.lineTo(this.f67462h + f10, getHeight() - f10);
        RectF rectF = this.f67467m;
        float height = getHeight();
        float f11 = 2;
        float f12 = this.f67462h * f11;
        rectF.set(f10, (height - f12) - f10, f12 + f10, getHeight() - f10);
        b bVar = this.f67469o;
        bVar.setLocation(bVar.getLocation() - ((getWidth() - this.f67462h) - f10));
        float f13 = f10 * f11;
        if (data.getLocation() < (this.f67462h * f11) + f13) {
            addArcToPath$odeeoSdk_release(path, f10, this.f67467m, 90.0f);
            return;
        }
        path.addArc(this.f67467m, 90.0f, 90.0f);
        data.setLocation(data.getLocation() - (this.f67462h + f10));
        float location = data.getLocation();
        float height2 = getHeight();
        float f14 = this.f67462h;
        if (location < (height2 - f14) - f10) {
            path.lineTo(f10, getHeight() - data.getLocation());
            return;
        }
        path.lineTo(f10, f14 + f10);
        RectF rectF2 = this.f67468n;
        float f15 = (this.f67462h * f11) + f10;
        rectF2.set(f10, f10, f15, f15);
        data.setLocation(data.getLocation() - ((getHeight() - this.f67462h) - f10));
        if (data.getLocation() < (this.f67462h * f11) + f13) {
            addArcToPath$odeeoSdk_release(path, f10, this.f67468n, 180.0f);
            return;
        }
        path.addArc(this.f67468n, 180.0f, 90.0f);
        data.setLocation(data.getLocation() - (this.f67462h + f10));
        if (data.getLocation() < (getWidth() - this.f67462h) - f10) {
            path.lineTo(data.getLocation(), f10);
        } else {
            path.lineTo(getWidth() / 2.0f, f10);
        }
    }

    public final void drawStart$odeeoSdk_release(Path path, float f10, b data, RectF rect) {
        e0.checkNotNullParameter(path, "path");
        e0.checkNotNullParameter(data, "data");
        e0.checkNotNullParameter(rect, "rect");
        path.addArc(rect, 270.0f, 90.0f);
        data.setLocation(data.getLocation() - (this.f67462h + f10));
        if (data.getLocation() < (getHeight() - this.f67462h) - f10) {
            path.lineTo(getWidth() - f10, data.getLocation());
            return;
        }
        path.lineTo(getWidth() - f10, (getHeight() - this.f67462h) - f10);
        float f11 = 2;
        this.f67466l.set((getWidth() - (this.f67462h * f11)) - f10, (getHeight() - (this.f67462h * f11)) - f10, getWidth() - f10, getHeight() - f10);
        data.setLocation(data.getLocation() - ((getHeight() - this.f67462h) - f10));
        if (data.getLocation() < (f11 * f10) + (this.f67462h * f11)) {
            addArcToPath$odeeoSdk_release(path, f10, this.f67466l, 0.0f);
            return;
        }
        path.addArc(this.f67466l, 0.0f, 90.0f);
        data.setLocation(data.getLocation() - (this.f67462h + f10));
        if (data.getLocation() < (getWidth() - this.f67462h) - f10) {
            path.lineTo(getWidth() - data.getLocation(), getHeight() - f10);
        } else {
            drawEnd$odeeoSdk_release(path, f10, data);
        }
    }

    public final float getCurrentProgress$odeeoSdk_release() {
        return this.f67456b;
    }

    public final double getProgress() {
        return this.f67455a;
    }

    public final float getRoundedCornersRadius$odeeoSdk_release() {
        return this.f67462h;
    }

    public final long getStartTime$odeeoSdk_release() {
        return this.f67470p;
    }

    public final float getWidthInDp$odeeoSdk_release() {
        return this.f67459e;
    }

    public final boolean isCenterline() {
        return this.f67461g;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        e0.checkNotNullParameter(canvas, "canvas");
        float fDensityPixelsToPixels = io.odeeo.internal.v1.k.f67283a.densityPixelsToPixels(this.f67463i, (int) this.f67459e);
        float height = (getHeight() * 2) + (getWidth() * 2) + this.f67462h;
        float f10 = 2;
        float f11 = fDensityPixelsToPixels / f10;
        if (this.f67461g) {
            drawCenterline$odeeoSdk_release(fDensityPixelsToPixels, canvas);
        }
        this.f67464j.reset();
        float f12 = (height / 100) * this.f67456b;
        this.f67469o.setLocation(getWidth() / 2.0f);
        this.f67464j.moveTo(this.f67469o.getLocation(), f11);
        b bVar = this.f67469o;
        bVar.setLocation(bVar.getLocation() + f12);
        if (this.f67469o.getLocation() < (getWidth() - this.f67462h) - f11) {
            this.f67464j.lineTo(this.f67469o.getLocation(), f11);
        } else {
            this.f67464j.lineTo((getWidth() - this.f67462h) - f11, f11);
            this.f67465k.set((getWidth() - (this.f67462h * f10)) - f11, f11, getWidth() - f11, (this.f67462h * f10) + f11);
            b bVar2 = this.f67469o;
            bVar2.setLocation(bVar2.getLocation() - ((getWidth() - this.f67462h) - f11));
            if (this.f67469o.getLocation() < (f10 * f11) + (this.f67462h * f10)) {
                addArcToPath$odeeoSdk_release(this.f67464j, f11, this.f67465k, 270.0f);
            } else {
                drawStart$odeeoSdk_release(this.f67464j, f11, this.f67469o, this.f67465k);
            }
        }
        Path path = this.f67464j;
        Paint paint = this.f67457c;
        e0.checkNotNull(paint);
        canvas.drawPath(path, paint);
    }

    public final void setCenterline(boolean z10) {
        this.f67461g = z10;
        invalidate();
    }

    public final void setColor(int i10) {
        Paint paint = this.f67457c;
        e0.checkNotNull(paint);
        paint.setColor(i10);
        invalidate();
    }

    public final void setCurrentProgress$odeeoSdk_release(float f10) {
        this.f67456b = f10;
    }

    public final void setProgress(float f10) {
        this.f67456b = f10;
        this.f67455a = f10;
        invalidate();
    }

    public final void setProgressAnimated(float f10, long j10) {
        this.f67460f.setSmoothProgress(f10, j10, new c());
        this.f67455a = f10;
    }

    public final void setRoundedCorners(float f10) {
        this.f67462h = io.odeeo.internal.v1.k.f67283a.densityPixelsToPixels(this.f67463i, (int) f10);
        invalidate();
    }

    public final void setRoundedCornersRadius$odeeoSdk_release(float f10) {
        this.f67462h = f10;
    }

    public final void setStartTime$odeeoSdk_release(long j10) {
        this.f67470p = j10;
    }

    public final void setWidthInDp(int i10) {
        float f10 = i10;
        this.f67459e = f10;
        int iDensityPixelsToPixels = io.odeeo.internal.v1.k.f67283a.densityPixelsToPixels(this.f67463i, (int) f10);
        Paint paint = this.f67458d;
        e0.checkNotNull(paint);
        float f11 = iDensityPixelsToPixels;
        paint.setStrokeWidth(f11);
        Paint paint2 = this.f67457c;
        e0.checkNotNull(paint2);
        paint2.setStrokeWidth(f11);
        invalidate();
    }

    public final void setWidthInDp$odeeoSdk_release(float f10) {
        this.f67459e = f10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        e0.checkNotNullParameter(context, "context");
        this.f67459e = 10.0f;
        this.f67460f = new m();
        this.f67463i = 1.0f;
        this.f67464j = new Path();
        this.f67465k = new RectF();
        this.f67466l = new RectF();
        this.f67467m = new RectF();
        this.f67468n = new RectF();
        this.f67469o = new b(0.0f);
        a(context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        e0.checkNotNullParameter(context, "context");
        this.f67459e = 10.0f;
        this.f67460f = new m();
        this.f67463i = 1.0f;
        this.f67464j = new Path();
        this.f67465k = new RectF();
        this.f67466l = new RectF();
        this.f67467m = new RectF();
        this.f67468n = new RectF();
        this.f67469o = new b(0.0f);
        a(context);
    }
}
