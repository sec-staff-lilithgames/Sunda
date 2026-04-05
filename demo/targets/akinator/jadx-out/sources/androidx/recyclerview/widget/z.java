package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class z extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RecyclerView.n f7326a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7327b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f7328c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7329d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f7330e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e0 f7331f;

    public z(e0 e0Var, RecyclerView.n nVar, int i10, View view, int i11, ViewPropertyAnimator viewPropertyAnimator) {
        this.f7331f = e0Var;
        this.f7326a = nVar;
        this.f7327b = i10;
        this.f7328c = view;
        this.f7329d = i11;
        this.f7330e = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        int i10 = this.f7327b;
        View view = this.f7328c;
        if (i10 != 0) {
            view.setTranslationX(0.0f);
        }
        if (this.f7329d != 0) {
            view.setTranslationY(0.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.f7330e.setListener(null);
        e0 e0Var = this.f7331f;
        RecyclerView.n nVar = this.f7326a;
        e0Var.dispatchMoveFinished(nVar);
        e0Var.f7110p.remove(nVar);
        e0Var.c();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        this.f7331f.dispatchMoveStarting(this.f7326a);
    }
}
