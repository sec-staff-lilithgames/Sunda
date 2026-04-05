package ak;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public interface a {
    void executeOneOff(String str, String str2, d dVar, Runnable runnable);

    ScheduledExecutorService newScheduledThreadPool(int i10, d dVar);

    ScheduledExecutorService newScheduledThreadPool(int i10, ThreadFactory threadFactory, d dVar);

    ExecutorService newSingleThreadExecutor(d dVar);

    ExecutorService newSingleThreadExecutor(ThreadFactory threadFactory, d dVar);

    ExecutorService newThreadPool(int i10, d dVar);

    ExecutorService newThreadPool(int i10, ThreadFactory threadFactory, d dVar);

    ExecutorService newThreadPool(d dVar);

    ExecutorService newThreadPool(ThreadFactory threadFactory, d dVar);

    Future<?> submitOneOff(String str, String str2, d dVar, Runnable runnable);
}
