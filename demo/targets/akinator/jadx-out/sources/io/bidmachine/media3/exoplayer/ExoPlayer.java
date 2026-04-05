package io.bidmachine.media3.exoplayer;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import com.mbridge.msdk.interstitial.view.MBInterstitialActivity;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import io.bidmachine.media3.exoplayer.image.ImageOutput;
import java.util.List;
import mh.v2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public interface ExoPlayer extends gn.i1 {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public long A;
        public long B;
        public boolean C;
        public boolean D;
        public l1 E;
        public boolean F;
        public boolean G;
        public String H;
        public boolean I;
        public i2 J;

        /* renamed from: a, reason: collision with root package name */
        public final Context f60830a;

        /* renamed from: b, reason: collision with root package name */
        public io.bidmachine.media3.common.util.g f60831b;

        /* renamed from: c, reason: collision with root package name */
        public long f60832c;

        /* renamed from: d, reason: collision with root package name */
        public v2 f60833d;

        /* renamed from: e, reason: collision with root package name */
        public v2 f60834e;

        /* renamed from: f, reason: collision with root package name */
        public v2 f60835f;

        /* renamed from: g, reason: collision with root package name */
        public v2 f60836g;

        /* renamed from: h, reason: collision with root package name */
        public v2 f60837h;

        /* renamed from: i, reason: collision with root package name */
        public mh.v0 f60838i;

        /* renamed from: j, reason: collision with root package name */
        public Looper f60839j;

        /* renamed from: k, reason: collision with root package name */
        public int f60840k;

        /* renamed from: l, reason: collision with root package name */
        public gn.l1 f60841l;

        /* renamed from: m, reason: collision with root package name */
        public gn.h f60842m;

        /* renamed from: n, reason: collision with root package name */
        public boolean f60843n;

        /* renamed from: o, reason: collision with root package name */
        public int f60844o;

        /* renamed from: p, reason: collision with root package name */
        public boolean f60845p;

        /* renamed from: q, reason: collision with root package name */
        public boolean f60846q;

        /* renamed from: r, reason: collision with root package name */
        public boolean f60847r;

        /* renamed from: s, reason: collision with root package name */
        public int f60848s;

        /* renamed from: t, reason: collision with root package name */
        public int f60849t;

        /* renamed from: u, reason: collision with root package name */
        public boolean f60850u;

        /* renamed from: v, reason: collision with root package name */
        public y1 f60851v;

        /* renamed from: w, reason: collision with root package name */
        public long f60852w;

        /* renamed from: x, reason: collision with root package name */
        public long f60853x;

        /* renamed from: y, reason: collision with root package name */
        public long f60854y;

        /* renamed from: z, reason: collision with root package name */
        public s0 f60855z;

        public a(Context context) {
            this(context, new f(context, 4), new f(context, 5));
        }

        public ExoPlayer build() {
            io.bidmachine.media3.common.util.a.checkState(!this.F);
            this.F = true;
            return new l0(this, null);
        }

        public a experimentalSetDynamicSchedulingEnabled(boolean z10) {
            io.bidmachine.media3.common.util.a.checkState(!this.F);
            this.I = z10;
            return this;
        }

        public a experimentalSetForegroundModeTimeoutMs(long j10) {
            io.bidmachine.media3.common.util.a.checkState(!this.F);
            this.f60832c = j10;
            return this;
        }

        public a setAnalyticsCollector(on.a aVar) {
            io.bidmachine.media3.common.util.a.checkState(!this.F);
            io.bidmachine.media3.common.util.a.checkNotNull(aVar);
            this.f60838i = new d2(aVar, 1);
            return this;
        }

        public a setAudioAttributes(gn.h hVar, boolean z10) {
            io.bidmachine.media3.common.util.a.checkState(!this.F);
            this.f60842m = (gn.h) io.bidmachine.media3.common.util.a.checkNotNull(hVar);
            this.f60843n = z10;
            return this;
        }

        public a setBandwidthMeter(go.f fVar) {
            io.bidmachine.media3.common.util.a.checkState(!this.F);
            io.bidmachine.media3.common.util.a.checkNotNull(fVar);
            this.f60837h = new c0(fVar, 4);
            return this;
        }

        public a setClock(io.bidmachine.media3.common.util.g gVar) {
            io.bidmachine.media3.common.util.a.checkState(!this.F);
            this.f60831b = gVar;
            return this;
        }

        public a setDetachSurfaceTimeoutMs(long j10) {
            io.bidmachine.media3.common.util.a.checkState(!this.F);
            this.B = j10;
            return this;
        }

        public a setDeviceVolumeControlEnabled(boolean z10) {
            io.bidmachine.media3.common.util.a.checkState(!this.F);
            this.f60847r = z10;
            return this;
        }

        public a setHandleAudioBecomingNoisy(boolean z10) {
            io.bidmachine.media3.common.util.a.checkState(!this.F);
            this.f60845p = z10;
            return this;
        }

        public a setLivePlaybackSpeedControl(s0 s0Var) {
            io.bidmachine.media3.common.util.a.checkState(!this.F);
            this.f60855z = (s0) io.bidmachine.media3.common.util.a.checkNotNull(s0Var);
            return this;
        }

        public a setLoadControl(u0 u0Var) {
            io.bidmachine.media3.common.util.a.checkState(!this.F);
            io.bidmachine.media3.common.util.a.checkNotNull(u0Var);
            this.f60836g = new c0(u0Var, 3);
            return this;
        }

        public a setLooper(Looper looper) {
            io.bidmachine.media3.common.util.a.checkState(!this.F);
            io.bidmachine.media3.common.util.a.checkNotNull(looper);
            this.f60839j = looper;
            return this;
        }

        public a setMaxSeekToPreviousPositionMs(long j10) {
            io.bidmachine.media3.common.util.a.checkArgument(j10 >= 0);
            io.bidmachine.media3.common.util.a.checkState(!this.F);
            this.f60854y = j10;
            return this;
        }

        public a setMediaSourceFactory(ao.j0 j0Var) {
            io.bidmachine.media3.common.util.a.checkState(!this.F);
            io.bidmachine.media3.common.util.a.checkNotNull(j0Var);
            this.f60834e = new c0(j0Var, 1);
            return this;
        }

        public a setName(String str) {
            io.bidmachine.media3.common.util.a.checkState(!this.F);
            this.H = str;
            return this;
        }

        public a setPauseAtEndOfMediaItems(boolean z10) {
            io.bidmachine.media3.common.util.a.checkState(!this.F);
            this.C = z10;
            return this;
        }

        public a setPlaybackLooper(Looper looper) {
            io.bidmachine.media3.common.util.a.checkState(!this.F);
            this.E = new l1(looper);
            return this;
        }

        public a setPlaybackLooperProvider(l1 l1Var) {
            io.bidmachine.media3.common.util.a.checkState(!this.F);
            this.E = l1Var;
            return this;
        }

        public a setPriority(int i10) {
            io.bidmachine.media3.common.util.a.checkState(!this.F);
            this.f60840k = i10;
            return this;
        }

        public a setPriorityTaskManager(gn.l1 l1Var) {
            io.bidmachine.media3.common.util.a.checkState(!this.F);
            this.f60841l = l1Var;
            return this;
        }

        public a setReleaseTimeoutMs(long j10) {
            io.bidmachine.media3.common.util.a.checkState(!this.F);
            this.A = j10;
            return this;
        }

        public a setRenderersFactory(x1 x1Var) {
            io.bidmachine.media3.common.util.a.checkState(!this.F);
            io.bidmachine.media3.common.util.a.checkNotNull(x1Var);
            this.f60833d = new c0(x1Var, 0);
            return this;
        }

        public a setSeekBackIncrementMs(long j10) {
            io.bidmachine.media3.common.util.a.checkArgument(j10 > 0);
            io.bidmachine.media3.common.util.a.checkState(!this.F);
            this.f60852w = j10;
            return this;
        }

        public a setSeekForwardIncrementMs(long j10) {
            io.bidmachine.media3.common.util.a.checkArgument(j10 > 0);
            io.bidmachine.media3.common.util.a.checkState(!this.F);
            this.f60853x = j10;
            return this;
        }

        public a setSeekParameters(y1 y1Var) {
            io.bidmachine.media3.common.util.a.checkState(!this.F);
            this.f60851v = (y1) io.bidmachine.media3.common.util.a.checkNotNull(y1Var);
            return this;
        }

        public a setSkipSilenceEnabled(boolean z10) {
            io.bidmachine.media3.common.util.a.checkState(!this.F);
            this.f60846q = z10;
            return this;
        }

        public a setSuitableOutputChecker(i2 i2Var) {
            io.bidmachine.media3.common.util.a.checkState(!this.F);
            this.J = i2Var;
            return this;
        }

        public a setSuppressPlaybackOnUnsuitableOutput(boolean z10) {
            io.bidmachine.media3.common.util.a.checkState(!this.F);
            this.G = z10;
            return this;
        }

        public a setTrackSelector(fo.u uVar) {
            io.bidmachine.media3.common.util.a.checkState(!this.F);
            io.bidmachine.media3.common.util.a.checkNotNull(uVar);
            this.f60835f = new c0(uVar, 2);
            return this;
        }

        public a setUseLazyPreparation(boolean z10) {
            io.bidmachine.media3.common.util.a.checkState(!this.F);
            this.f60850u = z10;
            return this;
        }

        public a setUsePlatformDiagnostics(boolean z10) {
            io.bidmachine.media3.common.util.a.checkState(!this.F);
            this.D = z10;
            return this;
        }

        public a setVideoChangeFrameRateStrategy(int i10) {
            io.bidmachine.media3.common.util.a.checkState(!this.F);
            this.f60849t = i10;
            return this;
        }

        public a setVideoScalingMode(int i10) {
            io.bidmachine.media3.common.util.a.checkState(!this.F);
            this.f60848s = i10;
            return this;
        }

        public a setWakeMode(int i10) {
            io.bidmachine.media3.common.util.a.checkState(!this.F);
            this.f60844o = i10;
            return this;
        }

        public a(Context context, x1 x1Var) {
            this(context, new c0(x1Var, 0), new f(context, 6));
            io.bidmachine.media3.common.util.a.checkNotNull(x1Var);
        }

        public a(Context context, ao.j0 j0Var) {
            this(context, new f(context, 3), new c0(j0Var, 1));
            io.bidmachine.media3.common.util.a.checkNotNull(j0Var);
        }

        public a(Context context, x1 x1Var, ao.j0 j0Var) {
            this(context, new c0(x1Var, 0), new c0(j0Var, 1));
            io.bidmachine.media3.common.util.a.checkNotNull(x1Var);
            io.bidmachine.media3.common.util.a.checkNotNull(j0Var);
        }

        public a(Context context, x1 x1Var, ao.j0 j0Var, fo.u uVar, u0 u0Var, go.f fVar, on.a aVar) {
            this(context, new c0(x1Var, 0), new c0(j0Var, 1), new c0(uVar, 2), new c0(u0Var, 3), new c0(fVar, 4), new d2(aVar, 1));
            io.bidmachine.media3.common.util.a.checkNotNull(x1Var);
            io.bidmachine.media3.common.util.a.checkNotNull(j0Var);
            io.bidmachine.media3.common.util.a.checkNotNull(uVar);
            io.bidmachine.media3.common.util.a.checkNotNull(fVar);
            io.bidmachine.media3.common.util.a.checkNotNull(aVar);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public a(Context context, v2 v2Var, v2 v2Var2) {
            int i10 = 2;
            this(context, v2Var, v2Var2, new f(context, 1), new com.google.android.exoplayer2.w(2), new f(context, i10), new in.c(i10));
        }

        public a(Context context, v2 v2Var, v2 v2Var2, v2 v2Var3, v2 v2Var4, v2 v2Var5, mh.v0 v0Var) {
            this.f60830a = (Context) io.bidmachine.media3.common.util.a.checkNotNull(context);
            this.f60833d = v2Var;
            this.f60834e = v2Var2;
            this.f60835f = v2Var3;
            this.f60836g = v2Var4;
            this.f60837h = v2Var5;
            this.f60838i = v0Var;
            this.f60839j = io.bidmachine.media3.common.util.a1.getCurrentOrMainLooper();
            this.f60842m = gn.h.f57892g;
            this.f60844o = 0;
            this.f60848s = 1;
            this.f60849t = 0;
            this.f60850u = true;
            this.f60851v = y1.f61604c;
            this.f60852w = 5000L;
            this.f60853x = MBInterstitialActivity.WEB_LOAD_TIME;
            this.f60854y = 3000L;
            this.f60855z = new l().build();
            this.f60831b = io.bidmachine.media3.common.util.g.f60717a;
            this.A = 500L;
            this.B = 2000L;
            this.D = true;
            this.H = "";
            this.f60840k = -1000;
            this.J = new z();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class b {

        /* renamed from: b, reason: collision with root package name */
        public static final b f60856b = new b(C.TIME_UNSET);

        /* renamed from: a, reason: collision with root package name */
        public final long f60857a;

        public b(long j10) {
            this.f60857a = j10;
        }
    }

    void addAnalyticsListener(on.d dVar);

    void addAudioOffloadListener(b0 b0Var);

    @Override // gn.i1
    /* synthetic */ void addListener(gn.g1 g1Var);

    @Override // gn.i1
    /* synthetic */ void addMediaItem(int i10, gn.p0 p0Var);

    @Override // gn.i1
    /* synthetic */ void addMediaItem(gn.p0 p0Var);

    @Override // gn.i1
    /* synthetic */ void addMediaItems(int i10, List list);

    @Override // gn.i1
    /* synthetic */ void addMediaItems(List list);

    void addMediaSource(int i10, ao.m0 m0Var);

    void addMediaSource(ao.m0 m0Var);

    void addMediaSources(int i10, List<ao.m0> list);

    void addMediaSources(List<ao.m0> list);

    @Override // gn.i1
    /* synthetic */ boolean canAdvertiseSession();

    void clearAuxEffectInfo();

    void clearCameraMotionListener(jo.a aVar);

    @Override // gn.i1
    /* synthetic */ void clearMediaItems();

    void clearVideoFrameMetadataListener(io.v vVar);

    @Override // gn.i1
    /* synthetic */ void clearVideoSurface();

    @Override // gn.i1
    /* synthetic */ void clearVideoSurface(Surface surface);

    @Override // gn.i1
    /* synthetic */ void clearVideoSurfaceHolder(SurfaceHolder surfaceHolder);

    @Override // gn.i1
    /* synthetic */ void clearVideoSurfaceView(SurfaceView surfaceView);

    @Override // gn.i1
    /* synthetic */ void clearVideoTextureView(TextureView textureView);

    o1 createMessage(n1 n1Var);

    @Override // gn.i1
    @Deprecated
    /* synthetic */ void decreaseDeviceVolume();

    @Override // gn.i1
    /* synthetic */ void decreaseDeviceVolume(int i10);

    on.a getAnalyticsCollector();

    @Override // gn.i1
    /* synthetic */ Looper getApplicationLooper();

    @Override // gn.i1
    /* synthetic */ gn.h getAudioAttributes();

    j getAudioDecoderCounters();

    io.bidmachine.media3.common.b getAudioFormat();

    int getAudioSessionId();

    @Override // gn.i1
    /* synthetic */ gn.e1 getAvailableCommands();

    @Override // gn.i1
    /* synthetic */ int getBufferedPercentage();

    @Override // gn.i1
    /* synthetic */ long getBufferedPosition();

    io.bidmachine.media3.common.util.g getClock();

    @Override // gn.i1
    /* synthetic */ long getContentBufferedPosition();

    @Override // gn.i1
    /* synthetic */ long getContentDuration();

    @Override // gn.i1
    /* synthetic */ long getContentPosition();

    @Override // gn.i1
    /* synthetic */ int getCurrentAdGroupIndex();

    @Override // gn.i1
    /* synthetic */ int getCurrentAdIndexInAdGroup();

    @Override // gn.i1
    /* synthetic */ in.d getCurrentCues();

    @Override // gn.i1
    /* synthetic */ long getCurrentLiveOffset();

    @Override // gn.i1
    /* synthetic */ Object getCurrentManifest();

    @Override // gn.i1
    /* synthetic */ gn.p0 getCurrentMediaItem();

    @Override // gn.i1
    /* synthetic */ int getCurrentMediaItemIndex();

    @Override // gn.i1
    /* synthetic */ int getCurrentPeriodIndex();

    @Override // gn.i1
    /* synthetic */ long getCurrentPosition();

    @Override // gn.i1
    /* synthetic */ gn.u1 getCurrentTimeline();

    @Deprecated
    ao.b2 getCurrentTrackGroups();

    @Deprecated
    fo.q getCurrentTrackSelections();

    @Override // gn.i1
    /* synthetic */ gn.b2 getCurrentTracks();

    @Override // gn.i1
    @Deprecated
    /* synthetic */ int getCurrentWindowIndex();

    @Override // gn.i1
    /* synthetic */ gn.q getDeviceInfo();

    @Override // gn.i1
    /* synthetic */ int getDeviceVolume();

    @Override // gn.i1
    /* synthetic */ long getDuration();

    @Override // gn.i1
    /* synthetic */ long getMaxSeekToPreviousPosition();

    @Override // gn.i1
    /* synthetic */ gn.p0 getMediaItemAt(int i10);

    @Override // gn.i1
    /* synthetic */ int getMediaItemCount();

    @Override // gn.i1
    /* synthetic */ gn.s0 getMediaMetadata();

    @Override // gn.i1
    /* synthetic */ int getNextMediaItemIndex();

    @Override // gn.i1
    @Deprecated
    /* synthetic */ int getNextWindowIndex();

    boolean getPauseAtEndOfMediaItems();

    @Override // gn.i1
    /* synthetic */ boolean getPlayWhenReady();

    Looper getPlaybackLooper();

    @Override // gn.i1
    /* synthetic */ gn.c1 getPlaybackParameters();

    @Override // gn.i1
    /* synthetic */ int getPlaybackState();

    @Override // gn.i1
    /* synthetic */ int getPlaybackSuppressionReason();

    @Override // gn.i1
    a0 getPlayerError();

    @Override // gn.i1
    /* synthetic */ gn.s0 getPlaylistMetadata();

    b getPreloadConfiguration();

    @Override // gn.i1
    /* synthetic */ int getPreviousMediaItemIndex();

    @Override // gn.i1
    @Deprecated
    /* synthetic */ int getPreviousWindowIndex();

    s1 getRenderer(int i10);

    int getRendererCount();

    int getRendererType(int i10);

    @Override // gn.i1
    /* synthetic */ int getRepeatMode();

    default s1 getSecondaryRenderer(int i10) {
        return null;
    }

    @Override // gn.i1
    /* synthetic */ long getSeekBackIncrement();

    @Override // gn.i1
    /* synthetic */ long getSeekForwardIncrement();

    y1 getSeekParameters();

    @Override // gn.i1
    /* synthetic */ boolean getShuffleModeEnabled();

    boolean getSkipSilenceEnabled();

    @Override // gn.i1
    /* synthetic */ io.bidmachine.media3.common.util.p0 getSurfaceSize();

    @Override // gn.i1
    /* synthetic */ long getTotalBufferedDuration();

    @Override // gn.i1
    /* synthetic */ gn.a2 getTrackSelectionParameters();

    fo.u getTrackSelector();

    int getVideoChangeFrameRateStrategy();

    j getVideoDecoderCounters();

    io.bidmachine.media3.common.b getVideoFormat();

    int getVideoScalingMode();

    @Override // gn.i1
    /* synthetic */ gn.k2 getVideoSize();

    @Override // gn.i1
    /* synthetic */ float getVolume();

    @Override // gn.i1
    @Deprecated
    /* synthetic */ boolean hasNext();

    @Override // gn.i1
    /* synthetic */ boolean hasNextMediaItem();

    @Override // gn.i1
    @Deprecated
    /* synthetic */ boolean hasNextWindow();

    @Override // gn.i1
    /* synthetic */ boolean hasPreviousMediaItem();

    @Override // gn.i1
    @Deprecated
    /* synthetic */ void increaseDeviceVolume();

    @Override // gn.i1
    /* synthetic */ void increaseDeviceVolume(int i10);

    @Override // gn.i1
    /* synthetic */ boolean isCommandAvailable(int i10);

    @Override // gn.i1
    /* synthetic */ boolean isCurrentMediaItemDynamic();

    @Override // gn.i1
    /* synthetic */ boolean isCurrentMediaItemLive();

    @Override // gn.i1
    /* synthetic */ boolean isCurrentMediaItemSeekable();

    @Override // gn.i1
    @Deprecated
    /* synthetic */ boolean isCurrentWindowDynamic();

    @Override // gn.i1
    @Deprecated
    /* synthetic */ boolean isCurrentWindowLive();

    @Override // gn.i1
    @Deprecated
    /* synthetic */ boolean isCurrentWindowSeekable();

    @Override // gn.i1
    /* synthetic */ boolean isDeviceMuted();

    @Override // gn.i1
    /* synthetic */ boolean isLoading();

    @Override // gn.i1
    /* synthetic */ boolean isPlaying();

    @Override // gn.i1
    /* synthetic */ boolean isPlayingAd();

    boolean isReleased();

    boolean isSleepingForOffload();

    boolean isTunnelingEnabled();

    @Override // gn.i1
    /* synthetic */ void moveMediaItem(int i10, int i11);

    @Override // gn.i1
    /* synthetic */ void moveMediaItems(int i10, int i11, int i12);

    @Override // gn.i1
    @Deprecated
    /* synthetic */ void next();

    @Override // gn.i1
    /* synthetic */ void pause();

    @Override // gn.i1
    /* synthetic */ void play();

    @Override // gn.i1
    /* synthetic */ void prepare();

    @Deprecated
    void prepare(ao.m0 m0Var);

    @Deprecated
    void prepare(ao.m0 m0Var, boolean z10, boolean z11);

    @Override // gn.i1
    void release();

    void removeAnalyticsListener(on.d dVar);

    void removeAudioOffloadListener(b0 b0Var);

    @Override // gn.i1
    /* synthetic */ void removeListener(gn.g1 g1Var);

    @Override // gn.i1
    /* synthetic */ void removeMediaItem(int i10);

    @Override // gn.i1
    /* synthetic */ void removeMediaItems(int i10, int i11);

    @Override // gn.i1
    void replaceMediaItem(int i10, gn.p0 p0Var);

    @Override // gn.i1
    void replaceMediaItems(int i10, int i11, List<gn.p0> list);

    @Override // gn.i1
    /* synthetic */ void seekBack();

    @Override // gn.i1
    /* synthetic */ void seekForward();

    @Override // gn.i1
    /* synthetic */ void seekTo(int i10, long j10);

    @Override // gn.i1
    /* synthetic */ void seekTo(long j10);

    @Override // gn.i1
    /* synthetic */ void seekToDefaultPosition();

    @Override // gn.i1
    /* synthetic */ void seekToDefaultPosition(int i10);

    @Override // gn.i1
    /* synthetic */ void seekToNext();

    @Override // gn.i1
    /* synthetic */ void seekToNextMediaItem();

    @Override // gn.i1
    @Deprecated
    /* synthetic */ void seekToNextWindow();

    @Override // gn.i1
    /* synthetic */ void seekToPrevious();

    @Override // gn.i1
    /* synthetic */ void seekToPreviousMediaItem();

    @Override // gn.i1
    @Deprecated
    /* synthetic */ void seekToPreviousWindow();

    @Override // gn.i1
    /* synthetic */ void setAudioAttributes(gn.h hVar, boolean z10);

    void setAudioSessionId(int i10);

    void setAuxEffectInfo(gn.i iVar);

    void setCameraMotionListener(jo.a aVar);

    @Override // gn.i1
    @Deprecated
    /* synthetic */ void setDeviceMuted(boolean z10);

    @Override // gn.i1
    /* synthetic */ void setDeviceMuted(boolean z10, int i10);

    @Override // gn.i1
    @Deprecated
    /* synthetic */ void setDeviceVolume(int i10);

    @Override // gn.i1
    /* synthetic */ void setDeviceVolume(int i10, int i11);

    void setForegroundMode(boolean z10);

    void setHandleAudioBecomingNoisy(boolean z10);

    void setImageOutput(ImageOutput imageOutput);

    @Override // gn.i1
    /* synthetic */ void setMediaItem(gn.p0 p0Var);

    @Override // gn.i1
    /* synthetic */ void setMediaItem(gn.p0 p0Var, long j10);

    @Override // gn.i1
    /* synthetic */ void setMediaItem(gn.p0 p0Var, boolean z10);

    @Override // gn.i1
    /* synthetic */ void setMediaItems(List list);

    @Override // gn.i1
    /* synthetic */ void setMediaItems(List list, int i10, long j10);

    @Override // gn.i1
    /* synthetic */ void setMediaItems(List list, boolean z10);

    void setMediaSource(ao.m0 m0Var);

    void setMediaSource(ao.m0 m0Var, long j10);

    void setMediaSource(ao.m0 m0Var, boolean z10);

    void setMediaSources(List<ao.m0> list);

    void setMediaSources(List<ao.m0> list, int i10, long j10);

    void setMediaSources(List<ao.m0> list, boolean z10);

    void setPauseAtEndOfMediaItems(boolean z10);

    @Override // gn.i1
    /* synthetic */ void setPlayWhenReady(boolean z10);

    @Override // gn.i1
    /* synthetic */ void setPlaybackParameters(gn.c1 c1Var);

    @Override // gn.i1
    /* synthetic */ void setPlaybackSpeed(float f10);

    @Override // gn.i1
    /* synthetic */ void setPlaylistMetadata(gn.s0 s0Var);

    void setPreferredAudioDevice(AudioDeviceInfo audioDeviceInfo);

    void setPreloadConfiguration(b bVar);

    void setPriority(int i10);

    void setPriorityTaskManager(gn.l1 l1Var);

    @Override // gn.i1
    /* synthetic */ void setRepeatMode(int i10);

    void setSeekParameters(y1 y1Var);

    @Override // gn.i1
    /* synthetic */ void setShuffleModeEnabled(boolean z10);

    void setShuffleOrder(ao.s1 s1Var);

    void setSkipSilenceEnabled(boolean z10);

    @Override // gn.i1
    /* synthetic */ void setTrackSelectionParameters(gn.a2 a2Var);

    void setVideoChangeFrameRateStrategy(int i10);

    void setVideoEffects(List<Object> list);

    void setVideoFrameMetadataListener(io.v vVar);

    void setVideoScalingMode(int i10);

    @Override // gn.i1
    /* synthetic */ void setVideoSurface(Surface surface);

    @Override // gn.i1
    /* synthetic */ void setVideoSurfaceHolder(SurfaceHolder surfaceHolder);

    @Override // gn.i1
    /* synthetic */ void setVideoSurfaceView(SurfaceView surfaceView);

    @Override // gn.i1
    /* synthetic */ void setVideoTextureView(TextureView textureView);

    @Override // gn.i1
    /* synthetic */ void setVolume(float f10);

    void setWakeMode(int i10);

    @Override // gn.i1
    /* synthetic */ void stop();
}
