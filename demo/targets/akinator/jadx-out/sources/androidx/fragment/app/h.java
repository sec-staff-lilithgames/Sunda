package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class h implements Animation.AnimationListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a3 f6334b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f6335c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ View f6336e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n f6337f;

    public h(View view, ViewGroup viewGroup, n nVar, a3 a3Var) {
        this.f6334b = a3Var;
        this.f6335c = viewGroup;
        this.f6336e = view;
        this.f6337f = nVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(Animation animation) {
        this.f6335c.post(new g(this));
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v("FragmentManager", "Animation from operation " + this.f6334b + " has ended.");
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(Animation animation) {
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v("FragmentManager", "Animation from operation " + this.f6334b + " has reached onAnimationStart.");
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(Animation animation) {
    }
}
