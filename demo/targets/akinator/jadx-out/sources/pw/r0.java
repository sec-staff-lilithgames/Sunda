package pw;

import java.io.IOException;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class r0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f81967a;

    /* renamed from: b, reason: collision with root package name */
    public final g f81968b = new g();

    /* renamed from: c, reason: collision with root package name */
    public boolean f81969c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f81970d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f81971e;

    /* renamed from: f, reason: collision with root package name */
    public z0 f81972f;

    /* renamed from: g, reason: collision with root package name */
    public final ReentrantLock f81973g;

    /* renamed from: h, reason: collision with root package name */
    public final Condition f81974h;

    /* renamed from: i, reason: collision with root package name */
    public final p0 f81975i;

    /* renamed from: j, reason: collision with root package name */
    public final q0 f81976j;

    public r0(long j10) {
        this.f81967a = j10;
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f81973g = reentrantLock;
        Condition conditionNewCondition = reentrantLock.newCondition();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(conditionNewCondition, "newCondition(...)");
        this.f81974h = conditionNewCondition;
        if (j10 < 1) {
            throw new IllegalArgumentException(o2.m(j10, "maxBufferSize < 1: ").toString());
        }
        this.f81975i = new p0(this);
        this.f81976j = new q0(this);
    }

    @tu.f
    /* renamed from: -deprecated_sink, reason: not valid java name */
    public final z0 m5893deprecated_sink() {
        return this.f81975i;
    }

    @tu.f
    /* renamed from: -deprecated_source, reason: not valid java name */
    public final b1 m5894deprecated_source() {
        return this.f81976j;
    }

    public final void cancel() {
        ReentrantLock reentrantLock = this.f81973g;
        reentrantLock.lock();
        try {
            this.f81969c = true;
            this.f81968b.clear();
            this.f81974h.signalAll();
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void fold(z0 sink) throws IOException {
        g gVar;
        boolean z10;
        g gVar2 = this.f81968b;
        kotlin.jvm.internal.e0.checkNotNullParameter(sink, "sink");
        while (true) {
            ReentrantLock reentrantLock = this.f81973g;
            reentrantLock.lock();
            try {
                if (this.f81972f != null) {
                    throw new IllegalStateException("sink already folded");
                }
                if (this.f81969c) {
                    this.f81972f = sink;
                    throw new IOException("canceled");
                }
                boolean z11 = this.f81970d;
                boolean zExhausted = gVar2.exhausted();
                Condition condition = this.f81974h;
                g gVar3 = null;
                if (zExhausted) {
                    this.f81971e = true;
                    this.f81972f = sink;
                    gVar = null;
                    z10 = true;
                } else {
                    gVar = new g();
                    gVar.write(gVar2, gVar2.size());
                    condition.signalAll();
                    z10 = false;
                }
                if (z10) {
                    if (z11) {
                        sink.close();
                        return;
                    }
                    return;
                }
                if (gVar == null) {
                    try {
                        kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("sinkBuffer");
                    } catch (Throwable th2) {
                        reentrantLock.lock();
                        try {
                            this.f81971e = true;
                            condition.signalAll();
                            throw th2;
                        } finally {
                            reentrantLock.unlock();
                        }
                    }
                } else {
                    gVar3 = gVar;
                }
                sink.write(gVar3, gVar.size());
                sink.flush();
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final g getBuffer$okio() {
        return this.f81968b;
    }

    public final boolean getCanceled$okio() {
        return this.f81969c;
    }

    public final Condition getCondition() {
        return this.f81974h;
    }

    public final z0 getFoldedSink$okio() {
        return this.f81972f;
    }

    public final ReentrantLock getLock() {
        return this.f81973g;
    }

    public final long getMaxBufferSize$okio() {
        return this.f81967a;
    }

    public final boolean getSinkClosed$okio() {
        return this.f81970d;
    }

    public final boolean getSourceClosed$okio() {
        return this.f81971e;
    }

    public final void setCanceled$okio(boolean z10) {
        this.f81969c = z10;
    }

    public final void setFoldedSink$okio(z0 z0Var) {
        this.f81972f = z0Var;
    }

    public final void setSinkClosed$okio(boolean z10) {
        this.f81970d = z10;
    }

    public final void setSourceClosed$okio(boolean z10) {
        this.f81971e = z10;
    }

    public final z0 sink() {
        return this.f81975i;
    }

    public final b1 source() {
        return this.f81976j;
    }
}
