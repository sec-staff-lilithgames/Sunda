package com.facebook.ads.redexgen.core;

import android.animation.ValueAnimator;

/* renamed from: com.facebook.ads.redexgen.X.cD, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1868cD implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ C4Z A00;

    public C1868cD(C4Z c4z) {
        this.A00 = c4z;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Integer num = (Integer) valueAnimator.getAnimatedValue();
        this.A00.A0b.getLayoutParams().height = num.intValue();
        this.A00.A0b.requestLayout();
    }
}
