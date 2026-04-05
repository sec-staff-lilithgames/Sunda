package io.odeeo.internal.q0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public final d f65859a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f65860b;

    public g() {
        this(d.f65844a);
    }

    public synchronized void block() throws InterruptedException {
        while (!this.f65860b) {
            wait();
        }
    }

    public synchronized void blockUninterruptible() {
        boolean z10 = false;
        while (!this.f65860b) {
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
        z10 = this.f65860b;
        this.f65860b = false;
        return z10;
    }

    public synchronized boolean isOpen() {
        return this.f65860b;
    }

    public synchronized boolean open() {
        if (this.f65860b) {
            return false;
        }
        this.f65860b = true;
        notifyAll();
        return true;
    }

    public g(d dVar) {
        this.f65859a = dVar;
    }

    public synchronized boolean block(long j10) throws InterruptedException {
        if (j10 <= 0) {
            return this.f65860b;
        }
        long jElapsedRealtime = this.f65859a.elapsedRealtime();
        long j11 = j10 + jElapsedRealtime;
        if (j11 < jElapsedRealtime) {
            block();
        } else {
            while (!this.f65860b && jElapsedRealtime < j11) {
                wait(j11 - jElapsedRealtime);
                jElapsedRealtime = this.f65859a.elapsedRealtime();
            }
        }
        return this.f65860b;
    }
}
