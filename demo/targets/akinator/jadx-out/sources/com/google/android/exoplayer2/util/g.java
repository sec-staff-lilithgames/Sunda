package com.google.android.exoplayer2.util;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public final d f28452a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f28453b;

    public g() {
        this(d.f28436a);
    }

    public synchronized void block() throws InterruptedException {
        while (!this.f28453b) {
            wait();
        }
    }

    public synchronized void blockUninterruptible() {
        boolean z10 = false;
        while (!this.f28453b) {
            try {
                wait();
            } catch (InterruptedException unused) {
                z10 = true;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
    }

    public synchronized boolean close() {
        boolean z10;
        z10 = this.f28453b;
        this.f28453b = false;
        return z10;
    }

    public synchronized boolean isOpen() {
        return this.f28453b;
    }

    public synchronized boolean open() {
        if (this.f28453b) {
            return false;
        }
        this.f28453b = true;
        notifyAll();
        return true;
    }

    public g(d dVar) {
        this.f28452a = dVar;
    }

    public synchronized boolean block(long j10) throws InterruptedException {
        if (j10 <= 0) {
            return this.f28453b;
        }
        long jElapsedRealtime = ((d1) this.f28452a).elapsedRealtime();
        long j11 = j10 + jElapsedRealtime;
        if (j11 < jElapsedRealtime) {
            block();
        } else {
            while (!this.f28453b && jElapsedRealtime < j11) {
                wait(j11 - jElapsedRealtime);
                jElapsedRealtime = ((d1) this.f28452a).elapsedRealtime();
            }
        }
        return this.f28453b;
    }
}
