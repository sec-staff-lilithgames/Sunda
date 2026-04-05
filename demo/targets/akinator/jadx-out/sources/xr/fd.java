package xr;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class fd implements Executor, Runnable {

    /* renamed from: f, reason: collision with root package name */
    public static final Logger f92518f = Logger.getLogger(fd.class.getName());

    /* renamed from: g, reason: collision with root package name */
    public static final cd f92519g;

    /* renamed from: b, reason: collision with root package name */
    public Executor f92520b;

    /* renamed from: c, reason: collision with root package name */
    public final ConcurrentLinkedQueue f92521c = new ConcurrentLinkedQueue();

    /* renamed from: e, reason: collision with root package name */
    public volatile int f92522e = 0;

    static {
        cd edVar;
        try {
            edVar = new dd(AtomicIntegerFieldUpdater.newUpdater(fd.class, "e"));
        } catch (Throwable th2) {
            f92518f.log(Level.SEVERE, "FieldUpdaterAtomicHelper failed", th2);
            edVar = new ed();
        }
        f92519g = edVar;
    }

    public fd(Executor executor) {
        mh.p1.checkNotNull(executor, "'executor' must not be null.");
        this.f92520b = executor;
    }

    public final void a(Runnable runnable) {
        cd cdVar = f92519g;
        if (cdVar.runStateCompareAndSet(this, 0, -1)) {
            try {
                this.f92520b.execute(this);
            } catch (Throwable th2) {
                if (runnable != null) {
                    this.f92521c.remove(runnable);
                }
                cdVar.runStateSet(this, 0);
                throw th2;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f92521c.add((Runnable) mh.p1.checkNotNull(runnable, "'r' must not be null."));
        a(runnable);
    }

    @Override // java.lang.Runnable
    public void run() {
        ConcurrentLinkedQueue concurrentLinkedQueue;
        Runnable runnable;
        cd cdVar = f92519g;
        try {
            Executor executor = this.f92520b;
            while (true) {
                Executor executor2 = this.f92520b;
                concurrentLinkedQueue = this.f92521c;
                if (executor != executor2 || (runnable = (Runnable) concurrentLinkedQueue.poll()) == null) {
                    break;
                }
                try {
                    runnable.run();
                } catch (RuntimeException e10) {
                    f92518f.log(Level.SEVERE, "Exception while executing runnable " + runnable, (Throwable) e10);
                }
            }
            cdVar.runStateSet(this, 0);
            if (concurrentLinkedQueue.isEmpty()) {
                return;
            }
            a(null);
        } catch (Throwable th2) {
            cdVar.runStateSet(this, 0);
            throw th2;
        }
    }

    public void setExecutor(Executor executor) {
        mh.p1.checkNotNull(executor, "'executor' must not be null.");
        this.f92520b = executor;
    }
}
