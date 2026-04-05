package androidx.fragment.app;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class a0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Fragment f6273b;

    public a0(Fragment fragment) {
        this.f6273b = fragment;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f6273b.callStartTransitionListener(false);
    }
}
