package fu;

import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class a extends AtomicReference implements pt.c, ou.a {

    /* renamed from: e, reason: collision with root package name */
    public static final FutureTask f55995e;

    /* renamed from: f, reason: collision with root package name */
    public static final FutureTask f55996f;

    /* renamed from: b, reason: collision with root package name */
    public final Runnable f55997b;

    /* renamed from: c, reason: collision with root package name */
    public Thread f55998c;

    static {
        ut.r rVar = ut.m0.f88679b;
        f55995e = new FutureTask(rVar, null);
        f55996f = new FutureTask(rVar, null);
    }

    public a(Runnable runnable) {
        this.f55997b = runnable;
    }

    @Override // pt.c
    public final void dispose() {
        FutureTask futureTask;
        Future future = (Future) get();
        if (future == f55995e || future == (futureTask = f55996f) || !compareAndSet(future, futureTask) || future == null) {
            return;
        }
        future.cancel(this.f55998c != Thread.currentThread());
    }

    @Override // ou.a
    public Runnable getWrappedRunnable() {
        return this.f55997b;
    }

    @Override // pt.c
    public final boolean isDisposed() {
        Future future = (Future) get();
        return future == f55995e || future == f55996f;
    }

    public final void setFuture(Future<?> future) {
        Future future2;
        do {
            future2 = (Future) get();
            if (future2 == f55995e) {
                return;
            }
            if (future2 == f55996f) {
                future.cancel(this.f55998c != Thread.currentThread());
                return;
            }
        } while (!compareAndSet(future2, future));
    }
}
