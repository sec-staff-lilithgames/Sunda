package com.bytedance.sdk.openadsdk.core.jj;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RotateDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jj extends FrameLayout {

    /* renamed from: cm, reason: collision with root package name */
    private Drawable f20456cm;

    /* renamed from: jd, reason: collision with root package name */
    private int f20457jd;

    /* renamed from: jj, reason: collision with root package name */
    private boolean f20458jj;
    private int jpo;
    private Drawable my;

    /* renamed from: qk, reason: collision with root package name */
    private ValueAnimator f20459qk;
    private Drawable wqx;
    private boolean xyk;

    public jj(Context context) {
        super(context);
        this.jpo = 100;
    }

    private void jpo() {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 10000);
        this.f20459qk = valueAnimatorOfInt;
        valueAnimatorOfInt.setDuration(2000L);
        this.f20459qk.setRepeatCount(-1);
        this.f20459qk.setInterpolator(new LinearInterpolator());
        this.f20459qk.setRepeatMode(1);
        this.f20459qk.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.core.jj.jj.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                jj.this.setProgress(((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        });
        this.f20459qk.start();
        setMax(10000);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f20458jj = true;
        if (this.my != null) {
            jpo();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f20458jj = false;
        ValueAnimator valueAnimator = this.f20459qk;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f20459qk.removeAllUpdateListeners();
            this.f20459qk = null;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        if (i10 != 0) {
            ValueAnimator valueAnimator = this.f20459qk;
            if (valueAnimator == null || this.xyk) {
                return;
            }
            this.xyk = true;
            valueAnimator.pause();
            return;
        }
        if (this.xyk) {
            this.xyk = false;
            ValueAnimator valueAnimator2 = this.f20459qk;
            if (valueAnimator2 != null) {
                valueAnimator2.resume();
            } else {
                jpo();
            }
        }
    }

    public void setIndeterminateDrawable(Drawable drawable) {
        this.my = drawable;
        setProgressDrawable(drawable);
        if (this.f20458jj && this.f20459qk == null) {
            jpo();
        }
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(zz.jpo(this, layoutParams));
    }

    public void setMax(int i10) {
        this.jpo = i10;
    }

    @Override // android.view.View
    public void setPadding(int i10, int i11, int i12, int i13) {
        super.setPaddingRelative(i10, i11, i12, i13);
    }

    public void setProgress(int i10) {
        this.f20457jd = i10;
        Drawable drawable = this.wqx;
        if (drawable != null) {
            drawable.setLevel((int) ((i10 * 10000.0f) / this.jpo));
        }
    }

    public void setProgressDrawable(Drawable drawable) {
        this.f20456cm = drawable;
        setBackground(drawable);
        Drawable drawable2 = this.f20456cm;
        if (drawable2 instanceof LayerDrawable) {
            int numberOfLayers = ((LayerDrawable) drawable2).getNumberOfLayers();
            for (int i10 = 0; i10 < numberOfLayers; i10++) {
                Drawable drawable3 = ((LayerDrawable) this.f20456cm).getDrawable(i10);
                if ((drawable3 instanceof ScaleDrawable) || (drawable3 instanceof ClipDrawable)) {
                    this.wqx = drawable3;
                }
            }
        }
        Drawable drawable4 = this.f20456cm;
        if (drawable4 instanceof RotateDrawable) {
            this.wqx = drawable4;
        }
    }

    public jj(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.jpo = 100;
    }
}
