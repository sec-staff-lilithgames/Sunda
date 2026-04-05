package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class b0 extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c0 f7054a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f7055b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f7056c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e0 f7057d;

    public b0(e0 e0Var, c0 c0Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f7057d = e0Var;
        this.f7054a = c0Var;
        this.f7055b = viewPropertyAnimator;
        this.f7056c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.f7055b.setListener(null);
        View view = this.f7056c;
        view.setAlpha(1.0f);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        c0 c0Var = this.f7054a;
        RecyclerView.n nVar = c0Var.f7078b;
        e0 e0Var = this.f7057d;
        e0Var.dispatchChangeFinished(nVar, false);
        e0Var.f7112r.remove(c0Var.f7078b);
        e0Var.c();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        this.f7057d.dispatchChangeStarting(this.f7054a.f7078b, false);
    }
}
