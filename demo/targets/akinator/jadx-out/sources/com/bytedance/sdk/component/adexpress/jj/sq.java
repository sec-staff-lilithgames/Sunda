package com.bytedance.sdk.component.adexpress.jj;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class sq extends View {

    /* renamed from: cm, reason: collision with root package name */
    private float f18486cm;

    /* renamed from: jd, reason: collision with root package name */
    private Paint f18487jd;

    /* renamed from: jj, reason: collision with root package name */
    private int f18488jj;
    private Context jpo;
    private ValueAnimator my;

    /* renamed from: qk, reason: collision with root package name */
    private boolean f18489qk;
    private RectF wqx;

    public sq(Context context) {
        super(context);
        this.f18488jj = 1500;
        this.jpo = context;
        Paint paint = new Paint();
        this.f18487jd = paint;
        paint.setAntiAlias(true);
        this.f18487jd.setStyle(Paint.Style.STROKE);
        this.f18487jd.setStrokeWidth(10.0f);
        this.f18487jd.setColor(Color.parseColor("#80FFFFFF"));
        this.wqx = new RectF();
    }

    public void jd() {
        ValueAnimator valueAnimator = this.my;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f18489qk) {
            return;
        }
        canvas.drawArc(this.wqx, 270.0f, this.f18486cm, false, this.f18487jd);
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        setMeasuredDimension(Math.min(size, size2), Math.min(size, size2));
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.wqx.set(5.0f, 5.0f, i10 - 5, i11 - 5);
    }

    public void setDuration(int i10) {
        this.f18488jj = i10;
    }

    public void wqx() {
        this.f18489qk = true;
        invalidate();
    }

    public void jpo() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 360.0f);
        this.my = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(this.f18488jj);
        this.my.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.jj.sq.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                sq.this.f18486cm = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sq.this.requestLayout();
            }
        });
        this.my.start();
    }
}
