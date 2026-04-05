package fu;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class f0 {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f56019a;

    /* renamed from: b, reason: collision with root package name */
    public static final int f56020b;

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicReference f56021c = new AtomicReference();

    /* renamed from: d, reason: collision with root package name */
    public static final ConcurrentHashMap f56022d = new ConcurrentHashMap();

    /* JADX WARN: Removed duplicated region for block: B:21:0x002d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static {
        /*
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            fu.f0.f56021c = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            fu.f0.f56022d = r0
            fu.e0 r0 = new fu.e0
            r0.<init>()
            java.lang.String r1 = "rx2.purge-enabled"
            r2 = 1
            java.lang.Object r1 = r0.apply(r1)     // Catch: java.lang.Throwable -> L26
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L26
            if (r1 != 0) goto L1f
            goto L26
        L1f:
            java.lang.String r3 = "true"
            boolean r1 = r3.equals(r1)     // Catch: java.lang.Throwable -> L26
            goto L27
        L26:
            r1 = r2
        L27:
            fu.f0.f56019a = r1
            java.lang.String r3 = "rx2.purge-period-seconds"
            if (r1 == 0) goto L3a
            java.lang.Object r0 = r0.apply(r3)     // Catch: java.lang.Throwable -> L3a
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L3a
            if (r0 != 0) goto L36
            goto L3a
        L36:
            int r2 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Throwable -> L3a
        L3a:
            fu.f0.f56020b = r2
            start()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: fu.f0.<clinit>():void");
    }

    public static ScheduledExecutorService create(ThreadFactory threadFactory) {
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, threadFactory);
        if (f56019a && (scheduledExecutorServiceNewScheduledThreadPool instanceof ScheduledThreadPoolExecutor)) {
            f56022d.put((ScheduledThreadPoolExecutor) scheduledExecutorServiceNewScheduledThreadPool, scheduledExecutorServiceNewScheduledThreadPool);
        }
        return scheduledExecutorServiceNewScheduledThreadPool;
    }

    public static void shutdown() {
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) f56021c.getAndSet(null);
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
        }
        f56022d.clear();
    }

    public static void start() {
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool;
        if (!f56019a) {
            return;
        }
        while (true) {
            AtomicReference atomicReference = f56021c;
            ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) atomicReference.get();
            if (scheduledExecutorService != null) {
                return;
            }
            scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, new x("RxSchedulerPurge"));
            while (!atomicReference.compareAndSet(scheduledExecutorService, scheduledExecutorServiceNewScheduledThreadPool)) {
                if (atomicReference.get() != scheduledExecutorService) {
                    break;
                }
            }
            d0 d0Var = new d0();
            long j10 = f56020b;
            scheduledExecutorServiceNewScheduledThreadPool.scheduleAtFixedRate(d0Var, j10, j10, TimeUnit.SECONDS);
            return;
            scheduledExecutorServiceNewScheduledThreadPool.shutdownNow();
        }
    }
}
