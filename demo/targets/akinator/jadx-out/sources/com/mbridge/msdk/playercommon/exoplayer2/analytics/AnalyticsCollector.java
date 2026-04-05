package com.mbridge.msdk.playercommon.exoplayer2.analytics;

import android.net.NetworkInfo;
import android.view.Surface;
import com.mbridge.msdk.playercommon.exoplayer2.ExoPlaybackException;
import com.mbridge.msdk.playercommon.exoplayer2.Format;
import com.mbridge.msdk.playercommon.exoplayer2.PlaybackParameters;
import com.mbridge.msdk.playercommon.exoplayer2.Player;
import com.mbridge.msdk.playercommon.exoplayer2.Timeline;
import com.mbridge.msdk.playercommon.exoplayer2.analytics.AnalyticsListener;
import com.mbridge.msdk.playercommon.exoplayer2.audio.AudioRendererEventListener;
import com.mbridge.msdk.playercommon.exoplayer2.decoder.DecoderCounters;
import com.mbridge.msdk.playercommon.exoplayer2.drm.DefaultDrmSessionEventListener;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.Metadata;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.MetadataOutput;
import com.mbridge.msdk.playercommon.exoplayer2.source.MediaSource;
import com.mbridge.msdk.playercommon.exoplayer2.source.MediaSourceEventListener;
import com.mbridge.msdk.playercommon.exoplayer2.source.TrackGroupArray;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.TrackSelectionArray;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.BandwidthMeter;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import com.mbridge.msdk.playercommon.exoplayer2.util.Clock;
import com.mbridge.msdk.playercommon.exoplayer2.video.VideoRendererEventListener;
import j1.o2;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class AnalyticsCollector implements Player.EventListener, MetadataOutput, AudioRendererEventListener, VideoRendererEventListener, MediaSourceEventListener, BandwidthMeter.EventListener, DefaultDrmSessionEventListener {
    private final Clock clock;
    private Player player;
    private final CopyOnWriteArraySet<AnalyticsListener> listeners = new CopyOnWriteArraySet<>();
    private final MediaPeriodQueueTracker mediaPeriodQueueTracker = new MediaPeriodQueueTracker();
    private final Timeline.Window window = new Timeline.Window();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class Factory {
        public AnalyticsCollector createAnalyticsCollector(Player player, Clock clock) {
            return new AnalyticsCollector(player, clock);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class MediaPeriodQueueTracker {
        private boolean isSeeking;
        private WindowAndMediaPeriodId lastReportedPlayingMediaPeriod;
        private WindowAndMediaPeriodId readingMediaPeriod;
        private final ArrayList<WindowAndMediaPeriodId> activeMediaPeriods = new ArrayList<>();
        private final Timeline.Period period = new Timeline.Period();
        private Timeline timeline = Timeline.EMPTY;

        private void updateLastReportedPlayingMediaPeriod() {
            if (this.activeMediaPeriods.isEmpty()) {
                return;
            }
            this.lastReportedPlayingMediaPeriod = this.activeMediaPeriods.get(0);
        }

        private WindowAndMediaPeriodId updateMediaPeriodToNewTimeline(WindowAndMediaPeriodId windowAndMediaPeriodId, Timeline timeline) {
            int indexOfPeriod;
            return (timeline.isEmpty() || this.timeline.isEmpty() || (indexOfPeriod = timeline.getIndexOfPeriod(this.timeline.getPeriod(windowAndMediaPeriodId.mediaPeriodId.periodIndex, this.period, true).uid)) == -1) ? windowAndMediaPeriodId : new WindowAndMediaPeriodId(timeline.getPeriod(indexOfPeriod, this.period).windowIndex, windowAndMediaPeriodId.mediaPeriodId.copyWithPeriodIndex(indexOfPeriod));
        }

        public WindowAndMediaPeriodId getLastReportedPlayingMediaPeriod() {
            return this.lastReportedPlayingMediaPeriod;
        }

        public WindowAndMediaPeriodId getLoadingMediaPeriod() {
            if (this.activeMediaPeriods.isEmpty()) {
                return null;
            }
            return (WindowAndMediaPeriodId) o2.e(1, this.activeMediaPeriods);
        }

        public WindowAndMediaPeriodId getPlayingMediaPeriod() {
            if (this.activeMediaPeriods.isEmpty() || this.timeline.isEmpty() || this.isSeeking) {
                return null;
            }
            return this.activeMediaPeriods.get(0);
        }

        public WindowAndMediaPeriodId getReadingMediaPeriod() {
            return this.readingMediaPeriod;
        }

        public boolean isSeeking() {
            return this.isSeeking;
        }

        public void onMediaPeriodCreated(int i10, MediaSource.MediaPeriodId mediaPeriodId) {
            this.activeMediaPeriods.add(new WindowAndMediaPeriodId(i10, mediaPeriodId));
            if (this.activeMediaPeriods.size() != 1 || this.timeline.isEmpty()) {
                return;
            }
            updateLastReportedPlayingMediaPeriod();
        }

        public void onMediaPeriodReleased(int i10, MediaSource.MediaPeriodId mediaPeriodId) {
            WindowAndMediaPeriodId windowAndMediaPeriodId = new WindowAndMediaPeriodId(i10, mediaPeriodId);
            this.activeMediaPeriods.remove(windowAndMediaPeriodId);
            if (windowAndMediaPeriodId.equals(this.readingMediaPeriod)) {
                this.readingMediaPeriod = this.activeMediaPeriods.isEmpty() ? null : this.activeMediaPeriods.get(0);
            }
        }

        public void onPositionDiscontinuity(int i10) {
            updateLastReportedPlayingMediaPeriod();
        }

        public void onReadingStarted(int i10, MediaSource.MediaPeriodId mediaPeriodId) {
            this.readingMediaPeriod = new WindowAndMediaPeriodId(i10, mediaPeriodId);
        }

        public void onSeekProcessed() {
            this.isSeeking = false;
            updateLastReportedPlayingMediaPeriod();
        }

        public void onSeekStarted() {
            this.isSeeking = true;
        }

        public void onTimelineChanged(Timeline timeline) {
            for (int i10 = 0; i10 < this.activeMediaPeriods.size(); i10++) {
                ArrayList<WindowAndMediaPeriodId> arrayList = this.activeMediaPeriods;
                arrayList.set(i10, updateMediaPeriodToNewTimeline(arrayList.get(i10), timeline));
            }
            WindowAndMediaPeriodId windowAndMediaPeriodId = this.readingMediaPeriod;
            if (windowAndMediaPeriodId != null) {
                this.readingMediaPeriod = updateMediaPeriodToNewTimeline(windowAndMediaPeriodId, timeline);
            }
            this.timeline = timeline;
            updateLastReportedPlayingMediaPeriod();
        }

        public MediaSource.MediaPeriodId tryResolveWindowIndex(int i10) {
            Timeline timeline = this.timeline;
            if (timeline == null) {
                return null;
            }
            int periodCount = timeline.getPeriodCount();
            MediaSource.MediaPeriodId mediaPeriodId = null;
            for (int i11 = 0; i11 < this.activeMediaPeriods.size(); i11++) {
                WindowAndMediaPeriodId windowAndMediaPeriodId = this.activeMediaPeriods.get(i11);
                int i12 = windowAndMediaPeriodId.mediaPeriodId.periodIndex;
                if (i12 < periodCount && this.timeline.getPeriod(i12, this.period).windowIndex == i10) {
                    if (mediaPeriodId != null) {
                        return null;
                    }
                    mediaPeriodId = windowAndMediaPeriodId.mediaPeriodId;
                }
            }
            return mediaPeriodId;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class WindowAndMediaPeriodId {
        public final MediaSource.MediaPeriodId mediaPeriodId;
        public final int windowIndex;

        public WindowAndMediaPeriodId(int i10, MediaSource.MediaPeriodId mediaPeriodId) {
            this.windowIndex = i10;
            this.mediaPeriodId = mediaPeriodId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && WindowAndMediaPeriodId.class == obj.getClass()) {
                WindowAndMediaPeriodId windowAndMediaPeriodId = (WindowAndMediaPeriodId) obj;
                if (this.windowIndex == windowAndMediaPeriodId.windowIndex && this.mediaPeriodId.equals(windowAndMediaPeriodId.mediaPeriodId)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return this.mediaPeriodId.hashCode() + (this.windowIndex * 31);
        }
    }

    public AnalyticsCollector(Player player, Clock clock) {
        this.player = player;
        this.clock = (Clock) Assertions.checkNotNull(clock);
    }

    private AnalyticsListener.EventTime generateLastReportedPlayingMediaPeriodEventTime() {
        return generateEventTime(this.mediaPeriodQueueTracker.getLastReportedPlayingMediaPeriod());
    }

    private AnalyticsListener.EventTime generateLoadingMediaPeriodEventTime() {
        return generateEventTime(this.mediaPeriodQueueTracker.getLoadingMediaPeriod());
    }

    private AnalyticsListener.EventTime generatePlayingMediaPeriodEventTime() {
        return generateEventTime(this.mediaPeriodQueueTracker.getPlayingMediaPeriod());
    }

    private AnalyticsListener.EventTime generateReadingMediaPeriodEventTime() {
        return generateEventTime(this.mediaPeriodQueueTracker.getReadingMediaPeriod());
    }

    public void addListener(AnalyticsListener analyticsListener) {
        this.listeners.add(analyticsListener);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.mbridge.msdk.playercommon.exoplayer2.analytics.AnalyticsListener.EventTime generateEventTime(int r14, com.mbridge.msdk.playercommon.exoplayer2.source.MediaSource.MediaPeriodId r15) {
        /*
            r13 = this;
            com.mbridge.msdk.playercommon.exoplayer2.Player r0 = r13.player
            com.mbridge.msdk.playercommon.exoplayer2.util.Assertions.checkNotNull(r0)
            com.mbridge.msdk.playercommon.exoplayer2.util.Clock r0 = r13.clock
            long r2 = r0.elapsedRealtime()
            com.mbridge.msdk.playercommon.exoplayer2.Player r0 = r13.player
            com.mbridge.msdk.playercommon.exoplayer2.Timeline r4 = r0.getCurrentTimeline()
            com.mbridge.msdk.playercommon.exoplayer2.Player r0 = r13.player
            int r0 = r0.getCurrentWindowIndex()
            if (r14 != r0) goto L44
            if (r15 == 0) goto L3d
            boolean r0 = r15.isAd()
            if (r0 == 0) goto L3d
            com.mbridge.msdk.playercommon.exoplayer2.Player r0 = r13.player
            int r0 = r0.getCurrentAdGroupIndex()
            int r1 = r15.adGroupIndex
            if (r0 != r1) goto L5e
            com.mbridge.msdk.playercommon.exoplayer2.Player r0 = r13.player
            int r0 = r0.getCurrentAdIndexInAdGroup()
            int r1 = r15.adIndexInAdGroup
            if (r0 != r1) goto L5e
            com.mbridge.msdk.playercommon.exoplayer2.Player r0 = r13.player
            long r0 = r0.getCurrentPosition()
        L3b:
            r7 = r0
            goto L61
        L3d:
            com.mbridge.msdk.playercommon.exoplayer2.Player r0 = r13.player
            long r0 = r0.getContentPosition()
            goto L3b
        L44:
            int r0 = r4.getWindowCount()
            if (r14 >= r0) goto L5e
            if (r15 == 0) goto L53
            boolean r0 = r15.isAd()
            if (r0 == 0) goto L53
            goto L5e
        L53:
            com.mbridge.msdk.playercommon.exoplayer2.Timeline$Window r0 = r13.window
            com.mbridge.msdk.playercommon.exoplayer2.Timeline$Window r0 = r4.getWindow(r14, r0)
            long r0 = r0.getDefaultPositionMs()
            goto L3b
        L5e:
            r0 = 0
            goto L3b
        L61:
            com.mbridge.msdk.playercommon.exoplayer2.Player r0 = r13.player
            long r0 = r0.getBufferedPosition()
            com.mbridge.msdk.playercommon.exoplayer2.Player r5 = r13.player
            long r5 = r5.getContentPosition()
            long r11 = r0 - r5
            com.mbridge.msdk.playercommon.exoplayer2.analytics.AnalyticsListener$EventTime r1 = new com.mbridge.msdk.playercommon.exoplayer2.analytics.AnalyticsListener$EventTime
            com.mbridge.msdk.playercommon.exoplayer2.Player r0 = r13.player
            long r9 = r0.getCurrentPosition()
            r5 = r14
            r6 = r15
            r1.<init>(r2, r4, r5, r6, r7, r9, r11)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.playercommon.exoplayer2.analytics.AnalyticsCollector.generateEventTime(int, com.mbridge.msdk.playercommon.exoplayer2.source.MediaSource$MediaPeriodId):com.mbridge.msdk.playercommon.exoplayer2.analytics.AnalyticsListener$EventTime");
    }

    public Set<AnalyticsListener> getListeners() {
        return Collections.unmodifiableSet(this.listeners);
    }

    public final void notifyNetworkTypeChanged(NetworkInfo networkInfo) {
        AnalyticsListener.EventTime eventTimeGeneratePlayingMediaPeriodEventTime = generatePlayingMediaPeriodEventTime();
        Iterator<AnalyticsListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onNetworkTypeChanged(eventTimeGeneratePlayingMediaPeriodEventTime, networkInfo);
        }
    }

    public final void notifySeekStarted() {
        if (this.mediaPeriodQueueTracker.isSeeking()) {
            return;
        }
        AnalyticsListener.EventTime eventTimeGeneratePlayingMediaPeriodEventTime = generatePlayingMediaPeriodEventTime();
        this.mediaPeriodQueueTracker.onSeekStarted();
        Iterator<AnalyticsListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onSeekStarted(eventTimeGeneratePlayingMediaPeriodEventTime);
        }
    }

    public final void notifyViewportSizeChanged(int i10, int i11) {
        AnalyticsListener.EventTime eventTimeGeneratePlayingMediaPeriodEventTime = generatePlayingMediaPeriodEventTime();
        Iterator<AnalyticsListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onViewportSizeChange(eventTimeGeneratePlayingMediaPeriodEventTime, i10, i11);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.audio.AudioRendererEventListener
    public final void onAudioDecoderInitialized(String str, long j10, long j11) {
        AnalyticsListener.EventTime eventTimeGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        Iterator<AnalyticsListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onDecoderInitialized(eventTimeGenerateReadingMediaPeriodEventTime, 1, str, j11);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.audio.AudioRendererEventListener
    public final void onAudioDisabled(DecoderCounters decoderCounters) {
        AnalyticsListener.EventTime eventTimeGenerateLastReportedPlayingMediaPeriodEventTime = generateLastReportedPlayingMediaPeriodEventTime();
        Iterator<AnalyticsListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onDecoderDisabled(eventTimeGenerateLastReportedPlayingMediaPeriodEventTime, 1, decoderCounters);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.audio.AudioRendererEventListener
    public final void onAudioEnabled(DecoderCounters decoderCounters) {
        AnalyticsListener.EventTime eventTimeGeneratePlayingMediaPeriodEventTime = generatePlayingMediaPeriodEventTime();
        Iterator<AnalyticsListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onDecoderEnabled(eventTimeGeneratePlayingMediaPeriodEventTime, 1, decoderCounters);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.audio.AudioRendererEventListener
    public final void onAudioInputFormatChanged(Format format) {
        AnalyticsListener.EventTime eventTimeGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        Iterator<AnalyticsListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onDecoderInputFormatChanged(eventTimeGenerateReadingMediaPeriodEventTime, 1, format);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.audio.AudioRendererEventListener
    public final void onAudioSessionId(int i10) {
        AnalyticsListener.EventTime eventTimeGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        Iterator<AnalyticsListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onAudioSessionId(eventTimeGenerateReadingMediaPeriodEventTime, i10);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.audio.AudioRendererEventListener
    public final void onAudioSinkUnderrun(int i10, long j10, long j11) {
        AnalyticsListener.EventTime eventTimeGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        Iterator<AnalyticsListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onAudioUnderrun(eventTimeGenerateReadingMediaPeriodEventTime, i10, j10, j11);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.BandwidthMeter.EventListener
    public final void onBandwidthSample(int i10, long j10, long j11) {
        AnalyticsListener.EventTime eventTimeGenerateLoadingMediaPeriodEventTime = generateLoadingMediaPeriodEventTime();
        Iterator<AnalyticsListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onBandwidthEstimate(eventTimeGenerateLoadingMediaPeriodEventTime, i10, j10, j11);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaSourceEventListener
    public final void onDownstreamFormatChanged(int i10, MediaSource.MediaPeriodId mediaPeriodId, MediaSourceEventListener.MediaLoadData mediaLoadData) {
        AnalyticsListener.EventTime eventTimeGenerateEventTime = generateEventTime(i10, mediaPeriodId);
        Iterator<AnalyticsListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onDownstreamFormatChanged(eventTimeGenerateEventTime, mediaLoadData);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.drm.DefaultDrmSessionEventListener
    public final void onDrmKeysLoaded() {
        AnalyticsListener.EventTime eventTimeGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        Iterator<AnalyticsListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onDrmKeysLoaded(eventTimeGenerateReadingMediaPeriodEventTime);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.drm.DefaultDrmSessionEventListener
    public final void onDrmKeysRemoved() {
        AnalyticsListener.EventTime eventTimeGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        Iterator<AnalyticsListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onDrmKeysRemoved(eventTimeGenerateReadingMediaPeriodEventTime);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.drm.DefaultDrmSessionEventListener
    public final void onDrmKeysRestored() {
        AnalyticsListener.EventTime eventTimeGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        Iterator<AnalyticsListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onDrmKeysRestored(eventTimeGenerateReadingMediaPeriodEventTime);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.drm.DefaultDrmSessionEventListener
    public final void onDrmSessionManagerError(Exception exc) {
        AnalyticsListener.EventTime eventTimeGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        Iterator<AnalyticsListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onDrmSessionManagerError(eventTimeGenerateReadingMediaPeriodEventTime, exc);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.video.VideoRendererEventListener
    public final void onDroppedFrames(int i10, long j10) {
        AnalyticsListener.EventTime eventTimeGenerateLastReportedPlayingMediaPeriodEventTime = generateLastReportedPlayingMediaPeriodEventTime();
        Iterator<AnalyticsListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onDroppedVideoFrames(eventTimeGenerateLastReportedPlayingMediaPeriodEventTime, i10, j10);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaSourceEventListener
    public final void onLoadCanceled(int i10, MediaSource.MediaPeriodId mediaPeriodId, MediaSourceEventListener.LoadEventInfo loadEventInfo, MediaSourceEventListener.MediaLoadData mediaLoadData) {
        AnalyticsListener.EventTime eventTimeGenerateEventTime = generateEventTime(i10, mediaPeriodId);
        Iterator<AnalyticsListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onLoadCanceled(eventTimeGenerateEventTime, loadEventInfo, mediaLoadData);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaSourceEventListener
    public final void onLoadCompleted(int i10, MediaSource.MediaPeriodId mediaPeriodId, MediaSourceEventListener.LoadEventInfo loadEventInfo, MediaSourceEventListener.MediaLoadData mediaLoadData) {
        AnalyticsListener.EventTime eventTimeGenerateEventTime = generateEventTime(i10, mediaPeriodId);
        Iterator<AnalyticsListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onLoadCompleted(eventTimeGenerateEventTime, loadEventInfo, mediaLoadData);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaSourceEventListener
    public final void onLoadError(int i10, MediaSource.MediaPeriodId mediaPeriodId, MediaSourceEventListener.LoadEventInfo loadEventInfo, MediaSourceEventListener.MediaLoadData mediaLoadData, IOException iOException, boolean z10) {
        AnalyticsListener.EventTime eventTimeGenerateEventTime = generateEventTime(i10, mediaPeriodId);
        Iterator<AnalyticsListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onLoadError(eventTimeGenerateEventTime, loadEventInfo, mediaLoadData, iOException, z10);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaSourceEventListener
    public final void onLoadStarted(int i10, MediaSource.MediaPeriodId mediaPeriodId, MediaSourceEventListener.LoadEventInfo loadEventInfo, MediaSourceEventListener.MediaLoadData mediaLoadData) {
        AnalyticsListener.EventTime eventTimeGenerateEventTime = generateEventTime(i10, mediaPeriodId);
        Iterator<AnalyticsListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onLoadStarted(eventTimeGenerateEventTime, loadEventInfo, mediaLoadData);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public final void onLoadingChanged(boolean z10) {
        AnalyticsListener.EventTime eventTimeGeneratePlayingMediaPeriodEventTime = generatePlayingMediaPeriodEventTime();
        Iterator<AnalyticsListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onLoadingChanged(eventTimeGeneratePlayingMediaPeriodEventTime, z10);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaSourceEventListener
    public final void onMediaPeriodCreated(int i10, MediaSource.MediaPeriodId mediaPeriodId) {
        this.mediaPeriodQueueTracker.onMediaPeriodCreated(i10, mediaPeriodId);
        AnalyticsListener.EventTime eventTimeGenerateEventTime = generateEventTime(i10, mediaPeriodId);
        Iterator<AnalyticsListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onMediaPeriodCreated(eventTimeGenerateEventTime);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaSourceEventListener
    public final void onMediaPeriodReleased(int i10, MediaSource.MediaPeriodId mediaPeriodId) {
        this.mediaPeriodQueueTracker.onMediaPeriodReleased(i10, mediaPeriodId);
        AnalyticsListener.EventTime eventTimeGenerateEventTime = generateEventTime(i10, mediaPeriodId);
        Iterator<AnalyticsListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onMediaPeriodReleased(eventTimeGenerateEventTime);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.metadata.MetadataOutput
    public final void onMetadata(Metadata metadata) {
        AnalyticsListener.EventTime eventTimeGeneratePlayingMediaPeriodEventTime = generatePlayingMediaPeriodEventTime();
        Iterator<AnalyticsListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onMetadata(eventTimeGeneratePlayingMediaPeriodEventTime, metadata);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public final void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
        AnalyticsListener.EventTime eventTimeGeneratePlayingMediaPeriodEventTime = generatePlayingMediaPeriodEventTime();
        Iterator<AnalyticsListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onPlaybackParametersChanged(eventTimeGeneratePlayingMediaPeriodEventTime, playbackParameters);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public final void onPlayerError(ExoPlaybackException exoPlaybackException) {
        AnalyticsListener.EventTime eventTimeGeneratePlayingMediaPeriodEventTime = generatePlayingMediaPeriodEventTime();
        Iterator<AnalyticsListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onPlayerError(eventTimeGeneratePlayingMediaPeriodEventTime, exoPlaybackException);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public final void onPlayerStateChanged(boolean z10, int i10) {
        AnalyticsListener.EventTime eventTimeGeneratePlayingMediaPeriodEventTime = generatePlayingMediaPeriodEventTime();
        Iterator<AnalyticsListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onPlayerStateChanged(eventTimeGeneratePlayingMediaPeriodEventTime, z10, i10);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public final void onPositionDiscontinuity(int i10) {
        this.mediaPeriodQueueTracker.onPositionDiscontinuity(i10);
        AnalyticsListener.EventTime eventTimeGeneratePlayingMediaPeriodEventTime = generatePlayingMediaPeriodEventTime();
        Iterator<AnalyticsListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onPositionDiscontinuity(eventTimeGeneratePlayingMediaPeriodEventTime, i10);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaSourceEventListener
    public final void onReadingStarted(int i10, MediaSource.MediaPeriodId mediaPeriodId) {
        this.mediaPeriodQueueTracker.onReadingStarted(i10, mediaPeriodId);
        AnalyticsListener.EventTime eventTimeGenerateEventTime = generateEventTime(i10, mediaPeriodId);
        Iterator<AnalyticsListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onReadingStarted(eventTimeGenerateEventTime);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.video.VideoRendererEventListener
    public final void onRenderedFirstFrame(Surface surface) {
        AnalyticsListener.EventTime eventTimeGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        Iterator<AnalyticsListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onRenderedFirstFrame(eventTimeGenerateReadingMediaPeriodEventTime, surface);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public final void onRepeatModeChanged(int i10) {
        AnalyticsListener.EventTime eventTimeGeneratePlayingMediaPeriodEventTime = generatePlayingMediaPeriodEventTime();
        Iterator<AnalyticsListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onRepeatModeChanged(eventTimeGeneratePlayingMediaPeriodEventTime, i10);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public final void onSeekProcessed() {
        if (this.mediaPeriodQueueTracker.isSeeking()) {
            this.mediaPeriodQueueTracker.onSeekProcessed();
            AnalyticsListener.EventTime eventTimeGeneratePlayingMediaPeriodEventTime = generatePlayingMediaPeriodEventTime();
            Iterator<AnalyticsListener> it = this.listeners.iterator();
            while (it.hasNext()) {
                it.next().onSeekProcessed(eventTimeGeneratePlayingMediaPeriodEventTime);
            }
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public final void onShuffleModeEnabledChanged(boolean z10) {
        AnalyticsListener.EventTime eventTimeGeneratePlayingMediaPeriodEventTime = generatePlayingMediaPeriodEventTime();
        Iterator<AnalyticsListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onShuffleModeChanged(eventTimeGeneratePlayingMediaPeriodEventTime, z10);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public final void onTimelineChanged(Timeline timeline, Object obj, int i10) {
        this.mediaPeriodQueueTracker.onTimelineChanged(timeline);
        AnalyticsListener.EventTime eventTimeGeneratePlayingMediaPeriodEventTime = generatePlayingMediaPeriodEventTime();
        Iterator<AnalyticsListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onTimelineChanged(eventTimeGeneratePlayingMediaPeriodEventTime, i10);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public final void onTracksChanged(TrackGroupArray trackGroupArray, TrackSelectionArray trackSelectionArray) {
        AnalyticsListener.EventTime eventTimeGeneratePlayingMediaPeriodEventTime = generatePlayingMediaPeriodEventTime();
        Iterator<AnalyticsListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onTracksChanged(eventTimeGeneratePlayingMediaPeriodEventTime, trackGroupArray, trackSelectionArray);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaSourceEventListener
    public final void onUpstreamDiscarded(int i10, MediaSource.MediaPeriodId mediaPeriodId, MediaSourceEventListener.MediaLoadData mediaLoadData) {
        AnalyticsListener.EventTime eventTimeGenerateEventTime = generateEventTime(i10, mediaPeriodId);
        Iterator<AnalyticsListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onUpstreamDiscarded(eventTimeGenerateEventTime, mediaLoadData);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.video.VideoRendererEventListener
    public final void onVideoDecoderInitialized(String str, long j10, long j11) {
        AnalyticsListener.EventTime eventTimeGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        Iterator<AnalyticsListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onDecoderInitialized(eventTimeGenerateReadingMediaPeriodEventTime, 2, str, j11);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.video.VideoRendererEventListener
    public final void onVideoDisabled(DecoderCounters decoderCounters) {
        AnalyticsListener.EventTime eventTimeGenerateLastReportedPlayingMediaPeriodEventTime = generateLastReportedPlayingMediaPeriodEventTime();
        Iterator<AnalyticsListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onDecoderDisabled(eventTimeGenerateLastReportedPlayingMediaPeriodEventTime, 2, decoderCounters);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.video.VideoRendererEventListener
    public final void onVideoEnabled(DecoderCounters decoderCounters) {
        AnalyticsListener.EventTime eventTimeGeneratePlayingMediaPeriodEventTime = generatePlayingMediaPeriodEventTime();
        Iterator<AnalyticsListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onDecoderEnabled(eventTimeGeneratePlayingMediaPeriodEventTime, 2, decoderCounters);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.video.VideoRendererEventListener
    public final void onVideoInputFormatChanged(Format format) {
        AnalyticsListener.EventTime eventTimeGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        Iterator<AnalyticsListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onDecoderInputFormatChanged(eventTimeGenerateReadingMediaPeriodEventTime, 2, format);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.video.VideoRendererEventListener
    public final void onVideoSizeChanged(int i10, int i11, int i12, float f10) {
        AnalyticsListener.EventTime eventTimeGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        Iterator<AnalyticsListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onVideoSizeChanged(eventTimeGenerateReadingMediaPeriodEventTime, i10, i11, i12, f10);
        }
    }

    public void removeListener(AnalyticsListener analyticsListener) {
        this.listeners.remove(analyticsListener);
    }

    public final void resetForNewMediaSource() {
        Iterator it = new ArrayList(this.mediaPeriodQueueTracker.activeMediaPeriods).iterator();
        while (it.hasNext()) {
            WindowAndMediaPeriodId windowAndMediaPeriodId = (WindowAndMediaPeriodId) it.next();
            onMediaPeriodReleased(windowAndMediaPeriodId.windowIndex, windowAndMediaPeriodId.mediaPeriodId);
        }
    }

    public void setPlayer(Player player) {
        Assertions.checkState(this.player == null);
        this.player = (Player) Assertions.checkNotNull(player);
    }

    private AnalyticsListener.EventTime generateEventTime(WindowAndMediaPeriodId windowAndMediaPeriodId) {
        if (windowAndMediaPeriodId == null) {
            int currentWindowIndex = ((Player) Assertions.checkNotNull(this.player)).getCurrentWindowIndex();
            return generateEventTime(currentWindowIndex, this.mediaPeriodQueueTracker.tryResolveWindowIndex(currentWindowIndex));
        }
        return generateEventTime(windowAndMediaPeriodId.windowIndex, windowAndMediaPeriodId.mediaPeriodId);
    }
}
