package com.facebook.ads.redexgen.core;

import android.animation.ValueAnimator;

/* renamed from: com.facebook.ads.redexgen.X.b2, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1795b2 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ JU A00;

    public C1795b2(JU ju2) {
        this.A00 = ju2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Integer num = (Integer) valueAnimator.getAnimatedValue();
        this.A00.A0B.getLayoutParams().height = num.intValue();
        this.A00.A0B.requestLayout();
    }
}
