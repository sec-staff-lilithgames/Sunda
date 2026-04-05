package sh;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class u0 implements Future {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Future f85867b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ mh.v0 f85868c;

    public u0(Future future, mh.v0 v0Var) {
        this.f85867b = future;
        this.f85868c = v0Var;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        return this.f85867b.cancel(z10);
    }

    @Override // java.util.concurrent.Future
    public Object get() throws ExecutionException, InterruptedException {
        try {
            return this.f85868c.apply(this.f85867b.get());
        } catch (Throwable th2) {
            throw new ExecutionException(th2);
        }
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f85867b.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.f85867b.isDone();
    }

    @Override // java.util.concurrent.Future
    public Object get(long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        try {
            return this.f85868c.apply(this.f85867b.get(j10, timeUnit));
        } catch (Throwable th2) {
            throw new ExecutionException(th2);
        }
    }
}
