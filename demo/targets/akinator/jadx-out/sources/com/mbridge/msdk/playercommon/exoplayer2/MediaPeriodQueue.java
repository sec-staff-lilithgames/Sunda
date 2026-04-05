package com.mbridge.msdk.playercommon.exoplayer2;

import android.util.Pair;
import com.mbridge.msdk.playercommon.exoplayer2.Timeline;
import com.mbridge.msdk.playercommon.exoplayer2.source.MediaPeriod;
import com.mbridge.msdk.playercommon.exoplayer2.source.MediaSource;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.TrackSelector;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.Allocator;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
final class MediaPeriodQueue {
    private static final int MAXIMUM_BUFFER_AHEAD_PERIODS = 100;
    private int length;
    private MediaPeriodHolder loading;
    private long nextWindowSequenceNumber;
    private Object oldFrontPeriodUid;
    private long oldFrontPeriodWindowSequenceNumber;
    private MediaPeriodHolder playing;
    private MediaPeriodHolder reading;
    private int repeatMode;
    private boolean shuffleModeEnabled;
    private Timeline timeline;
    private final Timeline.Period period = new Timeline.Period();
    private final Timeline.Window window = new Timeline.Window();

    private boolean canKeepMediaPeriodHolder(MediaPeriodHolder mediaPeriodHolder, MediaPeriodInfo mediaPeriodInfo) {
        MediaPeriodInfo mediaPeriodInfo2 = mediaPeriodHolder.info;
        return mediaPeriodInfo2.startPositionUs == mediaPeriodInfo.startPositionUs && mediaPeriodInfo2.endPositionUs == mediaPeriodInfo.endPositionUs && mediaPeriodInfo2.f42159id.equals(mediaPeriodInfo.f42159id);
    }

    private MediaPeriodInfo getFirstMediaPeriodInfo(PlaybackInfo playbackInfo) {
        return getMediaPeriodInfo(playbackInfo.periodId, playbackInfo.contentPositionUs, playbackInfo.startPositionUs);
    }

