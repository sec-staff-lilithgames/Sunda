package pw;

import java.io.IOException;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class q0 implements b1 {

    /* renamed from: b, reason: collision with root package name */
    public final d1 f81963b = new d1();

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r0 f81964c;

    public q0(r0 r0Var) {
        this.f81964c = r0Var;
    }

    @Override // pw.b1, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        r0 r0Var = this.f81964c;
        ReentrantLock lock = r0Var.getLock();
        lock.lock();
        try {
            r0Var.setSourceClosed$okio(true);
            r0Var.getCondition().signalAll();
        } finally {
            lock.unlock();
        }
    }

    @Override // pw.b1
    public long read(g sink, long j10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(sink, "sink");
        r0 r0Var = this.f81964c;
        ReentrantLock lock = r0Var.getLock();
        lock.lock();
        try {
            if (r0Var.getSourceClosed$okio()) {
                throw new IllegalStateException("closed");
            }
            if (r0Var.getCanceled$okio()) {
                throw new IOException("canceled");
            }
            while (r0Var.getBuffer$okio().size() == 0) {
                if (r0Var.getSinkClosed$okio()) {
                    lock.unlock();
                    return -1L;
                }
                this.f81963b.awaitSignal(r0Var.getCondition());
                if (r0Var.getCanceled$okio()) {
                    throw new IOException("canceled");
                }
            }
            long j11 = r0Var.getBuffer$okio().read(sink, j10);
            r0Var.getCondition().signalAll();
            lock.unlock();
            return j11;
        } catch (Throwable th2) {
            lock.unlock();
            throw th2;
        }
    }

    @Override // pw.b1
    public d1 timeout() {
        return this.f81963b;
    }
}
