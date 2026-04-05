package com.mbridge.msdk.playercommon.exoplayer2;

import android.util.Log;
import com.mbridge.msdk.playercommon.exoplayer2.source.ClippingMediaPeriod;
import com.mbridge.msdk.playercommon.exoplayer2.source.EmptySampleStream;
import com.mbridge.msdk.playercommon.exoplayer2.source.MediaPeriod;
import com.mbridge.msdk.playercommon.exoplayer2.source.MediaSource;
import com.mbridge.msdk.playercommon.exoplayer2.source.SampleStream;
import com.mbridge.msdk.playercommon.exoplayer2.source.TrackGroupArray;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.TrackSelection;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.TrackSelectionArray;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.TrackSelector;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.TrackSelectorResult;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.Allocator;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
final class MediaPeriodHolder {
    private static final String TAG = "MediaPeriodHolder";
    public boolean hasEnabledTracks;
    public MediaPeriodInfo info;
    public final boolean[] mayRetainStreamFlags;
    public final MediaPeriod mediaPeriod;
    private final MediaSource mediaSource;
    public MediaPeriodHolder next;
    private TrackSelectorResult periodTrackSelectorResult;
    public boolean prepared;
    private final RendererCapabilities[] rendererCapabilities;
    public long rendererPositionOffsetUs;
    public final SampleStream[] sampleStreams;
    public TrackGroupArray trackGroups;
    private final TrackSelector trackSelector;
    public TrackSelectorResult trackSelectorResult;
    public final Object uid;

    public MediaPeriodHolder(RendererCapabilities[] rendererCapabilitiesArr, long j10, TrackSelector trackSelector, Allocator allocator, MediaSource mediaSource, Object obj, MediaPeriodInfo mediaPeriodInfo) {
        this.rendererCapabilities = rendererCapabilitiesArr;
        this.rendererPositionOffsetUs = j10 - mediaPeriodInfo.startPositionUs;
        this.trackSelector = trackSelector;
        this.mediaSource = mediaSource;
        this.uid = Assertions.checkNotNull(obj);
        this.info = mediaPeriodInfo;
        this.sampleStreams = new SampleStream[rendererCapabilitiesArr.length];
        this.mayRetainStreamFlags = new boolean[rendererCapabilitiesArr.length];
        MediaPeriod mediaPeriodCreatePeriod = mediaSource.createPeriod(mediaPeriodInfo.f42159id, allocator);
        long j11 = mediaPeriodInfo.endPositionUs;
        this.mediaPeriod = j11 != Long.MIN_VALUE ? new ClippingMediaPeriod(mediaPeriodCreatePeriod, true, 0L, j11) : mediaPeriodCreatePeriod;
    }

    private void associateNoSampleRenderersWithEmptySampleStream(SampleStream[] sampleStreamArr) {
        int i10 = 0;
        while (true) {
            RendererCapabilities[] rendererCapabilitiesArr = this.rendererCapabilities;
            if (i10 >= rendererCapabilitiesArr.length) {
                return;
            }
            if (rendererCapabilitiesArr[i10].getTrackType() == 5 && this.trackSelectorResult.isRendererEnabled(i10)) {
                sampleStreamArr[i10] = new EmptySampleStream();
            }
            i10++;
        }
    }

    private void disableTrackSelectionsInResult(TrackSelectorResult trackSelectorResult) {
        for (int i10 = 0; i10 < trackSelectorResult.length; i10++) {
            boolean zIsRendererEnabled = trackSelectorResult.isRendererEnabled(i10);
            TrackSelection trackSelection = trackSelectorResult.selections.get(i10);
            if (zIsRendererEnabled && trackSelection != null) {
                trackSelection.disable();
            }
        }
    }

    private void disassociateNoSampleRenderersWithEmptySampleStream(SampleStream[] sampleStreamArr) {
        int i10 = 0;
        while (true) {
            RendererCapabilities[] rendererCapabilitiesArr = this.rendererCapabilities;
            if (i10 >= rendererCapabilitiesArr.length) {
                return;
            }
            if (rendererCapabilitiesArr[i10].getTrackType() == 5) {
                sampleStreamArr[i10] = null;
            }
            i10++;
        }
    }

    private void enableTrackSelectionsInResult(TrackSelectorResult trackSelectorResult) {
        for (int i10 = 0; i10 < trackSelectorResult.length; i10++) {
            boolean zIsRendererEnabled = trackSelectorResult.isRendererEnabled(i10);
            TrackSelection trackSelection = trackSelectorResult.selections.get(i10);
            if (zIsRendererEnabled && trackSelection != null) {
                trackSelection.enable();
            }
        }
    }

    private void updatePeriodTrackSelectorResult(TrackSelectorResult trackSelectorResult) {
        TrackSelectorResult trackSelectorResult2 = this.periodTrackSelectorResult;
        if (trackSelectorResult2 != null) {
            disableTrackSelectionsInResult(trackSelectorResult2);
        }
        this.periodTrackSelectorResult = trackSelectorResult;
        if (trackSelectorResult != null) {
            enableTrackSelectionsInResult(trackSelectorResult);
        }
    }

