package fu;

import java.util.concurrent.TimeUnit;
import mt.m0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class v0 extends mt.m0 {

    /* renamed from: e, reason: collision with root package name */
    public static final v0 f56113e = new v0();

    public static v0 instance() {
        return f56113e;
    }

    @Override // mt.m0
    public m0.a createWorker() {
        return new u0();
    }

    @Override // mt.m0
    public pt.c scheduleDirect(Runnable runnable) {
        mu.a.onSchedule(runnable).run();
        return tt.e.f87354b;
    }

    @Override // mt.m0
    public pt.c scheduleDirect(Runnable runnable, long j10, TimeUnit timeUnit) throws InterruptedException {
        try {
            timeUnit.sleep(j10);
            mu.a.onSchedule(runnable).run();
        } catch (InterruptedException e10) {
            Thread.currentThread().interrupt();
            mu.a.onError(e10);
        }
        return tt.e.f87354b;
    }
}
