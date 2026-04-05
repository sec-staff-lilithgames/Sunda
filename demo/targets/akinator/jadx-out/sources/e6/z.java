package e6;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class z extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z.f f53896a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c0 f53897b;

    public z(c0 c0Var, z.f fVar) {
        this.f53897b = c0Var;
        this.f53896a = fVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.f53896a.remove(animator);
        this.f53897b.f53783z.remove(animator);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        this.f53897b.f53783z.add(animator);
    }
}
