package xr;

import androidx.core.app.NotificationCompat;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class v6 {

    /* renamed from: l, reason: collision with root package name */
    public static final long f93170l = TimeUnit.SECONDS.toNanos(10);

    /* renamed from: m, reason: collision with root package name */
    public static final long f93171m = TimeUnit.MILLISECONDS.toNanos(10);

    /* renamed from: a, reason: collision with root package name */
    public final ScheduledExecutorService f93172a;

    /* renamed from: b, reason: collision with root package name */
    public final mh.t2 f93173b;

    /* renamed from: c, reason: collision with root package name */
    public final w6 f93174c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f93175d;

    /* renamed from: e, reason: collision with root package name */
    public int f93176e;

    /* renamed from: f, reason: collision with root package name */
    public ScheduledFuture f93177f;

    /* renamed from: g, reason: collision with root package name */
    public ScheduledFuture f93178g;

    /* renamed from: h, reason: collision with root package name */
    public final x6 f93179h;

    /* renamed from: i, reason: collision with root package name */
    public final x6 f93180i;

    /* renamed from: j, reason: collision with root package name */
    public final long f93181j;

    /* renamed from: k, reason: collision with root package name */
    public final long f93182k;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a implements w6 {

        /* renamed from: a, reason: collision with root package name */
        public final a2 f93183a;

        public a(a2 a2Var) {
            this.f93183a = a2Var;
        }

        @Override // xr.w6
        public void onPingTimeout() {
            this.f93183a.shutdownNow(wr.m6.f91047o.withDescription("Keepalive failed. The connection is likely gone"));
        }

        @Override // xr.w6
        public void ping() {
            this.f93183a.ping(new u6(this), sh.w1.directExecutor());
        }
    }

    public v6(w6 w6Var, ScheduledExecutorService scheduledExecutorService, long j10, long j11, boolean z10) {
        mh.t2 t2VarCreateUnstarted = mh.t2.createUnstarted();
        this.f93176e = 1;
        this.f93179h = new x6(new s6(this));
        this.f93180i = new x6(new t6(this));
        this.f93174c = (w6) mh.p1.checkNotNull(w6Var, "keepAlivePinger");
        this.f93172a = (ScheduledExecutorService) mh.p1.checkNotNull(scheduledExecutorService, "scheduler");
        this.f93173b = (mh.t2) mh.p1.checkNotNull(t2VarCreateUnstarted, NotificationCompat.CATEGORY_STOPWATCH);
        this.f93181j = j10;
        this.f93182k = j11;
        this.f93175d = z10;
        t2VarCreateUnstarted.reset().start();
    }

    public static long clampKeepAliveTimeInNanos(long j10) {
        return Math.max(j10, f93170l);
    }

    public static long clampKeepAliveTimeoutInNanos(long j10) {
        return Math.max(j10, f93171m);
    }

    public synchronized void onDataReceived() {
        try {
            this.f93173b.reset().start();
            int i10 = this.f93176e;
            if (i10 == 2) {
                this.f93176e = 3;
            } else if (i10 == 4 || i10 == 5) {
                ScheduledFuture scheduledFuture = this.f93177f;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                if (this.f93176e == 5) {
                    this.f93176e = 1;
                } else {
                    this.f93176e = 2;
                    mh.p1.checkState(this.f93178g == null, "There should be no outstanding pingFuture");
                    this.f93178g = this.f93172a.schedule(this.f93180i, this.f93181j, TimeUnit.NANOSECONDS);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void onTransportActive() {
        try {
            int i10 = this.f93176e;
            if (i10 == 1) {
                this.f93176e = 2;
                if (this.f93178g == null) {
                    ScheduledExecutorService scheduledExecutorService = this.f93172a;
                    x6 x6Var = this.f93180i;
                    long j10 = this.f93181j;
                    mh.t2 t2Var = this.f93173b;
                    TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                    this.f93178g = scheduledExecutorService.schedule(x6Var, j10 - t2Var.elapsed(timeUnit), timeUnit);
                }
            } else if (i10 == 5) {
                this.f93176e = 4;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void onTransportIdle() {
        if (this.f93175d) {
            return;
        }
        int i10 = this.f93176e;
        if (i10 == 2 || i10 == 3) {
            this.f93176e = 1;
        }
        if (this.f93176e == 4) {
            this.f93176e = 5;
        }
    }

    public synchronized void onTransportStarted() {
        if (this.f93175d) {
            onTransportActive();
        }
    }

    public synchronized void onTransportTermination() {
        try {
            if (this.f93176e != 6) {
                this.f93176e = 6;
                ScheduledFuture scheduledFuture = this.f93177f;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                ScheduledFuture scheduledFuture2 = this.f93178g;
                if (scheduledFuture2 != null) {
                    scheduledFuture2.cancel(false);
                    this.f93178g = null;
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
