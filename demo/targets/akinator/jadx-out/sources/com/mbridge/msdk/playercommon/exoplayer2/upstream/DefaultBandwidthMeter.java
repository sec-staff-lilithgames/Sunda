package com.mbridge.msdk.playercommon.exoplayer2.upstream;

import android.os.Handler;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.BandwidthMeter;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import com.mbridge.msdk.playercommon.exoplayer2.util.Clock;
import com.mbridge.msdk.playercommon.exoplayer2.util.SlidingPercentile;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class DefaultBandwidthMeter implements BandwidthMeter, TransferListener<Object> {
    private static final int BYTES_TRANSFERRED_FOR_ESTIMATE = 524288;
    public static final long DEFAULT_INITIAL_BITRATE_ESTIMATE = 1000000;
    public static final int DEFAULT_SLIDING_WINDOW_MAX_WEIGHT = 2000;
    private static final int ELAPSED_MILLIS_FOR_ESTIMATE = 2000;
    private long bitrateEstimate;
    private final Clock clock;
    private final Handler eventHandler;
    private final BandwidthMeter.EventListener eventListener;
    private long sampleBytesTransferred;
    private long sampleStartTimeMs;
    private final SlidingPercentile slidingPercentile;
    private int streamCount;
    private long totalBytesTransferred;
    private long totalElapsedTimeMs;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Builder {
        private Handler eventHandler;
        private BandwidthMeter.EventListener eventListener;
        private long initialBitrateEstimate = 1000000;
        private int slidingWindowMaxWeight = 2000;
        private Clock clock = Clock.DEFAULT;

        public DefaultBandwidthMeter build() {
            return new DefaultBandwidthMeter(this.eventHandler, this.eventListener, this.initialBitrateEstimate, this.slidingWindowMaxWeight, this.clock);
        }

        public Builder setClock(Clock clock) {
            this.clock = clock;
            return this;
        }

        public Builder setEventListener(Handler handler, BandwidthMeter.EventListener eventListener) {
            Assertions.checkArgument((handler == null || eventListener == null) ? false : true);
            this.eventHandler = handler;
            this.eventListener = eventListener;
            return this;
        }

        public Builder setInitialBitrateEstimate(long j10) {
            this.initialBitrateEstimate = j10;
            return this;
        }

        public Builder setSlidingWindowMaxWeight(int i10) {
            this.slidingWindowMaxWeight = i10;
            return this;
        }
    }

    private void notifyBandwidthSample(final int i10, final long j10, final long j11) {
        Handler handler = this.eventHandler;
        if (handler == null || this.eventListener == null) {
            return;
        }
        handler.post(new Runnable() { // from class: com.mbridge.msdk.playercommon.exoplayer2.upstream.DefaultBandwidthMeter.1
            @Override // java.lang.Runnable
            public void run() {
                DefaultBandwidthMeter.this.eventListener.onBandwidthSample(i10, j10, j11);
            }
        });
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.BandwidthMeter
    public synchronized long getBitrateEstimate() {
        return this.bitrateEstimate;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.TransferListener
    public synchronized void onBytesTransferred(Object obj, int i10) {
        this.sampleBytesTransferred += i10;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.TransferListener
    public synchronized void onTransferEnd(Object obj) throws Throwable {
        Throwable th2;
        try {
            try {
                Assertions.checkState(this.streamCount > 0);
                long jElapsedRealtime = this.clock.elapsedRealtime();
                int i10 = (int) (jElapsedRealtime - this.sampleStartTimeMs);
                this.totalElapsedTimeMs += i10;
                long j10 = this.totalBytesTransferred;
                long j11 = this.sampleBytesTransferred;
                this.totalBytesTransferred = j10 + j11;
                if (i10 > 0) {
                    try {
                        this.slidingPercentile.addSample((int) Math.sqrt(j11), (8000 * j11) / r7);
                        if (this.totalElapsedTimeMs >= 2000 || this.totalBytesTransferred >= 524288) {
                            this.bitrateEstimate = (long) this.slidingPercentile.getPercentile(0.5f);
                        }
                    } catch (Throwable th3) {
                        th2 = th3;
                        throw th2;
                    }
                }
                notifyBandwidthSample(i10, this.sampleBytesTransferred, this.bitrateEstimate);
                int i11 = this.streamCount - 1;
                this.streamCount = i11;
                if (i11 > 0) {
                    this.sampleStartTimeMs = jElapsedRealtime;
                }
                this.sampleBytesTransferred = 0L;
            } catch (Throwable th4) {
                th = th4;
                th2 = th;
                throw th2;
            }
        } catch (Throwable th5) {
            th = th5;
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.TransferListener
    public synchronized void onTransferStart(Object obj, DataSpec dataSpec) {
        try {
            if (this.streamCount == 0) {
                this.sampleStartTimeMs = this.clock.elapsedRealtime();
            }
            this.streamCount++;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public DefaultBandwidthMeter() {
        this(null, null, 1000000L, 2000, Clock.DEFAULT);
    }

    @Deprecated
    public DefaultBandwidthMeter(Handler handler, BandwidthMeter.EventListener eventListener) {
        this(handler, eventListener, 1000000L, 2000, Clock.DEFAULT);
    }

    @Deprecated
    public DefaultBandwidthMeter(Handler handler, BandwidthMeter.EventListener eventListener, int i10) {
        this(handler, eventListener, 1000000L, i10, Clock.DEFAULT);
    }

    private DefaultBandwidthMeter(Handler handler, BandwidthMeter.EventListener eventListener, long j10, int i10, Clock clock) {
        this.eventHandler = handler;
        this.eventListener = eventListener;
        this.slidingPercentile = new SlidingPercentile(i10);
        this.clock = clock;
        this.bitrateEstimate = j10;
    }
}
