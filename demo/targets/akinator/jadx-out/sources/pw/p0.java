package pw;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class p0 implements z0 {

    /* renamed from: b, reason: collision with root package name */
    public final d1 f81953b = new d1();

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r0 f81954c;

    public p0(r0 r0Var) {
        this.f81954c = r0Var;
    }

    @Override // pw.z0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        r0 r0Var = this.f81954c;
        ReentrantLock lock = r0Var.getLock();
        lock.lock();
        try {
            if (r0Var.getSinkClosed$okio()) {
                lock.unlock();
                return;
            }
            z0 foldedSink$okio = r0Var.getFoldedSink$okio();
            if (foldedSink$okio == null) {
                if (r0Var.getSourceClosed$okio() && r0Var.getBuffer$okio().size() > 0) {
                    throw new IOException("source is closed");
                }
                r0Var.setSinkClosed$okio(true);
                r0Var.getCondition().signalAll();
                foldedSink$okio = null;
            }
            if (foldedSink$okio != null) {
                d1 d1VarTimeout = foldedSink$okio.timeout();
                d1 d1VarTimeout2 = r0Var.sink().timeout();
                long jTimeoutNanos = d1VarTimeout.timeoutNanos();
                long jMinTimeout = d1.f81883e.minTimeout(d1VarTimeout2.timeoutNanos(), d1VarTimeout.timeoutNanos());
                TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                d1VarTimeout.timeout(jMinTimeout, timeUnit);
                if (!d1VarTimeout.hasDeadline()) {
                    if (d1VarTimeout2.hasDeadline()) {
                        d1VarTimeout.deadlineNanoTime(d1VarTimeout2.deadlineNanoTime());
                    }
                    try {
                        foldedSink$okio.close();
                        d1VarTimeout.timeout(jTimeoutNanos, timeUnit);
                        if (d1VarTimeout2.hasDeadline()) {
                            d1VarTimeout.clearDeadline();
                            return;
                        }
                        return;
                    } catch (Throwable th2) {
                        d1VarTimeout.timeout(jTimeoutNanos, TimeUnit.NANOSECONDS);
                        if (d1VarTimeout2.hasDeadline()) {
                            d1VarTimeout.clearDeadline();
                        }
                        throw th2;
                    }
                }
                long jDeadlineNanoTime = d1VarTimeout.deadlineNanoTime();
                if (d1VarTimeout2.hasDeadline()) {
                    d1VarTimeout.deadlineNanoTime(Math.min(d1VarTimeout.deadlineNanoTime(), d1VarTimeout2.deadlineNanoTime()));
                }
                try {
                    foldedSink$okio.close();
                    d1VarTimeout.timeout(jTimeoutNanos, timeUnit);
                    if (d1VarTimeout2.hasDeadline()) {
                        d1VarTimeout.deadlineNanoTime(jDeadlineNanoTime);
                    }
                } catch (Throwable th3) {
                    d1VarTimeout.timeout(jTimeoutNanos, TimeUnit.NANOSECONDS);
                    if (d1VarTimeout2.hasDeadline()) {
                        d1VarTimeout.deadlineNanoTime(jDeadlineNanoTime);
                    }
                    throw th3;
                }
            }
        } finally {
            lock.unlock();
        }
    }

    @Override // pw.z0, java.io.Flushable
    public void flush() {
        r0 r0Var = this.f81954c;
        ReentrantLock lock = r0Var.getLock();
        lock.lock();
        try {
            if (r0Var.getSinkClosed$okio()) {
                throw new IllegalStateException("closed");
            }
            if (r0Var.getCanceled$okio()) {
                throw new IOException("canceled");
            }
            z0 foldedSink$okio = r0Var.getFoldedSink$okio();
            if (foldedSink$okio == null) {
                if (r0Var.getSourceClosed$okio() && r0Var.getBuffer$okio().size() > 0) {
                    throw new IOException("source is closed");
                }
                foldedSink$okio = null;
            }
            if (foldedSink$okio != null) {
                d1 d1VarTimeout = foldedSink$okio.timeout();
                d1 d1VarTimeout2 = r0Var.sink().timeout();
                long jTimeoutNanos = d1VarTimeout.timeoutNanos();
                long jMinTimeout = d1.f81883e.minTimeout(d1VarTimeout2.timeoutNanos(), d1VarTimeout.timeoutNanos());
                TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                d1VarTimeout.timeout(jMinTimeout, timeUnit);
                if (!d1VarTimeout.hasDeadline()) {
                    if (d1VarTimeout2.hasDeadline()) {
                        d1VarTimeout.deadlineNanoTime(d1VarTimeout2.deadlineNanoTime());
                    }
                    try {
                        foldedSink$okio.flush();
                        d1VarTimeout.timeout(jTimeoutNanos, timeUnit);
                        if (d1VarTimeout2.hasDeadline()) {
                            d1VarTimeout.clearDeadline();
                            return;
                        }
                        return;
                    } catch (Throwable th2) {
                        d1VarTimeout.timeout(jTimeoutNanos, TimeUnit.NANOSECONDS);
                        if (d1VarTimeout2.hasDeadline()) {
                            d1VarTimeout.clearDeadline();
                        }
                        throw th2;
                    }
                }
                long jDeadlineNanoTime = d1VarTimeout.deadlineNanoTime();
                if (d1VarTimeout2.hasDeadline()) {
                    d1VarTimeout.deadlineNanoTime(Math.min(d1VarTimeout.deadlineNanoTime(), d1VarTimeout2.deadlineNanoTime()));
                }
                try {
                    foldedSink$okio.flush();
                    d1VarTimeout.timeout(jTimeoutNanos, timeUnit);
                    if (d1VarTimeout2.hasDeadline()) {
                        d1VarTimeout.deadlineNanoTime(jDeadlineNanoTime);
                    }
                } catch (Throwable th3) {
                    d1VarTimeout.timeout(jTimeoutNanos, TimeUnit.NANOSECONDS);
                    if (d1VarTimeout2.hasDeadline()) {
                        d1VarTimeout.deadlineNanoTime(jDeadlineNanoTime);
                    }
                    throw th3;
                }
            }
        } finally {
            lock.unlock();
        }
    }

    @Override // pw.z0
    public d1 timeout() {
        return this.f81953b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0079, code lost:
    
        if (r2 == null) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007b, code lost:
    
        r1 = r2.timeout();
        r0 = r0.sink().timeout();
        r3 = r1.timeoutNanos();
        r5 = pw.d1.f81883e.minTimeout(r0.timeoutNanos(), r1.timeoutNanos());
        r7 = java.util.concurrent.TimeUnit.NANOSECONDS;
        r1.timeout(r5, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a2, code lost:
    
        if (r1.hasDeadline() == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a4, code lost:
    
        r5 = r1.deadlineNanoTime();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ac, code lost:
    
        if (r0.hasDeadline() == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ae, code lost:
    
        r1.deadlineNanoTime(java.lang.Math.min(r1.deadlineNanoTime(), r0.deadlineNanoTime()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00bd, code lost:
    
        r2.write(r13, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c0, code lost:
    
        r1.timeout(r3, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c7, code lost:
    
        if (r0.hasDeadline() == false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c9, code lost:
    
        r1.deadlineNanoTime(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00cc, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00cd, code lost:
    
        r13 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ce, code lost:
    
        r1.timeout(r3, java.util.concurrent.TimeUnit.NANOSECONDS);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d7, code lost:
    
        if (r0.hasDeadline() != false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00d9, code lost:
    
        r1.deadlineNanoTime(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00dc, code lost:
    
        throw r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e1, code lost:
    
        if (r0.hasDeadline() == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00e3, code lost:
    
        r1.deadlineNanoTime(r0.deadlineNanoTime());
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00ea, code lost:
    
        r2.write(r13, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00ed, code lost:
    
        r1.timeout(r3, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00f4, code lost:
    
        if (r0.hasDeadline() == false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00f6, code lost:
    
        r1.clearDeadline();
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00f9, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00fa, code lost:
    
        r13 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00fb, code lost:
    
        r1.timeout(r3, java.util.concurrent.TimeUnit.NANOSECONDS);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0104, code lost:
    
        if (r0.hasDeadline() != false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0106, code lost:
    
        r1.clearDeadline();
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0109, code lost:
    
        throw r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x010a, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:?, code lost:
    
        return;
     */
    @Override // pw.z0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void write(pw.g r13, long r14) {
        /*
            Method dump skipped, instructions count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pw.p0.write(pw.g, long):void");
    }
}
