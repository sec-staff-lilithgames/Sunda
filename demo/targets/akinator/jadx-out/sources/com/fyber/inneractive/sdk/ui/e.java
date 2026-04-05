package com.fyber.inneractive.sdk.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class e extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FyberAdIdentifierLocal f26742a;

    public e(FyberAdIdentifierLocal fyberAdIdentifierLocal) {
        this.f26742a = fyberAdIdentifierLocal;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        FyberAdIdentifierLocal fyberAdIdentifierLocal = this.f26742a;
        fyberAdIdentifierLocal.f26714p = null;
        fyberAdIdentifierLocal.f26713o = !fyberAdIdentifierLocal.f26713o;
    }
}
