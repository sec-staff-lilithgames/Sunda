package xr;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class j9 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ScheduledExecutorService f92706b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Runnable f92707c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l9 f92708e;

    public j9(l9 l9Var, ScheduledExecutorService scheduledExecutorService, Runnable runnable) {
        this.f92708e = l9Var;
        this.f92706b = scheduledExecutorService;
        this.f92707c = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        l9 l9Var = this.f92708e;
        if (!l9Var.f92766g) {
            this.f92707c.run();
            l9Var.f92762c = null;
        } else {
            if (l9Var.f92767h) {
                return;
            }
            l9Var.f92762c = this.f92706b.schedule(l9Var.f92763d, l9Var.f92765f - ((i9) l9Var.f92761b).nanoTime(), TimeUnit.NANOSECONDS);
            l9Var.f92766g = false;
        }
    }
}
