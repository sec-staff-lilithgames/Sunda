package com.google.android.exoplayer2;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.media.AudioDeviceInfo;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import com.google.android.exoplayer2.f2;
import com.google.android.exoplayer2.q;
import com.google.android.exoplayer2.u0;
import com.ironsource.C3191e4;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;
import nh.b5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class r0 extends e implements c0, s, b0, a0, z {

    /* renamed from: y0, reason: collision with root package name */
    public static final /* synthetic */ int f27961y0 = 0;
    public final c A;
    public final StreamVolumeManager B;
    public final o3 C;
    public final p3 D;
    public final long E;
    public int F;
    public boolean G;
    public int H;
    public int I;
    public boolean J;
    public int K;
    public boolean L;
    public e3 M;
    public bf.f1 N;
    public boolean O;
    public n2 P;
    public w1 Q;
    public w1 R;
    public z0 S;
    public z0 T;
    public AudioTrack U;
    public Object V;
    public Surface W;
    public SurfaceHolder X;
    public tf.k Y;
    public boolean Z;

    /* renamed from: a0, reason: collision with root package name */
    public TextureView f27962a0;

    /* renamed from: b, reason: collision with root package name */
    public final pf.x f27963b;

    /* renamed from: b0, reason: collision with root package name */
    public int f27964b0;

    /* renamed from: c, reason: collision with root package name */
    public final n2 f27965c;

    /* renamed from: c0, reason: collision with root package name */
    public int f27966c0;

    /* renamed from: d, reason: collision with root package name */
    public final com.google.android.exoplayer2.util.g f27967d;

    /* renamed from: d0, reason: collision with root package name */
    public com.google.android.exoplayer2.util.a1 f27968d0;

    /* renamed from: e, reason: collision with root package name */
    public final Context f27969e;

    /* renamed from: e0, reason: collision with root package name */
    public ce.f f27970e0;

    /* renamed from: f, reason: collision with root package name */
    public final r2 f27971f;

    /* renamed from: f0, reason: collision with root package name */
    public ce.f f27972f0;

    /* renamed from: g, reason: collision with root package name */
    public final z2[] f27973g;

    /* renamed from: g0, reason: collision with root package name */
    public int f27974g0;

    /* renamed from: h, reason: collision with root package name */
    public final pf.w f27975h;

    /* renamed from: h0, reason: collision with root package name */
    public com.google.android.exoplayer2.audio.k f27976h0;

    /* renamed from: i, reason: collision with root package name */
    public final com.google.android.exoplayer2.util.z f27977i;

    /* renamed from: i0, reason: collision with root package name */
    public float f27978i0;

    /* renamed from: j, reason: collision with root package name */
    public final i0 f27979j;

    /* renamed from: j0, reason: collision with root package name */
    public boolean f27980j0;

    /* renamed from: k, reason: collision with root package name */
    public final u0 f27981k;

    /* renamed from: k0, reason: collision with root package name */
    public ef.e f27982k0;

    /* renamed from: l, reason: collision with root package name */
    public final com.google.android.exoplayer2.util.c0 f27983l;

    /* renamed from: l0, reason: collision with root package name */
    public sf.l f27984l0;

    /* renamed from: m, reason: collision with root package name */
    public final CopyOnWriteArraySet f27985m;

    /* renamed from: m0, reason: collision with root package name */
    public tf.a f27986m0;

    /* renamed from: n, reason: collision with root package name */
    public final k3 f27987n;

    /* renamed from: n0, reason: collision with root package name */
    public final boolean f27988n0;

    /* renamed from: o, reason: collision with root package name */
    public final ArrayList f27989o;

    /* renamed from: o0, reason: collision with root package name */
    public boolean f27990o0;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f27991p;

    /* renamed from: p0, reason: collision with root package name */
    public com.google.android.exoplayer2.util.x0 f27992p0;

    /* renamed from: q, reason: collision with root package name */
    public final bf.c0 f27993q;

    /* renamed from: q0, reason: collision with root package name */
    public boolean f27994q0;

    /* renamed from: r, reason: collision with root package name */
    public final zd.a f27995r;

    /* renamed from: r0, reason: collision with root package name */
    public boolean f27996r0;

    /* renamed from: s, reason: collision with root package name */
    public final Looper f27997s;

    /* renamed from: s0, reason: collision with root package name */
    public q f27998s0;

    /* renamed from: t, reason: collision with root package name */
    public final qf.g f27999t;

    /* renamed from: t0, reason: collision with root package name */
    public sf.x f28000t0;

    /* renamed from: u, reason: collision with root package name */
    public final long f28001u;

    /* renamed from: u0, reason: collision with root package name */
    public w1 f28002u0;

    /* renamed from: v, reason: collision with root package name */
    public final long f28003v;

    /* renamed from: v0, reason: collision with root package name */
    public k2 f28004v0;

    /* renamed from: w, reason: collision with root package name */
    public final com.google.android.exoplayer2.util.d f28005w;

    /* renamed from: w0, reason: collision with root package name */
    public int f28006w0;

    /* renamed from: x, reason: collision with root package name */
    public final p0 f28007x;

    /* renamed from: x0, reason: collision with root package name */
    public long f28008x0;

    /* renamed from: y, reason: collision with root package name */
    public final q0 f28009y;

    /* renamed from: z, reason: collision with root package name */
    public final AudioBecomingNoisyManager f28010z;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a implements a2 {

        /* renamed from: a, reason: collision with root package name */
        public final Object f28011a;

        /* renamed from: b, reason: collision with root package name */
        public m3 f28012b;

        public a(Object obj, m3 m3Var) {
            this.f28011a = obj;
            this.f28012b = m3Var;
        }

        @Override // com.google.android.exoplayer2.a2
        public m3 getTimeline() {
            return this.f28012b;
        }

        @Override // com.google.android.exoplayer2.a2
        public Object getUid() {
            return this.f28011a;
        }
    }

    static {
        w0.registerModule("goog.exo.exoplayer");
    }

    public r0(y yVar, r2 r2Var) {
        com.google.android.exoplayer2.util.g gVar = new com.google.android.exoplayer2.util.g();
        this.f27967d = gVar;
        try {
            com.google.android.exoplayer2.util.f0.i("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [ExoPlayerLib/2.19.1] [" + com.google.android.exoplayer2.util.n1.f28510e + C3191e4.i.f36531e);
            Context context = yVar.f28712a;
            Context applicationContext = context.getApplicationContext();
            this.f27969e = applicationContext;
            zd.a aVar = (zd.a) yVar.f28720i.apply(yVar.f28713b);
            this.f27995r = aVar;
            this.f27992p0 = yVar.f28722k;
            this.f27976h0 = yVar.f28723l;
            this.f27964b0 = yVar.f28729r;
            this.f27966c0 = yVar.f28730s;
            this.f27980j0 = yVar.f28727p;
            this.E = yVar.f28737z;
            p0 p0Var = new p0(this);
            this.f28007x = p0Var;
            q0 q0Var = new q0();
            this.f28009y = q0Var;
            Handler handler = new Handler(yVar.f28721j);
            z2[] z2VarArrCreateRenderers = ((d3) yVar.f28715d.get()).createRenderers(handler, p0Var, p0Var, p0Var, p0Var);
            this.f27973g = z2VarArrCreateRenderers;
            com.google.android.exoplayer2.util.a.checkState(z2VarArrCreateRenderers.length > 0);
            pf.w wVar = (pf.w) yVar.f28717f.get();
            this.f27975h = wVar;
            this.f27993q = (bf.c0) yVar.f28716e.get();
            qf.g gVar2 = (qf.g) yVar.f28719h.get();
            this.f27999t = gVar2;
            this.f27991p = yVar.f28731t;
            this.M = yVar.f28732u;
            this.f28001u = yVar.f28733v;
            this.f28003v = yVar.f28734w;
            this.O = yVar.A;
            Looper looper = yVar.f28721j;
            this.f27997s = looper;
            com.google.android.exoplayer2.util.d dVar = yVar.f28713b;
            this.f28005w = dVar;
            r2 r2Var2 = r2Var == null ? this : r2Var;
            this.f27971f = r2Var2;
            this.f27983l = new com.google.android.exoplayer2.util.c0(looper, dVar, new i0(this, 1));
            this.f27985m = new CopyOnWriteArraySet();
            this.f27989o = new ArrayList();
            this.N = new bf.e1(0);
            pf.x xVar = new pf.x(new c3[z2VarArrCreateRenderers.length], new pf.k[z2VarArrCreateRenderers.length], n3.f27831c, null);
            this.f27963b = xVar;
            this.f27987n = new k3();
            n2 n2VarBuild = new m2().addAll(1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 22, 24, 27, 28, 32).addIf(29, wVar.isSetParametersSupported()).addIf(23, yVar.f28728q).addIf(25, yVar.f28728q).addIf(33, yVar.f28728q).addIf(26, yVar.f28728q).addIf(34, yVar.f28728q).build();
            this.f27965c = n2VarBuild;
            this.P = new m2().addAll(n2VarBuild).add(4).add(10).build();
            this.f27977i = ((com.google.android.exoplayer2.util.d1) dVar).createHandler(looper, null);
            i0 i0Var = new i0(this, 2);
            this.f27979j = i0Var;
            this.f28004v0 = k2.createDummy(xVar);
            aVar.setPlayer(r2Var2, looper);
            int i10 = com.google.android.exoplayer2.util.n1.f28506a;
            u0 u0Var = new u0(z2VarArrCreateRenderers, wVar, xVar, (e1) yVar.f28718g.get(), gVar2, this.F, this.G, aVar, this.M, yVar.f28735x, yVar.f28736y, this.O, looper, dVar, i0Var, i10 < 31 ? new zd.c0() : n0.registerMediaMetricsListener(applicationContext, this, yVar.B), yVar.C);
            this.f27981k = u0Var;
            this.f27978i0 = 1.0f;
            this.F = 0;
            w1 w1Var = w1.K;
            this.Q = w1Var;
            this.R = w1Var;
            this.f28002u0 = w1Var;
            this.f28006w0 = -1;
            if (i10 < 21) {
                this.f27974g0 = l(0);
            } else {
                this.f27974g0 = com.google.android.exoplayer2.util.n1.generateAudioSessionIdV21(applicationContext);
            }
            this.f27982k0 = ef.e.f54308e;
            this.f27988n0 = true;
            addListener(aVar);
            ((qf.x) gVar2).addEventListener(new Handler(looper), aVar);
            addAudioOffloadListener(p0Var);
            long j10 = yVar.f28714c;
            if (j10 > 0) {
                u0Var.experimentalSetForegroundModeTimeoutMs(j10);
            }
            AudioBecomingNoisyManager audioBecomingNoisyManager = new AudioBecomingNoisyManager(context, handler, p0Var);
            this.f28010z = audioBecomingNoisyManager;
            audioBecomingNoisyManager.setEnabled(yVar.f28726o);
            c cVar = new c(context, handler, p0Var);
            this.A = cVar;
            cVar.setAudioAttributes(yVar.f28724m ? this.f27976h0 : null);
            if (yVar.f28728q) {
                StreamVolumeManager streamVolumeManager = new StreamVolumeManager(context, handler, p0Var);
                this.B = streamVolumeManager;
                streamVolumeManager.setStreamType(com.google.android.exoplayer2.util.n1.getStreamTypeForAudioUsage(this.f27976h0.f27160e));
            } else {
                this.B = null;
            }
            o3 o3Var = new o3(context);
            this.C = o3Var;
            o3Var.setEnabled(yVar.f28725n != 0);
            p3 p3Var = new p3(context);
            this.D = p3Var;
            p3Var.setEnabled(yVar.f28725n == 2);
            StreamVolumeManager streamVolumeManager2 = this.B;
            this.f27998s0 = new q.a(0).setMinVolume(streamVolumeManager2 != null ? streamVolumeManager2.getMinVolume() : 0).setMaxVolume(streamVolumeManager2 != null ? streamVolumeManager2.getMaxVolume() : 0).build();
            this.f28000t0 = sf.x.f85734g;
            this.f27968d0 = com.google.android.exoplayer2.util.a1.f28409c;
            wVar.setAudioAttributes(this.f27976h0);
            r(1, 10, Integer.valueOf(this.f27974g0));
            r(2, 10, Integer.valueOf(this.f27974g0));
            r(1, 3, this.f27976h0);
            r(2, 4, Integer.valueOf(this.f27964b0));
            r(2, 5, Integer.valueOf(this.f27966c0));
            r(1, 9, Boolean.valueOf(this.f27980j0));
            r(2, 7, q0Var);
            r(6, 8, q0Var);
            gVar.open();
        } catch (Throwable th2) {
            this.f27967d.open();
            throw th2;
        }
    }

    public static long k(k2 k2Var) {
        l3 l3Var = new l3();
        k3 k3Var = new k3();
        k2Var.f27572a.getPeriodByUid(k2Var.f27573b.f9193a, k3Var);
        long j10 = k2Var.f27574c;
        return j10 == C.TIME_UNSET ? k2Var.f27572a.getWindow(k3Var.f27598e, l3Var).getDefaultPositionUs() : k3Var.getPositionInWindowUs() + j10;
    }

    public final void A() {
        this.f27967d.blockUninterruptible();
        if (Thread.currentThread() != getApplicationLooper().getThread()) {
            String invariant = com.google.android.exoplayer2.util.n1.formatInvariant("Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread", Thread.currentThread().getName(), getApplicationLooper().getThread().getName());
            if (this.f27988n0) {
                throw new IllegalStateException(invariant);
            }
            com.google.android.exoplayer2.util.f0.w("ExoPlayerImpl", invariant, this.f27990o0 ? null : new IllegalStateException());
            this.f27990o0 = true;
        }
    }

    @Override // com.google.android.exoplayer2.c0
    public void addAnalyticsListener(zd.d dVar) {
        this.f27995r.addListener((zd.d) com.google.android.exoplayer2.util.a.checkNotNull(dVar));
    }

    @Override // com.google.android.exoplayer2.c0
    public void addAudioOffloadListener(t tVar) {
        this.f27985m.add(tVar);
    }

    @Override // com.google.android.exoplayer2.e, com.google.android.exoplayer2.r2
    public void addListener(p2 p2Var) {
        this.f27983l.add((p2) com.google.android.exoplayer2.util.a.checkNotNull(p2Var));
    }

    @Override // com.google.android.exoplayer2.e, com.google.android.exoplayer2.r2
    public void addMediaItems(int i10, List<u1> list) {
        A();
        addMediaSources(i10, e(list));
    }

    @Override // com.google.android.exoplayer2.c0
    public void addMediaSource(bf.f0 f0Var) {
        A();
        addMediaSources(Collections.singletonList(f0Var));
    }

    @Override // com.google.android.exoplayer2.c0
    public void addMediaSources(List<bf.f0> list) {
        A();
        addMediaSources(this.f27989o.size(), list);
    }

    public final ArrayList b(int i10, List list) {
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < list.size(); i11++) {
            f2.c cVar = new f2.c((bf.f0) list.get(i11), this.f27991p);
            arrayList.add(cVar);
            a aVar = new a(cVar.f27483b, cVar.f27482a.getTimeline());
            this.f27989o.add(i11 + i10, aVar);
        }
        this.N = this.N.cloneAndInsert(i10, arrayList.size());
        return arrayList;
    }

    public final k2 c(k2 k2Var, int i10, List list) {
        m3 m3Var = k2Var.f27572a;
        this.H++;
        ArrayList arrayListB = b(i10, list);
        w2 w2Var = new w2(this.f27989o, this.N);
        k2 k2VarM = m(k2Var, w2Var, j(m3Var, w2Var, i(k2Var), g(k2Var)));
        this.f27981k.addMediaSources(i10, arrayListB, this.N);
        return k2VarM;
    }

    @Override // com.google.android.exoplayer2.c0, com.google.android.exoplayer2.s
    public void clearAuxEffectInfo() {
        A();
        setAuxEffectInfo(new com.google.android.exoplayer2.audio.l0(0, 0.0f));
    }

    @Override // com.google.android.exoplayer2.c0, com.google.android.exoplayer2.b0
    public void clearCameraMotionListener(tf.a aVar) {
        A();
        if (this.f27986m0 != aVar) {
            return;
        }
        f(this.f28009y).setType(8).setPayload(null).send();
    }

    @Override // com.google.android.exoplayer2.c0, com.google.android.exoplayer2.b0
    public void clearVideoFrameMetadataListener(sf.l lVar) {
        A();
        if (this.f27984l0 != lVar) {
            return;
        }
        f(this.f28009y).setType(7).setPayload(null).send();
    }

    @Override // com.google.android.exoplayer2.e, com.google.android.exoplayer2.r2
    public void clearVideoSurface() {
        A();
        q();
        u(null);
        o(0, 0);
    }

    @Override // com.google.android.exoplayer2.e, com.google.android.exoplayer2.r2
    public void clearVideoSurfaceHolder(SurfaceHolder surfaceHolder) {
        A();
        if (surfaceHolder == null || surfaceHolder != this.X) {
            return;
        }
        clearVideoSurface();
    }

    @Override // com.google.android.exoplayer2.e, com.google.android.exoplayer2.r2
    public void clearVideoSurfaceView(SurfaceView surfaceView) {
        A();
        clearVideoSurfaceHolder(surfaceView == null ? null : surfaceView.getHolder());
    }

    @Override // com.google.android.exoplayer2.e, com.google.android.exoplayer2.r2
    public void clearVideoTextureView(TextureView textureView) {
        A();
        if (textureView == null || textureView != this.f27962a0) {
            return;
        }
        clearVideoSurface();
    }

    @Override // com.google.android.exoplayer2.c0
    public u2 createMessage(t2 t2Var) {
        A();
        return f(t2Var);
    }

    public final w1 d() {
        m3 currentTimeline = getCurrentTimeline();
        if (currentTimeline.isEmpty()) {
            return this.f28002u0;
        }
        return this.f28002u0.buildUpon().populate(currentTimeline.getWindow(getCurrentMediaItemIndex(), this.f27437a).f27649e.f28115f).build();
    }

    @Override // com.google.android.exoplayer2.e, com.google.android.exoplayer2.r2
    @Deprecated
    public void decreaseDeviceVolume() {
        A();
        StreamVolumeManager streamVolumeManager = this.B;
        if (streamVolumeManager != null) {
            streamVolumeManager.decreaseVolume(1);
        }
    }

    public final ArrayList e(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            arrayList.add(this.f27993q.createMediaSource((u1) list.get(i10)));
        }
        return arrayList;
    }

    @Override // com.google.android.exoplayer2.c0
    public boolean experimentalIsSleepingForOffload() {
        A();
        return this.f28004v0.f27586o;
    }

    @Override // com.google.android.exoplayer2.c0
    public void experimentalSetOffloadSchedulingEnabled(boolean z10) {
        A();
        this.f27981k.experimentalSetOffloadSchedulingEnabled(z10);
        Iterator it = this.f27985m.iterator();
        while (it.hasNext()) {
            ((p0) ((t) it.next())).onExperimentalOffloadSchedulingEnabledChanged(z10);
        }
    }

    public final u2 f(t2 t2Var) {
        int i10 = i(this.f28004v0);
        m3 m3Var = this.f28004v0.f27572a;
        if (i10 == -1) {
            i10 = 0;
        }
        com.google.android.exoplayer2.util.d dVar = this.f28005w;
        u0 u0Var = this.f27981k;
        return new u2(u0Var, t2Var, m3Var, i10, dVar, u0Var.getPlaybackLooper());
    }

    public final long g(k2 k2Var) {
        bf.d0 d0Var = k2Var.f27573b;
        long j10 = k2Var.f27574c;
        m3 m3Var = k2Var.f27572a;
        if (!d0Var.isAd()) {
            return com.google.android.exoplayer2.util.n1.usToMs(h(k2Var));
        }
        Object obj = k2Var.f27573b.f9193a;
        k3 k3Var = this.f27987n;
        m3Var.getPeriodByUid(obj, k3Var);
        if (j10 == C.TIME_UNSET) {
            return m3Var.getWindow(i(k2Var), this.f27437a).getDefaultPositionMs();
        }
        return com.google.android.exoplayer2.util.n1.usToMs(j10) + k3Var.getPositionInWindowMs();
    }

    @Override // com.google.android.exoplayer2.c0
    public zd.a getAnalyticsCollector() {
        A();
        return this.f27995r;
    }

    @Override // com.google.android.exoplayer2.e, com.google.android.exoplayer2.r2
    public Looper getApplicationLooper() {
        return this.f27997s;
    }

    @Override // com.google.android.exoplayer2.e, com.google.android.exoplayer2.r2
    public com.google.android.exoplayer2.audio.k getAudioAttributes() {
        A();
        return this.f27976h0;
    }

    @Override // com.google.android.exoplayer2.c0
    @Deprecated
    public s getAudioComponent() {
        A();
        return this;
    }

    @Override // com.google.android.exoplayer2.c0
    public ce.f getAudioDecoderCounters() {
        A();
        return this.f27972f0;
    }

    @Override // com.google.android.exoplayer2.c0
    public z0 getAudioFormat() {
        A();
        return this.T;
    }

    @Override // com.google.android.exoplayer2.c0, com.google.android.exoplayer2.s
    public int getAudioSessionId() {
        A();
        return this.f27974g0;
    }

    @Override // com.google.android.exoplayer2.e, com.google.android.exoplayer2.r2
    public n2 getAvailableCommands() {
        A();
        return this.P;
    }

    @Override // com.google.android.exoplayer2.e, com.google.android.exoplayer2.r2
    public long getBufferedPosition() {
        A();
        if (!isPlayingAd()) {
            return getContentBufferedPosition();
        }
        k2 k2Var = this.f28004v0;
        return k2Var.f27582k.equals(k2Var.f27573b) ? com.google.android.exoplayer2.util.n1.usToMs(this.f28004v0.f27587p) : getDuration();
    }

    @Override // com.google.android.exoplayer2.c0
    public com.google.android.exoplayer2.util.d getClock() {
        return this.f28005w;
    }

    @Override // com.google.android.exoplayer2.e, com.google.android.exoplayer2.r2
    public long getContentBufferedPosition() {
        A();
        if (this.f28004v0.f27572a.isEmpty()) {
            return this.f28008x0;
        }
        k2 k2Var = this.f28004v0;
        if (k2Var.f27582k.f9196d != k2Var.f27573b.f9196d) {
            return k2Var.f27572a.getWindow(getCurrentMediaItemIndex(), this.f27437a).getDurationMs();
        }
        long j10 = k2Var.f27587p;
        if (this.f28004v0.f27582k.isAd()) {
            k2 k2Var2 = this.f28004v0;
            k3 periodByUid = k2Var2.f27572a.getPeriodByUid(k2Var2.f27582k.f9193a, this.f27987n);
            long adGroupTimeUs = periodByUid.getAdGroupTimeUs(this.f28004v0.f27582k.f9194b);
            j10 = adGroupTimeUs == Long.MIN_VALUE ? periodByUid.f27599f : adGroupTimeUs;
        }
        k2 k2Var3 = this.f28004v0;
        m3 m3Var = k2Var3.f27572a;
        Object obj = k2Var3.f27582k.f9193a;
        k3 k3Var = this.f27987n;
        m3Var.getPeriodByUid(obj, k3Var);
        return com.google.android.exoplayer2.util.n1.usToMs(k3Var.getPositionInWindowUs() + j10);
    }

    @Override // com.google.android.exoplayer2.e, com.google.android.exoplayer2.r2
    public long getContentPosition() {
        A();
        return g(this.f28004v0);
    }

    @Override // com.google.android.exoplayer2.e, com.google.android.exoplayer2.r2
    public int getCurrentAdGroupIndex() {
        A();
        if (isPlayingAd()) {
            return this.f28004v0.f27573b.f9194b;
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.e, com.google.android.exoplayer2.r2
    public int getCurrentAdIndexInAdGroup() {
        A();
        if (isPlayingAd()) {
            return this.f28004v0.f27573b.f9195c;
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.e, com.google.android.exoplayer2.r2
    public ef.e getCurrentCues() {
        A();
        return this.f27982k0;
    }

    @Override // com.google.android.exoplayer2.e, com.google.android.exoplayer2.r2
    public int getCurrentMediaItemIndex() {
        A();
        int i10 = i(this.f28004v0);
        if (i10 == -1) {
            return 0;
        }
        return i10;
    }

    @Override // com.google.android.exoplayer2.e, com.google.android.exoplayer2.r2
    public int getCurrentPeriodIndex() {
        A();
        if (this.f28004v0.f27572a.isEmpty()) {
            return 0;
        }
        k2 k2Var = this.f28004v0;
        return k2Var.f27572a.getIndexOfPeriod(k2Var.f27573b.f9193a);
    }

    @Override // com.google.android.exoplayer2.e, com.google.android.exoplayer2.r2
    public long getCurrentPosition() {
        A();
        return com.google.android.exoplayer2.util.n1.usToMs(h(this.f28004v0));
    }

    @Override // com.google.android.exoplayer2.e, com.google.android.exoplayer2.r2
    public m3 getCurrentTimeline() {
        A();
        return this.f28004v0.f27572a;
    }

    @Override // com.google.android.exoplayer2.c0
    public bf.n1 getCurrentTrackGroups() {
        A();
        return this.f28004v0.f27579h;
    }

    @Override // com.google.android.exoplayer2.c0
    public pf.p getCurrentTrackSelections() {
        A();
        return new pf.p(this.f28004v0.f27580i.f81196c);
    }

    @Override // com.google.android.exoplayer2.e, com.google.android.exoplayer2.r2
    public n3 getCurrentTracks() {
        A();
        return this.f28004v0.f27580i.f81197d;
    }

    @Override // com.google.android.exoplayer2.c0
    @Deprecated
    public z getDeviceComponent() {
        A();
        return this;
    }

    @Override // com.google.android.exoplayer2.e, com.google.android.exoplayer2.r2
    public q getDeviceInfo() {
        A();
        return this.f27998s0;
    }

    @Override // com.google.android.exoplayer2.e, com.google.android.exoplayer2.r2
    public int getDeviceVolume() {
        A();
        StreamVolumeManager streamVolumeManager = this.B;
        if (streamVolumeManager != null) {
            return streamVolumeManager.getVolume();
        }
        return 0;
    }

    @Override // com.google.android.exoplayer2.e, com.google.android.exoplayer2.r2
    public long getDuration() {
        A();
        if (!isPlayingAd()) {
            return getContentDuration();
        }
        k2 k2Var = this.f28004v0;
        bf.d0 d0Var = k2Var.f27573b;
        m3 m3Var = k2Var.f27572a;
        Object obj = d0Var.f9193a;
        k3 k3Var = this.f27987n;
        m3Var.getPeriodByUid(obj, k3Var);
        return com.google.android.exoplayer2.util.n1.usToMs(k3Var.getAdDurationUs(d0Var.f9194b, d0Var.f9195c));
    }

    @Override // com.google.android.exoplayer2.e, com.google.android.exoplayer2.r2
    public long getMaxSeekToPreviousPosition() {
        A();
        return 3000L;
    }

    @Override // com.google.android.exoplayer2.e, com.google.android.exoplayer2.r2
    public w1 getMediaMetadata() {
        A();
        return this.Q;
    }

    @Override // com.google.android.exoplayer2.c0
    public boolean getPauseAtEndOfMediaItems() {
        A();
        return this.O;
    }

    @Override // com.google.android.exoplayer2.e, com.google.android.exoplayer2.r2
    public boolean getPlayWhenReady() {
        A();
        return this.f28004v0.f27583l;
    }

    @Override // com.google.android.exoplayer2.c0
    public Looper getPlaybackLooper() {
        return this.f27981k.getPlaybackLooper();
    }

    @Override // com.google.android.exoplayer2.e, com.google.android.exoplayer2.r2
    public l2 getPlaybackParameters() {
        A();
        return this.f28004v0.f27585n;
    }

    @Override // com.google.android.exoplayer2.e, com.google.android.exoplayer2.r2
    public int getPlaybackState() {
        A();
        return this.f28004v0.f27576e;
    }

    @Override // com.google.android.exoplayer2.e, com.google.android.exoplayer2.r2
    public int getPlaybackSuppressionReason() {
        A();
        return this.f28004v0.f27584m;
    }

    @Override // com.google.android.exoplayer2.e, com.google.android.exoplayer2.r2
    public w1 getPlaylistMetadata() {
        A();
        return this.R;
    }

    @Override // com.google.android.exoplayer2.c0
    public z2 getRenderer(int i10) {
        A();
        return this.f27973g[i10];
    }

    @Override // com.google.android.exoplayer2.c0
    public int getRendererCount() {
        A();
        return this.f27973g.length;
    }

    @Override // com.google.android.exoplayer2.c0
    public int getRendererType(int i10) {
        A();
        return this.f27973g[i10].getTrackType();
    }

    @Override // com.google.android.exoplayer2.e, com.google.android.exoplayer2.r2
    public int getRepeatMode() {
        A();
        return this.F;
    }

    @Override // com.google.android.exoplayer2.e, com.google.android.exoplayer2.r2
    public long getSeekBackIncrement() {
        A();
        return this.f28001u;
    }

    @Override // com.google.android.exoplayer2.e, com.google.android.exoplayer2.r2
    public long getSeekForwardIncrement() {
        A();
        return this.f28003v;
    }

    @Override // com.google.android.exoplayer2.c0
    public e3 getSeekParameters() {
        A();
        return this.M;
    }

    @Override // com.google.android.exoplayer2.e, com.google.android.exoplayer2.r2
    public boolean getShuffleModeEnabled() {
        A();
        return this.G;
    }

    @Override // com.google.android.exoplayer2.c0, com.google.android.exoplayer2.s
    public boolean getSkipSilenceEnabled() {
        A();
        return this.f27980j0;
    }

    @Override // com.google.android.exoplayer2.e, com.google.android.exoplayer2.r2
    public com.google.android.exoplayer2.util.a1 getSurfaceSize() {
        A();
        return this.f27968d0;
    }

    @Override // com.google.android.exoplayer2.c0
    @Deprecated
    public a0 getTextComponent() {
        A();
        return this;
    }

    @Override // com.google.android.exoplayer2.e, com.google.android.exoplayer2.r2
    public long getTotalBufferedDuration() {
        A();
        return com.google.android.exoplayer2.util.n1.usToMs(this.f28004v0.f27588q);
    }

    @Override // com.google.android.exoplayer2.e, com.google.android.exoplayer2.r2
    public pf.s getTrackSelectionParameters() {
        A();
        return this.f27975h.getParameters();
    }

    @Override // com.google.android.exoplayer2.c0
    public pf.w getTrackSelector() {
        A();
        return this.f27975h;
    }

    @Override // com.google.android.exoplayer2.c0, com.google.android.exoplayer2.b0
    public int getVideoChangeFrameRateStrategy() {
        A();
        return this.f27966c0;
    }

    @Override // com.google.android.exoplayer2.c0
    @Deprecated
    public b0 getVideoComponent() {
        A();
        return this;
    }

    @Override // com.google.android.exoplayer2.c0
    public ce.f getVideoDecoderCounters() {
        A();
        return this.f27970e0;
    }

    @Override // com.google.android.exoplayer2.c0
    public z0 getVideoFormat() {
        A();
        return this.S;
    }

    @Override // com.google.android.exoplayer2.c0, com.google.android.exoplayer2.b0
    public int getVideoScalingMode() {
        A();
        return this.f27964b0;
    }

    @Override // com.google.android.exoplayer2.e, com.google.android.exoplayer2.r2
    public sf.x getVideoSize() {
        A();
        return this.f28000t0;
    }

    @Override // com.google.android.exoplayer2.e, com.google.android.exoplayer2.r2
    public float getVolume() {
        A();
        return this.f27978i0;
    }

    public final long h(k2 k2Var) {
        if (k2Var.f27572a.isEmpty()) {
            return com.google.android.exoplayer2.util.n1.msToUs(this.f28008x0);
        }
        long estimatedPositionUs = k2Var.f27586o ? k2Var.getEstimatedPositionUs() : k2Var.f27589r;
        if (k2Var.f27573b.isAd()) {
            return estimatedPositionUs;
        }
        m3 m3Var = k2Var.f27572a;
        Object obj = k2Var.f27573b.f9193a;
        k3 k3Var = this.f27987n;
        m3Var.getPeriodByUid(obj, k3Var);
        return k3Var.getPositionInWindowUs() + estimatedPositionUs;
    }

    public final int i(k2 k2Var) {
        return k2Var.f27572a.isEmpty() ? this.f28006w0 : k2Var.f27572a.getPeriodByUid(k2Var.f27573b.f9193a, this.f27987n).f27598e;
    }

    @Override // com.google.android.exoplayer2.e, com.google.android.exoplayer2.r2
    @Deprecated
    public void increaseDeviceVolume() {
        A();
        StreamVolumeManager streamVolumeManager = this.B;
        if (streamVolumeManager != null) {
            streamVolumeManager.increaseVolume(1);
        }
    }

    @Override // com.google.android.exoplayer2.e, com.google.android.exoplayer2.r2
    public boolean isDeviceMuted() {
        A();
        StreamVolumeManager streamVolumeManager = this.B;
        if (streamVolumeManager != null) {
            return streamVolumeManager.isMuted();
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.e, com.google.android.exoplayer2.r2
    public boolean isLoading() {
        A();
        return this.f28004v0.f27578g;
    }

    @Override // com.google.android.exoplayer2.e, com.google.android.exoplayer2.r2
    public boolean isPlayingAd() {
        A();
        return this.f28004v0.f27573b.isAd();
    }

    @Override // com.google.android.exoplayer2.c0
    public boolean isTunnelingEnabled() {
        A();
        for (c3 c3Var : this.f28004v0.f27580i.f81195b) {
            if (c3Var != null && c3Var.f27356a) {
                return true;
            }
        }
        return false;
    }

    public final Pair j(m3 m3Var, w2 w2Var, int i10, long j10) {
        boolean zIsEmpty = m3Var.isEmpty();
        long j11 = C.TIME_UNSET;
        if (zIsEmpty || w2Var.isEmpty()) {
            boolean z10 = !m3Var.isEmpty() && w2Var.isEmpty();
            int i11 = z10 ? -1 : i10;
            if (!z10) {
                j11 = j10;
            }
            return n(w2Var, i11, j11);
        }
        Pair<Object, Long> periodPositionUs = m3Var.getPeriodPositionUs(this.f27437a, this.f27987n, i10, com.google.android.exoplayer2.util.n1.msToUs(j10));
        Object obj = ((Pair) com.google.android.exoplayer2.util.n1.castNonNull(periodPositionUs)).first;
        if (w2Var.getIndexOfPeriod(obj) != -1) {
            return periodPositionUs;
        }
        Object objH = u0.H(this.f27437a, this.f27987n, this.F, this.G, obj, m3Var, w2Var);
        if (objH == null) {
            return n(w2Var, -1, C.TIME_UNSET);
        }
        k3 k3Var = this.f27987n;
        w2Var.getPeriodByUid(objH, k3Var);
        int i12 = k3Var.f27598e;
        return n(w2Var, i12, w2Var.getWindow(i12, this.f27437a).getDefaultPositionMs());
    }

    public final int l(int i10) {
        AudioTrack audioTrack = this.U;
        if (audioTrack != null && audioTrack.getAudioSessionId() != i10) {
            this.U.release();
            this.U = null;
        }
        if (this.U == null) {
            this.U = new AudioTrack(3, 4000, 4, 2, 2, 0, i10);
        }
        return this.U.getAudioSessionId();
    }

    public final k2 m(k2 k2Var, m3 m3Var, Pair pair) {
        com.google.android.exoplayer2.util.a.checkArgument(m3Var.isEmpty() || pair != null);
        m3 m3Var2 = k2Var.f27572a;
        long jG = g(k2Var);
        k2 k2VarCopyWithTimeline = k2Var.copyWithTimeline(m3Var);
        if (m3Var.isEmpty()) {
            bf.d0 dummyPeriodForEmptyTimeline = k2.getDummyPeriodForEmptyTimeline();
            long jMsToUs = com.google.android.exoplayer2.util.n1.msToUs(this.f28008x0);
            k2 k2VarCopyWithLoadingMediaPeriodId = k2VarCopyWithTimeline.copyWithNewPosition(dummyPeriodForEmptyTimeline, jMsToUs, jMsToUs, jMsToUs, 0L, bf.n1.f9354f, this.f27963b, b5.of()).copyWithLoadingMediaPeriodId(dummyPeriodForEmptyTimeline);
            k2VarCopyWithLoadingMediaPeriodId.f27587p = k2VarCopyWithLoadingMediaPeriodId.f27589r;
            return k2VarCopyWithLoadingMediaPeriodId;
        }
        Object obj = k2VarCopyWithTimeline.f27573b.f9193a;
        boolean zEquals = obj.equals(((Pair) com.google.android.exoplayer2.util.n1.castNonNull(pair)).first);
        bf.d0 d0Var = !zEquals ? new bf.d0(pair.first) : k2VarCopyWithTimeline.f27573b;
        long jLongValue = ((Long) pair.second).longValue();
        long jMsToUs2 = com.google.android.exoplayer2.util.n1.msToUs(jG);
        if (!m3Var2.isEmpty()) {
            jMsToUs2 -= m3Var2.getPeriodByUid(obj, this.f27987n).getPositionInWindowUs();
        }
        if (!zEquals || jLongValue < jMsToUs2) {
            bf.d0 d0Var2 = d0Var;
            com.google.android.exoplayer2.util.a.checkState(!d0Var2.isAd());
            k2 k2VarCopyWithLoadingMediaPeriodId2 = k2VarCopyWithTimeline.copyWithNewPosition(d0Var2, jLongValue, jLongValue, jLongValue, 0L, !zEquals ? bf.n1.f9354f : k2VarCopyWithTimeline.f27579h, !zEquals ? this.f27963b : k2VarCopyWithTimeline.f27580i, !zEquals ? b5.of() : k2VarCopyWithTimeline.f27581j).copyWithLoadingMediaPeriodId(d0Var2);
            k2VarCopyWithLoadingMediaPeriodId2.f27587p = jLongValue;
            return k2VarCopyWithLoadingMediaPeriodId2;
        }
        if (jLongValue != jMsToUs2) {
            bf.d0 d0Var3 = d0Var;
            com.google.android.exoplayer2.util.a.checkState(!d0Var3.isAd());
            long jMax = Math.max(0L, k2VarCopyWithTimeline.f27588q - (jLongValue - jMsToUs2));
            long j10 = k2VarCopyWithTimeline.f27587p;
            if (k2VarCopyWithTimeline.f27582k.equals(k2VarCopyWithTimeline.f27573b)) {
                j10 = jLongValue + jMax;
            }
            k2 k2VarCopyWithNewPosition = k2VarCopyWithTimeline.copyWithNewPosition(d0Var3, jLongValue, jLongValue, jLongValue, jMax, k2VarCopyWithTimeline.f27579h, k2VarCopyWithTimeline.f27580i, k2VarCopyWithTimeline.f27581j);
            k2VarCopyWithNewPosition.f27587p = j10;
            return k2VarCopyWithNewPosition;
        }
        int indexOfPeriod = m3Var.getIndexOfPeriod(k2VarCopyWithTimeline.f27582k.f9193a);
        if (indexOfPeriod != -1 && m3Var.getPeriod(indexOfPeriod, this.f27987n).f27598e == m3Var.getPeriodByUid(d0Var.f9193a, this.f27987n).f27598e) {
            return k2VarCopyWithTimeline;
        }
        m3Var.getPeriodByUid(d0Var.f9193a, this.f27987n);
        long adDurationUs = d0Var.isAd() ? this.f27987n.getAdDurationUs(d0Var.f9194b, d0Var.f9195c) : this.f27987n.f27599f;
        bf.d0 d0Var4 = d0Var;
        k2 k2VarCopyWithLoadingMediaPeriodId3 = k2VarCopyWithTimeline.copyWithNewPosition(d0Var4, k2VarCopyWithTimeline.f27589r, k2VarCopyWithTimeline.f27589r, k2VarCopyWithTimeline.f27575d, adDurationUs - k2VarCopyWithTimeline.f27589r, k2VarCopyWithTimeline.f27579h, k2VarCopyWithTimeline.f27580i, k2VarCopyWithTimeline.f27581j).copyWithLoadingMediaPeriodId(d0Var4);
        k2VarCopyWithLoadingMediaPeriodId3.f27587p = adDurationUs;
        return k2VarCopyWithLoadingMediaPeriodId3;
    }

    @Override // com.google.android.exoplayer2.e, com.google.android.exoplayer2.r2
    public void moveMediaItems(int i10, int i11, int i12) {
        A();
        com.google.android.exoplayer2.util.a.checkArgument(i10 >= 0 && i10 <= i11 && i12 >= 0);
        ArrayList arrayList = this.f27989o;
        int size = arrayList.size();
        int iMin = Math.min(i11, size);
        int iMin2 = Math.min(i12, size - (iMin - i10));
        if (i10 >= size || i10 == iMin || i10 == iMin2) {
            return;
        }
        m3 currentTimeline = getCurrentTimeline();
        this.H++;
        com.google.android.exoplayer2.util.n1.moveItems(arrayList, i10, iMin, iMin2);
        w2 w2Var = new w2(arrayList, this.N);
        k2 k2Var = this.f28004v0;
        k2 k2VarM = m(k2Var, w2Var, j(currentTimeline, w2Var, i(k2Var), g(this.f28004v0)));
        this.f27981k.moveMediaSources(i10, iMin, iMin2, this.N);
        y(k2VarM, 0, 1, false, 5, C.TIME_UNSET, -1, false);
    }

    public final Pair n(m3 m3Var, int i10, long j10) {
        if (m3Var.isEmpty()) {
            this.f28006w0 = i10;
            if (j10 == C.TIME_UNSET) {
                j10 = 0;
            }
            this.f28008x0 = j10;
            return null;
        }
        if (i10 == -1 || i10 >= m3Var.getWindowCount()) {
            i10 = m3Var.getFirstWindowIndex(this.G);
            j10 = m3Var.getWindow(i10, this.f27437a).getDefaultPositionMs();
        }
        int i11 = i10;
        return m3Var.getPeriodPositionUs(this.f27437a, this.f27987n, i11, com.google.android.exoplayer2.util.n1.msToUs(j10));
    }

    public final void o(int i10, int i11) {
        if (i10 == this.f27968d0.getWidth() && i11 == this.f27968d0.getHeight()) {
            return;
        }
        this.f27968d0 = new com.google.android.exoplayer2.util.a1(i10, i11);
        this.f27983l.sendEvent(24, new k0(i10, i11, 0));
        r(2, 14, new com.google.android.exoplayer2.util.a1(i10, i11));
    }

    public final k2 p(k2 k2Var, int i10, int i11) {
        int i12 = i(k2Var);
        long jG = g(k2Var);
        m3 m3Var = k2Var.f27572a;
        ArrayList arrayList = this.f27989o;
        int size = arrayList.size();
        this.H++;
        for (int i13 = i11 - 1; i13 >= i10; i13--) {
            arrayList.remove(i13);
        }
        this.N = this.N.cloneAndRemove(i10, i11);
        w2 w2Var = new w2(arrayList, this.N);
        k2 k2VarM = m(k2Var, w2Var, j(m3Var, w2Var, i12, jG));
        int i14 = k2VarM.f27576e;
        if (i14 != 1 && i14 != 4 && i10 < i11 && i11 == size && i12 >= k2VarM.f27572a.getWindowCount()) {
            k2VarM = k2VarM.copyWithPlaybackState(4);
        }
        this.f27981k.removeMediaSources(i10, i11, this.N);
        return k2VarM;
    }

    @Override // com.google.android.exoplayer2.e, com.google.android.exoplayer2.r2
    public void prepare() {
        A();
        boolean playWhenReady = getPlayWhenReady();
        int iUpdateAudioFocus = this.A.updateAudioFocus(playWhenReady, 2);
        x(iUpdateAudioFocus, (!playWhenReady || iUpdateAudioFocus == 1) ? 1 : 2, playWhenReady);
        k2 k2Var = this.f28004v0;
        if (k2Var.f27576e != 1) {
            return;
        }
        k2 k2VarCopyWithPlaybackError = k2Var.copyWithPlaybackError(null);
        k2 k2VarCopyWithPlaybackState = k2VarCopyWithPlaybackError.copyWithPlaybackState(k2VarCopyWithPlaybackError.f27572a.isEmpty() ? 4 : 2);
        this.H++;
        this.f27981k.prepare();
        y(k2VarCopyWithPlaybackState, 1, 1, false, 5, C.TIME_UNSET, -1, false);
    }

    public final void q() {
        tf.k kVar = this.Y;
        p0 p0Var = this.f28007x;
        if (kVar != null) {
            f(this.f28009y).setType(10000).setPayload(null).send();
            this.Y.removeVideoSurfaceListener(p0Var);
            this.Y = null;
        }
        TextureView textureView = this.f27962a0;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != p0Var) {
                com.google.android.exoplayer2.util.f0.w("ExoPlayerImpl", "SurfaceTextureListener already unset or replaced.");
            } else {
                this.f27962a0.setSurfaceTextureListener(null);
            }
            this.f27962a0 = null;
        }
        SurfaceHolder surfaceHolder = this.X;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(p0Var);
            this.X = null;
        }
    }

    public final void r(int i10, int i11, Object obj) {
        for (z2 z2Var : this.f27973g) {
            if (z2Var.getTrackType() == i10) {
                f(z2Var).setType(i11).setPayload(obj).send();
            }
        }
    }

    @Override // com.google.android.exoplayer2.e, com.google.android.exoplayer2.r2
    public void release() {
        AudioTrack audioTrack;
        com.google.android.exoplayer2.util.f0.i("ExoPlayerImpl", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [ExoPlayerLib/2.19.1] [" + com.google.android.exoplayer2.util.n1.f28510e + "] [" + w0.registeredModules() + C3191e4.i.f36531e);
        A();
        if (com.google.android.exoplayer2.util.n1.f28506a < 21 && (audioTrack = this.U) != null) {
            audioTrack.release();
            this.U = null;
        }
        this.f28010z.setEnabled(false);
        StreamVolumeManager streamVolumeManager = this.B;
        if (streamVolumeManager != null) {
            streamVolumeManager.release();
        }
        this.C.setStayAwake(false);
        this.D.setStayAwake(false);
        this.A.release();
        if (!this.f27981k.release()) {
            this.f27983l.sendEvent(10, new com.bytedance.adsdk.ugeno.zz.cm.a(4));
        }
        this.f27983l.release();
        this.f27977i.removeCallbacksAndMessages(null);
        ((qf.x) this.f27999t).removeEventListener(this.f27995r);
        k2 k2Var = this.f28004v0;
        if (k2Var.f27586o) {
            this.f28004v0 = k2Var.copyWithEstimatedPosition();
        }
        k2 k2VarCopyWithPlaybackState = this.f28004v0.copyWithPlaybackState(1);
        this.f28004v0 = k2VarCopyWithPlaybackState;
        k2 k2VarCopyWithLoadingMediaPeriodId = k2VarCopyWithPlaybackState.copyWithLoadingMediaPeriodId(k2VarCopyWithPlaybackState.f27573b);
        this.f28004v0 = k2VarCopyWithLoadingMediaPeriodId;
        k2VarCopyWithLoadingMediaPeriodId.f27587p = k2VarCopyWithLoadingMediaPeriodId.f27589r;
        this.f28004v0.f27588q = 0L;
        this.f27995r.release();
        this.f27975h.release();
        q();
        Surface surface = this.W;
        if (surface != null) {
            surface.release();
            this.W = null;
        }
        if (this.f27994q0) {
            ((com.google.android.exoplayer2.util.x0) com.google.android.exoplayer2.util.a.checkNotNull(this.f27992p0)).remove(0);
            this.f27994q0 = false;
        }
        this.f27982k0 = ef.e.f54308e;
        this.f27996r0 = true;
    }

    @Override // com.google.android.exoplayer2.c0
    public void removeAnalyticsListener(zd.d dVar) {
        A();
        this.f27995r.removeListener((zd.d) com.google.android.exoplayer2.util.a.checkNotNull(dVar));
    }

    @Override // com.google.android.exoplayer2.c0
    public void removeAudioOffloadListener(t tVar) {
        A();
        this.f27985m.remove(tVar);
    }

    @Override // com.google.android.exoplayer2.e, com.google.android.exoplayer2.r2
    public void removeListener(p2 p2Var) {
        A();
        this.f27983l.remove((p2) com.google.android.exoplayer2.util.a.checkNotNull(p2Var));
    }

    @Override // com.google.android.exoplayer2.e, com.google.android.exoplayer2.r2
    public void removeMediaItems(int i10, int i11) {
        A();
        com.google.android.exoplayer2.util.a.checkArgument(i10 >= 0 && i11 >= i10);
        int size = this.f27989o.size();
        int iMin = Math.min(i11, size);
        if (i10 >= size || i10 == iMin) {
            return;
        }
        k2 k2VarP = p(this.f28004v0, i10, iMin);
        y(k2VarP, 0, 1, !k2VarP.f27573b.f9193a.equals(this.f28004v0.f27573b.f9193a), 4, h(k2VarP), -1, false);
    }

    @Override // com.google.android.exoplayer2.e, com.google.android.exoplayer2.r2
    public void replaceMediaItems(int i10, int i11, List<u1> list) {
        A();
        com.google.android.exoplayer2.util.a.checkArgument(i10 >= 0 && i11 >= i10);
        ArrayList arrayList = this.f27989o;
        int size = arrayList.size();
        if (i10 > size) {
            return;
        }
        int iMin = Math.min(i11, size);
        ArrayList arrayListE = e(list);
        if (arrayList.isEmpty()) {
            setMediaSources(arrayListE, this.f28006w0 == -1);
        } else {
            k2 k2VarP = p(c(this.f28004v0, iMin, arrayListE), i10, iMin);
            y(k2VarP, 0, 1, !k2VarP.f27573b.f9193a.equals(this.f28004v0.f27573b.f9193a), 4, h(k2VarP), -1, false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s(java.util.List r16, int r17, long r18, boolean r20) {
        /*
            r15 = this;
            r1 = r17
            com.google.android.exoplayer2.k2 r2 = r15.f28004v0
            int r2 = r15.i(r2)
            long r3 = r15.getCurrentPosition()
            int r5 = r15.H
            r6 = 1
            int r5 = r5 + r6
            r15.H = r5
            java.util.ArrayList r5 = r15.f27989o
            boolean r7 = r5.isEmpty()
            r8 = 0
            if (r7 != 0) goto L31
            int r7 = r5.size()
            int r9 = r7 + (-1)
        L21:
            if (r9 < 0) goto L29
            r5.remove(r9)
            int r9 = r9 + (-1)
            goto L21
        L29:
            bf.f1 r9 = r15.N
            bf.f1 r7 = r9.cloneAndRemove(r8, r7)
            r15.N = r7
        L31:
            r7 = r16
            java.util.ArrayList r10 = r15.b(r8, r7)
            com.google.android.exoplayer2.w2 r7 = new com.google.android.exoplayer2.w2
            bf.f1 r9 = r15.N
            r7.<init>(r5, r9)
            boolean r5 = r7.isEmpty()
            if (r5 != 0) goto L4a
            int r5 = r7.getWindowCount()
            if (r1 >= r5) goto L4d
        L4a:
            r11 = r18
            goto L55
        L4d:
            com.google.android.exoplayer2.c1 r2 = new com.google.android.exoplayer2.c1
            r11 = r18
            r2.<init>(r7, r1, r11)
            throw r2
        L55:
            r5 = -1
            if (r20 == 0) goto L65
            boolean r1 = r15.G
            int r1 = r7.getFirstWindowIndex(r1)
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L63:
            r11 = r1
            goto L6c
        L65:
            if (r1 != r5) goto L6a
            r11 = r2
            r2 = r3
            goto L6c
        L6a:
            r2 = r11
            goto L63
        L6c:
            com.google.android.exoplayer2.k2 r1 = r15.f28004v0
            android.util.Pair r4 = r15.n(r7, r11, r2)
            com.google.android.exoplayer2.k2 r1 = r15.m(r1, r7, r4)
            int r4 = r1.f27576e
            if (r11 == r5) goto L8c
            if (r4 == r6) goto L8c
            boolean r4 = r7.isEmpty()
            if (r4 != 0) goto L8b
            int r4 = r7.getWindowCount()
            if (r11 < r4) goto L89
            goto L8b
        L89:
            r4 = 2
            goto L8c
        L8b:
            r4 = 4
        L8c:
            com.google.android.exoplayer2.k2 r1 = r1.copyWithPlaybackState(r4)
            long r12 = com.google.android.exoplayer2.util.n1.msToUs(r2)
            bf.f1 r14 = r15.N
            com.google.android.exoplayer2.u0 r9 = r15.f27981k
            r9.setMediaSources(r10, r11, r12, r14)
            com.google.android.exoplayer2.k2 r2 = r15.f28004v0
            bf.d0 r2 = r2.f27573b
            java.lang.Object r2 = r2.f9193a
            bf.d0 r3 = r1.f27573b
            java.lang.Object r3 = r3.f9193a
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto Lb7
            com.google.android.exoplayer2.k2 r2 = r15.f28004v0
            com.google.android.exoplayer2.m3 r2 = r2.f27572a
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto Lb7
            r4 = r6
            goto Lb8
        Lb7:
            r4 = r8
        Lb8:
            long r6 = r15.h(r1)
            r8 = -1
            r9 = 0
            r2 = 0
            r3 = 1
            r5 = 4
            r0 = r15
            r0.y(r1, r2, r3, r4, r5, r6, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.r0.s(java.util.List, int, long, boolean):void");
    }

    @Override // com.google.android.exoplayer2.e
    public void seekTo(int i10, long j10, int i11, boolean z10) {
        A();
        com.google.android.exoplayer2.util.a.checkArgument(i10 >= 0);
        this.f27995r.notifySeekStarted();
        m3 m3Var = this.f28004v0.f27572a;
        if (m3Var.isEmpty() || i10 < m3Var.getWindowCount()) {
            this.H++;
            if (isPlayingAd()) {
                com.google.android.exoplayer2.util.f0.w("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                u0.c cVar = new u0.c(this.f28004v0);
                cVar.incrementPendingOperationAcks(1);
                this.f27979j.onPlaybackInfoUpdate(cVar);
                return;
            }
            k2 k2VarCopyWithPlaybackState = this.f28004v0;
            int i12 = k2VarCopyWithPlaybackState.f27576e;
            if (i12 == 3 || (i12 == 4 && !m3Var.isEmpty())) {
                k2VarCopyWithPlaybackState = this.f28004v0.copyWithPlaybackState(2);
            }
            int currentMediaItemIndex = getCurrentMediaItemIndex();
            k2 k2VarM = m(k2VarCopyWithPlaybackState, m3Var, n(m3Var, i10, j10));
            this.f27981k.seekTo(m3Var, i10, com.google.android.exoplayer2.util.n1.msToUs(j10));
            y(k2VarM, 0, 1, true, 1, h(k2VarM), currentMediaItemIndex, z10);
        }
    }

    @Override // com.google.android.exoplayer2.c0, com.google.android.exoplayer2.s
    public void setAudioAttributes(com.google.android.exoplayer2.audio.k kVar, boolean z10) {
        A();
        if (this.f27996r0) {
            return;
        }
        boolean zAreEqual = com.google.android.exoplayer2.util.n1.areEqual(this.f27976h0, kVar);
        int i10 = 1;
        com.google.android.exoplayer2.util.c0 c0Var = this.f27983l;
        if (!zAreEqual) {
            this.f27976h0 = kVar;
            r(1, 3, kVar);
            StreamVolumeManager streamVolumeManager = this.B;
            if (streamVolumeManager != null) {
                streamVolumeManager.setStreamType(com.google.android.exoplayer2.util.n1.getStreamTypeForAudioUsage(kVar.f27160e));
            }
            c0Var.queueEvent(20, new e0(kVar, 1));
        }
        com.google.android.exoplayer2.audio.k kVar2 = z10 ? kVar : null;
        c cVar = this.A;
        cVar.setAudioAttributes(kVar2);
        this.f27975h.setAudioAttributes(kVar);
        boolean playWhenReady = getPlayWhenReady();
        int iUpdateAudioFocus = cVar.updateAudioFocus(playWhenReady, getPlaybackState());
        if (playWhenReady && iUpdateAudioFocus != 1) {
            i10 = 2;
        }
        x(iUpdateAudioFocus, i10, playWhenReady);
        c0Var.flushEvents();
    }

    @Override // com.google.android.exoplayer2.c0, com.google.android.exoplayer2.s
    public void setAudioSessionId(int i10) {
        A();
        if (this.f27974g0 == i10) {
            return;
        }
        if (i10 == 0) {
            i10 = com.google.android.exoplayer2.util.n1.f28506a < 21 ? l(0) : com.google.android.exoplayer2.util.n1.generateAudioSessionIdV21(this.f27969e);
        } else if (com.google.android.exoplayer2.util.n1.f28506a < 21) {
            l(i10);
        }
        this.f27974g0 = i10;
        r(1, 10, Integer.valueOf(i10));
        r(2, 10, Integer.valueOf(i10));
        this.f27983l.sendEvent(21, new j0(i10, 1));
    }

    @Override // com.google.android.exoplayer2.c0, com.google.android.exoplayer2.s
    public void setAuxEffectInfo(com.google.android.exoplayer2.audio.l0 l0Var) {
        A();
        r(1, 6, l0Var);
    }

    @Override // com.google.android.exoplayer2.c0, com.google.android.exoplayer2.b0
    public void setCameraMotionListener(tf.a aVar) {
        A();
        this.f27986m0 = aVar;
        f(this.f28009y).setType(8).setPayload(aVar).send();
    }

    @Override // com.google.android.exoplayer2.e, com.google.android.exoplayer2.r2
    @Deprecated
    public void setDeviceMuted(boolean z10) {
        A();
        StreamVolumeManager streamVolumeManager = this.B;
        if (streamVolumeManager != null) {
            streamVolumeManager.setMuted(z10, 1);
        }
    }

    @Override // com.google.android.exoplayer2.e, com.google.android.exoplayer2.r2
    @Deprecated
    public void setDeviceVolume(int i10) {
        A();
        StreamVolumeManager streamVolumeManager = this.B;
        if (streamVolumeManager != null) {
            streamVolumeManager.setVolume(i10, 1);
        }
    }

    @Override // com.google.android.exoplayer2.c0
    public void setForegroundMode(boolean z10) {
        A();
        if (this.L != z10) {
            this.L = z10;
            if (this.f27981k.setForegroundMode(z10)) {
                return;
            }
            v(r.createForUnexpected(new x0(2), IronSourceError.AUCTION_ERROR_DECRYPTION));
        }
    }

    @Override // com.google.android.exoplayer2.c0
    public void setHandleAudioBecomingNoisy(boolean z10) {
        A();
        if (this.f27996r0) {
            return;
        }
        this.f28010z.setEnabled(z10);
    }

    @Override // com.google.android.exoplayer2.e, com.google.android.exoplayer2.r2
    public void setMediaItems(List<u1> list, boolean z10) {
        A();
        setMediaSources(e(list), z10);
    }

    @Override // com.google.android.exoplayer2.c0
    public void setMediaSource(bf.f0 f0Var) {
        A();
        setMediaSources(Collections.singletonList(f0Var));
    }

    @Override // com.google.android.exoplayer2.c0
    public void setMediaSources(List<bf.f0> list) {
        A();
        setMediaSources(list, true);
    }

    @Override // com.google.android.exoplayer2.c0
    public void setPauseAtEndOfMediaItems(boolean z10) {
        A();
        if (this.O == z10) {
            return;
        }
        this.O = z10;
        this.f27981k.setPauseAtEndOfWindow(z10);
    }

    @Override // com.google.android.exoplayer2.e, com.google.android.exoplayer2.r2
    public void setPlayWhenReady(boolean z10) {
        A();
        int iUpdateAudioFocus = this.A.updateAudioFocus(z10, getPlaybackState());
        int i10 = 1;
        if (z10 && iUpdateAudioFocus != 1) {
            i10 = 2;
        }
        x(iUpdateAudioFocus, i10, z10);
    }

    @Override // com.google.android.exoplayer2.e, com.google.android.exoplayer2.r2
    public void setPlaybackParameters(l2 l2Var) {
        A();
        if (l2Var == null) {
            l2Var = l2.f27634f;
        }
        if (this.f28004v0.f27585n.equals(l2Var)) {
            return;
        }
        k2 k2VarCopyWithPlaybackParameters = this.f28004v0.copyWithPlaybackParameters(l2Var);
        this.H++;
        this.f27981k.setPlaybackParameters(l2Var);
        y(k2VarCopyWithPlaybackParameters, 0, 1, false, 5, C.TIME_UNSET, -1, false);
    }

    @Override // com.google.android.exoplayer2.e, com.google.android.exoplayer2.r2
    public void setPlaylistMetadata(w1 w1Var) {
        A();
        com.google.android.exoplayer2.util.a.checkNotNull(w1Var);
        if (w1Var.equals(this.R)) {
            return;
        }
        this.R = w1Var;
        this.f27983l.sendEvent(15, new i0(this, 0));
    }

    @Override // com.google.android.exoplayer2.c0
    public void setPreferredAudioDevice(AudioDeviceInfo audioDeviceInfo) {
        A();
        r(1, 12, audioDeviceInfo);
    }

    @Override // com.google.android.exoplayer2.c0
    public void setPriorityTaskManager(com.google.android.exoplayer2.util.x0 x0Var) {
        A();
        if (com.google.android.exoplayer2.util.n1.areEqual(this.f27992p0, x0Var)) {
            return;
        }
        if (this.f27994q0) {
            ((com.google.android.exoplayer2.util.x0) com.google.android.exoplayer2.util.a.checkNotNull(this.f27992p0)).remove(0);
        }
        if (x0Var == null || !isLoading()) {
            this.f27994q0 = false;
        } else {
            x0Var.add(0);
            this.f27994q0 = true;
        }
        this.f27992p0 = x0Var;
    }

    @Override // com.google.android.exoplayer2.e, com.google.android.exoplayer2.r2
    public void setRepeatMode(int i10) {
        A();
        if (this.F != i10) {
            this.F = i10;
            this.f27981k.setRepeatMode(i10);
            j0 j0Var = new j0(i10, 0);
            com.google.android.exoplayer2.util.c0 c0Var = this.f27983l;
            c0Var.queueEvent(8, j0Var);
            w();
            c0Var.flushEvents();
        }
    }

    @Override // com.google.android.exoplayer2.c0
    public void setSeekParameters(e3 e3Var) {
        A();
        if (e3Var == null) {
            e3Var = e3.f27444c;
        }
        if (this.M.equals(e3Var)) {
            return;
        }
        this.M = e3Var;
        this.f27981k.setSeekParameters(e3Var);
    }

    @Override // com.google.android.exoplayer2.e, com.google.android.exoplayer2.r2
    public void setShuffleModeEnabled(boolean z10) {
        A();
        if (this.G != z10) {
            this.G = z10;
            this.f27981k.setShuffleModeEnabled(z10);
            g0 g0Var = new g0(z10, 0);
            com.google.android.exoplayer2.util.c0 c0Var = this.f27983l;
            c0Var.queueEvent(9, g0Var);
            w();
            c0Var.flushEvents();
        }
    }

    @Override // com.google.android.exoplayer2.c0
    public void setShuffleOrder(bf.f1 f1Var) {
        A();
        int length = f1Var.getLength();
        ArrayList arrayList = this.f27989o;
        com.google.android.exoplayer2.util.a.checkArgument(length == arrayList.size());
        this.N = f1Var;
        w2 w2Var = new w2(arrayList, this.N);
        k2 k2VarM = m(this.f28004v0, w2Var, n(w2Var, getCurrentMediaItemIndex(), getCurrentPosition()));
        this.H++;
        this.f27981k.setShuffleOrder(f1Var);
        y(k2VarM, 0, 1, false, 5, C.TIME_UNSET, -1, false);
    }

    @Override // com.google.android.exoplayer2.c0, com.google.android.exoplayer2.s
    public void setSkipSilenceEnabled(boolean z10) {
        A();
        if (this.f27980j0 == z10) {
            return;
        }
        this.f27980j0 = z10;
        r(1, 9, Boolean.valueOf(z10));
        this.f27983l.sendEvent(23, new g0(z10, 1));
    }

    @Override // com.google.android.exoplayer2.e, com.google.android.exoplayer2.r2
    public void setTrackSelectionParameters(pf.s sVar) {
        A();
        pf.w wVar = this.f27975h;
        if (!wVar.isSetParametersSupported() || sVar.equals(wVar.getParameters())) {
            return;
        }
        wVar.setParameters(sVar);
        this.f27983l.sendEvent(19, new e0(sVar, 2));
    }

    @Override // com.google.android.exoplayer2.c0, com.google.android.exoplayer2.b0
    public void setVideoChangeFrameRateStrategy(int i10) {
        A();
        if (this.f27966c0 == i10) {
            return;
        }
        this.f27966c0 = i10;
        r(2, 5, Integer.valueOf(i10));
    }

    @Override // com.google.android.exoplayer2.c0
    public void setVideoEffects(List<com.google.android.exoplayer2.util.l> list) {
        A();
        r(2, 13, list);
    }

    @Override // com.google.android.exoplayer2.c0, com.google.android.exoplayer2.b0
    public void setVideoFrameMetadataListener(sf.l lVar) {
        A();
        this.f27984l0 = lVar;
        f(this.f28009y).setType(7).setPayload(lVar).send();
    }

    @Override // com.google.android.exoplayer2.c0, com.google.android.exoplayer2.b0
    public void setVideoScalingMode(int i10) {
        A();
        this.f27964b0 = i10;
        r(2, 4, Integer.valueOf(i10));
    }

    @Override // com.google.android.exoplayer2.e, com.google.android.exoplayer2.r2
    public void setVideoSurface(Surface surface) {
        A();
        q();
        u(surface);
        int i10 = surface == null ? 0 : -1;
        o(i10, i10);
    }

    @Override // com.google.android.exoplayer2.e, com.google.android.exoplayer2.r2
    public void setVideoSurfaceHolder(SurfaceHolder surfaceHolder) {
        A();
        if (surfaceHolder == null) {
            clearVideoSurface();
            return;
        }
        q();
        this.Z = true;
        this.X = surfaceHolder;
        surfaceHolder.addCallback(this.f28007x);
        Surface surface = surfaceHolder.getSurface();
        if (surface == null || !surface.isValid()) {
            u(null);
            o(0, 0);
        } else {
            u(surface);
            Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
            o(surfaceFrame.width(), surfaceFrame.height());
        }
    }

    @Override // com.google.android.exoplayer2.e, com.google.android.exoplayer2.r2
    public void setVideoSurfaceView(SurfaceView surfaceView) {
        A();
        if (surfaceView instanceof sf.k) {
            q();
            u(surfaceView);
            t(surfaceView.getHolder());
        } else {
            if (!(surfaceView instanceof tf.k)) {
                setVideoSurfaceHolder(surfaceView == null ? null : surfaceView.getHolder());
                return;
            }
            q();
            this.Y = (tf.k) surfaceView;
            f(this.f28009y).setType(10000).setPayload(this.Y).send();
            this.Y.addVideoSurfaceListener(this.f28007x);
            u(this.Y.getVideoSurface());
            t(surfaceView.getHolder());
        }
    }

    @Override // com.google.android.exoplayer2.e, com.google.android.exoplayer2.r2
    public void setVideoTextureView(TextureView textureView) {
        A();
        if (textureView == null) {
            clearVideoSurface();
            return;
        }
        q();
        this.f27962a0 = textureView;
        if (textureView.getSurfaceTextureListener() != null) {
            com.google.android.exoplayer2.util.f0.w("ExoPlayerImpl", "Replacing existing SurfaceTextureListener.");
        }
        textureView.setSurfaceTextureListener(this.f28007x);
        SurfaceTexture surfaceTexture = textureView.isAvailable() ? textureView.getSurfaceTexture() : null;
        if (surfaceTexture == null) {
            u(null);
            o(0, 0);
        } else {
            Surface surface = new Surface(surfaceTexture);
            u(surface);
            this.W = surface;
            o(textureView.getWidth(), textureView.getHeight());
        }
    }

    @Override // com.google.android.exoplayer2.e, com.google.android.exoplayer2.r2
    public void setVolume(float f10) {
        A();
        float fConstrainValue = com.google.android.exoplayer2.util.n1.constrainValue(f10, 0.0f, 1.0f);
        if (this.f27978i0 == fConstrainValue) {
            return;
        }
        this.f27978i0 = fConstrainValue;
        r(1, 2, Float.valueOf(this.A.getVolumeMultiplier() * fConstrainValue));
        this.f27983l.sendEvent(22, new h0(fConstrainValue, 0));
    }

    @Override // com.google.android.exoplayer2.c0
    public void setWakeMode(int i10) {
        A();
        p3 p3Var = this.D;
        o3 o3Var = this.C;
        if (i10 == 0) {
            o3Var.setEnabled(false);
            p3Var.setEnabled(false);
        } else if (i10 == 1) {
            o3Var.setEnabled(true);
            p3Var.setEnabled(false);
        } else {
            if (i10 != 2) {
                return;
            }
            o3Var.setEnabled(true);
            p3Var.setEnabled(true);
        }
    }

    @Override // com.google.android.exoplayer2.e, com.google.android.exoplayer2.r2
    public void stop() {
        A();
        this.A.updateAudioFocus(getPlayWhenReady(), 1);
        v(null);
        this.f27982k0 = new ef.e(b5.of(), this.f28004v0.f27589r);
    }

    public final void t(SurfaceHolder surfaceHolder) {
        this.Z = false;
        this.X = surfaceHolder;
        surfaceHolder.addCallback(this.f28007x);
        Surface surface = this.X.getSurface();
        if (surface == null || !surface.isValid()) {
            o(0, 0);
        } else {
            Rect surfaceFrame = this.X.getSurfaceFrame();
            o(surfaceFrame.width(), surfaceFrame.height());
        }
    }

    public final void u(Object obj) {
        ArrayList arrayList = new ArrayList();
        boolean z10 = false;
        for (z2 z2Var : this.f27973g) {
            if (z2Var.getTrackType() == 2) {
                arrayList.add(f(z2Var).setType(1).setPayload(obj).send());
            }
        }
        Object obj2 = this.V;
        if (obj2 != null && obj2 != obj) {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((u2) it.next()).blockUntilDelivered(this.E);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
                z10 = true;
            }
            Object obj3 = this.V;
            Surface surface = this.W;
            if (obj3 == surface) {
                surface.release();
                this.W = null;
            }
        }
        this.V = obj;
        if (z10) {
            v(r.createForUnexpected(new x0(3), IronSourceError.AUCTION_ERROR_DECRYPTION));
        }
    }

    public final void v(r rVar) {
        k2 k2Var = this.f28004v0;
        k2 k2VarCopyWithLoadingMediaPeriodId = k2Var.copyWithLoadingMediaPeriodId(k2Var.f27573b);
        k2VarCopyWithLoadingMediaPeriodId.f27587p = k2VarCopyWithLoadingMediaPeriodId.f27589r;
        k2VarCopyWithLoadingMediaPeriodId.f27588q = 0L;
        k2 k2VarCopyWithPlaybackState = k2VarCopyWithLoadingMediaPeriodId.copyWithPlaybackState(1);
        if (rVar != null) {
            k2VarCopyWithPlaybackState = k2VarCopyWithPlaybackState.copyWithPlaybackError(rVar);
        }
        this.H++;
        this.f27981k.stop();
        y(k2VarCopyWithPlaybackState, 0, 1, false, 5, C.TIME_UNSET, -1, false);
    }

    public final void w() {
        n2 n2Var = this.P;
        n2 availableCommands = com.google.android.exoplayer2.util.n1.getAvailableCommands(this.f27971f, this.f27965c);
        this.P = availableCommands;
        if (availableCommands.equals(n2Var)) {
            return;
        }
        this.f27983l.queueEvent(13, new i0(this, 3));
    }

    public final void x(int i10, int i11, boolean z10) {
        int i12 = 0;
        boolean z11 = z10 && i10 != -1;
        if (z11 && i10 != 1) {
            i12 = 1;
        }
        k2 k2VarCopyWithEstimatedPosition = this.f28004v0;
        if (k2VarCopyWithEstimatedPosition.f27583l == z11 && k2VarCopyWithEstimatedPosition.f27584m == i12) {
            return;
        }
        this.H++;
        if (k2VarCopyWithEstimatedPosition.f27586o) {
            k2VarCopyWithEstimatedPosition = k2VarCopyWithEstimatedPosition.copyWithEstimatedPosition();
        }
        k2 k2VarCopyWithPlayWhenReady = k2VarCopyWithEstimatedPosition.copyWithPlayWhenReady(z11, i12);
        this.f27981k.setPlayWhenReady(z11, i12);
        y(k2VarCopyWithPlayWhenReady, 0, i11, false, 5, C.TIME_UNSET, -1, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:93:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x028a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void y(final com.google.android.exoplayer2.k2 r32, final int r33, final int r34, boolean r35, int r36, long r37, int r39, boolean r40) {
        /*
            Method dump skipped, instructions count: 945
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.r0.y(com.google.android.exoplayer2.k2, int, int, boolean, int, long, int, boolean):void");
    }

    public final void z() {
        int playbackState = getPlaybackState();
        p3 p3Var = this.D;
        o3 o3Var = this.C;
        boolean z10 = false;
        if (playbackState != 1) {
            if (playbackState == 2 || playbackState == 3) {
                boolean zExperimentalIsSleepingForOffload = experimentalIsSleepingForOffload();
                if (getPlayWhenReady() && !zExperimentalIsSleepingForOffload) {
                    z10 = true;
                }
                o3Var.setStayAwake(z10);
                p3Var.setStayAwake(getPlayWhenReady());
                return;
            }
            if (playbackState != 4) {
                throw new IllegalStateException();
            }
        }
        o3Var.setStayAwake(false);
        p3Var.setStayAwake(false);
    }

    @Override // com.google.android.exoplayer2.e, com.google.android.exoplayer2.r2
    public r getPlayerError() {
        A();
        return this.f28004v0.f27577f;
    }

    @Override // com.google.android.exoplayer2.c0
    public void addMediaSource(int i10, bf.f0 f0Var) {
        A();
        addMediaSources(i10, Collections.singletonList(f0Var));
    }

    @Override // com.google.android.exoplayer2.c0
    public void addMediaSources(int i10, List<bf.f0> list) {
        A();
        com.google.android.exoplayer2.util.a.checkArgument(i10 >= 0);
        ArrayList arrayList = this.f27989o;
        int iMin = Math.min(i10, arrayList.size());
        if (arrayList.isEmpty()) {
            setMediaSources(list, this.f28006w0 == -1);
        } else {
            y(c(this.f28004v0, iMin, list), 0, 1, false, 5, C.TIME_UNSET, -1, false);
        }
    }

    @Override // com.google.android.exoplayer2.e, com.google.android.exoplayer2.r2
    public void setMediaItems(List<u1> list, int i10, long j10) {
        A();
        setMediaSources(e(list), i10, j10);
    }

    @Override // com.google.android.exoplayer2.c0
    public void setMediaSource(bf.f0 f0Var, long j10) {
        A();
        setMediaSources(Collections.singletonList(f0Var), 0, j10);
    }

    @Override // com.google.android.exoplayer2.c0
    public void setMediaSources(List<bf.f0> list, boolean z10) {
        A();
        s(list, -1, C.TIME_UNSET, z10);
    }

    @Override // com.google.android.exoplayer2.e, com.google.android.exoplayer2.r2
    public void decreaseDeviceVolume(int i10) {
        A();
        StreamVolumeManager streamVolumeManager = this.B;
        if (streamVolumeManager != null) {
            streamVolumeManager.decreaseVolume(i10);
        }
    }

    @Override // com.google.android.exoplayer2.e, com.google.android.exoplayer2.r2
    public void increaseDeviceVolume(int i10) {
        A();
        StreamVolumeManager streamVolumeManager = this.B;
        if (streamVolumeManager != null) {
            streamVolumeManager.increaseVolume(i10);
        }
    }

    @Override // com.google.android.exoplayer2.e, com.google.android.exoplayer2.r2
    public void setDeviceMuted(boolean z10, int i10) {
        A();
        StreamVolumeManager streamVolumeManager = this.B;
        if (streamVolumeManager != null) {
            streamVolumeManager.setMuted(z10, i10);
        }
    }

    @Override // com.google.android.exoplayer2.e, com.google.android.exoplayer2.r2
    public void setDeviceVolume(int i10, int i11) {
        A();
        StreamVolumeManager streamVolumeManager = this.B;
        if (streamVolumeManager != null) {
            streamVolumeManager.setVolume(i10, i11);
        }
    }

    @Override // com.google.android.exoplayer2.e, com.google.android.exoplayer2.r2
    public void clearVideoSurface(Surface surface) {
        A();
        if (surface == null || surface != this.V) {
            return;
        }
        clearVideoSurface();
    }

    @Override // com.google.android.exoplayer2.c0
    public void setMediaSources(List<bf.f0> list, int i10, long j10) {
        A();
        s(list, i10, j10, false);
    }

    @Override // com.google.android.exoplayer2.c0
    public void setMediaSource(bf.f0 f0Var, boolean z10) {
        A();
        setMediaSources(Collections.singletonList(f0Var), z10);
    }

    @Override // com.google.android.exoplayer2.c0
    @Deprecated
    public void prepare(bf.f0 f0Var) {
        A();
        setMediaSource(f0Var);
        prepare();
    }

    @Override // com.google.android.exoplayer2.c0
    @Deprecated
    public void prepare(bf.f0 f0Var, boolean z10, boolean z11) {
        A();
        setMediaSource(f0Var, z10);
        prepare();
    }
}
