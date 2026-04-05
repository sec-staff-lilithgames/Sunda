package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class x extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RecyclerView.n f7303a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f7304b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f7305c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e0 f7306d;

    public x(View view, ViewPropertyAnimator viewPropertyAnimator, e0 e0Var, RecyclerView.n nVar) {
        this.f7306d = e0Var;
        this.f7303a = nVar;
        this.f7304b = viewPropertyAnimator;
        this.f7305c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.f7304b.setListener(null);
        this.f7305c.setAlpha(1.0f);
        e0 e0Var = this.f7306d;
        RecyclerView.n nVar = this.f7303a;
        e0Var.dispatchRemoveFinished(nVar);
        e0Var.f7111q.remove(nVar);
        e0Var.c();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        this.f7306d.dispatchRemoveStarting(this.f7303a);
    }
}
