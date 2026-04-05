package iu;

import java.util.concurrent.CountDownLatch;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class f {
    public static void awaitForComplete(CountDownLatch countDownLatch, pt.c cVar) throws InterruptedException {
        if (countDownLatch.getCount() == 0) {
            return;
        }
        try {
            verifyNonBlocking();
            countDownLatch.await();
        } catch (InterruptedException e10) {
            cVar.dispose();
            Thread.currentThread().interrupt();
            throw new IllegalStateException("Interrupted while waiting for subscription to complete.", e10);
        }
    }

    public static void verifyNonBlocking() {
        if (mu.a.isFailOnNonBlockingScheduler()) {
            if ((Thread.currentThread() instanceof fu.v) || mu.a.onBeforeBlocking()) {
                throw new IllegalStateException("Attempt to block on a Scheduler " + Thread.currentThread().getName() + " that doesn't support blocking operators as they may lead to deadlock");
            }
        }
    }
}
