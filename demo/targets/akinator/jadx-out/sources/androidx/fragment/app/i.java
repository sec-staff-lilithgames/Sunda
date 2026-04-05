package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class i implements t3.f {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f6379b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f6380c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n f6381e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ a3 f6382f;

    public i(View view, ViewGroup viewGroup, n nVar, a3 a3Var) {
        this.f6379b = view;
        this.f6380c = viewGroup;
        this.f6381e = nVar;
        this.f6382f = a3Var;
    }

    @Override // t3.f
    public void onCancel() {
        View view = this.f6379b;
        view.clearAnimation();
        this.f6380c.endViewTransition(view);
        this.f6381e.a();
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v("FragmentManager", "Animation from operation " + this.f6382f + " has been cancelled.");
        }
    }
}
