package ci;

import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class s implements r {

    /* renamed from: c, reason: collision with root package name */
    public final Executor f12362c;

    /* renamed from: e, reason: collision with root package name */
    public final LinkedBlockingQueue f12363e = new LinkedBlockingQueue();

    /* renamed from: b, reason: collision with root package name */
    public volatile boolean f12361b = false;

    public s(Executor executor) {
        this.f12362c = executor;
    }

    public final void a() {
        if (this.f12361b) {
            return;
        }
        Runnable runnable = (Runnable) this.f12363e.poll();
        while (runnable != null) {
            this.f12362c.execute(runnable);
            runnable = !this.f12361b ? (Runnable) this.f12363e.poll() : null;
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f12363e.offer(runnable);
        a();
    }

    @Override // ci.r
    public boolean isPaused() {
        return this.f12361b;
    }

    @Override // ci.r
    public void pause() {
        this.f12361b = true;
    }

    @Override // ci.r
    public void resume() {
        this.f12361b = false;
        a();
    }
}
