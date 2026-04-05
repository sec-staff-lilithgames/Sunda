package com.fyber.inneractive.sdk.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ProgressBar;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class IAsmoothProgressBar extends ProgressBar {

    /* renamed from: c, reason: collision with root package name */
    public static final AccelerateDecelerateInterpolator f26720c = new AccelerateDecelerateInterpolator();

    /* renamed from: a, reason: collision with root package name */
    public ValueAnimator f26721a;

    /* renamed from: b, reason: collision with root package name */
    public ValueAnimator f26722b;

    public IAsmoothProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.f26721a;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.f26722b;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
    }

    @Override // android.widget.ProgressBar
    public synchronized void setProgress(int i10) {
        try {
            ValueAnimator valueAnimator = this.f26721a;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator valueAnimator2 = this.f26721a;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(getProgress(), i10);
                this.f26721a = valueAnimatorOfInt;
                valueAnimatorOfInt.setInterpolator(f26720c);
                this.f26721a.addUpdateListener(new h(this));
            } else {
                valueAnimator2.setIntValues(getProgress(), i10);
            }
            this.f26721a.start();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.widget.ProgressBar
    public synchronized void setSecondaryProgress(int i10) {
        try {
            ValueAnimator valueAnimator = this.f26722b;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator valueAnimator2 = this.f26722b;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(getProgress(), i10);
                this.f26722b = valueAnimatorOfInt;
                valueAnimatorOfInt.setInterpolator(f26720c);
                this.f26722b.addUpdateListener(new i(this));
            } else {
                valueAnimator2.setIntValues(getProgress(), i10);
            }
            this.f26722b.start();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public IAsmoothProgressBar(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }
}