    private MediaPeriodInfo getFollowingMediaPeriodInfo(MediaPeriodHolder mediaPeriodHolder, long j10) {
        MediaPeriodInfo mediaPeriodInfo = mediaPeriodHolder.info;
        if (mediaPeriodInfo.isLastInTimelinePeriod) {
            int nextPeriodIndex = this.timeline.getNextPeriodIndex(mediaPeriodInfo.f42159id.periodIndex, this.period, this.window, this.repeatMode, this.shuffleModeEnabled);
            if (nextPeriodIndex == -1) {
                return null;
            }
            int i10 = this.timeline.getPeriod(nextPeriodIndex, this.period, true).windowIndex;
            Object obj = this.period.uid;
            long j11 = mediaPeriodInfo.f42159id.windowSequenceNumber;
            long jLongValue = 0;
            if (this.timeline.getWindow(i10, this.window).firstPeriodIndex == nextPeriodIndex) {
                Pair<Integer, Long> periodPosition = this.timeline.getPeriodPosition(this.window, this.period, i10, C.TIME_UNSET, Math.max(0L, (mediaPeriodHolder.getRendererOffset() + mediaPeriodInfo.durationUs) - j10));
                if (periodPosition == null) {
                    return null;
                }
                nextPeriodIndex = ((Integer) periodPosition.first).intValue();
                jLongValue = ((Long) periodPosition.second).longValue();
                MediaPeriodHolder mediaPeriodHolder2 = mediaPeriodHolder.next;
                if (mediaPeriodHolder2 == null || !mediaPeriodHolder2.uid.equals(obj)) {
                    j11 = this.nextWindowSequenceNumber;
                    this.nextWindowSequenceNumber = 1 + j11;
                } else {
                    j11 = mediaPeriodHolder.next.info.f42159id.windowSequenceNumber;
                }
            }
            long j12 = jLongValue;
            return getMediaPeriodInfo(resolveMediaPeriodIdForAds(nextPeriodIndex, j12, j11), j12, j12);
        }
        MediaSource.MediaPeriodId mediaPeriodId = mediaPeriodInfo.f42159id;
        this.timeline.getPeriod(mediaPeriodId.periodIndex, this.period);
        if (mediaPeriodId.isAd()) {
            int i11 = mediaPeriodId.adGroupIndex;
            int adCountInAdGroup = this.period.getAdCountInAdGroup(i11);
            if (adCountInAdGroup == -1) {
                return null;
            }
            int nextAdIndexToPlay = this.period.getNextAdIndexToPlay(i11, mediaPeriodId.adIndexInAdGroup);
            if (nextAdIndexToPlay >= adCountInAdGroup) {
                return getMediaPeriodInfoForContent(mediaPeriodId.periodIndex, mediaPeriodInfo.contentPositionUs, mediaPeriodId.windowSequenceNumber);
            }
            if (this.period.isAdAvailable(i11, nextAdIndexToPlay)) {
                return getMediaPeriodInfoForAd(mediaPeriodId.periodIndex, i11, nextAdIndexToPlay, mediaPeriodInfo.contentPositionUs, mediaPeriodId.windowSequenceNumber);
            }
            return null;
        }
        long j13 = mediaPeriodInfo.endPositionUs;
        if (j13 != Long.MIN_VALUE) {
            int adGroupIndexForPositionUs = this.period.getAdGroupIndexForPositionUs(j13);
            if (adGroupIndexForPositionUs == -1) {
                return getMediaPeriodInfoForContent(mediaPeriodId.periodIndex, mediaPeriodInfo.endPositionUs, mediaPeriodId.windowSequenceNumber);
            }
            int firstAdIndexToPlay = this.period.getFirstAdIndexToPlay(adGroupIndexForPositionUs);
            if (this.period.isAdAvailable(adGroupIndexForPositionUs, firstAdIndexToPlay)) {
                return getMediaPeriodInfoForAd(mediaPeriodId.periodIndex, adGroupIndexForPositionUs, firstAdIndexToPlay, mediaPeriodInfo.endPositionUs, mediaPeriodId.windowSequenceNumber);
            }
            return null;
        }
        int adGroupCount = this.period.getAdGroupCount();
        if (adGroupCount == 0) {
            return null;
        }
        int i12 = adGroupCount - 1;
        if (this.period.getAdGroupTimeUs(i12) != Long.MIN_VALUE || this.period.hasPlayedAdGroup(i12)) {
            return null;
        }
        int firstAdIndexToPlay2 = this.period.getFirstAdIndexToPlay(i12);
        if (!this.period.isAdAvailable(i12, firstAdIndexToPlay2)) {
            return null;
        }
        return getMediaPeriodInfoForAd(mediaPeriodId.periodIndex, i12, firstAdIndexToPlay2, this.period.getDurationUs(), mediaPeriodId.windowSequenceNumber);
    }

    private MediaPeriodInfo getMediaPeriodInfo(MediaSource.MediaPeriodId mediaPeriodId, long j10, long j11) {
        this.timeline.getPeriod(mediaPeriodId.periodIndex, this.period);
        if (!mediaPeriodId.isAd()) {
            return getMediaPeriodInfoForContent(mediaPeriodId.periodIndex, j11, mediaPeriodId.windowSequenceNumber);
        }
        if (this.period.isAdAvailable(mediaPeriodId.adGroupIndex, mediaPeriodId.adIndexInAdGroup)) {
            return getMediaPeriodInfoForAd(mediaPeriodId.periodIndex, mediaPeriodId.adGroupIndex, mediaPeriodId.adIndexInAdGroup, j10, mediaPeriodId.windowSequenceNumber);
        }
        return null;
    }

