package gh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import hg.j;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class f extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f57696a;

    public f(j jVar) {
        this.f57696a = jVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        j jVar = this.f57696a;
        hg.i revealInfo = jVar.getRevealInfo();
        revealInfo.f58778c = Float.MAX_VALUE;
        jVar.setRevealInfo(revealInfo);
    }
}
