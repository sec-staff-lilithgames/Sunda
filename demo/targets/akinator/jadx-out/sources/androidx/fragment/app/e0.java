package androidx.fragment.app;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class e0 implements t.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Fragment f6300b;

    public e0(Fragment fragment) {
        this.f6300b = fragment;
    }

    @Override // t.a, jd.j
    public i.g apply(Void r32) {
        Fragment fragment = this.f6300b;
        Object obj = fragment.mHost;
        return obj instanceof i.j ? ((i.j) obj).getActivityResultRegistry() : fragment.requireActivity().getActivityResultRegistry();
    }
}
