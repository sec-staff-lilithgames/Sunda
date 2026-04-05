package androidx.fragment.app;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class y implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Fragment f6496b;

    public y(Fragment fragment) {
        this.f6496b = fragment;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f6496b.startPostponedEnterTransition();
    }
}
