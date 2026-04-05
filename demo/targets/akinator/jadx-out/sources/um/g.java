package um;

import android.animation.Animator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class g implements Animator.AnimatorListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f88570a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f88571b;

    public g(i iVar, h hVar) {
        this.f88571b = iVar;
        this.f88570a = hVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
        i iVar = this.f88571b;
        h hVar = this.f88570a;
        i.a(iVar, 1.0f, hVar, true);
        hVar.f88582j = hVar.f88576d;
        hVar.f88583k = hVar.f88577e;
        hVar.f88584l = hVar.f88578f;
        hVar.a((hVar.f88581i + 1) % hVar.f88580h.length);
        if (!iVar.f88597h) {
            iVar.f88596g += 1.0f;
            return;
        }
        iVar.f88597h = false;
        animator.cancel();
        animator.setDuration(1332L);
        animator.start();
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        this.f88571b.f88596g = 0.0f;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
    }
}
