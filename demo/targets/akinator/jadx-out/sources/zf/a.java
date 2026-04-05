package zf;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.bottomappbar.BottomAppBar;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class a extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BottomAppBar f97934a;

    public a(BottomAppBar bottomAppBar) {
        this.f97934a = bottomAppBar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        BottomAppBar bottomAppBar = this.f97934a;
        if (bottomAppBar.f28965p0) {
            return;
        }
        bottomAppBar.C(bottomAppBar.f28953d0, bottomAppBar.f28966q0);
    }
}
