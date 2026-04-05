package p8;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class g0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final f9.j f80769b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k0 f80770c;

    public g0(k0 k0Var, f9.j jVar) {
        this.f80770c = k0Var;
        this.f80769b = jVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (((f9.k) this.f80769b).getLock()) {
            synchronized (this.f80770c) {
                try {
                    if (this.f80770c.f80779b.f80778b.contains(new i0(this.f80769b, j9.h.directExecutor()))) {
                        this.f80770c.f80800x.a();
                        k0 k0Var = this.f80770c;
                        try {
                            ((f9.k) this.f80769b).onResourceReady(k0Var.f80800x, k0Var.f80796t, k0Var.A);
                            this.f80770c.f(this.f80769b);
                        } catch (Throwable th2) {
                            throw new f(th2);
                        }
                    }
                    this.f80770c.b();
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }
}
