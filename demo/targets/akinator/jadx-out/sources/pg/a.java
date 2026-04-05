package pg;

import android.animation.Animator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public Animator f81199a;

    public void cancelCurrent() {
        Animator animator = this.f81199a;
        if (animator != null) {
            animator.cancel();
        }
    }

    public void clear() {
        this.f81199a = null;
    }

    public void onNextAnimationStart(Animator animator) {
        cancelCurrent();
        this.f81199a = animator;
    }
}