    private MediaPeriodInfo getMediaPeriodInfoForAd(int i10, int i11, int i12, long j10, long j11) {
        MediaSource.MediaPeriodId mediaPeriodId = new MediaSource.MediaPeriodId(i10, i11, i12, j11);
        boolean zIsLastInPeriod = isLastInPeriod(mediaPeriodId, Long.MIN_VALUE);
        boolean zIsLastInTimeline = isLastInTimeline(mediaPeriodId, zIsLastInPeriod);
        return new MediaPeriodInfo(mediaPeriodId, i12 == this.period.getFirstAdIndexToPlay(i11) ? this.period.getAdResumePositionUs() : 0L, Long.MIN_VALUE, j10, this.timeline.getPeriod(mediaPeriodId.periodIndex, this.period).getAdDurationUs(mediaPeriodId.adGroupIndex, mediaPeriodId.adIndexInAdGroup), zIsLastInPeriod, zIsLastInTimeline);
    }

    private MediaPeriodInfo getMediaPeriodInfoForContent(int i10, long j10, long j11) {
        MediaSource.MediaPeriodId mediaPeriodId = new MediaSource.MediaPeriodId(i10, j11);
        this.timeline.getPeriod(mediaPeriodId.periodIndex, this.period);
        int adGroupIndexAfterPositionUs = this.period.getAdGroupIndexAfterPositionUs(j10);
        long adGroupTimeUs = adGroupIndexAfterPositionUs == -1 ? Long.MIN_VALUE : this.period.getAdGroupTimeUs(adGroupIndexAfterPositionUs);
        boolean zIsLastInPeriod = isLastInPeriod(mediaPeriodId, adGroupTimeUs);
        return new MediaPeriodInfo(mediaPeriodId, j10, adGroupTimeUs, C.TIME_UNSET, adGroupTimeUs == Long.MIN_VALUE ? this.period.getDurationUs() : adGroupTimeUs, zIsLastInPeriod, isLastInTimeline(mediaPeriodId, zIsLastInPeriod));
    }

    private boolean isLastInPeriod(MediaSource.MediaPeriodId mediaPeriodId, long j10) {
        int adGroupCount = this.timeline.getPeriod(mediaPeriodId.periodIndex, this.period).getAdGroupCount();
        if (adGroupCount == 0) {
            return true;
        }
        int i10 = adGroupCount - 1;
        boolean zIsAd = mediaPeriodId.isAd();
        if (this.period.getAdGroupTimeUs(i10) != Long.MIN_VALUE) {
            return !zIsAd && j10 == Long.MIN_VALUE;
        }
        int adCountInAdGroup = this.period.getAdCountInAdGroup(i10);
        if (adCountInAdGroup == -1) {
            return false;
        }
        return (zIsAd && mediaPeriodId.adGroupIndex == i10 && mediaPeriodId.adIndexInAdGroup == adCountInAdGroup + (-1)) || (!zIsAd && this.period.getFirstAdIndexToPlay(i10) == adCountInAdGroup);
    }

    private boolean isLastInTimeline(MediaSource.MediaPeriodId mediaPeriodId, boolean z10) {
        return !this.timeline.getWindow(this.timeline.getPeriod(mediaPeriodId.periodIndex, this.period).windowIndex, this.window).isDynamic && this.timeline.isLastPeriod(mediaPeriodId.periodIndex, this.period, this.window, this.repeatMode, this.shuffleModeEnabled) && z10;
    }

    private long resolvePeriodIndexToWindowSequenceNumber(int i10) {
        int indexOfPeriod;
        Object obj = this.timeline.getPeriod(i10, this.period, true).uid;
        int i11 = this.period.windowIndex;
        Object obj2 = this.oldFrontPeriodUid;
        if (obj2 != null && (indexOfPeriod = this.timeline.getIndexOfPeriod(obj2)) != -1 && this.timeline.getPeriod(indexOfPeriod, this.period).windowIndex == i11) {
            return this.oldFrontPeriodWindowSequenceNumber;
        }
        for (MediaPeriodHolder frontPeriod = getFrontPeriod(); frontPeriod != null; frontPeriod = frontPeriod.next) {
            if (frontPeriod.uid.equals(obj)) {
                return frontPeriod.info.f42159id.windowSequenceNumber;
            }
        }
        for (MediaPeriodHolder frontPeriod2 = getFrontPeriod(); frontPeriod2 != null; frontPeriod2 = frontPeriod2.next) {
            int indexOfPeriod2 = this.timeline.getIndexOfPeriod(frontPeriod2.uid);
            if (indexOfPeriod2 != -1 && this.timeline.getPeriod(indexOfPeriod2, this.period).windowIndex == i11) {
                return frontPeriod2.info.f42159id.windowSequenceNumber;
            }
        }
        long j10 = this.nextWindowSequenceNumber;
        this.nextWindowSequenceNumber = 1 + j10;
        return j10;
    }

