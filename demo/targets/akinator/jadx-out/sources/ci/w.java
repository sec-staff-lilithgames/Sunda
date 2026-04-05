package ci;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class w extends g implements v {

    /* renamed from: e, reason: collision with root package name */
    public final t f12366e;

    public w(t tVar, ScheduledExecutorService scheduledExecutorService) {
        super(tVar, scheduledExecutorService);
        this.f12366e = tVar;
    }

    @Override // ci.v, ci.t, ci.r
    public boolean isPaused() {
        return this.f12366e.isPaused();
    }

    @Override // ci.v, ci.t, ci.r
    public void pause() {
        this.f12366e.pause();
    }

    @Override // ci.v, ci.t, ci.r
    public void resume() {
        this.f12366e.resume();
    }

    @Override // ci.g, java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> scheduleAtFixedRate(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Override // ci.g, java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> scheduleWithFixedDelay(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }
}
