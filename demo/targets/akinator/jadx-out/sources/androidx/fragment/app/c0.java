package androidx.fragment.app;

import android.view.View;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class c0 extends p0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Fragment f6289b;

    public c0(Fragment fragment) {
        this.f6289b = fragment;
    }

    @Override // androidx.fragment.app.p0
    public View onFindViewById(int i10) {
        Fragment fragment = this.f6289b;
        View view = fragment.mView;
        if (view != null) {
            return view.findViewById(i10);
        }
        throw new IllegalStateException("Fragment " + fragment + " does not have a view");
    }

    @Override // androidx.fragment.app.p0
    public boolean onHasView() {
        return this.f6289b.mView != null;
    }
}
