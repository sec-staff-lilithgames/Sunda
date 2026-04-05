package io.odeeo.internal.a0;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import io.odeeo.internal.a0.r;
import io.odeeo.internal.a0.u;
import io.odeeo.internal.b.t0;
import io.odeeo.internal.p0.i;
import io.odeeo.internal.p0.v;
import io.odeeo.internal.p0.w;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class h0 implements r, w.b<c> {

    /* renamed from: a, reason: collision with root package name */
    public final io.odeeo.internal.p0.m f62333a;

    /* renamed from: b, reason: collision with root package name */
    public final i.a f62334b;

    /* renamed from: c, reason: collision with root package name */
    public final io.odeeo.internal.p0.b0 f62335c;

    /* renamed from: e, reason: collision with root package name */
    public final io.odeeo.internal.p0.v f62336e;

    /* renamed from: f, reason: collision with root package name */
    public final u.a f62337f;

    /* renamed from: g, reason: collision with root package name */
    public final l0 f62338g;

    /* renamed from: i, reason: collision with root package name */
    public final long f62340i;

    /* renamed from: k, reason: collision with root package name */
    public final io.odeeo.internal.b.t f62342k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f62343l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f62344m;

    /* renamed from: n, reason: collision with root package name */
    public byte[] f62345n;

    /* renamed from: o, reason: collision with root package name */
    public int f62346o;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList<b> f62339h = new ArrayList<>();

    /* renamed from: j, reason: collision with root package name */
    public final io.odeeo.internal.p0.w f62341j = new io.odeeo.internal.p0.w("SingleSampleMediaPeriod");

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class b implements d0 {

        /* renamed from: a, reason: collision with root package name */
        public int f62347a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f62348b;

        public b() {
        }

        public final void a() {
            if (this.f62348b) {
                return;
            }
            h0.this.f62337f.downstreamFormatChanged(io.odeeo.internal.q0.t.getTrackType(h0.this.f62342k.f62971l), h0.this.f62342k, 0, null, 0L);
            this.f62348b = true;
        }

        @Override // io.odeeo.internal.a0.d0
        public boolean isReady() {
            return h0.this.f62344m;
        }

        @Override // io.odeeo.internal.a0.d0
        public void maybeThrowError() throws IOException {
            h0 h0Var = h0.this;
            if (h0Var.f62343l) {
                return;
            }
            h0Var.f62341j.maybeThrowError();
        }

        @Override // io.odeeo.internal.a0.d0
        public int readData(io.odeeo.internal.b.u uVar, io.odeeo.internal.e.g gVar, int i10) {
            a();
            h0 h0Var = h0.this;
            boolean z10 = h0Var.f62344m;
            if (z10 && h0Var.f62345n == null) {
                this.f62347a = 2;
            }
            int i11 = this.f62347a;
            if (i11 == 2) {
                gVar.addFlag(4);
                return -4;
            }
            if ((i10 & 2) != 0 || i11 == 0) {
                uVar.f63020b = h0Var.f62342k;
                this.f62347a = 1;
                return -5;
            }
            if (!z10) {
                return -3;
            }
            io.odeeo.internal.q0.a.checkNotNull(h0Var.f62345n);
            gVar.addFlag(1);
            gVar.f63707e = 0L;
            if ((i10 & 4) == 0) {
                gVar.ensureSpaceForWrite(h0.this.f62346o);
                ByteBuffer byteBuffer = gVar.f63705c;
                h0 h0Var2 = h0.this;
                byteBuffer.put(h0Var2.f62345n, 0, h0Var2.f62346o);
            }
            if ((i10 & 1) == 0) {
                this.f62347a = 2;
            }
            return -4;
        }

        public void reset() {
            if (this.f62347a == 2) {
                this.f62347a = 1;
            }
        }

        @Override // io.odeeo.internal.a0.d0
        public int skipData(long j10) {
            a();
            if (j10 <= 0 || this.f62347a == 2) {
                return 0;
            }
            this.f62347a = 2;
            return 1;
        }
    }

    public h0(io.odeeo.internal.p0.m mVar, i.a aVar, io.odeeo.internal.p0.b0 b0Var, io.odeeo.internal.b.t tVar, long j10, io.odeeo.internal.p0.v vVar, u.a aVar2, boolean z10) {
        this.f62333a = mVar;
        this.f62334b = aVar;
        this.f62335c = b0Var;
        this.f62342k = tVar;
        this.f62340i = j10;
        this.f62336e = vVar;
        this.f62337f = aVar2;
        this.f62343l = z10;
        this.f62338g = new l0(new k0(tVar));
    }

    @Override // io.odeeo.internal.a0.r, io.odeeo.internal.a0.e0
    public boolean continueLoading(long j10) {
        if (this.f62344m || this.f62341j.isLoading() || this.f62341j.hasFatalError()) {
            return false;
        }
        io.odeeo.internal.p0.i iVarCreateDataSource = this.f62334b.createDataSource();
        io.odeeo.internal.p0.b0 b0Var = this.f62335c;
        if (b0Var != null) {
            iVarCreateDataSource.addTransferListener(b0Var);
        }
        c cVar = new c(this.f62333a, iVarCreateDataSource);
        this.f62337f.loadStarted(new n(cVar.f62350a, this.f62333a, this.f62341j.startLoading(cVar, this, this.f62336e.getMinimumLoadableRetryCount(1))), 1, -1, this.f62342k, 0, null, 0L, this.f62340i);
        return true;
    }

    @Override // io.odeeo.internal.a0.r, io.odeeo.internal.a0.e0
    public long getBufferedPositionUs() {
        return this.f62344m ? Long.MIN_VALUE : 0L;
    }

    @Override // io.odeeo.internal.a0.r, io.odeeo.internal.a0.e0
    public long getNextLoadPositionUs() {
        return (this.f62344m || this.f62341j.isLoading()) ? Long.MIN_VALUE : 0L;
    }

    @Override // io.odeeo.internal.a0.r
    public /* bridge */ /* synthetic */ List getStreamKeys(List list) {
        return super.getStreamKeys(list);
    }

    @Override // io.odeeo.internal.a0.r
    public l0 getTrackGroups() {
        return this.f62338g;
    }

    @Override // io.odeeo.internal.a0.r, io.odeeo.internal.a0.e0
    public boolean isLoading() {
        return this.f62341j.isLoading();
    }

    @Override // io.odeeo.internal.a0.r
    public void prepare(r.a aVar, long j10) {
        aVar.onPrepared(this);
    }

    @Override // io.odeeo.internal.a0.r
    public long readDiscontinuity() {
        return C.TIME_UNSET;
    }

    public void release() {
        this.f62341j.release();
    }

    @Override // io.odeeo.internal.a0.r
    public long seekToUs(long j10) {
        for (int i10 = 0; i10 < this.f62339h.size(); i10++) {
            this.f62339h.get(i10).reset();
        }
        return j10;
    }

    @Override // io.odeeo.internal.a0.r
    public long selectTracks(io.odeeo.internal.n0.d[] dVarArr, boolean[] zArr, d0[] d0VarArr, boolean[] zArr2, long j10) {
        for (int i10 = 0; i10 < dVarArr.length; i10++) {
            d0 d0Var = d0VarArr[i10];
            if (d0Var != null && (dVarArr[i10] == null || !zArr[i10])) {
                this.f62339h.remove(d0Var);
                d0VarArr[i10] = null;
            }
            if (d0VarArr[i10] == null && dVarArr[i10] != null) {
                b bVar = new b();
                this.f62339h.add(bVar);
                d0VarArr[i10] = bVar;
                zArr2[i10] = true;
            }
        }
        return j10;
    }

    @Override // io.odeeo.internal.p0.w.b
    public void onLoadCanceled(c cVar, long j10, long j11, boolean z10) {
        io.odeeo.internal.p0.a0 a0Var = cVar.f62352c;
        n nVar = new n(cVar.f62350a, cVar.f62351b, a0Var.getLastOpenedUri(), a0Var.getLastResponseHeaders(), j10, j11, a0Var.getBytesRead());
        this.f62336e.onLoadTaskConcluded(cVar.f62350a);
        this.f62337f.loadCanceled(nVar, 1, -1, null, 0, null, 0L, this.f62340i);
    }

    @Override // io.odeeo.internal.p0.w.b
    public void onLoadCompleted(c cVar, long j10, long j11) {
        this.f62346o = (int) cVar.f62352c.getBytesRead();
        this.f62345n = (byte[]) io.odeeo.internal.q0.a.checkNotNull(cVar.f62353d);
        this.f62344m = true;
        io.odeeo.internal.p0.a0 a0Var = cVar.f62352c;
        n nVar = new n(cVar.f62350a, cVar.f62351b, a0Var.getLastOpenedUri(), a0Var.getLastResponseHeaders(), j10, j11, this.f62346o);
        this.f62336e.onLoadTaskConcluded(cVar.f62350a);
        this.f62337f.loadCompleted(nVar, 1, -1, this.f62342k, 0, null, 0L, this.f62340i);
    }

    @Override // io.odeeo.internal.p0.w.b
    public w.c onLoadError(c cVar, long j10, long j11, IOException iOException, int i10) {
        w.c cVarCreateRetryAction;
        io.odeeo.internal.p0.a0 a0Var = cVar.f62352c;
        n nVar = new n(cVar.f62350a, cVar.f62351b, a0Var.getLastOpenedUri(), a0Var.getLastResponseHeaders(), j10, j11, a0Var.getBytesRead());
        long retryDelayMsFor = this.f62336e.getRetryDelayMsFor(new v.c(nVar, new q(1, -1, this.f62342k, 0, null, 0L, io.odeeo.internal.q0.g0.usToMs(this.f62340i)), iOException, i10));
        boolean z10 = retryDelayMsFor == C.TIME_UNSET || i10 >= this.f62336e.getMinimumLoadableRetryCount(1);
        if (this.f62343l && z10) {
            io.odeeo.internal.q0.p.w("SingleSampleMediaPeriod", "Loading failed, treating as end-of-stream.", iOException);
            this.f62344m = true;
            cVarCreateRetryAction = io.odeeo.internal.p0.w.f65748f;
        } else {
            cVarCreateRetryAction = retryDelayMsFor != C.TIME_UNSET ? io.odeeo.internal.p0.w.createRetryAction(false, retryDelayMsFor) : io.odeeo.internal.p0.w.f65749g;
        }
        w.c cVar2 = cVarCreateRetryAction;
        boolean zIsRetry = cVar2.isRetry();
        this.f62337f.loadError(nVar, 1, -1, this.f62342k, 0, null, 0L, this.f62340i, iOException, !zIsRetry);
        if (!zIsRetry) {
            this.f62336e.onLoadTaskConcluded(cVar.f62350a);
        }
        return cVar2;
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c implements w.e {

        /* renamed from: a, reason: collision with root package name */
        public final long f62350a = n.getNewId();

        /* renamed from: b, reason: collision with root package name */
        public final io.odeeo.internal.p0.m f62351b;

        /* renamed from: c, reason: collision with root package name */
        public final io.odeeo.internal.p0.a0 f62352c;

        /* renamed from: d, reason: collision with root package name */
        public byte[] f62353d;

        public c(io.odeeo.internal.p0.m mVar, io.odeeo.internal.p0.i iVar) {
            this.f62351b = mVar;
            this.f62352c = new io.odeeo.internal.p0.a0(iVar);
        }

        @Override // io.odeeo.internal.p0.w.e
        public void load() throws IOException {
            this.f62352c.resetBytesRead();
            try {
                this.f62352c.open(this.f62351b);
                int i10 = 0;
                while (i10 != -1) {
                    int bytesRead = (int) this.f62352c.getBytesRead();
                    byte[] bArr = this.f62353d;
                    if (bArr == null) {
                        this.f62353d = new byte[1024];
                    } else if (bytesRead == bArr.length) {
                        this.f62353d = Arrays.copyOf(bArr, bArr.length * 2);
                    }
                    io.odeeo.internal.p0.a0 a0Var = this.f62352c;
                    byte[] bArr2 = this.f62353d;
                    i10 = a0Var.read(bArr2, bytesRead, bArr2.length - bytesRead);
                }
                io.odeeo.internal.p0.l.closeQuietly(this.f62352c);
            } catch (Throwable th2) {
                io.odeeo.internal.p0.l.closeQuietly(this.f62352c);
                throw th2;
            }
        }

        @Override // io.odeeo.internal.p0.w.e
        public void cancelLoad() {
        }
    }

    @Override // io.odeeo.internal.a0.r
    public void maybeThrowPrepareError() {
    }

    @Override // io.odeeo.internal.a0.r, io.odeeo.internal.a0.e0
    public void reevaluateBuffer(long j10) {
    }

    @Override // io.odeeo.internal.a0.r
    public void discardBuffer(long j10, boolean z10) {
    }

    @Override // io.odeeo.internal.a0.r
    public long getAdjustedSeekPositionUs(long j10, t0 t0Var) {
        return j10;
    }
}
