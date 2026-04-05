package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class y extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RecyclerView.n f7308a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f7309b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f7310c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e0 f7311d;

    public y(View view, ViewPropertyAnimator viewPropertyAnimator, e0 e0Var, RecyclerView.n nVar) {
        this.f7311d = e0Var;
        this.f7308a = nVar;
        this.f7309b = view;
        this.f7310c = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        this.f7309b.setAlpha(1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.f7310c.setListener(null);
        e0 e0Var = this.f7311d;
        RecyclerView.n nVar = this.f7308a;
        e0Var.dispatchAddFinished(nVar);
        e0Var.f7109o.remove(nVar);
        e0Var.c();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        this.f7311d.dispatchAddStarting(this.f7308a);
    }
}
