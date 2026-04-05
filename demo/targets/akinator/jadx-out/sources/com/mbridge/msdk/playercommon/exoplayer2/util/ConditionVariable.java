package com.mbridge.msdk.playercommon.exoplayer2.util;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class ConditionVariable {
    private boolean isOpen;

    public synchronized void block() throws InterruptedException {
        while (!this.isOpen) {
            wait();
        }
    }

    public synchronized boolean close() {
        boolean z10;
        z10 = this.isOpen;
        this.isOpen = false;
        return z10;
    }

    public synchronized boolean open() {
        if (this.isOpen) {
            return false;
        }
        this.isOpen = true;
        notifyAll();
        return true;
    }

    public synchronized boolean block(long j10) throws InterruptedException {
        boolean z10;
        long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
        long j11 = j10 + jElapsedRealtime;
        while (true) {
            z10 = this.isOpen;
            if (z10 || jElapsedRealtime >= j11) {
                break;
            }
            wait(j11 - jElapsedRealtime);
            jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
        }
        return z10;
    }
}
