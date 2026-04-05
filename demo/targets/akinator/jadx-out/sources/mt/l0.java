package mt;

import java.util.concurrent.TimeUnit;
import mt.m0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class l0 implements Runnable, ou.a {

    /* renamed from: b, reason: collision with root package name */
    public final Runnable f74921b;

    /* renamed from: c, reason: collision with root package name */
    public final tt.h f74922c;

    /* renamed from: e, reason: collision with root package name */
    public final long f74923e;

    /* renamed from: f, reason: collision with root package name */
    public long f74924f;

    /* renamed from: g, reason: collision with root package name */
    public long f74925g;

    /* renamed from: h, reason: collision with root package name */
    public long f74926h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ m0.a f74927i;

    public l0(m0.a aVar, long j10, Runnable runnable, long j11, tt.h hVar, long j12) {
        this.f74927i = aVar;
        this.f74921b = runnable;
        this.f74922c = hVar;
        this.f74923e = j12;
        this.f74925g = j11;
        this.f74926h = j10;
    }

    @Override // ou.a
    public Runnable getWrappedRunnable() {
        return this.f74921b;
    }

    @Override // java.lang.Runnable
    public void run() {
        long j10;
        this.f74921b.run();
        tt.h hVar = this.f74922c;
        if (hVar.isDisposed()) {
            return;
        }
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        m0.a aVar = this.f74927i;
        long jNow = aVar.now(timeUnit);
        long j11 = m0.f74929c;
        long j12 = jNow + j11;
        long j13 = this.f74925g;
        long j14 = this.f74923e;
        if (j12 < j13 || jNow >= j13 + j14 + j11) {
            j10 = jNow + j14;
            long j15 = this.f74924f + 1;
            this.f74924f = j15;
            this.f74926h = j10 - (j14 * j15);
        } else {
            long j16 = this.f74926h;
            long j17 = this.f74924f + 1;
            this.f74924f = j17;
            j10 = (j17 * j14) + j16;
        }
        this.f74925g = jNow;
        hVar.replace(aVar.schedule(this, j10 - jNow, timeUnit));
    }
}
