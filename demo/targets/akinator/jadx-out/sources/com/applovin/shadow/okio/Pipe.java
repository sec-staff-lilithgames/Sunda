package com.applovin.shadow.okio;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.e0;
import kv.l;
import p0.o2;
import tu.f;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class Pipe {
    private final Buffer buffer = new Buffer();
    private boolean canceled;
    private final Condition condition;
    private Sink foldedSink;
    private final ReentrantLock lock;
    private final long maxBufferSize;
    private final Sink sink;
    private boolean sinkClosed;
    private final Source source;
    private boolean sourceClosed;

    public Pipe(long j10) {
        this.maxBufferSize = j10;
        ReentrantLock reentrantLock = new ReentrantLock();
        this.lock = reentrantLock;
        Condition conditionNewCondition = reentrantLock.newCondition();
        e0.checkNotNullExpressionValue(conditionNewCondition, "newCondition(...)");
        this.condition = conditionNewCondition;
        if (j10 < 1) {
            throw new IllegalArgumentException(o2.m(j10, "maxBufferSize < 1: ").toString());
        }
        this.sink = new Sink() { // from class: com.applovin.shadow.okio.Pipe.sink.1
            private final Timeout timeout = new Timeout();

            @Override // com.applovin.shadow.okio.Sink, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                ReentrantLock lock = Pipe.this.getLock();
                Pipe pipe = Pipe.this;
                lock.lock();
                try {
                    if (pipe.getSinkClosed$okio()) {
                        lock.unlock();
                        return;
                    }
                    Sink foldedSink$okio = pipe.getFoldedSink$okio();
                    if (foldedSink$okio == null) {
                        if (pipe.getSourceClosed$okio() && pipe.getBuffer$okio().size() > 0) {
                            throw new IOException("source is closed");
                        }
                        pipe.setSinkClosed$okio(true);
                        pipe.getCondition().signalAll();
                        foldedSink$okio = null;
                    }
                    if (foldedSink$okio != null) {
                        Pipe pipe2 = Pipe.this;
                        Timeout timeout = foldedSink$okio.timeout();
                        Timeout timeout2 = pipe2.sink().timeout();
                        long jTimeoutNanos = timeout.timeoutNanos();
                        long jMinTimeout = Timeout.Companion.minTimeout(timeout2.timeoutNanos(), timeout.timeoutNanos());
                        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                        timeout.timeout(jMinTimeout, timeUnit);
                        if (!timeout.hasDeadline()) {
                            if (timeout2.hasDeadline()) {
                                timeout.deadlineNanoTime(timeout2.deadlineNanoTime());
                            }
                            try {
                                foldedSink$okio.close();
                                timeout.timeout(jTimeoutNanos, timeUnit);
                                if (timeout2.hasDeadline()) {
                                    timeout.clearDeadline();
                                    return;
                                }
                                return;
                            } catch (Throwable th2) {
                                timeout.timeout(jTimeoutNanos, TimeUnit.NANOSECONDS);
                                if (timeout2.hasDeadline()) {
                                    timeout.clearDeadline();
                                }
                                throw th2;
                            }
                        }
                        long jDeadlineNanoTime = timeout.deadlineNanoTime();
                        if (timeout2.hasDeadline()) {
                            timeout.deadlineNanoTime(Math.min(timeout.deadlineNanoTime(), timeout2.deadlineNanoTime()));
                        }
                        try {
                            foldedSink$okio.close();
                            timeout.timeout(jTimeoutNanos, timeUnit);
                            if (timeout2.hasDeadline()) {
                                timeout.deadlineNanoTime(jDeadlineNanoTime);
                            }
                        } catch (Throwable th3) {
                            timeout.timeout(jTimeoutNanos, TimeUnit.NANOSECONDS);
                            if (timeout2.hasDeadline()) {
                                timeout.deadlineNanoTime(jDeadlineNanoTime);
                            }
                            throw th3;
                        }
                    }
                } finally {
                    lock.unlock();
                }
            }

            @Override // com.applovin.shadow.okio.Sink, java.io.Flushable
            public void flush() {
                ReentrantLock lock = Pipe.this.getLock();
                Pipe pipe = Pipe.this;
                lock.lock();
                try {
                    if (pipe.getSinkClosed$okio()) {
                        throw new IllegalStateException("closed");
                    }
                    if (pipe.getCanceled$okio()) {
                        throw new IOException("canceled");
                    }
                    Sink foldedSink$okio = pipe.getFoldedSink$okio();
                    if (foldedSink$okio == null) {
                        if (pipe.getSourceClosed$okio() && pipe.getBuffer$okio().size() > 0) {
                            throw new IOException("source is closed");
                        }
                        foldedSink$okio = null;
                    }
                    if (foldedSink$okio != null) {
                        Pipe pipe2 = Pipe.this;
                        Timeout timeout = foldedSink$okio.timeout();
                        Timeout timeout2 = pipe2.sink().timeout();
                        long jTimeoutNanos = timeout.timeoutNanos();
                        long jMinTimeout = Timeout.Companion.minTimeout(timeout2.timeoutNanos(), timeout.timeoutNanos());
                        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                        timeout.timeout(jMinTimeout, timeUnit);
                        if (!timeout.hasDeadline()) {
                            if (timeout2.hasDeadline()) {
                                timeout.deadlineNanoTime(timeout2.deadlineNanoTime());
                            }
                            try {
                                foldedSink$okio.flush();
                                timeout.timeout(jTimeoutNanos, timeUnit);
                                if (timeout2.hasDeadline()) {
                                    timeout.clearDeadline();
                                    return;
                                }
                                return;
                            } catch (Throwable th2) {
                                timeout.timeout(jTimeoutNanos, TimeUnit.NANOSECONDS);
                                if (timeout2.hasDeadline()) {
                                    timeout.clearDeadline();
                                }
                                throw th2;
                            }
                        }
                        long jDeadlineNanoTime = timeout.deadlineNanoTime();
                        if (timeout2.hasDeadline()) {
                            timeout.deadlineNanoTime(Math.min(timeout.deadlineNanoTime(), timeout2.deadlineNanoTime()));
                        }
                        try {
                            foldedSink$okio.flush();
                            timeout.timeout(jTimeoutNanos, timeUnit);
                            if (timeout2.hasDeadline()) {
                                timeout.deadlineNanoTime(jDeadlineNanoTime);
                            }
                        } catch (Throwable th3) {
                            timeout.timeout(jTimeoutNanos, TimeUnit.NANOSECONDS);
                            if (timeout2.hasDeadline()) {
                                timeout.deadlineNanoTime(jDeadlineNanoTime);
                            }
                            throw th3;
                        }
                    }
                } finally {
                    lock.unlock();
                }
            }

            @Override // com.applovin.shadow.okio.Sink
            public Timeout timeout() {
                return this.timeout;
            }

            /* JADX WARN: Code restructure failed: missing block: B:29:0x007b, code lost:
            
                if (r2 == null) goto L58;
             */
            /* JADX WARN: Code restructure failed: missing block: B:30:0x007d, code lost:
            
                r0 = r12.this$0;
                r1 = r2.timeout();
                r0 = r0.sink().timeout();
                r3 = r1.timeoutNanos();
                r5 = com.applovin.shadow.okio.Timeout.Companion.minTimeout(r0.timeoutNanos(), r1.timeoutNanos());
                r7 = java.util.concurrent.TimeUnit.NANOSECONDS;
                r1.timeout(r5, r7);
             */
            /* JADX WARN: Code restructure failed: missing block: B:31:0x00a6, code lost:
            
                if (r1.hasDeadline() == false) goto L45;
             */
            /* JADX WARN: Code restructure failed: missing block: B:32:0x00a8, code lost:
            
                r5 = r1.deadlineNanoTime();
             */
            /* JADX WARN: Code restructure failed: missing block: B:33:0x00b0, code lost:
            
                if (r0.hasDeadline() == false) goto L65;
             */
            /* JADX WARN: Code restructure failed: missing block: B:34:0x00b2, code lost:
            
                r1.deadlineNanoTime(java.lang.Math.min(r1.deadlineNanoTime(), r0.deadlineNanoTime()));
             */
            /* JADX WARN: Code restructure failed: missing block: B:35:0x00c1, code lost:
            
                r2.write(r13, r14);
             */
            /* JADX WARN: Code restructure failed: missing block: B:36:0x00c4, code lost:
            
                r1.timeout(r3, r7);
             */
            /* JADX WARN: Code restructure failed: missing block: B:37:0x00cb, code lost:
            
                if (r0.hasDeadline() == false) goto L79;
             */
            /* JADX WARN: Code restructure failed: missing block: B:38:0x00cd, code lost:
            
                r1.deadlineNanoTime(r5);
             */
            /* JADX WARN: Code restructure failed: missing block: B:39:0x00d0, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:40:0x00d1, code lost:
            
                r13 = move-exception;
             */
            /* JADX WARN: Code restructure failed: missing block: B:41:0x00d2, code lost:
            
                r1.timeout(r3, java.util.concurrent.TimeUnit.NANOSECONDS);
             */
            /* JADX WARN: Code restructure failed: missing block: B:42:0x00db, code lost:
            
                if (r0.hasDeadline() != false) goto L43;
             */
            /* JADX WARN: Code restructure failed: missing block: B:43:0x00dd, code lost:
            
                r1.deadlineNanoTime(r5);
             */
            /* JADX WARN: Code restructure failed: missing block: B:44:0x00e0, code lost:
            
                throw r13;
             */
            /* JADX WARN: Code restructure failed: missing block: B:46:0x00e5, code lost:
            
                if (r0.hasDeadline() == false) goto L68;
             */
            /* JADX WARN: Code restructure failed: missing block: B:47:0x00e7, code lost:
            
                r1.deadlineNanoTime(r0.deadlineNanoTime());
             */
            /* JADX WARN: Code restructure failed: missing block: B:48:0x00ee, code lost:
            
                r2.write(r13, r14);
             */
            /* JADX WARN: Code restructure failed: missing block: B:49:0x00f1, code lost:
            
                r1.timeout(r3, r7);
             */
            /* JADX WARN: Code restructure failed: missing block: B:50:0x00f8, code lost:
            
                if (r0.hasDeadline() == false) goto L80;
             */
            /* JADX WARN: Code restructure failed: missing block: B:51:0x00fa, code lost:
            
                r1.clearDeadline();
             */
            /* JADX WARN: Code restructure failed: missing block: B:52:0x00fd, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:53:0x00fe, code lost:
            
                r13 = move-exception;
             */
            /* JADX WARN: Code restructure failed: missing block: B:54:0x00ff, code lost:
            
                r1.timeout(r3, java.util.concurrent.TimeUnit.NANOSECONDS);
             */
            /* JADX WARN: Code restructure failed: missing block: B:55:0x0108, code lost:
            
                if (r0.hasDeadline() != false) goto L56;
             */
            /* JADX WARN: Code restructure failed: missing block: B:56:0x010a, code lost:
            
                r1.clearDeadline();
             */
            /* JADX WARN: Code restructure failed: missing block: B:57:0x010d, code lost:
            
                throw r13;
             */
            /* JADX WARN: Code restructure failed: missing block: B:58:0x010e, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:79:?, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:80:?, code lost:
            
                return;
             */
            @Override // com.applovin.shadow.okio.Sink
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void write(com.applovin.shadow.okio.Buffer r13, long r14) {
                /*
                    Method dump skipped, instructions count: 289
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.applovin.shadow.okio.Pipe.AnonymousClass1.write(com.applovin.shadow.okio.Buffer, long):void");
            }
        };
        this.source = new Source() { // from class: com.applovin.shadow.okio.Pipe.source.1
            private final Timeout timeout = new Timeout();

            @Override // com.applovin.shadow.okio.Source, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                ReentrantLock lock = Pipe.this.getLock();
                Pipe pipe = Pipe.this;
                lock.lock();
                try {
                    pipe.setSourceClosed$okio(true);
                    pipe.getCondition().signalAll();
                } finally {
                    lock.unlock();
                }
            }

            @Override // com.applovin.shadow.okio.Source
            public long read(Buffer sink, long j11) {
                e0.checkNotNullParameter(sink, "sink");
                ReentrantLock lock = Pipe.this.getLock();
                Pipe pipe = Pipe.this;
                lock.lock();
                try {
                    if (pipe.getSourceClosed$okio()) {
                        throw new IllegalStateException("closed");
                    }
                    if (pipe.getCanceled$okio()) {
                        throw new IOException("canceled");
                    }
                    while (pipe.getBuffer$okio().size() == 0) {
                        if (pipe.getSinkClosed$okio()) {
                            lock.unlock();
                            return -1L;
                        }
                        this.timeout.awaitSignal(pipe.getCondition());
                        if (pipe.getCanceled$okio()) {
                            throw new IOException("canceled");
                        }
                    }
                    long j12 = pipe.getBuffer$okio().read(sink, j11);
                    pipe.getCondition().signalAll();
                    lock.unlock();
                    return j12;
                } catch (Throwable th2) {
                    lock.unlock();
                    throw th2;
                }
            }

            @Override // com.applovin.shadow.okio.Source
            public Timeout timeout() {
                return this.timeout;
            }
        };
    }

    private final void forward(Sink sink, l lVar) {
        Timeout timeout = sink.timeout();
        Timeout timeout2 = sink().timeout();
        long jTimeoutNanos = timeout.timeoutNanos();
        long jMinTimeout = Timeout.Companion.minTimeout(timeout2.timeoutNanos(), timeout.timeoutNanos());
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        timeout.timeout(jMinTimeout, timeUnit);
        if (!timeout.hasDeadline()) {
            if (timeout2.hasDeadline()) {
                timeout.deadlineNanoTime(timeout2.deadlineNanoTime());
            }
            try {
                lVar.invoke(sink);
                b0.finallyStart(1);
                timeout.timeout(jTimeoutNanos, timeUnit);
                if (timeout2.hasDeadline()) {
                    timeout.clearDeadline();
                }
                b0.finallyEnd(1);
                return;
            } catch (Throwable th2) {
                b0.finallyStart(1);
                timeout.timeout(jTimeoutNanos, TimeUnit.NANOSECONDS);
                if (timeout2.hasDeadline()) {
                    timeout.clearDeadline();
                }
                b0.finallyEnd(1);
                throw th2;
            }
        }
        long jDeadlineNanoTime = timeout.deadlineNanoTime();
        if (timeout2.hasDeadline()) {
            timeout.deadlineNanoTime(Math.min(timeout.deadlineNanoTime(), timeout2.deadlineNanoTime()));
        }
        try {
            lVar.invoke(sink);
            b0.finallyStart(1);
            timeout.timeout(jTimeoutNanos, timeUnit);
            if (timeout2.hasDeadline()) {
                timeout.deadlineNanoTime(jDeadlineNanoTime);
            }
            b0.finallyEnd(1);
        } catch (Throwable th3) {
            b0.finallyStart(1);
            timeout.timeout(jTimeoutNanos, TimeUnit.NANOSECONDS);
            if (timeout2.hasDeadline()) {
                timeout.deadlineNanoTime(jDeadlineNanoTime);
            }
            b0.finallyEnd(1);
            throw th3;
        }
    }

    @f
    /* renamed from: -deprecated_sink, reason: not valid java name */
    public final Sink m368deprecated_sink() {
        return this.sink;
    }

    @f
    /* renamed from: -deprecated_source, reason: not valid java name */
    public final Source m369deprecated_source() {
        return this.source;
    }

    public final void cancel() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            this.canceled = true;
            this.buffer.clear();
            this.condition.signalAll();
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void fold(Sink sink) throws IOException {
        e0.checkNotNullParameter(sink, "sink");
        while (true) {
            this.lock.lock();
            try {
                if (this.foldedSink != null) {
                    throw new IllegalStateException("sink already folded");
                }
                if (this.canceled) {
                    this.foldedSink = sink;
                    throw new IOException("canceled");
                }
                if (this.buffer.exhausted()) {
                    this.sourceClosed = true;
                    this.foldedSink = sink;
                    return;
                }
                boolean z10 = this.sinkClosed;
                Buffer buffer = new Buffer();
                Buffer buffer2 = this.buffer;
                buffer.write(buffer2, buffer2.size());
                this.condition.signalAll();
                try {
                    sink.write(buffer, buffer.size());
                    if (z10) {
                        sink.close();
                    } else {
                        sink.flush();
                    }
                } catch (Throwable th2) {
                    this.lock.lock();
                    try {
                        this.sourceClosed = true;
                        this.condition.signalAll();
                        throw th2;
                    } finally {
                    }
                }
            } finally {
            }
        }
    }

    public final Buffer getBuffer$okio() {
        return this.buffer;
    }

    public final boolean getCanceled$okio() {
        return this.canceled;
    }

    public final Condition getCondition() {
        return this.condition;
    }

    public final Sink getFoldedSink$okio() {
        return this.foldedSink;
    }

    public final ReentrantLock getLock() {
        return this.lock;
    }

    public final long getMaxBufferSize$okio() {
        return this.maxBufferSize;
    }

    public final boolean getSinkClosed$okio() {
        return this.sinkClosed;
    }

    public final boolean getSourceClosed$okio() {
        return this.sourceClosed;
    }

    public final void setCanceled$okio(boolean z10) {
        this.canceled = z10;
    }

    public final void setFoldedSink$okio(Sink sink) {
        this.foldedSink = sink;
    }

    public final void setSinkClosed$okio(boolean z10) {
        this.sinkClosed = z10;
    }

    public final void setSourceClosed$okio(boolean z10) {
        this.sourceClosed = z10;
    }

    public final Sink sink() {
        return this.sink;
    }

    public final Source source() {
        return this.source;
    }
}
