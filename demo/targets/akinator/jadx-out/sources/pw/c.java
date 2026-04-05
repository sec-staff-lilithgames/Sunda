package pw;

import com.mbridge.msdk.foundation.same.task.Ri.TJzY;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class c extends d1 {

    /* renamed from: j, reason: collision with root package name */
    public static final a f81871j = new a(null);

    /* renamed from: k, reason: collision with root package name */
    public static final ReentrantLock f81872k;

    /* renamed from: l, reason: collision with root package name */
    public static final Condition f81873l;

    /* renamed from: m, reason: collision with root package name */
    public static final long f81874m;

    /* renamed from: n, reason: collision with root package name */
    public static final long f81875n;

    /* renamed from: o, reason: collision with root package name */
    public static c f81876o;

    /* renamed from: g, reason: collision with root package name */
    public int f81877g;

    /* renamed from: h, reason: collision with root package name */
    public c f81878h;

    /* renamed from: i, reason: collision with root package name */
    public long f81879i;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }

        public static final void access$insertIntoQueue(a aVar, c cVar, long j10, boolean z10) {
            aVar.getClass();
            if (c.f81876o == null) {
                c.f81876o = new c();
                new b().start();
            }
            long jNanoTime = System.nanoTime();
            if (j10 != 0 && z10) {
                cVar.f81879i = Math.min(j10, cVar.deadlineNanoTime() - jNanoTime) + jNanoTime;
            } else if (j10 != 0) {
                cVar.f81879i = j10 + jNanoTime;
            } else {
                if (!z10) {
                    throw new AssertionError();
                }
                cVar.f81879i = cVar.deadlineNanoTime();
            }
            long jAccess$remainingNanos = c.access$remainingNanos(cVar, jNanoTime);
            c cVar2 = c.f81876o;
            kotlin.jvm.internal.e0.checkNotNull(cVar2);
            while (cVar2.f81878h != null) {
                c cVar3 = cVar2.f81878h;
                kotlin.jvm.internal.e0.checkNotNull(cVar3);
                if (jAccess$remainingNanos < c.access$remainingNanos(cVar3, jNanoTime)) {
                    break;
                }
                cVar2 = cVar2.f81878h;
                kotlin.jvm.internal.e0.checkNotNull(cVar2);
            }
            cVar.f81878h = cVar2.f81878h;
            cVar2.f81878h = cVar;
            if (cVar2 == c.f81876o) {
                aVar.getCondition().signal();
            }
        }

        public static final void access$removeFromQueue(a aVar, c cVar) {
            aVar.getClass();
            for (c cVar2 = c.f81876o; cVar2 != null; cVar2 = cVar2.f81878h) {
                if (cVar2.f81878h == cVar) {
                    cVar2.f81878h = cVar.f81878h;
                    cVar.f81878h = null;
                    return;
                }
            }
            throw new IllegalStateException("node was not found in the queue");
        }

        public final c awaitTimeout() throws InterruptedException {
            c cVar = c.f81876o;
            kotlin.jvm.internal.e0.checkNotNull(cVar);
            c cVar2 = cVar.f81878h;
            if (cVar2 == null) {
                long jNanoTime = System.nanoTime();
                getCondition().await(c.f81874m, TimeUnit.MILLISECONDS);
                c cVar3 = c.f81876o;
                kotlin.jvm.internal.e0.checkNotNull(cVar3);
                if (cVar3.f81878h != null || System.nanoTime() - jNanoTime < c.f81875n) {
                    return null;
                }
                return c.f81876o;
            }
            long jAccess$remainingNanos = c.access$remainingNanos(cVar2, System.nanoTime());
            if (jAccess$remainingNanos > 0) {
                getCondition().await(jAccess$remainingNanos, TimeUnit.NANOSECONDS);
                return null;
            }
            c cVar4 = c.f81876o;
            kotlin.jvm.internal.e0.checkNotNull(cVar4);
            cVar4.f81878h = cVar2.f81878h;
            cVar2.f81878h = null;
            cVar2.f81877g = 2;
            return cVar2;
        }

        public final Condition getCondition() {
            return c.f81873l;
        }

        public final ReentrantLock getLock() {
            return c.f81872k;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b extends Thread {
        public b() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            ReentrantLock lock;
            c cVarAwaitTimeout;
            while (true) {
                try {
                    lock = c.f81871j.getLock();
                    lock.lock();
                    try {
                        cVarAwaitTimeout = c.f81871j.awaitTimeout();
                    } catch (Throwable th2) {
                        lock.unlock();
                        throw th2;
                    }
                } catch (InterruptedException unused) {
                    continue;
                }
                if (cVarAwaitTimeout == c.f81876o) {
                    a unused2 = c.f81871j;
                    c.f81876o = null;
                    lock.unlock();
                    return;
                } else {
                    lock.unlock();
                    if (cVarAwaitTimeout != null) {
                        cVarAwaitTimeout.b();
                    }
                }
            }
        }
    }

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        f81872k = reentrantLock;
        Condition conditionNewCondition = reentrantLock.newCondition();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(conditionNewCondition, "newCondition(...)");
        f81873l = conditionNewCondition;
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f81874m = millis;
        f81875n = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    public static final long access$remainingNanos(c cVar, long j10) {
        return cVar.f81879i - j10;
    }

    public IOException a(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public final IOException access$newTimeoutException(IOException iOException) {
        return a(iOException);
    }

    public void b() {
    }

    @Override // pw.d1
    public void cancel() {
        super.cancel();
        ReentrantLock reentrantLock = f81872k;
        reentrantLock.lock();
        try {
            if (this.f81877g == 1) {
                a.access$removeFromQueue(f81871j, this);
                this.f81877g = 3;
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean exit() {
        ReentrantLock reentrantLock = f81872k;
        reentrantLock.lock();
        try {
            int i10 = this.f81877g;
            this.f81877g = 0;
            if (i10 != 1) {
                return i10 == 2;
            }
            a.access$removeFromQueue(f81871j, this);
            return false;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final z0 sink(z0 sink) {
        kotlin.jvm.internal.e0.checkNotNullParameter(sink, "sink");
        return new d(this, sink);
    }

    public final b1 source(b1 source) {
        kotlin.jvm.internal.e0.checkNotNullParameter(source, "source");
        return new e(this, source);
    }

    public final <T> T withTimeout(kv.a block) throws IOException {
        kotlin.jvm.internal.e0.checkNotNullParameter(block, "block");
        enter();
        try {
            try {
                T t10 = (T) block.invoke();
                kotlin.jvm.internal.b0.finallyStart(1);
                if (exit()) {
                    throw access$newTimeoutException(null);
                }
                kotlin.jvm.internal.b0.finallyEnd(1);
                return t10;
            } catch (IOException e10) {
                if (exit()) {
                    throw access$newTimeoutException(e10);
                }
                throw e10;
            }
        } catch (Throwable th2) {
            kotlin.jvm.internal.b0.finallyStart(1);
            exit();
            kotlin.jvm.internal.b0.finallyEnd(1);
            throw th2;
        }
    }

    public final void enter() {
        long jTimeoutNanos = timeoutNanos();
        boolean zHasDeadline = hasDeadline();
        if (jTimeoutNanos == 0 && !zHasDeadline) {
            return;
        }
        ReentrantLock reentrantLock = f81872k;
        reentrantLock.lock();
        try {
            if (this.f81877g == 0) {
                this.f81877g = 1;
                a.access$insertIntoQueue(f81871j, this, jTimeoutNanos, zHasDeadline);
                return;
            }
            throw new IllegalStateException(TJzY.jHVhhsFBLZ);
        } finally {
            reentrantLock.unlock();
        }
    }
}
