package com.applovin.shadow.okio;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kv.a;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class AsyncTimeout extends Timeout {
    public static final Companion Companion = new Companion(null);
    private static final long IDLE_TIMEOUT_MILLIS;
    private static final long IDLE_TIMEOUT_NANOS;
    private static final int TIMEOUT_WRITE_SIZE = 65536;
    private static final Condition condition;
    private static AsyncTimeout head;
    private static final ReentrantLock lock;
    private boolean inQueue;
    private AsyncTimeout next;
    private long timeoutAt;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean cancelScheduledTimeout(AsyncTimeout asyncTimeout) {
            ReentrantLock lock = AsyncTimeout.Companion.getLock();
            lock.lock();
            try {
                if (!asyncTimeout.inQueue) {
                    return false;
                }
                asyncTimeout.inQueue = false;
                for (AsyncTimeout asyncTimeout2 = AsyncTimeout.head; asyncTimeout2 != null; asyncTimeout2 = asyncTimeout2.next) {
                    if (asyncTimeout2.next == asyncTimeout) {
                        asyncTimeout2.next = asyncTimeout.next;
                        asyncTimeout.next = null;
                        return false;
                    }
                }
                lock.unlock();
                return true;
            } finally {
                lock.unlock();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void scheduleTimeout(AsyncTimeout asyncTimeout, long j10, boolean z10) {
            ReentrantLock lock = AsyncTimeout.Companion.getLock();
            lock.lock();
            try {
                if (asyncTimeout.inQueue) {
                    throw new IllegalStateException("Unbalanced enter/exit");
                }
                asyncTimeout.inQueue = true;
                if (AsyncTimeout.head == null) {
                    AsyncTimeout.head = new AsyncTimeout();
                    new Watchdog().start();
                }
                long jNanoTime = System.nanoTime();
                if (j10 != 0 && z10) {
                    asyncTimeout.timeoutAt = Math.min(j10, asyncTimeout.deadlineNanoTime() - jNanoTime) + jNanoTime;
                } else if (j10 != 0) {
                    asyncTimeout.timeoutAt = j10 + jNanoTime;
                } else {
                    if (!z10) {
                        throw new AssertionError();
                    }
                    asyncTimeout.timeoutAt = asyncTimeout.deadlineNanoTime();
                }
                long jRemainingNanos = asyncTimeout.remainingNanos(jNanoTime);
                AsyncTimeout asyncTimeout2 = AsyncTimeout.head;
                e0.checkNotNull(asyncTimeout2);
                while (asyncTimeout2.next != null) {
                    AsyncTimeout asyncTimeout3 = asyncTimeout2.next;
                    e0.checkNotNull(asyncTimeout3);
                    if (jRemainingNanos < asyncTimeout3.remainingNanos(jNanoTime)) {
                        break;
                    }
                    asyncTimeout2 = asyncTimeout2.next;
                    e0.checkNotNull(asyncTimeout2);
                }
                asyncTimeout.next = asyncTimeout2.next;
                asyncTimeout2.next = asyncTimeout;
                if (asyncTimeout2 == AsyncTimeout.head) {
                    AsyncTimeout.Companion.getCondition().signal();
                }
                lock.unlock();
            } catch (Throwable th2) {
                lock.unlock();
                throw th2;
            }
        }

        public final AsyncTimeout awaitTimeout$okio() throws InterruptedException {
            AsyncTimeout asyncTimeout = AsyncTimeout.head;
            e0.checkNotNull(asyncTimeout);
            AsyncTimeout asyncTimeout2 = asyncTimeout.next;
            if (asyncTimeout2 == null) {
                long jNanoTime = System.nanoTime();
                getCondition().await(AsyncTimeout.IDLE_TIMEOUT_MILLIS, TimeUnit.MILLISECONDS);
                AsyncTimeout asyncTimeout3 = AsyncTimeout.head;
                e0.checkNotNull(asyncTimeout3);
                if (asyncTimeout3.next != null || System.nanoTime() - jNanoTime < AsyncTimeout.IDLE_TIMEOUT_NANOS) {
                    return null;
                }
                return AsyncTimeout.head;
            }
            long jRemainingNanos = asyncTimeout2.remainingNanos(System.nanoTime());
            if (jRemainingNanos > 0) {
                getCondition().await(jRemainingNanos, TimeUnit.NANOSECONDS);
                return null;
            }
            AsyncTimeout asyncTimeout4 = AsyncTimeout.head;
            e0.checkNotNull(asyncTimeout4);
            asyncTimeout4.next = asyncTimeout2.next;
            asyncTimeout2.next = null;
            return asyncTimeout2;
        }

        public final Condition getCondition() {
            return AsyncTimeout.condition;
        }

        public final ReentrantLock getLock() {
            return AsyncTimeout.lock;
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Watchdog extends Thread {
        public Watchdog() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            ReentrantLock lock;
            AsyncTimeout asyncTimeoutAwaitTimeout$okio;
            while (true) {
                try {
                    Companion companion = AsyncTimeout.Companion;
                    lock = companion.getLock();
                    lock.lock();
                    try {
                        asyncTimeoutAwaitTimeout$okio = companion.awaitTimeout$okio();
                    } catch (Throwable th2) {
                        lock.unlock();
                        throw th2;
                    }
                } catch (InterruptedException unused) {
                }
                if (asyncTimeoutAwaitTimeout$okio == AsyncTimeout.head) {
                    AsyncTimeout.head = null;
                    lock.unlock();
                    return;
                } else {
                    lock.unlock();
                    if (asyncTimeoutAwaitTimeout$okio != null) {
                        asyncTimeoutAwaitTimeout$okio.timedOut();
                    }
                }
            }
        }
    }

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        lock = reentrantLock;
        Condition conditionNewCondition = reentrantLock.newCondition();
        e0.checkNotNullExpressionValue(conditionNewCondition, "newCondition(...)");
        condition = conditionNewCondition;
        long millis = TimeUnit.SECONDS.toMillis(60L);
        IDLE_TIMEOUT_MILLIS = millis;
        IDLE_TIMEOUT_NANOS = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long remainingNanos(long j10) {
        return this.timeoutAt - j10;
    }

    public final IOException access$newTimeoutException(IOException iOException) {
        return newTimeoutException(iOException);
    }

    public final void enter() {
        long jTimeoutNanos = timeoutNanos();
        boolean zHasDeadline = hasDeadline();
        if (jTimeoutNanos != 0 || zHasDeadline) {
            Companion.scheduleTimeout(this, jTimeoutNanos, zHasDeadline);
        }
    }

    public final boolean exit() {
        return Companion.cancelScheduledTimeout(this);
    }

    public IOException newTimeoutException(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public final Sink sink(final Sink sink) {
        e0.checkNotNullParameter(sink, "sink");
        return new Sink() { // from class: com.applovin.shadow.okio.AsyncTimeout.sink.1
            @Override // com.applovin.shadow.okio.Sink, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                AsyncTimeout asyncTimeout = AsyncTimeout.this;
                Sink sink2 = sink;
                asyncTimeout.enter();
                try {
                    sink2.close();
                    if (asyncTimeout.exit()) {
                        throw asyncTimeout.access$newTimeoutException(null);
                    }
                } catch (IOException e10) {
                    if (!asyncTimeout.exit()) {
                        throw e10;
                    }
                    throw asyncTimeout.access$newTimeoutException(e10);
                } finally {
                    asyncTimeout.exit();
                }
            }

            @Override // com.applovin.shadow.okio.Sink, java.io.Flushable
            public void flush() throws IOException {
                AsyncTimeout asyncTimeout = AsyncTimeout.this;
                Sink sink2 = sink;
                asyncTimeout.enter();
                try {
                    sink2.flush();
                    if (asyncTimeout.exit()) {
                        throw asyncTimeout.access$newTimeoutException(null);
                    }
                } catch (IOException e10) {
                    if (!asyncTimeout.exit()) {
                        throw e10;
                    }
                    throw asyncTimeout.access$newTimeoutException(e10);
                } finally {
                    asyncTimeout.exit();
                }
            }

            public String toString() {
                return "AsyncTimeout.sink(" + sink + ')';
            }

            @Override // com.applovin.shadow.okio.Sink
            public void write(Buffer source, long j10) throws IOException {
                e0.checkNotNullParameter(source, "source");
                SegmentedByteString.checkOffsetAndCount(source.size(), 0L, j10);
                while (true) {
                    long j11 = 0;
                    if (j10 <= 0) {
                        return;
                    }
                    Segment segment = source.head;
                    e0.checkNotNull(segment);
                    while (true) {
                        if (j11 >= 65536) {
                            break;
                        }
                        j11 += segment.limit - segment.pos;
                        if (j11 >= j10) {
                            j11 = j10;
                            break;
                        } else {
                            segment = segment.next;
                            e0.checkNotNull(segment);
                        }
                    }
                    AsyncTimeout asyncTimeout = AsyncTimeout.this;
                    Sink sink2 = sink;
                    asyncTimeout.enter();
                    try {
                        try {
                            sink2.write(source, j11);
                            if (asyncTimeout.exit()) {
                                throw asyncTimeout.access$newTimeoutException(null);
                            }
                            j10 -= j11;
                        } catch (IOException e10) {
                            if (!asyncTimeout.exit()) {
                                throw e10;
                            }
                            throw asyncTimeout.access$newTimeoutException(e10);
                        }
                    } catch (Throwable th2) {
                        asyncTimeout.exit();
                        throw th2;
                    }
                }
            }

            @Override // com.applovin.shadow.okio.Sink
            public AsyncTimeout timeout() {
                return AsyncTimeout.this;
            }
        };
    }

    public final Source source(final Source source) {
        e0.checkNotNullParameter(source, "source");
        return new Source() { // from class: com.applovin.shadow.okio.AsyncTimeout.source.1
            @Override // com.applovin.shadow.okio.Source, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                AsyncTimeout asyncTimeout = AsyncTimeout.this;
                Source source2 = source;
                asyncTimeout.enter();
                try {
                    source2.close();
                    if (asyncTimeout.exit()) {
                        throw asyncTimeout.access$newTimeoutException(null);
                    }
                } catch (IOException e10) {
                    if (!asyncTimeout.exit()) {
                        throw e10;
                    }
                    throw asyncTimeout.access$newTimeoutException(e10);
                } finally {
                    asyncTimeout.exit();
                }
            }

            @Override // com.applovin.shadow.okio.Source
            public long read(Buffer sink, long j10) throws IOException {
                e0.checkNotNullParameter(sink, "sink");
                AsyncTimeout asyncTimeout = AsyncTimeout.this;
                Source source2 = source;
                asyncTimeout.enter();
                try {
                    long j11 = source2.read(sink, j10);
                    if (asyncTimeout.exit()) {
                        throw asyncTimeout.access$newTimeoutException(null);
                    }
                    return j11;
                } catch (IOException e10) {
                    if (asyncTimeout.exit()) {
                        throw asyncTimeout.access$newTimeoutException(e10);
                    }
                    throw e10;
                } finally {
                    asyncTimeout.exit();
                }
            }

            public String toString() {
                return "AsyncTimeout.source(" + source + ')';
            }

            @Override // com.applovin.shadow.okio.Source
            public AsyncTimeout timeout() {
                return AsyncTimeout.this;
            }
        };
    }

    public final <T> T withTimeout(a block) throws IOException {
        e0.checkNotNullParameter(block, "block");
        enter();
        try {
            try {
                T t10 = (T) block.invoke();
                b0.finallyStart(1);
                if (exit()) {
                    throw access$newTimeoutException(null);
                }
                b0.finallyEnd(1);
                return t10;
            } catch (IOException e10) {
                if (exit()) {
                    throw access$newTimeoutException(e10);
                }
                throw e10;
            }
        } catch (Throwable th2) {
            b0.finallyStart(1);
            exit();
            b0.finallyEnd(1);
            throw th2;
        }
    }

    public void timedOut() {
    }
}
