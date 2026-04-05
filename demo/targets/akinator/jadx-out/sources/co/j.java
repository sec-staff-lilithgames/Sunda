package co;

import ao.b0;
import ao.g0;
import ao.n1;
import ao.o1;
import ao.p1;
import ao.q1;
import ao.r0;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import gn.x0;
import go.t;
import go.u;
import go.w;
import go.y;
import io.bidmachine.media3.common.util.a1;
import io.bidmachine.media3.exoplayer.w0;
import io.bidmachine.media3.exoplayer.y1;
import j1.o2;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import sn.v;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class j implements o1, q1, u, y {
    public boolean A;

    /* renamed from: b, reason: collision with root package name */
    public final int f12428b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f12429c;

    /* renamed from: e, reason: collision with root package name */
    public final io.bidmachine.media3.common.b[] f12430e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f12431f;

    /* renamed from: g, reason: collision with root package name */
    public final l f12432g;

    /* renamed from: h, reason: collision with root package name */
    public final p1 f12433h;

    /* renamed from: i, reason: collision with root package name */
    public final r0 f12434i;

    /* renamed from: j, reason: collision with root package name */
    public final t f12435j;

    /* renamed from: k, reason: collision with root package name */
    public final w f12436k;

    /* renamed from: l, reason: collision with root package name */
    public final i f12437l;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f12438m;

    /* renamed from: n, reason: collision with root package name */
    public final List f12439n;

    /* renamed from: o, reason: collision with root package name */
    public final n1 f12440o;

    /* renamed from: p, reason: collision with root package name */
    public final n1[] f12441p;

    /* renamed from: q, reason: collision with root package name */
    public final c f12442q;

    /* renamed from: r, reason: collision with root package name */
    public e f12443r;

    /* renamed from: s, reason: collision with root package name */
    public io.bidmachine.media3.common.b f12444s;

    /* renamed from: t, reason: collision with root package name */
    public k f12445t;

    /* renamed from: u, reason: collision with root package name */
    public long f12446u;

    /* renamed from: v, reason: collision with root package name */
    public long f12447v;

    /* renamed from: w, reason: collision with root package name */
    public int f12448w;

    /* renamed from: x, reason: collision with root package name */
    public co.a f12449x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f12450y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f12451z;

    public j(int i10, int[] iArr, io.bidmachine.media3.common.b[] bVarArr, l lVar, p1 p1Var, go.c cVar, long j10, v vVar, sn.q qVar, t tVar, r0 r0Var, boolean z10, ho.b bVar) {
        this.f12428b = i10;
        int i11 = 0;
        iArr = iArr == null ? new int[0] : iArr;
        this.f12429c = iArr;
        this.f12430e = bVarArr == null ? new io.bidmachine.media3.common.b[0] : bVarArr;
        this.f12432g = lVar;
        this.f12433h = p1Var;
        this.f12434i = r0Var;
        this.f12435j = tVar;
        this.f12450y = z10;
        this.f12436k = bVar != null ? new w(bVar) : new w("ChunkSampleStream");
        this.f12437l = new i();
        ArrayList arrayList = new ArrayList();
        this.f12438m = arrayList;
        this.f12439n = Collections.unmodifiableList(arrayList);
        int length = iArr.length;
        this.f12441p = new n1[length];
        this.f12431f = new boolean[length];
        int i12 = length + 1;
        int[] iArr2 = new int[i12];
        n1[] n1VarArr = new n1[i12];
        n1 n1VarCreateWithDrm = n1.createWithDrm(cVar, vVar, qVar);
        this.f12440o = n1VarCreateWithDrm;
        iArr2[0] = i10;
        n1VarArr[0] = n1VarCreateWithDrm;
        while (i11 < length) {
            n1 n1VarCreateWithoutDrm = n1.createWithoutDrm(cVar);
            this.f12441p[i11] = n1VarCreateWithoutDrm;
            int i13 = i11 + 1;
            n1VarArr[i13] = n1VarCreateWithoutDrm;
            iArr2[i13] = this.f12429c[i11];
            i11 = i13;
        }
        this.f12442q = new c(iArr2, n1VarArr);
        this.f12446u = j10;
        this.f12447v = j10;
    }

    public final co.a a(int i10) {
        ArrayList arrayList = this.f12438m;
        co.a aVar = (co.a) arrayList.get(i10);
        a1.removeRange(arrayList, i10, arrayList.size());
        this.f12448w = Math.max(this.f12448w, arrayList.size());
        int i11 = 0;
        this.f12440o.discardUpstreamSamples(aVar.getFirstSampleIndex(0));
        while (true) {
            n1[] n1VarArr = this.f12441p;
            if (i11 >= n1VarArr.length) {
                return aVar;
            }
            n1 n1Var = n1VarArr[i11];
            i11++;
            n1Var.discardUpstreamSamples(aVar.getFirstSampleIndex(i11));
        }
    }

    public final co.a b() {
        return (co.a) o2.e(1, this.f12438m);
    }

    public final boolean c(int i10) {
        int readIndex;
        co.a aVar = (co.a) this.f12438m.get(i10);
        if (this.f12440o.getReadIndex() > aVar.getFirstSampleIndex(0)) {
            return true;
        }
        int i11 = 0;
        do {
            n1[] n1VarArr = this.f12441p;
            if (i11 >= n1VarArr.length) {
                return false;
            }
            readIndex = n1VarArr[i11].getReadIndex();
            i11++;
        } while (readIndex <= aVar.getFirstSampleIndex(i11));
        return true;
    }

    public boolean consumeInitialDiscontinuity() {
        try {
            return this.f12451z;
        } finally {
            this.f12451z = false;
        }
    }

    @Override // ao.q1
    public boolean continueLoading(w0 w0Var) {
        long j10;
        List<? extends p> list;
        if (!this.A) {
            w wVar = this.f12436k;
            if (!wVar.isLoading() && !wVar.hasFatalError()) {
                boolean zD = d();
                if (zD) {
                    list = Collections.EMPTY_LIST;
                    j10 = this.f12446u;
                } else {
                    j10 = b().f12424h;
                    list = this.f12439n;
                }
                this.f12432g.getNextChunk(w0Var, j10, list, this.f12437l);
                i iVar = this.f12437l;
                boolean z10 = iVar.f12427b;
                e eVar = iVar.f12426a;
                iVar.clear();
                if (z10) {
                    this.f12446u = C.TIME_UNSET;
                    this.A = true;
                    return true;
                }
                if (eVar != null) {
                    this.f12443r = eVar;
                    boolean z11 = eVar instanceof co.a;
                    c cVar = this.f12442q;
                    if (z11) {
                        co.a aVar = (co.a) eVar;
                        if (zD) {
                            long j11 = aVar.f12423g;
                            long j12 = this.f12446u;
                            if (j11 < j12) {
                                this.f12440o.setStartTimeUs(j12);
                                for (n1 n1Var : this.f12441p) {
                                    n1Var.setStartTimeUs(this.f12446u);
                                }
                                if (this.f12450y) {
                                    io.bidmachine.media3.common.b bVar = aVar.f12420d;
                                    this.f12451z = !x0.allSamplesAreSyncSamples(bVar.f60665o, bVar.f60661k);
                                }
                            }
                            this.f12450y = false;
                            this.f12446u = C.TIME_UNSET;
                        }
                        aVar.init(cVar);
                        this.f12438m.add(aVar);
                    } else if (eVar instanceof o) {
                        ((o) eVar).init(cVar);
                    }
                    wVar.startLoading(eVar, this, this.f12435j.getMinimumLoadableRetryCount(eVar.f12419c));
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean d() {
        return this.f12446u != C.TIME_UNSET;
    }

    public void discardBuffer(long j10, boolean z10) throws Throwable {
        if (d()) {
            return;
        }
        n1 n1Var = this.f12440o;
        int firstIndex = n1Var.getFirstIndex();
        n1Var.discardTo(j10, z10, true);
        int firstIndex2 = n1Var.getFirstIndex();
        if (firstIndex2 > firstIndex) {
            long firstTimestampUs = n1Var.getFirstTimestampUs();
            int i10 = 0;
            while (true) {
                n1[] n1VarArr = this.f12441p;
                if (i10 >= n1VarArr.length) {
                    break;
                }
                n1VarArr[i10].discardTo(firstTimestampUs, z10, this.f12431f[i10]);
                i10++;
            }
        }
        int iMin = Math.min(f(firstIndex2, 0), this.f12448w);
        if (iMin > 0) {
            a1.removeRange(this.f12438m, 0, iMin);
            this.f12448w -= iMin;
        }
    }

    public void discardUpstreamSamplesForClippedDuration(long j10) {
        io.bidmachine.media3.common.util.a.checkState(!this.f12436k.isLoading());
        if (d() || j10 == C.TIME_UNSET || this.f12438m.isEmpty()) {
            return;
        }
        co.a aVarB = b();
        long j11 = aVarB.f12389l;
        if (j11 == C.TIME_UNSET) {
            j11 = aVarB.f12424h;
        }
        if (j11 <= j10) {
            return;
        }
        n1 n1Var = this.f12440o;
        long largestQueuedTimestampUs = n1Var.getLargestQueuedTimestampUs();
        if (largestQueuedTimestampUs <= j10) {
            return;
        }
        n1Var.discardUpstreamFrom(j10);
        for (n1 n1Var2 : this.f12441p) {
            n1Var2.discardUpstreamFrom(j10);
        }
        this.f12434i.upstreamDiscarded(this.f12428b, j10, largestQueuedTimestampUs);
    }

    public final void e() {
        int iF = f(this.f12440o.getReadIndex(), this.f12448w - 1);
        while (true) {
            int i10 = this.f12448w;
            if (i10 > iF) {
                return;
            }
            this.f12448w = i10 + 1;
            co.a aVar = (co.a) this.f12438m.get(i10);
            io.bidmachine.media3.common.b bVar = aVar.f12420d;
            if (!bVar.equals(this.f12444s)) {
                this.f12434i.downstreamFormatChanged(this.f12428b, bVar, aVar.f12421e, aVar.f12422f, aVar.f12423g);
            }
            this.f12444s = bVar;
        }
    }

    public final int f(int i10, int i11) {
        ArrayList arrayList;
        do {
            i11++;
            arrayList = this.f12438m;
            if (i11 >= arrayList.size()) {
                return arrayList.size() - 1;
            }
        } while (((co.a) arrayList.get(i11)).getFirstSampleIndex(0) <= i10);
        return i11 - 1;
    }

    public long getAdjustedSeekPositionUs(long j10, y1 y1Var) {
        return this.f12432g.getAdjustedSeekPositionUs(j10, y1Var);
    }

    @Override // ao.q1
    public long getBufferedPositionUs() {
        if (this.A) {
            return Long.MIN_VALUE;
        }
        if (d()) {
            return this.f12446u;
        }
        long jMax = this.f12447v;
        co.a aVarB = b();
        if (!aVarB.isLoadCompleted()) {
            ArrayList arrayList = this.f12438m;
            aVarB = arrayList.size() > 1 ? (co.a) o2.e(2, arrayList) : null;
        }
        if (aVarB != null) {
            jMax = Math.max(jMax, aVarB.f12424h);
        }
        return Math.max(jMax, this.f12440o.getLargestQueuedTimestampUs());
    }

    public l getChunkSource() {
        return this.f12432g;
    }

    @Override // ao.q1
    public long getNextLoadPositionUs() {
        if (d()) {
            return this.f12446u;
        }
        if (this.A) {
            return Long.MIN_VALUE;
        }
        return b().f12424h;
    }

    @Override // ao.q1
    public boolean isLoading() {
        return this.f12436k.isLoading();
    }

    @Override // ao.o1
    public boolean isReady() {
        return !d() && this.f12440o.isReady(this.A);
    }

    @Override // ao.o1
    public void maybeThrowError() throws IOException {
        w wVar = this.f12436k;
        wVar.maybeThrowError();
        this.f12440o.maybeThrowError();
        if (wVar.isLoading()) {
            return;
        }
        this.f12432g.maybeThrowError();
    }

    @Override // go.y
    public void onLoaderReleased() {
        this.f12440o.release();
        for (n1 n1Var : this.f12441p) {
            n1Var.release();
        }
        this.f12432g.release();
        k kVar = this.f12445t;
        if (kVar != null) {
            kVar.onSampleStreamReleased(this);
        }
    }

    @Override // ao.o1
    public int readData(io.bidmachine.media3.exoplayer.r0 r0Var, nn.g gVar, int i10) {
        if (d()) {
            return -3;
        }
        co.a aVar = this.f12449x;
        n1 n1Var = this.f12440o;
        if (aVar != null && aVar.getFirstSampleIndex(0) <= n1Var.getReadIndex()) {
            return -3;
        }
        e();
        return n1Var.read(r0Var, gVar, i10, this.A);
    }

    @Override // ao.q1
    public void reevaluateBuffer(long j10) {
        w wVar = this.f12436k;
        if (wVar.hasFatalError() || d()) {
            return;
        }
        boolean zIsLoading = wVar.isLoading();
        List<? extends p> list = this.f12439n;
        l lVar = this.f12432g;
        ArrayList arrayList = this.f12438m;
        if (zIsLoading) {
            e eVar = (e) io.bidmachine.media3.common.util.a.checkNotNull(this.f12443r);
            boolean z10 = eVar instanceof co.a;
            if (!(z10 && c(arrayList.size() - 1)) && lVar.shouldCancelLoad(j10, eVar, list)) {
                wVar.cancelLoading();
                if (z10) {
                    this.f12449x = (co.a) eVar;
                    return;
                }
                return;
            }
            return;
        }
        int preferredQueueSize = lVar.getPreferredQueueSize(j10, list);
        if (preferredQueueSize < arrayList.size()) {
            io.bidmachine.media3.common.util.a.checkState(!wVar.isLoading());
            int size = arrayList.size();
            while (true) {
                if (preferredQueueSize >= size) {
                    preferredQueueSize = -1;
                    break;
                } else if (!c(preferredQueueSize)) {
                    break;
                } else {
                    preferredQueueSize++;
                }
            }
            if (preferredQueueSize == -1) {
                return;
            }
            long j11 = b().f12424h;
            co.a aVarA = a(preferredQueueSize);
            if (arrayList.isEmpty()) {
                this.f12446u = this.f12447v;
            }
            this.A = false;
            this.f12434i.upstreamDiscarded(this.f12428b, aVarA.f12423g, j11);
        }
    }

    public void release() {
        release(null);
    }

    public void seekToUs(long j10) throws Throwable {
        ArrayList arrayList;
        co.a aVar;
        boolean zSeekTo;
        this.f12447v = j10;
        int i10 = 0;
        this.f12450y = false;
        if (d()) {
            this.f12446u = j10;
            return;
        }
        int i11 = 0;
        while (true) {
            arrayList = this.f12438m;
            if (i11 >= arrayList.size()) {
                break;
            }
            aVar = (co.a) arrayList.get(i11);
            long j11 = aVar.f12423g;
            if (j11 == j10 && aVar.f12388k == C.TIME_UNSET) {
                break;
            } else if (j11 > j10) {
                break;
            } else {
                i11++;
            }
        }
        aVar = null;
        n1 n1Var = this.f12440o;
        if (aVar != null) {
            zSeekTo = n1Var.seekTo(aVar.getFirstSampleIndex(0));
        } else {
            zSeekTo = n1Var.seekTo(j10, j10 < getNextLoadPositionUs());
        }
        n1[] n1VarArr = this.f12441p;
        if (zSeekTo) {
            this.f12448w = f(n1Var.getReadIndex(), 0);
            int length = n1VarArr.length;
            while (i10 < length) {
                n1VarArr[i10].seekTo(j10, true);
                i10++;
            }
            return;
        }
        this.f12446u = j10;
        this.A = false;
        arrayList.clear();
        this.f12448w = 0;
        w wVar = this.f12436k;
        if (wVar.isLoading()) {
            n1Var.discardToEnd();
            int length2 = n1VarArr.length;
            while (i10 < length2) {
                n1VarArr[i10].discardToEnd();
                i10++;
            }
            wVar.cancelLoading();
            return;
        }
        wVar.clearFatalError();
        n1Var.reset();
        int length3 = n1VarArr.length;
        while (i10 < length3) {
            n1VarArr[i10].reset();
            i10++;
        }
    }

    public co.j.a selectEmbeddedTrack(long j10, int i10) throws Throwable {
        int i11 = 0;
        while (true) {
            n1[] n1VarArr = this.f12441p;
            if (i11 >= n1VarArr.length) {
                throw new IllegalStateException();
            }
            if (this.f12429c[i11] == i10) {
                boolean[] zArr = this.f12431f;
                io.bidmachine.media3.common.util.a.checkState(!zArr[i11]);
                zArr[i11] = true;
                n1VarArr[i11].seekTo(j10, true);
                return new a(this, n1VarArr[i11], i11);
            }
            i11++;
        }
    }

    @Override // ao.o1
    public int skipData(long j10) throws Throwable {
        if (d()) {
            return 0;
        }
        boolean z10 = this.A;
        n1 n1Var = this.f12440o;
        int skipCount = n1Var.getSkipCount(j10, z10);
        co.a aVar = this.f12449x;
        if (aVar != null) {
            skipCount = Math.min(skipCount, aVar.getFirstSampleIndex(0) - n1Var.getReadIndex());
        }
        n1Var.skip(skipCount);
        e();
        return skipCount;
    }

    @Override // go.u
    public void onLoadCanceled(e eVar, long j10, long j11, boolean z10) {
        this.f12443r = null;
        this.f12449x = null;
        b0 b0Var = new b0(eVar.f12417a, eVar.f12418b, eVar.getUri(), eVar.getResponseHeaders(), j10, j11, eVar.bytesLoaded());
        this.f12435j.onLoadTaskConcluded(eVar.f12417a);
        this.f12434i.loadCanceled(b0Var, eVar.f12419c, this.f12428b, eVar.f12420d, eVar.f12421e, eVar.f12422f, eVar.f12423g, eVar.f12424h);
        if (z10) {
            return;
        }
        if (d()) {
            this.f12440o.reset();
            for (n1 n1Var : this.f12441p) {
                n1Var.reset();
            }
        } else if (eVar instanceof co.a) {
            ArrayList arrayList = this.f12438m;
            a(arrayList.size() - 1);
            if (arrayList.isEmpty()) {
                this.f12446u = this.f12447v;
            }
        }
        this.f12433h.onContinueLoadingRequested(this);
    }

    @Override // go.u
    public void onLoadCompleted(e eVar, long j10, long j11) {
        this.f12443r = null;
        this.f12432g.onChunkLoadCompleted(eVar);
        b0 b0Var = new b0(eVar.f12417a, eVar.f12418b, eVar.getUri(), eVar.getResponseHeaders(), j10, j11, eVar.bytesLoaded());
        this.f12435j.onLoadTaskConcluded(eVar.f12417a);
        this.f12434i.loadCompleted(b0Var, eVar.f12419c, this.f12428b, eVar.f12420d, eVar.f12421e, eVar.f12422f, eVar.f12423g, eVar.f12424h);
        this.f12433h.onContinueLoadingRequested(this);
    }

    @Override // go.u
    public go.v onLoadError(e eVar, long j10, long j11, IOException iOException, int i10) {
        go.v vVarCreateRetryAction;
        long jBytesLoaded = eVar.bytesLoaded();
        boolean z10 = eVar instanceof co.a;
        ArrayList arrayList = this.f12438m;
        int size = arrayList.size() - 1;
        boolean z11 = (jBytesLoaded != 0 && z10 && c(size)) ? false : true;
        b0 b0Var = new b0(eVar.f12417a, eVar.f12418b, eVar.getUri(), eVar.getResponseHeaders(), j10, j11, jBytesLoaded);
        go.s sVar = new go.s(b0Var, new g0(eVar.f12419c, this.f12428b, eVar.f12420d, eVar.f12421e, eVar.f12422f, a1.usToMs(eVar.f12423g), a1.usToMs(eVar.f12424h)), iOException, i10);
        l lVar = this.f12432g;
        t tVar = this.f12435j;
        if (!lVar.onChunkLoadError(eVar, z11, sVar, tVar)) {
            vVarCreateRetryAction = null;
        } else if (z11) {
            vVarCreateRetryAction = w.f58371e;
            if (z10) {
                io.bidmachine.media3.common.util.a.checkState(a(size) == eVar);
                if (arrayList.isEmpty()) {
                    this.f12446u = this.f12447v;
                }
            }
        } else {
            io.bidmachine.media3.common.util.b0.w("ChunkSampleStream", "Ignoring attempt to cancel non-cancelable load.");
            vVarCreateRetryAction = null;
        }
        if (vVarCreateRetryAction == null) {
            long retryDelayMsFor = tVar.getRetryDelayMsFor(sVar);
            vVarCreateRetryAction = retryDelayMsFor != C.TIME_UNSET ? w.createRetryAction(false, retryDelayMsFor) : w.f58372f;
        }
        boolean zIsRetry = vVarCreateRetryAction.isRetry();
        this.f12434i.loadError(b0Var, eVar.f12419c, this.f12428b, eVar.f12420d, eVar.f12421e, eVar.f12422f, eVar.f12423g, eVar.f12424h, iOException, !zIsRetry);
        if (!zIsRetry) {
            this.f12443r = null;
            tVar.onLoadTaskConcluded(eVar.f12417a);
            this.f12433h.onContinueLoadingRequested(this);
        }
        return vVarCreateRetryAction;
    }

    @Override // go.u
    public void onLoadStarted(e eVar, long j10, long j11, int i10) {
        this.f12434i.loadStarted(i10 == 0 ? new b0(eVar.f12417a, eVar.f12418b, j10) : new b0(eVar.f12417a, eVar.f12418b, eVar.getUri(), eVar.getResponseHeaders(), j10, j11, eVar.bytesLoaded()), eVar.f12419c, this.f12428b, eVar.f12420d, eVar.f12421e, eVar.f12422f, eVar.f12423g, eVar.f12424h, i10);
    }

    public void release(k kVar) {
        this.f12445t = kVar;
        this.f12440o.preRelease();
        for (n1 n1Var : this.f12441p) {
            n1Var.preRelease();
        }
        this.f12436k.release(this);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class a implements o1 {

        /* renamed from: b, reason: collision with root package name */
        public final j f12452b;

        /* renamed from: c, reason: collision with root package name */
        public final n1 f12453c;

        /* renamed from: e, reason: collision with root package name */
        public final int f12454e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f12455f;

        public a(j jVar, n1 n1Var, int i10) {
            this.f12452b = jVar;
            this.f12453c = n1Var;
            this.f12454e = i10;
        }

        public final void a() {
            if (this.f12455f) {
                return;
            }
            j jVar = j.this;
            r0 r0Var = jVar.f12434i;
            int[] iArr = jVar.f12429c;
            int i10 = this.f12454e;
            r0Var.downstreamFormatChanged(iArr[i10], jVar.f12430e[i10], 0, null, jVar.f12447v);
            this.f12455f = true;
        }

        @Override // ao.o1
        public boolean isReady() {
            j jVar = j.this;
            return !jVar.d() && this.f12453c.isReady(jVar.A);
        }

        @Override // ao.o1
        public int readData(io.bidmachine.media3.exoplayer.r0 r0Var, nn.g gVar, int i10) {
            j jVar = j.this;
            if (jVar.d()) {
                return -3;
            }
            co.a aVar = jVar.f12449x;
            n1 n1Var = this.f12453c;
            if (aVar != null && aVar.getFirstSampleIndex(this.f12454e + 1) <= n1Var.getReadIndex()) {
                return -3;
            }
            a();
            return n1Var.read(r0Var, gVar, i10, jVar.A);
        }

        public void release() {
            j jVar = j.this;
            boolean[] zArr = jVar.f12431f;
            int i10 = this.f12454e;
            io.bidmachine.media3.common.util.a.checkState(zArr[i10]);
            jVar.f12431f[i10] = false;
        }

        @Override // ao.o1
        public int skipData(long j10) throws Throwable {
            j jVar = j.this;
            if (jVar.d()) {
                return 0;
            }
            boolean z10 = jVar.A;
            n1 n1Var = this.f12453c;
            int skipCount = n1Var.getSkipCount(j10, z10);
            co.a aVar = jVar.f12449x;
            if (aVar != null) {
                skipCount = Math.min(skipCount, aVar.getFirstSampleIndex(this.f12454e + 1) - n1Var.getReadIndex());
            }
            n1Var.skip(skipCount);
            if (skipCount > 0) {
                a();
            }
            return skipCount;
        }

        @Override // ao.o1
        public void maybeThrowError() {
        }
    }
}
