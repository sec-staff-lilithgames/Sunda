package io.bidmachine.media3.common.util;

import android.os.SystemClock;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class u0 {

    /* renamed from: a, reason: collision with root package name */
    public long f60803a;

    /* renamed from: b, reason: collision with root package name */
    public long f60804b;

    /* renamed from: c, reason: collision with root package name */
    public long f60805c;

    /* renamed from: d, reason: collision with root package name */
    public final ThreadLocal f60806d = new ThreadLocal();

    public u0(long j10) {
        reset(j10);
    }

    public static long ptsToUs(long j10) {
        return a1.scaleLargeTimestamp(j10, 1000000L, 90000L);
    }

    public static long usToNonWrappedPts(long j10) {
        return a1.scaleLargeTimestamp(j10, 90000L, 1000000L);
    }

    public static long usToWrappedPts(long j10) {
        return usToNonWrappedPts(j10) % 8589934592L;
    }

    public synchronized long adjustSampleTimestamp(long j10) {
        if (j10 == C.TIME_UNSET) {
            return C.TIME_UNSET;
        }
        try {
            if (!isInitialized()) {
                long jLongValue = this.f60803a;
                if (jLongValue == 9223372036854775806L) {
                    jLongValue = ((Long) a.checkNotNull((Long) this.f60806d.get())).longValue();
                }
                this.f60804b = jLongValue - j10;
                notifyAll();
            }
            this.f60805c = j10;
            return j10 + this.f60804b;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized long adjustTsTimestamp(long j10) {
        if (j10 == C.TIME_UNSET) {
            return C.TIME_UNSET;
        }
        try {
            long j11 = this.f60805c;
            if (j11 != C.TIME_UNSET) {
                long jUsToNonWrappedPts = usToNonWrappedPts(j11);
                long j12 = (4294967296L + jUsToNonWrappedPts) / 8589934592L;
                long j13 = ((j12 - 1) * 8589934592L) + j10;
                long j14 = (j12 * 8589934592L) + j10;
                j10 = Math.abs(j13 - jUsToNonWrappedPts) < Math.abs(j14 - jUsToNonWrappedPts) ? j13 : j14;
            }
            return adjustSampleTimestamp(ptsToUs(j10));
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized long adjustTsTimestampGreaterThanPreviousTimestamp(long j10) {
        if (j10 == C.TIME_UNSET) {
            return C.TIME_UNSET;
        }
        try {
            long j11 = this.f60805c;
            if (j11 != C.TIME_UNSET) {
                long jUsToNonWrappedPts = usToNonWrappedPts(j11);
                long j12 = jUsToNonWrappedPts / 8589934592L;
                long j13 = (j12 * 8589934592L) + j10;
                j10 = j13 >= jUsToNonWrappedPts ? j13 : ((j12 + 1) * 8589934592L) + j10;
            }
            return adjustSampleTimestamp(ptsToUs(j10));
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized long getFirstSampleTimestampUs() {
        long j10;
        j10 = this.f60803a;
        if (j10 == Long.MAX_VALUE || j10 == 9223372036854775806L) {
            j10 = C.TIME_UNSET;
        }
        return j10;
    }

    public synchronized long getLastAdjustedTimestampUs() {
        long j10;
        try {
            j10 = this.f60805c;
        } catch (Throwable th2) {
            throw th2;
        }
        return j10 != C.TIME_UNSET ? j10 + this.f60804b : getFirstSampleTimestampUs();
    }

    public synchronized long getTimestampOffsetUs() {
        return this.f60804b;
    }

    public synchronized boolean isInitialized() {
        return this.f60804b != C.TIME_UNSET;
    }

    public synchronized void reset(long j10) {
        this.f60803a = j10;
        this.f60804b = j10 == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.f60805c = C.TIME_UNSET;
    }

    public synchronized void sharedInitializeOrWait(boolean z10, long j10, long j11) throws InterruptedException, TimeoutException {
        try {
            a.checkState(this.f60803a == 9223372036854775806L);
            if (isInitialized()) {
                return;
            }
            if (z10) {
                this.f60806d.set(Long.valueOf(j10));
            } else {
                long jElapsedRealtime = 0;
                long j12 = j11;
                while (!isInitialized()) {
                    if (j11 == 0) {
                        wait();
                    } else {
                        a.checkState(j12 > 0);
                        long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                        wait(j12);
                        jElapsedRealtime += SystemClock.elapsedRealtime() - jElapsedRealtime2;
                        if (jElapsedRealtime >= j11 && !isInitialized()) {
                            throw new TimeoutException("TimestampAdjuster failed to initialize in " + j11 + " milliseconds");
                        }
                        j12 = j11 - jElapsedRealtime;
                    }
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
