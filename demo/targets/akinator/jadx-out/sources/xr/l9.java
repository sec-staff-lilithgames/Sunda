package xr;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class l9 {

    /* renamed from: i, reason: collision with root package name */
    public static final i9 f92759i = new i9();

    /* renamed from: a, reason: collision with root package name */
    public final long f92760a;

    /* renamed from: b, reason: collision with root package name */
    public final k9 f92761b;

    /* renamed from: c, reason: collision with root package name */
    public ScheduledFuture f92762c;

    /* renamed from: d, reason: collision with root package name */
    public x6 f92763d;

    /* renamed from: e, reason: collision with root package name */
    public ScheduledExecutorService f92764e;

    /* renamed from: f, reason: collision with root package name */
    public long f92765f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f92766g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f92767h;

    public l9(long j10) {
        this(j10, f92759i);
    }

    public void onTransportActive() {
        this.f92767h = true;
        this.f92766g = true;
    }

    public void onTransportIdle() {
        this.f92767h = false;
        ScheduledFuture scheduledFuture = this.f92762c;
        if (scheduledFuture == null) {
            return;
        }
        boolean zIsDone = scheduledFuture.isDone();
        long j10 = this.f92760a;
        if (!zIsDone) {
            this.f92765f = ((i9) this.f92761b).nanoTime() + j10;
        } else {
            this.f92766g = false;
            this.f92762c = this.f92764e.schedule(this.f92763d, j10, TimeUnit.NANOSECONDS);
        }
    }

    public void onTransportTermination() {
        ScheduledFuture scheduledFuture = this.f92762c;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            this.f92762c = null;
        }
    }

    public void start(Runnable runnable, ScheduledExecutorService scheduledExecutorService) {
        this.f92764e = scheduledExecutorService;
        long jNanoTime = ((i9) this.f92761b).nanoTime();
        long j10 = this.f92760a;
        this.f92765f = jNanoTime + j10;
        x6 x6Var = new x6(new j9(this, scheduledExecutorService, runnable));
        this.f92763d = x6Var;
        this.f92762c = scheduledExecutorService.schedule(x6Var, j10, TimeUnit.NANOSECONDS);
    }

    public l9(long j10, k9 k9Var) {
        this.f92760a = j10;
        this.f92761b = k9Var;
    }
}
