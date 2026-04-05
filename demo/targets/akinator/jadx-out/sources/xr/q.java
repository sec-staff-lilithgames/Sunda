package xr;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class q implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ab f92909b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x f92910c;

    public q(x xVar, ab abVar) {
        this.f92910c = xVar;
        this.f92909b = abVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        x xVar = this.f92910c;
        try {
            xVar.f93224e.deframe(this.f92909b);
        } catch (Throwable th2) {
            xVar.f93223c.deframeFailed(th2);
            xVar.f93224e.close();
        }
    }
}
