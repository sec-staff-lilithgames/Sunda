package fu;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class p implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final long f56069b;

    /* renamed from: c, reason: collision with root package name */
    public final ConcurrentLinkedQueue f56070c;

    /* renamed from: e, reason: collision with root package name */
    public final pt.b f56071e;

    /* renamed from: f, reason: collision with root package name */
    public final ScheduledExecutorService f56072f;

    /* renamed from: g, reason: collision with root package name */
    public final ScheduledFuture f56073g;

    /* renamed from: h, reason: collision with root package name */
    public final ThreadFactory f56074h;

    public p(long j10, TimeUnit timeUnit, ThreadFactory threadFactory) {
        p pVar;
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool;
        ScheduledFuture<?> scheduledFutureScheduleWithFixedDelay;
        long nanos = timeUnit != null ? timeUnit.toNanos(j10) : 0L;
        this.f56069b = nanos;
        this.f56070c = new ConcurrentLinkedQueue();
        this.f56071e = new pt.b();
        this.f56074h = threadFactory;
        if (timeUnit != null) {
            scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, s.f56091h);
            pVar = this;
            scheduledFutureScheduleWithFixedDelay = scheduledExecutorServiceNewScheduledThreadPool.scheduleWithFixedDelay(pVar, nanos, nanos, TimeUnit.NANOSECONDS);
        } else {
            pVar = this;
            scheduledExecutorServiceNewScheduledThreadPool = null;
            scheduledFutureScheduleWithFixedDelay = null;
        }
        pVar.f56072f = scheduledExecutorServiceNewScheduledThreadPool;
        pVar.f56073g = scheduledFutureScheduleWithFixedDelay;
    }

    public final void a() {
        this.f56071e.dispose();
        ScheduledFuture scheduledFuture = this.f56073g;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        ScheduledExecutorService scheduledExecutorService = this.f56072f;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        ConcurrentLinkedQueue concurrentLinkedQueue = this.f56070c;
        if (concurrentLinkedQueue.isEmpty()) {
            return;
        }
        long jNanoTime = System.nanoTime();
        Iterator it = concurrentLinkedQueue.iterator();
        while (it.hasNext()) {
            r rVar = (r) it.next();
            if (rVar.getExpirationTime() > jNanoTime) {
                return;
            }
            if (concurrentLinkedQueue.remove(rVar)) {
                this.f56071e.remove(rVar);
            }
        }
    }
}
