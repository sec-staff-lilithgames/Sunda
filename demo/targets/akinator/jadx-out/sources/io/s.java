package io;

import android.content.Context;
import android.util.Pair;
import android.util.SparseArray;
import android.view.Surface;
import com.applovin.impl.ga;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import gn.e2;
import gn.f2;
import gn.j1;
import gn.j2;
import io.bidmachine.media3.common.util.a1;
import io.bidmachine.media3.common.util.p0;
import io.bidmachine.media3.common.util.t0;
import io.bidmachine.media3.exoplayer.r1;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import nh.b5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class s implements m0, j2 {

    /* renamed from: x, reason: collision with root package name */
    public static final ga f68187x = new ga(1);

    /* renamed from: a, reason: collision with root package name */
    public final Context f68188a;

    /* renamed from: c, reason: collision with root package name */
    public final j1 f68190c;

    /* renamed from: e, reason: collision with root package name */
    public final List f68192e;

    /* renamed from: f, reason: collision with root package name */
    public final e2 f68193f;

    /* renamed from: g, reason: collision with root package name */
    public final e f68194g;

    /* renamed from: h, reason: collision with root package name */
    public final l f68195h;

    /* renamed from: i, reason: collision with root package name */
    public final io.bidmachine.media3.common.util.g f68196i;

    /* renamed from: j, reason: collision with root package name */
    public final CopyOnWriteArraySet f68197j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f68198k;

    /* renamed from: l, reason: collision with root package name */
    public io.bidmachine.media3.common.b f68199l;

    /* renamed from: m, reason: collision with root package name */
    public io.bidmachine.media3.common.util.v f68200m;

    /* renamed from: n, reason: collision with root package name */
    public long f68201n;

    /* renamed from: o, reason: collision with root package name */
    public Pair f68202o;

    /* renamed from: p, reason: collision with root package name */
    public int f68203p;

    /* renamed from: q, reason: collision with root package name */
    public int f68204q;

    /* renamed from: r, reason: collision with root package name */
    public r1 f68205r;

    /* renamed from: s, reason: collision with root package name */
    public long f68206s;

    /* renamed from: t, reason: collision with root package name */
    public long f68207t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f68208u;

    /* renamed from: v, reason: collision with root package name */
    public long f68209v;

    /* renamed from: w, reason: collision with root package name */
    public int f68210w;

    /* renamed from: b, reason: collision with root package name */
    public final t0 f68189b = new t0();

    /* renamed from: d, reason: collision with root package name */
    public final SparseArray f68191d = new SparseArray();

    public s(m mVar) {
        this.f68188a = mVar.f62182a;
        this.f68190c = (j1) io.bidmachine.media3.common.util.a.checkStateNotNull(mVar.f62185d);
        this.f68192e = mVar.f62186e;
        this.f68193f = mVar.f62187f;
        io.bidmachine.media3.common.util.g gVar = mVar.f62188g;
        this.f68196i = gVar;
        this.f68194g = new e(mVar.f62183b, gVar);
        this.f68195h = new l();
        this.f68197j = new CopyOnWriteArraySet();
        this.f68198k = mVar.f62189h;
        this.f68199l = new gn.w().build();
        this.f68206s = C.TIME_UNSET;
        this.f68207t = C.TIME_UNSET;
        this.f68210w = -1;
        this.f68204q = 0;
    }

    public void addListener(p pVar) {
        this.f68197j.add(pVar);
    }

    @Override // io.m0
    public void clearOutputSurfaceInfo() {
        p0 p0Var = p0.f60777c;
        p0Var.getWidth();
        p0Var.getHeight();
        this.f68202o = null;
    }

    @Override // io.m0
    public l0 getSink(int i10) {
        SparseArray sparseArray = this.f68191d;
        io.bidmachine.media3.common.util.a.checkState(!a1.contains(sparseArray, i10));
        o oVar = new o(this, this.f68188a, i10);
        addListener(oVar);
        sparseArray.put(i10, oVar);
        return oVar;
    }

    @Override // gn.j2
    public void onError(f2 f2Var) {
        Iterator it = this.f68197j.iterator();
        while (it.hasNext()) {
            ((p) it.next()).onError(this, f2Var);
        }
    }

    @Override // gn.j2
    public void onOutputFrameAvailableForRendering(long j10) {
        if (this.f68203p > 0) {
            return;
        }
        r1 r1Var = this.f68205r;
        if (r1Var != null) {
            ((io.bidmachine.media3.exoplayer.m0) r1Var).onWakeup();
        }
        long j11 = j10 - this.f68209v;
        this.f68206s = j11;
        Long l9 = (Long) this.f68189b.pollFloor(j11);
        e eVar = this.f68194g;
        if (l9 != null && l9.longValue() != this.f68201n) {
            eVar.setStreamTimestampInfo(l9.longValue(), this.f68209v);
            this.f68201n = l9.longValue();
        }
        long j12 = this.f68207t;
        boolean z10 = j12 != C.TIME_UNSET && j11 >= j12;
        eVar.handleInputFrame(j10, z10, this.f68195h);
        if (z10) {
            eVar.signalEndOfCurrentInputStream();
            this.f68208u = true;
        }
    }

    @Override // gn.j2
    public void onOutputFrameRateChanged(float f10) {
        io.bidmachine.media3.common.b bVarBuild = this.f68199l.buildUpon().setFrameRate(f10).build();
        this.f68199l = bVarBuild;
        this.f68194g.onInputStreamChanged(1, bVarBuild, b5.of());
    }

    @Override // gn.j2
    public void onOutputSizeChanged(int i10, int i11) {
        io.bidmachine.media3.common.b bVarBuild = this.f68199l.buildUpon().setWidth(i10).setHeight(i11).build();
        this.f68199l = bVarBuild;
        this.f68194g.onInputStreamChanged(1, bVarBuild, b5.of());
    }

    @Override // io.m0
    public void release() {
        if (this.f68204q == 2) {
            return;
        }
        io.bidmachine.media3.common.util.v vVar = this.f68200m;
        if (vVar != null) {
            vVar.removeCallbacksAndMessages(null);
        }
        this.f68202o = null;
        this.f68204q = 2;
    }

    public void removeListener(p pVar) {
        this.f68197j.remove(pVar);
    }

    @Override // io.m0
    public void setOutputSurfaceInfo(Surface surface, p0 p0Var) {
        Pair pair = this.f68202o;
        if (pair != null && ((Surface) pair.first).equals(surface) && ((p0) this.f68202o.second).equals(p0Var)) {
            return;
        }
        this.f68202o = Pair.create(surface, p0Var);
        p0Var.getWidth();
        p0Var.getHeight();
    }

    public void setTotalVideoInputCount(int i10) {
        this.f68210w = i10;
    }

    @Override // gn.j2
    public void onEnded(long j10) {
    }
}
