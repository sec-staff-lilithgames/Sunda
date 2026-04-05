package androidx.fragment.app;

import android.os.Bundle;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class n1 implements a2 {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.lifecycle.k0 f6418a;

    /* renamed from: b, reason: collision with root package name */
    public final a2 f6419b;

    /* renamed from: c, reason: collision with root package name */
    public final f1 f6420c;

    public n1(androidx.lifecycle.k0 k0Var, a2 a2Var, f1 f1Var) {
        this.f6418a = k0Var;
        this.f6419b = a2Var;
        this.f6420c = f1Var;
    }

    public boolean isAtLeast(androidx.lifecycle.j0 j0Var) {
        return this.f6418a.getCurrentState().isAtLeast(j0Var);
    }

    @Override // androidx.fragment.app.a2
    public void onFragmentResult(String str, Bundle bundle) {
        ((n1) this.f6419b).onFragmentResult(str, bundle);
    }

    public void removeObserver() {
        this.f6418a.removeObserver(this.f6420c);
    }
}
