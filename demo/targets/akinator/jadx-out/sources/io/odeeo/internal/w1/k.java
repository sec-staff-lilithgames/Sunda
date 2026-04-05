package io.odeeo.internal.w1;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.ImageView;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class k extends ImageView {

    /* renamed from: a, reason: collision with root package name */
    public int f67444a;

    /* renamed from: b, reason: collision with root package name */
    public int f67445b;

    /* renamed from: c, reason: collision with root package name */
    public int f67446c;

    /* renamed from: d, reason: collision with root package name */
    public Path f67447d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public k(Context context) {
        this(context, null, 0, 6, null);
        e0.checkNotNullParameter(context, "context");
    }

    public final void a() {
        this.f67446c = 0;
    }

    public final void clipCanvas$odeeoSdk_release(Canvas canvas) {
        e0.checkNotNullParameter(canvas, "canvas");
        canvas.save();
        canvas.clipPath(this.f67447d);
    }

    public final Path getPath$odeeoSdk_release() {
        return this.f67447d;
    }

    public final int getRadius$odeeoSdk_release() {
        return this.f67446c;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        e0.checkNotNullParameter(canvas, "canvas");
        clipCanvas$odeeoSdk_release(canvas);
        super.onDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f67444a = i10;
        this.f67445b = i11;
        updatePath$odeeoSdk_release();
    }

    public final void setPath$odeeoSdk_release(Path path) {
        e0.checkNotNullParameter(path, "<set-?>");
        this.f67447d = path;
    }

    public final void setRadius(int i10) {
        io.odeeo.internal.v1.k kVar = io.odeeo.internal.v1.k.f67283a;
        Context context = getContext();
        e0.checkNotNullExpressionValue(context, "context");
        this.f67446c = kVar.densityPixelsToPixels(kVar.getDeviceDensityPixelScale(context), i10);
        invalidate();
    }

    public final void setRadius$odeeoSdk_release(int i10) {
        this.f67446c = i10;
    }

    public final void updatePath$odeeoSdk_release() {
        this.f67447d.reset();
        Path path = this.f67447d;
        RectF rectF = new RectF(0.0f, 0.0f, this.f67444a, this.f67445b);
        float f10 = this.f67446c;
        path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public k(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        e0.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ k(Context context, AttributeSet attributeSet, int i10, int i11, u uVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        e0.checkNotNullParameter(context, "context");
        this.f67447d = new Path();
        a();
    }
}
