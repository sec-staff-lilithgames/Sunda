package sh;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class q0 extends p0 {

    /* renamed from: j, reason: collision with root package name */
    public final n1 f85845j;

    public q0(n1 n1Var) {
        this.f85845j = (n1) mh.p1.checkNotNull(n1Var);
    }

    @Override // sh.k, sh.t, sh.n1
    public void addListener(Runnable runnable, Executor executor) {
        this.f85845j.addListener(runnable, executor);
    }

    @Override // sh.k, java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        return this.f85845j.cancel(z10);
    }

    @Override // sh.k, java.util.concurrent.Future
    public Object get() throws ExecutionException, InterruptedException {
        return this.f85845j.get();
    }

    @Override // sh.k, java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f85845j.isCancelled();
    }

    @Override // sh.k, java.util.concurrent.Future
    public boolean isDone() {
        return this.f85845j.isDone();
    }

    @Override // sh.k
    public String toString() {
        return this.f85845j.toString();
    }

    @Override // sh.k, java.util.concurrent.Future
    public Object get(long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return this.f85845j.get(j10, timeUnit);
    }
}
