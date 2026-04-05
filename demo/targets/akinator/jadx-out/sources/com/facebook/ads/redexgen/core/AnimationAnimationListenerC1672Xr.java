package com.facebook.ads.redexgen.core;

import android.view.animation.Animation;

/* renamed from: com.facebook.ads.redexgen.X.Xr, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class AnimationAnimationListenerC1672Xr implements Animation.AnimationListener {
    public final /* synthetic */ C6H A00;

    public AnimationAnimationListenerC1672Xr(C6H c6h) {
        this.A00 = c6h;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.A00.A06();
        if (this.A00.A04 > 0) {
            this.A00.A05.postDelayed(this.A00.A07, this.A00.A04);
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
