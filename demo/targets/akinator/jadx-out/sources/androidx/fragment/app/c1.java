package androidx.fragment.app;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class c1 extends s0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FragmentManager f6290b;

    public c1(FragmentManager fragmentManager) {
        this.f6290b = fragmentManager;
    }

    @Override // androidx.fragment.app.s0
    public Fragment instantiate(ClassLoader classLoader, String str) {
        FragmentManager fragmentManager = this.f6290b;
        return fragmentManager.getHost().instantiate(fragmentManager.getHost().f6461c, str, null);
    }
}
