package iu;

import java.util.concurrent.atomic.AtomicInteger;
import mt.i0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class n {
    public static void onComplete(tw.c cVar, AtomicInteger atomicInteger, d dVar) {
        if (atomicInteger.getAndIncrement() == 0) {
            Throwable thTerminate = dVar.terminate();
            if (thTerminate != null) {
                cVar.onError(thTerminate);
            } else {
                cVar.onComplete();
            }
        }
    }

    public static void onError(tw.c cVar, Throwable th2, AtomicInteger atomicInteger, d dVar) {
        if (!dVar.addThrowable(th2)) {
            mu.a.onError(th2);
        } else if (atomicInteger.getAndIncrement() == 0) {
            cVar.onError(dVar.terminate());
        }
    }

    public static <T> void onNext(tw.c cVar, T t10, AtomicInteger atomicInteger, d dVar) {
        if (atomicInteger.get() == 0 && atomicInteger.compareAndSet(0, 1)) {
            cVar.onNext(t10);
            if (atomicInteger.decrementAndGet() != 0) {
                Throwable thTerminate = dVar.terminate();
                if (thTerminate != null) {
                    cVar.onError(thTerminate);
                } else {
                    cVar.onComplete();
                }
            }
        }
    }

    public static void onComplete(i0 i0Var, AtomicInteger atomicInteger, d dVar) {
        if (atomicInteger.getAndIncrement() == 0) {
            Throwable thTerminate = dVar.terminate();
            if (thTerminate != null) {
                i0Var.onError(thTerminate);
            } else {
                i0Var.onComplete();
            }
        }
    }

    public static void onError(i0 i0Var, Throwable th2, AtomicInteger atomicInteger, d dVar) {
        if (dVar.addThrowable(th2)) {
            if (atomicInteger.getAndIncrement() == 0) {
                i0Var.onError(dVar.terminate());
                return;
            }
            return;
        }
        mu.a.onError(th2);
    }

    public static <T> void onNext(i0 i0Var, T t10, AtomicInteger atomicInteger, d dVar) {
        if (atomicInteger.get() == 0 && atomicInteger.compareAndSet(0, 1)) {
            i0Var.onNext(t10);
            if (atomicInteger.decrementAndGet() != 0) {
                Throwable thTerminate = dVar.terminate();
                if (thTerminate != null) {
                    i0Var.onError(thTerminate);
                } else {
                    i0Var.onComplete();
                }
            }
        }
    }
}
