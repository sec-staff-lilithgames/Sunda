package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class e extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f6295a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f6296b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f6297c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a3 f6298d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n f6299e;

    public e(ViewGroup viewGroup, View view, boolean z10, a3 a3Var, n nVar) {
        this.f6295a = viewGroup;
        this.f6296b = view;
        this.f6297c = z10;
        this.f6298d = a3Var;
        this.f6299e = nVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup = this.f6295a;
        View view = this.f6296b;
        viewGroup.endViewTransition(view);
        boolean z10 = this.f6297c;
        a3 a3Var = this.f6298d;
        if (z10) {
            a3Var.getFinalState().a(view);
        }
        this.f6299e.a();
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v("FragmentManager", "Animator from operation " + a3Var + " has ended.");
        }
    }
}
