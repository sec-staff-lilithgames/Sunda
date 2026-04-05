package io.bidmachine.media3.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class t extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f61874a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a0 f61875b;

    public t(a0 a0Var, k kVar) {
        this.f61875b = a0Var;
        this.f61874a = kVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        a0 a0Var = this.f61875b;
        a0Var.e(1);
        if (a0Var.B) {
            this.f61874a.post(a0Var.f61678s);
            a0Var.B = false;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        this.f61875b.e(3);
    }
}
