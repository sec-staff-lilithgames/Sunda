package wg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.search.SearchBar;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class f extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SearchBar f90583a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.google.android.material.search.c f90584b;

    public f(com.google.android.material.search.c cVar, SearchBar searchBar) {
        this.f90584b = cVar;
        this.f90583a = searchBar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.f90583a.setVisibility(0);
        this.f90584b.f29361g = false;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        this.f90583a.stopOnLoadAnimation();
    }
}
