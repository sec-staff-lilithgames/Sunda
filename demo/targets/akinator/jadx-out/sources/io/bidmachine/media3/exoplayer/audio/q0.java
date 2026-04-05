package io.bidmachine.media3.exoplayer.audio;

import android.os.SystemClock;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class q0 {

    /* renamed from: a, reason: collision with root package name */
    public Exception f61007a;

    /* renamed from: b, reason: collision with root package name */
    public long f61008b = C.TIME_UNSET;

    /* renamed from: c, reason: collision with root package name */
    public long f61009c = C.TIME_UNSET;

    public void clear() {
        this.f61007a = null;
        this.f61008b = C.TIME_UNSET;
        this.f61009c = C.TIME_UNSET;
    }

    public boolean shouldWaitBeforeRetry() {
        boolean z10;
        if (this.f61007a != null) {
            synchronized (u0.f61020l0) {
                z10 = u0.f61022n0 > 0;
            }
            if (z10 || SystemClock.elapsedRealtime() < this.f61009c) {
                return true;
            }
        }
        return false;
    }

    public void throwExceptionIfDeadlineIsReached(Exception exc) throws Exception {
        boolean z10;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f61007a == null) {
            this.f61007a = exc;
        }
        if (this.f61008b == C.TIME_UNSET) {
            synchronized (u0.f61020l0) {
                z10 = u0.f61022n0 > 0;
            }
            if (!z10) {
                this.f61008b = 200 + jElapsedRealtime;
            }
        }
        long j10 = this.f61008b;
        if (j10 == C.TIME_UNSET || jElapsedRealtime < j10) {
            this.f61009c = jElapsedRealtime + 50;
            return;
        }
        Exception exc2 = this.f61007a;
        if (exc2 != exc) {
            exc2.addSuppressed(exc);
        }
        Exception exc3 = this.f61007a;
        clear();
        throw exc3;
    }
}
