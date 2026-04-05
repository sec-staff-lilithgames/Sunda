package e6;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class l1 extends AnimatorListenerAdapter implements g0 {

    /* renamed from: a, reason: collision with root package name */
    public final View f53836a;

    /* renamed from: b, reason: collision with root package name */
    public final int f53837b;

    /* renamed from: c, reason: collision with root package name */
    public final ViewGroup f53838c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f53840e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f53841f = false;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f53839d = true;

    public l1(View view, int i10) {
        this.f53836a = view;
        this.f53837b = i10;
        this.f53838c = (ViewGroup) view.getParent();
        a(true);
    }

    public final void a(boolean z10) {
        ViewGroup viewGroup;
        if (!this.f53839d || this.f53840e == z10 || (viewGroup = this.f53838c) == null) {
            return;
        }
        this.f53840e = z10;
        x.c(viewGroup, z10);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        this.f53841f = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        if (!this.f53841f) {
            b1.b(this.f53836a, this.f53837b);
            ViewGroup viewGroup = this.f53838c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        a(false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
    }

    @Override // e6.g0
    public /* bridge */ /* synthetic */ void onTransitionEnd(c0 c0Var, boolean z10) {
        super.onTransitionEnd(c0Var, z10);
    }

    @Override // e6.g0
    public void onTransitionPause(c0 c0Var) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        a(false);
        if (this.f53841f) {
            return;
        }
        b1.b(this.f53836a, this.f53837b);
    }

    @Override // e6.g0
    public void onTransitionResume(c0 c0Var) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        a(true);
        if (this.f53841f) {
            return;
        }
        b1.b(this.f53836a, 0);
    }

    @Override // e6.g0
    public /* bridge */ /* synthetic */ void onTransitionStart(c0 c0Var, boolean z10) {
        super.onTransitionStart(c0Var, z10);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator, boolean z10) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        if (z10) {
            b1.b(this.f53836a, 0);
            ViewGroup viewGroup = this.f53838c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
    }

    @Override // e6.g0
    public void onTransitionEnd(c0 c0Var) {
        c0Var.removeListener(this);
    }

    @Override // e6.g0
    public void onTransitionStart(c0 c0Var) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator, boolean z10) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        if (z10) {
            return;
        }
        if (!this.f53841f) {
            b1.b(this.f53836a, this.f53837b);
            ViewGroup viewGroup = this.f53838c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        a(false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
    }

    @Override // e6.g0
    public void onTransitionCancel(c0 c0Var) {
    }
}
