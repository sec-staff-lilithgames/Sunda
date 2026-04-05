package fu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class y extends a implements Runnable {
    public y(Runnable runnable) {
        super(runnable);
    }

    @Override // fu.a, ou.a
    public /* bridge */ /* synthetic */ Runnable getWrappedRunnable() {
        return super.getWrappedRunnable();
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f55998c = Thread.currentThread();
        try {
            this.f55997b.run();
            this.f55998c = null;
        } catch (Throwable th2) {
            this.f55998c = null;
            lazySet(a.f55995e);
            mu.a.onError(th2);
        }
    }
}
