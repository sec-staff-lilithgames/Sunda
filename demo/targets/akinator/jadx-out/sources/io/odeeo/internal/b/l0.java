package io.odeeo.internal.b;

import android.os.Bundle;
import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import io.odeeo.internal.b.g;
import io.odeeo.internal.q0.l;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public interface l0 {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b implements g {

        /* renamed from: b, reason: collision with root package name */
        public static final b f62796b = new a().build();

        /* renamed from: c, reason: collision with root package name */
        public static final g.a<b> f62797c = new hv.t(28);

        /* renamed from: a, reason: collision with root package name */
        public final io.odeeo.internal.q0.l f62798a;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class a {

            /* renamed from: b, reason: collision with root package name */
            public static final int[] f62799b = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30};

            /* renamed from: a, reason: collision with root package name */
            public final l.b f62800a;

            public a add(int i10) {
                this.f62800a.add(i10);
                return this;
            }

            public a addAll(int... iArr) {
                this.f62800a.addAll(iArr);
                return this;
            }

            public a addAllCommands() {
                this.f62800a.addAll(f62799b);
                return this;
            }

            public a addIf(int i10, boolean z10) {
                this.f62800a.addIf(i10, z10);
                return this;
            }

            public b build() {
                return new b(this.f62800a.build());
            }

            public a remove(int i10) {
                this.f62800a.remove(i10);
                return this;
            }

            public a removeAll(int... iArr) {
                this.f62800a.removeAll(iArr);
                return this;
            }

            public a removeIf(int i10, boolean z10) {
                this.f62800a.removeIf(i10, z10);
                return this;
            }

            public a() {
                this.f62800a = new l.b();
            }

            public a addAll(b bVar) {
                this.f62800a.addAll(bVar.f62798a);
                return this;
            }

            public a(b bVar) {
                l.b bVar2 = new l.b();
                this.f62800a = bVar2;
                bVar2.addAll(bVar.f62798a);
            }
        }

        public a buildUpon() {
            return new a();
        }

        public boolean contains(int i10) {
            return this.f62798a.contains(i10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                return this.f62798a.equals(((b) obj).f62798a);
            }
            return false;
        }

        public int get(int i10) {
            return this.f62798a.get(i10);
        }

        public int hashCode() {
            return this.f62798a.hashCode();
        }

        public int size() {
            return this.f62798a.size();
        }

        @Override // io.odeeo.internal.b.g
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            ArrayList<Integer> arrayList = new ArrayList<>();
            for (int i10 = 0; i10 < this.f62798a.size(); i10++) {
                arrayList.add(Integer.valueOf(this.f62798a.get(i10)));
            }
            bundle.putIntegerArrayList(a(0), arrayList);
            return bundle;
        }

        public b(io.odeeo.internal.q0.l lVar) {
            this.f62798a = lVar;
        }

        public static b a(Bundle bundle) {
            ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList(a(0));
            if (integerArrayList == null) {
                return f62796b;
            }
            a aVar = new a();
            for (int i10 = 0; i10 < integerArrayList.size(); i10++) {
                aVar.add(integerArrayList.get(i10).intValue());
            }
            return aVar.build();
        }

        public static String a(int i10) {
            return Integer.toString(i10, 36);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @Deprecated
    public interface c {
        @Deprecated
        default void onPositionDiscontinuity(int i10) {
        }

        default void onPositionDiscontinuity(f fVar, f fVar2, int i10) {
        }

        @Deprecated
        default void onSeekProcessed() {
        }

        default void onAvailableCommandsChanged(b bVar) {
        }

        default void onIsLoadingChanged(boolean z10) {
        }

        default void onIsPlayingChanged(boolean z10) {
        }

        @Deprecated
        default void onLoadingChanged(boolean z10) {
        }

        default void onMaxSeekToPreviousPositionChanged(long j10) {
        }

        default void onMediaMetadataChanged(a0 a0Var) {
        }

        default void onPlaybackParametersChanged(k0 k0Var) {
        }

        default void onPlaybackStateChanged(int i10) {
        }

        default void onPlaybackSuppressionReasonChanged(int i10) {
        }

        default void onPlayerError(i0 i0Var) {
        }

        default void onPlayerErrorChanged(i0 i0Var) {
        }

        default void onPlaylistMetadataChanged(a0 a0Var) {
        }

        default void onRepeatModeChanged(int i10) {
        }

        default void onSeekBackIncrementChanged(long j10) {
        }

        default void onSeekForwardIncrementChanged(long j10) {
        }

        default void onShuffleModeEnabledChanged(boolean z10) {
        }

        default void onTrackSelectionParametersChanged(io.odeeo.internal.n0.j jVar) {
        }

        default void onTracksInfoChanged(z0 z0Var) {
        }

        default void onEvents(l0 l0Var, d dVar) {
        }

        default void onMediaItemTransition(z zVar, int i10) {
        }

        default void onPlayWhenReadyChanged(boolean z10, int i10) {
        }

        @Deprecated
        default void onPlayerStateChanged(boolean z10, int i10) {
        }

        default void onTimelineChanged(y0 y0Var, int i10) {
        }

        @Deprecated
        default void onTracksChanged(io.odeeo.internal.a0.l0 l0Var, io.odeeo.internal.n0.h hVar) {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final io.odeeo.internal.q0.l f62801a;

        public d(io.odeeo.internal.q0.l lVar) {
            this.f62801a = lVar;
        }

        public boolean contains(int i10) {
            return this.f62801a.contains(i10);
        }

        public boolean containsAny(int... iArr) {
            return this.f62801a.containsAny(iArr);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                return this.f62801a.equals(((d) obj).f62801a);
            }
            return false;
        }

        public int get(int i10) {
            return this.f62801a.get(i10);
        }

        public int hashCode() {
            return this.f62801a.hashCode();
        }

        public int size() {
            return this.f62801a.size();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface e extends c {
        @Override // io.odeeo.internal.b.l0.c
        @Deprecated
        /* bridge */ /* synthetic */ default void onLoadingChanged(boolean z10) {
            super.onLoadingChanged(z10);
        }

        @Override // io.odeeo.internal.b.l0.c
        /* bridge */ /* synthetic */ default void onMaxSeekToPreviousPositionChanged(long j10) {
            super.onMaxSeekToPreviousPositionChanged(j10);
        }

        @Override // io.odeeo.internal.b.l0.c
        @Deprecated
        /* bridge */ /* synthetic */ default void onPlayerStateChanged(boolean z10, int i10) {
            super.onPlayerStateChanged(z10, i10);
        }

        @Override // io.odeeo.internal.b.l0.c
        default void onPositionDiscontinuity(f fVar, f fVar2, int i10) {
        }

        @Override // io.odeeo.internal.b.l0.c
        @Deprecated
        /* bridge */ /* synthetic */ default void onSeekProcessed() {
            super.onSeekProcessed();
        }

        @Override // io.odeeo.internal.b.l0.c
        /* bridge */ /* synthetic */ default void onTrackSelectionParametersChanged(io.odeeo.internal.n0.j jVar) {
            super.onTrackSelectionParametersChanged(jVar);
        }

        @Override // io.odeeo.internal.b.l0.c
        @Deprecated
        /* bridge */ /* synthetic */ default void onTracksChanged(io.odeeo.internal.a0.l0 l0Var, io.odeeo.internal.n0.h hVar) {
            super.onTracksChanged(l0Var, hVar);
        }

        @Override // io.odeeo.internal.b.l0.c
        @Deprecated
        /* bridge */ /* synthetic */ default void onPositionDiscontinuity(int i10) {
            super.onPositionDiscontinuity(i10);
        }

        default void onRenderedFirstFrame() {
        }

        default void onAudioAttributesChanged(io.odeeo.internal.d.d dVar) {
        }

        default void onAudioSessionIdChanged(int i10) {
        }

        @Override // io.odeeo.internal.b.l0.c
        default void onAvailableCommandsChanged(b bVar) {
        }

        default void onCues(List<io.odeeo.internal.d0.a> list) {
        }

        default void onDeviceInfoChanged(m mVar) {
        }

        @Override // io.odeeo.internal.b.l0.c
        default void onIsLoadingChanged(boolean z10) {
        }

        @Override // io.odeeo.internal.b.l0.c
        default void onIsPlayingChanged(boolean z10) {
        }

        @Override // io.odeeo.internal.b.l0.c
        default void onMediaMetadataChanged(a0 a0Var) {
        }

        default void onMetadata(io.odeeo.internal.s.a aVar) {
        }

        @Override // io.odeeo.internal.b.l0.c
        default void onPlaybackParametersChanged(k0 k0Var) {
        }

        @Override // io.odeeo.internal.b.l0.c
        default void onPlaybackStateChanged(int i10) {
        }

        @Override // io.odeeo.internal.b.l0.c
        default void onPlaybackSuppressionReasonChanged(int i10) {
        }

        @Override // io.odeeo.internal.b.l0.c
        default void onPlayerError(i0 i0Var) {
        }

        @Override // io.odeeo.internal.b.l0.c
        default void onPlayerErrorChanged(i0 i0Var) {
        }

        @Override // io.odeeo.internal.b.l0.c
        default void onPlaylistMetadataChanged(a0 a0Var) {
        }

        @Override // io.odeeo.internal.b.l0.c
        default void onRepeatModeChanged(int i10) {
        }

        @Override // io.odeeo.internal.b.l0.c
        default void onSeekBackIncrementChanged(long j10) {
        }

        @Override // io.odeeo.internal.b.l0.c
        default void onSeekForwardIncrementChanged(long j10) {
        }

        @Override // io.odeeo.internal.b.l0.c
        default void onShuffleModeEnabledChanged(boolean z10) {
        }

        default void onSkipSilenceEnabledChanged(boolean z10) {
        }

        @Override // io.odeeo.internal.b.l0.c
        default void onTracksInfoChanged(z0 z0Var) {
        }

        default void onVideoSizeChanged(io.odeeo.internal.r0.m mVar) {
        }

        default void onVolumeChanged(float f10) {
        }

        default void onDeviceVolumeChanged(int i10, boolean z10) {
        }

        @Override // io.odeeo.internal.b.l0.c
        default void onEvents(l0 l0Var, d dVar) {
        }

        @Override // io.odeeo.internal.b.l0.c
        default void onMediaItemTransition(z zVar, int i10) {
        }

        @Override // io.odeeo.internal.b.l0.c
        default void onPlayWhenReadyChanged(boolean z10, int i10) {
        }

        default void onSurfaceSizeChanged(int i10, int i11) {
        }

        @Override // io.odeeo.internal.b.l0.c
        default void onTimelineChanged(y0 y0Var, int i10) {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class f implements g {

        /* renamed from: k, reason: collision with root package name */
        public static final g.a<f> f62802k = new hv.t(29);

        /* renamed from: a, reason: collision with root package name */
        public final Object f62803a;

        /* renamed from: b, reason: collision with root package name */
        @Deprecated
        public final int f62804b;

        /* renamed from: c, reason: collision with root package name */
        public final int f62805c;

        /* renamed from: d, reason: collision with root package name */
        public final z f62806d;

        /* renamed from: e, reason: collision with root package name */
        public final Object f62807e;

        /* renamed from: f, reason: collision with root package name */
        public final int f62808f;

        /* renamed from: g, reason: collision with root package name */
        public final long f62809g;

        /* renamed from: h, reason: collision with root package name */
        public final long f62810h;

        /* renamed from: i, reason: collision with root package name */
        public final int f62811i;

        /* renamed from: j, reason: collision with root package name */
        public final int f62812j;

        @Deprecated
        public f(Object obj, int i10, Object obj2, int i11, long j10, long j11, int i12, int i13) {
            this(obj, i10, z.f63107h, obj2, i11, j10, j11, i12, i13);
        }

        public static f a(Bundle bundle) {
            return new f(null, bundle.getInt(a(0), -1), (z) io.odeeo.internal.q0.c.fromNullableBundle(z.f63108i, bundle.getBundle(a(1))), null, bundle.getInt(a(2), -1), bundle.getLong(a(3), C.TIME_UNSET), bundle.getLong(a(4), C.TIME_UNSET), bundle.getInt(a(5), -1), bundle.getInt(a(6), -1));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && f.class == obj.getClass()) {
                f fVar = (f) obj;
                if (this.f62805c == fVar.f62805c && this.f62808f == fVar.f62808f && this.f62809g == fVar.f62809g && this.f62810h == fVar.f62810h && this.f62811i == fVar.f62811i && this.f62812j == fVar.f62812j && io.odeeo.internal.t0.p.equal(this.f62803a, fVar.f62803a) && io.odeeo.internal.t0.p.equal(this.f62807e, fVar.f62807e) && io.odeeo.internal.t0.p.equal(this.f62806d, fVar.f62806d)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return io.odeeo.internal.t0.p.hashCode(this.f62803a, Integer.valueOf(this.f62805c), this.f62806d, this.f62807e, Integer.valueOf(this.f62808f), Long.valueOf(this.f62809g), Long.valueOf(this.f62810h), Integer.valueOf(this.f62811i), Integer.valueOf(this.f62812j));
        }

        @Override // io.odeeo.internal.b.g
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putInt(a(0), this.f62805c);
            bundle.putBundle(a(1), io.odeeo.internal.q0.c.toNullableBundle(this.f62806d));
            bundle.putInt(a(2), this.f62808f);
            bundle.putLong(a(3), this.f62809g);
            bundle.putLong(a(4), this.f62810h);
            bundle.putInt(a(5), this.f62811i);
            bundle.putInt(a(6), this.f62812j);
            return bundle;
        }

        public f(Object obj, int i10, z zVar, Object obj2, int i11, long j10, long j11, int i12, int i13) {
            this.f62803a = obj;
            this.f62804b = i10;
            this.f62805c = i10;
            this.f62806d = zVar;
            this.f62807e = obj2;
            this.f62808f = i11;
            this.f62809g = j10;
            this.f62810h = j11;
            this.f62811i = i12;
            this.f62812j = i13;
        }

        public static String a(int i10) {
            return Integer.toString(i10, 36);
        }
    }

    void addListener(e eVar);

    void addMediaItem(int i10, z zVar);

    void addMediaItem(z zVar);

    void addMediaItems(int i10, List<z> list);

    void addMediaItems(List<z> list);

    boolean canAdvertiseSession();

    void clearMediaItems();

    void clearVideoSurface();

    void clearVideoSurface(Surface surface);

    void clearVideoSurfaceHolder(SurfaceHolder surfaceHolder);

    void clearVideoSurfaceView(SurfaceView surfaceView);

    void clearVideoTextureView(TextureView textureView);

    void decreaseDeviceVolume();

    Looper getApplicationLooper();

    io.odeeo.internal.d.d getAudioAttributes();

    b getAvailableCommands();

    int getBufferedPercentage();

    long getBufferedPosition();

    long getContentBufferedPosition();

    long getContentDuration();

    long getContentPosition();

    int getCurrentAdGroupIndex();

    int getCurrentAdIndexInAdGroup();

    List<io.odeeo.internal.d0.a> getCurrentCues();

    long getCurrentLiveOffset();

    Object getCurrentManifest();

    z getCurrentMediaItem();

    int getCurrentMediaItemIndex();

    int getCurrentPeriodIndex();

    long getCurrentPosition();

    y0 getCurrentTimeline();

    @Deprecated
    io.odeeo.internal.a0.l0 getCurrentTrackGroups();

    @Deprecated
    io.odeeo.internal.n0.h getCurrentTrackSelections();

    z0 getCurrentTracksInfo();

    @Deprecated
    int getCurrentWindowIndex();

    m getDeviceInfo();

    int getDeviceVolume();

    long getDuration();

    long getMaxSeekToPreviousPosition();

    z getMediaItemAt(int i10);

    int getMediaItemCount();

    a0 getMediaMetadata();

    int getNextMediaItemIndex();

    @Deprecated
    int getNextWindowIndex();

    boolean getPlayWhenReady();

    k0 getPlaybackParameters();

    int getPlaybackState();

    int getPlaybackSuppressionReason();

    i0 getPlayerError();

    a0 getPlaylistMetadata();

    int getPreviousMediaItemIndex();

    @Deprecated
    int getPreviousWindowIndex();

    int getRepeatMode();

    long getSeekBackIncrement();

    long getSeekForwardIncrement();

    boolean getShuffleModeEnabled();

    long getTotalBufferedDuration();

    io.odeeo.internal.n0.j getTrackSelectionParameters();

    io.odeeo.internal.r0.m getVideoSize();

    float getVolume();

    @Deprecated
    boolean hasNext();

    boolean hasNextMediaItem();

    @Deprecated
    boolean hasNextWindow();

    @Deprecated
    boolean hasPrevious();

    boolean hasPreviousMediaItem();

    @Deprecated
    boolean hasPreviousWindow();

    void increaseDeviceVolume();

    boolean isCommandAvailable(int i10);

    boolean isCurrentMediaItemDynamic();

    boolean isCurrentMediaItemLive();

    boolean isCurrentMediaItemSeekable();

    @Deprecated
    boolean isCurrentWindowDynamic();

    @Deprecated
    boolean isCurrentWindowLive();

    @Deprecated
    boolean isCurrentWindowSeekable();

    boolean isDeviceMuted();

    boolean isLoading();

    boolean isPlaying();

    boolean isPlayingAd();

    void moveMediaItem(int i10, int i11);

    void moveMediaItems(int i10, int i11, int i12);

    @Deprecated
    void next();

    void pause();

    void play();

    void prepare();

    @Deprecated
    void previous();

    void release();

    void removeListener(e eVar);

    void removeMediaItem(int i10);

    void removeMediaItems(int i10, int i11);

    void seekBack();

    void seekForward();

    void seekTo(int i10, long j10);

    void seekTo(long j10);

    void seekToDefaultPosition();

    void seekToDefaultPosition(int i10);

    void seekToNext();

    void seekToNextMediaItem();

    @Deprecated
    void seekToNextWindow();

    void seekToPrevious();

    void seekToPreviousMediaItem();

    @Deprecated
    void seekToPreviousWindow();

    void setDeviceMuted(boolean z10);

    void setDeviceVolume(int i10);

    void setMediaItem(z zVar);

    void setMediaItem(z zVar, long j10);

    void setMediaItem(z zVar, boolean z10);

    void setMediaItems(List<z> list);

    void setMediaItems(List<z> list, int i10, long j10);

    void setMediaItems(List<z> list, boolean z10);

    void setPlayWhenReady(boolean z10);

    void setPlaybackParameters(k0 k0Var);

    void setPlaybackSpeed(float f10);

    void setPlaylistMetadata(a0 a0Var);

    void setRepeatMode(int i10);

    void setShuffleModeEnabled(boolean z10);

    void setTrackSelectionParameters(io.odeeo.internal.n0.j jVar);

    void setVideoSurface(Surface surface);

    void setVideoSurfaceHolder(SurfaceHolder surfaceHolder);

    void setVideoSurfaceView(SurfaceView surfaceView);

    void setVideoTextureView(TextureView textureView);

    void setVolume(float f10);

    void stop();

    @Deprecated
    void stop(boolean z10);
}
