package com.mbridge.msdk.playercommon.exoplayer2.audio;

import android.media.AudioTrack;
import android.os.SystemClock;
import com.inmobi.commons.core.configs.CrashConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
final class AudioTrackPositionTracker {
    private static final long FORCE_RESET_WORKAROUND_TIMEOUT_MS = 200;
    private static final long MAX_AUDIO_TIMESTAMP_OFFSET_US = 5000000;
    private static final long MAX_LATENCY_US = 5000000;
    private static final int MAX_PLAYHEAD_OFFSET_COUNT = 10;
    private static final int MIN_LATENCY_SAMPLE_INTERVAL_US = 500000;
    private static final int MIN_PLAYHEAD_OFFSET_SAMPLE_INTERVAL_US = 30000;
    private static final int PLAYSTATE_PAUSED = 2;
    private static final int PLAYSTATE_PLAYING = 3;
    private static final int PLAYSTATE_STOPPED = 1;
    private AudioTimestampPoller audioTimestampPoller;
    private AudioTrack audioTrack;
    private int bufferSize;
    private long bufferSizeUs;
    private long endPlaybackHeadPosition;
    private long forceResetWorkaroundTimeMs;
    private boolean hasData;
    private boolean isOutputPcm;
    private long lastLatencySampleTimeUs;
    private long lastPlayheadSampleTimeUs;
    private long lastRawPlaybackHeadPosition;
    private long latencyUs;
    private final Listener listener;
    private boolean needsPassthroughWorkarounds;
    private int nextPlayheadOffsetIndex;
    private int outputPcmFrameSize;
    private int outputSampleRate;
    private long passthroughWorkaroundPauseOffset;
    private int playheadOffsetCount;
    private final long[] playheadOffsets = new long[10];
    private long rawPlaybackHeadWrapCount;
    private long smoothedPlayheadOffsetUs;
    private long stopPlaybackHeadPosition;
    private long stopTimestampUs;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface Listener {
        void onInvalidLatency(long j10);

        void onPositionFramesMismatch(long j10, long j11, long j12, long j13);

        void onSystemTimeUsMismatch(long j10, long j11, long j12, long j13);

        void onUnderrun(int i10, long j10);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @Retention(RetentionPolicy.SOURCE)
    public @interface PlayState {
    }

    public AudioTrackPositionTracker(Listener listener) {
        this.listener = (Listener) Assertions.checkNotNull(listener);
    }

    private boolean forceHasPendingData() {
        return this.needsPassthroughWorkarounds && this.audioTrack.getPlayState() == 2 && getPlaybackHeadPosition() == 0;
    }

    private long framesToDurationUs(long j10) {
        return (j10 * 1000000) / this.outputSampleRate;
    }

    private long getPlaybackHeadPosition() {
        if (this.stopTimestampUs != C.TIME_UNSET) {
            return Math.min(this.endPlaybackHeadPosition, this.stopPlaybackHeadPosition + ((((SystemClock.elapsedRealtime() * 1000) - this.stopTimestampUs) * this.outputSampleRate) / 1000000));
        }
        int playState = this.audioTrack.getPlayState();
        if (playState == 1) {
            return 0L;
        }
        long playbackHeadPosition = this.audioTrack.getPlaybackHeadPosition() & 4294967295L;
        if (this.needsPassthroughWorkarounds) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.passthroughWorkaroundPauseOffset = this.lastRawPlaybackHeadPosition;
            }
            playbackHeadPosition += this.passthroughWorkaroundPauseOffset;
        }
        if (Util.SDK_INT <= 28) {
            if (playbackHeadPosition == 0 && this.lastRawPlaybackHeadPosition > 0 && playState == 3) {
                if (this.forceResetWorkaroundTimeMs == C.TIME_UNSET) {
                    this.forceResetWorkaroundTimeMs = SystemClock.elapsedRealtime();
                }
                return this.lastRawPlaybackHeadPosition;
            }
            this.forceResetWorkaroundTimeMs = C.TIME_UNSET;
        }
        if (this.lastRawPlaybackHeadPosition > playbackHeadPosition) {
            this.rawPlaybackHeadWrapCount++;
        }
        this.lastRawPlaybackHeadPosition = playbackHeadPosition;
        return playbackHeadPosition + (this.rawPlaybackHeadWrapCount << 32);
    }

    private long getPlaybackHeadPositionUs() {
        return framesToDurationUs(getPlaybackHeadPosition());
    }

    private void maybePollAndCheckTimestamp(long j10, long j11) {
        if (this.audioTimestampPoller.maybePollTimestamp(j10)) {
            long timestampSystemTimeUs = this.audioTimestampPoller.getTimestampSystemTimeUs();
            long timestampPositionFrames = this.audioTimestampPoller.getTimestampPositionFrames();
            if (Math.abs(timestampSystemTimeUs - j10) > 5000000) {
                this.listener.onSystemTimeUsMismatch(timestampPositionFrames, timestampSystemTimeUs, j10, j11);
                this.audioTimestampPoller.rejectTimestamp();
            } else if (Math.abs(framesToDurationUs(timestampPositionFrames) - j11) <= 5000000) {
                this.audioTimestampPoller.acceptTimestamp();
            } else {
                this.listener.onPositionFramesMismatch(timestampPositionFrames, timestampSystemTimeUs, j10, j11);
                this.audioTimestampPoller.rejectTimestamp();
            }
        }
    }

    private void maybeSampleSyncParams() {
        long playbackHeadPositionUs = getPlaybackHeadPositionUs();
        if (playbackHeadPositionUs == 0) {
            return;
        }
        long jNanoTime = System.nanoTime() / 1000;
        if (jNanoTime - this.lastPlayheadSampleTimeUs >= CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL) {
            long[] jArr = this.playheadOffsets;
            int i10 = this.nextPlayheadOffsetIndex;
            jArr[i10] = playbackHeadPositionUs - jNanoTime;
            this.nextPlayheadOffsetIndex = (i10 + 1) % 10;
            int i11 = this.playheadOffsetCount;
            if (i11 < 10) {
                this.playheadOffsetCount = i11 + 1;
            }
            this.lastPlayheadSampleTimeUs = jNanoTime;
            this.smoothedPlayheadOffsetUs = 0L;
            int i12 = 0;
            while (true) {
                int i13 = this.playheadOffsetCount;
                if (i12 >= i13) {
                    break;
                }
                this.smoothedPlayheadOffsetUs = (this.playheadOffsets[i12] / i13) + this.smoothedPlayheadOffsetUs;
                i12++;
            }
        }
        if (this.needsPassthroughWorkarounds) {
            return;
        }
        maybePollAndCheckTimestamp(jNanoTime, playbackHeadPositionUs);
        maybeUpdateLatency(jNanoTime);
    }

    private void maybeUpdateLatency(long j10) {
        if (!this.isOutputPcm || j10 - this.lastLatencySampleTimeUs < 500000) {
            return;
        }
        this.latencyUs = 90000L;
        this.lastLatencySampleTimeUs = j10;
    }

    private static boolean needsPassthroughWorkarounds(int i10) {
        if (Util.SDK_INT < 23) {
            return i10 == 5 || i10 == 6;
        }
        return false;
    }

    private void resetSyncParams() {
        this.smoothedPlayheadOffsetUs = 0L;
        this.playheadOffsetCount = 0;
        this.nextPlayheadOffsetIndex = 0;
        this.lastPlayheadSampleTimeUs = 0L;
    }

    public int getAvailableBufferSize(long j10) {
        return this.bufferSize - ((int) (j10 - (getPlaybackHeadPosition() * this.outputPcmFrameSize)));
    }

    public long getCurrentPositionUs(boolean z10) {
        if (this.audioTrack.getPlayState() == 3) {
            maybeSampleSyncParams();
        }
        long jNanoTime = System.nanoTime() / 1000;
        if (this.audioTimestampPoller.hasTimestamp()) {
            long jFramesToDurationUs = framesToDurationUs(this.audioTimestampPoller.getTimestampPositionFrames());
            return !this.audioTimestampPoller.isTimestampAdvancing() ? jFramesToDurationUs : (jNanoTime - this.audioTimestampPoller.getTimestampSystemTimeUs()) + jFramesToDurationUs;
        }
        long playbackHeadPositionUs = this.playheadOffsetCount == 0 ? getPlaybackHeadPositionUs() : jNanoTime + this.smoothedPlayheadOffsetUs;
        return !z10 ? playbackHeadPositionUs - this.latencyUs : playbackHeadPositionUs;
    }

    public void handleEndOfStream(long j10) {
        this.stopPlaybackHeadPosition = getPlaybackHeadPosition();
        this.stopTimestampUs = SystemClock.elapsedRealtime() * 1000;
        this.endPlaybackHeadPosition = j10;
    }

    public boolean hasPendingData(long j10) {
        return j10 > getPlaybackHeadPosition() || forceHasPendingData();
    }

    public boolean isPlaying() {
        return this.audioTrack.getPlayState() == 3;
    }

    public boolean isStalled(long j10) {
        return this.forceResetWorkaroundTimeMs != C.TIME_UNSET && j10 > 0 && SystemClock.elapsedRealtime() - this.forceResetWorkaroundTimeMs >= FORCE_RESET_WORKAROUND_TIMEOUT_MS;
    }

    public boolean mayHandleBuffer(long j10) {
        Listener listener;
        int playState = this.audioTrack.getPlayState();
        if (this.needsPassthroughWorkarounds) {
            if (playState == 2) {
                this.hasData = false;
                return false;
            }
            if (playState == 1 && getPlaybackHeadPosition() == 0) {
                return false;
            }
        }
        boolean z10 = this.hasData;
        boolean zHasPendingData = hasPendingData(j10);
        this.hasData = zHasPendingData;
        if (z10 && !zHasPendingData && playState != 1 && (listener = this.listener) != null) {
            listener.onUnderrun(this.bufferSize, C.usToMs(this.bufferSizeUs));
        }
        return true;
    }

    public boolean pause() {
        resetSyncParams();
        if (this.stopTimestampUs != C.TIME_UNSET) {
            return false;
        }
        this.audioTimestampPoller.reset();
        return true;
    }

    public void reset() {
        resetSyncParams();
        this.audioTrack = null;
        this.audioTimestampPoller = null;
    }

    public void setAudioTrack(AudioTrack audioTrack, int i10, int i11, int i12) {
        this.audioTrack = audioTrack;
        this.outputPcmFrameSize = i11;
        this.bufferSize = i12;
        this.audioTimestampPoller = new AudioTimestampPoller(audioTrack);
        this.outputSampleRate = audioTrack.getSampleRate();
        this.needsPassthroughWorkarounds = needsPassthroughWorkarounds(i10);
        boolean zIsEncodingPcm = Util.isEncodingPcm(i10);
        this.isOutputPcm = zIsEncodingPcm;
        this.bufferSizeUs = zIsEncodingPcm ? framesToDurationUs(i12 / i11) : -9223372036854775807L;
        this.lastRawPlaybackHeadPosition = 0L;
        this.rawPlaybackHeadWrapCount = 0L;
        this.passthroughWorkaroundPauseOffset = 0L;
        this.hasData = false;
        this.stopTimestampUs = C.TIME_UNSET;
        this.forceResetWorkaroundTimeMs = C.TIME_UNSET;
        this.latencyUs = 0L;
    }

    public void start() {
        this.audioTimestampPoller.reset();
    }
}
