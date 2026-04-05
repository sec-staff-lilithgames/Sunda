package wg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.View;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class b extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f90577a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AnimatorSet f90578b;

    public b(View view, AnimatorSet animatorSet) {
        this.f90577a = view;
        this.f90578b = animatorSet;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.f90577a.setVisibility(8);
        this.f90578b.start();
    }
}
