package com.google.android.exoplayer2;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import com.google.android.exoplayer2.f2;
import com.google.android.exoplayer2.metadata.Metadata;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.vungle.ads.internal.protos.Sdk;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import nh.b5;
import nh.og;
import nh.x4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class u0 implements Handler.Callback, bf.z, pf.v, g2, n, s2 {
    public c A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public int G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public int L;
    public e M;
    public long N;
    public int O;
    public boolean P;
    public r Q;
    public long R;
    public long S = C.TIME_UNSET;

    /* renamed from: b, reason: collision with root package name */
    public final z2[] f28056b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f28057c;

    /* renamed from: e, reason: collision with root package name */
    public final b3[] f28058e;

    /* renamed from: f, reason: collision with root package name */
    public final pf.w f28059f;

    /* renamed from: g, reason: collision with root package name */
    public final pf.x f28060g;

    /* renamed from: h, reason: collision with root package name */
    public final e1 f28061h;

    /* renamed from: i, reason: collision with root package name */
    public final qf.g f28062i;

    /* renamed from: j, reason: collision with root package name */
    public final com.google.android.exoplayer2.util.z f28063j;

    /* renamed from: k, reason: collision with root package name */
    public final HandlerThread f28064k;

    /* renamed from: l, reason: collision with root package name */
    public final Looper f28065l;

    /* renamed from: m, reason: collision with root package name */
    public final l3 f28066m;

    /* renamed from: n, reason: collision with root package name */
    public final k3 f28067n;

    /* renamed from: o, reason: collision with root package name */
    public final long f28068o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f28069p;

    /* renamed from: q, reason: collision with root package name */
    public final o f28070q;

    /* renamed from: r, reason: collision with root package name */
    public final ArrayList f28071r;

    /* renamed from: s, reason: collision with root package name */
    public final com.google.android.exoplayer2.util.d f28072s;

    /* renamed from: t, reason: collision with root package name */
    public final v0 f28073t;

    /* renamed from: u, reason: collision with root package name */
    public final z1 f28074u;

    /* renamed from: v, reason: collision with root package name */
    public final f2 f28075v;

    /* renamed from: w, reason: collision with root package name */
    public final d1 f28076w;

    /* renamed from: x, reason: collision with root package name */
    public final long f28077x;

    /* renamed from: y, reason: collision with root package name */
    public e3 f28078y;

    /* renamed from: z, reason: collision with root package name */
    public k2 f28079z;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f28080a;

        /* renamed from: b, reason: collision with root package name */
        public final int f28081b;

        /* renamed from: c, reason: collision with root package name */
        public final int f28082c;

        /* renamed from: d, reason: collision with root package name */
        public final bf.f1 f28083d;

        public a(int i10, int i11, int i12, bf.f1 f1Var) {
            this.f28080a = i10;
            this.f28081b = i11;
            this.f28082c = i12;
            this.f28083d = f1Var;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b implements Comparable {

        /* renamed from: b, reason: collision with root package name */
        public final u2 f28084b;

        /* renamed from: c, reason: collision with root package name */
        public int f28085c;

        /* renamed from: e, reason: collision with root package name */
        public long f28086e;

        /* renamed from: f, reason: collision with root package name */
        public Object f28087f;

        public b(u2 u2Var) {
            this.f28084b = u2Var;
        }

        public void setResolvedPosition(int i10, long j10, Object obj) {
            this.f28085c = i10;
            this.f28086e = j10;
            this.f28087f = obj;
        }

        @Override // java.lang.Comparable
        public int compareTo(b bVar) {
            Object obj = this.f28087f;
            if ((obj == null) != (bVar.f28087f == null)) {
                return obj != null ? -1 : 1;
            }
            if (obj == null) {
                return 0;
            }
            int i10 = this.f28085c - bVar.f28085c;
            return i10 != 0 ? i10 : com.google.android.exoplayer2.util.n1.compareLong(this.f28086e, bVar.f28086e);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public boolean f28088a;

        /* renamed from: b, reason: collision with root package name */
        public k2 f28089b;

        /* renamed from: c, reason: collision with root package name */
        public int f28090c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f28091d;

        /* renamed from: e, reason: collision with root package name */
        public int f28092e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f28093f;

        /* renamed from: g, reason: collision with root package name */
        public int f28094g;

        public c(k2 k2Var) {
            this.f28089b = k2Var;
        }

        public void incrementPendingOperationAcks(int i10) {
            this.f28088a |= i10 > 0;
            this.f28090c += i10;
        }

        public void setPlayWhenReadyChangeReason(int i10) {
            this.f28088a = true;
            this.f28093f = true;
            this.f28094g = i10;
        }

        public void setPlaybackInfo(k2 k2Var) {
            this.f28088a |= this.f28089b != k2Var;
            this.f28089b = k2Var;
        }

        public void setPositionDiscontinuity(int i10) {
            if (this.f28091d && this.f28092e != 5) {
                com.google.android.exoplayer2.util.a.checkArgument(i10 == 5);
                return;
            }
            this.f28088a = true;
            this.f28091d = true;
            this.f28092e = i10;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final bf.d0 f28095a;

        /* renamed from: b, reason: collision with root package name */
        public final long f28096b;

        /* renamed from: c, reason: collision with root package name */
        public final long f28097c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f28098d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f28099e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f28100f;

        public d(bf.d0 d0Var, long j10, long j11, boolean z10, boolean z11, boolean z12) {
            this.f28095a = d0Var;
            this.f28096b = j10;
            this.f28097c = j11;
            this.f28098d = z10;
            this.f28099e = z11;
            this.f28100f = z12;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        public final m3 f28101a;

        /* renamed from: b, reason: collision with root package name */
        public final int f28102b;

        /* renamed from: c, reason: collision with root package name */
        public final long f28103c;

        public e(m3 m3Var, int i10, long j10) {
            this.f28101a = m3Var;
            this.f28102b = i10;
            this.f28103c = j10;
        }
    }

    public u0(z2[] z2VarArr, pf.w wVar, pf.x xVar, e1 e1Var, qf.g gVar, int i10, boolean z10, zd.a aVar, e3 e3Var, d1 d1Var, long j10, boolean z11, Looper looper, com.google.android.exoplayer2.util.d dVar, v0 v0Var, zd.c0 c0Var, Looper looper2) {
        this.f28073t = v0Var;
        this.f28056b = z2VarArr;
        this.f28059f = wVar;
        this.f28060g = xVar;
        this.f28061h = e1Var;
        this.f28062i = gVar;
        this.G = i10;
        this.H = z10;
        this.f28078y = e3Var;
        this.f28076w = d1Var;
        this.f28077x = j10;
        this.R = j10;
        this.C = z11;
        this.f28072s = dVar;
        this.f28068o = e1Var.getBackBufferDurationUs();
        this.f28069p = e1Var.retainBackBufferFromKeyframe();
        k2 k2VarCreateDummy = k2.createDummy(xVar);
        this.f28079z = k2VarCreateDummy;
        this.A = new c(k2VarCreateDummy);
        this.f28058e = new b3[z2VarArr.length];
        a3 rendererCapabilitiesListener = wVar.getRendererCapabilitiesListener();
        for (int i11 = 0; i11 < z2VarArr.length; i11++) {
            z2VarArr[i11].init(i11, c0Var);
            this.f28058e[i11] = z2VarArr[i11].getCapabilities();
            if (rendererCapabilitiesListener != null) {
                this.f28058e[i11].setListener(rendererCapabilitiesListener);
            }
        }
        this.f28070q = new o(this, dVar);
        this.f28071r = new ArrayList();
        this.f28057c = og.newIdentityHashSet();
        this.f28066m = new l3();
        this.f28067n = new k3();
        wVar.init(this, gVar);
        this.P = true;
        com.google.android.exoplayer2.util.d1 d1Var2 = (com.google.android.exoplayer2.util.d1) dVar;
        com.google.android.exoplayer2.util.z zVarCreateHandler = d1Var2.createHandler(looper, null);
        this.f28074u = new z1(aVar, zVarCreateHandler);
        this.f28075v = new f2(this, aVar, zVarCreateHandler, c0Var);
        if (looper2 != null) {
            this.f28064k = null;
            this.f28065l = looper2;
        } else {
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
            this.f28064k = handlerThread;
            handlerThread.start();
            this.f28065l = handlerThread.getLooper();
        }
        this.f28063j = d1Var2.createHandler(this.f28065l, this);
    }

    public static void D(m3 m3Var, b bVar, l3 l3Var, k3 k3Var) {
        int i10 = m3Var.getWindow(m3Var.getPeriodByUid(bVar.f28087f, k3Var).f27598e, l3Var).f27662r;
        Object obj = m3Var.getPeriod(i10, k3Var, true).f27597c;
        long j10 = k3Var.f27599f;
        bVar.setResolvedPosition(i10, j10 != C.TIME_UNSET ? j10 - 1 : Long.MAX_VALUE, obj);
    }

    public static boolean E(b bVar, m3 m3Var, m3 m3Var2, int i10, boolean z10, l3 l3Var, k3 k3Var) {
        Object obj = bVar.f28087f;
        u2 u2Var = bVar.f28084b;
        if (obj == null) {
            Pair pairG = G(m3Var, new e(u2Var.getTimeline(), u2Var.getMediaItemIndex(), u2Var.getPositionMs() == Long.MIN_VALUE ? C.TIME_UNSET : com.google.android.exoplayer2.util.n1.msToUs(u2Var.getPositionMs())), false, i10, z10, l3Var, k3Var);
            if (pairG == null) {
                return false;
            }
            bVar.setResolvedPosition(m3Var.getIndexOfPeriod(pairG.first), ((Long) pairG.second).longValue(), pairG.first);
            if (u2Var.getPositionMs() == Long.MIN_VALUE) {
                D(m3Var, bVar, l3Var, k3Var);
            }
            return true;
        }
        int indexOfPeriod = m3Var.getIndexOfPeriod(obj);
        if (indexOfPeriod == -1) {
            return false;
        }
        if (u2Var.getPositionMs() == Long.MIN_VALUE) {
            D(m3Var, bVar, l3Var, k3Var);
            return true;
        }
        bVar.f28085c = indexOfPeriod;
        m3Var2.getPeriodByUid(bVar.f28087f, k3Var);
        if (k3Var.f27601h && m3Var2.getWindow(k3Var.f27598e, l3Var).f27661q == m3Var2.getIndexOfPeriod(bVar.f28087f)) {
            Pair<Object, Long> periodPositionUs = m3Var.getPeriodPositionUs(l3Var, k3Var, m3Var.getPeriodByUid(bVar.f28087f, k3Var).f27598e, k3Var.getPositionInWindowUs() + bVar.f28086e);
            bVar.setResolvedPosition(m3Var.getIndexOfPeriod(periodPositionUs.first), ((Long) periodPositionUs.second).longValue(), periodPositionUs.first);
        }
        return true;
    }

    public static Pair G(m3 m3Var, e eVar, boolean z10, int i10, boolean z11, l3 l3Var, k3 k3Var) {
        Object objH;
        m3 m3Var2 = eVar.f28101a;
        if (m3Var.isEmpty()) {
            return null;
        }
        m3 m3Var3 = m3Var2.isEmpty() ? m3Var : m3Var2;
        try {
            Pair<Object, Long> periodPositionUs = m3Var3.getPeriodPositionUs(l3Var, k3Var, eVar.f28102b, eVar.f28103c);
            if (m3Var.equals(m3Var3)) {
                return periodPositionUs;
            }
            if (m3Var.getIndexOfPeriod(periodPositionUs.first) != -1) {
                return (m3Var3.getPeriodByUid(periodPositionUs.first, k3Var).f27601h && m3Var3.getWindow(k3Var.f27598e, l3Var).f27661q == m3Var3.getIndexOfPeriod(periodPositionUs.first)) ? m3Var.getPeriodPositionUs(l3Var, k3Var, m3Var.getPeriodByUid(periodPositionUs.first, k3Var).f27598e, eVar.f28103c) : periodPositionUs;
            }
            if (!z10 || (objH = H(l3Var, k3Var, i10, z11, periodPositionUs.first, m3Var3, m3Var)) == null) {
                return null;
            }
            return m3Var.getPeriodPositionUs(l3Var, k3Var, m3Var.getPeriodByUid(objH, k3Var).f27598e, C.TIME_UNSET);
        } catch (IndexOutOfBoundsException unused) {
            return null;
        }
    }

    public static Object H(l3 l3Var, k3 k3Var, int i10, boolean z10, Object obj, m3 m3Var, m3 m3Var2) {
        int indexOfPeriod = m3Var.getIndexOfPeriod(obj);
        int periodCount = m3Var.getPeriodCount();
        int i11 = 0;
        int nextPeriodIndex = indexOfPeriod;
        int indexOfPeriod2 = -1;
        while (i11 < periodCount && indexOfPeriod2 == -1) {
            l3 l3Var2 = l3Var;
            k3 k3Var2 = k3Var;
            int i12 = i10;
            boolean z11 = z10;
            m3 m3Var3 = m3Var;
            nextPeriodIndex = m3Var3.getNextPeriodIndex(nextPeriodIndex, k3Var2, l3Var2, i12, z11);
            if (nextPeriodIndex == -1) {
                break;
            }
            indexOfPeriod2 = m3Var2.getIndexOfPeriod(m3Var3.getUidOfPeriod(nextPeriodIndex));
            i11++;
            m3Var = m3Var3;
            k3Var = k3Var2;
            l3Var = l3Var2;
            i10 = i12;
            z10 = z11;
        }
        if (indexOfPeriod2 == -1) {
            return null;
        }
        return m3Var2.getUidOfPeriod(indexOfPeriod2);
    }

    public static void b(u2 u2Var) {
        if (u2Var.isCanceled()) {
            return;
        }
        try {
            u2Var.getTarget().handleMessage(u2Var.getType(), u2Var.getPayload());
        } finally {
            u2Var.markAsProcessed(true);
        }
    }

    public static boolean q(z2 z2Var) {
        return z2Var.getState() != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b1 A[PHI: r4 r5 r7
      0x00b1: PHI (r4v3 bf.d0) = (r4v2 bf.d0), (r4v6 bf.d0) binds: [B:32:0x0086, B:34:0x00ab] A[DONT_GENERATE, DONT_INLINE]
      0x00b1: PHI (r5v2 long) = (r5v1 long), (r5v16 long) binds: [B:32:0x0086, B:34:0x00ab] A[DONT_GENERATE, DONT_INLINE]
      0x00b1: PHI (r7v3 long) = (r7v2 long), (r7v8 long) binds: [B:32:0x0086, B:34:0x00ab] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f8 A[PHI: r3
      0x00f8: PHI (r3v3 com.google.android.exoplayer2.m3) = 
      (r3v2 com.google.android.exoplayer2.m3)
      (r3v2 com.google.android.exoplayer2.m3)
      (r3v7 com.google.android.exoplayer2.m3)
      (r3v7 com.google.android.exoplayer2.m3)
     binds: [B:39:0x00be, B:41:0x00c2, B:43:0x00d3, B:45:0x00ea] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A(boolean r32, boolean r33, boolean r34, boolean r35) {
        /*
            Method dump skipped, instructions count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.u0.A(boolean, boolean, boolean, boolean):void");
    }

    public final void B() {
        x1 playingPeriod = this.f28074u.getPlayingPeriod();
        this.D = playingPeriod != null && playingPeriod.f28700f.f28771h && this.C;
    }

    public final void C(long j10) throws r {
        x1 playingPeriod = this.f28074u.getPlayingPeriod();
        long rendererTime = playingPeriod == null ? j10 + 1000000000000L : playingPeriod.toRendererTime(j10);
        this.N = rendererTime;
        this.f28070q.resetPosition(rendererTime);
        for (z2 z2Var : this.f28056b) {
            if (q(z2Var)) {
                z2Var.resetPosition(this.N);
            }
        }
        for (x1 playingPeriod2 = r0.getPlayingPeriod(); playingPeriod2 != null; playingPeriod2 = playingPeriod2.getNext()) {
            for (pf.k kVar : playingPeriod2.getTrackSelectorResult().f81196c) {
                if (kVar != null) {
                    kVar.onDiscontinuity();
                }
            }
        }
    }

    public final void F(m3 m3Var, m3 m3Var2) {
        if (m3Var.isEmpty() && m3Var2.isEmpty()) {
            return;
        }
        ArrayList arrayList = this.f28071r;
        int size = arrayList.size() - 1;
        while (size >= 0) {
            m3 m3Var3 = m3Var;
            m3 m3Var4 = m3Var2;
            if (!E((b) arrayList.get(size), m3Var3, m3Var4, this.G, this.H, this.f28066m, this.f28067n)) {
                ((b) arrayList.get(size)).f28084b.markAsProcessed(false);
                arrayList.remove(size);
            }
            size--;
            m3Var = m3Var3;
            m3Var2 = m3Var4;
        }
        Collections.sort(arrayList);
    }

    public final void I(boolean z10) throws r {
        bf.d0 d0Var = this.f28074u.getPlayingPeriod().f28700f.f28764a;
        long jK = K(d0Var, this.f28079z.f27589r, true, false);
        if (jK != this.f28079z.f27589r) {
            k2 k2Var = this.f28079z;
            this.f28079z = o(d0Var, jK, k2Var.f27574c, k2Var.f27575d, z10, 5);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00a1 A[Catch: all -> 0x00a4, TryCatch #1 {all -> 0x00a4, blocks: (B:22:0x0097, B:24:0x00a1, B:31:0x00ad, B:33:0x00b3, B:34:0x00b6, B:36:0x00be, B:40:0x00d0, B:44:0x00d8), top: B:98:0x0097 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void J(com.google.android.exoplayer2.u0.e r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.u0.J(com.google.android.exoplayer2.u0$e):void");
    }

    public final long K(bf.d0 d0Var, long j10, boolean z10, boolean z11) throws r {
        c0();
        this.E = false;
        if (z11 || this.f28079z.f27576e == 3) {
            X(2);
        }
        z1 z1Var = this.f28074u;
        x1 playingPeriod = z1Var.getPlayingPeriod();
        x1 next = playingPeriod;
        while (next != null && !d0Var.equals(next.f28700f.f28764a)) {
            next = next.getNext();
        }
        if (z10 || playingPeriod != next || (next != null && next.toRendererTime(j10) < 0)) {
            z2[] z2VarArr = this.f28056b;
            for (z2 z2Var : z2VarArr) {
                c(z2Var);
            }
            if (next != null) {
                while (z1Var.getPlayingPeriod() != next) {
                    z1Var.advancePlayingPeriod();
                }
                z1Var.removeAfter(next);
                next.setRendererOffset(1000000000000L);
                e(new boolean[z2VarArr.length]);
            }
        }
        if (next != null) {
            bf.a0 a0Var = next.f28695a;
            z1Var.removeAfter(next);
            if (!next.f28698d) {
                next.f28700f = next.f28700f.copyWithStartPositionUs(j10);
            } else if (next.f28699e) {
                j10 = a0Var.seekToUs(j10);
                a0Var.discardBuffer(j10 - this.f28068o, this.f28069p);
            }
            C(j10);
            s();
        } else {
            z1Var.clear();
            C(j10);
        }
        k(false);
        this.f28063j.sendEmptyMessage(2);
        return j10;
    }

    public final void L(u2 u2Var) {
        if (u2Var.getPositionMs() == C.TIME_UNSET) {
            M(u2Var);
            return;
        }
        boolean zIsEmpty = this.f28079z.f27572a.isEmpty();
        ArrayList arrayList = this.f28071r;
        if (zIsEmpty) {
            arrayList.add(new b(u2Var));
            return;
        }
        b bVar = new b(u2Var);
        m3 m3Var = this.f28079z.f27572a;
        if (!E(bVar, m3Var, m3Var, this.G, this.H, this.f28066m, this.f28067n)) {
            u2Var.markAsProcessed(false);
        } else {
            arrayList.add(bVar);
            Collections.sort(arrayList);
        }
    }

    public final void M(u2 u2Var) {
        Looper looper = u2Var.getLooper();
        Looper looper2 = this.f28065l;
        com.google.android.exoplayer2.util.z zVar = this.f28063j;
        if (looper != looper2) {
            ((com.google.android.exoplayer2.util.e1) zVar.obtainMessage(15, u2Var)).sendToTarget();
            return;
        }
        b(u2Var);
        int i10 = this.f28079z.f27576e;
        if (i10 == 3 || i10 == 2) {
            zVar.sendEmptyMessage(2);
        }
    }

    public final void N(u2 u2Var) {
        Looper looper = u2Var.getLooper();
        if (looper.getThread().isAlive()) {
            ((com.google.android.exoplayer2.util.d1) this.f28072s).createHandler(looper, null).post(new h3(this, u2Var));
        } else {
            com.google.android.exoplayer2.util.f0.w("TAG", "Trying to send message on a dead thread.");
            u2Var.markAsProcessed(false);
        }
    }

    public final void O(boolean z10, AtomicBoolean atomicBoolean) {
        if (this.I != z10) {
            this.I = z10;
            if (!z10) {
                for (z2 z2Var : this.f28056b) {
                    if (!q(z2Var) && this.f28057c.remove(z2Var)) {
                        z2Var.reset();
                    }
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

    public final void P(t0 t0Var) throws Throwable {
        this.A.incrementPendingOperationAcks(1);
        int i10 = t0Var.f28037c;
        bf.f1 f1Var = t0Var.f28036b;
        List<f2.c> list = t0Var.f28035a;
        if (i10 != -1) {
            this.M = new e(new w2(list, f1Var), t0Var.f28037c, t0Var.f28038d);
        }
        l(this.f28075v.setMediaSources(list, f1Var), false);
    }

    public final void Q(boolean z10) {
        if (z10 == this.K) {
            return;
        }
        this.K = z10;
        if (z10 || !this.f28079z.f27586o) {
            return;
        }
        this.f28063j.sendEmptyMessage(2);
    }

    public final void R(boolean z10) throws r {
        this.C = z10;
        B();
        if (this.D) {
            z1 z1Var = this.f28074u;
            if (z1Var.getReadingPeriod() != z1Var.getPlayingPeriod()) {
                I(true);
                k(false);
            }
        }
    }

    public final void S(int i10, int i11, boolean z10, boolean z11) throws r {
        this.A.incrementPendingOperationAcks(z11 ? 1 : 0);
        this.A.setPlayWhenReadyChangeReason(i11);
        this.f28079z = this.f28079z.copyWithPlayWhenReady(z10, i10);
        this.E = false;
        for (x1 playingPeriod = this.f28074u.getPlayingPeriod(); playingPeriod != null; playingPeriod = playingPeriod.getNext()) {
            for (pf.k kVar : playingPeriod.getTrackSelectorResult().f81196c) {
                if (kVar != null) {
                    kVar.onPlayWhenReadyChanged(z10);
                }
            }
        }
        if (!Y()) {
            c0();
            e0();
            return;
        }
        int i12 = this.f28079z.f27576e;
        com.google.android.exoplayer2.util.z zVar = this.f28063j;
        if (i12 == 3) {
            a0();
            zVar.sendEmptyMessage(2);
        } else if (i12 == 2) {
            zVar.sendEmptyMessage(2);
        }
    }

    public final void T(l2 l2Var) throws r {
        this.f28063j.removeMessages(16);
        o oVar = this.f28070q;
        oVar.setPlaybackParameters(l2Var);
        l2 playbackParameters = oVar.getPlaybackParameters();
        n(playbackParameters, playbackParameters.f27637b, true, true);
    }

    public final void U(int i10) throws r {
        this.G = i10;
        if (!this.f28074u.updateRepeatMode(this.f28079z.f27572a, i10)) {
            I(true);
        }
        k(false);
    }

    public final void V(boolean z10) throws r {
        this.H = z10;
        if (!this.f28074u.updateShuffleModeEnabled(this.f28079z.f27572a, z10)) {
            I(true);
        }
        k(false);
    }

    public final void W(bf.f1 f1Var) throws Throwable {
        this.A.incrementPendingOperationAcks(1);
        l(this.f28075v.setShuffleOrder(f1Var), false);
    }

    public final void X(int i10) {
        k2 k2Var = this.f28079z;
        if (k2Var.f27576e != i10) {
            if (i10 != 2) {
                this.S = C.TIME_UNSET;
            }
            this.f28079z = k2Var.copyWithPlaybackState(i10);
        }
    }

    public final boolean Y() {
        k2 k2Var = this.f28079z;
        return k2Var.f27583l && k2Var.f27584m == 0;
    }

    public final boolean Z(m3 m3Var, bf.d0 d0Var) {
        if (!d0Var.isAd() && !m3Var.isEmpty()) {
            int i10 = m3Var.getPeriodByUid(d0Var.f9193a, this.f28067n).f27598e;
            l3 l3Var = this.f28066m;
            m3Var.getWindow(i10, l3Var);
            if (l3Var.isLive() && l3Var.f27655k && l3Var.f27652h != C.TIME_UNSET) {
                return true;
            }
        }
        return false;
    }

    public final void a(t0 t0Var, int i10) throws Throwable {
        this.A.incrementPendingOperationAcks(1);
        f2 f2Var = this.f28075v;
        if (i10 == -1) {
            i10 = f2Var.getSize();
        }
        l(f2Var.addMediaSources(i10, t0Var.f28035a, t0Var.f28036b), false);
    }

    public final void a0() throws r {
        this.E = false;
        this.f28070q.start();
        for (z2 z2Var : this.f28056b) {
            if (q(z2Var)) {
                z2Var.start();
            }
        }
    }

    public void addMediaSources(int i10, List<f2.c> list, bf.f1 f1Var) {
        ((com.google.android.exoplayer2.util.e1) this.f28063j.obtainMessage(18, i10, 0, new t0(list, -1, C.TIME_UNSET, f1Var))).sendToTarget();
    }

    public final void b0(boolean z10, boolean z11) {
        A(z10 || !this.I, false, true, false);
        this.A.incrementPendingOperationAcks(z11 ? 1 : 0);
        this.f28061h.onStopped();
        X(1);
    }

    public final void c(z2 z2Var) {
        if (q(z2Var)) {
            this.f28070q.onRendererDisabled(z2Var);
            if (z2Var.getState() == 2) {
                z2Var.stop();
            }
            z2Var.disable();
            this.L--;
        }
    }

    public final void c0() {
        this.f28070q.stop();
        for (z2 z2Var : this.f28056b) {
            if (q(z2Var) && z2Var.getState() == 2) {
                z2Var.stop();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:175:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x04af  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x053f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d() throws java.io.IOException, com.google.android.exoplayer2.r {
        /*
            Method dump skipped, instructions count: 1480
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.u0.d():void");
    }

    public final void d0() {
        x1 loadingPeriod = this.f28074u.getLoadingPeriod();
        boolean z10 = this.F || (loadingPeriod != null && loadingPeriod.f28695a.isLoading());
        k2 k2Var = this.f28079z;
        if (z10 != k2Var.f27578g) {
            this.f28079z = k2Var.copyWithIsLoading(z10);
        }
    }

    public final void e(boolean[] zArr) throws r {
        z2[] z2VarArr;
        Set set;
        z1 z1Var = this.f28074u;
        x1 readingPeriod = z1Var.getReadingPeriod();
        pf.x trackSelectorResult = readingPeriod.getTrackSelectorResult();
        int i10 = 0;
        while (true) {
            z2VarArr = this.f28056b;
            int length = z2VarArr.length;
            set = this.f28057c;
            if (i10 >= length) {
                break;
            }
            if (!trackSelectorResult.isRendererEnabled(i10) && set.remove(z2VarArr[i10])) {
                z2VarArr[i10].reset();
            }
            i10++;
        }
        for (int i11 = 0; i11 < z2VarArr.length; i11++) {
            if (trackSelectorResult.isRendererEnabled(i11)) {
                boolean z10 = zArr[i11];
                z2 z2Var = z2VarArr[i11];
                if (!q(z2Var)) {
                    x1 readingPeriod2 = z1Var.getReadingPeriod();
                    boolean z11 = readingPeriod2 == z1Var.getPlayingPeriod();
                    pf.x trackSelectorResult2 = readingPeriod2.getTrackSelectorResult();
                    c3 c3Var = trackSelectorResult2.f81195b[i11];
                    pf.k kVar = trackSelectorResult2.f81196c[i11];
                    int length2 = kVar != null ? kVar.length() : 0;
                    z0[] z0VarArr = new z0[length2];
                    for (int i12 = 0; i12 < length2; i12++) {
                        z0VarArr[i12] = kVar.getFormat(i12);
                    }
                    boolean z12 = Y() && this.f28079z.f27576e == 3;
                    boolean z13 = !z10 && z12;
                    this.L++;
                    set.add(z2Var);
                    z2Var.enable(c3Var, z0VarArr, readingPeriod2.f28697c[i11], this.N, z13, z11, readingPeriod2.getStartPositionRendererTime(), readingPeriod2.getRendererOffset());
                    z2Var.handleMessage(11, new s0(this));
                    this.f28070q.onRendererEnabled(z2Var);
                    if (z12) {
                        z2Var.start();
                    }
                }
            }
        }
        readingPeriod.f28701g = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:108:0x00ca, code lost:
    
        r9 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e0() throws com.google.android.exoplayer2.r {
        /*
            Method dump skipped, instructions count: 486
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.u0.e0():void");
    }

    public void experimentalSetForegroundModeTimeoutMs(long j10) {
        this.R = j10;
    }

    public void experimentalSetOffloadSchedulingEnabled(boolean z10) {
        ((com.google.android.exoplayer2.util.e1) this.f28063j.obtainMessage(24, z10 ? 1 : 0, 0)).sendToTarget();
    }

    public final long f(m3 m3Var, Object obj, long j10) {
        k3 k3Var = this.f28067n;
        int i10 = m3Var.getPeriodByUid(obj, k3Var).f27598e;
        l3 l3Var = this.f28066m;
        m3Var.getWindow(i10, l3Var);
        return (l3Var.f27652h != C.TIME_UNSET && l3Var.isLive() && l3Var.f27655k) ? com.google.android.exoplayer2.util.n1.msToUs(l3Var.getCurrentUnixTimeMs() - l3Var.f27652h) - (k3Var.getPositionInWindowUs() + j10) : C.TIME_UNSET;
    }

    public final void f0(m3 m3Var, bf.d0 d0Var, m3 m3Var2, bf.d0 d0Var2, long j10, boolean z10) throws r {
        boolean Z = Z(m3Var, d0Var);
        Object obj = d0Var.f9193a;
        if (!Z) {
            l2 l2Var = d0Var.isAd() ? l2.f27634f : this.f28079z.f27585n;
            o oVar = this.f28070q;
            if (oVar.getPlaybackParameters().equals(l2Var)) {
                return;
            }
            this.f28063j.removeMessages(16);
            oVar.setPlaybackParameters(l2Var);
            n(this.f28079z.f27585n, l2Var.f27637b, false, false);
            return;
        }
        k3 k3Var = this.f28067n;
        int i10 = m3Var.getPeriodByUid(obj, k3Var).f27598e;
        l3 l3Var = this.f28066m;
        m3Var.getWindow(i10, l3Var);
        n1 n1Var = (n1) com.google.android.exoplayer2.util.n1.castNonNull(l3Var.f27657m);
        l lVar = (l) this.f28076w;
        lVar.setLiveConfiguration(n1Var);
        if (j10 != C.TIME_UNSET) {
            lVar.setTargetLiveOffsetOverrideUs(f(m3Var, obj, j10));
            return;
        }
        if (!com.google.android.exoplayer2.util.n1.areEqual(!m3Var2.isEmpty() ? m3Var2.getWindow(m3Var2.getPeriodByUid(d0Var2.f9193a, k3Var).f27598e, l3Var).f27647b : null, l3Var.f27647b) || z10) {
            lVar.setTargetLiveOffsetOverrideUs(C.TIME_UNSET);
        }
    }

    public final long g() {
        x1 readingPeriod = this.f28074u.getReadingPeriod();
        if (readingPeriod == null) {
            return 0L;
        }
        long rendererOffset = readingPeriod.getRendererOffset();
        if (!readingPeriod.f28698d) {
            return rendererOffset;
        }
        int i10 = 0;
        while (true) {
            z2[] z2VarArr = this.f28056b;
            if (i10 >= z2VarArr.length) {
                return rendererOffset;
            }
            if (q(z2VarArr[i10]) && z2VarArr[i10].getStream() == readingPeriod.f28697c[i10]) {
                long readingPositionUs = z2VarArr[i10].getReadingPositionUs();
                if (readingPositionUs == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                }
                rendererOffset = Math.max(readingPositionUs, rendererOffset);
            }
            i10++;
        }
    }

    public final synchronized void g0(mh.v2 v2Var, long j10) {
        long jElapsedRealtime = ((com.google.android.exoplayer2.util.d1) this.f28072s).elapsedRealtime() + j10;
        boolean z10 = false;
        while (!((Boolean) v2Var.get()).booleanValue() && j10 > 0) {
            try {
                ((com.google.android.exoplayer2.util.d1) this.f28072s).onThreadBlocked();
                wait(j10);
            } catch (InterruptedException unused) {
                z10 = true;
            }
            j10 = jElapsedRealtime - ((com.google.android.exoplayer2.util.d1) this.f28072s).elapsedRealtime();
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
    }

    public Looper getPlaybackLooper() {
        return this.f28065l;
    }

    public final Pair h(m3 m3Var) {
        if (m3Var.isEmpty()) {
            return Pair.create(k2.getDummyPeriodForEmptyTimeline(), 0L);
        }
        Pair<Object, Long> periodPositionUs = m3Var.getPeriodPositionUs(this.f28066m, this.f28067n, m3Var.getFirstWindowIndex(this.H), C.TIME_UNSET);
        bf.d0 d0VarResolveMediaPeriodIdForAdsAfterPeriodPositionChange = this.f28074u.resolveMediaPeriodIdForAdsAfterPeriodPositionChange(m3Var, periodPositionUs.first, 0L);
        long jLongValue = ((Long) periodPositionUs.second).longValue();
        if (d0VarResolveMediaPeriodIdForAdsAfterPeriodPositionChange.isAd()) {
            Object obj = d0VarResolveMediaPeriodIdForAdsAfterPeriodPositionChange.f9193a;
            k3 k3Var = this.f28067n;
            m3Var.getPeriodByUid(obj, k3Var);
            jLongValue = d0VarResolveMediaPeriodIdForAdsAfterPeriodPositionChange.f9195c == k3Var.getFirstAdIndexToPlay(d0VarResolveMediaPeriodIdForAdsAfterPeriodPositionChange.f9194b) ? k3Var.getAdResumePositionUs() : 0L;
        }
        return Pair.create(d0VarResolveMediaPeriodIdForAdsAfterPeriodPositionChange, Long.valueOf(jLongValue));
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) throws Throwable {
        x1 readingPeriod;
        int i10;
        try {
            switch (message.what) {
                case 0:
                    w();
                    break;
                case 1:
                    S(message.arg2, 1, message.arg1 != 0, true);
                    break;
                case 2:
                    d();
                    break;
                case 3:
                    J((e) message.obj);
                    break;
                case 4:
                    T((l2) message.obj);
                    break;
                case 5:
                    this.f28078y = (e3) message.obj;
                    break;
                case 6:
                    b0(false, true);
                    break;
                case 7:
                    x();
                    return true;
                case 8:
                    m((bf.a0) message.obj);
                    break;
                case 9:
                    i((bf.a0) message.obj);
                    break;
                case 10:
                    z();
                    break;
                case 11:
                    U(message.arg1);
                    break;
                case 12:
                    V(message.arg1 != 0);
                    break;
                case 13:
                    O(message.arg1 != 0, (AtomicBoolean) message.obj);
                    break;
                case 14:
                    L((u2) message.obj);
                    break;
                case 15:
                    N((u2) message.obj);
                    break;
                case 16:
                    l2 l2Var = (l2) message.obj;
                    n(l2Var, l2Var.f27637b, true, false);
                    break;
                case 17:
                    P((t0) message.obj);
                    break;
                case 18:
                    a((t0) message.obj, message.arg1);
                    break;
                case 19:
                    v((a) message.obj);
                    break;
                case 20:
                    y(message.arg1, message.arg2, (bf.f1) message.obj);
                    break;
                case 21:
                    W((bf.f1) message.obj);
                    break;
                case 22:
                    u();
                    break;
                case 23:
                    R(message.arg1 != 0);
                    break;
                case 24:
                    Q(message.arg1 == 1);
                    break;
                case 25:
                    z();
                    I(true);
                    break;
                case 26:
                    z();
                    I(true);
                    break;
                default:
                    return false;
            }
        } catch (bf.b e10) {
            j(e10, 1002);
        } catch (h2 e11) {
            boolean z10 = e11.f27515b;
            int i11 = e11.f27516c;
            if (i11 == 1) {
                i10 = z10 ? 3001 : Sdk.SDKMetric.SDKMetricType.BANNER_AUTO_REDIRECT_NOT_OVERRIDE_URL_VALUE;
            } else {
                if (i11 == 4) {
                    i10 = z10 ? 3002 : IronSourceError.ERROR_REWARD_VALIDATION_FAILED;
                }
                j(e11, i);
            }
            i = i10;
            j(e11, i);
        } catch (r e12) {
            e = e12;
            int i12 = e.f27954j;
            z1 z1Var = this.f28074u;
            if (i12 == 1 && (readingPeriod = z1Var.getReadingPeriod()) != null) {
                e = e.a(readingPeriod.f28700f.f28764a);
            }
            if (e.f27960p && this.Q == null) {
                com.google.android.exoplayer2.util.f0.w("ExoPlayerImplInternal", "Recoverable renderer error", e);
                this.Q = e;
                com.google.android.exoplayer2.util.z zVar = this.f28063j;
                zVar.sendMessageAtFrontOfQueue(zVar.obtainMessage(25, e));
            } else {
                r rVar = this.Q;
                if (rVar != null) {
                    rVar.addSuppressed(e);
                    e = this.Q;
                }
                com.google.android.exoplayer2.util.f0.e("ExoPlayerImplInternal", "Playback error", e);
                if (e.f27954j == 1 && z1Var.getPlayingPeriod() != z1Var.getReadingPeriod()) {
                    while (z1Var.getPlayingPeriod() != z1Var.getReadingPeriod()) {
                        z1Var.advancePlayingPeriod();
                    }
                    y1 y1Var = ((x1) com.google.android.exoplayer2.util.a.checkNotNull(z1Var.getPlayingPeriod())).f28700f;
                    bf.d0 d0Var = y1Var.f28764a;
                    long j10 = y1Var.f28765b;
                    this.f28079z = o(d0Var, j10, y1Var.f28766c, j10, true, 0);
                }
                b0(true, false);
                this.f28079z = this.f28079z.copyWithPlaybackError(e);
            }
        } catch (de.m e13) {
            j(e13, e13.f52151b);
        } catch (qf.q e14) {
            j(e14, e14.f82967b);
        } catch (IOException e15) {
            j(e15, 2000);
        } catch (RuntimeException e16) {
            r rVarCreateForUnexpected = r.createForUnexpected(e16, ((e16 instanceof IllegalStateException) || (e16 instanceof IllegalArgumentException)) ? 1004 : 1000);
            com.google.android.exoplayer2.util.f0.e("ExoPlayerImplInternal", "Playback error", rVarCreateForUnexpected);
            b0(true, false);
            this.f28079z = this.f28079z.copyWithPlaybackError(rVarCreateForUnexpected);
        }
        t();
        return true;
    }

    public final void i(bf.a0 a0Var) {
        z1 z1Var = this.f28074u;
        if (z1Var.isLoading(a0Var)) {
            z1Var.reevaluateBuffer(this.N);
            s();
        }
    }

    public final void j(IOException iOException, int i10) {
        r rVarCreateForSource = r.createForSource(iOException, i10);
        x1 playingPeriod = this.f28074u.getPlayingPeriod();
        if (playingPeriod != null) {
            rVarCreateForSource = rVarCreateForSource.a(playingPeriod.f28700f.f28764a);
        }
        com.google.android.exoplayer2.util.f0.e("ExoPlayerImplInternal", "Playback error", rVarCreateForSource);
        b0(false, false);
        this.f28079z = this.f28079z.copyWithPlaybackError(rVarCreateForSource);
    }

    public final void k(boolean z10) {
        x1 loadingPeriod = this.f28074u.getLoadingPeriod();
        bf.d0 d0Var = loadingPeriod == null ? this.f28079z.f27573b : loadingPeriod.f28700f.f28764a;
        boolean zEquals = this.f28079z.f27582k.equals(d0Var);
        if (!zEquals) {
            this.f28079z = this.f28079z.copyWithLoadingMediaPeriodId(d0Var);
        }
        k2 k2Var = this.f28079z;
        k2Var.f27587p = loadingPeriod == null ? k2Var.f27589r : loadingPeriod.getBufferedPositionUs();
        k2 k2Var2 = this.f28079z;
        long j10 = k2Var2.f27587p;
        x1 loadingPeriod2 = this.f28074u.getLoadingPeriod();
        k2Var2.f27588q = loadingPeriod2 != null ? Math.max(0L, j10 - loadingPeriod2.toPeriodTime(this.N)) : 0L;
        if ((!zEquals || z10) && loadingPeriod != null && loadingPeriod.f28698d) {
            this.f28061h.onTracksSelected(this.f28079z.f27572a, loadingPeriod.f28700f.f28764a, this.f28056b, loadingPeriod.getTrackGroups(), loadingPeriod.getTrackSelectorResult().f81196c);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01fd  */
    /* JADX WARN: Type inference failed for: r18v11 */
    /* JADX WARN: Type inference failed for: r18v12 */
    /* JADX WARN: Type inference failed for: r18v5 */
    /* JADX WARN: Type inference failed for: r18v7 */
    /* JADX WARN: Type inference failed for: r18v8 */
    /* JADX WARN: Type inference failed for: r22v11 */
    /* JADX WARN: Type inference failed for: r22v12 */
    /* JADX WARN: Type inference failed for: r22v13 */
    /* JADX WARN: Type inference failed for: r22v14 */
    /* JADX WARN: Type inference failed for: r22v17, types: [long] */
    /* JADX WARN: Type inference failed for: r22v20 */
    /* JADX WARN: Type inference failed for: r22v21 */
    /* JADX WARN: Type inference failed for: r22v4 */
    /* JADX WARN: Type inference failed for: r22v9 */
    /* JADX WARN: Type inference failed for: r2v43, types: [com.google.android.exoplayer2.z1] */
    /* JADX WARN: Type inference failed for: r30v0, types: [com.google.android.exoplayer2.u0] */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v31, types: [com.google.android.exoplayer2.m3] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(com.google.android.exoplayer2.m3 r31, boolean r32) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1018
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.u0.l(com.google.android.exoplayer2.m3, boolean):void");
    }

    public final void m(bf.a0 a0Var) throws r {
        z1 z1Var = this.f28074u;
        if (z1Var.isLoading(a0Var)) {
            x1 loadingPeriod = z1Var.getLoadingPeriod();
            loadingPeriod.handlePrepared(this.f28070q.getPlaybackParameters().f27637b, this.f28079z.f27572a);
            bf.d0 d0Var = loadingPeriod.f28700f.f28764a;
            bf.n1 trackGroups = loadingPeriod.getTrackGroups();
            pf.x trackSelectorResult = loadingPeriod.getTrackSelectorResult();
            this.f28061h.onTracksSelected(this.f28079z.f27572a, d0Var, this.f28056b, trackGroups, trackSelectorResult.f81196c);
            if (loadingPeriod == z1Var.getPlayingPeriod()) {
                C(loadingPeriod.f28700f.f28765b);
                e(new boolean[this.f28056b.length]);
                k2 k2Var = this.f28079z;
                bf.d0 d0Var2 = k2Var.f27573b;
                long j10 = loadingPeriod.f28700f.f28765b;
                this.f28079z = o(d0Var2, j10, k2Var.f27574c, j10, false, 5);
            }
            s();
        }
    }

    public void moveMediaSources(int i10, int i11, int i12, bf.f1 f1Var) {
        ((com.google.android.exoplayer2.util.e1) this.f28063j.obtainMessage(19, new a(i10, i11, i12, f1Var))).sendToTarget();
    }

    public final void n(l2 l2Var, float f10, boolean z10, boolean z11) throws r {
        int i10;
        if (z10) {
            if (z11) {
                this.A.incrementPendingOperationAcks(1);
            }
            this.f28079z = this.f28079z.copyWithPlaybackParameters(l2Var);
        }
        float f11 = l2Var.f27637b;
        x1 playingPeriod = this.f28074u.getPlayingPeriod();
        while (true) {
            i10 = 0;
            if (playingPeriod == null) {
                break;
            }
            pf.k[] kVarArr = playingPeriod.getTrackSelectorResult().f81196c;
            int length = kVarArr.length;
            while (i10 < length) {
                pf.k kVar = kVarArr[i10];
                if (kVar != null) {
                    kVar.onPlaybackSpeed(f11);
                }
                i10++;
            }
            playingPeriod = playingPeriod.getNext();
        }
        z2[] z2VarArr = this.f28056b;
        int length2 = z2VarArr.length;
        while (i10 < length2) {
            z2 z2Var = z2VarArr[i10];
            if (z2Var != null) {
                z2Var.setPlaybackSpeed(f10, l2Var.f27637b);
            }
            i10++;
        }
    }

    public final k2 o(bf.d0 d0Var, long j10, long j11, long j12, boolean z10, int i10) {
        List<Metadata> list;
        this.P = (!this.P && j10 == this.f28079z.f27589r && d0Var.equals(this.f28079z.f27573b)) ? false : true;
        B();
        k2 k2Var = this.f28079z;
        bf.n1 trackGroups = k2Var.f27579h;
        pf.x trackSelectorResult = k2Var.f27580i;
        List<Metadata> listOf = k2Var.f27581j;
        if (this.f28075v.isPrepared()) {
            x1 playingPeriod = this.f28074u.getPlayingPeriod();
            trackGroups = playingPeriod == null ? bf.n1.f9354f : playingPeriod.getTrackGroups();
            trackSelectorResult = playingPeriod == null ? this.f28060g : playingPeriod.getTrackSelectorResult();
            pf.k[] kVarArr = trackSelectorResult.f81196c;
            x4 x4Var = new x4();
            boolean z11 = false;
            for (pf.k kVar : kVarArr) {
                if (kVar != null) {
                    Metadata metadata = kVar.getFormat(0).f28800l;
                    if (metadata == null) {
                        x4Var.add((Object) new Metadata(new Metadata.Entry[0]));
                    } else {
                        x4Var.add((Object) metadata);
                        z11 = true;
                    }
                }
            }
            b5 b5VarBuild = z11 ? x4Var.build() : b5.of();
            if (playingPeriod != null) {
                y1 y1Var = playingPeriod.f28700f;
                if (y1Var.f28766c != j11) {
                    playingPeriod.f28700f = y1Var.copyWithRequestedContentPositionUs(j11);
                }
            }
            list = b5VarBuild;
        } else {
            if (!d0Var.equals(this.f28079z.f27573b)) {
                trackGroups = bf.n1.f9354f;
                trackSelectorResult = this.f28060g;
                listOf = b5.of();
            }
            list = listOf;
        }
        bf.n1 n1Var = trackGroups;
        pf.x xVar = trackSelectorResult;
        if (z10) {
            this.A.setPositionDiscontinuity(i10);
        }
        k2 k2Var2 = this.f28079z;
        long j13 = k2Var2.f27587p;
        x1 loadingPeriod = this.f28074u.getLoadingPeriod();
        return k2Var2.copyWithNewPosition(d0Var, j10, j11, j12, loadingPeriod != null ? Math.max(0L, j13 - loadingPeriod.toPeriodTime(this.N)) : 0L, n1Var, xVar, list);
    }

    @Override // com.google.android.exoplayer2.n
    public void onPlaybackParametersChanged(l2 l2Var) {
        ((com.google.android.exoplayer2.util.e1) this.f28063j.obtainMessage(16, l2Var)).sendToTarget();
    }

    @Override // com.google.android.exoplayer2.g2
    public void onPlaylistUpdateRequested() {
        this.f28063j.sendEmptyMessage(22);
    }

    @Override // bf.z
    public void onPrepared(bf.a0 a0Var) {
        ((com.google.android.exoplayer2.util.e1) this.f28063j.obtainMessage(8, a0Var)).sendToTarget();
    }

    @Override // pf.v
    public void onRendererCapabilitiesChanged(z2 z2Var) {
        this.f28063j.sendEmptyMessage(26);
    }

    @Override // pf.v
    public void onTrackSelectionsInvalidated() {
        this.f28063j.sendEmptyMessage(10);
    }

    public final boolean p() {
        x1 loadingPeriod = this.f28074u.getLoadingPeriod();
        return (loadingPeriod == null || loadingPeriod.getNextLoadPositionUs() == Long.MIN_VALUE) ? false : true;
    }

    public void prepare() {
        ((com.google.android.exoplayer2.util.e1) this.f28063j.obtainMessage(0)).sendToTarget();
    }

    public final boolean r() {
        x1 playingPeriod = this.f28074u.getPlayingPeriod();
        long j10 = playingPeriod.f28700f.f28768e;
        if (playingPeriod.f28698d) {
            return j10 == C.TIME_UNSET || this.f28079z.f27589r < j10 || !Y();
        }
        return false;
    }

    public synchronized boolean release() {
        if (!this.B && this.f28065l.getThread().isAlive()) {
            this.f28063j.sendEmptyMessage(7);
            g0(new u(this, 6), this.f28077x);
            return this.B;
        }
        return true;
    }

    public void removeMediaSources(int i10, int i11, bf.f1 f1Var) {
        ((com.google.android.exoplayer2.util.e1) this.f28063j.obtainMessage(20, i10, i11, f1Var)).sendToTarget();
    }

    public final void s() {
        boolean zShouldContinueLoading = false;
        if (p()) {
            x1 loadingPeriod = this.f28074u.getLoadingPeriod();
            long nextLoadPositionUs = loadingPeriod.getNextLoadPositionUs();
            x1 loadingPeriod2 = this.f28074u.getLoadingPeriod();
            long jMax = loadingPeriod2 == null ? 0L : Math.max(0L, nextLoadPositionUs - loadingPeriod2.toPeriodTime(this.N));
            long periodTime = loadingPeriod == this.f28074u.getPlayingPeriod() ? loadingPeriod.toPeriodTime(this.N) : loadingPeriod.toPeriodTime(this.N) - loadingPeriod.f28700f.f28765b;
            boolean zShouldContinueLoading2 = this.f28061h.shouldContinueLoading(periodTime, jMax, this.f28070q.getPlaybackParameters().f27637b);
            if (zShouldContinueLoading2 || jMax >= 500000 || (this.f28068o <= 0 && !this.f28069p)) {
                zShouldContinueLoading = zShouldContinueLoading2;
            } else {
                this.f28074u.getPlayingPeriod().f28695a.discardBuffer(this.f28079z.f27589r, false);
                zShouldContinueLoading = this.f28061h.shouldContinueLoading(periodTime, jMax, this.f28070q.getPlaybackParameters().f27637b);
            }
        }
        this.F = zShouldContinueLoading;
        if (zShouldContinueLoading) {
            this.f28074u.getLoadingPeriod().continueLoading(this.N);
        }
        d0();
    }

    public void seekTo(m3 m3Var, int i10, long j10) {
        ((com.google.android.exoplayer2.util.e1) this.f28063j.obtainMessage(3, new e(m3Var, i10, j10))).sendToTarget();
    }

    @Override // com.google.android.exoplayer2.s2
    public synchronized void sendMessage(u2 u2Var) {
        if (!this.B && this.f28065l.getThread().isAlive()) {
            ((com.google.android.exoplayer2.util.e1) this.f28063j.obtainMessage(14, u2Var)).sendToTarget();
            return;
        }
        com.google.android.exoplayer2.util.f0.w("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        u2Var.markAsProcessed(false);
    }

    public synchronized boolean setForegroundMode(boolean z10) {
        if (!this.B && this.f28065l.getThread().isAlive()) {
            if (z10) {
                ((com.google.android.exoplayer2.util.e1) this.f28063j.obtainMessage(13, 1, 0)).sendToTarget();
                return true;
            }
            AtomicBoolean atomicBoolean = new AtomicBoolean();
            ((com.google.android.exoplayer2.util.e1) this.f28063j.obtainMessage(13, 0, 0, atomicBoolean)).sendToTarget();
            g0(new u(atomicBoolean, 5), this.R);
            return atomicBoolean.get();
        }
        return true;
    }

    public void setMediaSources(List<f2.c> list, int i10, long j10, bf.f1 f1Var) {
        ((com.google.android.exoplayer2.util.e1) this.f28063j.obtainMessage(17, new t0(list, i10, j10, f1Var))).sendToTarget();
    }

    public void setPauseAtEndOfWindow(boolean z10) {
        ((com.google.android.exoplayer2.util.e1) this.f28063j.obtainMessage(23, z10 ? 1 : 0, 0)).sendToTarget();
    }

    public void setPlayWhenReady(boolean z10, int i10) {
        ((com.google.android.exoplayer2.util.e1) this.f28063j.obtainMessage(1, z10 ? 1 : 0, i10)).sendToTarget();
    }

    public void setPlaybackParameters(l2 l2Var) {
        ((com.google.android.exoplayer2.util.e1) this.f28063j.obtainMessage(4, l2Var)).sendToTarget();
    }

    public void setRepeatMode(int i10) {
        ((com.google.android.exoplayer2.util.e1) this.f28063j.obtainMessage(11, i10, 0)).sendToTarget();
    }

    public void setSeekParameters(e3 e3Var) {
        ((com.google.android.exoplayer2.util.e1) this.f28063j.obtainMessage(5, e3Var)).sendToTarget();
    }

    public void setShuffleModeEnabled(boolean z10) {
        ((com.google.android.exoplayer2.util.e1) this.f28063j.obtainMessage(12, z10 ? 1 : 0, 0)).sendToTarget();
    }

    public void setShuffleOrder(bf.f1 f1Var) {
        ((com.google.android.exoplayer2.util.e1) this.f28063j.obtainMessage(21, f1Var)).sendToTarget();
    }

    public void stop() {
        ((com.google.android.exoplayer2.util.e1) this.f28063j.obtainMessage(6)).sendToTarget();
    }

    public final void t() {
        this.A.setPlaybackInfo(this.f28079z);
        c cVar = this.A;
        if (cVar.f28088a) {
            ((i0) this.f28073t).onPlaybackInfoUpdate(cVar);
            this.A = new c(this.f28079z);
        }
    }

    public final void u() throws Throwable {
        l(this.f28075v.createTimeline(), true);
    }

    public final void v(a aVar) throws Throwable {
        this.A.incrementPendingOperationAcks(1);
        l(this.f28075v.moveMediaSourceRange(aVar.f28080a, aVar.f28081b, aVar.f28082c, aVar.f28083d), false);
    }

    public final void w() {
        this.A.incrementPendingOperationAcks(1);
        A(false, false, false, true);
        this.f28061h.onPrepared();
        X(this.f28079z.f27572a.isEmpty() ? 4 : 2);
        this.f28075v.prepare(((qf.x) this.f28062i).getTransferListener());
        this.f28063j.sendEmptyMessage(2);
    }

    public final void x() {
        A(true, false, true, false);
        z2[] z2VarArr = this.f28056b;
        for (int i10 = 0; i10 < z2VarArr.length; i10++) {
            this.f28058e[i10].clearListener();
            z2VarArr[i10].release();
        }
        this.f28061h.onReleased();
        X(1);
        HandlerThread handlerThread = this.f28064k;
        if (handlerThread != null) {
            handlerThread.quit();
        }
        synchronized (this) {
            this.B = true;
            notifyAll();
        }
    }

    public final void y(int i10, int i11, bf.f1 f1Var) throws Throwable {
        this.A.incrementPendingOperationAcks(1);
        l(this.f28075v.removeMediaSourceRange(i10, i11, f1Var), false);
    }

    public final void z() throws r {
        int i10;
        float f10 = this.f28070q.getPlaybackParameters().f27637b;
        x1 readingPeriod = this.f28074u.getReadingPeriod();
        boolean z10 = true;
        for (x1 playingPeriod = this.f28074u.getPlayingPeriod(); playingPeriod != null && playingPeriod.f28698d; playingPeriod = playingPeriod.getNext()) {
            pf.x xVarSelectTracks = playingPeriod.selectTracks(f10, this.f28079z.f27572a);
            if (!xVarSelectTracks.isEquivalent(playingPeriod.getTrackSelectorResult())) {
                if (z10) {
                    x1 playingPeriod2 = this.f28074u.getPlayingPeriod();
                    boolean zRemoveAfter = this.f28074u.removeAfter(playingPeriod2);
                    boolean[] zArr = new boolean[this.f28056b.length];
                    long jApplyTrackSelection = playingPeriod2.applyTrackSelection(xVarSelectTracks, this.f28079z.f27589r, zRemoveAfter, zArr);
                    k2 k2Var = this.f28079z;
                    boolean z11 = (k2Var.f27576e == 4 || jApplyTrackSelection == k2Var.f27589r) ? false : true;
                    k2 k2Var2 = this.f28079z;
                    i10 = 4;
                    this.f28079z = o(k2Var2.f27573b, jApplyTrackSelection, k2Var2.f27574c, k2Var2.f27575d, z11, 5);
                    if (z11) {
                        C(jApplyTrackSelection);
                    }
                    boolean[] zArr2 = new boolean[this.f28056b.length];
                    int i11 = 0;
                    while (true) {
                        z2[] z2VarArr = this.f28056b;
                        if (i11 >= z2VarArr.length) {
                            break;
                        }
                        z2 z2Var = z2VarArr[i11];
                        boolean zQ = q(z2Var);
                        zArr2[i11] = zQ;
                        bf.b1 b1Var = playingPeriod2.f28697c[i11];
                        if (zQ) {
                            if (b1Var != z2Var.getStream()) {
                                c(z2Var);
                            } else if (zArr[i11]) {
                                z2Var.resetPosition(this.N);
                            }
                        }
                        i11++;
                    }
                    e(zArr2);
                } else {
                    i10 = 4;
                    this.f28074u.removeAfter(playingPeriod);
                    if (playingPeriod.f28698d) {
                        playingPeriod.applyTrackSelection(xVarSelectTracks, Math.max(playingPeriod.f28700f.f28765b, playingPeriod.toPeriodTime(this.N)), false);
                    }
                }
                k(true);
                if (this.f28079z.f27576e != i10) {
                    s();
                    e0();
                    this.f28063j.sendEmptyMessage(2);
                    return;
                }
                return;
            }
            if (playingPeriod == readingPeriod) {
                z10 = false;
            }
        }
    }

    @Override // bf.z, bf.c1
    public void onContinueLoadingRequested(bf.a0 a0Var) {
        ((com.google.android.exoplayer2.util.e1) this.f28063j.obtainMessage(9, a0Var)).sendToTarget();
    }
}
