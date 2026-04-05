package com.bytedance.sdk.component.adexpress.jj;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.PathInterpolator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class dt extends View {
    private static int wqx = 50;

    /* renamed from: cm, reason: collision with root package name */
    private ObjectAnimator f18425cm;

    /* renamed from: jd, reason: collision with root package name */
    private int f18426jd;
    private Paint jpo;

    public dt(Context context) {
        this(context, null);
    }

    private void wqx() {
        Paint paint = new Paint();
        this.jpo = paint;
        paint.setAntiAlias(true);
        this.jpo.setColor(Color.parseColor("#FFFFFFFF"));
        this.jpo.setStyle(Paint.Style.STROKE);
        this.jpo.setStrokeWidth(18.0f);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "alpha", 1.0f, 0.0f);
        this.f18425cm = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(200L);
    }

    @Override // android.view.View
    public void invalidate() {
        if (hasWindowFocus()) {
            super.invalidate();
        }
    }

    public void jd() {
        clearAnimation();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        this.jpo.setShader(new LinearGradient(getMeasuredWidth() / 2, 0.0f, getMeasuredWidth() / 2, getMeasuredHeight(), -1, 16777215, Shader.TileMode.CLAMP));
        canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, this.f18426jd, this.jpo);
    }

    public dt(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public dt(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f18426jd = 10;
        wqx();
    }

    public void jpo() {
        int iMin = ((int) Math.min(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f)) - 18;
        wqx = iMin;
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(10, iMin);
        valueAnimatorOfInt.setInterpolator(new PathInterpolator(0.0f, 0.2f, 0.3f, 1.0f));
        valueAnimatorOfInt.setDuration(800L);
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.jj.dt.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                dt.this.f18426jd = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                dt.this.invalidate();
            }
        });
        valueAnimatorOfInt.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.jj.dt.2
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                dt.this.f18425cm.start();
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                dt.this.setVisibility(0);
                dt.this.setAlpha(1.0f);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }
        });
        valueAnimatorOfInt.start();
    }
}
