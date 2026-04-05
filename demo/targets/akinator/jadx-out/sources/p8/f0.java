package p8;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class f0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final f9.j f80758b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k0 f80759c;

    public f0(k0 k0Var, f9.j jVar) {
        this.f80759c = k0Var;
        this.f80758b = jVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (((f9.k) this.f80758b).getLock()) {
            synchronized (this.f80759c) {
                try {
                    if (this.f80759c.f80779b.f80778b.contains(new i0(this.f80758b, j9.h.directExecutor()))) {
                        k0 k0Var = this.f80759c;
                        try {
                            ((f9.k) this.f80758b).onLoadFailed(k0Var.f80798v);
                        } catch (Throwable th2) {
                            throw new f(th2);
                        }
                    }
                    this.f80759c.b();
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }
}
