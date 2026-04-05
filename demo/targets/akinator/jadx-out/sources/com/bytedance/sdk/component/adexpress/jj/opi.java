package com.bytedance.sdk.component.adexpress.jj;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.view.animation.LinearInterpolator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class opi extends View {

    /* renamed from: cm, reason: collision with root package name */
    private ValueAnimator f18467cm;

    /* renamed from: jd, reason: collision with root package name */
    private float f18468jd;

    /* renamed from: jj, reason: collision with root package name */
    private long f18469jj;
    private float jpo;
    private Paint my;

    /* renamed from: qk, reason: collision with root package name */
    private float f18470qk;
    private ValueAnimator wqx;
    private float xyk;

    /* renamed from: yd, reason: collision with root package name */
    private int f18471yd;
    private Animator.AnimatorListener zz;

    public opi(Context context, int i10) {
        super(context);
        this.f18469jj = 300L;
        this.f18470qk = 0.0f;
        this.f18471yd = i10;
        jpo();
    }

    public void jd() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, this.xyk);
        this.wqx = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(this.f18469jj);
        this.wqx.setInterpolator(new LinearInterpolator());
        this.wqx.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.jj.opi.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                opi.this.f18470qk = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                opi.this.invalidate();
            }
        });
        this.wqx.start();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawCircle(this.jpo, this.f18468jd, this.f18470qk, this.my);
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.jpo = i10 / 2.0f;
        this.f18468jd = i11 / 2.0f;
        this.xyk = (float) (Math.hypot(i10, i11) / 2.0d);
    }

    public void setAnimationListener(Animator.AnimatorListener animatorListener) {
        this.zz = animatorListener;
    }

    public void wqx() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.xyk, 0.0f);
        this.f18467cm = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(this.f18469jj);
        this.f18467cm.setInterpolator(new LinearInterpolator());
        this.f18467cm.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.jj.opi.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                opi.this.f18470qk = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                opi.this.invalidate();
            }
        });
        Animator.AnimatorListener animatorListener = this.zz;
        if (animatorListener != null) {
            this.f18467cm.addListener(animatorListener);
        }
        this.f18467cm.start();
    }

    public void jpo() {
        Paint paint = new Paint(1);
        this.my = paint;
        paint.setStyle(Paint.Style.FILL);
        this.my.setColor(this.f18471yd);
    }
}
