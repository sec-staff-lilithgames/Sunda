package com.facebook.ads.redexgen.core;

import android.animation.ValueAnimator;

/* renamed from: com.facebook.ads.redexgen.X.bN, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1816bN implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ C1291Is A00;

    public C1816bN(C1291Is c1291Is) {
        this.A00 = c1291Is;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.A00.A0U.getLayoutParams().height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        this.A00.A0U.requestLayout();
    }
}
