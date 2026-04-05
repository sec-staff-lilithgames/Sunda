package com.google.android.exoplayer2.util;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class z0 implements RunnableFuture {

    /* renamed from: b, reason: collision with root package name */
    public final g f28596b = new g();

    /* renamed from: c, reason: collision with root package name */
    public final g f28597c = new g();

    /* renamed from: e, reason: collision with root package name */
    public final Object f28598e = new Object();

    /* renamed from: f, reason: collision with root package name */
    public Exception f28599f;

    /* renamed from: g, reason: collision with root package name */
    public Thread f28600g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f28601h;

    public final void blockUntilFinished() {
        this.f28597c.blockUninterruptible();
    }

    public final void blockUntilStarted() {
        this.f28596b.blockUninterruptible();
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        synchronized (this.f28598e) {
            try {
                if (!this.f28601h && !this.f28597c.isOpen()) {
                    this.f28601h = true;
                    ((af.s) this).f4383i.f4387d.cancel();
                    Thread thread = this.f28600g;
                    if (thread == null) {
                        this.f28596b.open();
                        this.f28597c.open();
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
        this.f28597c.block();
        if (this.f28601h) {
            throw new CancellationException();
        }
        if (this.f28599f == null) {
            return null;
        }
        throw new ExecutionException(this.f28599f);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f28601h;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f28597c.isOpen();
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        synchronized (this.f28598e) {
            try {
                if (this.f28601h) {
                    return;
                }
                this.f28600g = Thread.currentThread();
                this.f28596b.open();
                try {
                    try {
                        ((af.s) this).f4383i.f4387d.cache();
                        synchronized (this.f28598e) {
                            this.f28597c.open();
                            this.f28600g = null;
                            Thread.interrupted();
                        }
                    } catch (Throwable th2) {
                        synchronized (this.f28598e) {
                            this.f28597c.open();
                            this.f28600g = null;
                            Thread.interrupted();
                            throw th2;
                        }
                    }
                } catch (Exception e10) {
                    this.f28599f = e10;
                    synchronized (this.f28598e) {
                        this.f28597c.open();
                        this.f28600g = null;
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
        if (this.f28597c.block(TimeUnit.MILLISECONDS.convert(j10, timeUnit))) {
            if (!this.f28601h) {
                if (this.f28599f == null) {
                    return null;
                }
                throw new ExecutionException(this.f28599f);
            }
            throw new CancellationException();
        }
        throw new TimeoutException();
    }
}
