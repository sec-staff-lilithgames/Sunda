package io.bidmachine.media3.common.util;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    public final g f60726a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f60727b;

    public j() {
        this(g.f60717a);
    }

    public synchronized void block() throws InterruptedException {
        while (!this.f60727b) {
            wait();
        }
    }

    public synchronized void blockUninterruptible() {
        boolean z10 = false;
        while (!this.f60727b) {
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
        z10 = this.f60727b;
        this.f60727b = false;
        return z10;
    }

    public synchronized boolean isOpen() {
        return this.f60727b;
    }

    public synchronized boolean open() {
        if (this.f60727b) {
            return false;
        }
        this.f60727b = true;
        notifyAll();
        return true;
    }

    public j(g gVar) {
        this.f60726a = gVar;
    }

    public synchronized boolean block(long j10) throws InterruptedException {
        if (j10 <= 0) {
            return this.f60727b;
        }
        long jElapsedRealtime = ((q0) this.f60726a).elapsedRealtime();
        long j11 = j10 + jElapsedRealtime;
        if (j11 < jElapsedRealtime) {
            block();
        } else {
            while (!this.f60727b && jElapsedRealtime < j11) {
                wait(j11 - jElapsedRealtime);
                jElapsedRealtime = ((q0) this.f60726a).elapsedRealtime();
            }
        }
        return this.f60727b;
    }
}
