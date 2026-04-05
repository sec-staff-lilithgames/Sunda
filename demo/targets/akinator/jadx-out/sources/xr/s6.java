package xr;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class s6 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v6 f92982b;

    public s6(v6 v6Var) {
        this.f92982b = v6Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        v6 v6Var;
        boolean z10;
        synchronized (this.f92982b) {
            try {
                v6Var = this.f92982b;
                if (v6Var.f93176e != 6) {
                    v6Var.f93176e = 6;
                    z10 = true;
                } else {
                    z10 = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z10) {
            v6Var.f93174c.onPingTimeout();
        }
    }
}
