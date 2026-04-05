package e6;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.digidust.elokence.akinator.freemium.R;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class l extends AnimatorListenerAdapter implements g0 {

    /* renamed from: a, reason: collision with root package name */
    public final View f53832a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f53833b = false;

    public l(View view) {
        this.f53832a = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        b1.f53758a.setTransitionAlpha(this.f53832a, 1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        onAnimationEnd(animator, false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        View view = this.f53832a;
        if (view.hasOverlappingRendering() && view.getLayerType() == 0) {
            this.f53833b = true;
            view.setLayerType(2, null);
        }
    }

    @Override // e6.g0
    public /* bridge */ /* synthetic */ void onTransitionEnd(c0 c0Var, boolean z10) {
        super.onTransitionEnd(c0Var, z10);
    }

    @Override // e6.g0
    public void onTransitionPause(c0 c0Var) {
        View view = this.f53832a;
        view.setTag(R.id.transition_pause_alpha, Float.valueOf(view.getVisibility() == 0 ? b1.f53758a.getTransitionAlpha(view) : 0.0f));
    }

    @Override // e6.g0
    public void onTransitionResume(c0 c0Var) {
        this.f53832a.setTag(R.id.transition_pause_alpha, null);
    }

    @Override // e6.g0
    public void onTransitionStart(c0 c0Var) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator, boolean z10) {
        boolean z11 = this.f53833b;
        View view = this.f53832a;
        if (z11) {
            view.setLayerType(0, null);
        }
        if (z10) {
            return;
        }
        j1 j1Var = b1.f53758a;
        j1Var.setTransitionAlpha(view, 1.0f);
        j1Var.clearNonTransitionAlpha(view);
    }

    @Override // e6.g0
    public void onTransitionEnd(c0 c0Var) {
    }

    @Override // e6.g0
    public void onTransitionStart(c0 c0Var, boolean z10) {
    }

    @Override // e6.g0
    public void onTransitionCancel(c0 c0Var) {
    }
}
