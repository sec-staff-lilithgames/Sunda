package com.mbridge.msdk.playercommon.exoplayer2.source;

import android.os.Handler;
import android.os.Looper;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.Format;
import com.mbridge.msdk.playercommon.exoplayer2.source.MediaSource;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSpec;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public interface MediaSourceEventListener {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class EventDispatcher {
        private final CopyOnWriteArrayList<ListenerAndHandler> listenerAndHandlers;
        public final MediaSource.MediaPeriodId mediaPeriodId;
        private final long mediaTimeOffsetMs;
        public final int windowIndex;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class ListenerAndHandler {
            public final Handler handler;
            public final MediaSourceEventListener listener;

            public ListenerAndHandler(Handler handler, MediaSourceEventListener mediaSourceEventListener) {
                this.handler = handler;
                this.listener = mediaSourceEventListener;
            }
        }

        public EventDispatcher() {
            this(new CopyOnWriteArrayList(), 0, null, 0L);
        }

        private long adjustMediaTime(long j10) {
            long jUsToMs = C.usToMs(j10);
            return jUsToMs == C.TIME_UNSET ? C.TIME_UNSET : this.mediaTimeOffsetMs + jUsToMs;
        }

        private void postOrRun(Handler handler, Runnable runnable) {
            if (handler.getLooper() == Looper.myLooper()) {
                runnable.run();
            } else {
                handler.post(runnable);
            }
        }

        public void addEventListener(Handler handler, MediaSourceEventListener mediaSourceEventListener) {
            Assertions.checkArgument((handler == null || mediaSourceEventListener == null) ? false : true);
            this.listenerAndHandlers.add(new ListenerAndHandler(handler, mediaSourceEventListener));
        }

        public void downstreamFormatChanged(int i10, Format format, int i11, Object obj, long j10) {
            downstreamFormatChanged(new MediaLoadData(1, i10, format, i11, obj, adjustMediaTime(j10), C.TIME_UNSET));
        }

        public void loadCanceled(DataSpec dataSpec, int i10, long j10, long j11, long j12) {
            loadCanceled(dataSpec, i10, -1, null, 0, null, C.TIME_UNSET, C.TIME_UNSET, j10, j11, j12);
        }

        public void loadCompleted(DataSpec dataSpec, int i10, long j10, long j11, long j12) {
            loadCompleted(dataSpec, i10, -1, null, 0, null, C.TIME_UNSET, C.TIME_UNSET, j10, j11, j12);
        }

        public void loadError(DataSpec dataSpec, int i10, long j10, long j11, long j12, IOException iOException, boolean z10) {
            loadError(dataSpec, i10, -1, null, 0, null, C.TIME_UNSET, C.TIME_UNSET, j10, j11, j12, iOException, z10);
        }

        public void loadStarted(DataSpec dataSpec, int i10, long j10) {
            loadStarted(dataSpec, i10, -1, null, 0, null, C.TIME_UNSET, C.TIME_UNSET, j10);
        }

        public void mediaPeriodCreated() {
            Assertions.checkState(this.mediaPeriodId != null);
            Iterator<ListenerAndHandler> it = this.listenerAndHandlers.iterator();
            while (it.hasNext()) {
                ListenerAndHandler next = it.next();
                final MediaSourceEventListener mediaSourceEventListener = next.listener;
                postOrRun(next.handler, new Runnable() { // from class: com.mbridge.msdk.playercommon.exoplayer2.source.MediaSourceEventListener.EventDispatcher.1
                    @Override // java.lang.Runnable
                    public void run() {
                        MediaSourceEventListener mediaSourceEventListener2 = mediaSourceEventListener;
                        EventDispatcher eventDispatcher = EventDispatcher.this;
                        mediaSourceEventListener2.onMediaPeriodCreated(eventDispatcher.windowIndex, eventDispatcher.mediaPeriodId);
                    }
                });
            }
        }

        public void mediaPeriodReleased() {
            Assertions.checkState(this.mediaPeriodId != null);
            Iterator<ListenerAndHandler> it = this.listenerAndHandlers.iterator();
            while (it.hasNext()) {
                ListenerAndHandler next = it.next();
                final MediaSourceEventListener mediaSourceEventListener = next.listener;
                postOrRun(next.handler, new Runnable() { // from class: com.mbridge.msdk.playercommon.exoplayer2.source.MediaSourceEventListener.EventDispatcher.2
                    @Override // java.lang.Runnable
                    public void run() {
                        MediaSourceEventListener mediaSourceEventListener2 = mediaSourceEventListener;
                        EventDispatcher eventDispatcher = EventDispatcher.this;
                        mediaSourceEventListener2.onMediaPeriodReleased(eventDispatcher.windowIndex, eventDispatcher.mediaPeriodId);
                    }
                });
            }
        }

        public void readingStarted() {
            Assertions.checkState(this.mediaPeriodId != null);
            Iterator<ListenerAndHandler> it = this.listenerAndHandlers.iterator();
            while (it.hasNext()) {
                ListenerAndHandler next = it.next();
                final MediaSourceEventListener mediaSourceEventListener = next.listener;
                postOrRun(next.handler, new Runnable() { // from class: com.mbridge.msdk.playercommon.exoplayer2.source.MediaSourceEventListener.EventDispatcher.7
                    @Override // java.lang.Runnable
                    public void run() {
                        MediaSourceEventListener mediaSourceEventListener2 = mediaSourceEventListener;
                        EventDispatcher eventDispatcher = EventDispatcher.this;
                        mediaSourceEventListener2.onReadingStarted(eventDispatcher.windowIndex, eventDispatcher.mediaPeriodId);
                    }
                });
            }
        }

        public void removeEventListener(MediaSourceEventListener mediaSourceEventListener) {
            Iterator<ListenerAndHandler> it = this.listenerAndHandlers.iterator();
            while (it.hasNext()) {
                ListenerAndHandler next = it.next();
                if (next.listener == mediaSourceEventListener) {
                    this.listenerAndHandlers.remove(next);
                }
            }
        }

        public void upstreamDiscarded(int i10, long j10, long j11) {
            upstreamDiscarded(new MediaLoadData(1, i10, null, 3, null, adjustMediaTime(j10), adjustMediaTime(j11)));
        }

        public EventDispatcher withParameters(int i10, MediaSource.MediaPeriodId mediaPeriodId, long j10) {
            return new EventDispatcher(this.listenerAndHandlers, i10, mediaPeriodId, j10);
        }

        private EventDispatcher(CopyOnWriteArrayList<ListenerAndHandler> copyOnWriteArrayList, int i10, MediaSource.MediaPeriodId mediaPeriodId, long j10) {
            this.listenerAndHandlers = copyOnWriteArrayList;
            this.windowIndex = i10;
            this.mediaPeriodId = mediaPeriodId;
            this.mediaTimeOffsetMs = j10;
        }

        public void loadCanceled(DataSpec dataSpec, int i10, int i11, Format format, int i12, Object obj, long j10, long j11, long j12, long j13, long j14) {
            loadCanceled(new LoadEventInfo(dataSpec, j12, j13, j14), new MediaLoadData(i10, i11, format, i12, obj, adjustMediaTime(j10), adjustMediaTime(j11)));
        }

        public void loadCompleted(DataSpec dataSpec, int i10, int i11, Format format, int i12, Object obj, long j10, long j11, long j12, long j13, long j14) {
            loadCompleted(new LoadEventInfo(dataSpec, j12, j13, j14), new MediaLoadData(i10, i11, format, i12, obj, adjustMediaTime(j10), adjustMediaTime(j11)));
        }

        public void loadError(DataSpec dataSpec, int i10, int i11, Format format, int i12, Object obj, long j10, long j11, long j12, long j13, long j14, IOException iOException, boolean z10) {
            loadError(new LoadEventInfo(dataSpec, j12, j13, j14), new MediaLoadData(i10, i11, format, i12, obj, adjustMediaTime(j10), adjustMediaTime(j11)), iOException, z10);
        }

        public void loadStarted(DataSpec dataSpec, int i10, int i11, Format format, int i12, Object obj, long j10, long j11, long j12) {
            loadStarted(new LoadEventInfo(dataSpec, j12, 0L, 0L), new MediaLoadData(i10, i11, format, i12, obj, adjustMediaTime(j10), adjustMediaTime(j11)));
        }

        public void downstreamFormatChanged(final MediaLoadData mediaLoadData) {
            Iterator<ListenerAndHandler> it = this.listenerAndHandlers.iterator();
            while (it.hasNext()) {
                ListenerAndHandler next = it.next();
                final MediaSourceEventListener mediaSourceEventListener = next.listener;
                postOrRun(next.handler, new Runnable() { // from class: com.mbridge.msdk.playercommon.exoplayer2.source.MediaSourceEventListener.EventDispatcher.9
                    @Override // java.lang.Runnable
                    public void run() {
                        MediaSourceEventListener mediaSourceEventListener2 = mediaSourceEventListener;
                        EventDispatcher eventDispatcher = EventDispatcher.this;
                        mediaSourceEventListener2.onDownstreamFormatChanged(eventDispatcher.windowIndex, eventDispatcher.mediaPeriodId, mediaLoadData);
                    }
                });
            }
        }

        public void upstreamDiscarded(final MediaLoadData mediaLoadData) {
            Iterator<ListenerAndHandler> it = this.listenerAndHandlers.iterator();
            while (it.hasNext()) {
                ListenerAndHandler next = it.next();
                final MediaSourceEventListener mediaSourceEventListener = next.listener;
                postOrRun(next.handler, new Runnable() { // from class: com.mbridge.msdk.playercommon.exoplayer2.source.MediaSourceEventListener.EventDispatcher.8
                    @Override // java.lang.Runnable
                    public void run() {
                        MediaSourceEventListener mediaSourceEventListener2 = mediaSourceEventListener;
                        EventDispatcher eventDispatcher = EventDispatcher.this;
                        mediaSourceEventListener2.onUpstreamDiscarded(eventDispatcher.windowIndex, eventDispatcher.mediaPeriodId, mediaLoadData);
                    }
                });
            }
        }

        public void loadCanceled(final LoadEventInfo loadEventInfo, final MediaLoadData mediaLoadData) {
            Iterator<ListenerAndHandler> it = this.listenerAndHandlers.iterator();
            while (it.hasNext()) {
                ListenerAndHandler next = it.next();
                final MediaSourceEventListener mediaSourceEventListener = next.listener;
                postOrRun(next.handler, new Runnable() { // from class: com.mbridge.msdk.playercommon.exoplayer2.source.MediaSourceEventListener.EventDispatcher.5
                    @Override // java.lang.Runnable
                    public void run() {
                        MediaSourceEventListener mediaSourceEventListener2 = mediaSourceEventListener;
                        EventDispatcher eventDispatcher = EventDispatcher.this;
                        mediaSourceEventListener2.onLoadCanceled(eventDispatcher.windowIndex, eventDispatcher.mediaPeriodId, loadEventInfo, mediaLoadData);
                    }
                });
            }
        }

        public void loadCompleted(final LoadEventInfo loadEventInfo, final MediaLoadData mediaLoadData) {
            Iterator<ListenerAndHandler> it = this.listenerAndHandlers.iterator();
            while (it.hasNext()) {
                ListenerAndHandler next = it.next();
                final MediaSourceEventListener mediaSourceEventListener = next.listener;
                postOrRun(next.handler, new Runnable() { // from class: com.mbridge.msdk.playercommon.exoplayer2.source.MediaSourceEventListener.EventDispatcher.4
                    @Override // java.lang.Runnable
                    public void run() {
                        MediaSourceEventListener mediaSourceEventListener2 = mediaSourceEventListener;
                        EventDispatcher eventDispatcher = EventDispatcher.this;
                        mediaSourceEventListener2.onLoadCompleted(eventDispatcher.windowIndex, eventDispatcher.mediaPeriodId, loadEventInfo, mediaLoadData);
                    }
                });
            }
        }

        public void loadError(final LoadEventInfo loadEventInfo, final MediaLoadData mediaLoadData, final IOException iOException, final boolean z10) {
            Iterator<ListenerAndHandler> it = this.listenerAndHandlers.iterator();
            while (it.hasNext()) {
                ListenerAndHandler next = it.next();
                final MediaSourceEventListener mediaSourceEventListener = next.listener;
                postOrRun(next.handler, new Runnable() { // from class: com.mbridge.msdk.playercommon.exoplayer2.source.MediaSourceEventListener.EventDispatcher.6
                    @Override // java.lang.Runnable
                    public void run() {
                        MediaSourceEventListener mediaSourceEventListener2 = mediaSourceEventListener;
                        EventDispatcher eventDispatcher = EventDispatcher.this;
                        mediaSourceEventListener2.onLoadError(eventDispatcher.windowIndex, eventDispatcher.mediaPeriodId, loadEventInfo, mediaLoadData, iOException, z10);
                    }
                });
            }
        }

        public void loadStarted(final LoadEventInfo loadEventInfo, final MediaLoadData mediaLoadData) {
            Iterator<ListenerAndHandler> it = this.listenerAndHandlers.iterator();
            while (it.hasNext()) {
                ListenerAndHandler next = it.next();
                final MediaSourceEventListener mediaSourceEventListener = next.listener;
                postOrRun(next.handler, new Runnable() { // from class: com.mbridge.msdk.playercommon.exoplayer2.source.MediaSourceEventListener.EventDispatcher.3
                    @Override // java.lang.Runnable
                    public void run() {
                        MediaSourceEventListener mediaSourceEventListener2 = mediaSourceEventListener;
                        EventDispatcher eventDispatcher = EventDispatcher.this;
                        mediaSourceEventListener2.onLoadStarted(eventDispatcher.windowIndex, eventDispatcher.mediaPeriodId, loadEventInfo, mediaLoadData);
                    }
                });
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class LoadEventInfo {
        public final long bytesLoaded;
        public final DataSpec dataSpec;
        public final long elapsedRealtimeMs;
        public final long loadDurationMs;

        public LoadEventInfo(DataSpec dataSpec, long j10, long j11, long j12) {
            this.dataSpec = dataSpec;
            this.elapsedRealtimeMs = j10;
            this.loadDurationMs = j11;
            this.bytesLoaded = j12;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class MediaLoadData {
        public final int dataType;
        public final long mediaEndTimeMs;
        public final long mediaStartTimeMs;
        public final Format trackFormat;
        public final Object trackSelectionData;
        public final int trackSelectionReason;
        public final int trackType;

        public MediaLoadData(int i10, int i11, Format format, int i12, Object obj, long j10, long j11) {
            this.dataType = i10;
            this.trackType = i11;
            this.trackFormat = format;
            this.trackSelectionReason = i12;
            this.trackSelectionData = obj;
            this.mediaStartTimeMs = j10;
            this.mediaEndTimeMs = j11;
        }
    }

    void onDownstreamFormatChanged(int i10, MediaSource.MediaPeriodId mediaPeriodId, MediaLoadData mediaLoadData);

    void onLoadCanceled(int i10, MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData);

    void onLoadCompleted(int i10, MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData);

    void onLoadError(int i10, MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException iOException, boolean z10);

    void onLoadStarted(int i10, MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData);

    void onMediaPeriodCreated(int i10, MediaSource.MediaPeriodId mediaPeriodId);

    void onMediaPeriodReleased(int i10, MediaSource.MediaPeriodId mediaPeriodId);

    void onReadingStarted(int i10, MediaSource.MediaPeriodId mediaPeriodId);

    void onUpstreamDiscarded(int i10, MediaSource.MediaPeriodId mediaPeriodId, MediaLoadData mediaLoadData);
}
