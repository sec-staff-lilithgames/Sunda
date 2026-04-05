package androidx.fragment.app;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class z extends i0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Fragment f6500a;

    public z(Fragment fragment) {
        this.f6500a = fragment;
    }

    @Override // androidx.fragment.app.i0
    public final void a() {
        Fragment fragment = this.f6500a;
        fragment.mSavedStateRegistryController.performAttach();
        androidx.lifecycle.t2.enableSavedStateHandles(fragment);
    }
}
