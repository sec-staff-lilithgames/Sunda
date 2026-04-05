package com.facebook.ads.redexgen.core;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: com.facebook.ads.redexgen.X.dp, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1966dp extends AnimatorListenerAdapter {
    public final /* synthetic */ C08982y A00;

    public C1966dp(C08982y c08982y) {
        this.A00 = c08982y;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.A00.A00.A04.postDelayed(new D5(this), 2000L);
    }
}
