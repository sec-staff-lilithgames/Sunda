package io.odeeo.internal.a0;

import android.net.Uri;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import io.odeeo.internal.a0.t;
import io.odeeo.internal.a0.y;
import io.odeeo.internal.a0.z;
import io.odeeo.internal.b.y0;
import io.odeeo.internal.b.z;
import io.odeeo.internal.p0.i;
import io.odeeo.internal.p0.t;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class a0 extends io.odeeo.internal.a0.a implements z.b {

    /* renamed from: g, reason: collision with root package name */
    public final io.odeeo.internal.b.z f62210g;

    /* renamed from: h, reason: collision with root package name */
    public final z.h f62211h;

    /* renamed from: i, reason: collision with root package name */
    public final i.a f62212i;

    /* renamed from: j, reason: collision with root package name */
    public final y.a f62213j;

    /* renamed from: k, reason: collision with root package name */
    public final io.odeeo.internal.f.h f62214k;

    /* renamed from: l, reason: collision with root package name */
    public final io.odeeo.internal.p0.v f62215l;

    /* renamed from: m, reason: collision with root package name */
    public final int f62216m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f62217n;

    /* renamed from: o, reason: collision with root package name */
    public long f62218o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f62219p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f62220q;

    /* renamed from: r, reason: collision with root package name */
    public io.odeeo.internal.p0.b0 f62221r;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a extends l {
        public a(y0 y0Var) {
            super(y0Var);
        }

        @Override // io.odeeo.internal.a0.l, io.odeeo.internal.b.y0
        public y0.b getPeriod(int i10, y0.b bVar, boolean z10) {
            super.getPeriod(i10, bVar, z10);
            bVar.f63080f = true;
            return bVar;
        }

        @Override // io.odeeo.internal.a0.l, io.odeeo.internal.b.y0
        public y0.d getWindow(int i10, y0.d dVar, long j10) {
            super.getWindow(i10, dVar, j10);
            dVar.f63101l = true;
            return dVar;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b implements v {

        /* renamed from: b, reason: collision with root package name */
        public final i.a f62223b;

        /* renamed from: c, reason: collision with root package name */
        public y.a f62224c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f62225d;

        /* renamed from: e, reason: collision with root package name */
        public io.odeeo.internal.f.i f62226e;

        /* renamed from: f, reason: collision with root package name */
        public io.odeeo.internal.p0.v f62227f;

        /* renamed from: g, reason: collision with root package name */
        public int f62228g;

        /* renamed from: h, reason: collision with root package name */
        public String f62229h;

        /* renamed from: i, reason: collision with root package name */
        public Object f62230i;

        public b(i.a aVar) {
            this(aVar, new io.odeeo.internal.g.f());
        }

        public static /* synthetic */ io.odeeo.internal.f.h a(io.odeeo.internal.f.h hVar, io.odeeo.internal.b.z zVar) {
            return hVar;
        }

        public static /* synthetic */ y b(io.odeeo.internal.g.l lVar) {
            if (lVar == null) {
                lVar = new io.odeeo.internal.g.f();
            }
            return new c(lVar);
        }

        @Override // io.odeeo.internal.a0.v
        public int[] getSupportedTypes() {
            return new int[]{4};
        }

        public b setContinueLoadingCheckIntervalBytes(int i10) {
            this.f62228g = i10;
            return this;
        }

        @Deprecated
        public b setCustomCacheKey(String str) {
            this.f62229h = str;
            return this;
        }

        @Deprecated
        public b setExtractorsFactory(io.odeeo.internal.g.l lVar) {
            this.f62224c = new hs.a(lVar, 1);
            return this;
        }

        @Override // io.odeeo.internal.a0.v
        @Deprecated
        public /* bridge */ /* synthetic */ v setStreamKeys(List list) {
            return super.setStreamKeys(list);
        }

        @Deprecated
        public b setTag(Object obj) {
            this.f62230i = obj;
            return this;
        }

        public b(i.a aVar, io.odeeo.internal.g.l lVar) {
            this(aVar, new hs.a(lVar, 0));
        }

        public static /* synthetic */ y a(io.odeeo.internal.g.l lVar) {
            return new c(lVar);
        }

        @Override // io.odeeo.internal.a0.v
        @Deprecated
        public b setDrmHttpDataSourceFactory(t.b bVar) {
            if (!this.f62225d) {
                ((io.odeeo.internal.f.d) this.f62226e).setDrmHttpDataSourceFactory(bVar);
            }
            return this;
        }

        @Override // io.odeeo.internal.a0.v
        @Deprecated
        public b setDrmSessionManager(io.odeeo.internal.f.h hVar) {
            if (hVar == null) {
                setDrmSessionManagerProvider((io.odeeo.internal.f.i) null);
                return this;
            }
            setDrmSessionManagerProvider((io.odeeo.internal.f.i) new ha.a(hVar, 6));
            return this;
        }

        @Override // io.odeeo.internal.a0.v
        public b setDrmSessionManagerProvider(io.odeeo.internal.f.i iVar) {
            if (iVar != null) {
                this.f62226e = iVar;
                this.f62225d = true;
                return this;
            }
            this.f62226e = new io.odeeo.internal.f.d();
            this.f62225d = false;
            return this;
        }

        @Override // io.odeeo.internal.a0.v
        @Deprecated
        public b setDrmUserAgent(String str) {
            if (!this.f62225d) {
                ((io.odeeo.internal.f.d) this.f62226e).setDrmUserAgent(str);
            }
            return this;
        }

        @Override // io.odeeo.internal.a0.v
        public b setLoadErrorHandlingPolicy(io.odeeo.internal.p0.v vVar) {
            if (vVar == null) {
                vVar = new io.odeeo.internal.p0.r();
            }
            this.f62227f = vVar;
            return this;
        }

        public b(i.a aVar, y.a aVar2) {
            this.f62223b = aVar;
            this.f62224c = aVar2;
            this.f62226e = new io.odeeo.internal.f.d();
            this.f62227f = new io.odeeo.internal.p0.r();
            this.f62228g = ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
        }

        @Override // io.odeeo.internal.a0.v
        @Deprecated
        public a0 createMediaSource(Uri uri) {
            return createMediaSource(new z.c().setUri(uri).build());
        }

        @Override // io.odeeo.internal.a0.v
        public a0 createMediaSource(io.odeeo.internal.b.z zVar) {
            io.odeeo.internal.q0.a.checkNotNull(zVar.f63110b);
            z.h hVar = zVar.f63110b;
            boolean z10 = false;
            boolean z11 = hVar.f63184i == null && this.f62230i != null;
            if (hVar.f63181f == null && this.f62229h != null) {
                z10 = true;
            }
            if (z11 && z10) {
                zVar = zVar.buildUpon().setTag(this.f62230i).setCustomCacheKey(this.f62229h).build();
            } else if (z11) {
                zVar = zVar.buildUpon().setTag(this.f62230i).build();
            } else if (z10) {
                zVar = zVar.buildUpon().setCustomCacheKey(this.f62229h).build();
            }
            io.odeeo.internal.b.z zVar2 = zVar;
            return new a0(zVar2, this.f62223b, this.f62224c, this.f62226e.get(zVar2), this.f62227f, this.f62228g, null);
        }
    }

    public /* synthetic */ a0(io.odeeo.internal.b.z zVar, i.a aVar, y.a aVar2, io.odeeo.internal.f.h hVar, io.odeeo.internal.p0.v vVar, int i10, a aVar3) {
        this(zVar, aVar, aVar2, hVar, vVar, i10);
    }

    @Override // io.odeeo.internal.a0.a, io.odeeo.internal.a0.t
    public r createPeriod(t.a aVar, io.odeeo.internal.p0.b bVar, long j10) {
        io.odeeo.internal.p0.i iVarCreateDataSource = this.f62212i.createDataSource();
        io.odeeo.internal.p0.b0 b0Var = this.f62221r;
        if (b0Var != null) {
            iVarCreateDataSource.addTransferListener(b0Var);
        }
        return new z(this.f62211h.f63176a, iVarCreateDataSource, this.f62213j.createProgressiveMediaExtractor(), this.f62214k, a(aVar), this.f62215l, b(aVar), this, bVar, this.f62211h.f63181f, this.f62216m);
    }

    public final void d() {
        y0 g0Var = new g0(this.f62218o, this.f62219p, false, this.f62220q, (Object) null, this.f62210g);
        if (this.f62217n) {
            g0Var = new a(g0Var);
        }
        a(g0Var);
    }

    @Override // io.odeeo.internal.a0.a, io.odeeo.internal.a0.t
    public io.odeeo.internal.b.z getMediaItem() {
        return this.f62210g;
    }

    @Override // io.odeeo.internal.a0.z.b
    public void onSourceInfoRefreshed(long j10, boolean z10, boolean z11) {
        if (j10 == C.TIME_UNSET) {
            j10 = this.f62218o;
        }
        if (!this.f62217n && this.f62218o == j10 && this.f62219p == z10 && this.f62220q == z11) {
            return;
        }
        this.f62218o = j10;
        this.f62219p = z10;
        this.f62220q = z11;
        this.f62217n = false;
        d();
    }

    @Override // io.odeeo.internal.a0.a
    public void prepareSourceInternal(io.odeeo.internal.p0.b0 b0Var) {
        this.f62221r = b0Var;
        this.f62214k.prepare();
        d();
    }

    @Override // io.odeeo.internal.a0.a, io.odeeo.internal.a0.t
    public void releasePeriod(r rVar) {
        ((z) rVar).release();
    }

    @Override // io.odeeo.internal.a0.a
    public void releaseSourceInternal() {
        this.f62214k.release();
    }

    public a0(io.odeeo.internal.b.z zVar, i.a aVar, y.a aVar2, io.odeeo.internal.f.h hVar, io.odeeo.internal.p0.v vVar, int i10) {
        this.f62211h = (z.h) io.odeeo.internal.q0.a.checkNotNull(zVar.f63110b);
        this.f62210g = zVar;
        this.f62212i = aVar;
        this.f62213j = aVar2;
        this.f62214k = hVar;
        this.f62215l = vVar;
        this.f62216m = i10;
        this.f62217n = true;
        this.f62218o = C.TIME_UNSET;
    }

    @Override // io.odeeo.internal.a0.a, io.odeeo.internal.a0.t
    public void maybeThrowSourceInfoRefreshError() {
    }
}
