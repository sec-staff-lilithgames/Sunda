package com.mbridge.msdk.playercommon.exoplayer2.source;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.ExoPlayer;
import com.mbridge.msdk.playercommon.exoplayer2.Timeline;
import com.mbridge.msdk.playercommon.exoplayer2.source.MediaSource;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.Allocator;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class ClippingMediaSource extends CompositeMediaSource<Void> {
    private final boolean allowDynamicClippingUpdates;
    private IllegalClippingException clippingError;
    private ClippingTimeline clippingTimeline;
    private final boolean enableInitialDiscontinuity;
    private final long endUs;
    private Object manifest;
    private final ArrayList<ClippingMediaPeriod> mediaPeriods;
    private final MediaSource mediaSource;
    private long periodEndUs;
    private long periodStartUs;
    private final boolean relativeToDefaultPosition;
    private final long startUs;
    private final Timeline.Window window;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class ClippingTimeline extends ForwardingTimeline {
        private final long durationUs;
        private final long endUs;
        private final boolean isDynamic;
        private final long startUs;

        public ClippingTimeline(Timeline timeline, long j10, long j11) throws IllegalClippingException {
            super(timeline);
            boolean z10 = false;
            if (timeline.getPeriodCount() != 1) {
                throw new IllegalClippingException(0);
            }
            Timeline.Window window = timeline.getWindow(0, new Timeline.Window(), false);
            long jMax = Math.max(0L, j10);
            long jMax2 = j11 == Long.MIN_VALUE ? window.durationUs : Math.max(0L, j11);
            long j12 = window.durationUs;
            long j13 = C.TIME_UNSET;
            if (j12 != C.TIME_UNSET) {
                jMax2 = jMax2 > j12 ? j12 : jMax2;
                if (jMax != 0 && !window.isSeekable) {
                    throw new IllegalClippingException(1);
                }
                if (jMax > jMax2) {
                    throw new IllegalClippingException(2);
                }
            }
            this.startUs = jMax;
            this.endUs = jMax2;
            this.durationUs = jMax2 != C.TIME_UNSET ? jMax2 - jMax : j13;
            if (window.isDynamic && (jMax2 == C.TIME_UNSET || (j12 != C.TIME_UNSET && jMax2 == j12))) {
                z10 = true;
            }
            this.isDynamic = z10;
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.source.ForwardingTimeline, com.mbridge.msdk.playercommon.exoplayer2.Timeline
        public Timeline.Period getPeriod(int i10, Timeline.Period period, boolean z10) {
            this.timeline.getPeriod(0, period, z10);
            long positionInWindowUs = period.getPositionInWindowUs() - this.startUs;
            long j10 = this.durationUs;
            long j11 = C.TIME_UNSET;
            if (j10 != C.TIME_UNSET) {
                j11 = j10 - positionInWindowUs;
            }
            return period.set(period.f42160id, period.uid, 0, j11, positionInWindowUs);
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.source.ForwardingTimeline, com.mbridge.msdk.playercommon.exoplayer2.Timeline
        public Timeline.Window getWindow(int i10, Timeline.Window window, boolean z10, long j10) {
            this.timeline.getWindow(0, window, z10, 0L);
            long j11 = window.positionInFirstPeriodUs;
            long j12 = this.startUs;
            window.positionInFirstPeriodUs = j11 + j12;
            window.durationUs = this.durationUs;
            window.isDynamic = this.isDynamic;
            long j13 = window.defaultPositionUs;
            if (j13 != C.TIME_UNSET) {
                long jMax = Math.max(j13, j12);
                window.defaultPositionUs = jMax;
                long j14 = this.endUs;
                if (j14 != C.TIME_UNSET) {
                    jMax = Math.min(jMax, j14);
                }
                window.defaultPositionUs = jMax - this.startUs;
            }
            long jUsToMs = C.usToMs(this.startUs);
            long j15 = window.presentationStartTimeMs;
            if (j15 != C.TIME_UNSET) {
                window.presentationStartTimeMs = j15 + jUsToMs;
            }
            long j16 = window.windowStartTimeMs;
            if (j16 != C.TIME_UNSET) {
                window.windowStartTimeMs = j16 + jUsToMs;
            }
            return window;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class IllegalClippingException extends IOException {
        public static final int REASON_INVALID_PERIOD_COUNT = 0;
        public static final int REASON_NOT_SEEKABLE_TO_START = 1;
        public static final int REASON_START_EXCEEDS_END = 2;
        public final int reason;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        @Retention(RetentionPolicy.SOURCE)
        public @interface Reason {
        }

        public IllegalClippingException(int i10) {
            super("Illegal clipping: " + getReasonDescription(i10));
            this.reason = i10;
        }

        private static String getReasonDescription(int i10) {
            return i10 != 0 ? i10 != 1 ? i10 != 2 ? "unknown" : "start exceeds end" : "not seekable to start" : "invalid period count";
        }
    }

    public ClippingMediaSource(MediaSource mediaSource, long j10, long j11) {
        this(mediaSource, j10, j11, true, false, false);
    }

    private void refreshClippedTimeline(Timeline timeline) {
        long j10;
        long j11;
        timeline.getWindow(0, this.window);
        long positionInFirstPeriodUs = this.window.getPositionInFirstPeriodUs();
        if (this.clippingTimeline == null || this.mediaPeriods.isEmpty() || this.allowDynamicClippingUpdates) {
            long j12 = this.startUs;
            long j13 = this.endUs;
            if (this.relativeToDefaultPosition) {
                long defaultPositionUs = this.window.getDefaultPositionUs();
                j12 += defaultPositionUs;
                j13 += defaultPositionUs;
            }
            this.periodStartUs = positionInFirstPeriodUs + j12;
            this.periodEndUs = this.endUs != Long.MIN_VALUE ? positionInFirstPeriodUs + j13 : Long.MIN_VALUE;
            int size = this.mediaPeriods.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.mediaPeriods.get(i10).updateClipping(this.periodStartUs, this.periodEndUs);
            }
            j10 = j12;
            j11 = j13;
        } else {
            long j14 = this.periodStartUs - positionInFirstPeriodUs;
            j11 = this.endUs != Long.MIN_VALUE ? this.periodEndUs - positionInFirstPeriodUs : Long.MIN_VALUE;
            j10 = j14;
        }
        try {
            ClippingTimeline clippingTimeline = new ClippingTimeline(timeline, j10, j11);
            this.clippingTimeline = clippingTimeline;
            refreshSourceInfo(clippingTimeline, this.manifest);
        } catch (IllegalClippingException e10) {
            this.clippingError = e10;
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaSource
    public MediaPeriod createPeriod(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator) {
        ClippingMediaPeriod clippingMediaPeriod = new ClippingMediaPeriod(this.mediaSource.createPeriod(mediaPeriodId, allocator), this.enableInitialDiscontinuity, this.periodStartUs, this.periodEndUs);
        this.mediaPeriods.add(clippingMediaPeriod);
        return clippingMediaPeriod;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.CompositeMediaSource, com.mbridge.msdk.playercommon.exoplayer2.source.MediaSource
    public void maybeThrowSourceInfoRefreshError() throws IOException {
        IllegalClippingException illegalClippingException = this.clippingError;
        if (illegalClippingException != null) {
            throw illegalClippingException;
        }
        super.maybeThrowSourceInfoRefreshError();
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.CompositeMediaSource, com.mbridge.msdk.playercommon.exoplayer2.source.BaseMediaSource
    public void prepareSourceInternal(ExoPlayer exoPlayer, boolean z10) {
        super.prepareSourceInternal(exoPlayer, z10);
        prepareChildSource(null, this.mediaSource);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaSource
    public void releasePeriod(MediaPeriod mediaPeriod) {
        Assertions.checkState(this.mediaPeriods.remove(mediaPeriod));
        this.mediaSource.releasePeriod(((ClippingMediaPeriod) mediaPeriod).mediaPeriod);
        if (!this.mediaPeriods.isEmpty() || this.allowDynamicClippingUpdates) {
            return;
        }
        refreshClippedTimeline(this.clippingTimeline.timeline);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.CompositeMediaSource, com.mbridge.msdk.playercommon.exoplayer2.source.BaseMediaSource
    public void releaseSourceInternal() {
        super.releaseSourceInternal();
        this.clippingError = null;
        this.clippingTimeline = null;
    }

    @Deprecated
    public ClippingMediaSource(MediaSource mediaSource, long j10, long j11, boolean z10) {
        this(mediaSource, j10, j11, z10, false, false);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.CompositeMediaSource
    public long getMediaTimeForChildMediaTime(Void r72, long j10) {
        if (j10 == C.TIME_UNSET) {
            return C.TIME_UNSET;
        }
        long jUsToMs = C.usToMs(this.startUs);
        long jMax = Math.max(0L, j10 - jUsToMs);
        long j11 = this.endUs;
        return j11 != Long.MIN_VALUE ? Math.min(C.usToMs(j11) - jUsToMs, jMax) : jMax;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.CompositeMediaSource
    public void onChildSourceInfoRefreshed(Void r12, MediaSource mediaSource, Timeline timeline, Object obj) {
        if (this.clippingError != null) {
            return;
        }
        this.manifest = obj;
        refreshClippedTimeline(timeline);
    }

    public ClippingMediaSource(MediaSource mediaSource, long j10) {
        this(mediaSource, 0L, j10, true, false, true);
    }

    public ClippingMediaSource(MediaSource mediaSource, long j10, long j11, boolean z10, boolean z11, boolean z12) {
        Assertions.checkArgument(j10 >= 0);
        this.mediaSource = (MediaSource) Assertions.checkNotNull(mediaSource);
        this.startUs = j10;
        this.endUs = j11;
        this.enableInitialDiscontinuity = z10;
        this.allowDynamicClippingUpdates = z11;
        this.relativeToDefaultPosition = z12;
        this.mediaPeriods = new ArrayList<>();
        this.window = new Timeline.Window();
    }
}
