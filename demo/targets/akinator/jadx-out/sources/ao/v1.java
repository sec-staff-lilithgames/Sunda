package ao;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class v1 implements i0, go.u {

    /* renamed from: b, reason: collision with root package name */
    public final ln.m f7850b;

    /* renamed from: c, reason: collision with root package name */
    public final ln.h f7851c;

    /* renamed from: e, reason: collision with root package name */
    public final ln.g0 f7852e;

    /* renamed from: f, reason: collision with root package name */
    public final go.t f7853f;

    /* renamed from: g, reason: collision with root package name */
    public final r0 f7854g;

    /* renamed from: h, reason: collision with root package name */
    public final b2 f7855h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f7856i = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    public final long f7857j;

    /* renamed from: k, reason: collision with root package name */
    public final go.w f7858k;

    /* renamed from: l, reason: collision with root package name */
    public final io.bidmachine.media3.common.b f7859l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f7860m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f7861n;

    /* renamed from: o, reason: collision with root package name */
    public byte[] f7862o;

    /* renamed from: p, reason: collision with root package name */
    public int f7863p;

    public v1(ln.m mVar, ln.h hVar, ln.g0 g0Var, io.bidmachine.media3.common.b bVar, long j10, go.t tVar, r0 r0Var, boolean z10, ho.b bVar2) {
        this.f7850b = mVar;
        this.f7851c = hVar;
        this.f7852e = g0Var;
        this.f7859l = bVar;
        this.f7857j = j10;
        this.f7853f = tVar;
        this.f7854g = r0Var;
        this.f7860m = z10;
        this.f7855h = new b2(new gn.v1(bVar));
        this.f7858k = bVar2 != null ? new go.w(bVar2) : new go.w("SingleSampleMediaPeriod");
    }

    @Override // ao.i0, ao.q1
    public boolean continueLoading(io.bidmachine.media3.exoplayer.w0 w0Var) {
        if (this.f7861n) {
            return false;
        }
        go.w wVar = this.f7858k;
        if (wVar.isLoading() || wVar.hasFatalError()) {
            return false;
        }
        ln.i iVarCreateDataSource = this.f7851c.createDataSource();
        ln.g0 g0Var = this.f7852e;
        if (g0Var != null) {
            iVarCreateDataSource.addTransferListener(g0Var);
        }
        wVar.startLoading(new a(this.f7850b, iVarCreateDataSource), this, this.f7853f.getMinimumLoadableRetryCount(1));
        return true;
    }

    @Override // ao.i0, ao.q1
    public long getBufferedPositionUs() {
        return this.f7861n ? Long.MIN_VALUE : 0L;
    }

    @Override // ao.i0, ao.q1
    public long getNextLoadPositionUs() {
        return (this.f7861n || this.f7858k.isLoading()) ? Long.MIN_VALUE : 0L;
    }

    @Override // ao.i0
    public /* bridge */ /* synthetic */ List getStreamKeys(List list) {
        return super.getStreamKeys(list);
    }

    @Override // ao.i0
    public b2 getTrackGroups() {
        return this.f7855h;
    }

    @Override // ao.i0, ao.q1
    public boolean isLoading() {
        return this.f7858k.isLoading();
    }

    @Override // ao.i0
    public void prepare(h0 h0Var, long j10) {
        h0Var.onPrepared(this);
    }

    @Override // ao.i0
    public long readDiscontinuity() {
        return C.TIME_UNSET;
    }

    public void release() {
        this.f7858k.release();
    }

    @Override // ao.i0
    public long seekToUs(long j10) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f7856i;
            if (i10 >= arrayList.size()) {
                return j10;
            }
            ((u1) arrayList.get(i10)).reset();
            i10++;
        }
    }

    @Override // ao.i0
    public long selectTracks(fo.l[] lVarArr, boolean[] zArr, o1[] o1VarArr, boolean[] zArr2, long j10) {
        for (int i10 = 0; i10 < lVarArr.length; i10++) {
            o1 o1Var = o1VarArr[i10];
            ArrayList arrayList = this.f7856i;
            if (o1Var != null && (lVarArr[i10] == null || !zArr[i10])) {
                arrayList.remove(o1Var);
                o1VarArr[i10] = null;
            }
            if (o1VarArr[i10] == null && lVarArr[i10] != null) {
                u1 u1Var = new u1(this);
                arrayList.add(u1Var);
                o1VarArr[i10] = u1Var;
                zArr2[i10] = true;
            }
        }
        return j10;
    }

    @Override // go.u
    public void onLoadCanceled(a aVar, long j10, long j11, boolean z10) {
        ln.e0 e0Var = aVar.f7866c;
        b0 b0Var = new b0(aVar.f7864a, aVar.f7865b, e0Var.getLastOpenedUri(), e0Var.getLastResponseHeaders(), j10, j11, e0Var.getBytesRead());
        this.f7853f.onLoadTaskConcluded(aVar.f7864a);
        this.f7854g.loadCanceled(b0Var, 1, -1, null, 0, null, 0L, this.f7857j);
    }

    @Override // go.u
    public void onLoadCompleted(a aVar, long j10, long j11) {
        this.f7863p = (int) aVar.f7866c.getBytesRead();
        this.f7862o = (byte[]) io.bidmachine.media3.common.util.a.checkNotNull(aVar.f7867d);
        this.f7861n = true;
        ln.e0 e0Var = aVar.f7866c;
        b0 b0Var = new b0(aVar.f7864a, aVar.f7865b, e0Var.getLastOpenedUri(), e0Var.getLastResponseHeaders(), j10, j11, this.f7863p);
        this.f7853f.onLoadTaskConcluded(aVar.f7864a);
        this.f7854g.loadCompleted(b0Var, 1, -1, this.f7859l, 0, null, 0L, this.f7857j);
    }

    @Override // go.u
    public go.v onLoadError(a aVar, long j10, long j11, IOException iOException, int i10) {
        go.v vVarCreateRetryAction;
        ln.e0 e0Var = aVar.f7866c;
        b0 b0Var = new b0(aVar.f7864a, aVar.f7865b, e0Var.getLastOpenedUri(), e0Var.getLastResponseHeaders(), j10, j11, e0Var.getBytesRead());
        go.s sVar = new go.s(b0Var, new g0(1, -1, this.f7859l, 0, null, 0L, io.bidmachine.media3.common.util.a1.usToMs(this.f7857j)), iOException, i10);
        go.t tVar = this.f7853f;
        long retryDelayMsFor = tVar.getRetryDelayMsFor(sVar);
        boolean z10 = retryDelayMsFor == C.TIME_UNSET || i10 >= tVar.getMinimumLoadableRetryCount(1);
        if (this.f7860m && z10) {
            io.bidmachine.media3.common.util.b0.w("SingleSampleMediaPeriod", "Loading failed, treating as end-of-stream.", iOException);
            this.f7861n = true;
            vVarCreateRetryAction = go.w.f58371e;
        } else {
            vVarCreateRetryAction = retryDelayMsFor != C.TIME_UNSET ? go.w.createRetryAction(false, retryDelayMsFor) : go.w.f58372f;
        }
        go.v vVar = vVarCreateRetryAction;
        boolean zIsRetry = vVar.isRetry();
        this.f7854g.loadError(b0Var, 1, -1, this.f7859l, 0, null, 0L, this.f7857j, iOException, !zIsRetry);
        if (!zIsRetry) {
            tVar.onLoadTaskConcluded(aVar.f7864a);
        }
        return vVar;
    }

    @Override // go.u
    public void onLoadStarted(a aVar, long j10, long j11, int i10) {
        ln.e0 e0Var = aVar.f7866c;
        this.f7854g.loadStarted(i10 == 0 ? new b0(aVar.f7864a, aVar.f7865b, j10) : new b0(aVar.f7864a, aVar.f7865b, e0Var.getLastOpenedUri(), e0Var.getLastResponseHeaders(), j10, j11, e0Var.getBytesRead()), 1, -1, this.f7859l, 0, null, 0L, this.f7857j, i10);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a implements go.x {

        /* renamed from: a, reason: collision with root package name */
        public final long f7864a = b0.getNewId();

        /* renamed from: b, reason: collision with root package name */
        public final ln.m f7865b;

        /* renamed from: c, reason: collision with root package name */
        public final ln.e0 f7866c;

        /* renamed from: d, reason: collision with root package name */
        public byte[] f7867d;

        public a(ln.m mVar, ln.i iVar) {
            this.f7865b = mVar;
            this.f7866c = new ln.e0(iVar);
        }

        @Override // go.x
        public void load() throws IOException {
            ln.e0 e0Var = this.f7866c;
            e0Var.resetBytesRead();
            try {
                e0Var.open(this.f7865b);
                int i10 = 0;
                while (i10 != -1) {
                    int bytesRead = (int) e0Var.getBytesRead();
                    byte[] bArr = this.f7867d;
                    if (bArr == null) {
                        this.f7867d = new byte[1024];
                    } else if (bytesRead == bArr.length) {
                        this.f7867d = Arrays.copyOf(bArr, bArr.length * 2);
                    }
                    byte[] bArr2 = this.f7867d;
                    i10 = e0Var.read(bArr2, bytesRead, bArr2.length - bytesRead);
                }
                ln.l.closeQuietly(e0Var);
            } catch (Throwable th2) {
                ln.l.closeQuietly(e0Var);
                throw th2;
            }
        }

        @Override // go.x
        public void cancelLoad() {
        }
    }

    @Override // ao.i0
    public void maybeThrowPrepareError() {
    }

    @Override // ao.i0, ao.q1
    public void reevaluateBuffer(long j10) {
    }

    @Override // ao.i0
    public void discardBuffer(long j10, boolean z10) {
    }

    @Override // ao.i0
    public long getAdjustedSeekPositionUs(long j10, io.bidmachine.media3.exoplayer.y1 y1Var) {
        return j10;
    }
}