    private boolean updateForPlaybackModeChange() {
        MediaPeriodHolder mediaPeriodHolder;
        MediaPeriodHolder frontPeriod = getFrontPeriod();
        if (frontPeriod == null) {
            return true;
        }
        while (true) {
            int nextPeriodIndex = this.timeline.getNextPeriodIndex(frontPeriod.info.f42159id.periodIndex, this.period, this.window, this.repeatMode, this.shuffleModeEnabled);
            while (true) {
                mediaPeriodHolder = frontPeriod.next;
                if (mediaPeriodHolder == null || frontPeriod.info.isLastInTimelinePeriod) {
                    break;
                }
                frontPeriod = mediaPeriodHolder;
            }
            if (nextPeriodIndex == -1 || mediaPeriodHolder == null || mediaPeriodHolder.info.f42159id.periodIndex != nextPeriodIndex) {
                break;
            }
            frontPeriod = mediaPeriodHolder;
        }
        boolean zRemoveAfter = removeAfter(frontPeriod);
        MediaPeriodInfo mediaPeriodInfo = frontPeriod.info;
        frontPeriod.info = getUpdatedMediaPeriodInfo(mediaPeriodInfo, mediaPeriodInfo.f42159id);
        return (zRemoveAfter && hasPlayingPeriod()) ? false : true;
    }

    public MediaPeriodHolder advancePlayingPeriod() {
        MediaPeriodHolder mediaPeriodHolder = this.playing;
        if (mediaPeriodHolder != null) {
            if (mediaPeriodHolder == this.reading) {
                this.reading = mediaPeriodHolder.next;
            }
            mediaPeriodHolder.release();
            int i10 = this.length - 1;
            this.length = i10;
            if (i10 == 0) {
                this.loading = null;
                MediaPeriodHolder mediaPeriodHolder2 = this.playing;
                this.oldFrontPeriodUid = mediaPeriodHolder2.uid;
                this.oldFrontPeriodWindowSequenceNumber = mediaPeriodHolder2.info.f42159id.windowSequenceNumber;
            }
            this.playing = this.playing.next;
        } else {
            MediaPeriodHolder mediaPeriodHolder3 = this.loading;
            this.playing = mediaPeriodHolder3;
            this.reading = mediaPeriodHolder3;
        }
        return this.playing;
    }

    public MediaPeriodHolder advanceReadingPeriod() {
        MediaPeriodHolder mediaPeriodHolder = this.reading;
        Assertions.checkState((mediaPeriodHolder == null || mediaPeriodHolder.next == null) ? false : true);
        MediaPeriodHolder mediaPeriodHolder2 = this.reading.next;
        this.reading = mediaPeriodHolder2;
        return mediaPeriodHolder2;
    }

    public void clear(boolean z10) {
        MediaPeriodHolder frontPeriod = getFrontPeriod();
        if (frontPeriod != null) {
            this.oldFrontPeriodUid = z10 ? frontPeriod.uid : null;
            this.oldFrontPeriodWindowSequenceNumber = frontPeriod.info.f42159id.windowSequenceNumber;
            frontPeriod.release();
            removeAfter(frontPeriod);
        } else if (!z10) {
            this.oldFrontPeriodUid = null;
        }
        this.playing = null;
        this.loading = null;
        this.reading = null;
        this.length = 0;
    }

