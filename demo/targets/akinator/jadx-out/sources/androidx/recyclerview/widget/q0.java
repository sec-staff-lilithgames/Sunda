package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class q0 extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public boolean f7219a = false;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s0 f7220b;

    public q0(s0 s0Var) {
        this.f7220b = s0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        this.f7219a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        if (this.f7219a) {
            this.f7219a = false;
            return;
        }
        s0 s0Var = this.f7220b;
        if (((Float) s0Var.f7265z.getAnimatedValue()).floatValue() == 0.0f) {
            s0Var.A = 0;
            s0Var.d(0);
        } else {
            s0Var.A = 2;
            s0Var.f7258s.invalidate();
        }
    }
}
