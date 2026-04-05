package com.fyber.inneractive.sdk.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class i implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ IAsmoothProgressBar f26746a;

    public i(IAsmoothProgressBar iAsmoothProgressBar) {
        this.f26746a = iAsmoothProgressBar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        super/*android.widget.ProgressBar*/.setSecondaryProgress(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
