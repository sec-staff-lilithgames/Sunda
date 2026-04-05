package fu;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import mt.m0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class e extends mt.m0 implements c0 {

    /* renamed from: g, reason: collision with root package name */
    public static final c f56012g;

    /* renamed from: h, reason: collision with root package name */
    public static final x f56013h;

    /* renamed from: i, reason: collision with root package name */
    public static final int f56014i;

    /* renamed from: j, reason: collision with root package name */
    public static final d f56015j;

    /* renamed from: e, reason: collision with root package name */
    public final ThreadFactory f56016e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicReference f56017f;

    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        int iIntValue = Integer.getInteger("rx2.computation-threads", 0).intValue();
        if (iIntValue > 0 && iIntValue <= iAvailableProcessors) {
            iAvailableProcessors = iIntValue;
        }
        f56014i = iAvailableProcessors;
        d dVar = new d(new x("RxComputationShutdown"));
        f56015j = dVar;
        dVar.dispose();
        x xVar = new x("RxComputationThreadPool", Math.max(1, Math.min(10, Integer.getInteger("rx2.computation-priority", 5).intValue())), true);
        f56013h = xVar;
        c cVar = new c(0, xVar);
        f56012g = cVar;
        cVar.shutdown();
    }

    public e() {
        this(f56013h);
    }

    @Override // mt.m0
    public m0.a createWorker() {
        return new b(((c) this.f56017f.get()).getEventLoop());
    }

    @Override // fu.c0
    public void createWorkers(int i10, b0 b0Var) {
        ut.o0.verifyPositive(i10, "number > 0 required");
        ((c) this.f56017f.get()).createWorkers(i10, b0Var);
    }

    @Override // mt.m0
    public pt.c scheduleDirect(Runnable runnable, long j10, TimeUnit timeUnit) {
        return ((c) this.f56017f.get()).getEventLoop().scheduleDirect(runnable, j10, timeUnit);
    }

    @Override // mt.m0
    public pt.c schedulePeriodicallyDirect(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        return ((c) this.f56017f.get()).getEventLoop().schedulePeriodicallyDirect(runnable, j10, j11, timeUnit);
    }

    @Override // mt.m0
    public void shutdown() {
        while (true) {
            AtomicReference atomicReference = this.f56017f;
            c cVar = (c) atomicReference.get();
            c cVar2 = f56012g;
            if (cVar == cVar2) {
                return;
            }
            while (!atomicReference.compareAndSet(cVar, cVar2)) {
                if (atomicReference.get() != cVar) {
                    break;
                }
            }
            cVar.shutdown();
            return;
        }
    }

    @Override // mt.m0
    public void start() {
        AtomicReference atomicReference;
        c cVar;
        c cVar2 = new c(f56014i, this.f56016e);
        do {
            atomicReference = this.f56017f;
            cVar = f56012g;
            if (atomicReference.compareAndSet(cVar, cVar2)) {
                return;
            }
        } while (atomicReference.get() == cVar);
        cVar2.shutdown();
    }

    public e(ThreadFactory threadFactory) {
        this.f56016e = threadFactory;
        this.f56017f = new AtomicReference(f56012g);
        start();
    }
}
