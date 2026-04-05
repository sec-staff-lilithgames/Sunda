package com.google.android.exoplayer2.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class j0 extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l0 f28226a;

    public j0(l0 l0Var) {
        this.f28226a = l0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup = this.f28226a.f28239f;
        if (viewGroup != null) {
            viewGroup.setVisibility(4);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        l0 l0Var = this.f28226a;
        ViewGroup viewGroup = l0Var.f28241h;
        if (viewGroup != null) {
            viewGroup.setVisibility(0);
            l0Var.f28241h.setTranslationX(r0.getWidth());
            ViewGroup viewGroup2 = l0Var.f28241h;
            viewGroup2.scrollTo(viewGroup2.getWidth(), 0);
        }
    }
}
