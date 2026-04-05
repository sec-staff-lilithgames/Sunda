package com.facebook.ads.redexgen.core;

import android.animation.Animator;

/* renamed from: com.facebook.ads.redexgen.X.eA, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1987eA implements Animator.AnimatorListener {
    public final /* synthetic */ CU A00;

    public C1987eA(CU cu2) {
        this.A00 = cu2;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.A00.A09(false);
        this.A00.A04();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.A00.A01 = EnumC1978e1.A04;
        XP.A0F(this.A00.A05);
        this.A00.A04();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
