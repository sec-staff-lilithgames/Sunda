package fu;

import java.util.concurrent.TimeUnit;
import mt.m0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class m extends m0.a {
    @Override // mt.m0.a, pt.c
    public boolean isDisposed() {
        return false;
    }

    @Override // mt.m0.a
    public pt.c schedule(Runnable runnable) {
        runnable.run();
        return n.f56057g;
    }

    @Override // mt.m0.a
    public pt.c schedulePeriodically(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        throw new UnsupportedOperationException("This scheduler doesn't support periodic execution");
    }

    @Override // mt.m0.a
    public pt.c schedule(Runnable runnable, long j10, TimeUnit timeUnit) {
        throw new UnsupportedOperationException("This scheduler doesn't support delayed execution");
    }

    @Override // mt.m0.a, pt.c
    public void dispose() {
    }
}
