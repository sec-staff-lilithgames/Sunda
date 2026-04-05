package com.google.android.exoplayer2;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class x1 {

    /* renamed from: a, reason: collision with root package name */
    public final bf.a0 f28695a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f28696b;

    /* renamed from: c, reason: collision with root package name */
    public final bf.b1[] f28697c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f28698d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f28699e;

    /* renamed from: f, reason: collision with root package name */
    public y1 f28700f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f28701g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f28702h;

    /* renamed from: i, reason: collision with root package name */
    public final b3[] f28703i;

    /* renamed from: j, reason: collision with root package name */
    public final pf.w f28704j;

    /* renamed from: k, reason: collision with root package name */
    public final f2 f28705k;

    /* renamed from: l, reason: collision with root package name */
    public x1 f28706l;

    /* renamed from: m, reason: collision with root package name */
    public bf.n1 f28707m;

    /* renamed from: n, reason: collision with root package name */
    public pf.x f28708n;

    /* renamed from: o, reason: collision with root package name */
    public long f28709o;

    public x1(b3[] b3VarArr, long j10, pf.w wVar, qf.c cVar, f2 f2Var, y1 y1Var, pf.x xVar) {
        this.f28703i = b3VarArr;
        this.f28709o = j10;
        this.f28704j = wVar;
        this.f28705k = f2Var;
        bf.d0 d0Var = y1Var.f28764a;
        this.f28696b = d0Var.f9193a;
        this.f28700f = y1Var;
        this.f28707m = bf.n1.f9354f;
        this.f28708n = xVar;
        this.f28697c = new bf.b1[b3VarArr.length];
        this.f28702h = new boolean[b3VarArr.length];
        long j11 = y1Var.f28765b;
        long j12 = y1Var.f28767d;
        bf.a0 a0VarCreatePeriod = f2Var.createPeriod(d0Var, cVar, j11);
        this.f28695a = j12 != C.TIME_UNSET ? new bf.d(a0VarCreatePeriod, true, 0L, j12) : a0VarCreatePeriod;
    }

    public final void a() {
        if (this.f28706l != null) {
            return;
        }
        int i10 = 0;
        while (true) {
            pf.x xVar = this.f28708n;
            if (i10 >= xVar.f81194a) {
                return;
            }
            boolean zIsRendererEnabled = xVar.isRendererEnabled(i10);
            pf.k kVar = this.f28708n.f81196c[i10];
            if (zIsRendererEnabled && kVar != null) {
                kVar.disable();
            }
            i10++;
        }
    }

    public long applyTrackSelection(pf.x xVar, long j10, boolean z10) {
        return applyTrackSelection(xVar, j10, z10, new boolean[this.f28703i.length]);
    }

    public final void b() {
        if (this.f28706l != null) {
            return;
        }
        int i10 = 0;
        while (true) {
            pf.x xVar = this.f28708n;
            if (i10 >= xVar.f81194a) {
                return;
            }
            boolean zIsRendererEnabled = xVar.isRendererEnabled(i10);
            pf.k kVar = this.f28708n.f81196c[i10];
            if (zIsRendererEnabled && kVar != null) {
                kVar.enable();
            }
            i10++;
        }
    }

    public void continueLoading(long j10) {
        com.google.android.exoplayer2.util.a.checkState(this.f28706l == null);
        this.f28695a.continueLoading(toPeriodTime(j10));
    }

    public long getBufferedPositionUs() {
        if (!this.f28698d) {
            return this.f28700f.f28765b;
        }
        long bufferedPositionUs = this.f28699e ? this.f28695a.getBufferedPositionUs() : Long.MIN_VALUE;
        return bufferedPositionUs == Long.MIN_VALUE ? this.f28700f.f28768e : bufferedPositionUs;
    }

    public x1 getNext() {
        return this.f28706l;
    }

    public long getNextLoadPositionUs() {
        if (this.f28698d) {
            return this.f28695a.getNextLoadPositionUs();
        }
        return 0L;
    }

    public long getRendererOffset() {
        return this.f28709o;
    }

    public long getStartPositionRendererTime() {
        return this.f28700f.f28765b + this.f28709o;
    }

    public bf.n1 getTrackGroups() {
        return this.f28707m;
    }

    public pf.x getTrackSelectorResult() {
        return this.f28708n;
    }

    public void handlePrepared(float f10, m3 m3Var) throws r {
        this.f28698d = true;
        this.f28707m = this.f28695a.getTrackGroups();
        pf.x xVarSelectTracks = selectTracks(f10, m3Var);
        y1 y1Var = this.f28700f;
        long jMax = y1Var.f28765b;
        long j10 = y1Var.f28768e;
        if (j10 != C.TIME_UNSET && jMax >= j10) {
            jMax = Math.max(0L, j10 - 1);
        }
        long jApplyTrackSelection = applyTrackSelection(xVarSelectTracks, jMax, false);
        long j11 = this.f28709o;
        y1 y1Var2 = this.f28700f;
        this.f28709o = (y1Var2.f28765b - jApplyTrackSelection) + j11;
        this.f28700f = y1Var2.copyWithStartPositionUs(jApplyTrackSelection);
    }

    public boolean isFullyBuffered() {
        if (this.f28698d) {
            return !this.f28699e || this.f28695a.getBufferedPositionUs() == Long.MIN_VALUE;
        }
        return false;
    }

    public void reevaluateBuffer(long j10) {
        com.google.android.exoplayer2.util.a.checkState(this.f28706l == null);
        if (this.f28698d) {
            this.f28695a.reevaluateBuffer(toPeriodTime(j10));
        }
    }

    public void release() {
        a();
        bf.a0 a0Var = this.f28695a;
        try {
            boolean z10 = a0Var instanceof bf.d;
            f2 f2Var = this.f28705k;
            if (z10) {
                f2Var.releasePeriod(((bf.d) a0Var).f9201b);
            } else {
                f2Var.releasePeriod(a0Var);
            }
        } catch (RuntimeException e10) {
            com.google.android.exoplayer2.util.f0.e("MediaPeriodHolder", "Period release failed.", e10);
        }
    }

    public pf.x selectTracks(float f10, m3 m3Var) throws r {
        pf.x xVarSelectTracks = this.f28704j.selectTracks(this.f28703i, getTrackGroups(), this.f28700f.f28764a, m3Var);
        for (pf.k kVar : xVarSelectTracks.f81196c) {
            if (kVar != null) {
                kVar.onPlaybackSpeed(f10);
            }
        }
        return xVarSelectTracks;
    }

    public void setNext(x1 x1Var) {
        if (x1Var == this.f28706l) {
            return;
        }
        a();
        this.f28706l = x1Var;
        b();
    }

    public void setRendererOffset(long j10) {
        this.f28709o = j10;
    }

    public long toPeriodTime(long j10) {
        return j10 - getRendererOffset();
    }

    public long toRendererTime(long j10) {
        return getRendererOffset() + j10;
    }

    public void updateClipping() {
        bf.a0 a0Var = this.f28695a;
        if (a0Var instanceof bf.d) {
            long j10 = this.f28700f.f28767d;
            if (j10 == C.TIME_UNSET) {
                j10 = Long.MIN_VALUE;
            }
            ((bf.d) a0Var).updateClipping(0L, j10);
        }
    }

    public long applyTrackSelection(pf.x xVar, long j10, boolean z10, boolean[] zArr) {
        b3[] b3VarArr;
        bf.b1[] b1VarArr;
        int i10 = 0;
        while (true) {
            boolean z11 = true;
            if (i10 >= xVar.f81194a) {
                break;
            }
            if (z10 || !xVar.isEquivalent(this.f28708n, i10)) {
                z11 = false;
            }
            this.f28702h[i10] = z11;
            i10++;
        }
        int i11 = 0;
        while (true) {
            b3VarArr = this.f28703i;
            int length = b3VarArr.length;
            b1VarArr = this.f28697c;
            if (i11 >= length) {
                break;
            }
            if (b3VarArr[i11].getTrackType() == -2) {
                b1VarArr[i11] = null;
            }
            i11++;
        }
        a();
        this.f28708n = xVar;
        b();
        long jSelectTracks = this.f28695a.selectTracks(xVar.f81196c, this.f28702h, this.f28697c, zArr, j10);
        for (int i12 = 0; i12 < b3VarArr.length; i12++) {
            if (b3VarArr[i12].getTrackType() == -2 && this.f28708n.isRendererEnabled(i12)) {
                b1VarArr[i12] = new bf.p();
            }
        }
        this.f28699e = false;
        for (int i13 = 0; i13 < b1VarArr.length; i13++) {
            if (b1VarArr[i13] != null) {
                com.google.android.exoplayer2.util.a.checkState(xVar.isRendererEnabled(i13));
                if (b3VarArr[i13].getTrackType() != -2) {
                    this.f28699e = true;
                }
            } else {
                com.google.android.exoplayer2.util.a.checkState(xVar.f81196c[i13] == null);
            }
        }
        return jSelectTracks;
    }
}
