package yq;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import dq.g0;
import dq.v;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class f extends View implements dq.j, g0 {

    /* renamed from: b, reason: collision with root package name */
    public final Paint f94811b;

    /* renamed from: c, reason: collision with root package name */
    public float f94812c;

    /* renamed from: e, reason: collision with root package name */
    public int f94813e;

    /* renamed from: f, reason: collision with root package name */
    public int f94814f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Context context) {
        super(context);
        e0.checkNotNullParameter(context, "context");
        this.f94811b = new Paint(1);
        this.f94813e = v.f52537c;
    }

    @Override // dq.j
    public void a(br.o appearanceParams) {
        e0.checkNotNullParameter(appearanceParams, "appearanceParams");
        Integer fillColor = appearanceParams.getFillColor();
        if (fillColor != null) {
            this.f94814f = fillColor.intValue();
        }
        Integer strokeColor = appearanceParams.getStrokeColor();
        if (strokeColor != null) {
            this.f94813e = strokeColor.intValue();
        }
    }

    public final int getLineBackgroundColor() {
        return this.f94814f;
    }

    public final int getLineColor() {
        return this.f94813e;
    }

    public final Paint getLinePaint() {
        return this.f94811b;
    }

    public final float getPercent() {
        return this.f94812c;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        e0.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
        float measuredHeight = (getMeasuredHeight() / 2.0f) + getPaddingTop();
        int i10 = this.f94814f;
        Paint paint = this.f94811b;
        paint.setColor(i10);
        canvas.drawLine(getPaddingLeft(), measuredHeight, getPaddingLeft() + width, measuredHeight, paint);
        paint.setColor(this.f94813e);
        canvas.drawLine(getPaddingLeft(), measuredHeight, getPaddingLeft() + ((width * this.f94812c) / 100), measuredHeight, paint);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f94811b.setStrokeWidth(getMeasuredHeight());
    }

    public final void setLineBackgroundColor(int i10) {
        this.f94814f = i10;
    }

    public final void setLineColor(int i10) {
        this.f94813e = i10;
    }

    public final void setPercent(float f10) {
        this.f94812c = f10;
    }

    @Override // dq.g0
    public void a(long j10, long j11, float f10) {
        this.f94812c = f10;
        postInvalidate();
    }

    public static /* synthetic */ void getLineBackgroundColor$annotations() {
    }

    public static /* synthetic */ void getLineColor$annotations() {
    }

    public static /* synthetic */ void getLinePaint$annotations() {
    }

    public static /* synthetic */ void getPercent$annotations() {
    }
}
