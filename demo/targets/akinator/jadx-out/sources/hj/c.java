package hj;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Application;
import android.view.View;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class c extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f58937a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Application f58938b;

    public c(View view, Application application) {
        this.f58937a = view;
        this.f58938b = application;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.f58937a.animate().translationX(0.0f).translationY(0.0f).alpha(1.0f).setDuration(this.f58938b.getResources().getInteger(R.integer.config_longAnimTime)).setListener(null);
    }
}
