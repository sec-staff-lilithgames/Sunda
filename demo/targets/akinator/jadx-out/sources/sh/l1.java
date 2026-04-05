package sh;

import com.ironsource.C3191e4;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public abstract class l1 extends AtomicReference implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public static final k1 f85837b = new k1();

    /* renamed from: c, reason: collision with root package name */
    public static final k1 f85838c = new k1();

    public abstract void a(Throwable th2);

    public abstract void b(Object obj);

    public final void c() {
        k1 k1Var = f85838c;
        k1 k1Var2 = f85837b;
        Runnable runnable = (Runnable) get();
        if (runnable instanceof Thread) {
            j1 j1Var = new j1(this);
            j1.a(j1Var, Thread.currentThread());
            if (compareAndSet(runnable, j1Var)) {
                try {
                    ((Thread) runnable).interrupt();
                } finally {
                    if (((Runnable) getAndSet(k1Var2)) == k1Var) {
                        LockSupport.unpark((Thread) runnable);
                    }
                }
            }
        }
    }

    public abstract boolean d();

    public abstract Object e();

    public abstract String f();

    public final void g(Thread thread) {
        Runnable runnable = (Runnable) get();
        j1 j1Var = null;
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            boolean z11 = runnable instanceof j1;
            k1 k1Var = f85838c;
            if (!z11 && runnable != k1Var) {
                break;
            }
            if (z11) {
                j1Var = (j1) runnable;
            }
            i10++;
            if (i10 <= 1000) {
                Thread.yield();
            } else if (runnable == k1Var || compareAndSet(runnable, k1Var)) {
                z10 = Thread.interrupted() || z10;
                LockSupport.park(j1Var);
            }
            runnable = (Runnable) get();
        }
        if (z10) {
            thread.interrupt();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Thread threadCurrentThread = Thread.currentThread();
        Object objE = null;
        if (compareAndSet(null, threadCurrentThread)) {
            boolean zD = d();
            k1 k1Var = f85837b;
            if (!zD) {
                try {
                    objE = e();
                } catch (Throwable th2) {
                    try {
                        mh.p1.checkNotNull(th2);
                        if (th2 instanceof InterruptedException) {
                            Thread.currentThread().interrupt();
                        }
                        if (!compareAndSet(threadCurrentThread, k1Var)) {
                            g(threadCurrentThread);
                        }
                        if (zD) {
                            return;
                        }
                        a(th2);
                        return;
                    } finally {
                        if (!compareAndSet(threadCurrentThread, k1Var)) {
                            g(threadCurrentThread);
                        }
                        if (!zD) {
                            b(null);
                        }
                    }
                }
            }
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String str;
        Runnable runnable = (Runnable) get();
        if (runnable == f85837b) {
            str = "running=[DONE]";
        } else if (runnable instanceof j1) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            str = "running=[RUNNING ON " + ((Thread) runnable).getName() + C3191e4.i.f36531e;
        } else {
            str = "running=[NOT STARTED YET]";
        }
        StringBuilder sbT = a.b.t(str, ", ");
        sbT.append(f());
        return sbT.toString();
    }
}
