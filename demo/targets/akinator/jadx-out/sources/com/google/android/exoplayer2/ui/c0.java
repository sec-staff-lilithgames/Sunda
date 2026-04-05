package com.google.android.exoplayer2.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class c0 extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l0 f28174a;

    public c0(l0 l0Var) {
        this.f28174a = l0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        l0 l0Var = this.f28174a;
        View view = l0Var.f28235b;
        if (view != null) {
            view.setVisibility(4);
        }
        ViewGroup viewGroup = l0Var.f28236c;
        if (viewGroup != null) {
            viewGroup.setVisibility(4);
        }
        ViewGroup viewGroup2 = l0Var.f28238e;
        if (viewGroup2 != null) {
            viewGroup2.setVisibility(4);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        l0 l0Var = this.f28174a;
        View view = l0Var.f28243j;
        if (!(view instanceof h) || l0Var.A) {
            return;
        }
        ((h) view).hideScrubber(250L);
    }
}
