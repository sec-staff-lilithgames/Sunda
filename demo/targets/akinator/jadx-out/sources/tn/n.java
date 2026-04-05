package tn;

import android.os.Looper;
import ao.k0;
import ao.r0;
import ao.t1;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import gn.i0;
import gn.j0;
import gn.p0;
import gn.q0;
import gn.u1;
import io.bidmachine.media3.common.util.a1;
import java.io.IOException;
import java.util.List;
import java.util.Objects;
import ln.g0;
import nh.b5;
import on.f0;
import vn.f;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class n extends ao.a implements vn.p {

    /* renamed from: h, reason: collision with root package name */
    public final i f87259h;

    /* renamed from: i, reason: collision with root package name */
    public final h f87260i;

    /* renamed from: j, reason: collision with root package name */
    public final ao.l f87261j;

    /* renamed from: k, reason: collision with root package name */
    public final sn.v f87262k;

    /* renamed from: l, reason: collision with root package name */
    public final go.t f87263l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f87264m;

    /* renamed from: n, reason: collision with root package name */
    public final int f87265n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f87266o;

    /* renamed from: p, reason: collision with root package name */
    public final vn.d f87267p;

    /* renamed from: q, reason: collision with root package name */
    public final long f87268q;

    /* renamed from: r, reason: collision with root package name */
    public final long f87269r;

    /* renamed from: s, reason: collision with root package name */
    public i0 f87270s;

    /* renamed from: t, reason: collision with root package name */
    public g0 f87271t;

    /* renamed from: u, reason: collision with root package name */
    public p0 f87272u;

    static {
        q0.registerModule("media3.exoplayer.hls");
    }

    public n(p0 p0Var, h hVar, i iVar, ao.l lVar, sn.v vVar, go.t tVar, vn.d dVar, long j10, boolean z10, int i10, boolean z11, long j11) {
        this.f87272u = p0Var;
        this.f87270s = p0Var.f58054c;
        this.f87260i = hVar;
        this.f87259h = iVar;
        this.f87261j = lVar;
        this.f87262k = vVar;
        this.f87263l = tVar;
        this.f87267p = dVar;
        this.f87268q = j10;
        this.f87264m = z10;
        this.f87265n = i10;
        this.f87266o = z11;
        this.f87269r = j11;
    }

    public static f.c g(List list, long j10) {
        f.c cVar = null;
        for (int i10 = 0; i10 < list.size(); i10++) {
            f.c cVar2 = (f.c) list.get(i10);
            long j11 = cVar2.f89421g;
            if (j11 > j10 || !cVar2.f89405n) {
                if (j11 > j10) {
                    break;
                }
            } else {
                cVar = cVar2;
            }
        }
        return cVar;
    }

    @Override // ao.a, ao.m0
    public boolean canUpdateMediaItem(p0 p0Var) {
        p0 mediaItem = getMediaItem();
        j0 j0Var = (j0) io.bidmachine.media3.common.util.a.checkNotNull(mediaItem.f58053b);
        j0 j0Var2 = p0Var.f58053b;
        return j0Var2 != null && j0Var2.f57963a.equals(j0Var.f57963a) && j0Var2.f57967e.equals(j0Var.f57967e) && Objects.equals(j0Var2.f57965c, j0Var.f57965c) && mediaItem.f58054c.equals(p0Var.f58054c);
    }

    @Override // ao.a, ao.m0
    public ao.i0 createPeriod(k0 k0Var, go.c cVar, long j10) {
        r0 r0VarA = a(k0Var);
        sn.q qVarWithParameters = this.f7534d.withParameters(0, k0Var);
        return new m(this.f87259h, this.f87267p, this.f87260i, this.f87271t, null, this.f87262k, qVarWithParameters, this.f87263l, r0VarA, cVar, this.f87261j, this.f87264m, this.f87265n, this.f87266o, d(), this.f87269r);
    }

    @Override // ao.a
    public final void e(g0 g0Var) {
        this.f87271t = g0Var;
        Looper looper = (Looper) io.bidmachine.media3.common.util.a.checkNotNull(Looper.myLooper());
        f0 f0VarD = d();
        sn.v vVar = this.f87262k;
        vVar.setPlayer(looper, f0VarD);
        vVar.prepare();
        r0 r0VarA = a(null);
        this.f87267p.start(((j0) io.bidmachine.media3.common.util.a.checkNotNull(getMediaItem().f58053b)).f57963a, r0VarA, this);
    }

    @Override // ao.a, ao.m0
    public /* bridge */ /* synthetic */ u1 getInitialTimeline() {
        return super.getInitialTimeline();
    }

    @Override // ao.a, ao.m0
    public synchronized p0 getMediaItem() {
        return this.f87272u;
    }

    @Override // ao.a, ao.m0
    public /* bridge */ /* synthetic */ boolean isSingleWindow() {
        return super.isSingleWindow();
    }

    @Override // ao.a, ao.m0
    public void maybeThrowSourceInfoRefreshError() throws IOException {
        this.f87267p.maybeThrowPrimaryPlaylistRefreshError();
    }

    @Override // vn.p
    public void onPrimaryPlaylistRefreshed(vn.f fVar) {
        long j10;
        t1 t1Var;
        long j11;
        boolean z10;
        long jMsToUs;
        long j12;
        long j13;
        boolean z11 = fVar.f89379p;
        boolean z12 = fVar.f89370g;
        b5 b5Var = fVar.f89381r;
        long j14 = fVar.f89384u;
        long jMsToUs2 = fVar.f89368e;
        int i10 = fVar.f89367d;
        long j15 = fVar.f89371h;
        long jUsToMs = z11 ? a1.usToMs(j15) : C.TIME_UNSET;
        long j16 = (i10 == 2 || i10 == 1) ? jUsToMs : C.TIME_UNSET;
        vn.d dVar = this.f87267p;
        com.bumptech.glide.f fVar2 = new com.bumptech.glide.f();
        if (dVar.isLive()) {
            f.C0801f c0801f = fVar.f89385v;
            long initialStartTimeUs = j15 - dVar.getInitialStartTimeUs();
            boolean z13 = fVar.f89378o;
            long j17 = z13 ? initialStartTimeUs + j14 : -9223372036854775807L;
            long jMsToUs3 = fVar.f89379p ? a1.msToUs(a1.getNowUnixTimeMs(this.f87268q)) - fVar.getEndTimeUs() : 0L;
            long j18 = this.f87270s.f57944a;
            if (j18 != C.TIME_UNSET) {
                jMsToUs = a1.msToUs(j18);
                z10 = z12;
            } else {
                if (jMsToUs2 != C.TIME_UNSET) {
                    j11 = j14 - jMsToUs2;
                    z10 = z12;
                } else {
                    j11 = c0801f.f89415d;
                    if (j11 != C.TIME_UNSET) {
                        z10 = z12;
                        if (fVar.f89377n == C.TIME_UNSET) {
                        }
                    } else {
                        z10 = z12;
                    }
                    j11 = c0801f.f89414c;
                    if (j11 == C.TIME_UNSET) {
                        j11 = fVar.f89376m * 3;
                    }
                }
                jMsToUs = j11 + jMsToUs3;
            }
            long j19 = j14 + jMsToUs3;
            long jConstrainValue = a1.constrainValue(jMsToUs, jMsToUs3, j19);
            i0 i0Var = getMediaItem().f58054c;
            boolean z14 = i0Var.f57947d == -3.4028235E38f && i0Var.f57948e == -3.4028235E38f && c0801f.f89414c == C.TIME_UNSET && c0801f.f89415d == C.TIME_UNSET;
            i0 i0VarBuild = new i0.a().setTargetOffsetMs(a1.usToMs(jConstrainValue)).setMinPlaybackSpeed(z14 ? 1.0f : this.f87270s.f57947d).setMaxPlaybackSpeed(z14 ? 1.0f : this.f87270s.f57948e).build();
            this.f87270s = i0VarBuild;
            if (jMsToUs2 == C.TIME_UNSET) {
                jMsToUs2 = j19 - a1.msToUs(i0VarBuild.f57944a);
            }
            if (z10) {
                j13 = jMsToUs2;
            } else {
                f.c cVarG = g(fVar.f89382s, jMsToUs2);
                if (cVarG != null) {
                    j12 = cVarG.f89421g;
                } else if (b5Var.isEmpty()) {
                    j13 = 0;
                } else {
                    f.e eVar = (f.e) b5Var.get(a1.binarySearchFloor((List<? extends Comparable<? super Long>>) b5Var, Long.valueOf(jMsToUs2), true, true));
                    f.c cVarG2 = g(eVar.f89411o, jMsToUs2);
                    j12 = cVarG2 != null ? cVarG2.f89421g : eVar.f89421g;
                }
                j13 = j12;
            }
            t1Var = new t1(j16, jUsToMs, C.TIME_UNSET, j17, fVar.f89384u, initialStartTimeUs, j13, true, !z13, i10 == 2 && fVar.f89369f, fVar2, getMediaItem(), this.f87270s);
        } else {
            if (jMsToUs2 == C.TIME_UNSET || b5Var.isEmpty()) {
                j10 = 0;
            } else {
                if (!z12 && jMsToUs2 != j14) {
                    jMsToUs2 = ((f.e) b5Var.get(a1.binarySearchFloor((List<? extends Comparable<? super Long>>) b5Var, Long.valueOf(jMsToUs2), true, true))).f89421g;
                }
                j10 = jMsToUs2;
            }
            long j20 = fVar.f89384u;
            t1Var = new t1(j16, jUsToMs, C.TIME_UNSET, j20, j20, 0L, j10, true, false, true, fVar2, getMediaItem(), null);
        }
        f(t1Var);
    }

    @Override // ao.a, ao.m0
    public void releasePeriod(ao.i0 i0Var) {
        ((m) i0Var).release();
    }

    @Override // ao.a
    public final void releaseSourceInternal() {
        this.f87267p.stop();
        this.f87262k.release();
    }

    @Override // ao.a, ao.m0
    public synchronized void updateMediaItem(p0 p0Var) {
        this.f87272u = p0Var;
    }
}
