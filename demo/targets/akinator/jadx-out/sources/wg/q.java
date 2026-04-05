package wg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.search.SearchView;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class q extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t f90604a;

    public q(t tVar) {
        this.f90604a = tVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        t tVar = this.f90604a;
        SearchView searchView = tVar.f90608a;
        SearchView searchView2 = tVar.f90608a;
        if (!searchView.b() && searchView2.A) {
            searchView2.requestFocusAndShowKeyboard();
        }
        searchView2.setTransitionState(m.f90596f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        t tVar = this.f90604a;
        tVar.f90610c.setVisibility(0);
        tVar.f90608a.setTransitionState(m.f90595e);
    }
}
