package androidx.fragment.app;

import android.animation.Animator;
import android.util.Log;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class f implements t3.f {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Animator f6307b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a3 f6308c;

    public f(Animator animator, a3 a3Var) {
        this.f6307b = animator;
        this.f6308c = a3Var;
    }

    @Override // t3.f
    public void onCancel() {
        this.f6307b.end();
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v("FragmentManager", "Animator from operation " + this.f6308c + " has been canceled.");
        }
    }
}