    public MediaPeriod enqueueNextMediaPeriod(RendererCapabilities[] rendererCapabilitiesArr, TrackSelector trackSelector, Allocator allocator, MediaSource mediaSource, Object obj, MediaPeriodInfo mediaPeriodInfo) {
        MediaPeriodInfo mediaPeriodInfo2;
        long rendererOffset;
        MediaPeriodHolder mediaPeriodHolder = this.loading;
        if (mediaPeriodHolder == null) {
            mediaPeriodInfo2 = mediaPeriodInfo;
            rendererOffset = mediaPeriodInfo2.startPositionUs;
        } else {
            mediaPeriodInfo2 = mediaPeriodInfo;
            rendererOffset = mediaPeriodHolder.getRendererOffset() + this.loading.info.durationUs;
        }
        MediaPeriodHolder mediaPeriodHolder2 = new MediaPeriodHolder(rendererCapabilitiesArr, rendererOffset, trackSelector, allocator, mediaSource, obj, mediaPeriodInfo2);
        if (this.loading != null) {
            Assertions.checkState(hasPlayingPeriod());
            this.loading.next = mediaPeriodHolder2;
        }
        this.oldFrontPeriodUid = null;
        this.loading = mediaPeriodHolder2;
        this.length++;
        return mediaPeriodHolder2.mediaPeriod;
    }

    public MediaPeriodHolder getFrontPeriod() {
        return hasPlayingPeriod() ? this.playing : this.loading;
    }

    public MediaPeriodHolder getLoadingPeriod() {
        return this.loading;
    }

    public MediaPeriodInfo getNextMediaPeriodInfo(long j10, PlaybackInfo playbackInfo) {
        MediaPeriodHolder mediaPeriodHolder = this.loading;
        return mediaPeriodHolder == null ? getFirstMediaPeriodInfo(playbackInfo) : getFollowingMediaPeriodInfo(mediaPeriodHolder, j10);
    }

    public MediaPeriodHolder getPlayingPeriod() {
        return this.playing;
    }

    public MediaPeriodHolder getReadingPeriod() {
        return this.reading;
    }

    public MediaPeriodInfo getUpdatedMediaPeriodInfo(MediaPeriodInfo mediaPeriodInfo, int i10) {
        return getUpdatedMediaPeriodInfo(mediaPeriodInfo, mediaPeriodInfo.f42159id.copyWithPeriodIndex(i10));
    }

    public boolean hasPlayingPeriod() {
        return this.playing != null;
    }

    public boolean isLoading(MediaPeriod mediaPeriod) {
        MediaPeriodHolder mediaPeriodHolder = this.loading;
        return mediaPeriodHolder != null && mediaPeriodHolder.mediaPeriod == mediaPeriod;
    }

    public void reevaluateBuffer(long j10) {
        MediaPeriodHolder mediaPeriodHolder = this.loading;
        if (mediaPeriodHolder != null) {
            mediaPeriodHolder.reevaluateBuffer(j10);
        }
    }

    public boolean removeAfter(MediaPeriodHolder mediaPeriodHolder) {
        boolean z10 = false;
        Assertions.checkState(mediaPeriodHolder != null);
        this.loading = mediaPeriodHolder;
        while (true) {
            mediaPeriodHolder = mediaPeriodHolder.next;
            if (mediaPeriodHolder == null) {
                this.loading.next = null;
                return z10;
            }
            if (mediaPeriodHolder == this.reading) {
                this.reading = this.playing;
                z10 = true;
            }
            mediaPeriodHolder.release();
            this.length--;
        }
    }

    public MediaSource.MediaPeriodId resolveMediaPeriodIdForAds(int i10, long j10) {
        return resolveMediaPeriodIdForAds(i10, j10, resolvePeriodIndexToWindowSequenceNumber(i10));
    }

    public void setTimeline(Timeline timeline) {
        this.timeline = timeline;
    }

    public boolean shouldLoadNextMediaPeriod() {
        MediaPeriodHolder mediaPeriodHolder = this.loading;
        if (mediaPeriodHolder != null) {
            return !mediaPeriodHolder.info.isFinal && mediaPeriodHolder.isFullyBuffered() && this.loading.info.durationUs != C.TIME_UNSET && this.length < 100;
        }
        return true;
    }

