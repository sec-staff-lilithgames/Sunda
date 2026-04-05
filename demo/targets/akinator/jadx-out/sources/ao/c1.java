package ao;

import android.net.Uri;
import android.os.Handler;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import ln.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class c1 implements i0, ko.c0, go.u, go.y, m1 {
    public static final Map T;
    public static final io.bidmachine.media3.common.b U;
    public boolean A;
    public boolean B;
    public boolean C;
    public d D;
    public ko.y0 E;
    public long F;
    public boolean G;
    public int H;
    public boolean I;
    public boolean J;
    public boolean K;
    public int L;
    public boolean M;
    public long N;
    public long O;
    public boolean P;
    public int Q;
    public boolean R;
    public boolean S;

    /* renamed from: b, reason: collision with root package name */
    public final Uri f7556b;

    /* renamed from: c, reason: collision with root package name */
    public final ln.i f7557c;

    /* renamed from: e, reason: collision with root package name */
    public final sn.v f7558e;

    /* renamed from: f, reason: collision with root package name */
    public final go.t f7559f;

    /* renamed from: g, reason: collision with root package name */
    public final r0 f7560g;

    /* renamed from: h, reason: collision with root package name */
    public final sn.q f7561h;

    /* renamed from: i, reason: collision with root package name */
    public final d1 f7562i;

    /* renamed from: j, reason: collision with root package name */
    public final go.c f7563j;

    /* renamed from: k, reason: collision with root package name */
    public final String f7564k;

    /* renamed from: l, reason: collision with root package name */
    public final long f7565l;

    /* renamed from: m, reason: collision with root package name */
    public final int f7566m;

    /* renamed from: n, reason: collision with root package name */
    public final io.bidmachine.media3.common.b f7567n;

    /* renamed from: o, reason: collision with root package name */
    public final long f7568o;

    /* renamed from: p, reason: collision with root package name */
    public final go.w f7569p;

    /* renamed from: q, reason: collision with root package name */
    public final z0 f7570q;

    /* renamed from: r, reason: collision with root package name */
    public final io.bidmachine.media3.common.util.j f7571r;

    /* renamed from: s, reason: collision with root package name */
    public final a1 f7572s;

    /* renamed from: t, reason: collision with root package name */
    public final a1 f7573t;

    /* renamed from: u, reason: collision with root package name */
    public final Handler f7574u;

    /* renamed from: v, reason: collision with root package name */
    public h0 f7575v;

    /* renamed from: w, reason: collision with root package name */
    public xo.b f7576w;

    /* renamed from: x, reason: collision with root package name */
    public n1[] f7577x;

    /* renamed from: y, reason: collision with root package name */
    public c[] f7578y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f7579z;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class a implements go.x, z {

        /* renamed from: b, reason: collision with root package name */
        public final Uri f7581b;

        /* renamed from: c, reason: collision with root package name */
        public final ln.e0 f7582c;

        /* renamed from: d, reason: collision with root package name */
        public final z0 f7583d;

        /* renamed from: e, reason: collision with root package name */
        public final ko.c0 f7584e;

        /* renamed from: f, reason: collision with root package name */
        public final io.bidmachine.media3.common.util.j f7585f;

        /* renamed from: h, reason: collision with root package name */
        public volatile boolean f7587h;

        /* renamed from: j, reason: collision with root package name */
        public long f7589j;

        /* renamed from: l, reason: collision with root package name */
        public ko.e1 f7591l;

        /* renamed from: m, reason: collision with root package name */
        public boolean f7592m;

        /* renamed from: g, reason: collision with root package name */
        public final ko.v0 f7586g = new ko.v0();

        /* renamed from: i, reason: collision with root package name */
        public boolean f7588i = true;

        /* renamed from: a, reason: collision with root package name */
        public final long f7580a = b0.getNewId();

        /* renamed from: k, reason: collision with root package name */
        public ln.m f7590k = a(0);

        public a(Uri uri, ln.i iVar, z0 z0Var, ko.c0 c0Var, io.bidmachine.media3.common.util.j jVar) {
            this.f7581b = uri;
            this.f7582c = new ln.e0(iVar);
            this.f7583d = z0Var;
            this.f7584e = c0Var;
            this.f7585f = jVar;
        }

        public final ln.m a(long j10) {
            return new m.a().setUri(this.f7581b).setPosition(j10).setKey(c1.this.f7564k).setFlags(6).setHttpRequestHeaders(c1.T).build();
        }

        @Override // go.x
        public void cancelLoad() {
            this.f7587h = true;
        }

        @Override // go.x
        public void load() throws IOException {
            gn.o a0Var;
            int i10;
            int i11 = 0;
            while (i11 == 0 && !this.f7587h) {
                try {
                    long j10 = this.f7586g.f71790a;
                    ln.m mVarA = a(j10);
                    this.f7590k = mVarA;
                    long jOpen = this.f7582c.open(mVarA);
                    if (this.f7587h) {
                        if (i11 != 1 && this.f7583d.getCurrentInputPosition() != -1) {
                            this.f7586g.f71790a = this.f7583d.getCurrentInputPosition();
                        }
                        ln.l.closeQuietly(this.f7582c);
                        return;
                    }
                    if (jOpen != -1) {
                        jOpen += j10;
                        c1 c1Var = c1.this;
                        c1Var.f7574u.post(new a1(c1Var, 2));
                    }
                    long j11 = jOpen;
                    c1.this.f7576w = xo.b.parse(this.f7582c.getResponseHeaders());
                    ln.e0 e0Var = this.f7582c;
                    xo.b bVar = c1.this.f7576w;
                    if (bVar == null || (i10 = bVar.f92175f) == -1) {
                        a0Var = e0Var;
                    } else {
                        a0Var = new a0(e0Var, i10, this);
                        c1 c1Var2 = c1.this;
                        c1Var2.getClass();
                        ko.e1 e1VarH = c1Var2.h(new c(0, true));
                        this.f7591l = e1VarH;
                        e1VarH.format(c1.U);
                    }
                    this.f7583d.init(a0Var, this.f7581b, this.f7582c.getResponseHeaders(), j10, j11, this.f7584e);
                    if (c1.this.f7576w != null) {
                        this.f7583d.disableSeekingOnMp3Streams();
                    }
                    if (this.f7588i) {
                        this.f7583d.seek(j10, this.f7589j);
                        this.f7588i = false;
                    }
                    while (i11 == 0 && !this.f7587h) {
                        try {
                            this.f7585f.block();
                            i11 = this.f7583d.read(this.f7586g);
                            long currentInputPosition = this.f7583d.getCurrentInputPosition();
                            if (currentInputPosition > c1.this.f7565l + j10) {
                                this.f7585f.close();
                                c1 c1Var3 = c1.this;
                                c1Var3.f7574u.post(c1Var3.f7573t);
                                j10 = currentInputPosition;
                            }
                        } catch (InterruptedException unused) {
                            throw new InterruptedIOException();
                        }
                    }
                    if (i11 == 1) {
                        i11 = 0;
                    } else if (this.f7583d.getCurrentInputPosition() != -1) {
                        this.f7586g.f71790a = this.f7583d.getCurrentInputPosition();
                    }
                    ln.l.closeQuietly(this.f7582c);
                } catch (Throwable th2) {
                    if (i11 != 1 && this.f7583d.getCurrentInputPosition() != -1) {
                        this.f7586g.f71790a = this.f7583d.getCurrentInputPosition();
                    }
                    ln.l.closeQuietly(this.f7582c);
                    throw th2;
                }
            }
        }

        @Override // ao.z
        public void onIcyMetadata(io.bidmachine.media3.common.util.m0 m0Var) {
            long jMax;
            if (this.f7592m) {
                Map map = c1.T;
                jMax = Math.max(c1.this.c(true), this.f7589j);
            } else {
                jMax = this.f7589j;
            }
            long j10 = jMax;
            int iBytesLeft = m0Var.bytesLeft();
            ko.e1 e1Var = (ko.e1) io.bidmachine.media3.common.util.a.checkNotNull(this.f7591l);
            e1Var.sampleData(m0Var, iBytesLeft);
            e1Var.sampleMetadata(j10, 1, iBytesLeft, 0, null);
            this.f7592m = true;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class b implements o1 {

        /* renamed from: b, reason: collision with root package name */
        public final int f7594b;

        public b(int i10) {
            this.f7594b = i10;
        }

        @Override // ao.o1
        public boolean isReady() {
            c1 c1Var = c1.this;
            return !c1Var.k() && c1Var.f7577x[this.f7594b].isReady(c1Var.R);
        }

        @Override // ao.o1
        public void maybeThrowError() throws IOException {
            int i10 = this.f7594b;
            c1 c1Var = c1.this;
            c1Var.f7577x[i10].maybeThrowError();
            c1Var.f7569p.maybeThrowError(c1Var.f7559f.getMinimumLoadableRetryCount(c1Var.H));
        }

        @Override // ao.o1
        public int readData(io.bidmachine.media3.exoplayer.r0 r0Var, nn.g gVar, int i10) {
            c1 c1Var = c1.this;
            if (c1Var.k()) {
                return -3;
            }
            int i11 = this.f7594b;
            c1Var.f(i11);
            int i12 = c1Var.f7577x[i11].read(r0Var, gVar, i10, c1Var.R);
            if (i12 == -3) {
                c1Var.g(i11);
            }
            return i12;
        }

        @Override // ao.o1
        public int skipData(long j10) throws Throwable {
            c1 c1Var = c1.this;
            if (c1Var.k()) {
                return 0;
            }
            int i10 = this.f7594b;
            c1Var.f(i10);
            n1 n1Var = c1Var.f7577x[i10];
            int skipCount = n1Var.getSkipCount(j10, c1Var.R);
            n1Var.skip(skipCount);
            if (skipCount == 0) {
                c1Var.g(i10);
            }
            return skipCount;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final int f7596a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f7597b;

        public c(int i10, boolean z10) {
            this.f7596a = i10;
            this.f7597b = z10;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && c.class == obj.getClass()) {
                c cVar = (c) obj;
                if (this.f7596a == cVar.f7596a && this.f7597b == cVar.f7597b) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (this.f7596a * 31) + (this.f7597b ? 1 : 0);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final b2 f7598a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean[] f7599b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean[] f7600c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean[] f7601d;

        public d(b2 b2Var, boolean[] zArr) {
            this.f7598a = b2Var;
            this.f7599b = zArr;
            int i10 = b2Var.f7552a;
            this.f7600c = new boolean[i10];
            this.f7601d = new boolean[i10];
        }
    }

    static {
        HashMap map = new HashMap();
        map.put("Icy-MetaData", "1");
        T = Collections.unmodifiableMap(map);
        U = new gn.w().setId("icy").setSampleMimeType("application/x-icy").build();
    }

    public c1(Uri uri, ln.i iVar, z0 z0Var, sn.v vVar, sn.q qVar, go.t tVar, r0 r0Var, d1 d1Var, go.c cVar, String str, int i10, int i11, io.bidmachine.media3.common.b bVar, long j10, ho.b bVar2) {
        this.f7556b = uri;
        this.f7557c = iVar;
        this.f7558e = vVar;
        this.f7561h = qVar;
        this.f7559f = tVar;
        this.f7560g = r0Var;
        this.f7562i = d1Var;
        this.f7563j = cVar;
        this.f7564k = str;
        this.f7565l = i10;
        this.f7566m = i11;
        this.f7567n = bVar;
        this.f7569p = bVar2 != null ? new go.w(bVar2) : new go.w("ProgressiveMediaPeriod");
        this.f7570q = z0Var;
        this.f7568o = j10;
        this.f7571r = new io.bidmachine.media3.common.util.j();
        this.f7572s = new a1(this, 0);
        this.f7573t = new a1(this, 1);
        this.f7574u = io.bidmachine.media3.common.util.a1.createHandlerForCurrentLooper();
        this.f7578y = new c[0];
        this.f7577x = new n1[0];
        this.O = C.TIME_UNSET;
        this.H = 1;
    }

    public final void a() {
        io.bidmachine.media3.common.util.a.checkState(this.A);
        io.bidmachine.media3.common.util.a.checkNotNull(this.D);
        io.bidmachine.media3.common.util.a.checkNotNull(this.E);
    }

    public final int b() {
        int writeIndex = 0;
        for (n1 n1Var : this.f7577x) {
            writeIndex += n1Var.getWriteIndex();
        }
        return writeIndex;
    }

    public final long c(boolean z10) {
        long jMax = Long.MIN_VALUE;
        for (int i10 = 0; i10 < this.f7577x.length; i10++) {
            if (z10 || ((d) io.bidmachine.media3.common.util.a.checkNotNull(this.D)).f7600c[i10]) {
                jMax = Math.max(jMax, this.f7577x[i10].getLargestQueuedTimestampUs());
            }
        }
        return jMax;
    }

    @Override // ao.i0, ao.q1
    public boolean continueLoading(io.bidmachine.media3.exoplayer.w0 w0Var) {
        if (this.R) {
            return false;
        }
        go.w wVar = this.f7569p;
        if (wVar.hasFatalError() || this.P) {
            return false;
        }
        if ((this.A || this.f7567n != null) && this.L == 0) {
            return false;
        }
        boolean zOpen = this.f7571r.open();
        if (wVar.isLoading()) {
            return zOpen;
        }
        j();
        return true;
    }

    public final boolean d() {
        return this.O != C.TIME_UNSET;
    }

    @Override // ao.i0
    public void discardBuffer(long j10, boolean z10) throws Throwable {
        if (this.C) {
            return;
        }
        a();
        if (d()) {
            return;
        }
        boolean[] zArr = this.D.f7600c;
        int length = this.f7577x.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.f7577x[i10].discardTo(j10, z10, zArr[i10]);
        }
    }

    public final void e() {
        long j10;
        if (this.S || this.A || !this.f7579z || this.E == null) {
            return;
        }
        for (n1 n1Var : this.f7577x) {
            if (n1Var.getUpstreamFormat() == null) {
                return;
            }
        }
        this.f7571r.close();
        int length = this.f7577x.length;
        gn.v1[] v1VarArr = new gn.v1[length];
        boolean[] zArr = new boolean[length];
        int i10 = 0;
        while (true) {
            j10 = this.f7568o;
            if (i10 >= length) {
                break;
            }
            io.bidmachine.media3.common.b bVarBuild = (io.bidmachine.media3.common.b) io.bidmachine.media3.common.util.a.checkNotNull(this.f7577x[i10].getUpstreamFormat());
            String str = bVarBuild.f60665o;
            boolean zIsAudio = gn.x0.isAudio(str);
            boolean z10 = zIsAudio || gn.x0.isVideo(str);
            zArr[i10] = z10;
            this.B = z10 | this.B;
            this.C = j10 != C.TIME_UNSET && length == 1 && gn.x0.isImage(str);
            xo.b bVar = this.f7576w;
            if (bVar != null) {
                int i11 = bVar.f92170a;
                if (zIsAudio || this.f7578y[i10].f7597b) {
                    gn.u0 u0Var = bVarBuild.f60662l;
                    bVarBuild = bVarBuild.buildUpon().setMetadata(u0Var == null ? new gn.u0(bVar) : u0Var.copyWithAppendedEntries(bVar)).build();
                }
                if (zIsAudio && bVarBuild.f60658h == -1 && bVarBuild.f60659i == -1 && i11 != -1) {
                    bVarBuild = bVarBuild.buildUpon().setAverageBitrate(i11).build();
                }
            }
            io.bidmachine.media3.common.b bVarCopyWithCryptoType = bVarBuild.copyWithCryptoType(this.f7558e.getCryptoType(bVarBuild));
            v1VarArr[i10] = new gn.v1(Integer.toString(i10), bVarCopyWithCryptoType);
            this.K = bVarCopyWithCryptoType.f60671u | this.K;
            i10++;
        }
        this.D = new d(new b2(v1VarArr), zArr);
        if (this.C && this.F == C.TIME_UNSET) {
            this.F = j10;
            this.E = new b1(this, this.E);
        }
        ((i1) this.f7562i).onSourceInfoRefreshed(this.F, this.E, this.G);
        this.A = true;
        ((h0) io.bidmachine.media3.common.util.a.checkNotNull(this.f7575v)).onPrepared(this);
    }

    @Override // ko.c0
    public void endTracks() {
        this.f7579z = true;
        this.f7574u.post(this.f7572s);
    }

    public final void f(int i10) {
        a();
        d dVar = this.D;
        boolean[] zArr = dVar.f7601d;
        if (zArr[i10]) {
            return;
        }
        io.bidmachine.media3.common.b format = dVar.f7598a.get(i10).getFormat(0);
        this.f7560g.downstreamFormatChanged(gn.x0.getTrackType(format.f60665o), format, 0, null, this.N);
        zArr[i10] = true;
    }

    public final void g(int i10) {
        a();
        if (this.P) {
            if (!this.B || this.D.f7599b[i10]) {
                if (this.f7577x[i10].isReady(false)) {
                    return;
                }
                this.O = 0L;
                this.P = false;
                this.J = true;
                this.N = 0L;
                this.Q = 0;
                for (n1 n1Var : this.f7577x) {
                    n1Var.reset();
                }
                ((h0) io.bidmachine.media3.common.util.a.checkNotNull(this.f7575v)).onContinueLoadingRequested(this);
            }
        }
    }

    @Override // ao.i0
    public long getAdjustedSeekPositionUs(long j10, io.bidmachine.media3.exoplayer.y1 y1Var) {
        a();
        if (!this.E.isSeekable()) {
            return 0L;
        }
        ko.w0 seekPoints = this.E.getSeekPoints(j10);
        return y1Var.resolveSeekPositionUs(j10, seekPoints.f71792a.f71811a, seekPoints.f71793b.f71811a);
    }

    @Override // ao.i0, ao.q1
    public long getBufferedPositionUs() {
        long jC;
        a();
        if (this.R || this.L == 0) {
            return Long.MIN_VALUE;
        }
        if (d()) {
            return this.O;
        }
        if (this.B) {
            int length = this.f7577x.length;
            jC = Long.MAX_VALUE;
            for (int i10 = 0; i10 < length; i10++) {
                d dVar = this.D;
                if (dVar.f7599b[i10] && dVar.f7600c[i10] && !this.f7577x[i10].isLastSampleQueued()) {
                    jC = Math.min(jC, this.f7577x[i10].getLargestQueuedTimestampUs());
                }
            }
        } else {
            jC = Long.MAX_VALUE;
        }
        if (jC == Long.MAX_VALUE) {
            jC = c(false);
        }
        return jC == Long.MIN_VALUE ? this.N : jC;
    }

    @Override // ao.i0, ao.q1
    public long getNextLoadPositionUs() {
        return getBufferedPositionUs();
    }

    @Override // ao.i0
    public /* bridge */ /* synthetic */ List getStreamKeys(List list) {
        return super.getStreamKeys(list);
    }

    @Override // ao.i0
    public b2 getTrackGroups() {
        a();
        return this.D.f7598a;
    }

    public final ko.e1 h(c cVar) {
        int length = this.f7577x.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (cVar.equals(this.f7578y[i10])) {
                return this.f7577x[i10];
            }
        }
        if (this.f7579z) {
            io.bidmachine.media3.common.util.b0.w("ProgressiveMediaPeriod", "Extractor added new track (id=" + cVar.f7596a + ") after finishing tracks.");
            return new ko.v();
        }
        n1 n1VarCreateWithDrm = n1.createWithDrm(this.f7563j, this.f7558e, this.f7561h);
        n1VarCreateWithDrm.setUpstreamFormatChangeListener(this);
        int i11 = length + 1;
        c[] cVarArr = (c[]) Arrays.copyOf(this.f7578y, i11);
        cVarArr[length] = cVar;
        this.f7578y = (c[]) io.bidmachine.media3.common.util.a1.castNonNullTypeArray(cVarArr);
        n1[] n1VarArr = (n1[]) Arrays.copyOf(this.f7577x, i11);
        n1VarArr[length] = n1VarCreateWithDrm;
        this.f7577x = (n1[]) io.bidmachine.media3.common.util.a1.castNonNullTypeArray(n1VarArr);
        return n1VarCreateWithDrm;
    }

    public final void i(ko.y0 y0Var) {
        this.E = this.f7576w == null ? y0Var : new ko.x0(C.TIME_UNSET);
        this.F = y0Var.getDurationUs();
        boolean z10 = !this.M && y0Var.getDurationUs() == C.TIME_UNSET;
        this.G = z10;
        this.H = z10 ? 7 : 1;
        if (this.A) {
            ((i1) this.f7562i).onSourceInfoRefreshed(this.F, y0Var, z10);
        } else {
            e();
        }
    }

    @Override // ao.i0, ao.q1
    public boolean isLoading() {
        return this.f7569p.isLoading() && this.f7571r.isOpen();
    }

    public final void j() {
        a aVar = new a(this.f7556b, this.f7557c, this.f7570q, this, this.f7571r);
        if (this.A) {
            io.bidmachine.media3.common.util.a.checkState(d());
            long j10 = this.F;
            if (j10 != C.TIME_UNSET && this.O > j10) {
                this.R = true;
                this.O = C.TIME_UNSET;
                return;
            }
            long j11 = ((ko.y0) io.bidmachine.media3.common.util.a.checkNotNull(this.E)).getSeekPoints(this.O).f71792a.f71812b;
            long j12 = this.O;
            aVar.f7586g.f71790a = j11;
            aVar.f7589j = j12;
            aVar.f7588i = true;
            aVar.f7592m = false;
            for (n1 n1Var : this.f7577x) {
                n1Var.setStartTimeUs(this.O);
            }
            this.O = C.TIME_UNSET;
        }
        this.Q = b();
        this.f7569p.startLoading(aVar, this, this.f7559f.getMinimumLoadableRetryCount(this.H));
    }

    public final boolean k() {
        return this.J || d();
    }

    @Override // ao.i0
    public void maybeThrowPrepareError() throws IOException {
        this.f7569p.maybeThrowError(this.f7559f.getMinimumLoadableRetryCount(this.H));
        if (this.R && !this.A) {
            throw gn.z0.createForMalformedContainer("Loading finished before preparation is complete.", null);
        }
    }

    @Override // go.y
    public void onLoaderReleased() {
        for (n1 n1Var : this.f7577x) {
            n1Var.release();
        }
        this.f7570q.release();
    }

    @Override // ao.m1
    public void onUpstreamFormatChanged(io.bidmachine.media3.common.b bVar) {
        this.f7574u.post(this.f7572s);
    }

    @Override // ao.i0
    public void prepare(h0 h0Var, long j10) {
        this.f7575v = h0Var;
        io.bidmachine.media3.common.b bVar = this.f7567n;
        if (bVar == null) {
            this.f7571r.open();
            j();
        } else {
            track(this.f7566m, 3).format(bVar);
            i(new ko.q0(new long[]{0}, new long[]{0}, C.TIME_UNSET));
            endTracks();
            this.O = j10;
        }
    }

    @Override // ao.i0
    public long readDiscontinuity() {
        if (this.K) {
            this.K = false;
            return this.N;
        }
        if (!this.J) {
            return C.TIME_UNSET;
        }
        if (!this.R && b() <= this.Q) {
            return C.TIME_UNSET;
        }
        this.J = false;
        return this.N;
    }

    public void release() {
        if (this.A) {
            for (n1 n1Var : this.f7577x) {
                n1Var.preRelease();
            }
        }
        this.f7569p.release(this);
        this.f7574u.removeCallbacksAndMessages(null);
        this.f7575v = null;
        this.S = true;
    }

    @Override // ko.c0
    public void seekMap(ko.y0 y0Var) {
        this.f7574u.post(new af.n(6, this, y0Var));
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0071  */
    @Override // ao.i0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long seekToUs(long r10) {
        /*
            r9 = this;
            r9.a()
            ao.c1$d r0 = r9.D
            boolean[] r0 = r0.f7599b
            ko.y0 r1 = r9.E
            boolean r1 = r1.isSeekable()
            if (r1 == 0) goto L10
            goto L12
        L10:
            r10 = 0
        L12:
            r1 = 0
            r9.J = r1
            long r2 = r9.N
            int r2 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            r3 = 1
            if (r2 != 0) goto L1e
            r2 = r3
            goto L1f
        L1e:
            r2 = r1
        L1f:
            r9.N = r10
            boolean r4 = r9.d()
            if (r4 == 0) goto L2a
            r9.O = r10
            return r10
        L2a:
            int r4 = r9.H
            r5 = 7
            go.w r6 = r9.f7569p
            if (r4 == r5) goto L71
            boolean r4 = r9.R
            if (r4 != 0) goto L3b
            boolean r4 = r6.isLoading()
            if (r4 == 0) goto L71
        L3b:
            ao.n1[] r4 = r9.f7577x
            int r4 = r4.length
            r5 = r1
        L3f:
            if (r5 >= r4) goto L6e
            ao.n1[] r7 = r9.f7577x
            r7 = r7[r5]
            int r8 = r7.getReadIndex()
            if (r8 != 0) goto L4e
            if (r2 == 0) goto L4e
            goto L6b
        L4e:
            boolean r8 = r9.C
            if (r8 == 0) goto L5b
            int r8 = r7.getFirstIndex()
            boolean r7 = r7.seekTo(r8)
            goto L5f
        L5b:
            boolean r7 = r7.seekTo(r10, r1)
        L5f:
            if (r7 != 0) goto L6b
            boolean r7 = r0[r5]
            if (r7 != 0) goto L69
            boolean r7 = r9.B
            if (r7 != 0) goto L6b
        L69:
            r3 = r1
            goto L6e
        L6b:
            int r5 = r5 + 1
            goto L3f
        L6e:
            if (r3 == 0) goto L71
            goto La0
        L71:
            r9.P = r1
            r9.O = r10
            r9.R = r1
            r9.K = r1
            boolean r0 = r6.isLoading()
            if (r0 == 0) goto L90
            ao.n1[] r0 = r9.f7577x
            int r2 = r0.length
        L82:
            if (r1 >= r2) goto L8c
            r3 = r0[r1]
            r3.discardToEnd()
            int r1 = r1 + 1
            goto L82
        L8c:
            r6.cancelLoading()
            return r10
        L90:
            r6.clearFatalError()
            ao.n1[] r0 = r9.f7577x
            int r2 = r0.length
        L96:
            if (r1 >= r2) goto La0
            r3 = r0[r1]
            r3.reset()
            int r1 = r1 + 1
            goto L96
        La0:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: ao.c1.seekToUs(long):long");
    }

    @Override // ao.i0
    public long selectTracks(fo.l[] lVarArr, boolean[] zArr, o1[] o1VarArr, boolean[] zArr2, long j10) {
        fo.l lVar;
        a();
        d dVar = this.D;
        b2 b2Var = dVar.f7598a;
        boolean[] zArr3 = dVar.f7600c;
        int i10 = this.L;
        int i11 = 0;
        for (int i12 = 0; i12 < lVarArr.length; i12++) {
            o1 o1Var = o1VarArr[i12];
            if (o1Var != null && (lVarArr[i12] == null || !zArr[i12])) {
                int i13 = ((b) o1Var).f7594b;
                io.bidmachine.media3.common.util.a.checkState(zArr3[i13]);
                this.L--;
                zArr3[i13] = false;
                o1VarArr[i12] = null;
            }
        }
        boolean z10 = !this.I ? j10 == 0 || this.C : i10 != 0;
        for (int i14 = 0; i14 < lVarArr.length; i14++) {
            if (o1VarArr[i14] == null && (lVar = lVarArr[i14]) != null) {
                io.bidmachine.media3.common.util.a.checkState(lVar.length() == 1);
                io.bidmachine.media3.common.util.a.checkState(lVar.getIndexInTrackGroup(0) == 0);
                int iIndexOf = b2Var.indexOf(lVar.getTrackGroup());
                io.bidmachine.media3.common.util.a.checkState(!zArr3[iIndexOf]);
                this.L++;
                zArr3[iIndexOf] = true;
                this.K = lVar.getSelectedFormat().f60671u | this.K;
                o1VarArr[i14] = new b(iIndexOf);
                zArr2[i14] = true;
                if (!z10) {
                    n1 n1Var = this.f7577x[iIndexOf];
                    z10 = (n1Var.getReadIndex() == 0 || n1Var.seekTo(j10, true)) ? false : true;
                }
            }
        }
        if (this.L == 0) {
            this.P = false;
            this.J = false;
            this.K = false;
            go.w wVar = this.f7569p;
            if (wVar.isLoading()) {
                n1[] n1VarArr = this.f7577x;
                int length = n1VarArr.length;
                while (i11 < length) {
                    n1VarArr[i11].discardToEnd();
                    i11++;
                }
                wVar.cancelLoading();
            } else {
                this.R = false;
                n1[] n1VarArr2 = this.f7577x;
                int length2 = n1VarArr2.length;
                while (i11 < length2) {
                    n1VarArr2[i11].reset();
                    i11++;
                }
            }
        } else if (z10) {
            j10 = seekToUs(j10);
            while (i11 < o1VarArr.length) {
                if (o1VarArr[i11] != null) {
                    zArr2[i11] = true;
                }
                i11++;
            }
        }
        this.I = true;
        return j10;
    }

    @Override // ko.c0
    public ko.e1 track(int i10, int i11) {
        return h(new c(i10, false));
    }

    @Override // go.u
    public void onLoadCanceled(a aVar, long j10, long j11, boolean z10) {
        ln.e0 e0Var = aVar.f7582c;
        b0 b0Var = new b0(aVar.f7580a, aVar.f7590k, e0Var.getLastOpenedUri(), e0Var.getLastResponseHeaders(), j10, j11, e0Var.getBytesRead());
        this.f7559f.onLoadTaskConcluded(aVar.f7580a);
        this.f7560g.loadCanceled(b0Var, 1, -1, null, 0, null, aVar.f7589j, this.F);
        if (z10) {
            return;
        }
        for (n1 n1Var : this.f7577x) {
            n1Var.reset();
        }
        if (this.L > 0) {
            ((h0) io.bidmachine.media3.common.util.a.checkNotNull(this.f7575v)).onContinueLoadingRequested(this);
        }
    }

    @Override // go.u
    public void onLoadCompleted(a aVar, long j10, long j11) {
        if (this.F == C.TIME_UNSET && this.E != null) {
            long jC = c(true);
            long j12 = jC == Long.MIN_VALUE ? 0L : jC + 10000;
            this.F = j12;
            ((i1) this.f7562i).onSourceInfoRefreshed(j12, this.E, this.G);
        }
        ln.e0 e0Var = aVar.f7582c;
        b0 b0Var = new b0(aVar.f7580a, aVar.f7590k, e0Var.getLastOpenedUri(), e0Var.getLastResponseHeaders(), j10, j11, e0Var.getBytesRead());
        this.f7559f.onLoadTaskConcluded(aVar.f7580a);
        this.f7560g.loadCompleted(b0Var, 1, -1, null, 0, null, aVar.f7589j, this.F);
        this.R = true;
        ((h0) io.bidmachine.media3.common.util.a.checkNotNull(this.f7575v)).onContinueLoadingRequested(this);
    }

    @Override // go.u
    public go.v onLoadError(a aVar, long j10, long j11, IOException iOException, int i10) {
        go.v vVarCreateRetryAction;
        ko.y0 y0Var;
        ln.e0 e0Var = aVar.f7582c;
        b0 b0Var = new b0(aVar.f7580a, aVar.f7590k, e0Var.getLastOpenedUri(), e0Var.getLastResponseHeaders(), j10, j11, e0Var.getBytesRead());
        go.s sVar = new go.s(b0Var, new g0(1, -1, null, 0, null, io.bidmachine.media3.common.util.a1.usToMs(aVar.f7589j), io.bidmachine.media3.common.util.a1.usToMs(this.F)), iOException, i10);
        go.t tVar = this.f7559f;
        long retryDelayMsFor = tVar.getRetryDelayMsFor(sVar);
        if (retryDelayMsFor == C.TIME_UNSET) {
            vVarCreateRetryAction = go.w.f58372f;
        } else {
            int iB = b();
            boolean z10 = iB > this.Q;
            if (this.M || !((y0Var = this.E) == null || y0Var.getDurationUs() == C.TIME_UNSET)) {
                this.Q = iB;
            } else if (!this.A || k()) {
                this.J = this.A;
                this.N = 0L;
                this.Q = 0;
                for (n1 n1Var : this.f7577x) {
                    n1Var.reset();
                }
                aVar.f7586g.f71790a = 0L;
                aVar.f7589j = 0L;
                aVar.f7588i = true;
                aVar.f7592m = false;
            } else {
                this.P = true;
                vVarCreateRetryAction = go.w.f58371e;
            }
            vVarCreateRetryAction = go.w.createRetryAction(z10, retryDelayMsFor);
        }
        boolean zIsRetry = vVarCreateRetryAction.isRetry();
        this.f7560g.loadError(b0Var, 1, -1, null, 0, null, aVar.f7589j, this.F, iOException, !zIsRetry);
        if (!zIsRetry) {
            tVar.onLoadTaskConcluded(aVar.f7580a);
        }
        return vVarCreateRetryAction;
    }

    @Override // go.u
    public void onLoadStarted(a aVar, long j10, long j11, int i10) {
        ln.e0 e0Var = aVar.f7582c;
        this.f7560g.loadStarted(i10 == 0 ? new b0(aVar.f7580a, aVar.f7590k, j10) : new b0(aVar.f7580a, aVar.f7590k, e0Var.getLastOpenedUri(), e0Var.getLastResponseHeaders(), j10, j11, e0Var.getBytesRead()), 1, -1, null, 0, null, aVar.f7589j, this.F, i10);
    }

    @Override // ao.i0, ao.q1
    public void reevaluateBuffer(long j10) {
    }
}
