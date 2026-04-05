package xr;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class p implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f92862b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x f92863c;

    public p(x xVar, int i10) {
        this.f92863c = xVar;
        this.f92862b = i10;
    }

    @Override // java.lang.Runnable
    public void run() {
        x xVar = this.f92863c;
        if (xVar.f93224e.isClosed()) {
            return;
        }
        try {
            xVar.f93224e.request(this.f92862b);
        } catch (Throwable th2) {
            xVar.f93223c.deframeFailed(th2);
            xVar.f93224e.close();
        }
    }
}
