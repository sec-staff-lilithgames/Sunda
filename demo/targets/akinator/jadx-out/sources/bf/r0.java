package bf;

import android.net.Uri;
import android.os.Handler;
import com.google.android.exoplayer2.e3;
import com.google.android.exoplayer2.h2;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import qf.t;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class r0 implements a0, ee.s, qf.p0, qf.t0, z0 {
    public static final Map O;
    public static final com.google.android.exoplayer2.z0 P;
    public ee.i0 A;
    public boolean C;
    public boolean E;
    public boolean F;
    public int G;
    public boolean H;
    public long I;
    public boolean K;
    public int L;
    public boolean M;
    public boolean N;

    /* renamed from: b, reason: collision with root package name */
    public final Uri f9381b;

    /* renamed from: c, reason: collision with root package name */
    public final qf.p f9382c;

    /* renamed from: e, reason: collision with root package name */
    public final de.t f9383e;

    /* renamed from: f, reason: collision with root package name */
    public final qf.o0 f9384f;

    /* renamed from: g, reason: collision with root package name */
    public final i0 f9385g;

    /* renamed from: h, reason: collision with root package name */
    public final de.p f9386h;

    /* renamed from: i, reason: collision with root package name */
    public final s0 f9387i;

    /* renamed from: j, reason: collision with root package name */
    public final qf.c f9388j;

    /* renamed from: k, reason: collision with root package name */
    public final String f9389k;

    /* renamed from: l, reason: collision with root package name */
    public final long f9390l;

    /* renamed from: n, reason: collision with root package name */
    public final p0 f9392n;

    /* renamed from: s, reason: collision with root package name */
    public z f9397s;

    /* renamed from: t, reason: collision with root package name */
    public IcyHeaders f9398t;

    /* renamed from: w, reason: collision with root package name */
    public boolean f9401w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f9402x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f9403y;

    /* renamed from: z, reason: collision with root package name */
    public d f9404z;

    /* renamed from: m, reason: collision with root package name */
    public final qf.r0 f9391m = new qf.r0("ProgressiveMediaPeriod");

    /* renamed from: o, reason: collision with root package name */
    public final com.google.android.exoplayer2.util.g f9393o = new com.google.android.exoplayer2.util.g();

    /* renamed from: p, reason: collision with root package name */
    public final q0 f9394p = new q0(this, 0);

    /* renamed from: q, reason: collision with root package name */
    public final q0 f9395q = new q0(this, 1);

    /* renamed from: r, reason: collision with root package name */
    public final Handler f9396r = com.google.android.exoplayer2.util.n1.createHandlerForCurrentLooper();

    /* renamed from: v, reason: collision with root package name */
    public c[] f9400v = new c[0];

    /* renamed from: u, reason: collision with root package name */
    public a1[] f9399u = new a1[0];
    public long J = C.TIME_UNSET;
    public long B = C.TIME_UNSET;
    public int D = 1;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class a implements qf.s0, r {

        /* renamed from: b, reason: collision with root package name */
        public final Uri f9406b;

        /* renamed from: c, reason: collision with root package name */
        public final qf.a1 f9407c;

        /* renamed from: d, reason: collision with root package name */
        public final p0 f9408d;

        /* renamed from: e, reason: collision with root package name */
        public final ee.s f9409e;

        /* renamed from: f, reason: collision with root package name */
        public final com.google.android.exoplayer2.util.g f9410f;

        /* renamed from: h, reason: collision with root package name */
        public volatile boolean f9412h;

        /* renamed from: j, reason: collision with root package name */
        public long f9414j;

        /* renamed from: l, reason: collision with root package name */
        public a1 f9416l;

        /* renamed from: m, reason: collision with root package name */
        public boolean f9417m;

        /* renamed from: g, reason: collision with root package name */
        public final ee.f0 f9411g = new ee.f0();

        /* renamed from: i, reason: collision with root package name */
        public boolean f9413i = true;

        /* renamed from: a, reason: collision with root package name */
        public final long f9405a = t.getNewId();

        /* renamed from: k, reason: collision with root package name */
        public qf.t f9415k = a(0);

        public a(Uri uri, qf.p pVar, p0 p0Var, ee.s sVar, com.google.android.exoplayer2.util.g gVar) {
            this.f9406b = uri;
            this.f9407c = new qf.a1(pVar);
            this.f9408d = p0Var;
            this.f9409e = sVar;
            this.f9410f = gVar;
        }

        public final qf.t a(long j10) {
            return new t.a().setUri(this.f9406b).setPosition(j10).setKey(r0.this.f9389k).setFlags(6).setHttpRequestHeaders(r0.O).build();
        }

        @Override // qf.s0
        public void cancelLoad() {
            this.f9412h = true;
        }

        @Override // qf.s0
        public void load() throws IOException {
            qf.k sVar;
            int i10;
            int i11 = 0;
            while (i11 == 0 && !this.f9412h) {
                try {
                    long j10 = this.f9411g.f54188a;
                    qf.t tVarA = a(j10);
                    this.f9415k = tVarA;
                    long jOpen = this.f9407c.open(tVarA);
                    if (jOpen != -1) {
                        jOpen += j10;
                        r0 r0Var = r0.this;
                        r0Var.f9396r.post(new q0(r0Var, 2));
                    }
                    long j11 = jOpen;
                    r0.this.f9398t = IcyHeaders.parse(this.f9407c.getResponseHeaders());
                    qf.a1 a1Var = this.f9407c;
                    IcyHeaders icyHeaders = r0.this.f9398t;
                    if (icyHeaders == null || (i10 = icyHeaders.f27736h) == -1) {
                        sVar = a1Var;
                    } else {
                        sVar = new s(a1Var, i10, this);
                        r0 r0Var2 = r0.this;
                        r0Var2.getClass();
                        a1 a1VarI = r0Var2.i(new c(0, true));
                        this.f9416l = a1VarI;
                        a1VarI.format(r0.P);
                    }
                    this.f9408d.init(sVar, this.f9406b, this.f9407c.getResponseHeaders(), j10, j11, this.f9409e);
                    if (r0.this.f9398t != null) {
                        this.f9408d.disableSeekingOnMp3Streams();
                    }
                    if (this.f9413i) {
                        this.f9408d.seek(j10, this.f9414j);
                        this.f9413i = false;
                    }
                    while (i11 == 0 && !this.f9412h) {
                        try {
                            this.f9410f.block();
                            i11 = this.f9408d.read(this.f9411g);
                            long currentInputPosition = this.f9408d.getCurrentInputPosition();
                            if (currentInputPosition > r0.this.f9390l + j10) {
                                this.f9410f.close();
                                r0 r0Var3 = r0.this;
                                r0Var3.f9396r.post(r0Var3.f9395q);
                                j10 = currentInputPosition;
                            }
                        } catch (InterruptedException unused) {
                            throw new InterruptedIOException();
                        }
                    }
                    if (i11 == 1) {
                        i11 = 0;
                    } else if (this.f9408d.getCurrentInputPosition() != -1) {
                        this.f9411g.f54188a = this.f9408d.getCurrentInputPosition();
                    }
                    qf.s.closeQuietly(this.f9407c);
                } catch (Throwable th2) {
                    if (i11 != 1 && this.f9408d.getCurrentInputPosition() != -1) {
                        this.f9411g.f54188a = this.f9408d.getCurrentInputPosition();
                    }
                    qf.s.closeQuietly(this.f9407c);
                    throw th2;
                }
            }
        }

        @Override // bf.r
        public void onIcyMetadata(com.google.android.exoplayer2.util.v0 v0Var) {
            long jMax;
            if (this.f9417m) {
                Map map = r0.O;
                jMax = Math.max(r0.this.c(true), this.f9414j);
            } else {
                jMax = this.f9414j;
            }
            long j10 = jMax;
            int iBytesLeft = v0Var.bytesLeft();
            ee.l0 l0Var = (ee.l0) com.google.android.exoplayer2.util.a.checkNotNull(this.f9416l);
            l0Var.sampleData(v0Var, iBytesLeft);
            l0Var.sampleMetadata(j10, 1, iBytesLeft, 0, null);
            this.f9417m = true;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class b implements b1 {

        /* renamed from: a, reason: collision with root package name */
        public final int f9419a;

        public b(int i10) {
            this.f9419a = i10;
        }

        @Override // bf.b1
        public boolean isReady() {
            r0 r0Var = r0.this;
            return !r0Var.k() && r0Var.f9399u[this.f9419a].isReady(r0Var.M);
        }

        @Override // bf.b1
        public void maybeThrowError() throws IOException {
            int i10 = this.f9419a;
            r0 r0Var = r0.this;
            r0Var.f9399u[i10].maybeThrowError();
            r0Var.h();
        }

        @Override // bf.b1
        public int readData(com.google.android.exoplayer2.a1 a1Var, ce.h hVar, int i10) {
            r0 r0Var = r0.this;
            if (r0Var.k()) {
                return -3;
            }
            int i11 = this.f9419a;
            r0Var.f(i11);
            int i12 = r0Var.f9399u[i11].read(a1Var, hVar, i10, r0Var.M);
            if (i12 == -3) {
                r0Var.g(i11);
            }
            return i12;
        }

        @Override // bf.b1
        public int skipData(long j10) throws Throwable {
            r0 r0Var = r0.this;
            if (r0Var.k()) {
                return 0;
            }
            int i10 = this.f9419a;
            r0Var.f(i10);
            a1 a1Var = r0Var.f9399u[i10];
            int skipCount = a1Var.getSkipCount(j10, r0Var.M);
            a1Var.skip(skipCount);
            if (skipCount == 0) {
                r0Var.g(i10);
            }
            return skipCount;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final int f9421a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f9422b;

        public c(int i10, boolean z10) {
            this.f9421a = i10;
            this.f9422b = z10;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && c.class == obj.getClass()) {
                c cVar = (c) obj;
                if (this.f9421a == cVar.f9421a && this.f9422b == cVar.f9422b) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (this.f9421a * 31) + (this.f9422b ? 1 : 0);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final n1 f9423a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean[] f9424b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean[] f9425c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean[] f9426d;

        public d(n1 n1Var, boolean[] zArr) {
            this.f9423a = n1Var;
            this.f9424b = zArr;
            int i10 = n1Var.f9356b;
            this.f9425c = new boolean[i10];
            this.f9426d = new boolean[i10];
        }
    }

    static {
        HashMap map = new HashMap();
        map.put("Icy-MetaData", "1");
        O = Collections.unmodifiableMap(map);
        P = new com.google.android.exoplayer2.y0().setId("icy").setSampleMimeType("application/x-icy").build();
    }

    public r0(Uri uri, qf.p pVar, p0 p0Var, de.t tVar, de.p pVar2, qf.o0 o0Var, i0 i0Var, s0 s0Var, qf.c cVar, String str, int i10) {
        this.f9381b = uri;
        this.f9382c = pVar;
        this.f9383e = tVar;
        this.f9386h = pVar2;
        this.f9384f = o0Var;
        this.f9385g = i0Var;
        this.f9387i = s0Var;
        this.f9388j = cVar;
        this.f9389k = str;
        this.f9390l = i10;
        this.f9392n = p0Var;
    }

    public final void a() {
        com.google.android.exoplayer2.util.a.checkState(this.f9402x);
        com.google.android.exoplayer2.util.a.checkNotNull(this.f9404z);
        com.google.android.exoplayer2.util.a.checkNotNull(this.A);
    }

    public final int b() {
        int writeIndex = 0;
        for (a1 a1Var : this.f9399u) {
            writeIndex += a1Var.getWriteIndex();
        }
        return writeIndex;
    }

    public final long c(boolean z10) {
        long jMax = Long.MIN_VALUE;
        for (int i10 = 0; i10 < this.f9399u.length; i10++) {
            if (z10 || ((d) com.google.android.exoplayer2.util.a.checkNotNull(this.f9404z)).f9425c[i10]) {
                jMax = Math.max(jMax, this.f9399u[i10].getLargestQueuedTimestampUs());
            }
        }
        return jMax;
    }

    @Override // bf.a0, bf.d1
    public boolean continueLoading(long j10) {
        if (this.M) {
            return false;
        }
        qf.r0 r0Var = this.f9391m;
        if (r0Var.hasFatalError() || this.K) {
            return false;
        }
        if (this.f9402x && this.G == 0) {
            return false;
        }
        boolean zOpen = this.f9393o.open();
        if (r0Var.isLoading()) {
            return zOpen;
        }
        j();
        return true;
    }

    public final boolean d() {
        return this.J != C.TIME_UNSET;
    }

    @Override // bf.a0
    public void discardBuffer(long j10, boolean z10) throws Throwable {
        a();
        if (d()) {
            return;
        }
        boolean[] zArr = this.f9404z.f9425c;
        int length = this.f9399u.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.f9399u[i10].discardTo(j10, z10, zArr[i10]);
        }
    }

    public final void e() {
        if (this.N || this.f9402x || !this.f9401w || this.A == null) {
            return;
        }
        for (a1 a1Var : this.f9399u) {
            if (a1Var.getUpstreamFormat() == null) {
                return;
            }
        }
        this.f9393o.close();
        int length = this.f9399u.length;
        m1[] m1VarArr = new m1[length];
        boolean[] zArr = new boolean[length];
        for (int i10 = 0; i10 < length; i10++) {
            com.google.android.exoplayer2.z0 z0VarBuild = (com.google.android.exoplayer2.z0) com.google.android.exoplayer2.util.a.checkNotNull(this.f9399u[i10].getUpstreamFormat());
            String str = z0VarBuild.f28802n;
            boolean zIsAudio = com.google.android.exoplayer2.util.l0.isAudio(str);
            boolean z10 = zIsAudio || com.google.android.exoplayer2.util.l0.isVideo(str);
            zArr[i10] = z10;
            this.f9403y = z10 | this.f9403y;
            IcyHeaders icyHeaders = this.f9398t;
            if (icyHeaders != null) {
                int i11 = icyHeaders.f27731b;
                if (zIsAudio || this.f9400v[i10].f9422b) {
                    Metadata metadata = z0VarBuild.f28800l;
                    z0VarBuild = z0VarBuild.buildUpon().setMetadata(metadata == null ? new Metadata(icyHeaders) : metadata.copyWithAppendedEntries(icyHeaders)).build();
                }
                if (zIsAudio && z0VarBuild.f28796h == -1 && z0VarBuild.f28797i == -1 && i11 != -1) {
                    z0VarBuild = z0VarBuild.buildUpon().setAverageBitrate(i11).build();
                }
            }
            m1VarArr[i10] = new m1(Integer.toString(i10), z0VarBuild.copyWithCryptoType(this.f9383e.getCryptoType(z0VarBuild)));
        }
        this.f9404z = new d(new n1(m1VarArr), zArr);
        this.f9402x = true;
        ((z) com.google.android.exoplayer2.util.a.checkNotNull(this.f9397s)).onPrepared(this);
    }

    @Override // ee.s
    public void endTracks() {
        this.f9401w = true;
        this.f9396r.post(this.f9394p);
    }

    public final void f(int i10) {
        a();
        d dVar = this.f9404z;
        boolean[] zArr = dVar.f9426d;
        if (zArr[i10]) {
            return;
        }
        com.google.android.exoplayer2.z0 format = dVar.f9423a.get(i10).getFormat(0);
        this.f9385g.downstreamFormatChanged(com.google.android.exoplayer2.util.l0.getTrackType(format.f28802n), format, 0, null, this.I);
        zArr[i10] = true;
    }

    public final void g(int i10) {
        a();
        boolean[] zArr = this.f9404z.f9424b;
        if (this.K && zArr[i10]) {
            if (this.f9399u[i10].isReady(false)) {
                return;
            }
            this.J = 0L;
            this.K = false;
            this.F = true;
            this.I = 0L;
            this.L = 0;
            for (a1 a1Var : this.f9399u) {
                a1Var.reset();
            }
            ((z) com.google.android.exoplayer2.util.a.checkNotNull(this.f9397s)).onContinueLoadingRequested(this);
        }
    }

    @Override // bf.a0
    public long getAdjustedSeekPositionUs(long j10, e3 e3Var) {
        a();
        if (!this.A.isSeekable()) {
            return 0L;
        }
        ee.g0 seekPoints = this.A.getSeekPoints(j10);
        return e3Var.resolveSeekPositionUs(j10, seekPoints.f54193a.f54211a, seekPoints.f54194b.f54211a);
    }

    @Override // bf.a0, bf.d1
    public long getBufferedPositionUs() {
        long jC;
        a();
        if (this.M || this.G == 0) {
            return Long.MIN_VALUE;
        }
        if (d()) {
            return this.J;
        }
        if (this.f9403y) {
            int length = this.f9399u.length;
            jC = Long.MAX_VALUE;
            for (int i10 = 0; i10 < length; i10++) {
                d dVar = this.f9404z;
                if (dVar.f9424b[i10] && dVar.f9425c[i10] && !this.f9399u[i10].isLastSampleQueued()) {
                    jC = Math.min(jC, this.f9399u[i10].getLargestQueuedTimestampUs());
                }
            }
        } else {
            jC = Long.MAX_VALUE;
        }
        if (jC == Long.MAX_VALUE) {
            jC = c(false);
        }
        return jC == Long.MIN_VALUE ? this.I : jC;
    }

    @Override // bf.a0, bf.d1
    public long getNextLoadPositionUs() {
        return getBufferedPositionUs();
    }

    @Override // bf.a0
    public /* bridge */ /* synthetic */ List getStreamKeys(List list) {
        return super.getStreamKeys(list);
    }

    @Override // bf.a0
    public n1 getTrackGroups() {
        a();
        return this.f9404z.f9423a;
    }

    public final void h() throws IOException {
        this.f9391m.maybeThrowError(this.f9384f.getMinimumLoadableRetryCount(this.D));
    }

    public final a1 i(c cVar) {
        int length = this.f9399u.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (cVar.equals(this.f9400v[i10])) {
                return this.f9399u[i10];
            }
        }
        a1 a1VarCreateWithDrm = a1.createWithDrm(this.f9388j, this.f9383e, this.f9386h);
        a1VarCreateWithDrm.setUpstreamFormatChangeListener(this);
        int i11 = length + 1;
        c[] cVarArr = (c[]) Arrays.copyOf(this.f9400v, i11);
        cVarArr[length] = cVar;
        this.f9400v = (c[]) com.google.android.exoplayer2.util.n1.castNonNullTypeArray(cVarArr);
        a1[] a1VarArr = (a1[]) Arrays.copyOf(this.f9399u, i11);
        a1VarArr[length] = a1VarCreateWithDrm;
        this.f9399u = (a1[]) com.google.android.exoplayer2.util.n1.castNonNullTypeArray(a1VarArr);
        return a1VarCreateWithDrm;
    }

    @Override // bf.a0, bf.d1
    public boolean isLoading() {
        return this.f9391m.isLoading() && this.f9393o.isOpen();
    }

    public final void j() {
        a aVar = new a(this.f9381b, this.f9382c, this.f9392n, this, this.f9393o);
        if (this.f9402x) {
            com.google.android.exoplayer2.util.a.checkState(d());
            long j10 = this.B;
            if (j10 != C.TIME_UNSET && this.J > j10) {
                this.M = true;
                this.J = C.TIME_UNSET;
                return;
            }
            long j11 = ((ee.i0) com.google.android.exoplayer2.util.a.checkNotNull(this.A)).getSeekPoints(this.J).f54193a.f54212b;
            long j12 = this.J;
            aVar.f9411g.f54188a = j11;
            aVar.f9414j = j12;
            aVar.f9413i = true;
            aVar.f9417m = false;
            for (a1 a1Var : this.f9399u) {
                a1Var.setStartTimeUs(this.J);
            }
            this.J = C.TIME_UNSET;
        }
        this.L = b();
        this.f9385g.loadStarted(new t(aVar.f9405a, aVar.f9415k, this.f9391m.startLoading(aVar, this, this.f9384f.getMinimumLoadableRetryCount(this.D))), 1, -1, null, 0, null, aVar.f9414j, this.B);
    }

    public final boolean k() {
        return this.F || d();
    }

    @Override // bf.a0
    public void maybeThrowPrepareError() throws IOException {
        h();
        if (this.M && !this.f9402x) {
            throw h2.createForMalformedContainer("Loading finished before preparation is complete.", null);
        }
    }

    @Override // qf.t0
    public void onLoaderReleased() {
        for (a1 a1Var : this.f9399u) {
            a1Var.release();
        }
        this.f9392n.release();
    }

    @Override // bf.z0
    public void onUpstreamFormatChanged(com.google.android.exoplayer2.z0 z0Var) {
        this.f9396r.post(this.f9394p);
    }

    @Override // bf.a0
    public void prepare(z zVar, long j10) {
        this.f9397s = zVar;
        this.f9393o.open();
        j();
    }

    @Override // bf.a0
    public long readDiscontinuity() {
        if (!this.F) {
            return C.TIME_UNSET;
        }
        if (!this.M && b() <= this.L) {
            return C.TIME_UNSET;
        }
        this.F = false;
        return this.I;
    }

    public void release() {
        if (this.f9402x) {
            for (a1 a1Var : this.f9399u) {
                a1Var.preRelease();
            }
        }
        this.f9391m.release(this);
        this.f9396r.removeCallbacksAndMessages(null);
        this.f9397s = null;
        this.N = true;
    }

    @Override // ee.s
    public void seekMap(ee.i0 i0Var) {
        this.f9396r.post(new af.n(7, this, i0Var));
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0060  */
    @Override // bf.a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long seekToUs(long r6) {
        /*
            r5 = this;
            r5.a()
            bf.r0$d r0 = r5.f9404z
            boolean[] r0 = r0.f9424b
            ee.i0 r1 = r5.A
            boolean r1 = r1.isSeekable()
            if (r1 == 0) goto L10
            goto L12
        L10:
            r6 = 0
        L12:
            r1 = 0
            r5.F = r1
            r5.I = r6
            boolean r2 = r5.d()
            if (r2 == 0) goto L20
            r5.J = r6
            return r6
        L20:
            int r2 = r5.D
            r3 = 7
            if (r2 == r3) goto L41
            bf.a1[] r2 = r5.f9399u
            int r2 = r2.length
            r3 = r1
        L29:
            if (r3 >= r2) goto L70
            bf.a1[] r4 = r5.f9399u
            r4 = r4[r3]
            boolean r4 = r4.seekTo(r6, r1)
            if (r4 != 0) goto L3e
            boolean r4 = r0[r3]
            if (r4 != 0) goto L41
            boolean r4 = r5.f9403y
            if (r4 != 0) goto L3e
            goto L41
        L3e:
            int r3 = r3 + 1
            goto L29
        L41:
            r5.K = r1
            r5.J = r6
            r5.M = r1
            qf.r0 r0 = r5.f9391m
            boolean r2 = r0.isLoading()
            if (r2 == 0) goto L60
            bf.a1[] r2 = r5.f9399u
            int r3 = r2.length
        L52:
            if (r1 >= r3) goto L5c
            r4 = r2[r1]
            r4.discardToEnd()
            int r1 = r1 + 1
            goto L52
        L5c:
            r0.cancelLoading()
            return r6
        L60:
            r0.clearFatalError()
            bf.a1[] r0 = r5.f9399u
            int r2 = r0.length
        L66:
            if (r1 >= r2) goto L70
            r3 = r0[r1]
            r3.reset()
            int r1 = r1 + 1
            goto L66
        L70:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: bf.r0.seekToUs(long):long");
    }

    @Override // bf.a0
    public long selectTracks(pf.k[] kVarArr, boolean[] zArr, b1[] b1VarArr, boolean[] zArr2, long j10) {
        pf.k kVar;
        a();
        d dVar = this.f9404z;
        n1 n1Var = dVar.f9423a;
        boolean[] zArr3 = dVar.f9425c;
        int i10 = this.G;
        int i11 = 0;
        for (int i12 = 0; i12 < kVarArr.length; i12++) {
            b1 b1Var = b1VarArr[i12];
            if (b1Var != null && (kVarArr[i12] == null || !zArr[i12])) {
                int i13 = ((b) b1Var).f9419a;
                com.google.android.exoplayer2.util.a.checkState(zArr3[i13]);
                this.G--;
                zArr3[i13] = false;
                b1VarArr[i12] = null;
            }
        }
        boolean z10 = !this.E ? j10 == 0 : i10 != 0;
        for (int i14 = 0; i14 < kVarArr.length; i14++) {
            if (b1VarArr[i14] == null && (kVar = kVarArr[i14]) != null) {
                com.google.android.exoplayer2.util.a.checkState(kVar.length() == 1);
                com.google.android.exoplayer2.util.a.checkState(kVar.getIndexInTrackGroup(0) == 0);
                int iIndexOf = n1Var.indexOf(kVar.getTrackGroup());
                com.google.android.exoplayer2.util.a.checkState(!zArr3[iIndexOf]);
                this.G++;
                zArr3[iIndexOf] = true;
                b1VarArr[i14] = new b(iIndexOf);
                zArr2[i14] = true;
                if (!z10) {
                    a1 a1Var = this.f9399u[iIndexOf];
                    z10 = (a1Var.seekTo(j10, true) || a1Var.getReadIndex() == 0) ? false : true;
                }
            }
        }
        if (this.G == 0) {
            this.K = false;
            this.F = false;
            qf.r0 r0Var = this.f9391m;
            if (r0Var.isLoading()) {
                a1[] a1VarArr = this.f9399u;
                int length = a1VarArr.length;
                while (i11 < length) {
                    a1VarArr[i11].discardToEnd();
                    i11++;
                }
                r0Var.cancelLoading();
            } else {
                a1[] a1VarArr2 = this.f9399u;
                int length2 = a1VarArr2.length;
                while (i11 < length2) {
                    a1VarArr2[i11].reset();
                    i11++;
                }
            }
        } else if (z10) {
            j10 = seekToUs(j10);
            while (i11 < b1VarArr.length) {
                if (b1VarArr[i11] != null) {
                    zArr2[i11] = true;
                }
                i11++;
            }
        }
        this.E = true;
        return j10;
    }

    @Override // ee.s
    public ee.l0 track(int i10, int i11) {
        return i(new c(i10, false));
    }

    @Override // qf.p0
    public void onLoadCanceled(a aVar, long j10, long j11, boolean z10) {
        qf.a1 a1Var = aVar.f9407c;
        t tVar = new t(aVar.f9405a, aVar.f9415k, a1Var.getLastOpenedUri(), a1Var.getLastResponseHeaders(), j10, j11, a1Var.getBytesRead());
        this.f9384f.onLoadTaskConcluded(aVar.f9405a);
        this.f9385g.loadCanceled(tVar, 1, -1, null, 0, null, aVar.f9414j, this.B);
        if (z10) {
            return;
        }
        for (a1 a1Var2 : this.f9399u) {
            a1Var2.reset();
        }
        if (this.G > 0) {
            ((z) com.google.android.exoplayer2.util.a.checkNotNull(this.f9397s)).onContinueLoadingRequested(this);
        }
    }

    @Override // qf.p0
    public void onLoadCompleted(a aVar, long j10, long j11) {
        ee.i0 i0Var;
        if (this.B == C.TIME_UNSET && (i0Var = this.A) != null) {
            boolean zIsSeekable = i0Var.isSeekable();
            long jC = c(true);
            long j12 = jC == Long.MIN_VALUE ? 0L : jC + 10000;
            this.B = j12;
            ((v0) this.f9387i).onSourceInfoRefreshed(j12, zIsSeekable, this.C);
        }
        qf.a1 a1Var = aVar.f9407c;
        t tVar = new t(aVar.f9405a, aVar.f9415k, a1Var.getLastOpenedUri(), a1Var.getLastResponseHeaders(), j10, j11, a1Var.getBytesRead());
        this.f9384f.onLoadTaskConcluded(aVar.f9405a);
        this.f9385g.loadCompleted(tVar, 1, -1, null, 0, null, aVar.f9414j, this.B);
        this.M = true;
        ((z) com.google.android.exoplayer2.util.a.checkNotNull(this.f9397s)).onContinueLoadingRequested(this);
    }

    @Override // qf.p0
    public qf.q0 onLoadError(a aVar, long j10, long j11, IOException iOException, int i10) {
        qf.q0 q0VarCreateRetryAction;
        ee.i0 i0Var;
        qf.a1 a1Var = aVar.f9407c;
        t tVar = new t(aVar.f9405a, aVar.f9415k, a1Var.getLastOpenedUri(), a1Var.getLastResponseHeaders(), j10, j11, a1Var.getBytesRead());
        qf.n0 n0Var = new qf.n0(tVar, new y(1, -1, null, 0, null, com.google.android.exoplayer2.util.n1.usToMs(aVar.f9414j), com.google.android.exoplayer2.util.n1.usToMs(this.B)), iOException, i10);
        qf.o0 o0Var = this.f9384f;
        long retryDelayMsFor = o0Var.getRetryDelayMsFor(n0Var);
        if (retryDelayMsFor == C.TIME_UNSET) {
            q0VarCreateRetryAction = qf.r0.f82977e;
        } else {
            int iB = b();
            boolean z10 = iB > this.L;
            if (this.H || !((i0Var = this.A) == null || i0Var.getDurationUs() == C.TIME_UNSET)) {
                this.L = iB;
            } else if (!this.f9402x || k()) {
                this.F = this.f9402x;
                this.I = 0L;
                this.L = 0;
                for (a1 a1Var2 : this.f9399u) {
                    a1Var2.reset();
                }
                aVar.f9411g.f54188a = 0L;
                aVar.f9414j = 0L;
                aVar.f9413i = true;
                aVar.f9417m = false;
            } else {
                this.K = true;
                q0VarCreateRetryAction = qf.r0.f82976d;
            }
            q0VarCreateRetryAction = qf.r0.createRetryAction(z10, retryDelayMsFor);
        }
        boolean zIsRetry = q0VarCreateRetryAction.isRetry();
        this.f9385g.loadError(tVar, 1, -1, null, 0, null, aVar.f9414j, this.B, iOException, !zIsRetry);
        if (!zIsRetry) {
            o0Var.onLoadTaskConcluded(aVar.f9405a);
        }
        return q0VarCreateRetryAction;
    }

    @Override // bf.a0, bf.d1
    public void reevaluateBuffer(long j10) {
    }
}
