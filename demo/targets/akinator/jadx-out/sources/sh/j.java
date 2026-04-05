package sh;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public abstract class j extends k implements i {
    @Override // sh.k, sh.t, sh.n1
    public void addListener(Runnable runnable, Executor executor) {
        super.addListener(runnable, executor);
    }

    @Override // sh.k, java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        return super.cancel(z10);
    }

    @Override // sh.k, java.util.concurrent.Future
    public final Object get() throws ExecutionException, InterruptedException {
        return super.get();
    }

    @Override // sh.k, java.util.concurrent.Future
    public boolean isCancelled() {
        return super.isCancelled();
    }

    @Override // sh.k, java.util.concurrent.Future
    public final boolean isDone() {
        return super.isDone();
    }

    @Override // sh.k, java.util.concurrent.Future
    public final Object get(long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return super.get(j10, timeUnit);
    }
}
