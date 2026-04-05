package com.google.android.exoplayer2.audio;

import android.os.SystemClock;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class y0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f27327a;

    /* renamed from: b, reason: collision with root package name */
    public Exception f27328b;

    /* renamed from: c, reason: collision with root package name */
    public long f27329c;

    public y0(long j10) {
        this.f27327a = j10;
    }

    public void clear() {
        this.f27328b = null;
    }

    public void throwExceptionIfDeadlineIsReached(Exception exc) throws Exception {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f27328b == null) {
            this.f27328b = exc;
            this.f27329c = this.f27327a + jElapsedRealtime;
        }
        if (jElapsedRealtime >= this.f27329c) {
            Exception exc2 = this.f27328b;
            if (exc2 != exc) {
                exc2.addSuppressed(exc);
            }
            Exception exc3 = this.f27328b;
            clear();
            throw exc3;
        }
    }
}
