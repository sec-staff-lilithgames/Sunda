package io.odeeo.internal.q0;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    public long f65851a;

    /* renamed from: b, reason: collision with root package name */
    public long f65852b;

    /* renamed from: c, reason: collision with root package name */
    public long f65853c;

    /* renamed from: d, reason: collision with root package name */
    public final ThreadLocal<Long> f65854d = new ThreadLocal<>();

    public e0(long j10) {
        reset(j10);
    }

    public static long ptsToUs(long j10) {
        return (j10 * 1000000) / 90000;
    }

    public static long usToNonWrappedPts(long j10) {
        return (j10 * 90000) / 1000000;
    }

    public static long usToWrappedPts(long j10) {
        return usToNonWrappedPts(j10) % 8589934592L;
    }

    public synchronized long adjustSampleTimestamp(long j10) {
        if (j10 == C.TIME_UNSET) {
            return C.TIME_UNSET;
        }
        try {
            if (this.f65852b == C.TIME_UNSET) {
                long jLongValue = this.f65851a;
                if (jLongValue == 9223372036854775806L) {
                    jLongValue = ((Long) a.checkNotNull(this.f65854d.get())).longValue();
                }
                this.f65852b = jLongValue - j10;
                notifyAll();
            }
            this.f65853c = j10;
            return j10 + this.f65852b;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized long adjustTsTimestamp(long j10) {
        if (j10 == C.TIME_UNSET) {
            return C.TIME_UNSET;
        }
        try {
            long j11 = this.f65853c;
            if (j11 != C.TIME_UNSET) {
                long jUsToNonWrappedPts = usToNonWrappedPts(j11);
                long j12 = (4294967296L + jUsToNonWrappedPts) / 8589934592L;
                long j13 = ((j12 - 1) * 8589934592L) + j10;
                j10 += j12 * 8589934592L;
                if (Math.abs(j13 - jUsToNonWrappedPts) < Math.abs(j10 - jUsToNonWrappedPts)) {
                    j10 = j13;
                }
            }
            return adjustSampleTimestamp(ptsToUs(j10));
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized long getFirstSampleTimestampUs() {
        long j10;
        j10 = this.f65851a;
        if (j10 == Long.MAX_VALUE || j10 == 9223372036854775806L) {
            j10 = C.TIME_UNSET;
        }
        return j10;
    }

    public synchronized long getLastAdjustedTimestampUs() {
        long j10;
        try {
            j10 = this.f65853c;
        } catch (Throwable th2) {
            throw th2;
        }
        return j10 != C.TIME_UNSET ? j10 + this.f65852b : getFirstSampleTimestampUs();
    }

    public synchronized long getTimestampOffsetUs() {
        return this.f65852b;
    }

    public synchronized void reset(long j10) {
        this.f65851a = j10;
        this.f65852b = j10 == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.f65853c = C.TIME_UNSET;
    }

    public synchronized void sharedInitializeOrWait(boolean z10, long j10) throws InterruptedException {
        try {
            a.checkState(this.f65851a == 9223372036854775806L);
            if (this.f65852b != C.TIME_UNSET) {
                return;
            }
            if (z10) {
                this.f65854d.set(Long.valueOf(j10));
            } else {
                while (this.f65852b == C.TIME_UNSET) {
                    wait();
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
