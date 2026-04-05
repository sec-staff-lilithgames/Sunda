package com.facebook.ads.redexgen.core;

import android.animation.Animator;

/* renamed from: com.facebook.ads.redexgen.X.e4, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1981e4 implements Animator.AnimatorListener {
    public final /* synthetic */ C1132Co A00;

    public C1981e4(C1132Co c1132Co) {
        this.A00 = c1132Co;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.A00.A08(false);
        if (this.A00.A01 != null) {
            this.A00.A01.removeAllListeners();
            this.A00.A01 = null;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.A00.A02 = EnumC1978e1.A04;
        XP.A0F(this.A00.A05);
        if (this.A00.A01 != null) {
            this.A00.A01.removeAllListeners();
            this.A00.A01 = null;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
