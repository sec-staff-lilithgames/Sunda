package sh;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class t1 extends s0 implements o1 {

    /* renamed from: b, reason: collision with root package name */
    public final n1 f85865b;

    /* renamed from: c, reason: collision with root package name */
    public final ScheduledFuture f85866c;

    public t1(k kVar, ScheduledFuture scheduledFuture) {
        this.f85865b = (n1) mh.p1.checkNotNull(kVar);
        this.f85866c = scheduledFuture;
    }

    @Override // sh.r0, java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        boolean zCancel = super.cancel(z10);
        if (zCancel) {
            this.f85866c.cancel(z10);
        }
        return zCancel;
    }

    @Override // nh.l4
    public final Object delegate() {
        return this.f85865b;
    }

    @Override // java.util.concurrent.Delayed
    public long getDelay(TimeUnit timeUnit) {
        return this.f85866c.getDelay(timeUnit);
    }

    @Override // java.lang.Comparable
    public int compareTo(Delayed delayed) {
        return this.f85866c.compareTo(delayed);
    }
}
