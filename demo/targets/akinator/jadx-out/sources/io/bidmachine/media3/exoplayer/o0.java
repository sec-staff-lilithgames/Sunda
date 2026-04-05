package io.bidmachine.media3.exoplayer;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import io.bidmachine.media3.exoplayer.ExoPlayer;
import io.bidmachine.media3.exoplayer.i1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import mh.v2;
import nh.b5;
import nh.x4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class o0 implements Handler.Callback, ao.h0, fo.t, j1, p, m1, g {

    /* renamed from: g0, reason: collision with root package name */
    public static final long f61435g0 = io.bidmachine.media3.common.util.a1.usToMs(10000);
    public final on.a A;
    public final io.bidmachine.media3.common.util.v B;
    public final boolean C;
    public final h D;
    public y1 E;
    public k1 F;
    public c G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean M;
    public int N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public int S;
    public e T;
    public long U;
    public long V;
    public int W;
    public boolean X;
    public a0 Y;
    public long Z;

    /* renamed from: b, reason: collision with root package name */
    public final w1[] f61437b;

    /* renamed from: b0, reason: collision with root package name */
    public ExoPlayer.b f61438b0;

    /* renamed from: c, reason: collision with root package name */
    public final u1[] f61439c;

    /* renamed from: e, reason: collision with root package name */
    public final boolean[] f61442e;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f61443e0;

    /* renamed from: f, reason: collision with root package name */
    public final fo.u f61444f;

    /* renamed from: g, reason: collision with root package name */
    public final fo.v f61446g;

    /* renamed from: h, reason: collision with root package name */
    public final u0 f61447h;

    /* renamed from: i, reason: collision with root package name */
    public final go.f f61448i;

    /* renamed from: j, reason: collision with root package name */
    public final io.bidmachine.media3.common.util.v f61449j;

    /* renamed from: k, reason: collision with root package name */
    public final l1 f61450k;

    /* renamed from: l, reason: collision with root package name */
    public final Looper f61451l;

    /* renamed from: m, reason: collision with root package name */
    public final gn.t1 f61452m;

    /* renamed from: n, reason: collision with root package name */
    public final gn.r1 f61453n;

    /* renamed from: o, reason: collision with root package name */
    public final long f61454o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f61455p;

    /* renamed from: q, reason: collision with root package name */
    public final q f61456q;

    /* renamed from: r, reason: collision with root package name */
    public final ArrayList f61457r;

    /* renamed from: s, reason: collision with root package name */
    public final io.bidmachine.media3.common.util.g f61458s;

    /* renamed from: t, reason: collision with root package name */
    public final p0 f61459t;

    /* renamed from: u, reason: collision with root package name */
    public final c1 f61460u;

    /* renamed from: v, reason: collision with root package name */
    public final i1 f61461v;

    /* renamed from: w, reason: collision with root package name */
    public final s0 f61462w;

    /* renamed from: x, reason: collision with root package name */
    public final long f61463x;

    /* renamed from: y, reason: collision with root package name */
    public final on.f0 f61464y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f61465z;

    /* renamed from: d0, reason: collision with root package name */
    public long f61441d0 = C.TIME_UNSET;

    /* renamed from: f0, reason: collision with root package name */
    public float f61445f0 = 1.0f;

    /* renamed from: a0, reason: collision with root package name */
    public long f61436a0 = C.TIME_UNSET;
    public long L = C.TIME_UNSET;

    /* renamed from: c0, reason: collision with root package name */
    public gn.u1 f61440c0 = gn.u1.f58195a;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f61466a;

        /* renamed from: b, reason: collision with root package name */
        public final int f61467b;

        /* renamed from: c, reason: collision with root package name */
        public final int f61468c;

        /* renamed from: d, reason: collision with root package name */
        public final ao.s1 f61469d;

        public a(int i10, int i11, int i12, ao.s1 s1Var) {
            this.f61466a = i10;
            this.f61467b = i11;
            this.f61468c = i12;
            this.f61469d = s1Var;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b implements Comparable {

        /* renamed from: b, reason: collision with root package name */
        public final o1 f61470b;

        /* renamed from: c, reason: collision with root package name */
        public int f61471c;

        /* renamed from: e, reason: collision with root package name */
        public long f61472e;

        /* renamed from: f, reason: collision with root package name */
        public Object f61473f;

        public b(o1 o1Var) {
            this.f61470b = o1Var;
        }

        public void setResolvedPosition(int i10, long j10, Object obj) {
            this.f61471c = i10;
            this.f61472e = j10;
            this.f61473f = obj;
        }

        @Override // java.lang.Comparable
        public int compareTo(b bVar) {
            Object obj = this.f61473f;
            if ((obj == null) != (bVar.f61473f == null)) {
                return obj != null ? -1 : 1;
            }
            if (obj == null) {
                return 0;
            }
            int i10 = this.f61471c - bVar.f61471c;
            return i10 != 0 ? i10 : io.bidmachine.media3.common.util.a1.compareLong(this.f61472e, bVar.f61472e);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public boolean f61474a;

        /* renamed from: b, reason: collision with root package name */
        public k1 f61475b;

        /* renamed from: c, reason: collision with root package name */
        public int f61476c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f61477d;

        /* renamed from: e, reason: collision with root package name */
        public int f61478e;

        public c(k1 k1Var) {
            this.f61475b = k1Var;
        }

        public void incrementPendingOperationAcks(int i10) {
            this.f61474a |= i10 > 0;
            this.f61476c += i10;
        }

        public void setPlaybackInfo(k1 k1Var) {
            this.f61474a |= this.f61475b != k1Var;
            this.f61475b = k1Var;
        }

        public void setPositionDiscontinuity(int i10) {
            if (this.f61477d && this.f61478e != 5) {
                io.bidmachine.media3.common.util.a.checkArgument(i10 == 5);
                return;
            }
            this.f61474a = true;
            this.f61477d = true;
            this.f61478e = i10;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final ao.k0 f61479a;

        /* renamed from: b, reason: collision with root package name */
        public final long f61480b;

        /* renamed from: c, reason: collision with root package name */
        public final long f61481c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f61482d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f61483e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f61484f;

        public d(ao.k0 k0Var, long j10, long j11, boolean z10, boolean z11, boolean z12) {
            this.f61479a = k0Var;
            this.f61480b = j10;
            this.f61481c = j11;
            this.f61482d = z10;
            this.f61483e = z11;
            this.f61484f = z12;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        public final gn.u1 f61485a;

        /* renamed from: b, reason: collision with root package name */
        public final int f61486b;

        /* renamed from: c, reason: collision with root package name */
        public final long f61487c;

        public e(gn.u1 u1Var, int i10, long j10) {
            this.f61485a = u1Var;
            this.f61486b = i10;
            this.f61487c = j10;
        }
    }

    public o0(Context context, s1[] s1VarArr, s1[] s1VarArr2, fo.u uVar, fo.v vVar, u0 u0Var, go.f fVar, int i10, boolean z10, on.a aVar, y1 y1Var, s0 s0Var, long j10, boolean z11, boolean z12, Looper looper, io.bidmachine.media3.common.util.g gVar, p0 p0Var, on.f0 f0Var, l1 l1Var, ExoPlayer.b bVar) {
        this.f61459t = p0Var;
        this.f61444f = uVar;
        this.f61446g = vVar;
        this.f61447h = u0Var;
        this.f61448i = fVar;
        this.N = i10;
        this.O = z10;
        this.E = y1Var;
        this.f61462w = s0Var;
        this.f61463x = j10;
        this.Z = j10;
        this.I = z11;
        this.f61465z = z12;
        this.f61458s = gVar;
        this.f61464y = f0Var;
        this.f61438b0 = bVar;
        this.A = aVar;
        this.f61454o = u0Var.getBackBufferDurationUs(f0Var);
        this.f61455p = u0Var.retainBackBufferFromKeyframe(f0Var);
        k1 k1VarCreateDummy = k1.createDummy(vVar);
        this.F = k1VarCreateDummy;
        this.G = new c(k1VarCreateDummy);
        this.f61439c = new u1[s1VarArr.length];
        this.f61442e = new boolean[s1VarArr.length];
        t1 rendererCapabilitiesListener = uVar.getRendererCapabilitiesListener();
        this.f61437b = new w1[s1VarArr.length];
        boolean z13 = false;
        for (int i11 = 0; i11 < s1VarArr.length; i11++) {
            s1VarArr[i11].init(i11, f0Var, gVar);
            this.f61439c[i11] = s1VarArr[i11].getCapabilities();
            if (rendererCapabilitiesListener != null) {
                this.f61439c[i11].setListener(rendererCapabilitiesListener);
            }
            s1 s1Var = s1VarArr2[i11];
            if (s1Var != null) {
                s1Var.init(s1VarArr.length + i11, f0Var, gVar);
                z13 = true;
            }
            this.f61437b[i11] = new w1(s1VarArr[i11], s1VarArr2[i11], i11);
        }
        this.C = z13;
        this.f61456q = new q(this, gVar);
        this.f61457r = new ArrayList();
        this.f61452m = new gn.t1();
        this.f61453n = new gn.r1();
        uVar.init(this, fVar);
        this.X = true;
        io.bidmachine.media3.common.util.q0 q0Var = (io.bidmachine.media3.common.util.q0) gVar;
        io.bidmachine.media3.common.util.v vVarCreateHandler = q0Var.createHandler(looper, null);
        this.B = vVarCreateHandler;
        this.f61460u = new c1(aVar, vVarCreateHandler, new f0(this, 9), bVar);
        this.f61461v = new i1(this, aVar, vVarCreateHandler, f0Var);
        l1 l1Var2 = l1Var == null ? new l1() : l1Var;
        this.f61450k = l1Var2;
        Looper looperObtainLooper = l1Var2.obtainLooper();
        this.f61451l = looperObtainLooper;
        this.f61449j = q0Var.createHandler(looperObtainLooper, this);
        this.D = new h(context, looperObtainLooper, this);
    }

    public static void L(gn.u1 u1Var, b bVar, gn.t1 t1Var, gn.r1 r1Var) {
        int i10 = u1Var.getWindow(u1Var.getPeriodByUid(bVar.f61473f, r1Var).f58110c, t1Var).f58189o;
        Object obj = u1Var.getPeriod(i10, r1Var, true).f58109b;
        long j10 = r1Var.f58111d;
        bVar.setResolvedPosition(i10, j10 != C.TIME_UNSET ? j10 - 1 : Long.MAX_VALUE, obj);
    }

    public static boolean M(b bVar, gn.u1 u1Var, gn.u1 u1Var2, int i10, boolean z10, gn.t1 t1Var, gn.r1 r1Var) {
        Object obj = bVar.f61473f;
        o1 o1Var = bVar.f61470b;
        if (obj == null) {
            Pair pairO = O(u1Var, new e(o1Var.getTimeline(), o1Var.getMediaItemIndex(), o1Var.getPositionMs() == Long.MIN_VALUE ? C.TIME_UNSET : io.bidmachine.media3.common.util.a1.msToUs(o1Var.getPositionMs())), false, i10, z10, t1Var, r1Var);
            if (pairO == null) {
                return false;
            }
            bVar.setResolvedPosition(u1Var.getIndexOfPeriod(pairO.first), ((Long) pairO.second).longValue(), pairO.first);
            if (o1Var.getPositionMs() == Long.MIN_VALUE) {
                L(u1Var, bVar, t1Var, r1Var);
            }
            return true;
        }
        int indexOfPeriod = u1Var.getIndexOfPeriod(obj);
        if (indexOfPeriod == -1) {
            return false;
        }
        if (o1Var.getPositionMs() == Long.MIN_VALUE) {
            L(u1Var, bVar, t1Var, r1Var);
            return true;
        }
        bVar.f61471c = indexOfPeriod;
        u1Var2.getPeriodByUid(bVar.f61473f, r1Var);
        if (r1Var.f58113f && u1Var2.getWindow(r1Var.f58110c, t1Var).f58188n == u1Var2.getIndexOfPeriod(bVar.f61473f)) {
            Pair<Object, Long> periodPositionUs = u1Var.getPeriodPositionUs(t1Var, r1Var, u1Var.getPeriodByUid(bVar.f61473f, r1Var).f58110c, r1Var.getPositionInWindowUs() + bVar.f61472e);
            bVar.setResolvedPosition(u1Var.getIndexOfPeriod(periodPositionUs.first), ((Long) periodPositionUs.second).longValue(), periodPositionUs.first);
        }
        return true;
    }

    public static Pair O(gn.u1 u1Var, e eVar, boolean z10, int i10, boolean z11, gn.t1 t1Var, gn.r1 r1Var) {
        int iP;
        gn.u1 u1Var2 = eVar.f61485a;
        if (u1Var.isEmpty()) {
            return null;
        }
        gn.u1 u1Var3 = u1Var2.isEmpty() ? u1Var : u1Var2;
        try {
            Pair<Object, Long> periodPositionUs = u1Var3.getPeriodPositionUs(t1Var, r1Var, eVar.f61486b, eVar.f61487c);
            if (u1Var.equals(u1Var3)) {
                return periodPositionUs;
            }
            if (u1Var.getIndexOfPeriod(periodPositionUs.first) != -1) {
                return (u1Var3.getPeriodByUid(periodPositionUs.first, r1Var).f58113f && u1Var3.getWindow(r1Var.f58110c, t1Var).f58188n == u1Var3.getIndexOfPeriod(periodPositionUs.first)) ? u1Var.getPeriodPositionUs(t1Var, r1Var, u1Var.getPeriodByUid(periodPositionUs.first, r1Var).f58110c, eVar.f61487c) : periodPositionUs;
            }
            if (!z10 || (iP = P(t1Var, r1Var, i10, z11, periodPositionUs.first, u1Var3, u1Var)) == -1) {
                return null;
            }
            return u1Var.getPeriodPositionUs(t1Var, r1Var, iP, C.TIME_UNSET);
        } catch (IndexOutOfBoundsException unused) {
            return null;
        }
    }

    public static int P(gn.t1 t1Var, gn.r1 r1Var, int i10, boolean z10, Object obj, gn.u1 u1Var, gn.u1 u1Var2) {
        gn.r1 r1Var2;
        Object obj2 = u1Var.getWindow(u1Var.getPeriodByUid(obj, r1Var).f58110c, t1Var).f58175a;
        int i11 = 0;
        for (int i12 = 0; i12 < u1Var2.getWindowCount(); i12++) {
            if (u1Var2.getWindow(i12, t1Var).f58175a.equals(obj2)) {
                return i12;
            }
        }
        int indexOfPeriod = u1Var.getIndexOfPeriod(obj);
        int periodCount = u1Var.getPeriodCount();
        int nextPeriodIndex = indexOfPeriod;
        int indexOfPeriod2 = -1;
        while (i11 < periodCount && indexOfPeriod2 == -1) {
            gn.t1 t1Var2 = t1Var;
            r1Var2 = r1Var;
            int i13 = i10;
            boolean z11 = z10;
            gn.u1 u1Var3 = u1Var;
            nextPeriodIndex = u1Var3.getNextPeriodIndex(nextPeriodIndex, r1Var2, t1Var2, i13, z11);
            if (nextPeriodIndex == -1) {
                break;
            }
            indexOfPeriod2 = u1Var2.getIndexOfPeriod(u1Var3.getUidOfPeriod(nextPeriodIndex));
            i11++;
            u1Var = u1Var3;
            r1Var = r1Var2;
            t1Var = t1Var2;
            i10 = i13;
            z10 = z11;
        }
        r1Var2 = r1Var;
        if (indexOfPeriod2 == -1) {
            return -1;
        }
        return u1Var2.getPeriod(indexOfPeriod2, r1Var2).f58110c;
    }

    public static void d(o1 o1Var) {
        if (o1Var.isCanceled()) {
            return;
        }
        try {
            o1Var.getTarget().handleMessage(o1Var.getType(), o1Var.getPayload());
        } finally {
            o1Var.markAsProcessed(true);
        }
    }

    public static boolean v(z0 z0Var) {
        return (z0Var == null || z0Var.hasLoadingError() || z0Var.getNextLoadPositionUs() == Long.MIN_VALUE) ? false : true;
    }

    public final void A(int i10) throws a0 {
        w1 w1Var = this.f61437b[i10];
        try {
            w1Var.maybeThrowStreamError((z0) io.bidmachine.media3.common.util.a.checkNotNull(this.f61460u.getPlayingPeriod()));
        } catch (IOException | RuntimeException e10) {
            int trackType = w1Var.getTrackType();
            if (trackType != 3 && trackType != 5) {
                throw e10;
            }
            fo.v trackSelectorResult = this.f61460u.getPlayingPeriod().getTrackSelectorResult();
            io.bidmachine.media3.common.util.b0.e("ExoPlayerImplInternal", "Disabling track due to error: " + io.bidmachine.media3.common.b.toLogString(trackSelectorResult.f55927c[i10].getSelectedFormat()), e10);
            fo.v vVar = new fo.v((v1[]) trackSelectorResult.f55926b.clone(), (fo.l[]) trackSelectorResult.f55927c.clone(), trackSelectorResult.f55928d, trackSelectorResult.f55929e);
            vVar.f55926b[i10] = null;
            vVar.f55927c[i10] = null;
            w1[] w1VarArr = this.f61437b;
            int enabledRendererCount = w1VarArr[i10].getEnabledRendererCount();
            w1VarArr[i10].disable(this.f61456q);
            B(i10, false);
            this.S -= enabledRendererCount;
            this.f61460u.getPlayingPeriod().applyTrackSelection(vVar, this.F.f61321s, false);
        }
    }

    public final void B(int i10, boolean z10) {
        boolean[] zArr = this.f61442e;
        if (zArr[i10] != z10) {
            zArr[i10] = z10;
            this.B.post(new com.amazon.device.ads.e(z10, this, i10, 2));
        }
    }

    public final void C() throws Throwable {
        r(this.f61461v.createTimeline(), true);
    }

    public final void D(a aVar) throws Throwable {
        this.G.incrementPendingOperationAcks(1);
        r(this.f61461v.moveMediaSourceRange(aVar.f61466a, aVar.f61467b, aVar.f61468c, aVar.f61469d), false);
    }

    public final void E() throws a0 {
        this.G.incrementPendingOperationAcks(1);
        I(false, false, false, true);
        this.f61447h.onPrepared(this.f61464y);
        h0(this.F.f61303a.isEmpty() ? 4 : 2);
        k1 k1Var = this.F;
        boolean z10 = k1Var.f61314l;
        r0(this.D.updateAudioFocus(z10, k1Var.f61307e), k1Var.f61316n, k1Var.f61315m, z10);
        this.f61461v.prepare(((go.o) this.f61448i).getTransferListener());
        this.f61449j.sendEmptyMessage(2);
    }

    public final void F() {
        try {
            I(true, false, true, false);
            w1[] w1VarArr = this.f61437b;
            for (int i10 = 0; i10 < w1VarArr.length; i10++) {
                this.f61439c[i10].clearListener();
                w1VarArr[i10].release();
            }
            this.f61447h.onReleased(this.f61464y);
            this.D.release();
            this.f61444f.release();
            h0(1);
            this.f61450k.releaseLooper();
            synchronized (this) {
                this.H = true;
                notifyAll();
            }
        } catch (Throwable th2) {
            this.f61450k.releaseLooper();
            synchronized (this) {
                this.H = true;
                notifyAll();
                throw th2;
            }
        }
    }

    public final void G(int i10, int i11, ao.s1 s1Var) throws Throwable {
        this.G.incrementPendingOperationAcks(1);
        r(this.f61461v.removeMediaSourceRange(i10, i11, s1Var), false);
    }

    public final void H() throws a0 {
        float f10 = this.f61456q.getPlaybackParameters().f57847a;
        z0 readingPeriod = this.f61460u.getReadingPeriod();
        fo.v vVar = null;
        boolean z10 = true;
        for (z0 playingPeriod = this.f61460u.getPlayingPeriod(); playingPeriod != null && playingPeriod.f61613f; playingPeriod = playingPeriod.getNext()) {
            k1 k1Var = this.F;
            fo.v vVarSelectTracks = playingPeriod.selectTracks(f10, k1Var.f61303a, k1Var.f61314l);
            if (playingPeriod == this.f61460u.getPlayingPeriod()) {
                vVar = vVarSelectTracks;
            }
            if (!vVarSelectTracks.isEquivalent(playingPeriod.getTrackSelectorResult())) {
                if (z10) {
                    z0 playingPeriod2 = this.f61460u.getPlayingPeriod();
                    boolean z11 = (this.f61460u.removeAfter(playingPeriod2) & 1) != 0;
                    boolean[] zArr = new boolean[this.f61437b.length];
                    long jApplyTrackSelection = playingPeriod2.applyTrackSelection((fo.v) io.bidmachine.media3.common.util.a.checkNotNull(vVar), this.F.f61321s, z11, zArr);
                    k1 k1Var2 = this.F;
                    boolean z12 = (k1Var2.f61307e == 4 || jApplyTrackSelection == k1Var2.f61321s) ? false : true;
                    k1 k1Var3 = this.F;
                    this.F = u(k1Var3.f61304b, jApplyTrackSelection, k1Var3.f61305c, k1Var3.f61306d, z12, 5);
                    if (z12) {
                        K(jApplyTrackSelection);
                    }
                    e();
                    boolean[] zArr2 = new boolean[this.f61437b.length];
                    int i10 = 0;
                    while (true) {
                        w1[] w1VarArr = this.f61437b;
                        if (i10 >= w1VarArr.length) {
                            break;
                        }
                        int enabledRendererCount = w1VarArr[i10].getEnabledRendererCount();
                        zArr2[i10] = this.f61437b[i10].isRendererEnabled();
                        this.f61437b[i10].maybeDisableOrResetPosition(playingPeriod2.f61610c[i10], this.f61456q, this.U, zArr[i10]);
                        if (enabledRendererCount - this.f61437b[i10].getEnabledRendererCount() > 0) {
                            B(i10, false);
                        }
                        this.S -= enabledRendererCount - this.f61437b[i10].getEnabledRendererCount();
                        i10++;
                    }
                    h(zArr2, this.U);
                    playingPeriod2.f61616i = true;
                } else {
                    this.f61460u.removeAfter(playingPeriod);
                    if (playingPeriod.f61613f) {
                        long jMax = Math.max(playingPeriod.f61615h.f60881b, playingPeriod.toPeriodTime(this.U));
                        if (this.C && b() && this.f61460u.getPrewarmingPeriod() == playingPeriod) {
                            e();
                        }
                        playingPeriod.applyTrackSelection(vVarSelectTracks, jMax, false);
                    }
                }
                q(true);
                if (this.F.f61307e != 4) {
                    x();
                    s0();
                    this.f61449j.sendEmptyMessage(2);
                    return;
                }
                return;
            }
            if (playingPeriod == readingPeriod) {
                z10 = false;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x010a A[PHI: r0
      0x010a: PHI (r0v15 gn.u1) = (r0v14 gn.u1), (r0v14 gn.u1), (r0v25 gn.u1), (r0v25 gn.u1) binds: [B:39:0x00d0, B:41:0x00d4, B:43:0x00e5, B:45:0x00fc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void I(boolean r36, boolean r37, boolean r38, boolean r39) {
        /*
            Method dump skipped, instructions count: 362
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.media3.exoplayer.o0.I(boolean, boolean, boolean, boolean):void");
    }

    public final void J() {
        z0 playingPeriod = this.f61460u.getPlayingPeriod();
        this.J = playingPeriod != null && playingPeriod.f61615h.f60888i && this.I;
    }

    public final void K(long j10) throws a0 {
        z0 playingPeriod = this.f61460u.getPlayingPeriod();
        long rendererTime = playingPeriod == null ? j10 + 1000000000000L : playingPeriod.toRendererTime(j10);
        this.U = rendererTime;
        this.f61456q.resetPosition(rendererTime);
        for (w1 w1Var : this.f61437b) {
            w1Var.resetPosition(playingPeriod, this.U);
        }
        for (z0 playingPeriod2 = r0.getPlayingPeriod(); playingPeriod2 != null; playingPeriod2 = playingPeriod2.getNext()) {
            for (fo.l lVar : playingPeriod2.getTrackSelectorResult().f55927c) {
                if (lVar != null) {
                    lVar.onDiscontinuity();
                }
            }
        }
    }

    public final void N(gn.u1 u1Var, gn.u1 u1Var2) {
        if (u1Var.isEmpty() && u1Var2.isEmpty()) {
            return;
        }
        ArrayList arrayList = this.f61457r;
        int size = arrayList.size() - 1;
        while (size >= 0) {
            gn.u1 u1Var3 = u1Var;
            gn.u1 u1Var4 = u1Var2;
            if (!M((b) arrayList.get(size), u1Var3, u1Var4, this.N, this.O, this.f61452m, this.f61453n)) {
                ((b) arrayList.get(size)).f61470b.markAsProcessed(false);
                arrayList.remove(size);
            }
            size--;
            u1Var = u1Var3;
            u1Var2 = u1Var4;
        }
        Collections.sort(arrayList);
    }

    public final void Q(long j10) {
        int i10 = this.F.f61307e;
        long j11 = f61435g0;
        boolean z10 = this.f61465z;
        long jMin = (i10 != 3 || (!z10 && j0())) ? j11 : 1000L;
        if (z10 && j0()) {
            for (w1 w1Var : this.f61437b) {
                jMin = Math.min(jMin, io.bidmachine.media3.common.util.a1.usToMs(w1Var.getMinDurationToProgressUs(this.U, this.V)));
            }
            c1 c1Var = this.f61460u;
            if ((c1Var.getPlayingPeriod() != null ? c1Var.getPlayingPeriod().getNext() : null) != null) {
                if ((io.bidmachine.media3.common.util.a1.msToUs(jMin) * this.F.f61317o.f57847a) + this.U >= r4.getStartPositionRendererTime()) {
                    jMin = Math.min(jMin, j11);
                }
            }
        }
        this.f61449j.sendEmptyMessageAtTime(2, j10 + jMin);
    }

    public final void R(boolean z10) throws a0 {
        ao.k0 k0Var = this.f61460u.getPlayingPeriod().f61615h.f60880a;
        long jT = T(k0Var, this.F.f61321s, true, false);
        if (jT != this.F.f61321s) {
            k1 k1Var = this.F;
            this.F = u(k0Var, jT, k1Var.f61305c, k1Var.f61306d, z10, 5);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00a1 A[Catch: all -> 0x00a4, TryCatch #1 {all -> 0x00a4, blocks: (B:22:0x0097, B:24:0x00a1, B:31:0x00ad, B:33:0x00b3, B:34:0x00b6, B:36:0x00be, B:40:0x00d0, B:44:0x00d8), top: B:98:0x0097 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void S(io.bidmachine.media3.exoplayer.o0.e r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.media3.exoplayer.o0.S(io.bidmachine.media3.exoplayer.o0$e):void");
    }

    public final long T(ao.k0 k0Var, long j10, boolean z10, boolean z11) throws a0 {
        w1[] w1VarArr;
        n0();
        u0(false, true);
        if (z11 || this.F.f61307e == 3) {
            h0(2);
        }
        c1 c1Var = this.f61460u;
        z0 playingPeriod = c1Var.getPlayingPeriod();
        z0 next = playingPeriod;
        while (next != null && !k0Var.equals(next.f61615h.f60880a)) {
            next = next.getNext();
        }
        if (z10 || playingPeriod != next || (next != null && next.toRendererTime(j10) < 0)) {
            int i10 = 0;
            while (true) {
                w1VarArr = this.f61437b;
                if (i10 >= w1VarArr.length) {
                    break;
                }
                int enabledRendererCount = w1VarArr[i10].getEnabledRendererCount();
                w1VarArr[i10].disable(this.f61456q);
                B(i10, false);
                this.S -= enabledRendererCount;
                i10++;
            }
            this.f61441d0 = C.TIME_UNSET;
            if (next != null) {
                while (c1Var.getPlayingPeriod() != next) {
                    c1Var.advancePlayingPeriod();
                }
                c1Var.removeAfter(next);
                next.setRendererOffset(1000000000000L);
                h(new boolean[w1VarArr.length], c1Var.getReadingPeriod().getStartPositionRendererTime());
                next.f61616i = true;
            }
        }
        e();
        if (next != null) {
            ao.i0 i0Var = next.f61608a;
            c1Var.removeAfter(next);
            if (!next.f61613f) {
                next.f61615h = next.f61615h.copyWithStartPositionUs(j10);
            } else if (next.f61614g) {
                j10 = i0Var.seekToUs(j10);
                i0Var.discardBuffer(j10 - this.f61454o, this.f61455p);
            }
            K(j10);
            x();
        } else {
            c1Var.clear();
            K(j10);
        }
        q(false);
        this.f61449j.sendEmptyMessage(2);
        return j10;
    }

    public final void U(o1 o1Var) {
        if (o1Var.getPositionMs() == C.TIME_UNSET) {
            V(o1Var);
            return;
        }
        boolean zIsEmpty = this.F.f61303a.isEmpty();
        ArrayList arrayList = this.f61457r;
        if (zIsEmpty) {
            arrayList.add(new b(o1Var));
            return;
        }
        b bVar = new b(o1Var);
        gn.u1 u1Var = this.F.f61303a;
        if (!M(bVar, u1Var, u1Var, this.N, this.O, this.f61452m, this.f61453n)) {
            o1Var.markAsProcessed(false);
        } else {
            arrayList.add(bVar);
            Collections.sort(arrayList);
        }
    }

    public final void V(o1 o1Var) {
        Looper looper = o1Var.getLooper();
        Looper looper2 = this.f61451l;
        io.bidmachine.media3.common.util.v vVar = this.f61449j;
        if (looper != looper2) {
            ((io.bidmachine.media3.common.util.r0) vVar.obtainMessage(15, o1Var)).sendToTarget();
            return;
        }
        d(o1Var);
        int i10 = this.F.f61307e;
        if (i10 == 3 || i10 == 2) {
            vVar.sendEmptyMessage(2);
        }
    }

    public final void W(o1 o1Var) {
        Looper looper = o1Var.getLooper();
        if (looper.getThread().isAlive()) {
            ((io.bidmachine.media3.common.util.q0) this.f61458s).createHandler(looper, null).post(new io.bidmachine.media3.exoplayer.c(this, o1Var));
        } else {
            io.bidmachine.media3.common.util.b0.w("TAG", "Trying to send message on a dead thread.");
            o1Var.markAsProcessed(false);
        }
    }

    public final void X(gn.h hVar, boolean z10) throws a0 {
        this.f61444f.setAudioAttributes(hVar);
        if (!z10) {
            hVar = null;
        }
        h hVar2 = this.D;
        hVar2.setAudioAttributes(hVar);
        k1 k1Var = this.F;
        boolean z11 = k1Var.f61314l;
        r0(hVar2.updateAudioFocus(z11, k1Var.f61307e), k1Var.f61316n, k1Var.f61315m, z11);
    }

    public final void Y(boolean z10, AtomicBoolean atomicBoolean) {
        if (this.P != z10) {
            this.P = z10;
            if (!z10) {
                for (w1 w1Var : this.f61437b) {
                    w1Var.reset();
                }
            }
        }
        if (atomicBoolean != null) {
            synchronized (this) {
                atomicBoolean.set(true);
                notifyAll();
            }
        }
    }

    public final void Z(n0 n0Var) throws Throwable {
        this.G.incrementPendingOperationAcks(1);
        int i10 = n0Var.f61424c;
        ao.s1 s1Var = n0Var.f61423b;
        List<i1.c> list = n0Var.f61422a;
        if (i10 != -1) {
            this.T = new e(new q1(list, s1Var), n0Var.f61424c, n0Var.f61425d);
        }
        r(this.f61461v.setMediaSources(list, s1Var), false);
    }

    public final void a(n0 n0Var, int i10) throws Throwable {
        this.G.incrementPendingOperationAcks(1);
        i1 i1Var = this.f61461v;
        if (i10 == -1) {
            i10 = i1Var.getSize();
        }
        r(i1Var.addMediaSources(i10, n0Var.f61422a, n0Var.f61423b), false);
    }

    public final void a0(boolean z10) throws a0 {
        this.I = z10;
        J();
        if (this.J) {
            c1 c1Var = this.f61460u;
            if (c1Var.getReadingPeriod() != c1Var.getPlayingPeriod()) {
                R(true);
                q(false);
            }
        }
    }

    public void addMediaSources(int i10, List<i1.c> list, ao.s1 s1Var) {
        ((io.bidmachine.media3.common.util.r0) this.f61449j.obtainMessage(18, i10, 0, new n0(list, -1, C.TIME_UNSET, s1Var))).sendToTarget();
    }

    public final boolean b() {
        if (!this.C) {
            return false;
        }
        for (w1 w1Var : this.f61437b) {
            if (w1Var.isPrewarming()) {
                return true;
            }
        }
        return false;
    }

    public final void b0(gn.c1 c1Var) throws a0 {
        this.f61449j.removeMessages(16);
        q qVar = this.f61456q;
        qVar.setPlaybackParameters(c1Var);
        gn.c1 playbackParameters = qVar.getPlaybackParameters();
        t(playbackParameters, playbackParameters.f57847a, true, true);
    }

    public final void c() throws a0 {
        H();
        R(true);
    }

    public final void c0(ExoPlayer.b bVar) {
        this.f61438b0 = bVar;
        this.f61460u.updatePreloadConfiguration(this.F.f61303a, bVar);
    }

    public final void d0(int i10) throws a0 {
        this.N = i10;
        int iUpdateRepeatMode = this.f61460u.updateRepeatMode(this.F.f61303a, i10);
        if ((iUpdateRepeatMode & 1) != 0) {
            R(true);
        } else if ((iUpdateRepeatMode & 2) != 0) {
            e();
        }
        q(false);
    }

    public final void e() {
        if (this.C && b()) {
            for (w1 w1Var : this.f61437b) {
                int enabledRendererCount = w1Var.getEnabledRendererCount();
                w1Var.disablePrewarming(this.f61456q);
                this.S -= enabledRendererCount - w1Var.getEnabledRendererCount();
            }
            this.f61441d0 = C.TIME_UNSET;
        }
    }

    public final void e0(y1 y1Var) {
        this.E = y1Var;
    }

    @Override // io.bidmachine.media3.exoplayer.g
    public void executePlayerCommand(int i10) {
        ((io.bidmachine.media3.common.util.r0) this.f61449j.obtainMessage(33, i10, 0)).sendToTarget();
    }

    public void experimentalSetForegroundModeTimeoutMs(long j10) {
        this.Z = j10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x059b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x0627  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x011f A[EDGE_INSN: B:437:0x011f->B:65:0x011f BREAK  A[LOOP:10: B:75:0x0147->B:80:0x0153]] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0129  */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r36v0, types: [ao.h0, io.bidmachine.media3.exoplayer.o0] */
    /* JADX WARN: Type inference failed for: r3v106 */
    /* JADX WARN: Type inference failed for: r3v60 */
    /* JADX WARN: Type inference failed for: r3v61, types: [int] */
    /* JADX WARN: Type inference failed for: r4v11, types: [io.bidmachine.media3.exoplayer.o0$c] */
    /* JADX WARN: Type inference failed for: r4v12, types: [io.bidmachine.media3.exoplayer.h] */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r9v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v17, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f() throws io.bidmachine.media3.exoplayer.a0, java.io.IOException {
        /*
            Method dump skipped, instructions count: 1697
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.media3.exoplayer.o0.f():void");
    }

    public final void f0(boolean z10) throws a0 {
        this.O = z10;
        int iUpdateShuffleModeEnabled = this.f61460u.updateShuffleModeEnabled(this.F.f61303a, z10);
        if ((iUpdateShuffleModeEnabled & 1) != 0) {
            R(true);
        } else if ((iUpdateShuffleModeEnabled & 2) != 0) {
            e();
        }
        q(false);
    }

    public final void g(z0 z0Var, int i10, boolean z10, long j10) throws a0 {
        w1 w1Var = this.f61437b[i10];
        if (w1Var.isRendererEnabled()) {
            return;
        }
        boolean z11 = z0Var == this.f61460u.getPlayingPeriod();
        fo.v trackSelectorResult = z0Var.getTrackSelectorResult();
        v1 v1Var = trackSelectorResult.f55926b[i10];
        fo.l lVar = trackSelectorResult.f55927c[i10];
        boolean z12 = j0() && this.F.f61307e == 3;
        boolean z13 = !z10 && z12;
        this.S++;
        w1Var.enable(v1Var, lVar, z0Var.f61610c[i10], this.U, z13, z11, j10, z0Var.getRendererOffset(), z0Var.f61615h.f60880a, this.f61456q);
        w1Var.handleMessage(11, new m0(this), z0Var);
        if (z12 && z11) {
            w1Var.start();
        }
    }

    public final void g0(ao.s1 s1Var) throws Throwable {
        this.G.incrementPendingOperationAcks(1);
        r(this.f61461v.setShuffleOrder(s1Var), false);
    }

    public Looper getPlaybackLooper() {
        return this.f61451l;
    }

    public final void h(boolean[] zArr, long j10) throws a0 {
        w1[] w1VarArr;
        long j11;
        z0 readingPeriod = this.f61460u.getReadingPeriod();
        fo.v trackSelectorResult = readingPeriod.getTrackSelectorResult();
        int i10 = 0;
        while (true) {
            w1VarArr = this.f61437b;
            if (i10 >= w1VarArr.length) {
                break;
            }
            if (!trackSelectorResult.isRendererEnabled(i10)) {
                w1VarArr[i10].reset();
            }
            i10++;
        }
        int i11 = 0;
        while (i11 < w1VarArr.length) {
            if (!trackSelectorResult.isRendererEnabled(i11) || w1VarArr[i11].isReadingFromPeriod(readingPeriod)) {
                j11 = j10;
            } else {
                j11 = j10;
                g(readingPeriod, i11, zArr[i11], j11);
            }
            i11++;
            j10 = j11;
        }
    }

    public final void h0(int i10) {
        k1 k1Var = this.F;
        if (k1Var.f61307e != i10) {
            if (i10 != 2) {
                this.f61436a0 = C.TIME_UNSET;
            }
            this.F = k1Var.copyWithPlaybackState(i10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x024a  */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean handleMessage(android.os.Message r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 786
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.media3.exoplayer.o0.handleMessage(android.os.Message):boolean");
    }

    public final long i(gn.u1 u1Var, Object obj, long j10) {
        gn.r1 r1Var = this.f61453n;
        int i10 = u1Var.getPeriodByUid(obj, r1Var).f58110c;
        gn.t1 t1Var = this.f61452m;
        u1Var.getWindow(i10, t1Var);
        return (t1Var.f58180f != C.TIME_UNSET && t1Var.isLive() && t1Var.f58183i) ? io.bidmachine.media3.common.util.a1.msToUs(t1Var.getCurrentUnixTimeMs() - t1Var.f58180f) - (r1Var.getPositionInWindowUs() + j10) : C.TIME_UNSET;
    }

    public final void i0(Object obj, AtomicBoolean atomicBoolean) throws a0 {
        for (w1 w1Var : this.f61437b) {
            w1Var.setVideoOutput(obj);
        }
        int i10 = this.F.f61307e;
        if (i10 == 3 || i10 == 2) {
            this.f61449j.sendEmptyMessage(2);
        }
        if (atomicBoolean != null) {
            synchronized (this) {
                atomicBoolean.set(true);
                notifyAll();
            }
        }
    }

    public final long j(z0 z0Var) {
        if (z0Var == null) {
            return 0L;
        }
        long rendererOffset = z0Var.getRendererOffset();
        if (!z0Var.f61613f) {
            return rendererOffset;
        }
        int i10 = 0;
        while (true) {
            w1[] w1VarArr = this.f61437b;
            if (i10 >= w1VarArr.length) {
                return rendererOffset;
            }
            if (w1VarArr[i10].isReadingFromPeriod(z0Var)) {
                long readingPositionUs = w1VarArr[i10].getReadingPositionUs(z0Var);
                if (readingPositionUs == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                }
                rendererOffset = Math.max(readingPositionUs, rendererOffset);
            }
            i10++;
        }
    }

    public final boolean j0() {
        k1 k1Var = this.F;
        return k1Var.f61314l && k1Var.f61316n == 0;
    }

    public final Pair k(gn.u1 u1Var) {
        if (u1Var.isEmpty()) {
            return Pair.create(k1.getDummyPeriodForEmptyTimeline(), 0L);
        }
        Pair<Object, Long> periodPositionUs = u1Var.getPeriodPositionUs(this.f61452m, this.f61453n, u1Var.getFirstWindowIndex(this.O), C.TIME_UNSET);
        ao.k0 k0VarResolveMediaPeriodIdForAdsAfterPeriodPositionChange = this.f61460u.resolveMediaPeriodIdForAdsAfterPeriodPositionChange(u1Var, periodPositionUs.first, 0L);
        long jLongValue = ((Long) periodPositionUs.second).longValue();
        if (k0VarResolveMediaPeriodIdForAdsAfterPeriodPositionChange.isAd()) {
            Object obj = k0VarResolveMediaPeriodIdForAdsAfterPeriodPositionChange.f7718a;
            gn.r1 r1Var = this.f61453n;
            u1Var.getPeriodByUid(obj, r1Var);
            jLongValue = k0VarResolveMediaPeriodIdForAdsAfterPeriodPositionChange.f7720c == r1Var.getFirstAdIndexToPlay(k0VarResolveMediaPeriodIdForAdsAfterPeriodPositionChange.f7719b) ? r1Var.getAdResumePositionUs() : 0L;
        }
        return Pair.create(k0VarResolveMediaPeriodIdForAdsAfterPeriodPositionChange, Long.valueOf(jLongValue));
    }

    public final boolean k0(gn.u1 u1Var, ao.k0 k0Var) {
        if (!k0Var.isAd() && !u1Var.isEmpty()) {
            int i10 = u1Var.getPeriodByUid(k0Var.f7718a, this.f61453n).f58110c;
            gn.t1 t1Var = this.f61452m;
            u1Var.getWindow(i10, t1Var);
            if (t1Var.isLive() && t1Var.f58183i && t1Var.f58180f != C.TIME_UNSET) {
                return true;
            }
        }
        return false;
    }

    public final long l(long j10) {
        z0 loadingPeriod = this.f61460u.getLoadingPeriod();
        if (loadingPeriod == null) {
            return 0L;
        }
        return Math.max(0L, j10 - loadingPeriod.toPeriodTime(this.U));
    }

    public final void l0() throws a0 {
        z0 playingPeriod = this.f61460u.getPlayingPeriod();
        if (playingPeriod == null) {
            return;
        }
        fo.v trackSelectorResult = playingPeriod.getTrackSelectorResult();
        int i10 = 0;
        while (true) {
            w1[] w1VarArr = this.f61437b;
            if (i10 >= w1VarArr.length) {
                return;
            }
            if (trackSelectorResult.isRendererEnabled(i10)) {
                w1VarArr[i10].start();
            }
            i10++;
        }
    }

    public final void m(int i10) throws a0 {
        k1 k1Var = this.F;
        r0(i10, k1Var.f61316n, k1Var.f61315m, k1Var.f61314l);
    }

    public final void m0(boolean z10, boolean z11) {
        I(z10 || !this.P, false, true, false);
        this.G.incrementPendingOperationAcks(z11 ? 1 : 0);
        this.f61447h.onStopped(this.f61464y);
        this.D.updateAudioFocus(this.F.f61314l, 1);
        h0(1);
    }

    public void moveMediaSources(int i10, int i11, int i12, ao.s1 s1Var) {
        ((io.bidmachine.media3.common.util.r0) this.f61449j.obtainMessage(19, new a(i10, i11, i12, s1Var))).sendToTarget();
    }

    public final void n() throws a0 {
        float f10 = this.f61445f0;
        this.f61445f0 = f10;
        float volumeMultiplier = this.D.getVolumeMultiplier() * f10;
        for (w1 w1Var : this.f61437b) {
            w1Var.setVolume(volumeMultiplier);
        }
    }

    public final void n0() {
        this.f61456q.stop();
        for (w1 w1Var : this.f61437b) {
            w1Var.stop();
        }
    }

    public final void o(ao.i0 i0Var) {
        c1 c1Var = this.f61460u;
        if (c1Var.isLoading(i0Var)) {
            c1Var.reevaluateBuffer(this.U);
            x();
        } else if (c1Var.isPreloading(i0Var)) {
            y();
        }
    }

    public final void o0() {
        z0 loadingPeriod = this.f61460u.getLoadingPeriod();
        boolean z10 = this.M || (loadingPeriod != null && loadingPeriod.f61608a.isLoading());
        k1 k1Var = this.F;
        if (z10 != k1Var.f61309g) {
            this.F = k1Var.copyWithIsLoading(z10);
        }
    }

    @Override // io.bidmachine.media3.exoplayer.p
    public void onPlaybackParametersChanged(gn.c1 c1Var) {
        ((io.bidmachine.media3.common.util.r0) this.f61449j.obtainMessage(16, c1Var)).sendToTarget();
    }

    @Override // io.bidmachine.media3.exoplayer.j1
    public void onPlaylistUpdateRequested() {
        io.bidmachine.media3.common.util.v vVar = this.f61449j;
        vVar.removeMessages(2);
        vVar.sendEmptyMessage(22);
    }

    @Override // ao.h0
    public void onPrepared(ao.i0 i0Var) {
        ((io.bidmachine.media3.common.util.r0) this.f61449j.obtainMessage(8, i0Var)).sendToTarget();
    }

    @Override // fo.t
    public void onRendererCapabilitiesChanged(s1 s1Var) {
        this.f61449j.sendEmptyMessage(26);
    }

    @Override // fo.t
    public void onTrackSelectionsInvalidated() {
        this.f61449j.sendEmptyMessage(10);
    }

    public final void p(IOException iOException, int i10) {
        a0 a0VarCreateForSource = a0.createForSource(iOException, i10);
        z0 playingPeriod = this.f61460u.getPlayingPeriod();
        if (playingPeriod != null) {
            a0VarCreateForSource = a0VarCreateForSource.a(playingPeriod.f61615h.f60880a);
        }
        io.bidmachine.media3.common.util.b0.e("ExoPlayerImplInternal", "Playback error", a0VarCreateForSource);
        m0(false, false);
        this.F = this.F.copyWithPlaybackError(a0VarCreateForSource);
    }

    public final void p0(ao.k0 k0Var, ao.b2 b2Var, fo.v vVar) {
        c1 c1Var = this.f61460u;
        z0 z0Var = (z0) io.bidmachine.media3.common.util.a.checkNotNull(c1Var.getLoadingPeriod());
        this.f61447h.onTracksSelected(new t0(this.f61464y, this.F.f61303a, k0Var, z0Var == c1Var.getPlayingPeriod() ? z0Var.toPeriodTime(this.U) : z0Var.toPeriodTime(this.U) - z0Var.f61615h.f60881b, l(z0Var.getBufferedPositionUs()), this.f61456q.getPlaybackParameters().f57847a, this.F.f61314l, this.K, k0(this.F.f61303a, z0Var.f61615h.f60880a) ? ((m) this.f61462w).getTargetLiveOffsetUs() : C.TIME_UNSET, this.L), b2Var, vVar.f55927c);
    }

    public void prepare() {
        ((io.bidmachine.media3.common.util.r0) this.f61449j.obtainMessage(29)).sendToTarget();
    }

    public final void q(boolean z10) {
        z0 loadingPeriod = this.f61460u.getLoadingPeriod();
        ao.k0 k0Var = loadingPeriod == null ? this.F.f61304b : loadingPeriod.f61615h.f60880a;
        boolean zEquals = this.F.f61313k.equals(k0Var);
        if (!zEquals) {
            this.F = this.F.copyWithLoadingMediaPeriodId(k0Var);
        }
        k1 k1Var = this.F;
        k1Var.f61319q = loadingPeriod == null ? k1Var.f61321s : loadingPeriod.getBufferedPositionUs();
        k1 k1Var2 = this.F;
        k1Var2.f61320r = l(k1Var2.f61319q);
        if ((!zEquals || z10) && loadingPeriod != null && loadingPeriod.f61613f) {
            p0(loadingPeriod.f61615h.f60880a, loadingPeriod.getTrackGroups(), loadingPeriod.getTrackSelectorResult());
        }
    }

    public final void q0(int i10, int i11, List list) throws Throwable {
        this.G.incrementPendingOperationAcks(1);
        r(this.f61461v.updateMediaSourcesWithMediaItems(i10, i11, list), false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0430  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0442  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0462  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01f3  */
    /* JADX WARN: Type inference failed for: r22v12 */
    /* JADX WARN: Type inference failed for: r22v16 */
    /* JADX WARN: Type inference failed for: r22v4 */
    /* JADX WARN: Type inference failed for: r22v6 */
    /* JADX WARN: Type inference failed for: r22v7 */
    /* JADX WARN: Type inference failed for: r22v8 */
    /* JADX WARN: Type inference failed for: r25v1 */
    /* JADX WARN: Type inference failed for: r25v10 */
    /* JADX WARN: Type inference failed for: r25v13 */
    /* JADX WARN: Type inference failed for: r25v14 */
    /* JADX WARN: Type inference failed for: r25v15 */
    /* JADX WARN: Type inference failed for: r25v25 */
    /* JADX WARN: Type inference failed for: r25v5 */
    /* JADX WARN: Type inference failed for: r25v7 */
    /* JADX WARN: Type inference failed for: r25v8 */
    /* JADX WARN: Type inference failed for: r25v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void r(gn.u1 r36, boolean r37) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1135
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.media3.exoplayer.o0.r(gn.u1, boolean):void");
    }

    public final void r0(int i10, int i11, int i12, boolean z10) throws a0 {
        boolean z11 = z10 && i10 != -1;
        if (i10 == -1) {
            i12 = 2;
        } else if (i12 == 2) {
            i12 = 1;
        }
        if (i10 == 0) {
            i11 = 1;
        } else if (i11 == 1) {
            i11 = 0;
        }
        k1 k1Var = this.F;
        if (k1Var.f61314l == z11 && k1Var.f61316n == i11 && k1Var.f61315m == i12) {
            return;
        }
        this.F = k1Var.copyWithPlayWhenReady(z11, i12, i11);
        u0(false, false);
        c1 c1Var = this.f61460u;
        for (z0 playingPeriod = c1Var.getPlayingPeriod(); playingPeriod != null; playingPeriod = playingPeriod.getNext()) {
            for (fo.l lVar : playingPeriod.getTrackSelectorResult().f55927c) {
                if (lVar != null) {
                    lVar.onPlayWhenReadyChanged(z11);
                }
            }
        }
        if (!j0()) {
            n0();
            s0();
            c1Var.reevaluateBuffer(this.U);
            return;
        }
        int i13 = this.F.f61307e;
        io.bidmachine.media3.common.util.v vVar = this.f61449j;
        if (i13 == 3) {
            this.f61456q.start();
            l0();
            vVar.sendEmptyMessage(2);
        } else if (i13 == 2) {
            vVar.sendEmptyMessage(2);
        }
    }

    public synchronized boolean release() {
        if (!this.H && this.f61451l.getThread().isAlive()) {
            this.f61449j.sendEmptyMessage(7);
            v0(new c0(this, 5), this.f61463x);
            return this.H;
        }
        return true;
    }

    public void removeMediaSources(int i10, int i11, ao.s1 s1Var) {
        ((io.bidmachine.media3.common.util.r0) this.f61449j.obtainMessage(20, i10, i11, s1Var)).sendToTarget();
    }

    public final void s(ao.i0 i0Var) throws a0 {
        c1 c1Var = this.f61460u;
        boolean zIsLoading = c1Var.isLoading(i0Var);
        q qVar = this.f61456q;
        if (!zIsLoading) {
            z0 preloadHolderByMediaPeriod = c1Var.getPreloadHolderByMediaPeriod(i0Var);
            if (preloadHolderByMediaPeriod != null) {
                io.bidmachine.media3.common.util.a.checkState(true ^ preloadHolderByMediaPeriod.f61613f);
                float f10 = qVar.getPlaybackParameters().f57847a;
                k1 k1Var = this.F;
                preloadHolderByMediaPeriod.handlePrepared(f10, k1Var.f61303a, k1Var.f61314l);
                if (c1Var.isPreloading(i0Var)) {
                    y();
                    return;
                }
                return;
            }
            return;
        }
        z0 z0Var = (z0) io.bidmachine.media3.common.util.a.checkNotNull(c1Var.getLoadingPeriod());
        if (!z0Var.f61613f) {
            float f11 = qVar.getPlaybackParameters().f57847a;
            k1 k1Var2 = this.F;
            z0Var.handlePrepared(f11, k1Var2.f61303a, k1Var2.f61314l);
        }
        p0(z0Var.f61615h.f60880a, z0Var.getTrackGroups(), z0Var.getTrackSelectorResult());
        if (z0Var == c1Var.getPlayingPeriod()) {
            K(z0Var.f61615h.f60881b);
            h(new boolean[this.f61437b.length], c1Var.getReadingPeriod().getStartPositionRendererTime());
            z0Var.f61616i = true;
            k1 k1Var3 = this.F;
            ao.k0 k0Var = k1Var3.f61304b;
            long j10 = z0Var.f61615h.f60881b;
            this.F = u(k0Var, j10, k1Var3.f61305c, j10, false, 5);
        }
        x();
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x00dc, code lost:
    
        r10 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s0() throws io.bidmachine.media3.exoplayer.a0 {
        /*
            Method dump skipped, instructions count: 496
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.media3.exoplayer.o0.s0():void");
    }

    public void seekTo(gn.u1 u1Var, int i10, long j10) {
        ((io.bidmachine.media3.common.util.r0) this.f61449j.obtainMessage(3, new e(u1Var, i10, j10))).sendToTarget();
    }

    @Override // io.bidmachine.media3.exoplayer.m1
    public synchronized void sendMessage(o1 o1Var) {
        if (!this.H && this.f61451l.getThread().isAlive()) {
            ((io.bidmachine.media3.common.util.r0) this.f61449j.obtainMessage(14, o1Var)).sendToTarget();
            return;
        }
        io.bidmachine.media3.common.util.b0.w("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        o1Var.markAsProcessed(false);
    }

    public void setAudioAttributes(gn.h hVar, boolean z10) {
        ((io.bidmachine.media3.common.util.r0) this.f61449j.obtainMessage(31, z10 ? 1 : 0, 0, hVar)).sendToTarget();
    }

    public synchronized boolean setForegroundMode(boolean z10) {
        if (!this.H && this.f61451l.getThread().isAlive()) {
            if (z10) {
                ((io.bidmachine.media3.common.util.r0) this.f61449j.obtainMessage(13, 1, 0)).sendToTarget();
                return true;
            }
            AtomicBoolean atomicBoolean = new AtomicBoolean();
            ((io.bidmachine.media3.common.util.r0) this.f61449j.obtainMessage(13, 0, 0, atomicBoolean)).sendToTarget();
            v0(new com.google.android.exoplayer2.u(atomicBoolean, 5), this.Z);
            return atomicBoolean.get();
        }
        return true;
    }

    public void setMediaSources(List<i1.c> list, int i10, long j10, ao.s1 s1Var) {
        ((io.bidmachine.media3.common.util.r0) this.f61449j.obtainMessage(17, new n0(list, i10, j10, s1Var))).sendToTarget();
    }

    public void setPauseAtEndOfWindow(boolean z10) {
        ((io.bidmachine.media3.common.util.r0) this.f61449j.obtainMessage(23, z10 ? 1 : 0, 0)).sendToTarget();
    }

    public void setPlayWhenReady(boolean z10, int i10, int i11) {
        ((io.bidmachine.media3.common.util.r0) this.f61449j.obtainMessage(1, z10 ? 1 : 0, i10 | (i11 << 4))).sendToTarget();
    }

    public void setPlaybackParameters(gn.c1 c1Var) {
        ((io.bidmachine.media3.common.util.r0) this.f61449j.obtainMessage(4, c1Var)).sendToTarget();
    }

    public void setPreloadConfiguration(ExoPlayer.b bVar) {
        ((io.bidmachine.media3.common.util.r0) this.f61449j.obtainMessage(28, bVar)).sendToTarget();
    }

    public void setRepeatMode(int i10) {
        ((io.bidmachine.media3.common.util.r0) this.f61449j.obtainMessage(11, i10, 0)).sendToTarget();
    }

    public void setSeekParameters(y1 y1Var) {
        ((io.bidmachine.media3.common.util.r0) this.f61449j.obtainMessage(5, y1Var)).sendToTarget();
    }

    public void setShuffleModeEnabled(boolean z10) {
        ((io.bidmachine.media3.common.util.r0) this.f61449j.obtainMessage(12, z10 ? 1 : 0, 0)).sendToTarget();
    }

    public void setShuffleOrder(ao.s1 s1Var) {
        ((io.bidmachine.media3.common.util.r0) this.f61449j.obtainMessage(21, s1Var)).sendToTarget();
    }

    public synchronized boolean setVideoOutput(Object obj, long j10) {
        if (!this.H && this.f61451l.getThread().isAlive()) {
            AtomicBoolean atomicBoolean = new AtomicBoolean();
            ((io.bidmachine.media3.common.util.r0) this.f61449j.obtainMessage(30, new Pair(obj, atomicBoolean))).sendToTarget();
            if (j10 == C.TIME_UNSET) {
                return true;
            }
            v0(new com.google.android.exoplayer2.u(atomicBoolean, 5), j10);
            return atomicBoolean.get();
        }
        return true;
    }

    public void setVolume(float f10) {
        ((io.bidmachine.media3.common.util.r0) this.f61449j.obtainMessage(32, Float.valueOf(f10))).sendToTarget();
    }

    @Override // io.bidmachine.media3.exoplayer.g
    public void setVolumeMultiplier(float f10) {
        this.f61449j.sendEmptyMessage(34);
    }

    public void stop() {
        ((io.bidmachine.media3.common.util.r0) this.f61449j.obtainMessage(6)).sendToTarget();
    }

    public final void t(gn.c1 c1Var, float f10, boolean z10, boolean z11) throws a0 {
        int i10;
        if (z10) {
            if (z11) {
                this.G.incrementPendingOperationAcks(1);
            }
            this.F = this.F.copyWithPlaybackParameters(c1Var);
        }
        float f11 = c1Var.f57847a;
        z0 playingPeriod = this.f61460u.getPlayingPeriod();
        while (true) {
            i10 = 0;
            if (playingPeriod == null) {
                break;
            }
            fo.l[] lVarArr = playingPeriod.getTrackSelectorResult().f55927c;
            int length = lVarArr.length;
            while (i10 < length) {
                fo.l lVar = lVarArr[i10];
                if (lVar != null) {
                    lVar.onPlaybackSpeed(f11);
                }
                i10++;
            }
            playingPeriod = playingPeriod.getNext();
        }
        w1[] w1VarArr = this.f61437b;
        int length2 = w1VarArr.length;
        while (i10 < length2) {
            w1VarArr[i10].setPlaybackSpeed(f10, c1Var.f57847a);
            i10++;
        }
    }

    public final void t0(gn.u1 u1Var, ao.k0 k0Var, gn.u1 u1Var2, ao.k0 k0Var2, long j10, boolean z10) throws a0 {
        boolean zK0 = k0(u1Var, k0Var);
        Object obj = k0Var.f7718a;
        if (!zK0) {
            gn.c1 c1Var = k0Var.isAd() ? gn.c1.f57844d : this.F.f61317o;
            q qVar = this.f61456q;
            if (qVar.getPlaybackParameters().equals(c1Var)) {
                return;
            }
            this.f61449j.removeMessages(16);
            qVar.setPlaybackParameters(c1Var);
            t(this.F.f61317o, c1Var.f57847a, false, false);
            return;
        }
        gn.r1 r1Var = this.f61453n;
        int i10 = u1Var.getPeriodByUid(obj, r1Var).f58110c;
        gn.t1 t1Var = this.f61452m;
        u1Var.getWindow(i10, t1Var);
        gn.i0 i0Var = (gn.i0) io.bidmachine.media3.common.util.a1.castNonNull(t1Var.f58184j);
        m mVar = (m) this.f61462w;
        mVar.setLiveConfiguration(i0Var);
        if (j10 != C.TIME_UNSET) {
            mVar.setTargetLiveOffsetOverrideUs(i(u1Var, obj, j10));
            return;
        }
        if (!Objects.equals(!u1Var2.isEmpty() ? u1Var2.getWindow(u1Var2.getPeriodByUid(k0Var2.f7718a, r1Var).f58110c, t1Var).f58175a : null, t1Var.f58175a) || z10) {
            mVar.setTargetLiveOffsetOverrideUs(C.TIME_UNSET);
        }
    }

    public final k1 u(ao.k0 k0Var, long j10, long j11, long j12, boolean z10, int i10) {
        List<gn.u0> list;
        ao.b2 b2Var;
        fo.v vVar;
        z0 playingPeriod;
        boolean z11;
        this.X = (!this.X && j10 == this.F.f61321s && k0Var.equals(this.F.f61304b)) ? false : true;
        J();
        k1 k1Var = this.F;
        ao.b2 b2Var2 = k1Var.f61310h;
        fo.v vVar2 = k1Var.f61311i;
        List<gn.u0> listOf = k1Var.f61312j;
        if (this.f61461v.isPrepared()) {
            z0 playingPeriod2 = this.f61460u.getPlayingPeriod();
            ao.b2 trackGroups = playingPeriod2 == null ? ao.b2.f7550d : playingPeriod2.getTrackGroups();
            fo.v trackSelectorResult = playingPeriod2 == null ? this.f61446g : playingPeriod2.getTrackSelectorResult();
            fo.l[] lVarArr = trackSelectorResult.f55927c;
            x4 x4Var = new x4();
            boolean z12 = false;
            for (fo.l lVar : lVarArr) {
                if (lVar != null) {
                    gn.u0 u0Var = lVar.getFormat(0).f60662l;
                    if (u0Var == null) {
                        x4Var.add((Object) new gn.u0(new gn.t0[0]));
                    } else {
                        x4Var.add((Object) u0Var);
                        z12 = true;
                    }
                }
            }
            b5 b5VarBuild = z12 ? x4Var.build() : b5.of();
            if (playingPeriod2 != null) {
                a1 a1Var = playingPeriod2.f61615h;
                if (a1Var.f60882c != j11) {
                    playingPeriod2.f61615h = a1Var.copyWithRequestedContentPositionUs(j11);
                }
            }
            w1[] w1VarArr = this.f61437b;
            c1 c1Var = this.f61460u;
            if (c1Var.getPlayingPeriod() == c1Var.getReadingPeriod() && (playingPeriod = c1Var.getPlayingPeriod()) != null) {
                fo.v trackSelectorResult2 = playingPeriod.getTrackSelectorResult();
                int i11 = 0;
                boolean z13 = false;
                while (true) {
                    if (i11 >= w1VarArr.length) {
                        z11 = true;
                        break;
                    }
                    if (trackSelectorResult2.isRendererEnabled(i11)) {
                        if (w1VarArr[i11].getTrackType() != 1) {
                            z11 = false;
                            break;
                        }
                        if (trackSelectorResult2.f55926b[i11].f61577a != 0) {
                            z13 = true;
                        }
                    }
                    i11++;
                }
                boolean z14 = z13 && z11;
                if (z14 != this.R) {
                    this.R = z14;
                    if (!z14 && this.F.f61318p) {
                        this.f61449j.sendEmptyMessage(2);
                    }
                }
            }
            b2Var = trackGroups;
            vVar = trackSelectorResult;
            list = b5VarBuild;
        } else {
            if (!k0Var.equals(this.F.f61304b)) {
                b2Var2 = ao.b2.f7550d;
                vVar2 = this.f61446g;
                listOf = b5.of();
            }
            list = listOf;
            b2Var = b2Var2;
            vVar = vVar2;
        }
        if (z10) {
            this.G.setPositionDiscontinuity(i10);
        }
        k1 k1Var2 = this.F;
        return k1Var2.copyWithNewPosition(k0Var, j10, j11, j12, l(k1Var2.f61319q), b2Var, vVar, list);
    }

    public final void u0(boolean z10, boolean z11) {
        this.K = z10;
        this.L = (!z10 || z11) ? C.TIME_UNSET : ((io.bidmachine.media3.common.util.q0) this.f61458s).elapsedRealtime();
    }

    public void updateMediaSourcesWithMediaItems(int i10, int i11, List<gn.p0> list) {
        ((io.bidmachine.media3.common.util.r0) this.f61449j.obtainMessage(27, i10, i11, list)).sendToTarget();
    }

    public final synchronized void v0(v2 v2Var, long j10) {
        long jElapsedRealtime = ((io.bidmachine.media3.common.util.q0) this.f61458s).elapsedRealtime() + j10;
        boolean z10 = false;
        while (!((Boolean) v2Var.get()).booleanValue() && j10 > 0) {
            try {
                ((io.bidmachine.media3.common.util.q0) this.f61458s).onThreadBlocked();
                wait(j10);
            } catch (InterruptedException unused) {
                z10 = true;
            }
            j10 = jElapsedRealtime - ((io.bidmachine.media3.common.util.q0) this.f61458s).elapsedRealtime();
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
    }

    public final boolean w() {
        z0 playingPeriod = this.f61460u.getPlayingPeriod();
        long j10 = playingPeriod.f61615h.f60884e;
        if (playingPeriod.f61613f) {
            return j10 == C.TIME_UNSET || this.F.f61321s < j10 || !j0();
        }
        return false;
    }

    public final void x() {
        boolean zShouldContinueLoading = false;
        if (v(this.f61460u.getLoadingPeriod())) {
            z0 loadingPeriod = this.f61460u.getLoadingPeriod();
            long jL = l(loadingPeriod.getNextLoadPositionUs());
            t0 t0Var = new t0(this.f61464y, this.F.f61303a, loadingPeriod.f61615h.f60880a, loadingPeriod == this.f61460u.getPlayingPeriod() ? loadingPeriod.toPeriodTime(this.U) : loadingPeriod.toPeriodTime(this.U) - loadingPeriod.f61615h.f60881b, jL, this.f61456q.getPlaybackParameters().f57847a, this.F.f61314l, this.K, k0(this.F.f61303a, loadingPeriod.f61615h.f60880a) ? ((m) this.f61462w).getTargetLiveOffsetUs() : C.TIME_UNSET, this.L);
            boolean zShouldContinueLoading2 = this.f61447h.shouldContinueLoading(t0Var);
            z0 playingPeriod = this.f61460u.getPlayingPeriod();
            if (zShouldContinueLoading2 || !playingPeriod.f61613f || jL >= 500000 || (this.f61454o <= 0 && !this.f61455p)) {
                zShouldContinueLoading = zShouldContinueLoading2;
            } else {
                playingPeriod.f61608a.discardBuffer(this.F.f61321s, false);
                zShouldContinueLoading = this.f61447h.shouldContinueLoading(t0Var);
            }
        }
        this.M = zShouldContinueLoading;
        if (zShouldContinueLoading) {
            z0 z0Var = (z0) io.bidmachine.media3.common.util.a.checkNotNull(this.f61460u.getLoadingPeriod());
            z0Var.continueLoading(new v0().setPlaybackPositionUs(z0Var.toPeriodTime(this.U)).setPlaybackSpeed(this.f61456q.getPlaybackParameters().f57847a).setLastRebufferRealtimeMs(this.L).build());
        }
        o0();
    }

    public final void y() {
        c1 c1Var = this.f61460u;
        c1Var.maybeUpdatePreloadMediaPeriodHolder();
        z0 preloadingPeriod = c1Var.getPreloadingPeriod();
        if (preloadingPeriod != null) {
            ao.i0 i0Var = preloadingPeriod.f61608a;
            if ((!preloadingPeriod.f61612e || preloadingPeriod.f61613f) && !i0Var.isLoading()) {
                if (this.f61447h.shouldContinuePreloading(this.F.f61303a, preloadingPeriod.f61615h.f60880a, preloadingPeriod.f61613f ? i0Var.getBufferedPositionUs() : 0L)) {
                    if (preloadingPeriod.f61612e) {
                        preloadingPeriod.continueLoading(new v0().setPlaybackPositionUs(preloadingPeriod.toPeriodTime(this.U)).setPlaybackSpeed(this.f61456q.getPlaybackParameters().f57847a).setLastRebufferRealtimeMs(this.L).build());
                    } else {
                        preloadingPeriod.prepare(this, preloadingPeriod.f61615h.f60881b);
                    }
                }
            }
        }
    }

    public final void z() {
        this.G.setPlaybackInfo(this.F);
        c cVar = this.G;
        if (cVar.f61474a) {
            ((h0) this.f61459t).onPlaybackInfoUpdate(cVar);
            this.G = new c(this.F);
        }
    }

    @Override // ao.h0, ao.p1
    public void onContinueLoadingRequested(ao.i0 i0Var) {
        ((io.bidmachine.media3.common.util.r0) this.f61449j.obtainMessage(9, i0Var)).sendToTarget();
    }
}
