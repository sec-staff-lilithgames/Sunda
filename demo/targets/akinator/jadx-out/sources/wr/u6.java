package wr;

import java.lang.Thread;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class u6 implements Executor {

    /* renamed from: b, reason: collision with root package name */
    public final Thread.UncaughtExceptionHandler f91156b;

    /* renamed from: c, reason: collision with root package name */
    public final ConcurrentLinkedQueue f91157c = new ConcurrentLinkedQueue();

    /* renamed from: e, reason: collision with root package name */
    public final AtomicReference f91158e = new AtomicReference();

    public u6(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f91156b = (Thread.UncaughtExceptionHandler) mh.p1.checkNotNull(uncaughtExceptionHandler, "uncaughtExceptionHandler");
    }

    public final void drain() {
        AtomicReference atomicReference;
        ConcurrentLinkedQueue concurrentLinkedQueue = this.f91157c;
        do {
            Thread threadCurrentThread = Thread.currentThread();
            do {
                atomicReference = this.f91158e;
                if (atomicReference.compareAndSet(null, threadCurrentThread)) {
                    while (true) {
                        try {
                            Runnable runnable = (Runnable) concurrentLinkedQueue.poll();
                            if (runnable == null) {
                                break;
                            }
                            try {
                                runnable.run();
                            } catch (Throwable th2) {
                                this.f91156b.uncaughtException(Thread.currentThread(), th2);
                            }
                        } catch (Throwable th3) {
                            atomicReference.set(null);
                            throw th3;
                        }
                    }
                    atomicReference.set(null);
                }
            } while (atomicReference.get() == null);
            return;
        } while (!concurrentLinkedQueue.isEmpty());
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        executeLater(runnable);
        drain();
    }

    public final void executeLater(Runnable runnable) {
        this.f91157c.add((Runnable) mh.p1.checkNotNull(runnable, "runnable is null"));
    }

    public final t6 schedule(Runnable runnable, long j10, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        s6 s6Var = new s6(runnable);
        return new t6(s6Var, scheduledExecutorService.schedule(new q6(this, s6Var, runnable), j10, timeUnit));
    }

    public final t6 scheduleWithFixedDelay(Runnable runnable, long j10, long j11, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        s6 s6Var = new s6(runnable);
        return new t6(s6Var, scheduledExecutorService.scheduleWithFixedDelay(new r6(this, s6Var, runnable, j11), j10, j11, timeUnit));
    }

    public void throwIfNotInThisSynchronizationContext() {
        mh.p1.checkState(Thread.currentThread() == this.f91158e.get(), "Not called from the SynchronizationContext");
    }
}
