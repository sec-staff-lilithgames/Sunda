package io.bidmachine.media3.exoplayer.dash;

import android.net.Uri;
import android.os.SystemClock;
import android.util.Pair;
import co.d;
import co.e;
import co.f;
import co.o;
import co.p;
import co.s;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import fo.l;
import go.a0;
import go.j;
import hp.q;
import io.bidmachine.media3.common.util.a1;
import io.bidmachine.media3.common.util.x0;
import io.bidmachine.media3.exoplayer.w0;
import io.bidmachine.media3.exoplayer.y1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import ln.g0;
import ln.h;
import ln.i;
import ln.m;
import nh.b5;
import nh.m5;
import on.f0;
import p0.o2;
import pn.c;
import pn.r;
import pn.t;
import pn.x;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class a implements c {

    /* renamed from: a, reason: collision with root package name */
    public final a0 f61162a;

    /* renamed from: b, reason: collision with root package name */
    public final pn.a f61163b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f61164c;

    /* renamed from: d, reason: collision with root package name */
    public final int f61165d;

    /* renamed from: e, reason: collision with root package name */
    public final i f61166e;

    /* renamed from: f, reason: collision with root package name */
    public final long f61167f;

    /* renamed from: g, reason: collision with root package name */
    public final int f61168g;

    /* renamed from: h, reason: collision with root package name */
    public final x f61169h;

    /* renamed from: i, reason: collision with root package name */
    public final go.i f61170i;

    /* renamed from: j, reason: collision with root package name */
    public final t[] f61171j;

    /* renamed from: k, reason: collision with root package name */
    public l f61172k;

    /* renamed from: l, reason: collision with root package name */
    public qn.c f61173l;

    /* renamed from: m, reason: collision with root package name */
    public int f61174m;

    /* renamed from: n, reason: collision with root package name */
    public ao.b f61175n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f61176o;

    /* renamed from: p, reason: collision with root package name */
    public long f61177p = C.TIME_UNSET;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.bidmachine.media3.exoplayer.dash.a$a, reason: collision with other inner class name */
    public static final class C0584a implements pn.b {

        /* renamed from: a, reason: collision with root package name */
        public final h f61178a;

        /* renamed from: b, reason: collision with root package name */
        public final int f61179b;

        /* renamed from: c, reason: collision with root package name */
        public final f f61180c;

        public C0584a(h hVar) {
            this(hVar, 1);
        }

        @Override // pn.b
        public c createDashChunkSource(a0 a0Var, qn.c cVar, pn.a aVar, int i10, int[] iArr, l lVar, int i11, long j10, boolean z10, List<io.bidmachine.media3.common.b> list, x xVar, g0 g0Var, f0 f0Var, go.i iVar) {
            i iVarCreateDataSource = this.f61178a.createDataSource();
            if (g0Var != null) {
                iVarCreateDataSource.addTransferListener(g0Var);
            }
            return new a(this.f61180c, a0Var, cVar, aVar, i10, iArr, lVar, i11, iVarCreateDataSource, j10, this.f61179b, z10, list, xVar, f0Var, iVar);
        }

        @Override // pn.b
        public io.bidmachine.media3.common.b getOutputTextFormat(io.bidmachine.media3.common.b bVar) {
            return this.f61180c.getOutputTextFormat(bVar);
        }

        public C0584a(h hVar, int i10) {
            this(new d.b(), hVar, i10);
        }

        @Override // pn.b
        public C0584a experimentalParseSubtitlesDuringExtraction(boolean z10) {
            this.f61180c.experimentalParseSubtitlesDuringExtraction(z10);
            return this;
        }

        @Override // pn.b
        public C0584a experimentalSetCodecsToParseWithinGopSampleDependencies(int i10) {
            this.f61180c.experimentalSetCodecsToParseWithinGopSampleDependencies(i10);
            return this;
        }

        @Override // pn.b
        public C0584a setSubtitleParserFactory(q qVar) {
            this.f61180c.setSubtitleParserFactory(qVar);
            return this;
        }

        public C0584a(f fVar, h hVar, int i10) {
            this.f61180c = fVar;
            this.f61178a = hVar;
            this.f61179b = i10;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b extends co.b {

        /* renamed from: e, reason: collision with root package name */
        public final t f61181e;

        /* renamed from: f, reason: collision with root package name */
        public final long f61182f;

        public b(t tVar, long j10, long j11, long j12) {
            super(j10, j11);
            this.f61181e = tVar;
            this.f61182f = j12;
        }

        @Override // co.b, co.r
        public long getChunkEndTimeUs() {
            a();
            return this.f61181e.getSegmentEndTimeUs(this.f12394d);
        }

        @Override // co.b, co.r
        public long getChunkStartTimeUs() {
            a();
            return this.f61181e.getSegmentStartTimeUs(this.f12394d);
        }

        @Override // co.b, co.r
        public m getDataSpec() {
            a();
            long j10 = this.f12394d;
            t tVar = this.f61181e;
            return r.buildDataSpec(tVar.f81565b, tVar.f81566c.f83301a, tVar.getSegmentUrl(j10), tVar.isSegmentAvailableAtFullNetworkSpeed(j10, this.f61182f) ? 0 : 8, m5.of());
        }
    }

    public a(f fVar, a0 a0Var, qn.c cVar, pn.a aVar, int i10, int[] iArr, l lVar, int i11, i iVar, long j10, int i12, boolean z10, List<io.bidmachine.media3.common.b> list, x xVar, f0 f0Var, go.i iVar2) {
        this.f61162a = a0Var;
        this.f61173l = cVar;
        this.f61163b = aVar;
        this.f61164c = iArr;
        this.f61172k = lVar;
        int i13 = i11;
        this.f61165d = i13;
        this.f61166e = iVar;
        this.f61174m = i10;
        this.f61167f = j10;
        this.f61168g = i12;
        x xVar2 = xVar;
        this.f61169h = xVar2;
        this.f61170i = iVar2;
        long periodDurationUs = cVar.getPeriodDurationUs(i10);
        ArrayList arrayListB = b();
        this.f61171j = new t[lVar.length()];
        int i14 = 0;
        while (i14 < this.f61171j.length) {
            qn.l lVar2 = (qn.l) arrayListB.get(lVar.getIndexInTrackGroup(i14));
            qn.b bVarSelectBaseUrl = aVar.selectBaseUrl(lVar2.f83358b);
            t[] tVarArr = this.f61171j;
            qn.b bVar = bVarSelectBaseUrl == null ? (qn.b) lVar2.f83358b.get(0) : bVarSelectBaseUrl;
            co.h hVarCreateProgressiveMediaExtractor = fVar.createProgressiveMediaExtractor(i13, lVar2.f83357a, z10, list, xVar2, f0Var);
            long j11 = periodDurationUs;
            int i15 = i14;
            tVarArr[i15] = new t(j11, lVar2, bVar, hVarCreateProgressiveMediaExtractor, 0L, lVar2.getIndex());
            i14 = i15 + 1;
            i13 = i11;
            periodDurationUs = j11;
            xVar2 = xVar;
        }
    }

    public static Pair a(long j10, qn.i iVar, t tVar) {
        long j11 = j10 + 1;
        long segmentCount = tVar.getSegmentCount();
        qn.b bVar = tVar.f81566c;
        if (j11 >= segmentCount) {
            return null;
        }
        qn.i segmentUrl = tVar.getSegmentUrl(j11);
        Uri uriResolveUri = iVar.resolveUri(bVar.f83301a);
        Uri uriResolveUri2 = segmentUrl.resolveUri(bVar.f83301a);
        long j12 = segmentUrl.f83350b;
        long j13 = segmentUrl.f83349a;
        String relativePath = x0.getRelativePath(uriResolveUri, uriResolveUri2);
        String string = j13 + "-";
        if (j12 != -1) {
            StringBuilder sbU = o2.u(string);
            sbU.append(j13 + j12);
            string = sbU.toString();
        }
        return new Pair(relativePath, string);
    }

    public final ArrayList b() {
        List list = this.f61173l.getPeriod(this.f61174m).f83342c;
        ArrayList arrayList = new ArrayList();
        for (int i10 : this.f61164c) {
            arrayList.addAll(((qn.a) list.get(i10)).f83297c);
        }
        return arrayList;
    }

    public final t c(int i10) {
        t[] tVarArr = this.f61171j;
        t tVar = tVarArr[i10];
        qn.b bVarSelectBaseUrl = this.f61163b.selectBaseUrl(tVar.f81565b.f83358b);
        if (bVarSelectBaseUrl == null || bVarSelectBaseUrl.equals(tVar.f81566c)) {
            return tVar;
        }
        t tVar2 = new t(tVar.f81568e, tVar.f81565b, bVarSelectBaseUrl, tVar.f81564a, tVar.f81569f, tVar.f81567d);
        tVarArr[i10] = tVar2;
        return tVar2;
    }

    @Override // pn.c, co.l
    public long getAdjustedSeekPositionUs(long j10, y1 y1Var) {
        long j11 = j10;
        t[] tVarArr = this.f61171j;
        int length = tVarArr.length;
        int i10 = 0;
        while (i10 < length) {
            t tVar = tVarArr[i10];
            if (tVar.f81567d != null) {
                long segmentCount = tVar.getSegmentCount();
                if (segmentCount != 0) {
                    long segmentNum = tVar.getSegmentNum(j11);
                    long segmentStartTimeUs = tVar.getSegmentStartTimeUs(segmentNum);
                    return y1Var.resolveSeekPositionUs(j11, segmentStartTimeUs, (segmentStartTimeUs >= j11 || (segmentCount != -1 && segmentNum >= (tVar.getFirstSegmentNum() + segmentCount) - 1)) ? segmentStartTimeUs : tVar.getSegmentStartTimeUs(segmentNum + 1));
                }
            }
            i10++;
            j11 = j10;
        }
        return j10;
    }

    @Override // pn.c, co.l
    public void getNextChunk(w0 w0Var, long j10, List<? extends p> list, co.i iVar) {
        long j11;
        long jMsToUs;
        List<? extends p> list2;
        p pVar;
        t[] tVarArr;
        long j12;
        long j13;
        long jMax;
        long j14;
        long jConstrainValue;
        int i10;
        e mVar;
        long j15;
        if (this.f61175n != null) {
            return;
        }
        long j16 = w0Var.f61589a;
        long j17 = j10 - j16;
        long jMsToUs2 = a1.msToUs(this.f61173l.getPeriod(this.f61174m).f83341b) + a1.msToUs(this.f61173l.f83305a) + j10;
        x xVar = this.f61169h;
        if (xVar == null || !xVar.maybeRefreshManifestBeforeLoadingNextChunk(jMsToUs2)) {
            long jMsToUs3 = a1.msToUs(a1.getNowUnixTimeMs(this.f61167f));
            qn.c cVar = this.f61173l;
            long j18 = cVar.f83305a;
            if (j18 == C.TIME_UNSET) {
                j11 = j16;
                jMsToUs = -9223372036854775807L;
            } else {
                j11 = j16;
                jMsToUs = jMsToUs3 - a1.msToUs(j18 + cVar.getPeriod(this.f61174m).f83341b);
            }
            if (list.isEmpty()) {
                list2 = list;
                pVar = null;
            } else {
                list2 = list;
                pVar = (p) o2.g(1, list2);
            }
            int length = this.f61172k.length();
            co.r[] rVarArr = new co.r[length];
            int i11 = 0;
            while (true) {
                tVarArr = this.f61171j;
                if (i11 >= length) {
                    break;
                }
                t tVar = tVarArr[i11];
                pn.q qVar = tVar.f81567d;
                co.q qVar2 = co.r.f12471a;
                if (qVar == null) {
                    rVarArr[i11] = qVar2;
                } else {
                    long firstAvailableSegmentNum = tVar.getFirstAvailableSegmentNum(jMsToUs3);
                    long lastAvailableSegmentNum = tVar.getLastAvailableSegmentNum(jMsToUs3);
                    long nextChunkIndex = pVar != null ? pVar.getNextChunkIndex() : a1.constrainValue(tVar.getSegmentNum(j10), firstAvailableSegmentNum, lastAvailableSegmentNum);
                    if (nextChunkIndex < firstAvailableSegmentNum) {
                        rVarArr[i11] = qVar2;
                    } else {
                        j15 = jMsToUs;
                        rVarArr[i11] = new b(c(i11), nextChunkIndex, lastAvailableSegmentNum, jMsToUs);
                        i11++;
                        jMsToUs = j15;
                    }
                }
                j15 = jMsToUs;
                i11++;
                jMsToUs = j15;
            }
            long j19 = jMsToUs;
            if (!this.f61173l.f83308d || tVarArr[0].getSegmentCount() == 0) {
                j12 = jMsToUs3;
                j13 = 0;
                jMax = -9223372036854775807L;
            } else {
                long segmentEndTimeUs = tVarArr[0].getSegmentEndTimeUs(tVarArr[0].getLastAvailableSegmentNum(jMsToUs3));
                qn.c cVar2 = this.f61173l;
                j12 = jMsToUs3;
                long j20 = cVar2.f83305a;
                long jMin = Math.min(j20 == C.TIME_UNSET ? -9223372036854775807L : j12 - a1.msToUs(j20 + cVar2.getPeriod(this.f61174m).f83341b), segmentEndTimeUs) - j11;
                j13 = 0;
                jMax = Math.max(0L, jMin);
            }
            long j21 = j13;
            int i12 = 0;
            this.f61172k.updateSelectedTrack(j11, j17, jMax, list2, rVarArr);
            int selectedIndex = this.f61172k.getSelectedIndex();
            go.i iVar2 = this.f61170i;
            j isBufferEmpty = iVar2 == null ? null : new j(iVar2, DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D).setTrackSelection(this.f61172k).setBufferedDurationUs(Math.max(j21, j17)).setPlaybackRate(w0Var.f61590b).setIsLive(this.f61173l.f83308d).setDidRebuffer(w0Var.rebufferedSince(this.f61177p)).setIsBufferEmpty(list.isEmpty());
            this.f61177p = SystemClock.elapsedRealtime();
            t tVarC = c(selectedIndex);
            long j22 = tVarC.f81568e;
            qn.b bVar = tVarC.f81566c;
            co.h hVar = tVarC.f81564a;
            qn.l lVar = tVarC.f81565b;
            if (hVar != null) {
                qn.i initializationUri = hVar.getSampleFormats() == null ? lVar.getInitializationUri() : null;
                qn.i indexUri = tVarC.f81567d == null ? lVar.getIndexUri() : null;
                if (initializationUri != null || indexUri != null) {
                    io.bidmachine.media3.common.b selectedFormat = this.f61172k.getSelectedFormat();
                    int selectionReason = this.f61172k.getSelectionReason();
                    Object selectionData = this.f61172k.getSelectionData();
                    if (initializationUri != null) {
                        qn.i iVarAttemptMerge = initializationUri.attemptMerge(indexUri, bVar.f83301a);
                        if (iVarAttemptMerge != null) {
                            initializationUri = iVarAttemptMerge;
                        }
                    } else {
                        initializationUri = (qn.i) io.bidmachine.media3.common.util.a.checkNotNull(indexUri);
                    }
                    m mVarBuildDataSpec = r.buildDataSpec(lVar, bVar.f83301a, initializationUri, 0, m5.of());
                    if (isBufferEmpty == null) {
                        iVar.f12426a = new o(this.f61166e, mVarBuildDataSpec, selectedFormat, selectionReason, selectionData, tVarC.f81564a);
                        return;
                    } else {
                        isBufferEmpty.setObjectType("i").createCmcdData();
                        throw null;
                    }
                }
            }
            qn.c cVar3 = this.f61173l;
            boolean z10 = cVar3.f83308d && this.f61174m == cVar3.getPeriodCount() - 1;
            boolean z11 = (z10 && j22 == C.TIME_UNSET) ? false : true;
            if (tVarC.getSegmentCount() == j21) {
                iVar.f12427b = z11;
                return;
            }
            long j23 = j12;
            long firstAvailableSegmentNum2 = tVarC.getFirstAvailableSegmentNum(j23);
            long lastAvailableSegmentNum2 = tVarC.getLastAvailableSegmentNum(j23);
            if (z10) {
                long segmentEndTimeUs2 = tVarC.getSegmentEndTimeUs(lastAvailableSegmentNum2);
                z11 &= (segmentEndTimeUs2 - tVarC.getSegmentStartTimeUs(lastAvailableSegmentNum2)) + segmentEndTimeUs2 >= j22;
            }
            if (pVar != null) {
                jConstrainValue = pVar.getNextChunkIndex();
                j14 = lastAvailableSegmentNum2;
            } else {
                j14 = lastAvailableSegmentNum2;
                jConstrainValue = a1.constrainValue(tVarC.getSegmentNum(j10), firstAvailableSegmentNum2, j14);
            }
            long j24 = jConstrainValue;
            if (j24 < firstAvailableSegmentNum2) {
                this.f61175n = new ao.b();
                return;
            }
            if (j24 > j14 || (this.f61176o && j24 >= j14)) {
                iVar.f12427b = z11;
                return;
            }
            if (z11 && tVarC.getSegmentStartTimeUs(j24) >= j22) {
                iVar.f12427b = true;
                return;
            }
            int iMin = (int) Math.min(this.f61168g, (j14 - j24) + 1);
            int i13 = (j22 > C.TIME_UNSET ? 1 : (j22 == C.TIME_UNSET ? 0 : -1));
            if (i13 != 0) {
                while (iMin > 1 && tVarC.getSegmentStartTimeUs((iMin + j24) - 1) >= j22) {
                    iMin--;
                }
            }
            long j25 = list.isEmpty() ? j10 : -9223372036854775807L;
            io.bidmachine.media3.common.b selectedFormat2 = this.f61172k.getSelectedFormat();
            int selectionReason2 = this.f61172k.getSelectionReason();
            Object selectionData2 = this.f61172k.getSelectionData();
            long segmentStartTimeUs = tVarC.getSegmentStartTimeUs(j24);
            qn.i segmentUrl = tVarC.getSegmentUrl(j24);
            i iVar3 = this.f61166e;
            if (hVar == null) {
                long segmentEndTimeUs3 = tVarC.getSegmentEndTimeUs(j24);
                if (!tVarC.isSegmentAvailableAtFullNetworkSpeed(j24, j19)) {
                    i12 = 8;
                }
                m mVarBuildDataSpec2 = r.buildDataSpec(lVar, bVar.f83301a, segmentUrl, i12, m5.of());
                if (isBufferEmpty != null) {
                    isBufferEmpty.setChunkDurationUs(segmentEndTimeUs3 - segmentStartTimeUs);
                    Pair pairA = a(j24, segmentUrl, tVarC);
                    if (pairA != null) {
                        isBufferEmpty.setNextObjectRequest((String) pairA.first).setNextRangeRequest((String) pairA.second);
                    }
                    isBufferEmpty.createCmcdData();
                    throw null;
                }
                mVar = new s(iVar3, mVarBuildDataSpec2, selectedFormat2, selectionReason2, selectionData2, segmentStartTimeUs, segmentEndTimeUs3, j24, this.f61165d, selectedFormat2);
            } else {
                qn.i iVar4 = segmentUrl;
                int i14 = 1;
                int i15 = 1;
                while (true) {
                    if (i14 >= iMin) {
                        i10 = i13;
                        break;
                    }
                    int i16 = iMin;
                    i10 = i13;
                    qn.i iVarAttemptMerge2 = iVar4.attemptMerge(tVarC.getSegmentUrl(i14 + j24), bVar.f83301a);
                    if (iVarAttemptMerge2 == null) {
                        break;
                    }
                    i15++;
                    i14++;
                    i13 = i10;
                    iVar4 = iVarAttemptMerge2;
                    iMin = i16;
                }
                long j26 = (i15 + j24) - 1;
                long segmentEndTimeUs4 = tVarC.getSegmentEndTimeUs(j26);
                long j27 = (i10 == 0 || j22 > segmentEndTimeUs4) ? -9223372036854775807L : j22;
                m mVarBuildDataSpec3 = r.buildDataSpec(lVar, bVar.f83301a, iVar4, tVarC.isSegmentAvailableAtFullNetworkSpeed(j26, j19) ? 0 : 8, m5.of());
                if (isBufferEmpty != null) {
                    isBufferEmpty.setChunkDurationUs(segmentEndTimeUs4 - segmentStartTimeUs);
                    Pair pairA2 = a(j24, iVar4, tVarC);
                    if (pairA2 != null) {
                        isBufferEmpty.setNextObjectRequest((String) pairA2.first).setNextRangeRequest((String) pairA2.second);
                    }
                    isBufferEmpty.createCmcdData();
                    throw null;
                }
                long j28 = -lVar.f83359c;
                if (gn.x0.isImage(selectedFormat2.f60665o)) {
                    j28 += segmentStartTimeUs;
                }
                mVar = new co.m(iVar3, mVarBuildDataSpec3, selectedFormat2, selectionReason2, selectionData2, segmentStartTimeUs, segmentEndTimeUs4, j25, j27, j24, i15, j28, tVarC.f81564a);
            }
            iVar.f12426a = mVar;
        }
    }

    @Override // pn.c, co.l
    public int getPreferredQueueSize(long j10, List<? extends p> list) {
        return (this.f61175n != null || this.f61172k.length() < 2) ? list.size() : this.f61172k.evaluateQueueSize(j10, list);
    }

    @Override // pn.c, co.l
    public void maybeThrowError() throws IOException {
        ao.b bVar = this.f61175n;
        if (bVar != null) {
            throw bVar;
        }
        this.f61162a.maybeThrowError();
    }

    @Override // pn.c, co.l
    public void onChunkLoadCompleted(e eVar) {
        ko.q chunkIndex;
        if (eVar instanceof o) {
            int iIndexOf = this.f61172k.indexOf(((o) eVar).f12420d);
            t[] tVarArr = this.f61171j;
            t tVar = tVarArr[iIndexOf];
            if (tVar.f81567d == null && (chunkIndex = ((co.h) io.bidmachine.media3.common.util.a.checkStateNotNull(tVar.f81564a)).getChunkIndex()) != null) {
                tVarArr[iIndexOf] = new t(tVar.f81568e, tVar.f81565b, tVar.f81566c, tVar.f81564a, tVar.f81569f, new pn.s(chunkIndex, tVar.f81565b.f83359c));
            }
        }
        x xVar = this.f61169h;
        if (xVar != null) {
            xVar.onChunkLoadCompleted(eVar);
        }
    }

    @Override // pn.c, co.l
    public boolean onChunkLoadError(e eVar, boolean z10, go.s sVar, go.t tVar) {
        go.r fallbackSelectionFor;
        if (!z10) {
            return false;
        }
        x xVar = this.f61169h;
        if (xVar != null && xVar.onChunkLoadError(eVar)) {
            return true;
        }
        boolean z11 = this.f61173l.f83308d;
        t[] tVarArr = this.f61171j;
        if (!z11 && (eVar instanceof p)) {
            IOException iOException = sVar.f58366a;
            if ((iOException instanceof ln.x) && ((ln.x) iOException).f73534e == 404) {
                t tVar2 = tVarArr[this.f61172k.indexOf(eVar.f12420d)];
                long segmentCount = tVar2.getSegmentCount();
                if (segmentCount != -1 && segmentCount != 0) {
                    if (((p) eVar).getNextChunkIndex() > (tVar2.getFirstSegmentNum() + segmentCount) - 1) {
                        this.f61176o = true;
                        return true;
                    }
                }
            }
        }
        t tVar3 = tVarArr[this.f61172k.indexOf(eVar.f12420d)];
        qn.l lVar = tVar3.f81565b;
        qn.b bVar = tVar3.f81566c;
        b5 b5Var = lVar.f83358b;
        pn.a aVar = this.f61163b;
        qn.b bVarSelectBaseUrl = aVar.selectBaseUrl(b5Var);
        if (bVarSelectBaseUrl != null && !bVar.equals(bVarSelectBaseUrl)) {
            return true;
        }
        l lVar2 = this.f61172k;
        b5 b5Var2 = tVar3.f81565b.f83358b;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int length = lVar2.length();
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            if (lVar2.isTrackExcluded(i11, jElapsedRealtime)) {
                i10++;
            }
        }
        int priorityCount = pn.a.getPriorityCount(b5Var2);
        go.q qVar = new go.q(priorityCount, priorityCount - aVar.getPriorityCountAfterExclusion(b5Var2), length, i10);
        if ((qVar.isFallbackAvailable(2) || qVar.isFallbackAvailable(1)) && (fallbackSelectionFor = tVar.getFallbackSelectionFor(qVar, sVar)) != null) {
            long j10 = fallbackSelectionFor.f58365b;
            int i12 = fallbackSelectionFor.f58364a;
            if (qVar.isFallbackAvailable(i12)) {
                if (i12 == 2) {
                    l lVar3 = this.f61172k;
                    return lVar3.excludeTrack(lVar3.indexOf(eVar.f12420d), j10);
                }
                if (i12 == 1) {
                    aVar.exclude(bVar, j10);
                    return true;
                }
            }
        }
        return false;
    }

    @Override // pn.c, co.l
    public void release() {
        for (t tVar : this.f61171j) {
            co.h hVar = tVar.f81564a;
            if (hVar != null) {
                hVar.release();
            }
        }
    }

    @Override // pn.c, co.l
    public boolean shouldCancelLoad(long j10, e eVar, List<? extends p> list) {
        if (this.f61175n != null) {
            return false;
        }
        return this.f61172k.shouldCancelChunkLoad(j10, eVar, list);
    }

    @Override // pn.c
    public void updateManifest(qn.c cVar, int i10) {
        t[] tVarArr = this.f61171j;
        try {
            this.f61173l = cVar;
            this.f61174m = i10;
            long periodDurationUs = cVar.getPeriodDurationUs(i10);
            ArrayList arrayListB = b();
            for (int i11 = 0; i11 < tVarArr.length; i11++) {
                tVarArr[i11] = tVarArr[i11].a((qn.l) arrayListB.get(this.f61172k.getIndexInTrackGroup(i11)), periodDurationUs);
            }
        } catch (ao.b e10) {
            this.f61175n = e10;
        }
    }

    @Override // pn.c
    public void updateTrackSelection(l lVar) {
        this.f61172k = lVar;
    }
}
