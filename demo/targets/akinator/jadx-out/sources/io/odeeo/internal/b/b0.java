package io.odeeo.internal.b;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import io.odeeo.internal.a0.t;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final io.odeeo.internal.a0.r f62617a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f62618b;

    /* renamed from: c, reason: collision with root package name */
    public final io.odeeo.internal.a0.d0[] f62619c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f62620d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f62621e;

    /* renamed from: f, reason: collision with root package name */
    public c0 f62622f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f62623g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f62624h;

    /* renamed from: i, reason: collision with root package name */
    public final q0[] f62625i;

    /* renamed from: j, reason: collision with root package name */
    public final io.odeeo.internal.n0.k f62626j;

    /* renamed from: k, reason: collision with root package name */
    public final f0 f62627k;

    /* renamed from: l, reason: collision with root package name */
    public b0 f62628l;

    /* renamed from: m, reason: collision with root package name */
    public io.odeeo.internal.a0.l0 f62629m;

    /* renamed from: n, reason: collision with root package name */
    public io.odeeo.internal.n0.l f62630n;

    /* renamed from: o, reason: collision with root package name */
    public long f62631o;

    public b0(q0[] q0VarArr, long j10, io.odeeo.internal.n0.k kVar, io.odeeo.internal.p0.b bVar, f0 f0Var, c0 c0Var, io.odeeo.internal.n0.l lVar) {
        this.f62625i = q0VarArr;
        this.f62631o = j10;
        this.f62626j = kVar;
        this.f62627k = f0Var;
        t.a aVar = c0Var.f62647a;
        this.f62618b = aVar.f62447a;
        this.f62622f = c0Var;
        this.f62629m = io.odeeo.internal.a0.l0.f62399d;
        this.f62630n = lVar;
        this.f62619c = new io.odeeo.internal.a0.d0[q0VarArr.length];
        this.f62624h = new boolean[q0VarArr.length];
        this.f62617a = a(aVar, f0Var, bVar, c0Var.f62648b, c0Var.f62650d);
    }

    public final void a() {
        if (!c()) {
            return;
        }
        int i10 = 0;
        while (true) {
            io.odeeo.internal.n0.l lVar = this.f62630n;
            if (i10 >= lVar.f65055a) {
                return;
            }
            boolean zIsRendererEnabled = lVar.isRendererEnabled(i10);
            io.odeeo.internal.n0.d dVar = this.f62630n.f65057c[i10];
            if (zIsRendererEnabled && dVar != null) {
                dVar.disable();
            }
            i10++;
        }
    }

    public long applyTrackSelection(io.odeeo.internal.n0.l lVar, long j10, boolean z10) {
        return applyTrackSelection(lVar, j10, z10, new boolean[this.f62625i.length]);
    }

    public final void b() {
        if (!c()) {
            return;
        }
        int i10 = 0;
        while (true) {
            io.odeeo.internal.n0.l lVar = this.f62630n;
            if (i10 >= lVar.f65055a) {
                return;
            }
            boolean zIsRendererEnabled = lVar.isRendererEnabled(i10);
            io.odeeo.internal.n0.d dVar = this.f62630n.f65057c[i10];
            if (zIsRendererEnabled && dVar != null) {
                dVar.enable();
            }
            i10++;
        }
    }

    public final boolean c() {
        return this.f62628l == null;
    }

    public void continueLoading(long j10) {
        io.odeeo.internal.q0.a.checkState(c());
        this.f62617a.continueLoading(toPeriodTime(j10));
    }

    public long getBufferedPositionUs() {
        if (!this.f62620d) {
            return this.f62622f.f62648b;
        }
        long bufferedPositionUs = this.f62621e ? this.f62617a.getBufferedPositionUs() : Long.MIN_VALUE;
        return bufferedPositionUs == Long.MIN_VALUE ? this.f62622f.f62651e : bufferedPositionUs;
    }

    public b0 getNext() {
        return this.f62628l;
    }

    public long getNextLoadPositionUs() {
        if (this.f62620d) {
            return this.f62617a.getNextLoadPositionUs();
        }
        return 0L;
    }

    public long getRendererOffset() {
        return this.f62631o;
    }

    public long getStartPositionRendererTime() {
        return this.f62622f.f62648b + this.f62631o;
    }

    public io.odeeo.internal.a0.l0 getTrackGroups() {
        return this.f62629m;
    }

    public io.odeeo.internal.n0.l getTrackSelectorResult() {
        return this.f62630n;
    }

    public void handlePrepared(float f10, y0 y0Var) throws n {
        this.f62620d = true;
        this.f62629m = this.f62617a.getTrackGroups();
        io.odeeo.internal.n0.l lVarSelectTracks = selectTracks(f10, y0Var);
        c0 c0Var = this.f62622f;
        long jMax = c0Var.f62648b;
        long j10 = c0Var.f62651e;
        if (j10 != C.TIME_UNSET && jMax >= j10) {
            jMax = Math.max(0L, j10 - 1);
        }
        long jApplyTrackSelection = applyTrackSelection(lVarSelectTracks, jMax, false);
        long j11 = this.f62631o;
        c0 c0Var2 = this.f62622f;
        this.f62631o = (c0Var2.f62648b - jApplyTrackSelection) + j11;
        this.f62622f = c0Var2.copyWithStartPositionUs(jApplyTrackSelection);
    }

    public boolean isFullyBuffered() {
        if (this.f62620d) {
            return !this.f62621e || this.f62617a.getBufferedPositionUs() == Long.MIN_VALUE;
        }
        return false;
    }

    public void reevaluateBuffer(long j10) {
        io.odeeo.internal.q0.a.checkState(c());
        if (this.f62620d) {
            this.f62617a.reevaluateBuffer(toPeriodTime(j10));
        }
    }

    public void release() {
        a();
        a(this.f62627k, this.f62617a);
    }

    public io.odeeo.internal.n0.l selectTracks(float f10, y0 y0Var) throws n {
        io.odeeo.internal.n0.l lVarSelectTracks = this.f62626j.selectTracks(this.f62625i, getTrackGroups(), this.f62622f.f62647a, y0Var);
        for (io.odeeo.internal.n0.d dVar : lVarSelectTracks.f65057c) {
            if (dVar != null) {
                dVar.onPlaybackSpeed(f10);
            }
        }
        return lVarSelectTracks;
    }

    public void setNext(b0 b0Var) {
        if (b0Var == this.f62628l) {
            return;
        }
        a();
        this.f62628l = b0Var;
        b();
    }

    public void setRendererOffset(long j10) {
        this.f62631o = j10;
    }

    public long toPeriodTime(long j10) {
        return j10 - getRendererOffset();
    }

    public long toRendererTime(long j10) {
        return getRendererOffset() + j10;
    }

    public void updateClipping() {
        io.odeeo.internal.a0.r rVar = this.f62617a;
        if (rVar instanceof io.odeeo.internal.a0.d) {
            long j10 = this.f62622f.f62650d;
            if (j10 == C.TIME_UNSET) {
                j10 = Long.MIN_VALUE;
            }
            ((io.odeeo.internal.a0.d) rVar).updateClipping(0L, j10);
        }
    }

    public long applyTrackSelection(io.odeeo.internal.n0.l lVar, long j10, boolean z10, boolean[] zArr) {
        int i10 = 0;
        while (true) {
            boolean z11 = true;
            if (i10 >= lVar.f65055a) {
                break;
            }
            boolean[] zArr2 = this.f62624h;
            if (z10 || !lVar.isEquivalent(this.f62630n, i10)) {
                z11 = false;
            }
            zArr2[i10] = z11;
            i10++;
        }
        b(this.f62619c);
        a();
        this.f62630n = lVar;
        b();
        long jSelectTracks = this.f62617a.selectTracks(lVar.f65057c, this.f62624h, this.f62619c, zArr, j10);
        a(this.f62619c);
        this.f62621e = false;
        int i11 = 0;
        while (true) {
            io.odeeo.internal.a0.d0[] d0VarArr = this.f62619c;
            if (i11 >= d0VarArr.length) {
                return jSelectTracks;
            }
            if (d0VarArr[i11] != null) {
                io.odeeo.internal.q0.a.checkState(lVar.isRendererEnabled(i11));
                if (this.f62625i[i11].getTrackType() != -2) {
                    this.f62621e = true;
                }
            } else {
                io.odeeo.internal.q0.a.checkState(lVar.f65057c[i11] == null);
            }
            i11++;
        }
    }

    public final void a(io.odeeo.internal.a0.d0[] d0VarArr) {
        int i10 = 0;
        while (true) {
            q0[] q0VarArr = this.f62625i;
            if (i10 >= q0VarArr.length) {
                return;
            }
            if (q0VarArr[i10].getTrackType() == -2 && this.f62630n.isRendererEnabled(i10)) {
                d0VarArr[i10] = new io.odeeo.internal.a0.k();
            }
            i10++;
        }
    }

    public final void b(io.odeeo.internal.a0.d0[] d0VarArr) {
        int i10 = 0;
        while (true) {
            q0[] q0VarArr = this.f62625i;
            if (i10 >= q0VarArr.length) {
                return;
            }
            if (q0VarArr[i10].getTrackType() == -2) {
                d0VarArr[i10] = null;
            }
            i10++;
        }
    }

    public static io.odeeo.internal.a0.r a(t.a aVar, f0 f0Var, io.odeeo.internal.p0.b bVar, long j10, long j11) {
        io.odeeo.internal.a0.r rVarCreatePeriod = f0Var.createPeriod(aVar, bVar, j10);
        return j11 != C.TIME_UNSET ? new io.odeeo.internal.a0.d(rVarCreatePeriod, true, 0L, j11) : rVarCreatePeriod;
    }

    public static void a(f0 f0Var, io.odeeo.internal.a0.r rVar) {
        try {
            if (rVar instanceof io.odeeo.internal.a0.d) {
                f0Var.releasePeriod(((io.odeeo.internal.a0.d) rVar).f62277a);
            } else {
                f0Var.releasePeriod(rVar);
            }
        } catch (RuntimeException e10) {
            io.odeeo.internal.q0.p.e("MediaPeriodHolder", "Period release failed.", e10);
        }
    }
}
