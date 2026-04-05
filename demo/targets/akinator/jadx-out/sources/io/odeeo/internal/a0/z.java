package io.odeeo.internal.a0;

import android.net.Uri;
import android.os.Handler;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import io.odeeo.internal.a0.c0;
import io.odeeo.internal.a0.m;
import io.odeeo.internal.a0.r;
import io.odeeo.internal.a0.u;
import io.odeeo.internal.a0.z;
import io.odeeo.internal.b.t;
import io.odeeo.internal.b.t0;
import io.odeeo.internal.f.g;
import io.odeeo.internal.g.v;
import io.odeeo.internal.p0.m;
import io.odeeo.internal.p0.v;
import io.odeeo.internal.p0.w;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class z implements r, io.odeeo.internal.g.j, w.b<a>, w.f, c0.d {
    public static final Map<String, String> N = d();
    public static final io.odeeo.internal.b.t O = new t.b().setId("icy").setSampleMimeType("application/x-icy").build();
    public boolean B;
    public boolean D;
    public boolean E;
    public int F;
    public long H;
    public boolean J;
    public int K;
    public boolean L;
    public boolean M;

    /* renamed from: a, reason: collision with root package name */
    public final Uri f62487a;

    /* renamed from: b, reason: collision with root package name */
    public final io.odeeo.internal.p0.i f62488b;

    /* renamed from: c, reason: collision with root package name */
    public final io.odeeo.internal.f.h f62489c;

    /* renamed from: e, reason: collision with root package name */
    public final io.odeeo.internal.p0.v f62490e;

    /* renamed from: f, reason: collision with root package name */
    public final u.a f62491f;

    /* renamed from: g, reason: collision with root package name */
    public final g.a f62492g;

    /* renamed from: h, reason: collision with root package name */
    public final b f62493h;

    /* renamed from: i, reason: collision with root package name */
    public final io.odeeo.internal.p0.b f62494i;

    /* renamed from: j, reason: collision with root package name */
    public final String f62495j;

    /* renamed from: k, reason: collision with root package name */
    public final long f62496k;

    /* renamed from: m, reason: collision with root package name */
    public final y f62498m;

    /* renamed from: o, reason: collision with root package name */
    public final Runnable f62500o;

    /* renamed from: p, reason: collision with root package name */
    public final Runnable f62501p;

    /* renamed from: r, reason: collision with root package name */
    public r.a f62503r;

    /* renamed from: s, reason: collision with root package name */
    public io.odeeo.internal.w.b f62504s;

    /* renamed from: v, reason: collision with root package name */
    public boolean f62507v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f62508w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f62509x;

    /* renamed from: y, reason: collision with root package name */
    public e f62510y;

    /* renamed from: z, reason: collision with root package name */
    public io.odeeo.internal.g.v f62511z;

    /* renamed from: l, reason: collision with root package name */
    public final io.odeeo.internal.p0.w f62497l = new io.odeeo.internal.p0.w("ProgressiveMediaPeriod");

    /* renamed from: n, reason: collision with root package name */
    public final io.odeeo.internal.q0.g f62499n = new io.odeeo.internal.q0.g();

    /* renamed from: q, reason: collision with root package name */
    public final Handler f62502q = io.odeeo.internal.q0.g0.createHandlerForCurrentLooper();

    /* renamed from: u, reason: collision with root package name */
    public d[] f62506u = new d[0];

    /* renamed from: t, reason: collision with root package name */
    public c0[] f62505t = new c0[0];
    public long I = C.TIME_UNSET;
    public long G = -1;
    public long A = C.TIME_UNSET;
    public int C = 1;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class a implements w.e, m.a {

        /* renamed from: b, reason: collision with root package name */
        public final Uri f62513b;

        /* renamed from: c, reason: collision with root package name */
        public final io.odeeo.internal.p0.a0 f62514c;

        /* renamed from: d, reason: collision with root package name */
        public final y f62515d;

        /* renamed from: e, reason: collision with root package name */
        public final io.odeeo.internal.g.j f62516e;

        /* renamed from: f, reason: collision with root package name */
        public final io.odeeo.internal.q0.g f62517f;

        /* renamed from: h, reason: collision with root package name */
        public volatile boolean f62519h;

        /* renamed from: j, reason: collision with root package name */
        public long f62521j;

        /* renamed from: m, reason: collision with root package name */
        public io.odeeo.internal.g.x f62524m;

        /* renamed from: n, reason: collision with root package name */
        public boolean f62525n;

        /* renamed from: g, reason: collision with root package name */
        public final io.odeeo.internal.g.u f62518g = new io.odeeo.internal.g.u();

        /* renamed from: i, reason: collision with root package name */
        public boolean f62520i = true;

        /* renamed from: l, reason: collision with root package name */
        public long f62523l = -1;

        /* renamed from: a, reason: collision with root package name */
        public final long f62512a = n.getNewId();

        /* renamed from: k, reason: collision with root package name */
        public io.odeeo.internal.p0.m f62522k = a(0);

        public a(Uri uri, io.odeeo.internal.p0.i iVar, y yVar, io.odeeo.internal.g.j jVar, io.odeeo.internal.q0.g gVar) {
            this.f62513b = uri;
            this.f62514c = new io.odeeo.internal.p0.a0(iVar);
            this.f62515d = yVar;
            this.f62516e = jVar;
            this.f62517f = gVar;
        }

        @Override // io.odeeo.internal.p0.w.e
        public void cancelLoad() {
            this.f62519h = true;
        }

        @Override // io.odeeo.internal.p0.w.e
        public void load() throws IOException {
            int i10 = 0;
            while (i10 == 0 && !this.f62519h) {
                try {
                    long j10 = this.f62518g.f64171a;
                    io.odeeo.internal.p0.m mVarA = a(j10);
                    this.f62522k = mVarA;
                    long jOpen = this.f62514c.open(mVarA);
                    this.f62523l = jOpen;
                    if (jOpen != -1) {
                        this.f62523l = jOpen + j10;
                    }
                    z.this.f62504s = io.odeeo.internal.w.b.parse(this.f62514c.getResponseHeaders());
                    io.odeeo.internal.p0.g mVar = this.f62514c;
                    if (z.this.f62504s != null && z.this.f62504s.f67298f != -1) {
                        mVar = new m(this.f62514c, z.this.f62504s.f67298f, this);
                        io.odeeo.internal.g.x xVarG = z.this.g();
                        this.f62524m = xVarG;
                        xVarG.format(z.O);
                    }
                    this.f62515d.init(mVar, this.f62513b, this.f62514c.getResponseHeaders(), j10, this.f62523l, this.f62516e);
                    if (z.this.f62504s != null) {
                        this.f62515d.disableSeekingOnMp3Streams();
                    }
                    if (this.f62520i) {
                        this.f62515d.seek(j10, this.f62521j);
                        this.f62520i = false;
                    }
                    while (i10 == 0 && !this.f62519h) {
                        try {
                            this.f62517f.block();
                            i10 = this.f62515d.read(this.f62518g);
                            long currentInputPosition = this.f62515d.getCurrentInputPosition();
                            if (currentInputPosition > z.this.f62496k + j10) {
                                this.f62517f.close();
                                z.this.f62502q.post(z.this.f62501p);
                                j10 = currentInputPosition;
                            }
                        } catch (InterruptedException unused) {
                            throw new InterruptedIOException();
                        }
                    }
                    if (i10 == 1) {
                        i10 = 0;
                    } else if (this.f62515d.getCurrentInputPosition() != -1) {
                        this.f62518g.f64171a = this.f62515d.getCurrentInputPosition();
                    }
                    io.odeeo.internal.p0.l.closeQuietly(this.f62514c);
                } catch (Throwable th2) {
                    if (i10 != 1 && this.f62515d.getCurrentInputPosition() != -1) {
                        this.f62518g.f64171a = this.f62515d.getCurrentInputPosition();
                    }
                    io.odeeo.internal.p0.l.closeQuietly(this.f62514c);
                    throw th2;
                }
            }
        }

        @Override // io.odeeo.internal.a0.m.a
        public void onIcyMetadata(io.odeeo.internal.q0.x xVar) {
            long jMax = !this.f62525n ? this.f62521j : Math.max(z.this.f(), this.f62521j);
            int iBytesLeft = xVar.bytesLeft();
            io.odeeo.internal.g.x xVar2 = (io.odeeo.internal.g.x) io.odeeo.internal.q0.a.checkNotNull(this.f62524m);
            xVar2.sampleData(xVar, iBytesLeft);
            xVar2.sampleMetadata(jMax, 1, iBytesLeft, 0, null);
            this.f62525n = true;
        }

        public final io.odeeo.internal.p0.m a(long j10) {
            return new m.b().setUri(this.f62513b).setPosition(j10).setKey(z.this.f62495j).setFlags(6).setHttpRequestHeaders(z.N).build();
        }

        public final void a(long j10, long j11) {
            this.f62518g.f64171a = j10;
            this.f62521j = j11;
            this.f62520i = true;
            this.f62525n = false;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface b {
        void onSourceInfoRefreshed(long j10, boolean z10, boolean z11);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class c implements d0 {

        /* renamed from: a, reason: collision with root package name */
        public final int f62527a;

        public c(int i10) {
            this.f62527a = i10;
        }

        @Override // io.odeeo.internal.a0.d0
        public boolean isReady() {
            return z.this.a(this.f62527a);
        }

        @Override // io.odeeo.internal.a0.d0
        public void maybeThrowError() throws IOException {
            z.this.d(this.f62527a);
        }

        @Override // io.odeeo.internal.a0.d0
        public int readData(io.odeeo.internal.b.u uVar, io.odeeo.internal.e.g gVar, int i10) {
            return z.this.a(this.f62527a, uVar, gVar, i10);
        }

        @Override // io.odeeo.internal.a0.d0
        public int skipData(long j10) {
            return z.this.a(this.f62527a, j10);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final int f62529a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f62530b;

        public d(int i10, boolean z10) {
            this.f62529a = i10;
            this.f62530b = z10;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && d.class == obj.getClass()) {
                d dVar = (d) obj;
                if (this.f62529a == dVar.f62529a && this.f62530b == dVar.f62530b) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (this.f62529a * 31) + (this.f62530b ? 1 : 0);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        public final l0 f62531a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean[] f62532b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean[] f62533c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean[] f62534d;

        public e(l0 l0Var, boolean[] zArr) {
            this.f62531a = l0Var;
            this.f62532b = zArr;
            int i10 = l0Var.f62401a;
            this.f62533c = new boolean[i10];
            this.f62534d = new boolean[i10];
        }
    }

    public z(Uri uri, io.odeeo.internal.p0.i iVar, y yVar, io.odeeo.internal.f.h hVar, g.a aVar, io.odeeo.internal.p0.v vVar, u.a aVar2, b bVar, io.odeeo.internal.p0.b bVar2, String str, int i10) {
        this.f62487a = uri;
        this.f62488b = iVar;
        this.f62489c = hVar;
        this.f62492g = aVar;
        this.f62490e = vVar;
        this.f62491f = aVar2;
        this.f62493h = bVar;
        this.f62494i = bVar2;
        this.f62495j = str;
        this.f62496k = i10;
        this.f62498m = yVar;
        final int i11 = 0;
        this.f62500o = new Runnable(this) { // from class: hs.g

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ z f59161c;

            {
                this.f59161c = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        this.f59161c.j();
                        break;
                    default:
                        this.f59161c.i();
                        break;
                }
            }
        };
        final int i12 = 1;
        this.f62501p = new Runnable(this) { // from class: hs.g

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ z f59161c;

            {
                this.f59161c = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        this.f59161c.j();
                        break;
                    default:
                        this.f59161c.i();
                        break;
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i() {
        if (this.M) {
            return;
        }
        ((r.a) io.odeeo.internal.q0.a.checkNotNull(this.f62503r)).onContinueLoadingRequested(this);
    }

    @Override // io.odeeo.internal.a0.r, io.odeeo.internal.a0.e0
    public boolean continueLoading(long j10) {
        if (this.L || this.f62497l.hasFatalError() || this.J) {
            return false;
        }
        if (this.f62508w && this.F == 0) {
            return false;
        }
        boolean zOpen = this.f62499n.open();
        if (this.f62497l.isLoading()) {
            return zOpen;
        }
        l();
        return true;
    }

    @Override // io.odeeo.internal.a0.r
    public void discardBuffer(long j10, boolean z10) {
        c();
        if (h()) {
            return;
        }
        boolean[] zArr = this.f62510y.f62533c;
        int length = this.f62505t.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.f62505t[i10].discardTo(j10, z10, zArr[i10]);
        }
    }

    @Override // io.odeeo.internal.g.j
    public void endTracks() {
        this.f62507v = true;
        this.f62502q.post(this.f62500o);
    }

    @Override // io.odeeo.internal.a0.r
    public long getAdjustedSeekPositionUs(long j10, t0 t0Var) {
        c();
        if (!this.f62511z.isSeekable()) {
            return 0L;
        }
        v.a seekPoints = this.f62511z.getSeekPoints(j10);
        return t0Var.resolveSeekPositionUs(j10, seekPoints.f64172a.f64177a, seekPoints.f64173b.f64177a);
    }

    @Override // io.odeeo.internal.a0.r, io.odeeo.internal.a0.e0
    public long getBufferedPositionUs() {
        long jF;
        c();
        boolean[] zArr = this.f62510y.f62532b;
        if (this.L) {
            return Long.MIN_VALUE;
        }
        if (h()) {
            return this.I;
        }
        if (this.f62509x) {
            int length = this.f62505t.length;
            jF = Long.MAX_VALUE;
            for (int i10 = 0; i10 < length; i10++) {
                if (zArr[i10] && !this.f62505t[i10].isLastSampleQueued()) {
                    jF = Math.min(jF, this.f62505t[i10].getLargestQueuedTimestampUs());
                }
            }
        } else {
            jF = Long.MAX_VALUE;
        }
        if (jF == Long.MAX_VALUE) {
            jF = f();
        }
        return jF == Long.MIN_VALUE ? this.H : jF;
    }

    @Override // io.odeeo.internal.a0.r, io.odeeo.internal.a0.e0
    public long getNextLoadPositionUs() {
        if (this.F == 0) {
            return Long.MIN_VALUE;
        }
        return getBufferedPositionUs();
    }

    @Override // io.odeeo.internal.a0.r
    public /* bridge */ /* synthetic */ List getStreamKeys(List list) {
        return super.getStreamKeys(list);
    }

    @Override // io.odeeo.internal.a0.r
    public l0 getTrackGroups() {
        c();
        return this.f62510y.f62531a;
    }

    @Override // io.odeeo.internal.a0.r, io.odeeo.internal.a0.e0
    public boolean isLoading() {
        return this.f62497l.isLoading() && this.f62499n.isOpen();
    }

    public final void j() {
        if (this.M || this.f62508w || !this.f62507v || this.f62511z == null) {
            return;
        }
        for (c0 c0Var : this.f62505t) {
            if (c0Var.getUpstreamFormat() == null) {
                return;
            }
        }
        this.f62499n.close();
        int length = this.f62505t.length;
        k0[] k0VarArr = new k0[length];
        boolean[] zArr = new boolean[length];
        for (int i10 = 0; i10 < length; i10++) {
            io.odeeo.internal.b.t tVarBuild = (io.odeeo.internal.b.t) io.odeeo.internal.q0.a.checkNotNull(this.f62505t[i10].getUpstreamFormat());
            String str = tVarBuild.f62971l;
            boolean zIsAudio = io.odeeo.internal.q0.t.isAudio(str);
            boolean z10 = zIsAudio || io.odeeo.internal.q0.t.isVideo(str);
            zArr[i10] = z10;
            this.f62509x = z10 | this.f62509x;
            io.odeeo.internal.w.b bVar = this.f62504s;
            if (bVar != null) {
                if (zIsAudio || this.f62506u[i10].f62530b) {
                    io.odeeo.internal.s.a aVar = tVarBuild.f62969j;
                    tVarBuild = tVarBuild.buildUpon().setMetadata(aVar == null ? new io.odeeo.internal.s.a(bVar) : aVar.copyWithAppendedEntries(bVar)).build();
                }
                if (zIsAudio && tVarBuild.f62965f == -1 && tVarBuild.f62966g == -1 && bVar.f67293a != -1) {
                    tVarBuild = tVarBuild.buildUpon().setAverageBitrate(bVar.f67293a).build();
                }
            }
            k0VarArr[i10] = new k0(tVarBuild.copyWithCryptoType(this.f62489c.getCryptoType(tVarBuild)));
        }
        this.f62510y = new e(new l0(k0VarArr), zArr);
        this.f62508w = true;
        ((r.a) io.odeeo.internal.q0.a.checkNotNull(this.f62503r)).onPrepared(this);
    }

    public void k() throws IOException {
        this.f62497l.maybeThrowError(this.f62490e.getMinimumLoadableRetryCount(this.C));
    }

    public final void l() {
        a aVar = new a(this.f62487a, this.f62488b, this.f62498m, this, this.f62499n);
        if (this.f62508w) {
            io.odeeo.internal.q0.a.checkState(h());
            long j10 = this.A;
            if (j10 != C.TIME_UNSET && this.I > j10) {
                this.L = true;
                this.I = C.TIME_UNSET;
                return;
            }
            aVar.a(((io.odeeo.internal.g.v) io.odeeo.internal.q0.a.checkNotNull(this.f62511z)).getSeekPoints(this.I).f64172a.f64178b, this.I);
            for (c0 c0Var : this.f62505t) {
                c0Var.setStartTimeUs(this.I);
            }
            this.I = C.TIME_UNSET;
        }
        this.K = e();
        this.f62491f.loadStarted(new n(aVar.f62512a, aVar.f62522k, this.f62497l.startLoading(aVar, this, this.f62490e.getMinimumLoadableRetryCount(this.C))), 1, -1, null, 0, null, aVar.f62521j, this.A);
    }

    public final boolean m() {
        return this.E || h();
    }

    @Override // io.odeeo.internal.a0.r
    public void maybeThrowPrepareError() throws IOException {
        k();
        if (this.L && !this.f62508w) {
            throw io.odeeo.internal.b.g0.createForMalformedContainer("Loading finished before preparation is complete.", null);
        }
    }

    @Override // io.odeeo.internal.p0.w.f
    public void onLoaderReleased() {
        for (c0 c0Var : this.f62505t) {
            c0Var.release();
        }
        this.f62498m.release();
    }

    @Override // io.odeeo.internal.a0.c0.d
    public void onUpstreamFormatChanged(io.odeeo.internal.b.t tVar) {
        this.f62502q.post(this.f62500o);
    }

    @Override // io.odeeo.internal.a0.r
    public void prepare(r.a aVar, long j10) {
        this.f62503r = aVar;
        this.f62499n.open();
        l();
    }

    @Override // io.odeeo.internal.a0.r
    public long readDiscontinuity() {
        if (!this.E) {
            return C.TIME_UNSET;
        }
        if (!this.L && e() <= this.K) {
            return C.TIME_UNSET;
        }
        this.E = false;
        return this.H;
    }

    public void release() {
        if (this.f62508w) {
            for (c0 c0Var : this.f62505t) {
                c0Var.preRelease();
            }
        }
        this.f62497l.release(this);
        this.f62502q.removeCallbacksAndMessages(null);
        this.f62503r = null;
        this.M = true;
    }

    @Override // io.odeeo.internal.g.j
    public void seekMap(io.odeeo.internal.g.v vVar) {
        this.f62502q.post(new gm.c(22, this, vVar));
    }

    @Override // io.odeeo.internal.a0.r
    public long seekToUs(long j10) {
        c();
        boolean[] zArr = this.f62510y.f62532b;
        if (!this.f62511z.isSeekable()) {
            j10 = 0;
        }
        int i10 = 0;
        this.E = false;
        this.H = j10;
        if (h()) {
            this.I = j10;
            return j10;
        }
        if (this.C == 7 || !a(zArr, j10)) {
            this.J = false;
            this.I = j10;
            this.L = false;
            if (this.f62497l.isLoading()) {
                c0[] c0VarArr = this.f62505t;
                int length = c0VarArr.length;
                while (i10 < length) {
                    c0VarArr[i10].discardToEnd();
                    i10++;
                }
                this.f62497l.cancelLoading();
                return j10;
            }
            this.f62497l.clearFatalError();
            c0[] c0VarArr2 = this.f62505t;
            int length2 = c0VarArr2.length;
            while (i10 < length2) {
                c0VarArr2[i10].reset();
                i10++;
            }
        }
        return j10;
    }

    @Override // io.odeeo.internal.a0.r
    public long selectTracks(io.odeeo.internal.n0.d[] dVarArr, boolean[] zArr, d0[] d0VarArr, boolean[] zArr2, long j10) {
        io.odeeo.internal.n0.d dVar;
        c();
        e eVar = this.f62510y;
        l0 l0Var = eVar.f62531a;
        boolean[] zArr3 = eVar.f62533c;
        int i10 = this.F;
        int i11 = 0;
        for (int i12 = 0; i12 < dVarArr.length; i12++) {
            d0 d0Var = d0VarArr[i12];
            if (d0Var != null && (dVarArr[i12] == null || !zArr[i12])) {
                int i13 = ((c) d0Var).f62527a;
                io.odeeo.internal.q0.a.checkState(zArr3[i13]);
                this.F--;
                zArr3[i13] = false;
                d0VarArr[i12] = null;
            }
        }
        boolean z10 = !this.D ? j10 == 0 : i10 != 0;
        for (int i14 = 0; i14 < dVarArr.length; i14++) {
            if (d0VarArr[i14] == null && (dVar = dVarArr[i14]) != null) {
                io.odeeo.internal.q0.a.checkState(dVar.length() == 1);
                io.odeeo.internal.q0.a.checkState(dVar.getIndexInTrackGroup(0) == 0);
                int iIndexOf = l0Var.indexOf(dVar.getTrackGroup());
                io.odeeo.internal.q0.a.checkState(!zArr3[iIndexOf]);
                this.F++;
                zArr3[iIndexOf] = true;
                d0VarArr[i14] = new c(iIndexOf);
                zArr2[i14] = true;
                if (!z10) {
                    c0 c0Var = this.f62505t[iIndexOf];
                    z10 = (c0Var.seekTo(j10, true) || c0Var.getReadIndex() == 0) ? false : true;
                }
            }
        }
        if (this.F == 0) {
            this.J = false;
            this.E = false;
            if (this.f62497l.isLoading()) {
                c0[] c0VarArr = this.f62505t;
                int length = c0VarArr.length;
                while (i11 < length) {
                    c0VarArr[i11].discardToEnd();
                    i11++;
                }
                this.f62497l.cancelLoading();
            } else {
                c0[] c0VarArr2 = this.f62505t;
                int length2 = c0VarArr2.length;
                while (i11 < length2) {
                    c0VarArr2[i11].reset();
                    i11++;
                }
            }
        } else if (z10) {
            j10 = seekToUs(j10);
            while (i11 < d0VarArr.length) {
                if (d0VarArr[i11] != null) {
                    zArr2[i11] = true;
                }
                i11++;
            }
        }
        this.D = true;
        return j10;
    }

    @Override // io.odeeo.internal.g.j
    public io.odeeo.internal.g.x track(int i10, int i11) {
        return a(new d(i10, false));
    }

    public final void c(int i10) {
        c();
        boolean[] zArr = this.f62510y.f62532b;
        if (this.J && zArr[i10]) {
            if (this.f62505t[i10].isReady(false)) {
                return;
            }
            this.I = 0L;
            this.J = false;
            this.E = true;
            this.H = 0L;
            this.K = 0;
            for (c0 c0Var : this.f62505t) {
                c0Var.reset();
            }
            ((r.a) io.odeeo.internal.q0.a.checkNotNull(this.f62503r)).onContinueLoadingRequested(this);
        }
    }

    public void d(int i10) throws IOException {
        this.f62505t[i10].maybeThrowError();
        k();
    }

    public final int e() {
        int writeIndex = 0;
        for (c0 c0Var : this.f62505t) {
            writeIndex += c0Var.getWriteIndex();
        }
        return writeIndex;
    }

    public final long f() {
        long jMax = Long.MIN_VALUE;
        for (c0 c0Var : this.f62505t) {
            jMax = Math.max(jMax, c0Var.getLargestQueuedTimestampUs());
        }
        return jMax;
    }

    public io.odeeo.internal.g.x g() {
        return a(new d(0, true));
    }

    public final boolean h() {
        return this.I != C.TIME_UNSET;
    }

    @Override // io.odeeo.internal.p0.w.b
    public void onLoadCanceled(a aVar, long j10, long j11, boolean z10) {
        io.odeeo.internal.p0.a0 a0Var = aVar.f62514c;
        n nVar = new n(aVar.f62512a, aVar.f62522k, a0Var.getLastOpenedUri(), a0Var.getLastResponseHeaders(), j10, j11, a0Var.getBytesRead());
        this.f62490e.onLoadTaskConcluded(aVar.f62512a);
        this.f62491f.loadCanceled(nVar, 1, -1, null, 0, null, aVar.f62521j, this.A);
        if (z10) {
            return;
        }
        a(aVar);
        for (c0 c0Var : this.f62505t) {
            c0Var.reset();
        }
        if (this.F > 0) {
            ((r.a) io.odeeo.internal.q0.a.checkNotNull(this.f62503r)).onContinueLoadingRequested(this);
        }
    }

    @Override // io.odeeo.internal.p0.w.b
    public void onLoadCompleted(a aVar, long j10, long j11) {
        io.odeeo.internal.g.v vVar;
        if (this.A == C.TIME_UNSET && (vVar = this.f62511z) != null) {
            boolean zIsSeekable = vVar.isSeekable();
            long jF = f();
            long j12 = jF == Long.MIN_VALUE ? 0L : jF + 10000;
            this.A = j12;
            this.f62493h.onSourceInfoRefreshed(j12, zIsSeekable, this.B);
        }
        io.odeeo.internal.p0.a0 a0Var = aVar.f62514c;
        n nVar = new n(aVar.f62512a, aVar.f62522k, a0Var.getLastOpenedUri(), a0Var.getLastResponseHeaders(), j10, j11, a0Var.getBytesRead());
        this.f62490e.onLoadTaskConcluded(aVar.f62512a);
        this.f62491f.loadCompleted(nVar, 1, -1, null, 0, null, aVar.f62521j, this.A);
        a(aVar);
        this.L = true;
        ((r.a) io.odeeo.internal.q0.a.checkNotNull(this.f62503r)).onContinueLoadingRequested(this);
    }

    @Override // io.odeeo.internal.p0.w.b
    public w.c onLoadError(a aVar, long j10, long j11, IOException iOException, int i10) {
        a aVar2;
        w.c cVarCreateRetryAction;
        a(aVar);
        io.odeeo.internal.p0.a0 a0Var = aVar.f62514c;
        n nVar = new n(aVar.f62512a, aVar.f62522k, a0Var.getLastOpenedUri(), a0Var.getLastResponseHeaders(), j10, j11, a0Var.getBytesRead());
        long retryDelayMsFor = this.f62490e.getRetryDelayMsFor(new v.c(nVar, new q(1, -1, null, 0, null, io.odeeo.internal.q0.g0.usToMs(aVar.f62521j), io.odeeo.internal.q0.g0.usToMs(this.A)), iOException, i10));
        if (retryDelayMsFor == C.TIME_UNSET) {
            cVarCreateRetryAction = io.odeeo.internal.p0.w.f65749g;
            aVar2 = aVar;
        } else {
            int iE = e();
            aVar2 = aVar;
            cVarCreateRetryAction = a(aVar2, iE) ? io.odeeo.internal.p0.w.createRetryAction(iE > this.K, retryDelayMsFor) : io.odeeo.internal.p0.w.f65748f;
        }
        boolean zIsRetry = cVarCreateRetryAction.isRetry();
        this.f62491f.loadError(nVar, 1, -1, null, 0, null, aVar2.f62521j, this.A, iOException, !zIsRetry);
        if (!zIsRetry) {
            this.f62490e.onLoadTaskConcluded(aVar2.f62512a);
        }
        return cVarCreateRetryAction;
    }

    public final void b(int i10) {
        c();
        e eVar = this.f62510y;
        boolean[] zArr = eVar.f62534d;
        if (zArr[i10]) {
            return;
        }
        io.odeeo.internal.b.t format = eVar.f62531a.get(i10).getFormat(0);
        this.f62491f.downstreamFormatChanged(io.odeeo.internal.q0.t.getTrackType(format.f62971l), format, 0, null, this.H);
        zArr[i10] = true;
    }

    public static Map<String, String> d() {
        HashMap map = new HashMap();
        map.put("Icy-MetaData", "1");
        return Collections.unmodifiableMap(map);
    }

    public boolean a(int i10) {
        return !m() && this.f62505t[i10].isReady(this.L);
    }

    public int a(int i10, io.odeeo.internal.b.u uVar, io.odeeo.internal.e.g gVar, int i11) {
        if (m()) {
            return -3;
        }
        b(i10);
        int i12 = this.f62505t[i10].read(uVar, gVar, i11, this.L);
        if (i12 == -3) {
            c(i10);
        }
        return i12;
    }

    public int a(int i10, long j10) throws Throwable {
        if (m()) {
            return 0;
        }
        b(i10);
        c0 c0Var = this.f62505t[i10];
        int skipCount = c0Var.getSkipCount(j10, this.L);
        c0Var.skip(skipCount);
        if (skipCount == 0) {
            c(i10);
        }
        return skipCount;
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void a(io.odeeo.internal.g.v vVar) {
        this.f62511z = this.f62504s == null ? vVar : new v.b(C.TIME_UNSET);
        this.A = vVar.getDurationUs();
        boolean z10 = this.G == -1 && vVar.getDurationUs() == C.TIME_UNSET;
        this.B = z10;
        this.C = z10 ? 7 : 1;
        this.f62493h.onSourceInfoRefreshed(this.A, vVar.isSeekable(), this.B);
        if (this.f62508w) {
            return;
        }
        j();
    }

    @EnsuresNonNull({"trackState", "seekMap"})
    public final void c() {
        io.odeeo.internal.q0.a.checkState(this.f62508w);
        io.odeeo.internal.q0.a.checkNotNull(this.f62510y);
        io.odeeo.internal.q0.a.checkNotNull(this.f62511z);
    }

    public final io.odeeo.internal.g.x a(d dVar) {
        int length = this.f62505t.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (dVar.equals(this.f62506u[i10])) {
                return this.f62505t[i10];
            }
        }
        c0 c0VarCreateWithDrm = c0.createWithDrm(this.f62494i, this.f62502q.getLooper(), this.f62489c, this.f62492g);
        c0VarCreateWithDrm.setUpstreamFormatChangeListener(this);
        int i11 = length + 1;
        d[] dVarArr = (d[]) Arrays.copyOf(this.f62506u, i11);
        dVarArr[length] = dVar;
        this.f62506u = (d[]) io.odeeo.internal.q0.g0.castNonNullTypeArray(dVarArr);
        c0[] c0VarArr = (c0[]) Arrays.copyOf(this.f62505t, i11);
        c0VarArr[length] = c0VarCreateWithDrm;
        this.f62505t = (c0[]) io.odeeo.internal.q0.g0.castNonNullTypeArray(c0VarArr);
        return c0VarCreateWithDrm;
    }

    @Override // io.odeeo.internal.a0.r, io.odeeo.internal.a0.e0
    public void reevaluateBuffer(long j10) {
    }

    public final void a(a aVar) {
        if (this.G == -1) {
            this.G = aVar.f62523l;
        }
    }

    public final boolean a(a aVar, int i10) {
        io.odeeo.internal.g.v vVar;
        if (this.G == -1 && ((vVar = this.f62511z) == null || vVar.getDurationUs() == C.TIME_UNSET)) {
            if (this.f62508w && !m()) {
                this.J = true;
                return false;
            }
            this.E = this.f62508w;
            this.H = 0L;
            this.K = 0;
            for (c0 c0Var : this.f62505t) {
                c0Var.reset();
            }
            aVar.a(0L, 0L);
            return true;
        }
        this.K = i10;
        return true;
    }

    public final boolean a(boolean[] zArr, long j10) {
        int length = this.f62505t.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (!this.f62505t[i10].seekTo(j10, false) && (zArr[i10] || !this.f62509x)) {
                return false;
            }
        }
        return true;
    }
}
