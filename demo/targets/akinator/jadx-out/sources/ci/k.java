package ci;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class k extends w2.i implements ScheduledFuture {

    /* renamed from: j, reason: collision with root package name */
    public final ScheduledFuture f12349j;

    public k(j jVar) {
        this.f12349j = jVar.addCompleter(new h(this));
    }

    @Override // w2.i
    public final void b() {
        ScheduledFuture scheduledFuture = this.f12349j;
        Object obj = this.f90350b;
        scheduledFuture.cancel((obj instanceof w2.a) && ((w2.a) obj).f90328a);
    }

    @Override // java.util.concurrent.Delayed
    public long getDelay(TimeUnit timeUnit) {
        return this.f12349j.getDelay(timeUnit);
    }

    @Override // java.lang.Comparable
    public int compareTo(Delayed delayed) {
        return this.f12349j.compareTo(delayed);
    }
}
