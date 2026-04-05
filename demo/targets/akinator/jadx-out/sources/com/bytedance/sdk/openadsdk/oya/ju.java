package com.bytedance.sdk.openadsdk.oya;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class ju extends View {

    /* renamed from: jd, reason: collision with root package name */
    private float f21419jd;
    private final Paint jpo;
    private float wqx;

    public ju(Context context) {
        super(context);
        setBackgroundColor(Color.parseColor("#8A8A8A"));
        Paint paint = new Paint();
        this.jpo = paint;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeCap(Paint.Cap.ROUND);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f10 = this.wqx;
        if (f10 > 0.0f) {
            float f11 = this.f21419jd;
            canvas.drawLine(0.0f, f11, f10, f11, this.jpo);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        float f10 = i11;
        this.f21419jd = (1.0f * f10) / 2.0f;
        this.jpo.setStrokeWidth(f10);
    }

    public void setProgress(float f10) {
        this.wqx = getWidth() * f10;
        invalidate();
    }
}
