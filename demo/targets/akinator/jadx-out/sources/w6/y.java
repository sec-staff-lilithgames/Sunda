package w6;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class y implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final z f90437b;

    /* renamed from: c, reason: collision with root package name */
    public final Runnable f90438c;

    public y(z zVar, Runnable runnable) {
        this.f90437b = zVar;
        this.f90438c = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f90438c.run();
            synchronized (this.f90437b.f90442f) {
                this.f90437b.a();
            }
        } catch (Throwable th2) {
            synchronized (this.f90437b.f90442f) {
                this.f90437b.a();
                throw th2;
            }
        }
    }
}
