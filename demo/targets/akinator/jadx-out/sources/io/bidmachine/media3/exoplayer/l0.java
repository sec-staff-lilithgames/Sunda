package io.bidmachine.media3.exoplayer;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.media.AudioDeviceInfo;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import com.ironsource.C3191e4;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import io.bidmachine.media3.exoplayer.ExoPlayer;
import io.bidmachine.media3.exoplayer.i1;
import io.bidmachine.media3.exoplayer.image.ImageOutput;
import io.bidmachine.media3.exoplayer.o0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import nh.b5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class l0 extends gn.j implements ExoPlayer {
    public static final /* synthetic */ int A0 = 0;
    public final k0 A;
    public final AudioBecomingNoisyManager B;
    public final StreamVolumeManager C;
    public final k2 D;
    public final l2 E;
    public final long F;
    public final i2 G;
    public final io.bidmachine.media3.common.util.e H;
    public int I;
    public boolean J;
    public int K;
    public int L;
    public boolean M;
    public boolean N;
    public y1 O;
    public ao.s1 P;
    public ExoPlayer.b Q;
    public boolean R;
    public gn.e1 S;
    public gn.s0 T;
    public gn.s0 U;
    public io.bidmachine.media3.common.b V;
    public io.bidmachine.media3.common.b W;
    public Object X;
    public Surface Y;
    public SurfaceHolder Z;

    /* renamed from: a0, reason: collision with root package name */
    public jo.k f61336a0;

    /* renamed from: b, reason: collision with root package name */
    public final fo.v f61337b;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f61338b0;

    /* renamed from: c, reason: collision with root package name */
    public final gn.e1 f61339c;

    /* renamed from: c0, reason: collision with root package name */
    public TextureView f61340c0;

    /* renamed from: d, reason: collision with root package name */
    public final io.bidmachine.media3.common.util.j f61341d = new io.bidmachine.media3.common.util.j();

    /* renamed from: d0, reason: collision with root package name */
    public int f61342d0;

    /* renamed from: e, reason: collision with root package name */
    public final Context f61343e;

    /* renamed from: e0, reason: collision with root package name */
    public int f61344e0;

    /* renamed from: f, reason: collision with root package name */
    public final gn.i1 f61345f;

    /* renamed from: f0, reason: collision with root package name */
    public io.bidmachine.media3.common.util.p0 f61346f0;

    /* renamed from: g, reason: collision with root package name */
    public final s1[] f61347g;

    /* renamed from: g0, reason: collision with root package name */
    public j f61348g0;

    /* renamed from: h, reason: collision with root package name */
    public final s1[] f61349h;

    /* renamed from: h0, reason: collision with root package name */
    public j f61350h0;

    /* renamed from: i, reason: collision with root package name */
    public final fo.u f61351i;

    /* renamed from: i0, reason: collision with root package name */
    public gn.h f61352i0;

    /* renamed from: j, reason: collision with root package name */
    public final io.bidmachine.media3.common.util.v f61353j;

    /* renamed from: j0, reason: collision with root package name */
    public float f61354j0;

    /* renamed from: k, reason: collision with root package name */
    public final h0 f61355k;

    /* renamed from: k0, reason: collision with root package name */
    public boolean f61356k0;

    /* renamed from: l, reason: collision with root package name */
    public final o0 f61357l;

    /* renamed from: l0, reason: collision with root package name */
    public in.d f61358l0;

    /* renamed from: m, reason: collision with root package name */
    public final io.bidmachine.media3.common.util.y f61359m;

    /* renamed from: m0, reason: collision with root package name */
    public io.v f61360m0;

    /* renamed from: n, reason: collision with root package name */
    public final CopyOnWriteArraySet f61361n;

    /* renamed from: n0, reason: collision with root package name */
    public jo.a f61362n0;

    /* renamed from: o, reason: collision with root package name */
    public final gn.r1 f61363o;

    /* renamed from: o0, reason: collision with root package name */
    public final boolean f61364o0;

    /* renamed from: p, reason: collision with root package name */
    public final ArrayList f61365p;

    /* renamed from: p0, reason: collision with root package name */
    public boolean f61366p0;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f61367q;

    /* renamed from: q0, reason: collision with root package name */
    public int f61368q0;

    /* renamed from: r, reason: collision with root package name */
    public final ao.j0 f61369r;

    /* renamed from: r0, reason: collision with root package name */
    public gn.l1 f61370r0;

    /* renamed from: s, reason: collision with root package name */
    public final on.a f61371s;

    /* renamed from: s0, reason: collision with root package name */
    public boolean f61372s0;

    /* renamed from: t, reason: collision with root package name */
    public final Looper f61373t;

    /* renamed from: t0, reason: collision with root package name */
    public boolean f61374t0;

    /* renamed from: u, reason: collision with root package name */
    public final go.f f61375u;

    /* renamed from: u0, reason: collision with root package name */
    public gn.q f61376u0;

    /* renamed from: v, reason: collision with root package name */
    public final long f61377v;

    /* renamed from: v0, reason: collision with root package name */
    public gn.k2 f61378v0;

    /* renamed from: w, reason: collision with root package name */
    public final long f61379w;

    /* renamed from: w0, reason: collision with root package name */
    public gn.s0 f61380w0;

    /* renamed from: x, reason: collision with root package name */
    public final long f61381x;

    /* renamed from: x0, reason: collision with root package name */
    public k1 f61382x0;

    /* renamed from: y, reason: collision with root package name */
    public final io.bidmachine.media3.common.util.g f61383y;

    /* renamed from: y0, reason: collision with root package name */
    public int f61384y0;

    /* renamed from: z, reason: collision with root package name */
    public final j0 f61385z;

    /* renamed from: z0, reason: collision with root package name */
    public long f61386z0;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a implements d1 {

        /* renamed from: a, reason: collision with root package name */
        public final Object f61387a;

        /* renamed from: b, reason: collision with root package name */
        public final ao.f0 f61388b;

        /* renamed from: c, reason: collision with root package name */
        public gn.u1 f61389c;

        public a(Object obj, ao.f0 f0Var) {
            this.f61387a = obj;
            this.f61388b = f0Var;
            this.f61389c = f0Var.getTimeline();
        }

        @Override // io.bidmachine.media3.exoplayer.d1
        public gn.u1 getTimeline() {
            return this.f61389c;
        }

        @Override // io.bidmachine.media3.exoplayer.d1
        public Object getUid() {
            return this.f61387a;
        }

        public void updateTimeline(gn.u1 u1Var) {
            this.f61389c = u1Var;
        }
    }

    static {
        gn.q0.registerModule("media3.exoplayer");
    }

    public l0(ExoPlayer.a aVar, gn.i1 i1Var) {
        try {
            io.bidmachine.media3.common.util.b0.i("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.7.1] [" + io.bidmachine.media3.common.util.a1.f60680b + C3191e4.i.f36531e);
            Context context = aVar.f60830a;
            this.f61343e = context.getApplicationContext();
            this.f61371s = (on.a) aVar.f60838i.apply(aVar.f60831b);
            this.f61368q0 = aVar.f60840k;
            this.f61370r0 = aVar.f60841l;
            this.f61352i0 = aVar.f60842m;
            this.f61342d0 = aVar.f60848s;
            this.f61344e0 = aVar.f60849t;
            this.f61356k0 = aVar.f60846q;
            this.F = aVar.B;
            j0 j0Var = new j0(this);
            this.f61385z = j0Var;
            this.A = new k0();
            Handler handler = new Handler(aVar.f60839j);
            x1 x1Var = (x1) aVar.f60833d.get();
            s1[] s1VarArrCreateRenderers = x1Var.createRenderers(handler, j0Var, j0Var, j0Var, j0Var);
            this.f61347g = s1VarArrCreateRenderers;
            io.bidmachine.media3.common.util.a.checkState(s1VarArrCreateRenderers.length > 0);
            this.f61349h = new s1[s1VarArrCreateRenderers.length];
            int i10 = 0;
            while (true) {
                s1[] s1VarArr = this.f61349h;
                if (i10 >= s1VarArr.length) {
                    break;
                }
                s1 s1Var = this.f61347g[i10];
                j0 j0Var2 = this.f61385z;
                x1 x1Var2 = x1Var;
                s1VarArr[i10] = x1Var2.createSecondaryRenderer(s1Var, handler, j0Var2, j0Var2, j0Var2, j0Var2);
                i10++;
                x1Var = x1Var2;
            }
            fo.u uVar = (fo.u) aVar.f60835f.get();
            this.f61351i = uVar;
            this.f61369r = (ao.j0) aVar.f60834e.get();
            go.f fVar = (go.f) aVar.f60837h.get();
            this.f61375u = fVar;
            this.f61367q = aVar.f60850u;
            this.O = aVar.f60851v;
            this.f61377v = aVar.f60852w;
            this.f61379w = aVar.f60853x;
            this.f61381x = aVar.f60854y;
            this.R = aVar.C;
            Looper looper = aVar.f60839j;
            this.f61373t = looper;
            io.bidmachine.media3.common.util.g gVar = aVar.f60831b;
            this.f61383y = gVar;
            gn.i1 i1Var2 = i1Var == null ? this : i1Var;
            this.f61345f = i1Var2;
            this.f61359m = new io.bidmachine.media3.common.util.y(looper, gVar, new h0(this, 0));
            this.f61361n = new CopyOnWriteArraySet();
            this.f61365p = new ArrayList();
            this.P = new ao.r1(0);
            this.Q = ExoPlayer.b.f60856b;
            s1[] s1VarArr2 = this.f61347g;
            fo.v vVar = new fo.v(new v1[s1VarArr2.length], new fo.l[s1VarArr2.length], gn.b2.f57818b, null);
            this.f61337b = vVar;
            this.f61363o = new gn.r1();
            gn.e1 e1VarBuild = new gn.d1().addAll(1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32).addIf(29, uVar.isSetParametersSupported()).addIf(23, aVar.f60847r).addIf(25, aVar.f60847r).addIf(33, aVar.f60847r).addIf(26, aVar.f60847r).addIf(34, aVar.f60847r).build();
            this.f61339c = e1VarBuild;
            this.S = new gn.d1().addAll(e1VarBuild).add(4).add(10).build();
            this.f61353j = ((io.bidmachine.media3.common.util.q0) gVar).createHandler(looper, null);
            h0 h0Var = new h0(this, 1);
            this.f61355k = h0Var;
            this.f61382x0 = k1.createDummy(vVar);
            this.f61371s.setPlayer(i1Var2, looper);
            on.f0 f0Var = new on.f0(aVar.H);
            o0 o0Var = new o0(this.f61343e, this.f61347g, this.f61349h, uVar, vVar, (u0) aVar.f60836g.get(), fVar, this.I, this.J, this.f61371s, this.O, aVar.f60855z, aVar.A, this.R, aVar.I, looper, gVar, h0Var, f0Var, aVar.E, this.Q);
            this.f61357l = o0Var;
            Looper playbackLooper = o0Var.getPlaybackLooper();
            this.f61354j0 = 1.0f;
            this.I = 0;
            gn.s0 s0Var = gn.s0.K;
            this.T = s0Var;
            this.U = s0Var;
            this.f61380w0 = s0Var;
            this.f61384y0 = -1;
            this.f61358l0 = in.d.f59796c;
            this.f61364o0 = true;
            addListener(this.f61371s);
            ((go.o) fVar).addEventListener(new Handler(looper), this.f61371s);
            addAudioOffloadListener(this.f61385z);
            long j10 = aVar.f60832c;
            if (j10 > 0) {
                o0Var.experimentalSetForegroundModeTimeoutMs(j10);
            }
            if (io.bidmachine.media3.common.util.a1.f60679a >= 31) {
                i0.registerMediaMetricsListener(this.f61343e, this, aVar.D, f0Var);
            }
            io.bidmachine.media3.common.util.e eVar = new io.bidmachine.media3.common.util.e(0, playbackLooper, looper, gVar, new h0(this, 2));
            this.H = eVar;
            eVar.runInBackground(new c(this, 4));
            AudioBecomingNoisyManager audioBecomingNoisyManager = new AudioBecomingNoisyManager(aVar.f60830a, playbackLooper, aVar.f60839j, this.f61385z, gVar);
            io.bidmachine.media3.common.util.g gVar2 = gVar;
            this.B = audioBecomingNoisyManager;
            audioBecomingNoisyManager.setEnabled(aVar.f60845p);
            if (aVar.G) {
                i2 i2Var = aVar.J;
                this.G = i2Var;
                i2Var.enable(new h0(this, 3), this.f61343e, looper, playbackLooper, gVar2);
            } else {
                this.G = null;
            }
            if (aVar.f60847r) {
                StreamVolumeManager streamVolumeManager = new StreamVolumeManager(aVar.f60830a, this.f61385z, this.f61352i0.getStreamType(), playbackLooper, looper, gVar2);
                gVar2 = gVar2;
                this.C = streamVolumeManager;
            } else {
                this.C = null;
            }
            k2 k2Var = new k2(context, playbackLooper, gVar2);
            this.D = k2Var;
            k2Var.setEnabled(aVar.f60844o != 0);
            l2 l2Var = new l2(context, playbackLooper, gVar2);
            this.E = l2Var;
            l2Var.setEnabled(aVar.f60844o == 2);
            this.f61376u0 = gn.q.f58062e;
            this.f61378v0 = gn.k2.f57977d;
            this.f61346f0 = io.bidmachine.media3.common.util.p0.f60777c;
            o0Var.setAudioAttributes(this.f61352i0, aVar.f60843n);
            u(1, 3, this.f61352i0);
            u(2, 4, Integer.valueOf(this.f61342d0));
            u(2, 5, Integer.valueOf(this.f61344e0));
            u(1, 9, Boolean.valueOf(this.f61356k0));
            u(2, 7, this.A);
            u(6, 8, this.A);
            u(-1, 16, Integer.valueOf(this.f61368q0));
            this.f61341d.open();
        } catch (Throwable th2) {
            this.f61341d.open();
            throw th2;
        }
    }

    public static long n(k1 k1Var) {
        gn.t1 t1Var = new gn.t1();
        gn.r1 r1Var = new gn.r1();
        k1Var.f61303a.getPeriodByUid(k1Var.f61304b.f7718a, r1Var);
        long j10 = k1Var.f61305c;
        return j10 == C.TIME_UNSET ? k1Var.f61303a.getWindow(r1Var.f58110c, t1Var).getDefaultPositionUs() : r1Var.getPositionInWindowUs() + j10;
    }

    public static k1 o(k1 k1Var, int i10) {
        k1 k1VarCopyWithPlaybackState = k1Var.copyWithPlaybackState(i10);
        return (i10 == 1 || i10 == 4) ? k1VarCopyWithPlaybackState.copyWithIsLoading(false) : k1VarCopyWithPlaybackState;
    }

    public final void A(int i10, boolean z10) {
        i2 i2Var = this.G;
        int i11 = (i2Var == null || i2Var.isSelectedOutputSuitableForPlayback()) ? (this.f61382x0.f61316n != 1 || z10) ? 0 : 1 : 3;
        k1 k1VarCopyWithEstimatedPosition = this.f61382x0;
        if (k1VarCopyWithEstimatedPosition.f61314l == z10 && k1VarCopyWithEstimatedPosition.f61316n == i11 && k1VarCopyWithEstimatedPosition.f61315m == i10) {
            return;
        }
        this.K++;
        if (k1VarCopyWithEstimatedPosition.f61318p) {
            k1VarCopyWithEstimatedPosition = k1VarCopyWithEstimatedPosition.copyWithEstimatedPosition();
        }
        k1 k1VarCopyWithPlayWhenReady = k1VarCopyWithEstimatedPosition.copyWithPlayWhenReady(z10, i10, i11);
        this.f61357l.setPlayWhenReady(z10, i10, i11);
        B(k1VarCopyWithPlayWhenReady, 0, false, 5, C.TIME_UNSET, -1, false);
    }

    public final void B(final k1 k1Var, final int i10, boolean z10, int i11, long j10, int i12, boolean z11) {
        Pair pair;
        int i13;
        final gn.p0 p0Var;
        boolean z12;
        int i14;
        Object obj;
        gn.p0 p0Var2;
        Object obj2;
        int i15;
        long j11;
        long j12;
        long jN;
        long jN2;
        Object obj3;
        gn.p0 p0Var3;
        Object obj4;
        int i16;
        gn.l1 l1Var;
        k1 k1Var2 = this.f61382x0;
        this.f61382x0 = k1Var;
        boolean zEquals = k1Var2.f61303a.equals(k1Var.f61303a);
        gn.t1 t1Var = this.f57954a;
        gn.r1 r1Var = this.f61363o;
        gn.u1 u1Var = k1Var2.f61303a;
        ao.k0 k0Var = k1Var2.f61304b;
        gn.u1 u1Var2 = k1Var.f61303a;
        ao.k0 k0Var2 = k1Var.f61304b;
        if (u1Var2.isEmpty() && u1Var.isEmpty()) {
            pair = new Pair(Boolean.FALSE, -1);
        } else if (u1Var2.isEmpty() != u1Var.isEmpty()) {
            pair = new Pair(Boolean.TRUE, 3);
        } else if (u1Var.getWindow(u1Var.getPeriodByUid(k0Var.f7718a, r1Var).f58110c, t1Var).f58175a.equals(u1Var2.getWindow(u1Var2.getPeriodByUid(k0Var2.f7718a, r1Var).f58110c, t1Var).f58175a)) {
            pair = (z10 && i11 == 0 && k0Var.f7721d < k0Var2.f7721d) ? new Pair(Boolean.TRUE, 0) : (z10 && i11 == 1 && z11) ? new Pair(Boolean.TRUE, 2) : new Pair(Boolean.FALSE, -1);
        } else {
            if (z10 && i11 == 0) {
                i13 = 1;
            } else if (z10 && i11 == 1) {
                i13 = 2;
            } else {
                if (zEquals) {
                    throw new IllegalStateException();
                }
                i13 = 3;
            }
            pair = new Pair(Boolean.TRUE, Integer.valueOf(i13));
        }
        boolean zBooleanValue = ((Boolean) pair.first).booleanValue();
        final int iIntValue = ((Integer) pair.second).intValue();
        if (zBooleanValue) {
            p0Var = !k1Var.f61303a.isEmpty() ? k1Var.f61303a.getWindow(k1Var.f61303a.getPeriodByUid(k1Var.f61304b.f7718a, this.f61363o).f58110c, this.f57954a).f58177c : null;
            this.f61380w0 = gn.s0.K;
        } else {
            p0Var = null;
        }
        if (zBooleanValue || !k1Var2.f61312j.equals(k1Var.f61312j)) {
            this.f61380w0 = this.f61380w0.buildUpon().populateFromMetadata(k1Var.f61312j).build();
        }
        gn.s0 s0VarF = f();
        boolean zEquals2 = s0VarF.equals(this.T);
        this.T = s0VarF;
        boolean z13 = k1Var2.f61314l != k1Var.f61314l;
        boolean z14 = k1Var2.f61307e != k1Var.f61307e;
        if (z14 || z13) {
            C();
        }
        boolean z15 = k1Var2.f61309g;
        boolean z16 = k1Var.f61309g;
        boolean z17 = z15 != z16;
        if (z17 && (l1Var = this.f61370r0) != null) {
            if (z16 && !this.f61372s0) {
                l1Var.add(this.f61368q0);
                this.f61372s0 = true;
            } else if (!z16 && this.f61372s0) {
                l1Var.remove(this.f61368q0);
                this.f61372s0 = false;
            }
        }
        if (!zEquals) {
            final int i17 = 1;
            this.f61359m.queueEvent(0, new io.bidmachine.media3.common.util.w() { // from class: io.bidmachine.media3.exoplayer.e0
                @Override // io.bidmachine.media3.common.util.w
                public final void invoke(Object obj5) {
                    int i18 = i17;
                    int i19 = i10;
                    Object obj6 = k1Var;
                    switch (i18) {
                        case 0:
                            int i20 = l0.A0;
                            ((gn.g1) obj5).onMediaItemTransition((gn.p0) obj6, i19);
                            break;
                        default:
                            int i21 = l0.A0;
                            ((gn.g1) obj5).onTimelineChanged(((k1) obj6).f61303a, i19);
                            break;
                    }
                }
            });
        }
        if (z10) {
            gn.r1 r1Var2 = new gn.r1();
            if (k1Var2.f61303a.isEmpty()) {
                z12 = zBooleanValue;
                i14 = i12;
                obj = null;
                p0Var2 = null;
                obj2 = null;
                i15 = -1;
            } else {
                Object obj5 = k1Var2.f61304b.f7718a;
                k1Var2.f61303a.getPeriodByUid(obj5, r1Var2);
                int i18 = r1Var2.f58110c;
                int indexOfPeriod = k1Var2.f61303a.getIndexOfPeriod(obj5);
                z12 = zBooleanValue;
                obj = k1Var2.f61303a.getWindow(i18, this.f57954a).f58175a;
                obj2 = obj5;
                i14 = i18;
                i15 = indexOfPeriod;
                p0Var2 = this.f57954a.f58177c;
            }
            if (i11 == 0) {
                if (k1Var2.f61304b.isAd()) {
                    ao.k0 k0Var3 = k1Var2.f61304b;
                    jN = r1Var2.getAdDurationUs(k0Var3.f7719b, k0Var3.f7720c);
                    jN2 = n(k1Var2);
                } else if (k1Var2.f61304b.f7722e != -1) {
                    jN = n(this.f61382x0);
                    jN2 = jN;
                } else {
                    j11 = r1Var2.f58112e;
                    j12 = r1Var2.f58111d;
                    jN = j11 + j12;
                    jN2 = jN;
                }
            } else if (k1Var2.f61304b.isAd()) {
                jN = k1Var2.f61321s;
                jN2 = n(k1Var2);
            } else {
                j11 = r1Var2.f58112e;
                j12 = k1Var2.f61321s;
                jN = j11 + j12;
                jN2 = jN;
            }
            long jUsToMs = io.bidmachine.media3.common.util.a1.usToMs(jN);
            long jUsToMs2 = io.bidmachine.media3.common.util.a1.usToMs(jN2);
            ao.k0 k0Var4 = k1Var2.f61304b;
            gn.h1 h1Var = new gn.h1(obj, i14, p0Var2, obj2, i15, jUsToMs, jUsToMs2, k0Var4.f7719b, k0Var4.f7720c);
            gn.t1 t1Var2 = this.f57954a;
            int currentMediaItemIndex = getCurrentMediaItemIndex();
            if (this.f61382x0.f61303a.isEmpty()) {
                obj3 = null;
                p0Var3 = null;
                obj4 = null;
                i16 = -1;
            } else {
                k1 k1Var3 = this.f61382x0;
                Object obj6 = k1Var3.f61304b.f7718a;
                k1Var3.f61303a.getPeriodByUid(obj6, this.f61363o);
                int indexOfPeriod2 = this.f61382x0.f61303a.getIndexOfPeriod(obj6);
                Object obj7 = this.f61382x0.f61303a.getWindow(currentMediaItemIndex, t1Var2).f58175a;
                p0Var3 = t1Var2.f58177c;
                i16 = indexOfPeriod2;
                obj4 = obj6;
                obj3 = obj7;
            }
            long jUsToMs3 = io.bidmachine.media3.common.util.a1.usToMs(j10);
            long jUsToMs4 = this.f61382x0.f61304b.isAd() ? io.bidmachine.media3.common.util.a1.usToMs(n(this.f61382x0)) : jUsToMs3;
            ao.k0 k0Var5 = this.f61382x0.f61304b;
            this.f61359m.queueEvent(11, new com.google.android.exoplayer2.l0(i11, h1Var, new gn.h1(obj3, currentMediaItemIndex, p0Var3, obj4, i16, jUsToMs3, jUsToMs4, k0Var5.f7719b, k0Var5.f7720c), 1));
        } else {
            z12 = zBooleanValue;
        }
        if (z12) {
            final int i19 = 0;
            this.f61359m.queueEvent(1, new io.bidmachine.media3.common.util.w() { // from class: io.bidmachine.media3.exoplayer.e0
                @Override // io.bidmachine.media3.common.util.w
                public final void invoke(Object obj52) {
                    int i182 = i19;
                    int i192 = iIntValue;
                    Object obj62 = p0Var;
                    switch (i182) {
                        case 0:
                            int i20 = l0.A0;
                            ((gn.g1) obj52).onMediaItemTransition((gn.p0) obj62, i192);
                            break;
                        default:
                            int i21 = l0.A0;
                            ((gn.g1) obj52).onTimelineChanged(((k1) obj62).f61303a, i192);
                            break;
                    }
                }
            });
        }
        if (k1Var2.f61308f != k1Var.f61308f) {
            final int i20 = 3;
            this.f61359m.queueEvent(10, new io.bidmachine.media3.common.util.w() { // from class: io.bidmachine.media3.exoplayer.d0
                @Override // io.bidmachine.media3.common.util.w
                public final void invoke(Object obj8) {
                    int i21 = i20;
                    k1 k1Var4 = k1Var;
                    gn.g1 g1Var = (gn.g1) obj8;
                    switch (i21) {
                        case 0:
                            int i22 = l0.A0;
                            g1Var.onPlaybackSuppressionReasonChanged(k1Var4.f61316n);
                            break;
                        case 1:
                            int i23 = l0.A0;
                            g1Var.onIsPlayingChanged(k1Var4.isPlaying());
                            break;
                        case 2:
                            int i24 = l0.A0;
                            g1Var.onPlaybackParametersChanged(k1Var4.f61317o);
                            break;
                        case 3:
                            int i25 = l0.A0;
                            g1Var.onPlayerErrorChanged(k1Var4.f61308f);
                            break;
                        case 4:
                            int i26 = l0.A0;
                            g1Var.onPlayerError(k1Var4.f61308f);
                            break;
                        case 5:
                            int i27 = l0.A0;
                            g1Var.onTracksChanged(k1Var4.f61311i.f55928d);
                            break;
                        case 6:
                            int i28 = l0.A0;
                            g1Var.onLoadingChanged(k1Var4.f61309g);
                            g1Var.onIsLoadingChanged(k1Var4.f61309g);
                            break;
                        case 7:
                            int i29 = l0.A0;
                            g1Var.onPlayerStateChanged(k1Var4.f61314l, k1Var4.f61307e);
                            break;
                        case 8:
                            int i30 = l0.A0;
                            g1Var.onPlaybackStateChanged(k1Var4.f61307e);
                            break;
                        default:
                            int i31 = l0.A0;
                            g1Var.onPlayWhenReadyChanged(k1Var4.f61314l, k1Var4.f61315m);
                            break;
                    }
                }
            });
            if (k1Var.f61308f != null) {
                final int i21 = 4;
                this.f61359m.queueEvent(10, new io.bidmachine.media3.common.util.w() { // from class: io.bidmachine.media3.exoplayer.d0
                    @Override // io.bidmachine.media3.common.util.w
                    public final void invoke(Object obj8) {
                        int i212 = i21;
                        k1 k1Var4 = k1Var;
                        gn.g1 g1Var = (gn.g1) obj8;
                        switch (i212) {
                            case 0:
                                int i22 = l0.A0;
                                g1Var.onPlaybackSuppressionReasonChanged(k1Var4.f61316n);
                                break;
                            case 1:
                                int i23 = l0.A0;
                                g1Var.onIsPlayingChanged(k1Var4.isPlaying());
                                break;
                            case 2:
                                int i24 = l0.A0;
                                g1Var.onPlaybackParametersChanged(k1Var4.f61317o);
                                break;
                            case 3:
                                int i25 = l0.A0;
                                g1Var.onPlayerErrorChanged(k1Var4.f61308f);
                                break;
                            case 4:
                                int i26 = l0.A0;
                                g1Var.onPlayerError(k1Var4.f61308f);
                                break;
                            case 5:
                                int i27 = l0.A0;
                                g1Var.onTracksChanged(k1Var4.f61311i.f55928d);
                                break;
                            case 6:
                                int i28 = l0.A0;
                                g1Var.onLoadingChanged(k1Var4.f61309g);
                                g1Var.onIsLoadingChanged(k1Var4.f61309g);
                                break;
                            case 7:
                                int i29 = l0.A0;
                                g1Var.onPlayerStateChanged(k1Var4.f61314l, k1Var4.f61307e);
                                break;
                            case 8:
                                int i30 = l0.A0;
                                g1Var.onPlaybackStateChanged(k1Var4.f61307e);
                                break;
                            default:
                                int i31 = l0.A0;
                                g1Var.onPlayWhenReadyChanged(k1Var4.f61314l, k1Var4.f61315m);
                                break;
                        }
                    }
                });
            }
        }
        fo.v vVar = k1Var2.f61311i;
        fo.v vVar2 = k1Var.f61311i;
        if (vVar != vVar2) {
            this.f61351i.onSelectionActivated(vVar2.f55929e);
            final int i22 = 5;
            this.f61359m.queueEvent(2, new io.bidmachine.media3.common.util.w() { // from class: io.bidmachine.media3.exoplayer.d0
                @Override // io.bidmachine.media3.common.util.w
                public final void invoke(Object obj8) {
                    int i212 = i22;
                    k1 k1Var4 = k1Var;
                    gn.g1 g1Var = (gn.g1) obj8;
                    switch (i212) {
                        case 0:
                            int i222 = l0.A0;
                            g1Var.onPlaybackSuppressionReasonChanged(k1Var4.f61316n);
                            break;
                        case 1:
                            int i23 = l0.A0;
                            g1Var.onIsPlayingChanged(k1Var4.isPlaying());
                            break;
                        case 2:
                            int i24 = l0.A0;
                            g1Var.onPlaybackParametersChanged(k1Var4.f61317o);
                            break;
                        case 3:
                            int i25 = l0.A0;
                            g1Var.onPlayerErrorChanged(k1Var4.f61308f);
                            break;
                        case 4:
                            int i26 = l0.A0;
                            g1Var.onPlayerError(k1Var4.f61308f);
                            break;
                        case 5:
                            int i27 = l0.A0;
                            g1Var.onTracksChanged(k1Var4.f61311i.f55928d);
                            break;
                        case 6:
                            int i28 = l0.A0;
                            g1Var.onLoadingChanged(k1Var4.f61309g);
                            g1Var.onIsLoadingChanged(k1Var4.f61309g);
                            break;
                        case 7:
                            int i29 = l0.A0;
                            g1Var.onPlayerStateChanged(k1Var4.f61314l, k1Var4.f61307e);
                            break;
                        case 8:
                            int i30 = l0.A0;
                            g1Var.onPlaybackStateChanged(k1Var4.f61307e);
                            break;
                        default:
                            int i31 = l0.A0;
                            g1Var.onPlayWhenReadyChanged(k1Var4.f61314l, k1Var4.f61315m);
                            break;
                    }
                }
            });
        }
        if (!zEquals2) {
            this.f61359m.queueEvent(14, new f0(this.T, 0));
        }
        if (z17) {
            final int i23 = 6;
            this.f61359m.queueEvent(3, new io.bidmachine.media3.common.util.w() { // from class: io.bidmachine.media3.exoplayer.d0
                @Override // io.bidmachine.media3.common.util.w
                public final void invoke(Object obj8) {
                    int i212 = i23;
                    k1 k1Var4 = k1Var;
                    gn.g1 g1Var = (gn.g1) obj8;
                    switch (i212) {
                        case 0:
                            int i222 = l0.A0;
                            g1Var.onPlaybackSuppressionReasonChanged(k1Var4.f61316n);
                            break;
                        case 1:
                            int i232 = l0.A0;
                            g1Var.onIsPlayingChanged(k1Var4.isPlaying());
                            break;
                        case 2:
                            int i24 = l0.A0;
                            g1Var.onPlaybackParametersChanged(k1Var4.f61317o);
                            break;
                        case 3:
                            int i25 = l0.A0;
                            g1Var.onPlayerErrorChanged(k1Var4.f61308f);
                            break;
                        case 4:
                            int i26 = l0.A0;
                            g1Var.onPlayerError(k1Var4.f61308f);
                            break;
                        case 5:
                            int i27 = l0.A0;
                            g1Var.onTracksChanged(k1Var4.f61311i.f55928d);
                            break;
                        case 6:
                            int i28 = l0.A0;
                            g1Var.onLoadingChanged(k1Var4.f61309g);
                            g1Var.onIsLoadingChanged(k1Var4.f61309g);
                            break;
                        case 7:
                            int i29 = l0.A0;
                            g1Var.onPlayerStateChanged(k1Var4.f61314l, k1Var4.f61307e);
                            break;
                        case 8:
                            int i30 = l0.A0;
                            g1Var.onPlaybackStateChanged(k1Var4.f61307e);
                            break;
                        default:
                            int i31 = l0.A0;
                            g1Var.onPlayWhenReadyChanged(k1Var4.f61314l, k1Var4.f61315m);
                            break;
                    }
                }
            });
        }
        if (z14 || z13) {
            final int i24 = 7;
            this.f61359m.queueEvent(-1, new io.bidmachine.media3.common.util.w() { // from class: io.bidmachine.media3.exoplayer.d0
                @Override // io.bidmachine.media3.common.util.w
                public final void invoke(Object obj8) {
                    int i212 = i24;
                    k1 k1Var4 = k1Var;
                    gn.g1 g1Var = (gn.g1) obj8;
                    switch (i212) {
                        case 0:
                            int i222 = l0.A0;
                            g1Var.onPlaybackSuppressionReasonChanged(k1Var4.f61316n);
                            break;
                        case 1:
                            int i232 = l0.A0;
                            g1Var.onIsPlayingChanged(k1Var4.isPlaying());
                            break;
                        case 2:
                            int i242 = l0.A0;
                            g1Var.onPlaybackParametersChanged(k1Var4.f61317o);
                            break;
                        case 3:
                            int i25 = l0.A0;
                            g1Var.onPlayerErrorChanged(k1Var4.f61308f);
                            break;
                        case 4:
                            int i26 = l0.A0;
                            g1Var.onPlayerError(k1Var4.f61308f);
                            break;
                        case 5:
                            int i27 = l0.A0;
                            g1Var.onTracksChanged(k1Var4.f61311i.f55928d);
                            break;
                        case 6:
                            int i28 = l0.A0;
                            g1Var.onLoadingChanged(k1Var4.f61309g);
                            g1Var.onIsLoadingChanged(k1Var4.f61309g);
                            break;
                        case 7:
                            int i29 = l0.A0;
                            g1Var.onPlayerStateChanged(k1Var4.f61314l, k1Var4.f61307e);
                            break;
                        case 8:
                            int i30 = l0.A0;
                            g1Var.onPlaybackStateChanged(k1Var4.f61307e);
                            break;
                        default:
                            int i31 = l0.A0;
                            g1Var.onPlayWhenReadyChanged(k1Var4.f61314l, k1Var4.f61315m);
                            break;
                    }
                }
            });
        }
        if (z14) {
            final int i25 = 8;
            this.f61359m.queueEvent(4, new io.bidmachine.media3.common.util.w() { // from class: io.bidmachine.media3.exoplayer.d0
                @Override // io.bidmachine.media3.common.util.w
                public final void invoke(Object obj8) {
                    int i212 = i25;
                    k1 k1Var4 = k1Var;
                    gn.g1 g1Var = (gn.g1) obj8;
                    switch (i212) {
                        case 0:
                            int i222 = l0.A0;
                            g1Var.onPlaybackSuppressionReasonChanged(k1Var4.f61316n);
                            break;
                        case 1:
                            int i232 = l0.A0;
                            g1Var.onIsPlayingChanged(k1Var4.isPlaying());
                            break;
                        case 2:
                            int i242 = l0.A0;
                            g1Var.onPlaybackParametersChanged(k1Var4.f61317o);
                            break;
                        case 3:
                            int i252 = l0.A0;
                            g1Var.onPlayerErrorChanged(k1Var4.f61308f);
                            break;
                        case 4:
                            int i26 = l0.A0;
                            g1Var.onPlayerError(k1Var4.f61308f);
                            break;
                        case 5:
                            int i27 = l0.A0;
                            g1Var.onTracksChanged(k1Var4.f61311i.f55928d);
                            break;
                        case 6:
                            int i28 = l0.A0;
                            g1Var.onLoadingChanged(k1Var4.f61309g);
                            g1Var.onIsLoadingChanged(k1Var4.f61309g);
                            break;
                        case 7:
                            int i29 = l0.A0;
                            g1Var.onPlayerStateChanged(k1Var4.f61314l, k1Var4.f61307e);
                            break;
                        case 8:
                            int i30 = l0.A0;
                            g1Var.onPlaybackStateChanged(k1Var4.f61307e);
                            break;
                        default:
                            int i31 = l0.A0;
                            g1Var.onPlayWhenReadyChanged(k1Var4.f61314l, k1Var4.f61315m);
                            break;
                    }
                }
            });
        }
        if (z13 || k1Var2.f61315m != k1Var.f61315m) {
            final int i26 = 9;
            this.f61359m.queueEvent(5, new io.bidmachine.media3.common.util.w() { // from class: io.bidmachine.media3.exoplayer.d0
                @Override // io.bidmachine.media3.common.util.w
                public final void invoke(Object obj8) {
                    int i212 = i26;
                    k1 k1Var4 = k1Var;
                    gn.g1 g1Var = (gn.g1) obj8;
                    switch (i212) {
                        case 0:
                            int i222 = l0.A0;
                            g1Var.onPlaybackSuppressionReasonChanged(k1Var4.f61316n);
                            break;
                        case 1:
                            int i232 = l0.A0;
                            g1Var.onIsPlayingChanged(k1Var4.isPlaying());
                            break;
                        case 2:
                            int i242 = l0.A0;
                            g1Var.onPlaybackParametersChanged(k1Var4.f61317o);
                            break;
                        case 3:
                            int i252 = l0.A0;
                            g1Var.onPlayerErrorChanged(k1Var4.f61308f);
                            break;
                        case 4:
                            int i262 = l0.A0;
                            g1Var.onPlayerError(k1Var4.f61308f);
                            break;
                        case 5:
                            int i27 = l0.A0;
                            g1Var.onTracksChanged(k1Var4.f61311i.f55928d);
                            break;
                        case 6:
                            int i28 = l0.A0;
                            g1Var.onLoadingChanged(k1Var4.f61309g);
                            g1Var.onIsLoadingChanged(k1Var4.f61309g);
                            break;
                        case 7:
                            int i29 = l0.A0;
                            g1Var.onPlayerStateChanged(k1Var4.f61314l, k1Var4.f61307e);
                            break;
                        case 8:
                            int i30 = l0.A0;
                            g1Var.onPlaybackStateChanged(k1Var4.f61307e);
                            break;
                        default:
                            int i31 = l0.A0;
                            g1Var.onPlayWhenReadyChanged(k1Var4.f61314l, k1Var4.f61315m);
                            break;
                    }
                }
            });
        }
        if (k1Var2.f61316n != k1Var.f61316n) {
            final int i27 = 0;
            this.f61359m.queueEvent(6, new io.bidmachine.media3.common.util.w() { // from class: io.bidmachine.media3.exoplayer.d0
                @Override // io.bidmachine.media3.common.util.w
                public final void invoke(Object obj8) {
                    int i212 = i27;
                    k1 k1Var4 = k1Var;
                    gn.g1 g1Var = (gn.g1) obj8;
                    switch (i212) {
                        case 0:
                            int i222 = l0.A0;
                            g1Var.onPlaybackSuppressionReasonChanged(k1Var4.f61316n);
                            break;
                        case 1:
                            int i232 = l0.A0;
                            g1Var.onIsPlayingChanged(k1Var4.isPlaying());
                            break;
                        case 2:
                            int i242 = l0.A0;
                            g1Var.onPlaybackParametersChanged(k1Var4.f61317o);
                            break;
                        case 3:
                            int i252 = l0.A0;
                            g1Var.onPlayerErrorChanged(k1Var4.f61308f);
                            break;
                        case 4:
                            int i262 = l0.A0;
                            g1Var.onPlayerError(k1Var4.f61308f);
                            break;
                        case 5:
                            int i272 = l0.A0;
                            g1Var.onTracksChanged(k1Var4.f61311i.f55928d);
                            break;
                        case 6:
                            int i28 = l0.A0;
                            g1Var.onLoadingChanged(k1Var4.f61309g);
                            g1Var.onIsLoadingChanged(k1Var4.f61309g);
                            break;
                        case 7:
                            int i29 = l0.A0;
                            g1Var.onPlayerStateChanged(k1Var4.f61314l, k1Var4.f61307e);
                            break;
                        case 8:
                            int i30 = l0.A0;
                            g1Var.onPlaybackStateChanged(k1Var4.f61307e);
                            break;
                        default:
                            int i31 = l0.A0;
                            g1Var.onPlayWhenReadyChanged(k1Var4.f61314l, k1Var4.f61315m);
                            break;
                    }
                }
            });
        }
        if (k1Var2.isPlaying() != k1Var.isPlaying()) {
            final int i28 = 1;
            this.f61359m.queueEvent(7, new io.bidmachine.media3.common.util.w() { // from class: io.bidmachine.media3.exoplayer.d0
                @Override // io.bidmachine.media3.common.util.w
                public final void invoke(Object obj8) {
                    int i212 = i28;
                    k1 k1Var4 = k1Var;
                    gn.g1 g1Var = (gn.g1) obj8;
                    switch (i212) {
                        case 0:
                            int i222 = l0.A0;
                            g1Var.onPlaybackSuppressionReasonChanged(k1Var4.f61316n);
                            break;
                        case 1:
                            int i232 = l0.A0;
                            g1Var.onIsPlayingChanged(k1Var4.isPlaying());
                            break;
                        case 2:
                            int i242 = l0.A0;
                            g1Var.onPlaybackParametersChanged(k1Var4.f61317o);
                            break;
                        case 3:
                            int i252 = l0.A0;
                            g1Var.onPlayerErrorChanged(k1Var4.f61308f);
                            break;
                        case 4:
                            int i262 = l0.A0;
                            g1Var.onPlayerError(k1Var4.f61308f);
                            break;
                        case 5:
                            int i272 = l0.A0;
                            g1Var.onTracksChanged(k1Var4.f61311i.f55928d);
                            break;
                        case 6:
                            int i282 = l0.A0;
                            g1Var.onLoadingChanged(k1Var4.f61309g);
                            g1Var.onIsLoadingChanged(k1Var4.f61309g);
                            break;
                        case 7:
                            int i29 = l0.A0;
                            g1Var.onPlayerStateChanged(k1Var4.f61314l, k1Var4.f61307e);
                            break;
                        case 8:
                            int i30 = l0.A0;
                            g1Var.onPlaybackStateChanged(k1Var4.f61307e);
                            break;
                        default:
                            int i31 = l0.A0;
                            g1Var.onPlayWhenReadyChanged(k1Var4.f61314l, k1Var4.f61315m);
                            break;
                    }
                }
            });
        }
        if (!k1Var2.f61317o.equals(k1Var.f61317o)) {
            final int i29 = 2;
            this.f61359m.queueEvent(12, new io.bidmachine.media3.common.util.w() { // from class: io.bidmachine.media3.exoplayer.d0
                @Override // io.bidmachine.media3.common.util.w
                public final void invoke(Object obj8) {
                    int i212 = i29;
                    k1 k1Var4 = k1Var;
                    gn.g1 g1Var = (gn.g1) obj8;
                    switch (i212) {
                        case 0:
                            int i222 = l0.A0;
                            g1Var.onPlaybackSuppressionReasonChanged(k1Var4.f61316n);
                            break;
                        case 1:
                            int i232 = l0.A0;
                            g1Var.onIsPlayingChanged(k1Var4.isPlaying());
                            break;
                        case 2:
                            int i242 = l0.A0;
                            g1Var.onPlaybackParametersChanged(k1Var4.f61317o);
                            break;
                        case 3:
                            int i252 = l0.A0;
                            g1Var.onPlayerErrorChanged(k1Var4.f61308f);
                            break;
                        case 4:
                            int i262 = l0.A0;
                            g1Var.onPlayerError(k1Var4.f61308f);
                            break;
                        case 5:
                            int i272 = l0.A0;
                            g1Var.onTracksChanged(k1Var4.f61311i.f55928d);
                            break;
                        case 6:
                            int i282 = l0.A0;
                            g1Var.onLoadingChanged(k1Var4.f61309g);
                            g1Var.onIsLoadingChanged(k1Var4.f61309g);
                            break;
                        case 7:
                            int i292 = l0.A0;
                            g1Var.onPlayerStateChanged(k1Var4.f61314l, k1Var4.f61307e);
                            break;
                        case 8:
                            int i30 = l0.A0;
                            g1Var.onPlaybackStateChanged(k1Var4.f61307e);
                            break;
                        default:
                            int i31 = l0.A0;
                            g1Var.onPlayWhenReadyChanged(k1Var4.f61314l, k1Var4.f61315m);
                            break;
                    }
                }
            });
        }
        z();
        this.f61359m.flushEvents();
        if (k1Var2.f61318p != k1Var.f61318p) {
            Iterator it = this.f61361n.iterator();
            while (it.hasNext()) {
                ((j0) ((b0) it.next())).onSleepingForOffloadChanged(k1Var.f61318p);
            }
        }
    }

    public final void C() {
        int playbackState = getPlaybackState();
        l2 l2Var = this.E;
        k2 k2Var = this.D;
        boolean z10 = false;
        if (playbackState != 1) {
            if (playbackState == 2 || playbackState == 3) {
                boolean zIsSleepingForOffload = isSleepingForOffload();
                if (getPlayWhenReady() && !zIsSleepingForOffload) {
                    z10 = true;
                }
                k2Var.setStayAwake(z10);
                l2Var.setStayAwake(getPlayWhenReady());
                return;
            }
            if (playbackState != 4) {
                throw new IllegalStateException();
            }
        }
        k2Var.setStayAwake(false);
        l2Var.setStayAwake(false);
    }

    public final void D() {
        this.f61341d.blockUninterruptible();
        if (Thread.currentThread() != getApplicationLooper().getThread()) {
            String invariant = io.bidmachine.media3.common.util.a1.formatInvariant("Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread", Thread.currentThread().getName(), getApplicationLooper().getThread().getName());
            if (this.f61364o0) {
                throw new IllegalStateException(invariant);
            }
            io.bidmachine.media3.common.util.b0.w("ExoPlayerImpl", invariant, this.f61366p0 ? null : new IllegalStateException());
            this.f61366p0 = true;
        }
    }

    @Override // io.bidmachine.media3.exoplayer.ExoPlayer
    public void addAnalyticsListener(on.d dVar) {
        this.f61371s.addListener((on.d) io.bidmachine.media3.common.util.a.checkNotNull(dVar));
    }

    @Override // io.bidmachine.media3.exoplayer.ExoPlayer
    public void addAudioOffloadListener(b0 b0Var) {
        this.f61361n.add(b0Var);
    }

    @Override // gn.j, gn.i1
    public void addListener(gn.g1 g1Var) {
        this.f61359m.add((gn.g1) io.bidmachine.media3.common.util.a.checkNotNull(g1Var));
    }

    @Override // gn.j, gn.i1
    public void addMediaItems(int i10, List<gn.p0> list) {
        D();
        addMediaSources(i10, h(list));
    }

    @Override // io.bidmachine.media3.exoplayer.ExoPlayer
    public void addMediaSource(ao.m0 m0Var) {
        D();
        addMediaSources(Collections.singletonList(m0Var));
    }

    @Override // io.bidmachine.media3.exoplayer.ExoPlayer
    public void addMediaSources(List<ao.m0> list) {
        D();
        addMediaSources(this.f61365p.size(), list);
    }

    @Override // gn.j
    public final void b(long j10, int i10, boolean z10) {
        D();
        if (i10 == -1) {
            return;
        }
        io.bidmachine.media3.common.util.a.checkArgument(i10 >= 0);
        gn.u1 u1Var = this.f61382x0.f61303a;
        if (u1Var.isEmpty() || i10 < u1Var.getWindowCount()) {
            this.f61371s.notifySeekStarted();
            this.K++;
            if (isPlayingAd()) {
                io.bidmachine.media3.common.util.b0.w("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                o0.c cVar = new o0.c(this.f61382x0);
                cVar.incrementPendingOperationAcks(1);
                this.f61355k.onPlaybackInfoUpdate(cVar);
                return;
            }
            k1 k1VarCopyWithPlaybackState = this.f61382x0;
            int i11 = k1VarCopyWithPlaybackState.f61307e;
            if (i11 == 3 || (i11 == 4 && !u1Var.isEmpty())) {
                k1VarCopyWithPlaybackState = this.f61382x0.copyWithPlaybackState(2);
            }
            int currentMediaItemIndex = getCurrentMediaItemIndex();
            k1 k1VarP = p(k1VarCopyWithPlaybackState, u1Var, q(u1Var, i10, j10));
            this.f61357l.seekTo(u1Var, i10, io.bidmachine.media3.common.util.a1.msToUs(j10));
            B(k1VarP, 0, true, 1, k(k1VarP), currentMediaItemIndex, z10);
        }
    }

    @Override // io.bidmachine.media3.exoplayer.ExoPlayer
    public void clearAuxEffectInfo() {
        D();
        setAuxEffectInfo(new gn.i(0, 0.0f));
    }

    @Override // io.bidmachine.media3.exoplayer.ExoPlayer
    public void clearCameraMotionListener(jo.a aVar) {
        D();
        if (this.f61362n0 != aVar) {
            return;
        }
        i(this.A).setType(8).setPayload(null).send();
    }

    @Override // io.bidmachine.media3.exoplayer.ExoPlayer
    public void clearVideoFrameMetadataListener(io.v vVar) {
        D();
        if (this.f61360m0 != vVar) {
            return;
        }
        i(this.A).setType(7).setPayload(null).send();
    }

    @Override // gn.j, gn.i1
    public void clearVideoSurface() {
        D();
        t();
        x(null);
        r(0, 0);
    }

    @Override // gn.j, gn.i1
    public void clearVideoSurfaceHolder(SurfaceHolder surfaceHolder) {
        D();
        if (surfaceHolder == null || surfaceHolder != this.Z) {
            return;
        }
        clearVideoSurface();
    }

    @Override // gn.j, gn.i1
    public void clearVideoSurfaceView(SurfaceView surfaceView) {
        D();
        clearVideoSurfaceHolder(surfaceView == null ? null : surfaceView.getHolder());
    }

    @Override // gn.j, gn.i1
    public void clearVideoTextureView(TextureView textureView) {
        D();
        if (textureView == null || textureView != this.f61340c0) {
            return;
        }
        clearVideoSurface();
    }

    @Override // io.bidmachine.media3.exoplayer.ExoPlayer
    public o1 createMessage(n1 n1Var) {
        D();
        return i(n1Var);
    }

    public final ArrayList d(int i10, List list) {
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < list.size(); i11++) {
            i1.c cVar = new i1.c((ao.m0) list.get(i11), this.f61367q);
            arrayList.add(cVar);
            a aVar = new a(cVar.f61271b, cVar.f61270a);
            this.f61365p.add(i11 + i10, aVar);
        }
        this.P = this.P.cloneAndInsert(i10, arrayList.size());
        return arrayList;
    }

    @Override // gn.j, gn.i1
    @Deprecated
    public void decreaseDeviceVolume() {
        D();
        StreamVolumeManager streamVolumeManager = this.C;
        if (streamVolumeManager != null) {
            streamVolumeManager.decreaseVolume(1);
        }
    }

    public final k1 e(k1 k1Var, int i10, List list) {
        gn.u1 u1Var = k1Var.f61303a;
        this.K++;
        ArrayList arrayListD = d(i10, list);
        q1 q1VarG = g();
        k1 k1VarP = p(k1Var, q1VarG, m(u1Var, q1VarG, l(k1Var), j(k1Var)));
        this.f61357l.addMediaSources(i10, arrayListD, this.P);
        return k1VarP;
    }

    public final gn.s0 f() {
        gn.u1 currentTimeline = getCurrentTimeline();
        if (currentTimeline.isEmpty()) {
            return this.f61380w0;
        }
        return this.f61380w0.buildUpon().populate(currentTimeline.getWindow(getCurrentMediaItemIndex(), this.f57954a).f58177c.f58055d).build();
    }

    public final q1 g() {
        return new q1(this.f61365p, this.P);
    }

    @Override // io.bidmachine.media3.exoplayer.ExoPlayer
    public on.a getAnalyticsCollector() {
        D();
        return this.f61371s;
    }

    @Override // gn.j, gn.i1
    public Looper getApplicationLooper() {
        return this.f61373t;
    }

    @Override // gn.j, gn.i1
    public gn.h getAudioAttributes() {
        D();
        return this.f61352i0;
    }

    @Override // io.bidmachine.media3.exoplayer.ExoPlayer
    public j getAudioDecoderCounters() {
        D();
        return this.f61350h0;
    }

    @Override // io.bidmachine.media3.exoplayer.ExoPlayer
    public io.bidmachine.media3.common.b getAudioFormat() {
        D();
        return this.W;
    }

    @Override // io.bidmachine.media3.exoplayer.ExoPlayer
    public int getAudioSessionId() {
        D();
        return ((Integer) this.H.get()).intValue();
    }

    @Override // gn.j, gn.i1
    public gn.e1 getAvailableCommands() {
        D();
        return this.S;
    }

    @Override // gn.j, gn.i1
    public long getBufferedPosition() {
        D();
        if (!isPlayingAd()) {
            return getContentBufferedPosition();
        }
        k1 k1Var = this.f61382x0;
        return k1Var.f61313k.equals(k1Var.f61304b) ? io.bidmachine.media3.common.util.a1.usToMs(this.f61382x0.f61319q) : getDuration();
    }

    @Override // io.bidmachine.media3.exoplayer.ExoPlayer
    public io.bidmachine.media3.common.util.g getClock() {
        return this.f61383y;
    }

    @Override // gn.j, gn.i1
    public long getContentBufferedPosition() {
        D();
        if (this.f61382x0.f61303a.isEmpty()) {
            return this.f61386z0;
        }
        k1 k1Var = this.f61382x0;
        if (k1Var.f61313k.f7721d != k1Var.f61304b.f7721d) {
            return k1Var.f61303a.getWindow(getCurrentMediaItemIndex(), this.f57954a).getDurationMs();
        }
        long j10 = k1Var.f61319q;
        if (this.f61382x0.f61313k.isAd()) {
            k1 k1Var2 = this.f61382x0;
            gn.r1 periodByUid = k1Var2.f61303a.getPeriodByUid(k1Var2.f61313k.f7718a, this.f61363o);
            long adGroupTimeUs = periodByUid.getAdGroupTimeUs(this.f61382x0.f61313k.f7719b);
            j10 = adGroupTimeUs == Long.MIN_VALUE ? periodByUid.f58111d : adGroupTimeUs;
        }
        k1 k1Var3 = this.f61382x0;
        gn.u1 u1Var = k1Var3.f61303a;
        Object obj = k1Var3.f61313k.f7718a;
        gn.r1 r1Var = this.f61363o;
        u1Var.getPeriodByUid(obj, r1Var);
        return io.bidmachine.media3.common.util.a1.usToMs(r1Var.getPositionInWindowUs() + j10);
    }

    @Override // gn.j, gn.i1
    public long getContentPosition() {
        D();
        return j(this.f61382x0);
    }

    @Override // gn.j, gn.i1
    public int getCurrentAdGroupIndex() {
        D();
        if (isPlayingAd()) {
            return this.f61382x0.f61304b.f7719b;
        }
        return -1;
    }

    @Override // gn.j, gn.i1
    public int getCurrentAdIndexInAdGroup() {
        D();
        if (isPlayingAd()) {
            return this.f61382x0.f61304b.f7720c;
        }
        return -1;
    }

    @Override // gn.j, gn.i1
    public in.d getCurrentCues() {
        D();
        return this.f61358l0;
    }

    @Override // gn.j, gn.i1
    public int getCurrentMediaItemIndex() {
        D();
        int iL = l(this.f61382x0);
        if (iL == -1) {
            return 0;
        }
        return iL;
    }

    @Override // gn.j, gn.i1
    public int getCurrentPeriodIndex() {
        D();
        if (this.f61382x0.f61303a.isEmpty()) {
            return 0;
        }
        k1 k1Var = this.f61382x0;
        return k1Var.f61303a.getIndexOfPeriod(k1Var.f61304b.f7718a);
    }

    @Override // gn.j, gn.i1
    public long getCurrentPosition() {
        D();
        return io.bidmachine.media3.common.util.a1.usToMs(k(this.f61382x0));
    }

    @Override // gn.j, gn.i1
    public gn.u1 getCurrentTimeline() {
        D();
        return this.f61382x0.f61303a;
    }

    @Override // io.bidmachine.media3.exoplayer.ExoPlayer
    public ao.b2 getCurrentTrackGroups() {
        D();
        return this.f61382x0.f61310h;
    }

    @Override // io.bidmachine.media3.exoplayer.ExoPlayer
    public fo.q getCurrentTrackSelections() {
        D();
        return new fo.q(this.f61382x0.f61311i.f55927c);
    }

    @Override // gn.j, gn.i1
    public gn.b2 getCurrentTracks() {
        D();
        return this.f61382x0.f61311i.f55928d;
    }

    @Override // gn.j, gn.i1
    public gn.q getDeviceInfo() {
        D();
        return this.f61376u0;
    }

    @Override // gn.j, gn.i1
    public int getDeviceVolume() {
        D();
        StreamVolumeManager streamVolumeManager = this.C;
        if (streamVolumeManager != null) {
            return streamVolumeManager.getVolume();
        }
        return 0;
    }

    @Override // gn.j, gn.i1
    public long getDuration() {
        D();
        if (!isPlayingAd()) {
            return getContentDuration();
        }
        k1 k1Var = this.f61382x0;
        ao.k0 k0Var = k1Var.f61304b;
        gn.u1 u1Var = k1Var.f61303a;
        Object obj = k0Var.f7718a;
        gn.r1 r1Var = this.f61363o;
        u1Var.getPeriodByUid(obj, r1Var);
        return io.bidmachine.media3.common.util.a1.usToMs(r1Var.getAdDurationUs(k0Var.f7719b, k0Var.f7720c));
    }

    @Override // gn.j, gn.i1
    public long getMaxSeekToPreviousPosition() {
        D();
        return this.f61381x;
    }

    @Override // gn.j, gn.i1
    public gn.s0 getMediaMetadata() {
        D();
        return this.T;
    }

    @Override // io.bidmachine.media3.exoplayer.ExoPlayer
    public boolean getPauseAtEndOfMediaItems() {
        D();
        return this.R;
    }

    @Override // gn.j, gn.i1
    public boolean getPlayWhenReady() {
        D();
        return this.f61382x0.f61314l;
    }

    @Override // io.bidmachine.media3.exoplayer.ExoPlayer
    public Looper getPlaybackLooper() {
        return this.f61357l.getPlaybackLooper();
    }

    @Override // gn.j, gn.i1
    public gn.c1 getPlaybackParameters() {
        D();
        return this.f61382x0.f61317o;
    }

    @Override // gn.j, gn.i1
    public int getPlaybackState() {
        D();
        return this.f61382x0.f61307e;
    }

    @Override // gn.j, gn.i1
    public int getPlaybackSuppressionReason() {
        D();
        return this.f61382x0.f61316n;
    }

    @Override // gn.j, gn.i1
    public gn.s0 getPlaylistMetadata() {
        D();
        return this.U;
    }

    @Override // io.bidmachine.media3.exoplayer.ExoPlayer
    public ExoPlayer.b getPreloadConfiguration() {
        return this.Q;
    }

    @Override // io.bidmachine.media3.exoplayer.ExoPlayer
    public s1 getRenderer(int i10) {
        D();
        return this.f61347g[i10];
    }

    @Override // io.bidmachine.media3.exoplayer.ExoPlayer
    public int getRendererCount() {
        D();
        return this.f61347g.length;
    }

    @Override // io.bidmachine.media3.exoplayer.ExoPlayer
    public int getRendererType(int i10) {
        D();
        return this.f61347g[i10].getTrackType();
    }

    @Override // gn.j, gn.i1
    public int getRepeatMode() {
        D();
        return this.I;
    }

    @Override // io.bidmachine.media3.exoplayer.ExoPlayer
    public s1 getSecondaryRenderer(int i10) {
        D();
        return this.f61349h[i10];
    }

    @Override // gn.j, gn.i1
    public long getSeekBackIncrement() {
        D();
        return this.f61377v;
    }

    @Override // gn.j, gn.i1
    public long getSeekForwardIncrement() {
        D();
        return this.f61379w;
    }

    @Override // io.bidmachine.media3.exoplayer.ExoPlayer
    public y1 getSeekParameters() {
        D();
        return this.O;
    }

    @Override // gn.j, gn.i1
    public boolean getShuffleModeEnabled() {
        D();
        return this.J;
    }

    @Override // io.bidmachine.media3.exoplayer.ExoPlayer
    public boolean getSkipSilenceEnabled() {
        D();
        return this.f61356k0;
    }

    @Override // gn.j, gn.i1
    public io.bidmachine.media3.common.util.p0 getSurfaceSize() {
        D();
        return this.f61346f0;
    }

    @Override // gn.j, gn.i1
    public long getTotalBufferedDuration() {
        D();
        return io.bidmachine.media3.common.util.a1.usToMs(this.f61382x0.f61320r);
    }

    @Override // gn.j, gn.i1
    public gn.a2 getTrackSelectionParameters() {
        D();
        return this.f61351i.getParameters();
    }

    @Override // io.bidmachine.media3.exoplayer.ExoPlayer
    public fo.u getTrackSelector() {
        D();
        return this.f61351i;
    }

    @Override // io.bidmachine.media3.exoplayer.ExoPlayer
    public int getVideoChangeFrameRateStrategy() {
        D();
        return this.f61344e0;
    }

    @Override // io.bidmachine.media3.exoplayer.ExoPlayer
    public j getVideoDecoderCounters() {
        D();
        return this.f61348g0;
    }

    @Override // io.bidmachine.media3.exoplayer.ExoPlayer
    public io.bidmachine.media3.common.b getVideoFormat() {
        D();
        return this.V;
    }

    @Override // io.bidmachine.media3.exoplayer.ExoPlayer
    public int getVideoScalingMode() {
        D();
        return this.f61342d0;
    }

    @Override // gn.j, gn.i1
    public gn.k2 getVideoSize() {
        D();
        return this.f61378v0;
    }

    @Override // gn.j, gn.i1
    public float getVolume() {
        D();
        return this.f61354j0;
    }

    public final ArrayList h(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            arrayList.add(this.f61369r.createMediaSource((gn.p0) list.get(i10)));
        }
        return arrayList;
    }

    public final o1 i(n1 n1Var) {
        int iL = l(this.f61382x0);
        gn.u1 u1Var = this.f61382x0.f61303a;
        if (iL == -1) {
            iL = 0;
        }
        io.bidmachine.media3.common.util.g gVar = this.f61383y;
        o0 o0Var = this.f61357l;
        return new o1(o0Var, n1Var, u1Var, iL, gVar, o0Var.getPlaybackLooper());
    }

    @Override // gn.j, gn.i1
    @Deprecated
    public void increaseDeviceVolume() {
        D();
        StreamVolumeManager streamVolumeManager = this.C;
        if (streamVolumeManager != null) {
            streamVolumeManager.increaseVolume(1);
        }
    }

    @Override // gn.j, gn.i1
    public boolean isDeviceMuted() {
        D();
        StreamVolumeManager streamVolumeManager = this.C;
        if (streamVolumeManager != null) {
            return streamVolumeManager.isMuted();
        }
        return false;
    }

    @Override // gn.j, gn.i1
    public boolean isLoading() {
        D();
        return this.f61382x0.f61309g;
    }

    @Override // gn.j, gn.i1
    public boolean isPlayingAd() {
        D();
        return this.f61382x0.f61304b.isAd();
    }

    @Override // io.bidmachine.media3.exoplayer.ExoPlayer
    public boolean isReleased() {
        D();
        return this.f61374t0;
    }

    @Override // io.bidmachine.media3.exoplayer.ExoPlayer
    public boolean isSleepingForOffload() {
        D();
        return this.f61382x0.f61318p;
    }

    @Override // io.bidmachine.media3.exoplayer.ExoPlayer
    public boolean isTunnelingEnabled() {
        D();
        for (v1 v1Var : this.f61382x0.f61311i.f55926b) {
            if (v1Var != null && v1Var.f61578b) {
                return true;
            }
        }
        return false;
    }

    public final long j(k1 k1Var) {
        ao.k0 k0Var = k1Var.f61304b;
        long j10 = k1Var.f61305c;
        gn.u1 u1Var = k1Var.f61303a;
        if (!k0Var.isAd()) {
            return io.bidmachine.media3.common.util.a1.usToMs(k(k1Var));
        }
        Object obj = k1Var.f61304b.f7718a;
        gn.r1 r1Var = this.f61363o;
        u1Var.getPeriodByUid(obj, r1Var);
        if (j10 == C.TIME_UNSET) {
            return u1Var.getWindow(l(k1Var), this.f57954a).getDefaultPositionMs();
        }
        return io.bidmachine.media3.common.util.a1.usToMs(j10) + r1Var.getPositionInWindowMs();
    }

    public final long k(k1 k1Var) {
        if (k1Var.f61303a.isEmpty()) {
            return io.bidmachine.media3.common.util.a1.msToUs(this.f61386z0);
        }
        long estimatedPositionUs = k1Var.f61318p ? k1Var.getEstimatedPositionUs() : k1Var.f61321s;
        if (k1Var.f61304b.isAd()) {
            return estimatedPositionUs;
        }
        gn.u1 u1Var = k1Var.f61303a;
        Object obj = k1Var.f61304b.f7718a;
        gn.r1 r1Var = this.f61363o;
        u1Var.getPeriodByUid(obj, r1Var);
        return r1Var.getPositionInWindowUs() + estimatedPositionUs;
    }

    public final int l(k1 k1Var) {
        return k1Var.f61303a.isEmpty() ? this.f61384y0 : k1Var.f61303a.getPeriodByUid(k1Var.f61304b.f7718a, this.f61363o).f58110c;
    }

    public final Pair m(gn.u1 u1Var, q1 q1Var, int i10, long j10) {
        boolean zIsEmpty = u1Var.isEmpty();
        long j11 = C.TIME_UNSET;
        if (zIsEmpty || q1Var.isEmpty()) {
            boolean z10 = !u1Var.isEmpty() && q1Var.isEmpty();
            int i11 = z10 ? -1 : i10;
            if (!z10) {
                j11 = j10;
            }
            return q(q1Var, i11, j11);
        }
        Pair<Object, Long> periodPositionUs = u1Var.getPeriodPositionUs(this.f57954a, this.f61363o, i10, io.bidmachine.media3.common.util.a1.msToUs(j10));
        Object obj = ((Pair) io.bidmachine.media3.common.util.a1.castNonNull(periodPositionUs)).first;
        if (q1Var.getIndexOfPeriod(obj) != -1) {
            return periodPositionUs;
        }
        int iP = o0.P(this.f57954a, this.f61363o, this.I, this.J, obj, u1Var, q1Var);
        return iP != -1 ? q(q1Var, iP, q1Var.getWindow(iP, this.f57954a).getDefaultPositionMs()) : q(q1Var, -1, C.TIME_UNSET);
    }

    @Override // gn.j, gn.i1
    public void moveMediaItems(int i10, int i11, int i12) {
        D();
        io.bidmachine.media3.common.util.a.checkArgument(i10 >= 0 && i10 <= i11 && i12 >= 0);
        ArrayList arrayList = this.f61365p;
        int size = arrayList.size();
        int iMin = Math.min(i11, size);
        int iMin2 = Math.min(i12, size - (iMin - i10));
        if (i10 >= size || i10 == iMin || i10 == iMin2) {
            return;
        }
        gn.u1 currentTimeline = getCurrentTimeline();
        this.K++;
        io.bidmachine.media3.common.util.a1.moveItems(arrayList, i10, iMin, iMin2);
        q1 q1VarG = g();
        k1 k1Var = this.f61382x0;
        k1 k1VarP = p(k1Var, q1VarG, m(currentTimeline, q1VarG, l(k1Var), j(this.f61382x0)));
        this.f61357l.moveMediaSources(i10, iMin, iMin2, this.P);
        B(k1VarP, 0, false, 5, C.TIME_UNSET, -1, false);
    }

    public final k1 p(k1 k1Var, gn.u1 u1Var, Pair pair) {
        io.bidmachine.media3.common.util.a.checkArgument(u1Var.isEmpty() || pair != null);
        gn.u1 u1Var2 = k1Var.f61303a;
        long j10 = j(k1Var);
        k1 k1VarCopyWithTimeline = k1Var.copyWithTimeline(u1Var);
        if (u1Var.isEmpty()) {
            ao.k0 dummyPeriodForEmptyTimeline = k1.getDummyPeriodForEmptyTimeline();
            long jMsToUs = io.bidmachine.media3.common.util.a1.msToUs(this.f61386z0);
            k1 k1VarCopyWithLoadingMediaPeriodId = k1VarCopyWithTimeline.copyWithNewPosition(dummyPeriodForEmptyTimeline, jMsToUs, jMsToUs, jMsToUs, 0L, ao.b2.f7550d, this.f61337b, b5.of()).copyWithLoadingMediaPeriodId(dummyPeriodForEmptyTimeline);
            k1VarCopyWithLoadingMediaPeriodId.f61319q = k1VarCopyWithLoadingMediaPeriodId.f61321s;
            return k1VarCopyWithLoadingMediaPeriodId;
        }
        Object obj = k1VarCopyWithTimeline.f61304b.f7718a;
        boolean zEquals = obj.equals(((Pair) io.bidmachine.media3.common.util.a1.castNonNull(pair)).first);
        ao.k0 k0Var = !zEquals ? new ao.k0(pair.first) : k1VarCopyWithTimeline.f61304b;
        long jLongValue = ((Long) pair.second).longValue();
        long jMsToUs2 = io.bidmachine.media3.common.util.a1.msToUs(j10);
        if (!u1Var2.isEmpty()) {
            jMsToUs2 -= u1Var2.getPeriodByUid(obj, this.f61363o).getPositionInWindowUs();
        }
        if (!zEquals || jLongValue < jMsToUs2) {
            ao.k0 k0Var2 = k0Var;
            io.bidmachine.media3.common.util.a.checkState(!k0Var2.isAd());
            k1 k1VarCopyWithLoadingMediaPeriodId2 = k1VarCopyWithTimeline.copyWithNewPosition(k0Var2, jLongValue, jLongValue, jLongValue, 0L, !zEquals ? ao.b2.f7550d : k1VarCopyWithTimeline.f61310h, !zEquals ? this.f61337b : k1VarCopyWithTimeline.f61311i, !zEquals ? b5.of() : k1VarCopyWithTimeline.f61312j).copyWithLoadingMediaPeriodId(k0Var2);
            k1VarCopyWithLoadingMediaPeriodId2.f61319q = jLongValue;
            return k1VarCopyWithLoadingMediaPeriodId2;
        }
        if (jLongValue != jMsToUs2) {
            ao.k0 k0Var3 = k0Var;
            io.bidmachine.media3.common.util.a.checkState(!k0Var3.isAd());
            long jMax = Math.max(0L, k1VarCopyWithTimeline.f61320r - (jLongValue - jMsToUs2));
            long j11 = k1VarCopyWithTimeline.f61319q;
            if (k1VarCopyWithTimeline.f61313k.equals(k1VarCopyWithTimeline.f61304b)) {
                j11 = jLongValue + jMax;
            }
            k1 k1VarCopyWithNewPosition = k1VarCopyWithTimeline.copyWithNewPosition(k0Var3, jLongValue, jLongValue, jLongValue, jMax, k1VarCopyWithTimeline.f61310h, k1VarCopyWithTimeline.f61311i, k1VarCopyWithTimeline.f61312j);
            k1VarCopyWithNewPosition.f61319q = j11;
            return k1VarCopyWithNewPosition;
        }
        int indexOfPeriod = u1Var.getIndexOfPeriod(k1VarCopyWithTimeline.f61313k.f7718a);
        if (indexOfPeriod != -1 && u1Var.getPeriod(indexOfPeriod, this.f61363o).f58110c == u1Var.getPeriodByUid(k0Var.f7718a, this.f61363o).f58110c) {
            return k1VarCopyWithTimeline;
        }
        u1Var.getPeriodByUid(k0Var.f7718a, this.f61363o);
        long adDurationUs = k0Var.isAd() ? this.f61363o.getAdDurationUs(k0Var.f7719b, k0Var.f7720c) : this.f61363o.f58111d;
        ao.k0 k0Var4 = k0Var;
        k1 k1VarCopyWithLoadingMediaPeriodId3 = k1VarCopyWithTimeline.copyWithNewPosition(k0Var4, k1VarCopyWithTimeline.f61321s, k1VarCopyWithTimeline.f61321s, k1VarCopyWithTimeline.f61306d, adDurationUs - k1VarCopyWithTimeline.f61321s, k1VarCopyWithTimeline.f61310h, k1VarCopyWithTimeline.f61311i, k1VarCopyWithTimeline.f61312j).copyWithLoadingMediaPeriodId(k0Var4);
        k1VarCopyWithLoadingMediaPeriodId3.f61319q = adDurationUs;
        return k1VarCopyWithLoadingMediaPeriodId3;
    }

    @Override // gn.j, gn.i1
    public void prepare() {
        D();
        k1 k1Var = this.f61382x0;
        if (k1Var.f61307e != 1) {
            return;
        }
        k1 k1VarCopyWithPlaybackError = k1Var.copyWithPlaybackError(null);
        k1 k1VarO = o(k1VarCopyWithPlaybackError, k1VarCopyWithPlaybackError.f61303a.isEmpty() ? 4 : 2);
        this.K++;
        this.f61357l.prepare();
        B(k1VarO, 1, false, 5, C.TIME_UNSET, -1, false);
    }

    public final Pair q(gn.u1 u1Var, int i10, long j10) {
        if (u1Var.isEmpty()) {
            this.f61384y0 = i10;
            if (j10 == C.TIME_UNSET) {
                j10 = 0;
            }
            this.f61386z0 = j10;
            return null;
        }
        if (i10 == -1 || i10 >= u1Var.getWindowCount()) {
            i10 = u1Var.getFirstWindowIndex(this.J);
            j10 = u1Var.getWindow(i10, this.f57954a).getDefaultPositionMs();
        }
        int i11 = i10;
        return u1Var.getPeriodPositionUs(this.f57954a, this.f61363o, i11, io.bidmachine.media3.common.util.a1.msToUs(j10));
    }

    public final void r(int i10, int i11) {
        if (i10 == this.f61346f0.getWidth() && i11 == this.f61346f0.getHeight()) {
            return;
        }
        this.f61346f0 = new io.bidmachine.media3.common.util.p0(i10, i11);
        this.f61359m.sendEvent(24, new com.google.android.exoplayer2.k0(i10, i11, 1));
        u(2, 14, new io.bidmachine.media3.common.util.p0(i10, i11));
    }

    @Override // gn.j, gn.i1
    public void release() {
        io.bidmachine.media3.common.util.b0.i("ExoPlayerImpl", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.7.1] [" + io.bidmachine.media3.common.util.a1.f60680b + "] [" + gn.q0.registeredModules() + C3191e4.i.f36531e);
        D();
        this.B.setEnabled(false);
        StreamVolumeManager streamVolumeManager = this.C;
        if (streamVolumeManager != null) {
            streamVolumeManager.release();
        }
        this.D.setStayAwake(false);
        this.E.setStayAwake(false);
        i2 i2Var = this.G;
        if (i2Var != null) {
            i2Var.disable();
        }
        if (!this.f61357l.release()) {
            this.f61359m.sendEvent(10, new hv.t(22));
        }
        this.f61359m.release();
        this.f61353j.removeCallbacksAndMessages(null);
        ((go.o) this.f61375u).removeEventListener(this.f61371s);
        k1 k1Var = this.f61382x0;
        if (k1Var.f61318p) {
            this.f61382x0 = k1Var.copyWithEstimatedPosition();
        }
        k1 k1VarO = o(this.f61382x0, 1);
        this.f61382x0 = k1VarO;
        k1 k1VarCopyWithLoadingMediaPeriodId = k1VarO.copyWithLoadingMediaPeriodId(k1VarO.f61304b);
        this.f61382x0 = k1VarCopyWithLoadingMediaPeriodId;
        k1VarCopyWithLoadingMediaPeriodId.f61319q = k1VarCopyWithLoadingMediaPeriodId.f61321s;
        this.f61382x0.f61320r = 0L;
        this.f61371s.release();
        t();
        Surface surface = this.Y;
        if (surface != null) {
            surface.release();
            this.Y = null;
        }
        if (this.f61372s0) {
            ((gn.l1) io.bidmachine.media3.common.util.a.checkNotNull(this.f61370r0)).remove(this.f61368q0);
            this.f61372s0 = false;
        }
        this.f61358l0 = in.d.f59796c;
        this.f61374t0 = true;
    }

    @Override // io.bidmachine.media3.exoplayer.ExoPlayer
    public void removeAnalyticsListener(on.d dVar) {
        D();
        this.f61371s.removeListener((on.d) io.bidmachine.media3.common.util.a.checkNotNull(dVar));
    }

    @Override // io.bidmachine.media3.exoplayer.ExoPlayer
    public void removeAudioOffloadListener(b0 b0Var) {
        D();
        this.f61361n.remove(b0Var);
    }

    @Override // gn.j, gn.i1
    public void removeListener(gn.g1 g1Var) {
        D();
        this.f61359m.remove((gn.g1) io.bidmachine.media3.common.util.a.checkNotNull(g1Var));
    }

    @Override // gn.j, gn.i1
    public void removeMediaItems(int i10, int i11) {
        D();
        io.bidmachine.media3.common.util.a.checkArgument(i10 >= 0 && i11 >= i10);
        int size = this.f61365p.size();
        int iMin = Math.min(i11, size);
        if (i10 >= size || i10 == iMin) {
            return;
        }
        k1 k1VarS = s(this.f61382x0, i10, iMin);
        B(k1VarS, 0, !k1VarS.f61304b.f7718a.equals(this.f61382x0.f61304b.f7718a), 4, k(k1VarS), -1, false);
    }

    @Override // gn.j, gn.i1
    public void replaceMediaItems(int i10, int i11, List<gn.p0> list) {
        D();
        io.bidmachine.media3.common.util.a.checkArgument(i10 >= 0 && i11 >= i10);
        ArrayList arrayList = this.f61365p;
        int size = arrayList.size();
        if (i10 > size) {
            return;
        }
        int iMin = Math.min(i11, size);
        if (iMin - i10 == list.size()) {
            for (int i12 = i10; i12 < iMin; i12++) {
                if (((a) arrayList.get(i12)).f61388b.canUpdateMediaItem(list.get(i12 - i10))) {
                }
            }
            this.K++;
            this.f61357l.updateMediaSourcesWithMediaItems(i10, iMin, list);
            for (int i13 = i10; i13 < iMin; i13++) {
                a aVar = (a) arrayList.get(i13);
                aVar.updateTimeline(new ao.a2(aVar.getTimeline(), list.get(i13 - i10)));
            }
            B(this.f61382x0.copyWithTimeline(g()), 0, false, 4, C.TIME_UNSET, -1, false);
            return;
        }
        ArrayList arrayListH = h(list);
        if (arrayList.isEmpty()) {
            setMediaSources(arrayListH, this.f61384y0 == -1);
        } else {
            k1 k1VarS = s(e(this.f61382x0, iMin, arrayListH), i10, iMin);
            B(k1VarS, 0, !k1VarS.f61304b.f7718a.equals(this.f61382x0.f61304b.f7718a), 4, k(k1VarS), -1, false);
        }
    }

    public final k1 s(k1 k1Var, int i10, int i11) {
        int iL = l(k1Var);
        long j10 = j(k1Var);
        gn.u1 u1Var = k1Var.f61303a;
        ArrayList arrayList = this.f61365p;
        int size = arrayList.size();
        this.K++;
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            arrayList.remove(i12);
        }
        this.P = this.P.cloneAndRemove(i10, i11);
        q1 q1VarG = g();
        k1 k1VarP = p(k1Var, q1VarG, m(u1Var, q1VarG, iL, j10));
        int i13 = k1VarP.f61307e;
        if (i13 != 1 && i13 != 4 && i10 < i11 && i11 == size && iL >= k1VarP.f61303a.getWindowCount()) {
            k1VarP = o(k1VarP, 4);
        }
        this.f61357l.removeMediaSources(i10, i11, this.P);
        return k1VarP;
    }

    @Override // gn.j, gn.i1
    public void setAudioAttributes(gn.h hVar, boolean z10) {
        D();
        if (this.f61374t0) {
            return;
        }
        boolean zEquals = Objects.equals(this.f61352i0, hVar);
        io.bidmachine.media3.common.util.y yVar = this.f61359m;
        if (!zEquals) {
            this.f61352i0 = hVar;
            u(1, 3, hVar);
            StreamVolumeManager streamVolumeManager = this.C;
            if (streamVolumeManager != null) {
                streamVolumeManager.setStreamType(hVar.getStreamType());
            }
            yVar.queueEvent(20, new f0(hVar, 2));
        }
        this.f61357l.setAudioAttributes(this.f61352i0, z10);
        yVar.flushEvents();
    }

    @Override // io.bidmachine.media3.exoplayer.ExoPlayer
    public void setAudioSessionId(int i10) {
        D();
        io.bidmachine.media3.common.util.e eVar = this.H;
        if (((Integer) eVar.get()).intValue() == i10) {
            return;
        }
        eVar.updateStateAsync(new g0(i10, 0), new b2(this, i10, 3));
    }

    @Override // io.bidmachine.media3.exoplayer.ExoPlayer
    public void setAuxEffectInfo(gn.i iVar) {
        D();
        u(1, 6, iVar);
    }

    @Override // io.bidmachine.media3.exoplayer.ExoPlayer
    public void setCameraMotionListener(jo.a aVar) {
        D();
        this.f61362n0 = aVar;
        i(this.A).setType(8).setPayload(aVar).send();
    }

    @Override // gn.j, gn.i1
    @Deprecated
    public void setDeviceMuted(boolean z10) {
        D();
        StreamVolumeManager streamVolumeManager = this.C;
        if (streamVolumeManager != null) {
            streamVolumeManager.setMuted(z10, 1);
        }
    }

    @Override // gn.j, gn.i1
    @Deprecated
    public void setDeviceVolume(int i10) {
        D();
        StreamVolumeManager streamVolumeManager = this.C;
        if (streamVolumeManager != null) {
            streamVolumeManager.setVolume(i10, 1);
        }
    }

    @Override // io.bidmachine.media3.exoplayer.ExoPlayer
    public void setForegroundMode(boolean z10) {
        D();
        if (this.N != z10) {
            this.N = z10;
            if (this.f61357l.setForegroundMode(z10)) {
                return;
            }
            y(a0.createForUnexpected(new q0(2), IronSourceError.AUCTION_ERROR_DECRYPTION));
        }
    }

    @Override // io.bidmachine.media3.exoplayer.ExoPlayer
    public void setHandleAudioBecomingNoisy(boolean z10) {
        D();
        if (this.f61374t0) {
            return;
        }
        this.B.setEnabled(z10);
    }

    @Override // io.bidmachine.media3.exoplayer.ExoPlayer
    public void setImageOutput(ImageOutput imageOutput) {
        D();
        u(4, 15, imageOutput);
    }

    @Override // gn.j, gn.i1
    public void setMediaItems(List<gn.p0> list, boolean z10) {
        D();
        setMediaSources(h(list), z10);
    }

    @Override // io.bidmachine.media3.exoplayer.ExoPlayer
    public void setMediaSource(ao.m0 m0Var) {
        D();
        setMediaSources(Collections.singletonList(m0Var));
    }

    @Override // io.bidmachine.media3.exoplayer.ExoPlayer
    public void setMediaSources(List<ao.m0> list) {
        D();
        setMediaSources(list, true);
    }

    @Override // io.bidmachine.media3.exoplayer.ExoPlayer
    public void setPauseAtEndOfMediaItems(boolean z10) {
        D();
        if (this.R == z10) {
            return;
        }
        this.R = z10;
        this.f61357l.setPauseAtEndOfWindow(z10);
    }

    @Override // gn.j, gn.i1
    public void setPlayWhenReady(boolean z10) {
        D();
        A(1, z10);
    }

    @Override // gn.j, gn.i1
    public void setPlaybackParameters(gn.c1 c1Var) {
        D();
        if (c1Var == null) {
            c1Var = gn.c1.f57844d;
        }
        if (this.f61382x0.f61317o.equals(c1Var)) {
            return;
        }
        k1 k1VarCopyWithPlaybackParameters = this.f61382x0.copyWithPlaybackParameters(c1Var);
        this.K++;
        this.f61357l.setPlaybackParameters(c1Var);
        B(k1VarCopyWithPlaybackParameters, 0, false, 5, C.TIME_UNSET, -1, false);
    }

    @Override // gn.j, gn.i1
    public void setPlaylistMetadata(gn.s0 s0Var) {
        D();
        io.bidmachine.media3.common.util.a.checkNotNull(s0Var);
        if (s0Var.equals(this.U)) {
            return;
        }
        this.U = s0Var;
        this.f61359m.sendEvent(15, new h0(this, 4));
    }

    @Override // io.bidmachine.media3.exoplayer.ExoPlayer
    public void setPreferredAudioDevice(AudioDeviceInfo audioDeviceInfo) {
        D();
        u(1, 12, audioDeviceInfo);
    }

    @Override // io.bidmachine.media3.exoplayer.ExoPlayer
    public void setPreloadConfiguration(ExoPlayer.b bVar) {
        D();
        if (this.Q.equals(bVar)) {
            return;
        }
        this.Q = bVar;
        this.f61357l.setPreloadConfiguration(bVar);
    }

    @Override // io.bidmachine.media3.exoplayer.ExoPlayer
    public void setPriority(int i10) {
        D();
        if (this.f61368q0 == i10) {
            return;
        }
        if (this.f61372s0) {
            gn.l1 l1Var = (gn.l1) io.bidmachine.media3.common.util.a.checkNotNull(this.f61370r0);
            l1Var.add(i10);
            l1Var.remove(this.f61368q0);
        }
        this.f61368q0 = i10;
        u(-1, 16, Integer.valueOf(i10));
    }

    @Override // io.bidmachine.media3.exoplayer.ExoPlayer
    public void setPriorityTaskManager(gn.l1 l1Var) {
        D();
        if (Objects.equals(this.f61370r0, l1Var)) {
            return;
        }
        if (this.f61372s0) {
            ((gn.l1) io.bidmachine.media3.common.util.a.checkNotNull(this.f61370r0)).remove(this.f61368q0);
        }
        if (l1Var == null || !isLoading()) {
            this.f61372s0 = false;
        } else {
            l1Var.add(this.f61368q0);
            this.f61372s0 = true;
        }
        this.f61370r0 = l1Var;
    }

    @Override // gn.j, gn.i1
    public void setRepeatMode(int i10) {
        D();
        if (this.I != i10) {
            this.I = i10;
            this.f61357l.setRepeatMode(i10);
            com.google.android.exoplayer2.j0 j0Var = new com.google.android.exoplayer2.j0(i10, 3);
            io.bidmachine.media3.common.util.y yVar = this.f61359m;
            yVar.queueEvent(8, j0Var);
            z();
            yVar.flushEvents();
        }
    }

    @Override // io.bidmachine.media3.exoplayer.ExoPlayer
    public void setSeekParameters(y1 y1Var) {
        D();
        if (y1Var == null) {
            y1Var = y1.f61604c;
        }
        if (this.O.equals(y1Var)) {
            return;
        }
        this.O = y1Var;
        this.f61357l.setSeekParameters(y1Var);
    }

    @Override // gn.j, gn.i1
    public void setShuffleModeEnabled(boolean z10) {
        D();
        if (this.J != z10) {
            this.J = z10;
            this.f61357l.setShuffleModeEnabled(z10);
            com.google.android.exoplayer2.g0 g0Var = new com.google.android.exoplayer2.g0(z10, 4);
            io.bidmachine.media3.common.util.y yVar = this.f61359m;
            yVar.queueEvent(9, g0Var);
            z();
            yVar.flushEvents();
        }
    }

    @Override // io.bidmachine.media3.exoplayer.ExoPlayer
    public void setShuffleOrder(ao.s1 s1Var) {
        D();
        io.bidmachine.media3.common.util.a.checkArgument(s1Var.getLength() == this.f61365p.size());
        this.P = s1Var;
        q1 q1VarG = g();
        k1 k1VarP = p(this.f61382x0, q1VarG, q(q1VarG, getCurrentMediaItemIndex(), getCurrentPosition()));
        this.K++;
        this.f61357l.setShuffleOrder(s1Var);
        B(k1VarP, 0, false, 5, C.TIME_UNSET, -1, false);
    }

    @Override // io.bidmachine.media3.exoplayer.ExoPlayer
    public void setSkipSilenceEnabled(boolean z10) {
        D();
        if (this.f61356k0 == z10) {
            return;
        }
        this.f61356k0 = z10;
        u(1, 9, Boolean.valueOf(z10));
        this.f61359m.sendEvent(23, new com.google.android.exoplayer2.g0(z10, 5));
    }

    @Override // gn.j, gn.i1
    public void setTrackSelectionParameters(gn.a2 a2Var) {
        D();
        fo.u uVar = this.f61351i;
        if (!uVar.isSetParametersSupported() || a2Var.equals(uVar.getParameters())) {
            return;
        }
        uVar.setParameters(a2Var);
        this.f61359m.sendEvent(19, new f0(a2Var, 1));
    }

    @Override // io.bidmachine.media3.exoplayer.ExoPlayer
    public void setVideoChangeFrameRateStrategy(int i10) {
        D();
        if (this.f61344e0 == i10) {
            return;
        }
        this.f61344e0 = i10;
        u(2, 5, Integer.valueOf(i10));
    }

    @Override // io.bidmachine.media3.exoplayer.ExoPlayer
    public void setVideoEffects(List<Object> list) throws NoSuchMethodException, SecurityException {
        D();
        try {
            Class.forName("io.bidmachine.media3.effect.PreviewingSingleInputVideoGraph$Factory").getConstructor(gn.g2.class);
            u(2, 13, list);
        } catch (ClassNotFoundException | NoSuchMethodException e10) {
            throw new IllegalStateException("Could not find required lib-effect dependencies.", e10);
        }
    }

    @Override // io.bidmachine.media3.exoplayer.ExoPlayer
    public void setVideoFrameMetadataListener(io.v vVar) {
        D();
        this.f61360m0 = vVar;
        i(this.A).setType(7).setPayload(vVar).send();
    }

    @Override // io.bidmachine.media3.exoplayer.ExoPlayer
    public void setVideoScalingMode(int i10) {
        D();
        this.f61342d0 = i10;
        u(2, 4, Integer.valueOf(i10));
    }

    @Override // gn.j, gn.i1
    public void setVideoSurface(Surface surface) {
        D();
        t();
        x(surface);
        int i10 = surface == null ? 0 : -1;
        r(i10, i10);
    }

    @Override // gn.j, gn.i1
    public void setVideoSurfaceHolder(SurfaceHolder surfaceHolder) {
        D();
        if (surfaceHolder == null) {
            clearVideoSurface();
            return;
        }
        t();
        this.f61338b0 = true;
        this.Z = surfaceHolder;
        surfaceHolder.addCallback(this.f61385z);
        Surface surface = surfaceHolder.getSurface();
        if (surface == null || !surface.isValid()) {
            x(null);
            r(0, 0);
        } else {
            x(surface);
            Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
            r(surfaceFrame.width(), surfaceFrame.height());
        }
    }

    @Override // gn.j, gn.i1
    public void setVideoSurfaceView(SurfaceView surfaceView) {
        D();
        if (surfaceView instanceof io.u) {
            t();
            x(surfaceView);
            w(surfaceView.getHolder());
        } else {
            if (!(surfaceView instanceof jo.k)) {
                setVideoSurfaceHolder(surfaceView == null ? null : surfaceView.getHolder());
                return;
            }
            t();
            this.f61336a0 = (jo.k) surfaceView;
            i(this.A).setType(10000).setPayload(this.f61336a0).send();
            this.f61336a0.addVideoSurfaceListener(this.f61385z);
            x(this.f61336a0.getVideoSurface());
            w(surfaceView.getHolder());
        }
    }

    @Override // gn.j, gn.i1
    public void setVideoTextureView(TextureView textureView) {
        D();
        if (textureView == null) {
            clearVideoSurface();
            return;
        }
        t();
        this.f61340c0 = textureView;
        if (textureView.getSurfaceTextureListener() != null) {
            io.bidmachine.media3.common.util.b0.w("ExoPlayerImpl", "Replacing existing SurfaceTextureListener.");
        }
        textureView.setSurfaceTextureListener(this.f61385z);
        SurfaceTexture surfaceTexture = textureView.isAvailable() ? textureView.getSurfaceTexture() : null;
        if (surfaceTexture == null) {
            x(null);
            r(0, 0);
        } else {
            Surface surface = new Surface(surfaceTexture);
            x(surface);
            this.Y = surface;
            r(textureView.getWidth(), textureView.getHeight());
        }
    }

    @Override // gn.j, gn.i1
    public void setVolume(float f10) {
        D();
        float fConstrainValue = io.bidmachine.media3.common.util.a1.constrainValue(f10, 0.0f, 1.0f);
        if (this.f61354j0 == fConstrainValue) {
            return;
        }
        this.f61354j0 = fConstrainValue;
        this.f61357l.setVolume(fConstrainValue);
        this.f61359m.sendEvent(22, new com.google.android.exoplayer2.h0(fConstrainValue, 1));
    }

    @Override // io.bidmachine.media3.exoplayer.ExoPlayer
    public void setWakeMode(int i10) {
        D();
        l2 l2Var = this.E;
        k2 k2Var = this.D;
        if (i10 == 0) {
            k2Var.setEnabled(false);
            l2Var.setEnabled(false);
        } else if (i10 == 1) {
            k2Var.setEnabled(true);
            l2Var.setEnabled(false);
        } else {
            if (i10 != 2) {
                return;
            }
            k2Var.setEnabled(true);
            l2Var.setEnabled(true);
        }
    }

    @Override // gn.j, gn.i1
    public void stop() {
        D();
        y(null);
        this.f61358l0 = new in.d(b5.of(), this.f61382x0.f61321s);
    }

    public final void t() {
        jo.k kVar = this.f61336a0;
        j0 j0Var = this.f61385z;
        if (kVar != null) {
            i(this.A).setType(10000).setPayload(null).send();
            this.f61336a0.removeVideoSurfaceListener(j0Var);
            this.f61336a0 = null;
        }
        TextureView textureView = this.f61340c0;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != j0Var) {
                io.bidmachine.media3.common.util.b0.w("ExoPlayerImpl", "SurfaceTextureListener already unset or replaced.");
            } else {
                this.f61340c0.setSurfaceTextureListener(null);
            }
            this.f61340c0 = null;
        }
        SurfaceHolder surfaceHolder = this.Z;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(j0Var);
            this.Z = null;
        }
    }

    public final void u(int i10, int i11, Object obj) {
        for (s1 s1Var : this.f61347g) {
            if (i10 == -1 || s1Var.getTrackType() == i10) {
                i(s1Var).setType(i11).setPayload(obj).send();
            }
        }
        for (s1 s1Var2 : this.f61349h) {
            if (s1Var2 != null && (i10 == -1 || s1Var2.getTrackType() == i10)) {
                i(s1Var2).setType(i11).setPayload(obj).send();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void v(java.util.List r16, int r17, long r18, boolean r20) {
        /*
            r15 = this;
            r1 = r17
            io.bidmachine.media3.exoplayer.k1 r2 = r15.f61382x0
            int r2 = r15.l(r2)
            long r3 = r15.getCurrentPosition()
            int r5 = r15.K
            r6 = 1
            int r5 = r5 + r6
            r15.K = r5
            java.util.ArrayList r5 = r15.f61365p
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
            ao.s1 r5 = r15.P
            ao.s1 r5 = r5.cloneAndRemove(r8, r7)
            r15.P = r5
        L31:
            r5 = r16
            java.util.ArrayList r10 = r15.d(r8, r5)
            io.bidmachine.media3.exoplayer.q1 r5 = r15.g()
            boolean r7 = r5.isEmpty()
            if (r7 != 0) goto L47
            int r7 = r5.getWindowCount()
            if (r1 >= r7) goto L4a
        L47:
            r11 = r18
            goto L52
        L4a:
            gn.y r2 = new gn.y
            r11 = r18
            r2.<init>(r5, r1, r11)
            throw r2
        L52:
            r7 = -1
            if (r20 == 0) goto L62
            boolean r1 = r15.J
            int r1 = r5.getFirstWindowIndex(r1)
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L60:
            r11 = r1
            goto L69
        L62:
            if (r1 != r7) goto L67
            r11 = r2
            r2 = r3
            goto L69
        L67:
            r2 = r11
            goto L60
        L69:
            io.bidmachine.media3.exoplayer.k1 r1 = r15.f61382x0
            android.util.Pair r4 = r15.q(r5, r11, r2)
            io.bidmachine.media3.exoplayer.k1 r1 = r15.p(r1, r5, r4)
            int r4 = r1.f61307e
            if (r11 == r7) goto L89
            if (r4 == r6) goto L89
            boolean r4 = r5.isEmpty()
            if (r4 != 0) goto L88
            int r4 = r5.getWindowCount()
            if (r11 < r4) goto L86
            goto L88
        L86:
            r4 = 2
            goto L89
        L88:
            r4 = 4
        L89:
            io.bidmachine.media3.exoplayer.k1 r1 = o(r1, r4)
            long r12 = io.bidmachine.media3.common.util.a1.msToUs(r2)
            ao.s1 r14 = r15.P
            io.bidmachine.media3.exoplayer.o0 r9 = r15.f61357l
            r9.setMediaSources(r10, r11, r12, r14)
            io.bidmachine.media3.exoplayer.k1 r2 = r15.f61382x0
            ao.k0 r2 = r2.f61304b
            java.lang.Object r2 = r2.f7718a
            ao.k0 r3 = r1.f61304b
            java.lang.Object r3 = r3.f7718a
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto Lb4
            io.bidmachine.media3.exoplayer.k1 r2 = r15.f61382x0
            gn.u1 r2 = r2.f61303a
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto Lb4
            r3 = r6
            goto Lb5
        Lb4:
            r3 = r8
        Lb5:
            long r5 = r15.k(r1)
            r7 = -1
            r8 = 0
            r2 = 0
            r4 = 4
            r0 = r15
            r0.B(r1, r2, r3, r4, r5, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.media3.exoplayer.l0.v(java.util.List, int, long, boolean):void");
    }

    public final void w(SurfaceHolder surfaceHolder) {
        this.f61338b0 = false;
        this.Z = surfaceHolder;
        surfaceHolder.addCallback(this.f61385z);
        Surface surface = this.Z.getSurface();
        if (surface == null || !surface.isValid()) {
            r(0, 0);
        } else {
            Rect surfaceFrame = this.Z.getSurfaceFrame();
            r(surfaceFrame.width(), surfaceFrame.height());
        }
    }

    public final void x(Object obj) {
        Object obj2 = this.X;
        boolean z10 = (obj2 == null || obj2 == obj) ? false : true;
        boolean videoOutput = this.f61357l.setVideoOutput(obj, z10 ? this.F : C.TIME_UNSET);
        if (z10) {
            Object obj3 = this.X;
            Surface surface = this.Y;
            if (obj3 == surface) {
                surface.release();
                this.Y = null;
            }
        }
        this.X = obj;
        if (videoOutput) {
            return;
        }
        y(a0.createForUnexpected(new q0(3), IronSourceError.AUCTION_ERROR_DECRYPTION));
    }

    public final void y(a0 a0Var) {
        k1 k1Var = this.f61382x0;
        k1 k1VarCopyWithLoadingMediaPeriodId = k1Var.copyWithLoadingMediaPeriodId(k1Var.f61304b);
        k1VarCopyWithLoadingMediaPeriodId.f61319q = k1VarCopyWithLoadingMediaPeriodId.f61321s;
        k1VarCopyWithLoadingMediaPeriodId.f61320r = 0L;
        k1 k1VarO = o(k1VarCopyWithLoadingMediaPeriodId, 1);
        if (a0Var != null) {
            k1VarO = k1VarO.copyWithPlaybackError(a0Var);
        }
        this.K++;
        this.f61357l.stop();
        B(k1VarO, 0, false, 5, C.TIME_UNSET, -1, false);
    }

    public final void z() {
        gn.e1 e1Var = this.S;
        gn.e1 availableCommands = io.bidmachine.media3.common.util.a1.getAvailableCommands(this.f61345f, this.f61339c);
        this.S = availableCommands;
        if (availableCommands.equals(e1Var)) {
            return;
        }
        this.f61359m.queueEvent(13, new h0(this, 5));
    }

    @Override // gn.j, gn.i1
    public a0 getPlayerError() {
        D();
        return this.f61382x0.f61308f;
    }

    @Override // io.bidmachine.media3.exoplayer.ExoPlayer
    public void addMediaSource(int i10, ao.m0 m0Var) {
        D();
        addMediaSources(i10, Collections.singletonList(m0Var));
    }

    @Override // io.bidmachine.media3.exoplayer.ExoPlayer
    public void addMediaSources(int i10, List<ao.m0> list) {
        D();
        io.bidmachine.media3.common.util.a.checkArgument(i10 >= 0);
        ArrayList arrayList = this.f61365p;
        int iMin = Math.min(i10, arrayList.size());
        if (arrayList.isEmpty()) {
            setMediaSources(list, this.f61384y0 == -1);
        } else {
            B(e(this.f61382x0, iMin, list), 0, false, 5, C.TIME_UNSET, -1, false);
        }
    }

    @Override // gn.j, gn.i1
    public void setMediaItems(List<gn.p0> list, int i10, long j10) {
        D();
        setMediaSources(h(list), i10, j10);
    }

    @Override // io.bidmachine.media3.exoplayer.ExoPlayer
    public void setMediaSource(ao.m0 m0Var, long j10) {
        D();
        setMediaSources(Collections.singletonList(m0Var), 0, j10);
    }

    @Override // io.bidmachine.media3.exoplayer.ExoPlayer
    public void setMediaSources(List<ao.m0> list, boolean z10) {
        D();
        v(list, -1, C.TIME_UNSET, z10);
    }

    @Override // gn.j, gn.i1
    public void decreaseDeviceVolume(int i10) {
        D();
        StreamVolumeManager streamVolumeManager = this.C;
        if (streamVolumeManager != null) {
            streamVolumeManager.decreaseVolume(i10);
        }
    }

    @Override // gn.j, gn.i1
    public void increaseDeviceVolume(int i10) {
        D();
        StreamVolumeManager streamVolumeManager = this.C;
        if (streamVolumeManager != null) {
            streamVolumeManager.increaseVolume(i10);
        }
    }

    @Override // gn.j, gn.i1
    public void setDeviceMuted(boolean z10, int i10) {
        D();
        StreamVolumeManager streamVolumeManager = this.C;
        if (streamVolumeManager != null) {
            streamVolumeManager.setMuted(z10, i10);
        }
    }

    @Override // gn.j, gn.i1
    public void setDeviceVolume(int i10, int i11) {
        D();
        StreamVolumeManager streamVolumeManager = this.C;
        if (streamVolumeManager != null) {
            streamVolumeManager.setVolume(i10, i11);
        }
    }

    @Override // gn.j, gn.i1
    public void clearVideoSurface(Surface surface) {
        D();
        if (surface == null || surface != this.X) {
            return;
        }
        clearVideoSurface();
    }

    @Override // io.bidmachine.media3.exoplayer.ExoPlayer
    public void setMediaSources(List<ao.m0> list, int i10, long j10) {
        D();
        v(list, i10, j10, false);
    }

    @Override // io.bidmachine.media3.exoplayer.ExoPlayer
    public void setMediaSource(ao.m0 m0Var, boolean z10) {
        D();
        setMediaSources(Collections.singletonList(m0Var), z10);
    }

    @Override // io.bidmachine.media3.exoplayer.ExoPlayer
    @Deprecated
    public void prepare(ao.m0 m0Var) {
        D();
        setMediaSource(m0Var);
        prepare();
    }

    @Override // io.bidmachine.media3.exoplayer.ExoPlayer
    @Deprecated
    public void prepare(ao.m0 m0Var, boolean z10, boolean z11) {
        D();
        setMediaSource(m0Var, z10);
        prepare();
    }
}
