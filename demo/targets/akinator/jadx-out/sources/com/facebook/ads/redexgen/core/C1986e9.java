package com.facebook.ads.redexgen.core;

import android.animation.Animator;

/* renamed from: com.facebook.ads.redexgen.X.e9, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1986e9 implements Animator.AnimatorListener {
    public final /* synthetic */ CU A00;

    public C1986e9(CU cu2) {
        this.A00 = cu2;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.A00.A08(false);
        this.A00.A04();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.A00.A00 = null;
        this.A00.A01 = EnumC1978e1.A02;
        this.A00.A04();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
