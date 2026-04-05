package com.facebook.ads.redexgen.core;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: com.facebook.ads.redexgen.X.bO, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1817bO extends AnimatorListenerAdapter {
    public final /* synthetic */ C1291Is A00;
    public final /* synthetic */ boolean A01;

    public C1817bO(C1291Is c1291Is, boolean z10) {
        this.A00 = c1291Is;
        this.A01 = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.A00.A0q(this.A00.A0D, true);
        if (!this.A01 && this.A00.A08 != null) {
            this.A00.A08.destroy();
        }
    }
}
