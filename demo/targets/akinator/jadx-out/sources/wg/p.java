package wg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class p extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t f90603a;

    public p(t tVar) {
        this.f90603a = tVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        t tVar = this.f90603a;
        tVar.f90610c.setVisibility(8);
        if (!tVar.f90608a.b()) {
            tVar.f90608a.clearFocusAndHideKeyboard();
        }
        tVar.f90608a.setTransitionState(m.f90594c);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        this.f90603a.f90608a.setTransitionState(m.f90593b);
    }
}
