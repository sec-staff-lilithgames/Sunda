package hj;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class c0 extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewGroup.LayoutParams f58939a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f58940b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f0 f58941c;

    public c0(f0 f0Var, ViewGroup.LayoutParams layoutParams, int i10) {
        this.f58941c = f0Var;
        this.f58939a = layoutParams;
        this.f58940b = i10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        f0 f0Var = this.f58941c;
        ((l) f0Var.f58951h).onDismiss(f0Var.f58950g, f0Var.f58957n);
        f0Var.f58950g.setAlpha(1.0f);
        f0Var.f58950g.setTranslationX(0.0f);
        int i10 = this.f58940b;
        ViewGroup.LayoutParams layoutParams = this.f58939a;
        layoutParams.height = i10;
        f0Var.f58950g.setLayoutParams(layoutParams);
    }
}
