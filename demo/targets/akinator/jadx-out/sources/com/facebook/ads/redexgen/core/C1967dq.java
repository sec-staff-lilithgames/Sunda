package com.facebook.ads.redexgen.core;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: com.facebook.ads.redexgen.X.dq, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1967dq extends AnimatorListenerAdapter {
    public final /* synthetic */ D4 A00;

    public C1967dq(D4 d42) {
        this.A00 = d42;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.A00.A00.setVisibility(8);
    }
}