    public long applyTrackSelection(long j10, boolean z10) {
        return applyTrackSelection(j10, z10, new boolean[this.rendererCapabilities.length]);
    }

    public void continueLoading(long j10) {
        this.mediaPeriod.continueLoading(toPeriodTime(j10));
    }

    public long getBufferedPositionUs(boolean z10) {
        if (!this.prepared) {
            return this.info.startPositionUs;
        }
        long bufferedPositionUs = this.mediaPeriod.getBufferedPositionUs();
        return (bufferedPositionUs == Long.MIN_VALUE && z10) ? this.info.durationUs : bufferedPositionUs;
    }

    public long getDurationUs() {
        return this.info.durationUs;
    }

    public long getNextLoadPositionUs() {
        if (this.prepared) {
            return this.mediaPeriod.getNextLoadPositionUs();
        }
        return 0L;
    }

    public long getRendererOffset() {
        return this.rendererPositionOffsetUs;
    }

    public void handlePrepared(float f10) throws ExoPlaybackException {
        this.prepared = true;
        this.trackGroups = this.mediaPeriod.getTrackGroups();
        selectTracks(f10);
        long jApplyTrackSelection = applyTrackSelection(this.info.startPositionUs, false);
        long j10 = this.rendererPositionOffsetUs;
        MediaPeriodInfo mediaPeriodInfo = this.info;
        this.rendererPositionOffsetUs = (mediaPeriodInfo.startPositionUs - jApplyTrackSelection) + j10;
        this.info = mediaPeriodInfo.copyWithStartPositionUs(jApplyTrackSelection);
    }

    public boolean isFullyBuffered() {
        if (this.prepared) {
            return !this.hasEnabledTracks || this.mediaPeriod.getBufferedPositionUs() == Long.MIN_VALUE;
        }
        return false;
    }

    public void reevaluateBuffer(long j10) {
        if (this.prepared) {
            this.mediaPeriod.reevaluateBuffer(toPeriodTime(j10));
        }
    }

    public void release() {
        updatePeriodTrackSelectorResult(null);
        try {
            if (this.info.endPositionUs != Long.MIN_VALUE) {
                this.mediaSource.releasePeriod(((ClippingMediaPeriod) this.mediaPeriod).mediaPeriod);
            } else {
                this.mediaSource.releasePeriod(this.mediaPeriod);
            }
        } catch (RuntimeException e10) {
            Log.e(TAG, "Period release failed.", e10);
        }
    }

    public boolean selectTracks(float f10) throws ExoPlaybackException {
        TrackSelectorResult trackSelectorResultSelectTracks = this.trackSelector.selectTracks(this.rendererCapabilities, this.trackGroups);
        if (trackSelectorResultSelectTracks.isEquivalent(this.periodTrackSelectorResult)) {
            return false;
        }
        this.trackSelectorResult = trackSelectorResultSelectTracks;
        for (TrackSelection trackSelection : trackSelectorResultSelectTracks.selections.getAll()) {
            if (trackSelection != null) {
                trackSelection.onPlaybackSpeed(f10);
            }
        }
        return true;
    }

    public long toPeriodTime(long j10) {
        return j10 - getRendererOffset();
    }

    public long toRendererTime(long j10) {
        return j10 + getRendererOffset();
    }

    public long applyTrackSelection(long j10, boolean z10, boolean[] zArr) {
        int i10 = 0;
        while (true) {
            TrackSelectorResult trackSelectorResult = this.trackSelectorResult;
            boolean z11 = true;
            if (i10 >= trackSelectorResult.length) {
                break;
            }
            boolean[] zArr2 = this.mayRetainStreamFlags;
            if (z10 || !trackSelectorResult.isEquivalent(this.periodTrackSelectorResult, i10)) {
                z11 = false;
            }
            zArr2[i10] = z11;
            i10++;
        }
        disassociateNoSampleRenderersWithEmptySampleStream(this.sampleStreams);
        updatePeriodTrackSelectorResult(this.trackSelectorResult);
        TrackSelectionArray trackSelectionArray = this.trackSelectorResult.selections;
        long jSelectTracks = this.mediaPeriod.selectTracks(trackSelectionArray.getAll(), this.mayRetainStreamFlags, this.sampleStreams, zArr, j10);
        associateNoSampleRenderersWithEmptySampleStream(this.sampleStreams);
        this.hasEnabledTracks = false;
        int i11 = 0;
        while (true) {
            SampleStream[] sampleStreamArr = this.sampleStreams;
            if (i11 >= sampleStreamArr.length) {
                return jSelectTracks;
            }
            if (sampleStreamArr[i11] != null) {
                Assertions.checkState(this.trackSelectorResult.isRendererEnabled(i11));
                if (this.rendererCapabilities[i11].getTrackType() != 5) {
                    this.hasEnabledTracks = true;
                }
            } else {
                Assertions.checkState(trackSelectionArray.get(i11) == null);
            }
            i11++;
        }
    }
}
