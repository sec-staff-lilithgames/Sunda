package io.bidmachine.media3.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class s extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a0 f61873a;

    public s(a0 a0Var) {
        this.f61873a = a0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        a0 a0Var = this.f61873a;
        View view = a0Var.f61661b;
        if (view != null) {
            view.setVisibility(0);
        }
        ViewGroup viewGroup = a0Var.f61662c;
        if (viewGroup != null) {
            viewGroup.setVisibility(0);
        }
        ViewGroup viewGroup2 = a0Var.f61664e;
        if (viewGroup2 != null) {
            viewGroup2.setVisibility(a0Var.A ? 0 : 4);
        }
        View view2 = a0Var.f61669j;
        if (!(view2 instanceof e) || a0Var.A) {
            return;
        }
        ((e) view2).showScrubber(250L);
    }
}
