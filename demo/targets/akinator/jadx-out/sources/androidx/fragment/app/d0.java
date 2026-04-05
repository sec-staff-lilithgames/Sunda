package androidx.fragment.app;

import android.view.View;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class d0 implements androidx.lifecycle.v0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Fragment f6293b;

    public d0(Fragment fragment) {
        this.f6293b = fragment;
    }

    @Override // androidx.lifecycle.v0
    public void onStateChanged(androidx.lifecycle.b1 b1Var, androidx.lifecycle.i0 i0Var) {
        View view;
        if (i0Var != androidx.lifecycle.i0.ON_STOP || (view = this.f6293b.mView) == null) {
            return;
        }
        view.cancelPendingInputEvents();
    }
}
