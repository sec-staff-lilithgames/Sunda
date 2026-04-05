package ao;

import android.net.Uri;
import android.os.Looper;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Objects;
import mh.v2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class i1 extends a implements d1 {

    /* renamed from: h, reason: collision with root package name */
    public final ln.h f7687h;

    /* renamed from: i, reason: collision with root package name */
    public final y0 f7688i;

    /* renamed from: j, reason: collision with root package name */
    public final sn.v f7689j;

    /* renamed from: k, reason: collision with root package name */
    public final go.t f7690k;

    /* renamed from: l, reason: collision with root package name */
    public final int f7691l;

    /* renamed from: m, reason: collision with root package name */
    public final io.bidmachine.media3.common.b f7692m;

    /* renamed from: n, reason: collision with root package name */
    public final v2 f7693n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f7694o = true;

    /* renamed from: p, reason: collision with root package name */
    public long f7695p = C.TIME_UNSET;

    /* renamed from: q, reason: collision with root package name */
    public boolean f7696q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f7697r;

    /* renamed from: s, reason: collision with root package name */
    public ln.g0 f7698s;

    /* renamed from: t, reason: collision with root package name */
    public gn.p0 f7699t;

    public i1(gn.p0 p0Var, ln.h hVar, y0 y0Var, sn.v vVar, go.t tVar, int i10, io.bidmachine.media3.common.b bVar, f1 f1Var) {
        this.f7699t = p0Var;
        this.f7687h = hVar;
        this.f7688i = y0Var;
        this.f7689j = vVar;
        this.f7690k = tVar;
        this.f7691l = i10;
        this.f7692m = bVar;
        this.f7693n = f1Var;
    }

    @Override // ao.a, ao.m0
    public boolean canUpdateMediaItem(gn.p0 p0Var) {
        gn.j0 j0Var = (gn.j0) io.bidmachine.media3.common.util.a.checkNotNull(getMediaItem().f58053b);
        gn.j0 j0Var2 = p0Var.f58053b;
        return j0Var2 != null && j0Var2.f57963a.equals(j0Var.f57963a) && j0Var2.f57971i == j0Var.f57971i && Objects.equals(j0Var2.f57968f, j0Var.f57968f);
    }

    @Override // ao.a, ao.m0
    public i0 createPeriod(k0 k0Var, go.c cVar, long j10) {
        ln.i iVarCreateDataSource = this.f7687h.createDataSource();
        ln.g0 g0Var = this.f7698s;
        if (g0Var != null) {
            iVarCreateDataSource.addTransferListener(g0Var);
        }
        gn.j0 j0Var = (gn.j0) io.bidmachine.media3.common.util.a.checkNotNull(getMediaItem().f58053b);
        Uri uri = j0Var.f57963a;
        z0 z0VarCreateProgressiveMediaExtractor = ((af.g) this.f7688i).createProgressiveMediaExtractor(d());
        sn.q qVarWithParameters = this.f7534d.withParameters(0, k0Var);
        r0 r0VarA = a(k0Var);
        String str = j0Var.f57968f;
        long jMsToUs = io.bidmachine.media3.common.util.a1.msToUs(j0Var.f57971i);
        v2 v2Var = this.f7693n;
        return new c1(uri, iVarCreateDataSource, z0VarCreateProgressiveMediaExtractor, this.f7689j, qVarWithParameters, this.f7690k, r0VarA, this, cVar, str, this.f7691l, 0, this.f7692m, jMsToUs, v2Var != null ? (ho.b) v2Var.get() : null);
    }

    @Override // ao.a
    public final void e(ln.g0 g0Var) {
        this.f7698s = g0Var;
        Looper looper = (Looper) io.bidmachine.media3.common.util.a.checkNotNull(Looper.myLooper());
        on.f0 f0VarD = d();
        sn.v vVar = this.f7689j;
        vVar.setPlayer(looper, f0VarD);
        vVar.prepare();
        g();
    }

    public final void g() {
        gn.u1 t1Var = new t1(this.f7695p, this.f7696q, false, this.f7697r, (Object) null, getMediaItem());
        if (this.f7694o) {
            t1Var = new e1(t1Var);
        }
        f(t1Var);
    }

    @Override // ao.a, ao.m0
    public /* bridge */ /* synthetic */ gn.u1 getInitialTimeline() {
        return super.getInitialTimeline();
    }

    @Override // ao.a, ao.m0
    public synchronized gn.p0 getMediaItem() {
        return this.f7699t;
    }

    @Override // ao.a, ao.m0
    public /* bridge */ /* synthetic */ boolean isSingleWindow() {
        return super.isSingleWindow();
    }

    @Override // ao.d1
    public void onSourceInfoRefreshed(long j10, ko.y0 y0Var, boolean z10) {
        if (j10 == C.TIME_UNSET) {
            j10 = this.f7695p;
        }
        boolean zIsSeekable = y0Var.isSeekable();
        if (!this.f7694o && this.f7695p == j10 && this.f7696q == zIsSeekable && this.f7697r == z10) {
            return;
        }
        this.f7695p = j10;
        this.f7696q = zIsSeekable;
        this.f7697r = z10;
        this.f7694o = false;
        g();
    }

    @Override // ao.a, ao.m0
    public void releasePeriod(i0 i0Var) {
        ((c1) i0Var).release();
    }

    @Override // ao.a
    public final void releaseSourceInternal() {
        this.f7689j.release();
    }

    @Override // ao.a, ao.m0
    public synchronized void updateMediaItem(gn.p0 p0Var) {
        this.f7699t = p0Var;
    }

    public void clearListener() {
    }

    @Override // ao.a, ao.m0
    public void maybeThrowSourceInfoRefreshError() {
    }

    public void setListener(h1 h1Var) {
    }
}
