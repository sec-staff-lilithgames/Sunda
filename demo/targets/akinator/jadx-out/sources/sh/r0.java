package sh;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import nh.l4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public abstract class r0 extends l4 implements Future {
    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        return ((t1) this).f85865b.cancel(z10);
    }

    @Override // java.util.concurrent.Future
    public Object get() throws ExecutionException, InterruptedException {
        return ((t1) this).f85865b.get();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return ((t1) this).f85865b.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return ((t1) this).f85865b.isDone();
    }

    @Override // java.util.concurrent.Future
    public Object get(long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return ((t1) this).f85865b.get(j10, timeUnit);
    }
}
