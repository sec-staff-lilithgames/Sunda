package bf;

import android.os.Looper;
import com.google.android.exoplayer2.m3;
import com.google.android.exoplayer2.u1;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class v0 extends a implements s0 {

    /* renamed from: h, reason: collision with root package name */
    public final u1 f9448h;

    /* renamed from: i, reason: collision with root package name */
    public final com.google.android.exoplayer2.o1 f9449i;

    /* renamed from: j, reason: collision with root package name */
    public final qf.o f9450j;

    /* renamed from: k, reason: collision with root package name */
    public final o0 f9451k;

    /* renamed from: l, reason: collision with root package name */
    public final de.t f9452l;

    /* renamed from: m, reason: collision with root package name */
    public final qf.o0 f9453m;

    /* renamed from: n, reason: collision with root package name */
    public final int f9454n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f9455o = true;

    /* renamed from: p, reason: collision with root package name */
    public long f9456p = C.TIME_UNSET;

    /* renamed from: q, reason: collision with root package name */
    public boolean f9457q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f9458r;

    /* renamed from: s, reason: collision with root package name */
    public qf.c1 f9459s;

    public v0(u1 u1Var, qf.o oVar, o0 o0Var, de.t tVar, qf.o0 o0Var2, int i10) {
        this.f9449i = (com.google.android.exoplayer2.o1) com.google.android.exoplayer2.util.a.checkNotNull(u1Var.f28113c);
        this.f9448h = u1Var;
        this.f9450j = oVar;
        this.f9451k = o0Var;
        this.f9452l = tVar;
        this.f9453m = o0Var2;
        this.f9454n = i10;
    }

    @Override // bf.a
    public final void c(qf.c1 c1Var) {
        this.f9459s = c1Var;
        Looper looper = (Looper) com.google.android.exoplayer2.util.a.checkNotNull(Looper.myLooper());
        zd.c0 c0Var = (zd.c0) com.google.android.exoplayer2.util.a.checkStateNotNull(this.f9166g);
        de.t tVar = this.f9452l;
        tVar.setPlayer(looper, c0Var);
        tVar.prepare();
        e();
    }

    @Override // bf.a, bf.f0
    public a0 createPeriod(d0 d0Var, qf.c cVar, long j10) {
        qf.p pVarCreateDataSource = this.f9450j.createDataSource();
        qf.c1 c1Var = this.f9459s;
        if (c1Var != null) {
            pVarCreateDataSource.addTransferListener(c1Var);
        }
        com.google.android.exoplayer2.o1 o1Var = this.f9449i;
        return new r0(o1Var.f27860b, pVarCreateDataSource, ((af.g) this.f9451k).createProgressiveMediaExtractor((zd.c0) com.google.android.exoplayer2.util.a.checkStateNotNull(this.f9166g)), this.f9452l, this.f9163d.withParameters(0, d0Var), this.f9453m, this.f9162c.withParameters(0, d0Var), this, cVar, o1Var.f27865h, this.f9454n);
    }

    public final void e() {
        m3 g1Var = new g1(this.f9456p, this.f9457q, false, this.f9458r, (Object) null, this.f9448h);
        if (this.f9455o) {
            g1Var = new t0(g1Var);
        }
        d(g1Var);
    }

    @Override // bf.a, bf.f0
    public /* bridge */ /* synthetic */ m3 getInitialTimeline() {
        return super.getInitialTimeline();
    }

    @Override // bf.a, bf.f0
    public u1 getMediaItem() {
        return this.f9448h;
    }

    @Override // bf.a, bf.f0
    public /* bridge */ /* synthetic */ boolean isSingleWindow() {
        return super.isSingleWindow();
    }

    @Override // bf.s0
    public void onSourceInfoRefreshed(long j10, boolean z10, boolean z11) {
        if (j10 == C.TIME_UNSET) {
            j10 = this.f9456p;
        }
        if (!this.f9455o && this.f9456p == j10 && this.f9457q == z10 && this.f9458r == z11) {
            return;
        }
        this.f9456p = j10;
        this.f9457q = z10;
        this.f9458r = z11;
        this.f9455o = false;
        e();
    }

    @Override // bf.a, bf.f0
    public void releasePeriod(a0 a0Var) {
        ((r0) a0Var).release();
    }

    @Override // bf.a
    public final void releaseSourceInternal() {
        this.f9452l.release();
    }

    @Override // bf.a, bf.f0
    public void maybeThrowSourceInfoRefreshError() {
    }
}
