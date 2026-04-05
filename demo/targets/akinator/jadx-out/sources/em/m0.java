package em;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class m0 implements l0 {

    /* renamed from: b, reason: collision with root package name */
    public static final int f54712b = Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4));

    /* renamed from: a, reason: collision with root package name */
    public final ScheduledExecutorService f54713a;

    public m0() {
        this(Executors.newScheduledThreadPool(f54712b));
    }

    @Override // em.l0
    public boolean execute(Runnable runnable) {
        return execute(runnable, 0L);
    }

    public m0(ScheduledExecutorService scheduledExecutorService) {
        this.f54713a = scheduledExecutorService;
    }

    @Override // em.l0
    public boolean execute(Runnable runnable, long j10) {
        try {
            this.f54713a.schedule(runnable, j10, TimeUnit.MILLISECONDS);
            return true;
        } catch (Throwable th2) {
            nm.a.w(th2);
            return false;
        }
    }
}
