package io.bidmachine.media3.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class v extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f61879a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a0 f61880b;

    public v(a0 a0Var, k kVar) {
        this.f61880b = a0Var;
        this.f61879a = kVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        a0 a0Var = this.f61880b;
        a0Var.e(2);
        if (a0Var.B) {
            this.f61879a.post(a0Var.f61678s);
            a0Var.B = false;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        this.f61880b.e(3);
    }
}
