package sg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class m extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f85765a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f85766b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n f85767c;

    public m(n nVar, boolean z10, int i10) {
        this.f85767c = nVar;
        this.f85765a = z10;
        this.f85766b = i10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        n nVar = this.f85767c;
        nVar.f85744b.setTranslationX(0.0f);
        nVar.updateBackProgress(0.0f, this.f85765a, this.f85766b);
    }
}
