package tn;

import android.net.Uri;
import android.text.TextUtils;
import ao.b2;
import ao.h0;
import ao.i0;
import ao.q1;
import ao.r0;
import com.ironsource.C3191e4;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import gn.u0;
import gn.v1;
import gn.x0;
import io.bidmachine.media3.common.DrmInitData;
import io.bidmachine.media3.common.StreamKey;
import io.bidmachine.media3.common.util.a1;
import io.bidmachine.media3.exoplayer.w0;
import io.bidmachine.media3.exoplayer.y1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import ln.g0;
import nh.b5;
import on.f0;
import p0.o2;
import vn.h;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class m implements i0, vn.m {
    public int B;
    public q1 C;

    /* renamed from: b, reason: collision with root package name */
    public final i f87235b;

    /* renamed from: c, reason: collision with root package name */
    public final vn.q f87236c;

    /* renamed from: e, reason: collision with root package name */
    public final h f87237e;

    /* renamed from: f, reason: collision with root package name */
    public final g0 f87238f;

    /* renamed from: g, reason: collision with root package name */
    public final go.i f87239g;

    /* renamed from: h, reason: collision with root package name */
    public final sn.v f87240h;

    /* renamed from: i, reason: collision with root package name */
    public final sn.q f87241i;

    /* renamed from: j, reason: collision with root package name */
    public final go.t f87242j;

    /* renamed from: k, reason: collision with root package name */
    public final r0 f87243k;

    /* renamed from: l, reason: collision with root package name */
    public final go.c f87244l;

    /* renamed from: o, reason: collision with root package name */
    public final ao.l f87247o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f87248p;

    /* renamed from: q, reason: collision with root package name */
    public final int f87249q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f87250r;

    /* renamed from: s, reason: collision with root package name */
    public final f0 f87251s;

    /* renamed from: u, reason: collision with root package name */
    public final long f87253u;

    /* renamed from: v, reason: collision with root package name */
    public h0 f87254v;

    /* renamed from: w, reason: collision with root package name */
    public int f87255w;

    /* renamed from: x, reason: collision with root package name */
    public b2 f87256x;

    /* renamed from: t, reason: collision with root package name */
    public final l f87252t = new l(this);

    /* renamed from: m, reason: collision with root package name */
    public final IdentityHashMap f87245m = new IdentityHashMap();

    /* renamed from: n, reason: collision with root package name */
    public final v f87246n = new v();

    /* renamed from: y, reason: collision with root package name */
    public r[] f87257y = new r[0];

    /* renamed from: z, reason: collision with root package name */
    public r[] f87258z = new r[0];
    public int[][] A = new int[0][];

    public m(i iVar, vn.q qVar, h hVar, g0 g0Var, go.i iVar2, sn.v vVar, sn.q qVar2, go.t tVar, r0 r0Var, go.c cVar, ao.l lVar, boolean z10, int i10, boolean z11, f0 f0Var, long j10) {
        this.f87235b = iVar;
        this.f87236c = qVar;
        this.f87237e = hVar;
        this.f87238f = g0Var;
        this.f87239g = iVar2;
        this.f87240h = vVar;
        this.f87241i = qVar2;
        this.f87242j = tVar;
        this.f87243k = r0Var;
        this.f87244l = cVar;
        this.f87247o = lVar;
        this.f87248p = z10;
        this.f87249q = i10;
        this.f87250r = z11;
        this.f87251s = f0Var;
        this.f87253u = j10;
        this.C = lVar.empty();
    }

    public static io.bidmachine.media3.common.b b(io.bidmachine.media3.common.b bVar, io.bidmachine.media3.common.b bVar2, boolean z10) {
        u0 u0Var;
        int i10;
        String str;
        String str2;
        b5 b5Var;
        int i11;
        int i12;
        String str3;
        b5 b5VarOf = b5.of();
        if (bVar2 != null) {
            str2 = bVar2.f60661k;
            u0Var = bVar2.f60662l;
            i11 = bVar2.E;
            i10 = bVar2.f60655e;
            i12 = bVar2.f60656f;
            str = bVar2.f60654d;
            str3 = bVar2.f60652b;
            b5Var = bVar2.f60653c;
        } else {
            String codecsOfType = a1.getCodecsOfType(bVar.f60661k, 1);
            u0Var = bVar.f60662l;
            if (z10) {
                i11 = bVar.E;
                i10 = bVar.f60655e;
                i12 = bVar.f60656f;
                str = bVar.f60654d;
                str3 = bVar.f60652b;
                str2 = codecsOfType;
                b5Var = bVar.f60653c;
            } else {
                i10 = 0;
                str = null;
                str2 = codecsOfType;
                b5Var = b5VarOf;
                i11 = -1;
                i12 = 0;
                str3 = null;
            }
        }
        return new gn.w().setId(bVar.f60651a).setLabel(str3).setLabels(b5Var).setContainerMimeType(bVar.f60664n).setSampleMimeType(x0.getMediaMimeType(str2)).setCodecs(str2).setMetadata(u0Var).setAverageBitrate(z10 ? bVar.f60658h : -1).setPeakBitrate(z10 ? bVar.f60659i : -1).setChannelCount(i11).setSelectionFlags(i10).setRoleFlags(i12).setLanguage(str).build();
    }

    public final r a(String str, int i10, Uri[] uriArr, io.bidmachine.media3.common.b[] bVarArr, io.bidmachine.media3.common.b bVar, List list, Map map, long j10) {
        return new r(str, i10, this.f87252t, new g(this.f87235b, this.f87236c, uriArr, bVarArr, this.f87237e, this.f87238f, this.f87246n, this.f87253u, list, this.f87251s, this.f87239g), map, this.f87244l, j10, bVar, this.f87240h, this.f87241i, this.f87242j, this.f87243k, this.f87249q);
    }

    @Override // ao.i0, ao.q1
    public boolean continueLoading(w0 w0Var) {
        if (this.f87256x != null) {
            return this.C.continueLoading(w0Var);
        }
        for (r rVar : this.f87257y) {
            rVar.continuePreparing();
        }
        return false;
    }

    @Override // ao.i0
    public void discardBuffer(long j10, boolean z10) throws Throwable {
        for (r rVar : this.f87258z) {
            rVar.discardBuffer(j10, z10);
        }
    }

    @Override // ao.i0
    public long getAdjustedSeekPositionUs(long j10, y1 y1Var) {
        for (r rVar : this.f87258z) {
            if (rVar.isVideoSampleStream()) {
                return rVar.getAdjustedSeekPositionUs(j10, y1Var);
            }
        }
        return j10;
    }

    @Override // ao.i0, ao.q1
    public long getBufferedPositionUs() {
        return this.C.getBufferedPositionUs();
    }

    @Override // ao.i0, ao.q1
    public long getNextLoadPositionUs() {
        return this.C.getNextLoadPositionUs();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [int] */
    /* JADX WARN: Type inference failed for: r15v7 */
    @Override // ao.i0
    public List<StreamKey> getStreamKeys(List<fo.l> list) {
        int[] iArr;
        b2 trackGroups;
        int primaryTrackGroupIndex;
        int i10;
        m mVar = this;
        vn.h hVar = (vn.h) io.bidmachine.media3.common.util.a.checkNotNull(mVar.f87236c.getMultivariantPlaylist());
        List list2 = hVar.f89430e;
        List list3 = hVar.f89430e;
        boolean zIsEmpty = list2.isEmpty();
        boolean z10 = !zIsEmpty;
        int length = mVar.f87257y.length - hVar.f89433h.size();
        int i11 = 0;
        if (zIsEmpty) {
            iArr = new int[0];
            trackGroups = b2.f7550d;
            primaryTrackGroupIndex = 0;
        } else {
            r rVar = mVar.f87257y[0];
            iArr = mVar.A[0];
            trackGroups = rVar.getTrackGroups();
            primaryTrackGroupIndex = rVar.getPrimaryTrackGroupIndex();
        }
        ArrayList arrayList = new ArrayList();
        boolean z11 = false;
        boolean z12 = false;
        for (fo.l lVar : list) {
            v1 trackGroup = lVar.getTrackGroup();
            int iIndexOf = trackGroups.indexOf(trackGroup);
            if (iIndexOf == -1) {
                i10 = i11;
                ?? r15 = z10;
                while (true) {
                    r[] rVarArr = mVar.f87257y;
                    if (r15 >= rVarArr.length) {
                        break;
                    }
                    if (rVarArr[r15].getTrackGroups().indexOf(trackGroup) != -1) {
                        int i12 = r15 < length ? 1 : 2;
                        int[] iArr2 = mVar.A[r15];
                        for (int i13 = i10; i13 < lVar.length(); i13++) {
                            arrayList.add(new StreamKey(i12, iArr2[lVar.getIndexInTrackGroup(i13)]));
                        }
                    } else {
                        mVar = this;
                        r15++;
                    }
                }
            } else if (iIndexOf == primaryTrackGroupIndex) {
                for (int i14 = i11; i14 < lVar.length(); i14++) {
                    arrayList.add(new StreamKey(i11, iArr[lVar.getIndexInTrackGroup(i14)]));
                }
                i10 = i11;
                z12 = true;
            } else {
                i10 = i11;
                z11 = true;
            }
            mVar = this;
            i11 = i10;
        }
        int i15 = i11;
        if (z11 && !z12) {
            int i16 = iArr[i15];
            int i17 = ((h.b) list3.get(i16)).f89443b.f60660j;
            for (int i18 = 1; i18 < iArr.length; i18++) {
                int i19 = ((h.b) list3.get(iArr[i18])).f89443b.f60660j;
                if (i19 < i17) {
                    i16 = iArr[i18];
                    i17 = i19;
                }
            }
            arrayList.add(new StreamKey(i15, i16));
        }
        return arrayList;
    }

    @Override // ao.i0
    public b2 getTrackGroups() {
        return (b2) io.bidmachine.media3.common.util.a.checkNotNull(this.f87256x);
    }

    @Override // ao.i0, ao.q1
    public boolean isLoading() {
        return this.C.isLoading();
    }

    @Override // ao.i0
    public void maybeThrowPrepareError() throws IOException {
        for (r rVar : this.f87257y) {
            rVar.maybeThrowPrepareError();
        }
    }

    @Override // vn.m
    public void onPlaylistChanged() {
        for (r rVar : this.f87257y) {
            rVar.onPlaylistUpdated();
        }
        this.f87254v.onContinueLoadingRequested(this);
    }

    @Override // vn.m
    public boolean onPlaylistError(Uri uri, go.s sVar, boolean z10) {
        boolean zOnPlaylistError = true;
        for (r rVar : this.f87257y) {
            zOnPlaylistError &= rVar.onPlaylistError(uri, sVar, z10);
        }
        this.f87254v.onContinueLoadingRequested(this);
        return zOnPlaylistError;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v45, types: [java.util.HashMap] */
    @Override // ao.i0
    public void prepare(h0 h0Var, long j10) {
        ?? map;
        i iVar;
        boolean z10;
        List list;
        List list2;
        HashSet hashSet;
        int i10;
        boolean z11;
        boolean z12;
        int i11;
        boolean z13;
        Uri[] uriArr;
        this.f87254v = h0Var;
        vn.q qVar = this.f87236c;
        qVar.addListener(this);
        vn.h hVar = (vn.h) io.bidmachine.media3.common.util.a.checkNotNull(qVar.getMultivariantPlaylist());
        int i12 = 0;
        if (this.f87250r) {
            List list3 = hVar.f89438m;
            ArrayList arrayList = new ArrayList(list3);
            map = new HashMap();
            int i13 = 0;
            while (i13 < arrayList.size()) {
                DrmInitData drmInitDataMerge = (DrmInitData) list3.get(i13);
                String str = drmInitDataMerge.f60614e;
                i13++;
                int i14 = i13;
                while (i14 < arrayList.size()) {
                    DrmInitData drmInitData = (DrmInitData) arrayList.get(i14);
                    if (TextUtils.equals(drmInitData.f60614e, str)) {
                        drmInitDataMerge = drmInitDataMerge.merge(drmInitData);
                        arrayList.remove(i14);
                    } else {
                        i14++;
                    }
                }
                map.put(str, drmInitDataMerge);
            }
        } else {
            map = Collections.EMPTY_MAP;
        }
        Map map2 = map;
        List list4 = hVar.f89430e;
        List list5 = hVar.f89432g;
        boolean zIsEmpty = list4.isEmpty();
        List list6 = hVar.f89433h;
        this.f87255w = 0;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        i iVar2 = this.f87235b;
        boolean z14 = this.f87248p;
        if (zIsEmpty) {
            iVar = iVar2;
            z10 = z14;
            list = list5;
            list2 = list6;
        } else {
            List list7 = hVar.f89430e;
            io.bidmachine.media3.common.b bVar = hVar.f89435j;
            int size = list7.size();
            int[] iArr = new int[size];
            int i15 = 0;
            int i16 = 0;
            while (true) {
                list2 = list6;
                if (i15 >= list7.size()) {
                    break;
                }
                io.bidmachine.media3.common.b bVar2 = ((h.b) list7.get(i15)).f89443b;
                int i17 = bVar2.f60673w;
                String str2 = bVar2.f60661k;
                if (i17 > 0 || a1.getCodecsOfType(str2, 2) != null) {
                    iArr[i15] = 2;
                    i16++;
                } else if (a1.getCodecsOfType(str2, 1) != null) {
                    iArr[i15] = 1;
                    i12++;
                } else {
                    iArr[i15] = -1;
                }
                i15++;
                list6 = list2;
            }
            if (i16 > 0) {
                z13 = false;
                z12 = z14;
                i11 = i16;
                z11 = true;
            } else if (i12 < size) {
                z11 = false;
                z12 = z14;
                i11 = size - i12;
                z13 = true;
            } else {
                z11 = false;
                z12 = z14;
                i11 = size;
                z13 = false;
            }
            Uri[] uriArr2 = new Uri[i11];
            boolean z15 = z11;
            io.bidmachine.media3.common.b[] bVarArr = new io.bidmachine.media3.common.b[i11];
            int[] iArr2 = new int[i11];
            int i18 = 0;
            int i19 = 0;
            while (i18 < list7.size()) {
                if (z15) {
                    uriArr = uriArr2;
                    if (iArr[i18] == 2) {
                    }
                    i18++;
                    uriArr2 = uriArr;
                } else {
                    uriArr = uriArr2;
                }
                if (!z13 || iArr[i18] != 1) {
                    h.b bVar3 = (h.b) list7.get(i18);
                    uriArr[i19] = bVar3.f89442a;
                    bVarArr[i19] = bVar3.f89443b;
                    iArr2[i19] = i18;
                    i19++;
                }
                i18++;
                uriArr2 = uriArr;
            }
            Uri[] uriArr3 = uriArr2;
            String str3 = bVarArr[0].f60661k;
            int codecCountOfType = a1.getCodecCountOfType(str3, 2);
            int codecCountOfType2 = a1.getCodecCountOfType(str3, 1);
            boolean z16 = (codecCountOfType2 == 1 || (codecCountOfType2 == 0 && list5.isEmpty())) && codecCountOfType <= 1 && codecCountOfType2 + codecCountOfType > 0;
            z10 = z12;
            list = list5;
            r rVarA = a(C3191e4.h.Z, (z15 || codecCountOfType2 <= 0) ? 0 : 1, uriArr3, bVarArr, hVar.f89435j, hVar.f89436k, map2, j10);
            arrayList2.add(rVarA);
            arrayList3.add(iArr2);
            if (z10 && z16) {
                ArrayList arrayList4 = new ArrayList();
                if (codecCountOfType > 0) {
                    io.bidmachine.media3.common.b[] bVarArr2 = new io.bidmachine.media3.common.b[i11];
                    int i20 = 0;
                    while (i20 < i11) {
                        io.bidmachine.media3.common.b bVar4 = bVarArr[i20];
                        String codecsOfType = a1.getCodecsOfType(bVar4.f60661k, 2);
                        bVarArr2[i20] = new gn.w().setId(bVar4.f60651a).setLabel(bVar4.f60652b).setLabels(bVar4.f60653c).setContainerMimeType(bVar4.f60664n).setSampleMimeType(x0.getMediaMimeType(codecsOfType)).setCodecs(codecsOfType).setMetadata(bVar4.f60662l).setAverageBitrate(bVar4.f60658h).setPeakBitrate(bVar4.f60659i).setWidth(bVar4.f60672v).setHeight(bVar4.f60673w).setFrameRate(bVar4.f60674x).setSelectionFlags(bVar4.f60655e).setRoleFlags(bVar4.f60656f).build();
                        i20++;
                        bVarArr = bVarArr;
                    }
                    io.bidmachine.media3.common.b[] bVarArr3 = bVarArr;
                    arrayList4.add(new v1(C3191e4.h.Z, bVarArr2));
                    if (codecCountOfType2 > 0 && (bVar != null || list.isEmpty())) {
                        arrayList4.add(new v1("main:audio", b(bVarArr3[0], bVar, false)));
                    }
                    List list8 = hVar.f89436k;
                    if (list8 != null) {
                        for (int i21 = 0; i21 < list8.size(); i21++) {
                            arrayList4.add(new v1(a.b.e(i21, "main:cc:"), iVar2.getOutputTextFormat((io.bidmachine.media3.common.b) list8.get(i21))));
                        }
                    }
                    iVar = iVar2;
                } else {
                    iVar = iVar2;
                    io.bidmachine.media3.common.b[] bVarArr4 = new io.bidmachine.media3.common.b[i11];
                    for (int i22 = 0; i22 < i11; i22++) {
                        bVarArr4[i22] = b(bVarArr[i22], bVar, true);
                    }
                    arrayList4.add(new v1(C3191e4.h.Z, bVarArr4));
                }
                v1 v1Var = new v1("main:id3", new gn.w().setId("ID3").setSampleMimeType(MimeTypes.APPLICATION_ID3).build());
                arrayList4.add(v1Var);
                rVarA.prepareWithMultivariantPlaylistInfo((v1[]) arrayList4.toArray(new v1[0]), 0, arrayList4.indexOf(v1Var));
            } else {
                iVar = iVar2;
            }
        }
        ArrayList arrayList5 = new ArrayList(list.size());
        ArrayList arrayList6 = new ArrayList(list.size());
        ArrayList arrayList7 = new ArrayList(list.size());
        HashSet hashSet2 = new HashSet();
        int i23 = 0;
        while (i23 < list.size()) {
            List list9 = list;
            String str4 = ((h.a) list9.get(i23)).f89441c;
            if (hashSet2.add(str4)) {
                arrayList5.clear();
                arrayList6.clear();
                arrayList7.clear();
                boolean z17 = true;
                for (int i24 = 0; i24 < list9.size(); i24++) {
                    if (Objects.equals(str4, ((h.a) list9.get(i24)).f89441c)) {
                        h.a aVar = (h.a) list9.get(i24);
                        arrayList7.add(Integer.valueOf(i24));
                        Uri uri = aVar.f89439a;
                        io.bidmachine.media3.common.b bVar5 = aVar.f89440b;
                        arrayList5.add(uri);
                        arrayList6.add(bVar5);
                        z17 &= a1.getCodecCountOfType(bVar5.f60661k, 1) == 1;
                    }
                }
                String strK = a.b.k("audio:", str4);
                list = list9;
                hashSet = hashSet2;
                i10 = i23;
                r rVarA2 = a(strK, 1, (Uri[]) arrayList5.toArray((Uri[]) a1.castNonNullTypeArray(new Uri[0])), (io.bidmachine.media3.common.b[]) arrayList6.toArray(new io.bidmachine.media3.common.b[0]), null, Collections.EMPTY_LIST, map2, j10);
                arrayList3.add(rh.w.toArray(arrayList7));
                arrayList2.add(rVarA2);
                if (z10 && z17) {
                    rVarA2.prepareWithMultivariantPlaylistInfo(new v1[]{new v1(strK, (io.bidmachine.media3.common.b[]) arrayList6.toArray(new io.bidmachine.media3.common.b[0]))}, 0, new int[0]);
                }
            } else {
                hashSet = hashSet2;
                i10 = i23;
                list = list9;
            }
            i23 = i10 + 1;
            hashSet2 = hashSet;
        }
        this.B = arrayList2.size();
        for (int i25 = 0; i25 < list2.size(); i25++) {
            h.a aVar2 = (h.a) list2.get(i25);
            StringBuilder sbT = o2.t(i25, "subtitle:", ":");
            sbT.append(aVar2.f89441c);
            String string = sbT.toString();
            io.bidmachine.media3.common.b bVar6 = aVar2.f89440b;
            r rVarA3 = a(string, 3, new Uri[]{aVar2.f89439a}, new io.bidmachine.media3.common.b[]{bVar6}, null, Collections.EMPTY_LIST, map2, j10);
            arrayList3.add(new int[]{i25});
            arrayList2.add(rVarA3);
            rVarA3.prepareWithMultivariantPlaylistInfo(new v1[]{new v1(string, iVar.getOutputTextFormat(bVar6))}, 0, new int[0]);
        }
        this.f87257y = (r[]) arrayList2.toArray(new r[0]);
        this.A = (int[][]) arrayList3.toArray(new int[0][]);
        this.f87255w = this.f87257y.length;
        for (int i26 = 0; i26 < this.B; i26++) {
            this.f87257y[i26].setIsPrimaryTimestampSource(true);
        }
        for (r rVar : this.f87257y) {
            rVar.continuePreparing();
        }
        this.f87258z = this.f87257y;
    }

    @Override // ao.i0
    public long readDiscontinuity() {
        return C.TIME_UNSET;
    }

    @Override // ao.i0, ao.q1
    public void reevaluateBuffer(long j10) {
        this.C.reevaluateBuffer(j10);
    }

    public void release() {
        this.f87236c.removeListener(this);
        for (r rVar : this.f87257y) {
            rVar.release();
        }
        this.f87254v = null;
    }

    @Override // ao.i0
    public long seekToUs(long j10) {
        r[] rVarArr = this.f87258z;
        if (rVarArr.length > 0) {
            boolean zSeekToUs = rVarArr[0].seekToUs(j10, false);
            int i10 = 1;
            while (true) {
                r[] rVarArr2 = this.f87258z;
                if (i10 >= rVarArr2.length) {
                    break;
                }
                rVarArr2[i10].seekToUs(j10, zSeekToUs);
                i10++;
            }
            if (zSeekToUs) {
                this.f87246n.reset();
            }
        }
        return j10;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00d8  */
    @Override // ao.i0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long selectTracks(fo.l[] r22, boolean[] r23, ao.o1[] r24, boolean[] r25, long r26) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tn.m.selectTracks(fo.l[], boolean[], ao.o1[], boolean[], long):long");
    }
}
