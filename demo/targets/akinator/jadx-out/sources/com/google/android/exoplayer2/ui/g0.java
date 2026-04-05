package com.google.android.exoplayer2.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class g0 extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u f28197a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l0 f28198b;

    public g0(l0 l0Var, u uVar) {
        this.f28198b = l0Var;
        this.f28197a = uVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        l0 l0Var = this.f28198b;
        l0Var.e(2);
        if (l0Var.B) {
            this.f28197a.post(l0Var.f28252s);
            l0Var.B = false;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        this.f28198b.e(3);
    }
}
