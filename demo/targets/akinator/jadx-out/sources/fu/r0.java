package fu;

import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class r0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final Runnable f56087b;

    /* renamed from: c, reason: collision with root package name */
    public final u0 f56088c;

    /* renamed from: e, reason: collision with root package name */
    public final long f56089e;

    public r0(Runnable runnable, u0 u0Var, long j10) {
        this.f56087b = runnable;
        this.f56088c = u0Var;
        this.f56089e = j10;
    }

    @Override // java.lang.Runnable
    public void run() throws InterruptedException {
        if (this.f56088c.f56112f) {
            return;
        }
        long jNow = this.f56088c.now(TimeUnit.MILLISECONDS);
        long j10 = this.f56089e;
        if (j10 > jNow) {
            try {
                Thread.sleep(j10 - jNow);
            } catch (InterruptedException e10) {
                Thread.currentThread().interrupt();
                mu.a.onError(e10);
                return;
            }
        }
        if (this.f56088c.f56112f) {
            return;
        }
        this.f56087b.run();
    }
}
