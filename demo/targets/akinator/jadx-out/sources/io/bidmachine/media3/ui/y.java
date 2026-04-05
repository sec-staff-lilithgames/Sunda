package io.bidmachine.media3.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class y extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a0 f61890a;

    public y(a0 a0Var) {
        this.f61890a = a0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup = this.f61890a.f61665f;
        if (viewGroup != null) {
            viewGroup.setVisibility(4);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        a0 a0Var = this.f61890a;
        ViewGroup viewGroup = a0Var.f61667h;
        if (viewGroup != null) {
            viewGroup.setVisibility(0);
            a0Var.f61667h.setTranslationX(r0.getWidth());
            ViewGroup viewGroup2 = a0Var.f61667h;
            viewGroup2.scrollTo(viewGroup2.getWidth(), 0);
        }
    }
}
