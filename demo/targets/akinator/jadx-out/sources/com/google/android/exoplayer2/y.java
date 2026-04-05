package com.google.android.exoplayer2;

import android.content.Context;
import android.os.Looper;
import com.mbridge.msdk.interstitial.view.MBInterstitialActivity;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class y {
    public boolean A;
    public boolean B;
    public Looper C;
    public boolean D;

    /* renamed from: a, reason: collision with root package name */
    public final Context f28712a;

    /* renamed from: b, reason: collision with root package name */
    public com.google.android.exoplayer2.util.d f28713b;

    /* renamed from: c, reason: collision with root package name */
    public long f28714c;

    /* renamed from: d, reason: collision with root package name */
    public mh.v2 f28715d;

    /* renamed from: e, reason: collision with root package name */
    public mh.v2 f28716e;

    /* renamed from: f, reason: collision with root package name */
    public mh.v2 f28717f;

    /* renamed from: g, reason: collision with root package name */
    public mh.v2 f28718g;

    /* renamed from: h, reason: collision with root package name */
    public mh.v2 f28719h;

    /* renamed from: i, reason: collision with root package name */
    public mh.v0 f28720i;

    /* renamed from: j, reason: collision with root package name */
    public Looper f28721j;

    /* renamed from: k, reason: collision with root package name */
    public com.google.android.exoplayer2.util.x0 f28722k;

    /* renamed from: l, reason: collision with root package name */
    public com.google.android.exoplayer2.audio.k f28723l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f28724m;

    /* renamed from: n, reason: collision with root package name */
    public int f28725n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f28726o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f28727p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f28728q;

    /* renamed from: r, reason: collision with root package name */
    public int f28729r;

    /* renamed from: s, reason: collision with root package name */
    public int f28730s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f28731t;

    /* renamed from: u, reason: collision with root package name */
    public e3 f28732u;

    /* renamed from: v, reason: collision with root package name */
    public long f28733v;

    /* renamed from: w, reason: collision with root package name */
    public long f28734w;

    /* renamed from: x, reason: collision with root package name */
    public d1 f28735x;

    /* renamed from: y, reason: collision with root package name */
    public long f28736y;

    /* renamed from: z, reason: collision with root package name */
    public long f28737z;

    /* JADX WARN: Illegal instructions before constructor call */
    public y(final Context context) {
        final int i10 = 2;
        final int i11 = 3;
        this(context, new mh.v2() { // from class: com.google.android.exoplayer2.v
            @Override // mh.v2
            public final Object get() {
                switch (i10) {
                    case 0:
                        return new pf.c(context);
                    case 1:
                        return qf.x.getSingletonInstance(context);
                    case 2:
                        return new p(context);
                    case 3:
                        return new bf.o(context, new ee.m());
                    case 4:
                        return new bf.o(context, new ee.m());
                    default:
                        return new p(context);
                }
            }
        }, new mh.v2() { // from class: com.google.android.exoplayer2.v
            @Override // mh.v2
            public final Object get() {
                switch (i11) {
                    case 0:
                        return new pf.c(context);
                    case 1:
                        return qf.x.getSingletonInstance(context);
                    case 2:
                        return new p(context);
                    case 3:
                        return new bf.o(context, new ee.m());
                    case 4:
                        return new bf.o(context, new ee.m());
                    default:
                        return new p(context);
                }
            }
        });
    }

    public c0 build() {
        com.google.android.exoplayer2.util.a.checkState(!this.D);
        this.D = true;
        return new r0(this, null);
    }

    public y experimentalSetForegroundModeTimeoutMs(long j10) {
        com.google.android.exoplayer2.util.a.checkState(!this.D);
        this.f28714c = j10;
        return this;
    }

    public y setAnalyticsCollector(zd.a aVar) {
        com.google.android.exoplayer2.util.a.checkState(!this.D);
        com.google.android.exoplayer2.util.a.checkNotNull(aVar);
        this.f28720i = new x(aVar);
        return this;
    }

    public y setAudioAttributes(com.google.android.exoplayer2.audio.k kVar, boolean z10) {
        com.google.android.exoplayer2.util.a.checkState(!this.D);
        this.f28723l = (com.google.android.exoplayer2.audio.k) com.google.android.exoplayer2.util.a.checkNotNull(kVar);
        this.f28724m = z10;
        return this;
    }

    public y setBandwidthMeter(qf.g gVar) {
        com.google.android.exoplayer2.util.a.checkState(!this.D);
        com.google.android.exoplayer2.util.a.checkNotNull(gVar);
        this.f28719h = new u(gVar, 3);
        return this;
    }

    public y setClock(com.google.android.exoplayer2.util.d dVar) {
        com.google.android.exoplayer2.util.a.checkState(!this.D);
        this.f28713b = dVar;
        return this;
    }

    public y setDetachSurfaceTimeoutMs(long j10) {
        com.google.android.exoplayer2.util.a.checkState(!this.D);
        this.f28737z = j10;
        return this;
    }

    public y setDeviceVolumeControlEnabled(boolean z10) {
        com.google.android.exoplayer2.util.a.checkState(!this.D);
        this.f28728q = z10;
        return this;
    }

    public y setHandleAudioBecomingNoisy(boolean z10) {
        com.google.android.exoplayer2.util.a.checkState(!this.D);
        this.f28726o = z10;
        return this;
    }

    public y setLivePlaybackSpeedControl(d1 d1Var) {
        com.google.android.exoplayer2.util.a.checkState(!this.D);
        this.f28735x = (d1) com.google.android.exoplayer2.util.a.checkNotNull(d1Var);
        return this;
    }

    public y setLoadControl(e1 e1Var) {
        com.google.android.exoplayer2.util.a.checkState(!this.D);
        com.google.android.exoplayer2.util.a.checkNotNull(e1Var);
        this.f28718g = new u(e1Var, 0);
        return this;
    }

    public y setLooper(Looper looper) {
        com.google.android.exoplayer2.util.a.checkState(!this.D);
        com.google.android.exoplayer2.util.a.checkNotNull(looper);
        this.f28721j = looper;
        return this;
    }

    public y setMediaSourceFactory(bf.c0 c0Var) {
        com.google.android.exoplayer2.util.a.checkState(!this.D);
        com.google.android.exoplayer2.util.a.checkNotNull(c0Var);
        this.f28716e = new u(c0Var, 2);
        return this;
    }

    public y setPauseAtEndOfMediaItems(boolean z10) {
        com.google.android.exoplayer2.util.a.checkState(!this.D);
        this.A = z10;
        return this;
    }

    public y setPlaybackLooper(Looper looper) {
        com.google.android.exoplayer2.util.a.checkState(!this.D);
        this.C = looper;
        return this;
    }

    public y setPriorityTaskManager(com.google.android.exoplayer2.util.x0 x0Var) {
        com.google.android.exoplayer2.util.a.checkState(!this.D);
        this.f28722k = x0Var;
        return this;
    }

    public y setReleaseTimeoutMs(long j10) {
        com.google.android.exoplayer2.util.a.checkState(!this.D);
        this.f28736y = j10;
        return this;
    }

    public y setRenderersFactory(d3 d3Var) {
        com.google.android.exoplayer2.util.a.checkState(!this.D);
        com.google.android.exoplayer2.util.a.checkNotNull(d3Var);
        this.f28715d = new u(d3Var, 1);
        return this;
    }

    public y setSeekBackIncrementMs(long j10) {
        com.google.android.exoplayer2.util.a.checkArgument(j10 > 0);
        com.google.android.exoplayer2.util.a.checkState(!this.D);
        this.f28733v = j10;
        return this;
    }

    public y setSeekForwardIncrementMs(long j10) {
        com.google.android.exoplayer2.util.a.checkArgument(j10 > 0);
        com.google.android.exoplayer2.util.a.checkState(!this.D);
        this.f28734w = j10;
        return this;
    }

    public y setSeekParameters(e3 e3Var) {
        com.google.android.exoplayer2.util.a.checkState(!this.D);
        this.f28732u = (e3) com.google.android.exoplayer2.util.a.checkNotNull(e3Var);
        return this;
    }

    public y setSkipSilenceEnabled(boolean z10) {
        com.google.android.exoplayer2.util.a.checkState(!this.D);
        this.f28727p = z10;
        return this;
    }

    public y setTrackSelector(pf.w wVar) {
        com.google.android.exoplayer2.util.a.checkState(!this.D);
        com.google.android.exoplayer2.util.a.checkNotNull(wVar);
        this.f28717f = new u(wVar, 4);
        return this;
    }

    public y setUseLazyPreparation(boolean z10) {
        com.google.android.exoplayer2.util.a.checkState(!this.D);
        this.f28731t = z10;
        return this;
    }

    public y setUsePlatformDiagnostics(boolean z10) {
        com.google.android.exoplayer2.util.a.checkState(!this.D);
        this.B = z10;
        return this;
    }

    public y setVideoChangeFrameRateStrategy(int i10) {
        com.google.android.exoplayer2.util.a.checkState(!this.D);
        this.f28730s = i10;
        return this;
    }

    public y setVideoScalingMode(int i10) {
        com.google.android.exoplayer2.util.a.checkState(!this.D);
        this.f28729r = i10;
        return this;
    }

    public y setWakeMode(int i10) {
        com.google.android.exoplayer2.util.a.checkState(!this.D);
        this.f28725n = i10;
        return this;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public y(final Context context, d3 d3Var) {
        final int i10 = 4;
        this(context, new u(d3Var, 1), new mh.v2() { // from class: com.google.android.exoplayer2.v
            @Override // mh.v2
            public final Object get() {
                switch (i10) {
                    case 0:
                        return new pf.c(context);
                    case 1:
                        return qf.x.getSingletonInstance(context);
                    case 2:
                        return new p(context);
                    case 3:
                        return new bf.o(context, new ee.m());
                    case 4:
                        return new bf.o(context, new ee.m());
                    default:
                        return new p(context);
                }
            }
        });
        com.google.android.exoplayer2.util.a.checkNotNull(d3Var);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public y(final Context context, bf.c0 c0Var) {
        final int i10 = 5;
        this(context, new mh.v2() { // from class: com.google.android.exoplayer2.v
            @Override // mh.v2
            public final Object get() {
                switch (i10) {
                    case 0:
                        return new pf.c(context);
                    case 1:
                        return qf.x.getSingletonInstance(context);
                    case 2:
                        return new p(context);
                    case 3:
                        return new bf.o(context, new ee.m());
                    case 4:
                        return new bf.o(context, new ee.m());
                    default:
                        return new p(context);
                }
            }
        }, new u(c0Var, 2));
        com.google.android.exoplayer2.util.a.checkNotNull(c0Var);
    }

    public y(Context context, d3 d3Var, bf.c0 c0Var) {
        this(context, new u(d3Var, 1), new u(c0Var, 2));
        com.google.android.exoplayer2.util.a.checkNotNull(d3Var);
        com.google.android.exoplayer2.util.a.checkNotNull(c0Var);
    }

    public y(Context context, d3 d3Var, bf.c0 c0Var, pf.w wVar, e1 e1Var, qf.g gVar, zd.a aVar) {
        this(context, new u(d3Var, 1), new u(c0Var, 2), new u(wVar, 4), new u(e1Var, 0), new u(gVar, 3), new x(aVar));
        com.google.android.exoplayer2.util.a.checkNotNull(d3Var);
        com.google.android.exoplayer2.util.a.checkNotNull(c0Var);
        com.google.android.exoplayer2.util.a.checkNotNull(wVar);
        com.google.android.exoplayer2.util.a.checkNotNull(gVar);
        com.google.android.exoplayer2.util.a.checkNotNull(aVar);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public y(final Context context, mh.v2 v2Var, mh.v2 v2Var2) {
        final int i10 = 0;
        final int i11 = 1;
        this(context, v2Var, v2Var2, new mh.v2() { // from class: com.google.android.exoplayer2.v
            @Override // mh.v2
            public final Object get() {
                switch (i10) {
                    case 0:
                        return new pf.c(context);
                    case 1:
                        return qf.x.getSingletonInstance(context);
                    case 2:
                        return new p(context);
                    case 3:
                        return new bf.o(context, new ee.m());
                    case 4:
                        return new bf.o(context, new ee.m());
                    default:
                        return new p(context);
                }
            }
        }, new w(0), new mh.v2() { // from class: com.google.android.exoplayer2.v
            @Override // mh.v2
            public final Object get() {
                switch (i11) {
                    case 0:
                        return new pf.c(context);
                    case 1:
                        return qf.x.getSingletonInstance(context);
                    case 2:
                        return new p(context);
                    case 3:
                        return new bf.o(context, new ee.m());
                    case 4:
                        return new bf.o(context, new ee.m());
                    default:
                        return new p(context);
                }
            }
        }, new ao.c(5));
    }

    public y(Context context, mh.v2 v2Var, mh.v2 v2Var2, mh.v2 v2Var3, mh.v2 v2Var4, mh.v2 v2Var5, mh.v0 v0Var) {
        this.f28712a = (Context) com.google.android.exoplayer2.util.a.checkNotNull(context);
        this.f28715d = v2Var;
        this.f28716e = v2Var2;
        this.f28717f = v2Var3;
        this.f28718g = v2Var4;
        this.f28719h = v2Var5;
        this.f28720i = v0Var;
        this.f28721j = com.google.android.exoplayer2.util.n1.getCurrentOrMainLooper();
        this.f28723l = com.google.android.exoplayer2.audio.k.f27152i;
        this.f28725n = 0;
        this.f28729r = 1;
        this.f28730s = 0;
        this.f28731t = true;
        this.f28732u = e3.f27444c;
        this.f28733v = 5000L;
        this.f28734w = MBInterstitialActivity.WEB_LOAD_TIME;
        this.f28735x = new k().build();
        this.f28713b = com.google.android.exoplayer2.util.d.f28436a;
        this.f28736y = 500L;
        this.f28737z = 2000L;
        this.B = true;
    }
}
