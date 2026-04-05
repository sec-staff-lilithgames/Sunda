package zf;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class j extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BottomAppBar f97950a;

    public j(BottomAppBar bottomAppBar) {
        this.f97950a = bottomAppBar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        BottomAppBar bottomAppBar = this.f97950a;
        bottomAppBar.f28971v0.onAnimationStart(animator);
        View viewY = bottomAppBar.y();
        FloatingActionButton floatingActionButton = viewY instanceof FloatingActionButton ? (FloatingActionButton) viewY : null;
        if (floatingActionButton != null) {
            floatingActionButton.setTranslationX(bottomAppBar.getFabTranslationX());
        }
    }
}
