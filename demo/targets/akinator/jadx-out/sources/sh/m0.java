package sh;

import java.util.List;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import nh.b5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class m0 extends u {

    /* renamed from: b, reason: collision with root package name */
    public final Object f85839b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public int f85840c = 0;

    /* renamed from: e, reason: collision with root package name */
    public boolean f85841e = false;

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j10, TimeUnit timeUnit) throws InterruptedException {
        long nanos = timeUnit.toNanos(j10);
        synchronized (this.f85839b) {
            while (true) {
                try {
                    if (this.f85841e && this.f85840c == 0) {
                        return true;
                    }
                    if (nanos <= 0) {
                        return false;
                    }
                    long jNanoTime = System.nanoTime();
                    TimeUnit.NANOSECONDS.timedWait(this.f85839b, nanos);
                    nanos -= System.nanoTime() - jNanoTime;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final void d() {
        synchronized (this.f85839b) {
            try {
                int i10 = this.f85840c - 1;
                this.f85840c = i10;
                if (i10 == 0) {
                    this.f85839b.notifyAll();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        synchronized (this.f85839b) {
            if (this.f85841e) {
                throw new RejectedExecutionException("Executor already shutdown");
            }
            this.f85840c++;
        }
        try {
            runnable.run();
        } finally {
            d();
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        boolean z10;
        synchronized (this.f85839b) {
            z10 = this.f85841e;
        }
        return z10;
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        boolean z10;
        synchronized (this.f85839b) {
            try {
                z10 = this.f85841e && this.f85840c == 0;
            } finally {
            }
        }
        return z10;
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        synchronized (this.f85839b) {
            try {
                this.f85841e = true;
                if (this.f85840c == 0) {
                    this.f85839b.notifyAll();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        shutdown();
        return b5.of();
    }
}
