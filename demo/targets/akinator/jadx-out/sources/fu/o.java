package fu;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class o implements Callable, pt.c {

    /* renamed from: h, reason: collision with root package name */
    public static final FutureTask f56058h = new FutureTask(ut.m0.f88679b, null);

    /* renamed from: b, reason: collision with root package name */
    public final Runnable f56059b;

    /* renamed from: f, reason: collision with root package name */
    public final ExecutorService f56062f;

    /* renamed from: g, reason: collision with root package name */
    public Thread f56063g;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicReference f56061e = new AtomicReference();

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReference f56060c = new AtomicReference();

    public o(Runnable runnable, ExecutorService executorService) {
        this.f56059b = runnable;
        this.f56062f = executorService;
    }

    public final void a(Future future) {
        while (true) {
            AtomicReference atomicReference = this.f56061e;
            Future future2 = (Future) atomicReference.get();
            if (future2 == f56058h) {
                future.cancel(this.f56063g != Thread.currentThread());
                return;
            }
            while (!atomicReference.compareAndSet(future2, future)) {
                if (atomicReference.get() != future2) {
                    break;
                }
            }
            return;
        }
    }

    @Override // pt.c
    public void dispose() {
        AtomicReference atomicReference = this.f56061e;
        FutureTask futureTask = f56058h;
        Future future = (Future) atomicReference.getAndSet(futureTask);
        if (future != null && future != futureTask) {
            future.cancel(this.f56063g != Thread.currentThread());
        }
        Future future2 = (Future) this.f56060c.getAndSet(futureTask);
        if (future2 == null || future2 == futureTask) {
            return;
        }
        future2.cancel(this.f56063g != Thread.currentThread());
    }

    @Override // pt.c
    public boolean isDisposed() {
        return this.f56061e.get() == f56058h;
    }

    @Override // java.util.concurrent.Callable
    public Void call() throws Exception {
        this.f56063g = Thread.currentThread();
        try {
            this.f56059b.run();
            Future futureSubmit = this.f56062f.submit(this);
            AtomicReference atomicReference = this.f56060c;
            loop0: while (true) {
                Future future = (Future) atomicReference.get();
                if (future != f56058h) {
                    while (!atomicReference.compareAndSet(future, futureSubmit)) {
                        if (atomicReference.get() != future) {
                            break;
                        }
                    }
                    break loop0;
                }
                futureSubmit.cancel(this.f56063g != Thread.currentThread());
            }
            this.f56063g = null;
        } catch (Throwable th2) {
            this.f56063g = null;
            mu.a.onError(th2);
        }
        return null;
    }
}
