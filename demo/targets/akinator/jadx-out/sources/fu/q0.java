package fu;

import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import mt.m0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class q0 extends mt.m0 {

    /* renamed from: g, reason: collision with root package name */
    public static final x f56082g;

    /* renamed from: h, reason: collision with root package name */
    public static final ScheduledExecutorService f56083h;

    /* renamed from: e, reason: collision with root package name */
    public final ThreadFactory f56084e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicReference f56085f;

    static {
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(0);
        f56083h = scheduledExecutorServiceNewScheduledThreadPool;
        scheduledExecutorServiceNewScheduledThreadPool.shutdown();
        f56082g = new x("RxSingleScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.single-priority", 5).intValue())), true);
    }

    public q0() {
        this(f56082g);
    }

    @Override // mt.m0
    public m0.a createWorker() {
        return new p0((ScheduledExecutorService) this.f56085f.get());
    }

    @Override // mt.m0
    public pt.c scheduleDirect(Runnable runnable, long j10, TimeUnit timeUnit) {
        z zVar = new z(mu.a.onSchedule(runnable));
        AtomicReference atomicReference = this.f56085f;
        try {
            zVar.setFuture(j10 <= 0 ? ((ScheduledExecutorService) atomicReference.get()).submit(zVar) : ((ScheduledExecutorService) atomicReference.get()).schedule(zVar, j10, timeUnit));
            return zVar;
        } catch (RejectedExecutionException e10) {
            mu.a.onError(e10);
            return tt.e.f87354b;
        }
    }

    @Override // mt.m0
    public pt.c schedulePeriodicallyDirect(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        Runnable runnableOnSchedule = mu.a.onSchedule(runnable);
        tt.e eVar = tt.e.f87354b;
        AtomicReference atomicReference = this.f56085f;
        if (j11 > 0) {
            y yVar = new y(runnableOnSchedule);
            try {
                yVar.setFuture(((ScheduledExecutorService) atomicReference.get()).scheduleAtFixedRate(yVar, j10, j11, timeUnit));
                return yVar;
            } catch (RejectedExecutionException e10) {
                mu.a.onError(e10);
                return eVar;
            }
        }
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) atomicReference.get();
        o oVar = new o(runnableOnSchedule, scheduledExecutorService);
        try {
            oVar.a(j10 <= 0 ? scheduledExecutorService.submit(oVar) : scheduledExecutorService.schedule(oVar, j10, timeUnit));
            return oVar;
        } catch (RejectedExecutionException e11) {
            mu.a.onError(e11);
            return eVar;
        }
    }

    @Override // mt.m0
    public void shutdown() {
        ScheduledExecutorService scheduledExecutorService;
        AtomicReference atomicReference = this.f56085f;
        ScheduledExecutorService scheduledExecutorService2 = (ScheduledExecutorService) atomicReference.get();
        ScheduledExecutorService scheduledExecutorService3 = f56083h;
        if (scheduledExecutorService2 == scheduledExecutorService3 || (scheduledExecutorService = (ScheduledExecutorService) atomicReference.getAndSet(scheduledExecutorService3)) == scheduledExecutorService3) {
            return;
        }
        scheduledExecutorService.shutdownNow();
    }

    @Override // mt.m0
    public void start() {
        ScheduledExecutorService scheduledExecutorServiceCreate = null;
        while (true) {
            AtomicReference atomicReference = this.f56085f;
            ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) atomicReference.get();
            if (scheduledExecutorService != f56083h) {
                if (scheduledExecutorServiceCreate != null) {
                    scheduledExecutorServiceCreate.shutdown();
                    return;
                }
                return;
            } else {
                if (scheduledExecutorServiceCreate == null) {
                    scheduledExecutorServiceCreate = f0.create(this.f56084e);
                }
                while (!atomicReference.compareAndSet(scheduledExecutorService, scheduledExecutorServiceCreate)) {
                    if (atomicReference.get() != scheduledExecutorService) {
                        break;
                    }
                }
                return;
            }
        }
    }

    public q0(ThreadFactory threadFactory) {
        AtomicReference atomicReference = new AtomicReference();
        this.f56085f = atomicReference;
        this.f56084e = threadFactory;
        atomicReference.lazySet(f0.create(threadFactory));
    }
}
