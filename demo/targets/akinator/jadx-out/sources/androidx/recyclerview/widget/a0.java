package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class a0 extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c0 f7042a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f7043b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f7044c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e0 f7045d;

    public a0(e0 e0Var, c0 c0Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f7045d = e0Var;
        this.f7042a = c0Var;
        this.f7043b = viewPropertyAnimator;
        this.f7044c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.f7043b.setListener(null);
        View view = this.f7044c;
        view.setAlpha(1.0f);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        c0 c0Var = this.f7042a;
        RecyclerView.n nVar = c0Var.f7077a;
        e0 e0Var = this.f7045d;
        e0Var.dispatchChangeFinished(nVar, true);
        e0Var.f7112r.remove(c0Var.f7077a);
        e0Var.c();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        this.f7045d.dispatchChangeStarting(this.f7042a.f7077a, true);
    }
}
