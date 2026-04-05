package xr;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class t6 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v6 f93010b;

    public t6(v6 v6Var) {
        this.f93010b = v6Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z10;
        synchronized (this.f93010b) {
            try {
                v6 v6Var = this.f93010b;
                v6Var.f93178g = null;
                int i10 = v6Var.f93176e;
                if (i10 == 2) {
                    v6Var.f93176e = 4;
                    v6Var.f93177f = v6Var.f93172a.schedule(v6Var.f93179h, v6Var.f93182k, TimeUnit.NANOSECONDS);
                    z10 = true;
                } else {
                    if (i10 == 3) {
                        ScheduledExecutorService scheduledExecutorService = v6Var.f93172a;
                        x6 x6Var = v6Var.f93180i;
                        long j10 = v6Var.f93181j;
                        mh.t2 t2Var = v6Var.f93173b;
                        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                        v6Var.f93178g = scheduledExecutorService.schedule(x6Var, j10 - t2Var.elapsed(timeUnit), timeUnit);
                        this.f93010b.f93176e = 2;
                    }
                    z10 = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z10) {
            this.f93010b.f93174c.ping();
        }
    }
}
