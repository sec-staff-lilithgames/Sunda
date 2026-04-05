package com.facebook.ads.redexgen.core;

import android.view.animation.Animation;

/* renamed from: com.facebook.ads.redexgen.X.Xs, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class AnimationAnimationListenerC1673Xs implements Animation.AnimationListener {
    public final /* synthetic */ C6H A00;

    public AnimationAnimationListenerC1673Xs(C6H c6h) {
        this.A00 = c6h;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        ((OD) this.A00).A07.finish(16);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
