package ci;

import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract class m {
    public static Executor directExecutor() {
        return l.f12350b;
    }

    public static Executor newLimitedConcurrencyExecutor(Executor executor, int i10) {
        return new n(executor, i10);
    }

    public static ExecutorService newLimitedConcurrencyExecutorService(ExecutorService executorService, int i10) {
        return new q(executorService, i10);
    }

    public static ScheduledExecutorService newLimitedConcurrencyScheduledExecutorService(ExecutorService executorService, int i10) {
        return new g(newLimitedConcurrencyExecutorService(executorService, i10), (ScheduledExecutorService) ExecutorsRegistrar.f29668d.get());
    }

    public static r newPausableExecutor(Executor executor) {
        return new s(executor);
    }

    public static t newPausableExecutorService(ExecutorService executorService) {
        return new u(executorService);
    }

    public static v newPausableScheduledExecutorService(ScheduledExecutorService scheduledExecutorService) {
        return new w(newPausableExecutorService(scheduledExecutorService), (ScheduledExecutorService) ExecutorsRegistrar.f29668d.get());
    }

    public static Executor newSequentialExecutor(Executor executor) {
        return new z(executor);
    }
}
