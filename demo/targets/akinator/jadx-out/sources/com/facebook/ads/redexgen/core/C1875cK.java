package com.facebook.ads.redexgen.core;

import android.animation.ValueAnimator;

/* renamed from: com.facebook.ads.redexgen.X.cK, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1875cK implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ C4K A00;

    public C1875cK(C4K c4k) {
        this.A00 = c4k;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Integer num = (Integer) valueAnimator.getAnimatedValue();
        this.A00.A0X.getLayoutParams().height = num.intValue();
        this.A00.A0X.requestLayout();
    }
}
