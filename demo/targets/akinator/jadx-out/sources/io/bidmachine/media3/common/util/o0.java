package io.bidmachine.media3.common.util;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class o0 implements RunnableFuture {

    /* renamed from: b, reason: collision with root package name */
    public final j f60762b = new j();

    /* renamed from: c, reason: collision with root package name */
    public final j f60763c = new j();

    /* renamed from: e, reason: collision with root package name */
    public final Object f60764e = new Object();

    /* renamed from: f, reason: collision with root package name */
    public Exception f60765f;

    /* renamed from: g, reason: collision with root package name */
    public Object f60766g;

    /* renamed from: h, reason: collision with root package name */
    public Thread f60767h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f60768i;

    public abstract Object b();

    public final void blockUntilFinished() {
        this.f60763c.blockUninterruptible();
    }

    public final void blockUntilStarted() {
        this.f60762b.blockUninterruptible();
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        synchronized (this.f60764e) {
            try {
                if (!this.f60768i && !this.f60763c.isOpen()) {
                    this.f60768i = true;
                    a();
                    Thread thread = this.f60767h;
                    if (thread == null) {
                        this.f60762b.open();
                        this.f60763c.open();
                    } else if (z10) {
                        thread.interrupt();
                    }
                    return true;
                }
                return false;
            } finally {
            }
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws ExecutionException, InterruptedException {
        this.f60763c.block();
        if (this.f60768i) {
            throw new CancellationException();
        }
        if (this.f60765f == null) {
            return this.f60766g;
        }
        throw new ExecutionException(this.f60765f);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f60768i;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f60763c.isOpen();
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        synchronized (this.f60764e) {
            try {
                if (this.f60768i) {
                    return;
                }
                this.f60767h = Thread.currentThread();
                this.f60762b.open();
                try {
                    try {
                        this.f60766g = b();
                        synchronized (this.f60764e) {
                            this.f60763c.open();
                            this.f60767h = null;
                            Thread.interrupted();
                        }
                    } catch (Throwable th2) {
                        synchronized (this.f60764e) {
                            this.f60763c.open();
                            this.f60767h = null;
                            Thread.interrupted();
                            throw th2;
                        }
                    }
                } catch (Exception e10) {
                    this.f60765f = e10;
                    synchronized (this.f60764e) {
                        this.f60763c.open();
                        this.f60767h = null;
                        Thread.interrupted();
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        if (this.f60763c.block(TimeUnit.MILLISECONDS.convert(j10, timeUnit))) {
            if (!this.f60768i) {
                if (this.f60765f == null) {
                    return this.f60766g;
                }
                throw new ExecutionException(this.f60765f);
            }
            throw new CancellationException();
        }
        throw new TimeoutException();
    }

    public void a() {
    }
}
