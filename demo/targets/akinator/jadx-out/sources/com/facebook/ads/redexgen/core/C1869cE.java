package com.facebook.ads.redexgen.core;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: com.facebook.ads.redexgen.X.cE, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1869cE extends AnimatorListenerAdapter {
    public final /* synthetic */ C4Z A00;
    public final /* synthetic */ boolean A01;

    public C1869cE(C4Z c4z, boolean z10) {
        this.A00 = c4z;
        this.A01 = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.A00.A0H.setTranslationY(0.0f);
        this.A00.A0V();
        if (!this.A01 && this.A00.A0G != null) {
            this.A00.A0G.destroy();
        }
    }
}
