package androidx.fragment.app;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class e1 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FragmentManager f6301b;

    public e1(FragmentManager fragmentManager) {
        this.f6301b = fragmentManager;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f6301b.w(true);
    }
}
