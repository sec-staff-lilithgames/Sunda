package pw;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class d1 {

    /* renamed from: e, reason: collision with root package name */
    public static final a f81883e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    public static final c1 f81884f = new c1();

    /* renamed from: a, reason: collision with root package name */
    public boolean f81885a;

    /* renamed from: b, reason: collision with root package name */
    public long f81886b;

    /* renamed from: c, reason: collision with root package name */
    public long f81887c;

    /* renamed from: d, reason: collision with root package name */
    public volatile Object f81888d;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }

        public final long minTimeout(long j10, long j11) {
            return (j10 != 0 && (j11 == 0 || j10 < j11)) ? j10 : j11;
        }

        public final d1 timeout(d1 d1Var, long j10, tv.i unit) {
            kotlin.jvm.internal.e0.checkNotNullParameter(d1Var, "<this>");
            kotlin.jvm.internal.e0.checkNotNullParameter(unit, "unit");
            return d1Var.timeout(j10, tv.k.toTimeUnit(unit));
        }

        /* renamed from: timeout-HG0u8IE, reason: not valid java name */
        public final d1 m5877timeoutHG0u8IE(d1 timeout, long j10) {
            kotlin.jvm.internal.e0.checkNotNullParameter(timeout, "$this$timeout");
            return timeout.timeout(tv.f.m7197getInWholeNanosecondsimpl(j10), TimeUnit.NANOSECONDS);
        }
    }

    public void awaitSignal(Condition condition) throws InterruptedException, InterruptedIOException {
        kotlin.jvm.internal.e0.checkNotNullParameter(condition, "condition");
        try {
            boolean zHasDeadline = hasDeadline();
            long jTimeoutNanos = timeoutNanos();
            if (!zHasDeadline && jTimeoutNanos == 0) {
                condition.await();
                return;
            }
            if (zHasDeadline && jTimeoutNanos != 0) {
                jTimeoutNanos = Math.min(jTimeoutNanos, deadlineNanoTime() - System.nanoTime());
            } else if (zHasDeadline) {
                jTimeoutNanos = deadlineNanoTime() - System.nanoTime();
            }
            if (jTimeoutNanos <= 0) {
                throw new InterruptedIOException("timeout");
            }
            Object obj = this.f81888d;
            if (condition.awaitNanos(jTimeoutNanos) <= 0 && this.f81888d == obj) {
                throw new InterruptedIOException("timeout");
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
    }

    public void cancel() {
        this.f81888d = new Object();
    }

    public d1 clearDeadline() {
        this.f81885a = false;
        return this;
    }

    public d1 clearTimeout() {
        this.f81887c = 0L;
        return this;
    }

    public final d1 deadline(long j10, TimeUnit unit) {
        kotlin.jvm.internal.e0.checkNotNullParameter(unit, "unit");
        if (j10 <= 0) {
            throw new IllegalArgumentException(o2.m(j10, "duration <= 0: ").toString());
        }
        return deadlineNanoTime(unit.toNanos(j10) + System.nanoTime());
    }

    public long deadlineNanoTime() {
        if (this.f81885a) {
            return this.f81886b;
        }
        throw new IllegalStateException("No deadline");
    }

    public boolean hasDeadline() {
        return this.f81885a;
    }

    public final <T> T intersectWith(d1 other, kv.a block) {
        kotlin.jvm.internal.e0.checkNotNullParameter(other, "other");
        kotlin.jvm.internal.e0.checkNotNullParameter(block, "block");
        long jTimeoutNanos = timeoutNanos();
        long jMinTimeout = f81883e.minTimeout(other.timeoutNanos(), timeoutNanos());
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        timeout(jMinTimeout, timeUnit);
        if (!hasDeadline()) {
            if (other.hasDeadline()) {
                deadlineNanoTime(other.deadlineNanoTime());
            }
            try {
                T t10 = (T) block.invoke();
                kotlin.jvm.internal.b0.finallyStart(1);
                timeout(jTimeoutNanos, timeUnit);
                if (other.hasDeadline()) {
                    clearDeadline();
                }
                kotlin.jvm.internal.b0.finallyEnd(1);
                return t10;
            } catch (Throwable th2) {
                kotlin.jvm.internal.b0.finallyStart(1);
                timeout(jTimeoutNanos, TimeUnit.NANOSECONDS);
                if (other.hasDeadline()) {
                    clearDeadline();
                }
                kotlin.jvm.internal.b0.finallyEnd(1);
                throw th2;
            }
        }
        long jDeadlineNanoTime = deadlineNanoTime();
        if (other.hasDeadline()) {
            deadlineNanoTime(Math.min(deadlineNanoTime(), other.deadlineNanoTime()));
        }
        try {
            T t11 = (T) block.invoke();
            kotlin.jvm.internal.b0.finallyStart(1);
            timeout(jTimeoutNanos, timeUnit);
            if (other.hasDeadline()) {
                deadlineNanoTime(jDeadlineNanoTime);
            }
            kotlin.jvm.internal.b0.finallyEnd(1);
            return t11;
        } catch (Throwable th3) {
            kotlin.jvm.internal.b0.finallyStart(1);
            timeout(jTimeoutNanos, TimeUnit.NANOSECONDS);
            if (other.hasDeadline()) {
                deadlineNanoTime(jDeadlineNanoTime);
            }
            kotlin.jvm.internal.b0.finallyEnd(1);
            throw th3;
        }
    }

    public void throwIfReached() throws IOException {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.f81885a && this.f81886b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public d1 timeout(long j10, TimeUnit unit) {
        kotlin.jvm.internal.e0.checkNotNullParameter(unit, "unit");
        if (j10 < 0) {
            throw new IllegalArgumentException(o2.m(j10, "timeout < 0: ").toString());
        }
        this.f81887c = unit.toNanos(j10);
        return this;
    }

    public long timeoutNanos() {
        return this.f81887c;
    }

    public void waitUntilNotified(Object monitor) throws InterruptedException, InterruptedIOException {
        kotlin.jvm.internal.e0.checkNotNullParameter(monitor, "monitor");
        try {
            boolean zHasDeadline = hasDeadline();
            long jTimeoutNanos = timeoutNanos();
            if (!zHasDeadline && jTimeoutNanos == 0) {
                monitor.wait();
                return;
            }
            long jNanoTime = System.nanoTime();
            if (zHasDeadline && jTimeoutNanos != 0) {
                jTimeoutNanos = Math.min(jTimeoutNanos, deadlineNanoTime() - jNanoTime);
            } else if (zHasDeadline) {
                jTimeoutNanos = deadlineNanoTime() - jNanoTime;
            }
            if (jTimeoutNanos <= 0) {
                throw new InterruptedIOException("timeout");
            }
            Object obj = this.f81888d;
            long j10 = jTimeoutNanos / 1000000;
            monitor.wait(j10, (int) (jTimeoutNanos - (1000000 * j10)));
            if (System.nanoTime() - jNanoTime >= jTimeoutNanos && this.f81888d == obj) {
                throw new InterruptedIOException("timeout");
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
    }

    public d1 deadlineNanoTime(long j10) {
        this.f81885a = true;
        this.f81886b = j10;
        return this;
    }
}
