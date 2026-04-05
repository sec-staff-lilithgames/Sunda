package androidx.fragment.app;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class a1 extends f.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ FragmentManager f6274d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(FragmentManager fragmentManager) {
        super(false);
        this.f6274d = fragmentManager;
    }

    @Override // f.x
    public void handleOnBackPressed() {
        FragmentManager fragmentManager = this.f6274d;
        fragmentManager.w(true);
        if (fragmentManager.f6227h.isEnabled()) {
            fragmentManager.popBackStackImmediate();
        } else {
            fragmentManager.f6226g.onBackPressed();
        }
    }
}
