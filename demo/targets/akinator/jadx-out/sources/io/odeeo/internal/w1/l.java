package io.odeeo.internal.w1;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.webkit.WebView;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class l extends WebView {

    /* renamed from: a, reason: collision with root package name */
    public int f67448a;

    /* renamed from: b, reason: collision with root package name */
    public int f67449b;

    /* renamed from: c, reason: collision with root package name */
    public int f67450c;

    /* renamed from: d, reason: collision with root package name */
    public final Path f67451d;

    /* renamed from: e, reason: collision with root package name */
    public final Paint f67452e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Context context) {
        super(context);
        e0.checkNotNullParameter(context, "context");
        this.f67451d = new Path();
        Paint paint = new Paint();
        paint.setColor(0);
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.f67452e = paint;
        a();
    }

    public final void a() {
        this.f67450c = 0;
    }

    public final int getRadius$odeeoSdk_release() {
        return this.f67450c;
    }

    @Override // android.webkit.WebView, android.view.View
    public void onDraw(Canvas canvas) {
        e0.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        canvas.drawPath(this.f67451d, this.f67452e);
    }

    @Override // android.webkit.WebView, android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f67448a = i10;
        this.f67449b = i11;
        updatePath$odeeoSdk_release();
    }

    public final void setRadius(int i10) {
        io.odeeo.internal.v1.k kVar = io.odeeo.internal.v1.k.f67283a;
        Context context = getContext();
        e0.checkNotNullExpressionValue(context, "context");
        this.f67450c = kVar.densityPixelsToPixels(kVar.getDeviceDensityPixelScale(context), i10);
        invalidate();
    }

    public final void setRadius$odeeoSdk_release(int i10) {
        this.f67450c = i10;
    }

    public final void updatePath$odeeoSdk_release() {
        this.f67451d.reset();
        this.f67451d.setFillType(Path.FillType.INVERSE_WINDING);
        Path path = this.f67451d;
        RectF rectF = new RectF(0.0f, getScrollY(), this.f67448a, getScrollY() + this.f67449b);
        float f10 = this.f67450c;
        path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
    }
}
