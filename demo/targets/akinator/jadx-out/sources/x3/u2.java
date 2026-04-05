package x3;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class u2 extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s2 f91685a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f91686b;

    public u2(View view, s2 s2Var) {
        this.f91685a = s2Var;
        this.f91686b = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        s2 s2Var = this.f91685a;
        s2Var.setFraction(1.0f);
        x2.a(this.f91686b, s2Var);
    }
}
