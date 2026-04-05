package md;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class z implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final Runnable f74341b;

    public z(Runnable runnable) {
        this.f74341b = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f74341b.run();
        } catch (Exception e10) {
            rd.a.e("Executor", "Background execution failure.", e10);
        }
    }
}
