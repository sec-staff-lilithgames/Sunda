package io.odeeo.internal.b;

import android.content.Context;
import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import com.mbridge.msdk.interstitial.view.MBInterstitialActivity;
import io.odeeo.internal.b.i;
import io.odeeo.internal.b.l0;
import io.odeeo.internal.b.m0;
import io.odeeo.internal.b.o;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public interface o extends l0 {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @Deprecated
    public interface a {
        @Deprecated
        void clearAuxEffectInfo();

        @Deprecated
        io.odeeo.internal.d.d getAudioAttributes();

        @Deprecated
        int getAudioSessionId();

        @Deprecated
        boolean getSkipSilenceEnabled();

        @Deprecated
        float getVolume();

        @Deprecated
        void setAudioAttributes(io.odeeo.internal.d.d dVar, boolean z10);

        @Deprecated
        void setAudioSessionId(int i10);

        @Deprecated
        void setAuxEffectInfo(io.odeeo.internal.d.k kVar);

        @Deprecated
        void setSkipSilenceEnabled(boolean z10);

        @Deprecated
        void setVolume(float f10);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c {
        public boolean A;

        /* renamed from: a, reason: collision with root package name */
        public final Context f62847a;

        /* renamed from: b, reason: collision with root package name */
        public io.odeeo.internal.q0.d f62848b;

        /* renamed from: c, reason: collision with root package name */
        public long f62849c;

        /* renamed from: d, reason: collision with root package name */
        public io.odeeo.internal.t0.b0<s0> f62850d;

        /* renamed from: e, reason: collision with root package name */
        public io.odeeo.internal.t0.b0<io.odeeo.internal.a0.v> f62851e;

        /* renamed from: f, reason: collision with root package name */
        public io.odeeo.internal.t0.b0<io.odeeo.internal.n0.k> f62852f;

        /* renamed from: g, reason: collision with root package name */
        public io.odeeo.internal.t0.b0<y> f62853g;

        /* renamed from: h, reason: collision with root package name */
        public io.odeeo.internal.t0.b0<io.odeeo.internal.p0.d> f62854h;

        /* renamed from: i, reason: collision with root package name */
        public io.odeeo.internal.t0.b0<io.odeeo.internal.c.a> f62855i;

        /* renamed from: j, reason: collision with root package name */
        public Looper f62856j;

        /* renamed from: k, reason: collision with root package name */
        public io.odeeo.internal.q0.z f62857k;

        /* renamed from: l, reason: collision with root package name */
        public io.odeeo.internal.d.d f62858l;

        /* renamed from: m, reason: collision with root package name */
        public boolean f62859m;

        /* renamed from: n, reason: collision with root package name */
        public int f62860n;

        /* renamed from: o, reason: collision with root package name */
        public boolean f62861o;

        /* renamed from: p, reason: collision with root package name */
        public boolean f62862p;

        /* renamed from: q, reason: collision with root package name */
        public int f62863q;

        /* renamed from: r, reason: collision with root package name */
        public int f62864r;

        /* renamed from: s, reason: collision with root package name */
        public boolean f62865s;

        /* renamed from: t, reason: collision with root package name */
        public t0 f62866t;

        /* renamed from: u, reason: collision with root package name */
        public long f62867u;

        /* renamed from: v, reason: collision with root package name */
        public long f62868v;

        /* renamed from: w, reason: collision with root package name */
        public x f62869w;

        /* renamed from: x, reason: collision with root package name */
        public long f62870x;

        /* renamed from: y, reason: collision with root package name */
        public long f62871y;

        /* renamed from: z, reason: collision with root package name */
        public boolean f62872z;

        /* JADX WARN: Illegal instructions before constructor call */
        public c(final Context context) {
            final int i10 = 2;
            final int i11 = 3;
            this(context, (io.odeeo.internal.t0.b0<s0>) new io.odeeo.internal.t0.b0() { // from class: is.d
                @Override // io.odeeo.internal.t0.b0
                public final Object get() {
                    switch (i10) {
                        case 0:
                            return o.c.e(context);
                        case 1:
                            return o.c.f(context);
                        case 2:
                            return o.c.a(context);
                        case 3:
                            return o.c.b(context);
                        case 4:
                            return o.c.c(context);
                        default:
                            return io.odeeo.internal.p0.o.getSingletonInstance(context);
                    }
                }
            }, (io.odeeo.internal.t0.b0<io.odeeo.internal.a0.v>) new io.odeeo.internal.t0.b0() { // from class: is.d
                @Override // io.odeeo.internal.t0.b0
                public final Object get() {
                    switch (i11) {
                        case 0:
                            return o.c.e(context);
                        case 1:
                            return o.c.f(context);
                        case 2:
                            return o.c.a(context);
                        case 3:
                            return o.c.b(context);
                        case 4:
                            return o.c.c(context);
                        default:
                            return io.odeeo.internal.p0.o.getSingletonInstance(context);
                    }
                }
            });
        }

        public static /* synthetic */ io.odeeo.internal.a0.v b(io.odeeo.internal.a0.v vVar) {
            return vVar;
        }

        public static /* synthetic */ io.odeeo.internal.a0.v c(io.odeeo.internal.a0.v vVar) {
            return vVar;
        }

        public static /* synthetic */ io.odeeo.internal.a0.v d(io.odeeo.internal.a0.v vVar) {
            return vVar;
        }

        public static /* synthetic */ io.odeeo.internal.a0.v e(Context context) {
            return new io.odeeo.internal.a0.j(context, new io.odeeo.internal.g.f());
        }

        public static /* synthetic */ s0 f(Context context) {
            return new l(context);
        }

        public o build() {
            return a();
        }

        public c experimentalSetForegroundModeTimeoutMs(long j10) {
            io.odeeo.internal.q0.a.checkState(!this.A);
            this.f62849c = j10;
            return this;
        }

        public c setAnalyticsCollector(io.odeeo.internal.c.a aVar) {
            io.odeeo.internal.q0.a.checkState(!this.A);
            this.f62855i = new is.i(aVar, 1);
            return this;
        }

        public c setAudioAttributes(io.odeeo.internal.d.d dVar, boolean z10) {
            io.odeeo.internal.q0.a.checkState(!this.A);
            this.f62858l = dVar;
            this.f62859m = z10;
            return this;
        }

        public c setBandwidthMeter(io.odeeo.internal.p0.d dVar) {
            io.odeeo.internal.q0.a.checkState(!this.A);
            this.f62854h = new is.h(dVar, 1);
            return this;
        }

        public c setClock(io.odeeo.internal.q0.d dVar) {
            io.odeeo.internal.q0.a.checkState(!this.A);
            this.f62848b = dVar;
            return this;
        }

        public c setDetachSurfaceTimeoutMs(long j10) {
            io.odeeo.internal.q0.a.checkState(!this.A);
            this.f62871y = j10;
            return this;
        }

        public c setHandleAudioBecomingNoisy(boolean z10) {
            io.odeeo.internal.q0.a.checkState(!this.A);
            this.f62861o = z10;
            return this;
        }

        public c setLivePlaybackSpeedControl(x xVar) {
            io.odeeo.internal.q0.a.checkState(!this.A);
            this.f62869w = xVar;
            return this;
        }

        public c setLoadControl(y yVar) {
            io.odeeo.internal.q0.a.checkState(!this.A);
            this.f62853g = new is.g(yVar, 1);
            return this;
        }

        public c setLooper(Looper looper) {
            io.odeeo.internal.q0.a.checkState(!this.A);
            this.f62856j = looper;
            return this;
        }

        public c setMediaSourceFactory(io.odeeo.internal.a0.v vVar) {
            io.odeeo.internal.q0.a.checkState(!this.A);
            this.f62851e = new is.f(vVar, 1);
            return this;
        }

        public c setPauseAtEndOfMediaItems(boolean z10) {
            io.odeeo.internal.q0.a.checkState(!this.A);
            this.f62872z = z10;
            return this;
        }

        public c setPriorityTaskManager(io.odeeo.internal.q0.z zVar) {
            io.odeeo.internal.q0.a.checkState(!this.A);
            this.f62857k = zVar;
            return this;
        }

        public c setReleaseTimeoutMs(long j10) {
            io.odeeo.internal.q0.a.checkState(!this.A);
            this.f62870x = j10;
            return this;
        }

        public c setRenderersFactory(s0 s0Var) {
            io.odeeo.internal.q0.a.checkState(!this.A);
            this.f62850d = new is.c(s0Var, 3);
            return this;
        }

        public c setSeekBackIncrementMs(long j10) {
            io.odeeo.internal.q0.a.checkArgument(j10 > 0);
            io.odeeo.internal.q0.a.checkState(!this.A);
            this.f62867u = j10;
            return this;
        }

        public c setSeekForwardIncrementMs(long j10) {
            io.odeeo.internal.q0.a.checkArgument(j10 > 0);
            io.odeeo.internal.q0.a.checkState(!this.A);
            this.f62868v = j10;
            return this;
        }

        public c setSeekParameters(t0 t0Var) {
            io.odeeo.internal.q0.a.checkState(!this.A);
            this.f62866t = t0Var;
            return this;
        }

        public c setSkipSilenceEnabled(boolean z10) {
            io.odeeo.internal.q0.a.checkState(!this.A);
            this.f62862p = z10;
            return this;
        }

        public c setTrackSelector(io.odeeo.internal.n0.k kVar) {
            io.odeeo.internal.q0.a.checkState(!this.A);
            this.f62852f = new is.e(kVar, 0);
            return this;
        }

        public c setUseLazyPreparation(boolean z10) {
            io.odeeo.internal.q0.a.checkState(!this.A);
            this.f62865s = z10;
            return this;
        }

        public c setVideoChangeFrameRateStrategy(int i10) {
            io.odeeo.internal.q0.a.checkState(!this.A);
            this.f62864r = i10;
            return this;
        }

        public c setVideoScalingMode(int i10) {
            io.odeeo.internal.q0.a.checkState(!this.A);
            this.f62863q = i10;
            return this;
        }

        public c setWakeMode(int i10) {
            io.odeeo.internal.q0.a.checkState(!this.A);
            this.f62860n = i10;
            return this;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public c(final Context context, s0 s0Var) {
            final int i10 = 0;
            this(context, new is.c(s0Var, 1), (io.odeeo.internal.t0.b0<io.odeeo.internal.a0.v>) new io.odeeo.internal.t0.b0() { // from class: is.d
                @Override // io.odeeo.internal.t0.b0
                public final Object get() {
                    switch (i10) {
                        case 0:
                            return o.c.e(context);
                        case 1:
                            return o.c.f(context);
                        case 2:
                            return o.c.a(context);
                        case 3:
                            return o.c.b(context);
                        case 4:
                            return o.c.c(context);
                        default:
                            return io.odeeo.internal.p0.o.getSingletonInstance(context);
                    }
                }
            });
        }

        public static /* synthetic */ io.odeeo.internal.a0.v a(io.odeeo.internal.a0.v vVar) {
            return vVar;
        }

        public static /* synthetic */ s0 b(s0 s0Var) {
            return s0Var;
        }

        public static /* synthetic */ s0 c(s0 s0Var) {
            return s0Var;
        }

        public static /* synthetic */ s0 d(s0 s0Var) {
            return s0Var;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public c(final Context context, io.odeeo.internal.a0.v vVar) {
            final int i10 = 1;
            this(context, (io.odeeo.internal.t0.b0<s0>) new io.odeeo.internal.t0.b0() { // from class: is.d
                @Override // io.odeeo.internal.t0.b0
                public final Object get() {
                    switch (i10) {
                        case 0:
                            return o.c.e(context);
                        case 1:
                            return o.c.f(context);
                        case 2:
                            return o.c.a(context);
                        case 3:
                            return o.c.b(context);
                        case 4:
                            return o.c.c(context);
                        default:
                            return io.odeeo.internal.p0.o.getSingletonInstance(context);
                    }
                }
            }, new is.f(vVar, 0));
        }

        public static /* synthetic */ s0 a(s0 s0Var) {
            return s0Var;
        }

        public static /* synthetic */ y b(y yVar) {
            return yVar;
        }

        public static /* synthetic */ io.odeeo.internal.n0.k c(Context context) {
            return new io.odeeo.internal.n0.c(context);
        }

        public c(Context context, s0 s0Var, io.odeeo.internal.a0.v vVar) {
            this(context, new is.c(s0Var, 0), new is.f(vVar, 3));
        }

        public static /* synthetic */ y a(y yVar) {
            return yVar;
        }

        public static /* synthetic */ io.odeeo.internal.c.a b(io.odeeo.internal.c.a aVar) {
            return aVar;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public c(Context context, s0 s0Var, io.odeeo.internal.a0.v vVar, io.odeeo.internal.n0.k kVar, y yVar, io.odeeo.internal.p0.d dVar, io.odeeo.internal.c.a aVar) {
            int i10 = 0;
            this(context, new is.c(s0Var, 2), new is.f(vVar, 2), new is.e(kVar, 1), new is.g(yVar, i10), new is.h(dVar, i10), new is.i(aVar, i10));
        }

        public static /* synthetic */ io.odeeo.internal.c.a a(io.odeeo.internal.c.a aVar) {
            return aVar;
        }

        public static /* synthetic */ io.odeeo.internal.n0.k b(io.odeeo.internal.n0.k kVar) {
            return kVar;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public c(final Context context, io.odeeo.internal.t0.b0<s0> b0Var, io.odeeo.internal.t0.b0<io.odeeo.internal.a0.v> b0Var2) {
            final int i10 = 4;
            final int i11 = 5;
            this(context, b0Var, b0Var2, (io.odeeo.internal.t0.b0<io.odeeo.internal.n0.k>) new io.odeeo.internal.t0.b0() { // from class: is.d
                @Override // io.odeeo.internal.t0.b0
                public final Object get() {
                    switch (i10) {
                        case 0:
                            return o.c.e(context);
                        case 1:
                            return o.c.f(context);
                        case 2:
                            return o.c.a(context);
                        case 3:
                            return o.c.b(context);
                        case 4:
                            return o.c.c(context);
                        default:
                            return io.odeeo.internal.p0.o.getSingletonInstance(context);
                    }
                }
            }, new is.j(), (io.odeeo.internal.t0.b0<io.odeeo.internal.p0.d>) new io.odeeo.internal.t0.b0() { // from class: is.d
                @Override // io.odeeo.internal.t0.b0
                public final Object get() {
                    switch (i11) {
                        case 0:
                            return o.c.e(context);
                        case 1:
                            return o.c.f(context);
                        case 2:
                            return o.c.a(context);
                        case 3:
                            return o.c.b(context);
                        case 4:
                            return o.c.c(context);
                        default:
                            return io.odeeo.internal.p0.o.getSingletonInstance(context);
                    }
                }
            }, (io.odeeo.internal.t0.b0<io.odeeo.internal.c.a>) null);
        }

        public static /* synthetic */ io.odeeo.internal.n0.k a(io.odeeo.internal.n0.k kVar) {
            return kVar;
        }

        public static /* synthetic */ io.odeeo.internal.p0.d b(io.odeeo.internal.p0.d dVar) {
            return dVar;
        }

        public c(Context context, io.odeeo.internal.t0.b0<s0> b0Var, io.odeeo.internal.t0.b0<io.odeeo.internal.a0.v> b0Var2, io.odeeo.internal.t0.b0<io.odeeo.internal.n0.k> b0Var3, io.odeeo.internal.t0.b0<y> b0Var4, io.odeeo.internal.t0.b0<io.odeeo.internal.p0.d> b0Var5, io.odeeo.internal.t0.b0<io.odeeo.internal.c.a> b0Var6) {
            this.f62847a = context;
            this.f62850d = b0Var;
            this.f62851e = b0Var2;
            this.f62852f = b0Var3;
            this.f62853g = b0Var4;
            this.f62854h = b0Var5;
            this.f62855i = b0Var6 == null ? new hs.d(this, 2) : b0Var6;
            this.f62856j = io.odeeo.internal.q0.g0.getCurrentOrMainLooper();
            this.f62858l = io.odeeo.internal.d.d.f63334f;
            this.f62860n = 0;
            this.f62863q = 1;
            this.f62864r = 0;
            this.f62865s = true;
            this.f62866t = t0.f63016g;
            this.f62867u = 5000L;
            this.f62868v = MBInterstitialActivity.WEB_LOAD_TIME;
            this.f62869w = new i.b().build();
            this.f62848b = io.odeeo.internal.q0.d.f65844a;
            this.f62870x = 500L;
            this.f62871y = 2000L;
        }

        public static /* synthetic */ io.odeeo.internal.p0.d a(io.odeeo.internal.p0.d dVar) {
            return dVar;
        }

        public static /* synthetic */ io.odeeo.internal.a0.v b(Context context) {
            return new io.odeeo.internal.a0.j(context, new io.odeeo.internal.g.f());
        }

        public static /* synthetic */ s0 a(Context context) {
            return new l(context);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ io.odeeo.internal.c.a b() {
            return new io.odeeo.internal.c.a((io.odeeo.internal.q0.d) io.odeeo.internal.q0.a.checkNotNull(this.f62848b));
        }

        public u0 a() {
            io.odeeo.internal.q0.a.checkState(!this.A);
            this.A = true;
            return new u0(this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @Deprecated
    public interface d {
        @Deprecated
        void decreaseDeviceVolume();

        @Deprecated
        m getDeviceInfo();

        @Deprecated
        int getDeviceVolume();

        @Deprecated
        void increaseDeviceVolume();

        @Deprecated
        boolean isDeviceMuted();

        @Deprecated
        void setDeviceMuted(boolean z10);

        @Deprecated
        void setDeviceVolume(int i10);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @Deprecated
    public interface e {
        @Deprecated
        List<io.odeeo.internal.d0.a> getCurrentCues();
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @Deprecated
    public interface f {
        @Deprecated
        void clearCameraMotionListener(io.odeeo.internal.s0.a aVar);

        @Deprecated
        void clearVideoFrameMetadataListener(io.odeeo.internal.r0.j jVar);

        @Deprecated
        void clearVideoSurface();

        @Deprecated
        void clearVideoSurface(Surface surface);

        @Deprecated
        void clearVideoSurfaceHolder(SurfaceHolder surfaceHolder);

        @Deprecated
        void clearVideoSurfaceView(SurfaceView surfaceView);

        @Deprecated
        void clearVideoTextureView(TextureView textureView);

        @Deprecated
        int getVideoChangeFrameRateStrategy();

        @Deprecated
        int getVideoScalingMode();

        @Deprecated
        io.odeeo.internal.r0.m getVideoSize();

        @Deprecated
        void setCameraMotionListener(io.odeeo.internal.s0.a aVar);

        @Deprecated
        void setVideoChangeFrameRateStrategy(int i10);

        @Deprecated
        void setVideoFrameMetadataListener(io.odeeo.internal.r0.j jVar);

        @Deprecated
        void setVideoScalingMode(int i10);

        @Deprecated
        void setVideoSurface(Surface surface);

        @Deprecated
        void setVideoSurfaceHolder(SurfaceHolder surfaceHolder);

        @Deprecated
        void setVideoSurfaceView(SurfaceView surfaceView);

        @Deprecated
        void setVideoTextureView(TextureView textureView);
    }

    void addAnalyticsListener(io.odeeo.internal.c.b bVar);

    void addAudioOffloadListener(b bVar);

    @Deprecated
    void addListener(l0.c cVar);

    @Override // io.odeeo.internal.b.l0
    /* synthetic */ void addListener(l0.e eVar);

    @Override // io.odeeo.internal.b.l0
    /* synthetic */ void addMediaItem(int i10, z zVar);

    @Override // io.odeeo.internal.b.l0
    /* synthetic */ void addMediaItem(z zVar);

    @Override // io.odeeo.internal.b.l0
    /* synthetic */ void addMediaItems(int i10, List list);

    @Override // io.odeeo.internal.b.l0
    /* synthetic */ void addMediaItems(List list);

    void addMediaSource(int i10, io.odeeo.internal.a0.t tVar);

    void addMediaSource(io.odeeo.internal.a0.t tVar);

    void addMediaSources(int i10, List<io.odeeo.internal.a0.t> list);

    void addMediaSources(List<io.odeeo.internal.a0.t> list);

    @Override // io.odeeo.internal.b.l0
    /* synthetic */ boolean canAdvertiseSession();

    void clearAuxEffectInfo();

    void clearCameraMotionListener(io.odeeo.internal.s0.a aVar);

    @Override // io.odeeo.internal.b.l0
    /* synthetic */ void clearMediaItems();

    void clearVideoFrameMetadataListener(io.odeeo.internal.r0.j jVar);

    @Override // io.odeeo.internal.b.l0
    /* synthetic */ void clearVideoSurface();

    @Override // io.odeeo.internal.b.l0
    /* synthetic */ void clearVideoSurface(Surface surface);

    @Override // io.odeeo.internal.b.l0
    /* synthetic */ void clearVideoSurfaceHolder(SurfaceHolder surfaceHolder);

    @Override // io.odeeo.internal.b.l0
    /* synthetic */ void clearVideoSurfaceView(SurfaceView surfaceView);

    @Override // io.odeeo.internal.b.l0
    /* synthetic */ void clearVideoTextureView(TextureView textureView);

    m0 createMessage(m0.b bVar);

    @Override // io.odeeo.internal.b.l0
    /* synthetic */ void decreaseDeviceVolume();

    boolean experimentalIsSleepingForOffload();

    void experimentalSetOffloadSchedulingEnabled(boolean z10);

    io.odeeo.internal.c.a getAnalyticsCollector();

    @Override // io.odeeo.internal.b.l0
    /* synthetic */ Looper getApplicationLooper();

    @Override // io.odeeo.internal.b.l0
    /* synthetic */ io.odeeo.internal.d.d getAudioAttributes();

    @Deprecated
    a getAudioComponent();

    io.odeeo.internal.e.e getAudioDecoderCounters();

    t getAudioFormat();

    int getAudioSessionId();

    @Override // io.odeeo.internal.b.l0
    /* synthetic */ l0.b getAvailableCommands();

    @Override // io.odeeo.internal.b.l0
    /* synthetic */ int getBufferedPercentage();

    @Override // io.odeeo.internal.b.l0
    /* synthetic */ long getBufferedPosition();

    io.odeeo.internal.q0.d getClock();

    @Override // io.odeeo.internal.b.l0
    /* synthetic */ long getContentBufferedPosition();

    @Override // io.odeeo.internal.b.l0
    /* synthetic */ long getContentDuration();

    @Override // io.odeeo.internal.b.l0
    /* synthetic */ long getContentPosition();

    @Override // io.odeeo.internal.b.l0
    /* synthetic */ int getCurrentAdGroupIndex();

    @Override // io.odeeo.internal.b.l0
    /* synthetic */ int getCurrentAdIndexInAdGroup();

    @Override // io.odeeo.internal.b.l0
    /* synthetic */ List getCurrentCues();

    @Override // io.odeeo.internal.b.l0
    /* synthetic */ long getCurrentLiveOffset();

    @Override // io.odeeo.internal.b.l0
    /* synthetic */ Object getCurrentManifest();

    @Override // io.odeeo.internal.b.l0
    /* synthetic */ z getCurrentMediaItem();

    @Override // io.odeeo.internal.b.l0
    /* synthetic */ int getCurrentMediaItemIndex();

    @Override // io.odeeo.internal.b.l0
    /* synthetic */ int getCurrentPeriodIndex();

    @Override // io.odeeo.internal.b.l0
    /* synthetic */ long getCurrentPosition();

    @Override // io.odeeo.internal.b.l0
    /* synthetic */ y0 getCurrentTimeline();

    @Override // io.odeeo.internal.b.l0
    @Deprecated
    /* synthetic */ io.odeeo.internal.a0.l0 getCurrentTrackGroups();

    @Override // io.odeeo.internal.b.l0
    @Deprecated
    /* synthetic */ io.odeeo.internal.n0.h getCurrentTrackSelections();

    @Override // io.odeeo.internal.b.l0
    /* synthetic */ z0 getCurrentTracksInfo();

    @Override // io.odeeo.internal.b.l0
    @Deprecated
    /* synthetic */ int getCurrentWindowIndex();

    @Deprecated
    d getDeviceComponent();

    @Override // io.odeeo.internal.b.l0
    /* synthetic */ m getDeviceInfo();

    @Override // io.odeeo.internal.b.l0
    /* synthetic */ int getDeviceVolume();

    @Override // io.odeeo.internal.b.l0
    /* synthetic */ long getDuration();

    @Override // io.odeeo.internal.b.l0
    /* synthetic */ long getMaxSeekToPreviousPosition();

    @Override // io.odeeo.internal.b.l0
    /* synthetic */ z getMediaItemAt(int i10);

    @Override // io.odeeo.internal.b.l0
    /* synthetic */ int getMediaItemCount();

    @Override // io.odeeo.internal.b.l0
    /* synthetic */ a0 getMediaMetadata();

    @Override // io.odeeo.internal.b.l0
    /* synthetic */ int getNextMediaItemIndex();

    @Override // io.odeeo.internal.b.l0
    @Deprecated
    /* synthetic */ int getNextWindowIndex();

    boolean getPauseAtEndOfMediaItems();

    @Override // io.odeeo.internal.b.l0
    /* synthetic */ boolean getPlayWhenReady();

    Looper getPlaybackLooper();

    @Override // io.odeeo.internal.b.l0
    /* synthetic */ k0 getPlaybackParameters();

    @Override // io.odeeo.internal.b.l0
    /* synthetic */ int getPlaybackState();

    @Override // io.odeeo.internal.b.l0
    /* synthetic */ int getPlaybackSuppressionReason();

    @Override // io.odeeo.internal.b.l0
    n getPlayerError();

    @Override // io.odeeo.internal.b.l0
    /* synthetic */ a0 getPlaylistMetadata();

    @Override // io.odeeo.internal.b.l0
    /* synthetic */ int getPreviousMediaItemIndex();

    @Override // io.odeeo.internal.b.l0
    @Deprecated
    /* synthetic */ int getPreviousWindowIndex();

    int getRendererCount();

    int getRendererType(int i10);

    @Override // io.odeeo.internal.b.l0
    /* synthetic */ int getRepeatMode();

    @Override // io.odeeo.internal.b.l0
    /* synthetic */ long getSeekBackIncrement();

    @Override // io.odeeo.internal.b.l0
    /* synthetic */ long getSeekForwardIncrement();

    t0 getSeekParameters();

    @Override // io.odeeo.internal.b.l0
    /* synthetic */ boolean getShuffleModeEnabled();

    boolean getSkipSilenceEnabled();

    @Deprecated
    e getTextComponent();

    @Override // io.odeeo.internal.b.l0
    /* synthetic */ long getTotalBufferedDuration();

    @Override // io.odeeo.internal.b.l0
    /* synthetic */ io.odeeo.internal.n0.j getTrackSelectionParameters();

    io.odeeo.internal.n0.k getTrackSelector();

    int getVideoChangeFrameRateStrategy();

    @Deprecated
    f getVideoComponent();

    io.odeeo.internal.e.e getVideoDecoderCounters();

    t getVideoFormat();

    int getVideoScalingMode();

    @Override // io.odeeo.internal.b.l0
    /* synthetic */ io.odeeo.internal.r0.m getVideoSize();

    @Override // io.odeeo.internal.b.l0
    /* synthetic */ float getVolume();

    @Override // io.odeeo.internal.b.l0
    @Deprecated
    /* synthetic */ boolean hasNext();

    @Override // io.odeeo.internal.b.l0
    /* synthetic */ boolean hasNextMediaItem();

    @Override // io.odeeo.internal.b.l0
    @Deprecated
    /* synthetic */ boolean hasNextWindow();

    @Override // io.odeeo.internal.b.l0
    @Deprecated
    /* synthetic */ boolean hasPrevious();

    @Override // io.odeeo.internal.b.l0
    /* synthetic */ boolean hasPreviousMediaItem();

    @Override // io.odeeo.internal.b.l0
    @Deprecated
    /* synthetic */ boolean hasPreviousWindow();

    @Override // io.odeeo.internal.b.l0
    /* synthetic */ void increaseDeviceVolume();

    @Override // io.odeeo.internal.b.l0
    /* synthetic */ boolean isCommandAvailable(int i10);

    @Override // io.odeeo.internal.b.l0
    /* synthetic */ boolean isCurrentMediaItemDynamic();

    @Override // io.odeeo.internal.b.l0
    /* synthetic */ boolean isCurrentMediaItemLive();

    @Override // io.odeeo.internal.b.l0
    /* synthetic */ boolean isCurrentMediaItemSeekable();

    @Override // io.odeeo.internal.b.l0
    @Deprecated
    /* synthetic */ boolean isCurrentWindowDynamic();

    @Override // io.odeeo.internal.b.l0
    @Deprecated
    /* synthetic */ boolean isCurrentWindowLive();

    @Override // io.odeeo.internal.b.l0
    @Deprecated
    /* synthetic */ boolean isCurrentWindowSeekable();

    @Override // io.odeeo.internal.b.l0
    /* synthetic */ boolean isDeviceMuted();

    @Override // io.odeeo.internal.b.l0
    /* synthetic */ boolean isLoading();

    @Override // io.odeeo.internal.b.l0
    /* synthetic */ boolean isPlaying();

    @Override // io.odeeo.internal.b.l0
    /* synthetic */ boolean isPlayingAd();

    @Override // io.odeeo.internal.b.l0
    /* synthetic */ void moveMediaItem(int i10, int i11);

    @Override // io.odeeo.internal.b.l0
    /* synthetic */ void moveMediaItems(int i10, int i11, int i12);

    @Override // io.odeeo.internal.b.l0
    @Deprecated
    /* synthetic */ void next();

    @Override // io.odeeo.internal.b.l0
    /* synthetic */ void pause();

    @Override // io.odeeo.internal.b.l0
    /* synthetic */ void play();

    @Override // io.odeeo.internal.b.l0
    /* synthetic */ void prepare();

    @Deprecated
    void prepare(io.odeeo.internal.a0.t tVar);

    @Deprecated
    void prepare(io.odeeo.internal.a0.t tVar, boolean z10, boolean z11);

    @Override // io.odeeo.internal.b.l0
    @Deprecated
    /* synthetic */ void previous();

    @Override // io.odeeo.internal.b.l0
    /* synthetic */ void release();

    void removeAnalyticsListener(io.odeeo.internal.c.b bVar);

    void removeAudioOffloadListener(b bVar);

    @Deprecated
    void removeListener(l0.c cVar);

    @Override // io.odeeo.internal.b.l0
    /* synthetic */ void removeListener(l0.e eVar);

    @Override // io.odeeo.internal.b.l0
    /* synthetic */ void removeMediaItem(int i10);

    @Override // io.odeeo.internal.b.l0
    /* synthetic */ void removeMediaItems(int i10, int i11);

    @Deprecated
    void retry();

    @Override // io.odeeo.internal.b.l0
    /* synthetic */ void seekBack();

    @Override // io.odeeo.internal.b.l0
    /* synthetic */ void seekForward();

    @Override // io.odeeo.internal.b.l0
    /* synthetic */ void seekTo(int i10, long j10);

    @Override // io.odeeo.internal.b.l0
    /* synthetic */ void seekTo(long j10);

    @Override // io.odeeo.internal.b.l0
    /* synthetic */ void seekToDefaultPosition();

    @Override // io.odeeo.internal.b.l0
    /* synthetic */ void seekToDefaultPosition(int i10);

    @Override // io.odeeo.internal.b.l0
    /* synthetic */ void seekToNext();

    @Override // io.odeeo.internal.b.l0
    /* synthetic */ void seekToNextMediaItem();

    @Override // io.odeeo.internal.b.l0
    @Deprecated
    /* synthetic */ void seekToNextWindow();

    @Override // io.odeeo.internal.b.l0
    /* synthetic */ void seekToPrevious();

    @Override // io.odeeo.internal.b.l0
    /* synthetic */ void seekToPreviousMediaItem();

    @Override // io.odeeo.internal.b.l0
    @Deprecated
    /* synthetic */ void seekToPreviousWindow();

    void setAudioAttributes(io.odeeo.internal.d.d dVar, boolean z10);

    void setAudioSessionId(int i10);

    void setAuxEffectInfo(io.odeeo.internal.d.k kVar);

    void setCameraMotionListener(io.odeeo.internal.s0.a aVar);

    @Override // io.odeeo.internal.b.l0
    /* synthetic */ void setDeviceMuted(boolean z10);

    @Override // io.odeeo.internal.b.l0
    /* synthetic */ void setDeviceVolume(int i10);

    void setForegroundMode(boolean z10);

    void setHandleAudioBecomingNoisy(boolean z10);

    @Deprecated
    void setHandleWakeLock(boolean z10);

    @Override // io.odeeo.internal.b.l0
    /* synthetic */ void setMediaItem(z zVar);

    @Override // io.odeeo.internal.b.l0
    /* synthetic */ void setMediaItem(z zVar, long j10);

    @Override // io.odeeo.internal.b.l0
    /* synthetic */ void setMediaItem(z zVar, boolean z10);

    @Override // io.odeeo.internal.b.l0
    /* synthetic */ void setMediaItems(List list);

    @Override // io.odeeo.internal.b.l0
    /* synthetic */ void setMediaItems(List list, int i10, long j10);

    @Override // io.odeeo.internal.b.l0
    /* synthetic */ void setMediaItems(List list, boolean z10);

    void setMediaSource(io.odeeo.internal.a0.t tVar);

    void setMediaSource(io.odeeo.internal.a0.t tVar, long j10);

    void setMediaSource(io.odeeo.internal.a0.t tVar, boolean z10);

    void setMediaSources(List<io.odeeo.internal.a0.t> list);

    void setMediaSources(List<io.odeeo.internal.a0.t> list, int i10, long j10);

    void setMediaSources(List<io.odeeo.internal.a0.t> list, boolean z10);

    void setPauseAtEndOfMediaItems(boolean z10);

    @Override // io.odeeo.internal.b.l0
    /* synthetic */ void setPlayWhenReady(boolean z10);

    @Override // io.odeeo.internal.b.l0
    /* synthetic */ void setPlaybackParameters(k0 k0Var);

    @Override // io.odeeo.internal.b.l0
    /* synthetic */ void setPlaybackSpeed(float f10);

    @Override // io.odeeo.internal.b.l0
    /* synthetic */ void setPlaylistMetadata(a0 a0Var);

    void setPriorityTaskManager(io.odeeo.internal.q0.z zVar);

    @Override // io.odeeo.internal.b.l0
    /* synthetic */ void setRepeatMode(int i10);

    void setSeekParameters(t0 t0Var);

    @Override // io.odeeo.internal.b.l0
    /* synthetic */ void setShuffleModeEnabled(boolean z10);

    void setShuffleOrder(io.odeeo.internal.a0.f0 f0Var);

    void setSkipSilenceEnabled(boolean z10);

    @Deprecated
    void setThrowsWhenUsingWrongThread(boolean z10);

    @Override // io.odeeo.internal.b.l0
    /* synthetic */ void setTrackSelectionParameters(io.odeeo.internal.n0.j jVar);

    void setVideoChangeFrameRateStrategy(int i10);

    void setVideoFrameMetadataListener(io.odeeo.internal.r0.j jVar);

    void setVideoScalingMode(int i10);

    @Override // io.odeeo.internal.b.l0
    /* synthetic */ void setVideoSurface(Surface surface);

    @Override // io.odeeo.internal.b.l0
    /* synthetic */ void setVideoSurfaceHolder(SurfaceHolder surfaceHolder);

    @Override // io.odeeo.internal.b.l0
    /* synthetic */ void setVideoSurfaceView(SurfaceView surfaceView);

    @Override // io.odeeo.internal.b.l0
    /* synthetic */ void setVideoTextureView(TextureView textureView);

    @Override // io.odeeo.internal.b.l0
    /* synthetic */ void setVolume(float f10);

    void setWakeMode(int i10);

    @Override // io.odeeo.internal.b.l0
    /* synthetic */ void stop();

    @Override // io.odeeo.internal.b.l0
    @Deprecated
    /* synthetic */ void stop(boolean z10);

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface b {
        default void onExperimentalOffloadSchedulingEnabledChanged(boolean z10) {
        }

        default void onExperimentalSleepingForOffloadChanged(boolean z10) {
        }
    }
}
