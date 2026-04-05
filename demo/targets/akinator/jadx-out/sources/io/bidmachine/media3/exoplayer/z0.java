package io.bidmachine.media3.exoplayer;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class z0 {

    /* renamed from: a, reason: collision with root package name */
    public final ao.i0 f61608a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f61609b;

    /* renamed from: c, reason: collision with root package name */
    public final ao.o1[] f61610c;

    /* renamed from: d, reason: collision with root package name */
    public final long f61611d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f61612e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f61613f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f61614g;

    /* renamed from: h, reason: collision with root package name */
    public a1 f61615h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f61616i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean[] f61617j;

    /* renamed from: k, reason: collision with root package name */
    public final u1[] f61618k;

    /* renamed from: l, reason: collision with root package name */
    public final fo.u f61619l;

    /* renamed from: m, reason: collision with root package name */
    public final i1 f61620m;

    /* renamed from: n, reason: collision with root package name */
    public z0 f61621n;

    /* renamed from: o, reason: collision with root package name */
    public ao.b2 f61622o;

    /* renamed from: p, reason: collision with root package name */
    public fo.v f61623p;

    /* renamed from: q, reason: collision with root package name */
    public long f61624q;

    public z0(u1[] u1VarArr, long j10, fo.u uVar, go.c cVar, i1 i1Var, a1 a1Var, fo.v vVar, long j11) {
        this.f61618k = u1VarArr;
        this.f61624q = j10;
        this.f61619l = uVar;
        this.f61620m = i1Var;
        ao.k0 k0Var = a1Var.f60880a;
        this.f61609b = k0Var.f7718a;
        this.f61615h = a1Var;
        this.f61611d = j11;
        this.f61622o = ao.b2.f7550d;
        this.f61623p = vVar;
        this.f61610c = new ao.o1[u1VarArr.length];
        this.f61617j = new boolean[u1VarArr.length];
        long j12 = a1Var.f60881b;
        long j13 = a1Var.f60883d;
        boolean z10 = a1Var.f60885f;
        ao.i0 i0VarCreatePeriod = i1Var.createPeriod(k0Var, cVar, j12);
        this.f61608a = j13 != C.TIME_UNSET ? new ao.e(i0VarCreatePeriod, !z10, 0L, j13) : i0VarCreatePeriod;
    }

    public final void a() {
        if (this.f61621n != null) {
            return;
        }
        int i10 = 0;
        while (true) {
            fo.v vVar = this.f61623p;
            if (i10 >= vVar.f55925a) {
                return;
            }
            boolean zIsRendererEnabled = vVar.isRendererEnabled(i10);
            fo.l lVar = this.f61623p.f55927c[i10];
            if (zIsRendererEnabled && lVar != null) {
                lVar.disable();
            }
            i10++;
        }
    }

    public long applyTrackSelection(fo.v vVar, long j10, boolean z10) {
        return applyTrackSelection(vVar, j10, z10, new boolean[this.f61618k.length]);
    }

    public final void b() {
        if (this.f61621n != null) {
            return;
        }
        int i10 = 0;
        while (true) {
            fo.v vVar = this.f61623p;
            if (i10 >= vVar.f55925a) {
                return;
            }
            boolean zIsRendererEnabled = vVar.isRendererEnabled(i10);
            fo.l lVar = this.f61623p.f55927c[i10];
            if (zIsRendererEnabled && lVar != null) {
                lVar.enable();
            }
            i10++;
        }
    }

    public boolean canBeUsedForMediaPeriodInfo(a1 a1Var) {
        a1 a1Var2 = this.f61615h;
        long j10 = a1Var2.f60884e;
        return (j10 == C.TIME_UNSET || j10 == a1Var.f60884e) && a1Var2.f60881b == a1Var.f60881b && a1Var2.f60880a.equals(a1Var.f60880a);
    }

    public void continueLoading(w0 w0Var) {
        io.bidmachine.media3.common.util.a.checkState(this.f61621n == null);
        this.f61608a.continueLoading(w0Var);
    }

    public long getBufferedPositionUs() {
        if (!this.f61613f) {
            return this.f61615h.f60881b;
        }
        long bufferedPositionUs = this.f61614g ? this.f61608a.getBufferedPositionUs() : Long.MIN_VALUE;
        return bufferedPositionUs == Long.MIN_VALUE ? this.f61615h.f60884e : bufferedPositionUs;
    }

    public z0 getNext() {
        return this.f61621n;
    }

    public long getNextLoadPositionUs() {
        if (this.f61613f) {
            return this.f61608a.getNextLoadPositionUs();
        }
        return 0L;
    }

    public long getRendererOffset() {
        return this.f61624q;
    }

    public long getStartPositionRendererTime() {
        return this.f61615h.f60881b + this.f61624q;
    }

    public ao.b2 getTrackGroups() {
        return this.f61622o;
    }

    public fo.v getTrackSelectorResult() {
        return this.f61623p;
    }

    public void handlePrepared(float f10, gn.u1 u1Var, boolean z10) throws a0 {
        this.f61613f = true;
        this.f61622o = this.f61608a.getTrackGroups();
        fo.v vVarSelectTracks = selectTracks(f10, u1Var, z10);
        a1 a1Var = this.f61615h;
        long jMax = a1Var.f60881b;
        long j10 = a1Var.f60884e;
        if (j10 != C.TIME_UNSET && jMax >= j10) {
            jMax = Math.max(0L, j10 - 1);
        }
        long jApplyTrackSelection = applyTrackSelection(vVarSelectTracks, jMax, false);
        long j11 = this.f61624q;
        a1 a1Var2 = this.f61615h;
        this.f61624q = (a1Var2.f60881b - jApplyTrackSelection) + j11;
        this.f61615h = a1Var2.copyWithStartPositionUs(jApplyTrackSelection);
    }

    public boolean hasLoadingError() {
        try {
            if (!this.f61613f) {
                this.f61608a.maybeThrowPrepareError();
                return false;
            }
            for (ao.o1 o1Var : this.f61610c) {
                if (o1Var != null) {
                    o1Var.maybeThrowError();
                }
            }
            return false;
        } catch (IOException unused) {
            return true;
        }
    }

    public boolean isFullyBuffered() {
        if (this.f61613f) {
            return !this.f61614g || this.f61608a.getBufferedPositionUs() == Long.MIN_VALUE;
        }
        return false;
    }

    public boolean isFullyPreloaded() {
        if (this.f61613f) {
            return isFullyBuffered() || getBufferedPositionUs() - this.f61615h.f60881b >= this.f61611d;
        }
        return false;
    }

    public void prepare(ao.h0 h0Var, long j10) {
        this.f61612e = true;
        this.f61608a.prepare(h0Var, j10);
    }

    public void reevaluateBuffer(long j10) {
        io.bidmachine.media3.common.util.a.checkState(this.f61621n == null);
        if (this.f61613f) {
            this.f61608a.reevaluateBuffer(toPeriodTime(j10));
        }
    }

    public void release() {
        a();
        ao.i0 i0Var = this.f61608a;
        try {
            boolean z10 = i0Var instanceof ao.e;
            i1 i1Var = this.f61620m;
            if (z10) {
                i1Var.releasePeriod(((ao.e) i0Var).f7614b);
            } else {
                i1Var.releasePeriod(i0Var);
            }
        } catch (RuntimeException e10) {
            io.bidmachine.media3.common.util.b0.e("MediaPeriodHolder", "Period release failed.", e10);
        }
    }

    public fo.v selectTracks(float f10, gn.u1 u1Var, boolean z10) throws a0 {
        fo.l[] lVarArr;
        ao.b2 trackGroups = getTrackGroups();
        ao.k0 k0Var = this.f61615h.f60880a;
        fo.u uVar = this.f61619l;
        u1[] u1VarArr = this.f61618k;
        fo.v vVarSelectTracks = uVar.selectTracks(u1VarArr, trackGroups, k0Var, u1Var);
        int i10 = 0;
        while (true) {
            int i11 = vVarSelectTracks.f55925a;
            lVarArr = vVarSelectTracks.f55927c;
            if (i10 >= i11) {
                break;
            }
            if (vVarSelectTracks.isRendererEnabled(i10)) {
                if (lVarArr[i10] == null && u1VarArr[i10].getTrackType() != -2) {
                    z = false;
                }
                io.bidmachine.media3.common.util.a.checkState(z);
            } else {
                io.bidmachine.media3.common.util.a.checkState(lVarArr[i10] == null);
            }
            i10++;
        }
        for (fo.l lVar : lVarArr) {
            if (lVar != null) {
                lVar.onPlaybackSpeed(f10);
                lVar.onPlayWhenReadyChanged(z10);
            }
        }
        return vVarSelectTracks;
    }

    public void setNext(z0 z0Var) {
        if (z0Var == this.f61621n) {
            return;
        }
        a();
        this.f61621n = z0Var;
        b();
    }

    public void setRendererOffset(long j10) {
        this.f61624q = j10;
    }

    public long toPeriodTime(long j10) {
        return j10 - getRendererOffset();
    }

    public long toRendererTime(long j10) {
        return getRendererOffset() + j10;
    }

    public void updateClipping() {
        ao.i0 i0Var = this.f61608a;
        if (i0Var instanceof ao.e) {
            long j10 = this.f61615h.f60883d;
            if (j10 == C.TIME_UNSET) {
                j10 = Long.MIN_VALUE;
            }
            ((ao.e) i0Var).updateClipping(0L, j10);
        }
    }

    public long applyTrackSelection(fo.v vVar, long j10, boolean z10, boolean[] zArr) {
        u1[] u1VarArr;
        ao.o1[] o1VarArr;
        int i10 = 0;
        while (true) {
            boolean z11 = true;
            if (i10 >= vVar.f55925a) {
                break;
            }
            if (z10 || !vVar.isEquivalent(this.f61623p, i10)) {
                z11 = false;
            }
            this.f61617j[i10] = z11;
            i10++;
        }
        int i11 = 0;
        while (true) {
            u1VarArr = this.f61618k;
            int length = u1VarArr.length;
            o1VarArr = this.f61610c;
            if (i11 >= length) {
                break;
            }
            if (u1VarArr[i11].getTrackType() == -2) {
                o1VarArr[i11] = null;
            }
            i11++;
        }
        a();
        this.f61623p = vVar;
        b();
        long jSelectTracks = this.f61608a.selectTracks(vVar.f55927c, this.f61617j, this.f61610c, zArr, j10);
        for (int i12 = 0; i12 < u1VarArr.length; i12++) {
            if (u1VarArr[i12].getTrackType() == -2 && this.f61623p.isRendererEnabled(i12)) {
                o1VarArr[i12] = new ao.s();
            }
        }
        this.f61614g = false;
        for (int i13 = 0; i13 < o1VarArr.length; i13++) {
            if (o1VarArr[i13] != null) {
                io.bidmachine.media3.common.util.a.checkState(vVar.isRendererEnabled(i13));
                if (u1VarArr[i13].getTrackType() != -2) {
                    this.f61614g = true;
                }
            } else {
                io.bidmachine.media3.common.util.a.checkState(vVar.f55927c[i13] == null);
            }
        }
        return jSelectTracks;
    }
}
