package bf;

import com.google.android.exoplayer2.e3;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class i1 implements a0, qf.p0 {

    /* renamed from: b, reason: collision with root package name */
    public final qf.t f9276b;

    /* renamed from: c, reason: collision with root package name */
    public final qf.o f9277c;

    /* renamed from: e, reason: collision with root package name */
    public final qf.c1 f9278e;

    /* renamed from: f, reason: collision with root package name */
    public final qf.o0 f9279f;

    /* renamed from: g, reason: collision with root package name */
    public final i0 f9280g;

    /* renamed from: h, reason: collision with root package name */
    public final n1 f9281h;

    /* renamed from: j, reason: collision with root package name */
    public final long f9283j;

    /* renamed from: l, reason: collision with root package name */
    public final com.google.android.exoplayer2.z0 f9285l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f9286m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f9287n;

    /* renamed from: o, reason: collision with root package name */
    public byte[] f9288o;

    /* renamed from: p, reason: collision with root package name */
    public int f9289p;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f9282i = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    public final qf.r0 f9284k = new qf.r0("SingleSampleMediaPeriod");

    public i1(qf.t tVar, qf.o oVar, qf.c1 c1Var, com.google.android.exoplayer2.z0 z0Var, long j10, qf.o0 o0Var, i0 i0Var, boolean z10) {
        this.f9276b = tVar;
        this.f9277c = oVar;
        this.f9278e = c1Var;
        this.f9285l = z0Var;
        this.f9283j = j10;
        this.f9279f = o0Var;
        this.f9280g = i0Var;
        this.f9286m = z10;
        this.f9281h = new n1(new m1(z0Var));
    }

    @Override // bf.a0, bf.d1
    public boolean continueLoading(long j10) {
        if (this.f9287n) {
            return false;
        }
        qf.r0 r0Var = this.f9284k;
        if (r0Var.isLoading() || r0Var.hasFatalError()) {
            return false;
        }
        qf.p pVarCreateDataSource = this.f9277c.createDataSource();
        qf.c1 c1Var = this.f9278e;
        if (c1Var != null) {
            pVarCreateDataSource.addTransferListener(c1Var);
        }
        a aVar = new a(this.f9276b, pVarCreateDataSource);
        this.f9280g.loadStarted(new t(aVar.f9290a, this.f9276b, r0Var.startLoading(aVar, this, this.f9279f.getMinimumLoadableRetryCount(1))), 1, -1, this.f9285l, 0, null, 0L, this.f9283j);
        return true;
    }

    @Override // bf.a0, bf.d1
    public long getBufferedPositionUs() {
        return this.f9287n ? Long.MIN_VALUE : 0L;
    }

    @Override // bf.a0, bf.d1
    public long getNextLoadPositionUs() {
        return (this.f9287n || this.f9284k.isLoading()) ? Long.MIN_VALUE : 0L;
    }

    @Override // bf.a0
    public /* bridge */ /* synthetic */ List getStreamKeys(List list) {
        return super.getStreamKeys(list);
    }

    @Override // bf.a0
    public n1 getTrackGroups() {
        return this.f9281h;
    }

    @Override // bf.a0, bf.d1
    public boolean isLoading() {
        return this.f9284k.isLoading();
    }

    @Override // bf.a0
    public void prepare(z zVar, long j10) {
        zVar.onPrepared(this);
    }

    @Override // bf.a0
    public long readDiscontinuity() {
        return C.TIME_UNSET;
    }

    public void release() {
        this.f9284k.release();
    }

    @Override // bf.a0
    public long seekToUs(long j10) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f9282i;
            if (i10 >= arrayList.size()) {
                return j10;
            }
            ((h1) arrayList.get(i10)).reset();
            i10++;
        }
    }

    @Override // bf.a0
    public long selectTracks(pf.k[] kVarArr, boolean[] zArr, b1[] b1VarArr, boolean[] zArr2, long j10) {
        for (int i10 = 0; i10 < kVarArr.length; i10++) {
            b1 b1Var = b1VarArr[i10];
            ArrayList arrayList = this.f9282i;
            if (b1Var != null && (kVarArr[i10] == null || !zArr[i10])) {
                arrayList.remove(b1Var);
                b1VarArr[i10] = null;
            }
            if (b1VarArr[i10] == null && kVarArr[i10] != null) {
                h1 h1Var = new h1(this);
                arrayList.add(h1Var);
                b1VarArr[i10] = h1Var;
                zArr2[i10] = true;
            }
        }
        return j10;
    }

    @Override // qf.p0
    public void onLoadCanceled(a aVar, long j10, long j11, boolean z10) {
        qf.a1 a1Var = aVar.f9292c;
        t tVar = new t(aVar.f9290a, aVar.f9291b, a1Var.getLastOpenedUri(), a1Var.getLastResponseHeaders(), j10, j11, a1Var.getBytesRead());
        this.f9279f.onLoadTaskConcluded(aVar.f9290a);
        this.f9280g.loadCanceled(tVar, 1, -1, null, 0, null, 0L, this.f9283j);
    }

    @Override // qf.p0
    public void onLoadCompleted(a aVar, long j10, long j11) {
        this.f9289p = (int) aVar.f9292c.getBytesRead();
        this.f9288o = (byte[]) com.google.android.exoplayer2.util.a.checkNotNull(aVar.f9293d);
        this.f9287n = true;
        qf.a1 a1Var = aVar.f9292c;
        t tVar = new t(aVar.f9290a, aVar.f9291b, a1Var.getLastOpenedUri(), a1Var.getLastResponseHeaders(), j10, j11, this.f9289p);
        this.f9279f.onLoadTaskConcluded(aVar.f9290a);
        this.f9280g.loadCompleted(tVar, 1, -1, this.f9285l, 0, null, 0L, this.f9283j);
    }

    @Override // qf.p0
    public qf.q0 onLoadError(a aVar, long j10, long j11, IOException iOException, int i10) {
        qf.q0 q0VarCreateRetryAction;
        qf.a1 a1Var = aVar.f9292c;
        t tVar = new t(aVar.f9290a, aVar.f9291b, a1Var.getLastOpenedUri(), a1Var.getLastResponseHeaders(), j10, j11, a1Var.getBytesRead());
        qf.n0 n0Var = new qf.n0(tVar, new y(1, -1, this.f9285l, 0, null, 0L, com.google.android.exoplayer2.util.n1.usToMs(this.f9283j)), iOException, i10);
        qf.o0 o0Var = this.f9279f;
        long retryDelayMsFor = o0Var.getRetryDelayMsFor(n0Var);
        boolean z10 = retryDelayMsFor == C.TIME_UNSET || i10 >= o0Var.getMinimumLoadableRetryCount(1);
        if (this.f9286m && z10) {
            com.google.android.exoplayer2.util.f0.w("SingleSampleMediaPeriod", "Loading failed, treating as end-of-stream.", iOException);
            this.f9287n = true;
            q0VarCreateRetryAction = qf.r0.f82976d;
        } else {
            q0VarCreateRetryAction = retryDelayMsFor != C.TIME_UNSET ? qf.r0.createRetryAction(false, retryDelayMsFor) : qf.r0.f82977e;
        }
        qf.q0 q0Var = q0VarCreateRetryAction;
        boolean zIsRetry = q0Var.isRetry();
        this.f9280g.loadError(tVar, 1, -1, this.f9285l, 0, null, 0L, this.f9283j, iOException, !zIsRetry);
        if (!zIsRetry) {
            o0Var.onLoadTaskConcluded(aVar.f9290a);
        }
        return q0Var;
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a implements qf.s0 {

        /* renamed from: a, reason: collision with root package name */
        public final long f9290a = t.getNewId();

        /* renamed from: b, reason: collision with root package name */
        public final qf.t f9291b;

        /* renamed from: c, reason: collision with root package name */
        public final qf.a1 f9292c;

        /* renamed from: d, reason: collision with root package name */
        public byte[] f9293d;

        public a(qf.t tVar, qf.p pVar) {
            this.f9291b = tVar;
            this.f9292c = new qf.a1(pVar);
        }

        @Override // qf.s0
        public void load() throws IOException {
            qf.a1 a1Var = this.f9292c;
            a1Var.resetBytesRead();
            try {
                a1Var.open(this.f9291b);
                int i10 = 0;
                while (i10 != -1) {
                    int bytesRead = (int) a1Var.getBytesRead();
                    byte[] bArr = this.f9293d;
                    if (bArr == null) {
                        this.f9293d = new byte[1024];
                    } else if (bytesRead == bArr.length) {
                        this.f9293d = Arrays.copyOf(bArr, bArr.length * 2);
                    }
                    byte[] bArr2 = this.f9293d;
                    i10 = a1Var.read(bArr2, bytesRead, bArr2.length - bytesRead);
                }
                qf.s.closeQuietly(a1Var);
            } catch (Throwable th2) {
                qf.s.closeQuietly(a1Var);
                throw th2;
            }
        }

        @Override // qf.s0
        public void cancelLoad() {
        }
    }

    @Override // bf.a0
    public void maybeThrowPrepareError() {
    }

    @Override // bf.a0, bf.d1
    public void reevaluateBuffer(long j10) {
    }

    @Override // bf.a0
    public void discardBuffer(long j10, boolean z10) {
    }

    @Override // bf.a0
    public long getAdjustedSeekPositionUs(long j10, e3 e3Var) {
        return j10;
    }
}
