package com.facebook.ads.redexgen.core;

import android.animation.Animator;

/* renamed from: com.facebook.ads.redexgen.X.e3, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1980e3 implements Animator.AnimatorListener {
    public final /* synthetic */ C1132Co A00;

    public C1980e3(C1132Co c1132Co) {
        this.A00 = c1132Co;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.A00.A07(false);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.A00.A01 = null;
        this.A00.A02 = EnumC1978e1.A02;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
