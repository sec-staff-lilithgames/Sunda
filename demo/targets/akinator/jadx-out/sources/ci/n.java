package ci;

import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.Semaphore;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class n implements Executor {

    /* renamed from: b, reason: collision with root package name */
    public final Executor f12352b;

    /* renamed from: c, reason: collision with root package name */
    public final Semaphore f12353c;

    /* renamed from: e, reason: collision with root package name */
    public final LinkedBlockingQueue f12354e = new LinkedBlockingQueue();

    public n(Executor executor, int i10) {
        bi.z.checkArgument(i10 > 0, "concurrency must be positive.");
        this.f12352b = executor;
        this.f12353c = new Semaphore(i10, true);
    }

    public final void d() {
        while (true) {
            Semaphore semaphore = this.f12353c;
            if (!semaphore.tryAcquire()) {
                return;
            }
            Runnable runnable = (Runnable) this.f12354e.poll();
            if (runnable == null) {
                semaphore.release();
                return;
            } else {
                this.f12352b.execute(new af.n(13, this, runnable));
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f12354e.offer(runnable);
        d();
    }
}
