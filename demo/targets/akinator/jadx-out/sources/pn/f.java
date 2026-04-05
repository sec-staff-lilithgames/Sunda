package pn;

import ao.b2;
import ao.h0;
import ao.i0;
import ao.o1;
import ao.p1;
import ao.q1;
import ao.r0;
import co.j;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import gn.v1;
import go.a0;
import io.bidmachine.media3.common.StreamKey;
import io.bidmachine.media3.common.util.a1;
import io.bidmachine.media3.exoplayer.w0;
import io.bidmachine.media3.exoplayer.y1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import ln.g0;
import nh.b5;
import nh.p8;
import on.f0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class f implements i0, p1, co.k {
    public static final Pattern D = Pattern.compile("CC([1-4])=(.+)");
    public static final Pattern E = Pattern.compile("([1-4])=lang:(\\w+)(,.+)?");
    public List A;
    public long C;

    /* renamed from: b, reason: collision with root package name */
    public final int f81501b;

    /* renamed from: c, reason: collision with root package name */
    public final b f81502c;

    /* renamed from: e, reason: collision with root package name */
    public final g0 f81503e;

    /* renamed from: f, reason: collision with root package name */
    public final go.i f81504f;

    /* renamed from: g, reason: collision with root package name */
    public final sn.v f81505g;

    /* renamed from: h, reason: collision with root package name */
    public final go.t f81506h;

    /* renamed from: i, reason: collision with root package name */
    public final a f81507i;

    /* renamed from: j, reason: collision with root package name */
    public final long f81508j;

    /* renamed from: k, reason: collision with root package name */
    public final a0 f81509k;

    /* renamed from: l, reason: collision with root package name */
    public final go.c f81510l;

    /* renamed from: m, reason: collision with root package name */
    public final b2 f81511m;

    /* renamed from: n, reason: collision with root package name */
    public final e[] f81512n;

    /* renamed from: o, reason: collision with root package name */
    public final ao.l f81513o;

    /* renamed from: p, reason: collision with root package name */
    public final v f81514p;

    /* renamed from: r, reason: collision with root package name */
    public final r0 f81516r;

    /* renamed from: s, reason: collision with root package name */
    public final sn.q f81517s;

    /* renamed from: t, reason: collision with root package name */
    public final f0 f81518t;

    /* renamed from: u, reason: collision with root package name */
    public h0 f81519u;

    /* renamed from: x, reason: collision with root package name */
    public q1 f81522x;

    /* renamed from: y, reason: collision with root package name */
    public qn.c f81523y;

    /* renamed from: z, reason: collision with root package name */
    public int f81524z;
    public boolean B = true;

    /* renamed from: v, reason: collision with root package name */
    public co.j[] f81520v = new co.j[0];

    /* renamed from: w, reason: collision with root package name */
    public u[] f81521w = new u[0];

    /* renamed from: q, reason: collision with root package name */
    public final IdentityHashMap f81515q = new IdentityHashMap();

    /* JADX WARN: Removed duplicated region for block: B:34:0x0156  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public f(int r21, qn.c r22, pn.a r23, int r24, pn.b r25, ln.g0 r26, go.i r27, sn.v r28, sn.q r29, go.t r30, ao.r0 r31, long r32, go.a0 r34, go.c r35, ao.l r36, pn.w r37, on.f0 r38) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 1090
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pn.f.<init>(int, qn.c, pn.a, int, pn.b, ln.g0, go.i, sn.v, sn.q, go.t, ao.r0, long, go.a0, go.c, ao.l, pn.w, on.f0):void");
    }

    public static qn.e a(String str, List list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            qn.e eVar = (qn.e) list.get(i10);
            if (str.equals(eVar.f83333a)) {
                return eVar;
            }
        }
        return null;
    }

    public static io.bidmachine.media3.common.b[] c(qn.e eVar, Pattern pattern, io.bidmachine.media3.common.b bVar) throws NumberFormatException {
        String str = eVar.f83334b;
        if (str == null) {
            return new io.bidmachine.media3.common.b[]{bVar};
        }
        String[] strArrSplit = a1.split(str, ";");
        io.bidmachine.media3.common.b[] bVarArr = new io.bidmachine.media3.common.b[strArrSplit.length];
        for (int i10 = 0; i10 < strArrSplit.length; i10++) {
            Matcher matcher = pattern.matcher(strArrSplit[i10]);
            if (!matcher.matches()) {
                return new io.bidmachine.media3.common.b[]{bVar};
            }
            int i11 = Integer.parseInt(matcher.group(1));
            bVarArr[i10] = bVar.buildUpon().setId(bVar.f60651a + ":" + i11).setAccessibilityChannel(i11).setLanguage(matcher.group(2)).build();
        }
        return bVarArr;
    }

    public final int b(int i10, int[] iArr) {
        int i11 = iArr[i10];
        if (i11 != -1) {
            e[] eVarArr = this.f81512n;
            int i12 = eVarArr[i11].f81497e;
            for (int i13 = 0; i13 < iArr.length; i13++) {
                int i14 = iArr[i13];
                if (i14 == i12 && eVarArr[i14].f81495c == 0) {
                    return i13;
                }
            }
        }
        return -1;
    }

    @Override // ao.i0, ao.q1
    public boolean continueLoading(w0 w0Var) {
        return this.f81522x.continueLoading(w0Var);
    }

    @Override // ao.i0
    public void discardBuffer(long j10, boolean z10) throws Throwable {
        for (co.j jVar : this.f81520v) {
            jVar.discardBuffer(j10, z10);
        }
    }

    @Override // ao.i0
    public long getAdjustedSeekPositionUs(long j10, y1 y1Var) {
        for (co.j jVar : this.f81520v) {
            if (jVar.f12428b == 2) {
                return jVar.getAdjustedSeekPositionUs(j10, y1Var);
            }
        }
        return j10;
    }

    @Override // ao.i0, ao.q1
    public long getBufferedPositionUs() {
        return this.f81522x.getBufferedPositionUs();
    }

    @Override // ao.i0, ao.q1
    public long getNextLoadPositionUs() {
        return this.f81522x.getNextLoadPositionUs();
    }

    @Override // ao.i0
    public List<StreamKey> getStreamKeys(List<fo.l> list) {
        List list2 = this.f81523y.getPeriod(this.f81524z).f83342c;
        ArrayList arrayList = new ArrayList();
        for (fo.l lVar : list) {
            e eVar = this.f81512n[this.f81511m.indexOf(lVar.getTrackGroup())];
            if (eVar.f81495c == 0) {
                int[] iArr = eVar.f81493a;
                int length = lVar.length();
                int[] iArr2 = new int[length];
                for (int i10 = 0; i10 < lVar.length(); i10++) {
                    iArr2[i10] = lVar.getIndexInTrackGroup(i10);
                }
                Arrays.sort(iArr2);
                int size = ((qn.a) list2.get(iArr[0])).f83297c.size();
                int i11 = 0;
                int i12 = 0;
                for (int i13 = 0; i13 < length; i13++) {
                    int i14 = iArr2[i13];
                    while (true) {
                        int i15 = i12 + size;
                        if (i14 >= i15) {
                            i11++;
                            size = ((qn.a) list2.get(iArr[i11])).f83297c.size();
                            i12 = i15;
                        }
                    }
                    arrayList.add(new StreamKey(this.f81524z, iArr[i11], i14 - i12));
                }
            }
        }
        return arrayList;
    }

    @Override // ao.i0
    public b2 getTrackGroups() {
        return this.f81511m;
    }

    @Override // ao.i0, ao.q1
    public boolean isLoading() {
        return this.f81522x.isLoading();
    }

    @Override // ao.i0
    public void maybeThrowPrepareError() throws IOException {
        this.f81509k.maybeThrowError();
    }

    @Override // co.k
    public synchronized void onSampleStreamReleased(co.j jVar) {
        x xVar = (x) this.f81515q.remove(jVar);
        if (xVar != null) {
            xVar.release();
        }
    }

    @Override // ao.i0
    public void prepare(h0 h0Var, long j10) {
        this.f81519u = h0Var;
        h0Var.onPrepared(this);
    }

    @Override // ao.i0
    public long readDiscontinuity() {
        for (co.j jVar : this.f81520v) {
            if (jVar.consumeInitialDiscontinuity()) {
                return this.C;
            }
        }
        return C.TIME_UNSET;
    }

    @Override // ao.i0, ao.q1
    public void reevaluateBuffer(long j10) {
        for (co.j jVar : this.f81520v) {
            if (!jVar.isLoading()) {
                jVar.discardUpstreamSamplesForClippedDuration(this.f81523y.getPeriodDurationUs(this.f81524z));
            }
        }
        this.f81522x.reevaluateBuffer(j10);
    }

    public void release() {
        this.f81514p.release();
        for (co.j jVar : this.f81520v) {
            jVar.release(this);
        }
        this.f81519u = null;
    }

    @Override // ao.i0
    public long seekToUs(long j10) throws Throwable {
        for (co.j jVar : this.f81520v) {
            jVar.seekToUs(j10);
        }
        for (u uVar : this.f81521w) {
            uVar.seekToUs(j10);
        }
        return j10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ao.i0
    public long selectTracks(fo.l[] lVarArr, boolean[] zArr, o1[] o1VarArr, boolean[] zArr2, long j10) {
        int i10;
        boolean z10;
        int[] iArr;
        int[] iArr2;
        int i11;
        int i12;
        v1 v1Var;
        int i13;
        boolean z11;
        fo.l[] lVarArr2 = lVarArr;
        int[] iArr3 = new int[lVarArr2.length];
        int i14 = 0;
        int i15 = 0;
        while (true) {
            i10 = -1;
            if (i15 >= lVarArr2.length) {
                break;
            }
            fo.l lVar = lVarArr2[i15];
            if (lVar != null) {
                iArr3[i15] = this.f81511m.indexOf(lVar.getTrackGroup());
            } else {
                iArr3[i15] = -1;
            }
            i15++;
        }
        for (int i16 = 0; i16 < lVarArr2.length; i16++) {
            if (lVarArr2[i16] == null || !zArr[i16]) {
                o1 o1Var = o1VarArr[i16];
                if (o1Var instanceof co.j) {
                    ((co.j) o1Var).release(this);
                } else if (o1Var instanceof j.a) {
                    ((j.a) o1Var).release();
                }
                o1VarArr[i16] = null;
            }
        }
        int i17 = 0;
        while (true) {
            z10 = true;
            if (i17 >= lVarArr2.length) {
                break;
            }
            o1 o1Var2 = o1VarArr[i17];
            if ((o1Var2 instanceof ao.s) || (o1Var2 instanceof j.a)) {
                int iB = b(i17, iArr3);
                if (iB == -1) {
                    z11 = o1VarArr[i17] instanceof ao.s;
                } else {
                    o1 o1Var3 = o1VarArr[i17];
                    z11 = (o1Var3 instanceof j.a) && ((j.a) o1Var3).f12452b == o1VarArr[iB];
                }
                if (!z11) {
                    o1 o1Var4 = o1VarArr[i17];
                    if (o1Var4 instanceof j.a) {
                        ((j.a) o1Var4).release();
                    }
                    o1VarArr[i17] = null;
                }
            }
            i17++;
        }
        int i18 = 0;
        while (i18 < lVarArr2.length) {
            fo.l lVar2 = lVarArr2[i18];
            if (lVar2 == null) {
                iArr2 = iArr3;
                i11 = i18;
            } else {
                o1 o1Var5 = o1VarArr[i18];
                if (o1Var5 == null) {
                    zArr2[i18] = z10;
                    e eVar = this.f81512n[iArr3[i18]];
                    int i19 = eVar.f81495c;
                    if (i19 == 0) {
                        int i20 = eVar.f81498f;
                        boolean z12 = i20 != i10 ? z10 ? 1 : 0 : i14;
                        if (z12 != 0) {
                            v1Var = this.f81511m.get(i20);
                            i12 = z10 ? 1 : 0;
                        } else {
                            i12 = i14;
                            v1Var = null;
                        }
                        int i21 = eVar.f81499g;
                        b5 b5VarOf = i21 != i10 ? this.f81512n[i21].f81500h : b5.of();
                        int size = b5VarOf.size() + i12;
                        io.bidmachine.media3.common.b[] bVarArr = new io.bidmachine.media3.common.b[size];
                        int[] iArr4 = new int[size];
                        if (z12 != 0) {
                            bVarArr[i14] = v1Var.getFormat(i14);
                            iArr4[i14] = 5;
                            i13 = z10 ? 1 : 0;
                        } else {
                            i13 = i14;
                        }
                        ArrayList arrayList = new ArrayList();
                        for (int i22 = i14; i22 < b5VarOf.size(); i22++) {
                            io.bidmachine.media3.common.b bVar = (io.bidmachine.media3.common.b) b5VarOf.get(i22);
                            bVarArr[i13] = bVar;
                            iArr4[i13] = 3;
                            arrayList.add(bVar);
                            i13 += z10 ? 1 : 0;
                        }
                        x xVarNewPlayerTrackEmsgHandler = (!this.f81523y.f83308d || z12 == 0) ? null : this.f81514p.newPlayerTrackEmsgHandler();
                        iArr2 = iArr3;
                        i11 = i18;
                        x xVar = xVarNewPlayerTrackEmsgHandler;
                        co.j jVar = new co.j(eVar.f81494b, iArr4, bVarArr, this.f81502c.createDashChunkSource(this.f81509k, this.f81523y, this.f81507i, this.f81524z, eVar.f81493a, lVar2, eVar.f81494b, this.f81508j, z12, arrayList, xVarNewPlayerTrackEmsgHandler, this.f81503e, this.f81518t, this.f81504f), this, this.f81510l, j10, this.f81505g, this.f81517s, this.f81506h, this.f81516r, this.B, null);
                        synchronized (this) {
                            this.f81515q.put(jVar, xVar);
                        }
                        o1VarArr[i11] = jVar;
                    } else {
                        iArr2 = iArr3;
                        i11 = i18;
                        if (i19 == 2) {
                            o1VarArr[i11] = new u((qn.f) this.A.get(eVar.f81496d), lVar2.getTrackGroup().getFormat(0), this.f81523y.f83308d);
                        }
                    }
                } else {
                    iArr2 = iArr3;
                    i11 = i18;
                    if (o1Var5 instanceof co.j) {
                        ((c) ((co.j) o1Var5).getChunkSource()).updateTrackSelection(lVar2);
                    }
                }
            }
            i18 = i11 + 1;
            lVarArr2 = lVarArr;
            iArr3 = iArr2;
            i14 = 0;
            i10 = -1;
            z10 = true;
        }
        int[] iArr5 = iArr3;
        int i23 = 0;
        while (i23 < lVarArr.length) {
            if (o1VarArr[i23] != null || lVarArr[i23] == null) {
                iArr = iArr5;
            } else {
                e eVar2 = this.f81512n[iArr5[i23]];
                if (eVar2.f81495c == 1) {
                    iArr = iArr5;
                    int iB2 = b(i23, iArr);
                    if (iB2 == -1) {
                        o1VarArr[i23] = new ao.s();
                    } else {
                        o1VarArr[i23] = ((co.j) o1VarArr[iB2]).selectEmbeddedTrack(j10, eVar2.f81494b);
                    }
                    i23++;
                    iArr5 = iArr;
                } else {
                    iArr = iArr5;
                }
            }
            i23++;
            iArr5 = iArr;
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (o1 o1Var6 : o1VarArr) {
            if (o1Var6 instanceof co.j) {
                arrayList2.add((co.j) o1Var6);
            } else if (o1Var6 instanceof u) {
                arrayList3.add((u) o1Var6);
            }
        }
        co.j[] jVarArr = new co.j[arrayList2.size()];
        this.f81520v = jVarArr;
        arrayList2.toArray(jVarArr);
        u[] uVarArr = new u[arrayList3.size()];
        this.f81521w = uVarArr;
        arrayList3.toArray(uVarArr);
        this.f81522x = this.f81513o.create(arrayList2, p8.transform(arrayList2, new in.c(11)));
        if (this.B) {
            this.B = false;
            this.C = j10;
        }
        return j10;
    }

    public void updateManifest(qn.c cVar, int i10) {
        this.f81523y = cVar;
        this.f81524z = i10;
        this.f81514p.updateManifest(cVar);
        co.j[] jVarArr = this.f81520v;
        if (jVarArr != null) {
            for (co.j jVar : jVarArr) {
                ((c) jVar.getChunkSource()).updateManifest(cVar, i10);
            }
            this.f81519u.onContinueLoadingRequested(this);
        }
        this.A = cVar.getPeriod(i10).f83343d;
        for (u uVar : this.f81521w) {
            Iterator it = this.A.iterator();
            while (true) {
                if (it.hasNext()) {
                    qn.f fVar = (qn.f) it.next();
                    if (fVar.id().equals(uVar.eventStreamId())) {
                        uVar.updateEventStream(fVar, cVar.f83308d && i10 == cVar.getPeriodCount() - 1);
                    }
                }
            }
        }
    }

    @Override // ao.p1
    public void onContinueLoadingRequested(co.j jVar) {
        this.f81519u.onContinueLoadingRequested(this);
    }
}
