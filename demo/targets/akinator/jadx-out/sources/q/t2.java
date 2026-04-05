package q;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewPropertyAnimator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class t2 extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public boolean f82254a = false;

    /* renamed from: b, reason: collision with root package name */
    public int f82255b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.widget.k f82256c;

    public t2(androidx.appcompat.widget.k kVar) {
        this.f82256c = kVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        this.f82254a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        if (this.f82254a) {
            return;
        }
        androidx.appcompat.widget.k kVar = this.f82256c;
        kVar.f5161l = null;
        kVar.setVisibility(this.f82255b);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        this.f82256c.setVisibility(0);
        this.f82254a = false;
    }

    public t2 withFinalVisibility(ViewPropertyAnimator viewPropertyAnimator, int i10) {
        this.f82255b = i10;
        this.f82256c.f5161l = viewPropertyAnimator;
        return this;
    }
}
