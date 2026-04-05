package ds;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class o extends ConcurrentLinkedQueue implements Executor {

    /* renamed from: c, reason: collision with root package name */
    public static final Logger f52637c = Logger.getLogger(o.class.getName());

    /* renamed from: e, reason: collision with root package name */
    public static final Object f52638e = new Object();

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f52639b;

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        add(runnable);
        Object obj = this.f52639b;
        if (obj != f52638e) {
            LockSupport.unpark((Thread) obj);
        } else if (remove(runnable) && q.f52644b) {
            throw new RejectedExecutionException();
        }
    }

    public void shutdown() {
        this.f52639b = f52638e;
        while (true) {
            Runnable runnable = (Runnable) poll();
            if (runnable == null) {
                return;
            }
            try {
                runnable.run();
            } catch (Throwable th2) {
                f52637c.log(Level.WARNING, "Runnable threw exception", th2);
            }
        }
    }

    public void waitAndDrain() throws InterruptedException {
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Runnable runnable = (Runnable) poll();
        if (runnable == null) {
            this.f52639b = Thread.currentThread();
            do {
                try {
                    Runnable runnable2 = (Runnable) poll();
                    if (runnable2 == null) {
                        LockSupport.park(this);
                    } else {
                        this.f52639b = null;
                        runnable = runnable2;
                    }
                } catch (Throwable th2) {
                    this.f52639b = null;
                    throw th2;
                }
            } while (!Thread.interrupted());
            throw new InterruptedException();
        }
        do {
            try {
                runnable.run();
            } catch (Throwable th3) {
                f52637c.log(Level.WARNING, "Runnable threw exception", th3);
            }
            runnable = (Runnable) poll();
        } while (runnable != null);
    }
}
