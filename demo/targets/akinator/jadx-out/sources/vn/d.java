package vn;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import ao.g0;
import ao.r0;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.inmobi.commons.core.configs.CrashConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import gn.z0;
import go.b0;
import go.c0;
import go.s;
import go.t;
import go.u;
import go.v;
import go.w;
import io.bidmachine.media3.common.util.a1;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import ln.m;
import ln.x;
import nh.b5;
import nh.i7;
import on.z;
import qm.zMPW.GalEuEfxjome;
import vn.f;
import vn.h;
import vn.j;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class d implements q, u {

    /* renamed from: s, reason: collision with root package name */
    public static final b f89336s = new b();

    /* renamed from: b, reason: collision with root package name */
    public final tn.h f89337b;

    /* renamed from: c, reason: collision with root package name */
    public final k f89338c;

    /* renamed from: e, reason: collision with root package name */
    public final t f89339e;

    /* renamed from: f, reason: collision with root package name */
    public final HashMap f89340f;

    /* renamed from: g, reason: collision with root package name */
    public final CopyOnWriteArrayList f89341g;

    /* renamed from: h, reason: collision with root package name */
    public final double f89342h;

    /* renamed from: i, reason: collision with root package name */
    public final go.i f89343i;

    /* renamed from: j, reason: collision with root package name */
    public r0 f89344j;

    /* renamed from: k, reason: collision with root package name */
    public w f89345k;

    /* renamed from: l, reason: collision with root package name */
    public Handler f89346l;

    /* renamed from: m, reason: collision with root package name */
    public p f89347m;

    /* renamed from: n, reason: collision with root package name */
    public h f89348n;

    /* renamed from: o, reason: collision with root package name */
    public Uri f89349o;

    /* renamed from: p, reason: collision with root package name */
    public f f89350p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f89351q;

    /* renamed from: r, reason: collision with root package name */
    public long f89352r;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class a implements u {

        /* renamed from: b, reason: collision with root package name */
        public final Uri f89353b;

        /* renamed from: c, reason: collision with root package name */
        public final w f89354c = new w("DefaultHlsPlaylistTracker:MediaPlaylist");

        /* renamed from: e, reason: collision with root package name */
        public final ln.i f89355e;

        /* renamed from: f, reason: collision with root package name */
        public f f89356f;

        /* renamed from: g, reason: collision with root package name */
        public long f89357g;

        /* renamed from: h, reason: collision with root package name */
        public long f89358h;

        /* renamed from: i, reason: collision with root package name */
        public long f89359i;

        /* renamed from: j, reason: collision with root package name */
        public long f89360j;

        /* renamed from: k, reason: collision with root package name */
        public boolean f89361k;

        /* renamed from: l, reason: collision with root package name */
        public IOException f89362l;

        /* renamed from: m, reason: collision with root package name */
        public boolean f89363m;

        public a(Uri uri) {
            this.f89353b = uri;
            this.f89355e = d.this.f89337b.createDataSource(4);
        }

        public static boolean a(a aVar, long j10) {
            aVar.f89360j = SystemClock.elapsedRealtime() + j10;
            Uri uri = aVar.f89353b;
            d dVar = d.this;
            if (!uri.equals(dVar.f89349o)) {
                return false;
            }
            List list = dVar.f89348n.f89430e;
            int size = list.size();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            for (int i10 = 0; i10 < size; i10++) {
                a aVar2 = (a) io.bidmachine.media3.common.util.a.checkNotNull((a) dVar.f89340f.get(((h.b) list.get(i10)).f89442a));
                if (jElapsedRealtime > aVar2.f89360j) {
                    Uri uri2 = aVar2.f89353b;
                    dVar.f89349o = uri2;
                    aVar2.d(dVar.a(uri2));
                    return false;
                }
            }
            return true;
        }

        public final Uri b() {
            f fVar = this.f89356f;
            Uri uri = this.f89353b;
            if (fVar != null) {
                f.C0801f c0801f = fVar.f89385v;
                if (c0801f.f89412a != C.TIME_UNSET || c0801f.f89416e) {
                    Uri.Builder builderBuildUpon = uri.buildUpon();
                    f fVar2 = this.f89356f;
                    if (fVar2.f89385v.f89416e) {
                        builderBuildUpon.appendQueryParameter("_HLS_msn", String.valueOf(fVar2.f89374k + fVar2.f89381r.size()));
                        f fVar3 = this.f89356f;
                        if (fVar3.f89377n != C.TIME_UNSET) {
                            b5 b5Var = fVar3.f89382s;
                            int size = b5Var.size();
                            if (!b5Var.isEmpty() && ((f.c) i7.getLast(b5Var)).f89406o) {
                                size--;
                            }
                            builderBuildUpon.appendQueryParameter("_HLS_part", String.valueOf(size));
                        }
                    }
                    f.C0801f c0801f2 = this.f89356f.f89385v;
                    if (c0801f2.f89412a != C.TIME_UNSET) {
                        builderBuildUpon.appendQueryParameter("_HLS_skip", c0801f2.f89413b ? "v2" : "YES");
                    }
                    return builderBuildUpon.build();
                }
            }
            return uri;
        }

        public final void c(Uri uri) {
            d dVar = d.this;
            b0 b0VarCreatePlaylistParser = dVar.f89338c.createPlaylistParser(dVar.f89348n, this.f89356f);
            ln.m mVarBuild = new m.a().setUri(uri).setFlags(1).build();
            go.i iVar = dVar.f89343i;
            if (iVar == null) {
                c0 c0Var = new c0(this.f89355e, mVarBuild, 4, b0VarCreatePlaylistParser);
                this.f89354c.startLoading(c0Var, this, dVar.f89339e.getMinimumLoadableRetryCount(c0Var.f58297c));
            } else {
                go.j objectType = new go.j(iVar, ApsMetricsDataMap.APSMETRICS_FIELD_HOSTNAME).setObjectType("m");
                if (dVar.f89350p != null) {
                    objectType.setIsLive(!r0.f89378o);
                }
                objectType.createCmcdData();
                throw null;
            }
        }

        public final void d(Uri uri) {
            this.f89360j = 0L;
            if (this.f89361k) {
                return;
            }
            w wVar = this.f89354c;
            if (wVar.isLoading() || wVar.hasFatalError()) {
                return;
            }
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j10 = this.f89359i;
            if (jElapsedRealtime >= j10) {
                c(uri);
            } else {
                this.f89361k = true;
                d.this.f89346l.postDelayed(new z(19, this, uri), j10 - jElapsedRealtime);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:30:0x007c  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0080  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void e(vn.f r20, ao.b0 r21) {
            /*
                Method dump skipped, instructions count: 389
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: vn.d.a.e(vn.f, ao.b0):void");
        }

        public f getPlaylistSnapshot() {
            return this.f89356f;
        }

        public boolean isActiveForPlayback() {
            return this.f89363m;
        }

        public boolean isSnapshotValid() {
            int i10;
            if (this.f89356f == null) {
                return false;
            }
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long jMax = Math.max(CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL, a1.usToMs(this.f89356f.f89384u));
            f fVar = this.f89356f;
            return fVar.f89378o || (i10 = fVar.f89367d) == 2 || i10 == 1 || this.f89357g + jMax > jElapsedRealtime;
        }

        public void loadPlaylist(boolean z10) {
            d(z10 ? b() : this.f89353b);
        }

        public void maybeThrowPlaylistRefreshError() throws IOException {
            this.f89354c.maybeThrowError();
            IOException iOException = this.f89362l;
            if (iOException != null) {
                throw iOException;
            }
        }

        public void release() {
            this.f89354c.release();
        }

        public void setActiveForPlayback(boolean z10) {
            this.f89363m = z10;
        }

        @Override // go.u
        public void onLoadCanceled(c0 c0Var, long j10, long j11, boolean z10) {
            ao.b0 b0Var = new ao.b0(c0Var.f58295a, c0Var.f58296b, c0Var.getUri(), c0Var.getResponseHeaders(), j10, j11, c0Var.bytesLoaded());
            d dVar = d.this;
            dVar.f89339e.onLoadTaskConcluded(c0Var.f58295a);
            dVar.f89344j.loadCanceled(b0Var, 4);
        }

        @Override // go.u
        public void onLoadCompleted(c0 c0Var, long j10, long j11) {
            i iVar = (i) c0Var.getResult();
            ao.b0 b0Var = new ao.b0(c0Var.f58295a, c0Var.f58296b, c0Var.getUri(), c0Var.getResponseHeaders(), j10, j11, c0Var.bytesLoaded());
            boolean z10 = iVar instanceof f;
            d dVar = d.this;
            if (z10) {
                e((f) iVar, b0Var);
                dVar.f89344j.loadCompleted(b0Var, 4);
            } else {
                z0 z0VarCreateForMalformedManifest = z0.createForMalformedManifest("Loaded playlist has unexpected type.", null);
                this.f89362l = z0VarCreateForMalformedManifest;
                dVar.f89344j.loadError(b0Var, 4, (IOException) z0VarCreateForMalformedManifest, true);
            }
            dVar.f89339e.onLoadTaskConcluded(c0Var.f58295a);
        }

        @Override // go.u
        public v onLoadError(c0 c0Var, long j10, long j11, IOException iOException, int i10) {
            v vVarCreateRetryAction;
            long j12 = c0Var.f58295a;
            int i11 = c0Var.f58297c;
            ao.b0 b0Var = new ao.b0(j12, c0Var.f58296b, c0Var.getUri(), c0Var.getResponseHeaders(), j10, j11, c0Var.bytesLoaded());
            boolean z10 = c0Var.getUri().getQueryParameter(GalEuEfxjome.PIwSkeGZOzCU) != null;
            boolean z11 = iOException instanceof j.a;
            d dVar = d.this;
            if (z10 || z11) {
                int i12 = iOException instanceof x ? ((x) iOException).f73534e : Integer.MAX_VALUE;
                if (z11 || i12 == 400 || i12 == 503) {
                    this.f89359i = SystemClock.elapsedRealtime();
                    loadPlaylist(false);
                    ((r0) a1.castNonNull(dVar.f89344j)).loadError(b0Var, i11, iOException, true);
                    return w.f58371e;
                }
            }
            s sVar = new s(b0Var, new g0(i11), iOException, i10);
            CopyOnWriteArrayList copyOnWriteArrayList = dVar.f89341g;
            t tVar = dVar.f89339e;
            Iterator it = copyOnWriteArrayList.iterator();
            boolean z12 = false;
            while (it.hasNext()) {
                z12 |= !((m) it.next()).onPlaylistError(this.f89353b, sVar, false);
            }
            if (z12) {
                long retryDelayMsFor = tVar.getRetryDelayMsFor(sVar);
                vVarCreateRetryAction = retryDelayMsFor != C.TIME_UNSET ? w.createRetryAction(false, retryDelayMsFor) : w.f58372f;
            } else {
                vVarCreateRetryAction = w.f58371e;
            }
            boolean zIsRetry = vVarCreateRetryAction.isRetry();
            dVar.f89344j.loadError(b0Var, i11, iOException, !zIsRetry);
            if (!zIsRetry) {
                tVar.onLoadTaskConcluded(c0Var.f58295a);
            }
            return vVarCreateRetryAction;
        }

        @Override // go.u
        public void onLoadStarted(c0 c0Var, long j10, long j11, int i10) {
            d.this.f89344j.loadStarted(i10 == 0 ? new ao.b0(c0Var.f58295a, c0Var.f58296b, j10) : new ao.b0(c0Var.f58295a, c0Var.f58296b, c0Var.getUri(), c0Var.getResponseHeaders(), j10, j11, c0Var.bytesLoaded()), c0Var.f58297c, i10);
        }
    }

    public d(tn.h hVar, t tVar, k kVar, go.i iVar) {
        this(hVar, tVar, kVar, iVar, 3.5d);
    }

    public final Uri a(Uri uri) {
        f.d dVar;
        f fVar = this.f89350p;
        if (fVar == null || !fVar.f89385v.f89416e || (dVar = (f.d) fVar.f89383t.get(uri)) == null) {
            return uri;
        }
        Uri.Builder builderBuildUpon = uri.buildUpon();
        builderBuildUpon.appendQueryParameter("_HLS_msn", String.valueOf(dVar.f89408b));
        int i10 = dVar.f89409c;
        if (i10 != -1) {
            builderBuildUpon.appendQueryParameter("_HLS_part", String.valueOf(i10));
        }
        return builderBuildUpon.build();
    }

    @Override // vn.q
    public void addListener(m mVar) {
        io.bidmachine.media3.common.util.a.checkNotNull(mVar);
        this.f89341g.add(mVar);
    }

    @Override // vn.q
    public void deactivatePlaylistForPlayback(Uri uri) {
        a aVar = (a) this.f89340f.get(uri);
        if (aVar != null) {
            aVar.setActiveForPlayback(false);
        }
    }

    @Override // vn.q
    public boolean excludeMediaPlaylist(Uri uri, long j10) {
        if (((a) this.f89340f.get(uri)) != null) {
            return !a.a(r2, j10);
        }
        return false;
    }

    @Override // vn.q
    public long getInitialStartTimeUs() {
        return this.f89352r;
    }

    @Override // vn.q
    public h getMultivariantPlaylist() {
        return this.f89348n;
    }

    @Override // vn.q
    public f getPlaylistSnapshot(Uri uri, boolean z10) {
        HashMap map = this.f89340f;
        f playlistSnapshot = ((a) map.get(uri)).getPlaylistSnapshot();
        if (playlistSnapshot != null && z10) {
            if (!uri.equals(this.f89349o)) {
                List list = this.f89348n.f89430e;
                int i10 = 0;
                while (true) {
                    if (i10 >= list.size()) {
                        break;
                    }
                    if (uri.equals(((h.b) list.get(i10)).f89442a)) {
                        f fVar = this.f89350p;
                        if (fVar == null || !fVar.f89378o) {
                            this.f89349o = uri;
                            a aVar = (a) map.get(uri);
                            f fVar2 = aVar.f89356f;
                            if (fVar2 == null || !fVar2.f89378o) {
                                aVar.d(a(uri));
                            } else {
                                this.f89350p = fVar2;
                                ((tn.n) this.f89347m).onPrimaryPlaylistRefreshed(fVar2);
                            }
                        }
                    } else {
                        i10++;
                    }
                }
            }
            a aVar2 = (a) map.get(uri);
            f playlistSnapshot2 = aVar2.getPlaylistSnapshot();
            if (!aVar2.isActiveForPlayback()) {
                aVar2.setActiveForPlayback(true);
                if (playlistSnapshot2 != null && !playlistSnapshot2.f89378o) {
                    aVar2.loadPlaylist(true);
                }
            }
        }
        return playlistSnapshot;
    }

    @Override // vn.q
    public boolean isLive() {
        return this.f89351q;
    }

    @Override // vn.q
    public boolean isSnapshotValid(Uri uri) {
        return ((a) this.f89340f.get(uri)).isSnapshotValid();
    }

    @Override // vn.q
    public void maybeThrowPlaylistRefreshError(Uri uri) throws IOException {
        ((a) this.f89340f.get(uri)).maybeThrowPlaylistRefreshError();
    }

    @Override // vn.q
    public void maybeThrowPrimaryPlaylistRefreshError() throws IOException {
        w wVar = this.f89345k;
        if (wVar != null) {
            wVar.maybeThrowError();
        }
        Uri uri = this.f89349o;
        if (uri != null) {
            maybeThrowPlaylistRefreshError(uri);
        }
    }

    @Override // vn.q
    public void refreshPlaylist(Uri uri) {
        ((a) this.f89340f.get(uri)).loadPlaylist(true);
    }

    @Override // vn.q
    public void removeListener(m mVar) {
        this.f89341g.remove(mVar);
    }

    @Override // vn.q
    public void start(Uri uri, r0 r0Var, p pVar) {
        this.f89346l = a1.createHandlerForCurrentLooper();
        this.f89344j = r0Var;
        this.f89347m = pVar;
        ln.m mVarBuild = new m.a().setUri(uri).setFlags(1).build();
        go.i iVar = this.f89343i;
        if (iVar != null) {
            new go.j(iVar, ApsMetricsDataMap.APSMETRICS_FIELD_HOSTNAME).setObjectType("m").createCmcdData();
            throw null;
        }
        c0 c0Var = new c0(this.f89337b.createDataSource(4), mVarBuild, 4, this.f89338c.createPlaylistParser());
        io.bidmachine.media3.common.util.a.checkState(this.f89345k == null);
        w wVar = new w("DefaultHlsPlaylistTracker:MultivariantPlaylist");
        this.f89345k = wVar;
        wVar.startLoading(c0Var, this, this.f89339e.getMinimumLoadableRetryCount(c0Var.f58297c));
    }

    @Override // vn.q
    public void stop() {
        this.f89349o = null;
        this.f89350p = null;
        this.f89348n = null;
        this.f89352r = C.TIME_UNSET;
        this.f89345k.release();
        this.f89345k = null;
        HashMap map = this.f89340f;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((a) it.next()).release();
        }
        this.f89346l.removeCallbacksAndMessages(null);
        this.f89346l = null;
        map.clear();
    }

    public d(tn.h hVar, t tVar, k kVar, go.i iVar, double d10) {
        this.f89337b = hVar;
        this.f89338c = kVar;
        this.f89339e = tVar;
        this.f89343i = iVar;
        this.f89342h = d10;
        this.f89341g = new CopyOnWriteArrayList();
        this.f89340f = new HashMap();
        this.f89352r = C.TIME_UNSET;
    }

    @Override // go.u
    public void onLoadCanceled(c0 c0Var, long j10, long j11, boolean z10) {
        ao.b0 b0Var = new ao.b0(c0Var.f58295a, c0Var.f58296b, c0Var.getUri(), c0Var.getResponseHeaders(), j10, j11, c0Var.bytesLoaded());
        this.f89339e.onLoadTaskConcluded(c0Var.f58295a);
        this.f89344j.loadCanceled(b0Var, 4);
    }

    @Override // go.u
    public void onLoadCompleted(c0 c0Var, long j10, long j11) {
        HashMap map;
        i iVar = (i) c0Var.getResult();
        boolean z10 = iVar instanceof f;
        h hVarCreateSingleVariantMultivariantPlaylist = z10 ? h.createSingleVariantMultivariantPlaylist(iVar.f89448a) : (h) iVar;
        this.f89348n = hVarCreateSingleVariantMultivariantPlaylist;
        this.f89349o = ((h.b) hVarCreateSingleVariantMultivariantPlaylist.f89430e.get(0)).f89442a;
        this.f89341g.add(new c(this));
        List list = hVarCreateSingleVariantMultivariantPlaylist.f89429d;
        int size = list.size();
        int i10 = 0;
        while (true) {
            map = this.f89340f;
            if (i10 >= size) {
                break;
            }
            Uri uri = (Uri) list.get(i10);
            map.put(uri, new a(uri));
            i10++;
        }
        ao.b0 b0Var = new ao.b0(c0Var.f58295a, c0Var.f58296b, c0Var.getUri(), c0Var.getResponseHeaders(), j10, j11, c0Var.bytesLoaded());
        a aVar = (a) map.get(this.f89349o);
        if (z10) {
            aVar.e((f) iVar, b0Var);
        } else {
            aVar.loadPlaylist(false);
        }
        this.f89339e.onLoadTaskConcluded(c0Var.f58295a);
        this.f89344j.loadCompleted(b0Var, 4);
    }

    @Override // go.u
    public v onLoadError(c0 c0Var, long j10, long j11, IOException iOException, int i10) {
        ao.b0 b0Var = new ao.b0(c0Var.f58295a, c0Var.f58296b, c0Var.getUri(), c0Var.getResponseHeaders(), j10, j11, c0Var.bytesLoaded());
        int i11 = c0Var.f58297c;
        s sVar = new s(b0Var, new g0(i11), iOException, i10);
        t tVar = this.f89339e;
        long retryDelayMsFor = tVar.getRetryDelayMsFor(sVar);
        boolean z10 = retryDelayMsFor == C.TIME_UNSET;
        this.f89344j.loadError(b0Var, i11, iOException, z10);
        if (z10) {
            tVar.onLoadTaskConcluded(c0Var.f58295a);
        }
        return z10 ? w.f58372f : w.createRetryAction(false, retryDelayMsFor);
    }

    @Override // go.u
    public void onLoadStarted(c0 c0Var, long j10, long j11, int i10) {
        this.f89344j.loadStarted(i10 == 0 ? new ao.b0(c0Var.f58295a, c0Var.f58296b, j10) : new ao.b0(c0Var.f58295a, c0Var.f58296b, c0Var.getUri(), c0Var.getResponseHeaders(), j10, j11, c0Var.bytesLoaded()), c0Var.f58297c, i10);
    }
}
