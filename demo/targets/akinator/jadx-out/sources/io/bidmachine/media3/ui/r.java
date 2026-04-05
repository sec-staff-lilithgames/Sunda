package io.bidmachine.media3.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class r extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a0 f61871a;

    public r(a0 a0Var) {
        this.f61871a = a0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        a0 a0Var = this.f61871a;
        View view = a0Var.f61661b;
        if (view != null) {
            view.setVisibility(4);
        }
        ViewGroup viewGroup = a0Var.f61662c;
        if (viewGroup != null) {
            viewGroup.setVisibility(4);
        }
        ViewGroup viewGroup2 = a0Var.f61664e;
        if (viewGroup2 != null) {
            viewGroup2.setVisibility(4);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        a0 a0Var = this.f61871a;
        View view = a0Var.f61669j;
        if (!(view instanceof e) || a0Var.A) {
            return;
        }
        ((e) view).hideScrubber(250L);
    }
}
