package hj;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class a0 extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f0 f58930a;

    public a0(f0 f0Var) {
        this.f58930a = f0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        f0 f0Var = this.f58930a;
        View view = f0Var.f58950g;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int height = view.getHeight();
        ValueAnimator duration = ValueAnimator.ofInt(height, 1).setDuration(f0Var.f58949f);
        duration.addListener(new c0(f0Var, layoutParams, height));
        duration.addUpdateListener(new d0(f0Var, layoutParams));
        duration.start();
    }
}