    public boolean updateQueuedPeriods(MediaSource.MediaPeriodId mediaPeriodId, long j10) {
        boolean zRemoveAfter;
        int i10 = mediaPeriodId.periodIndex;
        MediaPeriodHolder mediaPeriodHolder = null;
        int nextPeriodIndex = i10;
        for (MediaPeriodHolder frontPeriod = getFrontPeriod(); frontPeriod != null; frontPeriod = frontPeriod.next) {
            if (mediaPeriodHolder != null) {
                if (nextPeriodIndex == -1 || !frontPeriod.uid.equals(this.timeline.getPeriod(nextPeriodIndex, this.period, true).uid)) {
                    zRemoveAfter = removeAfter(mediaPeriodHolder);
                    return true ^ zRemoveAfter;
                }
                MediaPeriodInfo followingMediaPeriodInfo = getFollowingMediaPeriodInfo(mediaPeriodHolder, j10);
                if (followingMediaPeriodInfo == null) {
                    zRemoveAfter = removeAfter(mediaPeriodHolder);
                } else {
                    frontPeriod.info = getUpdatedMediaPeriodInfo(frontPeriod.info, nextPeriodIndex);
                    if (!canKeepMediaPeriodHolder(frontPeriod, followingMediaPeriodInfo)) {
                        zRemoveAfter = removeAfter(mediaPeriodHolder);
                    }
                }
                return true ^ zRemoveAfter;
            }
            frontPeriod.info = getUpdatedMediaPeriodInfo(frontPeriod.info, nextPeriodIndex);
            if (frontPeriod.info.isLastInTimelinePeriod) {
                nextPeriodIndex = this.timeline.getNextPeriodIndex(nextPeriodIndex, this.period, this.window, this.repeatMode, this.shuffleModeEnabled);
            }
            mediaPeriodHolder = frontPeriod;
        }
        return true;
    }

    public boolean updateRepeatMode(int i10) {
        this.repeatMode = i10;
        return updateForPlaybackModeChange();
    }

    public boolean updateShuffleModeEnabled(boolean z10) {
        this.shuffleModeEnabled = z10;
        return updateForPlaybackModeChange();
    }

    private MediaSource.MediaPeriodId resolveMediaPeriodIdForAds(int i10, long j10, long j11) {
        this.timeline.getPeriod(i10, this.period);
        int adGroupIndexForPositionUs = this.period.getAdGroupIndexForPositionUs(j10);
        if (adGroupIndexForPositionUs == -1) {
            return new MediaSource.MediaPeriodId(i10, j11);
        }
        return new MediaSource.MediaPeriodId(i10, adGroupIndexForPositionUs, this.period.getFirstAdIndexToPlay(adGroupIndexForPositionUs), j11);
    }

    private MediaPeriodInfo getUpdatedMediaPeriodInfo(MediaPeriodInfo mediaPeriodInfo, MediaSource.MediaPeriodId mediaPeriodId) {
        long j10;
        long durationUs;
        long j11 = mediaPeriodInfo.startPositionUs;
        long j12 = mediaPeriodInfo.endPositionUs;
        boolean zIsLastInPeriod = isLastInPeriod(mediaPeriodId, j12);
        boolean zIsLastInTimeline = isLastInTimeline(mediaPeriodId, zIsLastInPeriod);
        this.timeline.getPeriod(mediaPeriodId.periodIndex, this.period);
        if (mediaPeriodId.isAd()) {
            durationUs = this.period.getAdDurationUs(mediaPeriodId.adGroupIndex, mediaPeriodId.adIndexInAdGroup);
        } else if (j12 == Long.MIN_VALUE) {
            durationUs = this.period.getDurationUs();
        } else {
            j10 = j12;
            return new MediaPeriodInfo(mediaPeriodId, j11, j12, mediaPeriodInfo.contentPositionUs, j10, zIsLastInPeriod, zIsLastInTimeline);
        }
        j10 = durationUs;
        return new MediaPeriodInfo(mediaPeriodId, j11, j12, mediaPeriodInfo.contentPositionUs, j10, zIsLastInPeriod, zIsLastInTimeline);
    }
}
