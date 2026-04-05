package tn;

import android.net.Uri;
import android.os.SystemClock;
import android.util.Pair;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import gn.v1;
import io.bidmachine.media3.common.util.a1;
import io.bidmachine.media3.common.util.x0;
import io.bidmachine.media3.exoplayer.w0;
import io.bidmachine.media3.exoplayer.y1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import ln.g0;
import ln.m;
import nh.b5;
import nh.i7;
import on.f0;
import p0.o2;
import vn.f;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public final i f87184a;

    /* renamed from: b, reason: collision with root package name */
    public final ln.i f87185b;

    /* renamed from: c, reason: collision with root package name */
    public final ln.i f87186c;

    /* renamed from: d, reason: collision with root package name */
    public final v f87187d;

    /* renamed from: e, reason: collision with root package name */
    public final Uri[] f87188e;

    /* renamed from: f, reason: collision with root package name */
    public final io.bidmachine.media3.common.b[] f87189f;

    /* renamed from: g, reason: collision with root package name */
    public final vn.q f87190g;

    /* renamed from: h, reason: collision with root package name */
    public final v1 f87191h;

    /* renamed from: i, reason: collision with root package name */
    public final List f87192i;

    /* renamed from: k, reason: collision with root package name */
    public final f0 f87194k;

    /* renamed from: l, reason: collision with root package name */
    public final go.i f87195l;

    /* renamed from: m, reason: collision with root package name */
    public final long f87196m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f87197n;

    /* renamed from: p, reason: collision with root package name */
    public ao.b f87199p;

    /* renamed from: q, reason: collision with root package name */
    public Uri f87200q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f87201r;

    /* renamed from: s, reason: collision with root package name */
    public fo.l f87202s;

    /* renamed from: u, reason: collision with root package name */
    public boolean f87204u;

    /* renamed from: v, reason: collision with root package name */
    public long f87205v = C.TIME_UNSET;

    /* renamed from: j, reason: collision with root package name */
    public final f f87193j = new f(4);

    /* renamed from: o, reason: collision with root package name */
    public byte[] f87198o = a1.f60681c;

    /* renamed from: t, reason: collision with root package name */
    public long f87203t = C.TIME_UNSET;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends co.n {

        /* renamed from: l, reason: collision with root package name */
        public byte[] f87206l;

        public a(ln.i iVar, ln.m mVar, io.bidmachine.media3.common.b bVar, int i10, Object obj, byte[] bArr) {
            super(iVar, mVar, 3, bVar, i10, obj, bArr);
        }

        @Override // co.n
        public final void a(byte[] bArr, int i10) {
            this.f87206l = Arrays.copyOf(bArr, i10);
        }

        public byte[] getResult() {
            return this.f87206l;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public co.e f87207a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f87208b;

        /* renamed from: c, reason: collision with root package name */
        public Uri f87209c;

        public b() {
            clear();
        }

        public void clear() {
            this.f87207a = null;
            this.f87208b = false;
            this.f87209c = null;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c extends co.b {

        /* renamed from: e, reason: collision with root package name */
        public final List f87210e;

        /* renamed from: f, reason: collision with root package name */
        public final long f87211f;

        /* renamed from: g, reason: collision with root package name */
        public final String f87212g;

        public c(String str, long j10, List<vn.g> list) {
            super(0L, list.size() - 1);
            this.f87212g = str;
            this.f87211f = j10;
            this.f87210e = list;
        }

        @Override // co.b, co.r
        public long getChunkEndTimeUs() {
            a();
            vn.g gVar = (vn.g) this.f87210e.get((int) this.f12394d);
            return this.f87211f + gVar.f89421g + gVar.f89419e;
        }

        @Override // co.b, co.r
        public long getChunkStartTimeUs() {
            a();
            return this.f87211f + ((vn.g) this.f87210e.get((int) this.f12394d)).f89421g;
        }

        @Override // co.b, co.r
        public ln.m getDataSpec() {
            a();
            vn.g gVar = (vn.g) this.f87210e.get((int) this.f12394d);
            return new ln.m(x0.resolveToUri(this.f87212g, gVar.f89417b), gVar.f89425k, gVar.f89426l);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class d extends fo.b {

        /* renamed from: h, reason: collision with root package name */
        public int f87213h;

        public d(v1 v1Var, int[] iArr) {
            super(v1Var, iArr);
            this.f87213h = indexOf(v1Var.getFormat(iArr[0]));
        }

        @Override // fo.b, fo.l
        public /* bridge */ /* synthetic */ long getLatestBitrateEstimate() {
            return super.getLatestBitrateEstimate();
        }

        @Override // fo.b, fo.l
        public int getSelectedIndex() {
            return this.f87213h;
        }

        @Override // fo.b, fo.l
        public Object getSelectionData() {
            return null;
        }

        @Override // fo.b, fo.l
        public int getSelectionReason() {
            return 0;
        }

        @Override // fo.b, fo.l
        public /* bridge */ /* synthetic */ void onDiscontinuity() {
            super.onDiscontinuity();
        }

        @Override // fo.b, fo.l
        public /* bridge */ /* synthetic */ void onRebuffer() {
            super.onRebuffer();
        }

        @Override // fo.b, fo.l
        public /* bridge */ /* synthetic */ boolean shouldCancelChunkLoad(long j10, co.e eVar, List list) {
            return super.shouldCancelChunkLoad(j10, eVar, list);
        }

        @Override // fo.b, fo.l
        public void updateSelectedTrack(long j10, long j11, long j12, List<? extends co.p> list, co.r[] rVarArr) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (isTrackExcluded(this.f87213h, jElapsedRealtime)) {
                for (int i10 = this.f55811b - 1; i10 >= 0; i10--) {
                    if (!isTrackExcluded(i10, jElapsedRealtime)) {
                        this.f87213h = i10;
                        return;
                    }
                }
                throw new IllegalStateException();
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        public final vn.g f87214a;

        /* renamed from: b, reason: collision with root package name */
        public final long f87215b;

        /* renamed from: c, reason: collision with root package name */
        public final int f87216c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f87217d;

        public e(vn.g gVar, long j10, int i10) {
            this.f87214a = gVar;
            this.f87215b = j10;
            this.f87216c = i10;
            this.f87217d = (gVar instanceof f.c) && ((f.c) gVar).f89406o;
        }
    }

    public g(i iVar, vn.q qVar, Uri[] uriArr, io.bidmachine.media3.common.b[] bVarArr, h hVar, g0 g0Var, v vVar, long j10, List<io.bidmachine.media3.common.b> list, f0 f0Var, go.i iVar2) {
        this.f87184a = iVar;
        this.f87190g = qVar;
        this.f87188e = uriArr;
        this.f87189f = bVarArr;
        this.f87187d = vVar;
        this.f87196m = j10;
        this.f87192i = list;
        this.f87194k = f0Var;
        this.f87195l = iVar2;
        ln.i iVarCreateDataSource = hVar.createDataSource(1);
        this.f87185b = iVarCreateDataSource;
        if (g0Var != null) {
            iVarCreateDataSource.addTransferListener(g0Var);
        }
        this.f87186c = hVar.createDataSource(3);
        this.f87191h = new v1(bVarArr);
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < uriArr.length; i10++) {
            if ((bVarArr[i10].f60656f & 16384) == 0) {
                arrayList.add(Integer.valueOf(i10));
            }
        }
        this.f87202s = new d(this.f87191h, rh.w.toArray(arrayList));
    }

    public static e b(vn.f fVar, long j10, int i10) {
        long j11 = fVar.f89374k;
        b5 b5Var = fVar.f89382s;
        int i11 = (int) (j10 - j11);
        b5 b5Var2 = fVar.f89381r;
        if (i11 == b5Var2.size()) {
            if (i10 == -1) {
                i10 = 0;
            }
            if (i10 < b5Var.size()) {
                return new e((vn.g) b5Var.get(i10), j10, i10);
            }
            return null;
        }
        f.e eVar = (f.e) b5Var2.get(i11);
        if (i10 == -1) {
            return new e(eVar, j10, -1);
        }
        if (i10 < eVar.f89411o.size()) {
            return new e((vn.g) eVar.f89411o.get(i10), j10, i10);
        }
        int i12 = i11 + 1;
        if (i12 < b5Var2.size()) {
            return new e((vn.g) b5Var2.get(i12), j10 + 1, -1);
        }
        if (b5Var.isEmpty()) {
            return null;
        }
        return new e((vn.g) b5Var.get(0), j10 + 1, 0);
    }

    public final Pair a(j jVar, boolean z10, vn.f fVar, long j10, long j11) {
        if (jVar != null) {
            long nextChunkIndex = jVar.f12470j;
            int i10 = jVar.f87222o;
            if (!z10) {
                if (!jVar.isLoadCompleted()) {
                    return new Pair(Long.valueOf(nextChunkIndex), Integer.valueOf(i10));
                }
                if (i10 == -1) {
                    nextChunkIndex = jVar.getNextChunkIndex();
                }
                return new Pair(Long.valueOf(nextChunkIndex), Integer.valueOf(i10 != -1 ? i10 + 1 : -1));
            }
        }
        long j12 = fVar.f89384u;
        b5 b5Var = fVar.f89382s;
        long j13 = fVar.f89374k;
        b5 b5Var2 = fVar.f89381r;
        long j14 = j12 + j10;
        if (jVar != null && !this.f87201r) {
            j11 = jVar.f12423g;
        }
        if (!fVar.f89378o && j11 >= j14) {
            return new Pair(Long.valueOf(j13 + b5Var2.size()), -1);
        }
        long j15 = j11 - j10;
        int i11 = 0;
        int iBinarySearchFloor = a1.binarySearchFloor((List<? extends Comparable<? super Long>>) b5Var2, Long.valueOf(j15), true, !this.f87190g.isLive() || jVar == null);
        long j16 = iBinarySearchFloor + j13;
        if (iBinarySearchFloor >= 0) {
            f.e eVar = (f.e) b5Var2.get(iBinarySearchFloor);
            b5 b5Var3 = j15 < eVar.f89421g + eVar.f89419e ? eVar.f89411o : b5Var;
            while (true) {
                if (i11 >= b5Var3.size()) {
                    break;
                }
                f.c cVar = (f.c) b5Var3.get(i11);
                if (j15 >= cVar.f89421g + cVar.f89419e) {
                    i11++;
                } else if (cVar.f89405n) {
                    j16 += b5Var3 == b5Var ? 1L : 0L;
                    i = i11;
                }
            }
        }
        return new Pair(Long.valueOf(j16), Integer.valueOf(i));
    }

    public final a c(Uri uri, int i10, boolean z10, go.j jVar) {
        if (uri == null) {
            return null;
        }
        f fVar = this.f87193j;
        byte[] bArrRemove = fVar.remove(uri);
        if (bArrRemove != null) {
            fVar.put(uri, bArrRemove);
            return null;
        }
        ln.m mVarBuild = new m.a().setUri(uri).setFlags(1).build();
        if (jVar != null) {
            if (z10) {
                jVar.setObjectType("i");
            }
            jVar.createCmcdData();
            throw null;
        }
        return new a(this.f87186c, mVarBuild, this.f87189f[i10], this.f87202s.getSelectionReason(), this.f87202s.getSelectionData(), this.f87198o);
    }

    public co.r[] createMediaChunkIterators(j jVar, long j10) {
        List listOf;
        g gVar = this;
        j jVar2 = jVar;
        int iIndexOf = jVar2 == null ? -1 : gVar.f87191h.indexOf(jVar2.f12420d);
        int length = gVar.f87202s.length();
        co.r[] rVarArr = new co.r[length];
        boolean z10 = false;
        int i10 = 0;
        while (i10 < length) {
            int indexInTrackGroup = gVar.f87202s.getIndexInTrackGroup(i10);
            Uri uri = gVar.f87188e[indexInTrackGroup];
            vn.q qVar = gVar.f87190g;
            if (qVar.isSnapshotValid(uri)) {
                vn.f playlistSnapshot = qVar.getPlaylistSnapshot(uri, z10);
                io.bidmachine.media3.common.util.a.checkNotNull(playlistSnapshot);
                long initialStartTimeUs = playlistSnapshot.f89371h - qVar.getInitialStartTimeUs();
                Pair pairA = gVar.a(jVar2, indexInTrackGroup != iIndexOf ? true : z10, playlistSnapshot, initialStartTimeUs, j10);
                long jLongValue = ((Long) pairA.first).longValue();
                int iIntValue = ((Integer) pairA.second).intValue();
                String str = playlistSnapshot.f89448a;
                long j11 = playlistSnapshot.f89374k;
                b5 b5Var = playlistSnapshot.f89382s;
                b5 b5Var2 = playlistSnapshot.f89381r;
                int i11 = (int) (jLongValue - j11);
                if (i11 < 0 || b5Var2.size() < i11) {
                    listOf = b5.of();
                } else {
                    ArrayList arrayList = new ArrayList();
                    if (i11 < b5Var2.size()) {
                        if (iIntValue != -1) {
                            f.e eVar = (f.e) b5Var2.get(i11);
                            if (iIntValue == 0) {
                                arrayList.add(eVar);
                            } else if (iIntValue < eVar.f89411o.size()) {
                                b5 b5Var3 = eVar.f89411o;
                                arrayList.addAll(b5Var3.subList(iIntValue, b5Var3.size()));
                            }
                            i11++;
                        }
                        arrayList.addAll(b5Var2.subList(i11, b5Var2.size()));
                        iIntValue = 0;
                    }
                    if (playlistSnapshot.f89377n != C.TIME_UNSET) {
                        if (iIntValue == -1) {
                            iIntValue = 0;
                        }
                        if (iIntValue < b5Var.size()) {
                            arrayList.addAll(b5Var.subList(iIntValue, b5Var.size()));
                        }
                    }
                    listOf = Collections.unmodifiableList(arrayList);
                }
                rVarArr[i10] = new c(str, initialStartTimeUs, listOf);
            } else {
                rVarArr[i10] = co.r.f12471a;
            }
            i10++;
            gVar = this;
            jVar2 = jVar;
            z10 = false;
        }
        return rVarArr;
    }

    public long getAdjustedSeekPositionUs(long j10, y1 y1Var) {
        int selectedIndex = this.f87202s.getSelectedIndex();
        Uri[] uriArr = this.f87188e;
        int length = uriArr.length;
        vn.q qVar = this.f87190g;
        vn.f playlistSnapshot = (selectedIndex >= length || selectedIndex == -1) ? null : qVar.getPlaylistSnapshot(uriArr[this.f87202s.getSelectedIndexInTrackGroup()], true);
        if (playlistSnapshot != null) {
            b5 b5Var = playlistSnapshot.f89381r;
            if (!b5Var.isEmpty()) {
                long initialStartTimeUs = playlistSnapshot.f89371h - qVar.getInitialStartTimeUs();
                long j11 = j10 - initialStartTimeUs;
                int iBinarySearchFloor = a1.binarySearchFloor((List<? extends Comparable<? super Long>>) b5Var, Long.valueOf(j11), true, true);
                long j12 = ((f.e) b5Var.get(iBinarySearchFloor)).f89421g;
                return y1Var.resolveSeekPositionUs(j11, j12, (!playlistSnapshot.f89450c || iBinarySearchFloor == b5Var.size() - 1) ? j12 : ((f.e) b5Var.get(iBinarySearchFloor + 1)).f89421g) + initialStartTimeUs;
            }
        }
        return j10;
    }

    public int getChunkPublicationState(j jVar) {
        int i10 = jVar.f87222o;
        if (i10 == -1) {
            return 1;
        }
        vn.f fVar = (vn.f) io.bidmachine.media3.common.util.a.checkNotNull(this.f87190g.getPlaylistSnapshot(this.f87188e[this.f87191h.indexOf(jVar.f12420d)], false));
        long j10 = jVar.f12470j;
        long j11 = fVar.f89374k;
        b5 b5Var = fVar.f89381r;
        int i11 = (int) (j10 - j11);
        if (i11 < 0) {
            return 1;
        }
        b5 b5Var2 = i11 < b5Var.size() ? ((f.e) b5Var.get(i11)).f89411o : fVar.f89382s;
        if (i10 >= b5Var2.size()) {
            return 2;
        }
        f.c cVar = (f.c) b5Var2.get(i10);
        if (cVar.f89406o) {
            return 0;
        }
        return Objects.equals(Uri.parse(x0.resolve(fVar.f89448a, cVar.f89417b)), jVar.f12418b.f73467a) ? 1 : 2;
    }

    public void getNextChunk(w0 w0Var, long j10, List<j> list, boolean z10, b bVar) {
        g gVar;
        long j11;
        Uri uri;
        vn.f fVar;
        int iIntValue;
        long jLongValue;
        go.j jVar;
        String str;
        j jVar2 = list.isEmpty() ? null : (j) i7.getLast(list);
        int iIndexOf = jVar2 == null ? -1 : this.f87191h.indexOf(jVar2.f12420d);
        long j12 = w0Var.f61589a;
        long jMax = j10 - j12;
        long j13 = this.f87203t;
        long endTimeUs = C.TIME_UNSET;
        long jMax2 = j13 != C.TIME_UNSET ? j13 - j12 : -9223372036854775807L;
        if (jVar2 != null && !this.f87201r) {
            long durationUs = jVar2.getDurationUs();
            jMax = Math.max(0L, jMax - durationUs);
            if (jMax2 != C.TIME_UNSET) {
                jMax2 = Math.max(0L, jMax2 - durationUs);
            }
        }
        long j14 = jMax;
        this.f87202s.updateSelectedTrack(j12, j14, jMax2, list, createMediaChunkIterators(jVar2, j10));
        int selectedIndexInTrackGroup = this.f87202s.getSelectedIndexInTrackGroup();
        boolean z11 = iIndexOf != selectedIndexInTrackGroup;
        Uri[] uriArr = this.f87188e;
        Uri uri2 = uriArr[selectedIndexInTrackGroup];
        vn.q qVar = this.f87190g;
        if (!qVar.isSnapshotValid(uri2)) {
            bVar.f87209c = uri2;
            this.f87204u &= uri2.equals(this.f87200q);
            this.f87200q = uri2;
            return;
        }
        vn.f playlistSnapshot = qVar.getPlaylistSnapshot(uri2, true);
        io.bidmachine.media3.common.util.a.checkNotNull(playlistSnapshot);
        this.f87201r = playlistSnapshot.f89450c;
        if (!playlistSnapshot.f89378o) {
            endTimeUs = playlistSnapshot.getEndTimeUs() - qVar.getInitialStartTimeUs();
        }
        j jVar3 = jVar2;
        boolean z12 = z11;
        this.f87203t = endTimeUs;
        long initialStartTimeUs = playlistSnapshot.f89371h - qVar.getInitialStartTimeUs();
        Pair pairA = a(jVar3, z12, playlistSnapshot, initialStartTimeUs, j10);
        long jLongValue2 = ((Long) pairA.first).longValue();
        int iIntValue2 = ((Integer) pairA.second).intValue();
        if (jLongValue2 >= playlistSnapshot.f89374k || jVar3 == null || !z12) {
            gVar = this;
            j11 = initialStartTimeUs;
            uri = uri2;
            fVar = playlistSnapshot;
            iIntValue = iIntValue2;
            jLongValue = jLongValue2;
        } else {
            uri = uriArr[iIndexOf];
            vn.f playlistSnapshot2 = qVar.getPlaylistSnapshot(uri, true);
            io.bidmachine.media3.common.util.a.checkNotNull(playlistSnapshot2);
            long initialStartTimeUs2 = playlistSnapshot2.f89371h - qVar.getInitialStartTimeUs();
            gVar = this;
            Pair pairA2 = gVar.a(jVar3, false, playlistSnapshot2, initialStartTimeUs2, j10);
            jLongValue = ((Long) pairA2.first).longValue();
            iIntValue = ((Integer) pairA2.second).intValue();
            j11 = initialStartTimeUs2;
            fVar = playlistSnapshot2;
            selectedIndexInTrackGroup = iIndexOf;
        }
        String str2 = fVar.f89448a;
        long j15 = j11;
        boolean z13 = fVar.f89378o;
        long j16 = fVar.f89374k;
        b5 b5Var = fVar.f89381r;
        if (selectedIndexInTrackGroup != iIndexOf && iIndexOf != -1) {
            qVar.deactivatePlaylistForPlayback(uriArr[iIndexOf]);
        }
        if (jLongValue < j16) {
            gVar.f87199p = new ao.b();
            return;
        }
        e eVarB = b(fVar, jLongValue, iIntValue);
        if (eVarB == null) {
            if (!z13) {
                bVar.f87209c = uri;
                gVar.f87204u &= uri.equals(gVar.f87200q);
                gVar.f87200q = uri;
                return;
            } else {
                if (z10 || b5Var.isEmpty()) {
                    bVar.f87208b = true;
                    return;
                }
                eVarB = new e((vn.g) i7.getLast(b5Var), (j16 + b5Var.size()) - 1, -1);
            }
        }
        long j17 = eVarB.f87215b;
        vn.g gVar2 = eVarB.f87214a;
        gVar.f87204u = false;
        gVar.f87200q = null;
        go.i iVar = gVar.f87195l;
        if (iVar != null) {
            go.j chunkDurationUs = new go.j(iVar, ApsMetricsDataMap.APSMETRICS_FIELD_HOSTNAME).setTrackSelection(gVar.f87202s).setBufferedDurationUs(Math.max(0L, j14)).setPlaybackRate(w0Var.f61590b).setIsLive(!z13).setDidRebuffer(w0Var.rebufferedSince(gVar.f87205v)).setIsBufferEmpty(list.isEmpty()).setChunkDurationUs(gVar2.f89419e);
            int i10 = eVarB.f87216c;
            if (i10 == -1) {
                j17++;
            }
            e eVarB2 = b(fVar, j17, i10 == -1 ? -1 : i10 + 1);
            if (eVarB2 != null) {
                vn.g gVar3 = eVarB2.f87214a;
                Uri uriResolveToUri = x0.resolveToUri(str2, gVar2.f89417b);
                String str3 = gVar3.f89417b;
                long j18 = gVar3.f89426l;
                long j19 = gVar3.f89425k;
                chunkDurationUs.setNextObjectRequest(x0.getRelativePath(uriResolveToUri, x0.resolveToUri(str2, str3)));
                String strG = a.b.g(j19, "-", new StringBuilder());
                if (j18 != -1) {
                    StringBuilder sbU = o2.u(strG);
                    sbU.append(j19 + j18);
                    strG = sbU.toString();
                }
                chunkDurationUs.setNextRangeRequest(strG);
            }
            jVar = chunkDurationUs;
        } else {
            jVar = null;
        }
        gVar.f87205v = SystemClock.elapsedRealtime();
        f.e eVar = gVar2.f89418c;
        Uri uriResolveToUri2 = (eVar == null || (str = eVar.f89423i) == null) ? null : x0.resolveToUri(str2, str);
        a aVarC = gVar.c(uriResolveToUri2, selectedIndexInTrackGroup, true, jVar);
        bVar.f87207a = aVarC;
        if (aVarC != null) {
            return;
        }
        String str4 = gVar2.f89423i;
        Uri uriResolveToUri3 = str4 == null ? null : x0.resolveToUri(str2, str4);
        a aVarC2 = gVar.c(uriResolveToUri3, selectedIndexInTrackGroup, false, jVar);
        bVar.f87207a = aVarC2;
        if (aVarC2 != null) {
            return;
        }
        e eVar2 = eVarB;
        Uri uri3 = uri;
        boolean zShouldSpliceIn = j.shouldSpliceIn(jVar3, uri3, fVar, eVar2, j15);
        vn.f fVar2 = fVar;
        if (zShouldSpliceIn && eVar2.f87217d) {
            return;
        }
        io.bidmachine.media3.common.b bVar2 = gVar.f87189f[selectedIndexInTrackGroup];
        int selectionReason = gVar.f87202s.getSelectionReason();
        Object selectionData = gVar.f87202s.getSelectionData();
        boolean z14 = gVar.f87197n;
        f fVar3 = gVar.f87193j;
        bVar.f87207a = j.createInstance(gVar.f87184a, gVar.f87185b, bVar2, j15, fVar2, eVar2, uri3, gVar.f87192i, selectionReason, selectionData, z14, gVar.f87187d, gVar.f87196m, jVar3, fVar3.get(uriResolveToUri3), fVar3.get(uriResolveToUri2), zShouldSpliceIn, gVar.f87194k, jVar);
    }

    public int getPreferredQueueSize(long j10, List<? extends co.p> list) {
        return (this.f87199p != null || this.f87202s.length() < 2) ? list.size() : this.f87202s.evaluateQueueSize(j10, list);
    }

    public v1 getTrackGroup() {
        return this.f87191h;
    }

    public fo.l getTrackSelection() {
        return this.f87202s;
    }

    public boolean hasIndependentSegments() {
        return this.f87201r;
    }

    public boolean maybeExcludeTrack(co.e eVar, long j10) {
        fo.l lVar = this.f87202s;
        return lVar.excludeTrack(lVar.indexOf(this.f87191h.indexOf(eVar.f12420d)), j10);
    }

    public void maybeThrowError() throws IOException {
        ao.b bVar = this.f87199p;
        if (bVar != null) {
            throw bVar;
        }
        Uri uri = this.f87200q;
        if (uri == null || !this.f87204u) {
            return;
        }
        this.f87190g.maybeThrowPlaylistRefreshError(uri);
    }

    public boolean obtainsChunksForPlaylist(Uri uri) {
        return a1.contains(this.f87188e, uri);
    }

    public void onChunkLoadCompleted(co.e eVar) {
        if (eVar instanceof a) {
            a aVar = (a) eVar;
            this.f87198o = aVar.getDataHolder();
            this.f87193j.put(aVar.f12418b.f73467a, (byte[]) io.bidmachine.media3.common.util.a.checkNotNull(aVar.getResult()));
        }
    }

    public boolean onPlaylistError(Uri uri, long j10) {
        int iIndexOf;
        int i10 = 0;
        while (true) {
            Uri[] uriArr = this.f87188e;
            if (i10 >= uriArr.length) {
                i10 = -1;
                break;
            }
            if (uriArr[i10].equals(uri)) {
                break;
            }
            i10++;
        }
        if (i10 == -1 || (iIndexOf = this.f87202s.indexOf(i10)) == -1) {
            return true;
        }
        this.f87204u |= uri.equals(this.f87200q);
        return j10 == C.TIME_UNSET || (this.f87202s.excludeTrack(iIndexOf, j10) && this.f87190g.excludeMediaPlaylist(uri, j10));
    }

    public void reset() {
        this.f87190g.deactivatePlaylistForPlayback(this.f87188e[this.f87202s.getSelectedIndexInTrackGroup()]);
        this.f87199p = null;
    }

    public void setIsPrimaryTimestampSource(boolean z10) {
        this.f87197n = z10;
    }

    public void setTrackSelection(fo.l lVar) {
        this.f87190g.deactivatePlaylistForPlayback(this.f87188e[this.f87202s.getSelectedIndexInTrackGroup()]);
        this.f87202s = lVar;
    }

    public boolean shouldCancelLoad(long j10, co.e eVar, List<? extends co.p> list) {
        if (this.f87199p != null) {
            return false;
        }
        return this.f87202s.shouldCancelChunkLoad(j10, eVar, list);
    }
}
