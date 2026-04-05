package com.facebook.ads.redexgen.core;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: com.facebook.ads.redexgen.X.Pr, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1469Pr extends AnimatorListenerAdapter {
    public final /* synthetic */ View A00;
    public final /* synthetic */ ViewPropertyAnimator A01;
    public final /* synthetic */ C09876j A02;
    public final /* synthetic */ AbstractC1484Qg A03;

    public C1469Pr(C09876j c09876j, AbstractC1484Qg abstractC1484Qg, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.A02 = c09876j;
        this.A03 = abstractC1484Qg;
        this.A00 = view;
        this.A01 = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.A00.setAlpha(1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.A01.setListener(null);
        this.A02.A0T(this.A03);
        this.A02.A00.remove(this.A03);
        this.A02.A0b();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
