package w2;

import java.lang.ref.WeakReference;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import sh.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class n implements n1 {

    /* renamed from: b, reason: collision with root package name */
    public final WeakReference f90358b;

    /* renamed from: c, reason: collision with root package name */
    public final m f90359c = new m(this);

    public n(j jVar) {
        this.f90358b = new WeakReference(jVar);
    }

    @Override // sh.n1
    public void addListener(Runnable runnable, Executor executor) {
        this.f90359c.addListener(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        j jVar = (j) this.f90358b.get();
        boolean zCancel = this.f90359c.cancel(z10);
        if (zCancel && jVar != null) {
            jVar.f90353a = null;
            jVar.f90354b = null;
            jVar.f90355c.set(null);
        }
        return zCancel;
    }

    @Override // java.util.concurrent.Future
    public Object get() throws ExecutionException, InterruptedException {
        return this.f90359c.get();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f90359c.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.f90359c.isDone();
    }

    public String toString() {
        return this.f90359c.toString();
    }

    @Override // java.util.concurrent.Future
    public Object get(long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return this.f90359c.get(j10, timeUnit);
    }
}
