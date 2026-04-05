package e6;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import com.digidust.elokence.akinator.freemium.R;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class m1 extends AnimatorListenerAdapter implements g0 {

    /* renamed from: a, reason: collision with root package name */
    public final ViewGroup f53847a;

    /* renamed from: b, reason: collision with root package name */
    public final View f53848b;

    /* renamed from: c, reason: collision with root package name */
    public final View f53849c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f53850d = true;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o1 f53851e;

    public m1(o1 o1Var, ViewGroup viewGroup, View view, View view2) {
        this.f53851e = o1Var;
        this.f53847a = viewGroup;
        this.f53848b = view;
        this.f53849c = view2;
    }

    public final void a() {
        this.f53849c.setTag(R.id.save_overlay_view, null);
        this.f53847a.getOverlay().remove(this.f53848b);
        this.f53850d = false;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        a();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public void onAnimationPause(Animator animator) {
        this.f53847a.getOverlay().remove(this.f53848b);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public void onAnimationResume(Animator animator) {
        View view = this.f53848b;
        if (view.getParent() == null) {
            this.f53847a.getOverlay().add(view);
        } else {
            this.f53851e.cancel();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator, boolean z10) {
        if (z10) {
            View view = this.f53849c;
            View view2 = this.f53848b;
            view.setTag(R.id.save_overlay_view, view2);
            this.f53847a.getOverlay().add(view2);
            this.f53850d = true;
        }
    }

    @Override // e6.g0
    public void onTransitionCancel(c0 c0Var) {
        if (this.f53850d) {
            a();
        }
    }

    @Override // e6.g0
    public /* bridge */ /* synthetic */ void onTransitionEnd(c0 c0Var, boolean z10) {
        super.onTransitionEnd(c0Var, z10);
    }

    @Override // e6.g0
    public /* bridge */ /* synthetic */ void onTransitionStart(c0 c0Var, boolean z10) {
        super.onTransitionStart(c0Var, z10);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator, boolean z10) {
        if (z10) {
            return;
        }
        a();
    }

    @Override // e6.g0
    public void onTransitionEnd(c0 c0Var) {
        c0Var.removeListener(this);
    }

    @Override // e6.g0
    public void onTransitionStart(c0 c0Var) {
    }

    @Override // e6.g0
    public void onTransitionPause(c0 c0Var) {
    }

    @Override // e6.g0
    public void onTransitionResume(c0 c0Var) {
    }
}
