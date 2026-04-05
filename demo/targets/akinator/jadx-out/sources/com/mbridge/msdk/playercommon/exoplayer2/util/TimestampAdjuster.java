package com.mbridge.msdk.playercommon.exoplayer2.util;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class TimestampAdjuster {
    public static final long DO_NOT_OFFSET = Long.MAX_VALUE;
    private static final long MAX_PTS_PLUS_ONE = 8589934592L;
    private long firstSampleTimestampUs;
    private volatile long lastSampleTimestampUs = C.TIME_UNSET;
    private long timestampOffsetUs;

    public TimestampAdjuster(long j10) {
        setFirstSampleTimestampUs(j10);
    }

    public static long ptsToUs(long j10) {
        return (j10 * 1000000) / 90000;
    }

    public static long usToPts(long j10) {
        return (j10 * 90000) / 1000000;
    }

    public long adjustSampleTimestamp(long j10) {
        if (j10 == C.TIME_UNSET) {
            return C.TIME_UNSET;
        }
        if (this.lastSampleTimestampUs != C.TIME_UNSET) {
            this.lastSampleTimestampUs = j10;
        } else {
            long j11 = this.firstSampleTimestampUs;
            if (j11 != Long.MAX_VALUE) {
                this.timestampOffsetUs = j11 - j10;
            }
            synchronized (this) {
                this.lastSampleTimestampUs = j10;
                notifyAll();
            }
        }
        return j10 + this.timestampOffsetUs;
    }

    public long adjustTsTimestamp(long j10) {
        if (j10 == C.TIME_UNSET) {
            return C.TIME_UNSET;
        }
        if (this.lastSampleTimestampUs != C.TIME_UNSET) {
            long jUsToPts = usToPts(this.lastSampleTimestampUs);
            long j11 = (4294967296L + jUsToPts) / MAX_PTS_PLUS_ONE;
            long j12 = ((j11 - 1) * MAX_PTS_PLUS_ONE) + j10;
            j10 += j11 * MAX_PTS_PLUS_ONE;
            if (Math.abs(j12 - jUsToPts) < Math.abs(j10 - jUsToPts)) {
                j10 = j12;
            }
        }
        return adjustSampleTimestamp(ptsToUs(j10));
    }

    public long getFirstSampleTimestampUs() {
        return this.firstSampleTimestampUs;
    }

    public long getLastAdjustedTimestampUs() {
        if (this.lastSampleTimestampUs != C.TIME_UNSET) {
            return this.lastSampleTimestampUs + this.timestampOffsetUs;
        }
        long j10 = this.firstSampleTimestampUs;
        return j10 != Long.MAX_VALUE ? j10 : C.TIME_UNSET;
    }

    public long getTimestampOffsetUs() {
        if (this.firstSampleTimestampUs == Long.MAX_VALUE) {
            return 0L;
        }
        return this.lastSampleTimestampUs == C.TIME_UNSET ? C.TIME_UNSET : this.timestampOffsetUs;
    }

    public void reset() {
        this.lastSampleTimestampUs = C.TIME_UNSET;
    }

    public synchronized void setFirstSampleTimestampUs(long j10) {
        Assertions.checkState(this.lastSampleTimestampUs == C.TIME_UNSET);
        this.firstSampleTimestampUs = j10;
    }

    public synchronized void waitUntilInitialized() throws InterruptedException {
        while (this.lastSampleTimestampUs == C.TIME_UNSET) {
            wait();
        }
    }
}
