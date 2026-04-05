package androidx.fragment.app;

import android.os.Bundle;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class f1 implements androidx.lifecycle.v0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f6310b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a2 f6311c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.k0 f6312e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ FragmentManager f6313f;

    public f1(FragmentManager fragmentManager, String str, a2 a2Var, androidx.lifecycle.k0 k0Var) {
        this.f6313f = fragmentManager;
        this.f6310b = str;
        this.f6311c = a2Var;
        this.f6312e = k0Var;
    }

    @Override // androidx.lifecycle.v0
    public void onStateChanged(androidx.lifecycle.b1 b1Var, androidx.lifecycle.i0 i0Var) {
        Bundle bundle;
        androidx.lifecycle.i0 i0Var2 = androidx.lifecycle.i0.ON_START;
        FragmentManager fragmentManager = this.f6313f;
        String str = this.f6310b;
        if (i0Var == i0Var2 && (bundle = (Bundle) fragmentManager.f6230k.get(str)) != null) {
            ((n1) this.f6311c).onFragmentResult(str, bundle);
            fragmentManager.clearFragmentResult(str);
        }
        if (i0Var == androidx.lifecycle.i0.ON_DESTROY) {
            this.f6312e.removeObserver(this);
            fragmentManager.f6231l.remove(str);
        }
    }
}
