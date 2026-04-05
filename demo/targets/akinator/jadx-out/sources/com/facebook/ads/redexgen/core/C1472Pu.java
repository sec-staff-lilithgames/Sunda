package com.facebook.ads.redexgen.core;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: com.facebook.ads.redexgen.X.Pu, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1472Pu extends AnimatorListenerAdapter {
    public final /* synthetic */ View A00;
    public final /* synthetic */ ViewPropertyAnimator A01;
    public final /* synthetic */ C1473Pv A02;
    public final /* synthetic */ C09876j A03;

    public C1472Pu(C09876j c09876j, C1473Pv c1473Pv, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.A03 = c09876j;
        this.A02 = c1473Pv;
        this.A01 = viewPropertyAnimator;
        this.A00 = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.A01.setListener(null);
        this.A00.setAlpha(1.0f);
        this.A00.setTranslationX(0.0f);
        this.A00.setTranslationY(0.0f);
        this.A03.A0W(this.A02.A04, false);
        this.A03.A02.remove(this.A02.A04);
        this.A03.A0b();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
