package fu;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class z extends a implements Callable {
    public z(Runnable runnable) {
        super(runnable);
    }

    @Override // fu.a, ou.a
    public /* bridge */ /* synthetic */ Runnable getWrappedRunnable() {
        return super.getWrappedRunnable();
    }

    @Override // java.util.concurrent.Callable
    public Void call() throws Exception {
        FutureTask futureTask = a.f55995e;
        this.f55998c = Thread.currentThread();
        try {
            this.f55997b.run();
            return null;
        } finally {
            lazySet(futureTask);
            this.f55998c = null;
        }
    }
}
