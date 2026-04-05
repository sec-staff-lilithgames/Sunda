package io.bidmachine;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class j extends ThreadPoolExecutor implements AutoCloseable {

    /* renamed from: b, reason: collision with root package name */
    public static volatile j f60567b;

    public static j get() {
        if (f60567b == null) {
            synchronized (j.class) {
                try {
                    if (f60567b == null) {
                        int iAvailableProcessors = Runtime.getRuntime().availableProcessors() * 2;
                        f60567b = new j(iAvailableProcessors, iAvailableProcessors, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue());
                    }
                } finally {
                }
            }
        }
        return f60567b;
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() throws InterruptedException {
        boolean zIsTerminated;
        if (this == ForkJoinPool.commonPool() || (zIsTerminated = isTerminated())) {
            return;
        }
        shutdown();
        boolean z10 = false;
        while (!zIsTerminated) {
            try {
                zIsTerminated = awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z10) {
                    shutdownNow();
                    z10 = true;
                }
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
    }
}
