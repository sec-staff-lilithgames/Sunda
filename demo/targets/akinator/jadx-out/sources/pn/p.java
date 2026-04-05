package pn;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import ao.k0;
import ao.r0;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import gn.i0;
import gn.j0;
import gn.p0;
import gn.q0;
import gn.u1;
import go.a0;
import go.b0;
import go.c0;
import go.z;
import io.bidmachine.media3.common.util.a1;
import java.io.IOException;
import java.util.List;
import java.util.Objects;
import ln.g0;
import ln.m;
import on.f0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class p extends ao.a {
    public go.w A;
    public g0 B;
    public d C;
    public Handler D;
    public i0 E;
    public Uri F;
    public Uri G;
    public qn.c H;
    public boolean I;
    public long J;
    public long K;
    public long L;
    public int M;
    public long N;
    public int O;
    public p0 P;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f81543h;

    /* renamed from: i, reason: collision with root package name */
    public final ln.h f81544i;

    /* renamed from: j, reason: collision with root package name */
    public final b f81545j;

    /* renamed from: k, reason: collision with root package name */
    public final ao.l f81546k;

    /* renamed from: l, reason: collision with root package name */
    public final sn.v f81547l;

    /* renamed from: m, reason: collision with root package name */
    public final go.t f81548m;

    /* renamed from: n, reason: collision with root package name */
    public final a f81549n;

    /* renamed from: o, reason: collision with root package name */
    public final long f81550o;

    /* renamed from: p, reason: collision with root package name */
    public final long f81551p;

    /* renamed from: q, reason: collision with root package name */
    public final r0 f81552q;

    /* renamed from: r, reason: collision with root package name */
    public final b0 f81553r;

    /* renamed from: s, reason: collision with root package name */
    public final l f81554s;

    /* renamed from: t, reason: collision with root package name */
    public final Object f81555t;

    /* renamed from: u, reason: collision with root package name */
    public final SparseArray f81556u;

    /* renamed from: v, reason: collision with root package name */
    public final g f81557v;

    /* renamed from: w, reason: collision with root package name */
    public final g f81558w;

    /* renamed from: x, reason: collision with root package name */
    public final j f81559x;

    /* renamed from: y, reason: collision with root package name */
    public final a0 f81560y;

    /* renamed from: z, reason: collision with root package name */
    public ln.i f81561z;

    static {
        q0.registerModule("media3.exoplayer.dash");
    }

    /* JADX WARN: Type inference failed for: r2v7, types: [pn.g] */
    /* JADX WARN: Type inference failed for: r2v8, types: [pn.g] */
    public p(p0 p0Var, qn.c cVar, ln.h hVar, b0 b0Var, b bVar, ao.l lVar, sn.v vVar, go.t tVar, long j10, long j11) {
        this.P = p0Var;
        this.E = p0Var.f58054c;
        j0 j0Var = p0Var.f58053b;
        this.F = ((j0) io.bidmachine.media3.common.util.a.checkNotNull(j0Var)).f57963a;
        this.G = j0Var.f57963a;
        this.H = cVar;
        this.f81544i = hVar;
        this.f81553r = b0Var;
        this.f81545j = bVar;
        this.f81547l = vVar;
        this.f81548m = tVar;
        this.f81550o = j10;
        this.f81551p = j11;
        this.f81546k = lVar;
        this.f81549n = new a();
        boolean z10 = cVar != null;
        this.f81543h = z10;
        this.f81552q = a(null);
        this.f81555t = new Object();
        this.f81556u = new SparseArray();
        this.f81559x = new j(this);
        this.N = C.TIME_UNSET;
        this.L = C.TIME_UNSET;
        if (z10) {
            io.bidmachine.media3.common.util.a.checkState(true ^ cVar.f83308d);
            this.f81554s = null;
            this.f81557v = null;
            this.f81558w = null;
            this.f81560y = new z();
            return;
        }
        this.f81554s = new l(this);
        this.f81560y = new m(this);
        final int i10 = 0;
        this.f81557v = new Runnable(this) { // from class: pn.g

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ p f81526c;

            {
                this.f81526c = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        this.f81526c.k();
                        break;
                    default:
                        this.f81526c.j(false);
                        break;
                }
            }
        };
        final int i11 = 1;
        this.f81558w = new Runnable(this) { // from class: pn.g

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ p f81526c;

            {
                this.f81526c = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        this.f81526c.k();
                        break;
                    default:
                        this.f81526c.j(false);
                        break;
                }
            }
        };
    }

    public static boolean g(qn.g gVar) {
        List list = gVar.f83342c;
        for (int i10 = 0; i10 < list.size(); i10++) {
            int i11 = ((qn.a) list.get(i10)).f83296b;
            if (i11 == 1 || i11 == 2) {
                return true;
            }
        }
        return false;
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
        int iIntValue = ((Integer) k0Var.f7718a).intValue() - this.O;
        r0 r0VarA = a(k0Var);
        sn.q qVarWithParameters = this.f7534d.withParameters(0, k0Var);
        f fVar = new f(this.O + iIntValue, this.H, this.f81549n, iIntValue, this.f81545j, this.B, null, this.f81547l, qVarWithParameters, this.f81548m, r0VarA, this.L, this.f81560y, cVar, this.f81546k, this.f81559x, d());
        this.f81556u.put(fVar.f81501b, fVar);
        return fVar;
    }

    @Override // ao.a
    public final void e(g0 g0Var) {
        this.B = g0Var;
        Looper looperMyLooper = Looper.myLooper();
        f0 f0VarD = d();
        sn.v vVar = this.f81547l;
        vVar.setPlayer(looperMyLooper, f0VarD);
        vVar.prepare();
        if (this.f81543h) {
            j(false);
            return;
        }
        this.f81561z = this.f81544i.createDataSource();
        this.A = new go.w("DashMediaSource");
        this.D = a1.createHandlerForCurrentLooper();
        k();
    }

    @Override // ao.a, ao.m0
    public /* bridge */ /* synthetic */ u1 getInitialTimeline() {
        return super.getInitialTimeline();
    }

    @Override // ao.a, ao.m0
    public synchronized p0 getMediaItem() {
        return this.P;
    }

    public final void h(c0 c0Var, long j10, long j11) {
        ao.b0 b0Var = new ao.b0(c0Var.f58295a, c0Var.f58296b, c0Var.getUri(), c0Var.getResponseHeaders(), j10, j11, c0Var.bytesLoaded());
        this.f81548m.onLoadTaskConcluded(c0Var.f58295a);
        this.f81552q.loadCanceled(b0Var, c0Var.f58297c);
    }

    public final void i(IOException iOException) {
        io.bidmachine.media3.common.util.b0.e("DashMediaSource", "Failed to resolve time offset.", iOException);
        this.L = System.currentTimeMillis() - SystemClock.elapsedRealtime();
        j(true);
    }

    @Override // ao.a, ao.m0
    public /* bridge */ /* synthetic */ boolean isSingleWindow() {
        return super.isSingleWindow();
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(boolean r42) {
        /*
            Method dump skipped, instructions count: 1024
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pn.p.j(boolean):void");
    }

    public final void k() {
        Uri uri;
        this.D.removeCallbacks(this.f81557v);
        if (this.A.hasFatalError()) {
            return;
        }
        if (this.A.isLoading()) {
            this.I = true;
            return;
        }
        synchronized (this.f81555t) {
            uri = this.F;
        }
        this.I = false;
        this.A.startLoading(new c0(this.f81561z, new m.a().setUri(uri).setFlags(1).build(), 4, this.f81553r), this.f81554s, this.f81548m.getMinimumLoadableRetryCount(4));
    }

    @Override // ao.a, ao.m0
    public void maybeThrowSourceInfoRefreshError() throws IOException {
        this.f81560y.maybeThrowError();
    }

    @Override // ao.a, ao.m0
    public void releasePeriod(ao.i0 i0Var) {
        f fVar = (f) i0Var;
        fVar.release();
        this.f81556u.remove(fVar.f81501b);
    }

    @Override // ao.a
    public final void releaseSourceInternal() {
        this.I = false;
        this.f81561z = null;
        go.w wVar = this.A;
        if (wVar != null) {
            wVar.release();
            this.A = null;
        }
        this.J = 0L;
        this.K = 0L;
        this.F = this.G;
        this.C = null;
        Handler handler = this.D;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.D = null;
        }
        this.L = C.TIME_UNSET;
        this.M = 0;
        this.N = C.TIME_UNSET;
        this.f81556u.clear();
        this.f81549n.reset();
        this.f81547l.release();
    }

    public void replaceManifestUri(Uri uri) {
        synchronized (this.f81555t) {
            this.F = uri;
            this.G = uri;
        }
    }

    @Override // ao.a, ao.m0
    public synchronized void updateMediaItem(p0 p0Var) {
        this.P = p0Var;
    }
}
